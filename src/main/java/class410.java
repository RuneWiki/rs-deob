import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class410 {

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lvg;")
    public static class622 field6102 = new class622(11, 6);

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Lvea;")
    public static class305 field6109 = new class305();

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lqfa;")
    public static class347 field6103;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field6110;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "[B")
    public byte[] field6101;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "[S")
    public short[] field6104;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "[S")
    public short[] field6106;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "[S")
    public short[] field6108;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([Lcaa;II)V")
    public static final void method2513(class538[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class538 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field7901;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field7901 < (var7 & 0x1) + var6) {
                class538 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method2513(arg0, arg1, var4 - 1);
        method2513(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method2514(int arg0) {
        if (arg0 <= 76) {
            method2514(-76);
        }
        field6109 = null;
        field6110 = null;
        field6102 = null;
        field6103 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIZ)V")
    public static final void method2515(int arg0, int arg1, boolean arg2) {
        if (class44.field659 == 1) {
            class85.method482(class606.field8763, 0, arg0, arg1);
        } else if (class44.field659 == 2) {
            class172.method1191((byte) -103, arg1, arg0);
        }
        field6107++;
        class606.field8763 = null;
        if (arg2) {
            class44.field659 = 0;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I[Lg;Luca;)Lnba;")
    public static final class566 method2516(int arg0, class129[] arg1, class287 arg2) {
        field6105++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field1854 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        int var6 = 43 % ((arg0 + 16) / 35);
        for (int var7 = 0; var7 < arg1.length; var7++) {
            OpenGL.glAttachObjectARB(var4, arg1[var7].field1854);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class525.field7467, 0);
        if (class525.field7467[0] == 0) {
            if (class525.field7467[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class525.field7467, 1);
            if (class525.field7467[1] > 1) {
                byte[] var8 = new byte[class525.field7467[1]];
                OpenGL.glGetInfoLogARB(var4, class525.field7467[1], class525.field7467, 0, var8, 0);
                System.out.println(new String(var8));
            }
            if (class525.field7467[0] == 0) {
                for (int var9 = 0; var9 < arg1.length; var9++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var9].field1854);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class566(arg2, var4, arg1);
    }
}
