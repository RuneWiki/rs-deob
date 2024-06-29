import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class335 extends class326 {

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
    private int field5213 = 5;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    private int field5215 = 1;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "[B")
    private byte[] field5217 = new byte[512];

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    private int field5212 = 2;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    private int field5211 = 2048;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    private int field5210 = 5;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    private int field5216 = 0;

    @OriginalMember(owner = "client!pg", name = "eb", descriptor = "[S")
    private short[] field5227 = new short[512];

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "[I")
    public static int[] field5214 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "[I")
    public static int[] field5220 = new int[2];

    @OriginalMember(owner = "client!pg", name = "ab", descriptor = "Z")
    public static boolean field5223 = false;

    @OriginalMember(owner = "client!pg", name = "bb", descriptor = "I")
    public static int field5224 = 0;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!pg", name = "cb", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!pg", name = "db", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZLvl;)V", line = 22)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg0 == 0) {
            this.field5210 = this.field5213 = arg2.method58(-288140008);
        } else if (arg0 == 1) {
            this.field5216 = arg2.method58(-288140008);
        } else if (arg0 == 2) {
            this.field5211 = arg2.method39((byte) 27);
        } else if (arg0 == 3) {
            this.field5212 = arg2.method58(-288140008);
        } else if (arg0 == 4) {
            this.field5215 = arg2.method58(-288140008);
        } else if (arg0 == 5) {
            this.field5210 = arg2.method58(-288140008);
        } else if (arg0 == 6) {
            this.field5213 = arg2.method58(-288140008);
        }
        if (arg1) {
            this.field5210 = -106;
        }
        field5208++;
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(B)V", line = 87)
    private final void method2327(byte arg0) {
        if (arg0 != 87) {
            this.field5212 = 66;
        }
        Random var2 = new Random((long) this.field5216);
        this.field5227 = new short[512];
        field5219++;
        if (this.field5211 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field5227[var3] = (short) class207.method1523(this.field5211, -126, var2);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)[I", line = 113)
    public final int[] method103(int arg0, int arg1) {
        field5209++;
        if (arg0 > -25) {
            this.method99((byte) -55);
        }
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            int var4 = class34.field508[arg1] * this.field5213 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class166.field2731; var7++) {
                class127.field1851 = Integer.MAX_VALUE;
                class36.field525 = Integer.MAX_VALUE;
                class76.field1034 = Integer.MAX_VALUE;
                class211.field3333 = Integer.MAX_VALUE;
                int var8 = (class110.field1527[var7] * this.field5210) + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field5217[(var11 >= this.field5213 ? var11 - this.field5213 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field5217[(this.field5210 > var13 ? var13 : var13 - this.field5210) + var12 & 0xFF] & 0xFF) * 2;
                        int var10000 = -(var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 + var8 - this.field5227[var14];
                        int var16 = var4 - this.field5227[var27] - (var11 << 12);
                        int var17 = this.field5215;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var24 = var16 >= 0 ? var16 : -var16;
                            int var25 = var15 < 0 ? -var15 : var15;
                            var18 = var25 > var24 ? var25 : var24;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var18 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var19 = var16 * var16;
                            int var20 = var15 * var15;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var19) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var15 < 0 ? -var15 : var15) + (var16 < 0 ? -var16 : var16);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class211.field3333 > var18) {
                            class127.field1851 = class36.field525;
                            class36.field525 = class76.field1034;
                            class76.field1034 = class211.field3333;
                            class211.field3333 = var18;
                        } else if (class76.field1034 > var18) {
                            class127.field1851 = class36.field525;
                            class36.field525 = class76.field1034;
                            class76.field1034 = var18;
                        } else if (var18 < class36.field525) {
                            class127.field1851 = class36.field525;
                            class36.field525 = var18;
                        } else if (class127.field1851 > var18) {
                            class127.field1851 = var18;
                        }
                    }
                }
                int var26 = this.field5212;
                if (var26 == 0) {
                    var3[var7] = class211.field3333;
                } else if (var26 == 1) {
                    var3[var7] = class76.field1034;
                } else if (var26 == 3) {
                    var3[var7] = class36.field525;
                } else if (var26 == 4) {
                    var3[var7] = class127.field1851;
                } else if (var26 == 2) {
                    var3[var7] = class76.field1034 - class211.field3333;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 423)
    public class335() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/lang/String;)V", line = 330)
    public static final void method2328(int arg0, String arg1) {
        System.out.println("Error: " + class332.method2310("%0a", "\n", arg0 ^ 0xFFFF867F, arg1));
        field5225++;
        if (arg0 != 31104) {
            method2331(50);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLmh;Lmh;)V", line = 347)
    public static final void method2329(byte arg0, class287 arg1, class287 arg2) {
        field5226++;
        if (arg2.field4432 != null) {
            arg2.method2028(13329);
        }
        if (arg0 <= 11) {
            method2331(120);
        }
        arg2.field4427 = arg1;
        arg2.field4432 = arg1.field4432;
        arg2.field4432.field4427 = arg2;
        arg2.field4427.field4432 = arg2;
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(B)V", line = 364)
    public final void method99(byte arg0) {
        this.field5217 = class305.method2114(arg0 - 287, this.field5216);
        field5221++;
        this.method2327((byte) 87);
        if (arg0 != 31) {
            method2329((byte) 26, (class287) null, (class287) null);
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V", line = 390)
    public static final void method2330(int arg0) {
        int var1 = 58 % ((arg0 + 5) / 49);
        field5218++;
        if (class215.field3396 == null) {
            return;
        }
        class254 var2 = new class254();
        for (int var3 = 0; var3 < 13; var3++) {
            for (int var4 = 0; var4 < 13; var4++) {
                class215.field3396[var3][var4] = var2;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V", line = 439)
    public static void method2331(int arg0) {
        field5214 = null;
        field5220 = null;
        if (arg0 < 53) {
            method2328(91, (String) null);
        }
    }
}
