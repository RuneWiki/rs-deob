import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class183 extends class242 {

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
    private int field3215 = 3216;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
    private int field3218 = 4096;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
    private int field3216 = 3216;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "[I")
    private int[] field3212 = new int[3];

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "[I")
    public static int[] field3217 = new int[32];

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "[[I")
    public static int[][] field3223 = new int[5][5000];

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "Z")
    public static boolean field3219 = true;

    @OriginalMember(owner = "client!ag", name = "fb", descriptor = "[I")
    public static int[] field3225 = new int[2500];

    @OriginalMember(owner = "client!ag", name = "gb", descriptor = "I")
    public static int field3226 = 0;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "[Lpk;")
    public static class99[] field3211 = new class99[4];

    @OriginalMember(owner = "client!ag", name = "ib", descriptor = "I")
    public static int field3228 = 0;

    @OriginalMember(owner = "client!ag", name = "jb", descriptor = "Lp;")
    public static class280 field3229 = class18.method140((byte) -124, "Hierhin drehen");

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!ag", name = "eb", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ag", name = "hb", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)V")
    public static void method1272(boolean arg0) {
        field3217 = null;
        if (arg0) {
            method1272(true);
        }
        field3225 = null;
        field3229 = null;
        field3223 = null;
        field3211 = null;
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)V")
    public final void method111(int arg0) {
        if (arg0 > 122) {
            ++field3220;
            this.method1274(-9354);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        int var3 = -80 % ((arg1 - 73) / 41);
        ++field3214;
        int[] var4 = super.field4251.method1417((byte) 91, arg0);
        if (super.field4251.field3655) {
            int var5 = class189.field3325 * this.field3218 >> 12;
            int[] var6 = this.method1647(0, arg0 + -1 & class29.field540, 48);
            int[] var7 = this.method1647(0, arg0, 48);
            int[] var8 = this.method1647(0, class29.field540 & arg0 + 1, 48);
            for (int var9 = 0; var9 < class264.field4654; ++var9) {
                int var10 = (var8[var9] - var6[var9]) * var5 >> 12;
                int var11 = (var7[class230.field3968 & var9 + -1] + -var7[class230.field3968 & var9 + 1]) * var5 >> 12;
                int var12 = var11 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = var10 >> 4;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < -256) {
                    var13 = 255;
                }
                int var14 = class278.field4877[((var13 + 1) * var13 >> 1) + var12] & 255;
                int var15 = var10 * var14 >> 8;
                int var16 = this.field3212[1] * var15 >> 12;
                int var17 = var11 * var14 >> 8;
                int var18 = this.field3212[0] * var17 >> 12;
                int var19 = var14 * 4096 >> 8;
                int var20 = this.field3212[2] * var19 >> 12;
                var4[var9] = var18 - -var16 + var20;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIILoe;)V")
    public static final void method1273(int arg0, int arg1, int arg2, class142 arg3) {
        if (~(1 & arg1) != -1) {
            arg3.field4829 = class20.field367.method193((byte) 77);
            if (~arg3.field4829 == -65536) {
                arg3.field4829 = -1;
            }
        }
        if ((arg1 & 1024) != 0) {
            int var4 = class20.field367.method210(arg0 ^ 65662);
            int var5 = class20.field367.method189((byte) -103);
            arg3.method1838(var5, class117.field2104, var4, (byte) -14);
        }
        ++field3213;
        if (~(arg1 & 512) != -1) {
            arg3.field4856 = class20.field367.method217(true);
            arg3.field4838 = class20.field367.method211(false);
            arg3.field4828 = class20.field367.method217(true);
            arg3.field4845 = class20.field367.method189((byte) -103);
            arg3.field4826 = class20.field367.method212((byte) -50) - -class117.field2104;
            arg3.field4852 = class20.field367.method216(false) + class117.field2104;
            arg3.field4806 = class20.field367.method220(true);
            arg3.field4864 = 0;
            arg3.field4816 = 1;
        }
        if ((8 & arg1) != 0) {
            int var6 = class20.field367.method213((byte) 113);
            if (~var6 == -65536) {
                var6 = -1;
            }
            int var7 = class20.field367.method217(true);
            class100.method713(var6, arg3, var7, -1);
        }
        if (arg0 == 126) {
            if (~(32 & arg1) != -1) {
                arg3.field4812 = class20.field367.method212((byte) -50);
                arg3.field4832 = class20.field367.method212((byte) -50);
            }
            if ((arg1 & 4) != 0) {
                arg3.field4797 = class20.field367.method198(false);
                if (arg3.field4797.method1899(0, (byte) -28) != 126) {
                    if (class262.field4631 == arg3) {
                        class188.method1312(-1117075764, 2, arg3.method979(arg0 + -147), arg3.field4797);
                    }
                } else {
                    arg3.field4797 = arg3.field4797.method1870((byte) -122, 1);
                    class188.method1312(-1117075764, 2, arg3.method979(arg0 + -160), arg3.field4797);
                }
                arg3.field4799 = 0;
                arg3.field4813 = 0;
                arg3.field4789 = 150;
            }
            if ((arg1 & 64) != 0) {
                int var8 = class20.field367.method210(65536);
                int var9 = class20.field367.method220(true);
                arg3.method1838(var9, class117.field2104, var8, (byte) -122);
                arg3.field4835 = class117.field2104 - -300;
                arg3.field4840 = class20.field367.method189((byte) -103);
            }
            if ((arg1 & 16) != 0) {
                int var10 = class20.field367.method220(true);
                byte[] var11 = new byte[var10];
                class25 var12 = new class25(var11);
                class20.field367.method215(0, var10, 7623, var11);
                class92.field1486[arg2] = var12;
                arg3.method978((byte) 72, var12);
            }
            if (~(256 & arg1) != -1) {
                boolean var13 = true;
                int var14 = class20.field367.method213((byte) 113);
                int var15 = class20.field367.method187(2);
                if (var14 == 65535) {
                    var14 = -1;
                }
                if (~var14 != 0 && ~arg3.field4827 != 0 && ~class207.method1401((byte) -22, class199.method1368(arg0 ^ -982, var14).field4210).field1288 > ~class207.method1401((byte) -22, class199.method1368(-940, arg3.field4827).field4210).field1288) {
                    var13 = false;
                }
                if (var13) {
                    arg3.field4790 = 0;
                    arg3.field4857 = 0;
                    arg3.field4800 = (65535 & var15) + class117.field2104;
                    arg3.field4827 = var14;
                    if (~arg3.field4800 < ~class117.field2104) {
                        arg3.field4857 = -1;
                    }
                    arg3.field4823 = var15 >> 16;
                    if (~arg3.field4827 != 0 && ~class117.field2104 == ~arg3.field4800) {
                        int var16 = class199.method1368(-940, arg3.field4827).field4210;
                        if (~var16 != 0) {
                            class78 var17 = class207.method1401((byte) -22, var16);
                            if (var17 != null && var17.field1275 != null) {
                                class150.method1034(arg3.field4793, false, var17, 0, arg3.field4791, class262.field4631 == arg3);
                            }
                        }
                    }
                }
            }
            if (~(arg1 & 2) != -1) {
                int var18 = class20.field367.method216(false);
                int var19 = class20.field367.method189((byte) -103);
                int var20 = class20.field367.method220(true);
                int var21 = class20.field367.field481;
                boolean var22 = (32768 & var18) != 0;
                if (arg3.field2458 != null && arg3.field2481 != null) {
                    long var23 = arg3.field2458.method1896(arg0 ^ 41);
                    boolean var25 = false;
                    if (var19 <= 1) {
                        if (!var22 && (class280.field4950 && !class44.field739 || class159.field2773)) {
                            var25 = true;
                        } else {
                            for (int var26 = 0; class273.field4753 > var26; ++var26) {
                                if (~class76.field1248[var26] == ~var23) {
                                    var25 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var25 && ~class101.field1650 == -1) {
                        class7.field142.field481 = 0;
                        class20.field367.method215(0, var20, 7623, class7.field142.field475);
                        int var27 = -1;
                        class7.field142.field481 = 0;
                        class280 var28;
                        if (!var22) {
                            var28 = class72.method538(class163.method1153(class7.field142, false).method1861((byte) -121));
                        } else {
                            var18 &= 32767;
                            class229 var29 = class164.method1156(class7.field142, true);
                            var27 = var29.field3964;
                            var28 = var29.field3956.method1045(69, class7.field142);
                        }
                        arg3.field4797 = var28.method1877(255);
                        arg3.field4813 = var18 >> 8;
                        arg3.field4799 = var18 & 255;
                        arg3.field4789 = 150;
                        if (var19 == 2) {
                            class92.method655(var27, var28, (class280) null, (byte) 92, class30.method266(new class280[] { class209.field3608, arg3.method979(arg0 + -163) }, (byte) -87), var22 ? 17 : 1);
                        } else if (var19 != 1) {
                            class92.method655(var27, var28, (class280) null, (byte) 127, arg3.method979(arg0 + -156), var22 ? 17 : 2);
                        } else {
                            class92.method655(var27, var28, (class280) null, (byte) 122, class30.method266(new class280[] { class162.field2859, arg3.method979(-27) }, (byte) -87), var22 ? 17 : 1);
                        }
                    }
                }
                class20.field367.field481 = var20 + var21;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "(I)V")
    private final void method1274(int arg0) {
        ++field3227;
        if (arg0 != -9354) {
            method1273(-114, 68, -89, (class142) null);
        }
        double var2 = Math.cos((double) ((float) this.field3216 / 4096.0F));
        this.field3212[0] = (int) (4096.0D * Math.sin((double) ((float) this.field3215 / 4096.0F)) * var2);
        this.field3212[1] = (int) (4096.0D * Math.cos((double) ((float) this.field3215 / 4096.0F)) * var2);
        this.field3212[2] = (int) (Math.sin((double) ((float) this.field3216 / 4096.0F)) * 4096.0D);
        int var4 = this.field3212[2] * this.field3212[2] >> 12;
        int var5 = this.field3212[1] * this.field3212[1] >> 12;
        int var6 = this.field3212[0] * this.field3212[0] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 + var5 >> 12)));
        if (~var7 != -1) {
            this.field3212[2] = (this.field3212[2] << 12) / var7;
            this.field3212[1] = (this.field3212[1] << 12) / var7;
            this.field3212[0] = (this.field3212[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class183() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (arg0 >= -119) {
            field3217 = null;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field3216 = arg2.method193((byte) 77);
                }
            } else {
                this.field3215 = arg2.method193((byte) 77);
            }
        } else {
            this.field3218 = arg2.method193((byte) 77);
        }
        ++field3222;
    }
}
