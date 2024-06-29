import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class310 extends class312 {

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field4194 = 2;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[I")
    public static int[] field4191 = new int[4096];

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "[[I")
    public static int[][] field4195 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
    public static int[] field4189;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 10)
    public static void method1825(byte arg0) {
        if (arg0 <= -54) {
            field4195 = null;
            field4191 = null;
            field4189 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(JI)V", line = 22)
    public static final void method1826(long arg0, int arg1) {
        if (arg1 != 0) {
            field4190 = 12;
        }
        field4192++;
        int var3 = class242.field3191 + class408.field5369.field398;
        int var4 = class398.field5280 + class408.field5369.field397;
        if (class470.field6552 - var3 < -2000 || (class470.field6552 - var3) > 2000 || class424.field5715 - var4 < -2000 || (class424.field5715 - var4) > 2000) {
            class470.field6552 = var3;
            class424.field5715 = var4;
        }
        if (class470.field6552 != var3) {
            int var5 = var3 - class470.field6552;
            int var6 = (int) ((long) var5 * arg0 / 320L);
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
            class470.field6552 += var6;
        }
        if (class424.field5715 != var4) {
            int var7 = var4 - class424.field5715;
            int var8 = (int) ((long) var7 * arg0 / 320L);
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
            class424.field5715 += var8;
        }
        if (!class602.field8408.field4332) {
            class565.field7707 += (float) arg0 * class340.field4574 / 6.0F;
            class475.field6610 += (float) arg0 * class635.field8787 / 6.0F;
        }
        class401.method2296((byte) 57);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V", line = 123)
    public static final void method1827(byte arg0) {
        if (class698.field9854 < 0) {
            class68.field827 = -1;
            class59.field746 = -1;
            class698.field9854 = 0;
        }
        field4193++;
        if (class672.field9586 < class698.field9854) {
            class68.field827 = -1;
            class59.field746 = -1;
            class698.field9854 = class672.field9586;
        }
        int var1 = 123 / ((arg0 - 44) / 55);
        if (class424.field5722 < 0) {
            class59.field746 = -1;
            class68.field827 = -1;
            class424.field5722 = 0;
        }
        if (class672.field9571 < class424.field5722) {
            class68.field827 = -1;
            class59.field746 = -1;
            class424.field5722 = class672.field9571;
        }
    }
}
