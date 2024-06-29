import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class253 extends class313 {

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "I")
    private int field4072 = 585;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "[I")
    public static int[] field4063 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "Ljava/lang/String;")
    public static String field4071 = null;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "Lul;")
    public static class51 field4069 = new class51(100);

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "Ljo;")
    public static class98 field4074 = new class98();

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
    public static int field4075 = 0;

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "Lc;")
    public static class331 field4076 = new class331();

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field4077 = "Allocated memory";

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V", line = 4)
    public static void method1759(int arg0) {
        if (arg0 != 6) {
            return;
        }
        field4077 = null;
        field4069 = null;
        field4063 = null;
        field4076 = null;
        field4071 = null;
        field4074 = null;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IB)I", line = 19)
    public static final int method1760(int arg0, byte arg1) {
        field4067++;
        int var2 = 48 / ((arg1 + 47) / 60);
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(Z)Z", line = 31)
    public static final boolean method1761(boolean arg0) {
        if (arg0) {
            method1761(true);
        }
        field4073++;
        try {
            return class262.method1808(9);
        } catch (IOException var5) {
            class327.method2272(-104);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class40.field592 + "," + class338.field5410 + "," + class35.field509 + " - " + class308.field4906 + "," + (class218.field3632.field1975[0] + class24.field345) + "," + (class218.field3632.field2034[0] + class34.field484) + " - ";
            for (int var4 = 0; class308.field4906 > var4 && var4 < 50; var4++) {
                var3 = var3 + class276.field4398.field5342[var4] + ",";
            }
            class88.method775(var6, var3, true);
            class344.method2408((byte) 116);
            return true;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([BI)[B", line = 60)
    public static final byte[] method1762(byte[] arg0, int arg1) {
        if (arg1 != -5265) {
            method1765(true, 54, 10, 6, 21, -9, 68, 77);
        }
        field4068++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class345.method2417(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 76)
    public class253() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILpi;)V", line = 80)
    public final void method185(int arg0, int arg1, class336 arg2) {
        field4065++;
        if (arg1 != -17848) {
            this.method185(-91, 16, (class336) null);
        }
        if (arg0 == 0) {
            this.field4072 = arg2.method2339((byte) -46);
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)Lm;", line = 114)
    public static final class56 method1763(int arg0, int arg1) {
        field4066++;
        class56 var2 = (class56) class161.field2862.method467(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class97.field1529.method441(false, arg0, arg1);
        class56 var4 = new class56();
        if (var3 != null) {
            var4.method502((byte) -65, new class336(var3), arg1);
        }
        class161.field2862.method465(var4, (long) arg1, (byte) 33);
        return var4;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lpi;I)V", line = 141)
    public static final void method1764(class336 arg0, int arg1) {
        if (arg1 != -22814) {
            return;
        }
        while (true) {
            while (arg0.field5353 < arg0.field5342.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method2364(-9069) == 1) {
                    var3 = arg0.method2364(-9069);
                    var4 = arg0.method2364(arg1 ^ 0x7A71);
                    var2 = true;
                }
                int var5 = arg0.method2364(-9069);
                int var6 = arg0.method2364(-9069);
                int var7 = var5 * 64 - class341.field5444;
                int var8 = class304.field4825 + class259.field4201 - (var6 * 64) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && class113.field1893 > (var7 + 63) && var8 < class304.field4825) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var3 * 8) && var11 < (var3 * 8 + 8) && (var4 * 8) <= var12 && (var4 * 8 + 8) > var12) {
                                int var13 = arg0.method2364(-9069);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method2364(-9069);
                                        if (class40.field602[var9][var10] == null) {
                                            class40.field602[var9][var10] = new byte[4096];
                                        }
                                        class40.field602[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method2317(21803);
                                        if (class290.field4636[var9][var10] == null) {
                                            class290.field4636[var9][var10] = new int[4096];
                                        }
                                        class290.field4636[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method2317(21803);
                                        if (class37.field535[var9][var10] == null) {
                                            class37.field535[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class97 var17 = class92.method798((byte) 104, var16);
                                        if (var17.field1579 != null) {
                                            var17 = var17.method833(false);
                                            if (var17 == null || var17.field1568 == -1) {
                                                continue;
                                            }
                                        }
                                        class37.field535[var9][var10][(63 - var12 << 6) + var11] = var17.field1522 + 1;
                                        class41 var18 = new class41();
                                        var18.field607 = var17.field1568;
                                        var18.field613 = var7;
                                        var18.field609 = var8;
                                        class185.field3138.method2303((byte) -124, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method2364(-9069);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field5353++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field5353 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field5353 += 3;
                            }
                        }
                    }
                }
            }
            field4062++;
            return;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)[I", line = 295)
    public final int[] method111(int arg0, int arg1) {
        if (arg0 != 4) {
            this.method185(-1, 18, (class336) null);
        }
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            int var4 = class1.field6[arg1];
            for (int var5 = 0; var5 < class133.field2269; var5++) {
                int var6 = class8.field104[var5];
                if (this.field4072 < var6 && var6 < (4096 - this.field4072) && 2048 - this.field4072 < var4 && var4 < this.field4072 + 2048) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field4072);
                    var3[var5] = 4096 - var10;
                } else if ((2048 - this.field4072) < var6 && var6 < (this.field4072 + 2048)) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field4072;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field4072);
                } else if (this.field4072 > var4 || var4 > 4096 - this.field4072) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field4072;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field4072);
                } else if (var6 >= this.field4072 && var6 <= 4096 - this.field4072) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field4072);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        field4070++;
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZIIIIIII)V", line = 372)
    public static final void method1765(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4064++;
        if (!arg0) {
            method1763(-24, 16);
        }
        if (arg2 == arg5) {
            class78.method720(arg2, arg3, arg6, arg1, arg7, true, arg4);
        } else if ((arg1 - arg2) >= class170.field2944 && arg1 + arg2 <= class310.field4916 && class90.field1428 <= (arg4 - arg5) && (arg4 + arg5) <= class135.field2358) {
            class97.method838(arg4, arg3, arg1, arg6, 127, arg5, arg2, arg7);
        } else {
            class202.method1519((byte) 34, arg3, arg7, arg1, arg5, arg6, arg4, arg2);
        }
    }
}
