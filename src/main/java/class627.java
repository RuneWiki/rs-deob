import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class627 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Ldb;")
    public static class298 field8459 = new class298(39, 8);

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Z")
    public static boolean field8464 = false;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field8463;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZ)I", line = 3)
    public static final int method3451(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return -26;
        } else {
            field8462++;
            int var3 = arg1 - 1 & arg0 >> 31;
            return ((arg0 >>> 31) + arg0) % arg1 + var3;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 18)
    public static void method3452(byte arg0) {
        int var1 = -33 / ((-arg0 - 31) / 62);
        field8459 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBLcea;)V", line = 27)
    public static final void method3453(int arg0, byte arg1, class201 arg2) {
        field8460++;
        boolean var3 = arg2.method1318(-84, 1) == 1;
        if (var3) {
            class24.field415[class220.field3113++] = arg0;
        }
        int var4 = arg2.method1318(108, 2);
        if (arg1 >= -21) {
            return;
        }
        class403 var5 = class572.field7601[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field5386 = false;
            } else if (class416.field5693 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class8 var6 = class541.field7123[arg0] = new class8();
                var6.field187 = (var5.field5643[0] + class473.field6334 >> 6 << 14) + (var5.field8609 << 28) + (var5.field5649[0] + class233.field3269 >> 6);
                if (var5.field5364 == -1) {
                    var6.field190 = var5.field5574.method3585(115);
                } else {
                    var6.field190 = var5.field5364;
                }
                var6.field189 = var5.field5394;
                var6.field191 = var5.field5551;
                if (var5.field5383 > 0) {
                    class577.method3168(var5, true);
                }
                class572.field7601[arg0] = null;
                if (arg2.method1318(3, 1) != 0) {
                    class643.method3537((byte) -115, arg0, arg2);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method1318(102, 3);
            int var8 = var5.field5643[0];
            int var9 = var5.field5649[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
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
                var9++;
                var8++;
            }
            if (var3) {
                var5.field5386 = true;
                var5.field5389 = var9;
                var5.field5373 = var8;
            } else {
                var5.method2315(var8, 0, class425.field5841[arg0], var9);
            }
        } else if (var4 == 2) {
            int var10 = arg2.method1318(115, 4);
            int var11 = var5.field5643[0];
            int var12 = var5.field5649[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var11 += 2;
                var12 += 2;
            }
            if (var3) {
                var5.field5373 = var11;
                var5.field5389 = var12;
                var5.field5386 = true;
            } else {
                var5.method2315(var11, 0, class425.field5841[arg0], var12);
            }
        } else {
            int var13 = arg2.method1318(119, 1);
            if (var13 == 0) {
                int var14 = arg2.method1318(100, 12);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3E9) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field5643[0] + var16;
                int var19 = var5.field5649[0] + var17;
                if (var3) {
                    var5.field5373 = var18;
                    var5.field5389 = var19;
                    var5.field5386 = true;
                } else {
                    var5.method2315(var18, 0, class425.field5841[arg0], var19);
                }
                var5.field8609 = (byte) (var5.field8609 + var15 & 0x3);
                if (class416.field5693 == arg0) {
                    class29.field476 = var5.field8609;
                }
            } else {
                int var20 = arg2.method1318(-79, 30);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFCE10) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field5643[0] + var22 + class473.field6334 & 0x3FFF) - class473.field6334;
                int var25 = (var5.field5649[0] + class233.field3269 + var23 & 0x3FFF) - class233.field3269;
                if (var3) {
                    var5.field5373 = var24;
                    var5.field5389 = var25;
                    var5.field5386 = true;
                } else {
                    var5.method2315(var24, 0, class425.field5841[arg0], var25);
                }
                var5.field8609 = (byte) (var5.field8609 + var21 & 0x3);
                if (class416.field5693 == arg0) {
                    class29.field476 = var5.field8609;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 346)
    public static final void method3454(int arg0) {
        if (class445.method2509(-7, class32.field525) || client.method1691(false, class32.field525)) {
            class276.method1675(5000, class643.field8632 >> 12, 24, class259.field3563 >> 12);
        } else {
            int var1 = class199.field2897.field5643[0] >> 3;
            int var2 = class199.field2897.field5649[0] >> 3;
            if (var1 >= 0 && (class34.field530 >> 3) > var1 && var2 >= 0 && class34.field531 >> 3 > var2) {
                class276.method1675(5000, var2, 64, var1);
            } else {
                class276.method1675(0, class34.field531 >> 4, 50, class34.field530 >> 4);
            }
        }
        field8463++;
        class169.method1154(91);
        class575.method3151((byte) -117);
        class280.method1743(arg0 ^ 0x3336);
        if (arg0 != 13133) {
            method3454(43);
        }
        class569.method3133((byte) -114);
    }
}
