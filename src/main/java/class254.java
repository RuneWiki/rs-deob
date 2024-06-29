import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class254 {

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    private int field4351 = 0;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public int field4347;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[Lsg;")
    public class163[] field4336;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "Lke;")
    public static class256 field4337 = class316.method2202(")3runescape)3com)4l=", 27626);

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "[J")
    public static long[] field4353 = new long[32];

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "Lrj;")
    public static class254 field4355 = new class254(32);

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "Lvm;")
    public static class297 field4357 = new class297(500);

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "[I")
    public static int[] field4358 = new int[128];

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "J")
    private long field4342;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "Lsg;")
    private class163 field4344;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "Lsg;")
    private class163 field4350;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "[[[I")
    public static int[][][] field4354;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZIII)V", line = 4)
    public static final void method1741(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field4341++;
        if (class298.method2087(arg0, arg3 + 20331)) {
            class297.method2079(class50.field921[arg0], arg4, (byte) -109, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)Lsg;", line = 20)
    public final class163 method1742(byte arg0) {
        if (arg0 < 8) {
            field4354 = (int[][][]) ((int[][][]) null);
        }
        field4333++;
        if (this.field4351 > 0 && this.field4336[this.field4351 - 1] != this.field4350) {
            class163 var2 = this.field4350;
            this.field4350 = var2.field2893;
            return var2;
        }
        class163 var3;
        do {
            if (this.field4351 >= this.field4347) {
                return null;
            }
            var3 = this.field4336[this.field4351++].field2893;
        } while (this.field4336[this.field4351 - 1] == var3);
        this.field4350 = var3.field2893;
        return var3;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)Lsg;", line = 56)
    public final class163 method1743(boolean arg0) {
        field4346++;
        this.field4351 = 0;
        if (!arg0) {
            this.method1743(true);
        }
        return this.method1742((byte) 17);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BJ)Lsg;", line = 69)
    public final class163 method1744(byte arg0, long arg1) {
        this.field4342 = arg1;
        class163 var4 = this.field4336[(int) (arg1 & (long) (this.field4347 - 1))];
        this.field4344 = var4.field2893;
        field4338++;
        if (arg0 <= 122) {
            method1741(-108, true, 41, 2, -13);
        }
        while (this.field4344 != var4) {
            if (this.field4344.field2895 == arg1) {
                class163 var5 = this.field4344;
                this.field4344 = this.field4344.field2893;
                return var5;
            }
            this.field4344 = this.field4344.field2893;
        }
        this.field4344 = null;
        return null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)I", line = 100)
    public final int method1745(int arg0) {
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field4347; var3++) {
            class163 var4 = this.field4336[var3];
            class163 var5 = var4.field2893;
            while (var4 != var5) {
                var5 = var5.field2893;
                var2++;
            }
        }
        field4348++;
        return var2;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)Lsg;", line = 127)
    public final class163 method1746(byte arg0) {
        field4335++;
        if (this.field4344 == null) {
            return null;
        } else if (arg0 == 9) {
            class163 var2 = this.field4336[(int) ((long) (this.field4347 - 1) & this.field4342)];
            while (this.field4344 != var2) {
                if (this.field4344.field2895 == this.field4342) {
                    class163 var3 = this.field4344;
                    this.field4344 = this.field4344.field2893;
                    return var3;
                }
                this.field4344 = this.field4344.field2893;
            }
            this.field4344 = null;
            return null;
        } else {
            return (class163) null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)I", line = 168)
    public final int method1747(int arg0) {
        field4349++;
        if (arg0 <= 25) {
            this.method1747(111);
        }
        return this.field4347;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V", line = 181)
    public final void method1748(int arg0) {
        field4339++;
        for (int var2 = arg0; var2 < this.field4347; var2++) {
            class163 var3 = this.field4336[var2];
            while (true) {
                class163 var4 = var3.field2893;
                if (var3 == var4) {
                    break;
                }
                var4.method1199(21966);
            }
        }
        this.field4350 = null;
        this.field4344 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLsg;J)V", line = 210)
    public final void method1749(boolean arg0, class163 arg1, long arg2) {
        if (arg1.field2894 != null) {
            arg1.method1199(21966);
        }
        field4334++;
        class163 var5 = this.field4336[(int) (arg2 & (long) (this.field4347 - 1))];
        if (!arg0) {
            this.method1749(true, (class163) null, -108L);
        }
        arg1.field2895 = arg2;
        arg1.field2893 = var5;
        arg1.field2894 = var5.field2894;
        arg1.field2894.field2893 = arg1;
        arg1.field2893.field2894 = arg1;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III[[[BIBII)V", line = 230)
    public static final void method1750(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class121.field2131++;
        class48.field863 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class201.field3664; var12 < class86.field1547; var12++) {
            class271[][] var13 = class41.field790[var12];
            for (int var14 = class284.field4935; var14 < class173.field3069; var14++) {
                for (int var15 = class36.field599; var15 < class186.field3273; var15++) {
                    class271 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class53.field978[var14 + class195.field3553 - class91.field1661][var15 + class195.field3553 - class93.field1683] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field4644 = true;
                            var16.field4635 = true;
                            if (var16.field4641 > 0) {
                                var16.field4636 = true;
                            } else {
                                var16.field4636 = false;
                            }
                            class48.field863++;
                        } else {
                            var16.field4644 = false;
                            var16.field4635 = false;
                            var16.field4626 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field4639 != null) {
                                    class197 var17 = var16.field4639;
                                    var17.field3597.method152(0, var12, var17.field3602, var17.field3609, var17.field3604);
                                    if (var17.field3596 != null) {
                                        var17.field3596.method152(0, var12, var17.field3602, var17.field3609, var17.field3604);
                                    }
                                }
                                if (var16.field4643 != null) {
                                    class39 var18 = var16.field4643;
                                    var18.field700.method152(var18.field706, var12, var18.field703, var18.field705, var18.field715);
                                    if (var18.field711 != null) {
                                        var18.field711.method152(var18.field706, var12, var18.field703, var18.field705, var18.field715);
                                    }
                                }
                                if (var16.field4628 != null) {
                                    class223 var19 = var16.field4628;
                                    var19.field3905.method152(0, var12, var19.field3900, var19.field3904, var19.field3901);
                                }
                                if (var16.field4624 != null) {
                                    for (int var20 = 0; var20 < var16.field4641; var20++) {
                                        class269 var21 = var16.field4624[var20];
                                        var21.field4590.method152(var21.field4600, var12, var21.field4593, var21.field4592, var21.field4591);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class222.field3884 == class118.field2090;
        if (class253.field4323) {
            GL var23 = class253.field4319;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class49.method395();
                class277.method1910(-1, 3, -19856);
                class77.field1451 = true;
                class263.method1843();
                class41.field777 = -1;
                class295.field5121 = -1;
                for (int var24 = 0; var24 < class240.field4095[0].length; var24++) {
                    class113 var25 = class240.field4095[0][var24];
                    float var26 = 251.5F - (var25.field1985 ? 1.0F : 0.5F);
                    if (class41.field777 != var25.field1982) {
                        class41.field777 = var25.field1982;
                        class166.method1214(4, var25.field1982);
                        class169.method1236(class247.method1667(true));
                    }
                    var25.method779(class41.field790, var26, false);
                }
                class263.method1842();
            } else {
                int var27 = class201.field3664;
                while (true) {
                    if (var27 >= class86.field1547) {
                        class245.method1659(class91.field1661, class93.field1683, class41.field790);
                        break;
                    }
                    for (int var28 = 0; var28 < class240.field4095[var27].length; var28++) {
                        class113 var29 = class240.field4095[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field1985 ? 1.0F : 0.5F);
                        if (var29.field2000 != -1 && class136.field2373.method199(var29.field2000, (byte) 110) == 4 && class281.field4880) {
                            class166.method1214(4, var29.field1982);
                        }
                        var29.method779(class41.field790, var30, false);
                    }
                    if (var27 == 0 && class17.field241 > 0) {
                        class253.method1718(101.5F);
                        class123.method837(class91.field1661, class93.field1683, class195.field3553, arg1, class53.field978, class118.field2090[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class201.field3664; var31 < class86.field1547; var31++) {
            class271[][] var32 = class41.field790[var31];
            for (int var33 = -class195.field3553; var33 <= 0; var33++) {
                int var34 = class91.field1661 + var33;
                int var35 = class91.field1661 - var33;
                if (var34 >= class284.field4935 || var35 < class173.field3069) {
                    for (int var36 = -class195.field3553; var36 <= 0; var36++) {
                        int var37 = class93.field1683 + var36;
                        int var38 = class93.field1683 - var36;
                        if (var34 >= class284.field4935) {
                            if (var37 >= class36.field599) {
                                class271 var39 = var32[var34][var37];
                                if (var39 != null && var39.field4644) {
                                    class105.method749(var39, true);
                                }
                            }
                            if (var38 < class186.field3273) {
                                class271 var40 = var32[var34][var38];
                                if (var40 != null && var40.field4644) {
                                    class105.method749(var40, true);
                                }
                            }
                        }
                        if (var35 < class173.field3069) {
                            if (var37 >= class36.field599) {
                                class271 var41 = var32[var35][var37];
                                if (var41 != null && var41.field4644) {
                                    class105.method749(var41, true);
                                }
                            }
                            if (var38 < class186.field3273) {
                                class271 var42 = var32[var35][var38];
                                if (var42 != null && var42.field4644) {
                                    class105.method749(var42, true);
                                }
                            }
                        }
                        if (class48.field863 == 0) {
                            if (!var22) {
                                class14.field187 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class201.field3664; var43 < class86.field1547; var43++) {
            class271[][] var44 = class41.field790[var43];
            for (int var45 = -class195.field3553; var45 <= 0; var45++) {
                int var46 = class91.field1661 + var45;
                int var47 = class91.field1661 - var45;
                if (var46 >= class284.field4935 || var47 < class173.field3069) {
                    for (int var48 = -class195.field3553; var48 <= 0; var48++) {
                        int var49 = class93.field1683 + var48;
                        int var50 = class93.field1683 - var48;
                        if (var46 >= class284.field4935) {
                            if (var49 >= class36.field599) {
                                class271 var51 = var44[var46][var49];
                                if (var51 != null && var51.field4644) {
                                    class105.method749(var51, false);
                                }
                            }
                            if (var50 < class186.field3273) {
                                class271 var52 = var44[var46][var50];
                                if (var52 != null && var52.field4644) {
                                    class105.method749(var52, false);
                                }
                            }
                        }
                        if (var47 < class173.field3069) {
                            if (var49 >= class36.field599) {
                                class271 var53 = var44[var47][var49];
                                if (var53 != null && var53.field4644) {
                                    class105.method749(var53, false);
                                }
                            }
                            if (var50 < class186.field3273) {
                                class271 var54 = var44[var47][var50];
                                if (var54 != null && var54.field4644) {
                                    class105.method749(var54, false);
                                }
                            }
                        }
                        if (class48.field863 == 0) {
                            if (!var22) {
                                class14.field187 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class14.field187 = false;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[Lsg;)I", line = 601)
    public final int method1751(int arg0, class163[] arg1) {
        field4343++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4347; var4++) {
            class163 var5 = this.field4336[var4];
            for (class163 var6 = var5.field2893; var6 != var5; var6 = var6.field2893) {
                arg1[var3++] = var6;
            }
        }
        if (arg0 != 1431655765) {
            this.method1747(-43);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(I)V", line = 641)
    public class254(int arg0) {
        this.field4347 = arg0;
        this.field4336 = new class163[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class163 var3 = this.field4336[var2] = new class163();
            var3.field2893 = var3;
            var3.field2894 = var3;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)V", line = 665)
    public static void method1752(boolean arg0) {
        field4358 = null;
        field4353 = null;
        field4357 = null;
        field4355 = null;
        field4337 = null;
        field4354 = (int[][][]) null;
        if (!arg0) {
            field4355 = (class254) null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)Lrf;", line = 683)
    public static final class36 method1753(int arg0, boolean arg1) {
        field4356++;
        class36 var2 = (class36) class100.field1785.method2077(-13408, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1) {
            byte[] var3 = class9.field145.method1016(class171.method1245(arg0, (byte) -2), 100, class80.method599(arg0, 255));
            class36 var4 = new class36();
            var4.field585 = arg0;
            if (var3 != null) {
                var4.method258(-72, new class41(var3));
            }
            var4.method249(0);
            if (var4.field579 != -1) {
                var4.method251(method1753(var4.field596, arg1), 1, method1753(var4.field579, arg1));
            }
            if (var4.field629 != -1) {
                var4.method266(126, method1753(var4.field629, true), method1753(var4.field627, true));
            }
            if (!class64.field1144 && var4.field590) {
                var4.field600 = null;
                var4.field586 = 0;
                var4.field591 = class79.field1480;
                var4.field639 = false;
                var4.field578 = null;
            }
            class100.field1785.method2074(var4, (long) arg0, -1);
            return var4;
        } else {
            return (class36) null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)I", line = 726)
    public static final int method1754(int arg0, int arg1) {
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        field4340++;
        int var3 = ((var2 & 0xCCCCCCCF) >>> 2) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return arg1 == -16635 ? var6 & 0xFF : 118;
    }
}
