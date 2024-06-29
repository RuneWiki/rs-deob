import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class99 {

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public int field2458;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public int field2459;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public int field2453;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lic;")
    public static class59 field2450 = class59.method433(0, "Hier wechseln");

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2454 = 0;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Lic;")
    private static class59 field2457 = class59.method433(0, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Lic;")
    public static class59 field2462 = field2457;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "[Lmd;")
    public static class87[] field2451 = new class87[256];

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Lic;")
    public static class59 field2460 = class59.method433(0, "mn");

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "Ljava/awt/Image;")
    public static Image field2461;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "[Laa;")
    public static class2[] field2463;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
    public static final void method804(int arg0, int arg1) {
        field2456++;
        if (arg1 == -1 || !class114.method923(arg1, (byte) -128)) {
            return;
        }
        if (arg0 < 88) {
            field2457 = null;
        }
        class159[] var2 = class46.field1173[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class159 var4 = var2[var3];
            if (var4.field3657 != null) {
                class139 var5 = new class139();
                var5.field3104 = var4;
                var5.field3096 = var4.field3657;
                class125.method948(var5, -30164);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lrf;I)V")
    public static final void method805(class124 arg0, int arg1) {
        if (arg1 != 15613) {
            return;
        }
        if (arg0.field2792 != null) {
            arg0.field2792.field1258 = 0;
        }
        arg0.field2794 = false;
        for (class124 var2 = arg0.method470(); var2 != null; var2 = arg0.method467()) {
            method805(var2, 15613);
        }
        field2449++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
    public static void method806(boolean arg0) {
        field2461 = null;
        if (!arg0) {
            field2454 = 41;
        }
        field2450 = null;
        field2462 = null;
        field2457 = null;
        field2460 = null;
        field2463 = null;
        field2451 = null;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class99() {
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lob;)V")
    public class99(class99 arg0) {
        this.field2458 = arg0.field2458;
        this.field2459 = arg0.field2459;
        this.field2453 = arg0.field2453;
        this.field2455 = arg0.field2455;
    }
}
