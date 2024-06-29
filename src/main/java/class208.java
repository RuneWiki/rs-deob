import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class208 {

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    private int field3275 = -1;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    private int field3271 = 0;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lad;")
    private class128 field3274 = new class128();

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "Z")
    public boolean field3287 = false;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    private int field3280;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    private int field3283;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "[[I")
    private int[][] field3279;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "[Lfn;")
    private class31[] field3278;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "[[[B")
    public static byte[][][] field3272 = new byte[4][104][104];

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Lom;")
    public static class70 field3270 = null;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "[I")
    public static int[] field3281 = new int[14];

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field3286 = 0;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)[[I", line = 8)
    public final int[][] method1480(byte arg0) {
        field3273++;
        if (this.field3283 != this.field3280) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3280; var2++) {
            this.field3278[var2] = class155.field2334;
        }
        if (arg0 != -65) {
            this.field3280 = -80;
        }
        return this.field3279;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)[I", line = 42)
    public final int[] method1481(int arg0, byte arg1) {
        field3285++;
        if (arg1 >= -19) {
            this.field3280 = 69;
        }
        if (this.field3283 == this.field3280) {
            this.field3287 = this.field3278[arg0] == null;
            this.field3278[arg0] = class155.field2334;
            return this.field3279[arg0];
        } else if (this.field3280 == 1) {
            this.field3287 = this.field3275 != arg0;
            this.field3275 = arg0;
            return this.field3279[0];
        } else {
            class31 var3 = this.field3278[arg0];
            if (var3 == null) {
                this.field3287 = true;
                if (this.field3271 >= this.field3280) {
                    class31 var4 = (class31) this.field3274.method974(0);
                    var3 = new class31(arg0, var4.field392);
                    this.field3278[var4.field395] = null;
                    var4.method1554((byte) -86);
                } else {
                    var3 = new class31(arg0, this.field3271);
                    this.field3271++;
                }
                this.field3278[arg0] = var3;
            } else {
                this.field3287 = false;
            }
            this.field3274.method984(var3, (byte) 121);
            return this.field3279[var3.field392];
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 110)
    public final void method1482(int arg0) {
        field3277++;
        for (int var2 = 0; var2 < this.field3280; var2++) {
            this.field3279[var2] = null;
        }
        this.field3278 = null;
        this.field3279 = (int[][]) null;
        this.field3274.method980(1);
        this.field3274 = null;
        if (arg0 != 2) {
            method1483((byte) -96);
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V", line = 132)
    public static void method1483(byte arg0) {
        field3270 = null;
        field3281 = null;
        int var1 = -65 / ((arg0 - 1) / 33);
        field3272 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIII)V", line = 143)
    public static final void method1484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class41.field614 = arg3;
        if (arg1 > -101) {
            return;
        }
        class222.field3473 = arg0;
        class253.field3772 = arg5;
        class329.field5086 = arg2;
        class110.field1745 = arg4;
        field3282++;
        if (class222.field3473 >= 100) {
            int var6 = class110.field1745 * 128 + 64;
            int var7 = class329.field5086 * 128 + 64;
            int var8 = class294.method2080(899, var7, var6, class50.field775) - class41.field614;
            int var9 = var6 - class220.field3455;
            int var10 = var8 - class294.field4628;
            int var11 = var7 - class311.field4845;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class89.field1299 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class203.field3227 = (int) (-325.949D * Math.atan2((double) var9, (double) var11)) & 0x7FF;
            if (class89.field1299 < 128) {
                class89.field1299 = 128;
            }
            if (class89.field1299 > 383) {
                class89.field1299 = 383;
            }
        }
        class78.field1104 = 2;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(III)V", line = 276)
    public class208(int arg0, int arg1, int arg2) {
        this.field3280 = arg0;
        this.field3283 = arg1;
        this.field3279 = new int[this.field3280][arg2];
        this.field3278 = new class31[this.field3283];
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)V", line = 208)
    public static final void method1485(int arg0, boolean arg1) {
        class30.field383 = (int[][][]) null;
        class207.field3268 = (byte[][][]) null;
        class152.field2294 = (int[][][]) null;
        class62.field944 = (byte[][][]) null;
        class253.field3774 = null;
        class124.field1961 = (int[][][]) null;
        class279.field4294 = null;
        class64.field959 = (byte[][][]) null;
        class159.field2374 = (byte[][][]) null;
        field3284++;
        class204.field3244 = 0;
        if (arg1 && class154.field2332 != null) {
            class32.field408 = class154.field2332.field3021;
        } else {
            class32.field408 = null;
        }
        class176.field2612 = (byte[][][]) null;
        class154.field2332 = null;
        class95.field1363.method980(1);
        class92.field1334 = null;
        class257.field3832 = -1;
        class162.field2400 = null;
        class43.field682 = null;
        class309.field4828 = null;
        class62.field940 = null;
        class200.field3179 = null;
        class200.field3181 = null;
        class138.field2158 = null;
        if (arg0 != 128) {
            method1483((byte) 19);
        }
        class152.field2283 = null;
        class213.field3390 = null;
        class276.field4240 = null;
        class45.field713 = -1;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)I", line = 260)
    public static final int method1486(int arg0) {
        if (arg0 != 0) {
            field3281 = (int[]) null;
        }
        field3288++;
        return class318.field4959;
    }
}
