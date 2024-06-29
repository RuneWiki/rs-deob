import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class195 {

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "Lj;")
    private class165 field3564 = new class165();

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "Lj;")
    private class165 field3569 = new class165();

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "Lj;")
    private class165 field3571 = new class165();

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "Lj;")
    private class165 field3573 = new class165();

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "Lee;")
    private class280 field3575 = new class280(4);

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public volatile int field3579 = 0;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "B")
    private byte field3580 = 0;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public volatile int field3581 = 0;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "Lee;")
    private class280 field3578 = new class280(8);

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Lcf;")
    public static class93 field3554 = class147.method1066("Moteur son pr-Bpar-B", -48);

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "[I")
    public static int[] field3566 = new int[128];

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    public static int field3565 = 0;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field3552 = 255;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    private int field3576;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "J")
    private long field3577;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "Llb;")
    private class130 field3574;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "Lhg;")
    public static class177 field3550;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "Log;")
    private class220 field3582;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)Z")
    public final boolean method1389(boolean arg0) {
        if (!arg0) {
            this.field3578 = null;
        }
        field3549++;
        return this.method1398((byte) -128) >= 20;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    private final void method1390(int arg0) {
        field3556++;
        if (this.field3574 == null) {
            return;
        }
        try {
            this.field3575.field5027 = 0;
            this.field3575.method1916(arg0, 77);
            this.field3575.method1913(3, -33);
            this.field3574.method945(this.field3575.field5011, (byte) 127, 0, 4);
        } catch (IOException var3) {
            try {
                this.field3574.method947((byte) 91);
            } catch (Exception var2) {
            }
            this.field3574 = null;
            this.field3581 = -2;
            this.field3579++;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    public final void method1391(int arg0) {
        try {
            this.field3574.method947((byte) 77);
        } catch (Exception var2) {
        }
        this.field3574 = null;
        this.field3579++;
        this.field3580 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field3581 = arg0;
        field3561++;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V")
    public final void method1392(int arg0) {
        field3562++;
        if (this.field3574 == null) {
            return;
        }
        try {
            this.field3575.field5027 = 0;
            this.field3575.method1916(7, 119);
            this.field3575.method1913(0, -53);
            this.field3574.method945(this.field3575.field5011, (byte) 127, 0, 4);
        } catch (IOException var3) {
            try {
                this.field3574.method947((byte) 31);
            } catch (Exception var2) {
            }
            this.field3579++;
            this.field3581 = -2;
            this.field3574 = null;
        }
        if (arg0 > -48) {
            field3565 = -54;
        }
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)I")
    private final int method1393(int arg0) {
        field3568++;
        if (arg0 != 3003) {
            this.field3571 = null;
        }
        return this.field3571.method1188(arg0 - 3117) + this.field3573.method1188(-57);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZZ)V")
    public final void method1394(boolean arg0, boolean arg1) {
        if (arg0) {
            this.method1392(100);
        }
        field3559++;
        if (this.field3574 == null) {
            return;
        }
        try {
            this.field3575.field5027 = 0;
            this.field3575.method1916(arg1 ? 2 : 3, 75);
            this.field3575.method1913(0, -37);
            this.field3574.method945(this.field3575.field5011, (byte) 127, 0, 4);
        } catch (IOException var4) {
            try {
                this.field3574.method947((byte) 74);
            } catch (Exception var3) {
            }
            this.field3579++;
            this.field3574 = null;
            this.field3581 = -2;
        }
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)Z")
    public final boolean method1395(int arg0) {
        if (this.field3574 != null) {
            long var2 = class28.method155((byte) 105);
            int var4 = (int) (var2 - this.field3577);
            this.field3577 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3576 += var4;
            if (this.field3576 > 30000) {
                try {
                    this.field3574.method947((byte) 20);
                } catch (Exception var27) {
                }
                this.field3574 = null;
            }
        }
        field3567++;
        if (this.field3574 == null) {
            return this.method1398((byte) -111) == 0 && this.method1393(3003) == 0;
        }
        try {
            this.field3574.method955(true);
            class220 var5 = (class220) this.field3564.method1196(2);
            if (arg0 <= 80) {
                this.field3579 = -11;
            }
            while (var5 != null) {
                this.field3575.field5027 = 0;
                this.field3575.method1916(1, 112);
                this.field3575.method1913((int) var5.field4598, -80);
                this.field3574.method945(this.field3575.field5011, (byte) 127, 0, 4);
                this.field3569.method1190(64, var5);
                var5 = (class220) this.field3564.method1200(9844);
            }
            for (class220 var6 = (class220) this.field3571.method1196(2); var6 != null; var6 = (class220) this.field3571.method1200(9844)) {
                this.field3575.field5027 = 0;
                this.field3575.method1916(0, 66);
                this.field3575.method1913((int) var6.field4598, -82);
                this.field3574.method945(this.field3575.field5011, (byte) 127, 0, 4);
                this.field3573.method1190(64, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field3574.method950(false);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3576 = 0;
                byte var9 = 0;
                if (this.field3582 == null) {
                    var9 = 8;
                } else if (this.field3582.field3988 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field3582.field3989.field5011.length - this.field3582.field3982;
                    int var11 = 512 - this.field3582.field3988;
                    if ((var10 - this.field3582.field3989.field5027) < var11) {
                        var11 = var10 - this.field3582.field3989.field5027;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field3574.method946(this.field3582.field3989.field5011, var11, this.field3582.field3989.field5027, 1);
                    if (this.field3580 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3582.field3989.field5011[this.field3582.field3989.field5027 + var12] = (byte) class175.method1248(this.field3582.field3989.field5011[this.field3582.field3989.field5027 + var12], this.field3580);
                        }
                    }
                    this.field3582.field3989.field5027 += var11;
                    this.field3582.field3988 += var11;
                    if (this.field3582.field3989.field5027 == var10) {
                        this.field3582.method1728(28169);
                        this.field3582.field343 = false;
                        this.field3582 = null;
                    } else if (this.field3582.field3988 == 512) {
                        this.field3582.field3988 = 0;
                    }
                } else {
                    int var13 = var9 - this.field3578.field5027;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field3574.method946(this.field3578.field5011, var13, this.field3578.field5027, 1);
                    if (this.field3580 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field3578.field5011[this.field3578.field5027 + var14] = (byte) class175.method1248(this.field3578.field5011[this.field3578.field5027 + var14], this.field3580);
                        }
                    }
                    this.field3578.field5027 += var13;
                    if (this.field3578.field5027 >= var9) {
                        if (this.field3582 == null) {
                            this.field3578.field5027 = 0;
                            int var15 = this.field3578.method1907(16832);
                            int var16 = this.field3578.method1891(-111);
                            int var17 = this.field3578.method1907(16832);
                            int var18 = var17 & 0x7F;
                            boolean var19 = (var17 & 0x80) != 0;
                            Object var20 = null;
                            long var21 = (long) ((var15 << 16) + var16);
                            int var23 = this.field3578.method1872(105);
                            class220 var24;
                            if (var19) {
                                for (var24 = (class220) this.field3573.method1196(2); var24 != null && var24.field4598 != var21; var24 = (class220) this.field3573.method1200(9844)) {
                                }
                            } else {
                                for (var24 = (class220) this.field3569.method1196(2); var24 != null && var24.field4598 != var21; var24 = (class220) this.field3569.method1200(9844)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field3582 = var24;
                            int var25 = var18 == 0 ? 5 : 9;
                            this.field3582.field3989 = new class280(this.field3582.field3982 + var25 + var23);
                            this.field3582.field3989.method1916(var18, 117);
                            this.field3582.field3989.method1886(var23, 2);
                            this.field3582.field3988 = 8;
                            this.field3578.field5027 = 0;
                        } else if (this.field3582.field3988 != 0) {
                            throw new IOException();
                        } else if (this.field3578.field5011[0] == -1) {
                            this.field3578.field5027 = 0;
                            this.field3582.field3988 = 1;
                        } else {
                            this.field3582 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3574.method947((byte) 126);
            } catch (Exception var26) {
            }
            this.field3581 = -2;
            this.field3579++;
            this.field3574 = null;
            return this.method1398((byte) -109) == 0 && this.method1393(3003) == 0;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIII)V")
    public static final void method1396(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            field3566 = null;
        }
        for (int var5 = 0; var5 < class161.field2845; var5++) {
            if ((class25.field311[var5] + class170.field2985[var5]) > arg1 && (arg1 + arg2) > class170.field2985[var5] && arg3 < class40.field616[var5] + class110.field1877[var5] && class40.field616[var5] < (arg3 + arg0)) {
                class25.field314[var5] = true;
            }
        }
        field3572++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)Z")
    public final boolean method1397(byte arg0) {
        if (arg0 < 24) {
            return true;
        } else {
            field3560++;
            return this.method1393(3003) >= 20;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)I")
    public final int method1398(byte arg0) {
        field3558++;
        if (arg0 > -104) {
            field3554 = null;
        }
        return this.field3564.method1188(-60) + this.field3569.method1188(-110);
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V")
    public static void method1399(int arg0) {
        field3566 = null;
        if (arg0 == 3) {
            field3550 = null;
            field3554 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
    public static final void method1400(int arg0, int arg1) {
        if (arg0 != -265408432) {
            method1400(-3, 74);
        }
        field3553++;
        class31.field491.method298(true, arg1);
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)V")
    public final void method1401(int arg0) {
        if (arg0 != 11427) {
            this.method1406(63, -35, 73, false, (byte) -90);
        }
        if (this.field3574 != null) {
            this.field3574.method947((byte) 82);
        }
        field3557++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Llb;IZ)V")
    public final void method1402(class130 arg0, int arg1, boolean arg2) {
        field3551++;
        if (this.field3574 != null) {
            try {
                this.field3574.method947((byte) 23);
            } catch (Exception var8) {
            }
            this.field3574 = null;
        }
        this.field3574 = arg0;
        this.method1390(arg1 - 35);
        this.method1394(false, arg2);
        this.field3578.field5027 = 0;
        this.field3582 = null;
        while (true) {
            class220 var4 = (class220) this.field3569.method1195((byte) 69);
            if (var4 == null) {
                if (arg1 != 41) {
                    this.method1401(8);
                }
                while (true) {
                    class220 var5 = (class220) this.field3573.method1195((byte) 69);
                    if (var5 == null) {
                        if (this.field3580 != 0) {
                            try {
                                this.field3575.field5027 = 0;
                                this.field3575.method1916(4, 68);
                                this.field3575.method1916(this.field3580, 62);
                                this.field3575.method1908(-87, 0);
                                this.field3574.method945(this.field3575.field5011, (byte) 127, 0, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field3574.method947((byte) 69);
                                } catch (Exception var6) {
                                }
                                this.field3579++;
                                this.field3574 = null;
                                this.field3581 = -2;
                            }
                        }
                        this.field3576 = 0;
                        this.field3577 = class28.method155((byte) -73);
                        return;
                    }
                    this.field3571.method1190(64, var5);
                }
            }
            this.field3564.method1190(64, var4);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lhg;ILhg;)V")
    public static final void method1403(class177 arg0, int arg1, class177 arg2) {
        class48.field778 = arg0;
        class276.field4954 = arg2;
        field3563++;
        class48.field778.method1283(34, -5357);
        int var3 = (int) (Math.random() * 21.0D) - 10;
        if (arg1 != 4) {
            return;
        }
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 41.0D) - 20;
        class52.field849 = var4 + var5;
        class18.field244 = var3 + var5;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class263.field4693 = var5 + var6;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class268 var7 = new class268();
        var7.field4795 = arg1 / 128;
        var7.field4790 = arg2 / 128;
        var7.field4791 = arg3 / 128;
        var7.field4772 = arg4 / 128;
        var7.field4794 = arg0;
        var7.field4778 = arg1;
        var7.field4788 = arg2;
        var7.field4793 = arg3;
        var7.field4779 = arg4;
        var7.field4770 = arg5;
        var7.field4784 = arg6;
        class108.field1855[class280.field5029++] = var7;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)V")
    public final void method1405(byte arg0) {
        field3570++;
        if (this.field3574 != null) {
            this.field3574.method952(5000);
        }
        int var2 = -77 / ((86 - arg0) / 32);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIZB)Log;")
    public final class220 method1406(int arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        field3555++;
        long var6 = (long) ((arg1 << 16) + arg2);
        class220 var8 = new class220();
        var8.field3982 = arg4;
        var8.field346 = arg3;
        if (arg0 != -292567952) {
            method1403((class177) null, 49, (class177) null);
        }
        var8.field4598 = var6;
        if (arg3) {
            if (this.method1398((byte) -106) >= 20) {
                throw new RuntimeException();
            }
            this.field3564.method1190(arg0 ^ 0xEE8FC430, var8);
        } else if (this.method1393(3003) < 20) {
            this.field3571.method1190(64, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }
}
