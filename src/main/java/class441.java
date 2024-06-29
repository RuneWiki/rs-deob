import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class441 {

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "Ljava/lang/String;")
    private String field6198 = "";

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    private int field6193 = -1;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    private int field6194 = -1;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "I")
    private int field6203 = -1;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
    private int field6200 = -1;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public int field6192 = 0;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
    public int field6199 = 0;

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
    public int field6204 = 0;

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "I")
    public int field6208 = -1;

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "I")
    public int field6210 = -1;

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "I")
    public int field6216 = 16777215;

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "I")
    public int field6212 = 70;

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "I")
    public int field6217 = -1;

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "Lmga;")
    public static class739 field6211 = new class739(42, -1);

    @OriginalMember(owner = "client!nv", name = "B", descriptor = "I")
    public static int field6219 = 0;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!nv", name = "A", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "Lhd;")
    public class773 field6213;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
    public static void method2650(byte arg0) {
        if (arg0 != -110) {
            field6218 = -106;
        }
        field6211 = null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lha;I)Lvr;")
    public final class147 method2651(class65 arg0, int arg1) {
        field6209++;
        if (arg1 > this.field6194) {
            return null;
        }
        class147 var3 = (class147) this.field6213.field10649.method1541(-10, (long) this.field6194);
        if (var3 == null) {
            this.method2655(~arg1, arg0);
            var3 = (class147) this.field6213.field10649.method1541(-10, (long) this.field6194);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method2652(byte arg0, int arg1) {
        int var3 = -30 / ((arg0 + 22) / 47);
        field6205++;
        String var4 = this.field6198;
        while (true) {
            int var5 = var4.indexOf("%1");
            if (var5 < 0) {
                return var4;
            }
            var4 = var4.substring(0, var5) + class544.method3098(arg1, 16051, false) + var4.substring(var5 + 2);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(Lha;I)Lvr;")
    public final class147 method2653(class65 arg0, int arg1) {
        field6207++;
        if (this.field6203 < arg1) {
            return null;
        }
        class147 var3 = (class147) this.field6213.field10649.method1541(-10, (long) this.field6203);
        if (var3 == null) {
            this.method2655(arg1 - 1, arg0);
            var3 = (class147) this.field6213.field10649.method1541(-10, (long) this.field6203);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjp;I)V")
    private final void method2654(int arg0, class376 arg1, int arg2) {
        if (arg0 != 2) {
            this.field6198 = null;
        }
        field6214++;
        if (arg2 == 1) {
            this.field6210 = arg1.method2359(-1);
        } else if (arg2 == 2) {
            this.field6216 = arg1.method2373(arg0 ^ 0x48E980DA);
        } else if (arg2 == 3) {
            this.field6193 = arg1.method2359(-1);
        } else if (arg2 == 4) {
            this.field6200 = arg1.method2359(-1);
        } else if (arg2 == 5) {
            this.field6203 = arg1.method2359(-1);
        } else if (arg2 == 6) {
            this.field6194 = arg1.method2359(-1);
        } else if (arg2 == 7) {
            this.field6199 = arg1.method2355(3);
        } else if (arg2 == 8) {
            this.field6198 = arg1.method2350(0);
        } else if (arg2 == 9) {
            this.field6212 = arg1.method2359(arg0 - 3);
        } else if (arg2 == 10) {
            this.field6204 = arg1.method2355(3);
        } else if (arg2 == 11) {
            this.field6217 = 0;
        } else if (arg2 == 12) {
            this.field6208 = arg1.method2398(arg0 ^ 0xAE2D8A0A);
        } else if (arg2 == 13) {
            this.field6192 = arg1.method2355(arg0 ^ 0x1);
            return;
        } else if (arg2 == 14) {
            this.field6217 = arg1.method2359(-1);
            return;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILha;)V")
    private final void method2655(int arg0, class65 arg1) {
        field6202++;
        class333 var3 = this.field6213.field10648;
        if (this.field6193 >= 0 && this.field6213.field10649.method1541(-10, (long) this.field6193) == null && var3.method2104(86, this.field6193)) {
            class508 var4 = class508.method2947(var3, this.field6193);
            this.field6213.field10649.method1544(true, arg1.method477(var4, true), (long) this.field6193);
        }
        if (this.field6203 >= 0 && this.field6213.field10649.method1541(-10, (long) this.field6203) == null && var3.method2104(arg0 ^ 0xFFFFFFB3, this.field6203)) {
            class508 var5 = class508.method2947(var3, this.field6203);
            this.field6213.field10649.method1544(true, arg1.method477(var5, true), (long) this.field6203);
        }
        if (arg0 >= ~this.field6200 && this.field6213.field10649.method1541(-10, (long) this.field6200) == null && var3.method2104(74, this.field6200)) {
            class508 var6 = class508.method2947(var3, this.field6200);
            this.field6213.field10649.method1544(true, arg1.method477(var6, true), (long) this.field6200);
        }
        if (this.field6194 >= 0 && this.field6213.field10649.method1541(-10, (long) this.field6194) == null && var3.method2104(arg0 ^ 0x65, this.field6194)) {
            class508 var7 = class508.method2947(var3, this.field6194);
            this.field6213.field10649.method1544(true, arg1.method477(var7, true), (long) this.field6194);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(ILha;)Lvr;")
    public final class147 method2656(int arg0, class65 arg1) {
        field6215++;
        if (this.field6193 < 0) {
            return null;
        }
        if (arg0 != -21380) {
            method2661(55, true, (byte) 42, null, null);
        }
        class147 var3 = (class147) this.field6213.field10649.method1541(-10, (long) this.field6193);
        if (var3 == null) {
            this.method2655(-1, arg1);
            var3 = (class147) this.field6213.field10649.method1541(-10, (long) this.field6193);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljp;B)V")
    public final void method2657(class376 arg0, byte arg1) {
        field6206++;
        if (arg1 < 30) {
            return;
        }
        while (true) {
            int var3 = arg0.method2398(-1372747256);
            if (var3 == 0) {
                return;
            }
            this.method2654(2, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IILcj;)Z")
    public static final boolean method2658(int arg0, int arg1, class723 arg2) {
        class481.field6661.method975(arg2.field10066[arg0], arg2.field10067[arg0], arg2.field10063[arg0], class280.field4139);
        field6196++;
        int var3 = -45 % ((arg1 - 26) / 45);
        int var4 = class280.field4139[2];
        if (var4 < 50) {
            return false;
        } else {
            arg2.field10060[arg0] = (short) (class280.field4139[0] * class566.field7575 / var4 + class148.field2080);
            arg2.field10074[arg0] = (short) (class280.field4139[1] * class562.field7545 / var4 + class10.field168);
            arg2.field10064[arg0] = (short) var4;
            return true;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IFFFFFIF)F")
    public static final float method2659(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        int var8 = 59 % ((arg0 + 25) / 61);
        field6197++;
        float var9 = 0.0F;
        float var10 = arg7 - arg5;
        float var11 = arg1 - arg3;
        float var12 = arg4 - arg2;
        float var13 = 0.0F;
        float var14 = 0.0F;
        float var15 = 0.0F;
        while (var9 < 1.1F) {
            float var16 = var9 * var10 + arg5;
            float var17 = var9 * var11 + arg3;
            float var18 = var9 * var12 + arg2;
            int var19 = (int) var16 >> 9;
            int var20 = (int) var18 >> 9;
            if (var19 > 0 && var20 > 0 && var19 < class597.field8132 && class628.field8800 > var20) {
                int var21 = class551.field7456.field2250;
                if (var21 < 3 && (class66.field931[1][var19][var20] & 0x2) != 0) {
                    var21++;
                }
                int var22 = class412.field5933[var21].method1882((int) var18, 0, (int) var16);
                if ((float) var22 < var17) {
                    if (arg6 < 2) {
                        return var9;
                    }
                    return method2659(-122, var17, var15, var14, var18, var13, arg6 - 1, var16) * 0.1F + (var9 - 0.1F);
                }
            }
            var13 = var16;
            var9 += 0.1F;
            var14 = var17;
            var15 = var18;
        }
        return -1.0F;
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(Lha;I)Lvr;")
    public final class147 method2660(class65 arg0, int arg1) {
        field6195++;
        if (arg1 < ~this.field6200) {
            return null;
        }
        class147 var3 = (class147) this.field6213.field10649.method1541(arg1 ^ 0x9, (long) this.field6200);
        if (var3 == null) {
            this.method2655(-1, arg0);
            var3 = (class147) this.field6213.field10649.method1541(-10, (long) this.field6200);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZBLjava/lang/String;Ljava/lang/String;)V")
    public static final void method2661(int arg0, boolean arg1, byte arg2, String arg3, String arg4) {
        field6201++;
        class267 var5 = class731.method4058(-116);
        var5.field3938.method2380(65280, class628.field8791.field4282);
        var5.field3938.method2415(false, 0);
        int var6 = var5.field3938.field5459;
        int var7 = -19 % ((-arg2 - 2) / 47);
        var5.field3938.method2415(false, 649);
        int[] var8 = class283.method1815((byte) 61, var5);
        int var9 = var5.field3938.field5459;
        var5.field3938.method2349(55, arg4);
        var5.field3938.method2415(false, class444.field6231);
        var5.field3938.method2349(89, arg3);
        var5.field3938.method2369(-3, class287.field4232);
        var5.field3938.method2380(65280, class38.field589);
        var5.field3938.method2380(65280, class21.field332.field4207);
        class379.method2420(24, var5.field3938);
        String var10 = class609.field8288;
        var5.field3938.method2380(65280, var10 == null ? 0 : 1);
        if (var10 != null) {
            var5.field3938.method2349(122, var10);
        }
        var5.field3938.method2380(65280, arg0);
        var5.field3938.method2380(65280, arg1 ? 1 : 0);
        var5.field3938.field5459 += 7;
        var5.field3938.method2353(-141, var5.field3938.field5459, var9, var8);
        var5.field3938.method2395(var5.field3938.field5459 - var6, 0);
        class617.method3392(var5, true);
        class275.field4090 = -3;
        class268.field3949 = 1;
        class418.field5997 = 0;
        class378.field5531 = 0;
        if (arg0 < 13) {
            class497.field6866 = true;
            class636.method3556((byte) -84);
        }
    }
}
