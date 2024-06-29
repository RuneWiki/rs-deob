import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class634 {

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public int field8516 = -1;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Z")
    public boolean field8515 = true;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "[Ljava/lang/String;")
    public String[] field8528 = new String[5];

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public int field8526 = -1;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Z")
    public boolean field8513 = false;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public int field8531 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    private int field8537 = -1;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    private int field8517 = -1;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    public int field8539 = -1;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public int field8547 = 0;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public int field8512 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    private int field8529 = -1;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public int field8544 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "Z")
    public boolean field8542 = true;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "Z")
    public boolean field8540 = true;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    private int field8556 = -1;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    private int field8545 = -1;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    public int field8554 = -1;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public int field8525 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field8518;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    private int field8521;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    private int field8524;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public int field8530;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public int field8533;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field8535;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field8538;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field8543;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public int field8546;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    private int field8548;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public int field8549;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field8550;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    public static int field8551;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public int field8552;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    public static int field8553;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
    public int field8555;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    private int field8558;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "Luk;")
    public class242 field8527;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljw;")
    private class520 field8514;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "Ljava/lang/String;")
    public String field8534;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "Ljava/lang/String;")
    public String field8541;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "[I")
    public int[] field8532;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "[I")
    public static int[] field8536;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public final void method3498(boolean arg0) {
        if (arg0) {
            this.method3506((byte) 50, 41, null);
        }
        field8557++;
        if (this.field8532 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field8532.length; var2 += 2) {
            if (this.field8544 > this.field8532[var2]) {
                this.field8544 = this.field8532[var2];
            } else if (this.field8532[var2] > this.field8525) {
                this.field8525 = this.field8532[var2];
            }
            if (this.field8532[var2 + 1] < this.field8531) {
                this.field8531 = this.field8532[var2 + 1];
            } else if (this.field8532[var2 + 1] > this.field8512) {
                this.field8512 = this.field8532[var2 + 1];
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V")
    public static final void method3499(boolean arg0) {
        field8538++;
        if (arg0) {
            method3499(false);
        }
        class251.field3460.method442(((float) class344.field4718.field5453 * 0.1F + 0.7F) * 1.1523438F);
        class251.field3460.method371(class335.field4639, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class251.field3460.method422(class16.field243, -1, 0);
        class251.field3460.method432(class515.field6884);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;IZ)Ljava/lang/String;")
    public final String method3500(String arg0, int arg1, boolean arg2) {
        field8519++;
        if (this.field8514 == null) {
            return arg0;
        }
        if (arg2) {
            this.field8525 = 21;
        }
        class319 var4 = (class319) this.field8514.method2918((long) arg1, (byte) -128);
        return var4 == null ? arg0 : var4.field4371;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLst;Z)V")
    public static final void method3501(boolean arg0, class403 arg1, boolean arg2) {
        field8522++;
        if (class398.field5290 >= 400) {
            return;
        }
        if (class199.field2897 != arg1) {
            if (!arg2) {
                field8536 = null;
            }
            String var9;
            if (arg1.field5371 == 0) {
                boolean var3 = true;
                if (class199.field2897.field5388 != -1 && arg1.field5388 != -1) {
                    int var4 = arg1.field5401 < class199.field2897.field5401 ? class199.field2897.field5401 : arg1.field5401;
                    int var5 = class199.field2897.field5388 < arg1.field5388 ? class199.field2897.field5388 : arg1.field5388;
                    int var6 = var4 * 10 / 100 + var5 + 5;
                    int var7 = class199.field2897.field5401 - arg1.field5401;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var6 < var7) {
                        var3 = false;
                    }
                }
                String var8 = class488.field6599 == class392.field5166 ? class72.field1094.method546(class516.field6892, (byte) -35) : class72.field1092.method546(class516.field6892, (byte) -35);
                if (arg1.field5374 > arg1.field5401) {
                    var9 = arg1.method2316(true, (byte) 123) + (var3 ? class326.method1960(arg1.field5401, class199.field2897.field5401, -1) : "<col=ffffff>") + " (" + var8 + arg1.field5401 + "+" + (arg1.field5374 - arg1.field5401) + ")";
                } else {
                    var9 = arg1.method2316(true, (byte) 124) + (var3 ? class326.method1960(arg1.field5401, class199.field2897.field5401, -1) : "<col=ffffff>") + " (" + var8 + arg1.field5401 + ")";
                }
            } else if (arg1.field5371 == -1) {
                var9 = arg1.method2316(true, (byte) 123);
            } else {
                var9 = arg1.method2316(true, (byte) 110) + " (" + class72.field1093.method546(class516.field6892, (byte) -35) + arg1.field5371 + ")";
            }
            if (class400.field5305 && !arg0 && (class658.field9093 & 0x8) != 0) {
                class298.field4185++;
                class483.method2701(0, false, true, class214.field3060 + " -> <col=ffffff>" + var9, (long) arg1.field5633, 47, 0, -1, class425.field5847, class680.field9585, 6967);
            }
            if (arg0) {
                class483.method2701(0, true, false, "", 0L, -1, 0, 0, -1, "<col=cccccc>" + var9, 6967);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class408.field5520[var10] != null) {
                        short var12 = 0;
                        if (class443.field6069 == class392.field5166 && class408.field5520[var10].equalsIgnoreCase(class72.field1087.method546(class516.field6892, (byte) -35))) {
                            if (class199.field2897.field5401 < arg1.field5401) {
                                var12 = 2000;
                            }
                            if (class199.field2897.field5397 != 0 && arg1.field5397 != 0) {
                                if (class199.field2897.field5397 == arg1.field5397) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class275.field3847[var10]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class388.field5141[var10] + var12);
                        int var14 = class710.field9938[var10] == -1 ? class294.field4165 : class710.field9938[var10];
                        class177.field2723++;
                        class483.method2701(0, false, true, "<col=ffffff>" + var9, (long) arg1.field5633, var13, 0, -1, var14, class408.field5520[var10], 6967);
                    }
                }
            }
            if (!arg0) {
                for (class117 var11 = (class117) class480.field6411.method3257(-86); var11 != null; var11 = (class117) class480.field6411.method3263((byte) -85)) {
                    if (var11.field1993 == 58) {
                        var11.field1994 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class400.field5305 && (class658.field9093 & 0x10) != 0) {
            class483.method2701(0, false, true, class214.field3060 + " -> <col=ffffff>" + class72.field1101.method546(class516.field6892, (byte) -35), 0L, 23, 0, -1, class425.field5847, class680.field9585, 6967);
            class512.field6837++;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static final void method3502(byte arg0) {
        field8551++;
        if (class253.field3477) {
            return;
        }
        if (arg0 != 93) {
            field8536 = null;
        }
        if (class344.field4718.field5425) {
            class463.field6263 = ((int) class463.field6263 + 47 & 0xFFFFFFF0);
        } else {
            class344.field4710 += (12.0F - class344.field4710) / 2.0F;
        }
        class457.field6204 = true;
        class253.field3477 = true;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(Z)V")
    public static void method3503(boolean arg0) {
        if (!arg0) {
            field8536 = null;
        }
        field8536 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)I")
    public static final int method3504(int arg0, int arg1, int arg2) {
        field8553++;
        if (arg1 != -1) {
            return 110;
        }
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLoa;B)Lxa;")
    public final class468 method3505(boolean arg0, class651 arg1, byte arg2) {
        field8550++;
        if (arg2 > -97) {
            this.method3505(true, null, (byte) 100);
        }
        int var4 = arg0 ? this.field8526 : this.field8554;
        int var5 = var4 | arg1.field8804 << 29;
        class468 var6 = (class468) this.field8527.field3389.method3750((long) var5, false);
        if (var6 != null) {
            return var6;
        } else if (this.field8527.field3384.method2549(var4, 3015)) {
            class500 var7 = class500.method2770(this.field8527.field3384, var4, 0);
            if (var7 != null) {
                var6 = arg1.method440(var7, true);
                this.field8527.field3389.method3745(1, (long) var5, var6);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BILeh;)V")
    private final void method3506(byte arg0, int arg1, class335 arg2) {
        if (arg1 == 1) {
            this.field8554 = arg2.method2001((byte) -83);
        } else if (arg1 == 2) {
            this.field8526 = arg2.method2001((byte) -83);
        } else if (arg1 == 3) {
            this.field8541 = arg2.method2029((byte) -128);
        } else if (arg1 == 4) {
            this.field8546 = arg2.method2042((byte) 53);
        } else if (arg1 == 5) {
            this.field8539 = arg2.method2042((byte) 53);
        } else if (arg1 == 6) {
            this.field8547 = arg2.method2034(arg0 + 155);
        } else if (arg1 == 7) {
            int var4 = arg2.method2034(255);
            if ((var4 & 0x1) == 0) {
                this.field8540 = false;
            }
            if ((var4 & 0x2) == 2) {
                this.field8513 = true;
            }
        } else if (arg1 == 8) {
            this.field8515 = arg2.method2034(255) == 1;
        } else if (arg1 == 9) {
            this.field8529 = arg2.method2001((byte) -83);
            if (this.field8529 == 65535) {
                this.field8529 = -1;
            }
            this.field8545 = arg2.method2001((byte) -83);
            if (this.field8545 == 65535) {
                this.field8545 = -1;
            }
            this.field8521 = arg2.method2045(-98);
            this.field8558 = arg2.method2045(arg0 ^ 0xFFFFFFFA);
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field8528[arg1 - 10] = arg2.method2029((byte) -92);
        } else if (arg1 == 15) {
            int var5 = arg2.method2034(255);
            this.field8532 = new int[var5 * 2];
            for (int var6 = 0; var6 < (var5 * 2); var6++) {
                this.field8532[var6] = arg2.method2022(class217.method1381(arg0, -29125));
            }
            this.field8549 = arg2.method2045(-98);
            this.field8552 = arg2.method2045(arg0 - 198);
        } else if (arg1 == 16) {
            this.field8542 = false;
        } else if (arg1 == 17) {
            this.field8534 = arg2.method2029((byte) -111);
        } else if (arg1 == 18) {
            this.field8517 = arg2.method2001((byte) -83);
        } else if (arg1 == 19) {
            this.field8516 = arg2.method2001((byte) -83);
        } else if (arg1 == 20) {
            this.field8556 = arg2.method2001((byte) -83);
            if (this.field8556 == 65535) {
                this.field8556 = -1;
            }
            this.field8537 = arg2.method2001((byte) -83);
            if (this.field8537 == 65535) {
                this.field8537 = -1;
            }
            this.field8524 = arg2.method2045(-98);
            this.field8548 = arg2.method2045(-98);
        } else if (arg1 == 21) {
            this.field8530 = arg2.method2045(-98);
        } else if (arg1 == 22) {
            this.field8555 = arg2.method2045(arg0 ^ 0xFFFFFFFA);
        } else if (arg1 == 249) {
            int var7 = arg2.method2034(255);
            if (this.field8514 == null) {
                int var8 = class587.method3231(true, var7);
                this.field8514 = new class520(var8);
            }
            for (int var9 = 0; var9 < var7; var9++) {
                boolean var10 = arg2.method2034(arg0 ^ 0x9B) == 1;
                int var11 = arg2.method2042((byte) 53);
                class504 var12;
                if (var10) {
                    var12 = new class319(arg2.method2029((byte) -83));
                } else {
                    var12 = new class704(arg2.method2045(-98));
                }
                this.field8514.method2911((long) var11, var12, (byte) -28);
            }
        }
        if (arg0 == 100) {
            field8535++;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Laba;Z)Z")
    public final boolean method3507(class163 arg0, boolean arg1) {
        field8543++;
        int var3;
        if (this.field8545 == -1) {
            if (this.field8529 == -1) {
                return true;
            }
            var3 = arg0.method1126(this.field8529, -111);
        } else {
            var3 = arg0.method1127(!arg1, this.field8545);
        }
        if (var3 < this.field8521 || var3 > this.field8558) {
            return false;
        } else if (arg1) {
            boolean var4 = false;
            int var5;
            if (this.field8537 == -1) {
                if (this.field8556 == -1) {
                    return true;
                }
                var5 = arg0.method1126(this.field8556, 120);
            } else {
                var5 = arg0.method1127(false, this.field8537);
            }
            return var5 >= this.field8524 && this.field8548 >= var5;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Loa;I)Lxa;")
    public final class468 method3508(class651 arg0, int arg1) {
        int var3 = 124 % ((arg1 - 30) / 52);
        field8520++;
        class468 var4 = (class468) this.field8527.field3389.method3750((long) (this.field8517 | 0x20000 | arg0.field8804 << 29), false);
        if (var4 != null) {
            return var4;
        }
        this.field8527.field3384.method2549(this.field8517, 3015);
        class500 var5 = class500.method2770(this.field8527.field3384, this.field8517, 0);
        if (var5 != null) {
            var4 = arg0.method440(var5, true);
            this.field8527.field3389.method3745(1, (long) (this.field8517 | 0x20000 | arg0.field8804 << 29), var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZ)I")
    public final int method3509(int arg0, int arg1, boolean arg2) {
        field8518++;
        if (this.field8514 == null) {
            return arg0;
        }
        if (arg2) {
            method3503(false);
        }
        class704 var4 = (class704) this.field8514.method2918((long) arg1, (byte) 127);
        return var4 == null ? arg0 : var4.field9905;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLeh;)V")
    public final void method3510(boolean arg0, class335 arg1) {
        field8523++;
        if (!arg0) {
            this.field8513 = false;
        }
        while (true) {
            int var3 = arg1.method2034(255);
            if (var3 == 0) {
                return;
            }
            this.method3506((byte) 100, var3, arg1);
        }
    }
}
