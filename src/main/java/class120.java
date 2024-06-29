import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class120 {

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field1507 = 0;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Lpk;")
    public class120 field1508;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Lpk;")
    public class120 field1509;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "Lb;")
    public static class201 field1512;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Lsh;")
    public static class48 field1504;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public final void method738(byte arg0) {
        field1503++;
        if (arg0 != -2) {
            method739(-84);
        }
        if (this.field1509 != null) {
            this.field1509.field1508 = this.field1508;
            this.field1508.field1509 = this.field1509;
            this.field1509 = null;
            this.field1508 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static void method739(int arg0) {
        if (arg0 == -1517192868) {
            field1504 = null;
            field1512 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lck;II)V")
    public static final void method740(class419 arg0, int arg1, int arg2) {
        field1506++;
        boolean var3 = arg0.method2464(1, 0) == 1;
        if (var3) {
            class191.field2846[class201.field2946++] = arg2;
        }
        int var4 = arg0.method2464(arg1, 0);
        class452 var5 = class124.field1559[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field6272 = false;
            } else if (class295.field4273 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class139.field1830[arg2] = (var5.field4319 << 28) + (var5.field2163[0] + class240.field3602 >> 6 << 14) + (var5.field2159[0] + class360.field5180 >> 6);
                if (var5.field6252 == -1) {
                    class51.field705[arg2] = var5.field2153.method583((byte) -47);
                } else {
                    class51.field705[arg2] = var5.field6252;
                }
                class359.field5163[arg2] = var5.field2125;
                if (var5.field6283 > 0) {
                    class367.method2263(var5, 30748);
                }
                class124.field1559[arg2] = null;
                if (arg0.method2464(1, arg1 ^ 0x2) != 0) {
                    class244.method1535((byte) -110, arg0, arg2);
                }
            }
        } else if (var4 == 1) {
            int var6 = arg0.method2464(3, 0);
            int var7 = var5.field2163[0];
            int var8 = var5.field2159[0];
            if (var6 == 0) {
                var8--;
                var7--;
            } else if (var6 == 1) {
                var8--;
            } else if (var6 == 2) {
                var7++;
                var8--;
            } else if (var6 == 3) {
                var7--;
            } else if (var6 == 4) {
                var7++;
            } else if (var6 == 5) {
                var7--;
                var8++;
            } else if (var6 == 6) {
                var8++;
            } else if (var6 == 7) {
                var7++;
                var8++;
            }
            if (var3) {
                var5.field6276 = var7;
                var5.field6272 = true;
                var5.field6265 = var8;
            } else {
                var5.method2642(var7, var8, class8.field80[arg2], arg1 + 10);
            }
        } else if (var4 == 2) {
            int var9 = arg0.method2464(4, 0);
            int var10 = var5.field2163[0];
            int var11 = var5.field2159[0];
            if (var9 == 0) {
                var10 -= 2;
                var11 -= 2;
            } else if (var9 == 1) {
                var11 -= 2;
                var10--;
            } else if (var9 == 2) {
                var11 -= 2;
            } else if (var9 == 3) {
                var10++;
                var11 -= 2;
            } else if (var9 == 4) {
                var10 += 2;
                var11 -= 2;
            } else if (var9 == 5) {
                var11--;
                var10 -= 2;
            } else if (var9 == 6) {
                var11--;
                var10 += 2;
            } else if (var9 == 7) {
                var10 -= 2;
            } else if (var9 == 8) {
                var10 += 2;
            } else if (var9 == 9) {
                var10 -= 2;
                var11++;
            } else if (var9 == 10) {
                var10 += 2;
                var11++;
            } else if (var9 == 11) {
                var11 += 2;
                var10 -= 2;
            } else if (var9 == 12) {
                var11 += 2;
                var10--;
            } else if (var9 == 13) {
                var11 += 2;
            } else if (var9 == 14) {
                var11 += 2;
                var10++;
            } else if (var9 == 15) {
                var10 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field6276 = var10;
                var5.field6272 = true;
                var5.field6265 = var11;
            } else {
                var5.method2642(var10, var11, class8.field80[arg2], 12);
            }
        } else {
            int var12 = arg0.method2464(1, 0);
            if (var12 == 0) {
                int var13 = arg0.method2464(12, 0);
                int var14 = var13 >> 10;
                int var15 = (var13 & 0x3E2) >> 5;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var13 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var5.field2163[0] + var15;
                int var18 = var5.field2159[0] + var16;
                if (var3) {
                    var5.field6265 = var18;
                    var5.field6272 = true;
                    var5.field6276 = var17;
                } else {
                    var5.method2642(var17, var18, class8.field80[arg2], arg1 + 10);
                }
                var5.field4319 = (byte) (var5.field4319 + var14 & 0x3);
                if (class295.field4273 == arg2) {
                    class29.field394 = var5.field4319;
                }
            } else {
                int var19 = arg0.method2464(30, 0);
                int var20 = var19 >> 28;
                int var21 = var19 >> 14 & 0x3FFF;
                int var22 = var19 & 0x3FFF;
                int var23 = (var5.field2163[0] + var21 + class240.field3602 & 0x3FFF) - class240.field3602;
                int var24 = (var5.field2159[0] + class360.field5180 + var22 & 0x3FFF) - class360.field5180;
                if (var3) {
                    var5.field6265 = var24;
                    var5.field6276 = var23;
                    var5.field6272 = true;
                } else {
                    var5.method2642(var23, var24, class8.field80[arg2], 12);
                }
                var5.field4319 = (byte) (var5.field4319 + var20 & 0x3);
                if (class295.field4273 == arg2) {
                    class29.field394 = var5.field4319;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILqo;)Z")
    public static final boolean method741(int arg0, class19 arg1) {
        field1510++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field226) {
            return false;
        } else if (arg0 != 31) {
            return true;
        } else if (!arg1.method129((byte) 94, class395.field5602)) {
            return false;
        } else if (class201.field2962.method2761((long) arg1.field266, (byte) -112) == null) {
            return class28.field380.method2761((long) arg1.field238, (byte) -112) == null;
        } else {
            return false;
        }
    }
}
