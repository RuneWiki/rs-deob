import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class444 extends class115 {

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "Lgd;")
    private class406 field6118;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZZ)V")
    private final void method2550(int arg0, boolean arg1, boolean arg2) {
        if (super.field1462[arg0] != -2) {
            short var4 = super.field1441[arg0];
            short var5 = super.field1460[arg0];
            short var6 = super.field1481[arg0];
            int var7 = super.field1457[var4];
            int var8 = super.field1457[var5];
            int var9 = super.field1457[var6];
            if (!arg1 || var7 != -5000 && var8 != -5000 && var9 != -5000) {
                if (super.field1454[arg0] != -1 || (super.field1482[var6] - super.field1482[var5]) * (var7 - var8) - (super.field1482[var4] - super.field1482[var5]) * (var9 - var8) > 0) {
                    if (var7 >= 0 && var8 >= 0 && var9 >= 0 && var7 <= super.field1439.field5367 && var8 <= super.field1439.field5367 && var9 <= super.field1439.field5367) {
                        super.field1448[arg0] = false;
                    } else {
                        super.field1448[arg0] = true;
                    }
                    if (arg2) {
                        int var28 = super.field1454[arg0];
                        if (var28 == -1 || !super.field1392[var28].field8537) {
                            this.method2551(arg0);
                        }
                        return;
                    }
                    int var29 = super.field1454[arg0];
                    if (var29 != -1) {
                        class628 var30 = super.field1392[var29];
                        class634 var31 = super.field1463[var29];
                        if (!var30.field8537) {
                            this.method2552(arg0);
                        }
                        super.field1436.method1795(var31.field8642, var31.field8640, var31.field8639, var31.field8647, var31.field8637, var31.field8648, var30.field8541 & 65535, var31.field8645, var30.field8533, var30.field8540);
                        return;
                    }
                    this.method2552(arg0);
                }
            } else {
                int var10 = super.field1421[var4];
                int var11 = super.field1421[var5];
                int var12 = super.field1421[var6];
                int var13 = super.field1434[var4];
                int var14 = super.field1434[var5];
                int var15 = super.field1434[var6];
                int var16 = super.field1461[var4];
                int var17 = super.field1461[var5];
                int var18 = super.field1461[var6];
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
                    this.method2553(arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "()V")
    public final void method654() {
        this.field6118 = null;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
    private final void method2551(int arg0) {
        if (!super.field1436.field8618) {
            short var2 = super.field1441[arg0];
            short var3 = super.field1460[arg0];
            short var4 = super.field1481[arg0];
            int var5 = super.field1431[var2] - super.field1436.field8631;
            if (var5 > 255) {
                var5 = 255;
            } else if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1431[var3] - super.field1436.field8631;
            if (var6 > 255) {
                var6 = 255;
            } else if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field1431[var4] - super.field1436.field8631;
            if (var7 > 255) {
                var7 = 255;
            } else if (var7 < 0) {
                var7 = 0;
            }
            int var8 = var5 + var6 + var7;
            if (var8 != 765) {
                if (var8 == 0) {
                    this.method2552(arg0);
                } else {
                    if (super.field1417 == null) {
                        this.field6118.field5727 = 0;
                    } else {
                        this.field6118.field5727 = super.field1417[arg0] & 255;
                    }
                    this.field6118.field5725 = super.field1448[arg0];
                    if (super.field1458 != null && super.field1458[arg0] != -1) {
                        int var10;
                        int var11;
                        int var12;
                        if (super.field1424 != null && super.field1424[arg0] != -1) {
                            int var9 = super.field1424[arg0] & 255;
                            var10 = super.field1410[var9];
                            var11 = super.field1440[var9];
                            var12 = super.field1403[var9];
                        } else {
                            var10 = var2;
                            var11 = var3;
                            var12 = var4;
                        }
                        if (super.field1462[arg0] == -1) {
                            this.field6118.method2386(super.field1482[var2], super.field1482[var3], super.field1482[var4], super.field1457[var2], super.field1457[var3], super.field1457[var4], super.field1431[var2], super.field1431[var3], super.field1431[var4], super.field1436.field8605, var5, var6, var7, super.field1455[arg0], super.field1455[arg0], super.field1455[arg0], super.field1421[var10], super.field1421[var11], super.field1421[var12], super.field1434[var10], super.field1434[var11], super.field1434[var12], super.field1461[var10], super.field1461[var11], super.field1461[var12], super.field1458[arg0]);
                        } else {
                            this.field6118.method2386(super.field1482[var2], super.field1482[var3], super.field1482[var4], super.field1457[var2], super.field1457[var3], super.field1457[var4], super.field1431[var2], super.field1431[var3], super.field1431[var4], super.field1436.field8605, var5, var6, var7, super.field1455[arg0], super.field1470[arg0], super.field1462[arg0], super.field1421[var10], super.field1421[var11], super.field1421[var12], super.field1434[var10], super.field1434[var11], super.field1434[var12], super.field1461[var10], super.field1461[var11], super.field1461[var12], super.field1458[arg0]);
                        }
                    } else if (super.field1462[arg0] == -1) {
                        this.field6118.method2382(super.field1482[var2], super.field1482[var3], super.field1482[var4], super.field1457[var2], super.field1457[var3], super.field1457[var4], super.field1431[var2], super.field1431[var3], super.field1431[var4], class584.method3272(var5 << 24 | super.field1436.field8605, class554.field7586[super.field1455[arg0] & 65535], (byte) 96), class584.method3272(var6 << 24 | super.field1436.field8605, class554.field7586[super.field1455[arg0] & 65535], (byte) 96), class584.method3272(var7 << 24 | super.field1436.field8605, class554.field7586[super.field1455[arg0] & 65535], (byte) 96));
                    } else {
                        this.field6118.method2382(super.field1482[var2], super.field1482[var3], super.field1482[var4], super.field1457[var2], super.field1457[var3], super.field1457[var4], super.field1431[var2], super.field1431[var3], super.field1431[var4], class584.method3272(var5 << 24 | super.field1436.field8605, class554.field7586[super.field1455[arg0] & 65535], (byte) 96), class584.method3272(var6 << 24 | super.field1436.field8605, class554.field7586[super.field1470[arg0] & 65535], (byte) 96), class584.method3272(var7 << 24 | super.field1436.field8605, class554.field7586[super.field1462[arg0] & 65535], (byte) 96));
                    }
                }
            }
        } else if (!super.field1397[arg0]) {
            short var13 = super.field1441[arg0];
            short var14 = super.field1460[arg0];
            short var15 = super.field1481[arg0];
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            if (super.field1465[var13] > super.field1436.field8623) {
                var16 = 255;
            } else if (super.field1465[var13] > super.field1436.field8626) {
                var16 = (super.field1436.field8626 - super.field1465[var13]) * 255 / (super.field1436.field8626 - super.field1436.field8623);
            }
            if (super.field1465[var14] > super.field1436.field8623) {
                var17 = 255;
            } else if (super.field1465[var14] > super.field1436.field8626) {
                var17 = (super.field1436.field8626 - super.field1465[var14]) * 255 / (super.field1436.field8626 - super.field1436.field8623);
            }
            if (super.field1465[var15] > super.field1436.field8623) {
                var18 = 255;
            } else if (super.field1465[var15] > super.field1436.field8626) {
                var18 = (super.field1436.field8626 - super.field1465[var15]) * 255 / (super.field1436.field8626 - super.field1436.field8623);
            }
            if (super.field1417 == null) {
                this.field6118.field5727 = 0;
            } else {
                this.field6118.field5727 = super.field1417[arg0] & 255;
            }
            this.field6118.field5725 = super.field1448[arg0];
            if (super.field1458 != null && super.field1458[arg0] != -1) {
                int var20;
                int var21;
                int var22;
                if (super.field1424 != null && super.field1424[arg0] != -1) {
                    int var19 = super.field1424[arg0] & 255;
                    var20 = super.field1410[var19];
                    var21 = super.field1440[var19];
                    var22 = super.field1403[var19];
                } else {
                    var20 = var13;
                    var21 = var14;
                    var22 = var15;
                }
                if (super.field1462[arg0] == -1) {
                    this.field6118.method2386(super.field1482[var13], super.field1482[var14], super.field1482[var15], super.field1457[var13], super.field1457[var14], super.field1457[var15], super.field1431[var13], super.field1431[var14], super.field1431[var15], super.field1436.field8605, var16, var17, var18, super.field1455[arg0], super.field1455[arg0], super.field1455[arg0], super.field1421[var20], super.field1421[var21], super.field1421[var22], super.field1434[var20], super.field1434[var21], super.field1434[var22], super.field1461[var20], super.field1461[var21], super.field1461[var22], super.field1458[arg0]);
                } else {
                    this.field6118.method2386(super.field1482[var13], super.field1482[var14], super.field1482[var15], super.field1457[var13], super.field1457[var14], super.field1457[var15], super.field1431[var13], super.field1431[var14], super.field1431[var15], super.field1436.field8605, var16, var17, var18, super.field1455[arg0], super.field1470[arg0], super.field1462[arg0], super.field1421[var20], super.field1421[var21], super.field1421[var22], super.field1434[var20], super.field1434[var21], super.field1434[var22], super.field1461[var20], super.field1461[var21], super.field1461[var22], super.field1458[arg0]);
                }
            } else if (super.field1462[arg0] == -1) {
                this.field6118.method2382(super.field1482[var13], super.field1482[var14], super.field1482[var15], super.field1457[var13], super.field1457[var14], super.field1457[var15], super.field1431[var13], super.field1431[var14], super.field1431[var15], class584.method3272(var16 << 24 | super.field1436.field8605, class554.field7586[super.field1455[arg0] & 65535], (byte) 96), class584.method3272(var17 << 24 | super.field1436.field8605, class554.field7586[super.field1455[arg0] & 65535], (byte) 96), class584.method3272(var18 << 24 | super.field1436.field8605, class554.field7586[super.field1455[arg0] & 65535], (byte) 96));
            } else {
                this.field6118.method2382(super.field1482[var13], super.field1482[var14], super.field1482[var15], super.field1457[var13], super.field1457[var14], super.field1457[var15], super.field1431[var13], super.field1431[var14], super.field1431[var15], class584.method3272(var16 << 24 | super.field1436.field8605, class554.field7586[super.field1455[arg0] & 65535], (byte) 96), class584.method3272(var17 << 24 | super.field1436.field8605, class554.field7586[super.field1470[arg0] & 65535], (byte) 96), class584.method3272(var18 << 24 | super.field1436.field8605, class554.field7586[super.field1462[arg0] & 65535], (byte) 96));
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BIZ)Lba;")
    public final class629 method659(byte arg0, int arg1, boolean arg2) {
        this.method663(Thread.currentThread());
        class115 var4;
        class115 var5;
        if (arg0 == 1) {
            var4 = super.field1386;
            var5 = super.field1412;
        } else if (arg0 == 2) {
            var4 = super.field1390;
            var5 = super.field1399;
        } else if (arg0 == 3) {
            var4 = super.field1475;
            var5 = super.field1400;
        } else if (arg0 == 4) {
            var4 = super.field1472;
            var5 = super.field1398;
        } else if (arg0 == 5) {
            var4 = super.field1484;
            var5 = super.field1466;
        } else {
            var5 = var4 = new class444(super.field1436);
        }
        return this.method689(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    private final void method2552(int arg0) {
        short var2 = super.field1441[arg0];
        short var3 = super.field1460[arg0];
        short var4 = super.field1481[arg0];
        this.field6118.field5725 = super.field1448[arg0];
        if (super.field1417 == null) {
            this.field6118.field5727 = 0;
        } else {
            this.field6118.field5727 = super.field1417[arg0] & 255;
        }
        if (super.field1458 != null && super.field1458[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (super.field1424 != null && super.field1424[arg0] != -1) {
                int var5 = super.field1424[arg0] & 255;
                var6 = super.field1410[var5];
                var7 = super.field1440[var5];
                var8 = super.field1403[var5];
            } else {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            }
            if (super.field1462[arg0] == -1) {
                this.field6118.method2388(super.field1482[var2], super.field1482[var3], super.field1482[var4], super.field1457[var2], super.field1457[var3], super.field1457[var4], super.field1431[var2], super.field1431[var3], super.field1431[var4], super.field1455[arg0], super.field1455[arg0], super.field1455[arg0], super.field1421[var6], super.field1421[var7], super.field1421[var8], super.field1434[var6], super.field1434[var7], super.field1434[var8], super.field1461[var6], super.field1461[var7], super.field1461[var8], super.field1458[arg0]);
            } else {
                this.field6118.method2388(super.field1482[var2], super.field1482[var3], super.field1482[var4], super.field1457[var2], super.field1457[var3], super.field1457[var4], super.field1431[var2], super.field1431[var3], super.field1431[var4], super.field1455[arg0], super.field1470[arg0], super.field1462[arg0], super.field1421[var6], super.field1421[var7], super.field1421[var8], super.field1434[var6], super.field1434[var7], super.field1434[var8], super.field1461[var6], super.field1461[var7], super.field1461[var8], super.field1458[arg0]);
            }
        } else if (super.field1462[arg0] == -1) {
            this.field6118.method2396(super.field1482[var2], super.field1482[var3], super.field1482[var4], super.field1457[var2], super.field1457[var3], super.field1457[var4], super.field1431[var2], super.field1431[var3], super.field1431[var4], class554.field7586[super.field1455[arg0] & 65535]);
        } else {
            this.field6118.method2383(super.field1482[var2], super.field1482[var3], super.field1482[var4], super.field1457[var2], super.field1457[var3], super.field1457[var4], super.field1431[var2], super.field1431[var3], super.field1431[var4], super.field1455[arg0] & 65535, super.field1470[arg0] & 65535, super.field1462[arg0] & 65535);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lkb;)V")
    public class444(class633 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public final void method666(int arg0) {
        this.field6118.field5730 = (arg0 & 1) == 0;
        this.field6118.field5723 = false;
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V")
    private final void method2553(int arg0) {
        int var2 = 0;
        int var3 = super.field1436.field8607;
        short var4 = super.field1441[arg0];
        short var5 = super.field1460[arg0];
        short var6 = super.field1481[arg0];
        int var7 = super.field1461[var4];
        int var8 = super.field1461[var5];
        int var9 = super.field1461[var6];
        if (super.field1417 == null) {
            this.field6118.field5727 = 0;
        } else {
            this.field6118.field5727 = super.field1417[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field1391[var2] = super.field1457[var4];
            super.field1468[var2] = super.field1482[var4];
            super.field1456[var2] = super.field1431[var4];
            super.field1425[var2++] = super.field1455[arg0] & 65535;
        } else {
            int var10 = super.field1421[var4];
            int var11 = super.field1434[var4];
            int var12 = super.field1455[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class115.field1485[var9 - var7];
                super.field1391[var2] = (((super.field1421[var6] - var10) * var13 >> 16) + var10) * super.field1436.field8611 / var3 + super.field1439.field5368;
                super.field1468[var2] = (((super.field1434[var6] - var11) * var13 >> 16) + var11) * super.field1436.field8630 / var3 + super.field1439.field5347;
                super.field1456[var2] = var3;
                super.field1425[var2++] = (((super.field1462[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class115.field1485[var8 - var7];
                super.field1391[var2] = (((super.field1421[var5] - var10) * var14 >> 16) + var10) * super.field1436.field8611 / var3 + super.field1439.field5368;
                super.field1468[var2] = (((super.field1434[var5] - var11) * var14 >> 16) + var11) * super.field1436.field8630 / var3 + super.field1439.field5347;
                super.field1456[var2] = var3;
                super.field1425[var2++] = (((super.field1470[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field1391[var2] = super.field1457[var5];
            super.field1468[var2] = super.field1482[var5];
            super.field1456[var2] = super.field1431[var5];
            super.field1425[var2++] = super.field1470[arg0] & 65535;
        } else {
            int var15 = super.field1421[var5];
            int var16 = super.field1434[var5];
            int var17 = super.field1470[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class115.field1485[var7 - var8];
                super.field1391[var2] = (((super.field1421[var4] - var15) * var18 >> 16) + var15) * super.field1436.field8611 / var3 + super.field1439.field5368;
                super.field1468[var2] = (((super.field1434[var4] - var16) * var18 >> 16) + var16) * super.field1436.field8630 / var3 + super.field1439.field5347;
                super.field1456[var2] = var3;
                super.field1425[var2++] = (((super.field1455[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class115.field1485[var9 - var8];
                super.field1391[var2] = (((super.field1421[var6] - var15) * var19 >> 16) + var15) * super.field1436.field8611 / var3 + super.field1439.field5368;
                super.field1468[var2] = (((super.field1434[var6] - var16) * var19 >> 16) + var16) * super.field1436.field8630 / var3 + super.field1439.field5347;
                super.field1456[var2] = var3;
                super.field1425[var2++] = (((super.field1462[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field1391[var2] = super.field1457[var6];
            super.field1468[var2] = super.field1482[var6];
            super.field1456[var2] = super.field1431[var6];
            super.field1425[var2++] = super.field1462[arg0] & 65535;
        } else {
            int var20 = super.field1421[var6];
            int var21 = super.field1434[var6];
            int var22 = super.field1462[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class115.field1485[var8 - var9];
                super.field1391[var2] = (((super.field1421[var5] - var20) * var23 >> 16) + var20) * super.field1436.field8611 / var3 + super.field1439.field5368;
                super.field1468[var2] = (((super.field1434[var5] - var21) * var23 >> 16) + var21) * super.field1436.field8630 / var3 + super.field1439.field5347;
                super.field1456[var2] = var3;
                super.field1425[var2++] = (((super.field1470[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class115.field1485[var7 - var9];
                super.field1391[var2] = (((super.field1421[var4] - var20) * var24 >> 16) + var20) * super.field1436.field8611 / var3 + super.field1439.field5368;
                super.field1468[var2] = (((super.field1434[var4] - var21) * var24 >> 16) + var21) * super.field1436.field8630 / var3 + super.field1439.field5347;
                super.field1456[var2] = var3;
                super.field1425[var2++] = (((super.field1455[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field1391[0];
        int var26 = super.field1391[1];
        int var27 = super.field1391[2];
        int var28 = super.field1468[0];
        int var29 = super.field1468[1];
        int var30 = super.field1468[2];
        int var31 = super.field1456[0];
        int var32 = super.field1456[1];
        int var33 = super.field1456[2];
        this.field6118.field5725 = false;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field1439.field5367 || var26 > super.field1439.field5367 || var27 > super.field1439.field5367) {
                this.field6118.field5725 = true;
            }
            if (super.field1458 != null && super.field1458[arg0] != -1) {
                int var35;
                int var36;
                int var37;
                if (super.field1424 != null && super.field1424[arg0] != -1) {
                    int var34 = super.field1424[arg0] & 255;
                    var35 = super.field1410[var34];
                    var36 = super.field1440[var34];
                    var37 = super.field1403[var34];
                } else {
                    var35 = var4;
                    var36 = var5;
                    var37 = var6;
                }
                if (super.field1462[arg0] == -1) {
                    this.field6118.method2388(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field1455[arg0], super.field1455[arg0], super.field1455[arg0], super.field1421[var35], super.field1421[var36], super.field1421[var37], super.field1434[var35], super.field1434[var36], super.field1434[var37], super.field1461[var35], super.field1461[var36], super.field1461[var37], super.field1458[arg0]);
                } else {
                    this.field6118.method2388(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field1425[0], super.field1425[1], super.field1425[2], super.field1421[var35], super.field1421[var36], super.field1421[var37], super.field1434[var35], super.field1434[var36], super.field1434[var37], super.field1461[var35], super.field1461[var36], super.field1461[var37], super.field1458[arg0]);
                }
            } else if (super.field1462[arg0] == -1) {
                this.field6118.method2396(var28, var29, var30, var25, var26, var27, var31, var32, var33, class554.field7586[super.field1455[arg0] & 65535]);
            } else {
                this.field6118.method2383(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field1425[0], super.field1425[1], super.field1425[2]);
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field1439.field5367 || var26 > super.field1439.field5367 || var27 > super.field1439.field5367 || super.field1391[3] < 0 || super.field1391[3] > super.field1439.field5367) {
                this.field6118.field5725 = true;
            }
            if (super.field1458 == null || super.field1458[arg0] == -1) {
                if (super.field1462[arg0] == -1) {
                    int var43 = class554.field7586[super.field1455[arg0] & 65535];
                    this.field6118.method2396(var28, var29, var30, var25, var26, var27, var31, var32, var33, var43);
                    this.field6118.method2396(var28, var30, super.field1468[3], var25, var27, super.field1391[3], var31, var32, super.field1456[3], var43);
                    return;
                }
                this.field6118.method2383(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field1425[0], super.field1425[1], super.field1425[2]);
                this.field6118.method2383(var28, var30, super.field1468[3], var25, var27, super.field1391[3], var31, var32, super.field1456[3], super.field1425[0], super.field1425[2], super.field1425[3]);
                return;
            }
            int var39;
            int var40;
            int var41;
            if (super.field1424 != null && super.field1424[arg0] != -1) {
                int var38 = super.field1424[arg0] & 255;
                var39 = super.field1410[var38];
                var40 = super.field1440[var38];
                var41 = super.field1403[var38];
            } else {
                var39 = var4;
                var40 = var5;
                var41 = var6;
            }
            short var42 = super.field1458[arg0];
            if (super.field1462[arg0] == -1) {
                this.field6118.method2388(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field1455[arg0], super.field1455[arg0], super.field1455[arg0], super.field1421[var39], super.field1421[var40], super.field1421[var41], super.field1434[var39], super.field1434[var40], super.field1434[var41], super.field1461[var39], super.field1461[var40], super.field1461[var41], var42);
                this.field6118.method2388(var28, var30, super.field1468[3], var25, var27, super.field1391[3], var31, var32, super.field1456[3], super.field1455[arg0], super.field1455[arg0], super.field1455[arg0], super.field1421[var39], super.field1421[var40], super.field1421[var41], super.field1434[var39], super.field1434[var40], super.field1434[var41], super.field1461[var39], super.field1461[var40], super.field1461[var41], var42);
                return;
            }
            this.field6118.method2388(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field1425[0], super.field1425[1], super.field1425[2], super.field1421[var39], super.field1421[var40], super.field1421[var41], super.field1434[var39], super.field1434[var40], super.field1434[var41], super.field1461[var39], super.field1461[var40], super.field1461[var41], var42);
            this.field6118.method2388(var28, var30, super.field1468[3], var25, var27, super.field1391[3], var31, var32, super.field1456[3], super.field1425[0], super.field1425[2], super.field1425[3], super.field1421[var39], super.field1421[var40], super.field1421[var41], super.field1434[var39], super.field1434[var40], super.field1434[var41], super.field1461[var39], super.field1461[var40], super.field1461[var41], var42);
        }
    }

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "()V")
    public final void method675() {
        super.field1439.field5367 = this.field6118.field5735;
        super.field1439.field5368 = this.field6118.field5732;
        super.field1439.field5347 = this.field6118.field5729;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lkb;Lrf;IIII)V")
    public class444(class633 arg0, class238 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZZIIZI)V")
    public final void method698(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (super.field1392 != null) {
            int var7 = 0;
            while (var7 < super.field1447) {
                class628 var8 = super.field1392[var7];
                super.field1454[var8.field8534] = var7++;
            }
        }
        for (int var9 = 0; var9 < super.field1383; ++var9) {
            if (super.field1417 == null || super.field1417[var9] == 0) {
                this.method2550(var9, arg0, arg1);
            }
        }
        if (super.field1450) {
            if (super.field1415 == null) {
                for (int var10 = 0; var10 < super.field1383; ++var10) {
                    if (super.field1417 == null || super.field1417[var10] != 0) {
                        this.method2550(var10, arg0, arg1);
                    }
                }
            } else {
                for (int var11 = 0; var11 < 12; ++var11) {
                    for (int var12 = 0; var12 < super.field1383; ++var12) {
                        if ((super.field1417 == null || super.field1417[var12] != 0) && super.field1415[var12] == var11) {
                            this.method2550(var12, arg0, arg1);
                        }
                    }
                }
            }
        }
        if (arg4) {
            for (int var13 = 0; var13 < arg5; ++var13) {
                class220 var14 = super.field1428[var13];
                int var15 = super.field1422[var13];
                if (var15 == 0) {
                    var15 = 1;
                }
                super.field1436.method1788(var14, super.field1402[var13], super.field1459[var13], var15, (super.field1436.field8611 * var14.field2860 >> 12) / var15);
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Ljava/lang/Thread;)V")
    public final void method696(Thread arg0) {
        super.method696(arg0);
        class388 var2 = (class388) super.field1436.method1789(arg0);
        this.field6118 = var2.field5600;
    }
}
