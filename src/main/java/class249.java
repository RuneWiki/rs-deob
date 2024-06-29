import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class249 extends class134 {

    @OriginalMember(owner = "client!dea", name = "o", descriptor = "Z")
    public static boolean field3236 = true;

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!dea", name = "l", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!dea", name = "m", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!dea", name = "n", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(B)I")
    public final int method1490(byte arg0) {
        if (arg0 < 119) {
            return -73;
        } else {
            ++field3234;
            return super.field1708;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IJ)V")
    public static final void method1491(int arg0, long arg1) {
        ++field3232;
        int var3 = class86.field1179;
        if (~class558.field7855 != ~var3) {
            int var4 = -class558.field7855 + var3;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 <= 0) {
                if (var5 != 0) {
                    if (var4 > var5) {
                        var5 = var4;
                    }
                } else {
                    var5 = -1;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (~var4 > ~var5) {
                var5 = var4;
            }
            class558.field7855 += var5;
        }
        int var6 = class232.field2981;
        if (arg0 == -1) {
            class255.field3307 += (float) arg1 * class285.field3771 / 40.0F * 8.0F;
            if (~class420.field5892 != ~var6) {
                int var7 = -class420.field5892 + var6;
                int var8 = (int) ((long) var7 * arg1 / 320L);
                if (~var7 >= -1) {
                    if (var8 == 0) {
                        var8 = -1;
                    } else if (~var8 > ~var7) {
                        var8 = var7;
                    }
                } else if (var8 != 0) {
                    if (var8 > var7) {
                        var8 = var7;
                    }
                } else {
                    var8 = 1;
                }
                class420.field5892 += var8;
            }
            class183.field2237 += (float) arg1 * class471.field6528 / 40.0F * 8.0F;
            class132.method831(true);
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IC)I")
    public static final int method1492(int arg0, char arg1) {
        ++field3228;
        if (arg0 <= 72) {
            return 52;
        } else {
            return arg1 >= 0 && class293.field3917.length > arg1 ? class293.field3917[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)I")
    public final int method58(int arg0) {
        if (arg0 != 0) {
            return 19;
        } else {
            ++field3231;
            return ~super.field1712.method2280(arg0 ^ -98).method3189(arg0 + -1) > -97 ? 0 : 2;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V")
    public final void method60(byte arg0) {
        if (arg0 > 118) {
            if (~super.field1712.method2280(-123).method3189(-1) > -97) {
                super.field1708 = 0;
            }
            ++field3235;
            if (super.field1708 < 0 || super.field1708 > 2) {
                super.field1708 = this.method58(0);
            }
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lkda;)V")
    public class249(class391 arg0) {
        super(arg0);
        class727.method4077(-119, super.field1708);
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(ILkda;)V")
    public class249(int arg0, class391 arg1) {
        super(arg0, arg1);
        class727.method4077(-44, super.field1708);
    }

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "(I)Z")
    public final boolean method1493(int arg0) {
        ++field3233;
        return super.field1712.method2280(-100).method3189(arg0) >= 96;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)V")
    public final void method55(int arg0, int arg1) {
        super.field1708 = arg1;
        ++field3227;
        int var3 = 50 % ((arg0 - -26) / 41);
        class727.method4077(-42, super.field1708);
    }

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        if (arg1 != 29053) {
            method1492(-122, 't');
        }
        ++field3229;
        return ~super.field1712.method2280(-119).method3189(arg1 ^ -29054) > -97 ? 3 : 1;
    }
}
