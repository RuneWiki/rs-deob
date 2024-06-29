import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class360 extends class86 {

    @OriginalMember(owner = "client!io", name = "M", descriptor = "[S")
    private short[] field5704 = new short[512];

    @OriginalMember(owner = "client!io", name = "X", descriptor = "I")
    private int field5715 = 5;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "I")
    private int field5702 = 2;

    @OriginalMember(owner = "client!io", name = "V", descriptor = "I")
    private int field5713 = 1;

    @OriginalMember(owner = "client!io", name = "Y", descriptor = "I")
    private int field5716 = 2048;

    @OriginalMember(owner = "client!io", name = "Z", descriptor = "I")
    private int field5717 = 5;

    @OriginalMember(owner = "client!io", name = "S", descriptor = "[B")
    private byte[] field5710 = new byte[512];

    @OriginalMember(owner = "client!io", name = "N", descriptor = "I")
    private int field5705 = 0;

    @OriginalMember(owner = "client!io", name = "ab", descriptor = "I")
    public static int field5718 = 0;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!io", name = "O", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!io", name = "P", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!io", name = "Q", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!io", name = "R", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!io", name = "T", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!io", name = "U", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!io", name = "bb", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!io", name = "W", descriptor = "[I")
    public static int[] field5714;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V", line = 10)
    private final void method2523(byte arg0) {
        field5711++;
        Random var2 = new Random((long) this.field5705);
        if (arg0 <= 83) {
            field5718 = 65;
        }
        this.field5704 = new short[512];
        if (this.field5716 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field5704[var3] = (short) class67.method659(this.field5716, var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(II)V", line = 36)
    public static final void method2524(int arg0, int arg1) {
        class120.field1870 = new int[arg1];
        field5707++;
        class102.field1533 = new int[arg1];
        class83.field1199 = new int[arg1];
        class31.field479 = new int[arg1];
        class223.field3467 = new int[arg1];
        if (arg0 != 1172) {
            method2526((int[]) null, 56, (Object[]) null);
        }
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(I)V", line = 54)
    public final void method476(int arg0) {
        if (arg0 == 0) {
            field5712++;
            this.field5710 = class31.method336(false, this.field5705);
            this.method2523((byte) 101);
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(II)[I", line = 71)
    public final int[] method158(int arg0, int arg1) {
        if (arg1 < 7) {
            this.field5715 = -77;
        }
        field5709++;
        int[] var3 = this.field1225.method1914(arg0, -90);
        if (this.field1225.field3995) {
            int var4 = class135.field2257[arg0] * this.field5715 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class93.field1424; var7++) {
                class18.field275 = Integer.MAX_VALUE;
                class138.field2295 = Integer.MAX_VALUE;
                class90.field1277 = Integer.MAX_VALUE;
                class33.field510 = Integer.MAX_VALUE;
                int var8 = class347.field5515[var7] * this.field5717 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field5710[(this.field5715 > var11 ? var11 : var11 - this.field5715) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field5710[var12 + (var13 < this.field5717 ? var13 : var13 - this.field5717) & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = -this.field5704[var14] - ((var13 << 12) - var8);
                        int var16 = var4 - this.field5704[var27] - (var11 << 12);
                        int var17 = this.field5713;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var24 = var15 < 0 ? -var15 : var15;
                            int var25 = var16 >= 0 ? var16 : -var16;
                            var18 = var25 < var24 ? var24 : var25;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var18 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var19 = var16 * var16;
                            int var20 = var15 * var15;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var19) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var15 >= 0 ? var15 : -var15) + (var16 >= 0 ? var16 : -var16);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class33.field510 > var18) {
                            class18.field275 = class138.field2295;
                            class138.field2295 = class90.field1277;
                            class90.field1277 = class33.field510;
                            class33.field510 = var18;
                        } else if (class90.field1277 > var18) {
                            class18.field275 = class138.field2295;
                            class138.field2295 = class90.field1277;
                            class90.field1277 = var18;
                        } else if (var18 < class138.field2295) {
                            class18.field275 = class138.field2295;
                            class138.field2295 = var18;
                        } else if (class18.field275 > var18) {
                            class18.field275 = var18;
                        }
                    }
                }
                int var26 = this.field5702;
                if (var26 == 0) {
                    var3[var7] = class33.field510;
                } else if (var26 == 1) {
                    var3[var7] = class90.field1277;
                } else if (var26 == 3) {
                    var3[var7] = class138.field2295;
                } else if (var26 == 4) {
                    var3[var7] = class18.field275;
                } else if (var26 == 2) {
                    var3[var7] = class90.field1277 - class33.field510;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V", line = 340)
    public class360() {
        super(0, true);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BZ)I", line = 282)
    public static final int method2525(byte arg0, boolean arg1) {
        field5706++;
        if (arg0 != -72) {
            return -100;
        }
        long var2 = class156.method1273((byte) -100);
        for (class315 var4 = arg1 ? (class315) class68.field1045.method371(-19139) : (class315) class68.field1045.method378((byte) -54); var4 != null; var4 = (class315) class68.field1045.method378((byte) -102)) {
            if ((var4.field4868 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field4868 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2734;
                    class160.field2538[var5] = class329.field5058[var5];
                    var4.method1357(947647010);
                    return var5;
                }
                var4.method1357(947647010);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "([II[Ljava/lang/Object;)V", line = 321)
    public static final void method2526(int[] arg0, int arg1, Object[] arg2) {
        int var3 = -106 / ((-arg1 - 45) / 50);
        field5708++;
        class212.method1573(0, arg0, arg2, -28, arg0.length - 1);
    }

    @OriginalMember(owner = "client!io", name = "g", descriptor = "(I)V", line = 331)
    public static void method2527(int arg0) {
        int var1 = 122 / ((-arg0 - 70) / 43);
        field5714 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IZLug;)V", line = 357)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field5719++;
        if (arg0 == 0) {
            this.field5717 = this.field5715 = arg2.method281(127);
        } else if (arg0 == 1) {
            this.field5705 = arg2.method281(-124);
        } else if (arg0 == 2) {
            this.field5716 = arg2.method314((byte) 69);
        } else if (arg0 == 3) {
            this.field5702 = arg2.method281(-124);
        } else if (arg0 == 4) {
            this.field5713 = arg2.method281(4);
        } else if (arg0 == 5) {
            this.field5717 = arg2.method281(-125);
        } else if (arg0 == 6) {
            this.field5715 = arg2.method281(110);
        }
        if (arg1) {
            this.field5717 = 45;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZIIIBI)V", line = 442)
    public static final void method2528(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        field5703++;
        if (class240.field3737) {
            int var6 = arg1 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class293.field4561 - class13.field169) * var6 / 100 + class13.field169;
            if (var7 < class363.field5750) {
                var7 = class363.field5750;
            } else if (var7 > class282.field4359) {
                var7 = class282.field4359;
            }
            int var8 = var7 * 512 * arg1 / (arg3 * 334);
            if (class81.field1187 > var8) {
                short var9 = class81.field1187;
                var7 = arg3 * 334 * var9 / (arg1 * 512);
                if (var7 > class282.field4359) {
                    var7 = class282.field4359;
                    int var10 = arg1 * 512 * var7 / (var9 * 334);
                    int var11 = (arg3 - var10) / 2;
                    if (arg0) {
                        class213.method1596();
                        class213.method1593(arg2, arg5, var11, arg1, 0);
                        class213.method1593(arg2 + arg3 - var11, arg5, var11, arg1, 0);
                    }
                    arg3 -= var11 * 2;
                    arg2 += var11;
                }
            } else if (var8 > class23.field358) {
                short var12 = class23.field358;
                var7 = arg3 * var12 * 334 / (arg1 * 512);
                if (class363.field5750 > var7) {
                    var7 = class363.field5750;
                    int var13 = arg3 * var12 * 334 / (var7 * 512);
                    int var14 = (arg1 - var13) / 2;
                    if (arg0) {
                        class213.method1596();
                        class213.method1593(arg2, arg5, arg3, var14, 0);
                        class213.method1593(arg2, arg5 - (var14 - arg1), arg3, var14, 0);
                    }
                    arg5 += var14;
                    arg1 -= var14 * 2;
                }
            }
            class209.field3223 = arg1 * var7 / 334;
        }
        class288.field4495 = (short) arg1;
        class181.field2846 = (short) arg3;
        class233.field3637 = arg2;
        if (arg4 != 66) {
            field5718 = 47;
        }
        class352.field5629 = arg5;
    }
}
