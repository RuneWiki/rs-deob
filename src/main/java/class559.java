import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class559 extends class571 {

    @OriginalMember(owner = "client!pga", name = "w", descriptor = "Z")
    public boolean field7958 = false;

    @OriginalMember(owner = "client!pga", name = "t", descriptor = "I")
    private int field7955 = 0;

    @OriginalMember(owner = "client!pga", name = "z", descriptor = "Lhr;")
    public class550 field7961 = new class550();

    @OriginalMember(owner = "client!pga", name = "A", descriptor = "Lhr;")
    private class550 field7962 = new class550();

    @OriginalMember(owner = "client!pga", name = "I", descriptor = "Z")
    private boolean field7970 = false;

    @OriginalMember(owner = "client!pga", name = "q", descriptor = "Lcv;")
    public class593 field7952;

    @OriginalMember(owner = "client!pga", name = "x", descriptor = "J")
    private long field7959;

    @OriginalMember(owner = "client!pga", name = "r", descriptor = "Lgv;")
    public class88 field7953;

    @OriginalMember(owner = "client!pga", name = "k", descriptor = "Llu;")
    public class741 field7946;

    @OriginalMember(owner = "client!pga", name = "v", descriptor = "Lvv;")
    public class343 field7957;

    @OriginalMember(owner = "client!pga", name = "o", descriptor = "Z")
    public static boolean field7950 = false;

    @OriginalMember(owner = "client!pga", name = "s", descriptor = "Lok;")
    public static class266 field7954 = new class266();

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "I")
    public static int field7945;

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "I")
    public static int field7947;

    @OriginalMember(owner = "client!pga", name = "m", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!pga", name = "n", descriptor = "I")
    public int field7949;

    @OriginalMember(owner = "client!pga", name = "p", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!pga", name = "u", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!pga", name = "y", descriptor = "I")
    public static int field7960;

    @OriginalMember(owner = "client!pga", name = "B", descriptor = "I")
    private int field7963;

    @OriginalMember(owner = "client!pga", name = "C", descriptor = "I")
    private int field7964;

    @OriginalMember(owner = "client!pga", name = "D", descriptor = "I")
    private int field7965;

    @OriginalMember(owner = "client!pga", name = "E", descriptor = "I")
    private int field7966;

    @OriginalMember(owner = "client!pga", name = "F", descriptor = "I")
    private int field7967;

    @OriginalMember(owner = "client!pga", name = "G", descriptor = "I")
    private int field7968;

    @OriginalMember(owner = "client!pga", name = "H", descriptor = "I")
    private int field7969;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I[[[Lcja;IIZI)Z", line = 4)
    public static final boolean method3304(int arg0, class46[][][] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field7947++;
        byte var6 = arg4 ? 1 : (byte) (class746.field10346 & 0xFF);
        if (class724.field10022[class368.field5113][arg0][arg5] == var6) {
            return false;
        } else if ((class190.field2932[class368.field5113][arg0][arg5] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class268.field3903[var7] = arg0;
            int var8 = 0;
            int var36 = var7 + 1;
            class440.field5970[var7] = arg5;
            int var9 = 10 % ((-arg3 - 26) / 58);
            class724.field10022[class368.field5113][arg0][arg5] = var6;
            while (var36 != var8) {
                int var10 = class268.field3903[var8] & 0xFFFF;
                int var11 = class268.field3903[var8] >> 16 & 0xFF;
                int var12 = class268.field3903[var8] >> 24 & 0xFF;
                int var13 = class440.field5970[var8] & 0xFFFF;
                int var14 = (class440.field5970[var8] & 0xFF64C9) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var15 = false;
                if ((class190.field2932[class368.field5113][var10][var13] & 0x4) == 0) {
                    var15 = true;
                }
                boolean var16 = false;
                if (arg1 != null) {
                    label240: for (int var17 = class368.field5113 + 1; var17 <= 3; var17++) {
                        if (arg1[var17] != null && (class190.field2932[var17][var10][var13] & 0x8) == 0) {
                            if (var15 && arg1[var17][var10][var13] != null) {
                                if (arg1[var17][var10][var13].field582 != null) {
                                    int var18 = class409.method2493(var11, 91);
                                    if (arg1[var17][var10][var13].field582.field8610 == var18 || arg1[var17][var10][var13].field589 != null && arg1[var17][var10][var13].field589.field8610 == var18) {
                                        continue;
                                    }
                                    if (var12 != 0) {
                                        int var19 = class409.method2493(var12, 95);
                                        if (arg1[var17][var10][var13].field582.field8610 == var19 || arg1[var17][var10][var13].field589 != null && arg1[var17][var10][var13].field589.field8610 == var19) {
                                            continue;
                                        }
                                    }
                                    if (var14 != 0) {
                                        int var20 = class409.method2493(var14, 51);
                                        if (arg1[var17][var10][var13].field582.field8610 == var20 || arg1[var17][var10][var13].field589 != null && arg1[var17][var10][var13].field589.field8610 == var20) {
                                            continue;
                                        }
                                    }
                                }
                                class46 var21 = arg1[var17][var10][var13];
                                if (var21.field586 != null) {
                                    for (class48 var22 = var21.field586; var22 != null; var22 = var22.field611) {
                                        class672 var23 = var22.field605;
                                        if (var23 instanceof class484) {
                                            class484 var24 = (class484) var23;
                                            int var25 = var24.method1482(true);
                                            int var26 = var24.method1478((byte) 124);
                                            if (var25 == 21) {
                                                var25 = 19;
                                            }
                                            int var27 = var26 << 6 | var25;
                                            if (var11 == var27 || var12 != 0 && var12 == var27 || var14 != 0 && var14 == var27) {
                                                continue label240;
                                            }
                                        }
                                    }
                                }
                            }
                            class46 var28 = arg1[var17][var10][var13];
                            if (var28 != null && var28.field586 != null) {
                                for (class48 var29 = var28.field586; var29 != null; var29 = var29.field611) {
                                    class672 var30 = var29.field605;
                                    if (var30.field9371 != var30.field9368 || var30.field9364 != var30.field9360) {
                                        for (int var31 = var30.field9368; var31 <= var30.field9371; var31++) {
                                            for (int var32 = var30.field9364; var32 <= var30.field9360; var32++) {
                                                class724.field10022[var17][var31][var32] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            class724.field10022[var17][var10][var13] = var6;
                            var16 = true;
                        }
                    }
                }
                if (var16) {
                    int var33 = class208.field3219[class368.field5113 + 1].method1904(var13, (byte) -121, var10);
                    if (class152.field2159[arg2] < var33) {
                        class152.field2159[arg2] = var33;
                    }
                    int var34 = var10 << 9;
                    if (class606.field8481[arg2] > var34) {
                        class606.field8481[arg2] = var34;
                    } else if (class503.field7131[arg2] < var34) {
                        class503.field7131[arg2] = var34;
                    }
                    int var35 = var13 << 9;
                    if (class437.field5898[arg2] > var35) {
                        class437.field5898[arg2] = var35;
                    } else if (var35 > class371.field5134[arg2]) {
                        class371.field5134[arg2] = var35;
                    }
                }
                if (!var15) {
                    if (var10 >= 1 && class724.field10022[class368.field5113][var10 - 1][var13] != var6) {
                        class268.field3903[var36] = class746.method4158(class746.method4158(var10 - 1, 1179648), -754974720);
                        class440.field5970[var36] = class746.method4158(var13, 1245184);
                        var36 = var36 + 1 & 0xFFF;
                        class724.field10022[class368.field5113][var10 - 1][var13] = var6;
                    }
                    int var10000 = ~class350.field4898;
                    var13++;
                    if (var10000 < ~var13) {
                        if (var10 - 1 >= 0 && class724.field10022[class368.field5113][var10 - 1][var13] != var6 && (class190.field2932[class368.field5113][var10][var13] & 0x4) == 0 && (class190.field2932[class368.field5113][var10 - 1][var13 - 1] & 0x4) == 0) {
                            class268.field3903[var36] = class746.method4158(1375731712, class746.method4158(var10 - 1, 1179648));
                            class440.field5970[var36] = class746.method4158(1245184, var13);
                            var36 = var36 + 1 & 0xFFF;
                            class724.field10022[class368.field5113][var10 - 1][var13] = var6;
                        }
                        if (class724.field10022[class368.field5113][var10][var13] != var6) {
                            class268.field3903[var36] = class746.method4158(class746.method4158(var10, 5373952), 318767104);
                            class440.field5970[var36] = class746.method4158(5439488, var13);
                            var36 = var36 + 1 & 0xFFF;
                            class724.field10022[class368.field5113][var10][var13] = var6;
                        }
                        if (class768.field10571 > var10 + 1 && class724.field10022[class368.field5113][var10 + 1][var13] != var6 && (class190.field2932[class368.field5113][var10][var13] & 0x4) == 0 && (class190.field2932[class368.field5113][var10 + 1][var13 - 1] & 0x4) == 0) {
                            class268.field3903[var36] = class746.method4158(-1845493760, class746.method4158(var10 + 1, 5373952));
                            class440.field5970[var36] = class746.method4158(var13, 5439488);
                            class724.field10022[class368.field5113][var10 + 1][var13] = var6;
                            var36 = var36 + 1 & 0xFFF;
                        }
                    }
                    var13--;
                    if (class768.field10571 > var10 + 1 && class724.field10022[class368.field5113][var10 + 1][var13] != var6) {
                        class268.field3903[var36] = class746.method4158(1392508928, class746.method4158(var10 + 1, 9568256));
                        class440.field5970[var36] = class746.method4158(9633792, var13);
                        class724.field10022[class368.field5113][var10 + 1][var13] = var6;
                        var36 = var36 + 1 & 0xFFF;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if (var10 - 1 >= 0 && class724.field10022[class368.field5113][var10 - 1][var13] != var6 && (class190.field2932[class368.field5113][var10][var13] & 0x4) == 0 && (class190.field2932[class368.field5113][var10 - 1][var13 + 1] & 0x4) == 0) {
                            class268.field3903[var36] = class746.method4158(301989888, class746.method4158(13762560, var10 - 1));
                            class440.field5970[var36] = class746.method4158(var13, 13828096);
                            class724.field10022[class368.field5113][var10 - 1][var13] = var6;
                            var36 = var36 + 1 & 0xFFF;
                        }
                        if (class724.field10022[class368.field5113][var10][var13] != var6) {
                            class268.field3903[var36] = class746.method4158(-1828716544, class746.method4158(13762560, var10));
                            class440.field5970[var36] = class746.method4158(13828096, var13);
                            class724.field10022[class368.field5113][var10][var13] = var6;
                            var36 = var36 + 1 & 0xFFF;
                        }
                        if (class768.field10571 > var10 + 1 && class724.field10022[class368.field5113][var10 + 1][var13] != var6 && (class190.field2932[class368.field5113][var10][var13] & 0x4) == 0 && (class190.field2932[class368.field5113][var10 + 1][var13 + 1] & 0x4) == 0) {
                            class268.field3903[var36] = class746.method4158(-771751936, class746.method4158(var10 + 1, 9568256));
                            class440.field5970[var36] = class746.method4158(9633792, var13);
                            class724.field10022[class368.field5113][var10 + 1][var13] = var6;
                            var36 = var36 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class152.field2159[arg2] != -1000000) {
                class152.field2159[arg2] += 40;
                class606.field8481[arg2] -= 512;
                class503.field7131[arg2] += 512;
                class371.field5134[arg2] += 512;
                class437.field5898[arg2] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(III)Z", line = 336)
    public static final boolean method3305(int arg0, int arg1, int arg2) {
        if (arg0 == 2048) {
            field7945++;
            return (arg1 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IJLha;)V", line = 355)
    public final void method3306(int arg0, long arg1, class65 arg2) {
        if (arg0 > -122) {
            this.field7959 = -45L;
        }
        field7951++;
        for (class272 var5 = (class272) this.field7957.method2170(false); var5 != null; var5 = (class272) this.field7957.method2176(-17754)) {
            var5.method1754(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIII)V", line = 380)
    public static final void method3307(int arg0, int arg1, int arg2, int arg3) {
        class46 var4 = class767.field10562[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class682 var5 = var4.field592;
        class682 var6 = var4.field581;
        if (var5 != null) {
            var5.field9454 = (short) (var5.field9454 * arg3 / (0x10 << class645.field9018 - 7));
            var5.field9459 = (short) (var5.field9459 * arg3 / (0x10 << class645.field9018 - 7));
        }
        if (var6 != null) {
            var6.field9454 = (short) (var6.field9454 * arg3 / (0x10 << class645.field9018 - 7));
            var6.field9459 = (short) (var6.field9459 * arg3 / (0x10 << class645.field9018 - 7));
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V", line = 402)
    public static void method3308(int arg0) {
        field7954 = null;
        if (arg0 != 13467) {
            field7954 = null;
        }
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lha;Lgv;Lcv;J)V", line = 759)
    public class559(class65 arg0, class88 arg1, class593 arg2, long arg3) {
        this.field7952 = arg2;
        this.field7959 = arg3;
        this.field7953 = arg1;
        this.field7946 = this.field7953.method663(-30963);
        if (!arg0.method452() && this.field7946.field10249 != -1) {
            this.field7946 = class530.method3203((byte) 116, this.field7946.field10249);
        }
        this.field7957 = new class343();
        this.field7955 = (int) ((double) this.field7955 + Math.random() * 64.0D);
        this.method3311(6523);
        this.field7962.field7900 = this.field7961.field7900;
        this.field7962.field7907 = this.field7961.field7907;
        this.field7962.field7914 = this.field7961.field7914;
        this.field7962.field7909 = this.field7961.field7909;
        this.field7962.field7912 = this.field7961.field7912;
        this.field7962.field7897 = this.field7961.field7897;
        this.field7962.field7905 = this.field7961.field7905;
        this.field7962.field7911 = this.field7961.field7911;
        this.field7962.field7899 = this.field7961.field7899;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lha;JIZZ)V", line = 421)
    public final void method3309(class65 arg0, long arg1, int arg2, boolean arg3, boolean arg4) {
        if (this.field7958) {
            arg3 = false;
        } else if (class715.field9934 < this.field7946.field10245) {
            arg3 = false;
        } else if (class470.field6592 > class234.field3515[class715.field9934]) {
            arg3 = false;
        } else if (this.field7970) {
            arg3 = false;
        } else if (this.field7946.field10278 != -1) {
            int var7 = (int) (arg1 - this.field7959);
            if (this.field7946.field10217 || var7 <= this.field7946.field10278) {
                var7 %= this.field7946.field10278;
            } else {
                arg3 = false;
            }
            if (!this.field7946.field10254 && this.field7946.field10244 > var7) {
                arg3 = false;
            }
            if (this.field7946.field10254 && var7 >= this.field7946.field10244) {
                arg3 = false;
            }
        }
        field7956++;
        if (arg3) {
            class602.field8437++;
            int var8 = (this.field7961.field7914 + this.field7961.field7907 + this.field7961.field7905) / 3;
            int var9 = (this.field7961.field7912 + this.field7961.field7909 + this.field7961.field7911) / 3;
            int var10 = (this.field7961.field7900 + this.field7961.field7897 + this.field7961.field7899) / 3;
            if (this.field7961.field7908 != var8 || this.field7961.field7906 != var9 || this.field7961.field7913 != var10) {
                this.field7961.field7913 = var10;
                this.field7961.field7908 = var8;
                this.field7961.field7906 = var9;
                int var11 = this.field7961.field7907 - this.field7961.field7914;
                int var12 = this.field7961.field7912 - this.field7961.field7909;
                int var13 = this.field7961.field7899 - this.field7961.field7900;
                int var14 = this.field7961.field7905 - this.field7961.field7914;
                int var15 = this.field7961.field7911 - this.field7961.field7909;
                int var16 = this.field7961.field7897 - this.field7961.field7900;
                this.field7964 = var11 * var15 - (var12 * var14);
                this.field7968 = var12 * var16 - (var13 * var15);
                this.field7967 = var13 * var14 - (var11 * var16);
                while (true) {
                    if (this.field7968 <= 32767 && this.field7967 <= 32767 && this.field7964 <= 32767 && this.field7968 >= -32767 && this.field7967 >= -32767 && this.field7964 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field7964 * this.field7964 + this.field7968 * this.field7968 + this.field7967 * this.field7967));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field7967 = this.field7967 * 32767 / var17;
                        this.field7964 = this.field7964 * 32767 / var17;
                        this.field7968 = this.field7968 * 32767 / var17;
                        if (this.field7946.field10252 > 0 || this.field7946.field10239 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field7964, (double) this.field7968) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field7967, Math.sqrt((double) (this.field7968 * this.field7968 + this.field7964 * this.field7964))) * 2607.5945876176133D);
                            this.field7969 = this.field7946.field10252 - this.field7946.field10247;
                            this.field7966 = this.field7946.field10247 + var18 - (this.field7969 >> 1);
                            this.field7963 = this.field7946.field10239 - this.field7946.field10243;
                            this.field7965 = var19 + this.field7946.field10243 - (this.field7963 >> 1);
                        }
                        break;
                    }
                    this.field7964 >>= 0x1;
                    this.field7968 >>= 0x1;
                    this.field7967 >>= 0x1;
                }
            }
            this.field7955 += (int) ((Math.random() * (double) (this.field7946.field10256 - this.field7946.field10246) + (double) this.field7946.field10246) * (double) arg2);
            if (this.field7955 > 63) {
                int var20 = this.field7955 >> 6;
                this.field7955 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field7946.field10252 <= 0 && this.field7946.field10239 <= 0) {
                        var22 = this.field7967;
                        var23 = this.field7968;
                        var24 = this.field7964;
                    } else {
                        int var25 = (int) ((double) this.field7969 * Math.random()) + this.field7966;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class376.field5186[var26];
                        int var28 = class376.field5188[var26];
                        int var29 = (int) (Math.random() * (double) this.field7963) + this.field7965;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class376.field5186[var30];
                        int var32 = class376.field5188[var30];
                        byte var33 = 13;
                        var23 = var28 * var31 >> var33;
                        var22 = (var32 << 1) * -1;
                        var24 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - var35 - var34;
                    int var37 = (int) ((float) this.field7961.field7905 * var36 + (float) this.field7961.field7914 * var34 + (float) this.field7961.field7907 * var35);
                    int var38 = (int) ((float) this.field7961.field7911 * var36 + (float) this.field7961.field7912 * var35 + (float) this.field7961.field7909 * var34);
                    int var39 = (int) ((float) this.field7961.field7897 * var36 + (float) this.field7961.field7900 * var34 + (float) this.field7961.field7899 * var35);
                    int var40 = (int) ((float) this.field7962.field7905 * var36 + (float) this.field7962.field7914 * var34 + (float) this.field7962.field7907 * var35);
                    int var41 = (int) ((float) this.field7962.field7911 * var36 + (float) this.field7962.field7912 * var35 + (float) this.field7962.field7909 * var34);
                    int var42 = (int) ((float) this.field7962.field7897 * var36 + (float) this.field7962.field7900 * var34 + (float) this.field7962.field7899 * var35);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var43 * Math.random() + (double) var40);
                    int var47 = (int) ((double) var44 * Math.random() + (double) var41);
                    int var48 = (int) ((double) var42 + (double) var45 * Math.random());
                    int var49 = this.field7946.field10272 + (int) ((double) (this.field7946.field10255 - this.field7946.field10272) * Math.random());
                    int var50 = (int) (Math.random() * (double) (this.field7946.field10224 - this.field7946.field10233)) + this.field7946.field10233;
                    int var51 = (int) (Math.random() * (double) (this.field7946.field10209 - this.field7946.field10229)) + this.field7946.field10229;
                    int var52;
                    if (this.field7946.field10232) {
                        double var53 = Math.random();
                        var52 = (int) ((double) this.field7946.field10280 * var53 + (double) this.field7946.field10207) | (int) ((double) this.field7946.field10238 * var53 + (double) this.field7946.field10253) << 8 | (int) ((double) this.field7946.field10221 * var53 + (double) this.field7946.field10240) << 16 | (int) ((double) this.field7946.field10242 + Math.random() * (double) this.field7946.field10222) << 24;
                    } else {
                        var52 = (int) ((double) this.field7946.field10222 * Math.random() + (double) this.field7946.field10242) << 24 | (int) ((double) this.field7946.field10238 * Math.random() + (double) this.field7946.field10253) << 8 | (int) (Math.random() * (double) this.field7946.field10221 + (double) this.field7946.field10240) << 16 | (int) ((double) this.field7946.field10207 + Math.random() * (double) this.field7946.field10280);
                    }
                    int var55 = this.field7946.field10250;
                    if (!arg0.method452() && !this.field7946.field10234) {
                        var55 = -1;
                    }
                    if (class357.field5023 == class207.field3213) {
                        new class272(this, var46, var47, var48, var23, var22, var24, var49, var50, var52, var51, var55, this.field7946.field10241, this.field7946.field10248);
                    } else {
                        class272 var57 = class220.field3417[class357.field5023];
                        class357.field5023 = class357.field5023 + 1 & 0x3FF;
                        var57.method1753(this, var46, var47, var48, var23, var22, var24, var49, var50, var52, var51, var55, this.field7946.field10241, this.field7946.field10248);
                    }
                }
            }
        }
        if (!this.field7961.method3286(100, this.field7962)) {
            class550 var58 = this.field7962;
            this.field7962 = this.field7961;
            this.field7961 = var58;
            this.field7961.field7911 = this.field7953.field982;
            this.field7961.field7907 = this.field7953.field985;
            this.field7961.field7906 = this.field7962.field7906;
            this.field7961.field7905 = this.field7953.field983;
            this.field7961.field7912 = this.field7953.field973;
            this.field7961.field7908 = this.field7962.field7908;
            this.field7961.field7914 = this.field7953.field986;
            this.field7961.field7897 = this.field7953.field972;
            this.field7961.field7909 = this.field7953.field974;
            this.field7961.field7913 = this.field7962.field7913;
            this.field7961.field7899 = this.field7953.field988;
            this.field7961.field7900 = this.field7953.field992;
        }
        this.field7949 = 0;
        for (class272 var59 = (class272) this.field7957.method2170(arg4); var59 != null; var59 = (class272) this.field7957.method2176(-17754)) {
            var59.method1755(arg1, arg2);
            this.field7949++;
        }
        class96.field1097 += this.field7949;
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(III)I", line = 684)
    public static final int method3310(int arg0, int arg1, int arg2) {
        field7960++;
        int var3 = arg2 * 57 + arg1;
        if (arg0 == -1) {
            int var4 = var3 ^ var3 << 13;
            int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return (var5 & 0x7FBFA37) >> 19;
        } else {
            return -23;
        }
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)V", line = 713)
    public final void method3311(int arg0) {
        this.field7961.field7907 = this.field7953.field985;
        this.field7961.field7914 = this.field7953.field986;
        this.field7961.field7897 = this.field7953.field972;
        this.field7961.field7905 = this.field7953.field983;
        this.field7961.field7911 = this.field7953.field982;
        this.field7961.field7909 = this.field7953.field974;
        this.field7961.field7899 = this.field7953.field988;
        this.field7961.field7912 = this.field7953.field973;
        field7948++;
        this.field7961.field7900 = this.field7953.field992;
        if (arg0 != 6523) {
            this.method3306(85, -57L, null);
        }
        if (this.field7961.field7914 == this.field7961.field7907 && this.field7961.field7907 == this.field7961.field7905 && this.field7961.field7912 == this.field7961.field7909 && this.field7961.field7912 == this.field7961.field7911 && this.field7961.field7900 == this.field7961.field7899 && this.field7961.field7899 == this.field7961.field7897) {
            this.field7970 = true;
        } else if (this.field7970) {
            this.field7962.field7907 = this.field7961.field7907;
            this.field7962.field7897 = this.field7961.field7897;
            this.field7962.field7899 = this.field7961.field7899;
            this.field7962.field7909 = this.field7961.field7909;
            this.field7962.field7911 = this.field7961.field7911;
            this.field7962.field7905 = this.field7961.field7905;
            this.field7962.field7912 = this.field7961.field7912;
            this.field7970 = false;
            this.field7962.field7914 = this.field7961.field7914;
            this.field7962.field7900 = this.field7961.field7900;
        }
    }
}
