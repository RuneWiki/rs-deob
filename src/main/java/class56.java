import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class56 extends class166 {

    @OriginalMember(owner = "client!fe", name = "hb", descriptor = "I")
    private int field1135;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    private int field1124;

    @OriginalMember(owner = "client!fe", name = "fb", descriptor = "I")
    private int field1133;

    @OriginalMember(owner = "client!fe", name = "cb", descriptor = "I")
    private int field1130;

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "I")
    private int field1129;

    @OriginalMember(owner = "client!fe", name = "jb", descriptor = "I")
    private int field1137;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "Lre;")
    private class162 field1128;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    private int field1123;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    private int field1122;

    @OriginalMember(owner = "client!fe", name = "gb", descriptor = "Lrf;")
    private static class163 field1134 = class53.method392(-84, "Please enter your password)3");

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "Lrf;")
    public static class163 field1131 = field1134;

    @OriginalMember(owner = "client!fe", name = "kb", descriptor = "Lrf;")
    public static class163 field1138 = class53.method392(-123, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!fe", name = "eb", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!fe", name = "lb", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!fe", name = "ib", descriptor = "Ldg;")
    public static class38 field1136;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZILu;)[Lrh;")
    public static final class165[] method405(int arg0, boolean arg1, int arg2, class184 arg3) {
        field1127++;
        if (arg1) {
            method410(45, 123);
        }
        return class102.method700(arg0, arg3, (byte) -16, arg2) ? class163.method1048(!arg1) : null;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)Lje;")
    public final class91 method406(boolean arg0) {
        field1125++;
        if (this.field1128 != null) {
            int var2 = class51.field1023 - this.field1122;
            if (var2 > 100 && this.field1128.field3287 > 0) {
                var2 = 100;
            }
            label51: {
                do {
                    do {
                        if (this.field1128.field3292[this.field1123] >= var2) {
                            break label51;
                        }
                        var2 -= this.field1128.field3292[this.field1123];
                        this.field1123++;
                    } while (this.field1128.field3263.length > this.field1123);
                    this.field1123 -= this.field1128.field3287;
                } while (this.field1123 >= 0 && this.field1123 < this.field1128.field3263.length);
                this.field1128 = null;
            }
            this.field1122 = class51.field1023 - var2;
        }
        class61 var3 = class199.method1314((byte) 126, this.field1130);
        if (var3.field1246 != null) {
            var3 = var3.method435(-50);
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field1137 == 1 || this.field1137 == 3) {
            var5 = var3.field1257;
            var4 = var3.field1250;
        } else {
            var4 = var3.field1257;
            var5 = var3.field1250;
        }
        int var6 = (var4 + 1 >> 1) + this.field1135;
        int var7 = this.field1135 + (var4 >> 1);
        int[][] var8 = class154.field3199[this.field1124];
        int var9 = (var5 + 1 >> 1) + this.field1133;
        int var10 = (var5 >> 1) + this.field1133;
        int var11 = var8[var6][var10] + var8[var7][var10] + var8[var7][var9] + var8[var6][var9] >> 2;
        int var12 = (this.field1135 << 7) + (var4 << 6);
        int var13 = (this.field1133 << 7) + (var5 << 6);
        return arg0 ? null : var3.method439(var11, var12, this.field1128, this.field1137, var8, this.field1123, var13, this.field1129, false);
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V")
    public static void method407(int arg0) {
        field1136 = null;
        if (arg0 == -101) {
            field1134 = null;
            field1131 = null;
            field1138 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
    public static final byte[] method408(Object arg0, boolean arg1, byte arg2) {
        if (arg2 > -53) {
            return null;
        }
        field1132++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class150.method974(var3, (byte) -53) : var3;
        } else if (arg0 instanceof class120) {
            class120 var4 = (class120) arg0;
            return var4.method818((byte) 94);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "(I)V")
    public static final void method409(int arg0) {
        class38.field783 = null;
        class36.field701 = null;
        field1139++;
        class70.field1473 = null;
        if (arg0 != -30791) {
            return;
        }
        class102.field2138 = null;
        class43.field884 = null;
        class64.field1362 = null;
        class53.field1098 = null;
        class144.field2959 = null;
        class26.field488 = null;
        class40.field829 = null;
        class103.field2168 = null;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)Z")
    public static final boolean method410(int arg0, int arg1) {
        field1121++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg0 > arg1 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIIIIZLs;)V")
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class166 arg8) {
        this.field1135 = arg4;
        this.field1124 = arg3;
        this.field1133 = arg5;
        this.field1130 = arg0;
        this.field1129 = arg1;
        this.field1137 = arg2;
        if (arg6 != -1) {
            this.field1128 = class97.method668(arg6, (byte) 44);
            this.field1123 = 0;
            this.field1122 = class51.field1023 - 1;
            if (this.field1128.field3265 == 0 && arg8 != null && arg8 instanceof class56) {
                class56 var10 = (class56) arg8;
                if (this.field1128 == var10.field1128) {
                    this.field1123 = var10.field1123;
                    this.field1122 = var10.field1122;
                    return;
                }
            }
            if (arg7 && this.field1128.field3287 != -1) {
                this.field1123 = (int) (Math.random() * (double) this.field1128.field3263.length);
                this.field1122 -= (int) ((double) this.field1128.field3292[this.field1123] * Math.random());
                return;
            }
        }
    }
}
