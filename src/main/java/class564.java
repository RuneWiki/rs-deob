import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class564 implements class142 {

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "Z")
    public static boolean field7609 = true;

    @OriginalMember(owner = "client!mfa", name = "n", descriptor = "J")
    public static long field7620 = -1L;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
    public int field7607;

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "I")
    public int field7613;

    @OriginalMember(owner = "client!mfa", name = "h", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!mfa", name = "i", descriptor = "I")
    public int field7615;

    @OriginalMember(owner = "client!mfa", name = "j", descriptor = "I")
    public int field7616;

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "I")
    public int field7617;

    @OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!mfa", name = "m", descriptor = "I")
    public int field7619;

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "Z")
    public boolean field7610;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)J")
    public final long method1006(byte arg0) {
        field7612++;
        long[] var2 = class667.field9397;
        long var3 = -1L;
        if (arg0 < 23) {
            method3122((byte) -107);
        }
        long var5 = var2[(int) (((long) this.field7607 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) (((long) (this.field7617 >> 8) ^ var5) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field7617 ^ var7) & 0xFFL)];
        long var11 = var2[(int) ((var9 ^ (long) (this.field7615 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var11 >>> 8 ^ var2[(int) (((long) (this.field7615 >> 16) ^ var11) & 0xFFL)];
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field7615 >> 8) ^ var13) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field7615 ^ var15) & 0xFFL)];
        long var19 = var2[(int) (((long) this.field7613 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field7619 >> 24)) & 0xFFL)];
        long var23 = var2[(int) (((long) (this.field7619 >> 16) ^ var21) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field7619 >> 8) ^ var23) & 0xFFL)];
        long var27 = var2[(int) ((var25 ^ (long) this.field7619) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field7616 ^ var27) & 0xFFL)];
        return var29 >>> 8 ^ var2[(int) ((var29 ^ (long) (this.field7610 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(III)Z")
    public static final boolean method3121(int arg0, int arg1, int arg2) {
        field7618++;
        if (class21.method105(arg2, 2, arg1)) {
            return class499.method2789(arg1, (byte) -39, arg2) | ~(arg2 & 0x9000) != arg0 | class480.method2723((byte) 94, arg1, arg2) ? true : (arg1 & 0x37) == 0 & (class138.method977(arg1, arg0 + 545, arg2) | (arg2 & 0x2000) != 0 | class245.method1519(arg1, arg2, 0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(B)V")
    public static final void method3122(byte arg0) {
        if (arg0 != 72) {
            method3123(83, null, -24);
        }
        for (int var1 = 0; var1 < class499.field6860; var1++) {
            int var2 = class586.field8197[var1];
            class225 var3 = ((class178) class323.field4762.method2061(-17305, (long) var2)).field2634;
            int var4 = class602.field8356.method718(-126);
            if ((var4 & 0x40) != 0) {
                var4 += class602.field8356.method718(109) << 8;
            }
            if ((var4 & 0x8) != 0) {
                int var5 = class602.field8356.method733((byte) 104);
                int var6 = class602.field8356.method718(125);
                var3.method2632(class239.field3440, (byte) 78, var6, var5);
                var3.field6466 = class239.field3440 + 300;
                var3.field6407 = class602.field8356.method726((byte) 127);
            }
            if ((var4 & 0x200) != 0) {
                int var7 = class602.field8356.method743((byte) -99);
                var3.field6384 = class602.field8356.method726((byte) 121);
                var3.field6406 = class602.field8356.method718(100);
                var3.field6414 = (var7 & 0x8000) != 0;
                var3.field6420 = var7 & 0x7FFF;
                var3.field6436 = class239.field3440 + var3.field6384 + var3.field6420;
            }
            if ((var4 & 0x2) != 0) {
                int var8 = class602.field8356.method747(arg0 - 29);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class602.field8356.method713((byte) -104);
                class546.method3003(var9, var8, var3, 9696);
            }
            if ((var4 & 0x1) != 0) {
                var3.field6391 = class602.field8356.method756((byte) 101);
                if (var3.field6391 == 65535) {
                    var3.field6391 = -1;
                }
            }
            if ((var4 & 0x2000) != 0) {
                int var10 = class602.field8356.method733((byte) 96);
                int var11 = class602.field8356.method713((byte) -104);
                var3.method2632(class239.field3440, (byte) 102, var11, var10);
            }
            if ((var4 & 0x20) != 0) {
                var3.field3227 = class602.field8356.method754(arg0 - 72);
                var3.field3224 = class602.field8356.method754(0);
            }
            if ((var4 & 0x800) != 0) {
                var3.field6399 = class602.field8356.method748(arg0 - 813976760);
                var3.field6457 = class602.field8356.method712(true);
                var3.field6454 = class602.field8356.method750(13264);
                var3.field6435 = (byte) class602.field8356.method726((byte) 123);
                var3.field6437 = class239.field3440 + class602.field8356.method756((byte) 101);
                var3.field6467 = class239.field3440 + class602.field8356.method754(0);
            }
            if ((var4 & 0x4) != 0) {
                if (var3.field3245.method1116(-67)) {
                    class99.method767(var3, (byte) 43);
                }
                var3.method1443(0, class648.field9185.method1493(class602.field8356.method754(0), (byte) -71));
                var3.method2638(arg0 + 18727, var3.field3245.field2463);
                var3.field6394 = var3.field3245.field2407 << 3;
                if (var3.field3245.method1116(-112)) {
                    class80.method637((byte) -95, null, 0, null, var3.field6483[0], var3.field520, var3, var3.field6477[0]);
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field6405 = class602.field8356.method739(arg0 + 25);
                var3.field6473 = 100;
            }
            if ((var4 & 0x80) != 0) {
                int var12 = class602.field8356.method754(0);
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = class602.field8356.method697(false);
                int var14 = class602.field8356.method710(-127);
                var3.method2641(false, var13, (byte) -85, var14, var12);
            }
            if ((var4 & 0x1000) != 0) {
                int var15 = class602.field8356.method718(-54);
                int[] var16 = new int[var15];
                int[] var17 = new int[var15];
                int[] var18 = new int[var15];
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = class602.field8356.method754(arg0 ^ 0x48);
                    if (var20 == 65535) {
                        var20 = -1;
                    }
                    var16[var19] = var20;
                    var17[var19] = class602.field8356.method713((byte) -104);
                    var18[var19] = class602.field8356.method756((byte) 101);
                }
                class652.method3627(var17, var18, var16, (byte) -92, var3);
            }
            if ((var4 & 0x400) != 0) {
                var3.field6422 = class602.field8356.method712(true);
                var3.field6411 = class602.field8356.method750(13264);
                var3.field6408 = class602.field8356.method750(13264);
                var3.field6452 = class602.field8356.method750(13264);
                var3.field6470 = class602.field8356.method756((byte) 101) + class239.field3440;
                var3.field6434 = class602.field8356.method754(0) + class239.field3440;
                var3.field6465 = class602.field8356.method710(90);
                var3.field6484 = 0;
                var3.field6408 += var3.field6483[0];
                var3.field6422 += var3.field6483[0];
                var3.field6485 = 1;
                var3.field6452 += var3.field6477[0];
                var3.field6411 += var3.field6477[0];
            }
            if ((var4 & 0x100) != 0) {
                int var21 = class602.field8356.method747(arg0 - 39);
                int var22 = class602.field8356.method697(false);
                if (var21 == 65535) {
                    var21 = -1;
                }
                int var23 = class602.field8356.method710(arg0 ^ 0xFFFFFFC5);
                var3.method2641(true, var22, (byte) -85, var23, var21);
            }
        }
        field7611++;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILva;I)V")
    public static final void method3123(int arg0, class457 arg1, int arg2) {
        field7608++;
        int var3 = -1;
        int var4 = 0;
        if (arg1.field6470 > class239.field3440) {
            class91.method675(arg1, 42);
        } else if (arg1.field6434 < class239.field3440) {
            class691.method3803(126, false, arg1);
            var4 = class326.field4811;
            var3 = class308.field4576;
        } else {
            class516.method2865((byte) -69, arg1);
        }
        if (arg1.field509 < 512 || arg1.field514 < 512 || arg1.field509 >= (class86.field1185 * 512 - 512) || arg1.field514 >= ((class526.field7212 - 1) * 512)) {
            var4 = 0;
            arg1.field6443 = -1;
            arg1.field6470 = 0;
            arg1.field6398 = -1;
            arg1.field6434 = 0;
            arg1.field6417 = -1;
            var3 = -1;
            arg1.field509 = arg1.field6483[0] * 512 + (arg1.method1722((byte) -124) * 256);
            arg1.field514 = arg1.field6477[0] * 512 + arg1.method1722((byte) -119) * 256;
            arg1.method2642((byte) -112);
        }
        if (class253.field3576 == arg1 && (arg1.field509 < 6144 || arg1.field514 < 6144 || arg1.field509 >= ((class86.field1185 - 12) * 512) || (class526.field7212 * 512 - 6144) <= arg1.field514)) {
            arg1.field6434 = 0;
            var3 = -1;
            arg1.field6417 = -1;
            arg1.field6470 = 0;
            var4 = 0;
            arg1.field6398 = -1;
            arg1.field6443 = -1;
            arg1.field509 = arg1.field6483[0] * 512 + (arg1.method1722((byte) -124) * 256);
            arg1.field514 = arg1.field6477[0] * 512 + (arg1.method1722((byte) -124) * 256);
            arg1.method2642((byte) 55);
        }
        int var5 = class485.method2736((byte) -35, arg1);
        class291.method1827((byte) -50, arg1, var3, var5, var4);
        if (arg2 != -1) {
            field7609 = true;
        }
        class414.method2359(arg2, arg1);
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lwea;I)Z")
    public final boolean method1005(class142 arg0, int arg1) {
        if (arg1 <= 122) {
            return true;
        }
        field7614++;
        if (!(arg0 instanceof class564)) {
            return false;
        }
        class564 var3 = (class564) arg0;
        if (this.field7607 != var3.field7607) {
            return false;
        } else if (this.field7617 != var3.field7617) {
            return false;
        } else if (this.field7615 != var3.field7615) {
            return false;
        } else if (this.field7613 != var3.field7613) {
            return false;
        } else if (this.field7619 != var3.field7619) {
            return false;
        } else if (this.field7616 == var3.field7616) {
            return var3.field7610 == this.field7610;
        } else {
            return false;
        }
    }
}
