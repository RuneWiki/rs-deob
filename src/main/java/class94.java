import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class94 extends class124 {

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field1279 = new String[100];

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(B)V")
    public static void method822(byte arg0) {
        if (arg0 != 55) {
            field1278 = -10;
        }
        field1279 = null;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIIF)V")
    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIB)V")
    public final void method770(int arg0, int arg1, int arg2, byte arg3) {
        super.field1819 = arg1;
        super.field1807 = arg2;
        ++field1277;
        if (arg3 != 21) {
            this.method770(4, -40, -119, (byte) 30);
        }
        super.field1812 = arg0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLr;)I")
    public static final int method823(byte arg0, class121 arg1) {
        if (arg0 != -17) {
            field1278 = 31;
        }
        ++field1276;
        if (arg1.field1767 == 0) {
            return 0;
        } else {
            if (arg1.field1713 != -1) {
                class121 var2 = null;
                if (arg1.field1713 >= 32768) {
                    if (arg1.field1713 >= 32768) {
                        var2 = class384.field5647[arg1.field1713 + -32768];
                    }
                } else {
                    var2 = class250.field3690[arg1.field1713];
                }
                if (var2 != null) {
                    int var3 = -var2.field6335 + arg1.field6335;
                    int var4 = -var2.field6334 + arg1.field6334;
                    if (var3 != 0 || var4 != 0) {
                        arg1.method955(16383 & (int) (2607.5945876176133D * Math.atan2((double) var3, (double) var4)), false);
                    }
                }
            }
            if (!(arg1 instanceof class364)) {
                if (arg1 instanceof class461) {
                    class461 var5 = (class461) arg1;
                    if (~var5.field6770 != 0 && (var5.field1779 == 0 || var5.field1775 > 0)) {
                        int var6 = var5.field6335 - (-class340.field4713 + var5.field6770 + -class340.field4713) * 64;
                        int var7 = -((-class476.field7013 + var5.field6777 - class476.field7013) * 64) + var5.field6334;
                        if (~var6 != -1 || ~var7 != -1) {
                            var5.method955(16383 & (int) (Math.atan2((double) var6, (double) var7) * 2607.5945876176133D), false);
                        }
                        var5.field6770 = -1;
                    }
                }
            } else {
                class364 var8 = (class364) arg1;
                if (~var8.field5067 != 0 && (var8.field1779 == 0 || var8.field1775 > 0)) {
                    var8.method955(var8.field5067, false);
                    var8.field5067 = -1;
                }
            }
            return arg1.method962(true);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IF)V")
    public final void method773(int arg0, float arg1) {
        ++field1275;
        if (arg0 != 0) {
            field1278 = 127;
        }
        super.field1808 = arg1;
    }
}
