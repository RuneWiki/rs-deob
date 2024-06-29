import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class310 extends class116 {

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "Z")
    private boolean field4524 = false;

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
    private int field4530 = 0;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    private int field4525 = 0;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "I")
    private int field4531 = 0;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "I")
    private int field4537 = 0;

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "I")
    private int field4546;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
    private int field4533;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "Lnd;")
    private class632 field4539;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "Ldea;")
    private class405 field4520;

    @OriginalMember(owner = "client!tt", name = "D", descriptor = "Z")
    private boolean field4549;

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "Z")
    private boolean field4544;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "Z")
    private boolean field4528;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "Z")
    private boolean field4526;

    @OriginalMember(owner = "client!tt", name = "C", descriptor = "Lio;")
    public static class151 field4548 = new class151(0, 2, 2, 1);

    @OriginalMember(owner = "client!tt", name = "E", descriptor = "Luaa;")
    public static class395 field4550 = new class395(200);

    @OriginalMember(owner = "client!tt", name = "I", descriptor = "I")
    public static int field4553 = 0;

    @OriginalMember(owner = "client!tt", name = "J", descriptor = "[I")
    public static int[] field4554 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!tt", name = "F", descriptor = "[I")
    public static int[] field4551;

    @OriginalMember(owner = "client!tt", name = "G", descriptor = "[[[I")
    public static int[][][] field4552;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1931(byte arg0) {
        int var1 = 117 % ((82 - arg0) / 42);
        for (int var2 = 0; var2 < class601.field8529; var2++) {
            int var3 = class513.field7105[var2];
            class170 var4 = ((class181) class432.field6368.method740(0, (long) var3)).field2623;
            int var5 = class52.field761.method1738(255);
            if ((var5 & 0x10) != 0) {
                var5 += class52.field761.method1738(255) << 8;
            }
            if ((var5 & 0x100) != 0) {
                var4.field1540 = class52.field761.method1733(false);
                var4.field1521 = class52.field761.method1714(-31536);
                var4.field1479 = class52.field761.method1714(-31536);
                var4.field1485 = (byte) class52.field761.method1701(255);
                var4.field1515 = field4553 + class52.field761.method1723((byte) 122);
                var4.field1523 = field4553 + class52.field761.method1720(-17391);
            }
            if ((var5 & 0x2000) != 0) {
                var4.field2487 = class52.field761.method1723((byte) 121);
                var4.field2469 = class52.field761.method1720(-17391);
            }
            if ((var5 & 0x1) != 0) {
                var4.field1512 = class52.field761.method1752(false);
                var4.field1562 = 100;
            }
            if ((var5 & 0x4) != 0) {
                if (var4.field2492.method2573(-118)) {
                    class440.method2602((byte) 18, var4);
                }
                var4.method1177(class204.field2882.method287(class52.field761.method1750(true), 8), (byte) 118);
                var4.method776((byte) -121, var4.field2492.field6337);
                var4.field1550 = var4.field2492.field6350 << 3;
                if (var4.field2492.method2573(-57)) {
                    class589.method3371(var4.field1571[0], 0, null, var4.field1572[0], var4.field5116, null, (byte) -88, var4);
                }
            }
            if ((var5 & 0x2) != 0) {
                int var6 = class52.field761.method1723((byte) 83);
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = class52.field761.method1744(-78);
                class562.method3203(var4, var7, var6, 9656);
            }
            if ((var5 & 0x20) != 0) {
                int var8 = class52.field761.method1750(true);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class52.field761.method1740((byte) -118);
                int var10 = class52.field761.method1689(-51);
                var4.method773(var9, true, var8, false, var10);
            }
            if ((var5 & 0x80) != 0) {
                var4.field1526 = class52.field761.method1720(-17391);
                if (var4.field1526 == 65535) {
                    var4.field1526 = -1;
                }
            }
            if ((var5 & 0x200) != 0) {
                int var11 = class52.field761.method1745(32132);
                var4.field1474 = class52.field761.method1689(-26);
                var4.field1528 = class52.field761.method1744(81);
                var4.field1501 = var11 & 0x7FFF;
                var4.field1517 = (var11 & 0x8000) != 0;
                var4.field1490 = field4553 + var4.field1501 + var4.field1474;
            }
            if ((var5 & 0x800) != 0) {
                int var12 = class52.field761.method1744(-105);
                int[] var13 = new int[var12];
                int[] var14 = new int[var12];
                int[] var15 = new int[var12];
                for (int var16 = 0; var16 < var12; var16++) {
                    int var17 = class52.field761.method1750(true);
                    if (var17 == 65535) {
                        var17 = -1;
                    }
                    var13[var16] = var17;
                    var14[var16] = class52.field761.method1744(-79);
                    var15[var16] = class52.field761.method1723((byte) 101);
                }
                class558.method3142(var15, var4, var14, var13, (byte) -106);
            }
            if ((var5 & 0x400) != 0) {
                var4.field1480 = class52.field761.method1733(false);
                var4.field1536 = class52.field761.method1706((byte) 101);
                var4.field1478 = class52.field761.method1733(false);
                var4.field1498 = class52.field761.method1733(false);
                var4.field1527 = class52.field761.method1723((byte) 126) + field4553;
                var4.field1524 = class52.field761.method1723((byte) 104) + field4553;
                var4.field1475 = class52.field761.method1744(-122);
                var4.field1576 = 0;
                var4.field1498 += var4.field1572[0];
                var4.field1478 += var4.field1571[0];
                var4.field1480 += var4.field1571[0];
                var4.field1567 = 1;
                var4.field1536 += var4.field1572[0];
            }
            if ((var5 & 0x40) != 0) {
                int var18 = class52.field761.method1749((byte) -66);
                int var19 = class52.field761.method1701(255);
                var4.method787(-70, var18, field4553, var19);
            }
            if ((var5 & 0x8) != 0) {
                int var20 = class52.field761.method1749((byte) -60);
                int var21 = class52.field761.method1689(-34);
                var4.method787(-70, var20, field4553, var21);
                var4.field1547 = field4553 + 300;
                var4.field1548 = class52.field761.method1744(-79);
            }
            if ((var5 & 0x1000) != 0) {
                int var22 = class52.field761.method1750(true);
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = class52.field761.method1748(115);
                int var24 = class52.field761.method1738(255);
                var4.method773(var23, true, var22, true, var24);
            }
        }
        field4547++;
    }

    @OriginalMember(owner = "client!tt", name = "DA", descriptor = "(IIIII)V", line = 210)
    public final void method668(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4545++;
        class516 var6 = this.field4539.method3617(-123);
        class516 var7 = this.field4539.method3595((byte) 40);
        int var8 = this.field4530 + arg1;
        int var9 = this.field4525 + arg0;
        this.field4520.method840(class174.field2517, 52);
        this.field4539.method3618(88);
        this.field4539.method3577(this.field4520, true);
        this.field4539.method3624(-100, arg4);
        this.field4539.method3600(-124, arg2);
        this.field4539.method3601(-6, class104.field1753, 1);
        this.field4539.method3570(class104.field1753, 1, (byte) -108);
        this.field4539.method3574(false, arg3);
        var6.method2902((float) this.field4533, (float) this.field4546, (byte) 2, 0.0F);
        var6.method877(var9, var8, 0);
        var7.method2902(this.field4520.method1532(-8221, (float) this.field4533), this.field4520.method1531(false, (float) this.field4546), (byte) 2, 1.0F);
        this.field4539.method3616(class577.field8230, (byte) 94);
        this.field4539.method3579(109);
        this.field4539.method3615((byte) -128);
        this.field4539.method3627(-87);
        this.field4539.method3601(-66, class554.field7834, 1);
        this.field4539.method3570(class554.field7834, 1, (byte) -79);
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "()I", line = 243)
    public final int method962() {
        field4527++;
        return this.field4533;
    }

    @OriginalMember(owner = "client!tt", name = "P", descriptor = "(IIIIII)V", line = 252)
    public final void method662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4542++;
        int[] var7 = this.field4539.method103(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class188.method1258(var7[var8], -16777216);
            }
            this.method1933(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(FFFFFFLpa;II)V", line = 274)
    public final void method966(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class593 arg6, int arg7, int arg8) {
        field4536++;
        class516 var10 = this.field4539.method3617(121);
        class516 var11 = this.field4539.method3595((byte) 40);
        class117 var12 = (class117) arg6;
        class405 var13 = var12.field1904;
        this.field4520.method840(class549.field7730, -124);
        this.field4539.method3618(45);
        this.field4539.method3577(this.field4520, true);
        this.field4539.method3624(-71, 1);
        this.field4539.method3600(-76, 1);
        if (this.field4524) {
            float var14 = (float) this.field4533 / (float) this.method955();
            float var15 = (float) this.field4546 / (float) this.method960();
            var10.method2898(0.0F, (arg4 - arg0) * var15, 0, 1.0F, (arg3 - arg1) * var14, 0.0F, (arg2 - arg0) * var14, (arg5 - arg1) * var15, 0.0F, 0.0F);
            var10.method2905(((float) this.field4525 + arg0) * var14, -128, ((float) this.field4530 + arg1) * var15, 0.0F);
        } else {
            var10.method2898(0.0F, arg4 - arg0, 0, 1.0F, arg3 - arg1, 0.0F, arg2 - arg0, -arg1 + arg5, 0.0F, 0.0F);
            var10.method2905(arg0, -124, arg1, 0.0F);
        }
        var11.method2902(this.field4520.method1532(-8221, (float) this.field4533), this.field4520.method1531(false, (float) this.field4546), (byte) 2, 1.0F);
        this.field4539.method3616(class577.field8230, (byte) 94);
        this.field4539.method3645(1, (byte) 91);
        this.field4539.method3577(var13, true);
        this.field4539.method3583(false, class634.field9219, class635.field9225);
        this.field4539.method3601(-81, class554.field7834, 0);
        class516 var16 = this.field4539.method3595((byte) 40);
        var16.method878(var10);
        var16.method877(-arg7, -arg8, 0);
        var16.method2901(-128, var13.method1532(-8221, 1.0F), var13.method1531(false, 1.0F), 1.0F);
        this.field4539.method3616(class577.field8230, (byte) 94);
        this.field4539.method3579(99);
        this.field4539.method3615((byte) -42);
        this.field4539.method3627(-85);
        this.field4539.method3601(-67, class477.field6813, 0);
        this.field4539.method3583(false, class635.field9225, class635.field9225);
        this.field4539.method3577(null, true);
        this.field4539.method3645(0, (byte) 91);
        this.field4539.method3627(-99);
    }

    @OriginalMember(owner = "client!tt", name = "BA", descriptor = "(III)V", line = 335)
    public final void method666(int arg0, int arg1, int arg2) {
        field4529++;
    }

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "(IIIIIII)V", line = 342)
    public final void method961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4522++;
        class516 var8 = this.field4539.method3617(62);
        class516 var9 = this.field4539.method3595((byte) 40);
        this.field4520.method840(class174.field2517, -122);
        this.field4539.method3618(37);
        this.field4539.method3577(this.field4520, true);
        this.field4539.method3624(-117, arg6);
        this.field4539.method3600(-117, arg4);
        this.field4539.method3601(-106, class104.field1753, 1);
        this.field4539.method3570(class104.field1753, 1, (byte) 89);
        this.field4539.method3574(false, arg5);
        boolean var10 = this.field4526 && this.field4530 == 0 && this.field4537 == 0;
        boolean var11 = this.field4528 && this.field4525 == 0 && this.field4531 == 0;
        if (var10 & var11) {
            var9.method2902(this.field4520.method1532(-8221, (float) arg2), this.field4520.method1531(false, (float) arg3), (byte) 2, 1.0F);
            var8.method2902((float) arg2, (float) arg3, (byte) 2, 0.0F);
            var8.method877(arg0, arg1, 0);
            this.field4539.method3616(class577.field8230, (byte) 94);
            this.field4539.method3579(116);
            this.field4539.method3615((byte) -5);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method960();
            var9.method2902(this.field4520.method1532(-8221, (float) arg2), this.field4520.method1531(false, (float) this.field4546), (byte) 2, 1.0F);
            this.field4539.method3616(class577.field8230, (byte) 94);
            int var14 = this.field4530 + arg1;
            for (int var15 = this.field4546 + var14; var15 <= var12; var15 += var13) {
                var8.method2902((float) arg2, (float) this.field4546, (byte) 2, 0.0F);
                var8.method877(arg0, var14, 0);
                this.field4539.method3579(121);
                var14 += var13;
                this.field4539.method3615((byte) -126);
            }
            if (var12 > var14) {
                int var16 = var12 - var14;
                var9.method2902(this.field4520.method1532(-8221, (float) arg2), this.field4520.method1531(false, (float) var16), (byte) 2, 1.0F);
                this.field4539.method3616(class577.field8230, (byte) 94);
                var8.method2902((float) arg2, (float) var16, (byte) 2, 0.0F);
                var8.method877(arg0, var14, 0);
                this.field4539.method3579(70);
                this.field4539.method3615((byte) -128);
            }
        } else if (var10) {
            int var30 = arg0 + arg2;
            int var31 = this.method955();
            var9.method2902(this.field4520.method1532(-8221, (float) this.field4533), this.field4520.method1531(false, (float) arg3), (byte) 2, 1.0F);
            this.field4539.method3616(class577.field8230, (byte) 94);
            int var32 = this.field4525 + arg0;
            for (int var33 = this.field4533 + var32; var33 <= var30; var33 += var31) {
                var8.method2902((float) this.field4533, (float) arg3, (byte) 2, 0.0F);
                var8.method877(var32, arg1, 0);
                this.field4539.method3579(99);
                this.field4539.method3615((byte) 83);
                var32 += var31;
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method2902(this.field4520.method1532(-8221, (float) var34), this.field4520.method1531(false, (float) arg3), (byte) 2, 1.0F);
                this.field4539.method3616(class577.field8230, (byte) 94);
                var8.method2902((float) var34, (float) arg3, (byte) 2, 0.0F);
                var8.method877(var32, arg1, 0);
                this.field4539.method3579(85);
                this.field4539.method3615((byte) -127);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method955();
            int var20 = this.method960();
            int var21 = arg1 + this.field4530;
            for (int var22 = this.field4546 + var21; var22 <= var17; var22 += var20) {
                var9.method2902(this.field4520.method1532(-8221, (float) this.field4533), this.field4520.method1531(false, (float) this.field4546), (byte) 2, 1.0F);
                this.field4539.method3616(class577.field8230, (byte) 94);
                int var27 = arg0 + this.field4525;
                for (int var28 = this.field4533 + var27; var28 <= var18; var28 += var19) {
                    var8.method2902((float) this.field4533, (float) this.field4546, (byte) 2, 0.0F);
                    var8.method877(var27, var21, 0);
                    this.field4539.method3579(122);
                    var27 += var19;
                    this.field4539.method3615((byte) -127);
                }
                if (var27 < var18) {
                    int var29 = var18 - var27;
                    var9.method2902(this.field4520.method1532(-8221, (float) var29), this.field4520.method1531(false, (float) this.field4546), (byte) 2, 1.0F);
                    this.field4539.method3616(class577.field8230, (byte) 94);
                    var8.method2902((float) var29, (float) this.field4546, (byte) 2, 0.0F);
                    var8.method877(var27, var21, 0);
                    this.field4539.method3579(63);
                    this.field4539.method3615((byte) -2);
                }
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method2902(this.field4520.method1532(-8221, (float) this.field4533), this.field4520.method1531(false, (float) var23), (byte) 2, 1.0F);
                this.field4539.method3616(class577.field8230, (byte) 94);
                int var24 = this.field4525 + arg0;
                int var25 = this.field4533 + var24;
                while (var18 >= var25) {
                    var8.method2902((float) this.field4533, (float) var23, (byte) 2, 0.0F);
                    var8.method877(var24, var21, 0);
                    this.field4539.method3579(78);
                    var24 += var19;
                    var25 += var19;
                    this.field4539.method3615((byte) 116);
                }
                if (var24 < var18) {
                    int var26 = var18 - var24;
                    var9.method2902(this.field4520.method1532(-8221, (float) var26), this.field4520.method1531(false, (float) var23), (byte) 2, 1.0F);
                    this.field4539.method3616(class577.field8230, (byte) 94);
                    var8.method2902((float) var26, (float) var23, (byte) 2, 0.0F);
                    var8.method877(var24, var21, 0);
                    this.field4539.method3579(124);
                    this.field4539.method3615((byte) -1);
                }
            }
        }
        this.field4539.method3627(-114);
        this.field4539.method3601(-83, class554.field7834, 1);
        this.field4539.method3570(class554.field7834, 1, (byte) -92);
    }

    @OriginalMember(owner = "client!tt", name = "ma", descriptor = "()I", line = 550)
    public final int method960() {
        field4532++;
        return this.field4546 + this.field4530 + this.field4537;
    }

    @OriginalMember(owner = "client!tt", name = "EA", descriptor = "()I", line = 558)
    public final int method955() {
        field4540++;
        return this.field4533 - (-this.field4525 - this.field4531);
    }

    @OriginalMember(owner = "client!tt", name = "CA", descriptor = "(FFFFFFIII)V", line = 566)
    public final void method958(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field4538++;
        class516 var10 = this.field4539.method3617(68);
        class516 var11 = this.field4539.method3595((byte) 40);
        this.field4520.method840(this.field4549 || this.field4544 ? class174.field2517 : class549.field7730, -4);
        this.field4539.method3618(52);
        this.field4539.method3577(this.field4520, true);
        this.field4539.method3624(-27, arg8);
        this.field4539.method3600(-73, arg6);
        this.field4539.method3601(-11, class104.field1753, 1);
        this.field4539.method3570(class104.field1753, 1, (byte) 122);
        this.field4539.method3574(false, arg7);
        if (this.field4524) {
            float var12 = (float) this.method955();
            float var13 = (float) this.method960();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field4530 * var16;
            float var19 = (float) this.field4530 * var17;
            float var20 = (float) this.field4525 * var14;
            float var21 = (float) this.field4525 * var15;
            float var22 = (float) this.field4531 * -var14;
            float var23 = (float) this.field4531 * -var15;
            float var24 = (float) this.field4537 * -var16;
            float var25 = (float) this.field4537 * -var17;
            arg2 = arg2 + var22 + var18;
            arg1 = arg1 + var21 + var19;
            arg4 = arg4 + var20 + var24;
            arg0 = arg0 + var20 + var18;
            arg3 = arg3 + var23 + var19;
            arg5 = arg5 + var21 + var25;
        }
        var10.method2898(0.0F, arg4 - arg0, 0, 1.0F, arg3 - arg1, 0.0F, arg2 - arg0, arg5 - arg1, 0.0F, 0.0F);
        var10.method2905(arg0, -121, arg1, 0.0F);
        var11.method2902(this.field4520.method1532(-8221, (float) this.field4533), this.field4520.method1531(false, (float) this.field4546), (byte) 2, 1.0F);
        this.field4539.method3616(class577.field8230, (byte) 94);
        this.field4539.method3579(123);
        this.field4539.method3615((byte) -5);
        this.field4539.method3627(-77);
        this.field4539.method3601(-74, class554.field7834, 1);
        this.field4539.method3570(class554.field7834, 1, (byte) 14);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILpa;II)V", line = 635)
    public final void method663(int arg0, int arg1, class593 arg2, int arg3, int arg4) {
        field4534++;
        class117 var6 = (class117) arg2;
        class405 var7 = var6.field1904;
        int var8 = this.field4530 + arg1;
        int var9 = this.field4525 + arg0;
        this.field4520.method840(class174.field2517, 75);
        this.field4539.method3618(33);
        this.field4539.method3577(this.field4520, true);
        this.field4539.method3624(-113, 1);
        this.field4539.method3600(-119, 1);
        class516 var10 = this.field4539.method3617(-115);
        var10.method2902((float) this.field4533, (float) this.field4546, (byte) 2, 0.0F);
        var10.method877(var9, var8, 0);
        this.field4539.method3579(117);
        class516 var11 = this.field4539.method3595((byte) 40);
        var11.method2902(this.field4520.method1532(-8221, (float) this.field4533), this.field4520.method1531(false, (float) this.field4546), (byte) 2, 1.0F);
        this.field4539.method3616(class577.field8230, (byte) 94);
        this.field4539.method3645(1, (byte) 91);
        this.field4539.method3577(var7, true);
        this.field4539.method3583(false, class634.field9219, class635.field9225);
        this.field4539.method3601(-6, class554.field7834, 0);
        class516 var12 = this.field4539.method3595((byte) 40);
        var12.method2902(var7.method1532(-8221, (float) this.field4533), var7.method1531(false, (float) this.field4546), (byte) 2, 1.0F);
        var12.method2905(var7.method1532(-8221, (float) (var9 - arg3)), -118, var7.method1531(false, (float) (var8 - arg4)), 0.0F);
        this.field4539.method3616(class577.field8230, (byte) 94);
        this.field4539.method3615((byte) -128);
        this.field4539.method3627(-118);
        this.field4539.method3601(-86, class477.field6813, 0);
        this.field4539.method3583(false, class635.field9225, class635.field9225);
        this.field4539.method3577(null, true);
        this.field4539.method3645(0, (byte) 91);
        this.field4539.method3627(-101);
    }

    @OriginalMember(owner = "client!tt", name = "KA", descriptor = "(IIII)V", line = 678)
    public final void method963(int arg0, int arg1, int arg2, int arg3) {
        this.field4531 = arg2;
        this.field4530 = arg1;
        field4541++;
        this.field4537 = arg3;
        this.field4525 = arg0;
        this.field4524 = this.field4525 != 0 || this.field4530 != 0 || this.field4531 != 0 || this.field4537 != 0;
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lnd;IIZ)V", line = 802)
    public class310(class632 arg0, int arg1, int arg2, boolean arg3) {
        this.field4546 = arg2;
        this.field4533 = arg1;
        this.field4539 = arg0;
        this.field4520 = arg0.method149(true, arg1, arg2, class343.field4922, arg3 ? class85.field1472 : class617.field8727);
        this.field4549 = arg1 != this.field4520.method1533(127);
        this.field4544 = arg2 != this.field4520.method1530(-53);
        this.field4528 = !this.field4549 && this.field4520.method1536(-5845);
        this.field4526 = !this.field4544 && this.field4520.method1536(-5845);
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lnd;II[III)V", line = 821)
    public class310(class632 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field4539 = arg0;
        this.field4533 = arg1;
        this.field4546 = arg2;
        this.field4520 = arg0.method145(arg4, arg2, arg5, arg3, arg1, 3, false);
        this.field4549 = arg1 != this.field4520.method1533(124);
        this.field4544 = this.field4520.method1530(-121) != arg2;
        this.field4528 = !this.field4549 && this.field4520.method1536(-5845);
        this.field4526 = !this.field4544 && this.field4520.method1536(-5845);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)Z", line = 699)
    public static final boolean method1932(boolean arg0) {
        if (arg0) {
            field4521++;
            return class262.field3823;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tt", name = "la", descriptor = "()I", line = 718)
    public final int method968() {
        field4535++;
        return this.field4546;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIII[III)V", line = 731)
    private final void method1933(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field4523++;
        this.field4520.method1537(arg1, arg3, true, arg2, arg4, arg5, arg0, arg6);
    }

    @OriginalMember(owner = "client!tt", name = "ra", descriptor = "(IIIIIII)V", line = 740)
    public final void method664(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4543++;
        class516 var8 = this.field4539.method3617(-81);
        class516 var9 = this.field4539.method3595((byte) 40);
        this.field4520.method840(this.field4549 || this.field4544 ? class174.field2517 : class549.field7730, 67);
        this.field4539.method3618(30);
        this.field4539.method3577(this.field4520, true);
        this.field4539.method3624(-27, arg6);
        this.field4539.method3600(-104, arg4);
        this.field4539.method3601(-49, class104.field1753, 1);
        this.field4539.method3570(class104.field1753, 1, (byte) -73);
        this.field4539.method3574(false, arg5);
        var9.method2902(this.field4520.method1532(-8221, (float) this.field4533), this.field4520.method1531(false, (float) this.field4546), (byte) 2, 1.0F);
        if (this.field4524) {
            arg2 = this.field4533 * arg2 / this.method955();
            arg3 = this.field4546 * arg3 / this.method960();
            arg0 += this.field4525 * arg2 / this.field4533;
            arg1 += this.field4530 * arg3 / this.field4546;
        }
        var8.method2902((float) arg2, (float) arg3, (byte) 2, 0.0F);
        var8.method877(arg0, arg1, 0);
        this.field4539.method3616(class577.field8230, (byte) 94);
        this.field4539.method3579(105);
        this.field4539.method3615((byte) -128);
        this.field4539.method3627(-90);
        this.field4539.method3601(-103, class554.field7834, 1);
        this.field4539.method3570(class554.field7834, 1, (byte) -68);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V", line = 784)
    public static void method1934(int arg0) {
        field4550 = null;
        field4554 = null;
        if (arg0 != 0) {
            method1934(106);
        }
        field4551 = null;
        field4552 = null;
        field4548 = null;
    }
}
