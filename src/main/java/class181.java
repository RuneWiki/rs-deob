import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class181 extends class270 {

    @OriginalMember(owner = "client!la", name = "jb", descriptor = "I")
    private int field2880 = -1;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "[Lmi;")
    public static class92[] field2868 = new class92[2048];

    @OriginalMember(owner = "client!la", name = "ib", descriptor = "Lmh;")
    public static class62 field2879 = null;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "Lmh;")
    public static class62 field2866 = class201.method1405(true, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!la", name = "fb", descriptor = "Lmh;")
    public static class62 field2876 = class201.method1405(true, " ");

    @OriginalMember(owner = "client!la", name = "S", descriptor = "I")
    private int field2863;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!la", name = "ab", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!la", name = "bb", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!la", name = "cb", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!la", name = "db", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!la", name = "eb", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!la", name = "hb", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!la", name = "kb", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!la", name = "lb", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!la", name = "mb", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!la", name = "nb", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!la", name = "ob", descriptor = "I")
    private int field2885;

    @OriginalMember(owner = "client!la", name = "gb", descriptor = "[I")
    private int[] field2877;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(III)V", line = 8)
    public static final void method1266(int arg0, int arg1, int arg2) {
        field2883++;
        int[] var3 = new int[4];
        if (arg2 != 20450) {
            method1270(-107, -30L);
        }
        var3[0] = arg1;
        int[] var4 = new int[4];
        int var5 = 1;
        var4[0] = arg0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class256.field4329[var6] != arg1) {
                var3[var5] = class256.field4329[var6];
                var4[var5] = class94.field1551[var6];
                var5++;
            }
        }
        class256.field4329 = var3;
        class94.field1551 = var4;
        method1274(0, (byte) -125, class20.field215.length - 1, class20.field215);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLhi;)I", line = 46)
    public static final int method1267(byte arg0, class26 arg1) {
        field2867++;
        if (arg0 < 0) {
            field2869 = -39;
        }
        int var2 = 0;
        if (arg1.method136(5, class184.field2954)) {
            var2++;
        }
        if (arg1.method136(5, class256.field4321)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!la", name = "i", descriptor = "(B)Z", line = 70)
    private final boolean method1268(byte arg0) {
        if (arg0 != -23) {
            return false;
        }
        field2864++;
        if (this.field2877 != null) {
            return true;
        } else if (this.field2880 >= 0) {
            int var2 = class109.field1770;
            int var3 = class266.field4496;
            int var4 = class205.field3480.method189(arg0 - 94, this.field2880) ? 64 : 128;
            this.field2877 = class205.field3480.method190(this.field2880, (byte) -10);
            this.field2863 = var4;
            this.field2885 = var4;
            class122.method934(arg0 ^ 0xFFFFFFB2, var2, var3);
            return this.field2877 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!la", name = "g", descriptor = "(B)I", line = 108)
    public final int method1269(byte arg0) {
        int var2 = -64 % ((arg0 - 54) / 40);
        field2881++;
        return this.field2880;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IJ)V", line = 117)
    public static final void method1270(int arg0, long arg1) {
        field2878++;
        if (arg0 >= -77) {
            field2879 = (class62) null;
        }
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class190.field3042; var3++) {
            if (class64.field963[var3] == arg1) {
                class45.field672++;
                class190.field3042--;
                for (int var4 = var3; var4 < class190.field3042; var4++) {
                    class294.field5022[var4] = class294.field5022[var4 + 1];
                    class26.field311[var4] = class26.field311[var4 + 1];
                    class234.field4034[var4] = class234.field4034[var4 + 1];
                    class64.field963[var4] = class64.field963[var4 + 1];
                    class144.field2299[var4] = class144.field2299[var4 + 1];
                    class203.field3430[var4] = class203.field3430[var4 + 1];
                }
                class17.field153 = class105.field1716;
                class170.field2772.method1693(253, false);
                class170.field2772.method694(arg1, (byte) -34);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V", line = 177)
    public static final void method1271(int arg0) {
        if (arg0 >= -83) {
            method1270(-52, -62L);
        }
        field2884++;
        class21.field227 = null;
        class92.field1513 = null;
        class286.field4891 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BILhi;I)Lfd;", line = 197)
    public static final class61 method1272(byte arg0, int arg1, class26 arg2, int arg3) {
        field2882++;
        if (class127.method951(arg2, arg3, 94, arg1)) {
            if (arg0 != -83) {
                method1275(true);
            }
            return class226.method1603(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(II)I", line = 214)
    public static final int method1273(int arg0, int arg1) {
        field2873++;
        if (arg0 != 6) {
            method1271(95);
        }
        if (class185.field2964 == 1) {
            return 7;
        } else if (class185.field2964 == 2) {
            return 20;
        } else if (arg1 == 15) {
            return 13;
        } else if (arg1 == 16) {
            return 3;
        } else if (arg1 == 22) {
            return 8;
        } else if (arg1 == 31) {
            return 14;
        } else if (arg1 == 38) {
            return 2;
        } else if (arg1 == 43) {
            return 15;
        } else if (arg1 == 48) {
            return 17;
        } else if (arg1 == 58) {
            return 11;
        } else if (arg1 == 69) {
            return 6;
        } else if (arg1 == 74) {
            return 20;
        } else if (arg1 == 77) {
            return 1;
        } else if (arg1 == 101) {
            return 12;
        } else if (arg1 == 103) {
            return 19;
        } else if (arg1 == 152) {
            return 16;
        } else if (arg1 == 161) {
            return 4;
        } else if (arg1 == 162) {
            return 9;
        } else if (arg1 == 166) {
            return 10;
        } else if (arg1 == 179) {
            return 18;
        } else if (arg1 == 191) {
            return 5;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)[[I", line = 385)
    public final int[][] method11(boolean arg0, int arg1) {
        int[][] var3 = this.field4589.method605(arg1, 19195);
        field2871++;
        if (this.field4589.field1320 && this.method1268((byte) -23)) {
            int var4 = (class266.field4496 == this.field2885 ? arg1 : this.field2885 * arg1 / class266.field4496) * this.field2863;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class109.field1770 == this.field2863) {
                for (int var8 = 0; var8 < class109.field1770; var8++) {
                    int var9 = this.field2877[var4++];
                    var7[var8] = class234.method1648(255, var9) << 4;
                    var6[var8] = class234.method1648(65280, var9) >> 4;
                    var5[var8] = class234.method1648(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class109.field1770; var10++) {
                    int var11 = this.field2863 * var10 / class109.field1770;
                    int var12 = this.field2877[var4 + var11];
                    var7[var10] = class234.method1648(255, var12) << 4;
                    var6[var10] = class234.method1648(var12 >> 4, 4080);
                    var5[var10] = class234.method1648(16711680, var12) >> 12;
                }
            }
        }
        if (arg0) {
            field2868 = (class92[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBI[Lle;)V", line = 451)
    public static final void method1274(int arg0, byte arg1, int arg2, class193[] arg3) {
        field2870++;
        if (arg2 > arg0) {
            int var4 = arg0 - 1;
            int var5 = arg2 + 1;
            int var6 = (arg0 + arg2) / 2;
            class193 var7 = arg3[var6];
            arg3[var6] = arg3[arg0];
            arg3[arg0] = var7;
            while (var5 > var4) {
                boolean var8 = true;
                do {
                    var5--;
                    for (int var9 = 0; var9 < 4; var9++) {
                        int var10;
                        int var11;
                        if (class256.field4329[var9] == 2) {
                            var10 = var7.field3249;
                            var11 = arg3[var5].field3249;
                        } else if (class256.field4329[var9] == 1) {
                            var11 = arg3[var5].field3239;
                            if (var11 == -1 && class94.field1551[var9] == 1) {
                                var11 = 2001;
                            }
                            var10 = var7.field3239;
                            if (var10 == -1 && class94.field1551[var9] == 1) {
                                var10 = 2001;
                            }
                        } else if (class256.field4329[var9] == 3) {
                            var11 = arg3[var5].field3242 ? 1 : 0;
                            var10 = var7.field3242 ? 1 : 0;
                        } else {
                            var10 = var7.field3252;
                            var11 = arg3[var5].field3252;
                        }
                        if (var10 != var11) {
                            if ((class94.field1551[var9] != 1 || var11 <= var10) && (class94.field1551[var9] != 0 || var11 >= var10)) {
                                var8 = false;
                            }
                            break;
                        }
                        if (var9 == 3) {
                            var8 = false;
                        }
                    }
                } while (var8);
                boolean var12 = true;
                do {
                    var4++;
                    for (int var13 = 0; var13 < 4; var13++) {
                        int var14;
                        int var15;
                        if (class256.field4329[var13] == 2) {
                            var14 = arg3[var4].field3249;
                            var15 = var7.field3249;
                        } else if (class256.field4329[var13] == 1) {
                            var14 = arg3[var4].field3239;
                            var15 = var7.field3239;
                            if (var15 == -1 && class94.field1551[var13] == 1) {
                                var15 = 2001;
                            }
                            if (var14 == -1 && class94.field1551[var13] == 1) {
                                var14 = 2001;
                            }
                        } else if (class256.field4329[var13] == 3) {
                            var14 = arg3[var4].field3242 ? 1 : 0;
                            var15 = var7.field3242 ? 1 : 0;
                        } else {
                            var15 = var7.field3252;
                            var14 = arg3[var4].field3252;
                        }
                        if (var14 != var15) {
                            if ((class94.field1551[var13] != 1 || var15 <= var14) && (class94.field1551[var13] != 0 || var14 <= var15)) {
                                var12 = false;
                            }
                            break;
                        }
                        if (var13 == 3) {
                            var12 = false;
                        }
                    }
                } while (var12);
                if (var4 < var5) {
                    class193 var16 = arg3[var4];
                    arg3[var4] = arg3[var5];
                    arg3[var5] = var16;
                }
            }
            method1274(arg0, (byte) 13, var5, arg3);
            method1274(var5 + 1, (byte) -126, arg2, arg3);
        }
        int var17 = -67 % ((-arg1 - 84) / 37);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 631)
    public static void method1275(boolean arg0) {
        field2868 = null;
        field2876 = null;
        if (arg0) {
            field2868 = (class92[]) null;
        }
        field2879 = null;
        field2866 = null;
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(B)V", line = 645)
    public final void method1276(byte arg0) {
        if (arg0 > -34) {
            this.method8((class92) null, -127, 39);
        }
        field2865++;
        super.method1276((byte) -96);
        this.field2877 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lmi;II)V", line = 665)
    public final void method8(class92 arg0, int arg1, int arg2) {
        field2875++;
        if (arg1 == 0) {
            this.field2880 = arg0.method721(117);
        }
        int var4 = -54 / ((arg2 + 8) / 53);
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V", line = 689)
    public class181() {
        super(0, false);
    }
}
