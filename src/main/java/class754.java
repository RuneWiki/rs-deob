import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class754 extends class528 {

    @OriginalMember(owner = "client!tfa", name = "C", descriptor = "Ltf;")
    private class524 field10774 = new class524();

    @OriginalMember(owner = "client!tfa", name = "x", descriptor = "I")
    private int field10789 = 0;

    @OriginalMember(owner = "client!tfa", name = "n", descriptor = "I")
    private int field10794 = 256;

    @OriginalMember(owner = "client!tfa", name = "t", descriptor = "I")
    private int field10793 = 256;

    @OriginalMember(owner = "client!tfa", name = "w", descriptor = "I")
    private int field10777;

    @OriginalMember(owner = "client!tfa", name = "L", descriptor = "[Ljava/lang/String;")
    private static final String[] field10795 = new String[] { method5474(method5473("O/y]u\u0013")), method5474(method5473("O/y]kza")), method5474(method5473("O/y]\u007f\u0013")), method5474(method5473("O/y]q\u0013")), method5474(method5473("O/y]p\u0013")), method5474(method5473("O/y]x\u0013")), method5474(method5473("O/y]z\u0013")), method5474(method5473("O/y]nza")), method5474(method5473("U<t\u001f")), method5474(method5473("O/y]}\u0013")), method5474(method5473("@g6]D")), method5474(method5473("O/y]|\u0013")), method5474(method5473("O/y]jza")), method5474(method5473("O/y]\u0005R'q\u0007\u0007\u0013")), method5474(method5473("O/y]m\u0013")), method5474(method5473("O/y]{\u0013")), method5474(method5473("O/y]~\u0013")), method5474(method5473("O/y]s\u0013")), method5474(method5473("O/y]r\u0013")) };

    @OriginalMember(owner = "client!tfa", name = "v", descriptor = "I")
    public static int field10787 = -1;

    @OriginalMember(owner = "client!tfa", name = "m", descriptor = "[I")
    public static int[] field10771 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!tfa", name = "H", descriptor = "I")
    public static int field10770;

    @OriginalMember(owner = "client!tfa", name = "D", descriptor = "I")
    public static int field10772;

    @OriginalMember(owner = "client!tfa", name = "u", descriptor = "I")
    public static int field10773;

    @OriginalMember(owner = "client!tfa", name = "E", descriptor = "I")
    public static int field10775;

    @OriginalMember(owner = "client!tfa", name = "s", descriptor = "I")
    public static int field10776;

    @OriginalMember(owner = "client!tfa", name = "p", descriptor = "I")
    public static int field10778;

    @OriginalMember(owner = "client!tfa", name = "I", descriptor = "I")
    public static int field10779;

    @OriginalMember(owner = "client!tfa", name = "o", descriptor = "I")
    public static int field10780;

    @OriginalMember(owner = "client!tfa", name = "K", descriptor = "I")
    public static int field10781;

    @OriginalMember(owner = "client!tfa", name = "B", descriptor = "I")
    public static int field10782;

    @OriginalMember(owner = "client!tfa", name = "r", descriptor = "I")
    public static int field10783;

    @OriginalMember(owner = "client!tfa", name = "A", descriptor = "I")
    public static int field10784;

    @OriginalMember(owner = "client!tfa", name = "q", descriptor = "I")
    public static int field10785;

    @OriginalMember(owner = "client!tfa", name = "J", descriptor = "I")
    private int field10786;

    @OriginalMember(owner = "client!tfa", name = "z", descriptor = "I")
    public static int field10791;

    @OriginalMember(owner = "client!tfa", name = "F", descriptor = "I")
    public static int field10792;

    @OriginalMember(owner = "client!tfa", name = "y", descriptor = "Z")
    private boolean field10788;

    @OriginalMember(owner = "client!tfa", name = "G", descriptor = "Z")
    private boolean field10790;

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "(I)Lgt;", line = 5)
    private final synchronized class346 method5462(int arg0) {
        try {
            field10770++;
            if (arg0 < 28) {
                field10771 = null;
            }
            return (class346) this.field10774.method3977((byte) -73);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10795[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "([III)V", line = 18)
    public final synchronized void method927(int[] arg0, int arg1, int arg2) {
        try {
            field10773++;
            if (!this.field10788) {
                if (this.method5462(90) != null) {
                    int var4 = arg1 + arg2;
                    if (class375.field5471) {
                        var4 <<= 0x1;
                    }
                    byte var5 = 0;
                    byte var6 = 0;
                    if (this.field10777 == 2) {
                        var6 = 1;
                    }
                    while (arg1 < var4) {
                        class346 var7 = this.method5462(43);
                        if (var7 == null) {
                            return;
                        }
                        short[][] var8 = var7.field5035;
                        while (var4 > arg1 && var8[0].length > this.field10786) {
                            if (class375.field5471) {
                                arg0[arg1++] = var8[var5][this.field10786] * this.field10794;
                                arg0[arg1++] = var8[var6][this.field10786] * this.field10793;
                            } else {
                                int var10001 = arg1++;
                                arg0[var10001] += var8[var5][this.field10786] * this.field10794 + var8[var6][this.field10786] * this.field10793;
                            }
                            this.field10786++;
                        }
                        if (this.field10786 >= var8[0].length) {
                            this.method5472(29709);
                        }
                    }
                } else if (this.field10790) {
                    this.method4294(0);
                    class403.field5868.method2731(false);
                }
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field10795[14] + (arg0 == null ? field10795[8] : field10795[10]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "()Ljn;", line = 84)
    public final class528 method931() {
        try {
            field10782++;
            return null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10795[1] + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILgt;)V", line = 92)
    public final synchronized void method5463(int arg0, class346 arg1) {
        try {
            field10791++;
            if (arg0 > -33) {
                field10787 = -63;
            }
            while (this.field10789 >= 100) {
                this.field10774.method3980(-27119);
                this.field10789--;
            }
            this.field10774.method3984(arg1, 0);
            this.field10789++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10795[9] + arg0 + ',' + (arg1 == null ? field10795[8] : field10795[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "()I", line = 113)
    public final int method917() {
        try {
            field10778++;
            return 1;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10795[16] + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZB)V", line = 121)
    public final synchronized void method5464(boolean arg0, byte arg1) {
        try {
            field10779++;
            if (arg1 <= 0) {
                this.field10788 = arg0;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10795[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V", line = 132)
    public final synchronized void method937(int arg0) {
        try {
            field10785++;
            if (!this.field10788) {
                while (true) {
                    class346 var2 = this.method5462(82);
                    if (var2 == null) {
                        if (this.field10790) {
                            this.method4294(0);
                            class403.field5868.method2731(false);
                        }
                        return;
                    }
                    if ((var2.field5035[0].length - this.field10786) > arg0) {
                        this.field10786 += arg0;
                        return;
                    }
                    arg0 -= var2.field5035[0].length - this.field10786;
                    this.method5472(29709);
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10795[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(I)V", line = 178)
    public final synchronized void method5465(int arg0) {
        try {
            if (arg0 != 0) {
                this.field10788 = true;
            }
            this.field10790 = true;
            field10783++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10795[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(I)V", line = 342)
    public class754(int arg0) {
        try {
            this.field10777 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10795[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Z)V", line = 195)
    public static void method5466(boolean arg0) {
        try {
            field10771 = null;
            if (arg0) {
                field10771 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10795[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)V", line = 207)
    public final void method5467(int arg0, int arg1) {
        try {
            this.field10794 = arg0;
            field10775++;
            this.field10793 = arg0;
            if (arg1 != 0) {
                this.field10794 = 38;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10795[18] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(DBI)Lgt;", line = 219)
    public final class346 method5468(double arg0, byte arg1, int arg2) {
        try {
            field10780++;
            long var5 = (long) (arg2 | this.field10777 << 0);
            class346 var7 = (class346) class403.field5868.method2730(true, var5);
            if (var7 == null) {
                var7 = new class346(new short[this.field10777][arg2], arg0);
            } else {
                var7.field5036 = arg0;
                class403.field5868.method2732(false, var5);
            }
            if (arg1 < 119) {
                field10771 = null;
            }
            return var7;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field10795[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(III)Z", line = 244)
    public static final boolean method5469(int arg0, int arg1, int arg2) {
        try {
            field10781++;
            if (class151.method1284(arg0, (byte) -43, arg1)) {
                if (arg2 != 12529) {
                    field10771 = null;
                }
                return class462.method3551((byte) 85, arg0, arg1) | (arg0 & 0xB000) != 0 | class324.method2562(arg0, arg2 + 1036303, arg1) ? true : (arg1 & 0x37) == 0 & (class639.method4653(arg0, arg1, -4413) | class79.method789(arg0, 579, arg1));
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10795[17] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)I", line = 262)
    public final synchronized int method5470(int arg0) {
        try {
            if (arg0 >= -38) {
                this.method5463(-127, null);
            }
            field10792++;
            return this.field10789;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10795[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B)D", line = 278)
    public final synchronized double method5471(byte arg0) {
        try {
            if (arg0 != 17) {
                this.method917();
            }
            field10784++;
            if (this.field10789 < 1) {
                return -1.0D;
            } else {
                class346 var2 = (class346) this.field10774.method3977((byte) -55);
                return var2 == null ? -1.0D : (double) (-((float) var2.field5035[0].length / (float) class215.field3148)) + var2.field5036;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10795[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "()Ljn;", line = 297)
    public final class528 method919() {
        try {
            field10776++;
            return null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10795[7] + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "(I)V", line = 314)
    private final synchronized void method5472(int arg0) {
        try {
            field10772++;
            class346 var2 = this.method5462(49);
            if (var2 != null) {
                var2.method4294(0);
                if (arg0 != 29709) {
                    method5469(90, -9, -43);
                }
                this.field10789--;
                this.field10786 = 0;
                class403.field5868.method2734(var2.method2774(arg0 - 29709), -1, var2);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10795[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5473(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5474(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 24;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
