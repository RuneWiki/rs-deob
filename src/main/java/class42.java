import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class42 {

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    private int field668 = 0;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    private int field669 = 0;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    private int field670 = 0;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Z")
    public boolean field678 = false;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public int field674 = -1;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    private int field682 = 128;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    private int field688 = 128;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lbd;")
    private static class162 field679 = class17.method142(0, "Drop");

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "Lbd;")
    public static class162 field689 = field679;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field675 = 0;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    private int field671;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Lda;")
    public static class143 field686;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "Lda;")
    public static class143 field693;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "[S")
    private short[] field683;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "[S")
    private short[] field690;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "[S")
    private short[] field691;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "[S")
    private short[] field692;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lb;II)V", line = 6)
    private final void method308(class94 arg0, int arg1, int arg2) {
        field687++;
        if (arg2 != 0) {
            this.method312((class94) null, -127);
        }
        if (arg1 == 1) {
            this.field671 = arg0.method761((byte) 108);
        } else if (arg1 == 2) {
            this.field674 = arg0.method761((byte) 108);
        } else if (arg1 == 4) {
            this.field688 = arg0.method761((byte) 108);
        } else if (arg1 == 5) {
            this.field682 = arg0.method761((byte) 108);
        } else if (arg1 == 6) {
            this.field668 = arg0.method761((byte) 108);
        } else if (arg1 == 7) {
            this.field670 = arg0.method756(915905888);
        } else if (arg1 == 8) {
            this.field669 = arg0.method756(arg2 + 915905888);
        } else if (arg1 == 9) {
            this.field678 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method756(915905888);
            this.field690 = new short[var6];
            this.field683 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field690[var7] = (short) arg0.method761((byte) 108);
                this.field683[var7] = (short) arg0.method761((byte) 108);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method756(915905888);
            this.field691 = new short[var4];
            this.field692 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field691[var5] = (short) arg0.method761((byte) 108);
                this.field692[var5] = (short) arg0.method761((byte) 108);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)I", line = 94)
    public static final int method309(int arg0, int arg1) {
        int var2 = ((arg0 & 0xAAAAAAAA) >>> 1) + (arg0 & 0x55555555);
        if (arg1 <= 79) {
            return -101;
        }
        field672++;
        int var3 = ((var2 & 0xCCCCCCCC) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)[Lud;", line = 128)
    public static final class79[] method310(byte arg0) {
        class79[] var1 = new class79[class129.field2334];
        if (arg0 >= -113) {
            return (class79[]) null;
        }
        for (int var2 = 0; var2 < class129.field2334; var2++) {
            byte[] var3 = class317.field5350[var2];
            int var4 = class260.field4333[var2] * class190.field3253[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class306.field5152[class92.method695(var3[var6], 255)];
            }
            var1[var2] = new class79(class238.field3962, class277.field4637, class127.field2312[var2], class40.field646[var2], class190.field3253[var2], class260.field4333[var2], var5);
        }
        field694++;
        class247.method1738(-119);
        return var1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBIIII)V", line = 165)
    public static final void method311(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg4 + 1;
        class3.method14(arg3, arg5, arg2, class184.field3180[arg4], -118);
        field681++;
        int var8 = arg0 - 1;
        class3.method14(arg3, arg5, arg2, class184.field3180[arg0], -127);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class184.field3180[var6];
            var7[arg5] = var7[arg2] = arg3;
        }
        if (arg1 != -39) {
            method315(-106, (byte) 65, 17, -125, 60, 122, 46, -119);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lb;I)V", line = 189)
    public final void method312(class94 arg0, int arg1) {
        field673++;
        while (true) {
            int var3 = arg0.method756(915905888);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.field674 = -39;
                }
                return;
            }
            this.method308(arg0, var3, 0);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V", line = 219)
    public static void method313(boolean arg0) {
        if (arg0) {
            field693 = null;
            field689 = null;
            field679 = null;
            field686 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLda;I)Ldc;", line = 237)
    public static final class71 method314(byte arg0, class143 arg1, int arg2) {
        field680++;
        if (class212.method1555(98, arg1, arg2)) {
            if (arg0 > -50) {
                method313(false);
            }
            return class115.method909((byte) -3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBIIIIII)V", line = 252)
    public static final void method315(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field677++;
        int var8 = -92 / ((arg1 + 71) / 42);
        if (arg6 < 1 || arg4 < 1 || arg6 > 102 || arg4 > 102) {
            return;
        }
        if (!class4.method19(-121) && (class213.field3580[0][arg6][arg4] & 0x2) == 0) {
            int var9 = arg0;
            if ((class213.field3580[arg0][arg6][arg4] & 0x8) != 0) {
                var9 = 0;
            }
            if (class245.field4080 != var9) {
                return;
            }
        }
        int var10 = arg0;
        if (arg0 < 3 && (class213.field3580[1][arg6][arg4] & 0x2) == 2) {
            var10 = arg0 + 1;
        }
        class259.method1792(arg4, var10, arg0, class267.field4473[arg0], arg6, 4095, arg3);
        if (arg5 >= 0) {
            boolean var11 = class267.field4461;
            class267.field4461 = true;
            class82.method624(arg7, arg6, arg5, var10, arg2, 4, arg0, arg4, false, class267.field4473[arg0], false);
            class267.field4461 = var11;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)Lhi;", line = 300)
    public final class176 method316(int arg0, boolean arg1) {
        field684++;
        class176 var3 = (class176) class134.field2398.method1536((long) this.field685, -121);
        if (!arg1) {
            return (class176) null;
        }
        if (var3 == null) {
            class195 var4 = class195.method1449(class250.field4178, this.field671, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field690 != null) {
                for (int var5 = 0; var5 < this.field690.length; var5++) {
                    var4.method1454(this.field690[var5], this.field683[var5]);
                }
            }
            if (this.field691 != null) {
                for (int var6 = 0; var6 < this.field691.length; var6++) {
                    var4.method1466(this.field691[var6], this.field692[var6]);
                }
            }
            var3 = var4.method1465(this.field670 + 64, 850 - -this.field669, -30, -50, -30);
            class134.field2398.method1532((long) this.field685, -41, var3);
        }
        class176 var7;
        if (this.field674 == -1 || arg0 == -1) {
            var7 = var3.method88(true, true);
        } else {
            var7 = class139.method1084(-103, this.field674).method1106(arg0, (byte) 122, var3);
        }
        if (this.field688 != 128 || this.field682 != 128) {
            var7.method67(this.field688, this.field682, this.field688);
        }
        if (this.field668 != 0) {
            if (this.field668 == 90) {
                var7.method73();
            }
            if (this.field668 == 180) {
                var7.method82();
            }
            if (this.field668 == 270) {
                var7.method85();
            }
        }
        return var7;
    }
}
