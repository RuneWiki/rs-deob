import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class281 {

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field4528 = 0;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "[[I")
    public static int[][] field4523;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "[[Lrc;")
    public static class206[][] field4530;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V", line = 7)
    public static void method2033(byte arg0) {
        field4530 = (class206[][]) null;
        field4523 = (int[][]) null;
        if (arg0 != -66) {
            method2035(3, -117L);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 20)
    public static final void method2034(int arg0) {
        field4526++;
        if (arg0 != 0) {
            method2033((byte) 100);
        }
        if (!class76.method518(-19076) && class49.field698 != class236.field3781) {
            class227.method1610(false, -794, class191.field3129.field4184[0], class49.field698, class63.field914, class142.field2215, class191.field3129.field4248[0], false);
        } else if (class5.field79 != class49.field698 && class105.method716((byte) -36, class49.field698)) {
            class5.field79 = class49.field698;
            class277.method2004(arg0 ^ 0xFFFFFFAB);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IJ)V", line = 48)
    public static final void method2035(int arg0, long arg1) {
        int var3 = class191.field3129.field4255 + class113.field1732;
        if (!class57.field803) {
            class330.field5090 += (float) arg1 * class64.field931 / 40.0F;
            class97.field1386 += (float) arg1 * class201.field3276 / 40.0F;
        }
        int var4 = class103.field1508 + class191.field3129.field4264;
        if (arg0 != 0) {
            method2035(102, -6L);
        }
        field4524++;
        if ((class55.field772 - var3) < -500 || class55.field772 - var3 > 500 || class129.field2014 - var4 < -500 || (class129.field2014 - var4) > 500) {
            class55.field772 = var3;
            class129.field2014 = var4;
        }
        if (class55.field772 != var3) {
            int var5 = var3 - class55.field772;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class55.field772 += var6;
        }
        if (class129.field2014 != var4) {
            int var7 = var4 - class129.field2014;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class129.field2014 += var8;
        }
        class151.method1099(255);
    }
}
