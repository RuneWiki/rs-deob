import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class277 extends class93 {

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    private int field4843 = 0;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "Lof;")
    private class242 field4854 = new class242(16);

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
    private int field4868 = 0;

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "Laj;")
    private class1 field4869 = new class1();

    @OriginalMember(owner = "client!bh", name = "ab", descriptor = "J")
    private long field4874 = 0L;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "Li;")
    private class218 field4848;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    private int field4857;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "Z")
    private boolean field4864;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "Laj;")
    private class1 field4865;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "Ldn;")
    private class232 field4837;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "Li;")
    private class218 field4855;

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "Z")
    private boolean field4873;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    private int field4860;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "Lcf;")
    private class131 field4835;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    private int field4846;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "Lqk;")
    private class62 field4841;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "Laj;")
    public static class1 field4856 = new class1();

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "Lsf;")
    private static class108 field4867 = class140.method973(255, " from your friend list first)3");

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "Lsf;")
    public static class108 field4871 = field4867;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "F")
    public static float field4862;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "Lml;")
    private class134 field4845;

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "Z")
    private boolean field4872;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "[B")
    private byte[] field4850;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)Lml;", line = 10)
    public final class134 method632(int arg0) {
        field4853++;
        if (this.field4845 != null) {
            return this.field4845;
        }
        if (this.field4841 == null) {
            if (this.field4837.method1617(false)) {
                return null;
            }
            this.field4841 = this.field4837.method1620(true, 0, this.field4857, 255, (byte) 0);
        }
        if (this.field4841.field986) {
            return null;
        }
        byte[] var2 = this.field4841.method433(125);
        if (this.field4841 instanceof class237) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4845 = new class134(var2, this.field4860);
                if (this.field4845.field2321 != this.field4846) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field4845 = null;
                if (this.field4837.method1617(false)) {
                    this.field4841 = null;
                } else {
                    this.field4841 = this.field4837.method1620(true, 0, this.field4857, 255, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4845 = new class134(var2, this.field4860);
            } catch (RuntimeException var6) {
                this.field4837.method1609((byte) 8);
                this.field4845 = null;
                if (this.field4837.method1617(false)) {
                    this.field4841 = null;
                } else {
                    this.field4841 = this.field4837.method1620(true, 0, this.field4857, 255, (byte) 0);
                }
                return null;
            }
            if (this.field4855 != null) {
                this.field4835.method902(this.field4855, var2, 2, this.field4857);
            }
        }
        if (this.field4848 != null) {
            this.field4843 = 0;
            this.field4850 = new byte[this.field4845.field2306];
        }
        if (arg0 != 28652) {
            this.field4864 = false;
        }
        this.field4841 = null;
        return this.field4845;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)I", line = 109)
    public final int method1994(int arg0) {
        field4844++;
        if (this.field4845 == null) {
            return 0;
        } else if (this.field4864) {
            if (arg0 >= -27) {
                this.method2002((byte) -36);
            }
            class184 var2 = this.field4865.method13(0);
            return var2 == null ? 0 : (int) var2.field3375;
        } else {
            return this.field4845.field2316;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lqd;B)I", line = 135)
    public static final int method1995(class45 arg0, byte arg1) {
        class136 var2 = arg0.field646;
        field4839++;
        if (var2.field2396 != null) {
            var2 = var2.method938((byte) -35);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2359;
        if (arg0.field4472 == arg0.field4455) {
            var3 = var2.field2393;
        } else if (arg0.field4483 == arg0.field4472) {
            var3 = var2.field2354;
        }
        if (arg1 != -122) {
            method2006(-35, 119);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)[B", line = 172)
    public final byte[] method627(byte arg0, int arg1) {
        field4861++;
        int var3 = -89 % ((arg0 + 31) / 56);
        class62 var4 = this.method2005(arg1, 0, 0);
        if (var4 == null) {
            return null;
        } else {
            byte[] var5 = var4.method433(121);
            var4.method1325(0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIII)Z", line = 191)
    public static final boolean method1996(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class168.field3023[arg0][var8][var9] == -class60.field960) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class278.field4883[arg0][arg1][arg3] + arg5;
            if (!class176.method1246(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class176.method1246(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class176.method1246(var10, var12, var14)) {
                return false;
            } else if (class176.method1246(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class84.method576(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class176.method1246(var6 + 1, class278.field4883[arg0][arg1][arg3] + arg5, var7 + 1) && class176.method1246(var6 + 128 - 1, class278.field4883[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class176.method1246(var6 + 128 - 1, class278.field4883[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class176.method1246(var6 + 1, class278.field4883[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V", line = 251)
    public static void method1997(int arg0) {
        field4856 = null;
        field4871 = null;
        if (arg0 > 93) {
            field4867 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(ILi;Li;Ldn;Lcf;IIZ)V", line = 917)
    public class277(int arg0, class218 arg1, class218 arg2, class232 arg3, class131 arg4, int arg5, int arg6, boolean arg7) {
        this.field4848 = arg1;
        this.field4857 = arg0;
        if (this.field4848 == null) {
            this.field4864 = false;
        } else {
            this.field4864 = true;
            this.field4865 = new class1();
        }
        this.field4837 = arg3;
        this.field4855 = arg2;
        this.field4873 = arg7;
        this.field4860 = arg5;
        this.field4835 = arg4;
        this.field4846 = arg6;
        if (this.field4855 != null) {
            this.field4841 = this.field4835.method904(this.field4855, this.field4857, 3);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)I", line = 281)
    public final int method1998(byte arg0) {
        if (arg0 < 29) {
            this.method632(4);
        }
        field4833++;
        return this.field4845 == null ? 0 : this.field4845.field2316;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V", line = 295)
    public final void method1999(byte arg0) {
        field4866++;
        if (arg0 != -59) {
            method1997(97);
        }
        if (this.field4848 != null) {
            this.field4872 = true;
            if (this.field4865 == null) {
                this.field4865 = new class1();
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)I", line = 319)
    public final int method2000(int arg0) {
        if (arg0 != -4285) {
            this.method631((byte) 46, 110);
        }
        field4838++;
        return this.field4843;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(BI)I", line = 337)
    public final int method631(byte arg0, int arg1) {
        if (arg0 != -46) {
            this.method2002((byte) 42);
        }
        field4836++;
        class62 var3 = (class62) this.field4854.method1676((long) arg1, (byte) -67);
        return var3 == null ? 0 : var3.method427(-103);
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)V", line = 353)
    public final void method2001(byte arg0) {
        field4847++;
        if (this.field4865 == null || this.method632(28652) == null) {
            return;
        }
        int var2 = 57 / ((arg0 + 52) / 52);
        for (class184 var3 = this.field4869.method13(0); var3 != null; var3 = this.field4869.method15((byte) 47)) {
            int var4 = (int) var3.field3375;
            if (var4 < 0 || var4 >= this.field4845.field2306 || this.field4845.field2305[var4] == 0) {
                var3.method1325(0);
            } else {
                if (this.field4850[var4] == 0) {
                    this.method2005(var4, 0, 1);
                }
                if (this.field4850[var4] == -1) {
                    this.method2005(var4, 0, 2);
                }
                if (this.field4850[var4] == 1) {
                    var3.method1325(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)I", line = 401)
    public final int method2002(byte arg0) {
        int var2 = -34 / ((arg0 + 44) / 48);
        field4858++;
        if (this.method632(28652) == null) {
            return this.field4841 == null ? 0 : this.field4841.method427(-107);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V", line = 421)
    public final void method2003(int arg0) {
        field4863++;
        if (this.field4865 != null) {
            if (this.method632(28652) == null) {
                return;
            }
            if (this.field4864) {
                boolean var2 = true;
                for (class184 var3 = this.field4865.method13(0); var3 != null; var3 = this.field4865.method15((byte) 47)) {
                    int var4 = (int) var3.field3375;
                    if (this.field4850[var4] == 0) {
                        this.method2005(var4, 0, 1);
                    }
                    if (this.field4850[var4] == 0) {
                        var2 = false;
                    } else {
                        var3.method1325(0);
                    }
                }
                while (this.field4845.field2305.length > this.field4868) {
                    if (this.field4845.field2305[this.field4868] == 0) {
                        this.field4868++;
                    } else {
                        if (this.field4835.field2246 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field4850[this.field4868] == 0) {
                            this.method2005(this.field4868, 0, 1);
                        }
                        if (this.field4850[this.field4868] == 0) {
                            var2 = false;
                            class184 var5 = new class184();
                            var5.field3375 = (long) this.field4868;
                            this.field4865.method5(var5, (byte) -111);
                        }
                        this.field4868++;
                    }
                }
                if (var2) {
                    this.field4864 = false;
                    this.field4868 = 0;
                }
            } else if (this.field4872) {
                boolean var6 = true;
                for (class184 var7 = this.field4865.method13(0); var7 != null; var7 = this.field4865.method15((byte) 47)) {
                    int var8 = (int) var7.field3375;
                    if (this.field4850[var8] != 1) {
                        this.method2005(var8, 0, 2);
                    }
                    if (this.field4850[var8] == 1) {
                        var7.method1325(0);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field4845.field2305.length > this.field4868) {
                    if (this.field4845.field2305[this.field4868] == 0) {
                        this.field4868++;
                    } else {
                        if (this.field4837.method1612((byte) -38)) {
                            var6 = false;
                            break;
                        }
                        if (this.field4850[this.field4868] != 1) {
                            this.method2005(this.field4868, 0, 2);
                        }
                        if (this.field4850[this.field4868] != 1) {
                            var6 = false;
                            class184 var9 = new class184();
                            var9.field3375 = (long) this.field4868;
                            this.field4865.method5(var9, (byte) 40);
                        }
                        this.field4868++;
                    }
                }
                if (var6) {
                    this.field4868 = 0;
                    this.field4872 = false;
                }
            } else {
                this.field4865 = null;
            }
        }
        if (this.field4873 && class118.method835(-1272) >= this.field4874) {
            for (class62 var10 = (class62) this.field4854.method1672(0); var10 != null; var10 = (class62) this.field4854.method1678(70)) {
                if (!var10.field986) {
                    if (var10.field988) {
                        if (!var10.field999) {
                            throw new RuntimeException();
                        }
                        var10.method1325(0);
                    } else {
                        var10.field988 = true;
                    }
                }
            }
            this.field4874 = class118.method835(-1272) + 1000L;
        }
        int var11 = -19 / ((arg0 + 31) / 51);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)I", line = 601)
    public static final int method2004(int arg0, byte arg1) {
        if (arg1 == -15) {
            field4859++;
            return arg0 >>> 7;
        } else {
            return -38;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)Lqk;", line = 614)
    private final class62 method2005(int arg0, int arg1, int arg2) {
        field4849++;
        class62 var4 = (class62) this.field4854.method1676((long) arg0, (byte) -70);
        if (arg1 != 0) {
            return (class62) null;
        }
        if (var4 != null && arg2 == 0 && !var4.field999 && var4.field986) {
            var4.method1325(arg1 ^ 0x0);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field4848 == null || this.field4850[arg0] == -1) {
                    if (this.field4837.method1617(false)) {
                        return null;
                    }
                    var4 = this.field4837.method1620(true, 0, arg0, this.field4857, (byte) 2);
                } else {
                    var4 = this.field4835.method904(this.field4848, arg0, 3);
                }
            } else if (arg2 == 1) {
                if (this.field4848 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4835.method900(this.field4848, arg0, 520);
            } else if (arg2 == 2) {
                if (this.field4848 == null) {
                    throw new RuntimeException();
                }
                if (this.field4850[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4837.method1612((byte) -38)) {
                    return null;
                }
                var4 = this.field4837.method1620(false, 0, arg0, this.field4857, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field4854.method1681(arg1 + 1, var4, (long) arg0);
        }
        if (var4.field986) {
            return null;
        }
        byte[] var5 = var4.method433(124);
        if (!var4 instanceof class237) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class233.field4126.reset();
                class233.field4126.update(var5, 0, var5.length - 2);
                int var10 = (int) class233.field4126.getValue();
                if (this.field4845.field2309[arg0] != var10) {
                    throw new RuntimeException();
                }
                this.field4837.field4119 = 0;
                this.field4837.field4118 = 0;
            } catch (RuntimeException var14) {
                this.field4837.method1609((byte) 8);
                var4.method1325(0);
                if (var4.field999 && !this.field4837.method1617(false)) {
                    class169 var12 = this.field4837.method1620(true, 0, arg0, this.field4857, (byte) 2);
                    this.field4854.method1681(1, var12, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4845.field2308[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field4845.field2308[arg0];
            if (this.field4848 != null) {
                this.field4835.method902(this.field4848, var5, arg1 ^ 0x2, arg0);
                if (this.field4850[arg0] != 1) {
                    this.field4843++;
                    this.field4850[arg0] = 1;
                }
            }
            if (!var4.field999) {
                var4.method1325(0);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class233.field4126.reset();
            class233.field4126.update(var5, 0, var5.length - 2);
            int var6 = (int) class233.field4126.getValue();
            if (this.field4845.field2309[arg0] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4845.field2308[arg0] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field4850[arg0] != 1) {
                if (this.field4850[arg0] != 0) {
                }
                this.field4843++;
                this.field4850[arg0] = 1;
            }
            if (!var4.field999) {
                var4.method1325(0);
            }
            return var4;
        } catch (Exception var13) {
            this.field4850[arg0] = -1;
            var4.method1325(0);
            if (var4.field999 && !this.field4837.method1617(false)) {
                class169 var9 = this.field4837.method1620(true, 0, arg0, this.field4857, (byte) 2);
                this.field4854.method1681(1, var9, (long) arg0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V", line = 827)
    public final void method635(int arg0, int arg1) {
        field4852++;
        if (this.field4848 == null) {
            return;
        }
        if (arg1 != -7274) {
            this.method2005(-50, -27, -88);
        }
        for (class184 var3 = this.field4869.method13(0); var3 != null; var3 = this.field4869.method15((byte) 47)) {
            if (((long) arg0) == var3.field3375) {
                return;
            }
        }
        class184 var4 = new class184();
        var4.field3375 = (long) arg0;
        this.field4869.method5(var4, (byte) 8);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)Lsf;", line = 857)
    public static final class108 method2006(int arg0, int arg1) {
        if (arg1 < 42) {
            return (class108) null;
        } else {
            field4851++;
            return class117.method833(new class108[] { class79.method518(false, arg0 >> 24 & 0xFF), class63.field1019, class79.method518(false, arg0 >> 16 & 0xFF), class63.field1019, class79.method518(false, arg0 >> 8 & 0xFF), class63.field1019, class79.method518(false, arg0 & 0xFF) }, false);
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)Z", line = 868)
    public static final boolean method2007(int arg0, int arg1) {
        field4842++;
        if (arg0 < arg1) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }
}
