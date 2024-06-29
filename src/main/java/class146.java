import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class146 implements Runnable {

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Z")
    public boolean field2592 = true;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Ljava/lang/Object;")
    public Object field2595 = new Object();

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public int field2596 = 0;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "[I")
    public int[] field2598 = new int[500];

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "[I")
    public int[] field2597 = new int[500];

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Loa;")
    public static class99 field2586 = null;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "[I")
    public static int[] field2591 = new int[256];

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Loa;")
    private static class99 field2593 = class221.method1463(2844, " from your ignore list first)3");

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Loa;")
    public static class99 field2587 = field2593;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Loa;")
    public static class99 field2590 = class221.method1463(2844, "Impossible de trouver ");

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Loa;")
    public static class99 field2581 = class221.method1463(2844, " est d-Bj-9 dans votre liste d(Wamis)3");

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "[Lw;")
    public static class144[] field2588;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static final void method992(byte arg0) {
        class248.field4269.method1812(-116);
        field2589++;
        if (arg0 != -80) {
            field2593 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "run", descriptor = "()V")
    public final void run() {
        field2583++;
        while (this.field2592) {
            Object var1 = this.field2595;
            synchronized (this.field2595) {
                if (this.field2596 < 500) {
                    this.field2597[this.field2596] = class172.field3054;
                    this.field2598[this.field2596] = class38.field656;
                    this.field2596++;
                }
            }
            class100.method711(0, 50L);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method993(int arg0) {
        if (arg0 != 500) {
            return;
        }
        field2581 = null;
        field2588 = null;
        field2586 = null;
        field2590 = null;
        field2587 = null;
        field2593 = null;
        field2591 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method994(int arg0, String arg1) {
        if (arg0 == 2) {
            System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
            field2585++;
            System.exit(1);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)Lte;")
    public static final class77 method995(int arg0, int arg1, int arg2) {
        class216 var3 = class128.field2236[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3748; var4++) {
            class77 var5 = var3.field3743[var4];
            if ((var5.field1372 >> 29 & 0x3L) == 2L && var5.field1362 == arg1 && var5.field1357 == arg2) {
                class19.method115(var5);
                return var5;
            }
        }
        return null;
    }
}
