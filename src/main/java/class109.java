import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class109 extends class578 {

    @OriginalMember(owner = "client!ut", name = "L", descriptor = "I")
    private int field1517;

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "Z")
    public static boolean field1514 = false;

    @OriginalMember(owner = "client!ut", name = "H", descriptor = "I")
    public static int field1513 = -1;

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "Lfaa;")
    public static class139 field1504 = new class139(8);

    @OriginalMember(owner = "client!ut", name = "y", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!ut", name = "A", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!ut", name = "D", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!ut", name = "F", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!ut", name = "G", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!ut", name = "J", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "[Lvb;")
    public class179[] field1510;

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "[[B")
    private byte[][] field1506;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IB)Z")
    public final boolean method784(int arg0, byte arg1) {
        int var3 = -122 % ((-arg1 - 70) / 47);
        field1507++;
        return this.field1510[arg0].field2589;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)Z")
    public final boolean method785(byte arg0, int arg1) {
        if (arg0 <= 61) {
            field1514 = false;
        }
        field1516++;
        return this.field1510[arg1].field2584;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZI)V")
    public static final void method786(boolean arg0, int arg1) {
        field1512++;
        if (class618.field8608 == null) {
            class607.method3414(true);
        }
        if (arg0) {
            class618.field8608.method272(false);
        }
        int var2 = 13 % ((38 - arg1) / 38);
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(I)Z")
    public final boolean method787(int arg0) {
        field1505++;
        if (this.field1510 != null) {
            return true;
        }
        if (this.field1506 == null) {
            class648 var2 = class588.field8260;
            synchronized (class588.field8260) {
                if (!class588.field8260.method3651(this.field1517, -17)) {
                    return false;
                }
                int[] var4 = class588.field8260.method3655(0, this.field1517);
                this.field1506 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field1506[var5] = class588.field8260.method3654(arg0 - 15623, this.field1517, var4[var5]);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field1506.length; var7++) {
            byte[] var8 = this.field1506[var7];
            class501 var9 = new class501(var8);
            var9.field6892 = 1;
            int var10 = var9.method2845(-1);
            class648 var11 = class181.field2622;
            synchronized (class181.field2622) {
                var6 &= class181.field2622.method3623(arg0 ^ 0xFFFFFF92, var10);
            }
        }
        if (!var6) {
            return false;
        }
        class227 var12 = new class227();
        class648 var13 = class588.field8260;
        int[] var15;
        synchronized (class588.field8260) {
            int var14 = class588.field8260.method3653(this.field1517, true);
            if (arg0 != 8) {
                method791(59);
            }
            this.field1510 = new class179[var14];
            var15 = class588.field8260.method3655(0, this.field1517);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field1506[var16];
            class501 var18 = new class501(var17);
            var18.field6892 = 1;
            int var19 = var18.method2845(-1);
            class44 var20 = null;
            for (class44 var21 = (class44) var12.method1436(28964); var21 != null; var21 = (class44) var12.method1443((byte) 6)) {
                if (var21.field529 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class648 var22 = class181.field2622;
                synchronized (class181.field2622) {
                    var20 = new class44(var19, class181.field2622.method3632(true, var19));
                }
                var12.method1441(var20, 0);
            }
            this.field1510[var15[var16]] = new class179(var17, var20);
        }
        this.field1506 = null;
        return true;
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(BI)Z")
    public final boolean method788(byte arg0, int arg1) {
        field1515++;
        return arg0 <= 114 ? false : this.field1510[arg1].field2585;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method789(int arg0, String arg1, int arg2) {
        field1509++;
        if (arg0 == arg2) {
            class334.field4506 = class166.method1169(-112, class366.field4875.field9347 * 2, 0, class611.field8473, class345.field4629, class605.field8413);
            if (arg1 != null) {
                class334.field4506.method101(0);
                class283 var3 = class43.method368(0, arg2 - 91, class392.field5549, class55.field627);
                class417 var4 = class334.field4506.method129(var3, class168.method1186(class508.field6961, class392.field5549, 0), true);
                class148.method1084(~arg2);
                class124.method890(arg1, var4, arg2 - 1, true, class334.field4506, var3);
            }
        } else {
            class166 var5 = null;
            if (arg1 != null) {
                var5 = class166.method1169(arg2 ^ 0x53, 0, 0, class611.field8473, class345.field4629, class605.field8413);
                var5.method101(0);
                class283 var6 = class43.method368(0, -109, class392.field5549, class55.field627);
                class417 var7 = var5.method129(var6, class168.method1186(class508.field6961, class392.field5549, 0), true);
                class148.method1084(-1);
                class124.method890(arg1, var7, arg2 - 1, true, var5, var6);
            }
            try {
                class334.field4506 = class166.method1169(arg2 + 86, class366.field4875.field9347 * 2, arg0, class611.field8473, class345.field4629, class605.field8413);
                if (arg1 != null) {
                    var5.method101(0);
                    class283 var8 = class43.method368(0, -46, class392.field5549, class55.field627);
                    class417 var9 = var5.method129(var8, class168.method1186(class508.field6961, class392.field5549, 0), true);
                    class148.method1084(-1);
                    class124.method890(arg1, var9, arg2 - 1, true, var5, var8);
                }
                if (class334.field4506.method107()) {
                    boolean var10 = true;
                    try {
                        var10 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var13) {
                    }
                    class493 var11;
                    if (var10) {
                        var11 = class334.field4506.method185(146800640);
                    } else {
                        var11 = class334.field4506.method185(104857600);
                    }
                    class334.field4506.method111(var11);
                }
            } catch (Throwable var14) {
                arg0 = 0;
                class334.field4506 = class166.method1169(99, 0, 0, class611.field8473, class345.field4629, class605.field8413);
            }
            if (var5 != null) {
                try {
                    var5.method1168(arg2 ^ 0x44);
                } catch (Throwable var12) {
                }
            }
        }
        class503.field6917 = arg0;
        class137.method962(15124);
        class334.field4506.method139(32);
        class250.field3403 = class334.field4506.method168();
        class524.field7112 = class334.field4506.method168();
        class114.method821((byte) 108);
        class334.field4506.method99(!class366.field4875.field9371);
        if (class334.field4506.method189()) {
            class631.method3537(class366.field4875.field9340, -41);
        }
        class317.method1918(120, class257.field3508 >> 3, class334.field4506, class401.field5620 >> 3);
        class127.method906(4096);
        class186.field2709 = false;
        class399.field5604 = true;
        class339.field4546 = null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IB[F)[F")
    public static final float[] method790(int arg0, byte arg1, float[] arg2) {
        field1511++;
        if (arg1 < 111) {
            return null;
        } else {
            float[] var3 = new float[arg0];
            class359.method2055(arg2, 0, var3, 0, arg0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "(I)V")
    public static void method791(int arg0) {
        if (arg0 != 2) {
            field1513 = 87;
        }
        field1504 = null;
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(I)V")
    public class109(int arg0) {
        this.field1517 = arg0;
    }
}
