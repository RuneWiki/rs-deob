import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class67 {

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    private int field1014 = 32;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "J")
    private long field1020 = class205.method1451(51);

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "J")
    private long field1035 = 0L;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    private int field1045 = 0;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "J")
    private long field1042 = 0L;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "[Lu;")
    private class24[] field1039 = new class24[8];

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    private int field1040 = 0;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "Z")
    private boolean field1047 = true;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    private int field1044 = 0;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "[Lu;")
    private class24[] field1049 = new class24[8];

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    private int field1038 = 0;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "[Lwg;")
    public static class233[] field1030 = new class233[27];

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "Z")
    public static boolean field1036 = true;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Lgb;")
    public static class212 field1015 = new class212(20);

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "Ltl;")
    private static class59 field1043 = class85.method639("Starting 3d Library", 9588);

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "Ltl;")
    public static class59 field1048 = field1043;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    private int field1034;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "Lu;")
    private class24 field1022;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "[I")
    public int[] field1024;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V", line = 15)
    private final void method546(int arg0, int arg1) {
        field1029++;
        this.field1038 -= arg0;
        int var3 = -6 % ((52 - arg1) / 49);
        if (this.field1038 < 0) {
            this.field1038 = 0;
        }
        if (this.field1022 != null) {
            this.field1022.method154(arg0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([II)V", line = 34)
    private final void method547(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class274.field4723) {
            var3 = arg1 << 1;
        }
        class63.method523(arg0, 0, var3);
        this.field1038 -= arg1;
        if (this.field1022 != null && this.field1038 <= 0) {
            this.field1038 += class84.field1322 >> 4;
            class281.method1977(31406, this.field1022);
            this.method557(this.field1022.method153(), this.field1022, 122);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class24 var10 = null;
                        class24 var11 = this.field1049[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class110 var12 = var11.field316;
                                if (var12 == null || var12.field1809 <= var8) {
                                    var11.field315 = true;
                                    int var13 = var11.method159();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1809 += var13;
                                    }
                                    if (var4 >= this.field1014) {
                                        break label105;
                                    }
                                    class24 var14 = var11.method156();
                                    if (var14 != null) {
                                        int var15 = var11.field318;
                                        while (var14 != null) {
                                            this.method557(var15 * var14.method153() >> 8, var14, -1);
                                            var14 = var11.method158();
                                        }
                                    }
                                    class24 var16 = var11.field317;
                                    var11.field317 = null;
                                    if (var10 == null) {
                                        this.field1049[var7] = var16;
                                    } else {
                                        var10.field317 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1039[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field317;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class24 var18 = this.field1049[var17];
                this.field1049[var17] = this.field1039[var17] = null;
                while (var18 != null) {
                    class24 var19 = var18.field317;
                    var18.field317 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1038 < 0) {
            this.field1038 = 0;
        }
        if (this.field1022 != null) {
            this.field1022.method157(arg0, 0, arg1);
        }
        this.field1020 = class205.method1451(-88);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 194)
    public void method548(Component arg0) throws Exception {
        field1013++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 204)
    public final synchronized void method549(byte arg0) {
        field1027++;
        if (this.field1024 == null) {
            return;
        }
        long var2 = class205.method1451(35);
        try {
            if (this.field1035 != 0L) {
                if (var2 < this.field1035) {
                    return;
                }
                this.method560(this.field1041);
                this.field1047 = true;
                this.field1035 = 0L;
            }
            int var4 = this.method554();
            if ((this.field1040 - var4) > this.field1045) {
                this.field1045 = this.field1040 - var4;
            }
            int var5 = this.field1037 + this.field1034;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field1041 < var5 + 256) {
                this.field1041 += 1024;
                var4 = 0;
                if (this.field1041 > 16384) {
                    this.field1041 = 16384;
                }
                this.method562();
                this.method560(this.field1041);
                this.field1047 = true;
                if ((var5 + 256) > this.field1041) {
                    var5 = this.field1041 - 256;
                    this.field1034 = var5 - this.field1037;
                }
            }
            while (var5 > var4) {
                var4 += 256;
                this.method547(this.field1024, 256);
                this.method551();
            }
            if (this.field1042 < var2) {
                if (this.field1047) {
                    this.field1047 = false;
                } else if (this.field1045 == 0 && this.field1044 == 0) {
                    this.method562();
                    this.field1035 = var2 + 2000L;
                    return;
                } else {
                    this.field1034 = Math.min(this.field1044, this.field1045);
                    this.field1044 = this.field1045;
                }
                this.field1045 = 0;
                this.field1042 = var2 + 2000L;
            }
            this.field1040 = var4;
        } catch (Exception var9) {
            this.method562();
            this.field1035 = var2 + 2000L;
        }
        try {
            if (arg0 > -119) {
                this.field1035 = -103L;
            }
            if (this.field1020 + 500000L < var2) {
                var2 = this.field1020;
            }
            while (this.field1020 + 5000L < var2) {
                this.method546(256, 123);
                this.field1020 += (long) (256000 / class84.field1322);
            }
        } catch (Exception var8) {
            this.field1020 = var2;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[IBJ)Ltl;", line = 316)
    public static final class59 method550(int arg0, int[] arg1, byte arg2, long arg3) {
        field1032++;
        if (arg2 != -109) {
            field1015 = (class212) null;
        }
        if (class274.field4722 != null) {
            class59 var5 = class274.field4722.method100(arg0, arg3, true, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        return arg0 == 5 ? class151.method1085(1, arg3).method480((byte) 106) : class284.method1986(-79, arg3);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()V", line = 344)
    public void method551() throws Exception {
        field1019++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 357)
    public final synchronized void method552(int arg0) {
        if (class232.field3809 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class232.field3809.field3226[var3] == this) {
                    class232.field3809.field3226[var3] = null;
                }
                if (class232.field3809.field3226[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class232.field3809.field3227 = true;
                while (class232.field3809.field3221) {
                    class183.method1360(false, 50L);
                }
                class232.field3809 = null;
            }
        }
        field1018++;
        if (arg0 == -23825) {
            this.method562();
            this.field1024 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(DB)V", line = 405)
    public static final void method553(double arg0, byte arg1) {
        int var3 = 111 / ((66 - arg1) / 59);
        field1033++;
        if (class7.field89 == arg0) {
            return;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = (int) (Math.pow((double) var4 / 255.0D, arg0) * 255.0D);
            class172.field2832[var4] = var5 > 255 ? 255 : var5;
        }
        class7.field89 = arg0;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "()I", line = 430)
    public int method554() throws Exception {
        field1031++;
        return this.field1041;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V", line = 439)
    public final synchronized void method555(int arg0) {
        if (arg0 != 2000) {
            field1030 = (class233[]) null;
        }
        this.field1047 = true;
        field1023++;
        try {
            this.method559();
        } catch (Exception var3) {
            this.method562();
            this.field1035 = class205.method1451(arg0 - 2015) + 2000L;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lu;I)V", line = 462)
    public final synchronized void method556(class24 arg0, int arg1) {
        field1017++;
        if (arg1 <= 83) {
            this.method546(8, -83);
        }
        this.field1022 = arg0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILu;I)V", line = 476)
    private final void method557(int arg0, class24 arg1, int arg2) {
        field1021++;
        int var4 = 120 % ((arg2 - 51) / 33);
        int var5 = arg0 >> 5;
        class24 var6 = this.field1039[var5];
        if (var6 == null) {
            this.field1049[var5] = arg1;
        } else {
            var6.field317 = arg1;
        }
        this.field1039[var5] = arg1;
        arg1.field318 = arg0;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V", line = 501)
    public final void method558(int arg0) {
        field1025++;
        int var2 = 46 / ((arg0 - 7) / 40);
        this.field1047 = true;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "()V", line = 513)
    public void method559() throws Exception {
        field1028++;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V", line = 520)
    public void method560(int arg0) throws Exception {
        field1016++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)Lag;", line = 528)
    public static final class186 method561(int arg0, int arg1, int arg2) {
        field1026++;
        if (arg0 != 32) {
            field1036 = true;
        }
        class186 var3 = (class186) class60.field934.method685((long) arg2 << 32 | (long) arg1, 128);
        if (var3 == null) {
            var3 = new class186(arg2, arg1);
            class60.field934.method694(var3, (byte) -90, var3.field4932);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "()V", line = 546)
    public void method562() {
        field1046++;
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V", line = 553)
    public static void method563(int arg0) {
        field1048 = null;
        field1015 = null;
        field1043 = null;
        if (arg0 >= 100) {
            field1030 = null;
        }
    }
}
