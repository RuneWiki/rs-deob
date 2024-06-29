import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class126 extends class30 {

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    private int field1969;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    private int field1975;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    private int field1968;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    private int field1963;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field1974 = null;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field1964 = -1;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "[[Lqa;")
    public static class217[][] field1962;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lgn;I)V", line = 6)
    public static final void method843(class303 arg0, int arg1) {
        if (arg1 != 64) {
            return;
        }
        while (true) {
            while (arg0.field4679 < arg0.field4716.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method2043((byte) -110) == 1) {
                    var3 = arg0.method2043((byte) -128);
                    var2 = true;
                    var4 = arg0.method2043((byte) -109);
                }
                int var5 = arg0.method2043((byte) -125);
                int var6 = arg0.method2043((byte) -116);
                int var7 = var5 * 64 - class78.field1161;
                int var8 = class338.field5233 + class129.field2021 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class204.field3088 > (var7 + 63) && var8 < class129.field2021) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var3 * 8) && (var3 * 8 + 8) > var11 && var4 * 8 <= var12 && var4 * 8 + 8 > var12) {
                                byte var13 = arg0.method2001(-3);
                                if (var13 != 0) {
                                    if (class164.field2525[var9][var10] == null) {
                                        class164.field2525[var9][var10] = new byte[4096];
                                    }
                                    class164.field2525[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method2001(-3);
                                    if (class76.field1145[var9][var10] == null) {
                                        class76.field1145[var9][var10] = new byte[4096];
                                    }
                                    class76.field1145[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method2001(-3);
                        if (var16 != 0) {
                            arg0.field4679++;
                        }
                    }
                }
            }
            field1966++;
            return;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLwf;)V", line = 107)
    public static final void method844(byte arg0, class306 arg1) {
        if (arg0 <= 47) {
            method845((byte) 8);
        }
        field1965++;
        class318.field4988 = arg1;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V", line = 124)
    public static void method845(byte arg0) {
        field1974 = null;
        field1962 = (class217[][]) null;
        if (arg0 != -121) {
            field1974 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 138)
    public static final void method846(int arg0) {
        if (class158.field2464 != null) {
            class179 var1 = class158.field2464;
            synchronized (class158.field2464) {
                class158.field2464 = null;
            }
        }
        field1976++;
        if (arg0 != 8) {
            method846(41);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V", line = 156)
    public static final void method847(int arg0) {
        field1972++;
        class219.field3487 = new class207[class116.field1793.method2092(-1)][];
        int var1 = -84 % ((-arg0 - 49) / 46);
        class228.field3658 = new boolean[class116.field1793.method2092(-1)];
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(III)V", line = 169)
    public final void method227(int arg0, int arg1, int arg2) {
        field1961++;
        int var4 = this.field1968 * arg1 >> 12;
        int var5 = this.field1975 * arg1 >> 12;
        int var6 = this.field1963 * arg2 >> 12;
        int var7 = this.field1969 * arg2 >> 12;
        if (arg0 == 1325998625) {
            class89.method612(var7, this.field376, var5, this.field369, this.field370, var4, false, var6);
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(III)J", line = 188)
    public static final long method848(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1375[arg0][arg1][arg2];
        return var3 == null || var3.field2672 == null ? 0L : var3.field2672.field2457;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V", line = 197)
    public final void method225(int arg0, int arg1, int arg2) {
        field1967++;
        if (arg2 != 2) {
            method844((byte) -12, (class306) null);
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IIIIIII)V", line = 207)
    public class126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1969 = arg3;
        this.field1975 = arg0;
        this.field1968 = arg2;
        this.field1963 = arg1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIB)V", line = 222)
    public final void method228(int arg0, int arg1, byte arg2) {
        field1973++;
        if (arg2 != -94) {
            field1962 = (class217[][]) ((class217[][]) null);
        }
        int var4 = this.field1975 * arg0 >> 12;
        int var5 = this.field1963 * arg1 >> 12;
        int var6 = this.field1969 * arg1 >> 12;
        int var7 = this.field1968 * arg0 >> 12;
        class280.method1850(var4, var6, var5, var7, this.field369, (byte) 122);
    }
}
