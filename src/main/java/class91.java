import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class91 extends class88 {

    @OriginalMember(owner = "client!na", name = "C", descriptor = "I")
    public static int field2148 = 0;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "Ltd;")
    public static class136 field2149 = class145.method1172("Verbindung konnte nicht hergestellt werden)3", 45);

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public static int field2144 = 0;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "Ltd;")
    public static class136 field2152 = class145.method1172("Welt", 45);

    @OriginalMember(owner = "client!na", name = "F", descriptor = "Ltd;")
    public static class136 field2151 = class145.method1172("Sie haben gerade eine andere Welt verlassen)3", 45);

    @OriginalMember(owner = "client!na", name = "P", descriptor = "Ltd;")
    private static class136 field2161 = class145.method1172("Loading sprites )2 ", 45);

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "Ltd;")
    public static class136 field2162 = field2161;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    public static int field2159 = 0;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "Ltd;")
    public class136 field2158;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "Lmd;")
    public static class87 field2156;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "[I")
    public static int[] field2150;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "[I")
    public static int[] field2157;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLke;)Lke;")
    public static final class74 method682(byte arg0, class74 arg1) {
        if (arg0 < 23) {
            method687(true, null);
        }
        class74 var2 = class99.method806(arg1, 0);
        field2153++;
        if (var2 == null) {
            var2 = arg1.field1673;
        }
        return var2;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIB)I")
    public static final int method683(int arg0, int arg1, byte arg2) {
        int var3 = class132.method1069(4, arg0 + 91923, (byte) -124, arg1 + 45365) + (class132.method1069(2, arg0 + 37821, (byte) -124, arg1 + 10294) - 128 >> 1) + (class132.method1069(1, arg0, (byte) -124, arg1) - 128 >> 2) - 128;
        if (arg2 <= 23) {
            method685((byte) 54);
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        field2155++;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
    public static final void method684(int arg0, int arg1, int arg2) {
        class120.field2743++;
        if (arg2 != 9292) {
            method688(-53, (byte) 46);
        }
        field2154++;
        class15.field304.method867(129, true);
        class15.field304.method1017(14697, arg1);
        class15.field304.method991(arg0, false);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public static final void method685(byte arg0) {
        if (arg0 != 44) {
            field2157 = null;
        }
        field2141++;
        if (class22.field472.toLowerCase().indexOf("microsoft") != -1) {
            class37.field875[187] = 27;
            class37.field875[222] = 59;
            class37.field875[223] = 28;
            class37.field875[219] = 42;
            class37.field875[220] = 74;
            class37.field875[186] = 57;
            class37.field875[221] = 43;
            class37.field875[189] = 26;
            class37.field875[192] = 58;
            class37.field875[191] = 73;
            class37.field875[190] = 72;
            class37.field875[188] = 71;
            return;
        }
        class37.field875[45] = 26;
        class37.field875[61] = 27;
        class37.field875[93] = 43;
        class37.field875[46] = 72;
        class37.field875[59] = 57;
        class37.field875[44] = 71;
        class37.field875[47] = 73;
        class37.field875[92] = 74;
        class37.field875[91] = 42;
        if (class22.field470 == null) {
            class37.field875[192] = 58;
            class37.field875[222] = 59;
        } else {
            class37.field875[520] = 59;
            class37.field875[192] = 28;
            class37.field875[222] = 58;
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V")
    public static void method686(byte arg0) {
        if (arg0 != 35) {
            field2156 = null;
        }
        field2156 = null;
        field2152 = null;
        field2162 = null;
        field2149 = null;
        field2157 = null;
        field2151 = null;
        field2161 = null;
        field2150 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLwe;)V")
    public static final void method687(boolean arg0, class155 arg1) {
        arg1.field3594 = arg1.field3556;
        field2146++;
        if (arg1.field3564 == 0) {
            arg1.field3582 = 0;
            return;
        }
        if (arg1.field3585 != -1 && arg1.field3598 == 0) {
            class116 var2 = class29.method252(true, arg1.field3585);
            if (arg1.field3536 > 0 && var2.field2660 == 0) {
                arg1.field3582++;
                return;
            }
            if (arg1.field3536 <= 0 && var2.field2666 == 0) {
                arg1.field3582++;
                return;
            }
        }
        int var3 = arg1.field3580;
        int var4 = arg1.field3560[arg1.field3564 - 1] * 128 + arg1.field3565 * 64;
        int var5 = arg1.field3578;
        if (arg0) {
            field2159 = 49;
        }
        int var6 = arg1.field3581[arg1.field3564 - 1] * 128 + arg1.field3565 * 64;
        if (var4 - var3 > 256 || var4 - var3 < -256 || var6 - var5 > 256 || var6 - var5 < -256) {
            arg1.field3578 = var6;
            arg1.field3580 = var4;
            return;
        }
        if (var4 <= var3) {
            if (var3 <= var4) {
                if (var6 > var5) {
                    arg1.field3538 = 1024;
                } else if (var5 > var6) {
                    arg1.field3538 = 0;
                }
            } else if (var5 < var6) {
                arg1.field3538 = 768;
            } else if (var5 <= var6) {
                arg1.field3538 = 512;
            } else {
                arg1.field3538 = 256;
            }
        } else if (var6 > var5) {
            arg1.field3538 = 1280;
        } else if (var5 > var6) {
            arg1.field3538 = 1792;
        } else {
            arg1.field3538 = 1536;
        }
        int var7 = arg1.field3599;
        int var8 = arg1.field3538 - arg1.field3610 & 0x7FF;
        boolean var9 = true;
        int var10 = 4;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg1.field3575;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg1.field3541;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg1.field3608;
        }
        if (var7 == -1) {
            var7 = arg1.field3575;
        }
        arg1.field3594 = var7;
        if (arg1 instanceof class67) {
            var9 = ((class67) arg1).field1428.field2281;
        }
        if (var9) {
            if (arg1.field3610 != arg1.field3538 && arg1.field3587 == -1 && arg1.field3595 != 0) {
                var10 = 2;
            }
            if (arg1.field3564 > 2) {
                var10 = 6;
            }
            if (arg1.field3564 > 3) {
                var10 = 8;
            }
            if (arg1.field3582 > 0 && arg1.field3564 > 1) {
                var10 = 8;
                arg1.field3582--;
            }
        } else {
            if (arg1.field3564 > 1) {
                var10 = 6;
            }
            if (arg1.field3564 > 2) {
                var10 = 8;
            }
            if (arg1.field3582 > 0 && arg1.field3564 > 1) {
                arg1.field3582--;
                var10 = 8;
            }
        }
        if (arg1.field3586[arg1.field3564 - 1]) {
            var10 <<= 0x1;
        }
        if (var10 >= 8 && arg1.field3594 == arg1.field3575 && arg1.field3558 != -1) {
            arg1.field3594 = arg1.field3558;
        }
        if (var6 > var5) {
            arg1.field3578 += var10;
            if (arg1.field3578 > var6) {
                arg1.field3578 = var6;
            }
        } else if (var6 < var5) {
            arg1.field3578 -= var10;
            if (arg1.field3578 < var6) {
                arg1.field3578 = var6;
            }
        }
        if (var3 < var4) {
            arg1.field3580 += var10;
            if (arg1.field3580 > var4) {
                arg1.field3580 = var4;
            }
        } else if (var3 > var4) {
            arg1.field3580 -= var10;
            if (var4 > arg1.field3580) {
                arg1.field3580 = var4;
            }
        }
        if (arg1.field3580 == var4 && arg1.field3578 == var6) {
            if (arg1.field3536 > 0) {
                arg1.field3536--;
            }
            arg1.field3564--;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)Z")
    public static final boolean method688(int arg0, byte arg1) {
        field2147++;
        if (class67.field1427[arg0]) {
            return true;
        }
        if (arg1 >= -125) {
            method684(-4, 121, -10);
        }
        if (!class109.field2569.method657((byte) 79, arg0)) {
            return false;
        }
        int var2 = class109.field2569.method666(0, arg0);
        if (var2 == 0) {
            class67.field1427[arg0] = true;
            return true;
        }
        if (class94.field2201[arg0] == null) {
            class94.field2201[arg0] = new class74[var2];
        }
        for (int var3 = 0; var3 < var2; var3++) {
            if (class94.field2201[arg0][var3] == null) {
                byte[] var4 = class109.field2569.method669(var3, arg0, -67);
                if (var4 != null) {
                    class94.field2201[arg0][var3] = new class74();
                    class94.field2201[arg0][var3].field1663 = (arg0 << 16) + var3;
                    if (var4[0] == -1) {
                        class94.field2201[arg0][var3].method540(0, new class127(var4));
                    } else {
                        class94.field2201[arg0][var3].method536((byte) 70, new class127(var4));
                    }
                }
            }
        }
        class67.field1427[arg0] = true;
        return true;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)I")
    public static final int method689(boolean arg0) {
        field2142++;
        int var1 = 3;
        if (class12.field228 < 310) {
            int var2 = class9.field168 >> 7;
            int var3 = class100.field2409 >> 7;
            int var4 = class24.field555.field3580 >> 7;
            if ((class125.field2895[class62.field1331][var2][var3] & 0x4) != 0) {
                var1 = class62.field1331;
            }
            int var5 = class24.field555.field3578 >> 7;
            int var6;
            if (var3 >= var5) {
                var6 = var3 - var5;
            } else {
                var6 = var5 - var3;
            }
            int var7;
            if (var4 <= var2) {
                var7 = var2 - var4;
            } else {
                var7 = var4 - var2;
            }
            if (var6 < var7) {
                int var8 = var6 * 65536 / var7;
                int var9 = 32768;
                while (var2 != var4) {
                    var9 += var8;
                    if (var4 > var2) {
                        var2++;
                    } else if (var2 > var4) {
                        var2--;
                    }
                    if ((class125.field2895[class62.field1331][var2][var3] & 0x4) != 0) {
                        var1 = class62.field1331;
                    }
                    if (var9 >= 65536) {
                        if (var3 < var5) {
                            var3++;
                        } else if (var3 > var5) {
                            var3--;
                        }
                        var9 -= 65536;
                        if ((class125.field2895[class62.field1331][var2][var3] & 0x4) != 0) {
                            var1 = class62.field1331;
                        }
                    }
                }
            } else {
                int var10 = var7 * 65536 / var6;
                int var11 = 32768;
                while (var3 != var5) {
                    if (var5 > var3) {
                        var3++;
                    } else if (var3 > var5) {
                        var3--;
                    }
                    if ((class125.field2895[class62.field1331][var2][var3] & 0x4) != 0) {
                        var1 = class62.field1331;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        if (var4 > var2) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class125.field2895[class62.field1331][var2][var3] & 0x4) != 0) {
                            var1 = class62.field1331;
                        }
                        var11 -= 65536;
                    }
                }
            }
        }
        if ((class125.field2895[class62.field1331][class24.field555.field3580 >> 7][class24.field555.field3578 >> 7] & 0x4) != 0) {
            var1 = class62.field1331;
        }
        if (!arg0) {
            method682((byte) -13, null);
        }
        return var1;
    }
}
