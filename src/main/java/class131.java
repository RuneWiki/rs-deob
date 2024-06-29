import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class131 extends class25 {

    @OriginalMember(owner = "client!ob", name = "Eb", descriptor = "Ljava/util/Random;")
    public static Random field1915 = new Random();

    @OriginalMember(owner = "client!ob", name = "Kb", descriptor = "I")
    public static int field1921 = -1;

    @OriginalMember(owner = "client!ob", name = "Hb", descriptor = "I")
    public static int field1918 = 0;

    @OriginalMember(owner = "client!ob", name = "Gb", descriptor = "I")
    public static int field1917 = 0;

    @OriginalMember(owner = "client!ob", name = "Rb", descriptor = "Ljava/lang/String;")
    public static String field1928 = "slide:";

    @OriginalMember(owner = "client!ob", name = "Bb", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!ob", name = "Cb", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!ob", name = "Db", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!ob", name = "Fb", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ob", name = "Ib", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!ob", name = "Jb", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!ob", name = "Lb", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!ob", name = "Mb", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!ob", name = "Nb", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ob", name = "Ob", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!ob", name = "Qb", descriptor = "I")
    private int field1927;

    @OriginalMember(owner = "client!ob", name = "Sb", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ob", name = "Tb", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!ob", name = "Ub", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!ob", name = "Pb", descriptor = "Lfe;")
    private class254 field1926;

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
    public class131(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)V")
    public static final void method886(boolean arg0, int arg1) {
        ++field1931;
        if (!arg0) {
            class118.field1728.method1425(arg1, -118);
            class111.field1682.method1425(arg1, -110);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(ZI)I")
    public final int method887(boolean arg0, int arg1) {
        ++field1912;
        int var3 = -(this.field1927 & 7) + 8;
        int var4 = this.field1927 >> 3;
        this.field1927 += arg1;
        if (!arg0) {
            return 53;
        } else {
            int var5 = 0;
            while (~var3 > ~arg1) {
                var5 += (super.field339[var4++] & class285.field4517[var3]) << -var3 + arg1;
                arg1 -= var3;
                var3 = 8;
            }
            int var6;
            if (~arg1 != ~var3) {
                var6 = (super.field339[var4] >> -arg1 + var3 & class285.field4517[arg1]) + var5;
            } else {
                var6 = (super.field339[var4] & class285.field4517[var3]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "(B)V")
    public final void method888(byte arg0) {
        ++field1930;
        if (arg0 != 30) {
            field1921 = 98;
        }
        super.field349 = (this.field1927 + 7) / 8;
    }

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "(II)I")
    public final int method889(int arg0, int arg1) {
        if (arg1 >= -86) {
            field1928 = null;
        }
        ++field1920;
        return arg0 * 8 + -this.field1927;
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(Z)V")
    public static void method890(boolean arg0) {
        field1915 = null;
        if (!arg0) {
            field1928 = null;
        }
        field1928 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[I)V")
    public final void method891(int arg0, int[] arg1) {
        ++field1924;
        this.field1926 = new class254(arg1);
        if (arg0 != -9777) {
            method886(false, 55);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IB)V")
    public final void method892(int arg0, byte arg1) {
        ++field1925;
        if (arg1 >= -10) {
            field1921 = -18;
        }
        super.field339[super.field349++] = (byte) (this.field1926.method1709(255) + arg0);
    }

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "(I)V")
    public final void method893(int arg0) {
        if (arg0 != 22452) {
            field1922 = -2;
        }
        this.field1927 = super.field349 * 8;
        ++field1923;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([BIIB)V")
    public final void method894(byte[] arg0, int arg1, int arg2, byte arg3) {
        ++field1929;
        for (int var5 = 0; ~var5 > ~arg1; ++var5) {
            arg0[arg2 + var5] = (byte) (super.field339[super.field349++] + -this.field1926.method1709(arg3 + 344));
        }
        if (arg3 != -89) {
            field1922 = 127;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;ZII)I")
    public static final int method895(String arg0, boolean arg1, int arg2, int arg3) {
        ++field1914;
        if (~arg2 <= -3 && arg2 <= 36) {
            boolean var4 = false;
            int var5 = 0;
            int var6 = arg0.length();
            if (arg3 != -9) {
                return -31;
            } else {
                boolean var7 = false;
                for (int var8 = 0; var8 < var6; ++var8) {
                    char var9 = arg0.charAt(var8);
                    if (var8 == 0) {
                        if (var9 == '-') {
                            var4 = true;
                            continue;
                        }
                        if (~var9 == -44 && arg1) {
                            continue;
                        }
                    }
                    int var11;
                    if (~var9 <= -49 && var9 <= '9') {
                        var11 = var9 - '0';
                    } else if (~var9 <= -66 && var9 <= 'Z') {
                        var11 = var9 - '7';
                    } else {
                        if (~var9 > -98 || ~var9 < -123) {
                            throw new NumberFormatException();
                        }
                        var11 = var9 - 'W';
                    }
                    if (arg2 <= var11) {
                        throw new NumberFormatException();
                    }
                    if (var4) {
                        var11 = -var11;
                    }
                    int var10 = arg2 * var5 + var11;
                    if (var10 / arg2 != var5) {
                        throw new NumberFormatException();
                    }
                    var5 = var10;
                    var7 = true;
                }
                if (!var7) {
                    throw new NumberFormatException();
                } else {
                    return var5;
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(Z)V")
    public static final void method896(boolean arg0) {
        ++field1913;
        class47.method356(-1);
        class219.method1481(-1);
        class35.method277(104);
        class92.method617(false);
        class40.method318((byte) 33);
        class185.method1286(arg0);
        class195.method1352((byte) 76);
        class147.method973(false);
        class157.method1058(25);
        class11.method65(-123);
        class87.method602(1);
        class165.method1137(false);
        class93.method619((byte) -100);
        class96.method641(0);
        class257.method1768(0);
        class95.method634((byte) -89);
        class231.method1581(-112);
        class116.method770((byte) -127);
        class37.field484.method1430(-1);
        class99.field1545.method1430(-1);
    }

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "(I)I")
    public final int method897(int arg0) {
        if (arg0 != 255) {
            method896(true);
        }
        ++field1919;
        return super.field339[super.field349++] - this.field1926.method1709(255) & 255;
    }
}
