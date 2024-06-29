import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class342 extends class44 {

    @OriginalMember(owner = "client!pf", name = "Xb", descriptor = "F")
    public static float field5324;

    @OriginalMember(owner = "client!pf", name = "Nb", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!pf", name = "Ob", descriptor = "I")
    private int field5315;

    @OriginalMember(owner = "client!pf", name = "Pb", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!pf", name = "Qb", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!pf", name = "Rb", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!pf", name = "Tb", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!pf", name = "Ub", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!pf", name = "Wb", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!pf", name = "Yb", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!pf", name = "Zb", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!pf", name = "ac", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!pf", name = "Vb", descriptor = "Lfg;")
    private class142 field5322;

    @OriginalMember(owner = "client!pf", name = "Sb", descriptor = "[I")
    public static int[] field5319;

    @OriginalMember(owner = "client!pf", name = "bc", descriptor = "[I")
    public static int[] field5328;

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I)V", line = 7)
    public class342(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II[BI)V", line = 14)
    public final void method2369(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 != 4) {
            field5328 = (int[]) null;
        }
        for (int var5 = 0; var5 < arg3; var5++) {
            arg2[arg1 + var5] = (byte) (this.field573[this.field586++] - this.field5322.method1046(-87));
        }
        field5326++;
    }

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "(II)I", line = 31)
    public final int method2370(int arg0, int arg1) {
        if (arg1 == 7) {
            field5321++;
            return arg0 * 8 - this.field5315;
        } else {
            return -77;
        }
    }

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "(I)V", line = 43)
    public final void method2371(int arg0) {
        if (arg0 != 0) {
            field5319 = (int[]) null;
        }
        field5314++;
        this.field5315 = this.field586 * 8;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[I)V", line = 54)
    public final void method2372(int arg0, int[] arg1) {
        if (arg0 == -29173) {
            field5317++;
            this.field5322 = new class142(arg1);
        }
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(Z)I", line = 65)
    public final int method2373(boolean arg0) {
        if (arg0) {
            this.method2370(58, -24);
        }
        field5320++;
        return this.field573[this.field586++] - this.field5322.method1046(-110) & 0xFF;
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(IB)I", line = 77)
    public final int method2374(int arg0, byte arg1) {
        field5323++;
        if (arg1 != -36) {
            return 6;
        }
        int var3 = 8 - (this.field5315 & 0x7);
        int var4 = this.field5315 >> 3;
        int var5 = 0;
        this.field5315 += arg0;
        while (var3 < arg0) {
            var5 += (class110.field1639[var3] & this.field573[var4++]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var6;
        if (arg0 == var3) {
            var6 = (class110.field1639[var3] & this.field573[var4]) + var5;
        } else {
            var6 = (this.field573[var4] >> var3 - arg0 & class110.field1639[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "(II)V", line = 110)
    public final void method2375(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field5315 = -15;
        }
        field5325++;
        this.field573[this.field586++] = (byte) (this.field5322.method1046(class152.method1101(arg1, -109)) + arg0);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLog;Ljava/lang/String;)Ljava/lang/String;", line = 123)
    public static final String method2376(boolean arg0, class157 arg1, String arg2) {
        field5318++;
        if (arg2.indexOf("%") == -1) {
            return arg0 ? arg2 : (String) null;
        }
        while (true) {
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
                                                        return arg0 ? arg2 : (String) null;
                                                    }
                                                    String var9 = "";
                                                    if (class322.field4983 != null) {
                                                        if (class322.field4983.field2664 == null) {
                                                            var9 = class160.method1144(class322.field4983.field2665, (byte) 97);
                                                        } else {
                                                            var9 = (String) class322.field4983.field2664;
                                                        }
                                                    }
                                                    arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                }
                                            }
                                            arg2 = arg2.substring(0, var7) + class27.method160(class44.method233(arg1, 4, (byte) 17), 9179409) + arg2.substring(var7 + 2);
                                        }
                                    }
                                    arg2 = arg2.substring(0, var6) + class27.method160(class44.method233(arg1, 3, (byte) 17), 9179409) + arg2.substring(var6 + 2);
                                }
                            }
                            arg2 = arg2.substring(0, var5) + class27.method160(class44.method233(arg1, 2, (byte) 17), 9179409) + arg2.substring(var5 + 2);
                        }
                    }
                    arg2 = arg2.substring(0, var4) + class27.method160(class44.method233(arg1, 1, (byte) 17), 9179409) + arg2.substring(var4 + 2);
                }
            }
            arg2 = arg2.substring(0, var3) + class27.method160(class44.method233(arg1, 0, (byte) 17), 9179409) + arg2.substring(var3 + 2);
        }
    }

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "(B)V", line = 215)
    public final void method2377(byte arg0) {
        this.field586 = (this.field5315 + 7) / 8;
        if (arg0 >= 121) {
            field5316++;
        }
    }

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "(I)V", line = 236)
    public static void method2378(int arg0) {
        field5328 = null;
        if (arg0 == -13393) {
            field5319 = null;
        }
    }
}
