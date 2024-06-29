import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class167 extends class304 {

    @OriginalMember(owner = "client!ln", name = "T", descriptor = "I")
    private int field2697 = 2;

    @OriginalMember(owner = "client!ln", name = "eb", descriptor = "[B")
    private byte[] field2708 = new byte[512];

    @OriginalMember(owner = "client!ln", name = "bb", descriptor = "I")
    private int field2705 = 0;

    @OriginalMember(owner = "client!ln", name = "W", descriptor = "I")
    private int field2700 = 1;

    @OriginalMember(owner = "client!ln", name = "U", descriptor = "I")
    private int field2698 = 5;

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "[S")
    private short[] field2694 = new short[512];

    @OriginalMember(owner = "client!ln", name = "fb", descriptor = "I")
    private int field2709 = 2048;

    @OriginalMember(owner = "client!ln", name = "Y", descriptor = "I")
    private int field2702 = 5;

    @OriginalMember(owner = "client!ln", name = "gb", descriptor = "I")
    public static int field2710 = 10;

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!ln", name = "V", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!ln", name = "X", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!ln", name = "ab", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!ln", name = "cb", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!ln", name = "db", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!ln", name = "hb", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!ln", name = "ib", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!ln", name = "jb", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!ln", name = "kb", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!ln", name = "lb", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!ln", name = "S", descriptor = "J")
    public static long field2696;

    @OriginalMember(owner = "client!ln", name = "Z", descriptor = "Lnk;")
    public static class326 field2703;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIII)V", line = 9)
    public static final void method1264(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2699++;
        class85.field1236.field3866 = 0;
        class85.field1236.method1752(20, -113);
        class85.field1236.method1752(arg4, -108);
        class85.field1236.method1752(arg3, arg1 - 92);
        class85.field1236.method1744(true, arg2);
        class85.field1236.method1744(true, arg0);
        class338.field5251 = arg1;
        class257.field3929 = 0;
        class324.field5004 = 0;
        class38.field564 = 1;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(JI)V", line = 33)
    public static final void method1265(long arg0, int arg1) {
        field2706++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class159.field2416 < 100 || class38.field558) || class159.field2416 >= 200) {
            class262.method1840("", class240.field3672, 0, -125);
            return;
        }
        String var3 = class336.method2344(23827, arg0);
        for (int var4 = 0; var4 < class159.field2416; var4++) {
            if (class110.field1659[var4] == arg0) {
                class262.method1840("", var3 + class139.field2080, 0, -28);
                return;
            }
        }
        for (int var5 = 0; var5 < class153.field2321; var5++) {
            if (class162.field2626[var5] == arg0) {
                class262.method1840("", class118.field1842 + var3 + class172.field2774, 0, -26);
                return;
            }
        }
        if (var3.equals(class39.field575.field4218)) {
            class262.method1840("", class34.field500, 0, -27);
            return;
        }
        class309.field4819[class159.field2416] = var3;
        class110.field1659[class159.field2416] = arg0;
        class137.field2071++;
        class238.field3626[class159.field2416] = 0;
        class314.field4875[class159.field2416] = "";
        class97.field1392[class159.field2416] = arg1;
        class330.field5070[class159.field2416] = false;
        class159.field2416++;
        class338.field5255 = class12.field155;
        class85.field1236.method1141((byte) 119, 45);
        class85.field1236.method1738((byte) 112, arg0);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIII)V", line = 100)
    public static final void method1266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 >= 107) {
            for (int var6 = arg1; var6 <= arg5; var6++) {
                class7.method72(arg3, -7, arg2, class79.field1178[var6], arg0);
            }
            field2695++;
        }
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(B)V", line = 119)
    private final void method1267(byte arg0) {
        field2715++;
        Random var2 = new Random((long) this.field2705);
        this.field2694 = new short[512];
        int var3 = 19 % ((arg0 + 51) / 39);
        if (this.field2709 > 0) {
            for (int var4 = 0; var4 < 512; var4++) {
                this.field2694[var4] = (short) class101.method764(this.field2709, (byte) 121, var2);
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V", line = 145)
    public class167() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(II)V", line = 152)
    public static final void method1268(int arg0, int arg1) {
        class174.method1304((byte) 102);
        field2711++;
        class79.method615(-32);
        int var2 = class102.method774(arg1, -2).field3244;
        if (var2 == 0 || arg0 >= -95) {
            return;
        }
        int var3 = class154.field2330[arg1];
        if (var2 == 6) {
            class78.field1140 = var3;
        }
        if (var2 == 9) {
            class214.field3295 = var3;
        }
        if (var2 == 5) {
            class3.field35 = var3;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lmn;I)Lmn;", line = 183)
    public static final class161 method1269(class161 arg0, int arg1) {
        field2701++;
        class161 var2 = client.method1011(arg0);
        if (var2 == null) {
            var2 = arg0.field2464;
        }
        if (arg1 != 0) {
            method1265(77L, -11);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "(I)V", line = 207)
    public static void method1270(int arg0) {
        field2703 = null;
        if (arg0 != 0) {
            field2710 = -39;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)[I", line = 218)
    public final int[] method71(int arg0, int arg1) {
        field2713++;
        if (arg0 != 7) {
            return (int[]) null;
        }
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int var4 = class84.field1225[arg1] * this.field2702 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class218.field3333; var7++) {
                class268.field4163 = Integer.MAX_VALUE;
                class279.field4340 = Integer.MAX_VALUE;
                class255.field3894 = Integer.MAX_VALUE;
                class224.field3426 = Integer.MAX_VALUE;
                int var8 = class162.field2631[var7] * this.field2698 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field2708[(this.field2702 <= var11 ? var11 - this.field2702 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field2708[var12 + (this.field2698 <= var13 ? var13 - this.field2698 : var13) & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = -this.field2694[var14] - ((var13 << 12) - var8);
                        int var16 = var4 - (var11 << 12) - this.field2694[var27];
                        int var17 = this.field2700;
                        int var21;
                        if (var17 == 1) {
                            var21 = var15 * var15 + (var16 * var16) >> 12;
                        } else if (var17 == 3) {
                            int var24 = var16 < 0 ? -var16 : var16;
                            int var25 = var15 >= 0 ? var15 : -var15;
                            var21 = var25 > var24 ? var25 : var24;
                        } else if (var17 == 4) {
                            int var18 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var19 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var20 = var18 + var19;
                            var21 = var20 * var20 >> 12;
                        } else if (var17 == 5) {
                            int var22 = var16 * var16;
                            int var23 = var15 * var15;
                            var21 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var23 + var22) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var21 = (var15 >= 0 ? var15 : -var15) + (var16 >= 0 ? var16 : -var16);
                        } else {
                            var21 = (int) (Math.sqrt((double) ((float) (var15 * var15 + (var16 * var16)) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var21 < class224.field3426) {
                            class268.field4163 = class279.field4340;
                            class279.field4340 = class255.field3894;
                            class255.field3894 = class224.field3426;
                            class224.field3426 = var21;
                        } else if (class255.field3894 > var21) {
                            class268.field4163 = class279.field4340;
                            class279.field4340 = class255.field3894;
                            class255.field3894 = var21;
                        } else if (class279.field4340 > var21) {
                            class268.field4163 = class279.field4340;
                            class279.field4340 = var21;
                        } else if (class268.field4163 > var21) {
                            class268.field4163 = var21;
                        }
                    }
                }
                int var26 = this.field2697;
                if (var26 == 0) {
                    var3[var7] = class224.field3426;
                } else if (var26 == 1) {
                    var3[var7] = class255.field3894;
                } else if (var26 == 3) {
                    var3[var7] = class279.field4340;
                } else if (var26 == 4) {
                    var3[var7] = class268.field4163;
                } else if (var26 == 2) {
                    var3[var7] = class255.field3894 - class224.field3426;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "(B)V", line = 435)
    public static final void method1271(byte arg0) {
        field2712++;
        class204 var1 = class209.field3195;
        synchronized (class209.field3195) {
            class240.field3670 = class161.field2489;
            class290.field4468 = class183.field2889;
            class83.field1221++;
            class108.field1622 = class231.field3514;
            class305.field4751 = class139.field2083;
            if (arg0 < -79) {
                class109.field1643 = class148.field2246;
                class47.field640 = class269.field4189;
                class223.field3409 = class5.field73;
                class139.field2083 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lwm;II)V", line = 475)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg2 != -2828) {
            this.field2698 = -94;
        }
        if (arg1 == 0) {
            this.field2698 = this.field2702 = arg0.method1774((byte) -94);
        } else if (arg1 == 1) {
            this.field2705 = arg0.method1774((byte) 31);
        } else if (arg1 == 2) {
            this.field2709 = arg0.method1755(false);
        } else if (arg1 == 3) {
            this.field2697 = arg0.method1774((byte) -103);
        } else if (arg1 == 4) {
            this.field2700 = arg0.method1774((byte) -109);
        } else if (arg1 == 5) {
            this.field2698 = arg0.method1774((byte) 109);
        } else if (arg1 == 6) {
            this.field2702 = arg0.method1774((byte) 38);
        }
        field2714++;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V", line = 555)
    public final void method100(boolean arg0) {
        if (arg0) {
            field2707++;
            this.field2708 = class300.method2067(false, this.field2705);
            this.method1267((byte) 74);
        }
    }
}
