import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class256 extends class41 {

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public int field4473;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public int field4471;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "[J")
    public static long[] field4483 = new long[100];

    @OriginalMember(owner = "client!td", name = "K", descriptor = "[[I")
    public static int[][] field4485 = new int[104][104];

    @OriginalMember(owner = "client!td", name = "F", descriptor = "Lsc;")
    public static class181 field4481 = class149.method967(255, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!td", name = "I", descriptor = "Lsc;")
    public static class181 field4484 = class149.method967(255, "welle2:");

    @OriginalMember(owner = "client!td", name = "L", descriptor = "[I")
    public static int[] field4486 = new int[32];

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "[Ltg;")
    public static class107[] field4474;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "[Lka;")
    public static class134[] field4475;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "[Lo;")
    public static class175[] field4482;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)I")
    public static final int method1741(int arg0, byte arg1) {
        field4478++;
        if (arg1 < 57) {
            method1747();
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lsc;IILsc;Lsc;)V")
    public static final void method1742(class181 arg0, int arg1, int arg2, class181 arg3, class181 arg4) {
        int var5 = 39 % ((-arg1 - 55) / 53);
        field4479++;
        class221.method1467(arg4, arg3, -6700, arg0, arg2, -1);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILvf;)V")
    public static final void method1743(int arg0, class230 arg1) {
        field4480++;
        byte[] var2 = new byte[24];
        if (class190.field3353 != null) {
            try {
                class190.field3353.method1456(false, 0L);
                int var3 = 0;
                class190.field3353.method1452(var2, (byte) -45);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1564(24, var2, (byte) 38, 0);
        if (arg0 > -59) {
            method1741(-30, (byte) 77);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([Li;III)V")
    public static final void method1744(class192[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 > arg3) {
            int var4 = arg3 - 1;
            int var5 = (arg2 + arg3) / 2;
            class192 var6 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var6;
            int var7 = arg2 + 1;
            while (var7 > var4) {
                boolean var8 = true;
                do {
                    var7--;
                    for (int var9 = 0; var9 < 4; var9++) {
                        int var10;
                        int var11;
                        if (class64.field1031[var9] == 2) {
                            var11 = var6.field3377;
                            var10 = arg0[var7].field3377;
                        } else if (class64.field1031[var9] == 1) {
                            var10 = arg0[var7].field3371;
                            if (var10 == -1 && class33.field539[var9] == 1) {
                                var10 = 2001;
                            }
                            var11 = var6.field3371;
                            if (var11 == -1 && class33.field539[var9] == 1) {
                                var11 = 2001;
                            }
                        } else if (class64.field1031[var9] == 3) {
                            var10 = arg0[var7].field3368 ? 1 : 0;
                            var11 = var6.field3368 ? 1 : 0;
                        } else {
                            var10 = arg0[var7].field3380;
                            var11 = var6.field3380;
                        }
                        if (var10 != var11) {
                            if ((class33.field539[var9] != 1 || var10 <= var11) && (class33.field539[var9] != 0 || var10 >= var11)) {
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
                        if (class64.field1031[var13] == 2) {
                            var15 = var6.field3377;
                            var14 = arg0[var4].field3377;
                        } else if (class64.field1031[var13] == 1) {
                            var14 = arg0[var4].field3371;
                            if (var14 == -1 && class33.field539[var13] == 1) {
                                var14 = 2001;
                            }
                            var15 = var6.field3371;
                            if (var15 == -1 && class33.field539[var13] == 1) {
                                var15 = 2001;
                            }
                        } else if (class64.field1031[var13] == 3) {
                            var14 = arg0[var4].field3368 ? 1 : 0;
                            var15 = var6.field3368 ? 1 : 0;
                        } else {
                            var15 = var6.field3380;
                            var14 = arg0[var4].field3380;
                        }
                        if (var14 != var15) {
                            if ((class33.field539[var13] != 1 || var15 <= var14) && (class33.field539[var13] != 0 || var15 >= var14)) {
                                var12 = false;
                            }
                            break;
                        }
                        if (var13 == 3) {
                            var12 = false;
                        }
                    }
                } while (var12);
                if (var4 < var7) {
                    class192 var16 = arg0[var4];
                    arg0[var4] = arg0[var7];
                    arg0[var7] = var16;
                }
            }
            method1744(arg0, -8684, var7, arg3);
            method1744(arg0, arg1, arg2, var7 + 1);
        }
        if (arg1 == -8684) {
            field4477++;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(II)V")
    public class256(int arg0, int arg1) {
        this.field4473 = arg1;
        this.field4471 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII)I")
    public static final int method1745(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > 243) {
            arg3 >>= 0x4;
        } else if (arg1 > 217) {
            arg3 >>= 0x3;
        } else if (arg1 > 192) {
            arg3 >>= 0x2;
        } else if (arg1 > 179) {
            arg3 >>= 0x1;
        }
        field4476++;
        if (arg0 != 4) {
            method1745(74, -115, 96, -85);
        }
        return (arg2 >> 2 << 10) + (arg3 >> 5 << 7) + (arg1 >> 1);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
    public static void method1746(int arg0) {
        field4485 = null;
        field4475 = null;
        field4486 = null;
        field4474 = null;
        field4484 = null;
        field4483 = null;
        if (arg0 != 13339) {
            method1745(33, -82, -53, 63);
        }
        field4481 = null;
        field4482 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()V")
    public static final void method1747() {
        for (int var0 = 0; var0 < class26.field455; var0++) {
            for (int var4 = 0; var4 < class238.field4129; var4++) {
                for (int var5 = 0; var5 < class2.field47; var5++) {
                    class221.field3820[var0][var4][var5] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class213.field3671; var1++) {
            class262.field4569[var1] = null;
        }
        class213.field3671 = 0;
        for (int var2 = 0; var2 < class100.field1665; var2++) {
            class4.field89[var2] = null;
        }
        class100.field1665 = 0;
        for (int var3 = 0; var3 < class121.field1992.length; var3++) {
            class121.field1992[var3] = null;
        }
    }
}
