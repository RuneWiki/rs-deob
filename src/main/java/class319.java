import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class319 {

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public int field4502 = 0;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "[I")
    public static int[] field4501 = new int[16384];

    @OriginalMember(owner = "client!og", name = "f", descriptor = "[I")
    public static int[] field4504 = new int[16384];

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Lrc;")
    public static class108 field4506;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method2028(int arg0) {
        field4504 = null;
        field4506 = null;
        field4501 = null;
        int var1 = -113 / ((arg0 - 8) / 45);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(JI)V")
    public static final void method2029(long arg0, int arg1) {
        field4505++;
        int var3 = class262.field3781.field4537 + class37.field396;
        int var4 = class243.field3534 + class262.field3781.field4530;
        if ((class279.field4006 - var3) < -500 || (class279.field4006 - var3) > 500 || (class108.field1520 - var4) < -500 || class108.field1520 - var4 > 500) {
            class108.field1520 = var4;
            class279.field4006 = var3;
        }
        if (arg1 != -1) {
            method2028(-39);
        }
        if (class279.field4006 != var3) {
            int var5 = var3 - class279.field4006;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class279.field4006 += var6;
        }
        if (class108.field1520 != var4) {
            int var7 = var4 - class108.field1520;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class108.field1520 += var8;
        }
        if (!class165.field2399) {
            class91.field1281 += (float) arg0 * class95.field1340 / 6.0F;
            class421.field5826 += (float) arg0 * class301.field4259 / 6.0F;
        }
        class141.method1020(-101);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBLkk;)V")
    private final void method2030(int arg0, byte arg1, class161 arg2) {
        field4499++;
        if (arg1 != -75) {
            field4507 = 45;
        }
        if (arg0 == 5) {
            this.field4502 = arg2.method1134(arg1 ^ 0x4185);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lkk;I)V")
    public final void method2031(class161 arg0, int arg1) {
        if (arg1 != -10764) {
            field4507 = -6;
        }
        while (true) {
            int var3 = arg0.method1172((byte) -107);
            if (var3 == 0) {
                field4503++;
                return;
            }
            this.method2030(var3, (byte) -75, arg0);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIB)V")
    public static final void method2032(int arg0, int arg1, byte arg2) {
        field4500++;
        class334 var3 = class352.method2172(arg1, 6, 16711935);
        var3.method2104(arg2 + 78);
        var3.field4648 = arg0;
        if (arg2 != -78) {
            method2028(-93);
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4501[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field4504[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field4507 = -1;
        field4506 = new class108(91, 7);
    }
}
