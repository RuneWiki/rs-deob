import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class43 {

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field507 = 0;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field508 = 0;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static volatile int field509 = 0;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Llc;")
    public static class175 field505;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "[I")
    public static int[] field503;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 13)
    public static final void method248(int arg0) {
        if (arg0 != 16797) {
            method250(95, (String) null, -25);
        }
        field504++;
        if (class170.field2380 != null) {
            class170.field2380.method1709(arg0 - 16797);
        }
        if (class224.field3186 != null) {
            class224.field3186.method1709(0);
        }
        class271.method1965(class54.field668, (byte) 79, 2, 22050);
        class170.field2380 = class175.method1196(class9.field131, 22050, arg0 - 11056, class260.field3941, 0);
        class170.field2380.method1720(-5605, class282.field4422);
        class224.field3186 = class175.method1196(class9.field131, 2048, 5741, class260.field3941, 1);
        class224.field3186.method1720(-5605, class19.field255);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V", line = 37)
    public static void method249(int arg0) {
        field505 = null;
        field503 = null;
        if (arg0 != 0) {
            field503 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 48)
    public static final void method250(int arg0, String arg1, int arg2) {
        field510++;
        class305.field4731++;
        if (arg0 > -36) {
            field507 = 9;
        }
        class140.field1954.method573(121, 103);
        class140.field1954.method677((byte) -114, class48.method285((byte) -90, arg1));
        class140.field1954.method671(arg2, 255);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IJ)V", line = 66)
    public static final void method251(int arg0, long arg1) {
        field502++;
        if (!class258.field3925) {
            class184.field2664 += (float) arg1 * class163.field2261 / 40.0F;
            class280.field4344 += (float) arg1 * class272.field4271 / 40.0F;
        }
        int var3 = class253.field3854 + class118.field1664.field2392;
        int var4 = class118.field1664.field2357 + class262.field3956;
        if ((class158.field2180 - var3) < -500 || class158.field2180 - var3 > 500 || (class231.field3370 - var4) < -500 || (class231.field3370 - var4) > 500) {
            class231.field3370 = var4;
            class158.field2180 = var3;
        }
        if (class158.field2180 != var3) {
            int var5 = var3 - class158.field2180;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class158.field2180 += var6;
        }
        if (class231.field3370 != var4) {
            int var7 = var4 - class231.field3370;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class231.field3370 += var8;
        }
        class38.method226(true);
        if (arg0 != -1) {
            field503 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BLlc;)I", line = 161)
    public static final int method252(byte arg0, class175 arg1) {
        field506++;
        int var2 = 0;
        if (arg1.method1194(class175.field2506, (byte) 126)) {
            var2++;
        }
        if (arg1.method1194(class336.field5197, (byte) 126)) {
            var2++;
        }
        if (arg1.method1194(class208.field2957, (byte) 126)) {
            var2++;
        }
        if (arg1.method1194(class19.field244, (byte) 126)) {
            var2++;
        }
        if (arg1.method1194(class162.field2244, (byte) 126)) {
            var2++;
        }
        if (arg1.method1194(class325.field4985, (byte) 126)) {
            var2++;
        }
        if (arg1.method1194(class91.field1139, (byte) 126)) {
            var2++;
        }
        if (arg1.method1194(class326.field4992, (byte) 126)) {
            var2++;
        }
        if (arg1.method1194(class264.field4157, (byte) 126)) {
            var2++;
        }
        if (arg1.method1194(class264.field4168, (byte) 126)) {
            var2++;
        }
        if (arg1.method1194(class10.field139, (byte) 126)) {
            var2++;
        }
        if (arg1.method1194(class29.field368, (byte) 126)) {
            var2++;
        }
        if (arg1.method1194(class130.field1791, (byte) 126)) {
            var2++;
        }
        int var3 = -53 % ((-arg0 - 22) / 33);
        if (arg1.method1194(field511, (byte) 126)) {
            var2++;
        }
        if (arg1.method1194(class25.field340, (byte) 126)) {
            var2++;
        }
        return var2;
    }
}
