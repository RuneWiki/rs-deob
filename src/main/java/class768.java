import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class768 {

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "Lsv;")
    public static class570 field10602 = new class570(80, 12);

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "Lin;")
    public static class380 field10603 = new class380(108, -1);

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "Lbw;")
    public static class29 field10604 = new class29(128);

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field10601;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILkja;I)V")
    public static final void method4245(int arg0, class373 arg1, int arg2) {
        field10601++;
        boolean var3 = arg1.method2222(8, 1) == 1;
        if (var3) {
            class125.field2148[class518.field7114++] = arg2;
        }
        int var4 = arg1.method2222(8, 2);
        class21 var5 = class588.field8451[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field218 = false;
            } else if (class541.field7492 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class138 var6 = class197.field2970[arg2] = new class138();
                var6.field2279 = (var5.field10361 << 28) + (var5.field4136[0] + class697.field9798 >> 6) + (var5.field4142[0] + class222.field3266 >> 6 << 14);
                if (var5.field211 == -1) {
                    var6.field2287 = var5.field4067.method1856(0);
                } else {
                    var6.field2287 = var5.field211;
                }
                var6.field2284 = var5.field4054;
                var6.field2280 = var5.field215;
                var6.field2283 = var5.field206;
                if (var5.field233 > 0) {
                    class148.method1168((byte) 105, var5);
                }
                class588.field8451[arg2] = null;
                if (arg1.method2222(8, 1) != 0) {
                    class228.method1544(arg0 - 147233607, arg1, arg2);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg1.method2222(arg0 ^ 0x8C69C4E, 3);
            int var8 = var5.field4142[0];
            int var9 = var5.field4136[0];
            if (var7 == 0) {
                var9--;
                var8--;
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
                var5.field247 = var9;
                var5.field218 = true;
                var5.field210 = var8;
            } else {
                var5.method188(var9, class279.field4025[arg2], var8, (byte) 126);
            }
        } else if (var4 == 2) {
            int var10 = arg1.method2222(arg0 ^ 0x8C69C4E, 4);
            int var11 = var5.field4142[0];
            int var12 = var5.field4136[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
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
                var5.field218 = true;
                var5.field247 = var12;
                var5.field210 = var11;
            } else {
                var5.method188(var12, class279.field4025[arg2], var11, (byte) -110);
            }
        } else {
            int var13 = arg1.method2222(8, 1);
            if (var13 == 0) {
                int var14 = arg1.method2222(8, 12);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3F7) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field4142[0] + var16;
                int var19 = var5.field4136[0] + var17;
                if (var3) {
                    var5.field247 = var19;
                    var5.field218 = true;
                    var5.field210 = var18;
                } else {
                    var5.method188(var19, class279.field4025[arg2], var18, (byte) 83);
                }
                var5.field10361 = var5.field10349 = (byte) (var5.field10361 + var15 & 0x3);
                if (class717.method3994(32281, var18, var19)) {
                    var5.field10349++;
                }
                if (class541.field7492 == arg2) {
                    if (class403.field5560 != var5.field10361) {
                        class87.field1297 = true;
                    }
                    class403.field5560 = var5.field10361;
                }
            } else {
                int var20 = arg1.method2222(8, 30);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field4142[0] + class222.field3266 + var22 & 0x3FFF) - class222.field3266;
                int var25 = (var5.field4136[0] + var23 + class697.field9798 & 0x3FFF) - class697.field9798;
                if (arg0 != 147233862) {
                    method4246(1);
                }
                if (var3) {
                    var5.field210 = var24;
                    var5.field247 = var25;
                    var5.field218 = true;
                } else {
                    var5.method188(var25, class279.field4025[arg2], var24, (byte) -120);
                }
                var5.field10361 = var5.field10349 = (byte) (var5.field10361 + var21 & 0x3);
                if (class717.method3994(32281, var24, var25)) {
                    var5.field10349++;
                }
                if (class541.field7492 == arg2) {
                    class403.field5560 = var5.field10361;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public static void method4246(int arg0) {
        field10604 = null;
        field10602 = null;
        field10603 = null;
        if (arg0 != 1) {
            field10604 = null;
        }
    }
}
