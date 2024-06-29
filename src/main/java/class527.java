import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class527 {

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "[I")
    public static int[] field7735 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field7734 = 0;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "Lao;")
    public static class191 field7737 = new class191(20, 6);

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field7739 = 0;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field7741 = -1;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "[Lqb;")
    public static class151[] field7742;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lwk;IIII)V")
    public static final void method3128(class96 arg0, int arg1, int arg2, int arg3, int arg4) {
        field7738++;
        if (arg4 != 0) {
            field7739 = 117;
        }
        class306 var5 = arg0.method547((byte) 117);
        int var6 = arg0.field1195 - arg0.field1231.field1382 & 0x3FFF;
        if (arg3 == -1) {
            if (var6 != 0 || arg0.field1244 > 25) {
                arg0.field1176 = false;
                if (arg2 < 0 && var5.field4102 != -1) {
                    arg0.field1216 = var5.field4102;
                } else if (arg2 <= 0 || var5.field4103 == -1) {
                    arg0.field1216 = var5.field4062;
                } else {
                    arg0.field1216 = var5.field4103;
                }
            } else if (!arg0.field1176 || !var5.method1825(arg0.field1216, 0)) {
                arg0.field1216 = var5.method1829(true);
                arg0.field1176 = arg0.field1216 != -1;
            }
        } else if (arg0.field1156 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class342.field4587[arg1] - arg0.field1231.field1382 & 0x3FFF;
            if (arg3 == 2 && var5.field4083 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4100 != -1) {
                    arg0.field1216 = var5.field4100;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4068 != -1) {
                    arg0.field1216 = var5.field4068;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4076 == -1) {
                    arg0.field1216 = var5.field4083;
                } else {
                    arg0.field1216 = var5.field4076;
                }
            } else if (arg3 == 0 && var5.field4093 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4056 != -1) {
                    arg0.field1216 = var5.field4056;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4087 != -1) {
                    arg0.field1216 = var5.field4087;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4071 == -1) {
                    arg0.field1216 = var5.field4093;
                } else {
                    arg0.field1216 = var5.field4071;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field4081 != -1) {
                arg0.field1216 = var5.field4081;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field4101 != -1) {
                arg0.field1216 = var5.field4101;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field4058 == -1) {
                arg0.field1216 = var5.field4062;
            } else {
                arg0.field1216 = var5.field4058;
            }
            arg0.field1176 = false;
        } else if (var6 == 0 && arg0.field1244 <= 25) {
            if (arg3 == 2 && var5.field4083 != -1) {
                arg0.field1216 = var5.field4083;
            } else if (arg3 == 0 && var5.field4093 != -1) {
                arg0.field1216 = var5.field4093;
            } else {
                arg0.field1216 = var5.field4062;
            }
            arg0.field1176 = false;
        } else {
            if (arg3 == 2 && var5.field4083 != -1) {
                if (arg2 < 0 && var5.field4082 != -1) {
                    arg0.field1216 = var5.field4082;
                } else if (arg2 <= 0 || var5.field4097 == -1) {
                    arg0.field1216 = var5.field4083;
                } else {
                    arg0.field1216 = var5.field4097;
                }
            } else if (arg3 == 0 && var5.field4093 != -1) {
                if (arg2 < 0 && var5.field4066 != -1) {
                    arg0.field1216 = var5.field4066;
                } else if (arg2 <= 0 || var5.field4072 == -1) {
                    arg0.field1216 = var5.field4093;
                } else {
                    arg0.field1216 = var5.field4072;
                }
            } else if (arg2 < 0 && var5.field4063 != -1) {
                arg0.field1216 = var5.field4063;
            } else if (arg2 <= 0 || var5.field4089 == -1) {
                arg0.field1216 = var5.field4062;
            } else {
                arg0.field1216 = var5.field4089;
            }
            arg0.field1176 = false;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III[B)Ljava/lang/String;")
    public static final String method3129(int arg0, int arg1, int arg2, byte[] arg3) {
        field7736++;
        char[] var4 = new char[arg0];
        int var5 = 0;
        if (arg1 != -161) {
            method3130(67);
        }
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg3[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class211.field2831[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
    public static void method3130(int arg0) {
        field7737 = null;
        field7735 = null;
        field7742 = null;
        if (arg0 != 6713) {
            method3129(85, -17, -34, null);
        }
    }
}
