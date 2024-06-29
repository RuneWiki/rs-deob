import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class626 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[I")
    public static int[] field8420 = new int[1];

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field8422;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field8423;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public int field8424;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public int field8425;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public int field8426;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(JILha;)V")
    public static final void method3525(long arg0, int arg1, class548 arg2) {
        field8422++;
        class602.field8144 = class331.field4700;
        class549.field7637 = 0;
        class223.field3011 = 0;
        class331.field4700 = 0;
        long var4 = class97.method664((byte) -50);
        for (class689 var6 = (class689) client.field6236.method1638(false); var6 != null; var6 = (class689) client.field6236.method1645(0)) {
            if (var6.method3893(arg2, arg0)) {
                class549.field7637++;
            }
        }
        if (class439.field6125 && (arg0 % 100L) == 0L) {
            System.out.println("Particle system count: " + client.field6236.method1639((byte) 109) + ", running: " + class549.field7637);
            System.out.println("Emitters: " + class223.field3011 + " Particles: " + class331.field4700 + ". Time taken: " + (class97.method664((byte) -50) - var4) + "ms");
        }
        if (arg1 > -17) {
            method3525(-122L, -128, null);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method3526(byte arg0) {
        field8420 = null;
        int var1 = -36 % ((arg0 + 40) / 36);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Luu;I)V")
    public static final void method3527(class237 arg0, int arg1) {
        if (arg1 != -22694) {
            method3527(null, 96);
        }
        field8421++;
        class238.field3542 = arg0;
    }
}
