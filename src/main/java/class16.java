import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class16 extends class384 {

    @OriginalMember(owner = "client!kn", name = "ab", descriptor = "[I")
    public static int[] field219 = new int[25];

    @OriginalMember(owner = "client!kn", name = "fb", descriptor = "Lps;")
    public static class394 field224 = null;

    @OriginalMember(owner = "client!kn", name = "hb", descriptor = "[Lur;")
    public static class92[] field226 = new class92[0];

    @OriginalMember(owner = "client!kn", name = "bb", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!kn", name = "cb", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!kn", name = "db", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!kn", name = "eb", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!kn", name = "gb", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!kn", name = "ib", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(IB)Lbg;")
    public static final class373 method97(int arg0, byte arg1) {
        ++field227;
        class189 var2 = class125.field1762;
        class373 var3;
        synchronized (class125.field1762) {
            var3 = (class373) class125.field1762.method1137((long) arg0, 2108653711);
            int var4 = -68 / ((6 - arg1) / 36);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var5 = class47.field664.method2261(class271.method1862(arg0, (byte) -111), class196.method1170(arg0, -111), 91);
            class373 var6 = new class373();
            if (var5 != null) {
                var6.method2415(new class228(var5), 65);
            }
            class189 var7 = class125.field1762;
            synchronized (class125.field1762) {
                class125.field1762.method1144((long) arg0, var6, -3480);
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(B)V")
    public static void method98(byte arg0) {
        field224 = null;
        field226 = null;
        field219 = null;
        if (arg0 != 28) {
            method98((byte) -119);
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)[[I")
    public final int[][] method99(int arg0, int arg1) {
        if (arg1 != 2) {
            field224 = null;
        }
        ++field221;
        int[][] var3 = super.field5933.method2205((byte) -114, arg0);
        if (super.field5933.field4847 && this.method2474(false)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field5552 * super.field5552;
            for (int var8 = 0; var8 < class140.field1922; ++var8) {
                int var9 = super.field5559[var8 % super.field5562 + var7];
                var6[var8] = class183.method1117(var9 << 4, 4080);
                var5[var8] = class183.method1117(4080, var9 >> 4);
                var4[var8] = class183.method1117(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IC)Z")
    public static final boolean method100(int arg0, char arg1) {
        if (arg0 != 65) {
            field226 = null;
        }
        ++field223;
        return arg1 >= 'A' && ~arg1 >= -91 || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(CI)C")
    public static final char method101(char arg0, int arg1) {
        ++field222;
        if (arg1 != -12020) {
            return (char) 65511;
        } else if (arg0 != ' ' && ~arg0 != -161 && arg0 != '_' && ~arg0 != -46) {
            if (~arg0 != -92 && ~arg0 != -94 && arg0 != '#') {
                if (~arg0 != -225 && ~arg0 != -226 && arg0 != 226 && arg0 != 228 && ~arg0 != -228 && arg0 != 192 && arg0 != 193 && ~arg0 != -195 && ~arg0 != -197 && arg0 != 195) {
                    if (arg0 != 232 && arg0 != 233 && ~arg0 != -235 && ~arg0 != -236 && arg0 != 200 && arg0 != 201 && arg0 != 202 && ~arg0 != -204) {
                        if (arg0 != 237 && ~arg0 != -239 && arg0 != 239 && ~arg0 != -206 && ~arg0 != -207 && ~arg0 != -208) {
                            if (~arg0 != -243 && arg0 != 243 && arg0 != 244 && ~arg0 != -247 && ~arg0 != -246 && arg0 != 210 && ~arg0 != -212 && arg0 != 212 && ~arg0 != -215 && arg0 != 213) {
                                if (arg0 != 249 && ~arg0 != -251 && arg0 != 251 && ~arg0 != -253 && ~arg0 != -218 && ~arg0 != -219 && arg0 != 219 && ~arg0 != -221) {
                                    if (~arg0 != -232 && ~arg0 != -200) {
                                        if (arg0 != 255 && ~arg0 != -377) {
                                            if (arg0 != 241 && ~arg0 != -210) {
                                                return arg0 == 223 ? 'b' : Character.toLowerCase(arg0);
                                            } else {
                                                return 'n';
                                            }
                                        } else {
                                            return 'y';
                                        }
                                    } else {
                                        return 'c';
                                    }
                                } else {
                                    return 'u';
                                }
                            } else {
                                return 'o';
                            }
                        } else {
                            return 'i';
                        }
                    } else {
                        return 'e';
                    }
                } else {
                    return 'a';
                }
            } else {
                return arg0;
            }
        } else {
            return '_';
        }
    }
}
