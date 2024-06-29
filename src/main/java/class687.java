import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class687 implements Runnable {

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    private int field9697 = 0;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
    private int field9700 = 0;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field9705;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
    private int field9701;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "[B")
    private byte[] field9710;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field9696;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "[F")
    public static float[] field9698 = new float[4];

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
    public static int field9711 = -2;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field9694;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public static int field9695;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public static int field9699;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
    public static int field9703;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
    public static int field9706;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "I")
    public static int field9709;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "Lgd;")
    public static class344 field9702;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "Ljava/io/IOException;")
    private IOException field9704;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
    public static final void method3845(int arg0) {
        field9694++;
        if (class335.field4872.method3427(class62.field996, 106) != 2) {
            return;
        }
        byte var1 = (byte) (class229.field3041 - 4 & 0xFF);
        int var2 = class229.field3041 % class72.field1144;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class668.field9444; var18++) {
                class603.field8703[var3][var2][var18] = var1;
            }
        }
        if (arg0 != -3) {
            field9702 = null;
        }
        if (class49.field779 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class426.field6229[var4] = -1000000;
            class444.field6452[var4] = 1000000;
            class232.field3068[var4] = 0;
            class433.field6282[var4] = 1000000;
            class657.field9381[var4] = 0;
        }
        int var5 = class321.field4681.field7895;
        int var6 = class321.field4681.field7896;
        if (class684.field9659 != 1 && class250.field3280 == -1) {
            int var7 = class504.method2870((byte) -120, class603.field8702, class306.field4529, class49.field779);
            if (var7 - class533.field7839 < 3200 && (class317.field4622[class49.field779][class306.field4529 >> 9][class603.field8702 >> 9] & 0x4) != 0) {
                class237.method1459(false, 1, class603.field8702 >> 9, class306.field4529 >> 9, class603.field8695, 4095);
                return;
            }
            return;
        }
        if (class684.field9659 != 1) {
            var5 = class250.field3280;
            var6 = class150.field2120;
        }
        if ((class317.field4622[class49.field779][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class237.method1459(false, 0, var6 >> 9, var5 >> 9, class603.field8695, 4095);
        }
        if (class246.field3255 >= 2560) {
            return;
        }
        int var8 = class306.field4529 >> 9;
        int var9 = class603.field8702 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var8 < var10) {
            var12 = var10 - var8;
        } else {
            var12 = var8 - var10;
        }
        int var13;
        if (var9 < var11) {
            var13 = var11 - var9;
        } else {
            var13 = var9 - var11;
        }
        if ((var12 != 0 || var13 != 0) && -class72.field1144 < var12 && var12 < class72.field1144 && var13 > (-class668.field9444) && class668.field9444 > var13) {
            if (var13 >= var12) {
                int var14 = var12 * 65536 / var13;
                int var15 = 32768;
                while (var9 != var11) {
                    if (var11 > var9) {
                        var9++;
                    } else if (var11 < var9) {
                        var9--;
                    }
                    if ((class317.field4622[class49.field779][var8][var9] & 0x4) != 0) {
                        class237.method1459(false, 1, var9, var8, class603.field8695, 4095);
                        return;
                    }
                    var15 += var14;
                    if (var15 >= 65536) {
                        var15 -= 65536;
                        if (var10 > var8) {
                            var8++;
                        } else if (var8 > var10) {
                            var8--;
                        }
                        if ((class317.field4622[class49.field779][var8][var9] & 0x4) != 0) {
                            class237.method1459(false, 1, var9, var8, class603.field8695, 4095);
                            return;
                        }
                    }
                }
                return;
            }
            int var16 = var13 * 65536 / var12;
            int var17 = 32768;
            while (var8 != var10) {
                if (var8 < var10) {
                    var8++;
                } else if (var8 > var10) {
                    var8--;
                }
                if ((class317.field4622[class49.field779][var8][var9] & 0x4) != 0) {
                    class237.method1459(false, 1, var9, var8, class603.field8695, 4095);
                    return;
                }
                var17 += var16;
                if (var17 >= 65536) {
                    var17 -= 65536;
                    if (var9 < var11) {
                        var9++;
                    } else if (var9 > var11) {
                        var9--;
                    }
                    if ((class317.field4622[class49.field779][var8][var9] & 0x4) != 0) {
                        class237.method1459(false, 1, var9, var8, class603.field8695, 4095);
                        return;
                    }
                }
            }
            return;
        }
        class118.method869(null, (byte) -128, "RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class397.field6005 + "," + class403.field6049);
        return;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(JI)V")
    public static final void method3846(long arg0, int arg1) {
        field9703++;
        int var3 = 58 / ((30 - arg1) / 34);
        if (arg0 <= 0L) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class345.method2141(-66, arg0 - 1L);
            class345.method2141(-92, 1L);
        } else {
            class345.method2141(-120, arg0);
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)[Lpb;")
    public static final class2[] method3847(int arg0) {
        field9699++;
        return arg0 <= 56 ? null : new class2[] { class323.field4702, class539.field7909, class308.field4544, class688.field9714, class416.field6151, class183.field2513, class620.field8973, class303.field4495, class142.field2047, class82.field1320, class520.field7285, class413.field6124, class623.field9010, class40.field599, class211.field2850 };
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(III[B)V")
    public final void method3848(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg2 <= 65) {
            this.field9700 = -65;
        }
        field9708++;
        if (arg0 < 0 || arg1 < 0 || arg3.length < (arg1 + arg0)) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field9704 != null) {
                throw new IOException(this.field9704.toString());
            }
            int var6;
            if (this.field9700 <= this.field9697) {
                var6 = this.field9701 + this.field9700 - this.field9697 - 1;
            } else {
                var6 = this.field9700 - this.field9697 - 1;
            }
            if (arg0 > var6) {
                throw new IOException("");
            }
            if (this.field9697 + arg0 > this.field9701) {
                int var7 = this.field9701 - this.field9697;
                class667.method3739(arg3, arg1, this.field9710, this.field9697, var7);
                class667.method3739(arg3, arg1 + var7, this.field9710, 0, arg0 - var7);
            } else {
                class667.method3739(arg3, arg1, this.field9710, this.field9697, arg0);
            }
            this.field9697 = (this.field9697 + arg0) % this.field9701;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
    public static void method3849(byte arg0) {
        field9698 = null;
        field9702 = null;
        if (arg0 != -109) {
            method3846(53L, 108);
        }
    }

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)V")
    public final void method3850(int arg0) {
        field9709++;
        if (arg0 != 4) {
            field9711 = 44;
        }
        this.field9705 = new class530();
    }

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "(I)V")
    public final void method3851(int arg0) {
        field9707++;
        synchronized (this) {
            if (this.field9704 == null) {
                this.field9704 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            if (arg0 == -32296) {
                this.field9696.join();
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!jv", name = "run", descriptor = "()V")
    public final void run() {
        field9706++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field9704 != null) {
                        return;
                    }
                    if (this.field9700 > this.field9697) {
                        var2 = this.field9701 + this.field9697 - this.field9700;
                    } else {
                        var2 = this.field9697 - this.field9700;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                if (this.field9701 >= (this.field9700 + var2)) {
                    this.field9705.write(this.field9710, this.field9700, var2);
                } else {
                    int var3 = this.field9701 - this.field9700;
                    this.field9705.write(this.field9710, this.field9700, var3);
                    this.field9705.write(this.field9710, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field9704 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field9700 = (this.field9700 + var2) % this.field9701;
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "(I)[Lqf;")
    public static final class697[] method3852(int arg0) {
        if (arg0 >= -37) {
            return null;
        } else {
            field9695++;
            return new class697[] { class196.field2650, class196.field2670, class196.field2677, class196.field2680, class196.field2681, class196.field2682, class196.field2683, class196.field2684, class196.field2685, class196.field2686, class196.field2687, class196.field2688, class196.field2689, class196.field2690 };
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class687(OutputStream arg0, int arg1) {
        this.field9705 = arg0;
        this.field9701 = arg1 + 1;
        this.field9710 = new byte[this.field9701];
        this.field9696 = new Thread(this);
        this.field9696.setDaemon(true);
        this.field9696.start();
    }
}
