import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class665 {

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "Lfh;")
    public static class266 field9378 = new class266(1, 3);

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "Z")
    public static boolean field9381 = false;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field9382;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V", line = 12)
    public static void method3740(byte arg0) {
        if (arg0 > 82) {
            field9378 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V", line = 23)
    public static final void method3741(int arg0) {
        if (arg0 > -106) {
            return;
        }
        field9379++;
        class450 var1 = class190.field2377;
        synchronized (class190.field2377) {
            class190.field2377.method2406(18385);
        }
        class450 var2 = class19.field290;
        synchronized (class19.field290) {
            class19.field290.method2406(18385);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lr;JI)V", line = 47)
    public static final void method3742(class566 arg0, long arg1, int arg2) {
        class321.field4091 = class260.field3215;
        class273.field3443 = 0;
        field9380++;
        class426.field5342 = 0;
        if (arg2 != 27063) {
            field9378 = null;
        }
        class260.field3215 = 0;
        long var4 = class571.method3150(arg2 ^ 0x69D5);
        for (class93 var6 = (class93) class290.field3620.method802((byte) 109); var6 != null; var6 = (class93) class290.field3620.method800((byte) -106)) {
            if (var6.method532(arg0, arg1)) {
                class273.field3443++;
            }
        }
        if (class343.field4404 && arg1 % 100L == 0L) {
            System.out.println("Particle system count: " + class290.field3620.method804(0) + ", running: " + class273.field3443);
            System.out.println("Emitters: " + class426.field5342 + " Particles: " + class260.field3215 + ". Time taken: " + (class571.method3150(100) - var4) + "ms");
        }
    }
}
