import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class81 {

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
    public static int field1137 = 0;

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "[S")
    public static short[] field1140 = new short[] { 48, 17, 5, 30, 12, 60, 9, 21 };

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "[F")
    public static float[] field1145 = new float[2];

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "Lqe;")
    public static class469 field1141 = new class469(6, 3);

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
    public static void method651(int arg0) {
        field1140 = null;
        if (arg0 == 3) {
            field1145 = null;
            field1141 = null;
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)[Loo;")
    public static final class629[] method652(int arg0) {
        field1143++;
        if (arg0 != 60) {
            field1137 = -66;
        }
        return new class629[] { class608.field8601, class35.field364, class110.field1545, class224.field3306, class348.field5102, class48.field697, class608.field8608, class635.field8926, class64.field919, class555.field7931, class234.field3409, class716.field10072, class488.field6982, class210.field3071, class96.field1357 };
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BIIIIII)Z")
    public static final boolean method653(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1138++;
        int var7 = arg3 + arg4;
        int var8 = arg6 + arg2;
        int var9 = arg1 + arg5;
        if (!class167.method1224(var7, var9, var8, arg4, (byte) 94, arg4, var8, var8, var9, arg1)) {
            return false;
        } else if (!class167.method1224(var7, arg1, var8, arg4, (byte) -109, var7, var8, var8, var9, arg1)) {
            return false;
        } else if (arg0 < 125) {
            return false;
        } else {
            if (class499.field7101 > arg4) {
                if (!class167.method1224(arg4, arg1, var8, arg4, (byte) 122, arg4, var8, arg6, var9, var9)) {
                    return false;
                }
                if (!class167.method1224(arg4, arg1, arg6, arg4, (byte) -93, arg4, var8, arg6, arg1, var9)) {
                    return false;
                }
            } else if (!class167.method1224(var7, arg1, var8, var7, (byte) 117, var7, var8, arg6, var9, var9)) {
                return false;
            } else if (!class167.method1224(var7, arg1, arg6, var7, (byte) -22, var7, var8, arg6, arg1, var9)) {
                return false;
            }
            if (arg1 < class310.field4389) {
                if (!class167.method1224(var7, arg1, var8, arg4, (byte) -90, arg4, var8, arg6, arg1, arg1)) {
                    return false;
                }
                if (!class167.method1224(var7, arg1, arg6, arg4, (byte) 108, var7, var8, arg6, arg1, arg1)) {
                    return false;
                }
            } else if (!class167.method1224(var7, var9, var8, arg4, (byte) 95, arg4, var8, arg6, var9, var9)) {
                return false;
            } else if (!class167.method1224(var7, var9, arg6, arg4, (byte) 99, var7, var8, arg6, var9, var9)) {
                return false;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "([Lfk;ILno;)Ltm;")
    public static final class391 method654(class656[] arg0, int arg1, class704 arg2) {
        field1139++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field9193 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field9193);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class681.field9450, arg1);
        if (class681.field9450[0] == 0) {
            if (class681.field9450[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class681.field9450, 1);
            if (class681.field9450[1] > 1) {
                byte[] var7 = new byte[class681.field9450[1]];
                OpenGL.glGetInfoLogARB(var4, class681.field9450[1], class681.field9450, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class681.field9450[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field9193);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class391(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BI)V")
    public static final void method655(byte arg0, int arg1) {
        field1142++;
        if (arg0 == -62) {
            class150 var2 = class676.method3885(1000, 10, arg1);
            var2.method1115(true);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BIIILha;I)V")
    public static final void method656(byte arg0, int arg1, int arg2, int arg3, class60 arg4, int arg5) {
        if (arg0 > -61) {
            field1137 = -106;
        }
        field1144++;
        class502.field7152 = arg4;
        class234.field3411 = class502.field7152.method515();
        class421.field6280 = class502.field7152.method515();
        class111.field1551 = class502.field7152.method515();
        class22.field234 = 0;
        class564.field8028 = null;
        class250.field3617 = arg3;
        class302.field4293 = null;
        class298.field4224 = arg1;
        class74.method624(arg5, arg2, 46);
        class188.field2861 = -1;
        class209.field3067 = -1;
        class679.field9433 = -1;
    }
}
