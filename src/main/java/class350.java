import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class350 {

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    public int field4508 = -1;

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
    private int field4514 = 0;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "Z")
    public boolean field4512 = true;

    @OriginalMember(owner = "client!rq", name = "q", descriptor = "Z")
    public boolean field4517 = true;

    @OriginalMember(owner = "client!rq", name = "p", descriptor = "I")
    public int field4516 = 512;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public int field4502;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public int field4507;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
    public int field4513;

    @OriginalMember(owner = "client!rq", name = "o", descriptor = "I")
    public int field4515;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "Loh;")
    public static class404 field4510;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method2073(int arg0, int arg1, int arg2) {
        field4505++;
        if (arg1 == 0) {
            return (arg2 & 0x70000) != 0 | class54.method304(arg0, 0, arg2) || class713.method3987(arg2, arg1 ^ 0x78, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILig;)V", line = 20)
    public final void method2074(int arg0, class244 arg1) {
        field4503++;
        while (true) {
            int var3 = arg1.method1423(-82);
            if (var3 == 0) {
                if (arg0 == 8034) {
                    return;
                } else {
                    this.field4516 = 25;
                    return;
                }
            }
            this.method2078(var3, arg1, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V", line = 41)
    public static void method2075(byte arg0) {
        field4510 = null;
        int var1 = -63 % ((arg0 - 38) / 53);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIBIIII)V", line = 51)
    public static final void method2076(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class338.field4355 <= arg1 && class744.field10385 >= arg0 && arg6 >= class224.field2571 && arg4 <= class578.field8182) {
            if (arg3 == 1) {
                class162.method1002(arg0, arg6, arg1, arg4, (byte) 117, arg5);
            } else {
                class604.method3429(arg2 ^ 0xFFFFFFD1, arg4, arg0, arg1, arg6, arg5, arg3);
            }
        } else if (arg3 == 1) {
            class522.method3069(arg0, arg1, arg5, arg4, true, arg6);
        } else {
            class508.method3011(arg0, arg5, arg3, 0, arg6, arg1, arg4);
        }
        if (arg2 != -111) {
            field4510 = null;
        }
        field4504++;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;ZILjava/lang/String;)V", line = 88)
    public static final void method2077(int arg0, String arg1, boolean arg2, int arg3, String arg4) {
        field4501++;
        class15.method74(-1, arg1, arg0, true, arg4, (byte) 66, arg2);
        if (arg3 > -118) {
            method2077(22, null, true, 112, null);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILig;B)V", line = 108)
    private final void method2078(int arg0, class244 arg1, byte arg2) {
        field4506++;
        if (arg2 != -117) {
            this.method2079(124, 41);
        }
        if (arg0 == 1) {
            this.field4514 = arg1.method1458((byte) -110);
            this.method2079(this.field4514, arg2 + 114);
        } else if (arg0 == 2) {
            this.field4508 = arg1.method1476(88);
            if (this.field4508 == 65535) {
                this.field4508 = -1;
                return;
            }
        } else if (arg0 == 3) {
            this.field4516 = arg1.method1476(40) << 2;
            return;
        } else {
            if (arg0 == 4) {
                this.field4512 = false;
            } else if (arg0 == 5) {
                this.field4517 = false;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V", line = 149)
    private final void method2079(int arg0, int arg1) {
        field4509++;
        double var3 = (double) ((arg0 & 0xFFBA6A) >> 16) / 256.0D;
        int var5 = 102 / ((46 - arg1) / 40);
        double var6 = (double) ((arg0 & 0xFF54) >> 8) / 256.0D;
        double var8 = (double) (arg0 & 0xFF) / 256.0D;
        double var10 = var3;
        if (var6 < var3) {
            var10 = var6;
        }
        if (var8 < var10) {
            var10 = var8;
        }
        double var12 = var3;
        if (var3 < var6) {
            var12 = var6;
        }
        if (var12 < var8) {
            var12 = var8;
        }
        double var14 = 0.0D;
        double var16 = 0.0D;
        double var18 = (var10 + var12) / 2.0D;
        if (var10 != var12) {
            if (var18 < 0.5D) {
                var16 = (var12 - var10) / (var10 + var12);
            }
            if (var3 == var12) {
                var14 = (var6 - var8) / (var12 - var10);
            } else if (var6 == var12) {
                var14 = (var8 - var3) / (var12 - var10) + 2.0D;
            } else if (var8 == var12) {
                var14 = (var3 - var6) / (var12 - var10) + 4.0D;
            }
            if (var18 >= 0.5D) {
                var16 = (var12 - var10) / (2.0D - var12 - var10);
            }
        }
        this.field4513 = (int) (var18 * 256.0D);
        double var20 = var14 / 6.0D;
        this.field4502 = (int) (var16 * 256.0D);
        if (this.field4513 < 0) {
            this.field4513 = 0;
        } else if (this.field4513 > 255) {
            this.field4513 = 255;
        }
        if (var18 > 0.5D) {
            this.field4507 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field4507 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field4502 < 0) {
            this.field4502 = 0;
        } else if (this.field4502 > 255) {
            this.field4502 = 255;
        }
        if (this.field4507 < 1) {
            this.field4507 = 1;
        }
        this.field4515 = (int) ((double) this.field4507 * var20);
    }
}
