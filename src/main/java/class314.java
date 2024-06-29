import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class314 {

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Z")
    public static boolean field4339 = false;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "Lsea;")
    public static class648 field4343;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "[I")
    public static int[] field4342;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V")
    public static final void method1904(int arg0, int arg1, int arg2) {
        class14.field152 = arg1 - class510.field7012;
        field4341++;
        class255.field3490 = arg2 - class510.field7003;
        if (arg0 <= 104) {
            method1905(-27);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static final void method1905(int arg0) {
        field4340++;
        for (int var1 = 0; var1 < 100; var1++) {
            class130.field1872[var1] = true;
        }
        if (arg0 != -101) {
            field4343 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
    public static void method1906(int arg0) {
        field4342 = null;
        if (arg0 > -22) {
            method1905(78);
        }
        field4343 = null;
    }
}
