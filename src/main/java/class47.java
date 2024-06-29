import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class47 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "[I")
    private int[] field1009;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[I")
    private int[] field1010;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lde;")
    private class107 field1014;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Lde;")
    private class107 field1015;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "[Lde;")
    private class107[] field1011;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lpj;")
    public static class237 field1016 = class33.method353("scrollen:", 45);

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lub;")
    public static class88 field1017 = new class88();

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lpj;")
    public static class237 field1021 = class33.method353("Schrifts-=tze geladen)3", 18);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Lpj;")
    public static class237 field1022 = class33.method353("Fallen lassen", 21);

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field1024 = 0;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method433(int arg0) {
        if (arg0 == 0) {
            field1021 = null;
            field1022 = null;
            field1016 = null;
            field1017 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z")
    public static final boolean method434(int arg0, int arg1) {
        field1018++;
        if (class257.field4423[arg1]) {
            return true;
        } else if (class203.field3477.method1650((byte) -80, arg1)) {
            int var2 = class203.field3477.method1638(arg1, (byte) -73);
            if (var2 == 0) {
                class257.field4423[arg1] = true;
                return true;
            }
            if (class22.field406[arg1] == null) {
                class22.field406[arg1] = new class141[var2];
            }
            for (int var3 = arg0; var3 < var2; var3++) {
                if (class22.field406[arg1][var3] == null) {
                    byte[] var4 = class203.field3477.method1645(true, var3, arg1);
                    if (var4 != null) {
                        class22.field406[arg1][var3] = new class141();
                        class22.field406[arg1][var3].field2530 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class22.field406[arg1][var3].method974((byte) 97, new class32(var4));
                        } else {
                            class22.field406[arg1][var3].method979(arg0 ^ 0xFFFFFF98, new class32(var4));
                        }
                    }
                }
            }
            class257.field4423[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lo;ILfa;)Z")
    public final boolean method435(class236 arg0, int arg1, class239 arg2) {
        field1012++;
        if (arg1 != 22096) {
            this.method436(89, -52, (class236) null, false, false, (class239) null, (byte) -28, -0.03388505289805108D);
        }
        for (int var4 = 0; var4 < this.field1009.length; var4++) {
            if (!arg2.method1639((byte) 108, this.field1009[var4])) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field1010.length; var5++) {
            if (!arg0.method88(this.field1010[var5], (byte) -99)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class47() {
        this.field1009 = new int[0];
        this.field1010 = new int[0];
        this.field1014 = new class111();
        this.field1014.field1906 = 1;
        this.field1015 = new class111();
        this.field1015.field1906 = 1;
        this.field1011 = new class107[] { this.field1014, this.field1015 };
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IILo;ZZLfa;BD)[I")
    public final int[] method436(int arg0, int arg1, class236 arg2, boolean arg3, boolean arg4, class239 arg5, byte arg6, double arg7) {
        class39.method404(arg7, 12);
        class71.field1401 = arg2;
        field1019++;
        class68.field1349 = arg5;
        int[] var10 = new int[arg0 * arg1];
        class55.method486((byte) -92, arg0, arg1);
        for (int var11 = 0; var11 < this.field1011.length; var11++) {
            this.field1011[var11].method801((byte) 126, arg1, arg0);
        }
        int var12;
        byte var13;
        int var14;
        if (arg4) {
            var12 = -1;
            var14 = arg0 - 1;
            var13 = -1;
        } else {
            var12 = arg0;
            var13 = 1;
            var14 = 0;
        }
        if (arg6 >= -64) {
            return null;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            if (arg3) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1014.field1897) {
                int[] var18 = this.field1014.method123((byte) -17, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1014.method240((byte) 125, var16);
                var20 = var22[0];
                var21 = var22[1];
                var19 = var22[2];
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class17.field297[var24];
                int var27 = var19[var23] >> 4;
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var28 = class17.field297[var25];
                int var29 = class17.field297[var27];
                var10[var15++] = (var28 << 16) + (var26 << 8) + var29;
                if (arg3) {
                    var15 += arg0 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1011.length; var17++) {
            this.field1011[var17].method793((byte) -99);
        }
        return var10;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZ[Lpj;)Lpj;")
    public static final class237 method437(int arg0, int arg1, boolean arg2, class237[] arg3) {
        field1013++;
        if (arg2) {
            return null;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg3[arg0 + var5] == null) {
                arg3[arg0 + var5] = class33.field708;
            }
            var4 += arg3[arg0 + var5].field4114;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class237 var10 = arg3[arg0 + var8];
            class171.method1182(var10.field4151, 0, var6, var7, var10.field4114);
            var7 += var10.field4114;
        }
        class237 var9 = new class237();
        var9.field4114 = var4;
        var9.field4151 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lie;)V")
    public class47(class32 arg0) {
        int var2 = arg0.method316((byte) 97);
        int var3 = 0;
        int[][] var4 = new int[var2][];
        int var5 = 0;
        this.field1011 = new class107[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class107 var16 = class127.method899(-16778, arg0);
            if (var16.method796(-107) >= 0) {
                var3++;
            }
            if (var16.method800(6249) >= 0) {
                var5++;
            }
            int var17 = var16.field1919.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method316((byte) -13);
            }
            this.field1011[var6] = var16;
        }
        this.field1009 = new int[var3];
        int var7 = 0;
        this.field1010 = new int[var5];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class107 var11 = this.field1011[var9];
            int var12 = var11.field1919.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1919[var13] = this.field1011[var4[var9][var13]];
            }
            int var14 = var11.method796(-115);
            int var15 = var11.method800(6249);
            if (var14 > 0) {
                this.field1009[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1010[var8++] = var15;
            }
            var4[var9] = null;
        }
        Object var10 = null;
        this.field1014 = this.field1011[arg0.method316((byte) 125)];
        this.field1015 = this.field1011[arg0.method316((byte) 11)];
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)I")
    public static final int method438(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }
}
