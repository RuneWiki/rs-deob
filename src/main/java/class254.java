import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class254 extends class152 {

    @OriginalMember(owner = "client!rga", name = "x", descriptor = "I")
    public static int field2962 = 0;

    @OriginalMember(owner = "client!rga", name = "y", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!rga", name = "A", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!rga", name = "B", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!rga", name = "D", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!rga", name = "E", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!rga", name = "F", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!rga", name = "G", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!rga", name = "H", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!rga", name = "C", descriptor = "Ljava/lang/String;")
    public String field2967;

    @OriginalMember(owner = "client!rga", name = "v", descriptor = "[C")
    public char[] field2960;

    @OriginalMember(owner = "client!rga", name = "I", descriptor = "[C")
    public char[] field2973;

    @OriginalMember(owner = "client!rga", name = "w", descriptor = "[I")
    public int[] field2961;

    @OriginalMember(owner = "client!rga", name = "z", descriptor = "[I")
    public int[] field2964;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(CZ)I")
    public final int method1509(char arg0, boolean arg1) {
        field2968++;
        if (this.field2961 == null) {
            return -1;
        }
        if (arg1) {
            this.field2964 = null;
        }
        for (int var3 = 0; var3 < this.field2961.length; var3++) {
            if (this.field2973[var3] == arg0) {
                return this.field2961[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IC)I")
    public final int method1510(int arg0, char arg1) {
        field2970++;
        if (this.field2964 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2964.length; var3++) {
            if (this.field2960[var3] == arg1) {
                return this.field2964[var3];
            }
        }
        if (arg0 != -1) {
            method1511(null, -91, -109, null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lpt;IILha;)V")
    public static final void method1511(class557 arg0, int arg1, int arg2, class66 arg3) {
        field2963++;
        if (class709.field9948 != null && arg0.field7736 >= arg2) {
            for (int var4 = 0; var4 < class709.field9948.length; var4++) {
                if (class709.field9948[var4] != -1000000 && (arg0.field7746[0] <= class709.field9948[var4] || class709.field9948[var4] >= arg0.field7746[1] || arg0.field7746[2] <= class709.field9948[var4] || arg0.field7746[3] <= class709.field9948[var4]) && (class324.field4019[var4] >= arg0.field7744[0] || class324.field4019[var4] >= arg0.field7744[1] || arg0.field7744[2] <= class324.field4019[var4] || class324.field4019[var4] >= arg0.field7744[3]) && (class153.field1906[var4] <= arg0.field7744[0] || class153.field1906[var4] <= arg0.field7744[1] || arg0.field7744[2] >= class153.field1906[var4] || class153.field1906[var4] <= arg0.field7744[3]) && (class597.field8102[var4] >= arg0.field7741[0] || arg0.field7741[1] <= class597.field8102[var4] || class597.field8102[var4] >= arg0.field7741[2] || class597.field8102[var4] >= arg0.field7741[3]) && (arg0.field7741[0] >= class588.field8002[var4] || class588.field8002[var4] <= arg0.field7741[1] || arg0.field7741[2] >= class588.field8002[var4] || class588.field8002[var4] <= arg0.field7741[3])) {
                    return;
                }
            }
        }
        if (arg0.field7742 == 1) {
            int var5 = arg0.field7738 - (class463.field6493 - class573.field7852);
            if (var5 >= 0 && var5 <= class573.field7852 + class573.field7852) {
                int var6 = class573.field7852 + arg0.field7745 - class619.field8331;
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > class573.field7852 + class573.field7852) {
                    return;
                }
                int var7 = arg0.field7737 + class573.field7852 - class619.field8331;
                if (var7 > (class573.field7852 + class573.field7852)) {
                    var7 = class573.field7852 + class573.field7852;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var7 >= var6) {
                    if (class308.field3820[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class637.field8739 - arg0.field7744[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!(var9 < (float) class92.field1225) && class652.method3683(0, arg0, true) && class652.method3683(1, arg0, true) && class652.method3683(2, arg0, true) && class652.method3683(3, arg0, true)) {
                        class379.field4807[class222.field2583++] = arg0;
                    }
                }
            }
        } else if (arg1 > 31) {
            if (arg0.field7742 == 2) {
                int var10 = class573.field7852 + arg0.field7745 - class619.field8331;
                if (var10 >= 0 && class573.field7852 + class573.field7852 >= var10) {
                    int var11 = class573.field7852 + arg0.field7738 - class463.field6493;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if ((class573.field7852 + class573.field7852) < var11) {
                        return;
                    }
                    int var12 = class573.field7852 + arg0.field7740 - class463.field6493;
                    if (var12 > (class573.field7852 + class573.field7852)) {
                        var12 = class573.field7852 + class573.field7852;
                    } else if (var12 < 0) {
                        return;
                    }
                    boolean var13 = false;
                    while (var11 <= var12) {
                        if (class308.field3820[var11++][var10]) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        float var14 = (float) (class743.field10349 - arg0.field7741[0]);
                        if (var14 < 0.0F) {
                            var14 *= -1.0F;
                        }
                        if (!(var14 < (float) class92.field1225) && class652.method3683(0, arg0, true) && class652.method3683(1, arg0, true) && class652.method3683(2, arg0, true) && class652.method3683(3, arg0, true)) {
                            class379.field4807[class222.field2583++] = arg0;
                        }
                    }
                }
            } else if (arg0.field7742 == 16 || arg0.field7742 == 8) {
                int var23 = arg0.field7738 + class573.field7852 - class463.field6493;
                if (var23 >= 0 && (class573.field7852 + class573.field7852) >= var23) {
                    int var24 = class573.field7852 + arg0.field7745 - class619.field8331;
                    if (var24 >= 0 && var24 <= (class573.field7852 + class573.field7852) && class308.field3820[var23][var24]) {
                        float var25 = (float) (class637.field8739 - arg0.field7744[0]);
                        if (var25 < 0.0F) {
                            var25 *= -1.0F;
                        }
                        float var26 = (float) (class743.field10349 - arg0.field7741[0]);
                        if (var26 < 0.0F) {
                            var26 *= -1.0F;
                        }
                        if (!(var25 < (float) class92.field1225) || !((float) class92.field1225 > var26) && class652.method3683(0, arg0, true) && class652.method3683(1, arg0, true) && class652.method3683(2, arg0, true) && class652.method3683(3, arg0, true)) {
                            class379.field4807[class222.field2583++] = arg0;
                        }
                    }
                }
            } else if (arg0.field7742 == 4) {
                float var15 = (float) (arg0.field7746[0] - class325.field4024);
                if (!((float) class191.field2289 >= var15)) {
                    int var16 = arg0.field7745 + class573.field7852 - class619.field8331;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (class573.field7852 + class573.field7852 < var16) {
                        return;
                    }
                    int var17 = class573.field7852 + arg0.field7737 - class619.field8331;
                    if (var17 > class573.field7852 + class573.field7852) {
                        var17 = class573.field7852 + class573.field7852;
                    } else if (var17 < 0) {
                        return;
                    }
                    int var18 = arg0.field7738 + class573.field7852 - class463.field6493;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (class573.field7852 + class573.field7852 < var18) {
                        return;
                    }
                    int var19 = class573.field7852 + arg0.field7740 - class463.field6493;
                    if (var19 > class573.field7852 + class573.field7852) {
                        var19 = class573.field7852 + class573.field7852;
                    } else if (var19 < 0) {
                        return;
                    }
                    boolean var20 = false;
                    label294: for (int var21 = var18; var21 <= var19; var21++) {
                        for (int var22 = var16; var22 <= var17; var22++) {
                            if (class308.field3820[var21][var22]) {
                                var20 = true;
                                break label294;
                            }
                        }
                    }
                    if (var20 && class652.method3683(0, arg0, true) && class652.method3683(1, arg0, true) && class652.method3683(2, arg0, true) && class652.method3683(3, arg0, true)) {
                        class379.field4807[class222.field2583++] = arg0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(BLes;I)V")
    private final void method1512(byte arg0, class403 arg1, int arg2) {
        field2972++;
        if (arg0 < 41) {
            this.method1509('7', false);
        }
        if (arg2 == 1) {
            this.field2967 = arg1.method2384(-6435);
        } else if (arg2 == 2) {
            int var7 = arg1.method2396((byte) 50);
            this.field2973 = new char[var7];
            this.field2961 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2961[var8] = arg1.method2390((byte) -98);
                byte var9 = arg1.method2392(-2);
                this.field2973[var8] = var9 == 0 ? 0 : class625.method3550(var9, (byte) 117);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method2396((byte) -85);
            this.field2960 = new char[var4];
            this.field2964 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2964[var5] = arg1.method2390((byte) -121);
                byte var6 = arg1.method2392(-40);
                this.field2960[var5] = var6 == 0 ? 0 : class625.method3550(var6, (byte) 117);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)V")
    public static final void method1513(int arg0) {
        field2965++;
        if (class118.field1503.field10632.method3881(arg0) == 0 && class581.field7921 != class500.field7013) {
            class224.method1375(11, (byte) 67, false, class226.field2638, class518.field7310);
        } else {
            class667.method3744(-17733, class363.field4526);
            if (class581.field7921 != class33.field517) {
                class615.method3483((byte) -51);
            }
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Les;B)V")
    public final void method1514(class403 arg0, byte arg1) {
        field2969++;
        while (true) {
            int var3 = arg0.method2396((byte) -124);
            if (var3 == 0) {
                if (arg1 == 29) {
                    return;
                } else {
                    this.field2973 = null;
                    return;
                }
            }
            this.method1512((byte) 50, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(Z)V")
    public final void method1515(boolean arg0) {
        field2966++;
        if (this.field2964 != null) {
            for (int var2 = 0; var2 < this.field2964.length; var2++) {
                this.field2964[var2] = class5.method105(this.field2964[var2], 32768);
            }
        }
        if (this.field2961 != null) {
            for (int var3 = 0; var3 < this.field2961.length; var3++) {
                this.field2961[var3] = class5.method105(this.field2961[var3], 32768);
            }
        }
        if (!arg0) {
            this.field2973 = null;
        }
    }
}
