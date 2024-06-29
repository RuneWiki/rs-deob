import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class316 extends class476 {

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "Lrb;")
    public static class283 field4294 = new class283(38, 6);

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "[I")
    public static int[] field4300;

    @OriginalMember(owner = "client!vm", name = "C", descriptor = "Lew;")
    public static class270 field4301;

    @OriginalMember(owner = "client!vm", name = "E", descriptor = "Lhi;")
    public static class45 field4303;

    @OriginalMember(owner = "client!vm", name = "F", descriptor = "[I")
    public static int[] field4304;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public int field4281;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public int field4282;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public int field4283;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public int field4284;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public int field4285;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public int field4286;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public int field4287;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
    public int field4289;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public int field4290;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public int field4292;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "I")
    public int field4295;

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "I")
    public int field4296;

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "I")
    public int field4297;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
    public int field4299;

    @OriginalMember(owner = "client!vm", name = "D", descriptor = "I")
    public int field4302;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "Lcg;")
    public static class452 field4288;

    @OriginalMember(owner = "client!vm", name = "G", descriptor = "Ljv;")
    public static class484 field4305;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vm", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field4306;

    // $FF: synthetic method
    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1822(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class157(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field4300 = new int[] { 0, -1, 0, 1 };
        field4301 = new class270(8);
        field4303 = new class45(60, 11);
        field4304 = new int[] { 1, 0, -1, 0 };
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLws;)I", line = 6)
    public static final int method1819(byte arg0, class440 arg1) {
        field4293++;
        String var2 = class219.method1368(arg1, (byte) 112);
        int[] var3 = null;
        if (class302.method1752(83, arg1.field6337)) {
            var3 = class534.field7872.method3089((int) arg1.field6334, 19).field4072;
        } else if (arg1.field6336 != -1) {
            var3 = class534.field7872.method3089(arg1.field6336, -28).field4072;
        } else if (class339.method2062((byte) -119, arg1.field6337)) {
            class326 var4 = (class326) class281.field3826.method1592((byte) -25, (long) ((int) arg1.field6334));
            if (var4 != null) {
                class209 var5 = var4.field4455;
                class83 var6 = var5.field2976;
                if (var6.field1272 != null) {
                    var6 = var6.method655(class309.field4200, (byte) 121);
                }
                if (var6 != null) {
                    var3 = var6.field1278;
                }
            }
        } else if (class288.method1653(arg1.field6337, (byte) -61)) {
            Object var7 = null;
            class103 var8;
            if (arg1.field6337 == 1009) {
                var8 = class452.field6629.method603((byte) 94, (int) arg1.field6334);
            } else {
                var8 = class452.field6629.method603((byte) 90, (int) (arg1.field6334 >>> 32 & 0x7FFFFFFFL));
            }
            if (var8.field1613 != null) {
                var8 = var8.method795(-31036, class309.field4200);
            }
            if (var8 != null) {
                var3 = var8.field1650;
            }
        }
        if (var3 != null) {
            var2 = var2 + class413.method2430(0, var3);
        }
        int var9 = class80.field1127.method411(var2, class271.field3684, -1);
        if (arg0 < 39) {
            return -121;
        } else {
            if (arg1.field6340) {
                var9 += class108.field1749.method205() + 4;
            }
            return var9;
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)V", line = 80)
    public static void method1820(byte arg0) {
        field4305 = null;
        if (arg0 <= 124) {
            method1819((byte) -28, null);
        }
        field4294 = null;
        field4301 = null;
        field4303 = null;
        field4288 = null;
        field4304 = null;
        field4300 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILza;)Le;", line = 112)
    public final class285 method1821(int arg0, int arg1, class295 arg2) {
        int var4 = 48 / ((-arg0 - 25) / 38);
        field4291++;
        int var5 = class153.field2356[this.field4299];
        if (var5 == 0) {
            class168 var12 = class191.method1267(this.field4282, this.field4285, this.field4283);
            if (var12 instanceof class503) {
                class503 var13 = (class503) var12;
                if (var13.field7360 != null) {
                    return ((class303) var13.field7360).method162(arg1, arg2, (byte) -14);
                }
            }
        } else if (var5 == 1) {
            class63 var6 = class506.method3004(this.field4282, this.field4285, this.field4283);
            if (var6 instanceof class528) {
                class528 var7 = (class528) var6;
                if (var7.field7712 != null) {
                    return ((class303) var7.field7712).method162(arg1, arg2, (byte) -14);
                }
            }
        } else if (var5 == 2) {
            class434 var10 = class377.method2254(this.field4282, this.field4285, this.field4283, field4306 == null ? (field4306 = method1822("bn")) : field4306);
            if (var10 instanceof class214) {
                class214 var11 = (class214) var10;
                if (var11.field3049 != null) {
                    return ((class303) var11.field3049).method162(arg1, arg2, (byte) -14);
                }
            }
        } else if (var5 == 3) {
            class167 var8 = class126.method913(this.field4282, this.field4285, this.field4283);
            if (var8 instanceof class284) {
                class284 var9 = (class284) var8;
                if (var9.field3843 != null) {
                    return ((class303) var9.field3843).method162(arg1, arg2, (byte) -14);
                }
            }
        }
        return null;
    }
}
