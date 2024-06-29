import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class48 extends class64 {

    @OriginalMember(owner = "client!fb", name = "cb", descriptor = "I")
    private int field1161 = -1;

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
    public static int field1155 = 0;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "Lcd;")
    public static class23 field1149 = class54.method414("p11_full", -1);

    @OriginalMember(owner = "client!fb", name = "jb", descriptor = "Lcd;")
    public static class23 field1168 = class54.method414("mapscene", -1);

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
    private int field1157;

    @OriginalMember(owner = "client!fb", name = "Z", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!fb", name = "ab", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!fb", name = "bb", descriptor = "I")
    private int field1160;

    @OriginalMember(owner = "client!fb", name = "db", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!fb", name = "eb", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!fb", name = "fb", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!fb", name = "hb", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!fb", name = "ib", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "[I")
    private int[] field1150;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "[I")
    public static int[] field1151;

    @OriginalMember(owner = "client!fb", name = "gb", descriptor = "[Lea;")
    public static class38[] field1165;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
    public static void method378(int arg0) {
        field1168 = null;
        field1151 = null;
        if (arg0 != -41) {
            field1149 = null;
        }
        field1165 = null;
        field1149 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)V")
    public static final void method379(int arg0, byte arg1) {
        ++field1154;
        if (~class52.field1239 != ~arg0) {
            if (class52.field1239 == 0) {
                class181.method1120((byte) 72);
            }
            if (arg0 == 20 || ~arg0 == -41) {
                class63.field1467 = 0;
                class168.field3350 = 0;
                class89.field1901 = 0;
            }
            if (~arg0 != -21 && ~arg0 != -41 && class80.field1734 != null) {
                class80.field1734.method501(false);
                class80.field1734 = null;
            }
            if (~class52.field1239 == -26) {
                class68.field1587 = 1;
                class172.field3426 = 0;
                class101.field2156 = 0;
                class29.field622 = 1;
                class176.field3504 = 0;
            }
            if (arg0 != 5 && arg0 != 10 && ~arg0 != -21) {
                class112.method719(8);
            } else {
                class70.method507(client.field585, class27.field558, class112.field2360, (byte) -127);
            }
            if (arg1 != 18) {
                field1152 = -45;
            }
            class52.field1239 = arg0;
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)I")
    public final int method380(int arg0) {
        if (arg0 != -1) {
            this.method37((byte) 88, -92, (class189) null);
        }
        ++field1167;
        return this.field1161;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        ++field1156;
        if (!arg1) {
            this.field1160 = -41;
        }
        int[][] var3 = super.field1508.method846(7287, arg0);
        if (super.field1508.field2757 && this.method381(267)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = (~class2.field24 == ~this.field1157 ? arg0 : this.field1157 * arg0 / class2.field24) * this.field1160;
            int[] var7 = var3[2];
            if (~class168.field3367 == ~this.field1160) {
                for (int var8 = 0; ~var8 > ~class168.field3367; ++var8) {
                    int var9 = this.field1150[var6++];
                    var7[var8] = class27.method198(var9, 255) << 4;
                    var5[var8] = class27.method198(var9 >> 4, 4080);
                    var4[var8] = class27.method198(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class168.field3367; ++var10) {
                    int var11 = this.field1160 * var10 / class168.field3367;
                    int var12 = this.field1150[var6 + var11];
                    var7[var10] = class27.method198(var12 << 4, 4080);
                    var5[var10] = class27.method198(65280, var12) >> 4;
                    var4[var10] = class27.method198(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class48() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        ++field1164;
        int var4 = 108 % ((arg0 - 7) / 43);
        if (~arg1 == -1) {
            this.field1161 = arg2.method1197(-1);
        }
    }

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)Z")
    private final boolean method381(int arg0) {
        ++field1158;
        if (arg0 != 267) {
            field1151 = null;
        }
        if (this.field1150 != null) {
            return true;
        } else if (~this.field1161 <= -1) {
            class38 var2 = class168.method1030(this.field1161, true, class168.field3360);
            var2.method295();
            this.field1150 = var2.field782;
            this.field1157 = var2.field787;
            this.field1160 = var2.field788;
            return true;
        } else {
            return false;
        }
    }
}
