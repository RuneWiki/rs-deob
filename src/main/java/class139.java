import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class139 extends class190 {

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "[I")
    private int[] field2130 = new int[this.field3205];

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Lhn;")
    public static class509 field2124 = new class509(15, -2);

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Z")
    public static boolean field2127 = false;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    private int field2122;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    private int field2128;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "[B")
    private byte[] field2125;

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIF)V", line = 3)
    public class139(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field3205 > var7; ++var7) {
            this.field2130[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIB)V", line = 20)
    public void method1009(int arg0, int arg1, byte arg2) {
        this.field2125[this.field2128++] = (byte) ((class74.method644(255, arg2) >> 1) + 127);
        ++field2126;
        if (arg1 != -32400) {
            this.method12(false, -7, 69);
        }
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V", line = 32)
    public static void method1010(int arg0) {
        field2124 = null;
        if (arg0 != 22000) {
            field2127 = true;
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V", line = 47)
    public final void method16(int arg0) {
        ++field2123;
        if (arg0 != 8217) {
            this.field2122 = -112;
        }
        this.field2122 = Math.abs(this.field2122);
        if (this.field2122 >= 4096) {
            this.field2122 = 4095;
        }
        this.method1009(this.field2128++, -32400, (byte) (this.field2122 >> 4));
        this.field2122 = 0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 66)
    public final void method15(byte arg0) {
        if (arg0 != 70) {
            this.field2122 = -81;
        }
        ++field2131;
        this.field2128 = 0;
        this.field2122 = 0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZII)V", line = 82)
    public final void method12(boolean arg0, int arg1, int arg2) {
        ++field2129;
        this.field2122 += this.field2130[arg2] * arg1 >> 12;
        if (arg0) {
            this.method16(50);
        }
    }
}
