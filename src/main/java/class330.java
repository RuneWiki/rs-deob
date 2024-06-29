import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class330 extends class651 {

    @OriginalMember(owner = "client!jp", name = "lc", descriptor = "Llca;")
    private class603 field4100;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
    public final void method955(int arg0) {
        this.field4100.field8091 = (arg0 & 1) == 0;
        this.field4100.field8092 = false;
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
    private final void method1892(int arg0) {
        short var2 = super.field8852[arg0];
        short var3 = super.field8835[arg0];
        short var4 = super.field8814[arg0];
        this.field4100.field8096 = super.field8869[arg0];
        if (super.field8849 == null) {
            this.field4100.field8087 = 0;
        } else {
            this.field4100.field8087 = super.field8849[arg0] & 255;
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
                this.field4100.method3316(super.field8847[var2], super.field8847[var3], super.field8847[var4], super.field8863[var2], super.field8863[var3], super.field8863[var4], super.field8880[var2], super.field8880[var3], super.field8880[var4], super.field8797[arg0], super.field8797[arg0], super.field8797[arg0], super.field8899[var6], super.field8899[var7], super.field8899[var8], super.field8836[var6], super.field8836[var7], super.field8836[var8], super.field8812[var6], super.field8812[var7], super.field8812[var8], super.field8885[arg0]);
            } else {
                this.field4100.method3316(super.field8847[var2], super.field8847[var3], super.field8847[var4], super.field8863[var2], super.field8863[var3], super.field8863[var4], super.field8880[var2], super.field8880[var3], super.field8880[var4], super.field8797[arg0], super.field8848[arg0], super.field8795[arg0], super.field8899[var6], super.field8899[var7], super.field8899[var8], super.field8836[var6], super.field8836[var7], super.field8836[var8], super.field8812[var6], super.field8812[var7], super.field8812[var8], super.field8885[arg0]);
            }
        } else if (super.field8795[arg0] == -1) {
            this.field4100.method3312(super.field8847[var2], super.field8847[var3], super.field8847[var4], super.field8863[var2], super.field8863[var3], super.field8863[var4], super.field8880[var2], super.field8880[var3], super.field8880[var4], class644.field8740[super.field8797[arg0] & 65535]);
        } else {
            this.field4100.method3313(super.field8847[var2], super.field8847[var3], super.field8847[var4], super.field8863[var2], super.field8863[var3], super.field8863[var4], super.field8880[var2], super.field8880[var3], super.field8880[var4], super.field8797[arg0] & 65535, super.field8848[arg0] & 65535, super.field8795[arg0] & 65535);
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Llea;)V")
    public class330(class574 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)V")
    private final void method1893(int arg0) {
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
                    this.method1892(arg0);
                } else {
                    if (super.field8849 == null) {
                        this.field4100.field8087 = 0;
                    } else {
                        this.field4100.field8087 = super.field8849[arg0] & 255;
                    }
                    this.field4100.field8096 = super.field8869[arg0];
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
                            this.field4100.method3317(super.field8847[var2], super.field8847[var3], super.field8847[var4], super.field8863[var2], super.field8863[var3], super.field8863[var4], super.field8880[var2], super.field8880[var3], super.field8880[var4], super.field8826.field7372, var5, var6, var7, super.field8797[arg0], super.field8797[arg0], super.field8797[arg0], super.field8899[var10], super.field8899[var11], super.field8899[var12], super.field8836[var10], super.field8836[var11], super.field8836[var12], super.field8812[var10], super.field8812[var11], super.field8812[var12], super.field8885[arg0]);
                        } else {
                            this.field4100.method3317(super.field8847[var2], super.field8847[var3], super.field8847[var4], super.field8863[var2], super.field8863[var3], super.field8863[var4], super.field8880[var2], super.field8880[var3], super.field8880[var4], super.field8826.field7372, var5, var6, var7, super.field8797[arg0], super.field8848[arg0], super.field8795[arg0], super.field8899[var10], super.field8899[var11], super.field8899[var12], super.field8836[var10], super.field8836[var11], super.field8836[var12], super.field8812[var10], super.field8812[var11], super.field8812[var12], super.field8885[arg0]);
                        }
                    } else if (super.field8795[arg0] == -1) {
                        this.field4100.method3330(super.field8847[var2], super.field8847[var3], super.field8847[var4], super.field8863[var2], super.field8863[var3], super.field8863[var4], super.field8880[var2], super.field8880[var3], super.field8880[var4], class232.method1402(4379, var5 << 24 | super.field8826.field7372, class644.field8740[super.field8797[arg0] & 65535]), class232.method1402(4379, var6 << 24 | super.field8826.field7372, class644.field8740[super.field8797[arg0] & 65535]), class232.method1402(4379, var7 << 24 | super.field8826.field7372, class644.field8740[super.field8797[arg0] & 65535]));
                    } else {
                        this.field4100.method3330(super.field8847[var2], super.field8847[var3], super.field8847[var4], super.field8863[var2], super.field8863[var3], super.field8863[var4], super.field8880[var2], super.field8880[var3], super.field8880[var4], class232.method1402(4379, var5 << 24 | super.field8826.field7372, class644.field8740[super.field8797[arg0] & 65535]), class232.method1402(4379, var6 << 24 | super.field8826.field7372, class644.field8740[super.field8848[arg0] & 65535]), class232.method1402(4379, var7 << 24 | super.field8826.field7372, class644.field8740[super.field8795[arg0] & 65535]));
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
                this.field4100.field8087 = 0;
            } else {
                this.field4100.field8087 = super.field8849[arg0] & 255;
            }
            this.field4100.field8096 = super.field8869[arg0];
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
                    this.field4100.method3317(super.field8847[var13], super.field8847[var14], super.field8847[var15], super.field8863[var13], super.field8863[var14], super.field8863[var15], super.field8880[var13], super.field8880[var14], super.field8880[var15], super.field8826.field7372, var16, var17, var18, super.field8797[arg0], super.field8797[arg0], super.field8797[arg0], super.field8899[var20], super.field8899[var21], super.field8899[var22], super.field8836[var20], super.field8836[var21], super.field8836[var22], super.field8812[var20], super.field8812[var21], super.field8812[var22], super.field8885[arg0]);
                } else {
                    this.field4100.method3317(super.field8847[var13], super.field8847[var14], super.field8847[var15], super.field8863[var13], super.field8863[var14], super.field8863[var15], super.field8880[var13], super.field8880[var14], super.field8880[var15], super.field8826.field7372, var16, var17, var18, super.field8797[arg0], super.field8848[arg0], super.field8795[arg0], super.field8899[var20], super.field8899[var21], super.field8899[var22], super.field8836[var20], super.field8836[var21], super.field8836[var22], super.field8812[var20], super.field8812[var21], super.field8812[var22], super.field8885[arg0]);
                }
            } else if (super.field8795[arg0] == -1) {
                this.field4100.method3330(super.field8847[var13], super.field8847[var14], super.field8847[var15], super.field8863[var13], super.field8863[var14], super.field8863[var15], super.field8880[var13], super.field8880[var14], super.field8880[var15], class232.method1402(4379, var16 << 24 | super.field8826.field7372, class644.field8740[super.field8797[arg0] & 65535]), class232.method1402(4379, var17 << 24 | super.field8826.field7372, class644.field8740[super.field8797[arg0] & 65535]), class232.method1402(4379, var18 << 24 | super.field8826.field7372, class644.field8740[super.field8797[arg0] & 65535]));
            } else {
                this.field4100.method3330(super.field8847[var13], super.field8847[var14], super.field8847[var15], super.field8863[var13], super.field8863[var14], super.field8863[var15], super.field8880[var13], super.field8880[var14], super.field8880[var15], class232.method1402(4379, var16 << 24 | super.field8826.field7372, class644.field8740[super.field8797[arg0] & 65535]), class232.method1402(4379, var17 << 24 | super.field8826.field7372, class644.field8740[super.field8848[arg0] & 65535]), class232.method1402(4379, var18 << 24 | super.field8826.field7372, class644.field8740[super.field8795[arg0] & 65535]));
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZZIIZI)V")
    public final void method953(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (super.field8819 != null) {
            int var7 = 0;
            while (var7 < super.field8810) {
                class592 var8 = super.field8819[var7];
                super.field8846[var8.field7954] = var7++;
            }
        }
        for (int var9 = 0; var9 < super.field8895; ++var9) {
            if (super.field8849 == null || super.field8849[var9] == 0) {
                this.method1894(var9, arg0, arg1);
            }
        }
        if (super.field8806) {
            if (super.field8879 == null) {
                for (int var10 = 0; var10 < super.field8895; ++var10) {
                    if (super.field8849 == null || super.field8849[var10] != 0) {
                        this.method1894(var10, arg0, arg1);
                    }
                }
            } else {
                for (int var11 = 0; var11 < 12; ++var11) {
                    for (int var12 = 0; var12 < super.field8895; ++var12) {
                        if ((super.field8849 == null || super.field8849[var12] != 0) && super.field8879[var12] == var11) {
                            this.method1894(var12, arg0, arg1);
                        }
                    }
                }
            }
        }
        if (arg4) {
            for (int var13 = 0; var13 < arg5; ++var13) {
                class688 var14 = super.field8796[var13];
                int var15 = super.field8809[var13];
                if (var15 == 0) {
                    var15 = 1;
                }
                super.field8826.method936(var14, super.field8881[var13], super.field8866[var13], var15, (super.field8826.field7340 * var14.field9469 >> 12) / var15);
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BIZ)Lba;")
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
            var5 = var4 = new class330(super.field8826);
        }
        return this.method3651(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/Thread;)V")
    public final void method952(Thread arg0) {
        super.method952(arg0);
        class231 var2 = (class231) super.field8826.method937(arg0);
        this.field4100 = var2.field3010;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZZ)V")
    private final void method1894(int arg0, boolean arg1, boolean arg2) {
        if (super.field8795[arg0] != -2) {
            short var4 = super.field8852[arg0];
            short var5 = super.field8835[arg0];
            short var6 = super.field8814[arg0];
            int var7 = super.field8863[var4];
            int var8 = super.field8863[var5];
            int var9 = super.field8863[var6];
            if (!arg1 || var7 != -5000 && var8 != -5000 && var9 != -5000) {
                if (super.field8846[arg0] != -1 || (super.field8847[var6] - super.field8847[var5]) * (var7 - var8) - (super.field8847[var4] - super.field8847[var5]) * (var9 - var8) > 0) {
                    if (var7 >= 0 && var8 >= 0 && var9 >= 0 && var7 <= super.field8861.field9349 && var8 <= super.field8861.field9349 && var9 <= super.field8861.field9349) {
                        super.field8869[arg0] = false;
                    } else {
                        super.field8869[arg0] = true;
                    }
                    if (arg2) {
                        int var28 = super.field8846[arg0];
                        if (var28 == -1 || !super.field8819[var28].field7955) {
                            this.method1893(arg0);
                        }
                        return;
                    }
                    int var29 = super.field8846[arg0];
                    if (var29 != -1) {
                        class592 var30 = super.field8819[var29];
                        class162 var31 = super.field8802[var29];
                        if (!var30.field7955) {
                            this.method1892(arg0);
                        }
                        super.field8826.method935(var31.field1908, var31.field1912, var31.field1911, var31.field1907, var31.field1901, var31.field1904, var30.field7949 & 65535, var31.field1902, var30.field7947, var30.field7953);
                        return;
                    }
                    this.method1892(arg0);
                }
            } else {
                int var10 = super.field8899[var4];
                int var11 = super.field8899[var5];
                int var12 = super.field8899[var6];
                int var13 = super.field8836[var4];
                int var14 = super.field8836[var5];
                int var15 = super.field8836[var6];
                int var16 = super.field8812[var4];
                int var17 = super.field8812[var5];
                int var18 = super.field8812[var6];
                int var19 = var10 - var11;
                int var20 = var12 - var11;
                int var21 = var13 - var14;
                int var22 = var15 - var14;
                int var23 = var16 - var17;
                int var24 = var18 - var17;
                int var25 = var21 * var24 - var22 * var23;
                int var26 = var20 * var23 - var19 * var24;
                int var27 = var19 * var22 - var20 * var21;
                if (var17 * var27 + var11 * var25 + var14 * var26 > 0) {
                    this.method1895(arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "(I)V")
    private final void method1895(int arg0) {
        int var2 = 0;
        int var3 = super.field8826.field7351;
        short var4 = super.field8852[arg0];
        short var5 = super.field8835[arg0];
        short var6 = super.field8814[arg0];
        int var7 = super.field8812[var4];
        int var8 = super.field8812[var5];
        int var9 = super.field8812[var6];
        if (super.field8849 == null) {
            this.field4100.field8087 = 0;
        } else {
            this.field4100.field8087 = super.field8849[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field8804[var2] = super.field8863[var4];
            super.field8816[var2] = super.field8847[var4];
            super.field8888[var2] = super.field8880[var4];
            super.field8851[var2++] = super.field8797[arg0] & 65535;
        } else {
            int var10 = super.field8899[var4];
            int var11 = super.field8836[var4];
            int var12 = super.field8797[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class651.field8898[var9 - var7];
                super.field8804[var2] = (((super.field8899[var6] - var10) * var13 >> 16) + var10) * super.field8826.field7340 / var3 + super.field8861.field9320;
                super.field8816[var2] = (((super.field8836[var6] - var11) * var13 >> 16) + var11) * super.field8826.field7363 / var3 + super.field8861.field9315;
                super.field8888[var2] = var3;
                super.field8851[var2++] = (((super.field8795[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class651.field8898[var8 - var7];
                super.field8804[var2] = (((super.field8899[var5] - var10) * var14 >> 16) + var10) * super.field8826.field7340 / var3 + super.field8861.field9320;
                super.field8816[var2] = (((super.field8836[var5] - var11) * var14 >> 16) + var11) * super.field8826.field7363 / var3 + super.field8861.field9315;
                super.field8888[var2] = var3;
                super.field8851[var2++] = (((super.field8848[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field8804[var2] = super.field8863[var5];
            super.field8816[var2] = super.field8847[var5];
            super.field8888[var2] = super.field8880[var5];
            super.field8851[var2++] = super.field8848[arg0] & 65535;
        } else {
            int var15 = super.field8899[var5];
            int var16 = super.field8836[var5];
            int var17 = super.field8848[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class651.field8898[var7 - var8];
                super.field8804[var2] = (((super.field8899[var4] - var15) * var18 >> 16) + var15) * super.field8826.field7340 / var3 + super.field8861.field9320;
                super.field8816[var2] = (((super.field8836[var4] - var16) * var18 >> 16) + var16) * super.field8826.field7363 / var3 + super.field8861.field9315;
                super.field8888[var2] = var3;
                super.field8851[var2++] = (((super.field8797[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class651.field8898[var9 - var8];
                super.field8804[var2] = (((super.field8899[var6] - var15) * var19 >> 16) + var15) * super.field8826.field7340 / var3 + super.field8861.field9320;
                super.field8816[var2] = (((super.field8836[var6] - var16) * var19 >> 16) + var16) * super.field8826.field7363 / var3 + super.field8861.field9315;
                super.field8888[var2] = var3;
                super.field8851[var2++] = (((super.field8795[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field8804[var2] = super.field8863[var6];
            super.field8816[var2] = super.field8847[var6];
            super.field8888[var2] = super.field8880[var6];
            super.field8851[var2++] = super.field8795[arg0] & 65535;
        } else {
            int var20 = super.field8899[var6];
            int var21 = super.field8836[var6];
            int var22 = super.field8795[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class651.field8898[var8 - var9];
                super.field8804[var2] = (((super.field8899[var5] - var20) * var23 >> 16) + var20) * super.field8826.field7340 / var3 + super.field8861.field9320;
                super.field8816[var2] = (((super.field8836[var5] - var21) * var23 >> 16) + var21) * super.field8826.field7363 / var3 + super.field8861.field9315;
                super.field8888[var2] = var3;
                super.field8851[var2++] = (((super.field8848[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class651.field8898[var7 - var9];
                super.field8804[var2] = (((super.field8899[var4] - var20) * var24 >> 16) + var20) * super.field8826.field7340 / var3 + super.field8861.field9320;
                super.field8816[var2] = (((super.field8836[var4] - var21) * var24 >> 16) + var21) * super.field8826.field7363 / var3 + super.field8861.field9315;
                super.field8888[var2] = var3;
                super.field8851[var2++] = (((super.field8797[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field8804[0];
        int var26 = super.field8804[1];
        int var27 = super.field8804[2];
        int var28 = super.field8816[0];
        int var29 = super.field8816[1];
        int var30 = super.field8816[2];
        int var31 = super.field8888[0];
        int var32 = super.field8888[1];
        int var33 = super.field8888[2];
        this.field4100.field8096 = false;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field8861.field9349 || var26 > super.field8861.field9349 || var27 > super.field8861.field9349) {
                this.field4100.field8096 = true;
            }
            if (super.field8885 != null && super.field8885[arg0] != -1) {
                int var35;
                int var36;
                int var37;
                if (super.field8817 != null && super.field8817[arg0] != -1) {
                    int var34 = super.field8817[arg0] & 255;
                    var35 = super.field8813[var34];
                    var36 = super.field8887[var34];
                    var37 = super.field8855[var34];
                } else {
                    var35 = var4;
                    var36 = var5;
                    var37 = var6;
                }
                if (super.field8795[arg0] == -1) {
                    this.field4100.method3316(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field8797[arg0], super.field8797[arg0], super.field8797[arg0], super.field8899[var35], super.field8899[var36], super.field8899[var37], super.field8836[var35], super.field8836[var36], super.field8836[var37], super.field8812[var35], super.field8812[var36], super.field8812[var37], super.field8885[arg0]);
                } else {
                    this.field4100.method3316(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field8851[0], super.field8851[1], super.field8851[2], super.field8899[var35], super.field8899[var36], super.field8899[var37], super.field8836[var35], super.field8836[var36], super.field8836[var37], super.field8812[var35], super.field8812[var36], super.field8812[var37], super.field8885[arg0]);
                }
            } else if (super.field8795[arg0] == -1) {
                this.field4100.method3312(var28, var29, var30, var25, var26, var27, var31, var32, var33, class644.field8740[super.field8797[arg0] & 65535]);
            } else {
                this.field4100.method3313(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field8851[0], super.field8851[1], super.field8851[2]);
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field8861.field9349 || var26 > super.field8861.field9349 || var27 > super.field8861.field9349 || super.field8804[3] < 0 || super.field8804[3] > super.field8861.field9349) {
                this.field4100.field8096 = true;
            }
            if (super.field8885 == null || super.field8885[arg0] == -1) {
                if (super.field8795[arg0] == -1) {
                    int var43 = class644.field8740[super.field8797[arg0] & 65535];
                    this.field4100.method3312(var28, var29, var30, var25, var26, var27, var31, var32, var33, var43);
                    this.field4100.method3312(var28, var30, super.field8816[3], var25, var27, super.field8804[3], var31, var32, super.field8888[3], var43);
                    return;
                }
                this.field4100.method3313(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field8851[0], super.field8851[1], super.field8851[2]);
                this.field4100.method3313(var28, var30, super.field8816[3], var25, var27, super.field8804[3], var31, var32, super.field8888[3], super.field8851[0], super.field8851[2], super.field8851[3]);
                return;
            }
            int var39;
            int var40;
            int var41;
            if (super.field8817 != null && super.field8817[arg0] != -1) {
                int var38 = super.field8817[arg0] & 255;
                var39 = super.field8813[var38];
                var40 = super.field8887[var38];
                var41 = super.field8855[var38];
            } else {
                var39 = var4;
                var40 = var5;
                var41 = var6;
            }
            short var42 = super.field8885[arg0];
            if (super.field8795[arg0] == -1) {
                this.field4100.method3316(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field8797[arg0], super.field8797[arg0], super.field8797[arg0], super.field8899[var39], super.field8899[var40], super.field8899[var41], super.field8836[var39], super.field8836[var40], super.field8836[var41], super.field8812[var39], super.field8812[var40], super.field8812[var41], var42);
                this.field4100.method3316(var28, var30, super.field8816[3], var25, var27, super.field8804[3], var31, var32, super.field8888[3], super.field8797[arg0], super.field8797[arg0], super.field8797[arg0], super.field8899[var39], super.field8899[var40], super.field8899[var41], super.field8836[var39], super.field8836[var40], super.field8836[var41], super.field8812[var39], super.field8812[var40], super.field8812[var41], var42);
                return;
            }
            this.field4100.method3316(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field8851[0], super.field8851[1], super.field8851[2], super.field8899[var39], super.field8899[var40], super.field8899[var41], super.field8836[var39], super.field8836[var40], super.field8836[var41], super.field8812[var39], super.field8812[var40], super.field8812[var41], var42);
            this.field4100.method3316(var28, var30, super.field8816[3], var25, var27, super.field8804[3], var31, var32, super.field8888[3], super.field8851[0], super.field8851[2], super.field8851[3], super.field8899[var39], super.field8899[var40], super.field8899[var41], super.field8836[var39], super.field8836[var40], super.field8836[var41], super.field8812[var39], super.field8812[var40], super.field8812[var41], var42);
        }
    }

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "()V")
    public final void method950() {
        super.field8861.field9349 = this.field4100.field8085;
        super.field8861.field9320 = this.field4100.field8089;
        super.field8861.field9315 = this.field4100.field8086;
    }

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "()V")
    public final void method956() {
        this.field4100 = null;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Llea;Lnj;IIII)V")
    public class330(class574 arg0, class229 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
