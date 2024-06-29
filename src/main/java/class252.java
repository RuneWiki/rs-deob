import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class252 extends class198 {

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "Lth;")
    public class55 field3954 = new class55();

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "Lla;")
    public class192 field3955 = new class192();

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "Lpg;")
    private class319 field3949;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "[Lrn;")
    public static class294[] field3943 = new class294[14];

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "Lbm;")
    public static class307 field3945;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lfe;I[IIII)V", line = 9)
    private final void method1694(class153 arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5) {
        if ((this.field3949.field4830[arg0.field2481] & 0x4) != 0 && arg0.field2484 < 0) {
            int var7 = this.field3949.field4839[arg0.field2481] / class303.field4596;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field2483) / var7;
                if (arg1 < var8) {
                    arg0.field2483 += arg1 * var7;
                    break;
                }
                arg1 -= var8;
                arg0.field2491.method1227(arg2, arg4, var8);
                arg0.field2483 += var7 * var8 - 1048576;
                arg4 += var8;
                int var9 = 262144 / var7;
                int var10 = class303.field4596 / 100;
                if (var9 < var10) {
                    var10 = var9;
                }
                class315 var11 = arg0.field2491;
                if (this.field3949.field4857[arg0.field2481] == 0) {
                    arg0.field2491 = class315.method2152(arg0.field2496, var11.method2172(), var11.method2147(), var11.method2174());
                } else {
                    arg0.field2491 = class315.method2152(arg0.field2496, var11.method2172(), 0, var11.method2174());
                    this.field3949.method2227(arg0.field2499.field3747[arg0.field2486] < 0, true, arg0);
                    arg0.field2491.method2176(var10, var11.method2147());
                }
                if (arg0.field2499.field3747[arg0.field2486] < 0) {
                    arg0.field2491.method2162(-1);
                }
                var11.method2140(var10);
                var11.method1227(arg2, arg4, arg5 - arg4);
                if (var11.method2150()) {
                    this.field3955.method1229(var11);
                }
            }
        }
        field3956++;
        arg0.field2491.method1227(arg2, arg4, arg1);
        if (arg3 != 4011) {
            field3946 = -52;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()Laj;", line = 73)
    public final class198 method1235() {
        field3953++;
        class153 var1;
        do {
            var1 = (class153) this.field3954.method425(-32547);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2491 == null);
        return var1.field2491;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBLfe;)V", line = 93)
    private final void method1695(int arg0, byte arg1, class153 arg2) {
        if ((this.field3949.field4830[arg2.field2481] & 0x4) != 0 && arg2.field2484 < 0) {
            int var4 = this.field3949.field4839[arg2.field2481] / class303.field4596;
            int var5 = (var4 + 1048575 - arg2.field2483) / var4;
            arg2.field2483 = arg0 * var4 + arg2.field2483 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field3949.field4857[arg2.field2481] == 0) {
                    arg2.field2491 = class315.method2152(arg2.field2496, arg2.field2491.method2172(), arg2.field2491.method2147(), arg2.field2491.method2174());
                } else {
                    arg2.field2491 = class315.method2152(arg2.field2496, arg2.field2491.method2172(), 0, arg2.field2491.method2174());
                    this.field3949.method2227(arg2.field2499.field3747[arg2.field2486] < 0, true, arg2);
                }
                if (arg2.field2499.field3747[arg2.field2486] < 0) {
                    arg2.field2491.method2162(-1);
                }
                arg0 = arg2.field2483 / var4;
            }
        }
        field3941++;
        if (arg1 != -16) {
            method1696((byte) 105);
        }
        arg2.field2491.method1228(arg0);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()I", line = 135)
    public final int method1233() {
        field3948++;
        return 0;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(B)V", line = 146)
    public static final void method1696(byte arg0) {
        field3952++;
        if (class41.field797 != null) {
            class41.field797.method1496(false);
        }
        if (class328.field5033 != null) {
            class328.field5033.method1496(false);
        }
        class21.method172(22050, 2, class191.field3110, -2603);
        class41.field797 = class23.method194(22050, class216.field3456, 0, class177.field2849, 116);
        class41.field797.method1492((byte) 81, class305.field4613);
        class328.field5033 = class23.method194(2048, class216.field3456, 1, class177.field2849, 117);
        class328.field5033.method1492((byte) 77, class11.field230);
        if (arg0 <= 1) {
            field3942 = -104;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([III)V", line = 181)
    public final void method1227(int[] arg0, int arg1, int arg2) {
        field3940++;
        this.field3955.method1227(arg0, arg1, arg2);
        for (class153 var4 = (class153) this.field3954.method424(-47); var4 != null; var4 = (class153) this.field3954.method425(-32547)) {
            if (!this.field3949.method2202(var4, 96)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field2493 >= var6) {
                        this.method1694(var4, var6, arg0, 4011, var5, var5 + var6);
                        var4.field2493 -= var6;
                        break;
                    }
                    this.method1694(var4, var4.field2493, arg0, 4011, var5, var5 + var6);
                    var5 += var4.field2493;
                    var6 -= var4.field2493;
                } while (!this.field3949.method2205(arg0, (byte) -70, var5, var4, var6));
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()Laj;", line = 219)
    public final class198 method1234() {
        field3947++;
        class153 var1 = (class153) this.field3954.method424(-124);
        if (var1 == null) {
            return null;
        } else if (var1.field2491 == null) {
            return this.method1235();
        } else {
            return var1.field2491;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 237)
    public final void method1228(int arg0) {
        this.field3955.method1228(arg0);
        field3950++;
        for (class153 var2 = (class153) this.field3954.method424(-61); var2 != null; var2 = (class153) this.field3954.method425(-32547)) {
            if (!this.field3949.method2202(var2, -105)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2493) {
                        this.method1695(var3, (byte) -16, var2);
                        var2.field2493 -= var3;
                        break;
                    }
                    this.method1695(var2.field2493, (byte) -16, var2);
                    var3 -= var2.field2493;
                } while (!this.field3949.method2205((int[]) null, (byte) -58, 0, var2, var3));
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lpg;)V", line = 289)
    public class252(class319 arg0) {
        this.field3949 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(B)V", line = 275)
    public static void method1697(byte arg0) {
        field3945 = null;
        field3943 = null;
        if (arg0 > -99) {
            field3944 = -25;
        }
    }
}
