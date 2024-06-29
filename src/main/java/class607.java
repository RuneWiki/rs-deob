import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class607 extends class528 {

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "Ltf;")
    public class524 field8698 = new class524();

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "Ljf;")
    public class566 field8708 = new class566();

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "Lng;")
    private class429 field8704;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field8710 = new String[] { method4486(method4485("\u0017+\u001f\u007f\u0016")), method4486(method4485("\u0002p]=")), method4486(method4485("\tn\u001f\u0012C")), method4486(method4485("\tn\u001fm\u0002\u0002lEoC")), method4486(method4485("\tn\u001f\u0003*D")), method4486(method4485("\tn\u001f\u0005C")), method4486(method4485("\tn\u001f\u0013C")), method4486(method4485("\tn\u001f\u0002*D")), method4486(method4485("\tn\u001f\u0015C")), method4486(method4485("\tn\u001f\u0006*D")), method4486(method4485("\tn\u001f\u0010C")), method4486(method4485("\tn\u001f\u0016C")) };

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "Lsb;")
    public static class261 field8697 = new class261(123, -1);

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "Lmv;")
    public static class125 field8701 = new class125(28, 6);

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "F")
    public static float field8706 = 1024.0F;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public static int field8699;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    public static int field8700;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field8702;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field8703;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field8705;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field8707;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public static int field8709;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()Ljn;")
    public final class528 method931() {
        try {
            field8707++;
            class399 var1 = (class399) this.field8698.method3977((byte) -67);
            if (var1 == null) {
                return null;
            } else if (var1.field5819 == null) {
                return this.method919();
            } else {
                return var1.field5819;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8710[4] + ')');
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "()I")
    public final int method917() {
        try {
            field8700++;
            return 0;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8710[11] + ')');
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/String;ILml;I)Lv;")
    public static final class572 method4481(String arg0, int arg1, class194 arg2, int arg3) {
        try {
            field8709++;
            int var4 = OpenGL.glGenProgramARB();
            if (arg1 != -21236) {
                method4483((byte) 96);
            }
            OpenGL.glBindProgramARB(arg3, var4);
            OpenGL.glProgramStringARB(arg3, 34933, arg0);
            OpenGL.glGetIntegerv(34379, class488.field7155, 0);
            if (class488.field7155[0] == -1) {
                OpenGL.glBindProgramARB(arg3, 0);
                return new class572(arg2, arg3, var4);
            } else {
                OpenGL.glBindProgramARB(arg3, 0);
                return null;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8710[8] + (arg0 == null ? field8710[1] : field8710[0]) + ',' + arg1 + ',' + (arg2 == null ? field8710[1] : field8710[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public final void method937(int arg0) {
        try {
            field8699++;
            this.field8708.method937(arg0);
            for (class399 var2 = (class399) this.field8698.method3977((byte) -109); var2 != null; var2 = (class399) this.field8698.method3987(0)) {
                if (!this.field8704.method3325(var2, false)) {
                    int var3 = arg0;
                    do {
                        if (var3 <= var2.field5818) {
                            this.method4482(var2, var3, 7811);
                            var2.field5818 -= var3;
                            break;
                        }
                        this.method4482(var2, var2.field5818, 7811);
                        var3 -= var2.field5818;
                    } while (!this.field8704.method3340(null, var3, 0, (byte) 38, var2));
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8710[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "([III)V")
    public final void method927(int[] arg0, int arg1, int arg2) {
        try {
            field8703++;
            this.field8708.method927(arg0, arg1, arg2);
            for (class399 var4 = (class399) this.field8698.method3977((byte) -74); var4 != null; var4 = (class399) this.field8698.method3987(0)) {
                if (!this.field8704.method3325(var4, false)) {
                    int var5 = arg2;
                    int var6 = arg1;
                    do {
                        if (var5 <= var4.field5818) {
                            this.method4484(var4, var5 + var6, arg0, 118, var6, var5);
                            var4.field5818 -= var5;
                            break;
                        }
                        this.method4484(var4, var5 + var6, arg0, 103, var6, var4.field5818);
                        var5 -= var4.field5818;
                        var6 += var4.field5818;
                    } while (!this.field8704.method3340(arg0, var5, var6, (byte) 38, var4));
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8710[5] + (arg0 == null ? field8710[1] : field8710[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "()Ljn;")
    public final class528 method919() {
        try {
            field8702++;
            class399 var1;
            do {
                var1 = (class399) this.field8698.method3987(0);
                if (var1 == null) {
                    return null;
                }
            } while (var1.field5819 == null);
            return var1.field5819;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8710[9] + ')');
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ltia;II)V")
    private final void method4482(class399 arg0, int arg1, int arg2) {
        try {
            if ((this.field8704.field6200[arg0.field5813] & 0x4) != 0 && arg0.field5808 < 0) {
                int var4 = this.field8704.field6191[arg0.field5813] / class215.field3148;
                int var5 = (var4 + 1048575 - arg0.field5816) / var4;
                arg0.field5816 = arg1 * var4 + arg0.field5816 & 0xFFFFF;
                if (var5 <= arg1) {
                    if (this.field8704.field6192[arg0.field5813] == 0) {
                        arg0.field5819 = class93.method915(arg0.field5811, arg0.field5819.method905(), arg0.field5819.method904(), arg0.field5819.method916());
                    } else {
                        arg0.field5819 = class93.method915(arg0.field5811, arg0.field5819.method905(), 0, arg0.field5819.method916());
                        this.field8704.method3342(arg0.field5802.field4340[arg0.field5814] < 0, arg0, arg2 - 25812);
                    }
                    if (arg0.field5802.field4340[arg0.field5814] < 0) {
                        arg0.field5819.method936(-1);
                    }
                    arg1 = arg0.field5816 / var4;
                }
            }
            field8696++;
            arg0.field5819.method937(arg1);
            if (arg2 != 7811) {
                this.method927(null, -79, 107);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8710[6] + (arg0 == null ? field8710[1] : field8710[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static void method4483(byte arg0) {
        try {
            field8697 = null;
            field8701 = null;
            if (arg0 <= 42) {
                method4481(null, 103, null, 16);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8710[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ltia;I[IIII)V")
    private final void method4484(class399 arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5) {
        try {
            field8705++;
            if ((this.field8704.field6200[arg0.field5813] & 0x4) != 0 && arg0.field5808 < 0) {
                int var7 = this.field8704.field6191[arg0.field5813] / class215.field3148;
                while (true) {
                    int var8 = (1048575 - (arg0.field5816 - var7)) / var7;
                    if (arg5 < var8) {
                        arg0.field5816 += arg5 * var7;
                        break;
                    }
                    arg0.field5819.method927(arg2, arg4, var8);
                    arg0.field5816 += var7 * var8 - 1048576;
                    arg5 -= var8;
                    arg4 += var8;
                    int var9 = class215.field3148 / 100;
                    int var10 = 262144 / var7;
                    if (var10 < var9) {
                        var9 = var10;
                    }
                    class93 var11 = arg0.field5819;
                    if (this.field8704.field6192[arg0.field5813] == 0) {
                        arg0.field5819 = class93.method915(arg0.field5811, var11.method905(), var11.method904(), var11.method916());
                    } else {
                        arg0.field5819 = class93.method915(arg0.field5811, var11.method905(), 0, var11.method916());
                        this.field8704.method3342(arg0.field5802.field4340[arg0.field5814] < 0, arg0, -18001);
                        arg0.field5819.method897(var9, var11.method904());
                    }
                    if (arg0.field5802.field4340[arg0.field5814] < 0) {
                        arg0.field5819.method936(-1);
                    }
                    var11.method912(var9);
                    var11.method927(arg2, arg4, arg1 - arg4);
                    if (var11.method925()) {
                        this.field8708.method4230(var11);
                    }
                }
            }
            arg0.field5819.method927(arg2, arg4, arg5);
            if (arg3 <= 45) {
                this.field8708 = null;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field8710[2] + (arg0 == null ? field8710[1] : field8710[0]) + ',' + arg1 + ',' + (arg2 == null ? field8710[1] : field8710[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lng;)V")
    public class607(class429 arg0) {
        try {
            this.field8704 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8710[3] + (arg0 == null ? field8710[1] : field8710[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4485(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4486(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 5;
                    break;
                case 2:
                    var10005 = 49;
                    break;
                case 3:
                    var10005 = 81;
                    break;
                default:
                    var10005 = 107;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
