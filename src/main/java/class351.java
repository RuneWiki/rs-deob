import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class351 extends class358 {

    @OriginalMember(owner = "client!nn", name = "I", descriptor = "Ldk;")
    public static class435 field4715 = new class435(3);

    @OriginalMember(owner = "client!nn", name = "J", descriptor = "Lej;")
    public static class104 field4716 = new class104("Loaded JAGMISC", "JAGMISC geladen", "JAGMISC chargé", "JAGMISC carregado");

    @OriginalMember(owner = "client!nn", name = "D", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!nn", name = "E", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!nn", name = "F", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!nn", name = "G", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!nn", name = "H", descriptor = "[B")
    private byte[] field4714;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IBB)V")
    public final void method1916(int arg0, byte arg1, byte arg2) {
        field4710++;
        int var4 = arg0 * 2;
        byte var5 = (byte) ((arg1 >> 1 & 0x7F) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field4714[var10001] = var5;
        this.field4714[var6] = var5;
        if (arg2 < 42) {
            field4718 = -6;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIII)[B")
    public final byte[] method2106(int arg0, int arg1, int arg2, int arg3) {
        field4711++;
        this.field4714 = new byte[arg2 * arg3 * arg0 * 2];
        int var5 = -120 % ((arg1 - 35) / 57);
        this.method2367(arg3, arg0, true, arg2);
        return this.field4714;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
    public class351() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II[[BI[I[I[B[[B)I")
    public static final int method2107(int arg0, int arg1, byte[][] arg2, int arg3, int[] arg4, int[] arg5, byte[] arg6, byte[][] arg7) {
        field4713++;
        int var8 = arg4[arg0];
        int var9 = arg5[arg0] + var8;
        int var10 = arg4[arg1];
        int var11 = arg5[arg1] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg6[arg0] & 0xFF;
        if ((arg6[arg1] & 0xFF) < var14) {
            var14 = arg6[arg1] & 0xFF;
        }
        byte[] var15 = arg2[arg0];
        byte[] var16 = arg7[arg1];
        if (arg3 != 2) {
            method2108(null, 10);
        }
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Ldv;I)V")
    public static final void method2108(class566 arg0, int arg1) {
        class479.field6754.method1236(true, arg0.method3222((byte) -80));
        if (arg1 != -10511) {
            method2107(13, 48, null, 111, null, null, null, null);
        }
        field4712++;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V")
    public static void method2109(byte arg0) {
        if (arg0 > -69) {
            field4718 = 118;
        }
        field4715 = null;
        field4716 = null;
    }
}
