import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class516 {

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILaf;I)V")
    public static final void method3011(int arg0, class459 arg1, int arg2) {
        field7185++;
        boolean var3 = arg1.method2721(1, 1) == 1;
        if (var3) {
            class738.field10012[class776.field10672++] = arg2;
        }
        int var4 = arg1.method2721(2, 1);
        class758 var5 = class84.field1204[arg2];
        if (arg0 == var4) {
            if (var3) {
                var5.field10359 = false;
            } else if (class349.field5065 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class170 var6 = class637.field8588[arg2] = new class170();
                var6.field2228 = (var5.field6198[0] + class120.field1625 >> 6 << 14) + (var5.field2813 << 28) + (class259.field3849 - -var5.field6197[0] >> 6);
                if (var5.field10368 == -1) {
                    var6.field2229 = var5.field6109.method958((byte) -4);
                } else {
                    var6.field2229 = var5.field10368;
                }
                var6.field2227 = var5.field6149;
                var6.field2225 = var5.field10397;
                var6.field2226 = var5.field10373;
                if (var5.field10350 > 0) {
                    class230.method1449(var5, 0);
                }
                class84.field1204[arg2] = null;
                if (arg1.method2721(1, 1) != 0) {
                    class265.method1780(arg1, arg2, -128);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg1.method2721(3, 1);
            int var8 = var5.field6198[0];
            int var9 = var5.field6197[0];
            if (var7 == 0) {
                var9--;
                var8--;
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
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field10352 = var8;
                var5.field10376 = var9;
                var5.field10359 = true;
            } else {
                var5.method4166(var8, var9, 2, class747.field10072[arg2]);
            }
        } else if (var4 == 2) {
            int var10 = arg1.method2721(4, 1);
            int var11 = var5.field6198[0];
            int var12 = var5.field6197[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
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
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field10376 = var12;
                var5.field10352 = var11;
                var5.field10359 = true;
            } else {
                var5.method4166(var11, var12, 2, class747.field10072[arg2]);
            }
        } else {
            int var13 = arg1.method2721(1, 1);
            if (var13 == 0) {
                int var14 = arg1.method2721(12, 1);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field6198[0] + var16;
                int var19 = var5.field6197[0] + var17;
                if (var3) {
                    var5.field10359 = true;
                    var5.field10352 = var18;
                    var5.field10376 = var19;
                } else {
                    var5.method4166(var18, var19, 2, class747.field10072[arg2]);
                }
                var5.field2813 = var5.field2809 = (byte) (var5.field2813 + var15 & 0x3);
                if (class49.method310(var18, var19, (byte) 116)) {
                    var5.field2809++;
                }
                if (class349.field5065 == arg2) {
                    if (class184.field2420 != var5.field2813) {
                        class132.field1818 = true;
                    }
                    class184.field2420 = var5.field2813;
                }
            } else {
                int var20 = arg1.method2721(30, 1);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFC939) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (class120.field1625 + var22 + var5.field6198[0] & 0x3FFF) - class120.field1625;
                int var25 = (var5.field6197[0] + var23 + class259.field3849 & 0x3FFF) - class259.field3849;
                if (var3) {
                    var5.field10352 = var24;
                    var5.field10376 = var25;
                    var5.field10359 = true;
                } else {
                    var5.method4166(var24, var25, arg0 ^ 0x2, class747.field10072[arg2]);
                }
                var5.field2813 = var5.field2809 = (byte) (var5.field2813 + var21 & 0x3);
                if (class49.method310(var24, var25, (byte) 46)) {
                    var5.field2809++;
                }
                if (class349.field5065 == arg2) {
                    class184.field2420 = var5.field2813;
                }
            }
        }
    }
}
