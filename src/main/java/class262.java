import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class262 {

    @OriginalMember(owner = "client!js", name = "h", descriptor = "[I")
    private int[] field3408;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public static int field3401 = 0;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "[Lat;")
    public static class143[] field3402 = new class143[2048];

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "[Leh;")
    public static class203[] field3405;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "[Li;")
    public static class682[] field3404;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BIZ)Lge;")
    public static final class15 method1577(byte arg0, int arg1, boolean arg2) {
        field3406++;
        if (arg0 == -17) {
            long var3 = (long) (arg1 | (arg2 ? Integer.MIN_VALUE : 0));
            return (class15) class94.field1450.method2002((byte) -114, var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public static void method1578(int arg0) {
        field3402 = null;
        if (arg0 >= 70) {
            field3405 = null;
            field3404 = null;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lkd;[Loh;B)Lro;")
    public static final class257 method1579(class700 arg0, class581[] arg1, byte arg2) {
        field3407++;
        int var3 = -2 % ((arg2 - 5) / 55);
        for (int var4 = 0; var4 < arg1.length; var4++) {
            if (arg1[var4] == null || arg1[var4].field8450 <= 0L) {
                return null;
            }
        }
        long var5 = OpenGL.glCreateProgramObjectARB();
        for (int var7 = 0; var7 < arg1.length; var7++) {
            OpenGL.glAttachObjectARB(var5, arg1[var7].field8450);
        }
        OpenGL.glLinkProgramARB(var5);
        OpenGL.glGetObjectParameterivARB(var5, 35714, class529.field7809, 0);
        if (class529.field7809[0] == 0) {
            if (class529.field7809[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var5, 35716, class529.field7809, 1);
            if (class529.field7809[1] > 1) {
                byte[] var8 = new byte[class529.field7809[1]];
                OpenGL.glGetInfoLogARB(var5, class529.field7809[1], class529.field7809, 0, var8, 0);
                System.out.println(new String(var8));
            }
            if (class529.field7809[0] == 0) {
                for (int var9 = 0; var9 < arg1.length; var9++) {
                    OpenGL.glDetachObjectARB(var5, arg1[var9].field8450);
                }
                OpenGL.glDeleteObjectARB(var5);
                return null;
            }
        }
        return new class257(arg0, var5, arg1);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)I")
    public final int method1580(int arg0, int arg1) {
        int var3 = 31 / ((-arg1 - 67) / 57);
        field3403++;
        int var4 = (this.field3408.length >> 1) - 1;
        int var5 = arg0 & var4;
        while (true) {
            int var6 = this.field3408[var5 - (-var5 - 1)];
            if (var6 == -1) {
                return -1;
            }
            if (this.field3408[var5 + var5] == arg0) {
                return var6;
            }
            var5 = var5 + 1 & var4;
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "([I)V")
    public class262(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field3408 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3408[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3408[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field3408[var5 + var5] = arg0[var4];
            this.field3408[var5 + var5 + 1] = var4++;
        }
    }
}
