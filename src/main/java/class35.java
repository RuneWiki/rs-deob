import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!sa")
public class class35 {

    @OriginalMember(owner = "mapview!sa", name = "c", descriptor = "[I")
    private int[] field481;

    @OriginalMember(owner = "mapview!sa", name = "d", descriptor = "I")
    public static int field482 = 0;

    @OriginalMember(owner = "mapview!sa", name = "f", descriptor = "Lt;")
    public static class36 field484 = class3.method8(13631, "Find");

    @OriginalMember(owner = "mapview!sa", name = "e", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "mapview!sa", name = "i", descriptor = "[B")
    public static byte[] field487;

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "[I")
    public static int[] field480;

    @OriginalMember(owner = "mapview!sa", name = "g", descriptor = "[I")
    public static int[] field485;

    @OriginalMember(owner = "mapview!sa", name = "h", descriptor = "[Lq;")
    public static class30[] field486;

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "[Lda;")
    public static class7[] field479;

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(IZ)I", line = 12)
    public final int method193(int arg0, boolean arg1) {
        if (arg1) {
            return 70;
        }
        int var3 = (this.field481.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field481[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field481[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "<init>", descriptor = "([I)V", line = 37)
    public class35(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field481 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field481[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field481[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field481[var5 + var5] = arg0[var4];
            this.field481[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 98)
    public static final void method194(byte arg0, Component arg1) {
        arg1.removeMouseListener(class6.field63);
        arg1.removeMouseMotionListener(class6.field63);
        if (arg0 < 87) {
            method194((byte) -109, null);
        }
        arg1.removeFocusListener(class6.field63);
        class21.field271 = 0;
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(I)V", line = 115)
    public static void method195(int arg0) {
        field479 = null;
        field486 = null;
        field487 = null;
        field480 = null;
        field484 = null;
        field485 = null;
        if (arg0 != 1) {
            field486 = null;
        }
    }
}
