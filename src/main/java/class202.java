import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class202 {

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
    public static boolean field3203 = false;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Ldv;")
    public static class83 field3200;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "[I")
    public static int[] field3204;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "[Lo;")
    public static class138[] field3201;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 9)
    public static void method1330(int arg0) {
        field3200 = null;
        field3204 = null;
        field3201 = null;
        if (arg0 != 0) {
            method1330(-119);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V", line = 23)
    public static final void method1331(boolean arg0) {
        if (!arg0) {
            return;
        }
        if (class229.method1589((byte) 18)) {
            if (class383.field5913 == null) {
                class48.method339((byte) -107);
            }
            class331.field5206 = 0;
            class191.field2977 = true;
            try {
                class146.field2388 = class326.field5138.getToolkit().getSystemClipboard();
            } catch (Exception var1) {
            }
        }
        field3199++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lap;IB)V", line = 66)
    public static final void method1332(class340 arg0, int arg1, byte arg2) {
        field3202++;
        boolean var3 = arg0.method2155(1, 30390) == 1;
        if (var3) {
            class335.field5261[class299.field4808++] = arg1;
        }
        int var4 = arg0.method2155(2, 30390);
        class166 var5 = class435.field6489[arg1];
        if (var4 == 0) {
            if (var3) {
                var5.field2628 = false;
            } else if (class265.field4432 == arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class260 var6 = class201.field3196[arg1] = new class260();
                var6.field4349 = (var5.field4720 << 28) + (var5.field3159[0] + class16.field181 >> 6 << 14) + (var5.field3158[0] + class455.field6794 >> 6);
                if (var5.field2618 == -1) {
                    var6.field4355 = var5.field3087.method2112((byte) 122);
                } else {
                    var6.field4355 = var5.field2618;
                }
                var6.field4354 = var5.field2649;
                var6.field4350 = var5.field3065;
                if (var5.field2633 > 0) {
                    class186.method1261(var5, 316610721);
                }
                class435.field6489[arg1] = null;
                if (arg0.method2155(1, 30390) != 0) {
                    class457.method2738(255, arg1, arg0);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method2155(3, 30390);
            int var8 = var5.field3159[0];
            int var9 = var5.field3158[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field2648 = var8;
                var5.field2628 = true;
                var5.field2630 = var9;
            } else {
                var5.method1139(class506.field7364[arg1], var9, 0, var8);
            }
        } else if (var4 == 2) {
            int var10 = arg0.method2155(4, 30390);
            int var11 = var5.field3159[0];
            int var12 = var5.field3158[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var11 += 2;
                var12 += 2;
            }
            if (var3) {
                var5.field2630 = var12;
                var5.field2648 = var11;
                var5.field2628 = true;
            } else {
                var5.method1139(class506.field7364[arg1], var12, 0, var11);
            }
        } else {
            int var13 = arg0.method2155(1, 30390);
            if (var13 == 0) {
                int var14 = arg0.method2155(12, 30390);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field3159[0] + var16;
                int var19 = var5.field3158[0] + var17;
                if (var3) {
                    var5.field2630 = var19;
                    var5.field2628 = true;
                    var5.field2648 = var18;
                } else {
                    var5.method1139(class506.field7364[arg1], var19, arg2 ^ 0x48, var18);
                }
                var5.field4720 = (byte) (var5.field4720 + var15 & 0x3);
                if (class265.field4432 == arg1) {
                    class93.field1556 = var5.field4720;
                }
            } else {
                int var20 = arg0.method2155(30, 30390);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFD5D1) >> 14;
                int var23 = var20 & 0x3FFF;
                if (arg2 != 72) {
                    field3201 = null;
                }
                int var24 = (class16.field181 + var22 + var5.field3159[0] & 0x3FFF) - class16.field181;
                int var25 = (class455.field6794 + var23 + var5.field3158[0] & 0x3FFF) - class455.field6794;
                if (var3) {
                    var5.field2628 = true;
                    var5.field2630 = var25;
                    var5.field2648 = var24;
                } else {
                    var5.method1139(class506.field7364[arg1], var25, 0, var24);
                }
                var5.field4720 = (byte) (var5.field4720 + var21 & 0x3);
                if (class265.field4432 == arg1) {
                    class93.field1556 = var5.field4720;
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "K", descriptor = "(III[I)V")
    public abstract void method1249(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "U", descriptor = "(III)V")
    public abstract void method1246(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "ca", descriptor = "(I)V")
    public abstract void method1250(int arg0);

    @OriginalMember(owner = "client!c", name = "wa", descriptor = "([I)V")
    public abstract void method1240(int[] arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()Lc;")
    public abstract class202 method1242();

    @OriginalMember(owner = "client!c", name = "EA", descriptor = "(I)V")
    public abstract void method1245(int arg0);

    @OriginalMember(owner = "client!c", name = "A", descriptor = "(I)V")
    public abstract void method1248(int arg0);

    @OriginalMember(owner = "client!c", name = "ha", descriptor = "(Lc;)V")
    public abstract void method1241(class202 arg0);

    @OriginalMember(owner = "client!c", name = "W", descriptor = "(III)V")
    public abstract void method1237(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "ea", descriptor = "(I)V")
    public abstract void method1243(int arg0);

    @OriginalMember(owner = "client!c", name = "v", descriptor = "()V")
    public abstract void method1244();

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
    public abstract void method1239(int arg0);

    @OriginalMember(owner = "client!c", name = "YA", descriptor = "(IIIIII)V")
    public abstract void method1247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)V")
    public abstract void method1238(int arg0, int arg1, int arg2, int[] arg3);
}
