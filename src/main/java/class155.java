import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class155 extends class651 {

    @OriginalMember(owner = "client!uh", name = "lc", descriptor = "Lkc;")
    private class123 field1836;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Laq;[Luh;)Luh;")
    public static final class155 method947(class150 arg0, class155[] arg1) {
        int var2 = 0;
        class155 var3 = null;
        for (int var4 = 0; var4 < arg1.length; ++var4) {
            if (arg1[var4] != null) {
                ++var2;
                var3 = arg1[var4];
            }
        }
        if (var2 == 1) {
            return var3;
        } else {
            return new class155(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V")
    private final void method948(int arg0) {
        int var2 = 0;
        int var3 = super.field8826.field7351;
        short var4 = super.field8852[arg0];
        short var5 = super.field8835[arg0];
        short var6 = super.field8814[arg0];
        int var7 = super.field8812[var4];
        int var8 = super.field8812[var5];
        int var9 = super.field8812[var6];
        if (super.field8849 == null) {
            this.field1836.field1496 = 0;
        } else {
            this.field1836.field1496 = super.field8849[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field8804[var2] = super.field8863[var4];
            super.field8816[var2] = super.field8847[var4];
            super.field8851[var2++] = super.field8797[arg0] & 65535;
        } else {
            int var10 = super.field8899[var4];
            int var11 = super.field8836[var4];
            int var12 = super.field8797[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class651.field8898[var9 - var7];
                super.field8804[var2] = (((super.field8899[var6] - var10) * var13 >> 16) + var10) * super.field8826.field7340 / var3 + super.field8861.field9320;
                super.field8816[var2] = (((super.field8836[var6] - var11) * var13 >> 16) + var11) * super.field8826.field7363 / var3 + super.field8861.field9315;
                super.field8851[var2++] = (((super.field8795[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class651.field8898[var8 - var7];
                super.field8804[var2] = (((super.field8899[var5] - var10) * var14 >> 16) + var10) * super.field8826.field7340 / var3 + super.field8861.field9320;
                super.field8816[var2] = (((super.field8836[var5] - var11) * var14 >> 16) + var11) * super.field8826.field7363 / var3 + super.field8861.field9315;
                super.field8851[var2++] = (((super.field8848[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field8804[var2] = super.field8863[var5];
            super.field8816[var2] = super.field8847[var5];
            super.field8851[var2++] = super.field8848[arg0] & 65535;
        } else {
            int var15 = super.field8899[var5];
            int var16 = super.field8836[var5];
            int var17 = super.field8848[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class651.field8898[var7 - var8];
                super.field8804[var2] = (((super.field8899[var4] - var15) * var18 >> 16) + var15) * super.field8826.field7340 / var3 + super.field8861.field9320;
                super.field8816[var2] = (((super.field8836[var4] - var16) * var18 >> 16) + var16) * super.field8826.field7363 / var3 + super.field8861.field9315;
                super.field8851[var2++] = (((super.field8797[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class651.field8898[var9 - var8];
                super.field8804[var2] = (((super.field8899[var6] - var15) * var19 >> 16) + var15) * super.field8826.field7340 / var3 + super.field8861.field9320;
                super.field8816[var2] = (((super.field8836[var6] - var16) * var19 >> 16) + var16) * super.field8826.field7363 / var3 + super.field8861.field9315;
                super.field8851[var2++] = (((super.field8795[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field8804[var2] = super.field8863[var6];
            super.field8816[var2] = super.field8847[var6];
            super.field8851[var2++] = super.field8795[arg0] & 65535;
        } else {
            int var20 = super.field8899[var6];
            int var21 = super.field8836[var6];
            int var22 = super.field8795[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class651.field8898[var8 - var9];
                super.field8804[var2] = (((super.field8899[var5] - var20) * var23 >> 16) + var20) * super.field8826.field7340 / var3 + super.field8861.field9320;
                super.field8816[var2] = (((super.field8836[var5] - var21) * var23 >> 16) + var21) * super.field8826.field7363 / var3 + super.field8861.field9315;
                super.field8851[var2++] = (((super.field8848[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class651.field8898[var7 - var9];
                super.field8804[var2] = (((super.field8899[var4] - var20) * var24 >> 16) + var20) * super.field8826.field7340 / var3 + super.field8861.field9320;
                super.field8816[var2] = (((super.field8836[var4] - var21) * var24 >> 16) + var21) * super.field8826.field7363 / var3 + super.field8861.field9315;
                super.field8851[var2++] = (((super.field8797[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field8804[0];
        int var26 = super.field8804[1];
        int var27 = super.field8804[2];
        int var28 = super.field8816[0];
        int var29 = super.field8816[1];
        int var30 = super.field8816[2];
        this.field1836.field1500 = false;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field8861.field9349 || var26 > super.field8861.field9349 || var27 > super.field8861.field9349) {
                this.field1836.field1500 = true;
            }
            if (super.field8885 != null && super.field8885[arg0] != -1) {
                int var32;
                int var33;
                int var34;
                if (super.field8817 != null && super.field8817[arg0] != -1) {
                    int var31 = super.field8817[arg0] & 255;
                    var32 = super.field8813[var31];
                    var33 = super.field8887[var31];
                    var34 = super.field8855[var31];
                } else {
                    var32 = var4;
                    var33 = var5;
                    var34 = var6;
                }
                if (super.field8795[arg0] == -1) {
                    this.field1836.method809(var28, var29, var30, var25, var26, var27, super.field8797[arg0], super.field8797[arg0], super.field8797[arg0], super.field8899[var32], super.field8899[var33], super.field8899[var34], super.field8836[var32], super.field8836[var33], super.field8836[var34], super.field8812[var32], super.field8812[var33], super.field8812[var34], super.field8885[arg0]);
                } else {
                    this.field1836.method809(var28, var29, var30, var25, var26, var27, super.field8851[0], super.field8851[1], super.field8851[2], super.field8899[var32], super.field8899[var33], super.field8899[var34], super.field8836[var32], super.field8836[var33], super.field8836[var34], super.field8812[var32], super.field8812[var33], super.field8812[var34], super.field8885[arg0]);
                }
            } else if (super.field8795[arg0] == -1) {
                this.field1836.method820(var28, var29, var30, var25, var26, var27, class644.field8740[super.field8797[arg0] & 65535]);
            } else {
                this.field1836.method811(var28, var29, var30, var25, var26, var27, super.field8851[0], super.field8851[1], super.field8851[2]);
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field8861.field9349 || var26 > super.field8861.field9349 || var27 > super.field8861.field9349 || super.field8804[3] < 0 || super.field8804[3] > super.field8861.field9349) {
                this.field1836.field1500 = true;
            }
            if (super.field8885 == null || super.field8885[arg0] == -1) {
                if (super.field8795[arg0] == -1) {
                    int var40 = class644.field8740[super.field8797[arg0] & 65535];
                    this.field1836.method820(var28, var29, var30, var25, var26, var27, var40);
                    this.field1836.method820(var28, var30, super.field8816[3], var25, var27, super.field8804[3], var40);
                    return;
                }
                this.field1836.method811(var28, var29, var30, var25, var26, var27, super.field8851[0], super.field8851[1], super.field8851[2]);
                this.field1836.method811(var28, var30, super.field8816[3], var25, var27, super.field8804[3], super.field8851[0], super.field8851[2], super.field8851[3]);
                return;
            }
            int var36;
            int var37;
            int var38;
            if (super.field8817 != null && super.field8817[arg0] != -1) {
                int var35 = super.field8817[arg0] & 255;
                var36 = super.field8813[var35];
                var37 = super.field8887[var35];
                var38 = super.field8855[var35];
            } else {
                var36 = var4;
                var37 = var5;
                var38 = var6;
            }
            short var39 = super.field8885[arg0];
            if (super.field8795[arg0] == -1) {
                this.field1836.method809(var28, var29, var30, var25, var26, var27, super.field8797[arg0], super.field8797[arg0], super.field8797[arg0], super.field8899[var36], super.field8899[var37], super.field8899[var38], super.field8836[var36], super.field8836[var37], super.field8836[var38], super.field8812[var36], super.field8812[var37], super.field8812[var38], var39);
                this.field1836.method809(var28, var30, super.field8816[3], var25, var27, super.field8804[3], super.field8797[arg0], super.field8797[arg0], super.field8797[arg0], super.field8899[var36], super.field8899[var37], super.field8899[var38], super.field8836[var36], super.field8836[var37], super.field8836[var38], super.field8812[var36], super.field8812[var37], super.field8812[var38], var39);
                return;
            }
            this.field1836.method809(var28, var29, var30, var25, var26, var27, super.field8851[0], super.field8851[1], super.field8851[2], super.field8899[var36], super.field8899[var37], super.field8899[var38], super.field8836[var36], super.field8836[var37], super.field8836[var38], super.field8812[var36], super.field8812[var37], super.field8812[var38], var39);
            this.field1836.method809(var28, var30, super.field8816[3], var25, var27, super.field8804[3], super.field8851[0], super.field8851[2], super.field8851[3], super.field8899[var36], super.field8899[var37], super.field8899[var38], super.field8836[var36], super.field8836[var37], super.field8836[var38], super.field8812[var36], super.field8812[var37], super.field8812[var38], var39);
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
    private final void method949(int arg0) {
        if (super.field8798[arg0]) {
            this.method948(arg0);
        } else {
            short var2 = super.field8852[arg0];
            short var3 = super.field8835[arg0];
            short var4 = super.field8814[arg0];
            this.field1836.field1500 = super.field8869[arg0];
            if (super.field8849 == null) {
                this.field1836.field1496 = 0;
            } else {
                this.field1836.field1496 = super.field8849[arg0] & 255;
            }
            if (super.field8885 != null && super.field8885[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (super.field8817 != null && super.field8817[arg0] != -1) {
                    int var5 = super.field8817[arg0] & 255;
                    var6 = super.field8813[var5];
                    var7 = super.field8887[var5];
                    var8 = super.field8855[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (super.field8795[arg0] == -1) {
                    this.field1836.method809(super.field8847[var2], super.field8847[var3], super.field8847[var4], super.field8863[var2], super.field8863[var3], super.field8863[var4], super.field8797[arg0], super.field8797[arg0], super.field8797[arg0], super.field8899[var6], super.field8899[var7], super.field8899[var8], super.field8836[var6], super.field8836[var7], super.field8836[var8], super.field8812[var6], super.field8812[var7], super.field8812[var8], super.field8885[arg0]);
                } else {
                    this.field1836.method809(super.field8847[var2], super.field8847[var3], super.field8847[var4], super.field8863[var2], super.field8863[var3], super.field8863[var4], super.field8797[arg0], super.field8848[arg0], super.field8795[arg0], super.field8899[var6], super.field8899[var7], super.field8899[var8], super.field8836[var6], super.field8836[var7], super.field8836[var8], super.field8812[var6], super.field8812[var7], super.field8812[var8], super.field8885[arg0]);
                }
            } else if (super.field8795[arg0] == -1) {
                this.field1836.method820(super.field8847[var2], super.field8847[var3], super.field8847[var4], super.field8863[var2], super.field8863[var3], super.field8863[var4], class644.field8740[super.field8797[arg0] & 65535]);
            } else {
                this.field1836.method811(super.field8847[var2], super.field8847[var3], super.field8847[var4], super.field8863[var2], super.field8863[var3], super.field8863[var4], super.field8797[arg0] & 65535, super.field8848[arg0] & 65535, super.field8795[arg0] & 65535);
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "()V")
    public final void method950() {
        super.field8861.field9349 = this.field1836.field1495;
        super.field8861.field9320 = this.field1836.field1497;
        super.field8861.field9315 = this.field1836.field1494;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BIZ)Lba;")
    public final class359 method951(byte arg0, int arg1, boolean arg2) {
        this.method3646(Thread.currentThread());
        class651 var4;
        class651 var5;
        if (arg0 == 1) {
            var4 = super.field8854;
            var5 = super.field8844;
        } else if (arg0 == 2) {
            var4 = super.field8793;
            var5 = super.field8862;
        } else if (arg0 == 3) {
            var4 = super.field8828;
            var5 = super.field8827;
        } else if (arg0 == 4) {
            var4 = super.field8841;
            var5 = super.field8818;
        } else if (arg0 == 5) {
            var4 = super.field8889;
            var5 = super.field8832;
        } else {
            var5 = var4 = new class155(super.field8826);
        }
        return this.method3651(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/Thread;)V")
    public final void method952(Thread arg0) {
        super.method952(arg0);
        class596 var2 = (class596) super.field8826.method937(arg0);
        this.field1836 = var2.field7995;
        super.field8858 = var2.field7992;
        super.field8800 = var2.field7988;
        super.field8892 = var2.field8001;
        super.field8803 = var2.field8000;
        super.field8820 = var2.field7991;
        super.field8850 = var2.field7994;
        super.field8805 = var2.field7996;
        super.field8882 = var2.field7998;
        super.field8860 = var2.field7999;
        super.field8865 = var2.field7990;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZZIIZI)V")
    public final void method953(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7;
        if (arg3 + 2 > 2200) {
            var7 = 1 + class505.method2756(arg3, -65537) - class651.field8857;
            arg3 = (arg3 >> var7) + 2;
        } else {
            var7 = 0;
            arg3 += 2;
        }
        for (int var8 = 0; var8 < 2200; ++var8) {
            super.field8800[var8] = 0;
        }
        int var9 = 0;
        if (super.field8819 != null) {
            int var10 = 0;
            while (var10 < super.field8810) {
                class592 var11 = super.field8819[var10];
                super.field8846[var11.field7954] = var10++;
            }
        }
        for (int var12 = 0; var12 < super.field8895; ++var12) {
            if (super.field8795[var12] != -2) {
                short var159 = super.field8852[var12];
                short var160 = super.field8835[var12];
                short var161 = super.field8814[var12];
                int var162 = super.field8863[var159];
                int var163 = super.field8863[var160];
                int var164 = super.field8863[var161];
                if (!arg0 || var162 != -5000 && var163 != -5000 && var164 != -5000) {
                    if (super.field8846[var12] != -1 || (super.field8847[var161] - super.field8847[var160]) * (var162 - var163) - (super.field8847[var159] - super.field8847[var160]) * (var164 - var163) > 0) {
                        super.field8798[var12] = false;
                        if (var162 >= 0 && var163 >= 0 && var164 >= 0 && var162 <= super.field8861.field9349 && var163 <= super.field8861.field9349 && var164 <= super.field8861.field9349) {
                            super.field8869[var12] = false;
                        } else {
                            super.field8869[var12] = true;
                        }
                        int var185 = (super.field8858[var159] + super.field8858[var160] + super.field8858[var161]) / 3 >> var7;
                        if (super.field8800[var185] < 64) {
                            super.field8892[var185][super.field8800[var185]++] = var12;
                        } else {
                            int var186 = super.field8800[var185];
                            if (var186 == 64) {
                                if (var9 == 512) {
                                    continue;
                                }
                                super.field8803[var9] = 0;
                                super.field8800[var185] = var186 = 65 + var9++;
                            }
                            var186 -= 65;
                            super.field8820[var186][super.field8803[var186]++] = var12;
                        }
                    }
                } else {
                    int var165 = super.field8899[var159];
                    int var166 = super.field8899[var160];
                    int var167 = super.field8899[var161];
                    int var168 = super.field8836[var159];
                    int var169 = super.field8836[var160];
                    int var170 = super.field8836[var161];
                    int var171 = super.field8812[var159];
                    int var172 = super.field8812[var160];
                    int var173 = super.field8812[var161];
                    int var174 = var165 - var166;
                    int var175 = var167 - var166;
                    int var176 = var168 - var169;
                    int var177 = var170 - var169;
                    int var178 = var171 - var172;
                    int var179 = var173 - var172;
                    int var180 = var176 * var179 - var177 * var178;
                    int var181 = var175 * var178 - var174 * var179;
                    int var182 = var174 * var177 - var175 * var176;
                    if (var172 * var182 + var166 * var180 + var169 * var181 > 0) {
                        super.field8798[var12] = true;
                        int var183 = (super.field8858[var159] + super.field8858[var160] + super.field8858[var161]) / 3 >> var7;
                        if (super.field8800[var183] < 64) {
                            super.field8892[var183][super.field8800[var183]++] = var12;
                        } else {
                            int var184 = super.field8800[var183];
                            if (var184 == 64) {
                                if (var9 == 512) {
                                    continue;
                                }
                                super.field8803[var9] = 0;
                                super.field8800[var183] = var184 = 65 + var9++;
                            }
                            var184 -= 65;
                            super.field8820[var184][super.field8803[var184]++] = var12;
                        }
                    }
                }
            }
        }
        if (arg4) {
            for (int var13 = 0; var13 < arg5; ++var13) {
                int var14 = super.field8809[var13] - arg2 >> var7;
                if (var14 >= 0 && var14 < 2200) {
                    if (super.field8800[var14] < 64) {
                        super.field8892[var14][super.field8800[var14]++] = var13 + 1 << 16;
                    } else {
                        int var15 = super.field8800[var14];
                        if (var15 == 64) {
                            if (var9 == 512) {
                                continue;
                            }
                            super.field8803[var9] = 0;
                            super.field8800[var14] = var15 = 65 + var9++;
                        }
                        var15 -= 65;
                        super.field8820[var15][super.field8803[var15]++] = var13 + 1 << 16;
                    }
                }
            }
        }
        if (super.field8879 == null) {
            if (!arg4 && super.field8819 == null) {
                if (arg1) {
                    for (int var16 = arg3 - 1; var16 >= 0; --var16) {
                        int var17 = super.field8800[var16];
                        if (var17 > 0) {
                            int var18 = var17 > 64 ? 64 : var17;
                            int[] var19 = super.field8892[var16];
                            for (int var20 = 0; var20 < var18; ++var20) {
                                this.method954(var19[var20]);
                            }
                        }
                        if (var17 > 64) {
                            int var21 = super.field8800[var16] - 64 - 1;
                            int[] var22 = super.field8820[var21];
                            for (int var23 = 0; var23 < super.field8803[var21]; ++var23) {
                                this.method954(var22[var23]);
                            }
                        }
                    }
                } else {
                    for (int var24 = arg3 - 1; var24 >= 0; --var24) {
                        int var25 = super.field8800[var24];
                        if (var25 > 0) {
                            int var26 = var25 > 64 ? 64 : var25;
                            int[] var27 = super.field8892[var24];
                            for (int var28 = 0; var28 < var26; ++var28) {
                                this.method949(var27[var28]);
                            }
                        }
                        if (var25 > 64) {
                            int var29 = super.field8800[var24] - 64 - 1;
                            int[] var30 = super.field8820[var29];
                            for (int var31 = 0; var31 < super.field8803[var29]; ++var31) {
                                this.method949(var30[var31]);
                            }
                        }
                    }
                }
            } else if (arg1) {
                for (int var32 = arg3 - 1; var32 >= 0; --var32) {
                    int var33 = super.field8800[var32];
                    if (var33 > 0) {
                        int var34 = var33 > 64 ? 64 : var33;
                        int[] var35 = super.field8892[var32];
                        for (int var36 = 0; var36 < var34; ++var36) {
                            int var37 = var35[var36];
                            if (var37 < 65536) {
                                int var38 = super.field8846[var37];
                                if (var38 == -1 || !super.field8819[var38].field7955) {
                                    this.method954(var37);
                                }
                            }
                        }
                    }
                    if (var33 > 64) {
                        int var39 = super.field8800[var32] - 64 - 1;
                        int[] var40 = super.field8820[var39];
                        for (int var41 = 0; var41 < super.field8803[var39]; ++var41) {
                            int var42 = var40[var41];
                            if (var42 < 65536) {
                                int var43 = super.field8846[var42];
                                if (var43 == -1 || !super.field8819[var43].field7955) {
                                    this.method954(var42);
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var44 = arg3 - 1; var44 >= 0; --var44) {
                    int var45 = super.field8800[var44];
                    if (var45 > 0) {
                        int var46 = var45 > 64 ? 64 : var45;
                        int[] var47 = super.field8892[var44];
                        for (int var48 = 0; var48 < var46; ++var48) {
                            int var49 = var47[var48];
                            if (var49 < 65536) {
                                int var50 = super.field8846[var49];
                                if (var50 != -1) {
                                    class592 var51 = super.field8819[var50];
                                    class162 var52 = super.field8802[var50];
                                    if (!var51.field7955) {
                                        this.method949(var49);
                                    }
                                    super.field8826.method935(var52.field1908, var52.field1912, var52.field1911, var52.field1907, var52.field1901, var52.field1904, var51.field7949 & 65535, var52.field1902, var51.field7947, var51.field7953);
                                } else {
                                    this.method949(var47[var48]);
                                }
                            } else {
                                int var53 = (var49 >> 16) - 1;
                                class688 var54 = super.field8796[var53];
                                int var55 = super.field8809[var53];
                                if (var55 == 0) {
                                    var55 = 1;
                                }
                                super.field8826.method936(var54, super.field8881[var53], super.field8866[var53], var55, (super.field8826.field7340 * var54.field9469 >> 12) / var55);
                            }
                        }
                    }
                    if (var45 > 64) {
                        int var56 = super.field8800[var44] - 64 - 1;
                        int[] var57 = super.field8820[var56];
                        for (int var58 = 0; var58 < super.field8803[var56]; ++var58) {
                            int var59 = var57[var58];
                            if (var59 < 65536) {
                                int var60 = super.field8846[var59];
                                if (var60 != -1) {
                                    class592 var61 = super.field8819[var60];
                                    class162 var62 = super.field8802[var60];
                                    if (!var61.field7955) {
                                        this.method949(var59);
                                    }
                                    super.field8826.method935(var62.field1908, var62.field1912, var62.field1911, var62.field1907, var62.field1901, var62.field1904, var61.field7949 & 65535, var62.field1902, var61.field7947, var61.field7953);
                                } else {
                                    this.method949(var57[var58]);
                                }
                            } else {
                                int var63 = (var59 >> 16) - 1;
                                class688 var64 = super.field8796[var63];
                                int var65 = super.field8809[var63];
                                if (var65 == 0) {
                                    var65 = 1;
                                }
                                super.field8826.method936(var64, super.field8881[var63], super.field8866[var63], var65, (super.field8826.field7340 * var64.field9469 >> 12) / var65);
                            }
                        }
                    }
                }
            }
        } else {
            for (int var66 = 0; var66 < 12; ++var66) {
                super.field8850[var66] = 0;
                super.field8865[var66] = 0;
            }
            if (arg4) {
                for (int var67 = arg3 - 1; var67 >= 0; --var67) {
                    int var68 = super.field8800[var67];
                    if (var68 > 0) {
                        int var69;
                        if (var68 > 64) {
                            var69 = 64;
                        } else {
                            var69 = var68;
                        }
                        int[] var70 = super.field8892[var67];
                        for (int var71 = 0; var71 < var69; ++var71) {
                            int var72 = var70[var71];
                            if (var72 < 65536) {
                                byte var73 = super.field8879[var72];
                                int var74 = super.field8850[var73]++;
                                super.field8805[var73][var74] = var72;
                                if (var73 < 10) {
                                    super.field8865[var73] += var67;
                                } else if (var73 == 10) {
                                    super.field8882[var74] = var67;
                                } else {
                                    super.field8860[var74] = var67;
                                }
                            } else {
                                byte var75 = super.field8796[(var72 >> 16) - 1].field9482;
                                int var76 = super.field8850[var75]++;
                                super.field8805[var75][var76] = var72;
                                if (var75 < 10) {
                                    super.field8865[var75] += var67;
                                } else if (var75 == 10) {
                                    super.field8882[var76] = var67;
                                } else {
                                    super.field8860[var76] = var67;
                                }
                            }
                        }
                    }
                    if (var68 > 64) {
                        int var77 = super.field8800[var67] - 64 - 1;
                        int[] var78 = super.field8820[var77];
                        for (int var79 = 0; var79 < super.field8803[var77]; ++var79) {
                            int var80 = var78[var79];
                            if (var80 < 65536) {
                                byte var81 = super.field8879[var80];
                                int var82 = super.field8850[var81]++;
                                super.field8805[var81][var82] = var80;
                                if (var81 < 10) {
                                    super.field8865[var81] += var67;
                                } else if (var81 == 10) {
                                    super.field8882[var82] = var67;
                                } else {
                                    super.field8860[var82] = var67;
                                }
                            } else {
                                byte var83 = super.field8796[(var80 >> 16) - 1].field9482;
                                int var84 = super.field8850[var83]++;
                                super.field8805[var83][var84] = var80;
                                if (var83 < 10) {
                                    super.field8865[var83] += var67;
                                } else if (var83 == 10) {
                                    super.field8882[var84] = var67;
                                } else {
                                    super.field8860[var84] = var67;
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var85 = arg3 - 1; var85 >= 0; --var85) {
                    int var146 = super.field8800[var85];
                    if (var146 > 0) {
                        int var147;
                        if (var146 > 64) {
                            var147 = 64;
                        } else {
                            var147 = var146;
                        }
                        int[] var148 = super.field8892[var85];
                        for (int var149 = 0; var149 < var147; ++var149) {
                            int var150 = var148[var149];
                            byte var151 = super.field8879[var150];
                            int var152 = super.field8850[var151]++;
                            super.field8805[var151][var152] = var150;
                            if (var151 < 10) {
                                super.field8865[var151] += var85;
                            } else if (var151 == 10) {
                                super.field8882[var152] = var85;
                            } else {
                                super.field8860[var152] = var85;
                            }
                        }
                    }
                    if (var146 > 64) {
                        int var153 = super.field8800[var85] - 64 - 1;
                        int[] var154 = super.field8820[var153];
                        for (int var155 = 0; var155 < super.field8803[var153]; ++var155) {
                            int var156 = var154[var155];
                            byte var157 = super.field8879[var156];
                            int var158 = super.field8850[var157]++;
                            super.field8805[var157][var158] = var156;
                            if (var157 < 10) {
                                super.field8865[var157] += var85;
                            } else if (var157 == 10) {
                                super.field8882[var158] = var85;
                            } else {
                                super.field8860[var158] = var85;
                            }
                        }
                    }
                }
            }
            int var86 = 0;
            if (super.field8850[1] > 0 || super.field8850[2] > 0) {
                var86 = (super.field8865[1] + super.field8865[2]) / (super.field8850[1] + super.field8850[2]);
            }
            int var87 = 0;
            if (super.field8850[3] > 0 || super.field8850[4] > 0) {
                var87 = (super.field8865[3] + super.field8865[4]) / (super.field8850[3] + super.field8850[4]);
            }
            int var88 = 0;
            if (super.field8850[6] > 0 || super.field8850[8] > 0) {
                var88 = (super.field8865[6] + super.field8865[8]) / (super.field8850[6] + super.field8850[8]);
            }
            int var89 = 0;
            int var90 = super.field8850[10];
            int[] var91 = super.field8805[10];
            int[] var92 = super.field8882;
            if (var89 == var90) {
                var89 = 0;
                var90 = super.field8850[11];
                var91 = super.field8805[11];
                var92 = super.field8860;
            }
            int var93;
            if (var89 < var90) {
                var93 = var92[var89];
            } else {
                var93 = -1000;
            }
            for (int var94 = 0; var94 < 10; ++var94) {
                if (arg1) {
                    while (var94 == 0 && var93 > var86) {
                        int var104 = var91[var89++];
                        if (var104 < 65536) {
                            int var105 = super.field8846[var104];
                            if (var105 == -1 || !super.field8819[var105].field7955) {
                                this.method954(var104);
                            }
                        }
                        if (var89 == var90 && super.field8805[11] != var91) {
                            var89 = 0;
                            var90 = super.field8850[11];
                            var91 = super.field8805[11];
                            var92 = super.field8860;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                    while (var94 == 3 && var93 > var87) {
                        int var106 = var91[var89++];
                        if (var106 < 65536) {
                            int var107 = super.field8846[var106];
                            if (var107 == -1 || !super.field8819[var107].field7955) {
                                this.method954(var106);
                            }
                        }
                        if (var89 == var90 && super.field8805[11] != var91) {
                            var89 = 0;
                            var90 = super.field8850[11];
                            var91 = super.field8805[11];
                            var92 = super.field8860;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                    while (var94 == 5 && var93 > var88) {
                        int var108 = var91[var89++];
                        if (var108 < 65536) {
                            int var109 = super.field8846[var108];
                            if (var109 == -1 || !super.field8819[var109].field7955) {
                                this.method954(var108);
                            }
                        }
                        if (var89 == var90 && super.field8805[11] != var91) {
                            var89 = 0;
                            var90 = super.field8850[11];
                            var91 = super.field8805[11];
                            var92 = super.field8860;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                } else {
                    while (var94 == 0 && var93 > var86) {
                        int var110 = var91[var89++];
                        if (var110 < 65536) {
                            int var111 = super.field8846[var110];
                            if (var111 != -1) {
                                class592 var112 = super.field8819[var111];
                                class162 var113 = super.field8802[var111];
                                if (!var112.field7955) {
                                    this.method949(var110);
                                }
                                super.field8826.method935(var113.field1908, var113.field1912, var113.field1911, var113.field1907, var113.field1901, var113.field1904, var112.field7949 & 65535, var113.field1902, var112.field7947, var112.field7953);
                            } else {
                                this.method949(var110);
                            }
                        } else {
                            int var114 = (var110 >> 16) - 1;
                            class688 var115 = super.field8796[var114];
                            int var116 = super.field8809[var114];
                            if (var116 == 0) {
                                var116 = 1;
                            }
                            super.field8826.method936(var115, super.field8881[var114], super.field8866[var114], var116, (super.field8826.field7340 * var115.field9469 >> 12) / var116);
                        }
                        if (var89 == var90 && super.field8805[11] != var91) {
                            var89 = 0;
                            var90 = super.field8850[11];
                            var91 = super.field8805[11];
                            var92 = super.field8860;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                    while (var94 == 3 && var93 > var87) {
                        int var117 = var91[var89++];
                        if (var117 < 65536) {
                            int var118 = super.field8846[var117];
                            if (var118 != -1) {
                                class592 var119 = super.field8819[var118];
                                class162 var120 = super.field8802[var118];
                                if (!var119.field7955) {
                                    this.method949(var117);
                                }
                                super.field8826.method935(var120.field1908, var120.field1912, var120.field1911, var120.field1907, var120.field1901, var120.field1904, var119.field7949 & 65535, var120.field1902, var119.field7947, var119.field7953);
                            } else {
                                this.method949(var117);
                            }
                        } else {
                            int var121 = (var117 >> 16) - 1;
                            class688 var122 = super.field8796[var121];
                            int var123 = super.field8809[var121];
                            if (var123 == 0) {
                                var123 = 1;
                            }
                            super.field8826.method936(var122, super.field8881[var121], super.field8866[var121], var123, (super.field8826.field7340 * var122.field9469 >> 12) / var123);
                        }
                        if (var89 == var90 && super.field8805[11] != var91) {
                            var89 = 0;
                            var90 = super.field8850[11];
                            var91 = super.field8805[11];
                            var92 = super.field8860;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                    while (var94 == 5 && var93 > var88) {
                        int var124 = var91[var89++];
                        if (var124 < 65536) {
                            int var125 = super.field8846[var124];
                            if (var125 != -1) {
                                class592 var126 = super.field8819[var125];
                                class162 var127 = super.field8802[var125];
                                if (!var126.field7955) {
                                    this.method949(var124);
                                }
                                super.field8826.method935(var127.field1908, var127.field1912, var127.field1911, var127.field1907, var127.field1901, var127.field1904, var126.field7949 & 65535, var127.field1902, var126.field7947, var126.field7953);
                            } else {
                                this.method949(var124);
                            }
                        } else {
                            int var128 = (var124 >> 16) - 1;
                            class688 var129 = super.field8796[var128];
                            int var130 = super.field8809[var128];
                            if (var130 == 0) {
                                var130 = 1;
                            }
                            super.field8826.method936(var129, super.field8881[var128], super.field8866[var128], var130, (super.field8826.field7340 * var129.field9469 >> 12) / var130);
                        }
                        if (var89 == var90 && super.field8805[11] != var91) {
                            var89 = 0;
                            var90 = super.field8850[11];
                            var91 = super.field8805[11];
                            var92 = super.field8860;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                }
                int var131 = super.field8850[var94];
                int[] var132 = super.field8805[var94];
                if (!arg4 && super.field8819 == null) {
                    if (arg1) {
                        for (int var133 = 0; var133 < var131; ++var133) {
                            this.method954(var132[var133]);
                        }
                    } else {
                        for (int var134 = 0; var134 < var131; ++var134) {
                            this.method949(var132[var134]);
                        }
                    }
                } else if (!arg1) {
                    for (int var138 = 0; var138 < var131; ++var138) {
                        int var139 = var132[var138];
                        if (var139 < 65536) {
                            int var140 = super.field8846[var139];
                            if (var140 != -1) {
                                class592 var141 = super.field8819[var140];
                                class162 var142 = super.field8802[var140];
                                if (!var141.field7955) {
                                    this.method949(var139);
                                }
                                super.field8826.method935(var142.field1908, var142.field1912, var142.field1911, var142.field1907, var142.field1901, var142.field1904, var141.field7949 & 65535, var142.field1902, var141.field7947, var141.field7953);
                            } else {
                                this.method949(var139);
                            }
                        } else {
                            int var143 = (var139 >> 16) - 1;
                            class688 var144 = super.field8796[var143];
                            int var145 = super.field8809[var143];
                            if (var145 == 0) {
                                var145 = 1;
                            }
                            super.field8826.method936(var144, super.field8881[var143], super.field8866[var143], var145, (super.field8826.field7340 * var144.field9469 >> 12) / var145);
                        }
                    }
                } else {
                    for (int var135 = 0; var135 < var131; ++var135) {
                        int var136 = var132[var135];
                        if (var136 < 65536) {
                            int var137 = super.field8846[var136];
                            if (var137 == -1 || !super.field8819[var137].field7955) {
                                this.method954(var136);
                            }
                        }
                    }
                }
            }
            if (!arg4 && super.field8819 == null) {
                if (arg1) {
                    while (var93 != -1000) {
                        this.method954(var91[var89++]);
                        if (var89 == var90 && super.field8805[11] != var91) {
                            var89 = 0;
                            var91 = super.field8805[11];
                            var90 = super.field8850[11];
                            var92 = super.field8860;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                } else {
                    while (var93 != -1000) {
                        this.method949(var91[var89++]);
                        if (var89 == var90 && super.field8805[11] != var91) {
                            var89 = 0;
                            var91 = super.field8805[11];
                            var90 = super.field8850[11];
                            var92 = super.field8860;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                }
            } else if (!arg1) {
                while (var93 != -1000) {
                    int var97 = var91[var89++];
                    if (var97 < 65536) {
                        int var98 = super.field8846[var97];
                        if (var98 != -1) {
                            class592 var99 = super.field8819[var98];
                            class162 var100 = super.field8802[var98];
                            if (!var99.field7955) {
                                this.method949(var97);
                            }
                            super.field8826.method935(var100.field1908, var100.field1912, var100.field1911, var100.field1907, var100.field1901, var100.field1904, var99.field7949 & 65535, var100.field1902, var99.field7947, var99.field7953);
                        } else {
                            this.method949(var97);
                        }
                    } else {
                        int var101 = (var97 >> 16) - 1;
                        class688 var102 = super.field8796[var101];
                        int var103 = super.field8809[var101];
                        if (var103 == 0) {
                            var103 = 1;
                        }
                        super.field8826.method936(var102, super.field8881[var101], super.field8866[var101], var103, (super.field8826.field7340 * var102.field9469 >> 12) / var103);
                    }
                    if (var89 == var90 && super.field8805[11] != var91) {
                        var89 = 0;
                        var91 = super.field8805[11];
                        var90 = super.field8850[11];
                        var92 = super.field8860;
                    }
                    if (var89 < var90) {
                        var93 = var92[var89];
                    } else {
                        var93 = -1000;
                    }
                }
            } else {
                while (var93 != -1000) {
                    int var95 = var91[var89++];
                    if (var95 < 65536) {
                        int var96 = super.field8846[var95];
                        if (var96 == -1 || !super.field8819[var96].field7955) {
                            this.method954(var95);
                        }
                    }
                    if (var89 == var90 && super.field8805[11] != var91) {
                        var89 = 0;
                        var91 = super.field8805[11];
                        var90 = super.field8850[11];
                        var92 = super.field8860;
                    }
                    if (var89 < var90) {
                        var93 = var92[var89];
                    } else {
                        var93 = -1000;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Llea;)V")
    public class155(class574 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V")
    private final void method954(int arg0) {
        if (!super.field8826.field7343) {
            short var2 = super.field8852[arg0];
            short var3 = super.field8835[arg0];
            short var4 = super.field8814[arg0];
            int var5 = super.field8880[var2] - super.field8826.field7377;
            if (var5 > 255) {
                var5 = 255;
            } else if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field8880[var3] - super.field8826.field7377;
            if (var6 > 255) {
                var6 = 255;
            } else if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field8880[var4] - super.field8826.field7377;
            if (var7 > 255) {
                var7 = 255;
            } else if (var7 < 0) {
                var7 = 0;
            }
            int var8 = var5 + var6 + var7;
            if (var8 != 765) {
                if (var8 == 0) {
                    this.method949(arg0);
                } else {
                    if (super.field8849 == null) {
                        this.field1836.field1496 = 0;
                    } else {
                        this.field1836.field1496 = super.field8849[arg0] & 255;
                    }
                    this.field1836.field1500 = super.field8869[arg0];
                    if (super.field8885 != null && super.field8885[arg0] != -1) {
                        int var10;
                        int var11;
                        int var12;
                        if (super.field8817 != null && super.field8817[arg0] != -1) {
                            int var9 = super.field8817[arg0] & 255;
                            var10 = super.field8813[var9];
                            var11 = super.field8887[var9];
                            var12 = super.field8855[var9];
                        } else {
                            var10 = var2;
                            var11 = var3;
                            var12 = var4;
                        }
                        if (super.field8795[arg0] == -1) {
                            this.field1836.method814(super.field8847[var2], super.field8847[var3], super.field8847[var4], super.field8863[var2], super.field8863[var3], super.field8863[var4], super.field8826.field7372, var5, var6, var7, super.field8797[arg0], super.field8797[arg0], super.field8797[arg0], super.field8899[var10], super.field8899[var11], super.field8899[var12], super.field8836[var10], super.field8836[var11], super.field8836[var12], super.field8812[var10], super.field8812[var11], super.field8812[var12], super.field8885[arg0]);
                        } else {
                            this.field1836.method814(super.field8847[var2], super.field8847[var3], super.field8847[var4], super.field8863[var2], super.field8863[var3], super.field8863[var4], super.field8826.field7372, var5, var6, var7, super.field8797[arg0], super.field8848[arg0], super.field8795[arg0], super.field8899[var10], super.field8899[var11], super.field8899[var12], super.field8836[var10], super.field8836[var11], super.field8836[var12], super.field8812[var10], super.field8812[var11], super.field8812[var12], super.field8885[arg0]);
                        }
                    } else if (super.field8795[arg0] == -1) {
                        this.field1836.method816(super.field8847[var2], super.field8847[var3], super.field8847[var4], super.field8863[var2], super.field8863[var3], super.field8863[var4], class232.method1402(4379, var5 << 24 | super.field8826.field7372, class644.field8740[super.field8797[arg0] & 65535]), class232.method1402(4379, var6 << 24 | super.field8826.field7372, class644.field8740[super.field8797[arg0] & 65535]), class232.method1402(4379, var7 << 24 | super.field8826.field7372, class644.field8740[super.field8797[arg0] & 65535]));
                    } else {
                        this.field1836.method816(super.field8847[var2], super.field8847[var3], super.field8847[var4], super.field8863[var2], super.field8863[var3], super.field8863[var4], class232.method1402(4379, var5 << 24 | super.field8826.field7372, class644.field8740[super.field8797[arg0] & 65535]), class232.method1402(4379, var6 << 24 | super.field8826.field7372, class644.field8740[super.field8848[arg0] & 65535]), class232.method1402(4379, var7 << 24 | super.field8826.field7372, class644.field8740[super.field8795[arg0] & 65535]));
                    }
                }
            }
        } else if (!super.field8798[arg0]) {
            short var13 = super.field8852[arg0];
            short var14 = super.field8835[arg0];
            short var15 = super.field8814[arg0];
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            if (super.field8823[var13] > super.field8826.field7354) {
                var16 = 255;
            } else if (super.field8823[var13] > super.field8826.field7342) {
                var16 = (super.field8826.field7342 - super.field8823[var13]) * 255 / (super.field8826.field7342 - super.field8826.field7354);
            }
            if (super.field8823[var14] > super.field8826.field7354) {
                var17 = 255;
            } else if (super.field8823[var14] > super.field8826.field7342) {
                var17 = (super.field8826.field7342 - super.field8823[var14]) * 255 / (super.field8826.field7342 - super.field8826.field7354);
            }
            if (super.field8823[var15] > super.field8826.field7354) {
                var18 = 255;
            } else if (super.field8823[var15] > super.field8826.field7342) {
                var18 = (super.field8826.field7342 - super.field8823[var15]) * 255 / (super.field8826.field7342 - super.field8826.field7354);
            }
            if (super.field8849 == null) {
                this.field1836.field1496 = 0;
            } else {
                this.field1836.field1496 = super.field8849[arg0] & 255;
            }
            this.field1836.field1500 = super.field8869[arg0];
            if (super.field8885 != null && super.field8885[arg0] != -1) {
                int var20;
                int var21;
                int var22;
                if (super.field8817 != null && super.field8817[arg0] != -1) {
                    int var19 = super.field8817[arg0] & 255;
                    var20 = super.field8813[var19];
                    var21 = super.field8887[var19];
                    var22 = super.field8855[var19];
                } else {
                    var20 = var13;
                    var21 = var14;
                    var22 = var15;
                }
                if (super.field8795[arg0] == -1) {
                    this.field1836.method814(super.field8847[var13], super.field8847[var14], super.field8847[var15], super.field8863[var13], super.field8863[var14], super.field8863[var15], super.field8826.field7372, var16, var17, var18, super.field8797[arg0], super.field8797[arg0], super.field8797[arg0], super.field8899[var20], super.field8899[var21], super.field8899[var22], super.field8836[var20], super.field8836[var21], super.field8836[var22], super.field8812[var20], super.field8812[var21], super.field8812[var22], super.field8885[arg0]);
                } else {
                    this.field1836.method814(super.field8847[var13], super.field8847[var14], super.field8847[var15], super.field8863[var13], super.field8863[var14], super.field8863[var15], super.field8826.field7372, var16, var17, var18, super.field8797[arg0], super.field8848[arg0], super.field8795[arg0], super.field8899[var20], super.field8899[var21], super.field8899[var22], super.field8836[var20], super.field8836[var21], super.field8836[var22], super.field8812[var20], super.field8812[var21], super.field8812[var22], super.field8885[arg0]);
                }
            } else if (super.field8795[arg0] == -1) {
                this.field1836.method816(super.field8847[var13], super.field8847[var14], super.field8847[var15], super.field8863[var13], super.field8863[var14], super.field8863[var15], class232.method1402(4379, var16 << 24 | super.field8826.field7372, class644.field8740[super.field8797[arg0] & 65535]), class232.method1402(4379, var17 << 24 | super.field8826.field7372, class644.field8740[super.field8797[arg0] & 65535]), class232.method1402(4379, var18 << 24 | super.field8826.field7372, class644.field8740[super.field8797[arg0] & 65535]));
            } else {
                this.field1836.method816(super.field8847[var13], super.field8847[var14], super.field8847[var15], super.field8863[var13], super.field8863[var14], super.field8863[var15], class232.method1402(4379, var16 << 24 | super.field8826.field7372, class644.field8740[super.field8797[arg0] & 65535]), class232.method1402(4379, var17 << 24 | super.field8826.field7372, class644.field8740[super.field8848[arg0] & 65535]), class232.method1402(4379, var18 << 24 | super.field8826.field7372, class644.field8740[super.field8795[arg0] & 65535]));
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public final void method955(int arg0) {
        this.field1836.field1502 = (arg0 & 1) == 0;
        this.field1836.field1507 = false;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Llea;Lnj;IIII)V")
    public class155(class574 arg0, class229 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Llea;[Luh;)V")
    private class155(class574 arg0, class155[] arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "()V")
    public final void method956() {
        this.field1836 = null;
    }
}
