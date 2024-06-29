import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class261 implements Runnable {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "[Lwj;")
    public volatile class6[] field4691 = new class6[2];

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Z")
    public volatile boolean field4692 = false;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Z")
    public volatile boolean field4690 = false;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Lsg;")
    public static class162 field4693 = new class162();

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Lla;")
    public static class95 field4699 = new class95(5);

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field4700 = 0;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Lw;")
    public class143 field4694;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "[Lal;")
    public static class231[] field4697;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method1803(int arg0) {
        field4697 = null;
        field4693 = null;
        field4699 = null;
        if (arg0 < 81) {
            method1803(59);
        }
    }

    @OriginalMember(owner = "client!sa", name = "run", descriptor = "()V")
    public final void run() {
        field4696++;
        this.field4690 = true;
        try {
            while (!this.field4692) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class6 var2 = this.field4691[var1];
                    if (var2 != null) {
                        var2.method54((byte) 122);
                    }
                }
                class174.method1196((byte) 120, 10L);
                class288.method1937((byte) -98, (Object) null, this.field4694);
            }
        } catch (Exception var9) {
            class78.method548((byte) -17, (String) null, var9);
        } finally {
            Object var6 = null;
            this.field4690 = false;
        }
    }
}
