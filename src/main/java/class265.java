import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class class265 {

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public int field4466;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public int field4472;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public int field4474;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Lwm;")
    public static class152 field4467 = class157.method1048("hint_headicons", 115);

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field4473 = 0;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field4475 = 0;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "[B")
    public static byte[] field4471 = new byte[32896];

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Lwm;")
    private static class152 field4476;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "Lwm;")
    public static class152 field4479;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "[I")
    public static int[] field4478;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Lqe;")
    public static class186 field4477;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 8)
    public static void method1819(int arg0) {
        field4478 = null;
        if (arg0 != 0) {
            field4479 = (class152) null;
        }
        field4477 = null;
        field4476 = null;
        field4467 = null;
        field4479 = null;
        field4471 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I", line = 39)
    public static final int method1820(int arg0, int arg1) {
        field4470++;
        if (arg1 < 0) {
            return 0;
        }
        class123 var2 = (class123) class225.field3655.method1586((long) arg1, -101);
        if (var2 == null) {
            return class26.method218(false, arg1).field2845;
        }
        int var3 = 0;
        if (arg0 > -23) {
            method1819(121);
        }
        for (int var4 = 0; var4 < var2.field1730.length; var4++) {
            if (var2.field1730[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class26.method218(false, arg1).field2845 - var2.field1730.length);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field4471[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field4476 = class157.method1048("Continue", 112);
        field4479 = field4476;
        field4478 = new int[1000];
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIB)V", line = 83)
    public static final void method1821(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -104) {
            method1820(-87, 35);
        }
        for (int var5 = 0; var5 < class121.field1709; var5++) {
            if (arg0 < (class288.field4874[var5] + class227.field3695[var5]) && (arg0 + arg3) > class288.field4874[var5] && arg2 < class286.field4847[var5] + class174.field2788[var5] && arg2 + arg1 > class286.field4847[var5]) {
                class249.field4170[var5] = true;
            }
        }
        field4468++;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(III)V", line = 108)
    public class265(int arg0, int arg1, int arg2) {
        this.field4466 = arg2;
        this.field4472 = arg1;
        this.field4474 = arg0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
    public abstract void method243(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BII)V")
    public abstract void method248(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(III)V")
    public abstract void method247(int arg0, int arg1, int arg2);
}
