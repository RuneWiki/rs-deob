import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class105 {

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Z")
    public boolean field2540 = true;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public int field2560;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public int field2554;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public int field2537;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public int field2553;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public int field2555;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public int field2543;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field2538 = -1;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field2544 = 2;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lwb;")
    public static class130 field2539 = class26.method212("(U", -32376);

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field2542 = 0;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "[Lwb;")
    public static class130[] field2546 = new class130[500];

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "Lwb;")
    private static class130 field2551 = class26.method212("Prepared visibility map", -32376);

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "[Lje;")
    public static class59[] field2550 = new class59[2048];

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "Lwb;")
    private static class130 field2552 = class26.method212("Error connecting to server)3", -32376);

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "Lwb;")
    public static class130 field2559 = field2552;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "Lwb;")
    public static class130 field2557 = class26.method212("auf einer freien Welt zu spielen)3", -32376);

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field2558 = 0;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Lwb;")
    public static class130 field2545 = field2551;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Lda;")
    public static class20 field2548;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "[I")
    public static int[] field2536;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "[[Lab;")
    public static class3[][] field2549;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 13)
    public static final void method796(int arg0) {
        field2556++;
        if (!class4.field165) {
            return;
        }
        class32.field897 = null;
        class79.field1911 = null;
        class52.field1369 = null;
        class75.field1871 = null;
        class32.field896 = null;
        class106.field2569 = null;
        class132.field3199 = null;
        class109.field2640 = null;
        class109.field2634 = null;
        class61.field1589 = null;
        if (arg0 != 0) {
            method796(18);
        }
        class30.field849 = null;
        class3.field144 = null;
        class98.field2375 = null;
        class60.field1539 = null;
        class43.field1185 = null;
        class117.field2894 = null;
        class59.field1497 = null;
        class75.field1882 = null;
        class18.field506 = null;
        class17.field465 = null;
        class4.field165 = false;
        class20.field586 = null;
        class96.field2333 = null;
        class26.field738 = null;
        class21.field621 = null;
        class56.field1442 = null;
        class97.field2350 = null;
        class112.field2751 = null;
        class52.field1357 = null;
        class97.field2337 = null;
        class83.field1955 = null;
        class93.field2222 = null;
        class35.field1013 = null;
        class129.field3044 = null;
        class119.field2919 = null;
        class112.field2762 = null;
        class48.field1279 = null;
        class8.field273 = null;
        class2.field49 = null;
        field2548 = null;
        class7.field256 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIIIZ)V", line = 166)
    public class105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2540 = arg6;
        this.field2560 = arg0;
        this.field2554 = arg1;
        this.field2537 = arg4;
        this.field2553 = arg3;
        this.field2555 = arg2;
        this.field2543 = arg5;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V", line = 117)
    public static void method797(boolean arg0) {
        field2536 = null;
        field2552 = null;
        field2557 = null;
        field2539 = null;
        field2548 = null;
        field2549 = null;
        field2550 = null;
        field2559 = null;
        field2551 = null;
        if (!arg0) {
            method796(-101);
        }
        field2545 = null;
        field2546 = null;
    }
}
