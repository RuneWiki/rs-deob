import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class97 extends class33 {

    @OriginalMember(owner = "client!fq", name = "y", descriptor = "Lpu;")
    public class411 field1613 = new class411();

    @OriginalMember(owner = "client!fq", name = "G", descriptor = "Ljo;")
    public class258 field1621 = new class258();

    @OriginalMember(owner = "client!fq", name = "C", descriptor = "Ltd;")
    private class374 field1617;

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
    public static int field1607 = -1;

    @OriginalMember(owner = "client!fq", name = "E", descriptor = "[F")
    public static float[] field1619;

    @OriginalMember(owner = "client!fq", name = "t", descriptor = "B")
    public static byte field1608;

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!fq", name = "u", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!fq", name = "v", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!fq", name = "w", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!fq", name = "x", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!fq", name = "z", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!fq", name = "A", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!fq", name = "B", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!fq", name = "D", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!fq", name = "F", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!fq", name = "H", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!fq", name = "I", descriptor = "I")
    public static int field1623;

    static {
        new class306("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field1619 = new float[4];
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILbl;BI)V", line = 3)
    public static final void method671(int arg0, class265 arg1, byte arg2, int arg3) {
        if (arg2 < 39) {
            return;
        }
        field1623++;
        if (arg1.field3136 == arg3 && arg3 != -1) {
            class145 var4 = class130.field2232.method634(-1271654143, arg3);
            int var5 = var4.field2367;
            if (var5 == 1) {
                arg1.field3093 = 1;
                arg1.field3083 = 0;
                arg1.field3067 = 0;
                arg1.field3098 = arg0;
                arg1.field3125 = 0;
                class172.method1167(arg1.field4714, arg1.field3125, arg1.field4720, arg1.field4716, false, var4, (byte) 82);
            }
            if (var5 == 2) {
                arg1.field3067 = 0;
                return;
            }
        } else if (arg3 == -1 || arg1.field3136 == -1 || class130.field2232.method634(-1271654143, arg3).field2371 >= class130.field2232.method634(-1271654143, arg1.field3136).field2371) {
            arg1.field3067 = 0;
            arg1.field3136 = arg3;
            arg1.field3083 = 0;
            arg1.field3098 = arg0;
            arg1.field3093 = 1;
            arg1.field3154 = arg1.field3153;
            arg1.field3125 = 0;
            if (arg1.field3136 == -1) {
                return;
            }
            class172.method1167(arg1.field4714, arg1.field3125, arg1.field4720, arg1.field4716, false, class130.field2232.method634(-1271654143, arg1.field3136), (byte) 26);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IILbv;)V", line = 60)
    private final void method672(int arg0, int arg1, class285 arg2) {
        if ((this.field1617.field5796[arg2.field4668] & 0x4) != 0 && arg2.field4670 < 0) {
            int var4 = this.field1617.field5795[arg2.field4668] / class12.field141;
            int var5 = (var4 + 1048575 - arg2.field4678) / var4;
            arg2.field4678 = arg0 * var4 + arg2.field4678 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field1617.field5802[arg2.field4668] == 0) {
                    arg2.field4672 = class341.method2194(arg2.field4679, arg2.field4672.method2161(), arg2.field4672.method2160(), arg2.field4672.method2195());
                } else {
                    arg2.field4672 = class341.method2194(arg2.field4679, arg2.field4672.method2161(), 0, arg2.field4672.method2195());
                    this.field1617.method2365((byte) -42, arg2.field4661.field4957[arg2.field4664] < 0, arg2);
                }
                if (arg2.field4661.field4957[arg2.field4664] < 0) {
                    arg2.field4672.method2177(-1);
                }
                arg0 = arg2.field4678 / var4;
            }
        }
        field1612++;
        arg2.field4672.method251(arg0);
        if (arg1 >= -16) {
            field1619 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "()Loa;", line = 102)
    public final class33 method256() {
        field1610++;
        class285 var1 = (class285) this.field1613.method2538(-3);
        if (var1 == null) {
            return null;
        } else if (var1.field4672 == null) {
            return this.method254();
        } else {
            return var1.field4672;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILjava/lang/String;)I", line = 118)
    public static final int method673(int arg0, String arg1) {
        if (arg0 <= 20) {
            return 65;
        }
        field1616++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg1.charAt(var4) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "()I", line = 140)
    public final int method257() {
        field1609++;
        return 0;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V", line = 152)
    public final void method251(int arg0) {
        field1611++;
        this.field1621.method251(arg0);
        for (class285 var2 = (class285) this.field1613.method2538(-3); var2 != null; var2 = (class285) this.field1613.method2535((byte) -127)) {
            if (!this.field1617.method2383(false, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field4667) {
                        this.method672(var3, -122, var2);
                        var2.field4667 -= var3;
                        break;
                    }
                    this.method672(var2.field4667, -114, var2);
                    var3 -= var2.field4667;
                } while (!this.field1617.method2369(0, var2, 30979, null, var3));
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)V", line = 185)
    public static void method674(byte arg0) {
        if (arg0 >= 79) {
            field1619 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILqs;ZIIII)V", line = 195)
    public static final void method675(int arg0, class496 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 0) {
            method675(18, null, true, -27, -74, -109, -101);
        }
        class321.field5055 = arg2;
        class104.field1743 = arg6;
        class264.field4416 = arg4;
        class505.field7357 = arg1;
        field1620++;
        class375.field5837 = arg5;
        class432.field6464 = 1;
        class257.field4335 = class509.field7398.method2373(-1) / arg0;
        if (class257.field4335 < 1) {
            class257.field4335 = 1;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "([FIIIIII)V", line = 221)
    public static final void method676(float[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1614++;
        if (arg5 > 0 && !class137.method1029(arg5, false)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class137.method1029(arg2, false)) {
            if (arg4 != 4) {
                method676(null, -21, 86, 11, 106, -22, 69);
            }
            int var7 = class214.method1412(arg6, 118);
            int var8 = 0;
            int var9 = arg5 >= arg2 ? arg2 : arg5;
            int var10 = arg5 >> 1;
            int var11 = arg2 >> 1;
            float[] var12 = arg0;
            float[] var13 = new float[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Df(arg3, var8, arg1, arg5, arg2, 0, arg6, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg5 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                arg2 = var11;
                arg5 = var10;
                var12 = var16;
                var10 >>= 0x1;
                var8++;
                var11 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "()Loa;", line = 322)
    public final class33 method254() {
        field1606++;
        class285 var1;
        do {
            var1 = (class285) this.field1613.method2535((byte) -73);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4672 == null);
        return var1.field4672;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "([III)V", line = 349)
    public final void method252(int[] arg0, int arg1, int arg2) {
        field1615++;
        this.field1621.method252(arg0, arg1, arg2);
        for (class285 var4 = (class285) this.field1613.method2538(-3); var4 != null; var4 = (class285) this.field1613.method2535((byte) -63)) {
            if (!this.field1617.method2383(false, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field4667) {
                        this.method677(var6, arg0, var4, var5 + var6, 0, var5);
                        var4.field4667 -= var5;
                        break;
                    }
                    this.method677(var6, arg0, var4, var5 + var6, 0, var4.field4667);
                    var6 += var4.field4667;
                    var5 -= var4.field4667;
                } while (!this.field1617.method2369(var6, var4, 30979, arg0, var5));
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[ILbv;III)V", line = 389)
    private final void method677(int arg0, int[] arg1, class285 arg2, int arg3, int arg4, int arg5) {
        field1622++;
        if (arg4 != 0) {
            method675(54, null, false, -124, 29, -97, -63);
        }
        if ((this.field1617.field5796[arg2.field4668] & 0x4) != 0 && arg2.field4670 < 0) {
            int var7 = this.field1617.field5795[arg2.field4668] / class12.field141;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field4678) / var7;
                if (var8 > arg5) {
                    arg2.field4678 += arg5 * var7;
                    break;
                }
                arg2.field4672.method252(arg1, arg0, var8);
                arg5 -= var8;
                arg0 += var8;
                arg2.field4678 += var7 * var8 - 1048576;
                int var9 = class12.field141 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class341 var11 = arg2.field4672;
                if (this.field1617.field5802[arg2.field4668] == 0) {
                    arg2.field4672 = class341.method2194(arg2.field4679, var11.method2161(), var11.method2160(), var11.method2195());
                } else {
                    arg2.field4672 = class341.method2194(arg2.field4679, var11.method2161(), 0, var11.method2195());
                    this.field1617.method2365((byte) -42, arg2.field4661.field4957[arg2.field4664] < 0, arg2);
                    arg2.field4672.method2176(var9, var11.method2160());
                }
                if (arg2.field4661.field4957[arg2.field4664] < 0) {
                    arg2.field4672.method2177(-1);
                }
                var11.method2159(var9);
                var11.method252(arg1, arg0, arg3 - arg0);
                if (var11.method2158()) {
                    this.field1621.method1740(var11);
                }
            }
        }
        arg2.field4672.method252(arg1, arg0, arg5);
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Ltd;)V", line = 463)
    public class97(class374 arg0) {
        this.field1617 = arg0;
    }
}
