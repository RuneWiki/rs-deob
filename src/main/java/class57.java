import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class57 extends class252 {

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "[J")
    private long[] field994 = new long[10];

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    private int field991 = 0;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    private int field1003 = 1;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    private int field1002 = 256;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "J")
    private long field993 = class155.method1133(124);

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "Lmb;")
    public static class96 field1000 = class243.method1708("overlay", (byte) 113);

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Lha;")
    public static class22 field996 = new class22(64);

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "Lha;")
    public static class22 field1004 = new class22(128);

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "[B")
    private static byte[] field1005 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "Lmb;")
    public static class96 field1008 = class243.method1708("mapscene", (byte) 103);

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field1009 = 0;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
    public static int field1010 = 0;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "Lha;")
    public static class22 field1007 = new class22(128);

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public static int field1011 = 0;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    private int field995;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "[I")
    public static int[] field1006;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    public static final void method417(byte arg0) {
        field999++;
        if (class203.field3517 == 0 || class203.field3517 == 5) {
            return;
        }
        try {
            if (arg0 >= -71) {
                field1005 = null;
            }
            if ((++class89.field1470) > 2000) {
                if (class211.field3638 != null) {
                    class211.field3638.method1605(12);
                    class211.field3638 = null;
                }
                if (class56.field972 >= 1) {
                    class203.field3517 = 0;
                    class25.field424 = -5;
                    return;
                }
                if (class226.field3837 == class121.field2239) {
                    class121.field2239 = class232.field3981;
                } else {
                    class121.field2239 = class226.field3837;
                }
                class203.field3517 = 1;
                class89.field1470 = 0;
                class56.field972++;
            }
            if (class203.field3517 == 1) {
                class216.field3722 = class234.field4017.method942(class121.field2239, class207.field3575, 11);
                class203.field3517 = 2;
            }
            if (class203.field3517 == 2) {
                if (class216.field3722.field4605 == 2) {
                    throw new IOException();
                }
                if (class216.field3722.field4605 != 1) {
                    return;
                }
                class211.field3638 = new class236((Socket) class216.field3722.field4604, class234.field4017);
                class216.field3722 = null;
                long var1 = class51.field881 = class120.field2221.method685((byte) 116);
                class140.field2505.field4124 = 0;
                class140.field2505.method1652(14, (byte) 41);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class140.field2505.method1652(var3, (byte) 41);
                class211.field3638.method1599(true, 2, class140.field2505.field4144, 0);
                if (class20.field335 != null) {
                    class20.field335.method536((byte) 14);
                }
                if (class80.field1362 != null) {
                    class80.field1362.method536((byte) 14);
                }
                int var4 = class211.field3638.method1604((byte) 78);
                if (class20.field335 != null) {
                    class20.field335.method536((byte) 14);
                }
                if (class80.field1362 != null) {
                    class80.field1362.method536((byte) 14);
                }
                if (var4 != 0) {
                    class25.field424 = var4;
                    class203.field3517 = 0;
                    class211.field3638.method1605(-121);
                    class211.field3638 = null;
                    return;
                }
                class203.field3517 = 3;
            }
            if (class203.field3517 == 3) {
                if (class211.field3638.method1598(0) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class211.field3638.method1603(2000, class1.field4.field4144, 0, 8);
                class1.field4.field4124 = 0;
                class227.field3862 = class1.field4.method1658(-1243377376);
                class140.field2505.field4124 = 0;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class227.field3862;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class227.field3862 >> 32);
                class140.field2505.method1652(10, (byte) 41);
                class140.field2505.method1625((byte) 51, var5[0]);
                class140.field2505.method1625((byte) 127, var5[1]);
                class140.field2505.method1625((byte) -100, var5[2]);
                class140.field2505.method1625((byte) 101, var5[3]);
                class140.field2505.method1668(class120.field2221.method685((byte) 0), -125);
                class140.field2505.method1644(class120.field2222, -111);
                class140.field2505.method1662(true, class200.field3474, class241.field4184);
                class116.field2157.field4124 = 0;
                if (class101.field1729 == 40) {
                    class116.field2157.method1652(18, (byte) 41);
                } else {
                    class116.field2157.method1652(16, (byte) 41);
                }
                class116.field2157.method1632(true, class140.field2505.field4124 + (class154.method1126(class192.field3320, (byte) 0) + 154));
                class116.field2157.method1625((byte) -114, 520);
                class116.field2157.method1652(class245.field4260, (byte) 41);
                class116.field2157.method1652(class254.field4390 ? 1 : 0, (byte) 41);
                class116.field2157.method1652(0, (byte) 41);
                class116.field2157.method1652(class159.method1157(-1), (byte) 41);
                class116.field2157.method1632(true, class232.field3979);
                class116.field2157.method1632(true, class168.field2954);
                class219.method1508(class116.field2157, (byte) -59);
                class116.field2157.method1644(class192.field3320, -63);
                class116.field2157.method1625((byte) 93, class73.field1255);
                class116.field2157.method1625((byte) 89, class235.method1591(17934));
                class169.field2977 = true;
                class116.field2157.method1632(true, class264.field4610);
                class116.field2157.method1625((byte) 44, class68.field1189.method43((byte) 126));
                class116.field2157.method1625((byte) -116, class229.field3922.method43((byte) 116));
                class116.field2157.method1625((byte) 41, class186.field3244.method43((byte) 127));
                class116.field2157.method1625((byte) -116, class39.field685.method43((byte) 124));
                class116.field2157.method1625((byte) -92, class178.field3077.method43((byte) 119));
                class116.field2157.method1625((byte) -121, class92.field1523.method43((byte) 118));
                class116.field2157.method1625((byte) -111, class181.field3155.method43((byte) 120));
                class116.field2157.method1625((byte) 87, class236.field4058.method43((byte) 120));
                class116.field2157.method1625((byte) 90, class103.field1735.method43((byte) 118));
                class116.field2157.method1625((byte) -105, class85.field1443.method43((byte) 117));
                class116.field2157.method1625((byte) -126, class122.field2265.method43((byte) 124));
                class116.field2157.method1625((byte) 112, class97.field1634.method43((byte) 126));
                class116.field2157.method1625((byte) 58, class212.field3660.method43((byte) 120));
                class116.field2157.method1625((byte) 109, class49.field867.method43((byte) 122));
                class116.field2157.method1625((byte) 94, class189.field3309.method43((byte) 127));
                class116.field2157.method1625((byte) 113, class170.field2983.method43((byte) 120));
                class116.field2157.method1625((byte) 119, class23.field398.method43((byte) 126));
                class116.field2157.method1625((byte) -117, class14.field225.method43((byte) 122));
                class116.field2157.method1625((byte) -109, class218.field3732.method43((byte) 121));
                class116.field2157.method1625((byte) 47, class185.field3219.method43((byte) 117));
                class116.field2157.method1625((byte) 83, class74.field1294.method43((byte) 124));
                class116.field2157.method1625((byte) -127, class215.field3702.method43((byte) 116));
                class116.field2157.method1625((byte) 76, class48.field852.method43((byte) 127));
                class116.field2157.method1625((byte) -107, class246.field4270.method43((byte) 116));
                class116.field2157.method1625((byte) 42, class264.field4611.method43((byte) 118));
                class116.field2157.method1625((byte) -98, class22.field367.method43((byte) 126));
                class116.field2157.method1625((byte) 47, class148.field2618.method43((byte) 126));
                class116.field2157.method1621(0, class140.field2505.field4144, class140.field2505.field4124, -114);
                class211.field3638.method1599(true, class116.field2157.field4124, class116.field2157.field4144, 0);
                class140.field2505.method1016(8, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class1.field4.method1016(8, var5);
                class203.field3517 = 4;
            }
            if (class203.field3517 == 4) {
                if (class211.field3638.method1598(0) < 1) {
                    return;
                }
                int var7 = class211.field3638.method1604((byte) 78);
                if (var7 == 21) {
                    class203.field3517 = 7;
                } else if (var7 == 29) {
                    class203.field3517 = 10;
                } else if (var7 == 1) {
                    class203.field3517 = 5;
                    class25.field424 = var7;
                    return;
                } else if (var7 == 2) {
                    class203.field3517 = 8;
                } else if (var7 == 15) {
                    class203.field3517 = 0;
                    class25.field424 = var7;
                    return;
                } else if (var7 == 23 && class56.field972 < 1) {
                    class203.field3517 = 1;
                    class89.field1470 = 0;
                    class56.field972++;
                    class211.field3638.method1605(12);
                    class211.field3638 = null;
                    return;
                } else {
                    class203.field3517 = 0;
                    class25.field424 = var7;
                    class211.field3638.method1605(-89);
                    class211.field3638 = null;
                    return;
                }
            }
            if (class203.field3517 == 6) {
                class140.field2505.field4124 = 0;
                class140.field2505.method1012((byte) -17, 17);
                class211.field3638.method1599(true, class140.field2505.field4124, class140.field2505.field4144, 0);
                class203.field3517 = 4;
            } else if (class203.field3517 == 7) {
                if (class211.field3638.method1598(0) >= 1) {
                    class19.field301 = (class211.field3638.method1604((byte) 78) + 3) * 60;
                    class25.field424 = 21;
                    class203.field3517 = 0;
                    class211.field3638.method1605(73);
                    class211.field3638 = null;
                }
            } else if (class203.field3517 != 10) {
                if (class203.field3517 == 8) {
                    if (class211.field3638.method1598(0) < 14) {
                        return;
                    }
                    class211.field3638.method1603(2000, class1.field4.field4144, 0, 14);
                    class1.field4.field4124 = 0;
                    class254.field4389 = class1.field4.method1651(4139);
                    field1010 = class1.field4.method1651(4139);
                    class31.field487 = class1.field4.method1651(4139) == 1;
                    class265.field4625 = class1.field4.method1651(4139) == 1;
                    class151.field2656 = class1.field4.method1651(4139) == 1;
                    class74.field1277 = class1.field4.method1651(4139) == 1;
                    class51.field886 = class1.field4.method1651(4139) == 1;
                    class229.field3934 = class1.field4.method1663((byte) -60);
                    class193.field3332 = class1.field4.method1651(4139) == 1;
                    class25.field423 = class1.field4.method1651(4139) == 1;
                    class9.method70(class25.field423, (byte) 78);
                    class165.method1187((byte) -125, class25.field423);
                    if (!class254.field4390) {
                        if ((!class31.field487 || class151.field2656) && !class193.field3332) {
                            try {
                                class247.field4288.method692(class234.field4017.field2277, Integer.MAX_VALUE);
                            } catch (Throwable var8) {
                            }
                        } else {
                            try {
                                class61.field1047.method692(class234.field4017.field2277, Integer.MAX_VALUE);
                            } catch (Throwable var9) {
                            }
                        }
                    }
                    class6.field126 = class1.field4.method1019((byte) 81);
                    class47.field820 = class1.field4.method1663((byte) -52);
                    class203.field3517 = 9;
                }
                if (class203.field3517 == 9 && class211.field3638.method1598(0) >= class47.field820) {
                    class1.field4.field4124 = 0;
                    class211.field3638.method1603(2000, class1.field4.field4144, 0, class47.field820);
                    class25.field424 = 2;
                    class203.field3517 = 0;
                    class96.method676(118);
                    class260.field4578 = -1;
                    class43.method337(false, (byte) 117);
                    class6.field126 = -1;
                }
            } else if (class211.field3638.method1598(0) >= 1) {
                class141.field2519 = class211.field3638.method1604((byte) 78);
                class203.field3517 = 0;
                class25.field424 = 29;
                class211.field3638.method1605(-98);
                class211.field3638 = null;
            }
        } catch (IOException var10) {
            if (class211.field3638 != null) {
                class211.field3638.method1605(-115);
                class211.field3638 = null;
            }
            if (class56.field972 >= 1) {
                class25.field424 = -4;
                class203.field3517 = 0;
            } else {
                class89.field1470 = 0;
                class56.field972++;
                if (class226.field3837 == class121.field2239) {
                    class121.field2239 = class232.field3981;
                } else {
                    class121.field2239 = class226.field3837;
                }
                class203.field3517 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([[IB)V")
    public static final void method418(int[][] arg0, byte arg1) {
        class229.field3939 = arg0;
        field997++;
        if (arg1 <= 3) {
            method418((int[][]) null, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)I")
    public final int method419(int arg0, int arg1, int arg2) {
        field1001++;
        int var4 = this.field1003;
        this.field1003 = 1;
        int var5 = this.field1002;
        this.field1002 = 300;
        this.field993 = class155.method1133(123);
        if (this.field994[this.field995] == 0L) {
            this.field1003 = var4;
            this.field1002 = var5;
        } else if (this.field993 > this.field994[this.field995]) {
            this.field1002 = (int) ((long) (arg0 * 2560) / (this.field993 - this.field994[this.field995]));
        }
        if (this.field1002 < 25) {
            this.field1002 = 25;
        }
        if (this.field1002 > 256) {
            this.field1002 = 256;
            this.field1003 = (int) ((long) arg0 - ((this.field993 - this.field994[this.field995]) / 10L));
        }
        if (this.field1003 > arg0) {
            this.field1003 = arg0;
        }
        this.field994[this.field995] = this.field993;
        this.field995 = (this.field995 + 1) % 10;
        if (this.field1003 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field994[var6] != 0L) {
                    this.field994[var6] += (long) this.field1003;
                }
            }
        }
        if (arg2 > this.field1003) {
            this.field1003 = arg2;
        }
        class226.method1543((long) this.field1003, -738);
        int var7 = 0;
        if (arg1 >= -73) {
            this.method419(-104, 56, -84);
        }
        while (this.field991 < 256) {
            var7++;
            this.field991 += this.field1002;
        }
        this.field991 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public final void method420(byte arg0) {
        if (arg0 == -91) {
            for (int var2 = 0; var2 < 10; var2++) {
                this.field994[var2] = 0L;
            }
            field992++;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BJ)Lmb;")
    public static final class96 method421(byte arg0, long arg1) {
        field998++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            if (arg0 != -114) {
                field1006 = null;
            }
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = field1005[(int) (var8 - (arg1 * 37L))];
            }
            class96 var7 = new class96();
            var7.field1580 = var6;
            var7.field1600 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static void method422(int arg0) {
        field1008 = null;
        if (arg0 != 1) {
            field1000 = null;
        }
        field1007 = null;
        field1006 = null;
        field1000 = null;
        field996 = null;
        field1005 = null;
        field1004 = null;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class57() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field994[var1] = this.field993;
        }
    }
}
