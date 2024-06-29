import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class174 {

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public int field3017 = 0;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "[Lda;")
    public static class275[] field3015 = new class275[500];

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field3016 = 0;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lda;")
    private static class275 field3012 = class255.method1672(123, "Loaded sprites");

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lda;")
    public static class275 field3014 = class255.method1672(125, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Lda;")
    public static class275 field3008 = field3012;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field3020 = -1;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lrb;")
    public static class196 field3011 = new class196();

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Lda;")
    private static class275 field3021 = class255.method1672(101, "Connection lost)3");

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lda;")
    public static class275 field3022 = field3021;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lma;")
    public static class105 field3019;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILij;)V")
    private final void method1178(int arg0, int arg1, class85 arg2) {
        if (arg1 == 5) {
            this.field3017 = arg2.method608(65);
        }
        int var4 = -72 / ((4 - arg0) / 59);
        field3013++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static void method1179(byte arg0) {
        field3022 = null;
        field3021 = null;
        field3011 = null;
        field3012 = null;
        field3008 = null;
        field3014 = null;
        field3019 = null;
        field3015 = null;
        int var1 = 88 / ((-arg0 - 3) / 43);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lij;I)V")
    public final void method1180(class85 arg0, int arg1) {
        if (arg1 != 0) {
            this.method1178(-99, -15, (class85) null);
        }
        while (true) {
            int var3 = arg0.method564((byte) 83);
            if (var3 == 0) {
                field3010++;
                return;
            }
            this.method1178(-99, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)Lwb;")
    public static final class179 method1181(int arg0) {
        field3009++;
        int var1 = class32.field480[0] * class152.field2662[0];
        byte[] var2 = class67.field1101[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class270.field4695[class19.method98(var2[var4], 255)];
        }
        class259 var5 = new class259(class267.field4646, class250.field4419, class114.field2010[arg0], class246.field4357[0], class152.field2662[0], class32.field480[0], var3);
        class134.method978(-103);
        return var5;
    }
}
