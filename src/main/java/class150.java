import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class150 {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field3151 = 0;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Lgg;")
    public static class63 field3152 = class116.method911(43, " (X");

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Lgg;")
    public static class63 field3158 = class116.method911(43, "Hier wechseln");

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "Lgg;")
    private static class63 field3163 = class116.method911(43, "Walk here");

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "Lgg;")
    public static class63 field3165 = field3163;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "J")
    public static long field3161;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "[Lff;")
    public static class54[] field3162;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static final void method1051(int arg0) {
        for (int var1 = -1; var1 < class34.field813; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class177.field3641[var1];
            }
            class62 var3 = class33.field806[var2];
            if (var3 != null) {
                class62.method567(var3, 1, 128);
            }
        }
        if (arg0 == 0) {
            field3159++;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)I")
    public static final int method1052(byte arg0) {
        field3155++;
        int var1 = -116 % ((arg0 + 30) / 55);
        return class112.field2519++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Ln;")
    public static final class117 method1053(int arg0, int arg1) {
        field3154++;
        if (arg0 != -9897) {
            field3158 = null;
        }
        class117 var2 = (class117) class143.field3058.method289((long) arg1, -130079263);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class111.field2503.method745(arg1, 0, 0);
        if (var3 == null) {
            return null;
        }
        class117 var4 = new class117();
        class3 var5 = new class3(var3);
        var5.field54 = var5.field48.length - 12;
        int var6 = var5.method56(-1);
        var4.field2610 = var5.method46((byte) 65);
        var4.field2614 = var5.method46((byte) 65);
        var4.field2621 = var5.method46((byte) 65);
        int var7 = 0;
        var4.field2616 = var5.method46((byte) 65);
        var5.field54 = 0;
        var4.field2608 = var5.method29(111);
        var4.field2619 = new int[var6];
        var4.field2613 = new class63[var6];
        var4.field2611 = new int[var6];
        while (var5.field54 < var5.field48.length - 12) {
            int var8 = var5.method46((byte) 65);
            if (var8 == 3) {
                var4.field2613[var7] = var5.method28(-1);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field2619[var7] = var5.method64(arg0 + 41687);
            } else {
                var4.field2619[var7] = var5.method56(class180.method1200(arg0, 9896));
            }
            var4.field2611[var7++] = var8;
        }
        class143.field3058.method293(false, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public static void method1054(int arg0) {
        if (arg0 != 12737) {
            method1051(-40);
        }
        field3162 = null;
        field3152 = null;
        field3163 = null;
        field3165 = null;
        field3158 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V")
    public static final void method1055(boolean arg0, int arg1) {
        class198.method1294((byte) -30);
        class8.field177++;
        field3150++;
        if (class8.field177 < 50 && !arg0) {
            return;
        }
        class8.field177 = 0;
        if (!class63.field1587 && class171.field3553 != null) {
            class8.field180++;
            class141.field3031.method854(82, true);
            try {
                class171.field3553.method512(0, class141.field3031.field54, class141.field3031.field48, (byte) 102);
                class141.field3031.field54 = 0;
            } catch (IOException var2) {
                class63.field1587 = true;
            }
        }
        if (arg1 != 22344) {
            field3151 = -41;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lgg;IILgg;Lgg;)V")
    public static final void method1056(class63 arg0, int arg1, int arg2, class63 arg3, class63 arg4) {
        if (arg1 != 9213) {
            method1053(72, 22);
        }
        for (int var5 = 99; var5 > 0; var5--) {
            class206.field4062[var5] = class206.field4062[var5 - 1];
            class83.field1965[var5] = class83.field1965[var5 - 1];
            class166.field3411[var5] = class166.field3411[var5 - 1];
            class57.field1500[var5] = class57.field1500[var5 - 1];
        }
        field3164++;
        class83.field1965[0] = arg4;
        class166.field3411[0] = arg0;
        class121.field2660 = class72.field1807;
        class189.field3831++;
        class57.field1500[0] = arg3;
        class206.field4062[0] = arg2;
    }
}
