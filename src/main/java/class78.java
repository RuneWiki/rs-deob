import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class78 {

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "Z")
    public boolean field1265 = false;

    @OriginalMember(owner = "client!dba", name = "n", descriptor = "I")
    public int field1273 = 0;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
    public int field1264 = -1;

    @OriginalMember(owner = "client!dba", name = "p", descriptor = "I")
    public int field1275 = -1;

    @OriginalMember(owner = "client!dba", name = "k", descriptor = "I")
    public int field1270 = -1;

    @OriginalMember(owner = "client!dba", name = "r", descriptor = "I")
    public int field1277 = -1;

    @OriginalMember(owner = "client!dba", name = "s", descriptor = "Z")
    public boolean field1278 = false;

    @OriginalMember(owner = "client!dba", name = "q", descriptor = "I")
    public int field1276 = 5;

    @OriginalMember(owner = "client!dba", name = "w", descriptor = "I")
    public int field1282 = 2;

    @OriginalMember(owner = "client!dba", name = "y", descriptor = "I")
    public int field1284 = 99;

    @OriginalMember(owner = "client!dba", name = "C", descriptor = "I")
    public int field1288 = -1;

    @OriginalMember(owner = "client!dba", name = "x", descriptor = "Z")
    public boolean field1283 = false;

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "I")
    public static int field1266 = 503;

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "I")
    public static int field1268 = -1;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public static int field1262 = 0;

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!dba", name = "l", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!dba", name = "m", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!dba", name = "o", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!dba", name = "t", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!dba", name = "v", descriptor = "I")
    public int field1281;

    @OriginalMember(owner = "client!dba", name = "z", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!dba", name = "D", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!dba", name = "E", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!dba", name = "A", descriptor = "Lbu;")
    public class18 field1286;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "Lnb;")
    public static class251 field1263;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "[I")
    public int[] field1260;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "[I")
    public int[] field1261;

    @OriginalMember(owner = "client!dba", name = "B", descriptor = "[I")
    private int[] field1287;

    @OriginalMember(owner = "client!dba", name = "j", descriptor = "[Z")
    public boolean[] field1269;

    @OriginalMember(owner = "client!dba", name = "u", descriptor = "[[I")
    public int[][] field1280;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIILr;I)Lr;")
    public final class157 method600(int arg0, int arg1, int arg2, int arg3, class157 arg4, int arg5) {
        field1290++;
        int var7 = this.field1260[arg3];
        int var8 = this.field1261[arg3];
        class353 var9 = this.field1286.method194(var8 >> 16, false);
        int var10 = var8 & arg0;
        if (var9 == null) {
            return arg4.method163((byte) 1, arg2, true);
        }
        class353 var11 = null;
        if ((this.field1278 || class536.field7500) && arg5 != -1 && arg5 < this.field1261.length) {
            int var12 = this.field1261[arg5];
            var11 = this.field1286.method194(var12 >> 16, false);
            arg5 = var12 & 0xFFFF;
        }
        class353 var13 = null;
        class353 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field1287 != null) {
            if (this.field1287.length > arg3) {
                var15 = this.field1287[arg3];
                if (var15 != 65535) {
                    var13 = this.field1286.method194(var15 >> 16, false);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field1278 || class536.field7500) && arg5 != -1 && arg5 < this.field1287.length) {
                var16 = this.field1287[arg5];
                if (var16 != 65535) {
                    var14 = this.field1286.method194(var16 >> 16, false);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field1265) {
            arg2 |= 0x200;
        }
        if (var9.method2115(var10, true)) {
            arg2 |= 0x80;
        }
        if (var9.method2116((byte) 124, var10)) {
            arg2 |= 0x100;
        }
        if (var9.method2117(var10, (byte) 69)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2115(var15, true)) {
                arg2 |= 0x80;
            }
            if (var13.method2116((byte) -45, var15)) {
                arg2 |= 0x100;
            }
            if (var13.method2117(var15, (byte) 69)) {
                arg2 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2115(arg5, true)) {
                arg2 |= 0x80;
            }
            if (var11.method2116((byte) 97, arg5)) {
                arg2 |= 0x100;
            }
            if (var11.method2117(arg5, (byte) 69)) {
                arg2 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2115(var16, true)) {
                arg2 |= 0x80;
            }
            if (var14.method2116((byte) -47, var16)) {
                arg2 |= 0x100;
            }
            if (var14.method2117(var16, (byte) 69)) {
                arg2 |= 0x400;
            }
        }
        int var17 = arg2 | 0x20;
        class157 var18 = arg4.method163((byte) 1, var17, true);
        var18.method1014(0, var11, this.field1265, 16384, var9, var10, var7, arg5, arg1 - 1);
        if (var13 != null) {
            var18.method1014(0, var14, this.field1265, arg0 ^ 0xBFFF, var13, var15, var7, var16, arg1 - 1);
        }
        return var18;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Ldaa;I)V")
    public final void method601(class11 arg0, int arg1) {
        if (arg1 != 0) {
            this.method609(null, 57, 90);
        }
        field1289++;
        while (true) {
            int var3 = arg0.method110((byte) 23);
            if (var3 == 0) {
                return;
            }
            this.method609(arg0, -27734, var3);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)V")
    public static final void method602(byte arg0) {
        if (arg0 <= 63) {
            return;
        }
        field1285++;
        int var1 = class491.field6875.method2597(class103.field1570, 1);
        if (var1 == 0) {
            class485.field6824 = null;
            class465.method2716((byte) 52, 0);
        } else if (var1 == 1) {
            class398.method2380((byte) 0, -123);
            class465.method2716((byte) 66, 512);
            if (class80.field1299 != null) {
                class597.method3529((byte) -23);
            }
        } else {
            class398.method2380((byte) (class143.field2215 - 4 & 0xFF), -121);
            class465.method2716((byte) 19, 2);
        }
        class235.field3303 = class206.field2901;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIZI)I")
    public final int method603(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg0 > -105) {
            method607(66);
        }
        field1279++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field1261[arg3];
        class353 var8 = null;
        class353 var9 = this.field1286.method194(var7 >> 16, false);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field1278 || class536.field7500) && arg1 != -1 && this.field1261.length > arg1) {
            int var11 = this.field1261[arg1];
            var8 = this.field1286.method194(var11 >> 16, false);
            var6 = var11 & 0xFFFF;
        }
        if (this.field1265) {
            var5 |= 0x200;
        }
        if (var9.method2115(var10, true)) {
            var5 |= 0x80;
        }
        if (var9.method2116((byte) 75, var10)) {
            var5 |= 0x100;
        }
        if (var9.method2117(var10, (byte) 69)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2115(var6, true)) {
                var5 |= 0x80;
            }
            if (var8.method2116((byte) -72, var6)) {
                var5 |= 0x100;
            }
            if (var8.method2117(var6, (byte) 69)) {
                var5 |= 0x400;
            }
        }
        if (this.field1287 != null && arg2) {
            if (arg3 < this.field1287.length) {
                int var12 = this.field1287[arg3];
                if (var12 != 65535) {
                    class353 var13 = this.field1286.method194(var12 >> 16, false);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2115(var14, true)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2116((byte) 122, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method2117(var14, (byte) 69)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field1278 || class536.field7500) && arg1 != -1 && arg1 < this.field1287.length) {
                int var15 = this.field1287[arg1];
                if (var15 != 65535) {
                    class353 var16 = this.field1286.method194(var15 >> 16, false);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2115(var17, true)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2116((byte) -100, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method2117(var17, (byte) 69)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(BI[F)[F")
    public static final float[] method604(byte arg0, int arg1, float[] arg2) {
        field1271++;
        if (arg0 != 1) {
            method604((byte) 78, 85, null);
        }
        float[] var3 = new float[arg1];
        class416.method2500(arg2, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method605(int arg0, int arg1, int arg2, Class arg3) {
        class622 var4 = class356.field4807[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class559 var5 = var4.field8973; var5 != null; var5 = var5.field7736) {
            class425 var6 = var5.field7742;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6036 == arg1 && var6.field6028 == arg2) {
                class431.method2563(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(B)V")
    public final void method606(byte arg0) {
        if (arg0 != -108) {
            this.field1269 = null;
        }
        field1274++;
        if (this.field1288 == -1) {
            if (this.field1269 == null) {
                this.field1288 = 0;
            } else {
                this.field1288 = 2;
            }
        }
        if (this.field1275 != -1) {
            return;
        }
        if (this.field1269 == null) {
            this.field1275 = 0;
        } else {
            this.field1275 = 2;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V")
    public static void method607(int arg0) {
        if (arg0 >= -59) {
            method605(21, -35, 39, null);
        }
        field1263 = null;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILr;BIIIII)Lr;")
    public final class157 method608(int arg0, class157 arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1272++;
        int var9 = this.field1260[arg6];
        int var10 = this.field1261[arg6];
        if (arg0 != -15299) {
            this.field1286 = null;
        }
        class353 var11 = this.field1286.method194(var10 >> 16, false);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg1.method163(arg2, arg5, true);
        }
        class353 var13 = null;
        if ((this.field1278 || class536.field7500) && arg3 != -1 && this.field1261.length > arg3) {
            int var14 = this.field1261[arg3];
            var13 = this.field1286.method194(var14 >> 16, false);
            arg3 = var14 & 0xFFFF;
        }
        if (this.field1265) {
            arg5 |= 0x200;
        }
        if (var11.method2115(var12, true)) {
            arg5 |= 0x80;
        }
        if (var11.method2116((byte) 119, var12)) {
            arg5 |= 0x100;
        }
        if (var11.method2117(var12, (byte) 69)) {
            arg5 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2115(arg3, true)) {
                arg5 |= 0x80;
            }
            if (var13.method2116((byte) -51, arg3)) {
                arg5 |= 0x100;
            }
            if (var13.method2117(arg3, (byte) 69)) {
                arg5 |= 0x400;
            }
        }
        int var15 = arg5 | 0x20;
        class157 var16 = arg1.method163(arg2, var15, true);
        var16.method1014(arg4, var13, this.field1265, 16384, var11, var12, var9, arg3, arg7 - 1);
        return var16;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Ldaa;II)V")
    private final void method609(class11 arg0, int arg1, int arg2) {
        field1267++;
        if (arg1 != -27734) {
            return;
        }
        if (arg2 == 1) {
            int var4 = arg0.method93((byte) 76);
            this.field1260 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1260[var5] = arg0.method93((byte) 82);
            }
            this.field1261 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1261[var6] = arg0.method93((byte) 94);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1261[var7] = (arg0.method93((byte) 103) << 16) + this.field1261[var7];
            }
        } else if (arg2 == 2) {
            this.field1270 = arg0.method93((byte) 124);
        } else if (arg2 == 3) {
            this.field1269 = new boolean[256];
            int var15 = arg0.method110((byte) 46);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field1269[arg0.method110((byte) 98)] = true;
            }
        } else if (arg2 == 5) {
            this.field1276 = arg0.method110((byte) 56);
        } else if (arg2 == 6) {
            this.field1277 = arg0.method93((byte) 127);
        } else if (arg2 == 7) {
            this.field1264 = arg0.method93((byte) 121);
        } else if (arg2 == 8) {
            this.field1284 = arg0.method110((byte) 32);
        } else if (arg2 == 9) {
            this.field1275 = arg0.method110((byte) 35);
        } else if (arg2 == 10) {
            this.field1288 = arg0.method110((byte) 55);
        } else if (arg2 == 11) {
            this.field1282 = arg0.method110((byte) 57);
        } else if (arg2 == 12) {
            int var8 = arg0.method110((byte) 44);
            this.field1287 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1287[var9] = arg0.method93((byte) 111);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field1287[var10] += arg0.method93((byte) 103) << 16;
            }
        } else if (arg2 == 13) {
            int var11 = arg0.method93((byte) 104);
            this.field1280 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg0.method110((byte) 40);
                if (var13 > 0) {
                    this.field1280[var12] = new int[var13];
                    this.field1280[var12][0] = arg0.method89((byte) -43);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field1280[var12][var14] = arg0.method93((byte) 108);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field1265 = true;
        } else if (arg2 == 15) {
            this.field1278 = true;
        } else if (arg2 == 16) {
            this.field1283 = true;
        } else if (arg2 == 17) {
            this.field1273 = arg0.method110((byte) 73);
            return;
        }
    }
}
