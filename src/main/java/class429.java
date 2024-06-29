import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class429 {

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public int field6440;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "Z")
    public boolean field6432;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Z")
    public boolean field6426;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "[S")
    public short[] field6431;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    private int field6434;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public int field6427;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    private int field6428;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    private int field6430;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    private int field6433;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    private int field6443;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "Lja;")
    public class450 field6429;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "Lfl;")
    public static class75 field6435;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILza;IIIII)V")
    private final void method2611(int arg0, class491 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6429 = arg1.method895(arg0, arg6, arg4, arg3, arg2, 1.0F);
        field6438++;
        if (arg5 >= -92) {
            method2613(91, -73, 67, 103, -121, null);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIZ)V")
    public final void method2612(int arg0, int arg1, boolean arg2) {
        field6437++;
        if (arg0 != -450135231) {
            this.method2614(-79, (byte) 17, -8, 27, -76);
        }
        int var6;
        if (arg2) {
            var6 = 2048;
        } else {
            int var4 = this.field6434 + (this.field6430 * arg1 / 50) & 0x7FF;
            int var5 = this.field6433;
            if (var5 == 1) {
                var6 = (class46.field757[var4 << 3] >> 5) + 1024;
            } else if (var5 == 3) {
                var6 = class159.field2554[var4] >> 1;
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
        this.field6429.method1109((float) ((this.field6443 * var6 >> 11) + this.field6428) / 2048.0F, (byte) -118);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII[B)V")
    public static final void method2613(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field6441++;
        if (arg0 >= arg1) {
            return;
        }
        int var6 = arg1 - arg0 >> 2;
        int var7 = arg0 + arg3;
        if (arg4 != -32348) {
            field6435 = null;
        }
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg1 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg5[var7++] = 1;
                }
            }
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IBIII)V")
    public final void method2614(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.field6433 = arg4;
        this.field6430 = arg2;
        field6442++;
        this.field6428 = arg3;
        if (arg1 != 106) {
            this.method2611(-116, null, -73, -118, 91, 45, -95);
        }
        this.field6443 = arg0;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
    private final void method2615(boolean arg0) {
        field6436++;
        if (!arg0) {
            this.field6430 = -57;
        }
        int var2 = this.field6427;
        if (var2 == 2) {
            this.field6430 = 2048;
            this.field6433 = 1;
            this.field6428 = 0;
            this.field6443 = 2048;
        } else if (var2 == 3) {
            this.field6443 = 2048;
            this.field6430 = 4096;
            this.field6428 = 0;
            this.field6433 = 1;
        } else if (var2 == 4) {
            this.field6430 = 2048;
            this.field6428 = 0;
            this.field6433 = 4;
            this.field6443 = 2048;
        } else if (var2 == 5) {
            this.field6430 = 8192;
            this.field6433 = 4;
            this.field6443 = 2048;
            this.field6428 = 0;
        } else if (var2 == 12) {
            this.field6430 = 2048;
            this.field6428 = 0;
            this.field6433 = 2;
            this.field6443 = 2048;
        } else if (var2 == 13) {
            this.field6443 = 2048;
            this.field6433 = 2;
            this.field6428 = 0;
            this.field6430 = 8192;
        } else if (var2 == 10) {
            this.field6428 = 1536;
            this.field6443 = 512;
            this.field6430 = 2048;
            this.field6433 = 3;
        } else if (var2 == 11) {
            this.field6430 = 4096;
            this.field6428 = 1536;
            this.field6443 = 512;
            this.field6433 = 3;
        } else if (var2 == 6) {
            this.field6433 = 3;
            this.field6428 = 1280;
            this.field6443 = 768;
            this.field6430 = 2048;
        } else if (var2 == 7) {
            this.field6430 = 4096;
            this.field6433 = 3;
            this.field6428 = 1280;
            this.field6443 = 768;
        } else if (var2 == 8) {
            this.field6443 = 1024;
            this.field6433 = 3;
            this.field6428 = 1024;
            this.field6430 = 2048;
        } else if (var2 == 9) {
            this.field6428 = 1024;
            this.field6433 = 3;
            this.field6443 = 1024;
            this.field6430 = 4096;
        } else if (var2 == 14) {
            this.field6443 = 768;
            this.field6428 = 1280;
            this.field6430 = 2048;
            this.field6433 = 1;
        } else if (var2 == 15) {
            this.field6433 = 1;
            this.field6430 = 4096;
            this.field6428 = 1536;
            this.field6443 = 512;
        } else if (var2 == 16) {
            this.field6433 = 1;
            this.field6430 = 8192;
            this.field6443 = 256;
            this.field6428 = 1792;
        } else {
            this.field6428 = 0;
            this.field6433 = 0;
            this.field6430 = 2048;
            this.field6443 = 2048;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(Z)V")
    public static void method2616(boolean arg0) {
        if (!arg0) {
            field6435 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
    protected class429() {
        if (class159.field2554 == null) {
            class306.method1951((byte) -30);
        }
        this.method2615(true);
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lza;Lia;I)V")
    public class429(class491 arg0, class23 arg1, int arg2) {
        if (class159.field2554 == null) {
            class306.method1951((byte) -30);
        }
        this.field6440 = arg1.method126((byte) -116);
        this.field6432 = (this.field6440 & 0x10) != 0;
        this.field6426 = (this.field6440 & 0x8) != 0;
        this.field6440 &= 0x7;
        int var4 = arg1.method132(21) << arg2;
        int var5 = arg1.method132(45) << arg2;
        int var6 = arg1.method132(29) << arg2;
        int var7 = arg1.method126((byte) -106);
        int var8 = var7 * 2 + 1;
        this.field6431 = new short[var8];
        for (int var9 = 0; var9 < this.field6431.length; var9++) {
            short var13 = (short) arg1.method132(45);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if (var15 > (var8 - var14)) {
                var15 = var8 - var14;
            }
            this.field6431[var9] = (short) class338.method2141(var15, var14 << 8);
        }
        int var10 = (var7 << class276.field4534) + class331.field5211;
        int var11 = class164.field2603 == null ? class226.field3894[class507.method2982(false, arg1.method132(31)) & 0xFFFF] : class164.field2603[arg1.method132(100)];
        int var12 = arg1.method126((byte) -82);
        this.field6434 = var12 & 0xE0 << 3;
        this.field6427 = var12 & 0x1F;
        if (this.field6427 != 31) {
            this.method2615(true);
        }
        this.method2611(var4, arg0, var11, var10, var5, -121, var6);
    }
}
