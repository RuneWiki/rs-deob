import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class730 {

    @OriginalMember(owner = "client!waa", name = "r", descriptor = "Lim;")
    private class597 field10609;

    @OriginalMember(owner = "client!waa", name = "q", descriptor = "Lkd;")
    private class296 field10598;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "I")
    public int field10612;

    @OriginalMember(owner = "client!waa", name = "s", descriptor = "I")
    private int field10616;

    @OriginalMember(owner = "client!waa", name = "l", descriptor = "[B")
    public byte[] field10613;

    @OriginalMember(owner = "client!waa", name = "m", descriptor = "I")
    private int field10606;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "I")
    private int field10601;

    @OriginalMember(owner = "client!waa", name = "k", descriptor = "I")
    private int field10611;

    @OriginalMember(owner = "client!waa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10617 = new String[] { method5332(method5331("\u007f\u0001Xr@")), method5332(method5331("jZ\u001a0")), method5332(method5331("sN\u0017ru,")), method5332(method5331("sN\u0017r|,")), method5332(method5331("sN\u0017rz,")), method5332(method5331("sN\u0017ry,")), method5332(method5331("sN\u0017r~,")), method5332(method5331("sN\u0017r\u0001mA\u001f(\u0003,")), method5332(method5331("sN\u0017r\u007f,")), method5332(method5331("sN\u0017rx,")), method5332(method5331("sN\u0017rt,")) };

    @OriginalMember(owner = "client!waa", name = "n", descriptor = "Lwia;")
    public static class790 field10599 = new class790(84, -1);

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "I")
    public static int field10600;

    @OriginalMember(owner = "client!waa", name = "j", descriptor = "I")
    public static int field10603;

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
    public static int field10604;

    @OriginalMember(owner = "client!waa", name = "o", descriptor = "I")
    public static int field10605;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "I")
    public static int field10607;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
    public static int field10608;

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "I")
    public static int field10610;

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "I")
    public static int field10615;

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "Lgea;")
    public static class82 field10602;

    @OriginalMember(owner = "client!waa", name = "p", descriptor = "[[Lgb;")
    private class226[][] field10614;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IBILr;)Z")
    public final boolean method5322(int arg0, byte arg1, int arg2, class194 arg3) {
        try {
            field10607++;
            class355 var5 = (class355) arg3;
            arg0 += var5.field5468 + 1;
            arg2 += var5.field5465 + 1;
            int var6 = this.field10612 * arg0 + arg2;
            int var7 = var5.field5466;
            int var8 = var5.field5459;
            int var9 = -88 % ((72 - arg1) / 36);
            int var10 = this.field10612 - var8;
            if (arg0 <= 0) {
                int var11 = 1 - arg0;
                var7 -= var11;
                var6 += this.field10612 * var11;
                arg0 = 1;
            }
            if ((arg0 + var7) >= this.field10616) {
                int var12 = arg0 + var7 + 1 - this.field10616;
                var7 -= var12;
            }
            if (arg2 <= 0) {
                int var13 = 1 - arg2;
                var8 -= var13;
                arg2 = 1;
                var6 += var13;
                var10 += var13;
            }
            if (this.field10612 <= (arg2 + var8)) {
                int var14 = var8 + arg2 + 1 - this.field10612;
                var8 -= var14;
                var10 += var14;
            }
            if (var8 > 0 && var7 > 0) {
                byte var15 = 8;
                int var16 = (var15 - 1) * this.field10612 + var10;
                return class646.method4754(var8, 123, var16, this.field10613, var15, var7, var6);
            } else {
                return false;
            }
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field10617[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field10617[1] : field10617[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z[[ZIIII)V")
    public final void method5323(boolean arg0, boolean[][] arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field10603++;
            this.field10598.method2472((byte) 24, false);
            this.field10598.method2473((byte) -112, false);
            this.field10598.method2457(1, (byte) -80);
            this.field10598.method2433(arg2 ^ 0xFFFFC134, arg2);
            this.field10598.method2477(arg2 ^ 0x1, false, -2, false);
            float var7 = 1.0F / (float) (this.field10598.field4639 * 128);
            if (arg0) {
                for (int var26 = 0; var26 < this.field10611; var26++) {
                    int var27 = var26 << this.field10606;
                    int var28 = var26 + 1 << this.field10606;
                    label117: for (int var29 = 0; var29 < this.field10601; var29++) {
                        if (this.field10614[var29][var26] != null) {
                            int var30 = var29 << this.field10606;
                            int var31 = var29 + 1 << this.field10606;
                            for (int var32 = var30; var32 < var31; var32++) {
                                if (var32 - arg4 >= -arg5 && arg5 >= var32 - arg4) {
                                    for (int var33 = var27; var33 < var28; var33++) {
                                        if ((var33 - arg3) >= (-arg5) && var33 - arg3 <= arg5 && arg1[arg5 + var32 - arg4][arg5 + var33 - arg3]) {
                                            class770 var34 = this.field10598.method2479(-1);
                                            var34.method5558(var7, 0, 1.0F, var7);
                                            var34.method2375(-var29, -var26, 0);
                                            this.field10598.method2474(2, class398.field5941);
                                            this.field10614[var29][var26].method1955(95);
                                            continue label117;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var8 = 0; var8 < this.field10611; var8++) {
                    int var9 = var8 << this.field10606;
                    int var10 = var8 + 1 << this.field10606;
                    for (int var11 = 0; var11 < this.field10601; var11++) {
                        class226 var12 = this.field10614[var11][var8];
                        if (var12 != null) {
                            class421 var13 = this.field10598.method2439(true, var12.field3462 * 3);
                            Buffer var14 = var13.method3256(true, (byte) -97);
                            if (var14 != null) {
                                Stream var15 = this.field10598.method2476(var14, (byte) -3);
                                int var16 = 0;
                                int var17 = var11 << this.field10606;
                                int var18 = var11 + 1 << this.field10606;
                                for (int var19 = var9; var19 < var10; var19++) {
                                    if (var19 - arg3 >= -arg5 && var19 - arg3 <= arg5) {
                                        int var20 = this.field10609.field4337 * var19 + var17;
                                        for (int var21 = var17; var21 < var18; var21++) {
                                            if (-arg5 <= var21 - arg4 && (var21 - arg4) <= arg5 && arg1[var21 + arg5 - arg4][var19 + arg5 - arg3]) {
                                                short[] var22 = this.field10609.field8756[var20];
                                                if (var22 != null) {
                                                    if (Stream.method5102()) {
                                                        for (int var23 = 0; var23 < var22.length; var23++) {
                                                            var15.method5100(var22[var23] & 0xFFFF);
                                                            var16++;
                                                        }
                                                    } else {
                                                        for (int var24 = 0; var24 < var22.length; var24++) {
                                                            var15.method5108(var22[var24] & 0xFFFF);
                                                            var16++;
                                                        }
                                                    }
                                                }
                                            }
                                            var20++;
                                        }
                                    }
                                }
                                var15.method5103();
                                if (var13.method3257(-3841) && var16 > 0) {
                                    class770 var25 = this.field10598.method2479(arg2 - 2);
                                    var25.method5558(var7, 0, 1.0F, var7);
                                    var25.method2375(-var11, -var8, 0);
                                    this.field10598.method2474(2, class398.field5941);
                                    var12.method1957(var16 / 3, (byte) 111, var13);
                                }
                            }
                        }
                    }
                }
            }
            this.field10598.method2489(0);
        } catch (RuntimeException var36) {
            throw class759.method5498(var36, field10617[2] + arg0 + ',' + (arg1 == null ? field10617[1] : field10617[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(II)V")
    public static final void method5324(int arg0, int arg1) {
        class96 var2 = class734.field10683[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class96 var4 = class734.field10683[var3][arg0][arg1] = class734.field10683[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class681 var5 = var4.field1085; var5 != null; var5 = var5.field9865) {
                    class343 var6 = var5.field9867;
                    if (var6.field5330 == arg0 && var6.field5329 == arg1) {
                        var6.field6200--;
                    }
                }
                if (var4.field1081 != null) {
                    var4.field1081.field6200--;
                }
                if (var4.field1082 != null) {
                    var4.field1082.field6200--;
                }
                if (var4.field1079 != null) {
                    var4.field1079.field6200--;
                }
                if (var4.field1080 != null) {
                    var4.field1080.field6200--;
                }
                if (var4.field1090 != null) {
                    var4.field1090.field6200--;
                }
            }
        }
        if (class734.field10683[0][arg0][arg1] == null) {
            class734.field10683[0][arg0][arg1] = new class96(0);
            class734.field10683[0][arg0][arg1].field1083 = 1;
        }
        class734.field10683[0][arg0][arg1].field1088 = var2;
        class734.field10683[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IILr;I)V")
    public final void method5325(int arg0, int arg1, class194 arg2, int arg3) {
        try {
            field10615++;
            class355 var5 = (class355) arg2;
            arg0 += var5.field5465 + arg1;
            arg3 += var5.field5468 + 1;
            int var6 = arg0 + (this.field10612 * arg3);
            int var7 = 0;
            int var8 = var5.field5466;
            int var9 = var5.field5459;
            int var10 = this.field10612 - var9;
            int var11 = 0;
            if (arg3 <= 0) {
                int var12 = 1 - arg3;
                arg3 = 1;
                var6 += this.field10612 * var12;
                var8 -= var12;
                var7 += var9 * var12;
            }
            if (arg3 + var8 >= this.field10616) {
                int var13 = arg3 + var8 + 1 - this.field10616;
                var8 -= var13;
            }
            if (arg0 <= 0) {
                int var14 = 1 - arg0;
                var10 += var14;
                arg0 = 1;
                var7 += var14;
                var9 -= var14;
                var6 += var14;
                var11 += var14;
            }
            if (arg0 + var9 >= this.field10612) {
                int var15 = arg0 + var9 + 1 - this.field10612;
                var10 += var15;
                var9 -= var15;
                var11 += var15;
            }
            if (var9 > 0 && var8 > 0) {
                class145.method1228(var8, var6, var9, var5.field5469, var11, var7, this.field10613, -81, var10);
                this.method5329(var8, arg0, var9, -25208, arg3);
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field10617[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10617[1] : field10617[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IC)I")
    public static final int method5326(int arg0, char arg1) {
        try {
            field10610++;
            if (arg0 != -1) {
                method5324(110, -65);
            }
            return arg1 >= '\u0000' && arg1 < class403.field6014.length ? class403.field6014[arg1] : -1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10617[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lr;IBI)V")
    public final void method5327(class194 arg0, int arg1, byte arg2, int arg3) {
        try {
            if (arg2 == 15) {
                field10604++;
                class355 var5 = (class355) arg0;
                arg3 += var5.field5465 + 1;
                arg1 += var5.field5468 + 1;
                int var6 = this.field10612 * arg1 + arg3;
                int var7 = 0;
                int var8 = var5.field5466;
                int var9 = var5.field5459;
                int var10 = this.field10612 - var9;
                int var11 = 0;
                if (arg1 <= 0) {
                    int var12 = 1 - arg1;
                    var6 += this.field10612 * var12;
                    var7 += var9 * var12;
                    var8 -= var12;
                    arg1 = 1;
                }
                if (this.field10616 <= (arg1 + var8)) {
                    int var13 = arg1 + var8 + 1 - this.field10616;
                    var8 -= var13;
                }
                if (arg3 <= 0) {
                    int var14 = 1 - arg3;
                    var9 -= var14;
                    arg3 = 1;
                    var11 += var14;
                    var10 += var14;
                    var6 += var14;
                    var7 += var14;
                }
                if (arg3 + var9 >= this.field10612) {
                    int var15 = var9 + arg3 + 1 - this.field10612;
                    var9 -= var15;
                    var10 += var15;
                    var11 += var15;
                }
                if (var9 > 0 && var8 > 0) {
                    class713.method5197(var9, var8, var7, this.field10613, var6, var11, var5.field5469, var10, arg2 ^ 0xFFFFFFF0);
                    this.method5329(var8, arg3, var9, -25208, arg1);
                }
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field10617[8] + (arg0 == null ? field10617[1] : field10617[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)V")
    public static void method5328(byte arg0) {
        try {
            field10599 = null;
            if (arg0 != -66) {
                method5326(-38, (char) 65412);
            }
            field10602 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10617[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIIII)V")
    private final void method5329(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field10600++;
            if (this.field10614 != null) {
                int var6 = arg1 - 1 >> 7;
                int var7 = arg1 + arg2 - 1 - 1 >> 7;
                int var8 = arg4 - 1 >> 7;
                int var9 = arg4 + arg0 - 1 - 1 >> 7;
                int var10 = var6;
                if (arg3 == -25208) {
                    while (var10 <= var7) {
                        class226[] var11 = this.field10614[var10];
                        for (int var12 = var8; var12 <= var9; var12++) {
                            if (var11[var12] != null) {
                                var11[var12].field3461 = true;
                            }
                        }
                        var10++;
                    }
                }
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field10617[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
    public final void method5330(int arg0) {
        try {
            field10608++;
            this.field10614 = new class226[this.field10601][this.field10611];
            if (arg0 < 107) {
                this.field10598 = null;
            }
            for (int var2 = 0; var2 < this.field10611; var2++) {
                for (int var3 = 0; var3 < this.field10601; var3++) {
                    this.field10614[var3][var2] = new class226(this.field10598, this, this.field10609, var3, var2, this.field10606, var3 * 128 + 1, var2 * 128 - -1);
                    if (this.field10614[var3][var2].field3462 == 0) {
                        this.field10614[var3][var2] = null;
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10617[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lkd;Lim;)V")
    public class730(class296 arg0, class597 arg1) {
        try {
            this.field10609 = arg1;
            this.field10598 = arg0;
            this.field10612 = (this.field10609.field4340 * this.field10609.field4337 >> this.field10598.field4606) + 2;
            this.field10616 = (this.field10609.field4340 * this.field10609.field4336 >> this.field10598.field4606) + 2;
            this.field10613 = new byte[this.field10616 * this.field10612];
            this.field10606 = this.field10598.field4606 + 7 - this.field10609.field4341;
            this.field10601 = this.field10609.field4337 >> this.field10606;
            this.field10611 = this.field10609.field4336 >> this.field10606;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10617[7] + (arg0 == null ? field10617[1] : field10617[0]) + ',' + (arg1 == null ? field10617[1] : field10617[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!waa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5331(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!waa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5332(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 4;
                    break;
                case 1:
                    var10005 = 47;
                    break;
                case 2:
                    var10005 = 118;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 61;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
