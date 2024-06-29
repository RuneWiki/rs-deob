import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class51 {

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "[[[Lhi;")
    public static class282[][][] field983 = new class282[4][104][104];

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static volatile int field982 = 0;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static volatile int field978 = -1;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public int field989;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public int field991;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "Lce;")
    public static class239 field984;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "[B")
    public byte[] field980;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "[B")
    public byte[] field985;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "[Z")
    public static boolean[] field979;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V", line = 19)
    public static final void method443(int arg0, boolean arg1) {
        field988++;
        if (class255.method1799(arg0, false)) {
            class177.method1299(-109, -1, class44.field845[arg0]);
            if (!arg1) {
                method445((class239) null, (class239) null, true, (class239) null, (class239) null);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIII)V", line = 35)
    public static final void method444(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class83.field1438; var5++) {
            if (class280.field4728[var5] + class197.field3166[var5] > arg1 && (arg1 + arg0) > class197.field3166[var5] && (class53.field1036[var5] + class181.field2947[var5]) > arg3 && class181.field2947[var5] < (arg2 + arg3)) {
                class309.field5192[var5] = true;
            }
        }
        int var6 = 28 / ((13 - arg4) / 50);
        field975++;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lce;Lce;ZLce;Lce;)V", line = 73)
    public static final void method445(class239 arg0, class239 arg1, boolean arg2, class239 arg3, class239 arg4) {
        class8.field129 = arg0;
        field990++;
        class110.field1922 = arg1;
        field984 = arg4;
        class158.field2644 = arg3;
        class44.field845 = new class213[class158.field2644.method1660(-22800)][];
        class293.field4917 = new boolean[class158.field2644.method1660(-22800)];
        if (!arg2) {
            field982 = -12;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 93)
    public static void method446(int arg0) {
        field979 = null;
        field984 = null;
        if (arg0 != 0) {
            field979 = (boolean[]) null;
        }
        field983 = (class282[][][]) null;
    }
}
