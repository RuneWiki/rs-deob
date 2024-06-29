import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class220 {

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "[F")
    public float[] field3733 = new float[4];

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public int field3717;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "Z")
    public boolean field3738;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Z")
    public boolean field3720;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public int field3730;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public int field3734;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public int field3716;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "[S")
    public short[] field3728;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    public int field3741;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    private int field3725;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    private int field3735;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "Z")
    public static boolean field3729 = true;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field3724 = 0;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "Z")
    public static boolean field3719 = false;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Lcd;")
    private static class64 field3727 = class44.method335((byte) 71, "Continue");

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Lcd;")
    public static class64 field3723 = field3727;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "Lcd;")
    public static class64 field3747 = class44.method335((byte) 71, "Ausw-=hlen");

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    public static int field3736 = 0;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "F")
    public float field3722;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "F")
    public float field3739;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    private int field3718;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
    private int field3742;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "I")
    private int field3743;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    private int field3745;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "Llg;")
    public class116 field3721;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lfd;Z)V", line = 12)
    public static final void method1566(class232 arg0, boolean arg1) {
        field3731++;
        if (arg1) {
            return;
        }
        for (class246 var2 = (class246) class115.field2115.method778(0); var2 != null; var2 = (class246) class115.field2115.method775(26517)) {
            if (var2.field4289 == arg0) {
                if (var2.field4283 != null) {
                    class250.field4341.method1419(var2.field4283);
                    var2.field4283 = null;
                }
                var2.method232(128);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZII)V", line = 47)
    public final void method1567(boolean arg0, int arg1, int arg2) {
        field3737++;
        int var4 = this.field3742 * arg2 / 50 + this.field3725 & 0x7FF;
        int var5 = this.field3745;
        int var6;
        if (var5 == 1) {
            var6 = (class50.field826[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class12.field234[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg0) {
            var6 = 2048;
        }
        this.field3739 = (float) ((this.field3743 * var6 >> 11) + this.field3718) / 2048.0F;
        float var7 = this.field3739 / 255.0F;
        this.field3733[0] = (float) (class224.method1614(this.field3741, 16774771) >> 16) * var7;
        this.field3733[2] = var7 * (float) class224.method1614(255, this.field3741);
        if (arg1 == 2048) {
            this.field3733[1] = (float) (class224.method1614(65464, this.field3741) >> 8) * var7;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIII)I", line = 124)
    public static final int method1568(int arg0, int arg1, int arg2, int arg3) {
        field3726++;
        if (arg3 < 36) {
            return -14;
        }
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg1;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 158)
    public static void method1569(int arg0) {
        field3727 = null;
        field3723 = null;
        if (arg0 != 2) {
            method1570((class195) null);
        }
        field3747 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Log;)V", line = 179)
    public static final void method1570(class195 arg0) {
        for (int var1 = arg0.field3313; var1 <= arg0.field3328; var1++) {
            for (int var2 = arg0.field3322; var2 <= arg0.field3323; var2++) {
                class295 var3 = class304.field5203[arg0.field3331][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field5075; var4++) {
                        if (var3.field5090[var4] == arg0) {
                            var3.field5075--;
                            for (int var5 = var4; var5 < var3.field5075; var5++) {
                                var3.field5090[var5] = var3.field5090[var5 + 1];
                                var3.field5076[var5] = var3.field5076[var5 + 1];
                            }
                            var3.field5090[var3.field5075] = null;
                            break;
                        }
                    }
                    var3.field5082 = 0;
                    for (int var6 = 0; var6 < var3.field5075; var6++) {
                        var3.field5082 |= var3.field5076[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 251)
    public static final void method1571(byte arg0) {
        field3740++;
        class213 var1 = class29.field477;
        synchronized (class29.field477) {
            class27.field439 = class146.field2587;
            class43.field698++;
            if (class276.field4746 >= 0) {
                while (class276.field4746 != class199.field3414) {
                    int var2 = class61.field1189[class199.field3414];
                    class199.field3414 = class199.field3414 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class120.field2174[var2] = true;
                    } else {
                        class120.field2174[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class120.field2174[var3] = false;
                }
                class276.field4746 = class199.field3414;
            }
            if (arg0 < -38) {
                class146.field2587 = class35.field576;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V", line = 294)
    private final void method1572(byte arg0) {
        field3746++;
        int var2 = -80 % ((45 - arg0) / 57);
        int var3 = (this.field3716 << 7) + 64;
        this.field3722 = 1.0F / (float) (var3 * var3);
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 520)
    protected class220() {
        if (class12.field234 == null) {
            class190.method1344((byte) 46);
        }
        this.method1573(-105);
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lkh;)V", line = 531)
    public class220(class13 arg0) {
        if (class12.field234 == null) {
            class190.method1344((byte) 46);
        }
        this.field3717 = arg0.method152((byte) -88);
        this.field3738 = (this.field3717 & 0x8) != 0;
        this.field3720 = (this.field3717 & 0x10) != 0;
        this.field3717 &= 0x7;
        this.field3730 = arg0.method112((byte) 92);
        this.field3734 = arg0.method112((byte) 92);
        this.field3744 = arg0.method112((byte) 92);
        this.field3716 = arg0.method152((byte) -92);
        this.method1572((byte) 103);
        this.field3728 = new short[this.field3716 * 2 + 1];
        for (int var2 = 0; var2 < this.field3728.length; var2++) {
            this.field3728[var2] = (short) arg0.method112((byte) 92);
        }
        this.field3741 = class50.field829[arg0.method112((byte) 92)];
        int var3 = arg0.method152((byte) -93);
        this.field3725 = var3 & 0xE0 << 3;
        this.field3735 = var3 & 0x1F;
        this.method1573(-84);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V", line = 313)
    private final void method1573(int arg0) {
        field3732++;
        int var2 = this.field3735;
        if (var2 == 2) {
            this.field3745 = 1;
            this.field3718 = 0;
            this.field3742 = 2048;
            this.field3743 = 2048;
        } else if (var2 == 3) {
            this.field3742 = 4096;
            this.field3743 = 2048;
            this.field3745 = 1;
            this.field3718 = 0;
        } else if (var2 == 4) {
            this.field3718 = 0;
            this.field3745 = 4;
            this.field3742 = 2048;
            this.field3743 = 2048;
        } else if (var2 == 5) {
            this.field3742 = 8192;
            this.field3743 = 2048;
            this.field3745 = 4;
            this.field3718 = 0;
        } else if (var2 == 12) {
            this.field3718 = 0;
            this.field3742 = 2048;
            this.field3743 = 2048;
            this.field3745 = 2;
        } else if (var2 == 13) {
            this.field3718 = 0;
            this.field3745 = 2;
            this.field3743 = 2048;
            this.field3742 = 8192;
        } else if (var2 == 10) {
            this.field3743 = 512;
            this.field3745 = 3;
            this.field3742 = 2048;
            this.field3718 = 1536;
        } else if (var2 == 11) {
            this.field3742 = 4096;
            this.field3743 = 512;
            this.field3745 = 3;
            this.field3718 = 1536;
        } else if (var2 == 6) {
            this.field3743 = 768;
            this.field3742 = 2048;
            this.field3745 = 3;
            this.field3718 = 1280;
        } else if (var2 == 7) {
            this.field3745 = 3;
            this.field3743 = 768;
            this.field3718 = 1280;
            this.field3742 = 4096;
        } else if (var2 == 8) {
            this.field3743 = 1024;
            this.field3742 = 2048;
            this.field3745 = 3;
            this.field3718 = 1024;
        } else if (var2 == 9) {
            this.field3745 = 3;
            this.field3742 = 4096;
            this.field3743 = 1024;
            this.field3718 = 1024;
        } else if (var2 == 14) {
            this.field3745 = 1;
            this.field3718 = 1280;
            this.field3743 = 768;
            this.field3742 = 2048;
        } else if (var2 == 15) {
            this.field3743 = 512;
            this.field3718 = 1536;
            this.field3745 = 1;
            this.field3742 = 4096;
        } else if (var2 == 16) {
            this.field3718 = 1792;
            this.field3742 = 8192;
            this.field3743 = 256;
            this.field3745 = 1;
        } else {
            this.field3742 = 2048;
            this.field3745 = 0;
            this.field3743 = 2048;
            this.field3718 = 0;
        }
        int var3 = -100 % ((-arg0 - 31) / 37);
    }
}
