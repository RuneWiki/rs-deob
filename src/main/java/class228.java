import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class228 {

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "Lmm;")
    private class43 field3567 = new class43();

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Lmm;")
    private class43 field3568 = new class43();

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Lmm;")
    private class43 field3571 = new class43();

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "Lmm;")
    private class43 field3575 = new class43();

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "Lug;")
    private class25 field3578 = new class25(4);

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    public volatile int field3582 = 0;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public volatile int field3580 = 0;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "B")
    private byte field3583 = 0;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "Lug;")
    private class25 field3581 = new class25(8);

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "[I")
    public static int[] field3557 = new int[50];

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    private int field3579;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "J")
    private long field3576;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lrn;")
    public static class18 field3561;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Lrn;")
    public static class18 field3563;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "Lpl;")
    private class344 field3577;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "Lpj;")
    private class99 field3584;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()V", line = 8)
    public static final void method1705() {
        for (int var0 = 0; var0 < class301.field4680; var0++) {
            class297 var1 = class190.field2980[var0];
            class268.method1970(var1);
            class190.field2980[var0] = null;
        }
        class301.field4680 = 0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)Z", line = 22)
    public final boolean method1706(int arg0) {
        field3569++;
        if (arg0 <= 31) {
            method1717(115);
        }
        return this.method1711(111) >= 20;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 33)
    public final void method1707(int arg0) {
        field3566++;
        if (this.field3577 == null) {
            return;
        }
        try {
            int var2 = 76 / ((arg0 - 50) / 59);
            this.field3578.field397 = 0;
            this.field3578.method273(0, 7);
            this.field3578.method260(0, -92);
            this.field3577.method2426(0, -28332, this.field3578.field448, 4);
        } catch (IOException var6) {
            try {
                this.field3577.method2429(false);
            } catch (Exception var5) {
            }
            this.field3577 = null;
            this.field3582++;
            this.field3580 = -2;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V", line = 60)
    public final void method1708(boolean arg0) {
        if (this.field3577 != null) {
            this.field3577.method2420(0);
        }
        field3564++;
        if (!arg0) {
            field3563 = (class18) null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)Z", line = 74)
    public final boolean method1709(int arg0) {
        field3554++;
        if (arg0 < 64) {
            this.field3578 = (class25) null;
        }
        return this.method1714(0) >= 20;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILug;I)V", line = 90)
    public static final void method1710(int arg0, class25 arg1, int arg2) {
        if (class31.field491 != null) {
            try {
                class31.field491.method1165(0L, 0);
                class31.field491.method1161(24, -1, arg2, arg1.field448);
            } catch (Exception var4) {
            }
        }
        if (arg0 != -22293) {
            field3561 = (class18) null;
        }
        field3572++;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)I", line = 110)
    public final int method1711(int arg0) {
        field3559++;
        int var2 = 16 % ((-arg0 - 10) / 36);
        return this.field3567.method443(-23800) + this.field3568.method443(-23800);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 121)
    public static final void method1712(byte arg0) {
        boolean var1 = false;
        if (arg0 < 94) {
            field3563 = (class18) null;
        }
        field3558++;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class66.field1006 - 1); var2++) {
                if (class356.field5670[var2] < 1000 && class356.field5670[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class318.field4904[var2];
                    class318.field4904[var2] = class318.field4904[var2 + 1];
                    class318.field4904[var2 + 1] = var3;
                    String var4 = class212.field3328[var2];
                    class212.field3328[var2] = class212.field3328[var2 + 1];
                    class212.field3328[var2 + 1] = var4;
                    int var5 = class41.field654[var2];
                    class41.field654[var2] = class41.field654[var2 + 1];
                    class41.field654[var2 + 1] = var5;
                    int var6 = class90.field1278[var2];
                    class90.field1278[var2] = class90.field1278[var2 + 1];
                    class90.field1278[var2 + 1] = var6;
                    int var7 = class78.field1134[var2];
                    class78.field1134[var2] = class78.field1134[var2 + 1];
                    class78.field1134[var2 + 1] = var7;
                    short var8 = class356.field5670[var2];
                    class356.field5670[var2] = class356.field5670[var2 + 1];
                    class356.field5670[var2 + 1] = var8;
                    long var9 = class356.field5669[var2];
                    class356.field5669[var2] = class356.field5669[var2 + 1];
                    class356.field5669[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZZ)V", line = 176)
    public final void method1713(boolean arg0, boolean arg1) {
        field3556++;
        if (this.field3577 == null) {
            return;
        }
        try {
            this.field3578.field397 = 0;
            if (!arg0) {
                this.method1720(true);
            }
            this.field3578.method273(0, arg1 ? 2 : 3);
            this.field3578.method260(0, -76);
            this.field3577.method2426(0, -28332, this.field3578.field448, 4);
        } catch (IOException var6) {
            try {
                this.field3577.method2429(false);
            } catch (Exception var5) {
            }
            this.field3577 = null;
            this.field3580 = -2;
            this.field3582++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)I", line = 205)
    private final int method1714(int arg0) {
        if (arg0 != 0) {
            field3561 = (class18) null;
        }
        field3573++;
        return this.field3571.method443(-23800) + this.field3575.method443(-23800);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lpl;IZ)V", line = 218)
    public final void method1715(class344 arg0, int arg1, boolean arg2) {
        if (this.field3577 != null) {
            try {
                this.field3577.method2429(false);
            } catch (Exception var11) {
            }
            this.field3577 = null;
        }
        this.field3577 = arg0;
        this.method1718((byte) -111);
        this.method1713(true, arg2);
        field3570++;
        this.field3584 = null;
        this.field3581.field397 = 0;
        if (arg1 <= 121) {
            return;
        }
        while (true) {
            class99 var5 = (class99) this.field3568.method445(2);
            if (var5 == null) {
                while (true) {
                    class99 var6 = (class99) this.field3575.method445(2);
                    if (var6 == null) {
                        if (this.field3583 != 0) {
                            try {
                                this.field3578.field397 = 0;
                                this.field3578.method273(0, 4);
                                this.field3578.method273(0, this.field3583);
                                this.field3578.method304(false, 0);
                                this.field3577.method2426(0, -28332, this.field3578.field448, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field3577.method2429(false);
                                } catch (Exception var9) {
                                }
                                this.field3577 = null;
                                this.field3580 = -2;
                                this.field3582++;
                            }
                        }
                        this.field3579 = 0;
                        this.field3576 = class156.method1273((byte) -21);
                        return;
                    }
                    this.field3571.method438(true, var6);
                }
            }
            this.field3567.method438(true, var5);
        }
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V", line = 287)
    public final void method1716(int arg0) {
        field3555++;
        try {
            this.field3577.method2429(false);
            if (arg0 <= 65) {
                method1717(84);
            }
        } catch (Exception var3) {
        }
        this.field3577 = null;
        this.field3580 = -1;
        this.field3583 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field3582++;
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)V", line = 305)
    public static void method1717(int arg0) {
        if (arg0 >= 118) {
            field3563 = null;
            field3557 = null;
            field3561 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V", line = 326)
    private final void method1718(byte arg0) {
        field3560++;
        if (this.field3577 == null) {
            return;
        }
        try {
            this.field3578.field397 = 0;
            this.field3578.method273(0, 6);
            this.field3578.method260(3, -78);
            this.field3577.method2426(0, -28332, this.field3578.field448, 4);
        } catch (IOException var5) {
            try {
                this.field3577.method2429(false);
            } catch (Exception var4) {
            }
            this.field3577 = null;
            this.field3580 = -2;
            this.field3582++;
        }
        if (arg0 > -88) {
            this.method1716(-5);
        }
    }

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)V", line = 357)
    public final void method1719(int arg0) {
        if (this.field3577 != null) {
            this.field3577.method2429(false);
        }
        field3553++;
        if (arg0 != 20) {
            this.field3576 = -94L;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)Z", line = 373)
    public final boolean method1720(boolean arg0) {
        field3565++;
        if (this.field3577 != null) {
            long var2 = class156.method1273((byte) -79);
            int var4 = (int) (var2 - this.field3576);
            this.field3576 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3579 += var4;
            if (this.field3579 > 30000) {
                try {
                    this.field3577.method2429(arg0);
                } catch (Exception var30) {
                }
                this.field3577 = null;
            }
        }
        if (this.field3577 == null) {
            return this.method1711(-68) == 0 && this.method1714(0) == 0;
        }
        try {
            this.field3577.method2419((byte) 100);
            class99 var6 = (class99) this.field3567.method442((byte) -122);
            if (arg0) {
                return true;
            }
            while (var6 != null) {
                this.field3578.field397 = 0;
                this.field3578.method273(0, 1);
                this.field3578.method260((int) var6.field4932, -108);
                this.field3577.method2426(0, -28332, this.field3578.field448, 4);
                this.field3568.method438(true, var6);
                var6 = (class99) this.field3567.method448(0);
            }
            for (class99 var7 = (class99) this.field3571.method442((byte) -54); var7 != null; var7 = (class99) this.field3571.method448(0)) {
                this.field3578.field397 = 0;
                this.field3578.method273(0, 0);
                this.field3578.method260((int) var7.field4932, -123);
                this.field3577.method2426(0, -28332, this.field3578.field448, 4);
                this.field3575.method438(true, var7);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field3577.method2424((byte) 21);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field3579 = 0;
                byte var10 = 0;
                if (this.field3584 == null) {
                    var10 = 8;
                } else if (this.field3584.field1492 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field3581.field397;
                    if (var9 < var11) {
                        var11 = var9;
                    }
                    this.field3577.method2428(var11, this.field3581.field448, (byte) 52, this.field3581.field397);
                    if (this.field3583 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3581.field448[this.field3581.field397 + var12] = (byte) class226.method1691(this.field3581.field448[this.field3581.field397 + var12], this.field3583);
                        }
                    }
                    this.field3581.field397 += var11;
                    if (var10 <= this.field3581.field397) {
                        if (this.field3584 == null) {
                            this.field3581.field397 = 0;
                            int var13 = this.field3581.method281(-126);
                            int var14 = this.field3581.method314((byte) 66);
                            int var15 = this.field3581.method281(86);
                            int var16 = this.field3581.method262((byte) 75);
                            int var17 = var15 & 0x7F;
                            long var18 = (long) ((var13 << 16) + var14);
                            Object var20 = null;
                            boolean var21 = (var15 & 0x80) != 0;
                            class99 var22;
                            if (var21) {
                                for (var22 = (class99) this.field3575.method442((byte) -73); var22 != null && var22.field4932 != var18; var22 = (class99) this.field3575.method448(0)) {
                                }
                            } else {
                                for (var22 = (class99) this.field3568.method442((byte) -50); var22 != null && var22.field4932 != var18; var22 = (class99) this.field3568.method448(0)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            int var23 = var17 == 0 ? 5 : 9;
                            this.field3584 = var22;
                            this.field3584.field1486 = new class25(var16 + var23 + this.field3584.field1485);
                            this.field3584.field1486.method273(0, var17);
                            this.field3584.field1486.method310(88, var16);
                            this.field3581.field397 = 0;
                            this.field3584.field1492 = 8;
                        } else if (this.field3584.field1492 != 0) {
                            throw new IOException();
                        } else if (this.field3581.field448[0] == -1) {
                            this.field3581.field397 = 0;
                            this.field3584.field1492 = 1;
                        } else {
                            this.field3584 = null;
                        }
                    }
                } else {
                    int var24 = 512 - this.field3584.field1492;
                    int var25 = this.field3584.field1486.field448.length - this.field3584.field1485;
                    if (var25 - this.field3584.field1486.field397 < var24) {
                        var24 = var25 - this.field3584.field1486.field397;
                    }
                    if (var9 < var24) {
                        var24 = var9;
                    }
                    this.field3577.method2428(var24, this.field3584.field1486.field448, (byte) 122, this.field3584.field1486.field397);
                    if (this.field3583 != 0) {
                        for (int var26 = 0; var26 < var24; var26++) {
                            this.field3584.field1486.field448[this.field3584.field1486.field397 + var26] = (byte) class226.method1691(this.field3584.field1486.field448[this.field3584.field1486.field397 + var26], this.field3583);
                        }
                    }
                    this.field3584.field1492 += var24;
                    this.field3584.field1486.field397 += var24;
                    if (this.field3584.field1486.field397 == var25) {
                        this.field3584.method2262((byte) -102);
                        this.field3584.field4435 = false;
                        this.field3584 = null;
                    } else if (this.field3584.field1492 == 512) {
                        this.field3584.field1492 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field3577.method2429(false);
            } catch (Exception var29) {
            }
            this.field3582++;
            this.field3577 = null;
            this.field3580 = -2;
            return this.method1711(58) == 0 && this.method1714(0) == 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIIBI)Lpj;", line = 656)
    public final class99 method1721(boolean arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3562++;
        class99 var6 = new class99();
        if (arg4 != 28375) {
            this.method1707(-24);
        }
        var6.field1485 = arg3;
        long var7 = (long) ((arg1 << 16) + arg2);
        var6.field4437 = arg0;
        var6.field4932 = var7;
        if (arg0) {
            if (this.method1711(127) >= 20) {
                throw new RuntimeException();
            }
            this.field3567.method438(true, var6);
        } else if (this.method1714(0) < 20) {
            this.field3571.method438(true, var6);
        } else {
            throw new RuntimeException();
        }
        return var6;
    }
}
