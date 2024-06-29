import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public abstract class class171 {

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "[Lbc;")
    public static class225[] field2487 = new class225[5];

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "Lvp;")
    public static class112 field2489;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2490;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "[I")
    public static int[] field2491;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lnp;IJ)V")
    public static final void method1057(class313 arg0, int arg1, long arg2) {
        class408.field5737 = class382.field5451;
        class81.field991 = 0;
        field2486++;
        class382.field5451 = arg1;
        long var4 = class433.method2562(arg1 - 2039);
        for (class97 var6 = (class97) class460.field6451.method1449(arg1 ^ 0x6F); var6 != null; var6 = (class97) class460.field6451.method1450(0)) {
            if (var6.method549(arg0, arg2)) {
                class81.field991++;
            }
        }
        if (class335.field4877 && arg2 % 100L == 0L) {
            System.out.println("Particle system count: " + class460.field6451.method1448(0) + ", running: " + class81.field991 + ". Particles: " + class382.field5451 + ". Time taken: " + (class433.method2562(arg1 ^ 0xFFFFF809) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;ZC)I")
    public static final int method1058(String arg0, boolean arg1, char arg2) {
        field2485++;
        int var3 = 0;
        int var4 = arg0.length();
        if (!arg1) {
            method1057((class313) null, -19, -88L);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg2) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILbj;)I")
    public static final int method1059(int arg0, class146 arg1) {
        field2488++;
        if (arg1.field2123 == 0) {
            return 0;
        } else if (arg0 >= -95) {
            return 2;
        } else {
            if (arg1.field2125 != -1) {
                class146 var2 = null;
                if (arg1.field2125 < 32768) {
                    var2 = class139.field1851[arg1.field2125];
                } else if (arg1.field2125 >= 32768) {
                    var2 = class124.field1559[arg1.field2125 - 32768];
                }
                if (var2 != null) {
                    int var3 = arg1.field4331 - var2.field4331;
                    int var4 = arg1.field4317 - var2.field4317;
                    if (var3 != 0 || var4 != 0) {
                        arg1.method919((byte) -117, (int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF);
                    }
                }
            }
            if (arg1 instanceof class452) {
                class452 var5 = (class452) arg1;
                if (var5.field6252 != -1 && (var5.field2168 == 0 || var5.field2162 > 0)) {
                    var5.method919((byte) 84, var5.field6252);
                    var5.field6252 = -1;
                }
            } else if (arg1 instanceof class216) {
                class216 var6 = (class216) arg1;
                if (var6.field3246 != -1 && (var6.field2168 == 0 || var6.field2162 > 0)) {
                    int var7 = var6.field4331 - ((var6.field3246 - class240.field3602 - class240.field3602) * 64);
                    int var8 = var6.field4317 - ((var6.field3235 - class360.field5180 - class360.field5180) * 64);
                    if (var7 != 0 || var8 != 0) {
                        var6.method919((byte) 83, (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF);
                    }
                    var6.field3246 = -1;
                }
            }
            return arg1.method925((byte) -98);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
    public static void method1060(byte arg0) {
        int var1 = 21 / ((arg0 + 45) / 40);
        field2489 = null;
        field2491 = null;
        field2490 = null;
        field2487 = null;
    }

    static {
        for (int var0 = 0; var0 < field2487.length; var0++) {
            field2487[var0] = new class225();
        }
        field2489 = new class112("", 15);
        field2490 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
    }
}
