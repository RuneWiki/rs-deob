import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class137 {

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public int field2617;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public int field2619;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public int field2613;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Ljd;")
    private static class86 field2607 = class122.method868("skill:", true);

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "[Z")
    public static boolean[] field2610 = new boolean[200];

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Ljd;")
    public static class86 field2608 = class122.method868("Lade Titelbild )2 ", true);

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "[I")
    public static int[] field2612 = new int[500];

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field2615 = 2;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field2618 = 2;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Ljd;")
    public static class86 field2614 = field2607;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Luk;")
    public static class96 field2609 = new class96(64);

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Lnh;")
    public static class53 field2622 = new class53(64);

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Z")
    public static boolean field2623 = false;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field2624 = 0;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIBI)V")
    public static final void method978(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg0 > arg2) {
            for (int var5 = arg2; var5 < arg0; var5++) {
                class249.field4420[var5][arg1] = arg4;
            }
        } else {
            for (int var6 = arg0; var6 < arg2; var6++) {
                class249.field4420[var6][arg1] = arg4;
            }
        }
        int var7 = 20 / ((arg3 + 43) / 56);
        field2620++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
    public abstract void method471(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lbj;I)V")
    public static final void method979(class151 arg0, int arg1) {
        field2616++;
        class93.field1884 = arg0.method1079(119, class33.field752);
        class132.field2505 = arg0.method1079(-128, class169.field3118);
        class78.field1531 = arg0.method1079(118, class256.field4548);
        class198.field3511 = arg0.method1079(105, class124.field2419);
        class5.field68 = arg0.method1079(108, class98.field1937);
        class273.field4797 = arg0.method1079(114, class178.field3226);
        class155.field2923 = arg0.method1079(-121, class22.field567);
        class107.field2068 = arg0.method1079(96, class260.field4651);
        class152.field2880 = arg0.method1079(124, class249.field4419);
        class246.field4377 = arg0.method1079(-76, class258.field4593);
        class203.field3672 = arg0.method1079(105, class213.field3855);
        class138.field2638 = arg0.method1079(-111, class205.field3707);
        class226.field4098 = arg0.method1079(-67, class270.field4751);
        class25.field607 = arg0.method1079(96, class119.field2341);
        class58.field1173 = arg0.method1079(112, class217.field3906);
        if (arg1 > 51) {
            class178.field3219 = arg0.method1079(123, class268.field4732);
            class54.field1095 = arg0.method1079(-95, class239.field4309);
            class155.field2929 = arg0.method1079(-100, class273.field4781);
            class179.field3239 = arg0.method1079(123, class61.field1209);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIB)V")
    public abstract void method467(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZII)V")
    public static final void method980(int arg0, boolean arg1, int arg2, int arg3) {
        field2611++;
        class161 var4 = class204.method1456(true, 9, arg3);
        if (!arg1) {
            var4.method1174(0);
            var4.field3016 = arg0;
            var4.field3027 = arg2;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(III)V")
    public abstract void method468(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method981(byte arg0) {
        field2608 = null;
        field2612 = null;
        if (arg0 >= -88) {
            field2623 = false;
        }
        field2614 = null;
        field2610 = null;
        field2609 = null;
        field2622 = null;
        field2607 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Z")
    public static final boolean method982(int arg0, int arg1) {
        if (arg1 == 2) {
            field2621++;
            return (-arg0 & arg0) == arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(III)V")
    public class137(int arg0, int arg1, int arg2) {
        this.field2617 = arg0;
        this.field2619 = arg1;
        this.field2613 = arg2;
    }
}
