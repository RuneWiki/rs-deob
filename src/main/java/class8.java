import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class8 extends class265 implements Runnable {

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "Z")
    private boolean field81 = true;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public int field74 = -1;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "Lae;")
    private class29 field80;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "Lpi;")
    public static class340 field75 = new class340(36, 12);

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "F")
    public static float field86;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "[[[B")
    public static byte[][][] field76;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
    public static final void method53(boolean arg0) {
        if (arg0) {
            return;
        }
        field85++;
        class505.field7429 = new class114(8);
        class78.field997 = 0;
        for (class330 var1 = (class330) class287.field3663.method2122(0); var1 != null; var1 = (class330) class287.field3663.method2129(-121)) {
            var1.method1965();
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLvo;)V")
    public static final void method54(byte arg0, class350 arg1) {
        class188.field2463 = arg1;
        if (arg0 > 77) {
            field78++;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V")
    public static void method55(boolean arg0) {
        field75 = null;
        if (arg0) {
            method53(false);
        }
        field76 = null;
    }

    @OriginalMember(owner = "client!qk", name = "run", descriptor = "()V")
    public final void run() {
        field83++;
        while (this.field81) {
            this.field80.method195((byte) 118, this);
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
    public final void method56(int arg0) {
        (new Thread(this, "a")).start();
        field84++;
        if (arg0 != 30635) {
            method54((byte) 30, null);
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lae;)V")
    public class8(class29 arg0) {
        this.field80 = arg0;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Lce;")
    public static final class325 method57(byte arg0) {
        if (arg0 < 27) {
            method57((byte) 4);
        }
        field77++;
        return class230.field2945;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
    public final void method58(int arg0) {
        if (arg0 < -74) {
            field79++;
            this.field81 = false;
        }
    }
}
