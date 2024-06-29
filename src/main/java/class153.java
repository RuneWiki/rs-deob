import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class153 {

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public int field2490 = -1;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "Z")
    public boolean field2497 = false;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "[I")
    private int[] field2483 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "[I")
    public static int[] field2484 = new int[50];

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "[I")
    public static int[] field2496 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Lu;")
    public static class219 field2489 = new class219();

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "[S")
    public static short[] field2500 = new short[256];

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "Lph;")
    public static class229 field2503 = class266.method1858("<br>(X", 0);

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "Lsb;")
    public static class141 field2499;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "Lsi;")
    public static class66 field2502;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "[I")
    private int[] field2494;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "[I")
    public static int[] field2501;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "[S")
    private short[] field2481;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "[S")
    private short[] field2485;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "[S")
    private short[] field2488;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "[S")
    private short[] field2495;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 9)
    public static void method1106(int arg0) {
        field2489 = null;
        field2502 = null;
        field2501 = null;
        if (arg0 != 197) {
            return;
        }
        field2499 = null;
        field2500 = null;
        field2496 = null;
        field2484 = null;
        field2503 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLhb;)V", line = 27)
    public final void method1107(byte arg0, class164 arg1) {
        if (arg0 > -39) {
            return;
        }
        while (true) {
            int var3 = arg1.method1178(8);
            if (var3 == 0) {
                field2498++;
                return;
            }
            this.method1112(var3, arg1, 26);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)Z", line = 48)
    public final boolean method1108(int arg0) {
        field2487++;
        if (this.field2494 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2494.length; var3++) {
            if (!class316.field5366.method521(this.field2494[var3], true, 0)) {
                var2 = false;
            }
        }
        if (arg0 != 14425) {
            field2500 = (short[]) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)Z", line = 74)
    public final boolean method1109(int arg0) {
        field2482++;
        boolean var2 = true;
        if (arg0 != 114) {
            this.field2481 = (short[]) null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2483[var3] != -1 && !class316.field5366.method521(this.field2483[var3], true, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)Lhi;", line = 98)
    public final class28 method1110(int arg0) {
        field2493++;
        if (this.field2494 == null) {
            return null;
        }
        class28[] var2 = new class28[this.field2494.length];
        for (int var3 = arg0; var3 < this.field2494.length; var3++) {
            var2[var3] = class28.method214(class316.field5366, this.field2494[var3], 0);
        }
        class28 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class28(var2, var2.length);
        }
        if (this.field2495 != null) {
            for (int var5 = 0; var5 < this.field2495.length; var5++) {
                var4.method195(this.field2495[var5], this.field2488[var5]);
            }
        }
        if (this.field2481 != null) {
            for (int var6 = 0; var6 < this.field2481.length; var6++) {
                var4.method203(this.field2481[var6], this.field2485[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)Lhi;", line = 160)
    public final class28 method1111(int arg0) {
        field2492++;
        class28[] var2 = new class28[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2483[var4] != -1) {
                var2[var3++] = class28.method214(class316.field5366, this.field2483[var4], 0);
            }
        }
        if (arg0 <= 65) {
            this.method1111(-1);
        }
        class28 var5 = new class28(var2, var3);
        if (this.field2495 != null) {
            for (int var6 = 0; var6 < this.field2495.length; var6++) {
                var5.method195(this.field2495[var6], this.field2488[var6]);
            }
        }
        if (this.field2481 != null) {
            for (int var7 = 0; var7 < this.field2481.length; var7++) {
                var5.method203(this.field2481[var7], this.field2485[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILhb;I)V", line = 218)
    private final void method1112(int arg0, class164 arg1, int arg2) {
        field2486++;
        int var4 = -66 % ((arg2 + 33) / 51);
        if (arg0 == 1) {
            this.field2490 = arg1.method1178(8);
        } else if (arg0 == 2) {
            int var5 = arg1.method1178(8);
            this.field2494 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2494[var6] = arg1.method1161(true);
            }
        } else if (arg0 == 3) {
            this.field2497 = true;
        } else if (arg0 == 40) {
            int var9 = arg1.method1178(8);
            this.field2495 = new short[var9];
            this.field2488 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2495[var10] = (short) arg1.method1161(true);
                this.field2488[var10] = (short) arg1.method1161(true);
            }
        } else if (arg0 == 41) {
            int var7 = arg1.method1178(8);
            this.field2481 = new short[var7];
            this.field2485 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2481[var8] = (short) arg1.method1161(true);
                this.field2485[var8] = (short) arg1.method1161(true);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field2483[arg0 - 60] = arg1.method1161(true);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBLri;I)V", line = 318)
    public static final void method1113(int arg0, byte arg1, class301 arg2, int arg3) {
        field2491++;
        if (arg2.field4885 == 1) {
            class50.field718++;
            class306.method2067(arg2.field4948, class134.field2172, arg2.field5044, 0, (short) 28, 0L, 0);
        }
        if (arg2.field4885 == 2 && !class8.field103) {
            class229 var4 = class68.method538(arg2, (byte) 70);
            if (var4 != null) {
                class306.method2067(arg2.field4948, class248.method1746(arg1 + 8584, new class229[] { class316.field5368, arg2.field5011 }), var4, -1, (short) 34, 0L, 0);
                class174.field2836++;
            }
        }
        if (arg2.field4885 == 3) {
            class132.field2150++;
            class306.method2067(arg2.field4948, class134.field2172, class22.field295, 0, (short) 22, 0L, 0);
        }
        if (arg2.field4885 == 4) {
            class306.method2067(arg2.field4948, class134.field2172, arg2.field5044, 0, (short) 46, 0L, 0);
            class94.field1582++;
        }
        if (arg2.field4885 == 5) {
            class72.field1199++;
            class306.method2067(arg2.field4948, class134.field2172, arg2.field5044, 0, (short) 6, 0L, 0);
        }
        if (arg1 != -56) {
            method1113(3, (byte) -9, (class301) null, -1);
        }
        if (arg2.field4885 == 6 && class156.field2535 == null) {
            class306.method2067(arg2.field4948, class134.field2172, arg2.field5044, -1, (short) 3, 0L, 0);
            class317.field5380++;
        }
        if (arg2.field4920 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field5026; var6++) {
                for (int var7 = 0; var7 < arg2.field5037; var7++) {
                    int var8 = (arg2.field5046 + 32) * var7;
                    int var9 = (arg2.field4904 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg2.field4906[var5];
                        var8 += arg2.field4958[var5];
                    }
                    if (arg3 >= var8 && var9 <= arg0 && (var8 + 32) > arg3 && arg0 < (var9 + 32)) {
                        class328.field5593 = arg2;
                        class167.field2736 = var5;
                        if (arg2.field4922[var5] > 0) {
                            class191 var10 = class124.method920(-84, arg2.field4922[var5] - 1);
                            if (class317.field5381 == 1 && class4.method19(0, client.method2168(arg2))) {
                                if (class43.field658 != arg2.field4948 || class228.field3743 != var5) {
                                    class306.method2067(arg2.field4948, class248.method1746(8528, new class229[] { class208.field3431, class325.field5566, var10.field3154 }), class143.field2321, var5, (short) 37, (long) var10.field3135, 0);
                                    class215.field3541++;
                                }
                            } else if (!class8.field103 || !class4.method19(0, client.method2168(arg2))) {
                                class229[] var11 = var10.field3110;
                                class321.field5436++;
                                if (class177.field2923) {
                                    var11 = class222.method1552((byte) -16, var11);
                                }
                                if (class4.method19(0, client.method2168(arg2))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 31;
                                            } else {
                                                var13 = 16;
                                            }
                                            class275.field4588++;
                                            class306.method2067(arg2.field4948, class248.method1746(8528, new class229[] { class77.field1287, var10.field3154 }), var11[var12], var5, var13, (long) var10.field3135, 0);
                                        } else if (var12 == 4) {
                                            class306.method2067(arg2.field4948, class248.method1746(arg1 + 8584, new class229[] { class77.field1287, var10.field3154 }), class324.field5542, var5, (short) 16, (long) var10.field3135, arg1 ^ 0xFFFFFFC8);
                                            class100.field1699++;
                                        }
                                    }
                                }
                                if (class63.method470(client.method2168(arg2), arg1 ^ 0xFFFFFFC8)) {
                                    class306.method2067(arg2.field4948, class248.method1746(arg1 + 8584, new class229[] { class77.field1287, var10.field3154 }), class143.field2321, var5, (short) 30, (long) var10.field3135, 0);
                                    class85.field1470++;
                                }
                                if (class4.method19(0, client.method2168(arg2)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class94.field1593++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 44;
                                            }
                                            if (var14 == 1) {
                                                var15 = 24;
                                            }
                                            if (var14 == 2) {
                                                var15 = 39;
                                            }
                                            class306.method2067(arg2.field4948, class248.method1746(arg1 ^ 0xFFFFDE98, new class229[] { class77.field1287, var10.field3154 }), var11[var14], var5, var15, (long) var10.field3135, 0);
                                        }
                                    }
                                }
                                class229[] var16 = arg2.field4944;
                                if (class177.field2923) {
                                    var16 = class222.method1552((byte) -16, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class289.field4740++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 29;
                                            }
                                            if (var17 == 1) {
                                                var18 = 4;
                                            }
                                            if (var17 == 2) {
                                                var18 = 59;
                                            }
                                            if (var17 == 3) {
                                                var18 = 26;
                                            }
                                            if (var17 == 4) {
                                                var18 = 51;
                                            }
                                            class306.method2067(arg2.field4948, class248.method1746(arg1 + 8584, new class229[] { class77.field1287, var10.field3154 }), var16[var17], var5, var18, (long) var10.field3135, 0);
                                        }
                                    }
                                }
                                class306.method2067(arg2.field4948, class248.method1746(8528, new class229[] { class77.field1287, var10.field3154 }), class39.field618, var5, (short) 1001, (long) var10.field3135, arg1 + 56);
                            } else if ((class208.field3434 & 0x10) == 16) {
                                class19.field254++;
                                class306.method2067(arg2.field4948, class248.method1746(8528, new class229[] { class205.field3388, class325.field5566, var10.field3154 }), class116.field1965, var5, (short) 49, (long) var10.field3135, 0);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field5043) {
            return;
        }
        if (!class8.field103) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class229 var20 = class192.method1350((byte) 72, arg2, var19);
                if (var20 != null) {
                    class306.method2067(arg2.field4948, arg2.field4913, var20, arg2.field4987, (short) 1004, (long) (var19 + 1), arg1 + 56);
                    class273.field4561++;
                }
            }
            class229 var21 = class68.method538(arg2, (byte) 45);
            if (var21 != null) {
                class174.field2836++;
                class306.method2067(arg2.field4948, arg2.field4913, var21, arg2.field4987, (short) 34, 0L, 0);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class229 var23 = class192.method1350((byte) 72, arg2, var22);
                if (var23 != null) {
                    class306.method2067(arg2.field4948, arg2.field4913, var23, arg2.field4987, (short) 14, (long) (var22 + 1), 0);
                    class273.field4561++;
                }
            }
            if (class299.method2012(1, client.method2168(arg2))) {
                class306.method2067(arg2.field4948, class134.field2172, class260.field4347, arg2.field4987, (short) 3, 0L, 0);
                class317.field5380++;
            }
        } else if (class149.method1087(-77, client.method2168(arg2)) && (class208.field3434 & 0x20) == 32) {
            class59.field831++;
            class306.method2067(arg2.field4948, class248.method1746(8528, new class229[] { class205.field3388, class101.field1733, arg2.field4913 }), class116.field1965, arg2.field4987, (short) 50, 0L, 0);
        }
    }
}
