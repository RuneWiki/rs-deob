import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public abstract class class170 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "[I")
    public static int[] field2657 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Lna;")
    public static class26 field2660 = class69.method505("null", (byte) -119);

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field2658 = -2;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field2664 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "Lna;")
    public static class26 field2668 = class69.method505("Lade Liste der Welten", (byte) -123);

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public static int field2670 = 0;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public int field2665;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public int field2667;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field2663;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "[I")
    public int[] field2661;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "[[[B")
    public static byte[][][] field2662;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lve;Lve;I)V", line = 12)
    public static final void method1170(class266 arg0, class266 arg1, int arg2) {
        if (arg2 != 11504) {
            field2668 = (class26) null;
        }
        class94.field1540 = arg0;
        class113.field1778 = arg1;
        field2659++;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V", line = 40)
    public static void method1171(boolean arg0) {
        field2662 = (byte[][][]) null;
        field2657 = null;
        field2668 = null;
        if (arg0) {
            method1171(false);
        }
        field2660 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 53)
    public final void method1172(int arg0) {
        class34.method282(this.field2661, this.field2667, this.field2665);
        field2666++;
        if (arg0 != 0) {
            field2671 = -118;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZIII[Lbe;)V", line = 71)
    public static final void method1173(int arg0, boolean arg1, int arg2, int arg3, int arg4, class297[] arg5) {
        int var6 = 0;
        if (arg3 != 235) {
            return;
        }
        while (var6 < arg5.length) {
            class297 var7 = arg5[var6];
            if (var7 != null && var7.field4993 == arg0) {
                class277.method1957(arg4, 13987, arg2, var7, arg1);
                class212.method1416(var7, 23730, arg4, arg2);
                if ((var7.field5046 - var7.field4967) < var7.field5053) {
                    var7.field5053 = var7.field5046 - var7.field4967;
                }
                if (var7.field5012 > var7.field5058 - var7.field4996) {
                    var7.field5012 = var7.field5058 - var7.field4996;
                }
                if (var7.field5012 < 0) {
                    var7.field5012 = 0;
                }
                if (var7.field5053 < 0) {
                    var7.field5053 = 0;
                }
                if (var7.field4988 == 0) {
                    class203.method1368(var7, arg1, arg3 - 343);
                }
            }
            var6++;
        }
        field2669++;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V", line = 135)
    protected class170() {
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lec;)V", line = 151)
    public static final void method1174(class39 arg0) {
        for (int var1 = arg0.field637; var1 <= arg0.field652; var1++) {
            for (int var2 = arg0.field630; var2 <= arg0.field634; var2++) {
                class55 var3 = class36.field585[arg0.field648][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field879; var4++) {
                        if (var3.field877[var4] == arg0) {
                            var3.field879--;
                            for (int var5 = var4; var5 < var3.field879; var5++) {
                                var3.field877[var5] = var3.field877[var5 + 1];
                                var3.field893[var5] = var3.field893[var5 + 1];
                            }
                            var3.field877[var3.field879] = null;
                            break;
                        }
                    }
                    var3.field884 = 0;
                    for (int var6 = 0; var6 < var3.field879; var6++) {
                        var3.field884 |= var3.field893[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method1030(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method1026(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZILjava/awt/Component;)V")
    public abstract void method1031(int arg0, boolean arg1, int arg2, Component arg3);
}
