import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class363 implements Runnable {

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "[Lil;")
    public volatile class42[] field5338 = new class42[2];

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "Z")
    public volatile boolean field5341 = false;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "Z")
    public volatile boolean field5346 = false;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field5340 = 0;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Lnn;")
    public static class151 field5336 = new class151("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "[I")
    public static int[] field5349 = new int[32];

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Lsc;")
    public class239 field5342;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZB)V")
    public static final void method2180(int arg0, boolean arg1, byte arg2) {
        class45.field562 = new byte[arg0][class115.field1522][class198.field3004];
        class269.field4087 = new int[class198.field3004];
        class145.field1943 = new int[class198.field3004];
        if (!arg1) {
            class210.field3161 = null;
        }
        class137.field1861 = new int[class198.field3004];
        class396.field5922 = 99;
        class449.field6614 = new byte[arg0][class115.field1522][class198.field3004];
        field5343++;
        class212.field3196 = new int[5];
        class221.field3372 = new byte[arg0][class115.field1522][class198.field3004];
        class68.field874 = new int[class198.field3004];
        class289.field4390 = new int[class198.field3004];
        if (arg2 == 69) {
            class355.field5243 = new int[arg0][class115.field1522 + 1][class198.field3004 + 1];
            class14.field172 = new byte[arg0][class115.field1522][class198.field3004];
            class354.field5235 = new byte[arg0][class115.field1522 + 1][class198.field3004 + 1];
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static void method2181(int arg0) {
        field5349 = null;
        if (arg0 != 1) {
            method2181(-30);
        }
        field5336 = null;
    }

    @OriginalMember(owner = "client!oj", name = "run", descriptor = "()V")
    public final void run() {
        this.field5346 = true;
        field5347++;
        try {
            while (!this.field5341) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class42 var2 = this.field5338[var1];
                    if (var2 != null) {
                        var2.method246(0);
                    }
                }
                class109.method674((byte) 99, 10L);
                method2182((byte) 117, (Object) null, this.field5342);
            }
        } catch (Exception var9) {
            class288.method1783((String) null, var9, 20);
        } finally {
            Object var6 = null;
            this.field5346 = false;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLjava/lang/Object;Lsc;)V")
    public static final void method2182(byte arg0, Object arg1, class239 arg2) {
        field5345++;
        if (arg2.field3573 == null) {
            return;
        }
        int var3 = 0;
        int var4 = -47 % ((77 - arg0) / 37);
        while (var3 < 50 && arg2.field3573.peekEvent() != null) {
            class109.method674((byte) 99, 1L);
            var3++;
        }
        if (arg1 != null) {
            arg2.field3573.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field5349[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
