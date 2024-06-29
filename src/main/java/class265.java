import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class265 extends class304 {

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "[I")
    private int[] field4294 = new int[this.field4774];

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "[I")
    public static int[] field4285 = new int[50];

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "Lqc;")
    public static class99 field4289 = null;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
    public static int field4292 = 0;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field4286 = 0;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    private int field4293;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    private int field4297;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "[B")
    private byte[] field4298;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V", line = 7)
    public final void method418(int arg0, int arg1, int arg2) {
        field4290++;
        if (arg2 != 6952) {
            this.method423(-114);
        }
        this.field4297 += this.field4294[arg1] * arg0 >> 12;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V", line = 18)
    public final void method416(byte arg0) {
        this.field4297 = Math.abs(this.field4297);
        field4288++;
        if (this.field4297 >= 4096) {
            this.field4297 = 4095;
        }
        this.method1712(this.field4293++, (byte) (this.field4297 >> 4));
        this.field4297 = 0;
        if (arg0 != -4) {
            this.field4297 = 23;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)V", line = 41)
    public void method1712(int arg0, byte arg1) {
        this.field4298[this.field4293++] = (byte) (client.method767(arg1 >> 1, 127) + 127);
        field4296++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZILak;I)[Lbf;", line = 50)
    public static final class58[] method1888(boolean arg0, int arg1, class172 arg2, int arg3) {
        if (!arg0) {
            field4285 = (int[]) null;
        }
        field4291++;
        return class55.method353(arg2, arg1, (byte) -5, arg3) ? class285.method2047(-55) : null;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V", line = 70)
    public final void method423(int arg0) {
        this.field4297 = 0;
        if (arg0 != 21260) {
            this.method1712(112, (byte) -96);
        }
        field4287++;
        this.field4293 = 0;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V", line = 88)
    public static void method1889(int arg0) {
        field4285 = null;
        if (arg0 <= 55) {
            field4285 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIIF)V", line = 97)
    public class265(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field4774; var7++) {
            this.field4294[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }
}
