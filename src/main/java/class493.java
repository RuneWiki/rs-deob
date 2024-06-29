import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class493 {

    @OriginalMember(owner = "client!so", name = "c", descriptor = "Z")
    public boolean field6995 = true;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    private int field6997 = 0;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    public int field7003 = -1;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "I")
    public int field7007 = 512;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "Z")
    public boolean field7006 = true;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public int field6993;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    public int field7000;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    public int field7005;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "I")
    public int field7010;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(JI)V", line = 5)
    public static final void method2879(long arg0, int arg1) {
        field6998++;
        int var3 = class572.field8101 + class251.field3549.field7718;
        int var4 = class519.field7426 + class251.field3549.field7719;
        if (arg1 >= -79) {
            return;
        }
        if (class4.field54 - var3 < -2000 || class4.field54 - var3 > 2000 || class238.field3434 - var4 < -2000 || class238.field3434 - var4 > 2000) {
            class238.field3434 = var4;
            class4.field54 = var3;
        }
        if (class4.field54 != var3) {
            int var5 = var3 - class4.field54;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class4.field54 += var6;
        }
        class562.field8001 += (float) arg0 * class318.field4733 / 6.0F;
        if (class238.field3434 != var4) {
            int var7 = var4 - class238.field3434;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class238.field3434 += var8;
        }
        class509.field7256 += (float) arg0 * class243.field3478 / 6.0F;
        class182.method1363(true);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V", line = 102)
    private final void method2880(int arg0, int arg1) {
        field7002++;
        double var3 = (double) ((arg1 & 0xFFF70D) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF1F) >> 8) / 256.0D;
        if (arg0 != 12870) {
            method2885(true, null, (byte) 73);
        }
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field7000 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field7010 = (int) (var15 * 256.0D);
        if (this.field7010 < 0) {
            this.field7010 = 0;
        } else if (this.field7010 > 255) {
            this.field7010 = 255;
        }
        if (this.field7000 < 0) {
            this.field7000 = 0;
        } else if (this.field7000 > 255) {
            this.field7000 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field7005 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field7005 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field7005 < 1) {
            this.field7005 = 1;
        }
        this.field6993 = (int) ((double) this.field7005 * var19);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIII)V", line = 194)
    public static final void method2881(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6999++;
        if (arg4 != 0) {
            method2885(false, null, (byte) 69);
        }
        int var7 = class387.method2374(arg4 + 1, arg1, class738.field10297, class414.field5846);
        int var8 = class387.method2374(arg4 + 1, arg3, class738.field10297, class414.field5846);
        int var9 = class387.method2374(1, arg6, class450.field6463, class285.field4372);
        int var10 = class387.method2374(1, arg5, class450.field6463, class285.field4372);
        int var11 = class387.method2374(1, arg1 + arg2, class738.field10297, class414.field5846);
        int var12 = class387.method2374(1, arg3 - arg2, class738.field10297, class414.field5846);
        for (int var13 = var7; var13 < var11; var13++) {
            class382.method2347(var9, class347.field5087[var13], arg0, 7, var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class382.method2347(var9, class347.field5087[var14], arg0, 7, var10);
        }
        int var15 = class387.method2374(1, arg2 + arg6, class450.field6463, class285.field4372);
        int var16 = class387.method2374(1, arg5 - arg2, class450.field6463, class285.field4372);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class347.field5087[var17];
            class382.method2347(var9, var18, arg0, 7, var15);
            class382.method2347(var16, var18, arg0, arg4 ^ 0x7, var10);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(III)Z", line = 247)
    public static final boolean method2882(int arg0, int arg1, int arg2) {
        field7004++;
        if (arg0 == -1) {
            return (arg2 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ILrv;B)V", line = 266)
    private final void method2883(int arg0, class120 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field6997 = arg1.method833(-3);
            this.method2880(12870, this.field6997);
        } else if (arg0 == 2) {
            this.field7003 = arg1.method898((byte) -80);
            if (this.field7003 == 65535) {
                this.field7003 = -1;
            }
        } else if (arg0 == 3) {
            this.field7007 = arg1.method898((byte) -115) << 2;
        } else if (arg0 == 4) {
            this.field6995 = false;
        } else if (arg0 == 5) {
            this.field7006 = false;
        }
        int var4 = -125 / ((-arg2 - 39) / 39);
        field7001++;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lrv;I)V", line = 305)
    public final void method2884(class120 arg0, int arg1) {
        field6996++;
        while (true) {
            int var3 = arg0.method842(2384);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    field7008 = 115;
                    return;
                }
            }
            this.method2883(var3, arg0, (byte) 79);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZLwq;B)V", line = 328)
    public static final void method2885(boolean arg0, class176 arg1, byte arg2) {
        field6994++;
        if (arg2 > -24) {
            field7008 = 100;
        }
        int var3 = arg1.field2629 == 0 ? arg1.field2673 : arg1.field2629;
        int var4 = arg1.field2542 == 0 ? arg1.field2664 : arg1.field2542;
        class672.method3809(var4, var3, arg0, class110.field1382[arg1.field2588 >> 16], 24729, arg1.field2588);
        if (arg1.field2543 != null) {
            class672.method3809(var4, var3, arg0, arg1.field2543, 24729, arg1.field2588);
        }
        class329 var5 = (class329) class251.field3547.method380((byte) -3, (long) arg1.field2588);
        if (var5 != null) {
            class90.method637(var5.field4912, var4, -1, var3, arg0);
        }
    }
}
