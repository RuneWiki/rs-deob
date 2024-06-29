import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class597 {

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
    public int field8612;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "Z")
    public boolean field8610;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "Z")
    public boolean field8607;

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "[S")
    public short[] field8611;

    @OriginalMember(owner = "client!dda", name = "s", descriptor = "I")
    private int field8623;

    @OriginalMember(owner = "client!dda", name = "n", descriptor = "I")
    public int field8618;

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "[C")
    public static char[] field8617 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "I")
    public static int field8605;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
    public static int field8606;

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "I")
    private int field8613;

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "I")
    private int field8615;

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!dda", name = "o", descriptor = "I")
    private int field8619;

    @OriginalMember(owner = "client!dda", name = "p", descriptor = "I")
    private int field8620;

    @OriginalMember(owner = "client!dda", name = "r", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "Lth;")
    public static class266 field8614;

    @OriginalMember(owner = "client!dda", name = "q", descriptor = "Lww;")
    public class592 field8621;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZII)V")
    public final void method3434(boolean arg0, int arg1, int arg2) {
        field8606++;
        int var6;
        if (arg0) {
            var6 = 2048;
        } else {
            int var4 = this.field8619 * arg1 / 50 + this.field8623 & 0x7FF;
            int var5 = this.field8613;
            if (var5 == 1) {
                var6 = (class310.field3966[var4 << 3] >> 4) + 1024;
            } else if (var5 == 3) {
                var6 = class379.field5297[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        if (arg2 <= -8) {
            this.field8621.method557((byte) 106, (float) ((this.field8615 * var6 >> 11) + this.field8620) / 2048.0F);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIB)V")
    public final void method3435(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field8620 = arg0;
        this.field8615 = arg2;
        if (arg4 <= 120) {
            this.field8607 = true;
        }
        field8622++;
        this.field8613 = arg1;
        this.field8619 = arg3;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)V")
    public static void method3436(byte arg0) {
        if (arg0 < 77) {
            method3436((byte) -6);
        }
        field8614 = null;
        field8617 = null;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIILqa;IZI)V")
    private final void method3437(int arg0, int arg1, int arg2, class167 arg3, int arg4, boolean arg5, int arg6) {
        field8608++;
        this.field8621 = arg3.method955(arg1, arg2, arg4, arg0, arg6, 1.0F);
        if (arg5) {
            this.field8615 = -78;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(BI)V")
    public static final void method3438(byte arg0, int arg1) {
        field8616++;
        if (class630.field9188 == arg1) {
            return;
        }
        if (class630.field9188 == 0) {
            class623.method3595(53);
        }
        if (arg1 == 12) {
            if (class207.field2685 == null) {
                class28.method166((byte) 12, class111.field1441, class419.field5730, class626.field9101);
            } else {
                class313.method1899(arg0 - 121, class419.field5730);
            }
        }
        if (arg1 != 12 && class367.field5125 != null) {
            class367.field5125.method3271((byte) 110);
            class367.field5125 = null;
        }
        if (arg1 == 2) {
            class119.method653(arg0 - 124, class624.field9036 != class126.field1565);
        }
        if (arg1 == 6) {
            class582.method3293(0, class126.field1565 != class120.field1526);
        }
        if (arg1 == 4) {
            if (class207.field2685 == null) {
                class29.method176(class111.field1441, -788, class626.field9101);
            } else {
                class639.method3678((byte) 125);
            }
        } else if (arg1 == 5) {
            if (class207.field2685 == null) {
                class28.method166((byte) 116, class111.field1441, class419.field5730, class626.field9101);
            } else {
                class313.method1899(3, class419.field5730);
            }
        } else if (arg1 == 8) {
            if (class207.field2685 == null) {
                class28.method166((byte) 65, class111.field1441, class419.field5730, class626.field9101);
            } else {
                class313.method1899(3, class419.field5730);
            }
        } else if (arg1 == 11) {
            if (class207.field2685 == null) {
                class29.method176(class111.field1441, -788, class626.field9101);
            } else {
                class639.method3678((byte) 125);
            }
        }
        if (class611.method3489(arg0 ^ 0xFF83, class630.field9188)) {
            class544.field7588.field4528 = 2;
            class136.field1666.field4528 = 2;
            class193.field2508.field4528 = 2;
            class239.field3056.field4528 = 2;
            class98.field1317.field4528 = 2;
            class558.field7809.field4528 = 2;
            class431.field5876.field4528 = 2;
        }
        if (class611.method3489(65535, arg1)) {
            class235.field3005 = 0;
            class163.field2068 = 1;
            class463.field6591 = 1;
            class440.field5995 = 0;
            class383.field5355 = 0;
            class207.method1319(arg0 ^ 0x3C, true);
            class544.field7588.field4528 = 1;
            class136.field1666.field4528 = 1;
            class193.field2508.field4528 = 1;
            class239.field3056.field4528 = 1;
            class98.field1317.field4528 = 1;
            class558.field7809.field4528 = 1;
            class431.field5876.field4528 = 1;
        }
        if (arg1 == 10 || arg1 == 2) {
            class447.method2598(true);
        }
        if (arg1 == 1) {
            class36.method218((byte) -98, class301.field3918, class24.field433);
        } else {
            class192.method1233(-100);
        }
        if (arg0 != 124) {
            field8617 = null;
        }
        boolean var2 = arg1 == 1 || class76.method438(arg1, 115) || class23.method136(false, arg1);
        boolean var3 = class630.field9188 == 1 || class76.method438(class630.field9188, 112) || class23.method136(false, class630.field9188);
        if (var2 != var3) {
            if (var2) {
                class325.field4460 = class103.field1359;
                if (class501.field6954.field7851 == 0) {
                    client.method3573(2, 48);
                } else {
                    class247.method1518((byte) 84, 0, class103.field1359, 2, false, class501.field6954.field7851, class251.field3143);
                }
                class488.field6797.method738(false, -2);
            } else {
                client.method3573(2, 37);
                class488.field6797.method738(true, -2);
            }
        }
        if (class611.method3489(65535, arg1) || arg1 == 12) {
            class301.field3918.method936();
        }
        class630.field9188 = arg1;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
    private final void method3439(int arg0) {
        field8609++;
        int var2 = this.field8618;
        if (var2 == 2) {
            this.field8620 = 0;
            this.field8615 = 2048;
            this.field8619 = 2048;
            this.field8613 = 1;
        } else if (var2 == 3) {
            this.field8620 = 0;
            this.field8613 = 1;
            this.field8619 = 4096;
            this.field8615 = 2048;
        } else if (var2 == 4) {
            this.field8615 = 2048;
            this.field8619 = 2048;
            this.field8613 = 4;
            this.field8620 = 0;
        } else if (var2 == 5) {
            this.field8620 = 0;
            this.field8615 = 2048;
            this.field8613 = 4;
            this.field8619 = 8192;
        } else if (var2 == 12) {
            this.field8620 = 0;
            this.field8615 = 2048;
            this.field8619 = 2048;
            this.field8613 = 2;
        } else if (var2 == 13) {
            this.field8619 = 8192;
            this.field8615 = 2048;
            this.field8620 = 0;
            this.field8613 = 2;
        } else if (var2 == 10) {
            this.field8615 = 512;
            this.field8620 = 1536;
            this.field8613 = 3;
            this.field8619 = 2048;
        } else if (var2 == 11) {
            this.field8615 = 512;
            this.field8620 = 1536;
            this.field8613 = 3;
            this.field8619 = 4096;
        } else if (var2 == 6) {
            this.field8619 = 2048;
            this.field8613 = 3;
            this.field8620 = 1280;
            this.field8615 = 768;
        } else if (var2 == 7) {
            this.field8613 = 3;
            this.field8620 = 1280;
            this.field8619 = 4096;
            this.field8615 = 768;
        } else if (var2 == 8) {
            this.field8619 = 2048;
            this.field8615 = 1024;
            this.field8613 = 3;
            this.field8620 = 1024;
        } else if (var2 == 9) {
            this.field8620 = 1024;
            this.field8615 = 1024;
            this.field8619 = 4096;
            this.field8613 = 3;
        } else if (var2 == 14) {
            this.field8615 = 768;
            this.field8613 = 1;
            this.field8620 = 1280;
            this.field8619 = 2048;
        } else if (var2 == 15) {
            this.field8619 = 4096;
            this.field8620 = 1536;
            this.field8613 = 1;
            this.field8615 = 512;
        } else if (var2 == 16) {
            this.field8620 = 1792;
            this.field8613 = 1;
            this.field8619 = 8192;
            this.field8615 = 256;
        } else {
            this.field8613 = 0;
            this.field8619 = 2048;
            this.field8620 = 0;
            this.field8615 = 2048;
        }
        if (arg0 <= 116) {
            this.field8621 = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(BII)Z")
    public static final boolean method3440(byte arg0, int arg1, int arg2) {
        field8605++;
        if (arg0 < 67) {
            method3436((byte) -50);
        }
        return (arg1 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "()V")
    protected class597() {
        if (class379.field5297 == null) {
            class76.method437((byte) -118);
        }
        this.method3439(117);
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lqa;Lge;I)V")
    public class597(class167 arg0, class551 arg1, int arg2) {
        if (class379.field5297 == null) {
            class76.method437((byte) -112);
        }
        this.field8612 = arg1.method3045(-126);
        this.field8610 = (this.field8612 & 0x8) != 0;
        this.field8607 = (this.field8612 & 0x10) != 0;
        this.field8612 &= 0x7;
        int var4 = arg1.method3090(-117) << arg2;
        int var5 = arg1.method3090(-104) << arg2;
        int var6 = arg1.method3090(-105) << arg2;
        int var7 = arg1.method3045(-126);
        int var8 = var7 * 2 + 1;
        this.field8611 = new short[var8];
        for (int var9 = 0; var9 < this.field8611.length; var9++) {
            short var13 = (short) arg1.method3090(-108);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field8611[var9] = (short) class292.method1790(var14 << 8, var15);
        }
        int var10 = (var7 << class400.field5480) + class337.field4699;
        int var11 = class190.field2453 == null ? class351.field4940[class433.method2528(arg1.method3090(-73), 15048) & 0xFFFF] : class190.field2453[arg1.method3090(-87)];
        int var12 = arg1.method3045(-128);
        this.field8623 = var12 & 0xE0 << 3;
        this.field8618 = var12 & 0x1F;
        if (this.field8618 != 31) {
            this.method3439(117);
        }
        this.method3437(var10, var4, var6, arg0, var5, false, var11);
    }
}
