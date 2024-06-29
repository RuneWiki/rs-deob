import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class263 {

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "[B")
    private byte[] field3972;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "[I")
    private int[] field3964;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "[I")
    private int[] field3968;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "Lbd;")
    public static class44 field3967 = new class44("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "Lbd;")
    public static class44 field3976 = new class44("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "[[Z")
    public static boolean[][] field3978 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "I")
    public static int field3979 = 0;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "[Lir;")
    public static class22[] field3977 = new class22[2048];

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "Lqv;")
    public static class316 field3981 = new class316(49, -2);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "Lci;")
    public static class320 field3975;

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "Lci;")
    public static class320 field3980;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field3973;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/awt/Canvas;ILul;Ll;I)Lqa;", line = 7)
    public static final class167 method1698(Canvas arg0, int arg1, class411 arg2, class16 arg3, int arg4) {
        if (arg1 >= -30) {
            field3980 = null;
        }
        field3970++;
        return new class125(arg4, arg0, arg3, arg2);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V", line = 21)
    public static void method1699(int arg0) {
        field3975 = null;
        if (arg0 != 0) {
            return;
        }
        field3978 = null;
        field3977 = null;
        field3976 = null;
        field3973 = null;
        field3980 = null;
        field3981 = null;
        field3967 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)I", line = 38)
    public static final int method1700(byte arg0) {
        field3974++;
        if (arg0 > -10) {
            field3975 = null;
        }
        return class515.field7471;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([B[BIIII)I", line = 58)
    public final int method1701(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field3963++;
        int var7 = 0;
        int var8 = arg3 + arg5;
        int var9 = arg2 << 3;
        while (var8 > arg5) {
            int var10 = arg0[arg5] & 0xFF;
            int var11 = this.field3964[var10];
            byte var12 = this.field3972[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class442.method2600(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg5++;
        }
        if (arg4 != -16025) {
            field3975 = null;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "([B)V", line = 131)
    public class263(byte[] arg0) {
        int var2 = arg0.length;
        this.field3972 = arg0;
        this.field3964 = new int[var2];
        this.field3968 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3964[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class442.method2600(var12, var11);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field3968[var14] == 0) {
                            this.field3968[var14] = var4;
                        }
                        var14 = this.field3968[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field3968.length) {
                        int[] var18 = new int[this.field3968.length * 2];
                        for (int var19 = 0; var19 < this.field3968.length; var19++) {
                            var18[var19] = this.field3968[var19];
                        }
                        this.field3968 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field3968[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V", line = 254)
    public static final void method1702(int arg0) {
        field3969++;
        if (class193.field2807 == 6 && arg0 == -28448) {
            class193.field2807 = 7;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([BI[BIII)I", line = 268)
    public final int method1703(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field3965++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg4 + arg5;
        int var8 = 0;
        int var9 = arg1;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field3968[var8];
            }
            int var11;
            if ((var11 = this.field3968[var8]) < 0) {
                arg2[arg4++] = (byte) (~var11);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3968[var8];
            }
            int var12;
            if ((var12 = this.field3968[var8]) < 0) {
                arg2[arg4++] = (byte) (~var12);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3968[var8];
            }
            int var13;
            if ((var13 = this.field3968[var8]) < 0) {
                arg2[arg4++] = (byte) (~var13);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3968[var8];
            }
            int var14;
            if ((var14 = this.field3968[var8]) < 0) {
                arg2[arg4++] = (byte) (~var14);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3968[var8];
            }
            int var15;
            if ((var15 = this.field3968[var8]) < 0) {
                arg2[arg4++] = (byte) (~var15);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3968[var8];
            }
            int var16;
            if ((var16 = this.field3968[var8]) < 0) {
                arg2[arg4++] = (byte) (~var16);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3968[var8];
            }
            int var17;
            if ((var17 = this.field3968[var8]) < 0) {
                arg2[arg4++] = (byte) (~var17);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3968[var8];
            }
            int var18;
            if ((var18 = this.field3968[var8]) < 0) {
                arg2[arg4++] = (byte) (~var18);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return arg3 == 24767 ? var9 + 1 - arg1 : -1;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLul;)[Lvi;", line = 421)
    public static final class384[] method1704(byte arg0, class411 arg1) {
        field3971++;
        if (!arg1.method2442(-55)) {
            return new class384[0];
        }
        class81 var2 = arg1.method2460((byte) -95);
        while (var2.field1314 == 0) {
            class477.method2826(10L, 0);
        }
        if (var2.field1314 == 2) {
            return new class384[0];
        }
        int[] var3 = (int[]) var2.field1311;
        class384[] var4 = new class384[var3.length >> 2];
        if (arg0 < 116) {
            field3967 = null;
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class384 var6 = new class384();
            var4[var5] = var6;
            var6.field5492 = var3[var5 << 2];
            var6.field5491 = var3[(var5 << 2) + 1];
            var6.field5490 = var3[(var5 << 2) + 2];
            var6.field5493 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZII)V", line = 462)
    public static final void method1705(boolean arg0, int arg1, int arg2) {
        if (~arg1 == arg2) {
            class76.field1256 = class167.method1196(arg1, class2.field1, class280.field4173, class481.field6991, -32568, class220.field3371.field2576 * 2);
        } else {
            if (arg0) {
                class76.field1256 = class167.method1196(0, class2.field1, class280.field4173, class481.field6991, -32568, 0);
                class76.field1256.method233(0);
                class119 var3 = class159.method1115(class149.field2287, 0, -4, class470.field6816);
                class269 var4 = class76.field1256.method279(var3, class104.method760(class96.field1527, class470.field6816, 0), true);
                class283.method1825(true, var4, class235.field3505.method426(class503.field7255, 125), -121);
                class76.field1256.method280();
                class219.method1485((byte) 119);
                class76.field1256.method1197((byte) -48);
            }
            try {
                class76.field1256 = class167.method1196(arg1, class2.field1, class280.field4173, class481.field6991, -32568, class220.field3371.field2576 * 2);
                if (class76.field1256.method336()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class200 var6;
                    if (var5) {
                        var6 = class76.field1256.method262(146800640);
                    } else {
                        var6 = class76.field1256.method262(104857600);
                    }
                    class76.field1256.method299(var6);
                }
            } catch (Throwable var8) {
                class76.field1256 = class167.method1196(0, class2.field1, class280.field4173, class481.field6991, arg2 - 32567, 0);
                arg1 = 0;
            }
        }
        field3966++;
        class74.field1211 = arg1;
        class362.method2237((byte) -53);
        if (!class76.field1256.method187()) {
            class327.field4806 = 1;
        }
        class76.field1256.method317(class327.field4806);
        class76.field1256.method192(0);
        class76.field1256.method351(8);
        class289.field4283 = class76.field1256.method245();
        class94.field1503 = class76.field1256.method245();
        class176.method1231((byte) 16);
        class76.field1256.method265(!class220.field3371.field2585);
        if (class76.field1256.method350()) {
            class390.method2353((byte) 78, class220.field3371.field2578);
        }
        class230.method1535(2, class69.field1139 >> 3, class76.field1256, class255.field3763 >> 3);
        class199.method1355(false);
        class132.field2068 = false;
    }
}
