import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class106 implements Runnable {

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "[Lkn;")
    public volatile class199[] field1834 = new class199[2];

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "Z")
    public volatile boolean field1842 = false;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Z")
    public volatile boolean field1840 = false;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Z")
    public static boolean field1832 = false;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "Lsf;")
    public static class108 field1836 = class140.method973(255, "Atteindre");

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Lla;")
    public class139 field1838;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "[Ltc;")
    public static class41[] field1837;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "[[I")
    public static int[][] field1839;

    @OriginalMember(owner = "client!ji", name = "run", descriptor = "()V", line = 14)
    public final void run() {
        field1841++;
        this.field1840 = true;
        try {
            while (!this.field1842) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class199 var2 = this.field1834[var1];
                    if (var2 != null) {
                        var2.method1408(115);
                    }
                }
                class83.method556(10L, 127);
                class194.method1386(this.field1838, (Object) null, -92);
            }
        } catch (Exception var7) {
            class171.method1188(64, (String) null, var7);
        } finally {
            this.field1840 = false;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 49)
    public static final void method724(int arg0) {
        class99.field1750.method639(-122);
        if (arg0 != -30221) {
            method724(-111);
        }
        field1835++;
        class145.field2598.method639(arg0 ^ 0x763D);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V", line = 80)
    public static void method725(int arg0) {
        field1837 = null;
        if (arg0 == 7262) {
            field1839 = (int[][]) null;
            field1836 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZIII)V", line = 96)
    public static final void method726(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1833++;
        class256.field4471.field4314 = 0;
        class256.field4471.method1759(-32768, 25);
        class256.field4471.method1759(-32768, arg0);
        if (!arg1) {
            method726(-86, true, -26, 26, -110);
        }
        class256.field4471.method1759(-32768, arg2);
        class256.field4471.method1724(false, arg3);
        class256.field4471.method1724(!arg1, arg4);
        class98.field1603 = 0;
        class287.field5022 = 1;
        class15.field196 = -3;
        class1.field26 = 0;
    }
}
