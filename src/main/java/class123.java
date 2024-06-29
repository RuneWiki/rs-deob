import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class123 extends class45 {

    @OriginalMember(owner = "client!re", name = "W", descriptor = "I")
    private int field3136 = 0;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field3131 = 0;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "Lkd;")
    public static class73 field3135 = class126.method1070((byte) -66, "null");

    @OriginalMember(owner = "client!re", name = "X", descriptor = "Lkd;")
    public static class73 field3137 = class126.method1070((byte) -66, "<col=ff0000>");

    @OriginalMember(owner = "client!re", name = "T", descriptor = "Lkd;")
    public static class73 field3133 = class126.method1070((byte) -66, "Von:");

    @OriginalMember(owner = "client!re", name = "gb", descriptor = "Lkd;")
    private static class73 field3146 = class126.method1070((byte) -66, "Add friend");

    @OriginalMember(owner = "client!re", name = "db", descriptor = "Lkd;")
    public static class73 field3143 = class126.method1070((byte) -66, ":chalreq:");

    @OriginalMember(owner = "client!re", name = "fb", descriptor = "Lkd;")
    public static class73 field3145 = field3146;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "I")
    public int field3139;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "I")
    public int field3144;

    @OriginalMember(owner = "client!re", name = "hb", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!re", name = "ib", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!re", name = "jb", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lr;III)V")
    public static final void method1046(class118 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2284 == arg1 && arg1 != -1) {
            int var4 = class94.method782(-24669, arg1).field995;
            if (var4 == 1) {
                arg0.field2296 = 0;
                arg0.field2241 = arg3;
                arg0.field2232 = 0;
                arg0.field2274 = 0;
            }
            if (var4 == 2) {
                arg0.field2274 = 0;
            }
        } else if (arg1 == -1 || arg0.field2284 == -1 || class94.method782(-24669, arg1).field980 >= class94.method782(-24669, arg0.field2284).field980) {
            arg0.field2232 = 0;
            arg0.field2284 = arg1;
            arg0.field2228 = arg0.field2286;
            arg0.field2274 = 0;
            arg0.field2296 = 0;
            arg0.field2241 = arg3;
        }
        field3140++;
        if (arg2 < 81) {
            method1046(null, -95, -24, 0);
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(II)V")
    private final void method1047(int arg0, int arg1) {
        field3132++;
        double var3 = (double) (arg1 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var7 = var5;
        double var9 = var5;
        if (arg0 != 14457) {
            return;
        }
        double var11 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (var5 > var11) {
            var7 = var11;
        }
        if (var7 > var3) {
            var7 = var3;
        }
        if (var11 > var5) {
            var9 = var11;
        }
        double var13 = 0.0D;
        if (var3 > var9) {
            var9 = var3;
        }
        double var15 = 0.0D;
        double var17 = (var7 + var9) / 2.0D;
        if (var7 != var9) {
            if (var17 < 0.5D) {
                var15 = (var9 - var7) / (var7 + var9);
            }
            if (var5 == var9) {
                var13 = (var11 - var3) / (-var7 + var9);
            } else if (var9 == var11) {
                var13 = (var3 - var5) / (-var7 + var9) + 2.0D;
            } else if (var3 == var9) {
                var13 = (var5 - var11) / (var9 - var7) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var7) / (2.0D - var9 - var7);
            }
        }
        if (var17 > 0.5D) {
            this.field3142 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3142 = (int) (var15 * var17 * 512.0D);
        }
        this.field3144 = (int) (var17 * 256.0D);
        if (this.field3144 < 0) {
            this.field3144 = 0;
        } else if (this.field3144 > 255) {
            this.field3144 = 255;
        }
        double var19 = var13 / 6.0D;
        if (this.field3142 < 1) {
            this.field3142 = 1;
        }
        this.field3139 = (int) ((double) this.field3142 * var19);
        this.field3148 = (int) (var15 * 256.0D);
        if (this.field3148 < 0) {
            this.field3148 = 0;
        } else if (this.field3148 > 255) {
            this.field3148 = 255;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLtb;)V")
    public static final void method1048(byte arg0, class132 arg1) {
        field3138++;
        int var2 = 0;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg1.field3305 == 0) {
            var2 = class34.field923.method81(arg1.field3311, arg1.field3314, arg1.field3301);
        }
        int var6 = 118 / ((16 - arg0) / 44);
        if (arg1.field3305 == 1) {
            var2 = class34.field923.method82(arg1.field3311, arg1.field3314, arg1.field3301);
        }
        if (arg1.field3305 == 2) {
            var2 = class34.field923.method63(arg1.field3311, arg1.field3314, arg1.field3301);
        }
        if (arg1.field3305 == 3) {
            var2 = class34.field923.method42(arg1.field3311, arg1.field3314, arg1.field3301);
        }
        if (var2 != 0) {
            var3 = var2 >> 14 & 0x7FFF;
            int var7 = class34.field923.method62(arg1.field3311, arg1.field3314, arg1.field3301, var2);
            var5 = var7 & 0x1F;
            var4 = var7 >> 6 & 0x3;
        }
        arg1.field3316 = var4;
        arg1.field3321 = var5;
        arg1.field3326 = var3;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILqc;I)V")
    public final void method1049(int arg0, class114 arg1, int arg2) {
        field3149++;
        while (true) {
            int var4 = arg1.method957((byte) 113);
            if (var4 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    method1048((byte) -82, null);
                    return;
                }
            }
            this.method1052(256, var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
    public final void method1050(byte arg0) {
        if (arg0 == -30) {
            this.method1047(14457, this.field3136);
            field3141++;
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(B)V")
    public static void method1051(byte arg0) {
        if (arg0 != -62) {
            return;
        }
        field3133 = null;
        field3145 = null;
        field3135 = null;
        field3137 = null;
        field3146 = null;
        field3143 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILqc;)V")
    private final void method1052(int arg0, int arg1, int arg2, class114 arg3) {
        if (arg0 == 256) {
            if (arg1 == 1) {
                this.field3136 = arg3.method933(arg0 - 333);
            }
            field3134++;
        }
    }
}
