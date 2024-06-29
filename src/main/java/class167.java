import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class167 extends class25 {

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field2719 = -1;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "Ldf;")
    public static class51 field2710 = class46.method233("Ladevorgang )2 bitte warten Sie)3", 100);

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    public static int field2713 = 0;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "Ldf;")
    private static class51 field2720 = class46.method233("Type", 100);

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "Ldf;")
    public static class51 field2722 = class46.method233("<col=ffff00>", 100);

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "[[B")
    public static byte[][] field2726 = new byte[1000][];

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "Ldf;")
    public static class51 field2723 = field2720;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public static int field2725 = 0;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    public int field2724;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "Ldf;")
    public class51 field2712;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "Z")
    public static boolean field2711;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)I")
    public final int method1161(int arg0) {
        if (arg0 != -24165) {
            field2722 = null;
        }
        ++field2718;
        return (int) super.field1760;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
    public final void method1162(boolean arg0) {
        ++field2714;
        super.field374 |= Long.MIN_VALUE;
        if (arg0) {
            field2710 = null;
        }
        if (this.method1167(-30091) == 0L) {
            class223.field3935.method404(this, false);
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)I")
    public static int method1163(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)I")
    public final int method1164(int arg0) {
        ++field2716;
        return arg0 != -2937 ? 78 : (int) (super.field1760 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V")
    public static void method1165(int arg0) {
        field2726 = null;
        field2723 = null;
        field2722 = null;
        field2720 = null;
        field2710 = null;
        if (arg0 != 1) {
            method1168(-50, 86, 92, -62);
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)V")
    public final void method1166(byte arg0) {
        if (arg0 != -73) {
            method1165(-48);
        }
        ++field2717;
        super.field374 = Long.MIN_VALUE & super.field374 | class7.method31((byte) -88) - -500L;
        class119.field1987.method404(this, false);
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)J")
    public final long method1167(int arg0) {
        if (arg0 != -30091) {
            this.method1161(71);
        }
        ++field2715;
        return Long.MAX_VALUE & super.field374;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(II)V")
    public class167(int arg0, int arg1) {
        super.field1760 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)I")
    public static final int method1168(int arg0, int arg1, int arg2, int arg3) {
        ++field2721;
        int var4 = arg3 / arg0;
        int var5 = arg0 + -1 & arg3;
        int var6 = 113 / ((arg2 - 38) / 46);
        int var7 = arg1 / arg0;
        int var8 = arg1 & arg0 - 1;
        int var9 = class151.method1087(var7, (byte) 67, var4);
        int var10 = class151.method1087(var7, (byte) 67, var4 + 1);
        int var11 = class151.method1087(var7 - -1, (byte) 67, var4);
        int var12 = class151.method1087(var7 + 1, (byte) 67, var4 + 1);
        int var13 = class79.method560(var5, arg0, var10, var9, -12684);
        int var14 = class79.method560(var5, arg0, var12, var11, -12684);
        return class79.method560(var8, arg0, var14, var13, -12684);
    }
}
