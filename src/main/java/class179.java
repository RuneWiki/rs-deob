import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class179 extends class76 {

    @OriginalMember(owner = "client!bi", name = "ab", descriptor = "I")
    private int field3091 = -1;

    @OriginalMember(owner = "client!bi", name = "Z", descriptor = "[Leb;")
    public static class217[] field3090 = new class217[500];

    @OriginalMember(owner = "client!bi", name = "db", descriptor = "Z")
    public static boolean field3094 = true;

    @OriginalMember(owner = "client!bi", name = "cb", descriptor = "Z")
    public static boolean field3093 = true;

    @OriginalMember(owner = "client!bi", name = "nb", descriptor = "[J")
    public static long[] field3104 = new long[500];

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "client!bi", name = "bb", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!bi", name = "fb", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!bi", name = "gb", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!bi", name = "hb", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!bi", name = "ib", descriptor = "I")
    public int field3099;

    @OriginalMember(owner = "client!bi", name = "jb", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!bi", name = "kb", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!bi", name = "lb", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!bi", name = "mb", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!bi", name = "eb", descriptor = "[I")
    public int[] field3095;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(II)Lgh;")
    public static final class81 method1229(int arg0, int arg1) {
        ++field3098;
        if (arg1 != 877891460) {
            method1231(11);
        }
        class81 var2 = (class81) class118.field2112.method615(false, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class209.field3584.method1197(class55.method423(-9688, arg0), class250.method1631(arg0, (byte) 121), arg1 + -877891462);
            class81 var4 = new class81();
            if (var3 != null) {
                var4.method609(new class152(var3), arg1 + -877891345);
            }
            class118.field2112.method619((byte) 49, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        ++field3097;
        if (arg2 == 0) {
            this.field3091 = arg0.method1063(-17162);
        }
        if (arg1 >= -86) {
            method1229(-3, -114);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)[[I")
    public int[][] method157(int arg0, byte arg1) {
        ++field3100;
        int[][] var3 = super.field1485.method649(arg0, true);
        if (arg1 <= 2) {
            this.method1233(82);
        }
        if (super.field1485.field1692 && this.method1233(877891460)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = (class13.field249 != this.field3099 ? this.field3099 * arg0 / class13.field249 : arg0) * this.field3089;
            if (~class96.field1807 != ~this.field3089) {
                for (int var8 = 0; ~class96.field1807 < ~var8; ++var8) {
                    int var9 = this.field3089 * var8 / class96.field1807;
                    int var10 = this.field3095[var7 - -var9];
                    var6[var8] = class30.method252(4080, var10 << 4);
                    var4[var8] = class30.method252(4080, var10 >> 4);
                    var5[var8] = class30.method252(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; var11 < class96.field1807; ++var11) {
                    int var12 = this.field3095[var7++];
                    var6[var11] = class30.method252(255, var12) << 4;
                    var4[var11] = class30.method252(4080, var12 >> 4);
                    var5[var11] = class30.method252(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(IIB)I")
    public static final int method1230(int arg0, int arg1, byte arg2) {
        ++field3102;
        int var3 = -122 % (arg2 / 37);
        class260 var4 = (class260) class174.field2965.method434((byte) -93, (long) arg0);
        if (var4 == null) {
            return 0;
        } else {
            return ~arg1 <= -1 && var4.field4518.length > arg1 ? var4.field4518[arg1] : 0;
        }
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)I")
    public final int method563(int arg0) {
        int var2 = -50 % ((38 - arg0) / 51);
        ++field3096;
        return this.field3091;
    }

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "(I)V")
    public static void method1231(int arg0) {
        if (arg0 != -29652) {
            field3094 = true;
        }
        field3104 = null;
        field3090 = null;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class179() {
        super(0, false);
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V")
    public final void method557(int arg0) {
        ++field3092;
        super.method557(arg0);
        this.field3095 = null;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(ZI)I")
    public static final int method1232(boolean arg0, int arg1) {
        ++field3103;
        if (class227.field3822 == 1) {
            return 7;
        } else {
            if (arg0) {
                method1232(true, 127);
            }
            if (arg1 != 77) {
                if (arg1 != 38) {
                    if (~arg1 != -17) {
                        if (~arg1 != -162) {
                            if (~arg1 != -192) {
                                return ~arg1 == -70 ? 6 : 0;
                            } else {
                                return 5;
                            }
                        } else {
                            return 4;
                        }
                    } else {
                        return 3;
                    }
                } else {
                    return 2;
                }
            } else {
                return 1;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "(I)Z")
    public final boolean method1233(int arg0) {
        ++field3101;
        if (arg0 != 877891460) {
            field3104 = null;
        }
        if (this.field3095 != null) {
            return true;
        } else if (this.field3091 >= 0) {
            class190 var2 = class102.method745(126, class32.field622, this.field3091);
            var2.method1277();
            this.field3099 = var2.field3204;
            this.field3089 = var2.field3193;
            this.field3095 = var2.field3263;
            return true;
        } else {
            return false;
        }
    }
}
