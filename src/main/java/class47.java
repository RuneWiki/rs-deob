import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 extends class80 {

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "Lvf;")
    public class152 field1084 = new class152();

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "Lta;")
    public class133 field1093 = new class133();

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "Lke;")
    private class74 field1079;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field1071 = 0;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "Lv;")
    public static class146 field1078 = class159.method1226((byte) -37, "jolt");

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "[[I")
    public static int[][] field1081 = new int[104][104];

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public static int field1080 = 0;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public static int field1085 = 50;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field1088 = 0;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field1090 = 0;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field1087 = 0;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field1092 = 0;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
    public static void method321(int arg0) {
        field1081 = null;
        field1078 = null;
        if (arg0 != 8093) {
            field1087 = -61;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLla;)V")
    public static final void method322(byte arg0, class77 arg1) {
        if (arg0 != -45) {
            method327(56, (byte) -57);
        }
        class123.field2866 = arg1;
        field1086++;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
    public final void method323(int arg0) {
        field1082++;
        this.field1093.method323(arg0);
        for (class147 var2 = (class147) this.field1084.method1138(25852); var2 != null; var2 = (class147) this.field1084.method1142(1)) {
            if (!this.field1079.method542(var2, -115)) {
                int var3 = arg0;
                do {
                    if (var2.field3426 >= var3) {
                        this.method331(var3, 21483, var2);
                        var2.field3426 -= var3;
                        break;
                    }
                    this.method331(var2.field3426, 21483, var2);
                    var3 -= var2.field3426;
                } while (!this.field1079.method557(var2, 0, 0, var3, null));
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "()Lld;")
    public final class80 method324() {
        class147 var1 = (class147) this.field1084.method1138(25852);
        field1070++;
        if (var1 == null) {
            return null;
        } else if (var1.field3425 == null) {
            return this.method329();
        } else {
            return var1.field3425;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()I")
    public final int method325() {
        field1077++;
        return 0;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "([III)V")
    public final void method326(int[] arg0, int arg1, int arg2) {
        this.field1093.method326(arg0, arg1, arg2);
        field1074++;
        for (class147 var4 = (class147) this.field1084.method1138(25852); var4 != null; var4 = (class147) this.field1084.method1142(1)) {
            if (!this.field1079.method542(var4, -64)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field3426) {
                        this.method328(var5, var5 + var6, 0, var4, arg0, var6);
                        var4.field3426 -= var5;
                        break;
                    }
                    this.method328(var4.field3426, var6 + var5, 0, var4, arg0, var6);
                    var5 -= var4.field3426;
                    var6 += var4.field3426;
                } while (!this.field1079.method557(var4, var6, 0, var5, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)I")
    public static final int method327(int arg0, byte arg1) {
        int var2 = 0;
        if (arg1 <= 27) {
            method327(73, (byte) 98);
        }
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        field1089++;
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIILva;[II)V")
    private final void method328(int arg0, int arg1, int arg2, class147 arg3, int[] arg4, int arg5) {
        if (arg2 != 0) {
            field1081 = null;
        }
        field1073++;
        if ((this.field1079.field1773[arg3.field3398] & 0x4) != 0 && arg3.field3420 < 0) {
            int var7 = this.field1079.field1721[arg3.field3398] / class126.field2922;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field3418) / var7;
                if (arg0 < var8) {
                    arg3.field3418 += arg0 * var7;
                    break;
                }
                arg0 -= var8;
                arg3.field3425.method326(arg4, arg5, var8);
                arg3.field3418 += var7 * var8 - 1048576;
                int var9 = 262144 / var7;
                int var10 = class126.field2922 / 100;
                arg5 += var8;
                class84 var11 = arg3.field3425;
                if (var10 > var9) {
                    var10 = var9;
                }
                if (this.field1079.field1722[arg3.field3398] == 0) {
                    arg3.field3425 = class84.method654(arg3.field3397, var11.method656(), var11.method643(), var11.method660());
                } else {
                    arg3.field3425 = class84.method654(arg3.field3397, var11.method656(), 0, var11.method660());
                    this.field1079.method532(arg3.field3421.field3604[arg3.field3413] < 0, arg2 ^ 0xF707EC06, arg3);
                    arg3.field3425.method640(var10, var11.method643());
                }
                if (arg3.field3421.field3604[arg3.field3413] < 0) {
                    arg3.field3425.method644(-1);
                }
                var11.method645(var10);
                var11.method326(arg4, arg5, arg1 - arg5);
                if (var11.method658()) {
                    this.field1093.method997(var11);
                }
            }
        }
        arg3.field3425.method326(arg4, arg5, arg0);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()Lld;")
    public final class80 method329() {
        field1083++;
        class147 var1;
        do {
            var1 = (class147) this.field1084.method1142(1);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3425 == null);
        return var1.field3425;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILne;Lv;)I")
    public static final int method330(int arg0, class95 arg1, class146 arg2) {
        if (arg0 >= -125) {
            return -122;
        }
        field1076++;
        int var3 = arg1.field2304;
        arg1.method769(arg2.field3372, false);
        arg1.field2304 += class132.field3038.method229(arg1.field2304, arg2.field3372, arg2.field3365, (byte) 122, 0, arg1.field2320);
        return arg1.field2304 - var3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILva;)V")
    private final void method331(int arg0, int arg1, class147 arg2) {
        if (arg1 != 21483) {
            return;
        }
        field1091++;
        if ((this.field1079.field1773[arg2.field3398] & 0x4) != 0 && arg2.field3420 < 0) {
            int var4 = this.field1079.field1721[arg2.field3398] / class126.field2922;
            int var5 = (var4 + 1048575 - arg2.field3418) / var4;
            arg2.field3418 = arg0 * var4 + arg2.field3418 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field1079.field1722[arg2.field3398] == 0) {
                    arg2.field3425 = class84.method654(arg2.field3397, arg2.field3425.method656(), arg2.field3425.method643(), arg2.field3425.method660());
                } else {
                    arg2.field3425 = class84.method654(arg2.field3397, arg2.field3425.method656(), 0, arg2.field3425.method660());
                    this.field1079.method532(arg2.field3421.field3604[arg2.field3413] < 0, -150475770, arg2);
                }
                if (arg2.field3421.field3604[arg2.field3413] < 0) {
                    arg2.field3425.method644(-1);
                }
                arg0 = arg2.field3418 / var4;
            }
        }
        arg2.field3425.method323(arg0);
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lke;)V")
    public class47(class74 arg0) {
        this.field1079 = arg0;
    }
}
