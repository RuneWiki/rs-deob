import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class96 extends class158 {

    @OriginalMember(owner = "client!rv", name = "oc", descriptor = "Ltn;")
    private class78 field1072;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)V")
    private final void method594(int arg0) {
        short var2 = super.field1869[arg0];
        short var3 = super.field1864[arg0];
        short var4 = super.field1859[arg0];
        this.field1072.field801 = super.field1780[arg0];
        if (super.field1836 == null) {
            this.field1072.field798 = 0;
        } else {
            this.field1072.field798 = super.field1836[arg0] & 255;
        }
        if (super.field1835 != null && super.field1835[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (super.field1793 != null && super.field1793[arg0] != -1) {
                int var5 = super.field1793[arg0] & 255;
                var6 = super.field1852[var5];
                var7 = super.field1800[var5];
                var8 = super.field1853[var5];
            } else {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            }
            if (super.field1857[arg0] == -1) {
                this.field1072.method504(super.field1837[var2], super.field1837[var3], super.field1837[var4], super.field1870[var2], super.field1870[var3], super.field1870[var4], super.field1824[var2], super.field1824[var3], super.field1824[var4], super.field1851[arg0], super.field1851[arg0], super.field1851[arg0], super.field1770[var6], super.field1770[var7], super.field1770[var8], super.field1831[var6], super.field1831[var7], super.field1831[var8], super.field1787[var6], super.field1787[var7], super.field1787[var8], super.field1835[arg0]);
            } else {
                this.field1072.method504(super.field1837[var2], super.field1837[var3], super.field1837[var4], super.field1870[var2], super.field1870[var3], super.field1870[var4], super.field1824[var2], super.field1824[var3], super.field1824[var4], super.field1851[arg0], super.field1834[arg0], super.field1857[arg0], super.field1770[var6], super.field1770[var7], super.field1770[var8], super.field1831[var6], super.field1831[var7], super.field1831[var8], super.field1787[var6], super.field1787[var7], super.field1787[var8], super.field1835[arg0]);
            }
        } else if (super.field1857[arg0] == -1) {
            this.field1072.method505(super.field1837[var2], super.field1837[var3], super.field1837[var4], super.field1870[var2], super.field1870[var3], super.field1870[var4], super.field1824[var2], super.field1824[var3], super.field1824[var4], class57.field592[super.field1851[arg0] & 65535]);
        } else {
            this.field1072.method501(super.field1837[var2], super.field1837[var3], super.field1837[var4], super.field1870[var2], super.field1870[var3], super.field1870[var4], super.field1824[var2], super.field1824[var3], super.field1824[var4], super.field1851[arg0] & 65535, super.field1834[arg0] & 65535, super.field1857[arg0] & 65535);
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Luq;Lqda;IIII)V")
    public class96(class148 arg0, class90 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZZIIZI)V")
    public final void method595(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (super.field1850 != null) {
            int var7 = 0;
            while (var7 < super.field1797) {
                class422 var8 = super.field1850[var7];
                super.field1778[var8.field5618] = var7++;
            }
        }
        for (int var9 = 0; var9 < super.field1802; ++var9) {
            if (super.field1836 == null || super.field1836[var9] == 0) {
                this.method600(var9, arg0, arg1);
            }
        }
        if (super.field1825) {
            if (super.field1814 == null) {
                for (int var10 = 0; var10 < super.field1802; ++var10) {
                    if (super.field1836 == null || super.field1836[var10] != 0) {
                        this.method600(var10, arg0, arg1);
                    }
                }
            } else {
                for (int var11 = 0; var11 < 12; ++var11) {
                    for (int var12 = 0; var12 < super.field1802; ++var12) {
                        if ((super.field1836 == null || super.field1836[var12] != 0) && super.field1814[var12] == var11) {
                            this.method600(var12, arg0, arg1);
                        }
                    }
                }
            }
        }
        if (arg4) {
            for (int var13 = 0; var13 < arg5; ++var13) {
                class663 var14 = super.field1813[var13];
                int var15 = super.field1794[var13];
                if (var15 == 0) {
                    var15 = 1;
                }
                super.field1844.method806(var14, super.field1821[var13], super.field1846[var13], var15, (super.field1844.field1671 * var14.field9418 >> 12) / var15);
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "()V")
    public final void method596() {
        this.field1072 = null;
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Luq;)V")
    public class96(class148 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(Ljava/lang/Thread;)V")
    public final void method597(Thread arg0) {
        super.method597(arg0);
        class217 var2 = (class217) super.field1844.method814(arg0);
        this.field1072 = var2.field2620;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
    public final void method598(int arg0) {
        this.field1072.field811 = (arg0 & 1) == 0;
        this.field1072.field807 = false;
    }

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "()V")
    public final void method599() {
        super.field1863.field3620 = this.field1072.field810;
        super.field1863.field3627 = this.field1072.field797;
        super.field1863.field3619 = this.field1072.field799;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZZ)V")
    private final void method600(int arg0, boolean arg1, boolean arg2) {
        if (super.field1857[arg0] != -2) {
            short var4 = super.field1869[arg0];
            short var5 = super.field1864[arg0];
            short var6 = super.field1859[arg0];
            int var7 = super.field1870[var4];
            int var8 = super.field1870[var5];
            int var9 = super.field1870[var6];
            if (!arg1 || var7 != -5000 && var8 != -5000 && var9 != -5000) {
                if (super.field1778[arg0] != -1 || (super.field1837[var6] - super.field1837[var5]) * (var7 - var8) - (super.field1837[var4] - super.field1837[var5]) * (var9 - var8) > 0) {
                    if (var7 >= 0 && var8 >= 0 && var9 >= 0 && var7 <= super.field1863.field3620 && var8 <= super.field1863.field3620 && var9 <= super.field1863.field3620) {
                        super.field1780[arg0] = false;
                    } else {
                        super.field1780[arg0] = true;
                    }
                    if (arg2) {
                        int var28 = super.field1778[arg0];
                        if (var28 == -1 || !super.field1850[var28].field5617) {
                            this.method603(arg0);
                        }
                        return;
                    }
                    int var29 = super.field1778[arg0];
                    if (var29 != -1) {
                        class422 var30 = super.field1850[var29];
                        class166 var31 = super.field1868[var29];
                        if (!var30.field5617) {
                            this.method594(arg0);
                        }
                        super.field1844.method809(var31.field1986, var31.field1990, var31.field2003, var31.field1991, var31.field1989, var31.field2000, var30.field5620 & 65535, var31.field1995, var30.field5613, var30.field5616);
                        return;
                    }
                    this.method594(arg0);
                }
            } else {
                int var10 = super.field1770[var4];
                int var11 = super.field1770[var5];
                int var12 = super.field1770[var6];
                int var13 = super.field1831[var4];
                int var14 = super.field1831[var5];
                int var15 = super.field1831[var6];
                int var16 = super.field1787[var4];
                int var17 = super.field1787[var5];
                int var18 = super.field1787[var6];
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
                    this.method601(arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)V")
    private final void method601(int arg0) {
        int var2 = 0;
        int var3 = super.field1844.field1665;
        short var4 = super.field1869[arg0];
        short var5 = super.field1864[arg0];
        short var6 = super.field1859[arg0];
        int var7 = super.field1787[var4];
        int var8 = super.field1787[var5];
        int var9 = super.field1787[var6];
        if (super.field1836 == null) {
            this.field1072.field798 = 0;
        } else {
            this.field1072.field798 = super.field1836[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field1791[var2] = super.field1870[var4];
            super.field1858[var2] = super.field1837[var4];
            super.field1789[var2] = super.field1824[var4];
            super.field1771[var2++] = super.field1851[arg0] & 65535;
        } else {
            int var10 = super.field1770[var4];
            int var11 = super.field1831[var4];
            int var12 = super.field1851[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class158.field1875[var9 - var7];
                super.field1791[var2] = (((super.field1770[var6] - var10) * var13 >> 16) + var10) * super.field1844.field1671 / var3 + super.field1863.field3627;
                super.field1858[var2] = (((super.field1831[var6] - var11) * var13 >> 16) + var11) * super.field1844.field1688 / var3 + super.field1863.field3619;
                super.field1789[var2] = var3;
                super.field1771[var2++] = (((super.field1857[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class158.field1875[var8 - var7];
                super.field1791[var2] = (((super.field1770[var5] - var10) * var14 >> 16) + var10) * super.field1844.field1671 / var3 + super.field1863.field3627;
                super.field1858[var2] = (((super.field1831[var5] - var11) * var14 >> 16) + var11) * super.field1844.field1688 / var3 + super.field1863.field3619;
                super.field1789[var2] = var3;
                super.field1771[var2++] = (((super.field1834[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field1791[var2] = super.field1870[var5];
            super.field1858[var2] = super.field1837[var5];
            super.field1789[var2] = super.field1824[var5];
            super.field1771[var2++] = super.field1834[arg0] & 65535;
        } else {
            int var15 = super.field1770[var5];
            int var16 = super.field1831[var5];
            int var17 = super.field1834[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class158.field1875[var7 - var8];
                super.field1791[var2] = (((super.field1770[var4] - var15) * var18 >> 16) + var15) * super.field1844.field1671 / var3 + super.field1863.field3627;
                super.field1858[var2] = (((super.field1831[var4] - var16) * var18 >> 16) + var16) * super.field1844.field1688 / var3 + super.field1863.field3619;
                super.field1789[var2] = var3;
                super.field1771[var2++] = (((super.field1851[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class158.field1875[var9 - var8];
                super.field1791[var2] = (((super.field1770[var6] - var15) * var19 >> 16) + var15) * super.field1844.field1671 / var3 + super.field1863.field3627;
                super.field1858[var2] = (((super.field1831[var6] - var16) * var19 >> 16) + var16) * super.field1844.field1688 / var3 + super.field1863.field3619;
                super.field1789[var2] = var3;
                super.field1771[var2++] = (((super.field1857[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field1791[var2] = super.field1870[var6];
            super.field1858[var2] = super.field1837[var6];
            super.field1789[var2] = super.field1824[var6];
            super.field1771[var2++] = super.field1857[arg0] & 65535;
        } else {
            int var20 = super.field1770[var6];
            int var21 = super.field1831[var6];
            int var22 = super.field1857[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class158.field1875[var8 - var9];
                super.field1791[var2] = (((super.field1770[var5] - var20) * var23 >> 16) + var20) * super.field1844.field1671 / var3 + super.field1863.field3627;
                super.field1858[var2] = (((super.field1831[var5] - var21) * var23 >> 16) + var21) * super.field1844.field1688 / var3 + super.field1863.field3619;
                super.field1789[var2] = var3;
                super.field1771[var2++] = (((super.field1834[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class158.field1875[var7 - var9];
                super.field1791[var2] = (((super.field1770[var4] - var20) * var24 >> 16) + var20) * super.field1844.field1671 / var3 + super.field1863.field3627;
                super.field1858[var2] = (((super.field1831[var4] - var21) * var24 >> 16) + var21) * super.field1844.field1688 / var3 + super.field1863.field3619;
                super.field1789[var2] = var3;
                super.field1771[var2++] = (((super.field1851[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field1791[0];
        int var26 = super.field1791[1];
        int var27 = super.field1791[2];
        int var28 = super.field1858[0];
        int var29 = super.field1858[1];
        int var30 = super.field1858[2];
        int var31 = super.field1789[0];
        int var32 = super.field1789[1];
        int var33 = super.field1789[2];
        this.field1072.field801 = false;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field1863.field3620 || var26 > super.field1863.field3620 || var27 > super.field1863.field3620) {
                this.field1072.field801 = true;
            }
            if (super.field1835 != null && super.field1835[arg0] != -1) {
                int var35;
                int var36;
                int var37;
                if (super.field1793 != null && super.field1793[arg0] != -1) {
                    int var34 = super.field1793[arg0] & 255;
                    var35 = super.field1852[var34];
                    var36 = super.field1800[var34];
                    var37 = super.field1853[var34];
                } else {
                    var35 = var4;
                    var36 = var5;
                    var37 = var6;
                }
                if (super.field1857[arg0] == -1) {
                    this.field1072.method504(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field1851[arg0], super.field1851[arg0], super.field1851[arg0], super.field1770[var35], super.field1770[var36], super.field1770[var37], super.field1831[var35], super.field1831[var36], super.field1831[var37], super.field1787[var35], super.field1787[var36], super.field1787[var37], super.field1835[arg0]);
                } else {
                    this.field1072.method504(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field1771[0], super.field1771[1], super.field1771[2], super.field1770[var35], super.field1770[var36], super.field1770[var37], super.field1831[var35], super.field1831[var36], super.field1831[var37], super.field1787[var35], super.field1787[var36], super.field1787[var37], super.field1835[arg0]);
                }
            } else if (super.field1857[arg0] == -1) {
                this.field1072.method505(var28, var29, var30, var25, var26, var27, var31, var32, var33, class57.field592[super.field1851[arg0] & 65535]);
            } else {
                this.field1072.method501(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field1771[0], super.field1771[1], super.field1771[2]);
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field1863.field3620 || var26 > super.field1863.field3620 || var27 > super.field1863.field3620 || super.field1791[3] < 0 || super.field1791[3] > super.field1863.field3620) {
                this.field1072.field801 = true;
            }
            if (super.field1835 == null || super.field1835[arg0] == -1) {
                if (super.field1857[arg0] == -1) {
                    int var43 = class57.field592[super.field1851[arg0] & 65535];
                    this.field1072.method505(var28, var29, var30, var25, var26, var27, var31, var32, var33, var43);
                    this.field1072.method505(var28, var30, super.field1858[3], var25, var27, super.field1791[3], var31, var32, super.field1789[3], var43);
                    return;
                }
                this.field1072.method501(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field1771[0], super.field1771[1], super.field1771[2]);
                this.field1072.method501(var28, var30, super.field1858[3], var25, var27, super.field1791[3], var31, var32, super.field1789[3], super.field1771[0], super.field1771[2], super.field1771[3]);
                return;
            }
            int var39;
            int var40;
            int var41;
            if (super.field1793 != null && super.field1793[arg0] != -1) {
                int var38 = super.field1793[arg0] & 255;
                var39 = super.field1852[var38];
                var40 = super.field1800[var38];
                var41 = super.field1853[var38];
            } else {
                var39 = var4;
                var40 = var5;
                var41 = var6;
            }
            short var42 = super.field1835[arg0];
            if (super.field1857[arg0] == -1) {
                this.field1072.method504(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field1851[arg0], super.field1851[arg0], super.field1851[arg0], super.field1770[var39], super.field1770[var40], super.field1770[var41], super.field1831[var39], super.field1831[var40], super.field1831[var41], super.field1787[var39], super.field1787[var40], super.field1787[var41], var42);
                this.field1072.method504(var28, var30, super.field1858[3], var25, var27, super.field1791[3], var31, var32, super.field1789[3], super.field1851[arg0], super.field1851[arg0], super.field1851[arg0], super.field1770[var39], super.field1770[var40], super.field1770[var41], super.field1831[var39], super.field1831[var40], super.field1831[var41], super.field1787[var39], super.field1787[var40], super.field1787[var41], var42);
                return;
            }
            this.field1072.method504(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field1771[0], super.field1771[1], super.field1771[2], super.field1770[var39], super.field1770[var40], super.field1770[var41], super.field1831[var39], super.field1831[var40], super.field1831[var41], super.field1787[var39], super.field1787[var40], super.field1787[var41], var42);
            this.field1072.method504(var28, var30, super.field1858[3], var25, var27, super.field1791[3], var31, var32, super.field1789[3], super.field1771[0], super.field1771[2], super.field1771[3], super.field1770[var39], super.field1770[var40], super.field1770[var41], super.field1831[var39], super.field1831[var40], super.field1831[var41], super.field1787[var39], super.field1787[var40], super.field1787[var41], var42);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BIZ)Lba;")
    public final class350 method602(byte arg0, int arg1, boolean arg2) {
        this.method867(Thread.currentThread());
        class158 var4;
        class158 var5;
        if (arg0 == 1) {
            var4 = super.field1808;
            var5 = super.field1795;
        } else if (arg0 == 2) {
            var4 = super.field1832;
            var5 = super.field1792;
        } else if (arg0 == 3) {
            var4 = super.field1803;
            var5 = super.field1801;
        } else if (arg0 == 4) {
            var4 = super.field1809;
            var5 = super.field1781;
        } else if (arg0 == 5) {
            var4 = super.field1779;
            var5 = super.field1866;
        } else {
            var5 = var4 = new class96(super.field1844);
        }
        return this.method890(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "(I)V")
    private final void method603(int arg0) {
        if (!super.field1844.field1656) {
            short var2 = super.field1869[arg0];
            short var3 = super.field1864[arg0];
            short var4 = super.field1859[arg0];
            int var5 = super.field1824[var2] - super.field1844.field1660;
            if (var5 > 255) {
                var5 = 255;
            } else if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1824[var3] - super.field1844.field1660;
            if (var6 > 255) {
                var6 = 255;
            } else if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field1824[var4] - super.field1844.field1660;
            if (var7 > 255) {
                var7 = 255;
            } else if (var7 < 0) {
                var7 = 0;
            }
            int var8 = var5 + var6 + var7;
            if (var8 != 765) {
                if (var8 == 0) {
                    this.method594(arg0);
                } else {
                    if (super.field1836 == null) {
                        this.field1072.field798 = 0;
                    } else {
                        this.field1072.field798 = super.field1836[arg0] & 255;
                    }
                    this.field1072.field801 = super.field1780[arg0];
                    if (super.field1835 != null && super.field1835[arg0] != -1) {
                        int var10;
                        int var11;
                        int var12;
                        if (super.field1793 != null && super.field1793[arg0] != -1) {
                            int var9 = super.field1793[arg0] & 255;
                            var10 = super.field1852[var9];
                            var11 = super.field1800[var9];
                            var12 = super.field1853[var9];
                        } else {
                            var10 = var2;
                            var11 = var3;
                            var12 = var4;
                        }
                        if (super.field1857[arg0] == -1) {
                            this.field1072.method498(super.field1837[var2], super.field1837[var3], super.field1837[var4], super.field1870[var2], super.field1870[var3], super.field1870[var4], super.field1824[var2], super.field1824[var3], super.field1824[var4], super.field1844.field1677, var5, var6, var7, super.field1851[arg0], super.field1851[arg0], super.field1851[arg0], super.field1770[var10], super.field1770[var11], super.field1770[var12], super.field1831[var10], super.field1831[var11], super.field1831[var12], super.field1787[var10], super.field1787[var11], super.field1787[var12], super.field1835[arg0]);
                        } else {
                            this.field1072.method498(super.field1837[var2], super.field1837[var3], super.field1837[var4], super.field1870[var2], super.field1870[var3], super.field1870[var4], super.field1824[var2], super.field1824[var3], super.field1824[var4], super.field1844.field1677, var5, var6, var7, super.field1851[arg0], super.field1834[arg0], super.field1857[arg0], super.field1770[var10], super.field1770[var11], super.field1770[var12], super.field1831[var10], super.field1831[var11], super.field1831[var12], super.field1787[var10], super.field1787[var11], super.field1787[var12], super.field1835[arg0]);
                        }
                    } else if (super.field1857[arg0] == -1) {
                        this.field1072.method486(super.field1837[var2], super.field1837[var3], super.field1837[var4], super.field1870[var2], super.field1870[var3], super.field1870[var4], super.field1824[var2], super.field1824[var3], super.field1824[var4], class425.method2296(-10227, class57.field592[super.field1851[arg0] & 65535], var5 << 24 | super.field1844.field1677), class425.method2296(-10227, class57.field592[super.field1851[arg0] & 65535], var6 << 24 | super.field1844.field1677), class425.method2296(-10227, class57.field592[super.field1851[arg0] & 65535], var7 << 24 | super.field1844.field1677));
                    } else {
                        this.field1072.method486(super.field1837[var2], super.field1837[var3], super.field1837[var4], super.field1870[var2], super.field1870[var3], super.field1870[var4], super.field1824[var2], super.field1824[var3], super.field1824[var4], class425.method2296(-10227, class57.field592[super.field1851[arg0] & 65535], var5 << 24 | super.field1844.field1677), class425.method2296(-10227, class57.field592[super.field1834[arg0] & 65535], var6 << 24 | super.field1844.field1677), class425.method2296(-10227, class57.field592[super.field1857[arg0] & 65535], var7 << 24 | super.field1844.field1677));
                    }
                }
            }
        } else if (!super.field1818[arg0]) {
            short var13 = super.field1869[arg0];
            short var14 = super.field1864[arg0];
            short var15 = super.field1859[arg0];
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            if (super.field1823[var13] > super.field1844.field1687) {
                var16 = 255;
            } else if (super.field1823[var13] > super.field1844.field1664) {
                var16 = (super.field1844.field1664 - super.field1823[var13]) * 255 / (super.field1844.field1664 - super.field1844.field1687);
            }
            if (super.field1823[var14] > super.field1844.field1687) {
                var17 = 255;
            } else if (super.field1823[var14] > super.field1844.field1664) {
                var17 = (super.field1844.field1664 - super.field1823[var14]) * 255 / (super.field1844.field1664 - super.field1844.field1687);
            }
            if (super.field1823[var15] > super.field1844.field1687) {
                var18 = 255;
            } else if (super.field1823[var15] > super.field1844.field1664) {
                var18 = (super.field1844.field1664 - super.field1823[var15]) * 255 / (super.field1844.field1664 - super.field1844.field1687);
            }
            if (super.field1836 == null) {
                this.field1072.field798 = 0;
            } else {
                this.field1072.field798 = super.field1836[arg0] & 255;
            }
            this.field1072.field801 = super.field1780[arg0];
            if (super.field1835 != null && super.field1835[arg0] != -1) {
                int var20;
                int var21;
                int var22;
                if (super.field1793 != null && super.field1793[arg0] != -1) {
                    int var19 = super.field1793[arg0] & 255;
                    var20 = super.field1852[var19];
                    var21 = super.field1800[var19];
                    var22 = super.field1853[var19];
                } else {
                    var20 = var13;
                    var21 = var14;
                    var22 = var15;
                }
                if (super.field1857[arg0] == -1) {
                    this.field1072.method498(super.field1837[var13], super.field1837[var14], super.field1837[var15], super.field1870[var13], super.field1870[var14], super.field1870[var15], super.field1824[var13], super.field1824[var14], super.field1824[var15], super.field1844.field1677, var16, var17, var18, super.field1851[arg0], super.field1851[arg0], super.field1851[arg0], super.field1770[var20], super.field1770[var21], super.field1770[var22], super.field1831[var20], super.field1831[var21], super.field1831[var22], super.field1787[var20], super.field1787[var21], super.field1787[var22], super.field1835[arg0]);
                } else {
                    this.field1072.method498(super.field1837[var13], super.field1837[var14], super.field1837[var15], super.field1870[var13], super.field1870[var14], super.field1870[var15], super.field1824[var13], super.field1824[var14], super.field1824[var15], super.field1844.field1677, var16, var17, var18, super.field1851[arg0], super.field1834[arg0], super.field1857[arg0], super.field1770[var20], super.field1770[var21], super.field1770[var22], super.field1831[var20], super.field1831[var21], super.field1831[var22], super.field1787[var20], super.field1787[var21], super.field1787[var22], super.field1835[arg0]);
                }
            } else if (super.field1857[arg0] == -1) {
                this.field1072.method486(super.field1837[var13], super.field1837[var14], super.field1837[var15], super.field1870[var13], super.field1870[var14], super.field1870[var15], super.field1824[var13], super.field1824[var14], super.field1824[var15], class425.method2296(-10227, class57.field592[super.field1851[arg0] & 65535], var16 << 24 | super.field1844.field1677), class425.method2296(-10227, class57.field592[super.field1851[arg0] & 65535], var17 << 24 | super.field1844.field1677), class425.method2296(-10227, class57.field592[super.field1851[arg0] & 65535], var18 << 24 | super.field1844.field1677));
            } else {
                this.field1072.method486(super.field1837[var13], super.field1837[var14], super.field1837[var15], super.field1870[var13], super.field1870[var14], super.field1870[var15], super.field1824[var13], super.field1824[var14], super.field1824[var15], class425.method2296(-10227, class57.field592[super.field1851[arg0] & 65535], var16 << 24 | super.field1844.field1677), class425.method2296(-10227, class57.field592[super.field1834[arg0] & 65535], var17 << 24 | super.field1844.field1677), class425.method2296(-10227, class57.field592[super.field1857[arg0] & 65535], var18 << 24 | super.field1844.field1677));
            }
        }
    }
}
