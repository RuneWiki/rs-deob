import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class201 {

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "Z")
    public boolean field2466 = true;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    private int field2460 = -1;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
    private int field2464;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "Lfo;")
    private class473 field2449;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "Lvh;")
    private class327 field2452;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    private int field2457;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "Lae;")
    private class228 field2458;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
    private int field2455;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "I")
    private int field2465;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "Ltj;")
    private class180 field2456;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "[F")
    public static float[] field2459 = new float[4];

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)V", line = 3)
    public static final void method1223(int arg0, int arg1) {
        field2462++;
        if (!class315.method1784(arg0, 4269)) {
            return;
        }
        class382[] var2 = class271.field3434[arg0];
        if (arg1 <= 12) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class382 var4 = var2[var3];
            if (var4 != null) {
                var4.field5027 = 0;
                var4.field4956 = 0;
                var4.field5061 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BIIII)I", line = 50)
    public static final int method1224(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2451++;
        int var5 = 121 / ((27 - arg0) / 51);
        int var6 = 65536 - class285.field3656[arg1 * 8192 / arg3] >> 1;
        return ((65536 - var6) * arg2 >> 16) + (arg4 * var6 >> 16);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)V", line = 68)
    public static void method1225(boolean arg0) {
        if (!arg0) {
            method1225(false);
        }
        field2459 = null;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V", line = 81)
    private final void method1226(int arg0) {
        field2461++;
        if (arg0 != -2927) {
            method1224((byte) -71, -63, -5, -25, 100);
        }
        if (!this.field2466) {
            return;
        }
        this.field2466 = false;
        byte[] var2 = this.field2452.field4250;
        int var3 = 0;
        int var4 = this.field2452.field4263;
        int var5 = this.field2464 + (this.field2452.field4263 * this.field2457);
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field2458 != null && this.field2460 == var3) {
            this.field2466 = false;
            return;
        }
        this.field2460 = var3;
        int var7 = 0;
        int var8 = this.field2464 + (this.field2457 * var4);
        if (!this.field2449.method1169(class595.field8446, class271.field3429, (byte) 125)) {
            if (class86.field916 == null) {
                class86.field916 = new int[16384];
            }
            int[] var13 = class86.field916;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var8] == 0) {
                        int var16 = 0;
                        if (var2[var8 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var4 + var8] != 0) {
                            var16++;
                        }
                        var13[var7++] = var16 * 17 << 24;
                    } else {
                        var13[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field2452.field4263 - 128;
            }
            if (this.field2458 == null) {
                this.field2458 = this.field2449.method2732(class86.field916, 128, false, 0, 128);
                this.field2458.method1331(-7684, false, false);
            } else {
                this.field2458.method1329(0, 0, 128, 128, 0, 128, (byte) 117, class86.field916);
            }
            return;
        }
        if (class43.field454 == null) {
            class43.field454 = new byte[16384];
        }
        byte[] var9 = class43.field454;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var4 + var8] != 0) {
                        var12++;
                    }
                    var9[var7++] = (byte) (var12 * 17);
                } else {
                    var9[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field2452.field4263 - 128;
        }
        if (this.field2458 == null) {
            this.field2458 = this.field2449.method2741(class595.field8446, false, class43.field454, 128, (byte) 113, 128);
            this.field2458.method1331(-7684, false, false);
        } else {
            this.field2458.method1325(-24967, 0, 128, 128, class43.field454, class595.field8446, 128, 0, 0);
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V", line = 250)
    public final void method1227(int arg0) {
        if (arg0 == -12447) {
            this.method1228(this.field2456, 28339, this.field2454);
            field2453++;
        }
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lfo;Lvh;Low;IIIII)V", line = 269)
    public class201(class473 arg0, class327 arg1, class314 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field2464 = arg6;
        this.field2449 = arg0;
        this.field2452 = arg1;
        this.field2457 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field1558 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field4076[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field2454 = 0;
            this.field2458 = null;
        } else {
            this.field2455 = Integer.MIN_VALUE;
            this.field2465 = Integer.MAX_VALUE;
            this.field2456 = this.field2449.method1181((byte) -125, false);
            this.field2456.method1024(-66, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field2456.method167(18829, true);
                if (var15 != null) {
                    Stream var16 = this.field2449.method2714(var15, (byte) -127);
                    if (Stream.method3440()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field1558 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field4076[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field2455 < var22) {
                                            this.field2455 = var22;
                                        }
                                        if (this.field2465 > var22) {
                                            this.field2465 = var22;
                                        }
                                        var16.method3435(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field1558 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field4076[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 > this.field2455) {
                                            this.field2455 = var28;
                                        }
                                        if (this.field2465 > var28) {
                                            this.field2465 = var28;
                                        }
                                        var16.method3439(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3434();
                    if (this.field2456.method170(9406)) {
                        break;
                    }
                }
            }
            this.field2454 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ltj;II)V", line = 436)
    public final void method1228(class180 arg0, int arg1, int arg2) {
        if (arg1 != 28339) {
            method1223(-15, -79);
        }
        field2463++;
        if (arg2 > 0) {
            this.method1226(-2927);
            this.field2449.method2696(-2, this.field2458);
            this.field2449.method1154(0, this.field2465, (byte) 17, class565.field8009, arg0, arg2, this.field2455 + 1 - this.field2465);
        }
    }
}
