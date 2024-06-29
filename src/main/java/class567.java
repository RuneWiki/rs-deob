import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class567 extends RuntimeException {

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field7175;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "Ljava/lang/String;")
    public String field7174;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "Luw;")
    public static class208 field7177 = new class208(61, 3);

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILtia;I)V", line = 4)
    public static final void method3058(int arg0, class740 arg1, int arg2) {
        field7176++;
        boolean var3 = arg1.method4023(true, 1) == 1;
        if (var3) {
            class723.field9490[class404.field5371++] = arg0;
        }
        int var4 = arg1.method4023(true, 2);
        class33 var5 = class263.field3508[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field333 = false;
            } else if (class330.field4043 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class750 var6 = class420.field5533[arg0] = new class750();
                var6.field10232 = (var5.field2895 << 28) + (class714.field9407 + var5.field4767[0] >> 6 << 14) + (class240.field3293 - -var5.field4758[0] >> 6);
                if (var5.field347 == -1) {
                    var6.field10226 = var5.field4728.method2797(arg2 + 23908);
                } else {
                    var6.field10226 = var5.field347;
                }
                var6.field10227 = var5.field344;
                var6.field10230 = var5.field4723;
                var6.field10233 = var5.field342;
                if (var5.field338 > 0) {
                    class330.method1913((byte) 115, var5);
                }
                class263.field3508[arg0] = null;
                if (arg1.method4023(true, 1) != 0) {
                    class143.method824(arg1, arg0, -70);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg1.method4023(true, 3);
            int var8 = var5.field4767[0];
            int var9 = var5.field4758[0];
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
                var5.field372 = var9;
                var5.field348 = var8;
                var5.field333 = true;
            } else {
                var5.method176(var8, class282.field3657[arg0], (byte) -123, var9);
            }
        } else if (var4 == 2) {
            int var10 = arg1.method4023(true, 4);
            int var11 = var5.field4767[0];
            int var12 = var5.field4758[0];
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
                var11 += 2;
                var12 -= 2;
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
                var11 -= 2;
                var12++;
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
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field333 = true;
                var5.field372 = var12;
                var5.field348 = var11;
            } else {
                var5.method176(var11, class282.field3657[arg0], (byte) -115, var12);
            }
        } else {
            int var13 = arg1.method4023(true, 1);
            if (var13 == 0) {
                int var14 = arg1.method4023(true, 12);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field4767[0] + var16;
                int var19 = var5.field4758[0] + var17;
                if (var3) {
                    var5.field372 = var19;
                    var5.field348 = var18;
                    var5.field333 = true;
                } else {
                    var5.method176(var18, class282.field3657[arg0], (byte) -113, var19);
                }
                var5.field2895 = var5.field2889 = (byte) (var5.field2895 + var15 & 0x3);
                if (class433.method2484(var19, 0, var18)) {
                    var5.field2889++;
                }
                if (class330.field4043 == arg0) {
                    if (class309.field3877 != var5.field2895) {
                        class689.field8852 = true;
                    }
                    class309.field3877 = var5.field2895;
                }
            } else {
                int var20 = arg1.method4023(true, 30);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (class714.field9407 + var22 + var5.field4767[0] & 0x3FFF) - class714.field9407;
                int var25 = (var5.field4758[arg2] + class240.field3293 + var23 & 0x3FFF) - class240.field3293;
                if (var3) {
                    var5.field372 = var25;
                    var5.field333 = true;
                    var5.field348 = var24;
                } else {
                    var5.method176(var24, class282.field3657[arg0], (byte) -113, var25);
                }
                var5.field2895 = var5.field2889 = (byte) (var5.field2895 + var21 & 0x3);
                if (class433.method2484(var25, 0, var24)) {
                    var5.field2889++;
                }
                if (class330.field4043 == arg0) {
                    class309.field3877 = var5.field2895;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)V", line = 332)
    public static void method3059(boolean arg0) {
        if (!arg0) {
            method3059(true);
        }
        field7177 = null;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 346)
    public class567(Throwable arg0, String arg1) {
        this.field7175 = arg0;
        this.field7174 = arg1;
    }
}
