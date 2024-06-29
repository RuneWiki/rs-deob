import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class47 implements Runnable {

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "[Lr;")
    public volatile class39[] field829 = new class39[2];

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "Z")
    public volatile boolean field835 = false;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Z")
    public volatile boolean field821 = false;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Ljd;")
    public static class85 field825 = class221.method1499("", (byte) -77);

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field826 = 0;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Ljd;")
    private static class85 field827 = class221.method1499("Loading textures )2 ", (byte) -46);

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Ljd;")
    public static class85 field824 = class221.method1499("Benutzeroberfl-=che geladen)3", (byte) 113);

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "Ljd;")
    public static class85 field831 = class221.method1499("<br>", (byte) -44);

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "Ljd;")
    public static class85 field828 = field827;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field832 = -1;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "Ljd;")
    public static class85 field834 = class221.method1499("weiss:", (byte) 90);

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "Ljb;")
    public static class255 field836 = null;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "Lb;")
    public class81 field830;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static final void method322(int arg0) {
        if (arg0 != -29493) {
            field826 = 64;
        }
        class246.field4200 = null;
        class30.field443 = null;
        class244.field4165 = null;
        class2.field20 = null;
        field822++;
        class121.field2134 = null;
        class178.field3060 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    public static void method323(byte arg0) {
        field825 = null;
        field834 = null;
        field824 = null;
        field831 = null;
        field827 = null;
        field836 = null;
        if (arg0 == 104) {
            field828 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "run", descriptor = "()V")
    public final void run() {
        field823++;
        this.field821 = true;
        try {
            while (!this.field835) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class39 var2 = this.field829[var1];
                    if (var2 != null) {
                        var2.method263(26595);
                    }
                }
                class190.method1311(10L, 1);
                class74.method526(this.field830, (Object) null, 86);
            }
        } catch (Exception var9) {
            class201.method1379(var9, (String) null, 2552);
        } finally {
            Object var6 = null;
            this.field821 = false;
        }
    }
}
