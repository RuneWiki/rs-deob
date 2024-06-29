import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class254 {

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field4579 = 0;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "[I")
    public static int[] field4580;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method1764(int arg0) {
        int var1 = -64 % ((arg0 + 51) / 45);
        field4580 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)I")
    public static final int method1765(boolean arg0) {
        if (arg0) {
            field4582++;
            return class173.field3156;
        } else {
            return 35;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)V")
    public static final void method1766(byte arg0, int arg1) {
        field4581++;
        if (!class131.method971(arg1, (byte) 124)) {
            return;
        }
        class50[] var2 = class116.field2222[arg1];
        if (arg0 != -116) {
            field4579 = 20;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class50 var4 = var2[var3];
            if (var4 != null) {
                var4.field815 = 0;
                var4.field821 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ltk;IZII)V")
    public static final void method1767(class50 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (class265.field4715 < 3) {
            ((class264) class53.field946).method557(arg4, arg1, arg0.field798, arg0.field727, class53.field946.field1010 / 2, class53.field946.field999 / 2, client.field2812, 256, arg0.field800, arg0.field760);
        } else {
            class15.method76(arg4, arg1, 0, arg0.field800, arg0.field760);
        }
        field4578++;
        class49.field723[arg3] = true;
        if (arg2) {
            method1766((byte) -19, 86);
        }
    }
}
