import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class507 extends class476 {

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "[B")
    public byte[] field7408;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([Ljava/lang/String;[SZ)V")
    public static final void method3006(String[] arg0, short[] arg1, boolean arg2) {
        field7407++;
        class293.method1696(arg0.length - 1, arg0, true, arg1, 0);
        if (!arg2) {
            ;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZLnf;)V")
    public static final void method3007(int arg0, boolean arg1, class28 arg2) {
        field7406++;
        boolean var3 = arg2.method194(1, -15886) == 1;
        if (var3) {
            class505.field7389[class154.field2383++] = arg0;
        }
        int var4 = arg2.method194(2, -15886);
        class487 var5 = class45.field642[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field7020 = false;
            } else if (class484.field6972 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class137 var6 = class312.field4240[arg0] = new class137();
                var6.field2070 = (class399.field5727 + var5.field257[0] >> 6) + (var5.field263[0] + class110.field1775 >> 6 << 14) + (var5.field6279 << 28);
                if (var5.field7003 == -1) {
                    var6.field2068 = var5.field163.method1744(arg1);
                } else {
                    var6.field2068 = var5.field7003;
                }
                var6.field2066 = var5.field7046;
                var6.field2072 = var5.field202;
                if (var5.field7043 > 0) {
                    class236.method1445(35, var5);
                }
                class45.field642[arg0] = null;
                if (arg2.method194(1, -15886) != 0) {
                    class360.method2148(arg2, -108, arg0);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method194(3, -15886);
            int var8 = var5.field263[0];
            int var9 = var5.field257[0];
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
                var8++;
                var9++;
            }
            if (var3) {
                var5.field7025 = var8;
                var5.field7020 = true;
                var5.field7019 = var9;
            } else {
                var5.method2889(var8, var9, -124, class195.field2829[arg0]);
            }
        } else if (var4 == 2) {
            int var10 = arg2.method194(4, -15886);
            int var11 = var5.field263[0];
            int var12 = var5.field257[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
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
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
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
                var5.field7020 = true;
                var5.field7019 = var12;
                var5.field7025 = var11;
            } else {
                var5.method2889(var11, var12, -86, class195.field2829[arg0]);
            }
        } else {
            int var13 = arg2.method194(1, -15886);
            if (var13 == 0) {
                int var14 = arg2.method194(12, -15886);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field263[0] + var16;
                int var19 = var5.field257[0] + var17;
                if (var3) {
                    var5.field7020 = true;
                    var5.field7025 = var18;
                    var5.field7019 = var19;
                } else {
                    var5.method2889(var18, var19, -124, class195.field2829[arg0]);
                }
                var5.field6279 = (byte) (var5.field6279 + var15 & 0x3);
                if (class484.field6972 == arg0) {
                    class366.field5260 = var5.field6279;
                }
            } else if (!arg1) {
                int var20 = arg2.method194(30, -15886);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (class110.field1775 + var22 + var5.field263[0] & 0x3FFF) - class110.field1775;
                int var25 = (class399.field5727 + var23 + var5.field257[0] & 0x3FFF) - class399.field5727;
                if (var3) {
                    var5.field7020 = true;
                    var5.field7025 = var24;
                    var5.field7019 = var25;
                } else {
                    var5.method2889(var24, var25, -120, class195.field2829[arg0]);
                }
                var5.field6279 = (byte) (var5.field6279 + var21 & 0x3);
                if (class484.field6972 == arg0) {
                    class366.field5260 = var5.field6279;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "([B)V")
    public class507(byte[] arg0) {
        this.field7408 = arg0;
    }
}
