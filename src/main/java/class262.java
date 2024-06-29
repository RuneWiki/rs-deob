import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class262 extends class158 {

    @OriginalMember(owner = "client!sb", name = "oc", descriptor = "Lqaa;")
    private class26 field3325;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BIZ)Lba;", line = 3)
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
            var5 = var4 = new class262(super.field1844);
        }
        return this.method890(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Luq;[Lsb;)V", line = 47)
    private class262(class148 arg0, class262[] arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Ljava/lang/Thread;)V", line = 50)
    public final void method597(Thread arg0) {
        super.method597(arg0);
        class163 var2 = (class163) super.field1844.method814(arg0);
        this.field3325 = var2.field1941;
        super.field1811 = var2.field1943;
        super.field1772 = var2.field1937;
        super.field1839 = var2.field1934;
        super.field1806 = var2.field1948;
        super.field1833 = var2.field1936;
        super.field1838 = var2.field1938;
        super.field1820 = var2.field1946;
        super.field1855 = var2.field1947;
        super.field1854 = var2.field1945;
        super.field1775 = var2.field1944;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V", line = 66)
    private final void method1488(int arg0) {
        if (super.field1818[arg0]) {
            this.method1489(arg0);
        } else {
            short var2 = super.field1869[arg0];
            short var3 = super.field1864[arg0];
            short var4 = super.field1859[arg0];
            this.field3325.field326 = super.field1780[arg0];
            if (super.field1836 == null) {
                this.field3325.field319 = 0;
            } else {
                this.field3325.field319 = super.field1836[arg0] & 255;
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
                    this.field3325.method144(super.field1837[var2], super.field1837[var3], super.field1837[var4], super.field1870[var2], super.field1870[var3], super.field1870[var4], super.field1851[arg0], super.field1851[arg0], super.field1851[arg0], super.field1770[var6], super.field1770[var7], super.field1770[var8], super.field1831[var6], super.field1831[var7], super.field1831[var8], super.field1787[var6], super.field1787[var7], super.field1787[var8], super.field1835[arg0]);
                } else {
                    this.field3325.method144(super.field1837[var2], super.field1837[var3], super.field1837[var4], super.field1870[var2], super.field1870[var3], super.field1870[var4], super.field1851[arg0], super.field1834[arg0], super.field1857[arg0], super.field1770[var6], super.field1770[var7], super.field1770[var8], super.field1831[var6], super.field1831[var7], super.field1831[var8], super.field1787[var6], super.field1787[var7], super.field1787[var8], super.field1835[arg0]);
                }
            } else if (super.field1857[arg0] == -1) {
                this.field3325.method133(super.field1837[var2], super.field1837[var3], super.field1837[var4], super.field1870[var2], super.field1870[var3], super.field1870[var4], class57.field592[super.field1851[arg0] & 65535]);
            } else {
                this.field3325.method141(super.field1837[var2], super.field1837[var3], super.field1837[var4], super.field1870[var2], super.field1870[var3], super.field1870[var4], super.field1851[arg0] & 65535, super.field1834[arg0] & 65535, super.field1857[arg0] & 65535);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Luq;)V", line = 121)
    public class262(class148 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 124)
    public final void method598(int arg0) {
        this.field3325.field320 = (arg0 & 1) == 0;
        this.field3325.field323 = false;
    }

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "()V", line = 128)
    public final void method596() {
        this.field3325 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZZIIZI)V", line = 132)
    public final void method595(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7;
        if (arg3 + 2 > 2200) {
            var7 = 1 + class465.method2644(arg3, 4) - class158.field1867;
            arg3 = (arg3 >> var7) + 2;
        } else {
            var7 = 0;
            arg3 += 2;
        }
        for (int var8 = 0; var8 < 2200; ++var8) {
            super.field1772[var8] = 0;
        }
        int var9 = 0;
        if (super.field1850 != null) {
            int var10 = 0;
            while (var10 < super.field1797) {
                class422 var11 = super.field1850[var10];
                super.field1778[var11.field5618] = var10++;
            }
        }
        for (int var12 = 0; var12 < super.field1802; ++var12) {
            if (super.field1857[var12] != -2) {
                short var159 = super.field1869[var12];
                short var160 = super.field1864[var12];
                short var161 = super.field1859[var12];
                int var162 = super.field1870[var159];
                int var163 = super.field1870[var160];
                int var164 = super.field1870[var161];
                if (!arg0 || var162 != -5000 && var163 != -5000 && var164 != -5000) {
                    if (super.field1778[var12] != -1 || (super.field1837[var161] - super.field1837[var160]) * (var162 - var163) - (super.field1837[var159] - super.field1837[var160]) * (var164 - var163) > 0) {
                        super.field1818[var12] = false;
                        if (var162 >= 0 && var163 >= 0 && var164 >= 0 && var162 <= super.field1863.field3620 && var163 <= super.field1863.field3620 && var164 <= super.field1863.field3620) {
                            super.field1780[var12] = false;
                        } else {
                            super.field1780[var12] = true;
                        }
                        int var185 = (super.field1811[var159] + super.field1811[var160] + super.field1811[var161]) / 3 >> var7;
                        if (super.field1772[var185] < 64) {
                            super.field1839[var185][super.field1772[var185]++] = var12;
                        } else {
                            int var186 = super.field1772[var185];
                            if (var186 == 64) {
                                if (var9 == 512) {
                                    continue;
                                }
                                super.field1806[var9] = 0;
                                super.field1772[var185] = var186 = 65 + var9++;
                            }
                            var186 -= 65;
                            super.field1833[var186][super.field1806[var186]++] = var12;
                        }
                    }
                } else {
                    int var165 = super.field1770[var159];
                    int var166 = super.field1770[var160];
                    int var167 = super.field1770[var161];
                    int var168 = super.field1831[var159];
                    int var169 = super.field1831[var160];
                    int var170 = super.field1831[var161];
                    int var171 = super.field1787[var159];
                    int var172 = super.field1787[var160];
                    int var173 = super.field1787[var161];
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
                        super.field1818[var12] = true;
                        int var183 = (super.field1811[var159] + super.field1811[var160] + super.field1811[var161]) / 3 >> var7;
                        if (super.field1772[var183] < 64) {
                            super.field1839[var183][super.field1772[var183]++] = var12;
                        } else {
                            int var184 = super.field1772[var183];
                            if (var184 == 64) {
                                if (var9 == 512) {
                                    continue;
                                }
                                super.field1806[var9] = 0;
                                super.field1772[var183] = var184 = 65 + var9++;
                            }
                            var184 -= 65;
                            super.field1833[var184][super.field1806[var184]++] = var12;
                        }
                    }
                }
            }
        }
        if (arg4) {
            for (int var13 = 0; var13 < arg5; ++var13) {
                int var14 = super.field1794[var13] - arg2 >> var7;
                if (var14 >= 0 && var14 < 2200) {
                    if (super.field1772[var14] < 64) {
                        super.field1839[var14][super.field1772[var14]++] = var13 + 1 << 16;
                    } else {
                        int var15 = super.field1772[var14];
                        if (var15 == 64) {
                            if (var9 == 512) {
                                continue;
                            }
                            super.field1806[var9] = 0;
                            super.field1772[var14] = var15 = 65 + var9++;
                        }
                        var15 -= 65;
                        super.field1833[var15][super.field1806[var15]++] = var13 + 1 << 16;
                    }
                }
            }
        }
        if (super.field1814 == null) {
            if (!arg4 && super.field1850 == null) {
                if (arg1) {
                    for (int var16 = arg3 - 1; var16 >= 0; --var16) {
                        int var17 = super.field1772[var16];
                        if (var17 > 0) {
                            int var18 = var17 > 64 ? 64 : var17;
                            int[] var19 = super.field1839[var16];
                            for (int var20 = 0; var20 < var18; ++var20) {
                                this.method1491(var19[var20]);
                            }
                        }
                        if (var17 > 64) {
                            int var21 = super.field1772[var16] - 64 - 1;
                            int[] var22 = super.field1833[var21];
                            for (int var23 = 0; var23 < super.field1806[var21]; ++var23) {
                                this.method1491(var22[var23]);
                            }
                        }
                    }
                } else {
                    for (int var24 = arg3 - 1; var24 >= 0; --var24) {
                        int var25 = super.field1772[var24];
                        if (var25 > 0) {
                            int var26 = var25 > 64 ? 64 : var25;
                            int[] var27 = super.field1839[var24];
                            for (int var28 = 0; var28 < var26; ++var28) {
                                this.method1488(var27[var28]);
                            }
                        }
                        if (var25 > 64) {
                            int var29 = super.field1772[var24] - 64 - 1;
                            int[] var30 = super.field1833[var29];
                            for (int var31 = 0; var31 < super.field1806[var29]; ++var31) {
                                this.method1488(var30[var31]);
                            }
                        }
                    }
                }
            } else if (arg1) {
                for (int var32 = arg3 - 1; var32 >= 0; --var32) {
                    int var33 = super.field1772[var32];
                    if (var33 > 0) {
                        int var34 = var33 > 64 ? 64 : var33;
                        int[] var35 = super.field1839[var32];
                        for (int var36 = 0; var36 < var34; ++var36) {
                            int var37 = var35[var36];
                            if (var37 < 65536) {
                                int var38 = super.field1778[var37];
                                if (var38 == -1 || !super.field1850[var38].field5617) {
                                    this.method1491(var37);
                                }
                            }
                        }
                    }
                    if (var33 > 64) {
                        int var39 = super.field1772[var32] - 64 - 1;
                        int[] var40 = super.field1833[var39];
                        for (int var41 = 0; var41 < super.field1806[var39]; ++var41) {
                            int var42 = var40[var41];
                            if (var42 < 65536) {
                                int var43 = super.field1778[var42];
                                if (var43 == -1 || !super.field1850[var43].field5617) {
                                    this.method1491(var42);
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var44 = arg3 - 1; var44 >= 0; --var44) {
                    int var45 = super.field1772[var44];
                    if (var45 > 0) {
                        int var46 = var45 > 64 ? 64 : var45;
                        int[] var47 = super.field1839[var44];
                        for (int var48 = 0; var48 < var46; ++var48) {
                            int var49 = var47[var48];
                            if (var49 < 65536) {
                                int var50 = super.field1778[var49];
                                if (var50 != -1) {
                                    class422 var51 = super.field1850[var50];
                                    class166 var52 = super.field1868[var50];
                                    if (!var51.field5617) {
                                        this.method1488(var49);
                                    }
                                    super.field1844.method809(var52.field1986, var52.field1990, var52.field2003, var52.field1991, var52.field1989, var52.field2000, var51.field5620 & 65535, var52.field1995, var51.field5613, var51.field5616);
                                } else {
                                    this.method1488(var47[var48]);
                                }
                            } else {
                                int var53 = (var49 >> 16) - 1;
                                class663 var54 = super.field1813[var53];
                                int var55 = super.field1794[var53];
                                if (var55 == 0) {
                                    var55 = 1;
                                }
                                super.field1844.method806(var54, super.field1821[var53], super.field1846[var53], var55, (super.field1844.field1671 * var54.field9418 >> 12) / var55);
                            }
                        }
                    }
                    if (var45 > 64) {
                        int var56 = super.field1772[var44] - 64 - 1;
                        int[] var57 = super.field1833[var56];
                        for (int var58 = 0; var58 < super.field1806[var56]; ++var58) {
                            int var59 = var57[var58];
                            if (var59 < 65536) {
                                int var60 = super.field1778[var59];
                                if (var60 != -1) {
                                    class422 var61 = super.field1850[var60];
                                    class166 var62 = super.field1868[var60];
                                    if (!var61.field5617) {
                                        this.method1488(var59);
                                    }
                                    super.field1844.method809(var62.field1986, var62.field1990, var62.field2003, var62.field1991, var62.field1989, var62.field2000, var61.field5620 & 65535, var62.field1995, var61.field5613, var61.field5616);
                                } else {
                                    this.method1488(var57[var58]);
                                }
                            } else {
                                int var63 = (var59 >> 16) - 1;
                                class663 var64 = super.field1813[var63];
                                int var65 = super.field1794[var63];
                                if (var65 == 0) {
                                    var65 = 1;
                                }
                                super.field1844.method806(var64, super.field1821[var63], super.field1846[var63], var65, (super.field1844.field1671 * var64.field9418 >> 12) / var65);
                            }
                        }
                    }
                }
            }
        } else {
            for (int var66 = 0; var66 < 12; ++var66) {
                super.field1838[var66] = 0;
                super.field1775[var66] = 0;
            }
            if (arg4) {
                for (int var67 = arg3 - 1; var67 >= 0; --var67) {
                    int var68 = super.field1772[var67];
                    if (var68 > 0) {
                        int var69;
                        if (var68 > 64) {
                            var69 = 64;
                        } else {
                            var69 = var68;
                        }
                        int[] var70 = super.field1839[var67];
                        for (int var71 = 0; var71 < var69; ++var71) {
                            int var72 = var70[var71];
                            if (var72 < 65536) {
                                byte var73 = super.field1814[var72];
                                int var74 = super.field1838[var73]++;
                                super.field1820[var73][var74] = var72;
                                if (var73 < 10) {
                                    super.field1775[var73] += var67;
                                } else if (var73 == 10) {
                                    super.field1855[var74] = var67;
                                } else {
                                    super.field1854[var74] = var67;
                                }
                            } else {
                                byte var75 = super.field1813[(var72 >> 16) - 1].field9428;
                                int var76 = super.field1838[var75]++;
                                super.field1820[var75][var76] = var72;
                                if (var75 < 10) {
                                    super.field1775[var75] += var67;
                                } else if (var75 == 10) {
                                    super.field1855[var76] = var67;
                                } else {
                                    super.field1854[var76] = var67;
                                }
                            }
                        }
                    }
                    if (var68 > 64) {
                        int var77 = super.field1772[var67] - 64 - 1;
                        int[] var78 = super.field1833[var77];
                        for (int var79 = 0; var79 < super.field1806[var77]; ++var79) {
                            int var80 = var78[var79];
                            if (var80 < 65536) {
                                byte var81 = super.field1814[var80];
                                int var82 = super.field1838[var81]++;
                                super.field1820[var81][var82] = var80;
                                if (var81 < 10) {
                                    super.field1775[var81] += var67;
                                } else if (var81 == 10) {
                                    super.field1855[var82] = var67;
                                } else {
                                    super.field1854[var82] = var67;
                                }
                            } else {
                                byte var83 = super.field1813[(var80 >> 16) - 1].field9428;
                                int var84 = super.field1838[var83]++;
                                super.field1820[var83][var84] = var80;
                                if (var83 < 10) {
                                    super.field1775[var83] += var67;
                                } else if (var83 == 10) {
                                    super.field1855[var84] = var67;
                                } else {
                                    super.field1854[var84] = var67;
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var85 = arg3 - 1; var85 >= 0; --var85) {
                    int var146 = super.field1772[var85];
                    if (var146 > 0) {
                        int var147;
                        if (var146 > 64) {
                            var147 = 64;
                        } else {
                            var147 = var146;
                        }
                        int[] var148 = super.field1839[var85];
                        for (int var149 = 0; var149 < var147; ++var149) {
                            int var150 = var148[var149];
                            byte var151 = super.field1814[var150];
                            int var152 = super.field1838[var151]++;
                            super.field1820[var151][var152] = var150;
                            if (var151 < 10) {
                                super.field1775[var151] += var85;
                            } else if (var151 == 10) {
                                super.field1855[var152] = var85;
                            } else {
                                super.field1854[var152] = var85;
                            }
                        }
                    }
                    if (var146 > 64) {
                        int var153 = super.field1772[var85] - 64 - 1;
                        int[] var154 = super.field1833[var153];
                        for (int var155 = 0; var155 < super.field1806[var153]; ++var155) {
                            int var156 = var154[var155];
                            byte var157 = super.field1814[var156];
                            int var158 = super.field1838[var157]++;
                            super.field1820[var157][var158] = var156;
                            if (var157 < 10) {
                                super.field1775[var157] += var85;
                            } else if (var157 == 10) {
                                super.field1855[var158] = var85;
                            } else {
                                super.field1854[var158] = var85;
                            }
                        }
                    }
                }
            }
            int var86 = 0;
            if (super.field1838[1] > 0 || super.field1838[2] > 0) {
                var86 = (super.field1775[1] + super.field1775[2]) / (super.field1838[1] + super.field1838[2]);
            }
            int var87 = 0;
            if (super.field1838[3] > 0 || super.field1838[4] > 0) {
                var87 = (super.field1775[3] + super.field1775[4]) / (super.field1838[3] + super.field1838[4]);
            }
            int var88 = 0;
            if (super.field1838[6] > 0 || super.field1838[8] > 0) {
                var88 = (super.field1775[6] + super.field1775[8]) / (super.field1838[6] + super.field1838[8]);
            }
            int var89 = 0;
            int var90 = super.field1838[10];
            int[] var91 = super.field1820[10];
            int[] var92 = super.field1855;
            if (var89 == var90) {
                var89 = 0;
                var90 = super.field1838[11];
                var91 = super.field1820[11];
                var92 = super.field1854;
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
                            int var105 = super.field1778[var104];
                            if (var105 == -1 || !super.field1850[var105].field5617) {
                                this.method1491(var104);
                            }
                        }
                        if (var89 == var90 && super.field1820[11] != var91) {
                            var89 = 0;
                            var90 = super.field1838[11];
                            var91 = super.field1820[11];
                            var92 = super.field1854;
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
                            int var107 = super.field1778[var106];
                            if (var107 == -1 || !super.field1850[var107].field5617) {
                                this.method1491(var106);
                            }
                        }
                        if (var89 == var90 && super.field1820[11] != var91) {
                            var89 = 0;
                            var90 = super.field1838[11];
                            var91 = super.field1820[11];
                            var92 = super.field1854;
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
                            int var109 = super.field1778[var108];
                            if (var109 == -1 || !super.field1850[var109].field5617) {
                                this.method1491(var108);
                            }
                        }
                        if (var89 == var90 && super.field1820[11] != var91) {
                            var89 = 0;
                            var90 = super.field1838[11];
                            var91 = super.field1820[11];
                            var92 = super.field1854;
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
                            int var111 = super.field1778[var110];
                            if (var111 != -1) {
                                class422 var112 = super.field1850[var111];
                                class166 var113 = super.field1868[var111];
                                if (!var112.field5617) {
                                    this.method1488(var110);
                                }
                                super.field1844.method809(var113.field1986, var113.field1990, var113.field2003, var113.field1991, var113.field1989, var113.field2000, var112.field5620 & 65535, var113.field1995, var112.field5613, var112.field5616);
                            } else {
                                this.method1488(var110);
                            }
                        } else {
                            int var114 = (var110 >> 16) - 1;
                            class663 var115 = super.field1813[var114];
                            int var116 = super.field1794[var114];
                            if (var116 == 0) {
                                var116 = 1;
                            }
                            super.field1844.method806(var115, super.field1821[var114], super.field1846[var114], var116, (super.field1844.field1671 * var115.field9418 >> 12) / var116);
                        }
                        if (var89 == var90 && super.field1820[11] != var91) {
                            var89 = 0;
                            var90 = super.field1838[11];
                            var91 = super.field1820[11];
                            var92 = super.field1854;
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
                            int var118 = super.field1778[var117];
                            if (var118 != -1) {
                                class422 var119 = super.field1850[var118];
                                class166 var120 = super.field1868[var118];
                                if (!var119.field5617) {
                                    this.method1488(var117);
                                }
                                super.field1844.method809(var120.field1986, var120.field1990, var120.field2003, var120.field1991, var120.field1989, var120.field2000, var119.field5620 & 65535, var120.field1995, var119.field5613, var119.field5616);
                            } else {
                                this.method1488(var117);
                            }
                        } else {
                            int var121 = (var117 >> 16) - 1;
                            class663 var122 = super.field1813[var121];
                            int var123 = super.field1794[var121];
                            if (var123 == 0) {
                                var123 = 1;
                            }
                            super.field1844.method806(var122, super.field1821[var121], super.field1846[var121], var123, (super.field1844.field1671 * var122.field9418 >> 12) / var123);
                        }
                        if (var89 == var90 && super.field1820[11] != var91) {
                            var89 = 0;
                            var90 = super.field1838[11];
                            var91 = super.field1820[11];
                            var92 = super.field1854;
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
                            int var125 = super.field1778[var124];
                            if (var125 != -1) {
                                class422 var126 = super.field1850[var125];
                                class166 var127 = super.field1868[var125];
                                if (!var126.field5617) {
                                    this.method1488(var124);
                                }
                                super.field1844.method809(var127.field1986, var127.field1990, var127.field2003, var127.field1991, var127.field1989, var127.field2000, var126.field5620 & 65535, var127.field1995, var126.field5613, var126.field5616);
                            } else {
                                this.method1488(var124);
                            }
                        } else {
                            int var128 = (var124 >> 16) - 1;
                            class663 var129 = super.field1813[var128];
                            int var130 = super.field1794[var128];
                            if (var130 == 0) {
                                var130 = 1;
                            }
                            super.field1844.method806(var129, super.field1821[var128], super.field1846[var128], var130, (super.field1844.field1671 * var129.field9418 >> 12) / var130);
                        }
                        if (var89 == var90 && super.field1820[11] != var91) {
                            var89 = 0;
                            var90 = super.field1838[11];
                            var91 = super.field1820[11];
                            var92 = super.field1854;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                }
                int var131 = super.field1838[var94];
                int[] var132 = super.field1820[var94];
                if (!arg4 && super.field1850 == null) {
                    if (arg1) {
                        for (int var133 = 0; var133 < var131; ++var133) {
                            this.method1491(var132[var133]);
                        }
                    } else {
                        for (int var134 = 0; var134 < var131; ++var134) {
                            this.method1488(var132[var134]);
                        }
                    }
                } else if (!arg1) {
                    for (int var138 = 0; var138 < var131; ++var138) {
                        int var139 = var132[var138];
                        if (var139 < 65536) {
                            int var140 = super.field1778[var139];
                            if (var140 != -1) {
                                class422 var141 = super.field1850[var140];
                                class166 var142 = super.field1868[var140];
                                if (!var141.field5617) {
                                    this.method1488(var139);
                                }
                                super.field1844.method809(var142.field1986, var142.field1990, var142.field2003, var142.field1991, var142.field1989, var142.field2000, var141.field5620 & 65535, var142.field1995, var141.field5613, var141.field5616);
                            } else {
                                this.method1488(var139);
                            }
                        } else {
                            int var143 = (var139 >> 16) - 1;
                            class663 var144 = super.field1813[var143];
                            int var145 = super.field1794[var143];
                            if (var145 == 0) {
                                var145 = 1;
                            }
                            super.field1844.method806(var144, super.field1821[var143], super.field1846[var143], var145, (super.field1844.field1671 * var144.field9418 >> 12) / var145);
                        }
                    }
                } else {
                    for (int var135 = 0; var135 < var131; ++var135) {
                        int var136 = var132[var135];
                        if (var136 < 65536) {
                            int var137 = super.field1778[var136];
                            if (var137 == -1 || !super.field1850[var137].field5617) {
                                this.method1491(var136);
                            }
                        }
                    }
                }
            }
            if (!arg4 && super.field1850 == null) {
                if (arg1) {
                    while (var93 != -1000) {
                        this.method1491(var91[var89++]);
                        if (var89 == var90 && super.field1820[11] != var91) {
                            var89 = 0;
                            var91 = super.field1820[11];
                            var90 = super.field1838[11];
                            var92 = super.field1854;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                } else {
                    while (var93 != -1000) {
                        this.method1488(var91[var89++]);
                        if (var89 == var90 && super.field1820[11] != var91) {
                            var89 = 0;
                            var91 = super.field1820[11];
                            var90 = super.field1838[11];
                            var92 = super.field1854;
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
                        int var98 = super.field1778[var97];
                        if (var98 != -1) {
                            class422 var99 = super.field1850[var98];
                            class166 var100 = super.field1868[var98];
                            if (!var99.field5617) {
                                this.method1488(var97);
                            }
                            super.field1844.method809(var100.field1986, var100.field1990, var100.field2003, var100.field1991, var100.field1989, var100.field2000, var99.field5620 & 65535, var100.field1995, var99.field5613, var99.field5616);
                        } else {
                            this.method1488(var97);
                        }
                    } else {
                        int var101 = (var97 >> 16) - 1;
                        class663 var102 = super.field1813[var101];
                        int var103 = super.field1794[var101];
                        if (var103 == 0) {
                            var103 = 1;
                        }
                        super.field1844.method806(var102, super.field1821[var101], super.field1846[var101], var103, (super.field1844.field1671 * var102.field9418 >> 12) / var103);
                    }
                    if (var89 == var90 && super.field1820[11] != var91) {
                        var89 = 0;
                        var91 = super.field1820[11];
                        var90 = super.field1838[11];
                        var92 = super.field1854;
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
                        int var96 = super.field1778[var95];
                        if (var96 == -1 || !super.field1850[var96].field5617) {
                            this.method1491(var95);
                        }
                    }
                    if (var89 == var90 && super.field1820[11] != var91) {
                        var89 = 0;
                        var91 = super.field1820[11];
                        var90 = super.field1838[11];
                        var92 = super.field1854;
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

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V", line = 1372)
    private final void method1489(int arg0) {
        int var2 = 0;
        int var3 = super.field1844.field1665;
        short var4 = super.field1869[arg0];
        short var5 = super.field1864[arg0];
        short var6 = super.field1859[arg0];
        int var7 = super.field1787[var4];
        int var8 = super.field1787[var5];
        int var9 = super.field1787[var6];
        if (super.field1836 == null) {
            this.field3325.field319 = 0;
        } else {
            this.field3325.field319 = super.field1836[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field1791[var2] = super.field1870[var4];
            super.field1858[var2] = super.field1837[var4];
            super.field1771[var2++] = super.field1851[arg0] & 65535;
        } else {
            int var10 = super.field1770[var4];
            int var11 = super.field1831[var4];
            int var12 = super.field1851[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class158.field1875[var9 - var7];
                super.field1791[var2] = (((super.field1770[var6] - var10) * var13 >> 16) + var10) * super.field1844.field1671 / var3 + super.field1863.field3627;
                super.field1858[var2] = (((super.field1831[var6] - var11) * var13 >> 16) + var11) * super.field1844.field1688 / var3 + super.field1863.field3619;
                super.field1771[var2++] = (((super.field1857[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class158.field1875[var8 - var7];
                super.field1791[var2] = (((super.field1770[var5] - var10) * var14 >> 16) + var10) * super.field1844.field1671 / var3 + super.field1863.field3627;
                super.field1858[var2] = (((super.field1831[var5] - var11) * var14 >> 16) + var11) * super.field1844.field1688 / var3 + super.field1863.field3619;
                super.field1771[var2++] = (((super.field1834[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field1791[var2] = super.field1870[var5];
            super.field1858[var2] = super.field1837[var5];
            super.field1771[var2++] = super.field1834[arg0] & 65535;
        } else {
            int var15 = super.field1770[var5];
            int var16 = super.field1831[var5];
            int var17 = super.field1834[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class158.field1875[var7 - var8];
                super.field1791[var2] = (((super.field1770[var4] - var15) * var18 >> 16) + var15) * super.field1844.field1671 / var3 + super.field1863.field3627;
                super.field1858[var2] = (((super.field1831[var4] - var16) * var18 >> 16) + var16) * super.field1844.field1688 / var3 + super.field1863.field3619;
                super.field1771[var2++] = (((super.field1851[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class158.field1875[var9 - var8];
                super.field1791[var2] = (((super.field1770[var6] - var15) * var19 >> 16) + var15) * super.field1844.field1671 / var3 + super.field1863.field3627;
                super.field1858[var2] = (((super.field1831[var6] - var16) * var19 >> 16) + var16) * super.field1844.field1688 / var3 + super.field1863.field3619;
                super.field1771[var2++] = (((super.field1857[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field1791[var2] = super.field1870[var6];
            super.field1858[var2] = super.field1837[var6];
            super.field1771[var2++] = super.field1857[arg0] & 65535;
        } else {
            int var20 = super.field1770[var6];
            int var21 = super.field1831[var6];
            int var22 = super.field1857[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class158.field1875[var8 - var9];
                super.field1791[var2] = (((super.field1770[var5] - var20) * var23 >> 16) + var20) * super.field1844.field1671 / var3 + super.field1863.field3627;
                super.field1858[var2] = (((super.field1831[var5] - var21) * var23 >> 16) + var21) * super.field1844.field1688 / var3 + super.field1863.field3619;
                super.field1771[var2++] = (((super.field1834[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class158.field1875[var7 - var9];
                super.field1791[var2] = (((super.field1770[var4] - var20) * var24 >> 16) + var20) * super.field1844.field1671 / var3 + super.field1863.field3627;
                super.field1858[var2] = (((super.field1831[var4] - var21) * var24 >> 16) + var21) * super.field1844.field1688 / var3 + super.field1863.field3619;
                super.field1771[var2++] = (((super.field1851[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field1791[0];
        int var26 = super.field1791[1];
        int var27 = super.field1791[2];
        int var28 = super.field1858[0];
        int var29 = super.field1858[1];
        int var30 = super.field1858[2];
        this.field3325.field326 = false;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field1863.field3620 || var26 > super.field1863.field3620 || var27 > super.field1863.field3620) {
                this.field3325.field326 = true;
            }
            if (super.field1835 != null && super.field1835[arg0] != -1) {
                int var32;
                int var33;
                int var34;
                if (super.field1793 != null && super.field1793[arg0] != -1) {
                    int var31 = super.field1793[arg0] & 255;
                    var32 = super.field1852[var31];
                    var33 = super.field1800[var31];
                    var34 = super.field1853[var31];
                } else {
                    var32 = var4;
                    var33 = var5;
                    var34 = var6;
                }
                if (super.field1857[arg0] == -1) {
                    this.field3325.method144(var28, var29, var30, var25, var26, var27, super.field1851[arg0], super.field1851[arg0], super.field1851[arg0], super.field1770[var32], super.field1770[var33], super.field1770[var34], super.field1831[var32], super.field1831[var33], super.field1831[var34], super.field1787[var32], super.field1787[var33], super.field1787[var34], super.field1835[arg0]);
                } else {
                    this.field3325.method144(var28, var29, var30, var25, var26, var27, super.field1771[0], super.field1771[1], super.field1771[2], super.field1770[var32], super.field1770[var33], super.field1770[var34], super.field1831[var32], super.field1831[var33], super.field1831[var34], super.field1787[var32], super.field1787[var33], super.field1787[var34], super.field1835[arg0]);
                }
            } else if (super.field1857[arg0] == -1) {
                this.field3325.method133(var28, var29, var30, var25, var26, var27, class57.field592[super.field1851[arg0] & 65535]);
            } else {
                this.field3325.method141(var28, var29, var30, var25, var26, var27, super.field1771[0], super.field1771[1], super.field1771[2]);
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field1863.field3620 || var26 > super.field1863.field3620 || var27 > super.field1863.field3620 || super.field1791[3] < 0 || super.field1791[3] > super.field1863.field3620) {
                this.field3325.field326 = true;
            }
            if (super.field1835 == null || super.field1835[arg0] == -1) {
                if (super.field1857[arg0] == -1) {
                    int var40 = class57.field592[super.field1851[arg0] & 65535];
                    this.field3325.method133(var28, var29, var30, var25, var26, var27, var40);
                    this.field3325.method133(var28, var30, super.field1858[3], var25, var27, super.field1791[3], var40);
                    return;
                }
                this.field3325.method141(var28, var29, var30, var25, var26, var27, super.field1771[0], super.field1771[1], super.field1771[2]);
                this.field3325.method141(var28, var30, super.field1858[3], var25, var27, super.field1791[3], super.field1771[0], super.field1771[2], super.field1771[3]);
                return;
            }
            int var36;
            int var37;
            int var38;
            if (super.field1793 != null && super.field1793[arg0] != -1) {
                int var35 = super.field1793[arg0] & 255;
                var36 = super.field1852[var35];
                var37 = super.field1800[var35];
                var38 = super.field1853[var35];
            } else {
                var36 = var4;
                var37 = var5;
                var38 = var6;
            }
            short var39 = super.field1835[arg0];
            if (super.field1857[arg0] == -1) {
                this.field3325.method144(var28, var29, var30, var25, var26, var27, super.field1851[arg0], super.field1851[arg0], super.field1851[arg0], super.field1770[var36], super.field1770[var37], super.field1770[var38], super.field1831[var36], super.field1831[var37], super.field1831[var38], super.field1787[var36], super.field1787[var37], super.field1787[var38], var39);
                this.field3325.method144(var28, var30, super.field1858[3], var25, var27, super.field1791[3], super.field1851[arg0], super.field1851[arg0], super.field1851[arg0], super.field1770[var36], super.field1770[var37], super.field1770[var38], super.field1831[var36], super.field1831[var37], super.field1831[var38], super.field1787[var36], super.field1787[var37], super.field1787[var38], var39);
                return;
            }
            this.field3325.method144(var28, var29, var30, var25, var26, var27, super.field1771[0], super.field1771[1], super.field1771[2], super.field1770[var36], super.field1770[var37], super.field1770[var38], super.field1831[var36], super.field1831[var37], super.field1831[var38], super.field1787[var36], super.field1787[var37], super.field1787[var38], var39);
            this.field3325.method144(var28, var30, super.field1858[3], var25, var27, super.field1791[3], super.field1771[0], super.field1771[2], super.field1771[3], super.field1770[var36], super.field1770[var37], super.field1770[var38], super.field1831[var36], super.field1831[var37], super.field1831[var38], super.field1787[var36], super.field1787[var37], super.field1787[var38], var39);
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Luq;Lqda;IIII)V", line = 1609)
    public class262(class148 arg0, class90 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "()V", line = 1612)
    public final void method599() {
        super.field1863.field3620 = this.field3325.field327;
        super.field1863.field3627 = this.field3325.field318;
        super.field1863.field3619 = this.field3325.field322;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lcr;[Lsb;)Lsb;", line = 1618)
    public static final class262 method1490(class524 arg0, class262[] arg1) {
        int var2 = 0;
        class262 var3 = null;
        for (int var4 = 0; var4 < arg1.length; ++var4) {
            if (arg1[var4] != null) {
                ++var2;
                var3 = arg1[var4];
            }
        }
        if (var2 == 1) {
            return var3;
        } else {
            return new class262(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V", line = 1643)
    private final void method1491(int arg0) {
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
                    this.method1488(arg0);
                } else {
                    if (super.field1836 == null) {
                        this.field3325.field319 = 0;
                    } else {
                        this.field3325.field319 = super.field1836[arg0] & 255;
                    }
                    this.field3325.field326 = super.field1780[arg0];
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
                            this.field3325.method140(super.field1837[var2], super.field1837[var3], super.field1837[var4], super.field1870[var2], super.field1870[var3], super.field1870[var4], super.field1844.field1677, var5, var6, var7, super.field1851[arg0], super.field1851[arg0], super.field1851[arg0], super.field1770[var10], super.field1770[var11], super.field1770[var12], super.field1831[var10], super.field1831[var11], super.field1831[var12], super.field1787[var10], super.field1787[var11], super.field1787[var12], super.field1835[arg0]);
                        } else {
                            this.field3325.method140(super.field1837[var2], super.field1837[var3], super.field1837[var4], super.field1870[var2], super.field1870[var3], super.field1870[var4], super.field1844.field1677, var5, var6, var7, super.field1851[arg0], super.field1834[arg0], super.field1857[arg0], super.field1770[var10], super.field1770[var11], super.field1770[var12], super.field1831[var10], super.field1831[var11], super.field1831[var12], super.field1787[var10], super.field1787[var11], super.field1787[var12], super.field1835[arg0]);
                        }
                    } else if (super.field1857[arg0] == -1) {
                        this.field3325.method143(super.field1837[var2], super.field1837[var3], super.field1837[var4], super.field1870[var2], super.field1870[var3], super.field1870[var4], class425.method2296(-10227, class57.field592[super.field1851[arg0] & 65535], var5 << 24 | super.field1844.field1677), class425.method2296(-10227, class57.field592[super.field1851[arg0] & 65535], var6 << 24 | super.field1844.field1677), class425.method2296(-10227, class57.field592[super.field1851[arg0] & 65535], var7 << 24 | super.field1844.field1677));
                    } else {
                        this.field3325.method143(super.field1837[var2], super.field1837[var3], super.field1837[var4], super.field1870[var2], super.field1870[var3], super.field1870[var4], class425.method2296(-10227, class57.field592[super.field1851[arg0] & 65535], var5 << 24 | super.field1844.field1677), class425.method2296(-10227, class57.field592[super.field1834[arg0] & 65535], var6 << 24 | super.field1844.field1677), class425.method2296(-10227, class57.field592[super.field1857[arg0] & 65535], var7 << 24 | super.field1844.field1677));
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
                this.field3325.field319 = 0;
            } else {
                this.field3325.field319 = super.field1836[arg0] & 255;
            }
            this.field3325.field326 = super.field1780[arg0];
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
                    this.field3325.method140(super.field1837[var13], super.field1837[var14], super.field1837[var15], super.field1870[var13], super.field1870[var14], super.field1870[var15], super.field1844.field1677, var16, var17, var18, super.field1851[arg0], super.field1851[arg0], super.field1851[arg0], super.field1770[var20], super.field1770[var21], super.field1770[var22], super.field1831[var20], super.field1831[var21], super.field1831[var22], super.field1787[var20], super.field1787[var21], super.field1787[var22], super.field1835[arg0]);
                } else {
                    this.field3325.method140(super.field1837[var13], super.field1837[var14], super.field1837[var15], super.field1870[var13], super.field1870[var14], super.field1870[var15], super.field1844.field1677, var16, var17, var18, super.field1851[arg0], super.field1834[arg0], super.field1857[arg0], super.field1770[var20], super.field1770[var21], super.field1770[var22], super.field1831[var20], super.field1831[var21], super.field1831[var22], super.field1787[var20], super.field1787[var21], super.field1787[var22], super.field1835[arg0]);
                }
            } else if (super.field1857[arg0] == -1) {
                this.field3325.method143(super.field1837[var13], super.field1837[var14], super.field1837[var15], super.field1870[var13], super.field1870[var14], super.field1870[var15], class425.method2296(-10227, class57.field592[super.field1851[arg0] & 65535], var16 << 24 | super.field1844.field1677), class425.method2296(-10227, class57.field592[super.field1851[arg0] & 65535], var17 << 24 | super.field1844.field1677), class425.method2296(-10227, class57.field592[super.field1851[arg0] & 65535], var18 << 24 | super.field1844.field1677));
            } else {
                this.field3325.method143(super.field1837[var13], super.field1837[var14], super.field1837[var15], super.field1870[var13], super.field1870[var14], super.field1870[var15], class425.method2296(-10227, class57.field592[super.field1851[arg0] & 65535], var16 << 24 | super.field1844.field1677), class425.method2296(-10227, class57.field592[super.field1834[arg0] & 65535], var17 << 24 | super.field1844.field1677), class425.method2296(-10227, class57.field592[super.field1857[arg0] & 65535], var18 << 24 | super.field1844.field1677));
            }
        }
    }
}
