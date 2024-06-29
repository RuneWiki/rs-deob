import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class1 extends class175 {

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "Lhe;")
    public static class136 field4 = new class136(5000);

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field10 = (int) (17.0D * Math.random()) - 8;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        ++field7;
        int[] var3 = super.field3044.method904((byte) -99, arg1);
        if (super.field3044.field2150) {
            int var4 = class23.field395[arg1];
            for (int var5 = 0; ~var5 > ~field11; ++var5) {
                var3[var5] = this.method4(true, class244.field4240[var5], var4) % 4096;
            }
        }
        int var6 = 110 % ((62 - arg0) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class1() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILmb;)V")
    public static final void method2(int arg0, class96 arg1) {
        ++field6;
        class10.method80((byte) -109);
        if (arg0 == 22050) {
            class196.method1367((byte) 16, arg1);
        }
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(B)Z")
    public static final boolean method3(byte arg0) {
        ++field1;
        int var1 = 75 % ((arg0 - -16) / 57);
        try {
            if (~class249.field4308 == -3) {
                if (class250.field4329 == null) {
                    class250.field4329 = class182.method1285(class85.field1436, class74.field1295, class269.field4690);
                    if (class250.field4329 == null) {
                        return false;
                    }
                }
                if (class103.field1738 == null) {
                    class103.field1738 = new class51(class165.field2929, class213.field3676);
                }
                if (class254.field4385.method232(class250.field4329, 22050, class103.field1738, true, class138.field2476)) {
                    class254.field4385.method239((byte) 102);
                    class254.field4385.method222((byte) 116, class33.field551);
                    class254.field4385.method227(class250.field4329, -16257, class103.field1736);
                    class103.field1738 = null;
                    class85.field1436 = null;
                    class249.field4308 = 0;
                    class250.field4329 = null;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class254.field4385.method233(20145);
            class103.field1738 = null;
            class250.field4329 = null;
            class249.field4308 = 0;
            class85.field1436 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(ZII)I")
    private final int method4(boolean arg0, int arg1, int arg2) {
        int var4 = arg2 * 57 + arg1;
        ++field2;
        int var5 = var4 << 1 ^ var4;
        if (!arg0) {
            field11 = 114;
        }
        return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(B)V")
    public static void method5(byte arg0) {
        if (arg0 != -123) {
            field11 = 75;
        }
        field4 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBZJ)Lmb;")
    public static final class96 method6(int arg0, byte arg1, boolean arg2, long arg3) {
        ++field8;
        if (arg0 >= 2 && ~arg0 >= -37) {
            long var5 = arg3 / (long) arg0;
            int var7 = 1;
            while (var5 != 0L) {
                var5 /= (long) arg0;
                ++var7;
            }
            int var8 = var7;
            if (~arg3 > -1L || arg2) {
                var8 = var7 + 1;
            }
            byte[] var9 = new byte[var8];
            if (~arg3 <= -1L) {
                if (arg2) {
                    var9[0] = 43;
                }
            } else {
                var9[0] = 45;
            }
            for (int var10 = 0; var7 > var10; ++var10) {
                int var12 = (int) (arg3 % (long) arg0);
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -10) {
                    var12 += 39;
                }
                arg3 /= (long) arg0;
                var9[-var10 + -1 + var8] = (byte) (var12 + 48);
            }
            if (arg1 != 43) {
                return null;
            } else {
                class96 var11 = new class96();
                var11.field1580 = var9;
                var11.field1600 = var8;
                return var11;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(III)Lw;")
    public static final class107 method7(int arg0, int arg1, int arg2) {
        if (arg2 > -78) {
            field11 = 1;
        }
        class107 var3 = class55.method408(arg0, 251234864);
        ++field3;
        if (arg1 == -1) {
            return var3;
        } else {
            return var3 != null && var3.field1842 != null && ~var3.field1842.length < ~arg1 ? var3.field1842[arg1] : null;
        }
    }
}
