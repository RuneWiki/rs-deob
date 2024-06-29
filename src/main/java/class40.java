import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class40 {

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "Ljava/lang/String;")
    private String field741 = "null";

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "Ljk;")
    public static class585 field735 = new class585(7, 2);

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "I")
    public static int field752 = -1;

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "Lgfa;")
    public static class696 field753 = new class696(4, 1, 1, 1);

    @OriginalMember(owner = "client!bt", name = "w", descriptor = "F")
    public static float field755 = 1.0F;

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "C")
    public char field749;

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "C")
    public char field751;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    private int field739;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!bt", name = "v", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "Lwaa;")
    private class652 field736;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "Lwaa;")
    public class652 field738;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "[[I")
    public static int[][] field748;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method449(int arg0, int arg1) {
        field742++;
        if (arg1 >= -113) {
            return false;
        } else {
            return arg0 >= 12 && arg0 <= 17;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)Z", line = 15)
    public final boolean method450(int arg0, byte arg1) {
        field743++;
        if (this.field738 == null) {
            return false;
        }
        if (this.field736 == null) {
            this.method452((byte) 74);
        }
        if (arg1 <= 110) {
            this.method455(-30, -29);
        }
        class556 var3 = (class556) this.field736.method3678((long) arg0, -125);
        return var3 != null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lr;Lte;IB)V", line = 41)
    public static final void method451(class165 arg0, class568 arg1, int arg2, byte arg3) {
        if (arg3 <= 46) {
            return;
        }
        field746++;
        if (class160.field1952 != null && arg2 <= arg1.field8313) {
            for (int var4 = 0; var4 < class160.field1952.length; var4++) {
                if (class160.field1952[var4] != -1000000 && (arg1.field8303[0] <= class160.field1952[var4] || arg1.field8303[1] <= class160.field1952[var4] || class160.field1952[var4] >= arg1.field8303[2] || class160.field1952[var4] >= arg1.field8303[3]) && (class219.field2836[var4] >= arg1.field8306[0] || arg1.field8306[1] <= class219.field2836[var4] || class219.field2836[var4] >= arg1.field8306[2] || class219.field2836[var4] >= arg1.field8306[3]) && (arg1.field8306[0] >= class442.field6299[var4] || arg1.field8306[1] >= class442.field6299[var4] || class442.field6299[var4] <= arg1.field8306[2] || arg1.field8306[3] >= class442.field6299[var4]) && (class82.field1177[var4] >= arg1.field8310[0] || arg1.field8310[1] <= class82.field1177[var4] || arg1.field8310[2] <= class82.field1177[var4] || arg1.field8310[3] <= class82.field1177[var4]) && (class195.field2366[var4] <= arg1.field8310[0] || arg1.field8310[1] >= class195.field2366[var4] || class195.field2366[var4] <= arg1.field8310[2] || class195.field2366[var4] <= arg1.field8310[3])) {
                    return;
                }
            }
        }
        if (arg1.field8305 == 1) {
            int var5 = arg1.field8312 - (class591.field8564 - class119.field1526);
            if (var5 >= 0 && var5 <= (class119.field1526 + class119.field1526)) {
                int var6 = arg1.field8311 + class119.field1526 - class33.field663;
                if (var6 < 0) {
                    var6 = 0;
                } else if (class119.field1526 + class119.field1526 < var6) {
                    return;
                }
                int var7 = arg1.field8301 + class119.field1526 - class33.field663;
                if ((class119.field1526 + class119.field1526) < var7) {
                    var7 = class119.field1526 + class119.field1526;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var6 <= var7) {
                    if (class616.field8849[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class53.field856 - arg1.field8306[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!((float) class214.field2718 > var9) && class426.method2568(arg1, (byte) 71, 0) && class426.method2568(arg1, (byte) 90, 1) && class426.method2568(arg1, (byte) 113, 2) && class426.method2568(arg1, (byte) -113, 3)) {
                        class677.field9705[class78.field1141++] = arg1;
                    }
                }
            }
        } else if (arg1.field8305 == 2) {
            int var10 = class119.field1526 + arg1.field8311 - class33.field663;
            if (var10 >= 0 && (class119.field1526 + class119.field1526) >= var10) {
                int var11 = class119.field1526 + arg1.field8312 - class591.field8564;
                if (var11 < 0) {
                    var11 = 0;
                } else if ((class119.field1526 + class119.field1526) < var11) {
                    return;
                }
                int var12 = arg1.field8299 + class119.field1526 - class591.field8564;
                if (class119.field1526 + class119.field1526 < var12) {
                    var12 = class119.field1526 + class119.field1526;
                } else if (var12 < 0) {
                    return;
                }
                boolean var13 = false;
                while (var11 <= var12) {
                    if (class616.field8849[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (class206.field2469 - arg1.field8310[0]);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!((float) class214.field2718 > var14) && class426.method2568(arg1, (byte) -97, 0) && class426.method2568(arg1, (byte) 60, 1) && class426.method2568(arg1, (byte) -125, 2) && class426.method2568(arg1, (byte) 115, 3)) {
                        class677.field9705[class78.field1141++] = arg1;
                    }
                }
            }
        } else if (arg1.field8305 == 16 || arg1.field8305 == 8) {
            int var23 = arg1.field8312 + class119.field1526 - class591.field8564;
            if (var23 >= 0 && class119.field1526 + class119.field1526 >= var23) {
                int var24 = class119.field1526 + arg1.field8311 - class33.field663;
                if (var24 >= 0 && (class119.field1526 + class119.field1526) >= var24 && class616.field8849[var23][var24]) {
                    float var25 = (float) (class53.field856 - arg1.field8306[0]);
                    if (var25 < 0.0F) {
                        var25 *= -1.0F;
                    }
                    float var26 = (float) (class206.field2469 - arg1.field8310[0]);
                    if (var26 < 0.0F) {
                        var26 *= -1.0F;
                    }
                    if (!((float) class214.field2718 > var25) || !(var26 < (float) class214.field2718) && class426.method2568(arg1, (byte) -90, 0) && class426.method2568(arg1, (byte) -108, 1) && class426.method2568(arg1, (byte) -86, 2) && class426.method2568(arg1, (byte) -105, 3)) {
                        class677.field9705[class78.field1141++] = arg1;
                    }
                }
            }
        } else if (arg1.field8305 == 4) {
            float var15 = (float) (arg1.field8303[0] - class675.field9682);
            if (!(var15 <= (float) class692.field9848)) {
                int var16 = arg1.field8311 + class119.field1526 - class33.field663;
                if (var16 < 0) {
                    var16 = 0;
                } else if ((class119.field1526 + class119.field1526) < var16) {
                    return;
                }
                int var17 = class119.field1526 + arg1.field8301 - class33.field663;
                if (var17 > (class119.field1526 + class119.field1526)) {
                    var17 = class119.field1526 + class119.field1526;
                } else if (var17 < 0) {
                    return;
                }
                int var18 = arg1.field8312 + class119.field1526 - class591.field8564;
                if (var18 < 0) {
                    var18 = 0;
                } else if (var18 > (class119.field1526 + class119.field1526)) {
                    return;
                }
                int var19 = class119.field1526 + arg1.field8299 - class591.field8564;
                if (class119.field1526 + class119.field1526 < var19) {
                    var19 = class119.field1526 + class119.field1526;
                } else if (var19 < 0) {
                    return;
                }
                boolean var20 = false;
                label295: for (int var21 = var18; var21 <= var19; var21++) {
                    for (int var22 = var16; var22 <= var17; var22++) {
                        if (class616.field8849[var21][var22]) {
                            var20 = true;
                            break label295;
                        }
                    }
                }
                if (var20 && class426.method2568(arg1, (byte) 112, 0) && class426.method2568(arg1, (byte) -94, 1) && class426.method2568(arg1, (byte) 51, 2) && class426.method2568(arg1, (byte) -91, 3)) {
                    class677.field9705[class78.field1141++] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)V", line = 378)
    private final void method452(byte arg0) {
        this.field736 = new class652(this.field738.method3679(2));
        field737++;
        if (arg0 != 74) {
            this.method458(-119, null);
        }
        for (class556 var2 = (class556) this.field738.method3669((byte) 28); var2 != null; var2 = (class556) this.field738.method3676((byte) -12)) {
            class556 var3 = new class556((int) var2.field7519);
            this.field736.method3670((long) var2.field8043, var3, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)V", line = 400)
    public static void method453(byte arg0) {
        field748 = null;
        field753 = null;
        field735 = null;
        if (arg0 <= 9) {
            field735 = null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)Ljava/lang/String;", line = 412)
    public final String method454(int arg0, int arg1) {
        field734++;
        if (this.field738 == null) {
            return this.field741;
        } else if (arg0 == 0) {
            class374 var3 = (class374) this.field738.method3678((long) arg1, arg0 - 124);
            return var3 == null ? this.field741 : var3.field5035;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(II)I", line = 445)
    public final int method455(int arg0, int arg1) {
        field744++;
        if (this.field738 == null) {
            return this.field739;
        }
        if (arg1 > -36) {
            this.field741 = null;
        }
        class556 var3 = (class556) this.field738.method3678((long) arg0, -123);
        return var3 == null ? this.field739 : var3.field8043;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLuf;)I", line = 466)
    public static final int method456(byte arg0, class414 arg1) {
        field750++;
        if (arg0 < 89) {
            return -124;
        } else if (class519.field7612 == arg1) {
            return 5890;
        } else if (class366.field4928 == arg1) {
            return 34167;
        } else if (class141.field1760 == arg1) {
            return 34168;
        } else if (class308.field4083 == arg1) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V", line = 496)
    private final void method457(int arg0) {
        this.field736 = new class652(this.field738.method3679(arg0 + 3));
        field733++;
        if (arg0 != -1) {
            field748 = null;
        }
        for (class374 var2 = (class374) this.field738.method3669((byte) 28); var2 != null; var2 = (class374) this.field738.method3676((byte) -12)) {
            class215 var3 = new class215(var2.field5035, (int) var2.field7519);
            this.field736.method3670(class485.method2833(0, var2.field5035), var3, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILun;)V", line = 523)
    public final void method458(int arg0, class389 arg1) {
        while (true) {
            int var3 = arg1.method2229(255);
            if (var3 == 0) {
                if (arg0 != 13246) {
                    this.method460(22, null);
                }
                field754++;
                return;
            }
            this.method459(-12, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILun;)V", line = 544)
    private final void method459(int arg0, int arg1, class389 arg2) {
        field740++;
        int var4 = 112 / ((arg0 - 55) / 44);
        if (arg1 == 1) {
            this.field749 = class507.method3016((byte) -88, arg2.method2249((byte) -70));
        } else if (arg1 == 2) {
            this.field751 = class507.method3016((byte) -88, arg2.method2249((byte) -70));
        } else if (arg1 == 3) {
            this.field741 = arg2.method2244((byte) -67);
        } else if (arg1 == 4) {
            this.field739 = arg2.method2255(255);
        } else if (arg1 == 5 || arg1 == 6) {
            int var5 = arg2.method2260(-44);
            this.field738 = new class652(class698.method3915(var5, (byte) 93));
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg2.method2255(255);
                class513 var8;
                if (arg1 == 5) {
                    var8 = new class374(arg2.method2244((byte) -52));
                } else {
                    var8 = new class556(arg2.method2255(255));
                }
                this.field738.method3670((long) var7, var8, (byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 598)
    public final boolean method460(int arg0, String arg1) {
        field747++;
        if (this.field738 == null) {
            return false;
        }
        if (arg0 != 2) {
            method451(null, null, -4, (byte) 114);
        }
        if (this.field736 == null) {
            this.method457(-1);
        }
        for (class215 var3 = (class215) this.field736.method3678(class485.method2833(0, arg1), -125); var3 != null; var3 = (class215) this.field736.method3671((byte) 74)) {
            if (var3.field2736.equals(arg1)) {
                return true;
            }
        }
        return false;
    }
}
