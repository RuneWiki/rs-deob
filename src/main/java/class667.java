import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class667 {

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public int field9375;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Z")
    public boolean field9361;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Z")
    public boolean field9372;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "[S")
    public short[] field9376;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    private int field9377;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public int field9380;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field9373 = 0;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "[Lkt;")
    public static class160[] field9379 = new class160[16];

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    private int field9365;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    private int field9367;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    private int field9368;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    private int field9370;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field9371;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field9378;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "Llaa;")
    public class123 field9381;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[Lcu;")
    public static class222[] field9364;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method3751(int arg0, int arg1, int arg2) {
        field9363++;
        if (arg0 != -1) {
            field9379 = null;
        }
        return (arg2 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 19)
    private final void method3752(int arg0) {
        int var2 = this.field9380;
        if (var2 == 2) {
            this.field9367 = 1;
            this.field9368 = 2048;
            this.field9365 = 0;
            this.field9370 = 2048;
        } else if (var2 == 3) {
            this.field9367 = 1;
            this.field9365 = 0;
            this.field9368 = 2048;
            this.field9370 = 4096;
        } else if (var2 == 4) {
            this.field9367 = 4;
            this.field9368 = 2048;
            this.field9365 = 0;
            this.field9370 = 2048;
        } else if (var2 == 5) {
            this.field9370 = 8192;
            this.field9368 = 2048;
            this.field9365 = 0;
            this.field9367 = 4;
        } else if (var2 == 12) {
            this.field9367 = 2;
            this.field9365 = 0;
            this.field9370 = 2048;
            this.field9368 = 2048;
        } else if (var2 == 13) {
            this.field9365 = 0;
            this.field9368 = 2048;
            this.field9370 = 8192;
            this.field9367 = 2;
        } else if (var2 == 10) {
            this.field9368 = 512;
            this.field9365 = 1536;
            this.field9370 = 2048;
            this.field9367 = 3;
        } else if (var2 == 11) {
            this.field9368 = 512;
            this.field9365 = 1536;
            this.field9367 = 3;
            this.field9370 = 4096;
        } else if (var2 == 6) {
            this.field9367 = 3;
            this.field9368 = 768;
            this.field9365 = 1280;
            this.field9370 = 2048;
        } else if (var2 == 7) {
            this.field9368 = 768;
            this.field9367 = 3;
            this.field9370 = 4096;
            this.field9365 = 1280;
        } else if (var2 == 8) {
            this.field9368 = 1024;
            this.field9365 = 1024;
            this.field9367 = 3;
            this.field9370 = 2048;
        } else if (var2 == 9) {
            this.field9365 = 1024;
            this.field9368 = 1024;
            this.field9370 = 4096;
            this.field9367 = 3;
        } else if (var2 == 14) {
            this.field9367 = 1;
            this.field9370 = 2048;
            this.field9368 = 768;
            this.field9365 = 1280;
        } else if (var2 == 15) {
            this.field9365 = 1536;
            this.field9370 = 4096;
            this.field9368 = 512;
            this.field9367 = 1;
        } else if (var2 == 16) {
            this.field9368 = 256;
            this.field9367 = 1;
            this.field9365 = 1792;
            this.field9370 = 8192;
        } else {
            this.field9365 = 0;
            this.field9368 = 2048;
            this.field9370 = 2048;
            this.field9367 = 0;
        }
        field9374++;
        int var3 = 11 / ((arg0 - 77) / 46);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;ZIILjava/lang/String;ZZ)V", line = 215)
    public static final void method3753(String arg0, boolean arg1, int arg2, int arg3, String arg4, boolean arg5, boolean arg6) {
        field9378++;
        class560.field7904.field7631 = 1;
        String var7 = arg0.toLowerCase();
        if (!arg6) {
            method3757(true);
        }
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg3 != -1) {
            class242 var11 = class513.field7206.method791((byte) 57, arg3);
            if (var11 == null || arg1 != var11.method1515(115)) {
                return;
            }
            if (var11.method1515(115)) {
                var10 = var11.field3131;
            } else {
                var9 = var11.field3137;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class21.field381.field3322; var13++) {
            class639 var16 = class21.field381.method1583(-118, var13);
            if ((!arg5 || var16.field8869) && var16.field8879 == -1 && var16.field8833 == -1 && var16.field8846 == 0 && var16.field8881.toLowerCase().indexOf(var7) != -1) {
                if (arg3 != -1) {
                    if (arg1) {
                        if (!arg4.equals(var16.method3584(var10, arg3, -35))) {
                            continue;
                        }
                    } else if (var16.method3594(120, arg3, var9) != arg2) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class9.field129 = null;
                    class677.field9467 = -1;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class425.field5710 = 0;
        class9.field129 = var8;
        class677.field9467 = var12;
        String[] var14 = new String[class677.field9467];
        for (int var15 = 0; var15 < class677.field9467; var15++) {
            var14[var15] = class21.field381.method1583(122, var8[var15]).field8881;
        }
        class424.method2427(var14, class9.field129, 0);
        class560.field7904.method3163(-22);
        class560.field7904.field7631 = 2;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILha;IIII)V", line = 332)
    private final void method3754(int arg0, int arg1, class60 arg2, int arg3, int arg4, int arg5, int arg6) {
        field9362++;
        int var8 = -112 / ((20 - arg4) / 59);
        this.field9381 = arg2.method471(arg3, arg1, arg0, arg5, arg6, 1.0F);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)V", line = 344)
    public final void method3755(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9369++;
        this.field9367 = arg3;
        this.field9365 = arg0;
        this.field9368 = arg1;
        if (arg4 != -19781) {
            field9373 = -85;
        }
        this.field9370 = arg2;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIZ)V", line = 361)
    public final void method3756(int arg0, int arg1, boolean arg2) {
        field9366++;
        int var6;
        if (arg2) {
            var6 = 2048;
        } else {
            int var4 = this.field9370 * arg1 / 50 + this.field9377 & 0x7FF;
            int var5 = this.field9367;
            if (var5 == 1) {
                var6 = (class16.field320[var4 << 3] >> 4) + 1024;
            } else if (var5 == 3) {
                var6 = class533.field7401[var4] >> 1;
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
        if (arg0 < -106) {
            this.field9381.method941((float) (this.field9365 + (this.field9368 * var6 >> 11)) / 2048.0F, 34168);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V", line = 447)
    public static void method3757(boolean arg0) {
        if (!arg0) {
            method3753(null, true, 34, -5, null, true, true);
        }
        field9364 = null;
        field9379 = null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 467)
    protected class667() {
        if (class533.field7401 == null) {
            class719.method4019(123);
        }
        this.method3752(125);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lha;Lsl;I)V", line = 478)
    public class667(class60 arg0, class461 arg1, int arg2) {
        if (class533.field7401 == null) {
            class719.method4019(126);
        }
        this.field9375 = arg1.method2600((byte) -123);
        this.field9361 = (this.field9375 & 0x10) != 0;
        this.field9372 = (this.field9375 & 0x8) != 0;
        this.field9375 &= 0x7;
        int var4 = arg1.method2566(-2) << arg2;
        int var5 = arg1.method2566(-2) << arg2;
        int var6 = arg1.method2566(-2) << arg2;
        int var7 = arg1.method2600((byte) -127);
        int var8 = var7 * 2 + 1;
        this.field9376 = new short[var8];
        for (int var9 = 0; var9 < this.field9376.length; var9++) {
            short var13 = (short) arg1.method2566(-2);
            int var14 = var13 >>> 8;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var15 > var8 - var14) {
                var15 = var8 - var14;
            }
            this.field9376[var9] = (short) class683.method3840(var15, var14 << 8);
        }
        int var10 = (var7 << class480.field6531) + class139.field1991;
        int var11 = class267.field3365 == null ? class22.field415[class693.method3882(arg1.method2566(-2), 63) & 0xFFFF] : class267.field3365[arg1.method2566(-2)];
        int var12 = arg1.method2600((byte) -126);
        this.field9377 = (var12 & 0xE0) << 3;
        this.field9380 = var12 & 0x1F;
        if (this.field9380 != 31) {
            this.method3752(123);
        }
        this.method3754(var5, var6, arg0, var4, 87, var10, var11);
    }
}
