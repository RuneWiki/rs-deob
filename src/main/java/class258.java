import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class258 extends class321 {

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "Lwq;")
    public class92 field3690 = new class92();

    @OriginalMember(owner = "client!pr", name = "H", descriptor = "Laj;")
    public class169 field3702 = new class169();

    @OriginalMember(owner = "client!pr", name = "E", descriptor = "Leo;")
    private class162 field3699;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field3688 = new String[100];

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!pr", name = "y", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!pr", name = "A", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!pr", name = "B", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!pr", name = "D", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!pr", name = "F", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!pr", name = "G", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!pr", name = "I", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!pr", name = "C", descriptor = "[I")
    public static int[] field3697;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)Lda;", line = 7)
    public static final class36 method1729(int arg0, int arg1) {
        field3703++;
        class36 var2 = (class36) class18.field211.method1625((long) arg1, 0);
        if (var2 != null) {
            return var2;
        } else if (arg0 >= -60) {
            return null;
        } else {
            byte[] var3 = class54.field648.method2431((byte) 68, 1, arg1);
            class36 var4 = new class36();
            if (var3 != null) {
                var4.method218(new class236(var3), true, arg1);
            }
            class18.field211.method1622((byte) 13, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(B)V", line = 37)
    public static final void method1730(byte arg0) {
        field3696++;
        if (arg0 != -93) {
            method1730((byte) 0);
        }
        class273.field3879.method1618(0);
        class161.field2126.method1618(0);
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "()Lj;", line = 51)
    public final class321 method1060() {
        field3701++;
        class425 var1;
        do {
            var1 = (class425) this.field3690.method514(true);
            if (var1 == null) {
                return null;
            }
        } while (var1.field6074 == null);
        return var1.field6074;
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(B)V", line = 70)
    public static void method1731(byte arg0) {
        if (arg0 > -16) {
            field3697 = null;
        }
        field3697 = null;
        field3688 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "()I", line = 83)
    public final int method1079() {
        field3700++;
        return 0;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(Z)Z", line = 95)
    public static final boolean method1732(boolean arg0) {
        for (int var1 = class55.field668; var1 < class167.field2334; var1++) {
            class193[][] var2 = class250.field3570[var1];
            for (int var3 = -class76.field898; var3 <= 0; var3++) {
                int var4 = class444.field6379 + var3;
                int var5 = class444.field6379 - var3;
                if (var4 >= class216.field3050 || var5 < class50.field605) {
                    for (int var6 = -class76.field898; var6 <= 0; var6++) {
                        int var7 = class137.field1706 + var6;
                        int var8 = class137.field1706 - var6;
                        if (var4 >= class216.field3050) {
                            if (var7 >= class380.field5349) {
                                class193 var9 = var2[var4][var7];
                                if (var9 != null && var9.field2795) {
                                    class402.field5768 = arg0;
                                    class144.field1782.method203(var9, false);
                                    class144.field1782.method201(0);
                                }
                            }
                            if (var8 < class161.field2129) {
                                class193 var10 = var2[var4][var8];
                                if (var10 != null && var10.field2795) {
                                    class402.field5768 = arg0;
                                    class144.field1782.method203(var10, false);
                                    class144.field1782.method201(0);
                                }
                            }
                        }
                        if (var5 < class50.field605) {
                            if (var7 >= class380.field5349) {
                                class193 var11 = var2[var5][var7];
                                if (var11 != null && var11.field2795) {
                                    class402.field5768 = arg0;
                                    class144.field1782.method203(var11, false);
                                    class144.field1782.method201(0);
                                }
                            }
                            if (var8 < class161.field2129) {
                                class193 var12 = var2[var5][var8];
                                if (var12 != null && var12.field2795) {
                                    class402.field5768 = arg0;
                                    class144.field1782.method203(var12, false);
                                    class144.field1782.method201(0);
                                }
                            }
                        }
                        if (class423.field6058 == 0) {
                            if (class263.field3752) {
                                class144.field1782.method208(24, -34);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lmm;III[Z)Z", line = 203)
    public static final boolean method1733(class152 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class399.field5693 != class161.field2122) {
            int var6 = class98.field1191[arg1].method342(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class327 var8 = class98.field1191[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method342(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method333(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method330(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V", line = 238)
    public static final void method1734(int arg0) {
        class237 var1 = class5.field84;
        synchronized (class5.field84) {
            class5.field84.method1626((byte) 106);
            if (arg0 != -1) {
                field3694 = 97;
            }
        }
        field3695++;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBLge;)V", line = 253)
    private final void method1735(int arg0, byte arg1, class425 arg2) {
        if (arg1 <= 13) {
            this.method1736((int[]) null, -45, -100, (byte) -8, (class425) null, 61);
        }
        field3689++;
        if ((this.field3699.field2187[arg2.field6076] & 0x4) != 0 && arg2.field6072 < 0) {
            int var4 = this.field3699.field2167[arg2.field6076] / class313.field4484;
            int var5 = (var4 + 1048575 - arg2.field6078) / var4;
            arg2.field6078 = arg0 * var4 + arg2.field6078 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field3699.field2178[arg2.field6076] == 0) {
                    arg2.field6074 = class173.method1182(arg2.field6065, arg2.field6074.method1183(), arg2.field6074.method1185(), arg2.field6074.method1153());
                } else {
                    arg2.field6074 = class173.method1182(arg2.field6065, arg2.field6074.method1183(), 0, arg2.field6074.method1153());
                    this.field3699.method1057(arg2, (byte) 65, arg2.field6069.field135[arg2.field6082] < 0);
                }
                if (arg2.field6069.field135[arg2.field6082] < 0) {
                    arg2.field6074.method1173(-1);
                }
                arg0 = arg2.field6078 / var4;
            }
        }
        arg2.field6074.method1056(arg0);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "([IIIBLge;I)V", line = 294)
    private final void method1736(int[] arg0, int arg1, int arg2, byte arg3, class425 arg4, int arg5) {
        field3692++;
        if (arg3 > -122) {
            this.method1060();
        }
        if ((this.field3699.field2187[arg4.field6076] & 0x4) != 0 && arg4.field6072 < 0) {
            int var7 = this.field3699.field2167[arg4.field6076] / class313.field4484;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field6078) / var7;
                if (var8 > arg2) {
                    arg4.field6078 += arg2 * var7;
                    break;
                }
                arg4.field6074.method1076(arg0, arg1, var8);
                arg1 += var8;
                arg2 -= var8;
                arg4.field6078 += var7 * var8 - 1048576;
                int var9 = class313.field4484 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class173 var11 = arg4.field6074;
                if (this.field3699.field2178[arg4.field6076] == 0) {
                    arg4.field6074 = class173.method1182(arg4.field6065, var11.method1183(), var11.method1185(), var11.method1153());
                } else {
                    arg4.field6074 = class173.method1182(arg4.field6065, var11.method1183(), 0, var11.method1153());
                    this.field3699.method1057(arg4, (byte) 85, arg4.field6069.field135[arg4.field6082] < 0);
                    arg4.field6074.method1165(var9, var11.method1185());
                }
                if (arg4.field6069.field135[arg4.field6082] < 0) {
                    arg4.field6074.method1173(-1);
                }
                var11.method1167(var9);
                var11.method1076(arg0, arg1, arg5 - arg1);
                if (var11.method1157()) {
                    this.field3702.method1139(var11);
                }
            }
        }
        arg4.field6074.method1076(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Leo;)V", line = 401)
    public class258(class162 arg0) {
        this.field3699 = arg0;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "([III)V", line = 360)
    public final void method1076(int[] arg0, int arg1, int arg2) {
        field3691++;
        this.field3702.method1076(arg0, arg1, arg2);
        for (class425 var4 = (class425) this.field3690.method506((byte) -128); var4 != null; var4 = (class425) this.field3690.method514(true)) {
            if (!this.field3699.method1070(true, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field6066 >= var6) {
                        this.method1736(arg0, var5, var6, (byte) -123, var4, var5 + var6);
                        var4.field6066 -= var6;
                        break;
                    }
                    this.method1736(arg0, var5, var4.field6066, (byte) -124, var4, var5 + var6);
                    var6 -= var4.field6066;
                    var5 += var4.field6066;
                } while (!this.field3699.method1051(var6, var5, var4, 9210, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V", line = 410)
    public final void method1056(int arg0) {
        this.field3702.method1056(arg0);
        field3693++;
        for (class425 var2 = (class425) this.field3690.method506((byte) -128); var2 != null; var2 = (class425) this.field3690.method514(true)) {
            if (!this.field3699.method1070(true, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field6066) {
                        this.method1735(var3, (byte) 53, var2);
                        var2.field6066 -= var3;
                        break;
                    }
                    this.method1735(var2.field6066, (byte) 127, var2);
                    var3 -= var2.field6066;
                } while (!this.field3699.method1051(var3, 0, var2, 9210, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "()Lj;", line = 445)
    public final class321 method1078() {
        field3698++;
        class425 var1 = (class425) this.field3690.method506((byte) -128);
        if (var1 == null) {
            return null;
        } else if (var1.field6074 == null) {
            return this.method1060();
        } else {
            return var1.field6074;
        }
    }
}
