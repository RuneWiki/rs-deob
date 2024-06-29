import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class31 implements class212 {

    @OriginalMember(owner = "client!tfa", name = "q", descriptor = "Loea;")
    private class552 field646 = new class552(256);

    @OriginalMember(owner = "client!tfa", name = "p", descriptor = "Ljn;")
    private class668 field645;

    @OriginalMember(owner = "client!tfa", name = "j", descriptor = "Ljn;")
    private class668 field639;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "[Lah;")
    private class352[] field631;

    @OriginalMember(owner = "client!tfa", name = "k", descriptor = "I")
    public static int field640 = 0;

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!tfa", name = "i", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!tfa", name = "l", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!tfa", name = "m", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!tfa", name = "n", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!tfa", name = "o", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(JJ)J")
    public static long method391(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZIIIIF)[I")
    public final int[] method392(boolean arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        int var7 = -116 % ((-arg4 - 25) / 57);
        field643++;
        return this.method394(126, arg2).method2743((double) arg5, this, false, arg3, this.field645, this.field631[arg2].field4697, arg1);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IZIFII)[F")
    public final float[] method393(int arg0, boolean arg1, int arg2, float arg3, int arg4, int arg5) {
        field632++;
        return arg4 == -23825 ? this.method394(126, arg0).method2741(this, arg2, this.field645, arg5, -128, this.field631[arg0].field4697) : null;
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)Lve;")
    private final class467 method394(int arg0, int arg1) {
        field636++;
        class164 var3 = this.field646.method3241(-26958, (long) arg1);
        if (var3 != null) {
            return (class467) var3;
        }
        byte[] var4 = this.field639.method3811(118, arg1);
        if (var4 == null) {
            return null;
        }
        class467 var5 = new class467(new class389(var4));
        if (arg0 != 126) {
            field635 = -95;
        }
        this.field646.method3240(var5, -120, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)Z")
    public final boolean method395(int arg0, int arg1) {
        field644++;
        class467 var3 = this.method394(126, arg0);
        if (arg1 != 28576) {
            this.method393(84, true, 91, -1.2307135F, -25, -7);
        }
        return var3 != null && var3.method2738((byte) -94, this, this.field645);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lrm;I)I")
    public static final int method396(class377 arg0, int arg1) {
        field638++;
        String var2 = class207.method1245(false, arg0);
        if (arg1 < 51) {
            method399(-46, null, -127);
        }
        int[] var3 = null;
        if (class267.method1619(arg0.field5062, true)) {
            var3 = class65.field1021.method178(false, (int) arg0.field5064).field3210;
        } else if (arg0.field5067 != -1) {
            var3 = class65.field1021.method178(false, arg0.field5067).field3210;
        } else if (class660.method3740((byte) 123, arg0.field5062)) {
            class633 var4 = (class633) class522.field7662.method3678((long) ((int) arg0.field5064), -124);
            if (var4 != null) {
                class557 var5 = var4.field9097;
                class323 var6 = var5.field8052;
                if (var6.field4315 != null) {
                    var6 = var6.method1881(class410.field5804, (byte) 113);
                }
                if (var6 != null) {
                    var3 = var6.field4292;
                }
            }
        } else if (class19.method333(-1002, arg0.field5062)) {
            Object var7 = null;
            class232 var8;
            if (arg0.field5062 == 1011) {
                var8 = class37.field703.method807(0, (int) arg0.field5064);
            } else {
                var8 = class37.field703.method807(0, (int) (arg0.field5064 >>> 32 & 0x7FFFFFFFL));
            }
            if (var8.field3094 != null) {
                var8 = var8.method1412(84, class410.field5804);
            }
            if (var8 != null) {
                var3 = var8.field3019;
            }
        }
        if (var3 != null) {
            var2 = var2 + class416.method2497(-17581, var3);
        }
        int var9 = class12.field205.method552(var2, -1, class420.field5955);
        if (arg0.field5061) {
            var9 += class612.field8779.method902() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IB)Lah;")
    public final class352 method397(int arg0, byte arg1) {
        field634++;
        int var3 = -80 / ((-arg1 - 66) / 55);
        return this.field631[arg0];
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IBI)I")
    public static final int method398(int arg0, byte arg1, int arg2) {
        field642++;
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        int var4 = -114 % ((arg1 - 53) / 43);
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILgba;I)V")
    public static final void method399(int arg0, class618 arg1, int arg2) {
        if (class333.field4435) {
            arg0 = 0;
            class333.field4435 = false;
        }
        if (arg2 != -1) {
            return;
        }
        field637++;
        if (class165.field2025 != null && class165.field2025.method3538(arg1, -112)) {
            return;
        }
        class165.field2025 = arg1;
        class578.field8440 = class301.method1787((byte) 122);
        class636.field9116 = arg0;
        class260.field3577 = arg0;
        if (class260.field3577 != 0) {
            class658.field9346 = class466.field6492;
            class350.field4676 = class133.field1692;
            class514.field7539 = class682.field9754;
            class156.field1914 = class39.field727;
            class37.field707 = class502.field7008;
            class598.field8625 = class433.field6219;
            class630.field9025 = class579.field8449;
            class210.field2556 = class665.field9420;
            class472.field6587 = class24.field581;
            class512.field7509 = class594.field8591;
            return;
        }
        class397.method2399(false);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IZIBIF)[I")
    public final int[] method400(int arg0, boolean arg1, int arg2, byte arg3, int arg4, float arg5) {
        field633++;
        if (arg3 != -73) {
            field635 = 117;
        }
        return this.method394(arg3 ^ 0xFFFFFFC9, arg4).method2744(20343, this.field645, this.field631[arg4].field4697, (double) arg5, arg1, this, arg2, arg0);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Z)I")
    public final int method401(boolean arg0) {
        if (arg0) {
            return 81;
        } else {
            field641++;
            return this.field630;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Ljn;Ljn;Ljn;)V")
    public class31(class668 arg0, class668 arg1, class668 arg2) {
        this.field645 = arg2;
        this.field639 = arg1;
        class389 var4 = new class389(arg0.method3800(0, 0, (byte) -92));
        this.field630 = var4.method2260(-53);
        this.field631 = new class352[this.field630];
        for (int var5 = 0; var5 < this.field630; var5++) {
            if (var4.method2229(255) == 1) {
                this.field631[var5] = new class352();
            }
        }
        for (int var6 = 0; var6 < this.field630; var6++) {
            if (this.field631[var6] != null) {
                this.field631[var6].field4706 = var4.method2229(255) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field630; var7++) {
            if (this.field631[var7] != null) {
                this.field631[var7].field4705 = var4.method2229(255) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field630; var8++) {
            if (this.field631[var8] != null) {
                this.field631[var8].field4708 = var4.method2229(255) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field630; var9++) {
            if (this.field631[var9] != null) {
                this.field631[var9].field4711 = var4.method2229(255) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field630; var10++) {
            if (this.field631[var10] != null) {
                this.field631[var10].field4704 = var4.method2249((byte) -70);
            }
        }
        for (int var11 = 0; var11 < this.field630; var11++) {
            if (this.field631[var11] != null) {
                this.field631[var11].field4703 = var4.method2249((byte) -70);
            }
        }
        for (int var12 = 0; var12 < this.field630; var12++) {
            if (this.field631[var12] != null) {
                this.field631[var12].field4707 = var4.method2249((byte) -70);
            }
        }
        for (int var13 = 0; var13 < this.field630; var13++) {
            if (this.field631[var13] != null) {
                this.field631[var13].field4696 = var4.method2249((byte) -70);
            }
        }
        for (int var14 = 0; var14 < this.field630; var14++) {
            if (this.field631[var14] != null) {
                this.field631[var14].field4713 = (short) var4.method2260(-75);
            }
        }
        for (int var15 = 0; var15 < this.field630; var15++) {
            if (this.field631[var15] != null) {
                this.field631[var15].field4695 = var4.method2249((byte) -70);
            }
        }
        for (int var16 = 0; var16 < this.field630; var16++) {
            if (this.field631[var16] != null) {
                this.field631[var16].field4699 = var4.method2249((byte) -70);
            }
        }
        for (int var17 = 0; var17 < this.field630; var17++) {
            if (this.field631[var17] != null) {
                this.field631[var17].field4709 = var4.method2229(255) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field630; var18++) {
            if (this.field631[var18] != null) {
                this.field631[var18].field4697 = var4.method2229(255) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field630; var19++) {
            if (this.field631[var19] != null) {
                this.field631[var19].field4710 = var4.method2249((byte) -70);
            }
        }
        for (int var20 = 0; var20 < this.field630; var20++) {
            if (this.field631[var20] != null) {
                this.field631[var20].field4701 = var4.method2229(255) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field630; var21++) {
            if (this.field631[var21] != null) {
                this.field631[var21].field4698 = var4.method2229(255) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field630; var22++) {
            if (this.field631[var22] != null) {
                this.field631[var22].field4702 = var4.method2229(255) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field630; var23++) {
            if (this.field631[var23] != null) {
                this.field631[var23].field4700 = var4.method2229(255);
            }
        }
        for (int var24 = 0; var24 < this.field630; var24++) {
            if (this.field631[var24] != null) {
                this.field631[var24].field4694 = var4.method2255(255);
            }
        }
        for (int var25 = 0; var25 < this.field630; var25++) {
            if (this.field631[var25] != null) {
                this.field631[var25].field4712 = var4.method2229(255) == 1;
            }
        }
    }
}
