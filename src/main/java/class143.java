import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class143 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public int field2753 = -1;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "[B")
    public static byte[] field2757 = new byte[32896];

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "Lsg;")
    public static class30 field2767;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "Lka;")
    public static class157 field2762;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "Lsg;")
    public static class30 field2769;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public int field2754;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public int field2755;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public int field2758;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public int field2761;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public int field2764;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public int field2766;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static void method1061(int arg0) {
        field2767 = null;
        if (arg0 == 0) {
            field2762 = null;
            field2769 = null;
            field2757 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZLrc;)V")
    public static final void method1062(boolean arg0, class275 arg1) {
        if (arg0) {
            return;
        }
        field2756++;
        for (class91 var2 = (class91) class239.field4254.method478(0); var2 != null; var2 = (class91) class239.field4254.method476((byte) 13)) {
            if (var2.field1838 == arg1) {
                if (var2.field1829 != null) {
                    class127.field2469.method186(var2.field1829);
                    var2.field1829 = null;
                }
                var2.method1681(arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILaa;)Lbe;")
    public static final class250 method1063(int arg0, class8 arg1) {
        if (arg0 != 0) {
            method1063(84, (class8) null);
        }
        field2759++;
        return new class250(arg1.method74(arg0 + 113), arg1.method74(arg0 ^ 0x7B), arg1.method74(115), arg1.method74(arg0 ^ 0x6F), arg1.method60(arg0 + 23888), arg1.method60(arg0 + 23888), arg1.method63((byte) 71));
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public static final void method1064(int arg0) {
        if (class93.field1864 == 2) {
            if (class5.field77 == class197.field3571 && class273.field4793 == class219.field3960) {
                class93.field1864 = 0;
                class234.method1656(class52.field1165 - 1, 113);
            }
        } else if (class5.field77 == class32.field817 && class219.field3960 == class183.field3365) {
            class93.field1864 = 0;
            class234.method1656(class52.field1165 - 1, 117);
        } else {
            class197.field3571 = class32.field817;
            class93.field1864 = 2;
            class273.field4793 = class183.field3365;
        }
        field2765++;
        if (arg0 != -257) {
            field2757 = null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2757[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field2767 = class167.method1221((byte) 33, "::qa_op_test");
        field2762 = new class157(8);
        field2769 = class167.method1221((byte) 33, "details");
    }
}
