import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class111 {

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "Lna;")
    private class29 field1664 = new class29();

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "Lnb;")
    private class330 field1670 = new class330();

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    private int field1666;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    private int field1669;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "Lol;")
    private class246 field1667;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "[Lah;")
    public static class220[] field1657;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 4)
    public final void method765(boolean arg0) {
        this.field1670.method2281(117);
        field1662++;
        this.field1667.method1745(-77);
        this.field1664 = new class29();
        if (!arg0) {
            this.field1669 = this.field1666;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 27)
    public static final void method766(int arg0) {
        field1659++;
        if (class169.field2709 == 0) {
            return;
        }
        if (arg0 != -3817) {
            method766(12);
        }
        try {
            if (++class253.field4022 > 1500) {
                if (class69.field901 != null) {
                    class69.field901.method2095(arg0 + 12554);
                    class69.field901 = null;
                }
                if (class80.field1225 >= 1) {
                    class80.field1205 = -5;
                    class169.field2709 = 0;
                    return;
                }
                class253.field4022 = 0;
                class169.field2709 = 1;
                if (class326.field5089 == class124.field1858) {
                    class326.field5089 = class329.field5119;
                } else {
                    class326.field5089 = class124.field1858;
                }
                class80.field1225++;
            }
            if (class169.field2709 == 1) {
                class142.field2128 = class264.field4183.method41(class326.field5089, class214.field3472, arg0 ^ 0xEE8);
                class169.field2709 = 2;
            }
            if (class169.field2709 == 2) {
                if (class142.field2128.field3488 == 2) {
                    throw new IOException();
                }
                if (class142.field2128.field3488 != 1) {
                    return;
                }
                class69.field901 = new class300((Socket) class142.field2128.field3490, class264.field4183);
                class142.field2128 = null;
                class69.field901.method2101(class21.field313.field3128, (byte) 18, 0, class21.field313.field3129);
                if (class154.field2355 != null) {
                    class154.field2355.method656((byte) 10);
                }
                if (class296.field4640 != null) {
                    class296.field4640.method656((byte) 10);
                }
                int var1 = class69.field901.method2099(arg0 + 3817);
                if (class154.field2355 != null) {
                    class154.field2355.method656((byte) 10);
                }
                if (class296.field4640 != null) {
                    class296.field4640.method656((byte) 10);
                }
                if (var1 != 101) {
                    class169.field2709 = 0;
                    class80.field1205 = var1;
                    class69.field901.method2095(arg0 ^ 0xFFFFD336);
                    class69.field901 = null;
                    return;
                }
                class169.field2709 = 3;
            }
            if (class169.field2709 == 3) {
                if (class69.field901.method2100(0) < 2) {
                    return;
                }
                int var2 = class69.field901.method2099(0) << 8 | class69.field901.method2099(0);
                class196.method1438(var2, (byte) -108);
                if (class94.field1452 != -1) {
                    class169.field2709 = 0;
                    class69.field901.method2095(arg0 + 12554);
                    class69.field901 = null;
                    class227.method1656(117);
                    return;
                }
                class169.field2709 = 0;
                class80.field1205 = 6;
                class69.field901.method2095(8737);
                class69.field901 = null;
                return;
            }
        } catch (IOException var4) {
            if (class69.field901 != null) {
                class69.field901.method2095(8737);
                class69.field901 = null;
            }
            if (class80.field1225 < 1) {
                if (class326.field5089 == class124.field1858) {
                    class326.field5089 = class329.field5119;
                } else {
                    class326.field5089 = class124.field1858;
                }
                class80.field1225++;
                class253.field4022 = 0;
                class169.field2709 = 1;
            } else {
                class80.field1205 = -4;
                class169.field2709 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)Lhl;", line = 173)
    public final class71 method767(int arg0) {
        if (arg0 != -2405) {
            this.method765(false);
        }
        field1655++;
        return this.field1667.method1749((byte) -35);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(JZ)Lna;", line = 184)
    public final class29 method768(long arg0, boolean arg1) {
        field1661++;
        class29 var4 = (class29) this.field1667.method1743(arg0, (byte) 6);
        if (arg1) {
            this.field1666 = 4;
        }
        if (var4 != null) {
            this.field1670.method2279(var4, (byte) -113);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)Lhl;", line = 207)
    public final class71 method769(int arg0) {
        if (arg0 != 32292) {
            method766(23);
        }
        field1668++;
        return this.field1667.method1746((byte) -33);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lna;IJ)V", line = 227)
    public final void method770(class29 arg0, int arg1, long arg2) {
        field1654++;
        if (this.field1669 == arg1) {
            class29 var5 = this.field1670.method2283(arg1 ^ 0x21);
            var5.method465((byte) -122);
            var5.method189(0);
            if (this.field1664 == var5) {
                class29 var6 = this.field1670.method2283(33);
                var6.method465((byte) -122);
                var6.method189(0);
            }
        } else {
            this.field1669--;
        }
        this.field1667.method1750(arg0, (byte) 124, arg2);
        this.field1670.method2279(arg0, (byte) -121);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)I", line = 254)
    public static final int method771(byte arg0, int arg1) {
        if (arg0 >= -84) {
            field1657 = (class220[]) null;
        }
        field1665++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BIII)V", line = 271)
    public static final void method772(byte arg0, int arg1, int arg2, int arg3) {
        field1656++;
        class179 var4 = class319.method2220(arg1, (byte) -123, 11);
        var4.method1242((byte) -103);
        var4.field2889 = arg2;
        if (arg0 <= 13) {
            field1657 = (class220[]) null;
        }
        var4.field2897 = arg3;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIII[BZI[Lde;III)V", line = 287)
    public static final void method773(int arg0, int arg1, int arg2, int arg3, byte[] arg4, boolean arg5, int arg6, class68[] arg7, int arg8, int arg9, int arg10) {
        class192 var11 = new class192(arg4);
        field1658++;
        int var12 = -1;
        if (arg6 != 1920880130) {
            field1657 = (class220[]) null;
        }
        while (true) {
            int var13 = var11.method1391(32767);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1362(125);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = (var14 & 0xFCF) >> 6;
                int var18 = var14 >> 12;
                int var19 = var11.method1399(-1172389784);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg8 == var18 && var17 >= arg10 && (arg10 + 8) > var17 && arg0 <= var16 && (arg0 + 8) > var16) {
                    class149 var22 = class291.method2043(var12, 23006);
                    int var23 = arg3 + class26.method183(var22.field2278, -2, var22.field2253, var17 & 0x7, arg1, var20, var16 & 0x7);
                    int var24 = class55.method390(var22.field2253, var16 & 0x7, var17 & 0x7, var22.field2278, arg1, var20, (byte) -69) + arg2;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class68 var25 = null;
                        if (!arg5) {
                            int var26 = arg9;
                            if ((class81.field1229[1][var23][var24] & 0x2) == 2) {
                                var26 = arg9 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg7[var26];
                            }
                        }
                        class49.method341(arg6 ^ 0x8D81B1FD, arg9, arg9, var25, var20 + arg1 & 0x3, var23, !arg5, arg5, var21, var12, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(I)V", line = 410)
    public class111(int arg0) {
        this.field1666 = arg0;
        this.field1669 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field1667 = new class246(var2);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lkb;Lkb;Ldf;ILkb;)Z", line = 376)
    public static final boolean method774(class39 arg0, class39 arg1, class175 arg2, int arg3, class39 arg4) {
        class188.field3056 = arg2;
        field1660++;
        class91.field1384 = arg4;
        class182.field2934 = arg1;
        if (arg3 > -105) {
            field1657 = (class220[]) null;
        }
        class115.field1732 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V", line = 395)
    public static void method775(byte arg0) {
        if (arg0 <= 28) {
            method771((byte) -111, -3);
        }
        field1657 = null;
    }
}
