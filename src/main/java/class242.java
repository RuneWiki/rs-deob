import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public abstract class class242 extends class20 {

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "S")
    public short field3327;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public static int field3323 = 0;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "[I")
    public static int[] field3329 = new int[2];

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "Lla;")
    public static class419 field3330;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "(I)Z")
    public final boolean method339(int arg0) {
        int var2 = -123 % ((51 - arg0) / 47);
        ++field3324;
        return class616.field8849[(super.field530 >> class295.field3981) - class591.field8564 + class119.field1526][(super.field531 >> class295.field3981) + (-class33.field663 - -class119.field1526)];
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)I")
    public static int method1474(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([Lul;I)I")
    public final int method340(class530[] arg0, int arg1) {
        ++field3325;
        int var3 = super.field530 >> class295.field3981;
        int var4 = super.field531 >> class295.field3981;
        int var5 = 0;
        if (~class591.field8564 != ~var3) {
            if (var3 > class591.field8564) {
                var5 += 2;
            }
        } else {
            ++var5;
        }
        if (~class33.field663 == ~var4) {
            var5 += 3;
        } else if (~var4 > ~class33.field663) {
            var5 += 6;
        }
        int var6 = class257.field3517[var5];
        if ((this.field3327 & var6) != 0) {
            return this.method336(arg0, 93, var4, var3);
        } else if (~this.field3327 == -2 && var3 > 0) {
            return this.method336(arg0, 83, var4, var3 + -1);
        } else {
            if (arg1 != -1) {
                method1477(40, (String) null, -74);
            }
            if (~this.field3327 == -5 && ~class455.field6393 <= ~var3) {
                return this.method336(arg0, 110, var4, var3 + 1);
            } else if (this.field3327 == 8 && var4 > 0) {
                return this.method336(arg0, 104, var4 + -1, var3);
            } else if (this.field3327 == 2 && ~class302.field4057 <= ~var4) {
                return this.method336(arg0, 109, var4 + 1, var3);
            } else if (~this.field3327 == -17 && ~var3 < -1 && var4 <= class302.field4057) {
                return this.method336(arg0, 93, var4 - -1, var3 + -1);
            } else if (this.field3327 == 32 && var3 <= class455.field6393 && ~class302.field4057 <= ~var4) {
                return this.method336(arg0, 90, var4 + 1, var3 + 1);
            } else if (this.field3327 == 128 && ~var3 < -1 && var4 > 0) {
                return this.method336(arg0, arg1 ^ -119, var4 - 1, var3 + -1);
            } else if (~this.field3327 == -65 && ~var3 >= ~class455.field6393 && var4 > 0) {
                return this.method336(arg0, arg1 + 94, var4 - 1, var3 + 1);
            } else {
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)Z")
    public final boolean method335(byte arg0) {
        ++field3326;
        int var2 = -113 % ((-19 - arg0) / 60);
        return class56.method583(this, super.field531 >> class295.field3981, super.field530 >> class295.field3981, 108, super.field535);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V")
    public static final void method1475(int arg0, int arg1) {
        class190.field2312 = false;
        class74.field1112 = null;
        class511.field7473 = 0;
        class505.field7053 = 1;
        ++field3328;
        class42.field762 = arg1;
        class548.field7959 = null;
        class108.field1399 = arg0;
        class426.field6123 = -1;
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "(B)V")
    public static void method1476(byte arg0) {
        field3330 = null;
        if (arg0 != 83) {
            field3329 = null;
        }
        field3329 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1477(int arg0, String arg1, int arg2) {
        ++field3322;
        int var3 = class394.field5564;
        int[] var4 = class82.field1176;
        boolean var5 = false;
        for (int var6 = arg0; var6 < var3; ++var6) {
            class613 var7 = class184.field2252[var4[var6]];
            if (var7 != null && class206.field2472 != var7 && var7.field8801 != null && var7.field8801.equalsIgnoreCase(arg1)) {
                var5 = true;
                if (~arg2 == -2) {
                    ++class637.field9125;
                    class543 var8 = class299.method1780(class84.field1196, class136.field1728, 91);
                    var8.field7872.method2281((byte) 58, 0);
                    var8.field7872.method2256(var4[var6], 2);
                    class511.method3028(7482, var8);
                } else if (~arg2 != -5) {
                    if (~arg2 != -6) {
                        if (~arg2 == -7) {
                            ++class306.field4067;
                            class543 var9 = class299.method1780(class84.field1196, class600.field8654, arg0 ^ 103);
                            var9.field7872.method2237(-46, 0);
                            var9.field7872.method2226(var4[var6], (byte) -58);
                            class511.method3028(7482, var9);
                        } else if (~arg2 == -8) {
                            ++class526.field7703;
                            class543 var10 = class299.method1780(class84.field1196, class321.field4227, 109);
                            var10.field7872.method2237(arg0 + -51, 0);
                            var10.field7872.method2226(var4[var6], (byte) -58);
                            class511.method3028(7482, var10);
                        }
                    } else {
                        ++class617.field8855;
                        class543 var11 = class299.method1780(class84.field1196, class115.field1494, 79);
                        var11.field7872.method2268(0, 0);
                        var11.field7872.method2222(var4[var6], -17414);
                        class511.method3028(arg0 + 7482, var11);
                    }
                } else {
                    ++class549.field7967;
                    class543 var12 = class299.method1780(class84.field1196, class506.field7144, 51);
                    var12.field7872.method2282(arg0 ^ -2, 0);
                    var12.field7872.method2226(var4[var6], (byte) -58);
                    class511.method3028(arg0 + 7482, var12);
                }
                break;
            }
        }
        if (!var5) {
            class175.method1103((byte) 38, 4, class424.field6059.method2561(class370.field4980, 0) + arg1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIIII)V")
    public class242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field535 = (byte) arg4;
        super.field531 = arg2;
        super.field527 = arg1;
        super.field530 = arg0;
        super.field532 = (byte) arg3;
        this.field3327 = (short) arg5;
    }
}
