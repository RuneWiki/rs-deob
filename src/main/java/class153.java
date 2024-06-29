import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class153 {

    @OriginalMember(owner = "client!we", name = "h", descriptor = "[J")
    public static long[] field3766 = new long[200];

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field3763 = 0;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3759 = 0;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field3770 = 0;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lfc;")
    public static class39 field3771 = class90.method774(" steht bereits auf Ihrer Freunde)2Liste(Q", -106);

    @OriginalMember(owner = "client!we", name = "o", descriptor = "[Z")
    public static boolean[] field3773 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lfc;")
    public static class39 field3760 = class90.method774("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AN>", -102);

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Lfc;")
    public static class39 field3772 = class90.method774("Hier wechseln", -109);

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Lua;")
    public static class137 field3768;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Z")
    public static boolean field3769;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lnf;", line = 3)
    public static final class96 method1222(int arg0, int arg1) {
        field3762++;
        class96 var2 = (class96) class143.field3592.method931(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class136.field3399.method839(5, 9, arg1);
        class96 var4 = new class96();
        var4.field2228 = arg1;
        if (var3 != null) {
            var4.method810(new class25(var3), (byte) -99);
        }
        var4.method808(-8923);
        class143.field3592.method934(arg0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IJ)V", line = 35)
    public static final void method1223(int arg0, long arg1) {
        if (arg0 != 1) {
            field3772 = null;
        }
        field3765++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class92.field2165; var3++) {
            if (field3766[var3] == arg1) {
                class104.field2638 = true;
                class2.field57++;
                class92.field2165--;
                for (int var4 = var3; var4 < class92.field2165; var4++) {
                    class139.field3482[var4] = class139.field3482[var4 + 1];
                    class55.field1390[var4] = class55.field1390[var4 + 1];
                    field3766[var4] = field3766[var4 + 1];
                    class3.field70[var4] = class3.field70[var4 + 1];
                }
                class72.field1687 = class70.field1654 + 1;
                class79.field1794.method393((byte) -14, 71);
                class79.field1794.method290(arg1, (byte) -43);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIII)I", line = 94)
    public static final int method1224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg0;
            arg0 = var8;
        }
        field3767++;
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return arg1;
        } else if (var7 == 2) {
            return 7 + 1 - arg2 - arg5;
        } else if (arg6 <= 54) {
            return -81;
        } else {
            return 1 + 7 - arg0 - arg1;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)I", line = 142)
    public static final int method1225(int arg0, int arg1, int arg2, int arg3) {
        field3764++;
        int var4 = arg3 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class137.field3424[1][var4][var5] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg3 & 0x7F;
        int var9 = (arg0 - var8) * class7.field219[var6][var4][var5] + class7.field219[var6][var4 + 1][var5] * var8 >> 7;
        int var10 = (128 - var8) * class7.field219[var6][var4][var5 + 1] + class7.field219[var6][var4 + 1][var5 + 1] * var8 >> 7;
        return (128 - var7) * var9 + var7 * var10 >> 7;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 174)
    public static void method1226(byte arg0) {
        field3760 = null;
        field3768 = null;
        field3766 = null;
        field3773 = null;
        int var1 = -101 / ((-arg0 - 44) / 56);
        field3771 = null;
        field3772 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)I", line = 207)
    public static final int method1227(int arg0) {
        field3774++;
        if (arg0 != 127) {
            method1227(-127);
        }
        return class43.field1184++;
    }
}
