import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class559 implements Runnable {

    @OriginalMember(owner = "client!po", name = "c", descriptor = "[Luu;")
    public volatile class289[] field7353 = new class289[2];

    @OriginalMember(owner = "client!po", name = "g", descriptor = "Z")
    public volatile boolean field7357 = false;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "Z")
    public volatile boolean field7352 = false;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "Lkaa;")
    public static class47 field7355 = new class47(71, 8);

    @OriginalMember(owner = "client!po", name = "j", descriptor = "F")
    public static float field7360 = 0.25F;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field7351;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "Lkk;")
    public class192 field7359;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIZ)V", line = 9)
    public static final void method3108(int arg0, int arg1, int arg2, boolean arg3) {
        field7356++;
        if (arg3) {
            method3108(-77, 90, 57, true);
        }
        String var4 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
        System.out.println(var4);
        class195.method1331(arg3, true, false, var4);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 24)
    public static void method3109(int arg0) {
        field7355 = null;
        if (arg0 != -3) {
            method3109(126);
        }
    }

    @OriginalMember(owner = "client!po", name = "run", descriptor = "()V", line = 34)
    public final void run() {
        field7354++;
        this.field7352 = true;
        try {
            while (!this.field7357) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class289 var2 = this.field7353[var1];
                    if (var2 != null) {
                        var2.method1795(0);
                    }
                }
                class226.method1447((byte) -124, 10L);
                class29.method259(this.field7359, 0, null);
            }
        } catch (Exception var9) {
            class135.method1056(null, var9, 1);
        } finally {
            Object var6 = null;
            this.field7352 = false;
        }
    }
}
