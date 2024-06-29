import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class100 {

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Ljk;")
    private class449 field1215 = new class449(16);

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Lqn;")
    private class47 field1208;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Lap;")
    public static class335 field1207 = new class335("M", "M", "M", "M");

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "Lnj;")
    public static class163 field1217;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIILiu;I)Lqj;", line = 12)
    public final class354 method747(int arg0, int arg1, int arg2, int arg3, class409 arg4, int arg5) {
        field1206++;
        if (arg1 != -17653) {
            this.method752((byte) 68);
        }
        class61[] var7 = null;
        class231 var8 = this.method749((byte) 41, arg5);
        if (var8.field2948 != null) {
            var7 = new class61[var8.field2948.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class431 var10 = arg4.method2428(var8.field2948[var9], -111);
                var7[var9] = new class61(var10.field6116, var10.field6112, var10.field6122, var10.field6115, var10.field6123, var10.field6113, var10.field6114, var10.field6110);
            }
        }
        return new class354(var8.field2950, var7, var8.field2949, arg2, arg0, arg3);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)V", line = 44)
    public static final void method748(byte arg0, int arg1) {
        field1213++;
        class153 var2 = class75.method656(4, 255, arg1);
        var2.method997((byte) 93);
        if (arg0 > -117) {
            field1217 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(BI)Lsc;", line = 58)
    private final class231 method749(byte arg0, int arg1) {
        field1211++;
        class449 var3 = this.field1215;
        class231 var4;
        synchronized (this.field1215) {
            var4 = (class231) this.field1215.method2647(-121, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field1208;
        byte[] var6;
        synchronized (this.field1208) {
            var6 = this.field1208.method481(29, arg1, arg0 - 127);
        }
        class231 var7 = new class231();
        if (var6 != null) {
            var7.method1403(-1, new class463(var6));
        }
        class449 var8 = this.field1215;
        synchronized (this.field1215) {
            this.field1215.method2635((long) arg1, -26591, var7);
        }
        return arg0 == 41 ? var7 : null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V", line = 90)
    public final void method750(boolean arg0) {
        field1216++;
        class449 var2 = this.field1215;
        synchronized (this.field1215) {
            this.field1215.method2640(92);
        }
        if (!arg0) {
            field1207 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[[[Lev;)V", line = 104)
    public static final void method751(int arg0, class490[][][] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class490[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class490 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field7131 instanceof class41) {
                            ((class41) var6.field7131).method191(27223);
                        }
                        if (var6.field7138 instanceof class41) {
                            ((class41) var6.field7138).method191(27223);
                        }
                        if (var6.field7137 instanceof class41) {
                            ((class41) var6.field7137).method191(27223);
                        }
                        if (var6.field7126 instanceof class41) {
                            ((class41) var6.field7126).method191(27223);
                        }
                        if (var6.field7130 instanceof class41) {
                            ((class41) var6.field7130).method191(27223);
                        }
                        for (class376 var7 = var6.field7127; var7 != null; var7 = var7.field4952) {
                            class205 var8 = var7.field4953;
                            if (var8 instanceof class41) {
                                ((class41) var8).method191(27223);
                            }
                        }
                    }
                }
            }
        }
        field1209++;
        if (arg0 > -47) {
            field1207 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 180)
    public final void method752(byte arg0) {
        field1203++;
        class449 var2 = this.field1215;
        synchronized (this.field1215) {
            int var3 = 81 % ((arg0 - 58) / 61);
            this.field1215.method2642(0);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V", line = 193)
    public static void method753(byte arg0) {
        field1207 = null;
        field1217 = null;
        if (arg0 >= -110) {
            field1217 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZII)V", line = 204)
    public static final void method754(boolean arg0, int arg1, int arg2) {
        if (arg2 < 12) {
            return;
        }
        field1212++;
        class529 var3 = class290.method1705(0, arg0, arg1);
        if (var3 != null) {
            var3.method2165(16225);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIBII)V", line = 220)
    public static final void method755(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var6 = -107 % ((37 - arg3) / 54);
        field1202++;
        int var7 = arg4 - arg2;
        int var8 = arg0 - arg1;
        if (var7 == 0) {
            if (var8 != 0) {
                class9.method50((byte) -110, arg1, arg0, arg2, arg5);
            }
        } else if (var8 == 0) {
            class413.method2443(arg5, true, arg1, arg4, arg2);
        } else {
            int var9 = (var8 << 12) / var7;
            int var10 = arg1 - (arg2 * var9 >> 12);
            int var11;
            int var12;
            if (class147.field1870 > arg4) {
                var12 = (class147.field1870 * var9 >> 12) + var10;
                var11 = class147.field1870;
            } else if (arg4 <= class237.field3019) {
                var11 = arg4;
                var12 = arg0;
            } else {
                var11 = class237.field3019;
                var12 = var10 + (class237.field3019 * var9 >> 12);
            }
            int var13;
            int var14;
            if (class147.field1870 > arg2) {
                var13 = (class147.field1870 * var9 >> 12) + var10;
                var14 = class147.field1870;
            } else if (arg2 <= class237.field3019) {
                var13 = arg1;
                var14 = arg2;
            } else {
                var14 = class237.field3019;
                var13 = (class237.field3019 * var9 >> 12) + var10;
            }
            if (var13 < class533.field7845) {
                var14 = (class533.field7845 - var10 << 12) / var9;
                var13 = class533.field7845;
            } else if (var13 > class289.field3694) {
                var14 = (class289.field3694 - var10 << 12) / var9;
                var13 = class289.field3694;
            }
            if (class533.field7845 > var12) {
                var12 = class533.field7845;
                var11 = (class533.field7845 - var10 << 12) / var9;
            } else if (var12 > class289.field3694) {
                var11 = (class289.field3694 - var10 << 12) / var9;
                var12 = class289.field3694;
            }
            class53.method526(false, var13, var12, var14, var11, arg5);
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(BI)V", line = 325)
    public final void method756(byte arg0, int arg1) {
        class449 var3 = this.field1215;
        synchronized (this.field1215) {
            int var4 = -35 % ((-arg0 - 20) / 40);
            this.field1215.method2648(false, arg1);
        }
        field1218++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)I", line = 340)
    public static final int method757(int arg0, byte arg1) {
        field1205++;
        if (arg1 != -40) {
            return -84;
        } else if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lae;ILqn;)V", line = 378)
    public class100(class165 arg0, int arg1, class47 arg2) {
        this.field1208 = arg2;
        this.field1208.method469(30322, 29);
    }
}
