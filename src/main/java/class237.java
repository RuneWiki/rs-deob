import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class237 {

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public int field3477 = 0;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3479 = "green:";

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field3481 = 0;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "[I")
    public static int[] field3482 = new int[128];

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Ldh;")
    public static class179 field3483 = new class179(64);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Llc;")
    public static class175 field3475;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Llc;")
    public static class175 field3480;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILp;)V", line = 7)
    public final void method1688(int arg0, class107 arg1) {
        while (true) {
            int var3 = arg1.method661(~arg0);
            if (var3 == 0) {
                field3478++;
                if (arg0 != 0) {
                    field3482 = (int[]) null;
                }
                return;
            }
            this.method1691(1142, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V", line = 31)
    public static final void method1689(int arg0, int arg1, int arg2) {
        field3474++;
        class96 var3 = class141.method935(arg0, arg2, arg2 ^ 0x70);
        var3.method581((byte) -99);
        var3.field1243 = arg1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 43)
    public static void method1690(int arg0) {
        field3479 = null;
        field3480 = null;
        field3475 = null;
        field3482 = null;
        if (arg0 < -92) {
            field3483 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILp;I)V", line = 58)
    private final void method1691(int arg0, class107 arg1, int arg2) {
        field3476++;
        if (arg2 == 5) {
            this.field3477 = arg1.method624(14612);
        }
        if (arg0 != 1142) {
            this.method1691(-75, (class107) null, 60);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(JI)V", line = 88)
    public static final void method1692(long arg0, int arg1) {
        field3484++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 > -73) {
            field3483 = (class179) null;
        }
        for (int var3 = 0; var3 < class74.field954; var3++) {
            if (class233.field3398[var3] == arg0) {
                class74.field954--;
                for (int var4 = var3; var4 < class74.field954; var4++) {
                    class76.field965[var4] = class76.field965[var4 + 1];
                    class132.field1816[var4] = class132.field1816[var4 + 1];
                    class330.field5039[var4] = class330.field5039[var4 + 1];
                    class233.field3398[var4] = class233.field3398[var4 + 1];
                    class296.field4619[var4] = class296.field4619[var4 + 1];
                    class154.field2114[var4] = class154.field2114[var4 + 1];
                }
                class231.field3367++;
                class186.field2686 = class331.field5060;
                class140.field1954.method573(122, 132);
                class140.field1954.method678(arg0, (byte) 116);
                break;
            }
        }
    }
}
