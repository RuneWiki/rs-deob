import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class241 extends class185 {

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "I")
    private int field3601 = 4;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    private int field3605 = 0;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
    private int field3609 = 204;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    private int field3608 = 8;

    @OriginalMember(owner = "client!bg", name = "Z", descriptor = "I")
    private int field3617 = 81;

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "I")
    private int field3613 = 1024;

    @OriginalMember(owner = "client!bg", name = "db", descriptor = "I")
    private int field3621 = 409;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
    private int field3612 = 1024;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
    public static int field3603 = 0;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "Lik;")
    public static class267 field3604 = new class267(32);

    @OriginalMember(owner = "client!bg", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field3623 = "Started 3d Library";

    @OriginalMember(owner = "client!bg", name = "gb", descriptor = "Ljava/lang/String;")
    public static String field3624 = null;

    @OriginalMember(owner = "client!bg", name = "jb", descriptor = "[Z")
    public static boolean[] field3627 = new boolean[8];

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    private int field3610;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!bg", name = "X", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!bg", name = "Y", descriptor = "I")
    private int field3616;

    @OriginalMember(owner = "client!bg", name = "bb", descriptor = "I")
    private int field3619;

    @OriginalMember(owner = "client!bg", name = "cb", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!bg", name = "hb", descriptor = "Lsb;")
    public static class230 field3625;

    @OriginalMember(owner = "client!bg", name = "eb", descriptor = "Lrf;")
    public static class289 field3622;

    @OriginalMember(owner = "client!bg", name = "ab", descriptor = "[I")
    private int[] field3618;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "[[I")
    private int[][] field3607;

    @OriginalMember(owner = "client!bg", name = "ib", descriptor = "[[I")
    private int[][] field3626;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(B)V")
    private final void method1524(byte arg0) {
        Random var2 = new Random((long) this.field3608);
        this.field3619 = 4096 / this.field3608;
        this.field3618 = new int[this.field3608 + 1];
        this.field3616 = this.field3617 / 2;
        this.field3626 = new int[this.field3608][this.field3601 + 1];
        this.field3618[0] = 0;
        ++field3602;
        this.field3610 = 4096 / this.field3601;
        this.field3607 = new int[this.field3608][this.field3601];
        if (arg0 == -60) {
            int var3 = this.field3610 / 2;
            int var4 = this.field3619 / 2;
            for (int var5 = 0; var5 < this.field3608; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field3619;
                    int var7 = (-2048 + class112.method726(4096, (byte) 82, var2)) * this.field3609 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field3618[var5] = this.field3618[var5 - 1] + var8;
                }
                this.field3626[var5][0] = 0;
                for (int var9 = 0; var9 < this.field3601; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field3610;
                        int var11 = (class112.method726(4096, (byte) 100, var2) - 2048) * this.field3621 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field3626[var5][var9] = this.field3626[var5][var9 + -1] + var12;
                    }
                    this.field3607[var5][var9] = ~this.field3612 >= -1 ? 4096 : 4096 - class112.method726(this.field3612, (byte) 64, var2);
                }
                this.field3626[var5][this.field3601] = 4096;
            }
            this.field3618[this.field3608] = 4096;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        if (arg1 <= 70) {
            this.field3601 = -66;
        }
        ++field3611;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            int var4 = 0;
            int var5;
            for (var5 = class85.field1356[arg0] + this.field3605; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (this.field3608 > var4 && ~var5 <= ~this.field3618[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field3618[var4 + -1];
            int var9 = this.field3618[var4];
            if (var5 > this.field3616 + var8 && ~var5 > ~(-this.field3616 + var9)) {
                for (int var10 = 0; class174.field2648 > var10; ++var10) {
                    int var11 = !var7 ? -this.field3613 : this.field3613;
                    int var12 = (this.field3610 * var11 >> 12) + class153.field2304[var10];
                    int var13 = 0;
                    while (~var12 > -1) {
                        var12 += 4096;
                    }
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    while (~this.field3601 < ~var13 && this.field3626[var6][var13] <= var12) {
                        ++var13;
                    }
                    int var14 = this.field3626[var6][var13];
                    int var15 = var13 + -1;
                    int var16 = this.field3626[var6][var15];
                    if (~(var16 - -this.field3616) > ~var12 && ~var12 > ~(-this.field3616 + var14)) {
                        var3[var10] = this.field3607[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class193.method1212(var3, 0, class174.field2648, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field3615;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (~arg0 == -8) {
                                        this.field3612 = arg1.method1575(false);
                                    }
                                } else {
                                    this.field3617 = arg1.method1575(false);
                                }
                            } else {
                                this.field3605 = arg1.method1575(false);
                            }
                        } else {
                            this.field3613 = arg1.method1575(false);
                        }
                    } else {
                        this.field3609 = arg1.method1575(false);
                    }
                } else {
                    this.field3621 = arg1.method1575(false);
                }
            } else {
                this.field3608 = arg1.method1593((byte) 27);
            }
        } else {
            this.field3601 = arg1.method1593((byte) 27);
        }
        if (arg2 != -6357) {
            field3624 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class241() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLfl;I)Lei;")
    public static final class175 method1525(boolean arg0, class248 arg1, int arg2) {
        ++field3620;
        class175 var3 = new class175(arg2, arg1.method1597((byte) -68), arg1.method1597((byte) 108), arg1.method1576(-17672), arg1.method1576(-17672), ~arg1.method1593((byte) 27) == -2, arg1.method1593((byte) 27));
        int var4 = arg1.method1593((byte) 27);
        for (int var5 = 0; var4 > var5; ++var5) {
            var3.field2681.method987(new class137(arg1.method1593((byte) 27), arg1.method1593((byte) 27), arg1.method1575(false), arg1.method1575(false), arg1.method1575(false), arg1.method1575(false), arg1.method1575(arg0), arg1.method1575(false), arg1.method1575(arg0), arg1.method1575(arg0)), (byte) -121);
        }
        var3.method1080((byte) 86);
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "(I)V")
    public static final void method1526(int arg0) {
        ++field3614;
        if (class226.field3389) {
            class149.field2162 = null;
            class174.field2646 = null;
            if (arg0 <= 104) {
                field3627 = null;
            }
            class226.field3389 = false;
        }
    }

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "(I)V")
    public final void method30(int arg0) {
        if (arg0 == -9) {
            this.method1524((byte) -60);
            ++field3606;
        }
    }

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "(I)V")
    public static void method1527(int arg0) {
        field3622 = null;
        field3624 = null;
        field3625 = null;
        if (arg0 > -47) {
            method1526(-40);
        }
        field3623 = null;
        field3604 = null;
        field3627 = null;
    }
}
