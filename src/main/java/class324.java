import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public abstract class class324 extends class107 {

    @OriginalMember(owner = "client!dja", name = "z", descriptor = "I")
    public int field4550;

    @OriginalMember(owner = "client!dja", name = "y", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!dja", name = "A", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(ILmea;ILha;I)V")
    public static final void method2084(int arg0, class451 arg1, int arg2, class65 arg3, int arg4) {
        field4549++;
        class511 var5 = arg1.method2685(arg3, (byte) -102);
        if (var5 == null) {
            return;
        }
        arg3.method434(arg2, arg0, arg1.field6290 + arg2, arg1.field6288 + arg0);
        if (class760.field10484 == 2 || class760.field10484 == 5 || class779.field10693 == null) {
            arg3.method490(-16777216, var5, arg2, arg0);
        } else {
            int var6;
            int var7;
            int var8;
            int var9;
            if (class416.field5704 == 4) {
                var8 = (int) (-class758.field10460) & 0x3FFF;
                var7 = 4096;
                var6 = class207.field3211;
                var9 = class574.field8093;
            } else {
                var6 = class210.field3250.field5746;
                var7 = 4096 - (class347.field4853 * 16);
                var8 = (int) (-class758.field10460) + class29.field416 & 0x3FFF;
                var9 = class210.field3250.field5742;
            }
            int var10 = (var9 / 128) + 48 - ((class768.field10571 - 104) * 2);
            int var11 = class350.field4898 * 4 + 208 + 48 - (var6 / 128 + (class350.field4898 * 2));
            class779.field10693.method1611((float) arg1.field6290 / 2.0F + (float) arg2, (float) arg1.field6288 / 2.0F + (float) arg0, (float) var10, (float) var11, var7, var8 << 2, var5, arg2, arg0);
            for (class489 var12 = (class489) class174.field2692.method1731((byte) -114); var12 != null; var12 = (class489) class174.field2692.method1724(0)) {
                int var58 = var12.field6926;
                int var59 = ((class161.field2550.field8880[var58] & 0xFFFCDF3) >> 14) - class124.field1922;
                int var60 = (class161.field2550.field8880[var58] & 0x3FFF) - class88.field999;
                int var61 = var59 * 4 + 2 - var9 / 128;
                int var62 = var60 * 4 + 2 - (var6 / 128);
                class212.method1458((byte) 36, arg2, var5, arg0, var61, var62, class161.field2550.field8883[var58], arg1, arg3);
            }
            for (int var13 = 0; var13 < class11.field213; var13++) {
                int var55 = class444.field6045[var13] * 4 + 2 - (var9 / 128);
                int var56 = class481.field6763[var13] * 4 + 2 - (var6 / 128);
                class282 var57 = class277.field4038.method3919(true, class109.field1605[var13]);
                if (var57.field4117 != null) {
                    var57 = var57.method1826(class537.field7727, -128);
                    if (var57 == null || var57.field4093 == -1) {
                        continue;
                    }
                }
                class212.method1458((byte) 77, arg2, var5, arg0, var55, var56, var57.field4093, arg1, arg3);
            }
            for (class102 var14 = (class102) class250.field3692.method2243((byte) 100); var14 != null; var14 = (class102) class250.field3692.method2248(-15690)) {
                int var50 = (int) (var14.field8133 >> 28 & 0x3L);
                if (class524.field7398 == var50) {
                    int var51 = (int) (var14.field8133 & 0x3FFFL) - class124.field1922;
                    int var52 = (int) (var14.field8133 >> 14 & 0x3FFFL) - class88.field999;
                    int var53 = var51 * 4 + 2 - (var9 / 128);
                    int var54 = var52 * 4 + 2 - (var6 / 128);
                    class554.method3296(arg2, arg1, var53, -28909, class578.field8145[0], var5, var54, arg0);
                }
            }
            for (int var15 = 0; var15 < class235.field3545; var15++) {
                class205 var45 = (class205) class645.field9014.method2242((long) class216.field3356[var15], arg4 - 30781);
                if (var45 != null) {
                    class665 var46 = var45.field3181;
                    if (var46.method3787(255) && class210.field3250.field5755 == var46.field5755) {
                        class110 var47 = var46.field9240;
                        if (var47 != null && var47.field1657 != null) {
                            var47 = var47.method840(class537.field7727, arg4 - 30695);
                        }
                        if (var47 != null && var47.field1658 && var47.field1662) {
                            int var48 = var46.field5742 / 128 - (var9 / 128);
                            int var49 = var46.field5746 / 128 - (var6 / 128);
                            if (var47.field1624 == -1) {
                                class554.method3296(arg2, arg1, var48, -28909, class578.field8145[1], var5, var49, arg0);
                            } else {
                                class212.method1458((byte) 90, arg2, var5, arg0, var48, var49, var47.field1624, arg1, arg3);
                            }
                        }
                    }
                }
            }
            int var16 = class514.field7278;
            int[] var17 = class522.field7381;
            for (int var18 = 0; var18 < var16; var18++) {
                class702 var37 = class767.field10560[var17[var18]];
                if (var37 != null && var37.method3974(arg4 - 30525) && !var37.field9770 && class210.field3250 != var37 && class210.field3250.field5755 == var37.field5755) {
                    int var38 = var37.field5742 / 128 - (var9 / 128);
                    int var39 = var37.field5746 / 128 - var6 / 128;
                    boolean var40 = false;
                    for (int var41 = 0; var41 < class22.field365; var41++) {
                        if (var37.field9768.equals(class440.field5967[var41]) && class207.field3210[var41] != 0) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var42 = false;
                    for (int var43 = 0; var43 < class187.field2886; var43++) {
                        if (var37.field9768.equals(class762.field10501[var43].field4762)) {
                            var42 = true;
                            break;
                        }
                    }
                    boolean var44 = false;
                    if (class210.field3250.field9769 != 0 && var37.field9769 != 0 && class210.field3250.field9769 == var37.field9769) {
                        var44 = true;
                    }
                    if (var37.field9767) {
                        class554.method3296(arg2, arg1, var38, -28909, class578.field8145[6], var5, var39, arg0);
                    } else if (var44) {
                        class554.method3296(arg2, arg1, var38, -28909, class578.field8145[4], var5, var39, arg0);
                    } else if (var37.field9777) {
                        class554.method3296(arg2, arg1, var38, -28909, class578.field8145[7], var5, var39, arg0);
                    } else if (var40) {
                        class554.method3296(arg2, arg1, var38, -28909, class578.field8145[3], var5, var39, arg0);
                    } else if (var42) {
                        class554.method3296(arg2, arg1, var38, -28909, class578.field8145[5], var5, var39, arg0);
                    } else {
                        class554.method3296(arg2, arg1, var38, -28909, class578.field8145[2], var5, var39, arg0);
                    }
                }
            }
            class589[] var19 = class693.field9665;
            for (int var20 = 0; var20 < var19.length; var20++) {
                class589 var23 = var19[var20];
                if (var23 != null && var23.field8302 != 0 && (class192.field2961 % 20) < 10) {
                    if (var23.field8302 == 1) {
                        class205 var24 = (class205) class645.field9014.method2242((long) var23.field8307, arg4 ^ 0xFFFF87C3);
                        if (var24 != null) {
                            class665 var25 = var24.field3181;
                            int var26 = var25.field5742 / 128 - (var9 / 128);
                            int var27 = var25.field5746 / 128 - (var6 / 128);
                            class25.method239(var27, -108, var5, var23.field8300, var26, arg1, arg2, arg0, 360000L);
                        }
                    }
                    if (var23.field8302 == 2) {
                        int var28 = var23.field8311 / 128 - (var9 / 128);
                        int var29 = var23.field8309 / 128 - (var6 / 128);
                        long var30 = (long) (var23.field8301 << 7);
                        long var32 = var30 * var30;
                        class25.method239(var29, -90, var5, var23.field8300, var28, arg1, arg2, arg0, var32);
                    }
                    if (var23.field8302 == 10 && var23.field8307 >= 0 && class767.field10560.length > var23.field8307) {
                        class702 var34 = class767.field10560[var23.field8307];
                        if (var34 != null) {
                            int var35 = var34.field5742 / 128 - (var9 / 128);
                            int var36 = var34.field5746 / 128 - (var6 / 128);
                            class25.method239(var36, arg4 ^ 0xFFFF87B6, var5, var23.field8300, var35, arg1, arg2, arg0, 360000L);
                        }
                    }
                }
            }
            if (class416.field5704 != 4) {
                if (class779.field10695 != 0) {
                    int var21 = class779.field10695 * 4 + class210.field3250.method2102(true) * 2 + 2 - (var9 / 128) - 2;
                    int var22 = class530.field7675 * 4 + ((class210.field3250.method2102(true) * 2) + 2 - var6 / 128 - 2);
                    class554.method3296(arg2, arg1, var21, -28909, class530.field7673[class416.field5701 ? 1 : 0], var5, var22, arg0);
                }
                if (!class210.field3250.field9770) {
                    arg3.method436(arg1.field6290 / 2 + arg2 - 1, 3, -1, arg0 + (arg1.field6288 / 2) - 1, true, 3);
                }
            }
        }
        if (arg4 == 30780) {
            ;
        }
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)Z")
    public abstract boolean method939(int arg0);

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(IBII)I")
    public static final int method2085(int arg0, byte arg1, int arg2, int arg3) {
        field4551++;
        int var4 = ((arg2 & 0xFF00FF) * arg0 & 0xFF00FF00 | (arg2 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
        if (arg1 == -45) {
            int var5 = 255 - arg0;
            return (((arg3 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg3 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
        } else {
            return -128;
        }
    }

    @OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(I)V")
    public class324(int arg0) {
        this.field4550 = arg0;
    }

    @OriginalMember(owner = "client!dja", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method938(int arg0);
}
