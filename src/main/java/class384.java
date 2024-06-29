import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class384 extends class153 {

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    private int field5855 = -32768;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
    private int field5848 = 0;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
    private int field5849 = 0;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
    private int field5851 = 0;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    private int field5857 = -1;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "Z")
    public boolean field5863 = false;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    private int field5841;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    public int field5860;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
    private int field5846;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "Ltq;")
    private class270 field5850;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "Lui;")
    public static class375 field5861 = new class375("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "[I")
    public static int[] field5867 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!ei", name = "W", descriptor = "Lcm;")
    public static class449 field5869 = new class449(19, 4);

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "I")
    public static int field5871 = 0;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "Lli;")
    private class134 field5856;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILqa;Lc;)V")
    private final void method2376(int arg0, class496 arg1, class201 arg2) {
        ++field5865;
        if (arg0 <= -10) {
            class525[] var4 = arg2.method296();
            class439[] var5 = arg2.method283();
            if ((this.field5856 == null || this.field5856.field1932) && (var4 != null || var5 != null)) {
                this.field5856 = new class134(class405.field6116);
            }
            if (this.field5856 != null) {
                this.field5856.method869(arg1, (long) class405.field6116, var4, var5, false);
                this.field5856.method862(super.field2210, super.field2208, super.field2214, super.field2216, super.field2213);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lqa;I)Lpj;")
    public final class507 method51(class496 arg0, int arg1) {
        ++field5859;
        class201 var3 = this.method2379((~this.field5849 == -1 ? 0 : 5) | 2048, this.field5846, arg0, arg1 ^ arg1);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field5849 != -1) {
                var3.method290(this.field5849 * 2048);
            }
            class23 var4 = arg0.method1088();
            var4.method185(super.field2217, super.field2222, super.field2215);
            if (this.field5856 == null) {
                var3.method318(var4, (class159) null, 0);
            } else {
                class258 var5 = this.field5856.method870();
                arg0.method1047(var3, var5, var4, (class159) null, 0);
            }
            this.field5855 = var3.method306();
            this.method2376(-96, arg0, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)I")
    public static final int method2377(int arg0) {
        ++field5845;
        try {
            if (class511.field7590 == 0) {
                if (~class57.field772 < ~(class264.method1698(true) + -5000L)) {
                    return 0;
                }
                class180.field2560 = class419.field6254.method2814(class354.field5497, class14.field239, 0);
                class267.field3719 = class264.method1698(true);
                class511.field7590 = 1;
            }
            if (~(class267.field3719 + 30000L) > ~class264.method1698(true)) {
                return class18.method140(1000, -60);
            } else {
                if (class511.field7590 == arg0) {
                    if (class180.field2560.field1791 == 2) {
                        return class18.method140(1001, -87);
                    }
                    if (class180.field2560.field1791 != 1) {
                        return -1;
                    }
                    class81.field1092 = new class501((Socket) class180.field2560.field1793, class419.field6254);
                    class180.field2560 = null;
                    int var1 = 0;
                    class75.field1006.field1292 = 0;
                    if (class164.field2394) {
                        var1 = class249.field3467;
                    }
                    class75.field1006.method625(class442.field6584.field2934, false);
                    class75.field1006.method615(28010, var1);
                    class81.field1092.method2999(class75.field1006.field1277, class75.field1006.field1292, 1, 0);
                    class273.method1740(true);
                    int var2 = class81.field1092.method3000((byte) 41);
                    class273.method1740(true);
                    if (~var2 != -1) {
                        return class18.method140(var2, -53);
                    }
                    class511.field7590 = 2;
                }
                if (~class511.field7590 == -3) {
                    if (class81.field1092.method2995((byte) 115) < 2) {
                        return -1;
                    }
                    class488.field7148 = class81.field1092.method3000((byte) -74);
                    class488.field7148 <<= 8;
                    class488.field7148 += class81.field1092.method3000((byte) -123);
                    class511.field7590 = 3;
                    class490.field7165 = 0;
                    class395.field6014 = new byte[class488.field7148];
                }
                if (~class511.field7590 == -4) {
                    int var3 = class81.field1092.method2995((byte) 111);
                    if (var3 < 1) {
                        return -1;
                    } else {
                        if (-class490.field7165 + class488.field7148 < var3) {
                            var3 = -class490.field7165 + class488.field7148;
                        }
                        class81.field1092.method2997(class395.field6014, var3, (byte) 98, class490.field7165);
                        class490.field7165 += var3;
                        if (~class488.field7148 < ~class490.field7165) {
                            return -1;
                        } else if (!class407.method2484(23075, class395.field6014)) {
                            return class18.method140(1002, -106);
                        } else {
                            class485.field7076 = new class349[class58.field781];
                            int var4 = 0;
                            for (int var5 = class198.field2799; class428.field6361 >= var5; ++var5) {
                                class349 var6 = class19.method147(-24048, var5);
                                if (var6 != null) {
                                    class485.field7076[var4++] = var6;
                                }
                            }
                            class346.field5420 = 0;
                            class403.field6109 = null;
                            class81.field1092.method2994(-1);
                            class227.field3261 = 0;
                            class81.field1092 = null;
                            class395.field6014 = null;
                            class511.field7590 = 0;
                            class57.field772 = class264.method1698(true);
                            return 0;
                        }
                    }
                } else {
                    return -1;
                }
            }
        } catch (IOException var7) {
            return class18.method140(1003, -73);
        }
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)I")
    public final int method779(byte arg0) {
        if (arg0 != 9) {
            return 106;
        } else {
            ++field5854;
            return this.field5855;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(IB)V")
    public final void method2378(int arg0, byte arg1) {
        ++field5864;
        if (!this.field5863) {
            if (arg1 > -78) {
                this.field5855 = 40;
            }
            this.field5851 += arg0;
            while (~this.field5851 < ~this.field5850.field3746[this.field5848]) {
                this.field5851 -= this.field5850.field3746[this.field5848];
                ++this.field5848;
                if (~this.field5850.field3765.length >= ~this.field5848) {
                    this.field5863 = true;
                    break;
                }
            }
            if (!this.field5863) {
                class445.method2678(false, this.field5848, super.field2210, this.field5850, super.field2217, (byte) 109, super.field2215);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILqa;I)Lc;")
    private final class201 method2379(int arg0, int arg1, class496 arg2, int arg3) {
        ++field5866;
        class372 var5 = class275.field3826.method108(arg1, arg3);
        class206 var6 = class204.field2871[super.field2210];
        class206 var7 = this.field5841 >= 3 ? null : class204.field2871[this.field5841 + 1];
        return !this.field5863 ? var5.method2324(class260.field3621, var7, super.field2217, super.field2215, arg0, this.field5857, super.field2222, var6, this.field5851, false, true, this.field5848, arg2) : var5.method2324(class260.field3621, var7, super.field2217, super.field2215, arg0, -1, super.field2222, var6, 0, false, true, -1, arg2);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
    public final void method2380(boolean arg0) {
        if (this.field5856 != null) {
            this.field5856.method872();
        }
        ++field5868;
        if (!arg0) {
            this.field5856 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lqv;BLqa;IZII)V")
    public final void method61(class49 arg0, byte arg1, class496 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field5858;
        if (arg1 == 118) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
    public static void method2381(int arg0) {
        field5869 = null;
        field5867 = null;
        if (arg0 == 0) {
            field5861 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field5841 = arg4;
        this.field5860 = arg1 + arg2;
        this.field5846 = arg0;
        this.field5849 = arg12;
        class372 var14 = class275.field3826.method108(this.field5846, 0);
        int var15 = var14.field5705;
        if (~var15 != 0) {
            this.field5850 = class260.field3621.method1934(116, var15);
            this.field5863 = false;
        } else {
            this.field5863 = true;
        }
        if (~this.field5860 == ~arg2) {
            class445.method2678(false, this.field5848, super.field2210, this.field5850, super.field2217, (byte) 25, super.field2215);
        }
    }

    @OriginalMember(owner = "client!ei", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field5856 != null) {
            this.field5856.method872();
        }
        ++field5844;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method56(int arg0, int arg1, int arg2, class496 arg3) {
        ++field5853;
        if (arg1 != 3) {
            this.field5856 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
    public final void method57(int arg0) {
        if (arg0 == -5077) {
            ++field5862;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(BLqa;)V")
    public final void method62(byte arg0, class496 arg1) {
        if (arg0 != -126) {
            method2381(-86);
        }
        ++field5847;
        class201 var3 = this.method2379(0, this.field5846, arg1, arg0 + 126);
        if (var3 != null) {
            this.method2376(-93, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B[Lfk;Lbv;)Lrs;")
    public static final class486 method2382(byte arg0, class238[] arg1, class282 arg2) {
        ++field5842;
        if (arg0 < 76) {
            field5861 = null;
        }
        for (int var3 = 0; ~arg1.length < ~var3; ++var3) {
            if (arg1[var3] == null || ~arg1[var3].field3381 >= -1L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; ~var6 > ~arg1.length; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field3381);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class238.field3383, 0);
        if (class238.field3383[0] == 0) {
            if (~class238.field3383[0] == -1) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class238.field3383, 1);
            if (class238.field3383[1] > 1) {
                byte[] var7 = new byte[class238.field3383[1]];
                OpenGL.glGetInfoLogARB(var4, class238.field3383[1], class238.field3383, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (~class238.field3383[0] == -1) {
                for (int var8 = 0; ~var8 > ~arg1.length; ++var8) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field3381);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class486(arg2, var4, arg1);
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)Z")
    public final boolean method49(int arg0) {
        if (arg0 != 7) {
            return true;
        } else {
            ++field5852;
            return false;
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(IB)V")
    public static final void method2383(int arg0, byte arg1) {
        ++field5843;
        if (arg1 <= 5) {
            method2381(-82);
        }
        class377 var2 = class99.method672(arg0, false, 8);
        var2.method2339(-11688);
    }
}
