import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class143 extends class20 {

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "Z")
    public boolean field3347 = false;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "[I")
    public static int[] field3342 = new int[32];

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "Z")
    public static volatile boolean field3343 = true;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field3339 = 0;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "[I")
    public static int[] field3346 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "Lsc;")
    private static class128 field3352 = class129.method1017(false, "Loading textures )2 ");

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "Lsc;")
    public static class128 field3350 = field3352;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public static int field3348 = 127;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public int field3349;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public int field3351;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
    public static void method1164(boolean arg0) {
        if (arg0) {
            field3352 = null;
            field3350 = null;
            field3346 = null;
            field3342 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Z")
    public static final boolean method1165(int arg0, int arg1, int arg2) {
        field3341++;
        if (arg0 != 31740) {
            field3342 = null;
        }
        return (arg2 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILsf;I)Lcd;")
    public static final class19 method1166(int arg0, class131 arg1, int arg2) {
        field3344++;
        byte[] var3 = arg1.method1038(arg0, -1);
        int var4 = -108 % ((arg2 + 44) / 41);
        return var3 == null ? null : new class19(var3);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public static final void method1167(int arg0) {
        class84.field1883 = null;
        class36.field684 = null;
        class113.field2544 = null;
        field3345++;
        if (arg0 > -98) {
            method1165(-74, -101, 76);
        }
    }
}
