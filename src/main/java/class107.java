import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class107 extends class149 {

    @OriginalMember(owner = "client!ke", name = "Hb", descriptor = "I")
    public static int field1899 = 0;

    @OriginalMember(owner = "client!ke", name = "Pb", descriptor = "Lqk;")
    private static class207 field1907 = class24.method212(255, "Walk here");

    @OriginalMember(owner = "client!ke", name = "Ob", descriptor = "I")
    public static int field1906 = 0;

    @OriginalMember(owner = "client!ke", name = "Rb", descriptor = "[I")
    public static int[] field1909 = new int[128];

    @OriginalMember(owner = "client!ke", name = "Nb", descriptor = "Lqk;")
    public static class207 field1905 = field1907;

    @OriginalMember(owner = "client!ke", name = "xb", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ke", name = "yb", descriptor = "I")
    private int field1890;

    @OriginalMember(owner = "client!ke", name = "zb", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!ke", name = "Bb", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!ke", name = "Cb", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ke", name = "Eb", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!ke", name = "Fb", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!ke", name = "Gb", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!ke", name = "Ib", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!ke", name = "Kb", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!ke", name = "Lb", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!ke", name = "Mb", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!ke", name = "Qb", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!ke", name = "Sb", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!ke", name = "Ab", descriptor = "Lve;")
    private class188 field1892;

    @OriginalMember(owner = "client!ke", name = "Jb", descriptor = "Lpk;")
    public static class99 field1901;

    @OriginalMember(owner = "client!ke", name = "Db", descriptor = "[I")
    public static int[] field1895;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(IB)V")
    public final void method767(int arg0, byte arg1) {
        ++field1900;
        super.field2568[super.field2593++] = (byte) (arg0 + this.field1892.method1313(-74436944));
        if (arg1 < 19) {
            field1899 = 125;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method768(Throwable arg0, int arg1) throws IOException {
        ++field1910;
        String var2;
        if (!(arg0 instanceof class71)) {
            var2 = "";
        } else {
            class71 var3 = (class71) arg0;
            var2 = var3.field1265 + " | ";
            arg0 = var3.field1263;
        }
        if (arg1 < 36) {
            method776(false, 127);
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (~var10 == 0) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(1 + var13.lastIndexOf(32));
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && ~var11 != 0) {
                int var17 = var9.indexOf(".java:", var10);
                if (~var17 <= -1) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "(I)I")
    public final int method769(int arg0) {
        ++field1902;
        if (arg0 != 255) {
            this.method767(100, (byte) 60);
        }
        return super.field2568[super.field2593++] - this.field1892.method1313(-74436944) & 255;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lv;I)Lta;")
    public static final class254 method770(class149 arg0, int arg1) {
        class254 var2 = new class254(arg0.method1034(-27220), arg0.method1034(-27220), arg0.method1050(arg1 + 1272006566), arg0.method1050(1272006568), arg0.method1076(arg1 + 65278), arg0.method1045((byte) -39) == 1, arg0.method1045((byte) 93));
        ++field1891;
        int var3 = arg0.method1045((byte) 112);
        for (int var4 = 0; ~var4 > ~var3; ++var4) {
            var2.field4549.method931(new class282(arg0.method1050(1272006568), arg0.method1050(1272006568), arg0.method1050(1272006568), arg0.method1050(arg1 + 1272006566)), 114);
        }
        var2.method1768(-124);
        return arg1 != 2 ? null : var2;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZIIIZII)V")
    public static final void method771(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class90.field1616 = arg3;
        class250.field4523 = arg6;
        ++field1898;
        class217.field3856 = arg1;
        if (!arg0) {
            class164.field2902 = arg2;
            class157.field2789 = arg5;
            if (arg4 && ~class164.field2902 <= -101) {
                class209.field3702 = class157.field2789 * 128 - -64;
                class111.field1939 = class90.field1616 * 128 - -64;
                class196.field3443 = class22.method139(class209.field3702, class111.field1939, 23979, class93.field1645) - class217.field3856;
            }
            class132.field2290 = 2;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V")
    public class107(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(IB)I")
    public final int method772(int arg0, byte arg1) {
        if (arg1 <= 2) {
            this.method778(81, (byte[]) null, -23, -52);
        }
        ++field1893;
        return arg0 * 8 + -this.field1890;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IZ)I")
    public final int method773(int arg0, boolean arg1) {
        ++field1894;
        int var3 = this.field1890 >> 3;
        int var4 = -(this.field1890 & 7) + 8;
        this.field1890 += arg0;
        if (arg1) {
            return 120;
        } else {
            int var5 = 0;
            while (arg0 > var4) {
                var5 += (super.field2568[var3++] & class51.field995[var4]) << arg0 - var4;
                arg0 -= var4;
                var4 = 8;
            }
            int var6;
            if (arg0 == var4) {
                var6 = (class51.field995[var4] & super.field2568[var3]) + var5;
            } else {
                var6 = (super.field2568[var3] >> -arg0 + var4 & class51.field995[arg0]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "(B)V")
    public static void method774(byte arg0) {
        field1909 = null;
        field1905 = null;
        field1901 = null;
        if (arg0 > -111) {
            method776(true, 5);
        }
        field1895 = null;
        field1907 = null;
    }

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "(B)V")
    public final void method775(byte arg0) {
        ++field1896;
        super.field2593 = (this.field1890 + 7) / 8;
        if (arg0 != 110) {
            this.method769(-120);
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(ZI)V")
    public static final void method776(boolean arg0, int arg1) {
        ++field1897;
        if (arg1 != -1) {
            if (class165.field2923[arg1]) {
                class154.field2670.method727(arg1, 31);
                if (class227.field4162[arg1] != null) {
                    boolean var2 = arg0;
                    for (int var3 = 0; var3 < class227.field4162[arg1].length; ++var3) {
                        if (class227.field4162[arg1][var3] != null) {
                            if (~class227.field4162[arg1][var3].field3988 == -3) {
                                var2 = false;
                            } else {
                                class227.field4162[arg1][var3] = null;
                            }
                        }
                    }
                    if (var2) {
                        class227.field4162[arg1] = null;
                    }
                    class165.field2923[arg1] = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z[I)V")
    public final void method777(boolean arg0, int[] arg1) {
        ++field1904;
        if (!arg0) {
            field1901 = null;
        }
        this.field1892 = new class188(arg1);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[BII)V")
    public final void method778(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 == 7) {
            for (int var5 = 0; var5 < arg0; ++var5) {
                arg1[var5 - -arg3] = (byte) (super.field2568[super.field2593++] + -this.field1892.method1313(-74436944));
            }
            ++field1889;
        }
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(Z)V")
    public final void method779(boolean arg0) {
        this.field1890 = super.field2593 * 8;
        ++field1908;
        if (!arg0) {
            method770((class149) null, 79);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILmd;)Z")
    public static final boolean method780(int arg0, class220 arg1) {
        ++field1903;
        if (arg1.field3930 == null) {
            return false;
        } else {
            int var2 = 0;
            if (arg0 != 19684) {
                return false;
            } else {
                while (~var2 > ~arg1.field3930.length) {
                    int var3 = class247.method1736(var2, arg1, -10);
                    int var4 = arg1.field3943[var2];
                    if (arg1.field3930[var2] == 2) {
                        if (~var4 >= ~var3) {
                            return false;
                        }
                    } else if (~arg1.field3930[var2] != -4) {
                        if (~arg1.field3930[var2] == -5) {
                            if (var3 == var4) {
                                return false;
                            }
                        } else if (var3 != var4) {
                            return false;
                        }
                    } else if (~var4 <= ~var3) {
                        return false;
                    }
                    ++var2;
                }
                return true;
            }
        }
    }
}
