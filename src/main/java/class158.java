import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class158 extends class182 {

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    public static int field2867 = 0;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "J")
    public static long field2869 = 0L;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "[J")
    public static long[] field2873 = new long[100];

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "Lkh;")
    public static class117 field2876 = class224.method1450((byte) 124, " ");

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "Lkh;")
    private static class117 field2884 = class224.method1450((byte) -112, "OFF");

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "Lkh;")
    public static class117 field2870 = field2884;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!oe", name = "fb", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!oe", name = "gb", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "Lfi;")
    public static class65 field2868;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "[I")
    public int[] field2866;

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "[I")
    private int[] field2883;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "[Lkh;")
    private class117[] field2877;

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "[[I")
    private int[][] field2879;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public final void method1118(int arg0) {
        if (this.field2866 != null) {
            for (int var2 = 0; var2 < this.field2866.length; var2++) {
                this.field2866[var2] = class40.method352(this.field2866[var2], 32768);
            }
        }
        field2886++;
        if (arg0 != 32768) {
            field2873 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lnc;Z)Lkh;")
    public final class117 method1119(class145 arg0, boolean arg1) {
        if (arg1) {
            field2870 = null;
        }
        field2885++;
        class117 var3 = class34.method304(144, 80);
        if (this.field2883 != null) {
            for (int var4 = 0; var4 < this.field2883.length; var4++) {
                var3.method807((byte) -8, this.field2877[var4]);
                var3.method807((byte) -8, class127.method872(this.field2883[var4], arg0.method1039(class66.field1268[this.field2883[var4]], 0), this.field2879[var4], (byte) -110));
            }
        }
        var3.method807((byte) -8, this.field2877[this.field2877.length - 1]);
        return var3.method779(26553);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIILdd;IJIIII)Z")
    public static final boolean method1120(int arg0, int arg1, int arg2, int arg3, class38 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class172.method1203(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)I")
    public final int method1121(boolean arg0) {
        field2887++;
        if (!arg0) {
            this.method1121(false);
        }
        return this.field2883 == null ? 0 : this.field2883.length;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
    public static final void method1122(int arg0, int arg1, int arg2) {
        field2882++;
        if (arg1 != 0) {
            method1127(101, 90);
        }
        if (class223.method1446(arg0, arg1 ^ 0x6)) {
            class9.method62(arg2, (byte) -96, class90.field1675[arg0]);
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)Lkh;")
    public final class117 method1123(int arg0) {
        field2888++;
        class117 var2 = class34.method304(144, 80);
        if (this.field2877 == null) {
            return class186.field3342;
        }
        var2.method807((byte) -8, this.field2877[0]);
        for (int var3 = arg0; var3 < this.field2877.length; var3++) {
            var2.method807((byte) -8, class190.field3378);
            var2.method807((byte) -8, this.field2877[var3]);
        }
        return var2.method779(26553);
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V")
    public static void method1124(int arg0) {
        field2876 = null;
        field2884 = null;
        if (arg0 >= -85) {
            field2870 = null;
        }
        field2870 = null;
        field2868 = null;
        field2873 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I")
    public final int method1125(int arg0, int arg1) {
        field2872++;
        if (arg1 != -27819) {
            method1124(-69);
        }
        return this.field2883 == null || arg0 < 0 || arg0 > this.field2883.length ? -1 : this.field2883[arg0];
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[ILnc;)V")
    public final void method1126(int arg0, int[] arg1, class145 arg2) {
        field2871++;
        if (this.field2883 == null) {
            return;
        }
        int var4 = -84 % ((arg0 + 57) / 61);
        for (int var5 = 0; var5 < this.field2883.length; var5++) {
            if (arg1.length <= var5) {
                return;
            }
            int var6 = class209.field3755[this.method1125(var5, -27819)];
            if (var6 > 0) {
                arg2.method1006(6439, (long) arg1[var5], var6);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)I")
    public static final int method1127(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLnc;)V")
    public final void method1128(byte arg0, class145 arg1) {
        field2875++;
        if (arg0 >= -24) {
            field2868 = null;
        }
        while (true) {
            int var3 = arg1.method998(127);
            if (var3 == 0) {
                return;
            }
            this.method1130(var3, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZII)I")
    public final int method1129(boolean arg0, int arg1, int arg2) {
        field2874++;
        if (this.field2883 == null || arg2 < 0 || this.field2883.length < arg2) {
            return -1;
        } else {
            if (arg0) {
                method1122(-10, 117, -6);
            }
            return this.field2879[arg2] == null || arg1 < 0 || this.field2879[arg2].length < arg1 ? -1 : this.field2879[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILnc;I)V")
    private final void method1130(int arg0, class145 arg1, int arg2) {
        if (arg0 == 1) {
            this.field2877 = arg1.method1038(110).method791((byte) 125, 60);
        } else if (arg0 == 2) {
            int var8 = arg1.method998(118);
            this.field2866 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2866[var9] = arg1.method1049((byte) 104);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method998(122);
            this.field2883 = new int[var4];
            this.field2879 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1049((byte) 118);
                this.field2883[var5] = var6;
                this.field2879[var5] = new int[class208.field3730[var6]];
                for (int var7 = 0; var7 < class208.field3730[var6]; var7++) {
                    this.field2879[var5][var7] = arg1.method1049((byte) 96);
                }
            }
        }
        field2878++;
        if (arg2 != 0) {
            field2873 = null;
        }
    }
}
