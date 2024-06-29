import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class18 extends class452 {

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "Lbb;")
    public class270 field197 = new class270();

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "Lta;")
    public class292 field210 = new class292();

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "La;")
    private class229 field191;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "Ljava/lang/String;")
    public static String field199 = null;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field194 = 0;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "Llb;")
    public static class162 field203 = new class162();

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "Z")
    public static boolean field208 = false;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "Lhq;")
    public static class365 field209 = new class365(4);

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILqi;Z)V", line = 9)
    private final void method103(int arg0, class339 arg1, boolean arg2) {
        field192++;
        if ((this.field191.field2928[arg1.field4628] & 0x4) != 0 && arg1.field4615 < 0) {
            int var4 = this.field191.field2890[arg1.field4628] / class247.field3267;
            int var5 = (var4 + 1048575 - arg1.field4620) / var4;
            arg1.field4620 = arg0 * var4 + arg1.field4620 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field191.field2895[arg1.field4628] == 0) {
                    arg1.field4618 = class77.method477(arg1.field4622, arg1.field4618.method495(), arg1.field4618.method497(), arg1.field4618.method461());
                } else {
                    arg1.field4618 = class77.method477(arg1.field4622, arg1.field4618.method495(), 0, arg1.field4618.method461());
                    this.field191.method1425(arg1, arg1.field4624.field2019[arg1.field4627] < 0, 112);
                }
                if (arg1.field4624.field2019[arg1.field4627] < 0) {
                    arg1.field4618.method488(-1);
                }
                arg0 = arg1.field4620 / var4;
            }
        }
        if (arg2) {
            field194 = -17;
        }
        arg1.field4618.method108(arg0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)Lbd;", line = 49)
    public static final class125 method104(int arg0, byte arg1) {
        field206++;
        class125 var2 = (class125) class267.field3452.method648(1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class310.field4192.method1794(5860, 19, arg0);
        if (arg1 != -122) {
            return null;
        }
        class125 var4 = new class125();
        if (var3 != null) {
            var4.method811(new class242(var3), arg1 + 121);
        }
        class267.field3452.method643((long) arg0, var4, (byte) 122);
        return var4;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V", line = 73)
    public static final void method105(byte arg0) {
        if (arg0 > -8) {
            method113(20, (String) null);
        }
        while (class215.field2658.method2170(class134.field1533, 7329) >= 27) {
            int var1 = class215.field2658.method2171(15, 103);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class220.field2726[var1] == null) {
                class220.field2726[var1] = new class298();
                class220.field2726[var1].field2445 = var1;
                var2 = true;
            }
            class298 var3 = class220.field2726[var1];
            class437.field5984[class106.field1263++] = var1;
            var3.field2427 = class106.field1273;
            if (var3.field3971 != null && var3.field3971.method1957(true)) {
                class344.method2192(0, var3);
            }
            int var4 = class215.field2658.method2171(5, 94);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class215.field2658.method2171(3, 79) + 4 << 11 & 0x38A8;
            int var6 = class215.field2658.method2171(5, 126);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class215.field2658.method2171(1, 96);
            if (var7 == 1) {
                class332.field4530[class341.field4651++] = var1;
            }
            var3.method1888(class225.method1387(class215.field2658.method2171(14, 94), (byte) -126), 8);
            int var8 = class215.field2658.method2171(1, 115);
            var3.method1252(var3.field3971.field4106, 1);
            var3.field2421 = var3.field3971.field4127 << 3;
            if (var3.field2421 == 0) {
                var3.method1254((byte) 22, 0);
            } else if (var2) {
                var3.method1254((byte) 22, var5);
            }
            var3.method1258(var8 == 1, var3.method841(true), -1, class143.field1684.field2482[0] + var6, class43.field513, class143.field1684.field2480[0] + var4);
            if (var3.field3971.method1957(true)) {
                class378.method2351(0, (class131) null, (byte) -6, (class446) null, var3, class43.field513, var3.field2480[0], var3.field2482[0]);
            }
        }
        field201++;
        class215.field2658.method2168(127);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZB)V", line = 150)
    public static final void method106(boolean arg0, byte arg1) {
        if (arg1 != 67) {
            field194 = -25;
        }
        class391.method2433((byte) -26, class39.field457, class366.field4983, class28.field315, arg0);
        field205++;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "()I", line = 163)
    public final int method107() {
        field202++;
        return 0;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 175)
    public final void method108(int arg0) {
        this.field210.method108(arg0);
        field198++;
        for (class339 var2 = (class339) this.field197.method1690((byte) -123); var2 != null; var2 = (class339) this.field197.method1699((byte) 123)) {
            if (!this.field191.method1401(-11612, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field4613 >= var3) {
                        this.method103(var3, var2, false);
                        var2.field4613 -= var3;
                        break;
                    }
                    this.method103(var2.field4613, var2, false);
                    var3 -= var2.field4613;
                } while (!this.field191.method1429(var3, var2, (byte) 85, (int[]) null, 0));
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "()Ltf;", line = 211)
    public final class452 method109() {
        field195++;
        class339 var1;
        do {
            var1 = (class339) this.field197.method1699((byte) 47);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4618 == null);
        return var1.field4618;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILqi;I[I)V", line = 232)
    private final void method110(int arg0, int arg1, int arg2, class339 arg3, int arg4, int[] arg5) {
        field204++;
        if ((this.field191.field2928[arg3.field4628] & 0x4) != 0 && arg3.field4615 < 0) {
            int var7 = this.field191.field2890[arg3.field4628] / class247.field3267;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field4620) / var7;
                if (var8 > arg1) {
                    arg3.field4620 += arg1 * var7;
                    break;
                }
                arg3.field4618.method112(arg5, arg4, var8);
                arg4 += var8;
                arg3.field4620 += var7 * var8 - 1048576;
                arg1 -= var8;
                int var9 = class247.field3267 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class77 var11 = arg3.field4618;
                if (this.field191.field2895[arg3.field4628] == 0) {
                    arg3.field4618 = class77.method477(arg3.field4622, var11.method495(), var11.method497(), var11.method461());
                } else {
                    arg3.field4618 = class77.method477(arg3.field4622, var11.method495(), 0, var11.method461());
                    this.field191.method1425(arg3, arg3.field4624.field2019[arg3.field4627] < 0, 78);
                    arg3.field4618.method467(var9, var11.method497());
                }
                if (arg3.field4624.field2019[arg3.field4627] < 0) {
                    arg3.field4618.method488(-1);
                }
                var11.method470(var9);
                var11.method112(arg5, arg4, arg0 - arg4);
                if (var11.method464()) {
                    this.field210.method1869(var11);
                }
            }
        }
        arg3.field4618.method112(arg5, arg4, arg1);
        if (arg2 >= -78) {
            method113(5, (String) null);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V", line = 294)
    public static void method111(boolean arg0) {
        field199 = null;
        field209 = null;
        if (arg0) {
            field203 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([III)V", line = 306)
    public final void method112(int[] arg0, int arg1, int arg2) {
        field207++;
        this.field210.method112(arg0, arg1, arg2);
        for (class339 var4 = (class339) this.field197.method1690((byte) -113); var4 != null; var4 = (class339) this.field197.method1699((byte) 87)) {
            if (!this.field191.method1401(-11612, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field4613 >= var5) {
                        this.method110(var6 + var5, var5, -82, var4, var6, arg0);
                        var4.field4613 -= var5;
                        break;
                    }
                    this.method110(var6 + var5, var4.field4613, -96, var4, var6, arg0);
                    var6 += var4.field4613;
                    var5 -= var4.field4613;
                } while (!this.field191.method1429(var5, var4, (byte) 101, arg0, var6));
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;)V", line = 348)
    public static final void method113(int arg0, String arg1) {
        field196++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class405.method2524((byte) 75, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class368.field5019; var3++) {
            String var4 = class319.field4290[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class405.method2524((byte) -52, var4);
            if (var5 != null && var5.equals(var2)) {
                class368.field5019--;
                for (int var6 = var3; var6 < class368.field5019; var6++) {
                    class319.field4290[var6] = class319.field4290[var6 + 1];
                    class453.field6480[var6] = class453.field6480[var6 + 1];
                    class89.field1026[var6] = class89.field1026[var6 + 1];
                    class195.field2322[var6] = class195.field2322[var6 + 1];
                    class361.field4893[var6] = class361.field4893[var6 + 1];
                }
                class87.field1003++;
                class424.field5812 = class383.field5246;
                class427.field5837.method2162(false, 94);
                class427.field5837.method1593(class350.method2229(2, arg1), -103);
                class427.field5837.method1562(-78, arg1);
                break;
            }
        }
        if (arg0 < 11) {
            field199 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()Ltf;", line = 413)
    public final class452 method114() {
        field200++;
        class339 var1 = (class339) this.field197.method1690((byte) -122);
        if (var1 == null) {
            return null;
        } else if (var1.field4618 == null) {
            return this.method109();
        } else {
            return var1.field4618;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Laq;B)V", line = 432)
    public static final void method115(class453 arg0, byte arg1) {
        if (arg1 > 77) {
            field193++;
            if (arg0.field6383 == 5 && arg0.field6358 != -1) {
                class450.method2787(arg0, 117, class267.field3454);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(La;)V", line = 469)
    public class18(class229 arg0) {
        this.field191 = arg0;
    }
}
