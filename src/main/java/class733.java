import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class733 implements Runnable {

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
    private int field10643 = 0;

    @OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
    private int field10651 = 0;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    private int field10642;

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field10649;

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "[B")
    private byte[] field10641;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field10648;

    @OriginalMember(owner = "client!pw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10654 = new String[] { method5350(method5349("9H\u001b\u0018+cMGD&5\u0015")), method5350(method5349("9H\u001b\u0018+cMDD&5\u0015")), method5350(method5349("9H\u001b\u0018+=\u001b\u0012\u0012&5\u0015")), method5350(method5349("9H\u001b\u0018+cM\u0012\u0012&5\u0015")), method5350(method5349("9H\u001b\u0018+5\u001b\u0012\u0012&5\u0015")), method5350(method5349("9H\u001b\u0018+1\u001b\u0012\u0012&5\u0015")), method5350(method5349("u\\Z6>")), method5350(method5349("9H\u001b\u0018+f\u001b\u0012\u0012&5\u0015")), method5350(method5349("9H\u001b\u0018+cM\u0016D&5\u0015")), method5350(method5349("9H\u001b\u0018+cMCD&5\u0015")), method5350(method5349("u\\Z1>")), method5350(method5349("u\\Z7>")), method5350(method5349("u\\Z0>")), method5350(method5349("~\u0005ZZk")), method5350(method5349("k^\u0018\u0018")), method5350(method5349("u\\Z5>")), method5350(method5349("u\\Z\u0006ck\u0003")), method5350(method5349("u\\Z2>")), method5350(method5349("u\\ZH\u007fkB\u0000J>")) };

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "Lwia;")
    public static class790 field10639 = new class790(25, 7);

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "Ljava/util/Calendar;")
    public static Calendar field10645 = Calendar.getInstance(TimeZone.getTimeZone(method5350(method5349("Bf "))));

    @OriginalMember(owner = "client!pw", name = "p", descriptor = "I")
    public static int field10638;

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
    public static int field10640;

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
    public static int field10644;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
    public static int field10647;

    @OriginalMember(owner = "client!pw", name = "o", descriptor = "I")
    public static int field10650;

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
    public static int field10652;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "Ljava/io/IOException;")
    private IOException field10646;

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "[I")
    public static int[] field10653;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "(B)V", line = 3)
    public final void method5343(byte arg0) {
        try {
            this.field10649 = new class776();
            if (arg0 == 70) {
                field10644++;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10654[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "([FII[FIIBFIII)V", line = 15)
    public static final void method5344(float[] arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, byte arg6, float arg7, int arg8, int arg9, int arg10) {
        try {
            int var21 = arg4 - arg5;
            int var22 = arg8 - arg2;
            int var23 = arg10 - arg1;
            field10650++;
            float var11 = arg0[2] * (float) var21 + arg0[0] * (float) var23 + arg0[1] * (float) var22;
            float var12 = arg0[5] * (float) var21 + arg0[4] * (float) var22 + arg0[3] * (float) var23;
            float var13 = arg0[8] * (float) var21 + arg0[7] * (float) var22 + arg0[6] * (float) var23;
            float var14 = (float) Math.sqrt((double) (var13 * var13 + var11 * var11 + var12 * var12));
            if (arg6 != 109) {
                field10645 = null;
            }
            float var15 = (float) Math.atan2((double) var11, (double) var13) / 6.2831855F + 0.5F;
            float var16 = arg7 + (float) Math.asin((double) (var12 / var14)) / 3.1415927F + 0.5F;
            if (arg9 == 1) {
                float var18 = var15;
                var15 = -var16;
                var16 = var18;
            } else if (arg9 == 2) {
                var15 = -var15;
                var16 = -var16;
            } else if (arg9 == 3) {
                float var17 = var15;
                var15 = var16;
                var16 = -var17;
            }
            arg3[0] = var15;
            arg3[1] = var16;
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field10654[12] + (arg0 == null ? field10654[14] : field10654[13]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field10654[14] : field10654[13]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(III)Ljava/lang/String;", line = 72)
    public static final String method5345(int arg0, int arg1, int arg2) {
        try {
            if (arg2 != 20883) {
                return null;
            }
            field10652++;
            int var3 = arg1 - arg0;
            if (var3 < -9) {
                return field10654[1];
            } else if (var3 < -6) {
                return field10654[0];
            } else if (var3 < -3) {
                return field10654[9];
            } else if (var3 < 0) {
                return field10654[8];
            } else if (var3 > 9) {
                return field10654[4];
            } else if (var3 > 6) {
                return field10654[5];
            } else if (var3 > 3) {
                return field10654[2];
            } else if (var3 > 0) {
                return field10654[7];
            } else {
                return field10654[3];
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10654[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pw", name = "run", descriptor = "()V", line = 112)
    public final void run() {
        try {
            field10638++;
            while (true) {
                int var2;
                synchronized (this) {
                    while (true) {
                        if (this.field10646 != null) {
                            return;
                        }
                        if (this.field10651 > this.field10643) {
                            var2 = this.field10643 + this.field10642 - this.field10651;
                        } else {
                            var2 = this.field10643 - this.field10651;
                        }
                        if (var2 > 0) {
                            break;
                        }
                        try {
                            this.field10649.flush();
                        } catch (IOException var17) {
                            this.field10646 = var17;
                            return;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var16) {
                        }
                    }
                }
                try {
                    if (this.field10642 < this.field10651 + var2) {
                        int var4 = this.field10642 - this.field10651;
                        this.field10649.write(this.field10641, this.field10651, var4);
                        this.field10649.write(this.field10641, 0, var2 - var4);
                    } else {
                        this.field10649.write(this.field10641, this.field10651, var2);
                    }
                } catch (IOException var19) {
                    IOException var5 = var19;
                    synchronized (this) {
                        this.field10646 = var5;
                        return;
                    }
                }
                synchronized (this) {
                    this.field10651 = (this.field10651 + var2) % this.field10642;
                }
            }
        } catch (RuntimeException var21) {
            throw class759.method5498(var21, field10654[16] + ')');
        }
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 275)
    public class733(OutputStream arg0, int arg1) {
        try {
            this.field10642 = arg1 + 1;
            this.field10649 = arg0;
            this.field10641 = new byte[this.field10642];
            this.field10648 = new Thread(this);
            this.field10648.setDaemon(true);
            this.field10648.start();
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10654[18] + (arg0 == null ? field10654[14] : field10654[13]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)V", line = 187)
    public final void method5346(byte arg0) {
        try {
            field10647++;
            if (arg0 == -82) {
                synchronized (this) {
                    if (this.field10646 == null) {
                        this.field10646 = new IOException("");
                    }
                    this.notifyAll();
                }
                try {
                    this.field10648.join();
                } catch (InterruptedException var4) {
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10654[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)V", line = 208)
    public static void method5347(byte arg0) {
        try {
            field10645 = null;
            int var1 = -87 % ((arg0 - 42) / 60);
            field10653 = null;
            field10639 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10654[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(II[BI)V", line = 220)
    public final void method5348(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        try {
            field10640++;
            if (arg1 < 0 || arg3 < 0 || arg2.length < arg1 + arg3) {
                throw new IOException();
            }
            synchronized (this) {
                if (this.field10646 != null) {
                    throw new IOException(this.field10646.toString());
                } else if (arg0 == -25850) {
                    int var6;
                    if (this.field10643 < this.field10651) {
                        var6 = this.field10651 - this.field10643 - 1;
                    } else {
                        var6 = this.field10651 + this.field10642 - (this.field10643 + 1);
                    }
                    if (var6 < arg1) {
                        throw new IOException("");
                    }
                    if (this.field10643 + arg1 > this.field10642) {
                        int var7 = this.field10642 - this.field10643;
                        class467.method3556(arg2, arg3, this.field10641, this.field10643, var7);
                        class467.method3556(arg2, arg3 + var7, this.field10641, 0, arg1 - var7);
                    } else {
                        class467.method3556(arg2, arg3, this.field10641, this.field10643, arg1);
                    }
                    this.field10643 = (this.field10643 + arg1) % this.field10642;
                    this.notifyAll();
                }
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field10654[17] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10654[14] : field10654[13]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!pw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5349(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x16);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5350(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 5;
                    break;
                case 1:
                    var10005 = 43;
                    break;
                case 2:
                    var10005 = 116;
                    break;
                case 3:
                    var10005 = 116;
                    break;
                default:
                    var10005 = 22;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
