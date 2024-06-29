import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class144 {

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "J")
    public static long field3158 = 0L;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Lpe;")
    public static class109 field3166 = class141.method1120("m", 0);

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "[I")
    public static int[] field3160 = new int[1000];

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lpe;")
    public static class109 field3156 = class141.method1120("<)4col>", 0);

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "Lpe;")
    public static class109 field3171 = class141.method1120("Bitte versuchen Sie es in ", 0);

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public int field3161;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public int field3163;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public int field3165;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public int field3167;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Lpe;")
    public class109 field3168;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Lna;")
    public static class91 field3159;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Z")
    public boolean field3157;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Z")
    public static boolean field3170;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lna;I)V")
    public static final void method1135(class91 arg0, int arg1) {
        class50.field1030 = arg0;
        if (arg1 < 64) {
            field3156 = null;
        }
        field3162++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method1136(int arg0) {
        if (arg0 != 2) {
            method1137(true, null);
        }
        field3159 = null;
        field3156 = null;
        field3171 = null;
        field3160 = null;
        field3166 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZLpe;)V")
    public static final void method1137(boolean arg0, class109 arg1) {
        field3169++;
        if (class4.field87 >= 2) {
            if (arg1.method884(class145.field3189, 103)) {
                System.gc();
            }
            if (arg1.method884(class113.field2489, 106)) {
                class15.method177((byte) -38);
            }
            if (arg1.method884(class102.field2139, 109)) {
                class136.field2962 = true;
            }
            if (arg1.method884(class44.field944, 126)) {
                class136.field2962 = false;
            }
            if (arg1.method884(class32.field699, 102)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class109.field2318[var2].field1618[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg1.method884(class134.field2933, 127) && class83.field1774 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method886(class24.field605, 84)) {
                class23.field562 = arg1.method897(false, 12).method870(-92).method893(48);
                class75.method593(0, null, -8870, class44.method405(new class109[] { class118.field2597, class143.method1132(class23.field562, 93) }, (byte) -74));
            }
            if (arg1.method884(class93.field2005, 114)) {
                class14.field380 = true;
            }
        }
        class63.field1299.method535(82, -25013);
        class17.field424++;
        class63.field1299.method135(arg1.method898((byte) 121) - 1, (byte) -50);
        class63.field1299.method152(9166, arg1.method897(false, 2));
        if (!arg0) {
            method1136(-128);
        }
    }
}
