import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class208 {

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "[Llo;")
    public static class449[] field2811 = new class449[14];

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lve;")
    public static class291 field2813;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lke;I)V", line = 3)
    public static final void method1355(class354 arg0, int arg1) {
        field2810++;
        if (arg1 != 0) {
            return;
        }
        class398 var2 = (class398) class307.field4212.method1412((byte) -54, (long) arg0.field862);
        if (var2 == null) {
            class386.method2523(arg0.field944[0], -30107, (class437) null, class265.field3617, 0, (class369) null, arg0.field956[0], arg0);
        } else {
            var2.method2572(-16449);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Laa;JB)V", line = 22)
    public static final void method1356(class281 arg0, long arg1, byte arg2) {
        class218.field2878 = 0;
        field2812++;
        class267.field3643 = class398.field5825;
        if (arg2 > -96) {
            method1356((class281) null, -91L, (byte) 99);
        }
        class398.field5825 = 0;
        long var4 = class224.method1425(-26805);
        for (class147 var6 = (class147) class196.field2721.method2307(false); var6 != null; var6 = (class147) class196.field2721.method2311(-5116)) {
            if (var6.method1008(arg0, arg1)) {
                class218.field2878++;
            }
        }
        if (class146.field2125 && (arg1 % 100L) == 0L) {
            System.out.println("Particle system count: " + class196.field2721.method2313(53) + ", running: " + class218.field2878 + ". Particles: " + class398.field5825 + ". Time taken: " + (class224.method1425(-26805) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 69)
    public static void method1357(int arg0) {
        if (arg0 != 100) {
            method1355((class354) null, 121);
        }
        field2813 = null;
        field2811 = null;
    }
}
