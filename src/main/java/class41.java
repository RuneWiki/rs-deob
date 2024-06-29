import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class41 {

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "Lmq;")
    private class104 field696 = new class104(64);

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "Lmq;")
    public class104 field701 = new class104(50);

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "Lgt;")
    public class221 field703 = new class221(250);

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "Leu;")
    private class297 field704 = new class297();

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "Lfc;")
    public class343 field694;

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "Lqb;")
    private class159 field707;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "Z")
    private boolean field699;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "Lfc;")
    private class343 field691;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
    public int field693;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
    public int field692;

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "[Ljava/lang/String;")
    private String[] field706;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field705;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public static int field684 = -1;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "Lfn;")
    public static class52 field688 = new class52(79, 7);

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "Lcs;")
    public static class351 field697 = new class351(50, 15);

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "Lfn;")
    public static class52 field700 = new class52(34, -1);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "Ljava/awt/Font;")
    public static Font field690;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZIIIZ)V")
    public static final void method333(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class240.method1505(0, arg1, arg0, arg4, -1, class199.field2849.length - 1, arg3);
        if (arg2 != 32) {
            field690 = null;
        }
        field681++;
        class234.field3312 = 0;
        class261.field3643 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
    public final void method334(byte arg0) {
        class104 var2 = this.field696;
        synchronized (this.field696) {
            if (arg0 != 103) {
                this.field705 = null;
            }
            this.field696.method654(false);
        }
        field698++;
        class104 var3 = this.field701;
        synchronized (this.field701) {
            this.field701.method654(false);
        }
        class221 var4 = this.field703;
        synchronized (this.field703) {
            this.field703.method1392(-112);
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(B)V")
    public final void method335(byte arg0) {
        class104 var2 = this.field701;
        synchronized (this.field701) {
            this.field701.method656(106);
        }
        if (arg0 < 61) {
            this.field699 = false;
        }
        field702++;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZ)V")
    public final void method336(int arg0, boolean arg1) {
        field687++;
        if (arg1 == this.field699) {
            return;
        }
        this.field699 = arg1;
        this.method342(-1);
        if (arg0 < 30) {
            this.method336(63, false);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)V")
    public static final void method337(int arg0, int arg1, int arg2) {
        boolean var3 = class455.field6293[0][arg1][arg2] != null && class455.field6293[0][arg1][arg2].field5606 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class455.field6293[var4][arg1][arg2] == null) {
                class406 var5 = class455.field6293[var4][arg1][arg2] = new class406(var4, arg1, arg2);
                if (var3) {
                    var5.field5620++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IBIIII)V")
    public static final void method338(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field683++;
        int var6 = arg5 - arg0;
        int var7 = arg3 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class48.method374(arg2, arg0, arg4, arg5, 36);
            }
        } else if (var6 == 0) {
            class306.method1855(arg4, arg0, arg3, false, arg2);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            int var9 = 85 % ((arg1 + 60) / 43);
            if (var8) {
                int var10 = arg2;
                int var11 = arg3;
                arg2 = arg0;
                arg0 = var10;
                arg3 = arg5;
                arg5 = var11;
            }
            if (arg3 < arg2) {
                int var12 = arg2;
                arg2 = arg3;
                int var13 = arg0;
                arg3 = var12;
                arg0 = arg5;
                arg5 = var13;
            }
            int var14 = arg0;
            int var15 = arg3 - arg2;
            int var16 = arg5 - arg0;
            int var17 = -(var15 >> 1);
            if (var16 < 0) {
                var16 = -var16;
            }
            int var18 = arg5 > arg0 ? 1 : -1;
            if (var8) {
                for (int var19 = arg2; var19 <= arg3; var19++) {
                    var17 += var16;
                    class2.field16[var19][var14] = arg4;
                    if (var17 > 0) {
                        var17 -= var15;
                        var14 += var18;
                    }
                }
            } else {
                for (int var20 = arg2; var20 <= arg3; var20++) {
                    class2.field16[var14][var20] = arg4;
                    var17 += var16;
                    if (var17 > 0) {
                        var14 += var18;
                        var17 -= var15;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public final void method339(int arg0) {
        field680++;
        class221 var2 = this.field703;
        synchronized (this.field703) {
            if (arg0 != -4654) {
                field684 = 109;
            }
            this.field703.method1391((byte) 25);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB)V")
    public final void method340(int arg0, byte arg1) {
        this.field708 = arg0;
        if (arg1 < 116) {
            this.field694 = null;
        }
        field679++;
        class104 var3 = this.field701;
        synchronized (this.field701) {
            this.field701.method656(125);
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(IB)V")
    public final void method341(int arg0, byte arg1) {
        field689++;
        class104 var3 = this.field696;
        synchronized (this.field696) {
            this.field696.method666(arg0, false);
        }
        class104 var4 = this.field701;
        synchronized (this.field701) {
            if (arg1 != -92) {
                return;
            }
            this.field701.method666(arg0, false);
        }
        class221 var5 = this.field703;
        synchronized (this.field703) {
            this.field703.method1397(arg1 ^ 0x24, arg0);
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
    public final void method342(int arg0) {
        field685++;
        class104 var2 = this.field696;
        synchronized (this.field696) {
            this.field696.method656(113);
        }
        if (arg0 != -1) {
            method345(97, (class343) null, (class343) null);
        }
        class104 var3 = this.field701;
        synchronized (this.field701) {
            this.field701.method656(101);
        }
        class221 var4 = this.field703;
        synchronized (this.field703) {
            this.field703.method1391((byte) 25);
        }
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(B)V")
    public static void method343(byte arg0) {
        field697 = null;
        field700 = null;
        field688 = null;
        if (arg0 == -54) {
            field690 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)Lis;")
    public final class164 method344(int arg0, int arg1) {
        field695++;
        class104 var3 = this.field696;
        class164 var4;
        synchronized (this.field696) {
            var4 = (class164) this.field696.method659((long) arg0, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field691.method2029(class302.method1839((byte) 16, arg0), class387.method2305((byte) -103, arg0), 0);
        class164 var6 = new class164();
        var6.field2369 = this;
        var6.field2417 = arg0;
        var6.field2376 = new String[] { null, null, class104.field1485.method695(-124, this.field693), null, null };
        var6.field2406 = new String[] { null, null, null, null, class244.field3447.method695(-122, this.field693) };
        if (var5 != null) {
            var6.method1012((byte) -109, new class425(var5));
        }
        var6.method1014(1);
        if (var6.field2419 != -1) {
            var6.method1004(arg1 - 31757, this.method344(var6.field2419, arg1), this.method344(var6.field2357, 31757));
        }
        if (arg1 != 31757) {
            this.field707 = null;
        }
        if (var6.field2349 != -1) {
            var6.method1002(this.method344(var6.field2372, 31757), this.method344(var6.field2349, arg1), 0);
        }
        if (!this.field699 && var6.field2407) {
            var6.field2374 = class30.field482.method695(-118, this.field693);
            var6.field2365 = false;
            var6.field2409 = null;
            var6.field2376 = this.field706;
            var6.field2406 = this.field705;
            var6.field2410 = 0;
            if (var6.field2361 != null) {
                boolean var7 = false;
                for (class180 var8 = var6.field2361.method2615((byte) -18); var8 != null; var8 = var6.field2361.method2619((byte) -98)) {
                    class307 var9 = this.field707.method963((int) var8.field2608, (byte) -58);
                    if (var9.field4195) {
                        var8.method1182(arg1 - 2939);
                    } else {
                        var7 = true;
                    }
                }
                if (!var7) {
                    var6.field2361 = null;
                }
            }
        }
        class104 var10 = this.field696;
        synchronized (this.field696) {
            this.field696.method653(64, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILfc;Lfc;)I")
    public static final int method345(int arg0, class343 arg1, class343 arg2) {
        field682++;
        int var3 = 0;
        if (arg1.method2034(class355.field4954, -28758)) {
            var3++;
        }
        if (arg1.method2034(class371.field5250, -28758)) {
            var3++;
        }
        if (arg1.method2034(class467.field6552, -28758)) {
            var3++;
        }
        if (arg0 < 70) {
            method338(12, (byte) 66, -66, -67, 89, -55);
        }
        if (arg2.method2034(class355.field4954, -28758)) {
            var3++;
        }
        if (arg2.method2034(class371.field5250, -28758)) {
            var3++;
        }
        if (arg2.method2034(class467.field6552, -28758)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IBIILkm;Lwh;II)Laq;")
    public final class385 method346(int arg0, byte arg1, int arg2, int arg3, class487 arg4, class15 arg5, int arg6, int arg7) {
        this.field704.field4103 = arg4.field6871;
        this.field704.field4102 = arg7;
        this.field704.field4098 = arg2;
        this.field704.field4101 = arg0;
        this.field704.field4104 = arg5 != null;
        this.field704.field4105 = arg6;
        field686++;
        this.field704.field4100 = arg3;
        return arg1 == 102 ? (class385) this.field703.method1400(arg1 - 102, this.field704) : null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZZILkm;Lkm;Loj;IILwh;III)Laq;")
    public final class385 method347(boolean arg0, boolean arg1, int arg2, class487 arg3, class487 arg4, class485 arg5, int arg6, int arg7, class15 arg8, int arg9, int arg10, int arg11) {
        field678++;
        class385 var13 = this.method346(arg2, (byte) 102, arg9, arg7, arg4, arg8, arg11, arg10);
        if (var13 != null) {
            return var13;
        }
        class164 var14 = this.method344(arg10, 31757);
        if (arg6 > -12) {
            return null;
        }
        if (arg2 > 1 && var14.field2387 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg2 >= var14.field2405[var16] && var14.field2405[var16] != 0) {
                    var15 = var14.field2387[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method344(var15, 31757);
            }
        }
        int[] var17 = var14.method1010(arg9, arg8, false, arg7, arg4, arg3, arg11, arg5, arg1, arg2);
        if (var17 == null) {
            return null;
        }
        class385 var18;
        if (arg0) {
            var18 = arg3.method1073(var17, 0, 36, 36, 32);
        } else {
            var18 = arg4.method1073(var17, 0, 36, 36, 32);
        }
        if (!arg0) {
            class297 var19 = new class297();
            var19.field4102 = arg10;
            var19.field4104 = arg8 != null;
            var19.field4103 = arg4.field6871;
            var19.field4101 = arg2;
            var19.field4100 = arg7;
            var19.field4105 = arg11;
            var19.field4098 = arg9;
            this.field703.method1396(var19, 1, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Ldk;IZLqb;Lfc;Lfc;)V")
    public class41(class328 arg0, int arg1, boolean arg2, class159 arg3, class343 arg4, class343 arg5) {
        this.field694 = arg5;
        this.field707 = arg3;
        this.field699 = arg2;
        this.field691 = arg4;
        this.field693 = arg1;
        if (this.field691 == null) {
            this.field692 = 0;
        } else {
            int var7 = this.field691.method2027(56) - 1;
            this.field692 = var7 * 256 + this.field691.method2054(0, var7);
        }
        this.field706 = new String[] { null, null, class104.field1485.method695(-127, this.field693), null, null };
        this.field705 = new String[] { null, null, null, null, class244.field3447.method695(-116, this.field693) };
    }
}
