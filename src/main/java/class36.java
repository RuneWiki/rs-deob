import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class36 {

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "Lr;")
    private class286 field534;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "Lea;")
    private class217 field535;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "Ldk;")
    private class226 field540;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field538 = 0;

    @OriginalMember(owner = "client!rn", name = "t", descriptor = "Lf;")
    public static class262 field550 = null;

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "[I")
    public static int[] field548 = new int[32];

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "Laj;")
    private class1 field542;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "[I")
    public static int[] field532;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "[Lee;")
    private class296[] field539;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lpm;IZBLpm;)Lee;", line = 6)
    private final class296 method319(class111 arg0, int arg1, boolean arg2, byte arg3, class111 arg4) {
        field545++;
        if (this.field542 == null) {
            throw new RuntimeException();
        }
        this.field542.field48 = arg1 * 8 + 5;
        if (this.field542.field34.length <= this.field542.field48) {
            throw new RuntimeException();
        } else if (this.field539[arg1] == null) {
            int var6 = this.field542.method33(false);
            if (arg3 == 85) {
                int var7 = this.field542.method33(false);
                class296 var8 = new class296(arg1, arg4, arg0, this.field534, this.field535, var6, var7, arg2);
                this.field539[arg1] = var8;
                return var8;
            } else {
                return (class296) null;
            }
        } else {
            return this.field539[arg1];
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Ljava/lang/String;", line = 52)
    public static final String method320(int arg0, int arg1) {
        String var2 = Integer.toString(arg0);
        if (arg1 != 2) {
            return (String) null;
        }
        field536++;
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() <= 9) {
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class204.field3179 + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        } else {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class155.field2544 + " (" + var2 + ")</col>";
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)Lvd;", line = 83)
    public static final class144 method321(int arg0, int arg1, int arg2) {
        class42 var3 = class34.field521[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field672; var4++) {
            class144 var5 = var3.field659[var4];
            if ((var5.field2344 >> 29 & 0x3L) == 2L && var5.field2345 == arg1 && var5.field2339 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Z", line = 104)
    public final boolean method322(int arg0) {
        field547++;
        if (this.field542 != null) {
            return true;
        }
        if (arg0 != 0) {
            field548 = (int[]) null;
        }
        if (this.field540 == null) {
            if (this.field534.method2004(true)) {
                return false;
            }
            this.field540 = this.field534.method2000(255, false, 255, true, (byte) 0);
        }
        if (this.field540.field2433) {
            return false;
        } else {
            this.field542 = new class1(this.field540.method612(arg0 ^ 0x34));
            this.field539 = new class296[(this.field542.field34.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)Z", line = 134)
    public static final boolean method323(int arg0, int arg1) {
        field541++;
        class44 var2 = class334.method2337(false, arg0);
        if (var2 == null) {
            return false;
        } else if (class69.field1039 == 1 || class69.field1039 == 2 || class260.field3874 == 2) {
            class342.field5303 = var2.field693;
            class1.field72 = var2.field691;
            if (class260.field3874 != 0) {
                class247.field3681 = class1.field72 + 50000;
                class10.field237 = class1.field72 + 40000;
                class166.field2679 = class10.field237;
            }
            return true;
        } else {
            String var3 = "";
            if (class260.field3874 != 0) {
                var3 = ":" + (var2.field691 + 7000);
            }
            String var4 = "";
            if (class259.field3844 != null) {
                var4 = "/p=" + class259.field3844;
            }
            String var5 = "http://" + var2.field693 + var3 + "/l=" + class28.field453 + "/a=" + class151.field2464 + var4 + "/j" + (class115.field1849 ? "1" : "0") + ",o" + (class32.field494 ? "1" : "0") + ",a2,m" + (class67.field1020 ? "1" : "0");
            if (arg1 != 2) {
                return false;
            }
            try {
                class5.field118.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V", line = 202)
    public static void method324(int arg0) {
        if (arg0 != 65536) {
            field548 = (int[]) null;
        }
        field550 = null;
        field548 = null;
        field532 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 214)
    public static final int method325(String arg0, int arg1) {
        field544++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class172.field2763; var2++) {
            if (arg0.equalsIgnoreCase(class129.field2066[var2])) {
                return var2;
            }
        }
        int var3 = -106 / ((arg1 - 54) / 43);
        return -1;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V", line = 239)
    public final void method326(byte arg0) {
        field546++;
        if (arg0 != -45) {
            field532 = (int[]) null;
        }
        if (this.field539 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field539.length; var2++) {
            if (this.field539[var2] != null) {
                this.field539[var2].method2093(arg0 + 45);
            }
        }
        for (int var3 = 0; var3 < this.field539.length; var3++) {
            if (this.field539[var3] != null) {
                this.field539[var3].method2091(255);
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lpm;Lpm;II)Lee;", line = 279)
    public final class296 method327(class111 arg0, class111 arg1, int arg2, int arg3) {
        int var5 = 52 % ((9 - arg3) / 54);
        field543++;
        return this.method319(arg1, arg2, true, (byte) 85, arg0);
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lr;Lea;)V", line = 288)
    public class36(class286 arg0, class217 arg1) {
        this.field534 = arg0;
        this.field535 = arg1;
        if (!this.field534.method2004(true)) {
            this.field540 = this.field534.method2000(255, false, 255, true, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Llk;Z)V", line = 308)
    public static final void method328(class294 arg0, boolean arg1) {
        field537++;
        if (arg1 || arg0.field4683 == 0) {
            return;
        }
        class66 var2 = arg0.method2062((byte) -101);
        if (arg0.field4695 != -1 && arg0.field4695 < 32768) {
            class86 var3 = class197.field3029[arg0.field4695];
            if (var3 != null) {
                int var4 = arg0.field4671 - var3.field4671;
                int var5 = arg0.field4672 - var3.field4672;
                if (var4 != 0 || var5 != 0) {
                    arg0.field4630 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field4695 >= 32768) {
            int var6 = arg0.field4695 - 32768;
            if (class75.field1146 == var6) {
                var6 = 2047;
            }
            class92 var7 = class74.field1140[var6];
            if (var7 != null) {
                int var8 = arg0.field4671 - var7.field4671;
                int var9 = arg0.field4672 - var7.field4672;
                if (var8 != 0 || var9 != 0) {
                    arg0.field4630 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field4613 != 0 || arg0.field4657 != 0) && (arg0.field4645 == 0 || arg0.field4707 > 0)) {
            int var10 = arg0.field4671 - ((arg0.field4613 - class117.field1902 - class117.field1902) * 64);
            int var11 = arg0.field4672 - (arg0.field4657 - class133.field2118 - class133.field2118) * 64;
            if (var10 != 0 || var11 != 0) {
                arg0.field4630 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg0.field4657 = 0;
            arg0.field4613 = 0;
        }
        int var12 = arg0.field4630 - arg0.field4682 & 0x7FF;
        if (var12 == 0) {
            arg0.field4688 = 0;
            arg0.field4677 = 0;
        } else if (var2.field992 == 0) {
            arg0.field4688++;
            if (var12 > 1024) {
                arg0.field4682 -= arg0.field4683;
                boolean var13 = true;
                if (arg0.field4683 > var12 || 2048 - arg0.field4683 < var12) {
                    arg0.field4682 = arg0.field4630;
                    var13 = false;
                }
                if (arg0.field4688 > 25 || var13) {
                    arg0.field4614 = var2.field961;
                    if (arg0.field4645 > 0) {
                        if (arg0.field4709[arg0.field4645 - 1] == 2) {
                            if (var2.field1002 != -1) {
                                arg0.field4614 = var2.field1002;
                            } else if (var2.field1004 != -1) {
                                arg0.field4614 = var2.field1004;
                            }
                        } else if (arg0.field4709[arg0.field4645 - 1] == 0) {
                            if (var2.field1009 != -1) {
                                arg0.field4614 = var2.field1009;
                            } else if (var2.field991 != -1) {
                                arg0.field4614 = var2.field991;
                            }
                        } else if (var2.field993 != -1) {
                            arg0.field4614 = var2.field993;
                        }
                    } else if (var2.field970 != -1) {
                        arg0.field4614 = var2.field970;
                    }
                }
            } else {
                boolean var14 = true;
                arg0.field4682 += arg0.field4683;
                if (var12 < arg0.field4683 || (2048 - arg0.field4683) < var12) {
                    var14 = false;
                    arg0.field4682 = arg0.field4630;
                }
                if (arg0.field4688 > 25 || var14) {
                    arg0.field4614 = var2.field961;
                    if (arg0.field4645 > 0) {
                        if (arg0.field4709[arg0.field4645 - 1] == 2) {
                            if (var2.field1001 != -1) {
                                arg0.field4614 = var2.field1001;
                            } else if (var2.field1004 != -1) {
                                arg0.field4614 = var2.field1004;
                            }
                        } else if (arg0.field4709[arg0.field4645 - 1] == 0) {
                            if (var2.field997 != -1) {
                                arg0.field4614 = var2.field997;
                            } else if (var2.field991 != -1) {
                                arg0.field4614 = var2.field991;
                            }
                        } else if (var2.field969 != -1) {
                            arg0.field4614 = var2.field969;
                        }
                    } else if (var2.field962 != -1) {
                        arg0.field4614 = var2.field962;
                    }
                }
            }
            arg0.field4682 &= 0x7FF;
        } else {
            arg0.field4614 = -1;
            int var15 = arg0.field4630 << 5;
            if (arg0.field4633 != var15) {
                arg0.field4623 = 0;
                int var16 = arg0.field4677 * arg0.field4677 / (var2.field992 * 2);
                int var17 = var15 - arg0.field4626 & 0xFFFF;
                arg0.field4633 = var15;
                if (arg0.field4677 > 0 && var16 <= var17 && var17 - var16 < 32768) {
                    arg0.field4653 = var17 / 2;
                    int var18 = var2.field995 * var2.field995 / (var2.field992 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    arg0.field4704 = true;
                    if (var18 < arg0.field4653) {
                        arg0.field4653 = var17 - var18;
                    }
                } else if (arg0.field4677 < 0 && var16 <= 65536 - var17 && (65536 - var16 - var17) < 32768) {
                    arg0.field4653 = (65536 - var17) / 2;
                    arg0.field4704 = true;
                    int var19 = var2.field995 * var2.field995 / (var2.field992 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var19 < arg0.field4653) {
                        arg0.field4653 = 65536 - var19 - var17;
                    }
                } else {
                    arg0.field4704 = false;
                }
            }
            if (arg0.field4677 == 0) {
                int var20 = arg0.field4633 - arg0.field4626 & 0xFFFF;
                if (var2.field992 > var20) {
                    arg0.field4626 = arg0.field4633;
                } else {
                    int var21 = var2.field995 * var2.field995 / (var2.field992 * 2);
                    arg0.field4623 = 0;
                    arg0.field4704 = true;
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    if (var20 < 32768) {
                        arg0.field4653 = var20 / 2;
                        arg0.field4677 = var2.field992;
                        if (arg0.field4653 > var21) {
                            arg0.field4653 = var20 - var21;
                        }
                    } else {
                        arg0.field4653 = (65536 - var20) / 2;
                        arg0.field4677 = -var2.field992;
                        if (var21 < arg0.field4653) {
                            arg0.field4653 = 65536 - var21 - var20;
                        }
                    }
                }
            } else if (arg0.field4677 <= 0) {
                if (arg0.field4623 >= arg0.field4653) {
                    arg0.field4704 = false;
                }
                if (!arg0.field4704) {
                    arg0.field4677 += var2.field992;
                    if (arg0.field4677 > 0) {
                        arg0.field4677 = 0;
                    }
                } else if (arg0.field4677 > -var2.field995) {
                    arg0.field4677 -= var2.field992;
                }
            } else {
                if (arg0.field4653 <= arg0.field4623) {
                    arg0.field4704 = false;
                }
                if (!arg0.field4704) {
                    arg0.field4677 -= var2.field992;
                    if (arg0.field4677 < 0) {
                        arg0.field4677 = 0;
                    }
                } else if (var2.field995 > arg0.field4677) {
                    arg0.field4677 += var2.field992;
                }
            }
            if (arg0.field4677 > 0) {
                arg0.field4623 += arg0.field4677;
            } else {
                arg0.field4623 -= arg0.field4677;
            }
            arg0.field4626 += arg0.field4677;
            arg0.field4626 &= 0xFFFF;
            arg0.field4682 = arg0.field4626 >> 5;
            if (arg0.field4677 >= 0) {
                if (arg0.field4645 > 0) {
                    if (arg0.field4709[arg0.field4645 - 1] == 2) {
                        if (var2.field1001 != -1) {
                            arg0.field4614 = var2.field1001;
                        } else if (var2.field1004 != -1) {
                            arg0.field4614 = var2.field1004;
                        }
                    } else if (arg0.field4709[arg0.field4645 - 1] == 0) {
                        if (var2.field997 != -1) {
                            arg0.field4614 = var2.field997;
                        } else if (var2.field991 != -1) {
                            arg0.field4614 = var2.field991;
                        }
                    }
                }
                if (arg0.field4614 == -1) {
                    if (var2.field969 != -1) {
                        arg0.field4614 = var2.field969;
                    } else if (var2.field962 != -1) {
                        arg0.field4614 = var2.field962;
                    }
                }
            } else {
                if (arg0.field4645 > 0) {
                    if (arg0.field4709[arg0.field4645 - 1] == 2) {
                        if (var2.field1002 != -1) {
                            arg0.field4614 = var2.field1002;
                        } else if (var2.field1004 != -1) {
                            arg0.field4614 = var2.field1004;
                        }
                    } else if (arg0.field4709[arg0.field4645 - 1] == 0) {
                        if (var2.field1009 != -1) {
                            arg0.field4614 = var2.field1009;
                        } else if (var2.field991 != -1) {
                            arg0.field4614 = var2.field991;
                        }
                    }
                }
                if (arg0.field4614 == -1) {
                    if (var2.field993 != -1) {
                        arg0.field4614 = var2.field993;
                    } else if (var2.field970 != -1) {
                        arg0.field4614 = var2.field970;
                    }
                }
            }
            if (arg0.field4614 == -1) {
                arg0.field4614 = var2.field961;
            }
        }
    }
}
