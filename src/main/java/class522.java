import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class522 {

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Lau;")
    public static class692 field7687 = new class692();

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "[I")
    public static int[] field7696 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "Z")
    public static boolean field7697 = false;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "F")
    public static float field7692;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field7690;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field7691;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "Lvo;")
    public static class345 field7698;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "Ljava/lang/String;")
    public static String field7689;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V", line = 3)
    public static void method3075(int arg0) {
        field7687 = null;
        if (arg0 != 0) {
            field7692 = 0.7289084F;
        }
        field7689 = null;
        field7698 = null;
        field7696 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BZIIIII)V", line = 19)
    public static final void method3076(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 ? class525.field7713.field5997 : class525.field7713.field5973) != 0 && arg5 != 0 && class222.field3314 < 50 && arg6 != -1) {
            class428.field6114[class222.field3314++] = new class105((byte) (arg1 ? 3 : 2), arg6, arg5, arg3, arg2, 0, arg4, null);
        }
        field7691++;
        int var7 = 35 % ((arg0 - 65) / 52);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZZII)I", line = 45)
    public static final int method3077(boolean arg0, boolean arg1, int arg2, int arg3) {
        field7693++;
        class569 var4 = class198.method1392(arg2, arg0, Integer.MIN_VALUE);
        if (var4 == null) {
            return 0;
        } else if (arg3 == -1) {
            return 0;
        } else {
            if (!arg1) {
                method3079((byte) -107, 10, -108, 46);
            }
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field8313.length; var6++) {
                if (var4.field8318[var6] == arg3) {
                    var5 += var4.field8313[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "([Ljava/lang/Object;B[I)V", line = 79)
    public static final void method3078(Object[] arg0, byte arg1, int[] arg2) {
        field7690++;
        int var3 = -65 % ((arg1 - 37) / 60);
        class8.method39((byte) -79, 0, arg2, arg2.length - 1, arg0);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BIII)V", line = 98)
    public static final void method3079(byte arg0, int arg1, int arg2, int arg3) {
        field7688++;
        if (arg0 != -124) {
            return;
        }
        if (arg3 == 1006) {
            class362.method2169(class666.field9361, arg2, arg1);
        } else if (arg3 == 1010) {
            class362.method2169(class648.field9185, arg2, arg1);
        } else if (arg3 == 1007) {
            class362.method2169(class570.field8332, arg2, arg1);
        } else if (arg3 == 1002) {
            class362.method2169(class357.field4985, arg2, arg1);
            return;
        } else if (arg3 == 1012) {
            class362.method2169(class68.field1081, arg2, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIII)I", line = 127)
    public static final int method3080(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            return -111;
        }
        field7695++;
        int var5 = arg2 & 0xF;
        int var6 = var5 >= 8 ? arg0 : arg1;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg1 : arg3) : arg0;
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }
}
