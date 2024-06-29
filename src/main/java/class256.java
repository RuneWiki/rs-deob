import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class256 implements Runnable {

    @OriginalMember(owner = "client!c", name = "d", descriptor = "[Lde;")
    public volatile class50[] field4512 = new class50[2];

    @OriginalMember(owner = "client!c", name = "i", descriptor = "Z")
    public volatile boolean field4517 = false;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Z")
    public volatile boolean field4522 = false;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "[I")
    public static int[] field4509 = new int[100];

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Lsg;")
    public static class30 field4514 = class167.method1221((byte) 33, "Loaded titlescreen)3");

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Ldl;")
    public static class31 field4516 = null;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "S")
    public static short field4521 = 320;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field4511 = -1;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "B")
    public static byte field4515;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Ldl;")
    public static class31 field4523;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lbi;")
    public class66 field4518;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V")
    public static final void method1776(int arg0, int arg1) {
        class195 var2 = class71.field1613[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class195 var4 = class71.field1613[var3][arg0][arg1] = class71.field1613[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3539--;
                for (int var5 = 0; var5 < var4.field3522; var5++) {
                    class35 var6 = var4.field3540[var5];
                    if ((var6.field863 >> 29 & 0x3L) == 2L && var6.field854 == arg0 && var6.field856 == arg1) {
                        var6.field864--;
                    }
                }
            }
        }
        if (class71.field1613[0][arg0][arg1] == null) {
            class71.field1613[0][arg0][arg1] = new class195(0, arg0, arg1);
        }
        class71.field1613[0][arg0][arg1].field3524 = var2;
        class71.field1613[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static final void method1777(byte arg0) {
        field4519++;
        class35.field858.method1652(-8259);
        if (arg0 > -32) {
            method1778(3);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method1778(int arg0) {
        field4516 = null;
        if (arg0 != 19224) {
            method1776(-122, 59);
        }
        field4523 = null;
        field4509 = null;
        field4514 = null;
    }

    @OriginalMember(owner = "client!c", name = "run", descriptor = "()V")
    public final void run() {
        this.field4522 = true;
        try {
            while (!this.field4517) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field4512[var1];
                    if (var2 != null) {
                        var2.method490(256);
                    }
                }
                class160.method1191(10L, 0);
                class65.method587((Object) null, 110, this.field4518);
            }
        } catch (Exception var9) {
            class93.method751(var9, (String) null, -24);
        } finally {
            Object var6 = null;
            this.field4522 = false;
        }
        field4510++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method1779(int arg0, Random arg1, int arg2) {
        if (arg0 <= 118) {
            field4515 = 122;
        }
        field4513++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class238.method1692(0, arg2)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class99.method813(var4, -1, arg2);
        }
    }
}
