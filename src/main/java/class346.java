import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class346 {

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Lhg;")
    public static class693 field4365 = new class693(36, 3);

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "[I")
    public static int[] field4368 = new int[1000];

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Lhg;")
    public static class693 field4367 = new class693(33, 3);

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Loea;")
    public static class599 field4369 = new class599();

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 3)
    public static void method1978(byte arg0) {
        if (arg0 >= -100) {
            method1981(-93, null);
        }
        field4369 = null;
        field4368 = null;
        field4365 = null;
        field4367 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIBIIIII)V", line = 16)
    public static final void method1979(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field4362++;
        if (!class525.method3039(4, arg3) || arg6 != 46) {
            return;
        }
        if (class416.field5300[arg3] == null) {
            client.method1835(class218.field2938[arg3], -1, arg9, arg10, arg5, arg4, arg7, arg0, arg11, arg1, arg8, arg2);
        } else {
            client.method1835(class416.field5300[arg3], -1, arg9, arg10, arg5, arg4, arg7, arg0, arg11, arg1, arg8, arg2);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILvl;)I", line = 36)
    public static final int method1980(int arg0, class13 arg1) {
        field4363++;
        if (arg1.field253 == 0) {
            return 0;
        }
        if (arg1.field221 != arg0) {
            class13 var2 = null;
            if (arg1.field221 < 32768) {
                class592 var3 = (class592) class207.field2745.method1160((long) arg1.field221, arg0 ^ 0xFFFFFF83);
                if (var3 != null) {
                    var2 = var3.field8280;
                }
            } else if (arg1.field221 >= 32768) {
                var2 = class5.field49[arg1.field221 - 32768];
            }
            if (var2 != null) {
                int var4 = arg1.field5801 - var2.field5801;
                int var5 = arg1.field5797 - var2.field5797;
                if (var4 != 0 || var5 != 0) {
                    arg1.method90((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, (byte) -18);
                }
            }
        }
        if (arg1 instanceof class724) {
            class724 var6 = (class724) arg1;
            if (var6.field10101 != -1 && (var6.field263 == 0 || var6.field268 > 0)) {
                var6.method90(var6.field10101, (byte) -18);
                var6.field10101 = -1;
            }
        } else if (arg1 instanceof class733) {
            class733 var7 = (class733) arg1;
            if (var7.field10203 != -1 && (var7.field263 == 0 || var7.field268 > 0)) {
                int var8 = var7.field5801 - ((var7.field10203 - class332.field4232 - class332.field4232) * 256);
                int var9 = var7.field5797 - (var7.field10191 - class447.field5936 - class447.field5936) * 256;
                if (var8 != 0 || var9 != 0) {
                    var7.method90((int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF, (byte) -18);
                }
                var7.field10203 = -1;
            }
        }
        return arg1.method98(-4413);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I[B)V", line = 115)
    public static final void method1981(int arg0, byte[] arg1) {
        field4364++;
        class461 var2 = new class461(arg1);
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = var2.method2600((byte) -124);
                if (var4 == 0) {
                    if (arg0 != 20810) {
                        return;
                    }
                    if (var3) {
                        return;
                    }
                    if (class701.field9746 == null) {
                        class701.field9746 = new int[4];
                        class614.field8485 = new int[4];
                        class729.field10150 = 4;
                    }
                    for (int var5 = 0; var5 < class701.field9746.length; var5++) {
                        class701.field9746[var5] = 0;
                        class614.field8485[var5] = var5 * 20;
                    }
                    return;
                }
                if (var4 == 1) {
                    if (class701.field9746 == null) {
                        class701.field9746 = new int[4];
                        class729.field10150 = 4;
                        class614.field8485 = new int[4];
                    }
                    var3 = true;
                    for (int var6 = 0; var6 < class701.field9746.length; var6++) {
                        class701.field9746[var6] = var2.method2577(2);
                        class614.field8485[var6] = var2.method2577(arg0 - 20808);
                    }
                } else if (var4 == 2) {
                    class180.field2534 = var2.method2566(arg0 ^ 0xFFFFAEB4);
                } else if (var4 == 3) {
                    class729.field10150 = var2.method2600((byte) -123);
                    class614.field8485 = new int[class729.field10150];
                    class701.field9746 = new int[class729.field10150];
                }
            }
        }
    }
}
