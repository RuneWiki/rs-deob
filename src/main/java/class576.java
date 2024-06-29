import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class576 {

    @OriginalMember(owner = "client!lw", name = "o", descriptor = "I")
    public int field8318 = -1;

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "I")
    private int field8311 = 0;

    @OriginalMember(owner = "client!lw", name = "q", descriptor = "I")
    private int field8320 = 0;

    @OriginalMember(owner = "client!lw", name = "u", descriptor = "I")
    private int field8324 = 128;

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
    private int field8321 = 0;

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "B")
    public byte field8308 = 0;

    @OriginalMember(owner = "client!lw", name = "l", descriptor = "I")
    private int field8315 = -1;

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "I")
    private int field8329 = 128;

    @OriginalMember(owner = "client!lw", name = "y", descriptor = "Z")
    public boolean field8328 = false;

    @OriginalMember(owner = "client!lw", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field8326 = new String[100];

    @OriginalMember(owner = "client!lw", name = "k", descriptor = "Lig;")
    public static class206 field8314 = new class206(82, 3);

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "I")
    public static int field8306;

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "I")
    public static int field8307;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "I")
    public int field8312;

    @OriginalMember(owner = "client!lw", name = "m", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!lw", name = "n", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!lw", name = "p", descriptor = "I")
    public static int field8319;

    @OriginalMember(owner = "client!lw", name = "t", descriptor = "I")
    public static int field8323;

    @OriginalMember(owner = "client!lw", name = "v", descriptor = "I")
    private int field8325;

    @OriginalMember(owner = "client!lw", name = "x", descriptor = "I")
    public static int field8327;

    @OriginalMember(owner = "client!lw", name = "A", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "Lpn;")
    public class644 field8313;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "[S")
    private short[] field8304;

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "[S")
    private short[] field8305;

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "[S")
    private short[] field8309;

    @OriginalMember(owner = "client!lw", name = "s", descriptor = "[S")
    private short[] field8322;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIJ)V", line = 3)
    public static final void method3342(int arg0, int arg1, int arg2, long arg3) {
        field8327++;
        int var5 = (int) arg3 >> 14 & 0x1F;
        int var6 = ((int) arg3 & 0x3057AC) >> 20;
        if (arg0 > -4) {
            return;
        }
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class242.method1612(arg2, 0, true, var6, var5, 0, 0, (byte) 97, arg1);
            return;
        }
        class385 var8 = class575.field8301.method1499(-7532, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field5858;
            var10 = var8.field5860;
        } else {
            var9 = var8.field5860;
            var10 = var8.field5858;
        }
        int var11 = var8.field5820;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class242.method1612(arg2, var9, true, 0, 0, var10, var11, (byte) 84, arg1);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lqi;IIILoa;ZI)Lba;", line = 50)
    public final class327 method3343(class494 arg0, int arg1, int arg2, int arg3, class605 arg4, boolean arg5, int arg6) {
        field8307++;
        if (!arg5) {
            this.field8305 = null;
        }
        return this.method3349(arg3, null, 0, arg0, (byte) 5, arg2, arg4, null, arg6, 0, false, arg1, 0, 16384);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(BLd;Lqi;IIIIILoa;ZLd;II)Lba;", line = 68)
    public final class327 method3344(byte arg0, class132 arg1, class494 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class605 arg8, boolean arg9, class132 arg10, int arg11, int arg12) {
        field8317++;
        if (arg0 != 2) {
            this.field8305 = null;
        }
        return this.method3349(arg3, arg10, arg12, arg2, (byte) 2, arg6, arg8, arg1, arg5, arg11, arg9, arg7, arg4, 16384);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V", line = 81)
    public static void method3345(int arg0) {
        int var1 = -29 / ((-arg0 - 71) / 47);
        field8314 = null;
        field8326 = null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILrt;)V", line = 104)
    public final void method3346(int arg0, class194 arg1) {
        if (arg0 != -1) {
            return;
        }
        field8316++;
        while (true) {
            int var3 = arg1.method1177(255);
            if (var3 == 0) {
                return;
            }
            this.method3347((byte) -43, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(BLrt;I)V", line = 144)
    private final void method3347(byte arg0, class194 arg1, int arg2) {
        if (arg0 != -43) {
            this.field8325 = -88;
        }
        if (arg2 == 1) {
            this.field8325 = arg1.method1220(121);
        } else if (arg2 == 2) {
            this.field8318 = arg1.method1220(arg0 + 170);
        } else if (arg2 == 4) {
            this.field8329 = arg1.method1220(124);
        } else if (arg2 == 5) {
            this.field8324 = arg1.method1220(-81);
        } else if (arg2 == 6) {
            this.field8320 = arg1.method1220(-58);
        } else if (arg2 == 7) {
            this.field8311 = arg1.method1177(255);
        } else if (arg2 == 8) {
            this.field8321 = arg1.method1177(255);
        } else if (arg2 == 9) {
            this.field8308 = 3;
            this.field8315 = 8224;
        } else if (arg2 == 10) {
            this.field8328 = true;
        } else if (arg2 == 11) {
            this.field8308 = 1;
        } else if (arg2 == 12) {
            this.field8308 = 4;
        } else if (arg2 == 13) {
            this.field8308 = 5;
        } else if (arg2 == 14) {
            this.field8308 = 2;
            this.field8315 = arg1.method1177(255) * 256;
        } else if (arg2 == 15) {
            this.field8308 = 3;
            this.field8315 = arg1.method1220(arg0 ^ 0x76);
        } else if (arg2 == 16) {
            this.field8308 = 3;
            this.field8315 = arg1.method1178(-230315992);
        } else if (arg2 == 40) {
            int var6 = arg1.method1177(255);
            this.field8322 = new short[var6];
            this.field8309 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field8309[var7] = (short) arg1.method1220(122);
                this.field8322[var7] = (short) arg1.method1220(arg0 + 161);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method1177(255);
            this.field8305 = new short[var4];
            this.field8304 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8304[var5] = (short) arg1.method1220(123);
                this.field8305[var5] = (short) arg1.method1220(-95);
            }
        }
        field8323++;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "([BI)Lka;", line = 269)
    public static final class407 method3348(byte[] arg0, int arg1) {
        field8306++;
        class407 var2 = new class407();
        class194 var3 = new class194(arg0);
        var3.field2610 = var3.field2622.length - 2;
        int var4 = var3.method1220(arg1 ^ 0x65);
        int var5 = var3.field2622.length - var4 - 2 - 12;
        var3.field2610 = var5;
        int var6 = var3.method1178(arg1 - 230315991);
        var2.field6134 = var3.method1220(-57);
        var2.field6130 = var3.method1220(arg1 ^ 0x29);
        var2.field6142 = var3.method1220(arg1 ^ 0xFFFFFF85);
        var2.field6139 = var3.method1220(-25);
        int var7 = var3.method1177(255);
        if (arg1 > ~var7) {
            var2.field6133 = new class80[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1220(115);
                class80 var10 = new class80(class367.method2354(-224121456, var9));
                var2.field6133[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method1178(-230315992);
                    int var12 = var3.method1178(arg1 - 230315991);
                    var10.method520((byte) -86, new class388(var12), (long) var11);
                }
            }
        }
        var3.field2610 = 0;
        var2.field6143 = var3.method1224(0);
        var2.field6129 = new int[var6];
        var2.field6137 = new int[var6];
        var2.field6135 = new String[var6];
        int var13 = 0;
        while (var3.field2610 < var5) {
            int var14 = var3.method1220(arg1 ^ 0x44);
            if (var14 == 3) {
                var2.field6135[var13] = var3.method1218(false).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field6129[var13] = var3.method1177(255);
            } else {
                var2.field6129[var13] = var3.method1178(-230315992);
            }
            var2.field6137[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILd;ILqi;BILoa;Ld;IIZIII)Lba;", line = 346)
    private final class327 method3349(int arg0, class132 arg1, int arg2, class494 arg3, byte arg4, int arg5, class605 arg6, class132 arg7, int arg8, int arg9, boolean arg10, int arg11, int arg12, int arg13) {
        field8310++;
        int var15 = arg0;
        class177 var16 = this.field8318 == -1 || arg11 == -1 ? null : arg3.method2961(this.field8318, 8);
        boolean var17 = arg10 & this.field8308 != 0;
        if (var16 != null) {
            var15 = arg0 | var16.method1005(arg5, arg11, false, 125);
        }
        if (var17) {
            var15 |= this.field8308 == 3 ? 7 : 2;
        }
        if (this.field8324 != 128) {
            var15 |= 0x2;
        }
        if (this.field8329 != 128 || this.field8320 != 0) {
            var15 |= 0x5;
        }
        class277 var18 = this.field8313.field9288;
        class327 var19;
        synchronized (this.field8313.field9288) {
            var19 = (class327) this.field8313.field9288.method1801(arg13 ^ arg13, (long) (this.field8312 |= arg6.field8846 << 29));
        }
        if (var19 == null || arg6.method293(var19.method1375(), var15) != 0) {
            if (var19 != null) {
                var15 = arg6.method300(var15, var19.method1375());
            }
            int var20 = var15;
            if (this.field8309 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field8304 != null) {
                var20 |= 0x8000;
            }
            class557 var21 = class471.method2890(0, this.field8325, arg13 - 16451, this.field8313.field9279);
            if (var21 == null) {
                return null;
            }
            if (var21.field7946 < 13) {
                var21.method3224(-16503, 2);
            }
            var19 = arg6.method326(var21, var20, this.field8313.field9289, this.field8311 + 64, this.field8321 + 850);
            if (this.field8309 != null) {
                for (int var22 = 0; var22 < this.field8309.length; var22++) {
                    var19.method1351(this.field8309[var22], this.field8322[var22]);
                }
            }
            if (this.field8304 != null) {
                for (int var23 = 0; var23 < this.field8304.length; var23++) {
                    var19.method1399(this.field8304[var23], this.field8305[var23]);
                }
            }
            var19.method1376(var15);
            class277 var24 = this.field8313.field9288;
            synchronized (this.field8313.field9288) {
                this.field8313.field9288.method1808((long) (this.field8312 |= arg6.field8846 << 29), var19, (byte) -120);
            }
        }
        class327 var25 = var16 == null ? var19.method1382(arg4, var15, true) : var16.method1012(var15, arg5, arg4, arg13 - 33868, arg11, 0, var19, arg8);
        if (this.field8329 != 128 || this.field8324 != 128) {
            var25.method1369(this.field8329, this.field8324, this.field8329);
        }
        if (this.field8320 != 0) {
            if (this.field8320 == 90) {
                var25.method1385(4096);
            }
            if (this.field8320 == 180) {
                var25.method1385(8192);
            }
            if (this.field8320 == 270) {
                var25.method1385(12288);
            }
        }
        if (var17) {
            var25.method1391(this.field8308, this.field8315, arg7, arg1, arg12, arg2, arg9);
        }
        var25.method1376(arg0);
        return var25;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IILqi;ILoa;II)Lba;", line = 460)
    public final class327 method3350(int arg0, int arg1, class494 arg2, int arg3, class605 arg4, int arg5, int arg6) {
        if (arg3 < 50) {
            this.method3343(null, -57, 86, 106, null, false, 77);
        }
        field8319++;
        return this.method3349(arg1, null, 0, arg2, (byte) 2, arg5, arg4, null, arg6, 0, false, arg0, 0, 16384);
    }
}
