import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class100 implements Runnable {

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Z")
    public boolean field1517 = true;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field1519 = new Object();

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public int field1523 = 0;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "[I")
    public int[] field1522 = new int[500];

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "[I")
    public int[] field1521 = new int[500];

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Lck;")
    public static class119 field1514 = class298.method1987((byte) 40, "gs");

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Lck;")
    public static class119 field1515 = class298.method1987((byte) 60, "UniChrome IGP");

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "Lck;")
    public static class119 field1524 = class298.method1987((byte) 103, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field1526 = 0;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Lnh;")
    public static class61 field1520 = class174.method1111((byte) 109);

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIII)V", line = 12)
    public static final void method667(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg7 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class255.field4102 - class167.field2641) * var8 / 100 + class167.field2641;
        int var10 = arg0 * var9 >> 8;
        int var11 = 2048 - arg5 & 0x7FF;
        int var12 = 0;
        int var13 = 2048 - arg2 & 0x7FF;
        int var14 = var10;
        int var15 = 0;
        if (var11 != 0) {
            int var16 = class284.field4699[var11];
            int var17 = class284.field4698[var11];
            var15 = -var10 * var17 >> 16;
            var14 = var10 * var16 >> 16;
        }
        field1516++;
        if (arg4 != var13) {
            int var18 = class284.field4699[var13];
            int var19 = class284.field4698[var13];
            var12 = var14 * var19 >> 16;
            var14 = var14 * var18 >> 16;
        }
        class281.field4638 = arg3 - var15;
        class62.field987 = arg1 - var12;
        class86.field1290 = arg5;
        class70.field1097 = arg6 - var14;
        class140.field2251 = arg2;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILfj;IIIIIZI)V", line = 68)
    public static final void method668(int arg0, class3 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (arg0 >= 0 && arg0 < 104 && arg4 >= 0 && arg4 < 104) {
            if (!arg7) {
                class111.field1707[arg3][arg0][arg4] = 0;
            }
            while (true) {
                int var9 = arg1.method64((byte) 30);
                if (var9 == 0) {
                    if (arg7) {
                        class57.field926[0][arg0][arg4] = class128.field1966[0][arg0][arg4];
                    } else if (arg3 == 0) {
                        class57.field926[0][arg0][arg4] = -class152.method976(arg4 + arg6 + 556238, arg0 + 932731 + arg2, -15232) * 8;
                    } else {
                        class57.field926[arg3][arg0][arg4] = class57.field926[arg3 - 1][arg0][arg4] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg1.method64((byte) 109);
                    if (arg7) {
                        class57.field926[0][arg0][arg4] = var10 * 8 + class128.field1966[0][arg0][arg4];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg3 == 0) {
                            class57.field926[0][arg0][arg4] = -var10 * 8;
                        } else {
                            class57.field926[arg3][arg0][arg4] = class57.field926[arg3 - 1][arg0][arg4] - var10 * 8;
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class135.field2190[arg3][arg0][arg4] = arg1.method24(false);
                    class220.field3525[arg3][arg0][arg4] = (byte) ((var9 - 2) / 4);
                    class273.field4487[arg3][arg0][arg4] = (byte) class19.method151(3, arg8 + var9 - 2);
                } else if (var9 > 81) {
                    client.field1392[arg3][arg0][arg4] = (byte) (var9 - 81);
                } else if (!arg7) {
                    class111.field1707[arg3][arg0][arg4] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg1.method64((byte) -89);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg1.method64((byte) -125);
                    break;
                }
                if (var11 <= 49) {
                    arg1.method64((byte) -85);
                }
            }
        }
        field1518++;
        if (arg5 <= 38) {
            field1520 = (class61) null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 172)
    public static void method669(byte arg0) {
        field1515 = null;
        field1520 = null;
        field1514 = null;
        if (arg0 != -74) {
            field1514 = (class119) null;
        }
        field1524 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)J", line = 199)
    public static final long method670(int arg0, int arg1, int arg2) {
        class104 var3 = class150.field2390[arg0][arg1][arg2];
        return var3 == null || var3.field1593 == null ? 0L : var3.field1593.field2341;
    }

    @OriginalMember(owner = "client!pg", name = "run", descriptor = "()V", line = 240)
    public final void run() {
        while (this.field1517) {
            Object var1 = this.field1519;
            synchronized (this.field1519) {
                if (this.field1523 < 500) {
                    this.field1522[this.field1523] = class129.field1984;
                    this.field1521[this.field1523] = class65.field1024;
                    this.field1523++;
                }
            }
            class232.method1493(50L, (byte) -51);
        }
        field1525++;
    }
}
