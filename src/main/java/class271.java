import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class271 extends class487 {

    @OriginalMember(owner = "client!es", name = "n", descriptor = "Lv;")
    private class165 field3906 = new class165();

    @OriginalMember(owner = "client!es", name = "F", descriptor = "I")
    private int field3924 = 256;

    @OriginalMember(owner = "client!es", name = "G", descriptor = "I")
    private int field3925 = 256;

    @OriginalMember(owner = "client!es", name = "J", descriptor = "I")
    private int field3928 = 0;

    @OriginalMember(owner = "client!es", name = "p", descriptor = "I")
    private int field3908;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!es", name = "s", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!es", name = "t", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!es", name = "u", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!es", name = "w", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!es", name = "x", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!es", name = "y", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!es", name = "z", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!es", name = "A", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!es", name = "B", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!es", name = "C", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!es", name = "D", descriptor = "I")
    private int field3922;

    @OriginalMember(owner = "client!es", name = "H", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!es", name = "I", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!es", name = "K", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!es", name = "E", descriptor = "Z")
    private boolean field3923;

    @OriginalMember(owner = "client!es", name = "L", descriptor = "Z")
    private boolean field3930;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ZI)V", line = 5)
    public final synchronized void method1759(boolean arg0, int arg1) {
        this.field3930 = arg0;
        field3914++;
        if (arg1 != -7906) {
            this.method615();
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)D", line = 22)
    public final synchronized double method1760(int arg0) {
        field3915++;
        if (this.field3928 < 1) {
            return -1.0D;
        }
        class593 var2 = (class593) this.field3906.method1041(1048832);
        if (var2 == null) {
            return -1.0D;
        } else {
            if (arg0 != 0) {
                field3916 = -35;
            }
            return (double) (-((float) var2.field8349[0].length / (float) class223.field3174)) + var2.field8346;
        }
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "()I", line = 41)
    public final int method613() {
        field3912++;
        return 1;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "()Lqp;", line = 51)
    public final class487 method614() {
        field3919++;
        return null;
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(I)Lbu;", line = 60)
    private final synchronized class593 method1761(int arg0) {
        field3910++;
        if (arg0 != -1) {
            this.field3906 = null;
        }
        return (class593) this.field3906.method1041(1048832);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V", line = 75)
    public final void method1762(int arg0, int arg1) {
        field3917++;
        this.field3924 = arg1;
        if (arg0 == 1) {
            this.field3925 = arg1;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z[[[BIBIIZ)V", line = 88)
    public static final void method1763(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class74.field827 = 0;
        class565.field7980 = 0;
        class433.field6016++;
        if ((arg5 & 0x2) == 0) {
            for (class230 var8 = class226.field3436[var7]; var8 != null; var8 = var8.field3455) {
                if (!class88.method657(var8, arg0, arg1, arg2, arg3)) {
                    class351.method2212(var8);
                    if (var8.field3471 != -1) {
                        class112.field1361[class74.field827++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 0x1) == 0) {
            for (class230 var9 = class689.field9618[var7]; var9 != null; var9 = var9.field3455) {
                if (!class88.method657(var9, arg0, arg1, arg2, arg3)) {
                    class351.method2212(var9);
                    if (var9.field3471 != -1) {
                        class728.field10067[class565.field7980++] = var9;
                    }
                }
            }
            for (class230 var10 = class289.field4265[var7]; var10 != null; var10 = var10.field3455) {
                if (!class88.method657(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method80(101)) {
                        class351.method2212(var10);
                        if (var10.field3471 != -1) {
                            class728.field10067[class565.field7980++] = var10;
                        }
                    } else {
                        class351.method2212(var10);
                        if (var10.field3471 != -1) {
                            class112.field1361[class74.field827++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class586.field8275; var11++) {
                    if (!class88.method657(class313.field4484[var11], arg0, arg1, arg2, arg3)) {
                        class351.method2212(class313.field4484[var11]);
                        if (class313.field4484[var11].field3471 != -1) {
                            if (class313.field4484[var11].method80(97)) {
                                class728.field10067[class565.field7980++] = class313.field4484[var11];
                            } else {
                                class112.field1361[class74.field827++] = class313.field4484[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class74.field827 > 0) {
            class717.method4010(class112.field1361, 0, class74.field827 - 1);
            for (int var12 = 0; var12 < class74.field827; var12++) {
                class484.method2874(class112.field1361[var12], true, arg6);
            }
        }
        if (class449.field6283) {
            class139.field1781.method163(0, null);
        }
        if ((arg5 & 0x2) == 0) {
            for (int var13 = class157.field2036; var13 < class266.field3869; var13++) {
                if (var13 < arg2 || arg1 == null) {
                    int var23 = class592.field8338.length;
                    if (class592.field8338.length + class379.field5432 > class414.field5796) {
                        var23 -= class592.field8338.length + class379.field5432 - class414.field5796;
                    }
                    int var24 = class592.field8338[0].length;
                    if (class592.field8338[0].length + class583.field8251 > class704.field9799) {
                        var24 -= class592.field8338[0].length + class583.field8251 - class704.field9799;
                    }
                    boolean[][] var25 = class450.field6289;
                    if (class595.field8359) {
                        if (class753.field10384) {
                            var25 = class158.field2049[var13];
                        }
                        for (int var26 = class342.field4967; var26 < var23; var26++) {
                            int var27 = class379.field5432 + var26 - class342.field4967;
                            for (int var28 = class244.field3618; var28 < var24; var28++) {
                                if (class592.field8338[var26][var28] && !class322.method2044(var27, class583.field8251 + var28 - class244.field3618, var13, 1)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class753.field10384) {
                        if (arg4 >= 0) {
                            class661.field9303[var13].method1373(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class661.field9303[var13].method1374(0, 0, 0, null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class749.field10337; var29++) {
                            class393.field5594[var29].method3306(new class129(var13 + 1), 99);
                        }
                    } else if (arg4 >= 0) {
                        class661.field9303[var13].method1373(class591.field8336, class112.field1363, class270.field3904, class450.field6289, true, arg4, arg5);
                    } else {
                        class661.field9303[var13].method1374(class591.field8336, class112.field1363, class270.field3904, class450.field6289, true, arg5);
                    }
                } else {
                    int var14 = class592.field8338.length;
                    if (class592.field8338.length + class379.field5432 > class414.field5796) {
                        var14 -= class592.field8338.length + class379.field5432 - class414.field5796;
                    }
                    int var15 = class592.field8338[0].length;
                    if (class592.field8338[0].length + class583.field8251 > class704.field9799) {
                        var15 -= class592.field8338[0].length + class583.field8251 - class704.field9799;
                    }
                    boolean[][] var16 = class450.field6289;
                    if (class595.field8359) {
                        if (class753.field10384) {
                            var16 = class158.field2049[var13];
                        }
                        for (int var17 = class342.field4967; var17 < var14; var17++) {
                            int var18 = class379.field5432 + var17 - class342.field4967;
                            for (int var19 = class244.field3618; var19 < var15; var19++) {
                                var16[var17][var19] = false;
                                if (class592.field8338[var17][var19]) {
                                    int var20 = class583.field8251 + var19 - class244.field3618;
                                    for (int var21 = var13; var21 >= 0; var21--) {
                                        if (class59.field688[var21][var18][var20] != null && class59.field688[var21][var18][var20].field6546 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class322.method2044(var18, var20, var13, 1)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class753.field10384) {
                        if (arg4 >= 0) {
                            class661.field9303[var13].method1373(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class661.field9303[var13].method1374(0, 0, 0, null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class749.field10337; var22++) {
                            class393.field5594[var22].method3306(new class129(var13 + 1), 96);
                        }
                    } else if (arg4 >= 0) {
                        class661.field9303[var13].method1373(class591.field8336, class112.field1363, class270.field3904, class450.field6289, false, arg4, arg5);
                    } else {
                        class661.field9303[var13].method1374(class591.field8336, class112.field1363, class270.field3904, class450.field6289, false, arg5);
                    }
                }
            }
        }
        if (class565.field7980 > 0) {
            class595.method3468(class728.field10067, 0, class565.field7980 - 1);
            for (int var30 = 0; var30 < class565.field7980; var30++) {
                class484.method2874(class728.field10067[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V", line = 391)
    public final synchronized void method1764(byte arg0) {
        field3927++;
        if (arg0 <= 6) {
            this.field3923 = false;
        }
        this.field3923 = true;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(DIZ)Lbu;", line = 402)
    public final class593 method1765(double arg0, int arg1, boolean arg2) {
        field3918++;
        if (!arg2) {
            return null;
        }
        long var5 = (long) (this.field3908 << 0 | arg1);
        class593 var7 = (class593) class113.field1369.method1800(-1, var5);
        if (var7 == null) {
            var7 = new class593(new short[this.field3908][arg1], arg0);
        } else {
            var7.field8346 = arg0;
            class113.field1369.method1798(var5, 18630);
        }
        return var7;
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(I)V", line = 617)
    public class271(int arg0) {
        this.field3908 = arg0;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lbu;B)V", line = 433)
    public final synchronized void method1766(class593 arg0, byte arg1) {
        if (arg1 < 41) {
            return;
        }
        field3921++;
        while (this.field3928 >= 100) {
            this.field3906.method1034(20791);
            this.field3928--;
        }
        this.field3906.method1039(arg0, 0);
        this.field3928++;
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "()Lqp;", line = 453)
    public final class487 method615() {
        field3909++;
        return null;
    }

    @OriginalMember(owner = "client!es", name = "g", descriptor = "(I)V", line = 469)
    private final synchronized void method1767(int arg0) {
        field3929++;
        class593 var2 = this.method1761(arg0 - 1);
        if (var2 != null) {
            var2.method527(-11229);
            this.field3922 = arg0;
            this.field3928--;
            class113.field1369.method1799(var2, -1, var2.method3461(arg0 - 3402));
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V", line = 485)
    public final synchronized void method599(int arg0) {
        field3926++;
        if (this.field3930) {
            return;
        }
        while (true) {
            class593 var2 = this.method1761(-1);
            if (var2 == null) {
                if (this.field3923) {
                    this.method527(-11229);
                    class113.field1369.method1801(-39);
                }
                return;
            }
            if (arg0 < var2.field8349[0].length - this.field3922) {
                this.field3922 += arg0;
                return;
            }
            arg0 -= var2.field8349[0].length - this.field3922;
            this.method1767(0);
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(B)V", line = 527)
    public static final void method1768(byte arg0) {
        if (arg0 == -70) {
            field3907++;
            class546.field7591 = true;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "([III)V", line = 538)
    public final synchronized void method604(int[] arg0, int arg1, int arg2) {
        field3913++;
        if (this.field3930) {
            return;
        }
        if (this.method1761(-1) != null) {
            int var4 = arg1 + arg2;
            if (class568.field8013) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field3908 == 2) {
                var6 = 1;
            }
            while (var4 > arg1) {
                class593 var7 = this.method1761(-1);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field8349;
                while (arg1 < var4 && var8[0].length > this.field3922) {
                    if (class568.field8013) {
                        arg0[arg1++] = var8[var5][this.field3922] * this.field3925;
                        arg0[arg1++] = var8[var6][this.field3922] * this.field3924;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field3922] * this.field3925 + var8[var6][this.field3922] * this.field3924;
                    }
                    this.field3922++;
                }
                if (this.field3922 >= var8[0].length) {
                    this.method1767(0);
                }
            }
        } else if (this.field3923) {
            this.method527(-11229);
            class113.field1369.method1801(117);
        }
    }

    @OriginalMember(owner = "client!es", name = "h", descriptor = "(I)I", line = 603)
    public final synchronized int method1769(int arg0) {
        if (arg0 != 0) {
            field3916 = -66;
        }
        field3920++;
        return this.field3928;
    }
}
