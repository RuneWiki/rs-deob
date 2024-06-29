import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class142 implements Runnable {

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "[Ldh;")
    public volatile class192[] field2081 = new class192[2];

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Z")
    public volatile boolean field2074 = false;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Z")
    public volatile boolean field2072 = false;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lhc;")
    public static class368 field2075 = new class368(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "Lka;")
    public static class408 field2082 = new class408(32);

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Lij;")
    public static class316 field2079;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Lne;")
    public class76 field2073;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method1034(int arg0) {
        field2082 = null;
        field2075 = null;
        if (arg0 != 26432) {
            field2075 = null;
        }
        field2079 = null;
    }

    @OriginalMember(owner = "client!cf", name = "run", descriptor = "()V")
    public final void run() {
        this.field2072 = true;
        field2077++;
        try {
            while (!this.field2074) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class192 var2 = this.field2081[var1];
                    if (var2 != null) {
                        var2.method1335(126);
                    }
                }
                class328.method1999(0, 10L);
                class229.method1499(this.field2073, (Object) null, 22);
            }
        } catch (Exception var9) {
            class48.method399((byte) 86, var9, (String) null);
        } finally {
            Object var6 = null;
            this.field2072 = false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)I")
    public static final int method1035(byte arg0) {
        field2076++;
        if (arg0 != 59) {
            field2082 = null;
        }
        return 15;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)I")
    public static final int method1036(int arg0, byte arg1) {
        if (arg1 == 71) {
            field2078++;
            return arg0 & 0x7F;
        } else {
            return -59;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
    public static final void method1037(boolean arg0) {
        class408 var1 = class118.field1797;
        synchronized (class118.field1797) {
            class118.field1797.method2522((byte) 105);
        }
        if (!arg0) {
            field2075 = null;
        }
        field2080++;
    }
}
