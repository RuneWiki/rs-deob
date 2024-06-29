import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class38 {

    @OriginalMember(owner = "client!al", name = "c", descriptor = "Lke;")
    public static class256 field685 = class316.method2202(" est d-Bj-9 dans votre liste noire)3", 27626);

    @OriginalMember(owner = "client!al", name = "h", descriptor = "[Lbj;")
    public static class96[] field690 = new class96[4];

    @OriginalMember(owner = "client!al", name = "j", descriptor = "Lke;")
    private static class256 field692 = class316.method2202("Attack", 27626);

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field694 = 255;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "Lke;")
    public static class256 field696 = field692;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "Lke;")
    public static class256 field698 = class316.method2202(")1a2)1m", 27626);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([Ljava/lang/Object;I[I)V", line = 6)
    public static final void method291(Object[] arg0, int arg1, int[] arg2) {
        field689++;
        if (arg1 != -10337) {
            method294(69, -90, 1, 8, -118, 59);
        }
        class205.method1458(1, arg2, arg2.length - 1, 0, arg0);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLra;)V", line = 17)
    public final void method292(byte arg0, class41 arg1) {
        if (arg0 < 70) {
            return;
        }
        while (true) {
            int var3 = arg1.method357(false);
            if (var3 == 0) {
                field684++;
                return;
            }
            this.method296(var3, 4, arg1);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 38)
    public static void method293(int arg0) {
        field696 = null;
        field690 = null;
        field692 = null;
        if (arg0 >= 95) {
            field685 = null;
            field698 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIII)V", line = 68)
    public static final void method294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field686++;
        if (arg1 == arg2) {
            class167.method1217(arg0, arg5, arg1, (byte) -32, arg4);
            return;
        }
        if (class244.field4161 <= arg4 - arg1 && arg1 + arg4 <= class175.field3106 && arg0 - arg2 >= class105.field1887 && class274.field4748 >= (arg0 + arg2)) {
            class68.method520(arg4, arg5, false, arg0, arg1, arg2);
        } else {
            class76.method579(arg4, arg1, arg2, arg0, arg5, 0);
        }
        if (arg3 != 0) {
            method291((Object[]) null, -125, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII)V", line = 109)
    public static final void method295(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field695++;
        if (arg3 != -1) {
            method295(14, 124, -76, 107, -127);
        }
        if (arg0 < arg1) {
            for (int var5 = arg0; var5 < arg1; var5++) {
                class308.field5329[var5][arg4] = arg2;
            }
        } else {
            for (int var6 = arg1; var6 < arg0; var6++) {
                class308.field5329[var6][arg4] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IILra;)V", line = 145)
    private final void method296(int arg0, int arg1, class41 arg2) {
        if (arg0 == 1) {
            this.field687 = arg2.method346(arg1 ^ 0xFFFFFFF4);
            this.field683 = arg2.method357(false);
            this.field688 = arg2.method357(false);
        }
        if (arg1 != 4) {
            this.method292((byte) 75, (class41) null);
        }
        field693++;
    }
}
