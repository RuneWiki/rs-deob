import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class791 {

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "Lre;")
    public static class323 field10838 = new class323();

    @OriginalMember(owner = "client!tea", name = "o", descriptor = "I")
    public static int field10844 = 1;

    @OriginalMember(owner = "client!tea", name = "q", descriptor = "I")
    public static int field10846 = 0;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
    public int field10830;

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
    public int field10831;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
    public int field10832;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
    public int field10833;

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
    public int field10834;

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
    public int field10835;

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "I")
    public int field10836;

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "I")
    public static int field10837;

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "I")
    public int field10839;

    @OriginalMember(owner = "client!tea", name = "k", descriptor = "I")
    public int field10840;

    @OriginalMember(owner = "client!tea", name = "l", descriptor = "I")
    public int field10841;

    @OriginalMember(owner = "client!tea", name = "m", descriptor = "I")
    public static int field10842;

    @OriginalMember(owner = "client!tea", name = "n", descriptor = "I")
    public int field10843;

    @OriginalMember(owner = "client!tea", name = "p", descriptor = "I")
    public int field10845;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)V")
    public static void method4330(byte arg0) {
        field10838 = null;
        if (arg0 >= -12) {
            field10844 = -119;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(BLha;J)V")
    public static final void method4331(byte arg0, class473 arg1, long arg2) {
        class156.field2034 = 0;
        class656.field9262 = 0;
        class184.field2299 = class55.field653;
        field10837++;
        class55.field653 = 0;
        long var4 = class683.method3903((byte) 4);
        for (class388 var6 = (class388) class361.field5207.method3103((byte) 72); var6 != null; var6 = (class388) class361.field5207.method3104(-10964)) {
            if (var6.method2399(arg1, arg2)) {
                class156.field2034++;
            }
        }
        if (arg0 >= -7) {
            method4330((byte) 54);
        }
        if (class300.field4359 && arg2 % 100L == 0L) {
            System.out.println("Particle system count: " + class361.field5207.method3099(0) + ", running: " + class156.field2034);
            System.out.println("Emitters: " + class656.field9262 + " Particles: " + class55.field653 + ". Time taken: " + (class683.method3903((byte) 4) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILtea;)Z")
    public final boolean method4332(int arg0, class791 arg1) {
        int var3 = -86 % ((arg0 + 31) / 45);
        field10842++;
        return this.field10834 == arg1.field10834 && this.field10841 == arg1.field10841 && this.field10836 == arg1.field10836;
    }
}
