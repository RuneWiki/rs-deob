import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class406 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V", line = 6)
    public static final void method2361(int arg0, int arg1) {
        field5681++;
        class51 var2 = class703.method3938(arg1 ^ 0x896E00A5, arg0, arg1);
        var2.method404(80);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IJLr;)V", line = 18)
    public static final void method2362(int arg0, long arg1, class166 arg2) {
        field5680++;
        class319.field4375 = arg0;
        class565.field7822 = 0;
        class192.field2728 = class201.field2849;
        class201.field2849 = 0;
        long var4 = class577.method3295((byte) 15);
        for (class646 var6 = (class646) class589.field8271.method3898((byte) -87); var6 != null; var6 = (class646) class589.field8271.method3902(true)) {
            if (var6.method3608(arg2, arg1)) {
                class565.field7822++;
            }
        }
        if (class206.field2902 && arg1 % 100L == 0L) {
            System.out.println("Particle system count: " + class589.field8271.method3903((byte) -58) + ", running: " + class565.field7822);
            System.out.println("Emitters: " + class319.field4375 + " Particles: " + class201.field2849 + ". Time taken: " + (class577.method3295((byte) 15) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILi;)V", line = 53)
    public static final void method2363(int arg0, class37 arg1) {
        class409.field5812[arg0] = arg1;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V", line = 59)
    public static final void method2364(boolean arg0) {
        class193.field2746.method3755(19713);
        if (!arg0) {
            field5679++;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 70)
    public static final void method2365(int arg0) {
        field5682++;
        if (class603.field8404 == class547.field7412) {
            return;
        }
        try {
            if (arg0 == 25919) {
                class204.method1329((byte) -57, class647.field8937, "tbrefresh");
            }
        } catch (Throwable var1) {
        }
    }
}
