import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class97 {

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "Z")
    public boolean field1328 = true;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    private int field1326 = -1;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    private int field1321;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "Len;")
    private class478 field1317;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "Ltea;")
    private class481 field1323;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    private int field1324;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "Lhh;")
    private class666 field1325;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "Lls;")
    private class459 field1316;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "Lfh;")
    public static class266 field1320 = new class266(13, 7);

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILhh;)V", line = 4)
    public final void method557(int arg0, int arg1, class666 arg2) {
        field1329++;
        if (arg0 < 64) {
            field1320 = null;
        }
        if (arg1 > 0) {
            this.method560(false);
            this.field1317.method2596(this.field1316, 0);
            this.field1317.method1700(this.field1324 + 1 - this.field1318, class365.field4648, 0, 12896, arg1, this.field1318, arg2);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V", line = 22)
    public final void method558(int arg0) {
        if (arg0 >= -8) {
            method559(true);
        }
        field1319++;
        this.method557(114, this.field1327, this.field1325);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V", line = 33)
    public static void method559(boolean arg0) {
        field1320 = null;
        if (!arg0) {
            field1320 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(Z)V", line = 55)
    private final void method560(boolean arg0) {
        field1330++;
        if (!this.field1328) {
            return;
        }
        this.field1328 = arg0;
        byte[] var2 = this.field1323.field6390;
        int var3 = 0;
        int var4 = this.field1323.field6399;
        int var5 = this.field1323.field6399 * this.field1321 + this.field1322;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field1316 != null && this.field1326 == var3) {
            this.field1328 = false;
            return;
        }
        this.field1326 = var3;
        int var7 = this.field1321 * var4 + this.field1322;
        int var8 = 0;
        if (!this.field1317.method1687(85, class117.field1509, class586.field8227)) {
            if (class650.field9174 == null) {
                class650.field9174 = new int[16384];
            }
            int[] var13 = class650.field9174;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var7] == 0) {
                        int var16 = 0;
                        if (var2[var7 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var4 + var7] != 0) {
                            var16++;
                        }
                        var13[var8++] = var16 * 17 << 24;
                    } else {
                        var13[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field1323.field6399 - 128;
            }
            if (this.field1316 == null) {
                this.field1316 = this.field1317.method2576(128, false, 128, class650.field9174, (byte) 78);
                this.field1316.method525((byte) -81, false, false);
            } else {
                this.field1316.method520(0, (byte) 75, 128, class650.field9174, 0, 128, 128, 0);
            }
            return;
        }
        if (class75.field1020 == null) {
            class75.field1020 = new byte[16384];
        }
        byte[] var9 = class75.field1020;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var7] == 0) {
                    int var12 = 0;
                    if (var2[var7 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var7 + var4] != 0) {
                        var12++;
                    }
                    var9[var8++] = (byte) (var12 * 17);
                } else {
                    var9[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field1323.field6399 - 128;
        }
        if (this.field1316 == null) {
            this.field1316 = this.field1317.method2592(class75.field1020, 128, 128, class586.field8227, false, (byte) 73);
            this.field1316.method525((byte) -81, false, false);
        } else {
            this.field1316.method523(0, class75.field1020, class586.field8227, 0, 128, 128, 996, 128, 0);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Len;Ltea;Ldaa;IIIII)V", line = 229)
    public class97(class478 arg0, class481 arg1, class260 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1322 = arg6;
        this.field1321 = arg7;
        this.field1317 = arg0;
        this.field1323 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field3441 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field3201[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field1316 = null;
            this.field1327 = 0;
        } else {
            this.field1324 = Integer.MIN_VALUE;
            this.field1318 = Integer.MAX_VALUE;
            this.field1325 = this.field1317.method1680(false, 16);
            this.field1325.method619(27209, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field1325.method1486((byte) -88, true);
                if (var15 != null) {
                    Stream var16 = this.field1317.method2573(var15, 111);
                    if (Stream.method3420()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field3441 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field3201[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 < this.field1318) {
                                            this.field1318 = var28;
                                        }
                                        if (var28 > this.field1324) {
                                            this.field1324 = var28;
                                        }
                                        var16.method3422(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field3441 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field3201[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 > this.field1324) {
                                            this.field1324 = var22;
                                        }
                                        if (this.field1318 > var22) {
                                            this.field1318 = var22;
                                        }
                                        var16.method3430(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3424();
                    if (this.field1325.method1485((byte) 74)) {
                        break;
                    }
                }
            }
            this.field1327 = var10 / 3;
        }
    }
}
