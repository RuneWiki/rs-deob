import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class11 extends class363 {

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "Lci;")
    public class327 field90 = new class327();

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "Lii;")
    public class303 field104 = new class303();

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "Lof;")
    private class222 field103;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "Ljava/lang/String;")
    public static String field93 = "Loading fonts - ";

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "Lsi;")
    public static class351 field91;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "[I")
    public static int[] field88;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()Ljk;", line = 6)
    public final class363 method43() {
        field95++;
        class357 var1 = (class357) this.field90.method2300((byte) 101);
        if (var1 == null) {
            return null;
        } else if (var1.field5649 == null) {
            return this.method47();
        } else {
            return var1.field5649;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V", line = 23)
    public static void method44(byte arg0) {
        field93 = null;
        int var1 = -102 % ((arg0 - 56) / 63);
        field88 = null;
        field91 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILwf;IZI)V", line = 35)
    public static final void method45(int arg0, class250 arg1, int arg2, boolean arg3, int arg4) {
        field101++;
        int var5 = arg1.field4081;
        if (arg1.field4206 == 0) {
            arg1.field4081 = arg1.field4200;
        } else if (arg1.field4206 == 1) {
            arg1.field4081 = arg2 - arg1.field4200;
        } else if (arg1.field4206 == 2) {
            arg1.field4081 = arg1.field4200 * arg2 >> 14;
        } else if (arg1.field4206 == 3) {
            if (arg1.field4078 == 2) {
                arg1.field4081 = (arg1.field4200 - 1) * arg1.field4169 + arg1.field4200 * 32;
            } else if (arg1.field4078 == 7) {
                arg1.field4081 = arg1.field4200 * 115 + ((arg1.field4200 - 1) * arg1.field4169);
            }
        }
        int var6 = arg1.field4157;
        if (arg1.field4202 == 0) {
            arg1.field4157 = arg1.field4113;
        } else if (arg1.field4202 == 1) {
            arg1.field4157 = arg4 - arg1.field4113;
        } else if (arg1.field4202 == 2) {
            arg1.field4157 = arg1.field4113 * arg4 >> 14;
        } else if (arg1.field4202 == 3) {
            if (arg1.field4078 == 2) {
                arg1.field4157 = arg1.field4113 * 32 + ((arg1.field4113 - 1) * arg1.field4196);
            } else if (arg1.field4078 == 7) {
                arg1.field4157 = (arg1.field4113 - 1) * arg1.field4196 + arg1.field4113 * 12;
            }
        }
        if (arg1.field4206 == 4) {
            arg1.field4081 = arg1.field4226 * arg1.field4157 / arg1.field4215;
        }
        if (arg1.field4202 == 4) {
            arg1.field4157 = arg1.field4215 * arg1.field4081 / arg1.field4226;
        }
        if (arg0 >= -76) {
            method45(118, (class250) null, -62, false, 69);
        }
        if (class178.field2857 && (client.method336(arg1).field1710 != 0 || arg1.field4078 == 0)) {
            if (arg1.field4157 < 5 && arg1.field4081 < 5) {
                arg1.field4081 = 5;
                arg1.field4157 = 5;
            } else {
                if (arg1.field4157 <= 0) {
                    arg1.field4157 = 5;
                }
                if (arg1.field4081 <= 0) {
                    arg1.field4081 = 5;
                }
            }
        }
        if (arg1.field4134 == 1337) {
            class14.field153 = arg1;
        }
        if (arg3 && arg1.field4164 != null && (arg1.field4081 != var5 || arg1.field4157 != var6)) {
            class40 var7 = new class40();
            var7.field593 = arg1;
            var7.field581 = arg1.field4164;
            class300.field4829.method2302((byte) -106, var7);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "()I", line = 137)
    public final int method46() {
        field97++;
        return 0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()Ljk;", line = 148)
    public final class363 method47() {
        field98++;
        class357 var1;
        do {
            var1 = (class357) this.field90.method2306(-23);
            if (var1 == null) {
                return null;
            }
        } while (var1.field5649 == null);
        return var1.field5649;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILsa;II[II)V", line = 171)
    private final void method48(int arg0, class357 arg1, int arg2, int arg3, int[] arg4, int arg5) {
        if ((this.field103.field3616[arg1.field5662] & 0x4) != 0 && arg1.field5660 < 0) {
            int var7 = this.field103.field3669[arg1.field5662] / class227.field3788;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field5671) / var7;
                if (var8 > arg2) {
                    arg1.field5671 += arg2 * var7;
                    break;
                }
                int var9 = 262144 / var7;
                arg2 -= var8;
                arg1.field5649.method53(arg4, arg0, var8);
                arg1.field5671 += var7 * var8 - 1048576;
                int var10 = class227.field3788 / 100;
                arg0 += var8;
                if (var10 > var9) {
                    var10 = var9;
                }
                class139 var11 = arg1.field5649;
                if (this.field103.field3663[arg1.field5662] == 0) {
                    arg1.field5649 = class139.method1071(arg1.field5655, var11.method1047(), var11.method1054(), var11.method1058());
                } else {
                    arg1.field5649 = class139.method1071(arg1.field5655, var11.method1047(), 0, var11.method1058());
                    this.field103.method1663(arg1, 993910342, arg1.field5658.field3941[arg1.field5650] < 0);
                    arg1.field5649.method1049(var10, var11.method1054());
                }
                if (arg1.field5658.field3941[arg1.field5650] < 0) {
                    arg1.field5649.method1079(-1);
                }
                var11.method1064(var10);
                var11.method53(arg4, arg0, arg3 - arg0);
                if (var11.method1077()) {
                    this.field104.method2162(var11);
                }
            }
        }
        int var12 = 83 / ((arg5 + 45) / 43);
        field89++;
        arg1.field5649.method53(arg4, arg0, arg2);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILsa;I)V", line = 232)
    private final void method49(int arg0, class357 arg1, int arg2) {
        if (arg2 != 1048575) {
            this.method53((int[]) null, 77, -71);
        }
        field99++;
        if ((this.field103.field3616[arg1.field5662] & 0x4) != 0 && arg1.field5660 < 0) {
            int var4 = this.field103.field3669[arg1.field5662] / class227.field3788;
            int var5 = (var4 + 1048575 - arg1.field5671) / var4;
            arg1.field5671 = arg0 * var4 + arg1.field5671 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field103.field3663[arg1.field5662] == 0) {
                    arg1.field5649 = class139.method1071(arg1.field5655, arg1.field5649.method1047(), arg1.field5649.method1054(), arg1.field5649.method1058());
                } else {
                    arg1.field5649 = class139.method1071(arg1.field5655, arg1.field5649.method1047(), 0, arg1.field5649.method1058());
                    this.field103.method1663(arg1, 993910342, arg1.field5658.field3941[arg1.field5650] < 0);
                }
                if (arg1.field5658.field3941[arg1.field5650] < 0) {
                    arg1.field5649.method1079(-1);
                }
                arg0 = arg1.field5671 / var4;
            }
        }
        arg1.field5649.method52(arg0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILna;III)Ljava/awt/Frame;", line = 272)
    public static final Frame method50(int arg0, int arg1, class145 arg2, int arg3, int arg4, int arg5) {
        field100++;
        if (!arg2.method1129((byte) -91)) {
            return null;
        }
        if (arg5 == 0) {
            class16[] var6 = class240.method1827(-2, arg2);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field182 == arg1 && var6[var8].field183 == arg0 && (arg3 == 0 || var6[var8].field180 == arg3) && (!var7 || arg5 < var6[var8].field188)) {
                    arg5 = var6[var8].field188;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class192 var9 = arg2.method1113(arg5, arg1, -117, arg3, arg0);
        while (var9.field3064 == 0) {
            class283.method2076((byte) 109, 10L);
        }
        Frame var10 = (Frame) var9.field3066;
        if (var10 == null) {
            return null;
        } else if (arg4 <= 13) {
            return (Frame) null;
        } else if (var9.field3064 == 2) {
            class169.method1317((byte) -7, var10, arg2);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BILsl;)V", line = 346)
    public static final void method51(byte arg0, int arg1, class40 arg2) {
        field94++;
        Object[] var3 = arg2.field581;
        if (arg0 != -61) {
            field88 = (int[]) null;
        }
        int var4 = (Integer) var3[0];
        class6 var5 = class194.method1504(var4, -17);
        if (var5 == null) {
            return;
        }
        class39.field576 = new String[var5.field57];
        int var6 = 0;
        class191.field3056 = new int[var5.field56];
        int var7 = 0;
        for (int var8 = 1; var8 < var3.length; var8++) {
            if ((var3[var8] instanceof Integer)) {
                int var10 = (Integer) var3[var8];
                if (var10 == -2147483647) {
                    var10 = arg2.field588;
                }
                if (var10 == -2147483646) {
                    var10 = arg2.field585;
                }
                if (var10 == -2147483645) {
                    var10 = arg2.field593 == null ? -1 : arg2.field593.field4167;
                }
                if (var10 == -2147483644) {
                    var10 = arg2.field591;
                }
                if (var10 == -2147483643) {
                    var10 = arg2.field593 == null ? -1 : arg2.field593.field4229;
                }
                if (var10 == -2147483642) {
                    var10 = arg2.field589 == null ? -1 : arg2.field589.field4167;
                }
                if (var10 == -2147483641) {
                    var10 = arg2.field589 == null ? -1 : arg2.field589.field4229;
                }
                if (var10 == -2147483640) {
                    var10 = arg2.field580;
                }
                if (var10 == -2147483639) {
                    var10 = arg2.field578;
                }
                class191.field3056[var6++] = var10;
            } else if (var3[var8] instanceof String) {
                String var9 = (String) var3[var8];
                if (var9.equals("event_opbase")) {
                    var9 = arg2.field579;
                }
                class39.field576[var7++] = var9;
            }
        }
        class3.method16(var5, arg1, -110);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 438)
    public final void method52(int arg0) {
        field102++;
        this.field104.method52(arg0);
        for (class357 var2 = (class357) this.field90.method2300((byte) 108); var2 != null; var2 = (class357) this.field90.method2306(-23)) {
            if (!this.field103.method1692((byte) 123, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field5654) {
                        this.method49(var3, var2, 1048575);
                        var2.field5654 -= var3;
                        break;
                    }
                    this.method49(var2.field5654, var2, 1048575);
                    var3 -= var2.field5654;
                } while (!this.field103.method1672((int[]) null, var3, var2, 0, (byte) 88));
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "([III)V", line = 483)
    public final void method53(int[] arg0, int arg1, int arg2) {
        field96++;
        this.field104.method53(arg0, arg1, arg2);
        for (class357 var4 = (class357) this.field90.method2300((byte) 97); var4 != null; var4 = (class357) this.field90.method2306(-23)) {
            if (!this.field103.method1692((byte) 102, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field5654 >= var5) {
                        this.method48(var6, var4, var5, var6 + var5, arg0, 102);
                        var4.field5654 -= var5;
                        break;
                    }
                    this.method48(var6, var4, var4.field5654, var6 + var5, arg0, -117);
                    var5 -= var4.field5654;
                    var6 += var4.field5654;
                } while (!this.field103.method1672(arg0, var5, var4, var6, (byte) 61));
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lof;)V", line = 528)
    public class11(class222 arg0) {
        this.field103 = arg0;
    }
}
