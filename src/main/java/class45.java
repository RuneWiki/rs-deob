import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class45 extends class283 {

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "Lid;")
    public static class149 field685 = class95.method689(160, (byte) 120);

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "Lid;")
    private static class149 field690 = class60.method382("Take", (byte) 103);

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "Lid;")
    public static class149 field687 = field690;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "Lid;")
    public static class149 field692 = class60.method382("Abbrechen", (byte) 97);

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    public static int field691 = -1;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "Lal;")
    public static class230 field688;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "Lal;")
    public static class230 field689;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lal;Lal;B)V")
    public static final void method258(class230 arg0, class230 arg1, byte arg2) {
        class113.field1936 = arg0;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        field682++;
        class16.field228 = arg1;
        class16.field228.method1559(34, arg2 ^ 0x8);
        int var4 = (int) (Math.random() * 41.0D) - 20;
        if (arg2 != -103) {
            field689 = null;
        }
        class71.field1245 = var3 + var4;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        class247.field4334 = var5 + var4;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class210.field3752 = var4 + var6;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIB)V")
    public static final void method259(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class224.field3940 = arg1;
        if (arg4 != -52) {
            field688 = null;
        }
        class257.field4496 = arg2;
        class192.field3449 = arg0;
        class94.field1655 = arg3;
        field680++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IJ)V")
    public static final void method260(int arg0, long arg1) {
        if (arg0 < 57) {
            return;
        }
        field686++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)V")
    public static final void method261(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field683++;
        class216 var5 = class139.method972(arg1, false, 8);
        var5.method1459(true);
        var5.field3813 = arg4;
        var5.field3818 = arg3;
        var5.field3809 = arg2;
        int var6 = 85 % ((arg0 - 72) / 50);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
    public static void method262(int arg0) {
        field688 = null;
        field689 = null;
        field692 = null;
        field685 = null;
        if (arg0 != 21) {
            field689 = null;
        }
        field687 = null;
        field690 = null;
    }
}
