import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class259 {

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field3946 = 0;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3948 = "Please remove ";

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[J")
    public static long[] field3944 = new long[200];

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Z")
    public static boolean field3951 = false;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Ljg;")
    public static class170 field3943;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIILrf;)V")
    public static final void method1739(int arg0, int arg1, int arg2, class289 arg3) {
        field3952++;
        if (class218.field3278 < 2 && class114.field1738 == 0 && !class153.field2305) {
            return;
        }
        int var4 = -55 % (-arg2 / 61);
        String var5 = class169.method1050(false);
        if (arg3 == null) {
            int var7 = class192.field2953.method1038(var5, arg1 + 4, arg0 + 15, 16777215, 0, class21.field238, class56.field891);
            class8.method40(0, arg1 + 4, var7 + class192.field2953.method1036(var5), 15, arg0);
            return;
        }
        class164 var6 = arg3.method1917(class143.field2101, (byte) -113);
        if (var6 == null) {
            var6 = class192.field2953;
        }
        var6.method1031(var5, arg1, arg0, arg3.field4478, arg3.field4444, arg3.field4402, arg3.field4570, arg3.field4541, arg3.field4517, class21.field238, class56.field891, class204.field3069);
        class8.method40(0, class204.field3069[0], class204.field3069[2], class204.field3069[3], class204.field3069[1]);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static final void method1740(int arg0) {
        field3947++;
        if (class3.field46 == 0) {
            return;
        }
        try {
            if ((++class142.field2084) > 1500) {
                if (class44.field706 != null) {
                    class44.field706.method955((byte) 65);
                    class44.field706 = null;
                }
                if (class211.field3170 >= 1) {
                    class3.field46 = 0;
                    class115.field1761 = -5;
                    return;
                }
                class142.field2084 = 0;
                if (class220.field3313 == class154.field2325) {
                    class154.field2325 = class141.field2058;
                } else {
                    class154.field2325 = class220.field3313;
                }
                class3.field46 = 1;
                class211.field3170++;
            }
            if (arg0 == -18443) {
                if (class3.field46 == 1) {
                    class177.field2713 = class209.field3147.method68(class158.field2431, 0, class154.field2325);
                    class3.field46 = 2;
                }
                if (class3.field46 == 2) {
                    if (class177.field2713.field1249 == 2) {
                        throw new IOException();
                    }
                    if (class177.field2713.field1249 != 1) {
                        return;
                    }
                    class44.field706 = new class157((Socket) class177.field2713.field1250, class209.field3147);
                    class177.field2713 = null;
                    class44.field706.method951(class196.field2979.field3748, 70, 0, class196.field2979.field3723);
                    if (class147.field2144 != null) {
                        class147.field2144.method445((byte) 122);
                    }
                    if (class192.field2958 != null) {
                        class192.field2958.method445((byte) 122);
                    }
                    int var1 = class44.field706.method950(true);
                    if (class147.field2144 != null) {
                        class147.field2144.method445((byte) 122);
                    }
                    if (class192.field2958 != null) {
                        class192.field2958.method445((byte) 122);
                    }
                    if (var1 != 101) {
                        class3.field46 = 0;
                        class115.field1761 = var1;
                        class44.field706.method955((byte) 127);
                        class44.field706 = null;
                        return;
                    }
                    class3.field46 = 3;
                }
                if (class3.field46 == 3 && class44.field706.method953(0) >= 2) {
                    int var2 = class44.field706.method950(true) << 8 | class44.field706.method950(true);
                    class213.method1362(var2, -2941);
                    if (class91.field1434 == -1) {
                        class3.field46 = 0;
                        class115.field1761 = 6;
                        class44.field706.method955((byte) -87);
                        class44.field706 = null;
                    } else {
                        class3.field46 = 0;
                        class44.field706.method955((byte) 87);
                        class44.field706 = null;
                        class66.method452(arg0 + 18443);
                    }
                }
            }
        } catch (IOException var3) {
            if (class44.field706 != null) {
                class44.field706.method955((byte) -86);
                class44.field706 = null;
            }
            if (class211.field3170 < 1) {
                class211.field3170++;
                class3.field46 = 1;
                class142.field2084 = 0;
                if (class220.field3313 == class154.field2325) {
                    class154.field2325 = class141.field2058;
                } else {
                    class154.field2325 = class220.field3313;
                }
            } else {
                class3.field46 = 0;
                class115.field1761 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static void method1741(int arg0) {
        if (arg0 == -19259) {
            field3944 = null;
            field3943 = null;
            field3948 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)I")
    public static final int method1742(int arg0) {
        if (arg0 < 72) {
            return -7;
        }
        field3942++;
        if ((double) class61.field972 == 3.0D) {
            return 37;
        } else if ((double) class61.field972 == 4.0D) {
            return 50;
        } else if ((double) class61.field972 == 6.0D) {
            return 75;
        } else if ((double) class61.field972 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([Ljava/lang/String;IIB)Ljava/lang/String;")
    public static final String method1743(String[] arg0, int arg1, int arg2, byte arg3) {
        field3945++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg0[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = 0;
            if (arg3 != -92) {
                method1743((String[]) null, -121, -40, (byte) 80);
            }
            int var6 = arg1 + arg2;
            for (int var7 = arg2; var7 < var6; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var5 += 4;
                } else {
                    var5 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var5);
            for (int var9 = arg2; var9 < var6; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIII)V")
    public static final void method1744(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3950++;
        class274.field4115[0].method1118(arg3, arg1);
        int var6 = -89 / ((arg2 + 49) / 57);
        class274.field4115[1].method1118(arg3, arg1 + arg5 - 16);
        int var7 = (arg5 - 32) * arg5 / arg4;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - var7 - 32) * arg0 / (arg4 - arg5);
        class111.method702(arg3, arg1 + 16, 16, arg5 - 32, class161.field2475);
        class111.method702(arg3, arg1 + var8 + 16, 16, var7, class27.field341);
        class111.method704(arg3, arg1 + var8 + 16, var7, class68.field1078);
        class111.method704(arg3 + 1, arg1 + 16 + var8, var7, class68.field1078);
        class111.method713(arg3, arg1 + var8 + 16, 16, class68.field1078);
        class111.method713(arg3, var8 + arg1 + 17, 16, class68.field1078);
        class111.method704(arg3 + 15, var8 + 16 + arg1, var7, class292.field4590);
        class111.method704(arg3 + 14, arg1 + 17 - -var8, var7 - 1, class292.field4590);
        class111.method713(arg3, arg1 + var7 + var8 + 15, 16, class292.field4590);
        class111.method713(arg3 + 1, arg1 - -var8 + var7 + 14, 15, class292.field4590);
    }
}
