import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class506 implements class115 {

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "[F")
    public float[] field6764;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public int field6762;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public int field6766;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lhda;")
    public static class752 field6763 = new class752(101, 4);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Lpda;")
    public static final class630 method2842(byte arg0) {
        field6761++;
        if (class744.field10345 == null || class468.field6423 == null) {
            return null;
        }
        if (arg0 != -24) {
            field6765 = -10;
        }
        for (class630 var1 = (class630) class468.field6423.method4011((byte) -123); var1 != null; var1 = (class630) class468.field6423.method4011((byte) -120)) {
            class325 var2 = class744.field10338.method3192((byte) 81, var1.field8387);
            if (var2 != null && var2.field4609 && var2.method1968((byte) -14, class744.field10340)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII)Z")
    public static final boolean method2843(byte arg0, int arg1, int arg2) {
        field6760++;
        int var3 = 14 / ((arg0 - 73) / 36);
        return (arg2 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILkk;Ljava/lang/String;B)Ltj;")
    public static final class198 method2844(int arg0, class192 arg1, String arg2, byte arg3) {
        field6759++;
        if (arg0 == 0) {
            return arg1.method1308(arg2, -12903);
        } else if (arg0 == 1) {
            try {
                class124.method985("openjs", 82, new Object[] { (new URL(class514.field6818.getCodeBase(), arg2)).toString() }, class514.field6818);
                class198 var4 = new class198();
                var4.field2987 = 1;
                return var4;
            } catch (Throwable var11) {
                class198 var5 = new class198();
                var5.field2987 = 2;
                return var5;
            }
        } else {
            int var6 = -112 % ((arg3 + 62) / 58);
            if (arg0 == 2) {
                try {
                    class514.field6818.getAppletContext().showDocument(new URL(class514.field6818.getCodeBase(), arg2), "_blank");
                    class198 var7 = new class198();
                    var7.field2987 = 1;
                    return var7;
                } catch (Exception var12) {
                    class198 var8 = new class198();
                    var8.field2987 = 2;
                    return var8;
                }
            } else if (arg0 == 3) {
                try {
                    class124.method987("loggedout", -8364, class514.field6818);
                } catch (Throwable var14) {
                }
                try {
                    class514.field6818.getAppletContext().showDocument(new URL(class514.field6818.getCodeBase(), arg2), "_top");
                    class198 var9 = new class198();
                    var9.field2987 = 1;
                    return var9;
                } catch (Exception var13) {
                    class198 var10 = new class198();
                    var10.field2987 = 2;
                    return var10;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
    public static final void method2845(int arg0, int arg1, int arg2) {
        class701 var3 = class660.field8718[arg0][arg1][arg2];
        if (var3 != null) {
            class495.method2796(var3.field9738);
            if (var3.field9738 != null) {
                var3.field9738 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method2846(int arg0) {
        field6763 = null;
        if (arg0 != 1) {
            method2844(-11, null, null, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lkf;Z[[[BIB)Z")
    public static final boolean method2847(class256 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class430.field5926) {
            return false;
        }
        int var5 = arg0.field3505 >> class140.field2224;
        int var6 = var5;
        int var7 = arg0.field3502 >> class140.field2224;
        int var8 = var7;
        if (arg0 instanceof class675) {
            var6 = ((class675) arg0).field9361;
            var8 = ((class675) arg0).field9360;
            var5 = ((class675) arg0).field9367;
            var7 = ((class675) arg0).field9354;
        }
        for (int var9 = var5; var9 <= var6; var9++) {
            for (int var10 = var7; var10 <= var8; var10++) {
                if (arg0.field3515 < class225.field3201 && var9 >= class601.field7891 && var9 < class104.field1435 && var10 >= class675.field9363 && var10 < class78.field954) {
                    if ((arg2 == null || arg0.field3508 < arg3 || arg2[arg0.field3508][var9][var10] != arg4) && arg0.method1558(-107) && !arg0.method1560(class184.field2781, (byte) 35)) {
                        return false;
                    }
                    if (!arg1 && var9 >= class458.field6258 - 16 && var9 <= class458.field6258 + 16 && var10 >= class610.field8134 - 16 && var10 <= class610.field8134 + 16) {
                        if (class260.field3627) {
                            class289.field4110[class485.field6627++].method996(arg0, (byte) -104);
                            class485.field6627 %= class333.field4736;
                        } else {
                            arg0.method792(class184.field2781, (byte) 125);
                        }
                    }
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(II)V")
    public class506(int arg0, int arg1) {
        this.field6764 = new float[arg0 * arg1];
        this.field6762 = arg0;
        this.field6766 = arg1;
    }
}
