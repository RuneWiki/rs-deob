import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class67 {

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lok;")
    public static class41 field1015 = class137.method956("<img=1>", 45);

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lok;")
    public static class41 field1012 = class137.method956("Bitte warten Sie)3)3)3", 45);

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Z")
    public static boolean field1014 = false;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Lok;")
    public static class41 field1016 = class137.method956(" steht bereits auf Ihrer Freunde)2Liste(Q", 45);

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static volatile int field1017 = -1;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lbc;")
    public static class302 field1009;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)[Laf;", line = 13)
    public static final class72[] method488(int arg0) {
        field1013++;
        class72[] var1 = new class72[class181.field2940];
        for (int var2 = arg0; var2 < class181.field2940; var2++) {
            byte[] var3 = class223.field3562[var2];
            int var4 = class69.field1040[var2] * class173.field2812[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class312.field5263[class217.method1563(var3[var6], 255)];
            }
            var1[var2] = new class72(class204.field3299, class205.field3318, class95.field1412[var2], class314.field5288[var2], class69.field1040[var2], class173.field2812[var2], var5);
        }
        class286.method2005((byte) -9);
        return var1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLmh;)V", line = 52)
    public static final void method491(byte arg0, class65 arg1) {
        field1011++;
        class41.field647 = arg1;
        int var2 = -66 % ((arg0 + 56) / 42);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIIII)V", line = 62)
    public static final void method492(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field1010++;
        if (arg0) {
            return;
        }
        for (int var5 = 0; var5 < class75.field1120; var5++) {
            if (arg2 < class237.field3804[var5] + class201.field3212[var5] && arg2 + arg3 > class237.field3804[var5] && (class92.field1353[var5] + class62.field904[var5]) > arg1 && class92.field1353[var5] < arg1 + arg4) {
                class195.field3151[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)V", line = 94)
    public static void method493(boolean arg0) {
        field1009 = null;
        field1012 = null;
        field1015 = null;
        field1016 = null;
        if (!arg0) {
            field1016 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)I")
    public abstract int method489(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
    public abstract void method490(boolean arg0);
}
