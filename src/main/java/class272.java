import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class272 extends InputStream {

    @OriginalMember(owner = "client!to", name = "b", descriptor = "[I")
    public static int[] field3942 = new int[14];

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field3941 = 0;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3943 = new String[200];

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field3947 = -9017772;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field3950 = -1;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lps;ILjava/lang/String;)Ljava/lang/String;", line = 6)
    public static final String method1869(class394 arg0, int arg1, String arg2) {
        field3944++;
        if (arg2.indexOf("%") != -1) {
            label56: while (true) {
                int var3 = arg2.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label56;
                                                        }
                                                        String var9 = "";
                                                        if (class307.field4514 != null) {
                                                            if (class307.field4514.field6309 == null) {
                                                                var9 = class223.method1294(arg1 + 17590, class307.field4514.field6307);
                                                            } else {
                                                                var9 = (String) class307.field4514.field6309;
                                                            }
                                                        }
                                                        arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                    }
                                                }
                                                arg2 = arg2.substring(0, var7) + class241.method1446(class148.method938(arg1 + 10844, 4, arg0), 4) + arg2.substring(var7 + 2);
                                            }
                                        }
                                        arg2 = arg2.substring(0, var6) + class241.method1446(class148.method938(-8, 3, arg0), arg1 + 10856) + arg2.substring(var6 + 2);
                                    }
                                }
                                arg2 = arg2.substring(0, var5) + class241.method1446(class148.method938(-8, 2, arg0), arg1 + 10856) + arg2.substring(var5 + 2);
                            }
                        }
                        arg2 = arg2.substring(0, var4) + class241.method1446(class148.method938(-8, 1, arg0), 4) + arg2.substring(var4 + 2);
                    }
                }
                arg2 = arg2.substring(0, var3) + class241.method1446(class148.method938(-8, 0, arg0), arg1 ^ 0xFFFFD598) + arg2.substring(var3 + 2);
            }
        }
        if (arg1 != -10852) {
            method1871(-100, 97, 3, 27);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!to", name = "read", descriptor = "()I", line = 97)
    public final int read() {
        field3949++;
        class144.method918(30000L, true);
        return -1;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZZ)V", line = 106)
    public static final void method1870(boolean arg0, boolean arg1) {
        field3945++;
        byte[][] var2;
        byte var3;
        if (arg0) {
            var2 = class12.field198;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class379.field5503;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            byte[] var12 = var2[var5];
            int var13 = class147.field2015[var5] >> 8;
            int var14 = class147.field2015[var5] & 0xFF;
            int var15 = var13 * 64 - class7.field138;
            int var16 = var14 * 64 - class200.field2660;
            if (var12 != null) {
                class281.method1935(-31);
                var11 = class223.method1298(-1553671577, var3, class365.field5294, var12, var15, class200.field2660, var16, class61.field807, class7.field138, arg0);
            }
            if (!arg0 && (class179.field2373 / 8) == var13 && class220.field2905 / 8 == var14) {
                if (var11 == null) {
                    class247.field3331 = null;
                } else {
                    class247.field3331 = class420.method2687(var11[3], 0, var11[2], var11[1], var11[0]);
                    class165.field2226 = var11[4];
                }
            }
        }
        if (arg1) {
            field3947 = 12;
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class147.field2015[var6] >> 8) * 64 - class7.field138;
            int var8 = (class147.field2015[var6] & 0xFF) * 64 - class200.field2660;
            byte[] var9 = var2[var6];
            if (var9 == null && class220.field2905 < 800) {
                class281.method1935(111);
                for (int var10 = 0; var10 < var3; var10++) {
                    class438.method2755(93, var8, var10, 64, 64, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIII)Z", line = 197)
    public static final boolean method1871(int arg0, int arg1, int arg2, int arg3) {
        if (class202.method1200(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class225.method1300(var4 + 1, class12.field205[arg0].method742(arg1, arg2) + arg3, var5 + 1) && class225.method1300(var4 + 128 - 1, class12.field205[arg0].method742(arg1 + 1, arg2) + arg3, var5 + 1) && class225.method1300(var4 + 128 - 1, class12.field205[arg0].method742(arg1 + 1, arg2 + 1) + arg3, var5 + 128 - 1) && class225.method1300(var4 + 1, class12.field205[arg0].method742(arg1, arg2 + 1) + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V", line = 213)
    public static void method1872(int arg0) {
        if (arg0 <= -108) {
            field3942 = null;
            field3943 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V", line = 235)
    public static final void method1873(boolean arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class119.field1671[var1] = false;
        }
        field3946++;
        if (!arg0) {
            field3942 = null;
        }
        class253.field3491 = -1;
        class367.field5302 = -1;
        class91.field1281 = 0;
        class346.field4979 = 1;
        class68.field880 = 0;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V", line = 265)
    public static final void method1874(int arg0) {
        class270.field3909.method1141(256);
        field3948++;
        int var1 = -19 / ((arg0 + 38) / 43);
    }
}
