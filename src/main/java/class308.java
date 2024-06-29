import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class308 extends class201 {

    @OriginalMember(owner = "client!ag", name = "Nb", descriptor = "I")
    private int field4589 = 0;

    @OriginalMember(owner = "client!ag", name = "Db", descriptor = "Z")
    private boolean field4579 = true;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    private int field4544 = 0;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
    private int field4535 = 0;

    @OriginalMember(owner = "client!ag", name = "yb", descriptor = "I")
    private int field4574 = 0;

    @OriginalMember(owner = "client!ag", name = "Qb", descriptor = "I")
    private int field4592 = 0;

    @OriginalMember(owner = "client!ag", name = "Fb", descriptor = "Z")
    private boolean field4581 = false;

    @OriginalMember(owner = "client!ag", name = "pc", descriptor = "Lbv;")
    private class282 field4617;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "Lit;")
    private class509 field4541;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "Lit;")
    private class509 field4543;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "Lit;")
    private class509 field4538;

    @OriginalMember(owner = "client!ag", name = "Ab", descriptor = "Lit;")
    private class509 field4576;

    @OriginalMember(owner = "client!ag", name = "qb", descriptor = "Led;")
    private class419 field4566;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    private int field4542;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    private int field4515;

    @OriginalMember(owner = "client!ag", name = "kb", descriptor = "[I")
    private int[] field4560;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "[S")
    private short[] field4545;

    @OriginalMember(owner = "client!ag", name = "fb", descriptor = "[I")
    private int[] field4555;

    @OriginalMember(owner = "client!ag", name = "jb", descriptor = "[I")
    private int[] field4559;

    @OriginalMember(owner = "client!ag", name = "kc", descriptor = "[I")
    private int[] field4612;

    @OriginalMember(owner = "client!ag", name = "Kb", descriptor = "[Lil;")
    private class439[] field4586;

    @OriginalMember(owner = "client!ag", name = "Lb", descriptor = "[Le;")
    private class525[] field4587;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
    private int field4550;

    @OriginalMember(owner = "client!ag", name = "hc", descriptor = "[Ldn;")
    private class412[] field4609;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "[Lgr;")
    private class456[] field4524;

    @OriginalMember(owner = "client!ag", name = "zb", descriptor = "[S")
    private short[] field4575;

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "[S")
    private short[] field4530;

    @OriginalMember(owner = "client!ag", name = "bc", descriptor = "[S")
    private short[] field4603;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "[S")
    private short[] field4526;

    @OriginalMember(owner = "client!ag", name = "tc", descriptor = "[S")
    private short[] field4621;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "[F")
    private float[] field4520;

    @OriginalMember(owner = "client!ag", name = "qc", descriptor = "S")
    private short field4618;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "[S")
    private short[] field4517;

    @OriginalMember(owner = "client!ag", name = "lc", descriptor = "[B")
    private byte[] field4613;

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "[F")
    private float[] field4528;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "[S")
    private short[] field4537;

    @OriginalMember(owner = "client!ag", name = "Sb", descriptor = "[S")
    private short[] field4594;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "[B")
    private byte[] field4536;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "[S")
    private short[] field4518;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "[S")
    private short[] field4547;

    @OriginalMember(owner = "client!ag", name = "ob", descriptor = "S")
    private short field4564;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "[I")
    private int[] field4521;

    @OriginalMember(owner = "client!ag", name = "Eb", descriptor = "[[I")
    private int[][] field4580;

    @OriginalMember(owner = "client!ag", name = "Wb", descriptor = "[[I")
    private int[][] field4598;

    @OriginalMember(owner = "client!ag", name = "cc", descriptor = "[[I")
    private int[][] field4604;

    @OriginalMember(owner = "client!ag", name = "gb", descriptor = "Z")
    public static volatile boolean field4556 = true;

    @OriginalMember(owner = "client!ag", name = "xb", descriptor = "[I")
    public static int[] field4573 = new int[2];

    @OriginalMember(owner = "client!ag", name = "ac", descriptor = "J")
    public static long field4602 = 0L;

    @OriginalMember(owner = "client!ag", name = "mc", descriptor = "Ler;")
    public static class157 field4614 = new class157(64);

    @OriginalMember(owner = "client!ag", name = "rc", descriptor = "Lui;")
    public static class375 field4619 = new class375("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!ag", name = "Hb", descriptor = "B")
    private byte field4583;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!ag", name = "eb", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!ag", name = "hb", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!ag", name = "ib", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!ag", name = "lb", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!ag", name = "mb", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!ag", name = "nb", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!ag", name = "pb", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!ag", name = "sb", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!ag", name = "tb", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!ag", name = "ub", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!ag", name = "vb", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!ag", name = "Cb", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!ag", name = "Gb", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!ag", name = "Ib", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!ag", name = "Jb", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!ag", name = "Ob", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!ag", name = "Rb", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!ag", name = "Tb", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!ag", name = "Ub", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!ag", name = "Xb", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!ag", name = "Yb", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!ag", name = "Zb", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!ag", name = "dc", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!ag", name = "ec", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!ag", name = "fc", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!ag", name = "gc", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!ag", name = "ic", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!ag", name = "jc", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ag", name = "nc", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!ag", name = "oc", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!ag", name = "sc", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ag", name = "uc", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "Ltu;")
    private class176 field4532;

    @OriginalMember(owner = "client!ag", name = "wb", descriptor = "Lws;")
    private class376 field4572;

    @OriginalMember(owner = "client!ag", name = "Vb", descriptor = "Lgf;")
    private class46 field4597;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "S")
    private short field4522;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "S")
    private short field4548;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "S")
    private short field4551;

    @OriginalMember(owner = "client!ag", name = "rb", descriptor = "S")
    private short field4567;

    @OriginalMember(owner = "client!ag", name = "Bb", descriptor = "S")
    private short field4577;

    @OriginalMember(owner = "client!ag", name = "Mb", descriptor = "S")
    private short field4588;

    @OriginalMember(owner = "client!ag", name = "Pb", descriptor = "S")
    private short field4591;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lia;Lmn;I)V")
    public final void method318(class23 arg0, class159 arg1, int arg2) {
        field4608++;
        if (this.field4535 == 0) {
            return;
        }
        class120 var4 = this.field4617.field4144;
        class120 var5 = (class120) arg0;
        if (!this.field4581) {
            this.method1977((byte) 31);
        }
        this.method1987(var5, -11292);
        class273.field3792 = var4.field1708 * var5.field1719 + var4.field1718 * var5.field1701 + var4.field1712 * var5.field1720 + var4.field1719;
        class496.field7241 = var4.field1708 * var5.field1718 + var4.field1718 * var5.field1698 + var4.field1712 * var5.field1710;
        float var6 = (float) this.field4588 * class496.field7241 + class273.field3792;
        float var7 = (float) this.field4577 * class496.field7241 + class273.field3792;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = (float) this.field4567 + var6;
            var9 = var7 - (float) this.field4567;
        } else {
            var9 = var6 - (float) this.field4567;
            var8 = (float) this.field4567 + var7;
        }
        if ((var9 >= this.field4617.field4137) || ((float) this.field4617.field4106 >= var8)) {
            return;
        }
        class158.field2311 = var4.field1693 * var5.field1719 + var4.field1710 * var5.field1701 + var4.field1704 * var5.field1720 + var4.field1720;
        class479.field7001 = var4.field1693 * var5.field1718 + var4.field1710 * var5.field1698 + var4.field1704 * var5.field1710;
        float var10 = (float) this.field4588 * class479.field7001 + class158.field2311;
        float var11 = (float) this.field4577 * class479.field7001 + class158.field2311;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = ((float) this.field4567 + var10) * (float) this.field4617.field4200;
            var13 = (var11 - (float) this.field4567) * (float) this.field4617.field4200;
        } else {
            var13 = ((float) (-this.field4567) + var10) * (float) this.field4617.field4200;
            var12 = ((float) this.field4567 + var11) * (float) this.field4617.field4200;
        }
        if ((this.field4617.field4217 <= var13 / var8) || (var12 / var8 <= this.field4617.field4173)) {
            return;
        }
        class94.field1370 = var4.field1717 * var5.field1719 + var4.field1699 * var5.field1720 + var4.field1698 * var5.field1701 + var4.field1701;
        class300.field4437 = var4.field1717 * var5.field1718 + var4.field1699 * var5.field1710 + var4.field1698 * var5.field1698;
        float var14 = (float) this.field4588 * class300.field4437 + class94.field1370;
        float var15 = (float) this.field4577 * class300.field4437 + class94.field1370;
        float var16;
        float var17;
        if ((var15 < var14)) {
            var16 = ((float) this.field4567 + var14) * (float) this.field4617.field4185;
            var17 = (var15 - (float) this.field4567) * (float) this.field4617.field4185;
        } else {
            var16 = ((float) this.field4567 + var15) * (float) this.field4617.field4185;
            var17 = (var14 - (float) this.field4567) * (float) this.field4617.field4185;
        }
        if ((this.field4617.field4212 <= var17 / var8) || (this.field4617.field4156 >= var16 / var8)) {
            return;
        }
        if (arg1 != null || this.field4609 != null) {
            class390.field5917 = var4.field1717 * var5.field1708 + var4.field1699 * var5.field1693 + var4.field1698 * var5.field1717;
            class397.field6041 = var4.field1693 * var5.field1712 + var4.field1710 * var5.field1699 + var4.field1704 * var5.field1704;
            class467.field6808 = var4.field1708 * var5.field1712 + var4.field1718 * var5.field1699 + var4.field1712 * var5.field1704;
            class252.field3491 = var4.field1717 * var5.field1712 + var4.field1699 * var5.field1704 + var4.field1698 * var5.field1699;
            class29.field455 = var4.field1693 * var5.field1708 + var4.field1710 * var5.field1717 + var4.field1704 * var5.field1693;
            class87.field1206 = var4.field1708 * var5.field1708 + var4.field1718 * var5.field1717 + var4.field1712 * var5.field1693;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field4591 + this.field4548 >> 1;
            int var21 = this.field4551 + this.field4522 >> 1;
            int var22 = (int) ((float) var21 * class29.field455 + (float) this.field4588 * class479.field7001 + (float) var20 * class397.field6041 + class158.field2311);
            int var23 = (int) ((float) var21 * class390.field5917 + (float) this.field4588 * class300.field4437 + (float) var20 * class252.field3491 + class94.field1370);
            int var24 = (int) ((float) var21 * class87.field1206 + (float) this.field4588 * class496.field7241 + (float) var20 * class467.field6808 + class273.field3792);
            if (this.field4617.field4106 > var24) {
                var18 = true;
            } else {
                arg1.field2317 = this.field4617.field4127 + (this.field4617.field4185 * var23 / var24);
                arg1.field2314 = this.field4617.field4200 * var22 / var24 + this.field4617.field4216;
            }
            int var25 = (int) ((float) var21 * class29.field455 + (float) this.field4577 * class479.field7001 + (float) var20 * class397.field6041 + class158.field2311);
            int var26 = (int) ((float) var21 * class390.field5917 + (float) this.field4577 * class300.field4437 + (float) var20 * class252.field3491 + class94.field1370);
            int var27 = (int) ((float) var21 * class87.field1206 + (float) this.field4577 * class496.field7241 + (float) var20 * class467.field6808 + class273.field3792);
            if (var27 >= this.field4617.field4106) {
                arg1.field2318 = this.field4617.field4200 * var25 / var27 + this.field4617.field4216;
                arg1.field2319 = this.field4617.field4185 * var26 / var27 + this.field4617.field4127;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field4617.field4106 > var24 && var27 < this.field4617.field4106) {
                    var19 = false;
                } else if (this.field4617.field4106 > var24) {
                    int var31 = (var27 - this.field4617.field4106 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    arg1.field2314 = this.field4617.field4216 + (this.field4617.field4200 * var32 / this.field4617.field4106);
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field2317 = this.field4617.field4127 + (this.field4617.field4185 * var33 / this.field4617.field4106);
                } else if (this.field4617.field4106 > var27) {
                    int var28 = (var24 - this.field4617.field4106 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = var23 + ((var23 - var26) * var28 >> 16);
                    arg1.field2314 = this.field4617.field4200 * var29 / this.field4617.field4106 + this.field4617.field4216;
                    arg1.field2317 = this.field4617.field4185 * var30 / this.field4617.field4106 + this.field4617.field4127;
                }
            }
            if (var19) {
                arg1.field2315 = true;
                if (var24 > var27) {
                    arg1.field2316 = (this.field4567 + var22) * this.field4617.field4200 / var24 + this.field4617.field4216 - arg1.field2314;
                } else {
                    arg1.field2316 = (this.field4567 + var25) * this.field4617.field4200 / var27 + this.field4617.field4216 - arg1.field2318;
                }
            }
        }
        this.field4617.method1782((byte) -121);
        this.field4617.method1778(var5, 105);
        this.method1989(87);
        this.field4617.method1796(-1);
        this.method1983(true);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V")
    private final void method1977(byte arg0) {
        field4622++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        if (arg0 != 31) {
            method1985(null, 54, 123, -31, 0.902395F, null, 73, -1.128511F, -100, -1.214083F, 1.7724262F, -1.687427F, -39, 91);
        }
        for (int var10 = 0; var10 < this.field4574; var10++) {
            int var11 = this.field4559[var10];
            int var12 = this.field4555[var10];
            if (var6 < var12) {
                var6 = var12;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            int var13 = this.field4612[var10];
            if (var11 < var2) {
                var2 = var11;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var12 * var12 + var11 * var11 + var13 * var13;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field4588 = (short) var3;
        this.field4577 = (short) var6;
        this.field4522 = (short) var4;
        this.field4551 = (short) var7;
        this.field4591 = (short) var5;
        this.field4548 = (short) var2;
        this.field4567 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field4581 = true;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(B)V")
    public static void method1978(byte arg0) {
        if (arg0 != -81) {
            method1985(null, 63, -97, 65, 1.4287791F, null, -72, 0.9793663F, 65, -1.0327771F, 1.3559371F, 1.2904148F, -122, 73);
        }
        field4614 = null;
        field4619 = null;
        field4573 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method1979(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4599++;
        if (arg5 > arg7 && arg6 > arg7 && arg0 > arg7) {
            return false;
        } else if (arg5 < arg7 && arg6 < arg7 && arg7 > arg0) {
            return false;
        } else if (arg2 < arg8 && arg2 < arg4 && arg1 > arg2) {
            return false;
        } else {
            int var10 = 59 / (-arg3 / 43);
            return arg8 >= arg2 || arg4 >= arg2 || arg2 <= arg1;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(SIIBI)I")
    private final int method1980(short arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg1 != -11) {
            this.field4521 = null;
        }
        field4514++;
        int var6 = class249.field3466[class19.method143(arg4, arg2, (byte) 15)];
        if (arg0 != -1) {
            class263 var7 = this.field4617.field7256.method1558(arg0 & 0xFFFF, (byte) 118);
            int var8 = var7.field3660 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg2 < 0) {
                    var9 = 0;
                } else if (arg2 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg2 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field3661 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((var6 & 0xFF0000) >> 16) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (var6 >> 8 & 0xFF) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var13 << 8 & 0xFF0028) + (var15 >> 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg3 & 0xFF);
    }

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "(I)V")
    public final void method290(int arg0) {
        field4527++;
        int var2 = class525.field7760[arg0];
        int var3 = class525.field7763[arg0];
        for (int var4 = 0; var4 < this.field4574; var4++) {
            int var5 = this.field4612[var4] * var2 + this.field4559[var4] * var3 >> 15;
            this.field4612[var4] = this.field4612[var4] * var3 - (this.field4559[var4] * var2) >> 15;
            this.field4559[var4] = var5;
        }
        if (this.field4541 != null) {
            this.field4541.field7567 = null;
        }
        this.field4581 = false;
    }

    @OriginalMember(owner = "client!ag", name = "WA", descriptor = "(I)V")
    public final void method293(int arg0) {
        field4561++;
        int var2 = class525.field7760[arg0];
        int var3 = class525.field7763[arg0];
        for (int var4 = 0; var4 < this.field4574; var4++) {
            int var5 = this.field4555[var4] * var3 - (this.field4612[var4] * var2) >> 15;
            this.field4612[var4] = this.field4612[var4] * var3 + this.field4555[var4] * var2 >> 15;
            this.field4555[var4] = var5;
        }
        this.field4581 = false;
        if (this.field4541 != null) {
            this.field4541.field7567 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V")
    public final void method278(int arg0, int arg1, int arg2, int arg3) {
        field4563++;
        for (int var5 = 0; var5 < this.field4592; var5++) {
            int var9 = this.field4518[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x3B2) >> 7;
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field4518[var5] = (short) class286.method1860(class286.method1860(var11 << 7, var10 << 10), var12);
        }
        if (this.field4609 != null) {
            for (int var6 = 0; var6 < this.field4550; var6++) {
                class412 var7 = this.field4609[var6];
                class456 var8 = this.field4524[var6];
                var8.field6692 = var8.field6692 & 0xFF000000 | class249.field3466[this.field4518[var7.field6191] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field4576 != null) {
            this.field4576.field7567 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILfi;)V")
    private final void method1981(int arg0, class178 arg1) {
        field4549++;
        if (this.field4535 > class454.field6674.length) {
            class454.field6674 = new int[this.field4535];
            class530.field7821 = new int[this.field4535];
        }
        for (int var3 = 0; var3 < this.field4574; var3++) {
            int var14 = (this.field4559[var3] - (this.field4555[var3] * this.field4617.field4191 >> 8) >> this.field4617.field4080) - arg1.field2530;
            int var15 = (this.field4612[var3] - (this.field4555[var3] * this.field4617.field4130 >> 8) >> this.field4617.field4080) - arg1.field2532;
            int var16 = this.field4560[var3];
            int var17 = this.field4560[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field4594[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class454.field6674[var19] = var14;
                class530.field7821[var19] = var15;
            }
        }
        if (arg0 < 63) {
            this.field4583 = -73;
        }
        for (int var4 = 0; var4 < this.field4544; var4++) {
            if (this.field4536 == null || this.field4536[var4] <= 128) {
                short var5 = this.field4575[var4];
                short var6 = this.field4537[var4];
                short var7 = this.field4603[var4];
                int var8 = class454.field6674[var5];
                int var9 = class454.field6674[var6];
                int var10 = class454.field6674[var7];
                int var11 = class530.field7821[var5];
                int var12 = class530.field7821[var6];
                int var13 = class530.field7821[var7];
                if (((var8 - var9) * (var12 - var13) - ((var10 - var9) * (var12 - var11))) > 0) {
                    arg1.method1284(var10, -1204862768, var11, var12, var9, var8, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()[Lil;")
    public final class439[] method283() {
        field4512++;
        return this.field4586;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "()[Le;")
    public final class525[] method296() {
        field4611++;
        return this.field4587;
    }

    @OriginalMember(owner = "client!ag", name = "ra", descriptor = "()I")
    public final int method311() {
        field4570++;
        if (!this.field4581) {
            this.method1977((byte) 31);
        }
        return this.field4567;
    }

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "()I")
    public final int method308() {
        field4516++;
        return this.field4564;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ)V")
    private final void method1982(int arg0, boolean arg1) {
        field4552++;
        if (this.field4544 * 6 > class433.field6416.field1277.length) {
            class433.field6416 = new class455(this.field4544 * 6 + 600);
        } else {
            class433.field6416.field1292 = 0;
        }
        int var3 = 1 % ((-arg0 - 12) / 55);
        if (this.field4617.field4197) {
            for (int var4 = 0; var4 < this.field4544; var4++) {
                class433.field6416.method600(this.field4575[var4], -12891);
                class433.field6416.method600(this.field4537[var4], -12891);
                class433.field6416.method600(this.field4603[var4], -12891);
            }
        } else {
            for (int var5 = 0; var5 < this.field4544; var5++) {
                class433.field6416.method628(-127, this.field4575[var5]);
                class433.field6416.method628(-115, this.field4537[var5]);
                class433.field6416.method628(-106, this.field4603[var5]);
            }
        }
        if (class433.field6416.field1292 == 0) {
            return;
        }
        if (arg1) {
            if (this.field4532 == null) {
                this.field4532 = this.field4617.method1816(121, class433.field6416.field1277, true, class433.field6416.field1292, 5123);
            } else {
                this.field4532.method1270(class433.field6416.field1292, -125, 5123, class433.field6416.field1277);
            }
            this.field4566.field6255 = this.field4532;
        } else {
            this.field4566.field6255 = this.field4617.method1816(84, class433.field6416.field1277, false, class433.field6416.field1292, 5123);
        }
        if (!arg1) {
            this.field4579 = true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "XA", descriptor = "(III)V")
    public final void method277(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4574; var4++) {
            if (arg0 != 128) {
                this.field4559[var4] = this.field4559[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field4555[var4] = this.field4555[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field4612[var4] = this.field4612[var4] * arg2 >> 7;
            }
        }
        field4596++;
        if (this.field4541 != null) {
            this.field4541.field7567 = null;
        }
        this.field4581 = false;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
    private final void method1983(boolean arg0) {
        if (!arg0) {
            return;
        }
        if (this.field4609 != null) {
            class120 var2 = this.field4617.field4077;
            float var3 = this.field4617.method1104();
            float var4 = this.field4617.method1115();
            this.field4617.method1809((byte) 108);
            this.field4617.method1144(false);
            this.field4617.method1823(-23419, false);
            this.field4617.method1790(this.field4617.field4211, (byte) 43, this.field4617.field4138, null, null);
            for (int var5 = 0; var5 < this.field4550; var5++) {
                class412 var6 = this.field4609[var5];
                class456 var7 = this.field4524[var5];
                if (!var6.field6202 || !this.field4617.method1146()) {
                    float var8 = (float) (this.field4559[var6.field6199] + this.field4559[var6.field6198] + this.field4559[var6.field6194]) * 0.3333333F;
                    float var9 = (float) (this.field4555[var6.field6198] + this.field4555[var6.field6194] + this.field4555[var6.field6199]) * 0.3333333F;
                    float var10 = (float) (this.field4612[var6.field6199] + this.field4612[var6.field6198] + this.field4612[var6.field6194]) * 0.3333333F;
                    float var11 = class29.field455 * var10 + class479.field7001 * var9 + class397.field6041 * var8 + class158.field2311;
                    float var12 = class390.field5917 * var10 + class300.field4437 * var9 + class252.field3491 * var8 + class94.field1370;
                    float var13 = class87.field1206 * var10 + class496.field7241 * var9 + class467.field6808 * var8 + class273.field3792;
                    var2.method775(var6.field6201 * var7.field6688 >> 7, 16383, (float) var7.field6689 + var11, (float) var7.field6690 + -var12, var6.field6193 * var7.field6691 >> 7, var7.field6693, -var13);
                    this.field4617.method1846((byte) -96, var2);
                    this.field4617.method1087(var4, var3 - (float) var6.field6189 * 1.5F);
                    int var14 = var7.field6692;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field4617.method1811(var6.field6203, (byte) -87);
                    this.field4617.method1802(var6.field6200, (byte) 57);
                    this.field4617.method1794(var6.field6204, 55);
                    this.field4617.method1797(7, true, 0, 4);
                }
            }
            this.field4617.method1087(var4, var3);
            this.field4617.method1144(true);
            this.field4617.method1796(-1);
        }
        field4529++;
    }

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "()I")
    public final int method301() {
        if (!this.field4581) {
            this.method1977((byte) 31);
        }
        field4607++;
        return this.field4522;
    }

    @OriginalMember(owner = "client!ag", name = "ua", descriptor = "(Lj;)Lj;")
    public final class229 method285(class229 arg0) {
        field4578++;
        if (this.field4535 == 0) {
            return null;
        }
        if (!this.field4581) {
            this.method1977((byte) 31);
        }
        int var2;
        int var3;
        if (this.field4617.field4191 > 0) {
            var2 = this.field4548 - (this.field4617.field4191 * this.field4577 >> 8) >> this.field4617.field4080;
            var3 = this.field4591 - (this.field4617.field4191 * this.field4588 >> 8) >> this.field4617.field4080;
        } else {
            var2 = this.field4548 - (this.field4617.field4191 * this.field4588 >> 8) >> this.field4617.field4080;
            var3 = this.field4591 - (this.field4617.field4191 * this.field4577 >> 8) >> this.field4617.field4080;
        }
        int var4;
        int var5;
        if (this.field4617.field4130 > 0) {
            var4 = this.field4522 - (this.field4617.field4130 * this.field4577 >> 8) >> this.field4617.field4080;
            var5 = this.field4551 - (this.field4617.field4130 * this.field4588 >> 8) >> this.field4617.field4080;
        } else {
            var4 = this.field4522 - (this.field4617.field4130 * this.field4588 >> 8) >> this.field4617.field4080;
            var5 = this.field4551 - (this.field4617.field4130 * this.field4577 >> 8) >> this.field4617.field4080;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class178 var8 = (class178) arg0;
        class178 var9;
        if (var8 != null && var8.method1283(var6, var7, (byte) 122)) {
            var9 = var8;
            var8.method1280(57);
        } else {
            var9 = new class178(this.field4617, var6, var7);
        }
        var9.method1279(-1038867248, var4, var5, var2, var3);
        this.method1981(126, var9);
        return var9;
    }

    @OriginalMember(owner = "client!ag", name = "ja", descriptor = "(III)V")
    public final void method307(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4574; var4++) {
            if (arg0 != 0) {
                this.field4559[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field4555[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field4612[var4] += arg2;
            }
        }
        field4605++;
        this.field4581 = false;
        if (this.field4541 != null) {
            this.field4541.field7567 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "()I")
    public final int method306() {
        if (!this.field4581) {
            this.method1977((byte) 31);
        }
        field4539++;
        return this.field4588;
    }

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "(I)V")
    public final void method297(int arg0) {
        field4557++;
        this.field4542 = arg0;
        if (this.field4572 != null && (this.field4542 & 0x10000) == 0) {
            this.field4526 = this.field4572.field5746;
            this.field4613 = this.field4572.field5744;
            this.field4621 = this.field4572.field5749;
            this.field4547 = this.field4572.field5747;
            this.field4572 = null;
        }
        this.field4579 = true;
        this.method1986((byte) 120);
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "()V")
    public final void method295() {
        field4568++;
        if (this.field4535 <= 0 || this.field4544 <= 0) {
            return;
        }
        this.method1984(false, -76);
        if ((this.field4583 & 0x10) == 0 && this.field4566.field6255 == null) {
            this.method1982(67, false);
        }
        this.method1986((byte) 102);
    }

    @OriginalMember(owner = "client!ag", name = "la", descriptor = "()I")
    public final int method286() {
        if (!this.field4581) {
            this.method1977((byte) 31);
        }
        field4593++;
        return this.field4548;
    }

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "()I")
    public final int method279() {
        field4610++;
        return this.field4542;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lia;Lmn;II)V")
    public final void method291(class23 arg0, class159 arg1, int arg2, int arg3) {
        field4558++;
        if (this.field4535 == 0) {
            return;
        }
        class120 var5 = this.field4617.field4144;
        class120 var6 = (class120) arg0;
        if (!this.field4581) {
            this.method1977((byte) 31);
        }
        class273.field3792 = var5.field1708 * var6.field1719 + var5.field1718 * var6.field1701 + var5.field1712 * var6.field1720 + var5.field1719;
        class496.field7241 = var5.field1708 * var6.field1718 + var5.field1718 * var6.field1698 + var5.field1712 * var6.field1710;
        float var7 = (float) this.field4588 * class496.field7241 + class273.field3792;
        float var8 = (float) this.field4577 * class496.field7241 + class273.field3792;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) (-this.field4567) + var8;
            var10 = (float) this.field4567 + var7;
        } else {
            var10 = (float) this.field4567 + var8;
            var9 = (float) (-this.field4567) + var7;
        }
        if ((this.field4617.field4165 <= var9) || ((float) this.field4617.field4106 >= var10)) {
            return;
        }
        class158.field2311 = var5.field1693 * var6.field1719 + var5.field1710 * var6.field1701 + var5.field1704 * var6.field1720 + var5.field1720;
        class479.field7001 = var5.field1693 * var6.field1718 + var5.field1710 * var6.field1698 + var5.field1704 * var6.field1710;
        float var11 = (float) this.field4588 * class479.field7001 + class158.field2311;
        float var12 = (float) this.field4577 * class479.field7001 + class158.field2311;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = (var12 - (float) this.field4567) * (float) this.field4617.field4200;
            var14 = ((float) this.field4567 + var11) * (float) this.field4617.field4200;
        } else {
            var14 = ((float) this.field4567 + var12) * (float) this.field4617.field4200;
            var13 = (var11 - (float) this.field4567) * (float) this.field4617.field4200;
        }
        if ((this.field4617.field4217 <= var13 / (float) arg2) || (this.field4617.field4173 >= var14 / (float) arg2)) {
            return;
        }
        class94.field1370 = var5.field1717 * var6.field1719 + var5.field1699 * var6.field1720 + var5.field1698 * var6.field1701 + var5.field1701;
        class300.field4437 = var5.field1717 * var6.field1718 + var5.field1699 * var6.field1710 + var5.field1698 * var6.field1698;
        float var15 = (float) this.field4588 * class300.field4437 + class94.field1370;
        float var16 = (float) this.field4577 * class300.field4437 + class94.field1370;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = ((float) this.field4567 + var15) * (float) this.field4617.field4185;
            var18 = ((float) (-this.field4567) + var16) * (float) this.field4617.field4185;
        } else {
            var18 = (var15 - (float) this.field4567) * (float) this.field4617.field4185;
            var17 = ((float) this.field4567 + var16) * (float) this.field4617.field4185;
        }
        if ((this.field4617.field4212 <= var18 / (float) arg2) || (this.field4617.field4156 >= var17 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field4609 != null) {
            class467.field6808 = var5.field1708 * var6.field1712 + var5.field1718 * var6.field1699 + var5.field1712 * var6.field1704;
            class29.field455 = var5.field1693 * var6.field1708 + var5.field1710 * var6.field1717 + var5.field1704 * var6.field1693;
            class390.field5917 = var5.field1717 * var6.field1708 + var5.field1699 * var6.field1693 + var5.field1698 * var6.field1717;
            class397.field6041 = var5.field1693 * var6.field1712 + var5.field1710 * var6.field1699 + var5.field1704 * var6.field1704;
            class252.field3491 = var5.field1717 * var6.field1712 + var5.field1699 * var6.field1704 + var5.field1698 * var6.field1699;
            class87.field1206 = var5.field1708 * var6.field1708 + var5.field1718 * var6.field1717 + var5.field1712 * var6.field1693;
        }
        if (arg1 != null) {
            int var19 = this.field4591 + this.field4548 >> 1;
            int var20 = this.field4551 + this.field4522 >> 1;
            int var21 = (int) ((float) var20 * class29.field455 + (float) this.field4588 * class479.field7001 + (float) var19 * class397.field6041 + class158.field2311);
            int var22 = (int) ((float) var20 * class390.field5917 + (float) this.field4588 * class300.field4437 + (float) var19 * class252.field3491 + class94.field1370);
            int var23 = (int) ((float) var20 * class87.field1206 + (float) this.field4588 * class496.field7241 + (float) var19 * class467.field6808 + class273.field3792);
            int var24 = (int) ((float) var20 * class29.field455 + (float) this.field4577 * class479.field7001 + (float) var19 * class397.field6041 + class158.field2311);
            int var25 = (int) ((float) var20 * class390.field5917 + (float) this.field4577 * class300.field4437 + (float) var19 * class252.field3491 + class94.field1370);
            arg1.field2317 = this.field4617.field4127 + (this.field4617.field4185 * var22 / arg2);
            arg1.field2318 = this.field4617.field4200 * var24 / arg2 + this.field4617.field4216;
            arg1.field2319 = this.field4617.field4127 + (this.field4617.field4185 * var25 / arg2);
            arg1.field2314 = this.field4617.field4200 * var21 / arg2 + this.field4617.field4216;
            int var26 = (int) ((float) var20 * class87.field1206 + (float) this.field4577 * class496.field7241 + (float) var19 * class467.field6808 + class273.field3792);
            if (this.field4617.field4106 > var23 && this.field4617.field4106 > var26) {
                arg1.field2315 = true;
                arg1.field2316 = (this.field4567 + var21) * this.field4617.field4200 / arg2 + this.field4617.field4216 - arg1.field2314;
            }
        }
        this.field4617.method1834((float) arg2, (byte) 53);
        this.field4617.method1845((byte) 72);
        this.field4617.method1778(var6, 121);
        this.method1989(91);
        this.field4617.method1796(-1);
        this.method1983(true);
    }

    @OriginalMember(owner = "client!ag", name = "ZA", descriptor = "(I)V")
    public final void method316(int arg0) {
        this.field4618 = (short) arg0;
        if (this.field4576 != null) {
            this.field4576.field7567 = null;
        }
        field4615++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI)V")
    private final void method1984(boolean arg0, int arg1) {
        field4585++;
        boolean var3 = this.field4576 != null && this.field4576.field7567 == null;
        boolean var4 = this.field4538 != null && this.field4538.field7567 == null;
        boolean var5 = this.field4541 != null && this.field4541.field7567 == null;
        boolean var6 = this.field4543 != null && this.field4543.field7567 == null;
        if (arg0) {
            var6 &= (this.field4583 & 0x8) != 0;
            var3 &= (this.field4583 & 0x2) != 0;
            var5 &= (this.field4583 & 0x1) != 0;
            var4 &= (this.field4583 & 0x4) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        byte var11 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (arg1 > -66) {
            this.field4594 = null;
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (class433.field6416.field1277.length < (this.field4535 * var7)) {
            class433.field6416 = new class455((this.field4535 + 100) * var7);
        } else {
            class433.field6416.field1292 = 0;
        }
        if (var5) {
            if (this.field4617.field4197) {
                for (int var12 = 0; var12 < this.field4574; var12++) {
                    int var13 = NativeStream.floatToRawIntBits((float) this.field4559[var12]);
                    int var14 = NativeStream.floatToRawIntBits((float) this.field4555[var12]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field4612[var12]);
                    int var16 = this.field4560[var12];
                    int var17 = this.field4560[var12 + 1];
                    for (int var18 = var16; var18 < var17; var18++) {
                        int var19 = this.field4594[var18] - 1;
                        if (var19 == -1) {
                            break;
                        }
                        class433.field6416.field1292 = var7 * var19;
                        class433.field6416.method615(28010, var13);
                        class433.field6416.method615(28010, var14);
                        class433.field6416.method615(28010, var15);
                    }
                }
            } else {
                for (int var20 = 0; var20 < this.field4574; var20++) {
                    int var21 = NativeStream.floatToRawIntBits((float) this.field4559[var20]);
                    int var22 = NativeStream.floatToRawIntBits((float) this.field4555[var20]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field4612[var20]);
                    int var24 = this.field4560[var20];
                    int var25 = this.field4560[var20 + 1];
                    for (int var26 = var24; var26 < var25; var26++) {
                        int var27 = this.field4594[var26] - 1;
                        if (var27 == -1) {
                            break;
                        }
                        class433.field6416.field1292 = var7 * var27;
                        class433.field6416.method588(-125, var21);
                        class433.field6416.method588(-127, var22);
                        class433.field6416.method588(-113, var23);
                    }
                }
            }
        }
        if (var3) {
            if (this.field4538 == null) {
                short[] var28;
                short[] var29;
                byte[] var30;
                short[] var31;
                if (this.field4572 == null) {
                    var28 = this.field4621;
                    var29 = this.field4547;
                    var30 = this.field4613;
                    var31 = this.field4526;
                } else {
                    var28 = this.field4572.field5749;
                    var30 = this.field4572.field5744;
                    var29 = this.field4572.field5747;
                    var31 = this.field4572.field5746;
                }
                float var32 = this.field4617.field4110[0];
                float var33 = this.field4617.field4110[1];
                float var34 = this.field4617.field4110[2];
                float var35 = this.field4617.field4188;
                float var36 = this.field4617.field4169 * 768.0F / (float) this.field4564;
                float var37 = this.field4617.field4177 * 768.0F / (float) this.field4564;
                for (int var38 = 0; var38 < this.field4592; var38++) {
                    int var39 = this.method1980(this.field4517[var38], -11, this.field4618, this.field4536[var38], this.field4518[var38]);
                    float var40 = (float) (var39 >>> 24) * this.field4617.field4111;
                    float var41 = (float) ((var39 & 0xFF7A) >> 8) * this.field4617.field4194;
                    short var42 = this.field4575[var38];
                    float var43 = (float) (var39 >> 16 & 0xFF) * this.field4617.field4182;
                    short var44 = (short) var30[var42];
                    float var45;
                    if (var44 == 0) {
                        var45 = ((float) var28[var42] * var34 + (float) var29[var42] * var32 + (float) var31[var42] * var33) * 0.0026041667F;
                    } else {
                        var45 = ((float) var28[var42] * var34 + (float) var29[var42] * var32 + (float) var31[var42] * var33) / (float) (var44 * 256);
                    }
                    float var46 = var35 + var45 * ((var45 < 0.0F) ? var37 : var36);
                    int var47 = (int) (var40 * var46);
                    if (var47 < 0) {
                        var47 = 0;
                    } else if (var47 > 255) {
                        var47 = 255;
                    }
                    int var48 = (int) (var43 * var46);
                    int var49 = (int) (var41 * var46);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    class433.field6416.field1292 = var7 * var42 + var9;
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    class433.field6416.method625(var47, false);
                    class433.field6416.method625(var48, false);
                    class433.field6416.method625(var49, false);
                    class433.field6416.method625(255 - (this.field4536[var38] & 0xFF), false);
                    short var50 = this.field4537[var38];
                    short var51 = (short) var30[var50];
                    float var52;
                    if (var51 == 0) {
                        var52 = ((float) var28[var50] * var34 + (float) var29[var50] * var32 + (float) var31[var50] * var33) * 0.0026041667F;
                    } else {
                        var52 = ((float) var28[var50] * var34 + (float) var29[var50] * var32 + (float) var31[var50] * var33) / (float) (var51 * 256);
                    }
                    float var53 = (var52 < 0.0F ? var37 : var36) * var52 + var35;
                    int var54 = (int) (var40 * var53);
                    int var55 = (int) (var43 * var53);
                    if (var54 < 0) {
                        var54 = 0;
                    } else if (var54 > 255) {
                        var54 = 255;
                    }
                    int var56 = (int) (var41 * var53);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    class433.field6416.field1292 = var7 * var50 + var9;
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    class433.field6416.method625(var54, false);
                    class433.field6416.method625(var55, false);
                    class433.field6416.method625(var56, false);
                    class433.field6416.method625(255 - (this.field4536[var38] & 0xFF), false);
                    short var57 = this.field4603[var38];
                    short var58 = (short) var30[var57];
                    float var59;
                    if (var58 == 0) {
                        var59 = ((float) var28[var57] * var34 + (float) var29[var57] * var32 + (float) var31[var57] * var33) * 0.0026041667F;
                    } else {
                        var59 = ((float) var28[var57] * var34 + (float) var29[var57] * var32 + (float) var31[var57] * var33) / (float) (var58 * 256);
                    }
                    float var60 = (var59 < 0.0F ? var37 : var36) * var59 + var35;
                    int var61 = (int) (var40 * var60);
                    int var62 = (int) (var43 * var60);
                    if (var61 < 0) {
                        var61 = 0;
                    } else if (var61 > 255) {
                        var61 = 255;
                    }
                    int var63 = (int) (var41 * var60);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    class433.field6416.field1292 = var9 + (var7 * var57);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    class433.field6416.method625(var61, false);
                    class433.field6416.method625(var62, false);
                    class433.field6416.method625(var63, false);
                    class433.field6416.method625(255 - (this.field4536[var38] & 0xFF), false);
                }
            } else {
                for (int var64 = 0; var64 < this.field4592; var64++) {
                    int var65 = this.method1980(this.field4517[var64], -11, this.field4618, this.field4536[var64], this.field4518[var64]);
                    class433.field6416.field1292 = this.field4575[var64] * var7 + var9;
                    class433.field6416.method615(28010, var65);
                    class433.field6416.field1292 = this.field4537[var64] * var7 + var9;
                    class433.field6416.method615(28010, var65);
                    class433.field6416.field1292 = this.field4603[var64] * var7 + var9;
                    class433.field6416.method615(28010, var65);
                }
            }
        }
        if (var4) {
            short[] var66;
            byte[] var67;
            short[] var68;
            short[] var69;
            if (this.field4572 == null) {
                var66 = this.field4621;
                var67 = this.field4613;
                var68 = this.field4547;
                var69 = this.field4526;
            } else {
                var66 = this.field4572.field5749;
                var68 = this.field4572.field5747;
                var69 = this.field4572.field5746;
                var67 = this.field4572.field5744;
            }
            float var70 = 3.0F / (float) this.field4564;
            class433.field6416.field1292 = var10;
            float var71 = 3.0F / (float) (this.field4564 / 2 + this.field4564);
            if (this.field4617.field4197) {
                for (int var75 = 0; var75 < this.field4535; var75++) {
                    int var76 = var67[var75] & 0xFF;
                    if (var76 == 0) {
                        class433.field6416.method2741(117, (float) var68[var75] * var71);
                        class433.field6416.method2741(92, (float) var69[var75] * var71);
                        class433.field6416.method2741(81, (float) var66[var75] * var71);
                    } else {
                        float var77 = var70 / (float) var76;
                        class433.field6416.method2741(113, (float) var68[var75] * var77);
                        class433.field6416.method2741(73, (float) var69[var75] * var77);
                        class433.field6416.method2741(120, (float) var66[var75] * var77);
                    }
                    class433.field6416.field1292 += var7 - 12;
                }
            } else {
                for (int var72 = 0; var72 < this.field4535; var72++) {
                    int var73 = var67[var72] & 0xFF;
                    if (var73 == 0) {
                        class433.field6416.method2737(-101, (float) var68[var72] * var71);
                        class433.field6416.method2737(-117, (float) var69[var72] * var71);
                        class433.field6416.method2737(-104, (float) var66[var72] * var71);
                    } else {
                        float var74 = var70 / (float) var73;
                        class433.field6416.method2737(-127, (float) var68[var72] * var74);
                        class433.field6416.method2737(-98, (float) var69[var72] * var74);
                        class433.field6416.method2737(-128, (float) var66[var72] * var74);
                    }
                    class433.field6416.field1292 += var7 - 12;
                }
            }
        }
        if (var6) {
            class433.field6416.field1292 = var11;
            if (this.field4617.field4197) {
                for (int var79 = 0; var79 < this.field4535; var79++) {
                    class433.field6416.method2741(95, this.field4520[var79]);
                    class433.field6416.method2741(70, this.field4528[var79]);
                    class433.field6416.field1292 += var7 - 8;
                }
            } else {
                for (int var78 = 0; var78 < this.field4535; var78++) {
                    class433.field6416.method2737(-99, this.field4520[var78]);
                    class433.field6416.method2737(-124, this.field4528[var78]);
                    class433.field6416.field1292 += var7 - 8;
                }
            }
        }
        class433.field6416.field1292 = this.field4535 * var7;
        class46 var80;
        if (arg0) {
            if (this.field4597 == null) {
                this.field4597 = this.field4617.method1812(var7, class433.field6416.field1277, class433.field6416.field1292, 126, true);
            } else {
                this.field4597.method345(63, class433.field6416.field1277, class433.field6416.field1292, var7);
            }
            this.field4583 = 0;
            var80 = this.field4597;
        } else {
            var80 = this.field4617.method1812(var7, class433.field6416.field1277, class433.field6416.field1292, 119, false);
            this.field4579 = true;
        }
        if (var5) {
            this.field4541.field7567 = var80;
            this.field4541.field7569 = var8;
        }
        if (var6) {
            this.field4543.field7569 = var11;
            this.field4543.field7567 = var80;
        }
        if (var3) {
            this.field4576.field7569 = var9;
            this.field4576.field7567 = var80;
        }
        if (var4) {
            this.field4538.field7567 = var80;
            this.field4538.field7569 = var10;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lut;IIIF[BIFIFFFII)V")
    public static final void method1985(class462 arg0, int arg1, int arg2, int arg3, float arg4, byte[] arg5, int arg6, float arg7, int arg8, float arg9, float arg10, float arg11, int arg12, int arg13) {
        field4511++;
        int var14 = arg3 * arg13;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg2; var16++) {
            int var19 = arg1;
            arg0.method1209(arg4 / (float) arg13, arg9 / (float) arg8, arg8, arg13, -43, arg7 / (float) arg3, arg10 * 127.0F, arg3, 0, var15, arg12);
            arg4 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg5[var19] = (byte) ((int) ((float) arg5[var19] + var15[var20]));
                var19++;
            }
            arg9 *= 2.0F;
            arg7 *= 2.0F;
            arg10 *= arg11;
        }
        if (arg6 > -109) {
            method1978((byte) 107);
        }
        int var17 = arg1;
        for (int var18 = 0; var18 < var14; var18++) {
            arg5[var17] -= -127;
            var17++;
        }
    }

    @OriginalMember(owner = "client!ag", name = "YA", descriptor = "(SS)V")
    public final void method280(short arg0, short arg1) {
        field4553++;
        class373 var3 = this.field4617.field7256;
        for (int var4 = 0; var4 < this.field4592; var4++) {
            if (this.field4517[var4] == arg0) {
                this.field4517[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class263 var7 = var3.method1558(arg0 & 0xFFFF, (byte) 127);
            var5 = var7.field3660;
            var6 = var7.field3661;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class263 var10 = var3.method1558(arg1 & 0xFFFF, (byte) 119);
            var8 = var10.field3660;
            var9 = var10.field3661;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field4609 != null) {
            for (int var11 = 0; var11 < this.field4550; var11++) {
                class412 var12 = this.field4609[var11];
                class456 var13 = this.field4524[var11];
                var13.field6692 = var13.field6692 & 0xFF000000 | class249.field3466[this.field4518[var12.field6191] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field4576 != null) {
            this.field4576.field7567 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!ag", name = "VA", descriptor = "()I")
    public final int method300() {
        field4620++;
        if (!this.field4581) {
            this.method1977((byte) 31);
        }
        return this.field4591;
    }

    @OriginalMember(owner = "client!ag", name = "oa", descriptor = "(I)V")
    public final void method294(int arg0) {
        if (this.field4576 != null) {
            this.field4576.field7567 = null;
        }
        field4600++;
        this.field4564 = (short) arg0;
        if (this.field4538 != null) {
            this.field4538.field7567 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "()I")
    public final int method302() {
        field4534++;
        if (!this.field4581) {
            this.method1977((byte) 31);
        }
        return this.field4577;
    }

    @OriginalMember(owner = "client!ag", name = "ia", descriptor = "(I)V")
    public final void method303(int arg0) {
        field4582++;
        int var2 = class525.field7760[arg0];
        int var3 = class525.field7763[arg0];
        for (int var4 = 0; var4 < this.field4574; var4++) {
            int var7 = this.field4612[var4] * var2 + this.field4559[var4] * var3 >> 15;
            this.field4612[var4] = this.field4612[var4] * var3 - this.field4559[var4] * var2 >> 15;
            this.field4559[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field4535; var5++) {
            int var6 = this.field4621[var5] * var2 + this.field4547[var5] * var3 >> 15;
            this.field4621[var5] = (short) (this.field4621[var5] * var3 - (this.field4547[var5] * var2) >> 15);
            this.field4547[var5] = (short) var6;
        }
        if (this.field4538 == null && this.field4576 != null) {
            this.field4576.field7567 = null;
        }
        if (this.field4538 != null) {
            this.field4538.field7567 = null;
        }
        this.field4581 = false;
        if (this.field4541 != null) {
            this.field4541.field7567 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "va", descriptor = "(I[IIIIZI[I)V")
    public final void method309(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field4546++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = arg2 << 4;
            class228.field3268 = 0;
            int var13 = 0;
            class249.field3457 = 0;
            class172.field2482 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field4580.length) {
                    int[] var16 = this.field4580[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field4545 == null || (arg6 & this.field4545[var18]) != 0) {
                            class172.field2482 += this.field4559[var18];
                            class228.field3268 += this.field4555[var18];
                            var13++;
                            class249.field3457 += this.field4612[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class249.field3457 = class249.field3457 / var13 + var10;
                class262.field3643 = true;
                class228.field3268 = class228.field3268 / var13 + var11;
                class172.field2482 = class172.field2482 / var13 + var12;
            } else {
                class228.field3268 = var11;
                class172.field2482 = var12;
                class249.field3457 = var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg4 = var21;
                arg3 = var20;
            }
            int var22 = arg2 << 4;
            int var23 = arg4 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field4580.length > var26) {
                    int[] var27 = this.field4580[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field4545 == null || (arg6 & this.field4545[var29]) != 0) {
                            this.field4559[var29] += var22;
                            this.field4555[var29] += var24;
                            this.field4612[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field4580.length > var109) {
                        int[] var110 = this.field4580[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field4545 == null || (arg6 & this.field4545[var112]) != 0) {
                                this.field4559[var112] -= class172.field2482;
                                this.field4555[var112] -= class228.field3268;
                                this.field4612[var112] -= class249.field3457;
                                if (arg4 != 0) {
                                    int var113 = class525.field7760[arg4];
                                    int var114 = class525.field7763[arg4];
                                    int var115 = this.field4555[var112] * var113 + this.field4559[var112] * var114 + 32767 >> 15;
                                    this.field4555[var112] = this.field4555[var112] * var114 + 32767 - (this.field4559[var112] * var113) >> 15;
                                    this.field4559[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class525.field7760[arg2];
                                    int var117 = class525.field7763[arg2];
                                    int var118 = this.field4555[var112] * var117 + 32767 - this.field4612[var112] * var116 >> 15;
                                    this.field4612[var112] = this.field4555[var112] * var116 + (this.field4612[var112] * var117) + 32767 >> 15;
                                    this.field4555[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class525.field7760[arg3];
                                    int var120 = class525.field7763[arg3];
                                    int var121 = this.field4612[var112] * var119 + this.field4559[var112] * var120 + 32767 >> 15;
                                    this.field4612[var112] = this.field4612[var112] * var120 + 32767 - (this.field4559[var112] * var119) >> 15;
                                    this.field4559[var112] = var121;
                                }
                                this.field4559[var112] += class172.field2482;
                                this.field4555[var112] += class228.field3268;
                                this.field4612[var112] += class249.field3457;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field4580.length > var92) {
                            int[] var93 = this.field4580[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field4545 == null || (arg6 & this.field4545[var95]) != 0) {
                                    int var96 = this.field4560[var95];
                                    int var97 = this.field4560[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field4594[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class525.field7760[arg4];
                                            int var101 = class525.field7763[arg4];
                                            int var102 = this.field4547[var99] * var101 + this.field4526[var99] * var100 + 32767 >> 15;
                                            this.field4526[var99] = (short) (this.field4526[var99] * var101 + 32767 - (this.field4547[var99] * var100) >> 15);
                                            this.field4547[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class525.field7760[arg2];
                                            int var104 = class525.field7763[arg2];
                                            int var105 = this.field4526[var99] * var104 + 32767 - (this.field4621[var99] * var103) >> 15;
                                            this.field4621[var99] = (short) (this.field4621[var99] * var104 + this.field4526[var99] * var103 + 32767 >> 15);
                                            this.field4526[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class525.field7760[arg3];
                                            int var107 = class525.field7763[arg3];
                                            int var108 = this.field4547[var99] * var107 + this.field4621[var99] * var106 + 32767 >> 15;
                                            this.field4621[var99] = (short) (this.field4621[var99] * var107 + 32767 - (this.field4547[var99] * var106) >> 15);
                                            this.field4547[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field4538 == null && this.field4576 != null) {
                        this.field4576.field7567 = null;
                    }
                    if (this.field4538 != null) {
                        this.field4538.field7567 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class262.field3643) {
                    int var36 = arg7[0] * class172.field2482 + arg7[3] * class228.field3268 + (arg7[6] * class249.field3457) + 16384 >> 15;
                    int var37 = arg7[7] * class249.field3457 + arg7[1] * class172.field2482 - (-(arg7[4] * class228.field3268) - 16384) >> 15;
                    int var38 = var33 + var36;
                    int var39 = var34 + var37;
                    int var40 = arg7[5] * class228.field3268 + arg7[2] * class172.field2482 + arg7[8] * class249.field3457 + 16384 >> 15;
                    class172.field2482 = var38;
                    int var41 = var35 + var40;
                    class228.field3268 = var39;
                    class249.field3457 = var41;
                    class262.field3643 = false;
                }
                int[] var42 = new int[9];
                int var43 = class525.field7763[arg2];
                int var44 = class525.field7760[arg2];
                int var45 = class525.field7763[arg3];
                int var46 = class525.field7760[arg3];
                int var47 = class525.field7763[arg4];
                int var48 = class525.field7760[arg4];
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[0] = var45 * var47 + (var46 * var50) + 16384 >> 15;
                var42[6] = -var46 * var47 + (var45 * var50) + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[1] = -var45 * var48 + (var46 * var49) + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[5] = -var44;
                int var51 = var42[2] * -class249.field3457 + var42[0] * -class172.field2482 + var42[1] * -class228.field3268 + 16384 >> 15;
                int var52 = var42[3] * -class172.field2482 + var42[5] * -class249.field3457 + var42[4] * -class228.field3268 + 16384 >> 15;
                int var53 = var42[8] * -class249.field3457 + var42[6] * -class172.field2482 + (var42[7] * -class228.field3268) + 16384 >> 15;
                int var54 = class172.field2482 + var51;
                int var55 = class228.field3268 + var52;
                int var56 = class249.field3457 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 16384 >> 15;
                    }
                }
                int var59 = var42[2] * var35 + var42[1] * var34 + var42[0] * var33 + 16384 >> 15;
                int var60 = var42[4] * var34 + (var42[3] * var33 - (-(var42[5] * var35) - 16384)) >> 15;
                int var61 = var54 + var59;
                int var62 = var42[7] * var34 + (var42[6] * var33 + (var42[8] * var35)) + 16384 >> 15;
                int var63 = var55 + var60;
                int var64 = var56 + var62;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 16384 >> 15;
                    }
                }
                int var67 = arg7[1] * var63 + (arg7[2] * var64) + arg7[0] * var61 + 16384 >> 15;
                int var68 = arg7[5] * var64 + (arg7[3] * var61 + (arg7[4] * var63)) + 16384 >> 15;
                int var69 = arg7[7] * var63 + arg7[6] * var61 + arg7[8] * var64 + 16384 >> 15;
                int var70 = var31 + var68;
                int var71 = var30 + var67;
                int var72 = var32 + var69;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field4580.length) {
                        int[] var75 = this.field4580[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field4545 == null || (arg6 & this.field4545[var77]) != 0) {
                                int var78 = this.field4612[var77] * var65[2] + this.field4559[var77] * var65[0] + this.field4555[var77] * var65[1] + 16384 >> 15;
                                int var79 = this.field4555[var77] * var65[4] + this.field4612[var77] * var65[5] + this.field4559[var77] * var65[3] + 16384 >> 15;
                                int var80 = var70 + var79;
                                int var81 = var71 + var78;
                                int var82 = this.field4555[var77] * var65[7] + (this.field4559[var77] * var65[6] + (this.field4612[var77] * var65[8])) + 16384 >> 15;
                                int var83 = var72 + var82;
                                this.field4559[var77] = var81;
                                this.field4555[var77] = var80;
                                this.field4612[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field4580.length) {
                        int[] var174 = this.field4580[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field4545 == null || (this.field4545[var176] & arg6) != 0) {
                                this.field4559[var176] -= class172.field2482;
                                this.field4555[var176] -= class228.field3268;
                                this.field4612[var176] -= class249.field3457;
                                this.field4559[var176] = this.field4559[var176] * arg2 >> 7;
                                this.field4555[var176] = this.field4555[var176] * arg3 >> 7;
                                this.field4612[var176] = this.field4612[var176] * arg4 >> 7;
                                this.field4559[var176] += class172.field2482;
                                this.field4555[var176] += class228.field3268;
                                this.field4612[var176] += class249.field3457;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (class262.field3643) {
                    int var128 = arg7[6] * class249.field3457 + arg7[3] * class228.field3268 + (arg7[0] * class172.field2482 - -16384) >> 15;
                    int var129 = arg7[1] * class172.field2482 + arg7[7] * class249.field3457 + arg7[4] * class228.field3268 + 16384 >> 15;
                    int var130 = arg7[5] * class228.field3268 + arg7[2] * class172.field2482 + arg7[8] * class249.field3457 + 16384 >> 15;
                    int var131 = var126 + var129;
                    int var132 = var125 + var128;
                    int var133 = var127 + var130;
                    class228.field3268 = var131;
                    class172.field2482 = var132;
                    class249.field3457 = var133;
                    class262.field3643 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class172.field2482 * var134 + 16384 >> 15;
                int var138 = -class228.field3268 * var135 + 16384 >> 15;
                int var139 = -class249.field3457 * var136 + 16384 >> 15;
                int var140 = class172.field2482 + var137;
                int var141 = class228.field3268 + var138;
                int var142 = class249.field3457 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var141 + var145;
                int var148 = var140 + var144;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += arg7[var151 * 3 + var171] * var143[var171 * 3 + var169];
                        }
                        var150[var151 * 3 + var169] = var170 + 16384 >> 15;
                    }
                }
                int var152 = arg7[0] * var148 + arg7[2] * var149 + arg7[1] * var147 + 16384 >> 15;
                int var153 = arg7[3] * var148 + (arg7[4] * var147) - (-(arg7[5] * var149) + -16384) >> 15;
                int var154 = arg7[8] * var149 + arg7[6] * var148 + arg7[7] * var147 + 16384 >> 15;
                int var155 = var122 + var152;
                int var156 = var123 + var153;
                int var157 = var124 + var154;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field4580.length) {
                        int[] var160 = this.field4580[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field4545 == null || (this.field4545[var162] & arg6) != 0) {
                                int var163 = this.field4559[var162] * var150[0] + this.field4612[var162] * var150[2] + this.field4555[var162] * var150[1] + 16384 >> 15;
                                int var164 = this.field4612[var162] * var150[5] + this.field4559[var162] * var150[3] + (this.field4555[var162] * var150[4] - -16384) >> 15;
                                int var165 = var156 + var164;
                                int var166 = var155 + var163;
                                int var167 = this.field4559[var162] * var150[6] + this.field4612[var162] * var150[8] + this.field4555[var162] * var150[7] + 16384 >> 15;
                                this.field4559[var162] = var166;
                                int var168 = var157 + var167;
                                this.field4555[var162] = var165;
                                this.field4612[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4604 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field4604.length) {
                        int[] var182 = this.field4604[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field4530 == null || (arg6 & this.field4530[var184]) != 0) {
                                int var185 = (this.field4536[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field4536[var184] = (byte) var185;
                                if (this.field4576 != null) {
                                    this.field4576.field7567 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field4609 != null) {
                    for (int var178 = 0; var178 < this.field4550; var178++) {
                        class412 var179 = this.field4609[var178];
                        class456 var180 = this.field4524[var178];
                        var180.field6692 = 255 - (this.field4536[var179.field6191] & 0xFF) << 24 | var180.field6692 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field4604 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field4604.length) {
                        int[] var191 = this.field4604[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field4530 == null || (this.field4530[var193] & arg6) != 0) {
                                int var194 = this.field4518[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFCD1) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = var195 + arg2 & 0x3F;
                                int var199 = arg3 / 4 + var196;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                int var200 = arg4 + var197;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field4518[var193] = (short) class286.method1860(var200, class286.method1860(var199 << 7, var198 << 10));
                                if (this.field4576 != null) {
                                    this.field4576.field7567 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field4609 != null) {
                    for (int var187 = 0; var187 < this.field4550; var187++) {
                        class412 var188 = this.field4609[var187];
                        class456 var189 = this.field4524[var187];
                        var189.field6692 = var189.field6692 & 0xFF000000 | class249.field3466[this.field4518[var188.field6191] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4598 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field4598.length > var202) {
                        int[] var203 = this.field4598[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class456 var205 = this.field4524[var203[var204]];
                            var205.field6689 += arg2;
                            var205.field6690 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4598 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field4598.length) {
                        int[] var208 = this.field4598[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class456 var210 = this.field4524[var208[var209]];
                            var210.field6691 = var210.field6691 * arg2 >> 7;
                            var210.field6688 = var210.field6688 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4598 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field4598.length) {
                    int[] var213 = this.field4598[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class456 var215 = this.field4524[var213[var214]];
                        var215.field6693 = var215.field6693 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)V")
    private final void method1986(byte arg0) {
        field4554++;
        if (!this.field4579) {
            return;
        }
        this.field4579 = false;
        if (this.field4587 == null && this.field4586 == null && this.field4609 == null) {
            if (this.field4559 != null && !class243.method1621(this.field4515, (byte) -60, this.field4542)) {
                if (this.field4541 != null && this.field4541.field7567 == null) {
                    this.field4579 = true;
                } else {
                    if (!this.field4581) {
                        this.method1977((byte) 31);
                    }
                    this.field4559 = null;
                }
            }
            if (this.field4555 != null && !class148.method979(this.field4515, this.field4542, 128)) {
                if (this.field4541 != null && this.field4541.field7567 == null) {
                    this.field4579 = true;
                } else {
                    if (!this.field4581) {
                        this.method1977((byte) 31);
                    }
                    this.field4555 = null;
                }
            }
            if (this.field4612 != null && !class252.method1646(this.field4542, this.field4515, (byte) 11)) {
                if (this.field4541 != null && this.field4541.field7567 == null) {
                    this.field4579 = true;
                } else {
                    if (!this.field4581) {
                        this.method1977((byte) 31);
                    }
                    this.field4612 = null;
                }
            }
        }
        if (this.field4594 != null && this.field4559 == null && this.field4555 == null && this.field4612 == null) {
            this.field4560 = null;
            this.field4594 = null;
        }
        if (this.field4613 != null && !class181.method1297(this.field4515, (byte) 107, this.field4542)) {
            if (this.field4538 == null) {
                if (this.field4576 != null && this.field4576.field7567 == null) {
                    this.field4579 = true;
                } else {
                    this.field4547 = this.field4526 = this.field4621 = null;
                    this.field4613 = null;
                }
            } else if (this.field4538.field7567 == null) {
                this.field4579 = true;
            } else {
                this.field4613 = null;
                this.field4547 = this.field4526 = this.field4621 = null;
            }
        }
        if (this.field4518 != null && !class355.method2239(this.field4515, this.field4542, (byte) -106)) {
            if (this.field4576 != null && this.field4576.field7567 == null) {
                this.field4579 = true;
            } else {
                this.field4518 = null;
            }
        }
        if (this.field4536 != null && !class151.method987(this.field4515, false, this.field4542)) {
            if (this.field4576 != null && this.field4576.field7567 == null) {
                this.field4579 = true;
            } else {
                this.field4536 = null;
            }
        }
        if (this.field4520 != null && !class345.method2204(this.field4515, -10059, this.field4542)) {
            if (this.field4543 != null && this.field4543.field7567 == null) {
                this.field4579 = true;
            } else {
                this.field4520 = this.field4528 = null;
            }
        }
        if (this.field4517 != null && !class477.method2858(0, this.field4515, this.field4542)) {
            if (this.field4576 != null && this.field4576.field7567 == null) {
                this.field4579 = true;
            } else {
                this.field4517 = null;
            }
        }
        if (this.field4575 != null && !class422.method2547(this.field4542, this.field4515, 107)) {
            if ((this.field4566 == null || this.field4566.field6255 != null) && (this.field4576 == null || this.field4576.field7567 != null)) {
                this.field4575 = this.field4537 = this.field4603 = null;
            } else {
                this.field4579 = true;
            }
        }
        if (this.field4604 != null && !class72.method486(this.field4515, 27650, this.field4542)) {
            this.field4604 = null;
            this.field4530 = null;
        }
        if (arg0 < 98) {
            this.field4526 = null;
        }
        if (this.field4580 != null && !class503.method3005(this.field4515, (byte) 89, this.field4542)) {
            this.field4580 = null;
            this.field4545 = null;
        }
        if (this.field4598 != null && !class202.method1411(this.field4542, -126, this.field4515)) {
            this.field4598 = null;
        }
        if (this.field4521 != null && (this.field4542 & 0x800) == 0 && (this.field4542 & 0x40000) == 0) {
            this.field4521 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "ea", descriptor = "(IILna;Lna;III)V")
    public final void method305(int arg0, int arg1, class206 arg2, class206 arg3, int arg4, int arg5, int arg6) {
        field4601++;
        if (!this.field4581) {
            this.method1977((byte) 31);
        }
        int var8 = this.field4548 + arg4;
        int var9 = this.field4591 + arg4;
        int var10 = this.field4522 + arg6;
        int var11 = this.field4551 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field2912 <= arg2.field2915 + var9 >> arg2.field2916 || var10 < 0 || (arg2.field2915 + var11 >> arg2.field2916) >= arg2.field2914) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field2915 + var9 >> arg3.field2916 >= arg3.field2912 || var10 < 0 || (arg3.field2915 + var11 >> arg3.field2916) >= arg3.field2914) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field2916;
            int var13 = arg2.field2915 + var9 - 1 >> arg2.field2916;
            int var14 = var10 >> arg2.field2916;
            int var15 = arg2.field2915 + var11 - 1 >> arg2.field2916;
            if (arg2.method849(var12, var14) == arg5 && arg5 == arg2.method849(var13, var14) && arg2.method849(var12, var15) == arg5 && arg5 == arg2.method849(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field4574; var16++) {
                this.field4555[var16] = this.field4555[var16] + arg2.method853(this.field4559[var16] + arg4, this.field4612[var16] - -arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var30 = this.field4588;
            if (var30 == 0) {
                return;
            }
            for (int var31 = 0; var31 < this.field4574; var31++) {
                int var32 = (this.field4555[var31] << 16) / var30;
                if (arg1 > var32) {
                    this.field4555[var31] += (arg1 - var32) * (arg2.method853(this.field4559[var31] + arg4, this.field4612[var31] + arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var26 = (arg1 & 0xFF) * 4;
            int var27 = ((arg1 & 0xFFC3) >> 8) * 4;
            int var28 = arg1 >> 16 & 0xFF << 6;
            int var29 = (arg1 >> 24 & 0xFF) << 6;
            if ((arg4 - (var26 >> 1)) < 0 || (arg4 + (var26 >> 1) + arg2.field2915) >= (arg2.field2912 << arg2.field2916) || arg6 - (var27 >> 1) < 0 || arg2.field2914 << arg2.field2916 <= (var27 >> 1) + arg2.field2915 + arg6) {
                return;
            }
            this.method1405(var29, 28377, arg5, var27, var28, var26, arg2, arg6, arg4);
        } else if (arg0 == 4) {
            int var24 = this.field4577 - this.field4588;
            for (int var25 = 0; var25 < this.field4574; var25++) {
                this.field4555[var25] = var24 + this.field4555[var25] + arg3.method853(this.field4559[var25] - -arg4, this.field4612[var25] + arg6) - arg5;
            }
        } else if (arg0 == 5) {
            int var17 = this.field4577 - this.field4588;
            for (int var18 = 0; var18 < this.field4574; var18++) {
                int var19 = this.field4559[var18] + arg4;
                int var20 = this.field4612[var18] + arg6;
                int var21 = arg2.method853(var19, var20);
                int var22 = arg3.method853(var19, var20);
                int var23 = var21 - var22;
                this.field4555[var18] = ((this.field4555[var18] << 8) / var17 * var23 >> 8) - (arg5 - var21);
            }
        }
        this.field4581 = false;
        if (this.field4541 != null) {
            this.field4541.field7567 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lrc;I)V")
    private final void method1987(class120 arg0, int arg1) {
        field4523++;
        if (this.field4587 != null) {
            for (int var3 = 0; var3 < this.field4587.length; var3++) {
                class525 var4 = this.field4587[var3];
                class525 var5 = var4;
                if (var4.field7767 != null) {
                    var5 = var4.field7767;
                }
                var5.field7754 = (int) ((float) this.field4612[var4.field7756] * arg0.field1693 + (float) this.field4559[var4.field7756] * arg0.field1704 + (float) this.field4555[var4.field7756] * arg0.field1710 + arg0.field1720);
                var5.field7753 = (int) ((float) this.field4612[var4.field7756] * arg0.field1717 + (float) this.field4559[var4.field7756] * arg0.field1699 + (float) this.field4555[var4.field7756] * arg0.field1698 + arg0.field1701);
                var5.field7766 = (int) ((float) this.field4612[var4.field7756] * arg0.field1708 + (float) this.field4559[var4.field7756] * arg0.field1712 + (float) this.field4555[var4.field7756] * arg0.field1718 + arg0.field1719);
                var5.field7761 = (int) ((float) this.field4612[var4.field7765] * arg0.field1693 + (float) this.field4559[var4.field7765] * arg0.field1704 + (float) this.field4555[var4.field7765] * arg0.field1710 + arg0.field1720);
                var5.field7768 = (int) ((float) this.field4612[var4.field7765] * arg0.field1717 + (float) this.field4559[var4.field7765] * arg0.field1699 + (float) this.field4555[var4.field7765] * arg0.field1698 + arg0.field1701);
                var5.field7757 = (int) ((float) this.field4612[var4.field7765] * arg0.field1708 + (float) this.field4559[var4.field7765] * arg0.field1712 + (float) this.field4555[var4.field7765] * arg0.field1718 + arg0.field1719);
                var5.field7750 = (int) ((float) this.field4612[var4.field7769] * arg0.field1693 + (float) this.field4559[var4.field7769] * arg0.field1704 + (float) this.field4555[var4.field7769] * arg0.field1710 + arg0.field1720);
                var5.field7764 = (int) ((float) this.field4612[var4.field7769] * arg0.field1717 + (float) this.field4559[var4.field7769] * arg0.field1699 + (float) this.field4555[var4.field7769] * arg0.field1698 + arg0.field1701);
                var5.field7755 = (int) ((float) this.field4612[var4.field7769] * arg0.field1708 + (float) this.field4559[var4.field7769] * arg0.field1712 + (float) this.field4555[var4.field7769] * arg0.field1718 + arg0.field1719);
            }
        }
        if (arg1 != -11292 || this.field4586 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field4586.length; var6++) {
            class439 var7 = this.field4586[var6];
            class439 var8 = var7;
            if (var7.field6534 != null) {
                var8 = var7.field6534;
            }
            if (var7.field6548 == null) {
                var7.field6548 = arg0.method183();
            } else {
                var7.field6548.method179(arg0);
            }
            var8.field6545 = (int) ((float) this.field4612[var7.field6535] * arg0.field1693 + (float) this.field4559[var7.field6535] * arg0.field1704 + (float) this.field4555[var7.field6535] * arg0.field1710 + arg0.field1720);
            var8.field6541 = (int) ((float) this.field4612[var7.field6535] * arg0.field1717 + (float) this.field4559[var7.field6535] * arg0.field1699 + (float) this.field4555[var7.field6535] * arg0.field1698 + arg0.field1701);
            var8.field6537 = (int) ((float) this.field4612[var7.field6535] * arg0.field1708 + (float) this.field4559[var7.field6535] * arg0.field1712 + (float) this.field4555[var7.field6535] * arg0.field1718 + arg0.field1719);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BZZLag;ILag;)Lc;")
    private final class201 method1988(byte arg0, boolean arg1, boolean arg2, class308 arg3, int arg4, class308 arg5) {
        field4569++;
        arg5.field4592 = this.field4592;
        arg5.field4583 = 0;
        arg5.field4542 = arg4;
        arg5.field4589 = this.field4589;
        arg5.field4574 = this.field4574;
        arg5.field4544 = this.field4544;
        if (arg0 >= -43) {
            this.method286();
        }
        arg5.field4535 = this.field4535;
        arg5.field4515 = this.field4515;
        arg5.field4550 = this.field4550;
        arg5.field4564 = this.field4564;
        arg5.field4618 = this.field4618;
        boolean var7 = class277.method1755(arg4, true, this.field4515);
        boolean var8 = class310.method1996(arg4, 122, this.field4515);
        boolean var9 = class300.method1935(this.field4515, arg4, 101);
        boolean var10 = var9 | var8 | var7;
        if (var10) {
            if (!var7) {
                arg5.field4559 = this.field4559;
            } else if (arg3.field4559 == null || this.field4589 > arg3.field4559.length) {
                arg5.field4559 = arg3.field4559 = new int[this.field4589];
            } else {
                arg5.field4559 = arg3.field4559;
            }
            if (!var8) {
                arg5.field4555 = this.field4555;
            } else if (arg3.field4555 == null || arg3.field4555.length < this.field4589) {
                arg5.field4555 = arg3.field4555 = new int[this.field4589];
            } else {
                arg5.field4555 = arg3.field4555;
            }
            if (!var9) {
                arg5.field4612 = this.field4612;
            } else if (arg3.field4612 == null || this.field4589 > arg3.field4612.length) {
                arg5.field4612 = arg3.field4612 = new int[this.field4589];
            } else {
                arg5.field4612 = arg3.field4612;
            }
            for (int var11 = 0; var11 < this.field4589; var11++) {
                if (var7) {
                    arg5.field4559[var11] = this.field4559[var11];
                }
                if (var8) {
                    arg5.field4555[var11] = this.field4555[var11];
                }
                if (var9) {
                    arg5.field4612[var11] = this.field4612[var11];
                }
            }
        } else {
            arg5.field4612 = this.field4612;
            arg5.field4555 = this.field4555;
            arg5.field4559 = this.field4559;
        }
        if (class202.method1407(arg4, this.field4515, false)) {
            arg5.field4541 = arg3.field4541;
            if (arg2) {
                arg5.field4583 = (byte) (arg5.field4583 | 0x1);
            }
            arg5.field4541.field7569 = this.field4541.field7569;
            arg5.field4541.field7567 = this.field4541.field7567;
        } else if (class6.method58(false, arg4, this.field4515)) {
            arg5.field4541 = this.field4541;
        } else {
            arg5.field4541 = null;
        }
        if (class408.method2490(arg4, (byte) -128, this.field4515)) {
            if (arg3.field4518 == null || arg3.field4518.length < this.field4592) {
                arg5.field4518 = arg3.field4518 = new short[this.field4592];
            } else {
                arg5.field4518 = arg3.field4518;
            }
            for (int var12 = 0; var12 < this.field4592; var12++) {
                arg5.field4518[var12] = this.field4518[var12];
            }
        } else {
            arg5.field4518 = this.field4518;
        }
        if (class81.method524(this.field4515, -126, arg4)) {
            if (arg3.field4536 == null || arg3.field4536.length < this.field4592) {
                arg5.field4536 = arg3.field4536 = new byte[this.field4592];
            } else {
                arg5.field4536 = arg3.field4536;
            }
            for (int var13 = 0; var13 < this.field4592; var13++) {
                arg5.field4536[var13] = this.field4536[var13];
            }
        } else {
            arg5.field4536 = this.field4536;
        }
        if (class170.method1196(arg4, 45056, this.field4515)) {
            if (arg2) {
                arg5.field4583 = (byte) (arg5.field4583 | 0x2);
            }
            arg5.field4576 = arg3.field4576;
            arg5.field4576.field7569 = this.field4576.field7569;
            arg5.field4576.field7567 = this.field4576.field7567;
        } else if (class253.method1649(this.field4515, (byte) 103, arg4)) {
            arg5.field4576 = this.field4576;
        } else {
            arg5.field4576 = null;
        }
        if (class172.method1208(arg4, this.field4515, -6118)) {
            if (arg3.field4547 == null || arg3.field4547.length < this.field4535) {
                int var14 = this.field4535;
                arg5.field4526 = arg3.field4526 = new short[var14];
                arg5.field4547 = arg3.field4547 = new short[var14];
                arg5.field4621 = arg3.field4621 = new short[var14];
            } else {
                arg5.field4547 = arg3.field4547;
                arg5.field4621 = arg3.field4621;
                arg5.field4526 = arg3.field4526;
            }
            if (this.field4572 == null) {
                for (int var18 = 0; var18 < this.field4535; var18++) {
                    arg5.field4547[var18] = this.field4547[var18];
                    arg5.field4526[var18] = this.field4526[var18];
                    arg5.field4621[var18] = this.field4621[var18];
                }
            } else {
                if (arg3.field4572 == null) {
                    arg3.field4572 = new class376();
                }
                class376 var15 = arg5.field4572 = arg3.field4572;
                if (var15.field5747 == null || this.field4535 > var15.field5747.length) {
                    int var16 = this.field4535;
                    var15.field5749 = new short[var16];
                    var15.field5744 = new byte[var16];
                    var15.field5747 = new short[var16];
                    var15.field5746 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field4535; var17++) {
                    arg5.field4547[var17] = this.field4547[var17];
                    arg5.field4526[var17] = this.field4526[var17];
                    arg5.field4621[var17] = this.field4621[var17];
                    var15.field5747[var17] = this.field4572.field5747[var17];
                    var15.field5746[var17] = this.field4572.field5746[var17];
                    var15.field5749[var17] = this.field4572.field5749[var17];
                    var15.field5744[var17] = this.field4572.field5744[var17];
                }
            }
            arg5.field4613 = this.field4613;
        } else {
            arg5.field4572 = this.field4572;
            arg5.field4621 = this.field4621;
            arg5.field4613 = this.field4613;
            arg5.field4526 = this.field4526;
            arg5.field4547 = this.field4547;
        }
        if (class379.method2347(arg4, this.field4515, -16)) {
            if (arg2) {
                arg5.field4583 = (byte) (arg5.field4583 | 0x4);
            }
            arg5.field4538 = arg3.field4538;
            arg5.field4538.field7567 = this.field4538.field7567;
            arg5.field4538.field7569 = this.field4538.field7569;
        } else if (class453.method2729((byte) -112, this.field4515, arg4)) {
            arg5.field4538 = this.field4538;
        } else {
            arg5.field4538 = null;
        }
        if (class511.method3045(this.field4515, (byte) 42, arg4)) {
            if (arg3.field4520 == null || arg3.field4520.length < this.field4592) {
                int var19 = this.field4535;
                arg5.field4528 = arg3.field4528 = new float[var19];
                arg5.field4520 = arg3.field4520 = new float[var19];
            } else {
                arg5.field4520 = arg3.field4520;
                arg5.field4528 = arg3.field4528;
            }
            for (int var20 = 0; var20 < this.field4535; var20++) {
                arg5.field4520[var20] = this.field4520[var20];
                arg5.field4528[var20] = this.field4528[var20];
            }
        } else {
            arg5.field4528 = this.field4528;
            arg5.field4520 = this.field4520;
        }
        if (class408.method2489(this.field4515, arg4, -22050)) {
            arg5.field4543 = arg3.field4543;
            if (arg2) {
                arg5.field4583 = (byte) (arg5.field4583 | 0x8);
            }
            arg5.field4543.field7569 = this.field4543.field7569;
            arg5.field4543.field7567 = this.field4543.field7567;
        } else if (class80.method518(this.field4515, 2048, arg4)) {
            arg5.field4543 = this.field4543;
        } else {
            arg5.field4543 = null;
        }
        if (class57.method389((byte) -101, this.field4515, arg4)) {
            if (arg3.field4575 == null || arg3.field4575.length < this.field4592) {
                int var21 = this.field4592;
                arg5.field4575 = arg3.field4575 = new short[var21];
                arg5.field4603 = arg3.field4603 = new short[var21];
                arg5.field4537 = arg3.field4537 = new short[var21];
            } else {
                arg5.field4575 = arg3.field4575;
                arg5.field4603 = arg3.field4603;
                arg5.field4537 = arg3.field4537;
            }
            for (int var22 = 0; var22 < this.field4592; var22++) {
                arg5.field4575[var22] = this.field4575[var22];
                arg5.field4537[var22] = this.field4537[var22];
                arg5.field4603[var22] = this.field4603[var22];
            }
        } else {
            arg5.field4603 = this.field4603;
            arg5.field4575 = this.field4575;
            arg5.field4537 = this.field4537;
        }
        if (class281.method1762(arg4, false, this.field4515)) {
            arg5.field4566 = arg3.field4566;
            if (arg2) {
                arg5.field4583 = (byte) (arg5.field4583 | 0x10);
            }
            arg5.field4566.field6255 = this.field4566.field6255;
        } else if (class290.method1874(-18, arg4, this.field4515)) {
            arg5.field4566 = this.field4566;
        } else {
            arg5.field4566 = null;
        }
        if (class393.method2416(95, arg4, this.field4515)) {
            if (arg3.field4517 == null || arg3.field4517.length < this.field4592) {
                int var23 = this.field4592;
                arg5.field4517 = arg3.field4517 = new short[var23];
            } else {
                arg5.field4517 = arg3.field4517;
            }
            for (int var24 = 0; var24 < this.field4592; var24++) {
                arg5.field4517[var24] = this.field4517[var24];
            }
        } else {
            arg5.field4517 = this.field4517;
        }
        if (!class523.method3102(this.field4515, arg4, false)) {
            arg5.field4524 = this.field4524;
        } else if (arg3.field4524 == null || this.field4550 > arg3.field4524.length) {
            int var26 = this.field4550;
            arg5.field4524 = arg3.field4524 = new class456[var26];
            for (int var27 = 0; var27 < this.field4550; var27++) {
                arg5.field4524[var27] = this.field4524[var27].method2744(95);
            }
        } else {
            arg5.field4524 = arg3.field4524;
            for (int var25 = 0; var25 < this.field4550; var25++) {
                arg5.field4524[var25].method2747(0, this.field4524[var25]);
            }
        }
        arg5.field4545 = this.field4545;
        arg5.field4521 = this.field4521;
        arg5.field4604 = this.field4604;
        arg5.field4530 = this.field4530;
        if (this.field4581) {
            arg5.field4588 = this.field4588;
            arg5.field4581 = true;
            arg5.field4551 = this.field4551;
            arg5.field4567 = this.field4567;
            arg5.field4577 = this.field4577;
            arg5.field4548 = this.field4548;
            arg5.field4522 = this.field4522;
            arg5.field4591 = this.field4591;
        } else {
            arg5.field4581 = false;
        }
        arg5.field4609 = this.field4609;
        arg5.field4586 = this.field4586;
        arg5.field4598 = this.field4598;
        arg5.field4580 = this.field4580;
        arg5.field4587 = this.field4587;
        arg5.field4594 = this.field4594;
        arg5.field4560 = this.field4560;
        return arg5;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    private final void method1989(int arg0) {
        field4540++;
        if (this.field4544 == 0) {
            return;
        }
        if (this.field4583 != 0) {
            this.method1984(true, -101);
        }
        if (arg0 <= 53) {
            this.field4579 = false;
        }
        this.method1984(false, -127);
        if (this.field4566 != null) {
            if (this.field4566.field6255 == null) {
                this.method1982(83, (this.field4583 & 0x10) != 0);
            }
            if (this.field4566.field6255 != null) {
                this.field4617.method1823(-23419, this.field4538 != null);
                this.field4617.method1790(this.field4543, (byte) 43, this.field4541, this.field4538, this.field4576);
                int var2 = this.field4521.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field4521[var3];
                    int var5 = this.field4521[var3 + 1];
                    int var6 = this.field4517[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field4617.method1785(this.field4538 != null, -21047, var6);
                    this.field4617.method1829(1, var4 * 3, (var5 - var4) * 3, this.field4566.field6255, 4);
                }
            }
        }
        this.method1986((byte) 122);
    }

    @OriginalMember(owner = "client!ag", name = "xa", descriptor = "(I[IIIIIZ)V")
    public final void method304(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4510++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            class249.field3457 = 0;
            class172.field2482 = 0;
            int var12 = 0;
            class228.field3268 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field4580.length > var14) {
                    int[] var15 = this.field4580[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class172.field2482 += this.field4559[var17];
                        class228.field3268 += this.field4555[var17];
                        class249.field3457 += this.field4612[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class172.field2482 = var11;
                class228.field3268 = var10;
                class249.field3457 = var9;
            } else {
                class249.field3457 = class249.field3457 / var12 + var9;
                class172.field2482 = class172.field2482 / var12 + var11;
                class228.field3268 = class228.field3268 / var12 + var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg2 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field4580.length > var22) {
                    int[] var23 = this.field4580[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field4559[var25] += var19;
                        this.field4555[var25] += var20;
                        this.field4612[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field4580.length > var45) {
                    int[] var46 = this.field4580[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field4559[var48] -= class172.field2482;
                            this.field4555[var48] -= class228.field3268;
                            this.field4612[var48] -= class249.field3457;
                            if (arg4 != 0) {
                                int var49 = class525.field7760[arg4];
                                int var50 = class525.field7763[arg4];
                                int var51 = this.field4559[var48] * var50 + this.field4555[var48] * var49 + 32767 >> 15;
                                this.field4555[var48] = this.field4555[var48] * var50 + 32767 - (this.field4559[var48] * var49) >> 15;
                                this.field4559[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class525.field7760[arg2];
                                int var53 = class525.field7763[arg2];
                                int var54 = this.field4555[var48] * var53 + 32767 - (this.field4612[var48] * var52) >> 15;
                                this.field4612[var48] = this.field4612[var48] * var53 + (this.field4555[var48] * var52 + 32767) >> 15;
                                this.field4555[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class525.field7760[arg3];
                                int var56 = class525.field7763[arg3];
                                int var57 = this.field4559[var48] * var56 + this.field4612[var48] * var55 + 32767 >> 15;
                                this.field4612[var48] = this.field4612[var48] * var56 + 32767 - (this.field4559[var48] * var55) >> 15;
                                this.field4559[var48] = var57;
                            }
                            this.field4559[var48] += class172.field2482;
                            this.field4555[var48] += class228.field3268;
                            this.field4612[var48] += class249.field3457;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field4559[var59] -= class172.field2482;
                            this.field4555[var59] -= class228.field3268;
                            this.field4612[var59] -= class249.field3457;
                            if (arg2 != 0) {
                                int var60 = class525.field7760[arg2];
                                int var61 = class525.field7763[arg2];
                                int var62 = this.field4555[var59] * var61 + 32767 - (this.field4612[var59] * var60) >> 15;
                                this.field4612[var59] = this.field4555[var59] * var60 + this.field4612[var59] * var61 + 32767 >> 15;
                                this.field4555[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class525.field7760[arg4];
                                int var64 = class525.field7763[arg4];
                                int var65 = this.field4559[var59] * var64 + this.field4555[var59] * var63 + 32767 >> 15;
                                this.field4555[var59] = this.field4555[var59] * var64 + 32767 - this.field4559[var59] * var63 >> 15;
                                this.field4559[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class525.field7760[arg3];
                                int var67 = class525.field7763[arg3];
                                int var68 = this.field4612[var59] * var66 + this.field4559[var59] * var67 + 32767 >> 15;
                                this.field4612[var59] = this.field4612[var59] * var67 + 32767 - (this.field4559[var59] * var66) >> 15;
                                this.field4559[var59] = var68;
                            }
                            this.field4559[var59] += class172.field2482;
                            this.field4555[var59] += class228.field3268;
                            this.field4612[var59] += class249.field3457;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field4580.length > var28) {
                        int[] var29 = this.field4580[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field4560[var31];
                            int var33 = this.field4560[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field4594[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class525.field7760[arg4];
                                    int var37 = class525.field7763[arg4];
                                    int var38 = this.field4526[var35] * var36 + (this.field4547[var35] * var37) + 32767 >> 15;
                                    this.field4526[var35] = (short) (this.field4526[var35] * var37 + 32767 - (this.field4547[var35] * var36) >> 15);
                                    this.field4547[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class525.field7760[arg2];
                                    int var40 = class525.field7763[arg2];
                                    int var41 = this.field4526[var35] * var40 + 32767 - (this.field4621[var35] * var39) >> 15;
                                    this.field4621[var35] = (short) (this.field4621[var35] * var40 + this.field4526[var35] * var39 + 32767 >> 15);
                                    this.field4526[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class525.field7760[arg3];
                                    int var43 = class525.field7763[arg3];
                                    int var44 = this.field4621[var35] * var42 + this.field4547[var35] * var43 + 32767 >> 15;
                                    this.field4621[var35] = (short) (this.field4621[var35] * var43 + 32767 - (this.field4547[var35] * var42) >> 15);
                                    this.field4547[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field4538 == null && this.field4576 != null) {
                    this.field4576.field7567 = null;
                }
                if (this.field4538 != null) {
                    this.field4538.field7567 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field4580.length > var70) {
                    int[] var71 = this.field4580[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field4559[var73] -= class172.field2482;
                        this.field4555[var73] -= class228.field3268;
                        this.field4612[var73] -= class249.field3457;
                        this.field4559[var73] = this.field4559[var73] * arg2 >> 7;
                        this.field4555[var73] = this.field4555[var73] * arg3 >> 7;
                        this.field4612[var73] = this.field4612[var73] * arg4 >> 7;
                        this.field4559[var73] += class172.field2482;
                        this.field4555[var73] += class228.field3268;
                        this.field4612[var73] += class249.field3457;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4604 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field4604.length > var78) {
                        int[] var79 = this.field4604[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field4536[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field4536[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field4576 != null) {
                            this.field4576.field7567 = null;
                        }
                    }
                }
                if (this.field4609 != null) {
                    for (int var75 = 0; var75 < this.field4550; var75++) {
                        class412 var76 = this.field4609[var75];
                        class456 var77 = this.field4524[var75];
                        var77.field6692 = 255 - (this.field4536[var76.field6191] & 0xFF) << 24 | var77.field6692 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field4604 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field4604.length) {
                        int[] var88 = this.field4604[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field4518[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x3C2) >> 7;
                            int var94 = arg2 + var92 & 0x3F;
                            int var95 = var91 & 0x7F;
                            int var96 = arg3 / 4 + var93;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            int var97 = arg4 + var95;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field4518[var90] = (short) class286.method1860(var97, class286.method1860(var94 << 10, var96 << 7));
                        }
                        if (var88.length > 0 && this.field4576 != null) {
                            this.field4576.field7567 = null;
                        }
                    }
                }
                if (this.field4609 != null) {
                    for (int var84 = 0; var84 < this.field4550; var84++) {
                        class412 var85 = this.field4609[var84];
                        class456 var86 = this.field4524[var84];
                        var86.field6692 = class249.field3466[this.field4518[var85.field6191] & 0xFFFF] & 0xFFFFFF | var86.field6692 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4598 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field4598.length) {
                        int[] var100 = this.field4598[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class456 var102 = this.field4524[var100[var101]];
                            var102.field6690 += arg3;
                            var102.field6689 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4598 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field4598.length > var104) {
                        int[] var105 = this.field4598[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class456 var107 = this.field4524[var105[var106]];
                            var107.field6688 = var107.field6688 * arg3 >> 7;
                            var107.field6691 = var107.field6691 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4598 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field4598.length) {
                    int[] var110 = this.field4598[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class456 var112 = this.field4524[var110[var111]];
                        var112.field6693 = var112.field6693 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "fa", descriptor = "()I")
    public final int method289() {
        field4606++;
        return this.field4618;
    }

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "()I")
    public final int method282() {
        if (!this.field4581) {
            this.method1977((byte) 31);
        }
        field4571++;
        return this.field4551;
    }

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "(SS)V")
    public final void method276(short arg0, short arg1) {
        field4519++;
        for (int var3 = 0; var3 < this.field4592; var3++) {
            if (this.field4518[var3] == arg0) {
                this.field4518[var3] = arg1;
            }
        }
        if (this.field4609 != null) {
            for (int var4 = 0; var4 < this.field4550; var4++) {
                class412 var5 = this.field4609[var4];
                class456 var6 = this.field4524[var4];
                var6.field6692 = var6.field6692 & 0xFF000000 | class249.field3466[this.field4518[var5.field6191] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field4576 != null) {
            this.field4576.field7567 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lc;IIIZ)V")
    public final void method298(class201 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4616++;
        class308 var6 = (class308) arg0;
        if (this.field4592 == 0 || var6.field4592 == 0) {
            return;
        }
        int var7 = var6.field4574;
        int[] var8 = var6.field4559;
        int[] var9 = var6.field4555;
        int[] var10 = var6.field4612;
        short[] var11 = var6.field4547;
        short[] var12 = var6.field4526;
        short[] var13 = var6.field4621;
        byte[] var14 = var6.field4613;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field4572 == null) {
            var17 = null;
            var15 = null;
            var18 = null;
            var16 = null;
        } else {
            var15 = this.field4572.field5744;
            var16 = this.field4572.field5746;
            var17 = this.field4572.field5749;
            var18 = this.field4572.field5747;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field4572 == null) {
            var21 = null;
            var19 = null;
            var22 = null;
            var20 = null;
        } else {
            var19 = var6.field4572.field5746;
            var20 = var6.field4572.field5749;
            var21 = var6.field4572.field5744;
            var22 = var6.field4572.field5747;
        }
        int[] var23 = var6.field4560;
        short[] var24 = var6.field4594;
        if (!var6.field4581) {
            var6.method1977((byte) 31);
        }
        short var25 = var6.field4588;
        short var26 = var6.field4577;
        short var27 = var6.field4548;
        short var28 = var6.field4591;
        short var29 = var6.field4522;
        short var30 = var6.field4551;
        for (int var31 = 0; var31 < this.field4574; var31++) {
            int var32 = this.field4555[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field4559[var31] - arg1;
                if (var27 <= var33 && var33 <= var28) {
                    int var34 = this.field4612[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field4560[var31];
                        int var37 = this.field4560[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field4594[var38] - 1;
                            if (var35 == -1 || this.field4613[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = var23[var39 + 1];
                                    int var42 = -1;
                                    for (int var43 = var40; var43 < var41; var43++) {
                                        var42 = var24[var43] - 1;
                                        if (var42 == -1 || var14[var42] != 0) {
                                            break;
                                        }
                                    }
                                    if (var42 != -1) {
                                        if (var18 == null) {
                                            this.field4572 = new class376();
                                            var18 = this.field4572.field5747 = class130.method823((byte) -33, this.field4547);
                                            var16 = this.field4572.field5746 = class130.method823((byte) -74, this.field4526);
                                            var17 = this.field4572.field5749 = class130.method823((byte) -89, this.field4621);
                                            var15 = this.field4572.field5744 = class277.method1756(this.field4613, 0);
                                        }
                                        if (var22 == null) {
                                            class376 var44 = var6.field4572 = new class376();
                                            var22 = var44.field5747 = class130.method823((byte) -34, var11);
                                            var19 = var44.field5746 = class130.method823((byte) -53, var12);
                                            var20 = var44.field5749 = class130.method823((byte) -24, var13);
                                            var21 = var44.field5744 = class277.method1756(var14, 0);
                                        }
                                        short var45 = this.field4547[var35];
                                        short var46 = this.field4526[var35];
                                        short var47 = this.field4621[var35];
                                        int var48 = var23[var39];
                                        byte var49 = this.field4613[var35];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var48; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var22[var52] += var45;
                                                var19[var52] += var46;
                                                var20[var52] += var47;
                                                var21[var52] += var49;
                                            }
                                        }
                                        byte var53 = var14[var42];
                                        short var54 = var13[var42];
                                        int var55 = this.field4560[var31];
                                        short var56 = var11[var42];
                                        int var57 = this.field4560[var31 + 1];
                                        short var58 = var12[var42];
                                        for (int var59 = var55; var59 < var57; var59++) {
                                            int var60 = this.field4594[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var18[var60] += var56;
                                                var16[var60] += var58;
                                                var17[var60] += var54;
                                                var15[var60] += var53;
                                            }
                                        }
                                        if (this.field4538 == null && this.field4576 != null) {
                                            this.field4576.field7567 = null;
                                        }
                                        if (this.field4538 != null) {
                                            this.field4538.field7567 = null;
                                        }
                                        if (var6.field4538 == null && var6.field4576 != null) {
                                            var6.field4576.field7567 = null;
                                        }
                                        if (var6.field4538 != null) {
                                            var6.field4538.field7567 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "()Z")
    public final boolean method299() {
        field4562++;
        if (this.field4517 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field4517.length; var1++) {
            if (this.field4517[var1] != -1 && !this.field4617.field7256.method1556(true, this.field4517[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "(IIII)V")
    public final void method281(int arg0, int arg1, int arg2, int arg3) {
        field4565++;
        if (arg0 == 0) {
            class228.field3268 = 0;
            int var5 = 0;
            class249.field3457 = 0;
            class172.field2482 = 0;
            for (int var6 = 0; var6 < this.field4574; var6++) {
                class172.field2482 += this.field4559[var6];
                class228.field3268 += this.field4555[var6];
                class249.field3457 += this.field4612[var6];
                var5++;
            }
            if (var5 <= 0) {
                class228.field3268 = arg2;
                class249.field3457 = arg3;
                class172.field2482 = arg1;
            } else {
                class228.field3268 = class228.field3268 / var5 + arg2;
                class172.field2482 = class172.field2482 / var5 + arg1;
                class249.field3457 = class249.field3457 / var5 + arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field4574; var7++) {
                this.field4559[var7] += arg1;
                this.field4555[var7] += arg2;
                this.field4612[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field4574; var8++) {
                this.field4559[var8] -= class172.field2482;
                this.field4555[var8] -= class228.field3268;
                this.field4612[var8] -= class249.field3457;
                if (arg3 != 0) {
                    int var9 = class525.field7760[arg3];
                    int var10 = class525.field7763[arg3];
                    int var11 = this.field4559[var8] * var10 + this.field4555[var8] * var9 + 32767 >> 15;
                    this.field4555[var8] = this.field4555[var8] * var10 - (this.field4559[var8] * var9 - 32767) >> 15;
                    this.field4559[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class525.field7760[arg1];
                    int var13 = class525.field7763[arg1];
                    int var14 = this.field4555[var8] * var13 + 32767 - (this.field4612[var8] * var12) >> 15;
                    this.field4612[var8] = this.field4612[var8] * var13 + this.field4555[var8] * var12 + 32767 >> 15;
                    this.field4555[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class525.field7760[arg2];
                    int var16 = class525.field7763[arg2];
                    int var17 = this.field4559[var8] * var16 + (this.field4612[var8] * var15 + 32767) >> 15;
                    this.field4612[var8] = this.field4612[var8] * var16 + 32767 - (this.field4559[var8] * var15) >> 15;
                    this.field4559[var8] = var17;
                }
                this.field4559[var8] += class172.field2482;
                this.field4555[var8] += class228.field3268;
                this.field4612[var8] += class249.field3457;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field4574; var18++) {
                this.field4559[var18] -= class172.field2482;
                this.field4555[var18] -= class228.field3268;
                this.field4612[var18] -= class249.field3457;
                this.field4559[var18] = this.field4559[var18] * arg1 / 128;
                this.field4555[var18] = this.field4555[var18] * arg2 / 128;
                this.field4612[var18] = this.field4612[var18] * arg3 / 128;
                this.field4559[var18] += class172.field2482;
                this.field4555[var18] += class228.field3268;
                this.field4612[var18] += class249.field3457;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field4592; var19++) {
                int var23 = (this.field4536[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field4536[var19] = (byte) var23;
            }
            if (this.field4576 != null) {
                this.field4576.field7567 = null;
            }
            if (this.field4609 != null) {
                for (int var20 = 0; var20 < this.field4550; var20++) {
                    class412 var21 = this.field4609[var20];
                    class456 var22 = this.field4524[var20];
                    var22.field6692 = 255 - (this.field4536[var21.field6191] & 0xFF) << 24 | var22.field6692 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field4592; var24++) {
                int var28 = this.field4518[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3D2) >> 7;
                int var31 = arg1 + var29 & 0x3F;
                int var32 = var28 & 0x7F;
                int var33 = arg2 / 4 + var30;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                int var34 = arg3 + var32;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field4518[var24] = (short) class286.method1860(class286.method1860(var31 << 10, var33 << 7), var34);
            }
            if (this.field4576 != null) {
                this.field4576.field7567 = null;
            }
            if (this.field4609 != null) {
                for (int var25 = 0; var25 < this.field4550; var25++) {
                    class412 var26 = this.field4609[var25];
                    class456 var27 = this.field4524[var25];
                    var27.field6692 = class249.field3466[this.field4518[var26.field6191] & 0xFFFF] & 0xFFFFFF | var27.field6692 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field4550; var35++) {
                class456 var36 = this.field4524[var35];
                var36.field6690 += arg2;
                var36.field6689 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field4550; var37++) {
                class456 var38 = this.field4524[var37];
                var38.field6691 = var38.field6691 * arg1 >> 7;
                var38.field6688 = var38.field6688 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field4550; var39++) {
                class456 var40 = this.field4524[var39];
                var40.field6693 = var40.field6693 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BIZ)Lc;")
    public final class201 method292(byte arg0, int arg1, boolean arg2) {
        field4590++;
        class308 var4;
        class308 var5;
        if (arg0 == 1) {
            var4 = this.field4617.field4141;
            var5 = this.field4617.field4129;
        } else if (arg0 == 2) {
            var5 = this.field4617.field4120;
            var4 = this.field4617.field4145;
        } else if (arg0 == 3) {
            var4 = this.field4617.field4208;
            var5 = this.field4617.field4220;
        } else if (arg0 == 4) {
            var4 = this.field4617.field4202;
            var5 = this.field4617.field4108;
        } else if (arg0 == 5) {
            var5 = this.field4617.field4170;
            var4 = this.field4617.field4218;
        } else {
            var5 = var4 = new class308(this.field4617);
        }
        return this.method1988((byte) -51, arg2, arg0 != 0, var4, arg1, var5);
    }

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "()V")
    public final void method284() {
        for (int var1 = 0; var1 < this.field4589; var1++) {
            this.field4559[var1] = this.field4559[var1] + 7 >> 4;
            this.field4555[var1] = this.field4555[var1] + 7 >> 4;
            this.field4612[var1] = this.field4612[var1] + 7 >> 4;
        }
        field4525++;
        this.field4581 = false;
        if (this.field4541 != null) {
            this.field4541.field7567 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILia;Z)Z")
    public final boolean method310(int arg0, int arg1, class23 arg2, boolean arg3) {
        field4595++;
        class120 var5 = (class120) arg2;
        class120 var6 = this.field4617.field4144;
        float var7 = var5.field1719 * var6.field1693 + var5.field1720 * var6.field1704 + var5.field1701 * var6.field1710 + var6.field1720;
        float var8 = var5.field1719 * var6.field1717 + var5.field1720 * var6.field1699 + var5.field1701 * var6.field1698 + var6.field1701;
        class390.field5917 = var5.field1708 * var6.field1717 + var5.field1717 * var6.field1698 + var5.field1693 * var6.field1699;
        class252.field3491 = var5.field1712 * var6.field1717 + var5.field1704 * var6.field1699 + var5.field1699 * var6.field1698;
        class397.field6041 = var5.field1712 * var6.field1693 + var5.field1704 * var6.field1704 + var5.field1699 * var6.field1710;
        class496.field7241 = var5.field1718 * var6.field1708 + var5.field1710 * var6.field1712 + var5.field1698 * var6.field1718;
        float var9 = var5.field1719 * var6.field1708 + var5.field1720 * var6.field1712 + var5.field1701 * var6.field1718 + var6.field1719;
        class467.field6808 = var5.field1712 * var6.field1708 + var5.field1704 * var6.field1712 + var5.field1699 * var6.field1718;
        class87.field1206 = var5.field1708 * var6.field1708 + var5.field1717 * var6.field1718 + var5.field1693 * var6.field1712;
        class479.field7001 = var5.field1718 * var6.field1693 + var5.field1710 * var6.field1704 + var5.field1698 * var6.field1710;
        class300.field4437 = var5.field1718 * var6.field1717 + var5.field1710 * var6.field1699 + var5.field1698 * var6.field1698;
        class29.field455 = var5.field1708 * var6.field1693 + var5.field1717 * var6.field1710 + var5.field1693 * var6.field1704;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field4617.field4200;
        int var16 = this.field4617.field4185;
        if (!this.field4581) {
            this.method1977((byte) 31);
        }
        class357.field5538[0] = this.field4548;
        class117.field1647[0] = this.field4588;
        class357.field5538[1] = this.field4591;
        class415.field6224[0] = this.field4522;
        class117.field1647[1] = this.field4588;
        class415.field6224[1] = this.field4522;
        class357.field5538[2] = this.field4548;
        class117.field1647[2] = this.field4577;
        class357.field5538[3] = this.field4591;
        class415.field6224[2] = this.field4522;
        class117.field1647[3] = this.field4577;
        class357.field5538[4] = this.field4548;
        class415.field6224[3] = this.field4522;
        class117.field1647[4] = this.field4588;
        class415.field6224[4] = this.field4551;
        class357.field5538[5] = this.field4591;
        class117.field1647[5] = this.field4588;
        class415.field6224[5] = this.field4551;
        class357.field5538[6] = this.field4548;
        class117.field1647[6] = this.field4577;
        class357.field5538[7] = this.field4591;
        class415.field6224[6] = this.field4551;
        class117.field1647[7] = this.field4577;
        class415.field6224[7] = this.field4551;
        for (int var17 = 0; var17 < 8; var17++) {
            float var36 = (float) class117.field1647[var17];
            float var37 = (float) class357.field5538[var17];
            float var38 = (float) class415.field6224[var17];
            float var39 = class87.field1206 * var38 + class496.field7241 * var36 + class467.field6808 * var37 + var9;
            float var40 = class390.field5917 * var38 + class300.field4437 * var36 + class252.field3491 * var37 + var8;
            float var41 = class29.field455 * var38 + class479.field7001 * var36 + class397.field6041 * var37 + var7;
            if (var39 >= (float) this.field4617.field4106) {
                float var42 = (float) var15 * var41 / var39 + (float) this.field4617.field4216;
                float var43 = (float) var16 * var40 / var39 + (float) this.field4617.field4127;
                if (var11 > var42) {
                    var11 = var42;
                }
                if (var42 > var12) {
                    var12 = var42;
                }
                if (var14 < var43) {
                    var14 = var43;
                }
                if (var43 < var13) {
                    var13 = var43;
                }
                var10 = true;
            }
        }
        if (var10 && var11 < (float) arg0 && var12 > (float) arg0 && (float) arg1 > var13 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field4535 > class454.field6674.length) {
                class530.field7821 = new int[this.field4535];
                class454.field6674 = new int[this.field4535];
            }
            for (int var18 = 0; var18 < this.field4574; var18++) {
                float var20 = (float) this.field4559[var18];
                float var21 = (float) this.field4555[var18];
                float var22 = (float) this.field4612[var18];
                float var23 = class87.field1206 * var22 + class496.field7241 * var21 + class467.field6808 * var20 + var9;
                float var24 = class390.field5917 * var22 + class300.field4437 * var21 + class252.field3491 * var20 + var8;
                float var25 = class29.field455 * var22 + class479.field7001 * var21 + class397.field6041 * var20 + var7;
                if ((float) this.field4617.field4106 <= var23) {
                    int var26 = (int) ((float) var15 * var25 / var23 + (float) this.field4617.field4216);
                    int var27 = (int) ((float) var16 * var24 / var23 + (float) this.field4617.field4127);
                    int var28 = this.field4560[var18];
                    int var29 = this.field4560[var18 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field4594[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        class454.field6674[var31] = var26;
                        class530.field7821[var31] = var27;
                    }
                } else {
                    int var32 = this.field4560[var18];
                    int var33 = this.field4560[var18 + 1];
                    for (int var34 = var32; var34 < var33; var34++) {
                        int var35 = this.field4594[var34] - 1;
                        if (var35 == -1) {
                            break;
                        }
                        class454.field6674[this.field4594[var34] - 1] = -999999;
                    }
                }
            }
            for (int var19 = 0; var19 < this.field4592; var19++) {
                if (class454.field6674[this.field4575[var19]] != -999999 && class454.field6674[this.field4537[var19]] != -999999 && class454.field6674[this.field4603[var19]] != -999999 && this.method1979(class530.field7821[this.field4603[var19]], class454.field6674[this.field4603[var19]], arg0, -93, class454.field6674[this.field4537[var19]], class530.field7821[this.field4575[var19]], class530.field7821[this.field4537[var19]], arg1, class454.field6674[this.field4575[var19]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ag", name = "FA", descriptor = "()Z")
    public final boolean method315() {
        field4584++;
        if (this.field4580 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field4589; var1++) {
            this.field4559[var1] <<= 0x4;
            this.field4555[var1] <<= 0x4;
            this.field4612[var1] <<= 0x4;
        }
        class249.field3457 = 0;
        class172.field2482 = 0;
        class228.field3268 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IFIILro;IJIFI)S")
    private final short method1990(int arg0, float arg1, int arg2, int arg3, class192 arg4, int arg5, long arg6, int arg7, float arg8, int arg9) {
        field4513++;
        int var12 = this.field4560[arg3];
        int var13 = this.field4560[arg3 + 1];
        int var14 = arg2;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field4594[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class199.field2811[var15] == arg6) {
                return (short) (var16 - 1);
            }
        }
        this.field4594[var14] = (short) (this.field4535 + 1);
        class199.field2811[var14] = arg6;
        this.field4547[this.field4535] = (short) arg9;
        this.field4526[this.field4535] = (short) arg5;
        this.field4621[this.field4535] = (short) arg0;
        this.field4613[this.field4535] = (byte) arg7;
        this.field4520[this.field4535] = arg1;
        this.field4528[this.field4535] = arg8;
        return (short) (this.field4535++);
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lbv;)V")
    public class308(class282 arg0) {
        this.field4617 = arg0;
        this.field4541 = new class509(null, 5126, 3, 0);
        this.field4543 = new class509(null, 5126, 2, 0);
        this.field4538 = new class509(null, 5126, 3, 0);
        this.field4576 = new class509(null, 5121, 4, 0);
        this.field4566 = new class419();
    }

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "(I)V")
    public final void method287(int arg0) {
        field4533++;
        int var2 = class525.field7760[arg0];
        int var3 = class525.field7763[arg0];
        for (int var4 = 0; var4 < this.field4574; var4++) {
            int var5 = this.field4559[var4] * var3 + this.field4555[var4] * var2 >> 15;
            this.field4555[var4] = this.field4555[var4] * var3 - (this.field4559[var4] * var2) >> 15;
            this.field4559[var4] = var5;
        }
        if (this.field4541 != null) {
            this.field4541.field7567 = null;
        }
        this.field4581 = false;
    }

    @OriginalMember(owner = "client!ag", name = "sa", descriptor = "()V")
    public final void method312() {
        for (int var1 = 0; var1 < this.field4574; var1++) {
            this.field4612[var1] = -this.field4612[var1];
        }
        field4531++;
        for (int var2 = 0; var2 < this.field4535; var2++) {
            this.field4621[var2] = (short) (-this.field4621[var2]);
        }
        for (int var3 = 0; var3 < this.field4592; var3++) {
            short var4 = this.field4575[var3];
            this.field4575[var3] = this.field4603[var3];
            this.field4603[var3] = var4;
        }
        if (this.field4538 == null && this.field4576 != null) {
            this.field4576.field7567 = null;
        }
        if (this.field4538 != null) {
            this.field4538.field7567 = null;
        }
        if (this.field4541 != null) {
            this.field4541.field7567 = null;
        }
        this.field4581 = false;
        if (this.field4566 != null) {
            this.field4566.field6255 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lbv;Lro;IIII)V")
    public class308(class282 arg0, class192 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4542 = arg2;
        this.field4617 = arg0;
        this.field4515 = arg5;
        if (class6.method58(false, arg2, arg5)) {
            this.field4541 = new class509(null, 5126, 3, 0);
        }
        if (class80.method518(arg5, 2048, arg2)) {
            this.field4543 = new class509(null, 5126, 2, 0);
        }
        if (class453.method2729((byte) -112, arg5, arg2)) {
            this.field4538 = new class509(null, 5126, 3, 0);
        }
        if (class253.method1649(arg5, (byte) 103, arg2)) {
            this.field4576 = new class509(null, 5121, 4, 0);
        }
        if (class290.method1874(-18, arg2, arg5)) {
            this.field4566 = new class419();
        }
        class373 var7 = arg0.field7256;
        int[] var8 = new int[arg1.field2680];
        this.field4560 = new int[arg1.field2718 + 1];
        for (int var9 = 0; var9 < arg1.field2680; var9++) {
            if ((arg1.field2676 == null || arg1.field2676[var9] != 2) && (arg1.field2707 == null || arg1.field2707[var9] == -1 || !var7.method1558(arg1.field2707[var9] & 0xFFFF, (byte) 107).field3663)) {
                var8[this.field4592++] = var9;
                this.field4560[arg1.field2721[var9]]++;
                this.field4560[arg1.field2711[var9]]++;
                this.field4560[arg1.field2701[var9]]++;
            }
        }
        this.field4544 = this.field4592;
        long[] var10 = new long[this.field4592];
        boolean var11 = (this.field4542 & 0x100) != 0;
        label494: for (int var12 = 0; var12 < this.field4592; var12++) {
            int var180 = var8[var12];
            class263 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field2673 != null) {
                for (int var186 = 0; var186 < arg1.field2673.length; var186++) {
                    class220 var187 = arg1.field2673[var186];
                    if (var187.field3086 == var180) {
                        class320 var188 = class411.method2501(var187.field3082, 0);
                        if (var188.field4902) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field4544--;
                            continue label494;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field2707 != null) {
                var189 = arg1.field2707[var180];
                if (var189 != -1) {
                    var181 = var7.method1558(var189 & 0xFFFF, (byte) 114);
                    var184 = var181.field3671;
                    var185 = var181.field3656;
                }
            }
            boolean var190 = arg1.field2682 != null && arg1.field2682[var180] != 0 || var181 != null && !var181.field3672;
            if ((var11 || var190) && arg1.field2700 != null) {
                var182 += arg1.field2700[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = (var184 & 0xFF << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = (var189 & 0xFFFF << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + (long) var194;
        }
        class382.method2371(var8, var10, -15744);
        this.field4545 = arg1.field2717;
        this.field4555 = arg1.field2693;
        this.field4589 = arg1.field2704;
        this.field4559 = arg1.field2669;
        this.field4612 = arg1.field2689;
        this.field4574 = arg1.field2718;
        class477[] var13 = new class477[this.field4574];
        this.field4586 = arg1.field2686;
        this.field4587 = arg1.field2691;
        if (arg1.field2673 != null) {
            this.field4550 = arg1.field2673.length;
            this.field4609 = new class412[this.field4550];
            this.field4524 = new class456[this.field4550];
            for (int var14 = 0; var14 < this.field4550; var14++) {
                class220 var15 = arg1.field2673[var14];
                class320 var16 = class411.method2501(var15.field3082, 0);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field4592; var18++) {
                    if (var8[var18] == var15.field3086) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class249.field3466[arg1.field2688[var15.field3086] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field2682 == null ? 0 : arg1.field2682[var15.field3086]) << 24;
                this.field4609[var14] = new class412(var17, arg1.field2721[var15.field3086], arg1.field2711[var15.field3086], arg1.field2701[var15.field3086], var16.field4898, var16.field4908, var16.field4899, var16.field4909, var16.field4901, var16.field4902, var16.field4900, var15.field3083);
                this.field4524[var14] = new class456(var20);
            }
        }
        int var21 = this.field4592 * 3;
        this.field4575 = new short[this.field4592];
        if (arg1.field2683 != null) {
            this.field4530 = new short[this.field4592];
        }
        this.field4603 = new short[this.field4592];
        this.field4526 = new short[var21];
        this.field4621 = new short[var21];
        this.field4520 = new float[var21];
        this.field4618 = (short) arg3;
        this.field4517 = new short[this.field4592];
        this.field4613 = new byte[var21];
        this.field4528 = new float[var21];
        class199.field2811 = new long[var21];
        this.field4537 = new short[this.field4592];
        this.field4594 = new short[var21];
        this.field4536 = new byte[this.field4592];
        this.field4518 = new short[this.field4592];
        this.field4547 = new short[var21];
        this.field4564 = (short) arg4;
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field2718; var23++) {
            int var179 = this.field4560[var23];
            this.field4560[var23] = var22;
            var13[var23] = new class477();
            var22 += var179;
        }
        this.field4560[arg1.field2718] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field2705 != null) {
            int var28 = arg1.field2696;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            var24 = new int[var28];
            for (int var36 = 0; var36 < this.field4592; var36++) {
                int var43 = var8[var36];
                if (arg1.field2705[var43] != -1) {
                    int var44 = arg1.field2705[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field2721[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field2711[var43];
                        } else {
                            var46 = arg1.field2701[var43];
                        }
                        int var47 = arg1.field2669[var46];
                        int var48 = arg1.field2693[var46];
                        int var49 = arg1.field2689[var46];
                        if (var29[var44] > var47) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var32[var44] < var48) {
                            var32[var44] = var48;
                        }
                        if (var33[var44] > var49) {
                            var33[var44] = var49;
                        }
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field2672[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field2674[var37];
                        var41 = 64.0F / (float) arg1.field2677[var37];
                        if (var42 == 0) {
                            var39 = 1.0F;
                            var40 = 1.0F;
                        } else if (var42 > 0) {
                            var40 = 1.0F;
                            var39 = (float) var42 / 1024.0F;
                        } else {
                            var40 = (float) (-var42) / 1024.0F;
                            var39 = 1.0F;
                        }
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field2709[var37];
                        var40 = 64.0F / (float) arg1.field2674[var37];
                        var41 = 64.0F / (float) arg1.field2677[var37];
                    } else {
                        var40 = (float) arg1.field2674[var37] / 1024.0F;
                        var41 = (float) arg1.field2677[var37] / 1024.0F;
                        var39 = (float) arg1.field2709[var37] / 1024.0F;
                    }
                    var27[var37] = class514.method3060(var39, var41, arg1.field2715[var37], class494.method2942(arg1.field2723[var37], 255), (byte) 99, arg1.field2710[var37], var40, arg1.field2703[var37]);
                }
            }
        }
        class427[] var50 = new class427[arg1.field2680];
        for (int var51 = 0; var51 < arg1.field2680; var51++) {
            short var158 = arg1.field2721[var51];
            short var159 = arg1.field2711[var51];
            short var160 = arg1.field2701[var51];
            int var161 = this.field4559[var159] - this.field4559[var158];
            int var162 = this.field4555[var159] - this.field4555[var158];
            int var163 = this.field4612[var159] - this.field4612[var158];
            int var164 = this.field4559[var160] - this.field4559[var158];
            int var165 = this.field4555[var160] - this.field4555[var158];
            int var166 = this.field4612[var160] - this.field4612[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - var161 * var166;
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var168 >>= 0x1;
                var169 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var167 * var167 + (var168 * var168) + (var169 * var169)));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var167 * 256 / var170;
            int var172 = var168 * 256 / var170;
            int var173 = var169 * 256 / var170;
            byte var174 = arg1.field2676 == null ? 0 : arg1.field2676[var51];
            if (var174 == 0) {
                class477 var175 = var13[var158];
                var175.field6935++;
                var175.field6934 += var171;
                var175.field6938 += var172;
                var175.field6940 += var173;
                class477 var176 = var13[var159];
                var176.field6938 += var172;
                var176.field6934 += var171;
                var176.field6935++;
                var176.field6940 += var173;
                class477 var177 = var13[var160];
                var177.field6934 += var171;
                var177.field6940 += var173;
                var177.field6938 += var172;
                var177.field6935++;
            } else if (var174 == 1) {
                class427 var178 = var50[var51] = new class427();
                var178.field6355 = var172;
                var178.field6356 = var173;
                var178.field6351 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field4592; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field2688[var68] & 0xFFFF;
            short var70;
            if (arg1.field2707 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field2707[var68];
            }
            int var71;
            if (arg1.field2705 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field2705[var68];
            }
            int var72;
            if (arg1.field2682 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field2682[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var75 = 1.0F;
                    var77 = 0.0F;
                    var78 = 0.0F;
                    var80 = 2;
                    var73 = 0.0F;
                    var74 = 1.0F;
                    var79 = 1;
                    var76 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field2672[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field2721[var68];
                        short var112 = arg1.field2711[var68];
                        short var113 = arg1.field2701[var68];
                        short var114 = arg1.field2715[var71];
                        short var115 = arg1.field2703[var71];
                        short var116 = arg1.field2710[var71];
                        float var117 = (float) arg1.field2669[var114];
                        float var118 = (float) arg1.field2693[var114];
                        float var119 = (float) arg1.field2689[var114];
                        float var120 = (float) arg1.field2669[var115] - var117;
                        float var121 = (float) arg1.field2693[var115] - var118;
                        float var122 = (float) arg1.field2689[var115] - var119;
                        float var123 = (float) arg1.field2669[var116] - var117;
                        float var124 = (float) arg1.field2693[var116] - var118;
                        float var125 = (float) arg1.field2689[var116] - var119;
                        float var126 = (float) arg1.field2669[var111] - var117;
                        float var127 = (float) arg1.field2693[var111] - var118;
                        float var128 = (float) arg1.field2689[var111] - var119;
                        float var129 = (float) arg1.field2669[var112] - var117;
                        float var130 = (float) arg1.field2693[var112] - var118;
                        float var131 = (float) arg1.field2689[var112] - var119;
                        float var132 = (float) arg1.field2669[var113] - var117;
                        float var133 = (float) arg1.field2693[var113] - var118;
                        float var134 = (float) arg1.field2689[var113] - var119;
                        float var135 = var121 * var125 - var122 * var124;
                        float var136 = var122 * var123 - var120 * var125;
                        float var137 = var120 * var124 - var121 * var123;
                        float var138 = var124 * var137 - var125 * var136;
                        float var139 = var125 * var135 - (var123 * var137);
                        float var140 = var123 * var136 - (var124 * var135);
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        float var142 = var120 * var136 - var121 * var135;
                        float var143 = var121 * var137 - (var122 * var136);
                        float var144 = var122 * var135 - (var120 * var137);
                        float var145 = 1.0F / (var125 * var142 + var123 * var143 + var124 * var144);
                        var74 = (var128 * var142 + var126 * var143 + var127 * var144) * var145;
                        var76 = (var131 * var142 + var129 * var143 + var130 * var144) * var145;
                        var78 = (var134 * var142 + var132 * var143 + var133 * var144) * var145;
                    } else {
                        short var83 = arg1.field2721[var68];
                        short var84 = arg1.field2711[var68];
                        short var85 = arg1.field2701[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field2695[var71];
                        float var91 = (float) arg1.field2698[var71] / 256.0F;
                        if (var82 == 1) {
                            float var109 = (float) arg1.field2709[var71] / 1024.0F;
                            class484.method2889(var88, arg1.field2669[var83], var89, var90, arg1.field2689[var83], -99, var91, var109, var86, arg1.field2693[var83], var87);
                            var74 = class428.field6370;
                            var73 = class222.field3108;
                            class484.method2889(var88, arg1.field2669[var84], var89, var90, arg1.field2689[var84], -128, var91, var109, var86, arg1.field2693[var84], var87);
                            var75 = class222.field3108;
                            var76 = class428.field6370;
                            class484.method2889(var88, arg1.field2669[var85], var89, var90, arg1.field2689[var85], -96, var91, var109, var86, arg1.field2693[var85], var87);
                            var78 = class428.field6370;
                            var77 = class222.field3108;
                            float var110 = var109 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if (var110 < var77 - var73) {
                                    var80 = 1;
                                    var77 -= var109;
                                } else if (var110 < var73 - var77) {
                                    var77 += var109;
                                    var80 = 2;
                                }
                                if ((var110 < var75 - var73)) {
                                    var79 = 1;
                                    var75 -= var109;
                                } else if (var110 < var73 - var75) {
                                    var75 += var109;
                                    var79 = 2;
                                }
                            } else {
                                if ((var76 - var74 > var110)) {
                                    var79 = 1;
                                    var76 -= var109;
                                } else if (var110 < var74 - var76) {
                                    var79 = 2;
                                    var76 += var109;
                                }
                                if (var78 - var74 > var110) {
                                    var80 = 1;
                                    var78 -= var109;
                                } else if (var110 < var74 - var78) {
                                    var80 = 2;
                                    var78 += var109;
                                }
                            }
                        } else if (var82 == 2) {
                            float var92 = (float) arg1.field2670[var71] / 256.0F;
                            float var93 = (float) arg1.field2716[var71] / 256.0F;
                            int var94 = arg1.field2669[var84] - arg1.field2669[var83];
                            int var95 = arg1.field2693[var84] - arg1.field2693[var83];
                            int var96 = arg1.field2689[var84] - arg1.field2689[var83];
                            int var97 = arg1.field2669[var85] - arg1.field2669[var83];
                            int var98 = arg1.field2693[var85] - arg1.field2693[var83];
                            int var99 = arg1.field2689[var85] - arg1.field2689[var83];
                            int var100 = var95 * var99 - (var96 * var98);
                            int var101 = var96 * var97 - (var94 * var99);
                            int var102 = var94 * var98 - var95 * var97;
                            float var103 = 64.0F / (float) arg1.field2674[var71];
                            float var104 = 64.0F / (float) arg1.field2677[var71];
                            float var105 = 64.0F / (float) arg1.field2709[var71];
                            float var106 = (var89[2] * (float) var102 + var89[1] * (float) var101 + var89[0] * (float) var100) / var103;
                            float var107 = (var89[5] * (float) var102 + var89[3] * (float) var100 + var89[4] * (float) var101) / var104;
                            float var108 = (var89[8] * (float) var102 + var89[6] * (float) var100 + var89[7] * (float) var101) / var105;
                            var81 = class417.method2526(var106, (byte) 60, var108, var107);
                            class104.method698(var87, var81, var86, var92, var88, var90, var93, arg1.field2693[var83], 0, arg1.field2669[var83], arg1.field2689[var83], var89, var91);
                            var74 = class404.field6113;
                            var73 = class25.field414;
                            class104.method698(var87, var81, var86, var92, var88, var90, var93, arg1.field2693[var84], 0, arg1.field2669[var84], arg1.field2689[var84], var89, var91);
                            var76 = class404.field6113;
                            var75 = class25.field414;
                            class104.method698(var87, var81, var86, var92, var88, var90, var93, arg1.field2693[var85], 0, arg1.field2669[var85], arg1.field2689[var85], var89, var91);
                            var78 = class404.field6113;
                            var77 = class25.field414;
                        } else if (var82 == 3) {
                            class141.method947(var91, var90, arg1.field2693[var83], arg1.field2669[var83], (byte) -87, var87, var86, arg1.field2689[var83], var88, var89);
                            var74 = class470.field6874;
                            var73 = class349.field5439;
                            class141.method947(var91, var90, arg1.field2693[var84], arg1.field2669[var84], (byte) -87, var87, var86, arg1.field2689[var84], var88, var89);
                            var75 = class349.field5439;
                            var76 = class470.field6874;
                            class141.method947(var91, var90, arg1.field2693[var85], arg1.field2669[var85], (byte) -87, var87, var86, arg1.field2689[var85], var88, var89);
                            var77 = class349.field5439;
                            var78 = class470.field6874;
                            if ((var90 & 0x1) == 0) {
                                if ((var77 - var73 > 0.5F)) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                                if ((var75 - var73 > 0.5F)) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                            } else {
                                if ((var76 - var74 > 0.5F)) {
                                    var79 = 1;
                                    var76--;
                                } else if (var74 - var76 > 0.5F) {
                                    var79 = 2;
                                    var76++;
                                }
                                if ((var78 - var74 > 0.5F)) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field2676 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field2676[var68];
            }
            if (var146 == 0) {
                long var150 = (long) (var71 << 2) + ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32);
                short var152 = arg1.field2721[var68];
                short var153 = arg1.field2711[var68];
                short var154 = arg1.field2701[var68];
                class477 var155 = var13[var152];
                this.field4575[var52] = this.method1990(var155.field6940, var73, 0, var152, arg1, var155.field6938, var150, var155.field6935, var74, var155.field6934);
                class477 var156 = var13[var153];
                this.field4537[var52] = this.method1990(var156.field6940, var75, 0, var153, arg1, var156.field6938, (long) var79 + var150, var156.field6935, var76, var156.field6934);
                class477 var157 = var13[var154];
                this.field4603[var52] = this.method1990(var157.field6940, var77, 0, var154, arg1, var157.field6938, (long) var80 + var150, var157.field6935, var78, var157.field6934);
            } else if (var146 == 1) {
                class427 var147 = var50[var68];
                long var148 = ((long) (var81 << 24) + ((long) var72) + (long) (var69 << 8) << 32) + (long) ((var147.field6356 + 256 << 22) + (var147.field6355 + 256 << 12) + (var147.field6351 <= 0 ? 2048 : 1024) + (var71 << 2));
                this.field4575[var52] = this.method1990(var147.field6356, var73, 0, arg1.field2721[var68], arg1, var147.field6355, var148, 0, var74, var147.field6351);
                this.field4537[var52] = this.method1990(var147.field6356, var75, 0, arg1.field2711[var68], arg1, var147.field6355, (long) var79 + var148, 0, var76, var147.field6351);
                this.field4603[var52] = this.method1990(var147.field6356, var77, 0, arg1.field2701[var68], arg1, var147.field6355, (long) var80 + var148, 0, var78, var147.field6351);
            }
            if (arg1.field2707 == null) {
                this.field4517[var52] = -1;
            } else {
                this.field4517[var52] = arg1.field2707[var68];
            }
            if (arg1.field2682 != null) {
                this.field4536[var52] = arg1.field2682[var68];
            }
            if (arg1.field2683 != null) {
                this.field4530[var52] = arg1.field2683[var68];
            }
            this.field4518[var52] = arg1.field2688[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field4544; var55++) {
            short var67 = this.field4517[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field4521 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field4544; var58++) {
            short var66 = this.field4517[var58];
            if (var56 != var66) {
                var56 = var66;
                this.field4521[var57++] = var58;
            }
        }
        this.field4521[var57] = this.field4544;
        class199.field2811 = null;
        this.field4547 = class283.method1851((byte) -34, this.field4535, this.field4547);
        this.field4526 = class283.method1851((byte) -34, this.field4535, this.field4526);
        this.field4621 = class283.method1851((byte) -34, this.field4535, this.field4621);
        this.field4613 = class356.method2256(this.field4535, false, this.field4613);
        this.field4520 = class501.method2991(this.field4520, 108, this.field4535);
        this.field4528 = class501.method2991(this.field4528, 59, this.field4535);
        if (arg1.field2671 != null && class503.method3005(this.field4515, (byte) 55, arg2)) {
            this.field4580 = arg1.method1344(true);
        }
        if (arg1.field2673 != null && class202.method1411(arg2, -113, this.field4515)) {
            this.field4598 = arg1.method1342(0);
        }
        if (arg1.field2722 != null && class72.method486(this.field4515, 27650, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field4592; var61++) {
                int var65 = arg1.field2722[var8[var61]];
                if (var65 >= 0) {
                    if (var59 < var65) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field4604 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field4604[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field4592; var63++) {
                int var64 = arg1.field2722[var8[var63]];
                if (var64 >= 0) {
                    this.field4604[var64][var60[var64]++] = var63;
                }
            }
        }
    }
}
