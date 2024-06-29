import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class343 extends class601 {

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Lwi;")
    public static class202 field4882 = new class202();

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "[[[B")
    public static byte[][][] field4884;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)I", line = 3)
    public final int method45(int arg0) {
        ++field4886;
        if (arg0 != 8976) {
            this.method45(75);
        }
        return 1;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)I", line = 14)
    public final int method2193(int arg0) {
        if (arg0 != 0) {
            return -84;
        } else {
            ++field4885;
            return super.field8131;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lqea;)V", line = 25)
    public class343(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)I", line = 29)
    public final int method36(int arg0, byte arg1) {
        if (arg1 != 22) {
            return 72;
        } else {
            ++field4880;
            return 1;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V", line = 48)
    public final void method43(int arg0, int arg1) {
        super.field8131 = arg1;
        ++field4888;
        int var3 = -50 % ((arg0 - 22) / 34);
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V", line = 62)
    public static void method2194(byte arg0) {
        field4884 = null;
        if (arg0 < -16) {
            field4882 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 75)
    public final void method41(byte arg0) {
        ++field4881;
        int var2 = -2 % ((59 - arg0) / 33);
        if (super.field8131 != 1 && ~super.field8131 != -1) {
            super.field8131 = this.method45(8976);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLha;Ld;)V", line = 89)
    public static final void method2195(byte arg0, class548 arg1, class270 arg2) {
        ++field4883;
        if (class461.field6384 != null) {
            if (class537.field7447 < 10) {
                if (!class461.field6381.method1580(class461.field6384.field8163, -1)) {
                    class537.field7447 = class701.field9774.method1603(class461.field6384.field8163, (byte) -122) / 10;
                    return;
                }
                class308.method2017(4);
                class537.field7447 = 10;
            }
            if (~class537.field7447 == -11) {
                class461.field6400 = class461.field6384.field8158 >> 6 << 6;
                class461.field6408 = class461.field6384.field8168 >> 6 << 6;
                class461.field6404 = (class461.field6384.field8165 >> 6 << 6) + -class461.field6400 + 64;
                class461.field6413 = (class461.field6384.field8154 >> 6 << 6) - class461.field6408 + 64;
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class461.field6384.method3441((class388.field5601.field4410 >> 9) + class113.field1509, class388.field5601.field4408, (class388.field5601.field4418 >> 9) + class587.field7995, var3, (byte) 1)) {
                    var4 = var3[1] + -class461.field6400;
                    var5 = var3[2] + -class461.field6408;
                }
                if (!class444.field6170 && var4 >= 0 && ~var4 > ~class461.field6404 && ~var5 <= -1 && ~class461.field6413 < ~var5) {
                    int var6 = var4 + (int) (10.0D * Math.random()) + -5;
                    int var7 = var5 + -5 + (int) (Math.random() * 10.0D);
                    class513.field7087 = var6;
                    class718.field10001 = var7;
                } else if (~class176.field2417 != 0 && ~class57.field798 != 0) {
                    class461.field6384.method3437(-1996, class57.field798, var3, class176.field2417);
                    class57.field798 = -1;
                    class176.field2417 = -1;
                    class444.field6170 = false;
                    if (var3 != null) {
                        class718.field10001 = var3[2] + -class461.field6408;
                        class513.field7087 = var3[1] - class461.field6400;
                    }
                } else {
                    class461.field6384.method3437(-1996, class461.field6384.field8161 & 16383, var3, (268423093 & class461.field6384.field8161) >> 14);
                    class513.field7087 = var3[1] - class461.field6400;
                    class718.field10001 = var3[2] + -class461.field6408;
                }
                if (~class461.field6384.field8157 == -38) {
                    class461.field6388 = 3.0F;
                    class461.field6392 = 3.0F;
                } else if (~class461.field6384.field8157 == -51) {
                    class461.field6388 = 4.0F;
                    class461.field6392 = 4.0F;
                } else if (class461.field6384.field8157 != 75) {
                    if (class461.field6384.field8157 == 100) {
                        class461.field6388 = 8.0F;
                        class461.field6392 = 8.0F;
                    } else if (~class461.field6384.field8157 != -201) {
                        class461.field6388 = 8.0F;
                        class461.field6392 = 8.0F;
                    } else {
                        class461.field6388 = 16.0F;
                        class461.field6392 = 16.0F;
                    }
                } else {
                    class461.field6388 = 6.0F;
                    class461.field6392 = 6.0F;
                }
                class461.field6390 = (int) class461.field6388 >> 1;
                class461.field6393 = class406.method2540(class461.field6390, 21781);
                class558.method3284(-1);
                class461.method2804();
                class226.field3034 = new class646();
                class461.field6391 += -2 + (int) (5.0D * Math.random());
                if (class461.field6391 < -8) {
                    class461.field6391 = -8;
                }
                if (~class461.field6391 < -9) {
                    class461.field6391 = 8;
                }
                class461.field6397 += (int) (Math.random() * 5.0D) + -2;
                if (~class461.field6397 > 15) {
                    class461.field6397 = -16;
                }
                if (~class461.field6397 < -17) {
                    class461.field6397 = 16;
                }
                class461.method2824(arg2, class461.field6391 >> 2 << 10, class461.field6397 >> 1);
                class461.field6385.method5(false, 256, 1024);
                class461.field6379.method3004(256, 256, true);
                class461.field6383.method715(true, 4096);
                class601.field8138.method1897(64, 256);
                class537.field7447 = 20;
            } else if (class537.field7447 == 20) {
                class700.method3958((byte) -90, true);
                class461.method2819(arg1, class461.field6391, class461.field6397);
                class537.field7447 = 60;
                class700.method3958((byte) -90, true);
                class570.method3346((byte) -56);
            } else if (class537.field7447 == 60) {
                if (class461.field6381.method1587(127, class461.field6384.field8163 + "_staticelements")) {
                    if (!class461.field6381.method1580(class461.field6384.field8163 + "_staticelements", -1)) {
                        return;
                    }
                    class461.field6396 = class718.method4024(124, class461.field6381, class461.field6384.field8163 + "_staticelements", class560.field7795);
                } else {
                    class461.field6396 = new class375(0);
                }
                class461.method2805();
                class537.field7447 = 70;
                class700.method3958((byte) -90, true);
                class570.method3346((byte) -56);
            } else if (class537.field7447 == 70) {
                class507.field7050 = new class203(arg1, 11, true, class570.field7875);
                class537.field7447 = 73;
                class700.method3958((byte) -90, true);
                class570.method3346((byte) -56);
            } else if (~class537.field7447 == -74) {
                class683.field9477 = new class203(arg1, 12, true, class570.field7875);
                class537.field7447 = 76;
                class700.method3958((byte) -90, true);
                class570.method3346((byte) -56);
            } else if (~class537.field7447 == -77) {
                class679.field9446 = new class203(arg1, 14, true, class570.field7875);
                class537.field7447 = 79;
                class700.method3958((byte) -90, true);
                class570.method3346((byte) -56);
            } else if (~class537.field7447 == -80) {
                class510.field7070 = new class203(arg1, 17, true, class570.field7875);
                class537.field7447 = 82;
                class700.method3958((byte) -90, true);
                class570.method3346((byte) -56);
            } else if (class537.field7447 == 82) {
                class20.field194 = new class203(arg1, 19, true, class570.field7875);
                class537.field7447 = 85;
                class700.method3958((byte) -90, true);
                class570.method3346((byte) -56);
            } else if (class537.field7447 == 85) {
                class249.field3653 = new class203(arg1, 22, true, class570.field7875);
                class537.field7447 = 88;
                class700.method3958((byte) -90, true);
                class570.method3346((byte) -56);
            } else if (class537.field7447 == 88) {
                class525.field7297 = new class203(arg1, 26, true, class570.field7875);
                class537.field7447 = 91;
                class700.method3958((byte) -90, true);
                class570.method3346((byte) -56);
            } else {
                class145.field2035 = new class203(arg1, 30, true, class570.field7875);
                class537.field7447 = 100;
                class700.method3958((byte) -90, true);
                class570.method3346((byte) -56);
                System.gc();
                if (arg0 > -60) {
                    field4882 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ldc;I)Lgr;", line = 311)
    public static final class534 method2196(class63 arg0, int arg1) {
        ++field4890;
        return arg1 != 75 ? null : new class534(arg0.method496(-79), arg0.method496(-127), arg0.method496(-98), arg0.method496(-110), arg0.method476((byte) 119), arg0.method476((byte) -69), arg0.method505((byte) -119));
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)Z", line = 326)
    public static final boolean method2197(int arg0, int arg1, int arg2) {
        if (arg0 != 82) {
            return false;
        } else {
            ++field4889;
            return ~(1048832 & arg2) != -1;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(ILqea;)V", line = 338)
    public class343(int arg0, class339 arg1) {
        super(arg0, arg1);
    }
}
