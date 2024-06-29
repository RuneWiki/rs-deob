import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class617 {

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public int field8591;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "Lfja;")
    public static class783 field8594 = new class783(104, 6);

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field8589;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "[Z")
    public static boolean[] field8593;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lkka;II)V", line = 3)
    public static final void method3483(class329 arg0, int arg1, int arg2) {
        field8589++;
        boolean var3 = arg0.method2078(1, 15455) == 1;
        if (var3) {
            class88.field1218[class35.field582++] = arg2;
        }
        int var4 = arg0.method2078(2, arg1 ^ 0x3C5E);
        class771 var5 = class527.field7150[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field10618 = false;
            } else if (class483.field6533 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class593 var6 = class606.field8464[arg2] = new class593();
                var6.field8331 = (var5.field5304[0] + class217.field3198 >> 6 << 14) + (var5.field7391 << 28) + (var5.field5308[0] + class400.field5510 >> 6);
                if (var5.field10633 == -1) {
                    var6.field8335 = var5.field5246.method1062(false);
                } else {
                    var6.field8335 = var5.field10633;
                }
                var6.field8328 = var5.field10639;
                var6.field8333 = var5.field10635;
                var6.field8330 = var5.field5286;
                if (var5.field10642 > 0) {
                    class218.method1507(arg1 ^ 0x1001, var5);
                }
                class527.field7150[arg2] = null;
                if (arg0.method2078(1, 15455) != 0) {
                    class563.method3256(arg2, (byte) -84, arg0);
                }
            }
        } else if (arg1 == var4) {
            int var7 = arg0.method2078(3, 15455);
            int var8 = var5.field5304[0];
            int var9 = var5.field5308[0];
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
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field10618 = true;
                var5.field10656 = var8;
                var5.field10624 = var9;
            } else {
                var5.method4240(false, var8, class104.field1679[arg2], var9);
            }
        } else if (var4 == 2) {
            int var10 = arg0.method2078(4, 15455);
            int var11 = var5.field5304[0];
            int var12 = var5.field5308[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field10656 = var11;
                var5.field10618 = true;
                var5.field10624 = var12;
            } else {
                var5.method4240(false, var11, class104.field1679[arg2], var12);
            }
        } else {
            int var13 = arg0.method2078(1, 15455);
            if (var13 == 0) {
                int var14 = arg0.method2078(12, 15455);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field5304[0] + var16;
                int var19 = var5.field5308[0] + var17;
                if (var3) {
                    var5.field10618 = true;
                    var5.field10624 = var19;
                    var5.field10656 = var18;
                } else {
                    var5.method4240(false, var18, class104.field1679[arg2], var19);
                }
                var5.field7391 = var5.field7404 = (byte) (var5.field7391 + var15 & 0x3);
                if (class61.method425(var19, 16340, var18)) {
                    var5.field7404++;
                }
                if (class483.field6533 == arg2) {
                    if (class282.field3917 != var5.field7391) {
                        class180.field2828 = true;
                    }
                    class282.field3917 = var5.field7391;
                }
            } else {
                int var20 = arg0.method2078(30, 15455);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFED13) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field5304[0] + var22 + class217.field3198 & 0x3FFF) - class217.field3198;
                int var25 = (var5.field5308[0] + class400.field5510 + var23 & 0x3FFF) - class400.field5510;
                if (var3) {
                    var5.field10618 = true;
                    var5.field10624 = var25;
                    var5.field10656 = var24;
                } else {
                    var5.method4240(false, var24, class104.field1679[arg2], var25);
                }
                var5.field7391 = var5.field7404 = (byte) (var5.field7391 + var21 & 0x3);
                if (class61.method425(var25, 16340, var24)) {
                    var5.field7404++;
                }
                if (class483.field6533 == arg2) {
                    class282.field3917 = var5.field7391;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V", line = 328)
    public static void method3484(int arg0) {
        field8594 = null;
        int var1 = 107 % ((-arg0 - 17) / 39);
        field8593 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZLcda;Lha;)I", line = 339)
    public static final int method3485(boolean arg0, class184 arg1, class66 arg2) {
        field8592++;
        if (arg1.field2853 != -1) {
            return arg1.field2853;
        }
        if (arg1.field2865 != -1) {
            class311 var3 = arg2.field970.method1270(arg1.field2865, true);
            if (!var3.field4244) {
                return var3.field4239;
            }
        }
        return arg0 ? arg1.field2858 : 85;
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(I)V", line = 365)
    public class617(int arg0) {
        this.field8591 = arg0;
    }

    @OriginalMember(owner = "client!ot", name = "toString", descriptor = "()Ljava/lang/String;", line = 379)
    public final String toString() {
        field8590++;
        throw new IllegalStateException();
    }
}
