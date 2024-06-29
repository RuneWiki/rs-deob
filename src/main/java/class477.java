import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class477 extends class115 {

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public int field7029;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public int field7032;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "Ljava/lang/String;")
    public String field7028;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "Ljava/lang/String;")
    public String field7037;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public int field7039;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
    public int field7038;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "Z")
    public boolean field7036;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public int field7034;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "J")
    public long field7030;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "Z")
    public boolean field7027;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "Laa;")
    public static class76 field7031 = new class76(34, 4);

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    public static int field7040 = 0;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
    public static void method2840(int arg0) {
        field7031 = null;
        if (arg0 != 25015) {
            field7040 = -2;
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V")
    public static final void method2841(int arg0) {
        field7035++;
        class520.field7639.method2287(arg0 + 86);
        class334.field5170.method2287(114);
        class510.field7491.method2287(arg0 + 90);
        class179.field2643.method2287(119);
        if (arg0 != 10) {
            method2842(null, false, -30);
        }
        class81.field1152.method2287(71);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lvi;ZI)V")
    public static final void method2842(class480 arg0, boolean arg1, int arg2) {
        field7033++;
        if (class448.field6610 >= 400) {
            return;
        }
        if (class410.field6198 != arg0) {
            String var9;
            if (~arg0.field7108 == arg2) {
                boolean var3 = true;
                if (class410.field6198.field7075 != -1 && arg0.field7075 != -1) {
                    int var4 = class410.field6198.field7091 <= arg0.field7091 ? arg0.field7091 : class410.field6198.field7091;
                    int var5 = arg0.field7075 > class410.field6198.field7075 ? class410.field6198.field7075 : arg0.field7075;
                    int var6 = (var4 * 10 / 100) + var5 + 5;
                    int var7 = class410.field6198.field7091 - arg0.field7091;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var7 > var6) {
                        var3 = false;
                    }
                }
                String var8 = class251.field3433 == class214.field3057 ? class71.field961.method2103(class30.field430, (byte) 34) : class364.field5562.method2103(class30.field430, (byte) 34);
                if (arg0.field7082 <= arg0.field7091) {
                    var9 = arg0.method2864(arg2 - 9475, true) + (var3 ? class352.method2132(arg0.field7091, class410.field6198.field7091, 62) : "<col=ffffff>") + " (" + var8 + arg0.field7091 + ")";
                } else {
                    var9 = arg0.method2864(arg2 ^ 0x2503, true) + (var3 ? class352.method2132(arg0.field7091, class410.field6198.field7091, 118) : "<col=ffffff>") + " (" + var8 + arg0.field7091 + "+" + (arg0.field7082 - arg0.field7091) + ")";
                }
            } else {
                var9 = arg0.method2864(-9476, true) + " (" + class333.field5162.method2103(class30.field430, (byte) 34) + arg0.field7108 + ")";
            }
            if (class302.field4504) {
                if (!arg1 && (class20.field303 & 0x8) != 0) {
                    class184.field2718++;
                    class393.method2363(0, class310.field4810, class112.field1718, false, 0, -1, class203.field2970 + " -> <col=ffffff>" + var9, 0, (long) arg0.field6015, true, 25);
                }
            } else if (arg1) {
                class393.method2363(0, "<col=cccccc>" + var9, -1, true, 0, 0, "", 0, 0L, false, -1);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class251.field3429[var10] != null) {
                        short var12 = 0;
                        if (class488.field7276 == class251.field3433 && class251.field3429[var10].equalsIgnoreCase(class256.field3474.method2103(class30.field430, (byte) 34))) {
                            if (class410.field6198.field7091 < arg0.field7091) {
                                var12 = 2000;
                            }
                            if (class410.field6198.field7076 != 0 && arg0.field7076 != 0) {
                                if (class410.field6198.field7076 == arg0.field7076) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class234.field3295[var10]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class9.field79[var10] + var12);
                        int var14 = class42.field549[var10] == -1 ? class224.field3171 : class42.field549[var10];
                        class301.field4478++;
                        class393.method2363(0, class251.field3429[var10], var14, false, 0, -1, "<col=ffffff>" + var9, 0, (long) arg0.field6015, true, var13);
                    }
                }
            }
            if (!arg1) {
                for (class477 var11 = (class477) class154.field2334.method2957(arg2 ^ 0xFFFFFF85); var11 != null; var11 = (class477) class154.field2334.method2947(85)) {
                    if (var11.field7034 == 4) {
                        var11.field7037 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class302.field4504 && (class20.field303 & 0x10) != 0) {
            class102.field1545++;
            class393.method2363(0, class310.field4810, class112.field1718, false, ~arg2, -1, class203.field2970 + " -> <col=ffffff>" + class436.field6434.method2103(class30.field430, (byte) 34), 0, 0L, true, 2);
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class477(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field7029 = arg7;
        this.field7032 = arg2;
        this.field7028 = arg0;
        this.field7037 = arg1;
        this.field7039 = arg6;
        this.field7038 = arg4;
        this.field7036 = arg8;
        this.field7034 = arg3;
        this.field7030 = arg5;
        this.field7027 = arg9;
    }
}
