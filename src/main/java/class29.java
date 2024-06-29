import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class29 extends class55 {

    @OriginalMember(owner = "client!o", name = "y", descriptor = "Ltk;")
    private class347 field521;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "Ltn;")
    private class88 field513;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Lap;")
    private class479 field508;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "[I")
    public static int[] field520;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    public static final void method194(byte arg0) {
        class592.method3356(arg0 ^ -95);
        ++field522;
        class14.field276 = false;
        if (arg0 != -89) {
            method195(-16);
        }
        class167.method1169(class648.field8969, class91.field1249, class424.field5496, 16184, class652.field9070);
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
    public static void method195(int arg0) {
        if (arg0 != 10572) {
            field523 = -123;
        }
        field520 = null;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Ltk;Lnd;Ltn;)V")
    public class29(class347 arg0, class547 arg1, class88 arg2) {
        super(arg0);
        this.field521 = arg0;
        this.field513 = arg2;
        if (arg1 != null && this.field513.method722((byte) 17) && this.field521.field4489) {
            this.field508 = class101.method810(34336, arg1.method3158("gl", (byte) 92, "transparent_water"), -4348, this.field521);
        } else {
            this.field508 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)V")
    public final void method196(int arg0, boolean arg1) {
        OpenGL.glBindProgramARB(34336, this.field508.field6520);
        if (arg0 != 5) {
            this.field513 = null;
        }
        ++field514;
        OpenGL.glEnable(34336);
        super.field759.method2394(class84.field1162, (byte) 126, 0);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZB)V")
    public final void method197(boolean arg0, byte arg1) {
        int var3 = -20 % ((arg1 - -61) / 44);
        ++field512;
        super.field759.method2397(class476.field6418, class155.field2108, (byte) -82);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIBI)I")
    public static final int method198(int arg0, int arg1, byte arg2, int arg3) {
        ++field519;
        int var4 = -122 / ((-54 - arg2) / 56);
        int var5 = -arg1 + 255;
        int var6 = ((16711935 & arg3) * arg1 & -16711936 | 16711680 & (arg3 & 65280) * arg1) >>> 8;
        return (((16711935 & arg0) * var5 & -16711936 | 16711680 & (65280 & arg0) * var5) >>> 8) - -var6;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZ)V")
    public final void method199(int arg0, int arg1, boolean arg2) {
        if (this.field513.field1225) {
            float var4 = (float) (super.field759.field5633 % 4000) / 4000.0F;
            super.field759.method2396(22357, this.field513.field1222);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
        } else {
            int var5 = super.field759.field5633 % 4000 * 16 / 4000;
            super.field759.method2396(22357, this.field513.field1220[var5]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        ++field509;
        if (!arg2) {
            this.method202(-6);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILfe;)V")
    public final void method200(int arg0, int arg1, class572 arg2) {
        if (arg1 <= 30) {
            method195(120);
        }
        ++field517;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
    public final void method201(boolean arg0) {
        if (!arg0) {
            this.method201(true);
        }
        super.field759.method2394(class447.field5937, (byte) 118, 0);
        ++field510;
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)Z")
    public final boolean method202(int arg0) {
        ++field511;
        if (arg0 != 1) {
            field516 = -126;
        }
        return this.field508 != null;
    }
}
