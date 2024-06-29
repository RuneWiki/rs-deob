import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class425 extends class148 {

    @OriginalMember(owner = "client!re", name = "K", descriptor = "[S")
    private short[] field6376 = new short[257];

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    private int field6384 = 0;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field6375 = 0;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "Llt;")
    public static class475 field6389;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "[I")
    public static int[] field6391;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "Lri;")
    public static class73 field6390;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "Z")
    public static boolean field6392;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "I")
    public static int field6388;

    // $FF: synthetic field
    @OriginalMember(owner = "client!re", name = "bb", descriptor = "Ljava/lang/Class;")
    public static Class field6393;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "[I")
    private int[] field6378;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "[I")
    private int[] field6380;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "[[I")
    private int[][] field6386;

    // $FF: synthetic method
    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2552(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class475("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field6389 = new class475("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");
        new class475("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field6391 = new int[13];
        field6390 = new class73(60, -2);
        field6392 = false;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method25(int arg0, int arg1) {
        ++field6377;
        int[] var3 = super.field2193.method497(arg1, false);
        if (arg0 >= -65) {
            this.field6380 = null;
        }
        if (super.field2193.field1312) {
            int[] var4 = this.method971(false, arg1, 0);
            for (int var5 = 0; ~class320.field4579 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field6376[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)[I", line = 47)
    private final int[] method2546(int arg0, int arg1) {
        ++field6388;
        if (~arg1 > -1) {
            return this.field6380;
        } else if (arg1 >= this.field6386.length) {
            return this.field6378;
        } else {
            return arg0 <= 95 ? null : this.field6386[arg1];
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V", line = 69)
    private final void method2547(int arg0) {
        ++field6382;
        if (arg0 != -175511412) {
            field6390 = null;
        }
        int var2 = this.field6384;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field6386.length + -1 > var5 && ~this.field6386[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field6386[var5 + -1];
                    int[] var7 = this.field6386[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = -class318.field4564[(8175 & var8) >> 5] + 4096 >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field6376[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field6386.length - 1 && ~var13 <= ~this.field6386[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field6386[var14 - 1];
                    int[] var16 = this.field6386[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field6376[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field6386.length + -1 > var22 && ~this.field6386[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field6386[var22 + -1];
                int[] var24 = this.field6386[var22];
                int var25 = this.method2546(arg0 ^ -175511298, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2546(126, var22 + 1)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var28 + -var27 + var26;
                int var32 = -var31 + var25 + -var26;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var37 - -var26 + var36;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field6376[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III[[[Lfl;ZI)Z", line = 249)
    public static final boolean method2548(int arg0, int arg1, int arg2, class518[][][] arg3, boolean arg4, int arg5) {
        ++field6379;
        byte var6 = !arg4 ? (byte) (class465.field6883 & 255) : 1;
        if (class1.field5[class79.field1192][arg2][arg5] == var6) {
            return false;
        } else if ((4 & class183.field2684[class79.field1192][arg2][arg5]) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class52.field829[var7] = arg2;
            if (arg1 != 256) {
                return false;
            } else {
                int var35 = var7 + 1;
                class484.field7091[var7] = arg5;
                class1.field5[class79.field1192][arg2][arg5] = var6;
                while (~var35 != ~var8) {
                    int var9 = class52.field829[var8] & 65535;
                    int var10 = 255 & class52.field829[var8] >> 16;
                    int var11 = class52.field829[var8] >> 24 & 255;
                    int var12 = 65535 & class484.field7091[var8];
                    int var13 = 255 & class484.field7091[var8] >> 16;
                    var8 = 4095 & var8 - -1;
                    boolean var14 = false;
                    if ((4 & class183.field2684[class79.field1192][var9][var12]) == 0) {
                        var14 = true;
                    }
                    boolean var15 = false;
                    label237: for (int var16 = class79.field1192 - -1; ~var16 >= -4; ++var16) {
                        if ((class183.field2684[var16][var9][var12] & 8) == 0) {
                            if (var14 && arg3[var16][var9][var12] != null) {
                                if (arg3[var16][var9][var12].field7559 != null) {
                                    int var20 = class34.method191(true, var10);
                                    if (arg3[var16][var9][var12].field7559.field5574 == var20 || arg3[var16][var9][var12].field7570 != null && ~arg3[var16][var9][var12].field7570.field5574 == ~var20) {
                                        continue;
                                    }
                                    if (var11 != 0) {
                                        int var21 = class34.method191(true, var11);
                                        if (~arg3[var16][var9][var12].field7559.field5574 == ~var21 || arg3[var16][var9][var12].field7570 != null && arg3[var16][var9][var12].field7570.field5574 == var21) {
                                            continue;
                                        }
                                    }
                                    if (var13 != 0) {
                                        int var22 = class34.method191(true, var13);
                                        if (arg3[var16][var9][var12].field7559.field5574 == var22 || arg3[var16][var9][var12].field7570 != null && arg3[var16][var9][var12].field7570.field5574 == var22) {
                                            continue;
                                        }
                                    }
                                }
                                class518 var23 = arg3[var16][var9][var12];
                                if (var23.field7569 != null) {
                                    for (class284 var24 = var23.field7569; var24 != null; var24 = var24.field4087) {
                                        class117 var25 = var24.field4083;
                                        if (var25 instanceof class351) {
                                            class351 var26 = (class351) var25;
                                            int var27 = var26.method5((byte) -65);
                                            int var28 = var26.method17(arg1 ^ 347);
                                            if (var27 == 21) {
                                                var27 = 19;
                                            }
                                            int var29 = var27 | var28 << 6;
                                            if (~var10 == ~var29 || var11 != 0 && ~var11 == ~var29 || ~var13 != -1 && var13 == var29) {
                                                continue label237;
                                            }
                                        }
                                    }
                                }
                            }
                            class518 var30 = arg3[var16][var9][var12];
                            if (var30 != null && var30.field7569 != null) {
                                for (class284 var31 = var30.field7569; var31 != null; var31 = var31.field4087) {
                                    class117 var32 = var31.field4083;
                                    if (~var32.field1770 != ~var32.field1762 || var32.field1771 != var32.field1765) {
                                        for (int var33 = var32.field1762; var32.field1770 >= var33; ++var33) {
                                            for (int var34 = var32.field1771; var34 <= var32.field1765; ++var34) {
                                                class1.field5[var16][var33][var34] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            var15 = true;
                            class1.field5[var16][var9][var12] = var6;
                        }
                    }
                    if (var15) {
                        int var17 = class86.field1324[class79.field1192 + 1].method201(var9, var12);
                        if (~class461.field6850[arg0] > ~var17) {
                            class461.field6850[arg0] = var17;
                        }
                        int var18 = var9 << 7;
                        if (var18 >= class515.field7519[arg0]) {
                            if (~var18 < ~class30.field322[arg0]) {
                                class30.field322[arg0] = var18;
                            }
                        } else {
                            class515.field7519[arg0] = var18;
                        }
                        int var19 = var12 << 7;
                        if (~class265.field3875[arg0] < ~var19) {
                            class265.field3875[arg0] = var19;
                        } else if (~class438.field6538[arg0] > ~var19) {
                            class438.field6538[arg0] = var19;
                        }
                    }
                    if (!var14) {
                        if (~var9 <= -2 && class1.field5[class79.field1192][var9 - 1][var12] != var6) {
                            class52.field829[var35] = class18.method119(class18.method119(var9 - 1, 1179648), -754974720);
                            class484.field7091[var35] = class18.method119(var12, 1245184);
                            class1.field5[class79.field1192][var9 + -1][var12] = var6;
                            var35 = 4095 & var35 + 1;
                        }
                        int var10000 = ~class182.field2661;
                        ++var12;
                        if (var10000 < ~var12) {
                            if (var9 + -1 >= 0 && class1.field5[class79.field1192][var9 + -1][var12] != var6 && ~(4 & class183.field2684[class79.field1192][var9][var12]) == -1 && (class183.field2684[class79.field1192][var9 - 1][var12 + -1] & 4) == 0) {
                                class52.field829[var35] = class18.method119(1375731712, class18.method119(1179648, var9 + -1));
                                class484.field7091[var35] = class18.method119(var12, 1245184);
                                var35 = 4095 & var35 + 1;
                                class1.field5[class79.field1192][var9 + -1][var12] = var6;
                            }
                            if (~class1.field5[class79.field1192][var9][var12] != ~var6) {
                                class52.field829[var35] = class18.method119(318767104, class18.method119(5373952, var9));
                                class484.field7091[var35] = class18.method119(5439488, var12);
                                var35 = var35 - -1 & 4095;
                                class1.field5[class79.field1192][var9][var12] = var6;
                            }
                            if (~class30.field323 < ~(var9 + 1) && class1.field5[class79.field1192][var9 + 1][var12] != var6 && (class183.field2684[class79.field1192][var9][var12] & 4) == 0 && ~(4 & class183.field2684[class79.field1192][var9 + 1][var12 + -1]) == -1) {
                                class52.field829[var35] = class18.method119(-1845493760, class18.method119(5373952, var9 + 1));
                                class484.field7091[var35] = class18.method119(5439488, var12);
                                class1.field5[class79.field1192][var9 + 1][var12] = var6;
                                var35 = 4095 & var35 - -1;
                            }
                        }
                        --var12;
                        if (var9 - -1 < class30.field323 && class1.field5[class79.field1192][var9 + 1][var12] != var6) {
                            class52.field829[var35] = class18.method119(class18.method119(var9 - -1, 9568256), 1392508928);
                            class484.field7091[var35] = class18.method119(9633792, var12);
                            var35 = var35 + 1 & 4095;
                            class1.field5[class79.field1192][var9 + 1][var12] = var6;
                        }
                        --var12;
                        if (~var12 <= -1) {
                            if (~(var9 - 1) <= -1 && ~class1.field5[class79.field1192][var9 + -1][var12] != ~var6 && ~(class183.field2684[class79.field1192][var9][var12] & 4) == -1 && ~(4 & class183.field2684[class79.field1192][var9 + -1][var12 + 1]) == -1) {
                                class52.field829[var35] = class18.method119(class18.method119(13762560, var9 - 1), 301989888);
                                class484.field7091[var35] = class18.method119(13828096, var12);
                                class1.field5[class79.field1192][var9 + -1][var12] = var6;
                                var35 = var35 + 1 & 4095;
                            }
                            if (class1.field5[class79.field1192][var9][var12] != var6) {
                                class52.field829[var35] = class18.method119(class18.method119(var9, 13762560), -1828716544);
                                class484.field7091[var35] = class18.method119(var12, 13828096);
                                class1.field5[class79.field1192][var9][var12] = var6;
                                var35 = var35 - -1 & 4095;
                            }
                            if (var9 - -1 < class30.field323 && class1.field5[class79.field1192][var9 + 1][var12] != var6 && ~(class183.field2684[class79.field1192][var9][var12] & 4) == -1 && (4 & class183.field2684[class79.field1192][var9 + 1][var12 + 1]) == 0) {
                                class52.field829[var35] = class18.method119(class18.method119(var9 + 1, 9568256), -771751936);
                                class484.field7091[var35] = class18.method119(var12, 9633792);
                                var35 = 4095 & var35 + 1;
                                class1.field5[class79.field1192][var9 + 1][var12] = var6;
                            }
                        }
                    }
                }
                if (class461.field6850[arg0] != -1000000) {
                    class461.field6850[arg0] += 10;
                    class515.field7519[arg0] -= 50;
                    class30.field322[arg0] += 50;
                    class438.field6538[arg0] += 50;
                    class265.field3875[arg0] -= 50;
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 566)
    public final void method175(int arg0) {
        ++field6381;
        if (this.field6386 == null) {
            this.field6386 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field6386.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field6384 == 2) {
                this.method2551(-97);
            }
            if (arg0 == -1285532468) {
                class419.method2520(arg0 + 1285532346);
                this.method2547(arg0 + 1110021056);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILdh;I)V", line = 589)
    public final void method23(int arg0, class209 arg1, int arg2) {
        if (arg0 == 0) {
            this.field6384 = arg1.method1428(32122);
            this.field6386 = new int[arg1.method1428(32122)][2];
            for (int var4 = 0; ~this.field6386.length < ~var4; ++var4) {
                this.field6386[var4][0] = arg1.method1450((byte) 55);
                this.field6386[var4][1] = arg1.method1450((byte) 61);
            }
        }
        ++field6383;
        int var5 = 72 / ((arg2 - -88) / 33);
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(B)V", line = 618)
    public static void method2549(byte arg0) {
        field6390 = null;
        field6391 = null;
        field6389 = null;
        int var1 = 60 % ((-60 - arg0) / 54);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 630)
    public class425() {
        super(1, true);
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V", line = 637)
    public static final void method2550(int arg0) {
        if (arg0 != 0) {
            field6390 = null;
        }
        ++field6387;
        if (~class432.field6459 == -3) {
            class34.field363 = 96;
        } else {
            try {
                Method var1 = (field6393 != null ? field6393 : (field6393 = method2552("java.lang.Runtime"))).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class34.field363 = 1 + (int) (var3 / 1048576L);
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(I)V", line = 685)
    private final void method2551(int arg0) {
        ++field6385;
        int[] var2 = this.field6386[0];
        int[] var3 = this.field6386[1];
        int[] var4 = this.field6386[this.field6386.length - 2];
        if (arg0 > -79) {
            this.field6380 = null;
        }
        int[] var5 = this.field6386[this.field6386.length + -1];
        this.field6378 = new int[] { var4[0] - var5[0] + var4[0], var4[1] + -var5[1] + var4[1] };
        this.field6380 = new int[] { var2[0] - (var3[0] + -var2[0]), var2[1] - var3[1] + var2[1] };
    }
}
