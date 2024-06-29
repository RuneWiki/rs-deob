import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class703 {

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    private int field9904;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Lke;")
    public static class622 field9903 = new class622(73, 0);

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Ldba;")
    public static class101 field9908 = new class101(5, 3);

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field9909 = 0;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field9899;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field9901;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field9907;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lcb;")
    public static class544 field9906;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public final void method3978(int arg0) {
        OpenGL.glEndList();
        if (arg0 != 0) {
            field9906 = null;
        }
        field9905++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public static void method3979(boolean arg0) {
        field9903 = null;
        if (arg0) {
            field9903 = null;
        }
        field9906 = null;
        field9908 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
    public final void method3980(int arg0, int arg1) {
        if (arg1 == -27400) {
            OpenGL.glNewList(this.field9904 + arg0, 4864);
            field9902++;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[BIIBI[BII)V")
    public static final void method3981(int arg0, byte[] arg1, int arg2, int arg3, byte arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        field9899++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        if (arg4 != 89) {
            return;
        }
        for (int var11 = -arg8; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg5++;
                arg6[var10001] += arg1[arg3++];
                int var14 = arg5++;
                arg6[var14] += arg1[arg3++];
                int var15 = arg5++;
                arg6[var15] += arg1[arg3++];
                int var16 = arg5++;
                arg6[var16] += arg1[arg3++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg5++;
                arg6[var10001] += arg1[arg3++];
            }
            arg5 += arg7;
            arg3 += arg0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BC)V")
    public final void method3982(byte arg0, char arg1) {
        field9907++;
        if (arg0 != -120) {
            method3983((byte) 48);
        }
        OpenGL.glCallList(this.field9904 + arg1);
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lkv;I)V")
    public class703(class280 arg0, int arg1) {
        this.field9904 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Z")
    public static final boolean method3983(byte arg0) {
        if (arg0 != -66) {
            return true;
        }
        field9901++;
        try {
            return class58.method366(-101);
        } catch (IOException var4) {
            class204.method1458((byte) -80);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class746.field10375 == null ? -1 : class746.field10375.method3555(arg0 + 118)) + "," + (class127.field1655 == null ? -1 : class127.field1655.method3555(116)) + "," + (class225.field3231 == null ? -1 : class225.field3231.method3555(-116)) + " - " + class440.field6294 + "," + (class251.field3549.field6448[0] + class103.field1295) + "," + (class251.field3549.field6445[0] + class175.field2496) + " - ";
            for (int var3 = 0; var3 < class440.field6294 && var3 < 50; var3++) {
                var2 = var2 + class26.field371.field1556[var3] + ",";
            }
            class329.method2129(var2, false, var5);
            class599.method3460(true, false);
            return true;
        }
    }
}
