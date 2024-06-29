import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class622 {

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    private int field9168 = 0;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    private int field9167 = 0;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "Ljl;")
    private class228 field9162 = null;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    private int field9170 = 0;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "Lte;")
    private class527 field9165;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "Lwq;")
    private class146 field9164;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "[Ljh;")
    private class140[] field9158;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "Lir;")
    public class25 field9163;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "J")
    public static long field9161 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public static int field9171;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Ljl;BI)Z")
    public final boolean method3634(class228 arg0, byte arg1, int arg2) {
        field9169++;
        if (this.field9167 == 0) {
            return false;
        }
        if (this.field9162 != arg0) {
            this.field9158[this.field9167 & Integer.MAX_VALUE].method146(-7, arg2, arg0);
            this.field9162 = arg0;
        }
        int var4 = 40 % ((arg1 + 59) / 40);
        return true;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)Z")
    public final boolean method3635(int arg0, int arg1) {
        field9166++;
        if (arg0 != Integer.MAX_VALUE) {
            this.field9167 = -47;
        }
        return this.field9158[arg1].method149(arg0 + 2147483598);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILn;Lqa;)V")
    public static final void method3636(int arg0, class17 arg1, class208 arg2) {
        field9159++;
        if (class339.field4664 == null) {
            return;
        }
        if (class624.field9190 < 10) {
            if (!class339.field4671.method1987((byte) 115, class339.field4664.field9347)) {
                class624.field9190 = class180.field2737.method1962(12010, class339.field4664.field9347) / 10;
                return;
            }
            class554.method3350((byte) 95);
            class624.field9190 = 10;
        }
        if (class624.field9190 == 10) {
            class339.field4696 = class339.field4664.field9357 >> 6 << 6;
            class339.field4685 = class339.field4664.field9358 >> 6 << 6;
            class339.field4682 = (class339.field4664.field9351 >> 6 << 6) + 64 - class339.field4696;
            class339.field4690 = (class339.field4664.field9360 >> 6 << 6) + 64 - class339.field4685;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class339.field4664.method3712((byte) 127, class541.field8119.field8501, (class541.field8119.field8496 >> 7) + class473.field6687, var3, (class541.field8119.field8500 >> 7) + class38.field463)) {
                var4 = var3[1] - class339.field4685;
                var5 = var3[2] - class339.field4696;
            }
            if (!class132.field1820 && var4 >= 0 && var4 < class339.field4690 && var5 >= 0 && var5 < class339.field4682) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class607.field9016 = var6;
                class177.field2703 = var7;
            } else if (class441.field5884 == -1 || class505.field7143 == -1) {
                class339.field4664.method3709(125, class339.field4664.field9350 >> 14 & 0x3FFF, var3, class339.field4664.field9350 & 0x3FFF);
                class607.field9016 = var3[1] - class339.field4685;
                class177.field2703 = var3[2] - class339.field4696;
            } else {
                class339.field4664.method3709(109, class441.field5884, var3, class505.field7143);
                if (var3 != null) {
                    class177.field2703 = var3[2] - class339.field4696;
                    class607.field9016 = var3[1] - class339.field4685;
                }
                class505.field7143 = -1;
                class441.field5884 = -1;
                class132.field1820 = false;
            }
            if (class339.field4664.field9361 == 37) {
                class339.field4675 = 3.0F;
                class339.field4678 = 3.0F;
            } else if (class339.field4664.field9361 == 50) {
                class339.field4675 = 4.0F;
                class339.field4678 = 4.0F;
            } else if (class339.field4664.field9361 == 75) {
                class339.field4675 = 6.0F;
                class339.field4678 = 6.0F;
            } else if (class339.field4664.field9361 == 100) {
                class339.field4675 = 8.0F;
                class339.field4678 = 8.0F;
            } else if (class339.field4664.field9361 == 200) {
                class339.field4675 = 16.0F;
                class339.field4678 = 16.0F;
            } else {
                class339.field4675 = 8.0F;
                class339.field4678 = 8.0F;
            }
            class339.field4674 = (int) class339.field4675 >> 1;
            class339.field4680 = class84.method635(class339.field4674, 66);
            class415.method2448((byte) -34);
            class339.method2078();
            class227.field3313 = new class19();
            class339.field4679 += (int) (Math.random() * 5.0D) - 2;
            if (class339.field4679 < -8) {
                class339.field4679 = -8;
            }
            class339.field4677 += (int) (Math.random() * 5.0D) - 2;
            if (class339.field4679 > 8) {
                class339.field4679 = 8;
            }
            if (class339.field4677 < -16) {
                class339.field4677 = -16;
            }
            if (class339.field4677 > 16) {
                class339.field4677 = 16;
            }
            class339.method2064(arg1, class339.field4679 >> 2 << 10, class339.field4677 >> 1);
            class339.field4665.method3062(256, 36, 1024);
            class339.field4670.method547(16581, 256, 256);
            class339.field4666.method1503((byte) -1, 4096);
            class32.field393.method2266(256, 0);
            class624.field9190 = 20;
        } else if (class624.field9190 == 20) {
            class477.method2875(true, -28222);
            class339.method2075(arg2, class339.field4679, class339.field4677);
            class624.field9190 = 60;
            class477.method2875(true, -28222);
            class519.method3070(70);
        } else if (class624.field9190 == 60) {
            if (class339.field4671.method1970(class339.field4664.field9347 + "_staticelements", (byte) -85)) {
                if (!class339.field4671.method1987((byte) -45, class339.field4664.field9347 + "_staticelements")) {
                    return;
                }
                class339.field4676 = class507.method3006(class339.field4671, (byte) -119, class106.field1534, class339.field4664.field9347 + "_staticelements");
            } else {
                class339.field4676 = new class504(0);
            }
            class339.method2079();
            class624.field9190 = 70;
            class477.method2875(true, -28222);
            class519.method3070(51);
        } else if (class624.field9190 == 70) {
            class488.field6946 = new class597(arg2, 11, true, class79.field1069);
            class624.field9190 = 73;
            class477.method2875(true, -28222);
            class519.method3070(58);
        } else if (class624.field9190 == 73) {
            class268.field3815 = new class597(arg2, 12, true, class79.field1069);
            class624.field9190 = 76;
            class477.method2875(true, -28222);
            class519.method3070(79);
        } else if (class624.field9190 == 76) {
            class117.field1641 = new class597(arg2, 14, true, class79.field1069);
            class624.field9190 = 79;
            class477.method2875(true, -28222);
            class519.method3070(123);
        } else if (class624.field9190 == 79) {
            class156.field2323 = new class597(arg2, 17, true, class79.field1069);
            class624.field9190 = 82;
            class477.method2875(true, -28222);
            class519.method3070(84);
        } else if (class624.field9190 == 82) {
            class377.field5200 = new class597(arg2, 19, true, class79.field1069);
            class624.field9190 = 85;
            class477.method2875(true, -28222);
            class519.method3070(93);
        } else if (class624.field9190 == 85) {
            class583.field8569 = new class597(arg2, 22, true, class79.field1069);
            class624.field9190 = 88;
            class477.method2875(true, -28222);
            class519.method3070(92);
        } else if (class624.field9190 == 88) {
            class540.field8089 = new class597(arg2, 26, true, class79.field1069);
            class624.field9190 = 91;
            class477.method2875(true, -28222);
            class519.method3070(57);
        } else {
            class77.field1031 = new class597(arg2, 30, true, class79.field1069);
            class624.field9190 = 100;
            class477.method2875(true, -28222);
            if (arg0 >= 99) {
                class519.method3070(49);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIBZZI)V")
    public final void method3637(int arg0, int arg1, byte arg2, boolean arg3, boolean arg4, int arg5) {
        field9160++;
        boolean var7 = arg3 & this.field9165.method464();
        if (!var7 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
            if (arg1 == 4) {
                arg5 = arg0;
            }
            arg1 = 2;
        }
        if (arg2 != 32) {
            this.field9170 = 67;
        }
        if (arg1 != 0 && arg4) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (this.field9167 != arg1) {
            if (this.field9167 != 0) {
                this.field9158[this.field9167 & Integer.MAX_VALUE].method143(-7);
            }
            if (arg1 != 0) {
                this.field9158[Integer.MAX_VALUE & arg1].method148(arg4, (byte) -86);
                this.field9158[Integer.MAX_VALUE & arg1].method145(-7, arg4);
                this.field9158[arg1 & Integer.MAX_VALUE].method144(arg5, arg2 ^ 0xFFFFED5B, arg0);
            }
            this.field9162 = null;
            this.field9168 = arg5;
            this.field9167 = arg1;
            this.field9170 = arg0;
        } else if (this.field9167 != 0) {
            this.field9158[Integer.MAX_VALUE & this.field9167].method145(-7, arg4);
            if (this.field9170 != arg0 || this.field9168 != arg5) {
                this.field9158[Integer.MAX_VALUE & this.field9167].method144(arg5, -4741, arg0);
                this.field9170 = arg0;
                this.field9168 = arg5;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZIII)V")
    public static final void method3638(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class58.field739 = 0L;
        field9171++;
        int var5 = class609.method3580(true);
        if (~arg2 == arg0 || var5 == 3) {
            arg1 = true;
        }
        if (!class99.field1445.method497()) {
            arg1 = true;
        }
        class554.method3344(arg1, arg2, arg4, var5, arg3, arg0 + 114);
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lte;)V")
    public class622(class527 arg0) {
        this.field9165 = arg0;
        this.field9164 = new class146(arg0);
        this.field9158 = new class140[10];
        this.field9158[1] = new class118(arg0);
        this.field9158[2] = new class503(arg0, this.field9164);
        this.field9158[4] = new class325(arg0, this.field9164);
        this.field9158[5] = new class24(arg0, this.field9164);
        this.field9158[6] = new class643(arg0);
        this.field9158[7] = new class286(arg0);
        this.field9158[3] = this.field9163 = new class25(arg0);
        this.field9158[8] = new class395(arg0, this.field9164);
        this.field9158[9] = new class333(arg0, this.field9164);
        if (!this.field9158[8].method149(-121)) {
            this.field9158[8] = this.field9158[4];
        }
        if (!this.field9158[9].method149(-85)) {
            this.field9158[9] = this.field9158[8];
        }
    }
}
