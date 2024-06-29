import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class320 extends class325 {

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "Ljava/lang/String;")
    private String field4945 = "null";

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "I")
    public static int field4939 = 0;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "Lec;")
    public static class99 field4941 = new class99(30);

    @OriginalMember(owner = "client!ih", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field4959 = "Opened title screen";

    @OriginalMember(owner = "client!ih", name = "fb", descriptor = "I")
    public static int field4960 = 2;

    @OriginalMember(owner = "client!ih", name = "db", descriptor = "Z")
    public static boolean field4958 = true;

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field4956 = "";

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "C")
    public char field4936;

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "C")
    public char field4952;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
    private int field4951;

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!ih", name = "cb", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "Lii;")
    private class250 field4942;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "Lii;")
    public class250 field4944;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "[Lrj;")
    public static class269[] field4949;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLjd;)V", line = 5)
    public static final void method2219(byte arg0, class95 arg1) {
        class207.field3171 = arg1;
        int var2 = -72 / ((arg0 + 89) / 34);
        field4946++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 18)
    public final boolean method2220(String arg0, int arg1) {
        field4935++;
        if (this.field4944 == null) {
            return false;
        } else if (arg1 == 1639534544) {
            if (this.field4942 == null) {
                this.method2226((byte) 114);
            }
            for (class148 var3 = (class148) this.field4942.method1716(-1, class231.method1628(arg0, -1)); var3 != null; var3 = (class148) this.field4942.method1707(345)) {
                if (var3.field2247.equals(arg0)) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lwm;IB)V", line = 49)
    private final void method2221(class254 arg0, int arg1, byte arg2) {
        field4943++;
        if (arg2 < 107) {
            field4954 = -96;
        }
        if (arg1 == 1) {
            this.field4952 = class338.method2359(arg0.method1733(2023893896), 3213);
        } else if (arg1 == 2) {
            this.field4936 = class338.method2359(arg0.method1733(2023893896), 3213);
        } else if (arg1 == 3) {
            this.field4945 = arg0.method1778(1258);
        } else if (arg1 == 4) {
            this.field4951 = arg0.method1741(-32769);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method1755(false);
            this.field4944 = new class250(class312.method2135(984942384, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1741(-32769);
                class5 var7;
                if (arg1 == 5) {
                    var7 = new class78(arg0.method1778(1258));
                } else {
                    var7 = new class293(arg0.method1741(-32769));
                }
                this.field4944.method1708((long) var6, (byte) -79, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)I", line = 104)
    public static final int method2222(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 18597) {
            field4955 = 23;
        }
        int var4 = arg1 & 0x3;
        field4934++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lwm;I)V", line = 128)
    public final void method2223(class254 arg0, int arg1) {
        if (arg1 >= -48) {
            field4956 = (String) null;
        }
        field4953++;
        while (true) {
            int var3 = arg0.method1774((byte) -107);
            if (var3 == 0) {
                return;
            }
            this.method2221(arg0, var3, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V", line = 150)
    public static void method2224(int arg0) {
        field4956 = null;
        field4949 = null;
        if (arg0 != -28097) {
            field4960 = -25;
        }
        field4959 = null;
        field4941 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 171)
    public final String method2225(int arg0, boolean arg1) {
        field4938++;
        if (this.field4944 == null) {
            return this.field4945;
        }
        if (arg1) {
            this.field4942 = (class250) null;
        }
        class78 var3 = (class78) this.field4944.method1716(-1, (long) arg0);
        return var3 == null ? this.field4945 : var3.field1144;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V", line = 199)
    private final void method2226(byte arg0) {
        field4947++;
        this.field4942 = new class250(this.field4944.method1715(0));
        if (arg0 >= 58) {
            for (class78 var2 = (class78) this.field4944.method1706(0); var2 != null; var2 = (class78) this.field4944.method1705((byte) 35)) {
                class148 var3 = new class148(var2.field1144, (int) var2.field69);
                this.field4942.method1708(class231.method1628(var2.field1144, -1), (byte) -79, var3);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIIIIIIZI)V", line = 229)
    public static final void method2227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field4948++;
        int var12 = arg11 - arg2;
        int var13 = arg4 - arg8;
        int var14 = -1;
        if (class336.field5234 > 0) {
            if (class153.field2322 <= 10) {
                var14 = class153.field2322 * 5;
            } else {
                var14 = 50 - ((class153.field2322 - 10) * 5);
            }
        }
        int var15 = 983040 / arg6;
        int var16 = 983040 / arg0;
        for (int var17 = -var15; var17 < (var12 + var15); var17++) {
            int var18 = arg6 * var17 + arg1 >> 16;
            int var19 = arg1 + ((var17 + 1) * arg6) >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var10000 = arg3 + var19;
                int var22 = arg2 + var17 >> 6;
                int var23 = arg3 + var18;
                if (var22 >= 0 && var22 <= (class217.field3330.length - 1)) {
                    int[][] var24 = class217.field3330[var22];
                    for (int var25 = -var16; var25 < var13 + var16; var25++) {
                        int var26 = arg0 * var25 + arg7 >> 16;
                        int var27 = (var25 + 1) * arg0 + arg7 >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            int var29 = arg9 + var26;
                            int var30 = arg8 + var25 >> 6;
                            var10000 = arg9 + var27;
                            if (var30 >= 0 && var30 <= (var24.length - 1) && var24[var30] != null) {
                                int var32 = ((var25 + arg8 & 0x3F) << 6) + (arg2 + var17 & 0x3F);
                                int var33 = var24[var30][var32];
                                if (var33 != 0) {
                                    class32 var34 = class226.method1607(-122, var33 - 1);
                                    if (!class258.field3951[var34.field400]) {
                                        if (var14 != -1 && class248.field3756 == var34.field400) {
                                            class83 var35 = new class83();
                                            var35.field1222 = var34.field400;
                                            var35.field1223 = var23;
                                            var35.field1218 = var29;
                                            class319.field4928.method1952(var35, -82);
                                        } else {
                                            class183.field2898[var34.field400].method124(var23 - 7, var29 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class83 var36 = (class83) class319.field4928.method1954(arg5 + 14079); var36 != null; var36 = (class83) class319.field4928.method1950((byte) 124)) {
            class287.method1984(var36.field1223, var36.field1218, 15, 16776960, var14);
            class287.method1984(var36.field1223, var36.field1218, 13, 16776960, var14);
            class287.method1984(var36.field1223, var36.field1218, 11, 16776960, var14);
            class287.method1984(var36.field1223, var36.field1218, 9, 16776960, var14);
            class183.field2898[var36.field1222].method124(var36.field1223 - 7, var36.field1218 + -7);
        }
        if (arg5 != -14145) {
            field4939 = -78;
        }
        class319.field4928.method1951(29532);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)Z", line = 354)
    public final boolean method2228(int arg0, byte arg1) {
        field4950++;
        if (this.field4944 == null) {
            return false;
        }
        if (arg1 != -23) {
            this.method2221((class254) null, -25, (byte) 4);
        }
        if (this.field4942 == null) {
            this.method2230((byte) 52);
        }
        class293 var3 = (class293) this.field4942.method1716(-1, (long) arg0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)I", line = 379)
    public final int method2229(int arg0, int arg1) {
        field4940++;
        if (this.field4944 == null) {
            return this.field4951;
        } else if (arg1 == 63) {
            class293 var3 = (class293) this.field4944.method1716(arg1 - 64, (long) arg0);
            return var3 == null ? this.field4951 : var3.field4519;
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)V", line = 399)
    private final void method2230(byte arg0) {
        this.field4942 = new class250(this.field4944.method1715(0));
        field4937++;
        for (class293 var2 = (class293) this.field4944.method1706(arg0 - 52); var2 != null; var2 = (class293) this.field4944.method1705((byte) 65)) {
            class293 var3 = new class293((int) var2.field69);
            this.field4942.method1708((long) var2.field4519, (byte) -79, var3);
        }
        if (arg0 != 52) {
            method2219((byte) -1, (class95) null);
        }
    }
}
