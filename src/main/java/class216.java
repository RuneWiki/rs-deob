import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class216 extends class194 {

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public int field3844;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public int field3836;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "[I")
    public int[] field3837;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "[Z")
    public boolean[] field3839;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "[I")
    public int[] field3838;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "[[I")
    public int[][] field3847;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Lqk;")
    public static class207 field3840 = class24.method212(255, "Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3");

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "Lqk;")
    public static class207 field3846 = class24.method212(255, "V-Brification des mises -9 jour )2 ");

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field3848 = 0;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)I")
    public static final int method1545(byte arg0) {
        field3842++;
        try {
            if (client.field2678 == 0) {
                if (class182.field3249 > class53.method405(95) - 5000L) {
                    return 0;
                }
                class270.field4775 = class20.field326.method1635(0, class279.field4890, class275.field4809);
                class22.field360 = class53.method405(18);
                client.field2678 = 1;
            }
            if (class53.method405(50) > class22.field360 + 30000L) {
                return class240.method1700(1000, -1);
            }
            int var1 = -18 % ((arg0 - 34) / 61);
            if (client.field2678 == 1) {
                if (class270.field4775.field1696 == 2) {
                    return class240.method1700(1001, -1);
                }
                if (class270.field4775.field1696 != 1) {
                    return -1;
                }
                class98.field1738 = new class127((Socket) class270.field4775.field1699, class20.field326);
                class261.field4645.field2593 = 0;
                class270.field4775 = null;
                int var2 = 0;
                if (class1.field15) {
                    var2 = class156.field2748;
                }
                class261.field4645.method1041(true, 28);
                class261.field4645.method1068(var2, 124);
                class98.field1738.method894(0, class261.field4645.field2568, class261.field4645.field2593, -101);
                if (class34.field677 != null) {
                    class34.field677.method448(0);
                }
                if (class200.field3532 != null) {
                    class200.field3532.method448(0);
                }
                int var3 = class98.field1738.method897(30000);
                if (class34.field677 != null) {
                    class34.field677.method448(0);
                }
                if (class200.field3532 != null) {
                    class200.field3532.method448(0);
                }
                if (var3 != 0) {
                    return class240.method1700(var3, -1);
                }
                client.field2678 = 2;
            }
            if (client.field2678 == 2) {
                if (class98.field1738.method891(1) < 2) {
                    return -1;
                }
                class31.field641 = class98.field1738.method897(30000);
                class31.field641 <<= 0x8;
                class31.field641 += class98.field1738.method897(30000);
                client.field2678 = 3;
                class36.field692 = 0;
                class106.field1877 = new byte[class31.field641];
            }
            if (client.field2678 != 3) {
                return -1;
            }
            int var4 = class98.field1738.method891(1);
            if (var4 < 1) {
                return -1;
            }
            if (var4 > (class31.field641 - class36.field692)) {
                var4 = class31.field641 - class36.field692;
            }
            class98.field1738.method889(class106.field1877, (byte) -32, var4, class36.field692);
            class36.field692 += var4;
            if (class36.field692 < class31.field641) {
                return -1;
            } else if (class3.method17(class106.field1877, false)) {
                class193.field3404 = new class260[class220.field4008];
                int var5 = 0;
                for (int var6 = class268.field4749; var6 <= class234.field4318; var6++) {
                    class260 var7 = class97.method689((byte) 113, var6);
                    if (var7 != null) {
                        class193.field3404[var5++] = var7;
                    }
                }
                class98.field1738.method888(true);
                class283.field4967 = 0;
                class98.field1738 = null;
                class106.field1877 = null;
                client.field2678 = 0;
                class182.field3249 = class53.method405(110);
                return 0;
            } else {
                return class240.method1700(1002, -1);
            }
        } catch (IOException var8) {
            return class240.method1700(1003, -1);
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
    public static void method1546(int arg0) {
        int var1 = -116 % (-arg0 / 60);
        field3846 = null;
        field3840 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([ILfk;B[I[I)V")
    public static final void method1547(int[] arg0, class14 arg1, byte arg2, int[] arg3, int[] arg4) {
        int var5 = 75 / ((-arg2 - 59) / 56);
        for (int var6 = 0; var6 < arg0.length; var6++) {
            int var7 = arg0[var6];
            int var8 = arg4[var6];
            int var9 = arg3[var6];
            for (int var10 = 0; var9 != 0 && var10 < arg1.field5065.length; var10++) {
                if ((var9 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg1.field5065[var10] = null;
                    } else {
                        class65 var11 = class16.method101((byte) 68, var7);
                        int var12 = var11.field1171;
                        class195 var13 = arg1.field5065[var10];
                        if (var13 != null) {
                            if (var13.field3424 == var7) {
                                if (var12 == 0) {
                                    var13 = arg1.field5065[var10] = null;
                                } else if (var12 == 1) {
                                    var13.field3426 = 0;
                                    var13.field3429 = 1;
                                    var13.field3433 = 0;
                                    var13.field3427 = var8;
                                    var13.field3421 = 0;
                                    class69.method497(arg1.field5104, class202.field3565 == arg1, 0, -81, arg1.field5072, var11);
                                } else if (var12 == 2) {
                                    var13.field3426 = 0;
                                }
                            } else if (var11.field1169 >= class16.method101((byte) -109, var13.field3424).field1169) {
                                var13 = arg1.field5065[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class195 var14 = arg1.field5065[var10] = new class195();
                            var14.field3426 = 0;
                            var14.field3427 = var8;
                            var14.field3433 = 0;
                            var14.field3421 = 0;
                            var14.field3429 = 1;
                            var14.field3424 = var7;
                            class69.method497(arg1.field5104, class202.field3565 == arg1, 0, -26, arg1.field5072, var11);
                        }
                    }
                }
                var9 >>>= 0x1;
            }
        }
        field3845++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Z")
    public static final boolean method1548(int arg0, int arg1) {
        if (arg0 != -15392) {
            field3840 = null;
        }
        field3841++;
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZIIIIB)Luh;")
    public static final class100 method1549(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3843++;
        int var7 = (arg1 << 19) + (arg3 << 17) + (arg0 ? 65536 : 0) + arg2;
        long var8 = (long) arg4 * 3147483667L + (long) var7 * 3849834839L;
        class100 var10 = (class100) class165.field2917.method1387(var8, 121);
        if (arg5 != -59) {
            method1547((int[]) null, (class14) null, (byte) 76, (int[]) null, (int[]) null);
        }
        if (var10 != null) {
            return var10;
        }
        class257.field4594 = false;
        class100 var11 = class112.method800(arg1, arg3, false, arg2, 27222, arg0, false, arg4);
        if (var11 != null && !class257.field4594) {
            class165.field2917.method1385(var8, var11, (byte) -128);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I[B)V")
    public class216(int arg0, byte[] arg1) {
        this.field3844 = arg0;
        class149 var3 = new class149(arg1);
        this.field3836 = var3.method1045((byte) -23);
        this.field3837 = new int[this.field3836];
        this.field3839 = new boolean[this.field3836];
        this.field3838 = new int[this.field3836];
        this.field3847 = new int[this.field3836][];
        for (int var4 = 0; var4 < this.field3836; var4++) {
            this.field3838[var4] = var3.method1045((byte) 119);
        }
        for (int var5 = 0; var5 < this.field3836; var5++) {
            this.field3839[var5] = var3.method1045((byte) 98) == 1;
        }
        for (int var6 = 0; var6 < this.field3836; var6++) {
            this.field3837[var6] = var3.method1050(1272006568);
        }
        for (int var7 = 0; var7 < this.field3836; var7++) {
            this.field3847[var7] = new int[var3.method1045((byte) -111)];
        }
        for (int var8 = 0; var8 < this.field3836; var8++) {
            for (int var9 = 0; var9 < this.field3847[var8].length; var9++) {
                this.field3847[var8][var9] = var3.method1045((byte) 103);
            }
        }
    }
}
