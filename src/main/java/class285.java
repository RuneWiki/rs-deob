import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class285 implements class212 {

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Lar;")
    private class635 field3918 = new class635(256);

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Lsea;")
    private class648 field3927;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Lsea;")
    private class648 field3915;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    private int field3931;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "[Lau;")
    private class686[] field3923;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lrg;")
    public static class596 field3912 = new class596(3, 8);

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field3921 = 0;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "[I")
    public static int[] field3925;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V", line = 7)
    public static final void method1753(int arg0, int arg1, int arg2) {
        field3920++;
        int var3 = class377.field5030.method1736(17046, class65.field812.method555(class697.field9900, true));
        for (class499 var4 = (class499) class588.field8265.method1436(28964); var4 != null; var4 = (class499) class588.field8265.method1443((byte) 6)) {
            int var9 = class384.method2277(var4, (byte) 100);
            if (var3 < var9) {
                var3 = var9;
            }
        }
        var3 += 8;
        int var5 = class137.field1948 * 16 + 21;
        int var6 = arg0 - (var3 / 2);
        if (class222.field3096 < (var3 + var6)) {
            var6 = class222.field3096 - var3;
        }
        int var7 = 83 % ((-arg2 - 16) / 38);
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = arg1;
        if (class340.field4553 < arg1 + var5) {
            var8 = class340.field4553 - var5;
        }
        class603.field8403 = var6;
        if (var8 < 0) {
            var8 = 0;
        }
        class627.field8692 = var8;
        class568.field8040 = var3;
        class426.field5970 = (class287.field3951 ? 26 : 22) + class137.field1948 * 16;
        class541.field7327 = true;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)Z", line = 58)
    public final boolean method1367(int arg0, boolean arg1) {
        field3924++;
        if (arg1) {
            this.method1754(48, -41);
        }
        class266 var3 = this.method1754(26, arg0);
        return var3 != null && var3.method1619(-1, this.field3927, this);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)Ltf;", line = 75)
    private final class266 method1754(int arg0, int arg1) {
        field3913++;
        class578 var3 = this.field3918.method3543((long) arg1, -24045);
        if (var3 != null) {
            return (class266) var3;
        }
        byte[] var4 = this.field3915.method3632(true, arg1);
        if (arg0 != 26) {
            this.method1370(0.05848652F, true, 101, (byte) -15, -91, -126);
        }
        if (var4 == null) {
            return null;
        } else {
            class266 var5 = new class266(new class501(var4));
            this.field3918.method3548((long) arg1, 7, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(FZIBII)[I", line = 110)
    public final int[] method1370(float arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != -16) {
            this.method1367(48, true);
        }
        field3917++;
        return this.method1754(26, arg5).method1623(this.field3923[arg5].field9789, arg4, 30321, this.field3927, arg2, (double) arg0, this);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V", line = 122)
    public static final void method1755(String arg0, String arg1, byte arg2) {
        field3914++;
        class124.field1793 = -1;
        class76.field997 = 1;
        class72.method577(arg1, -108, false, arg0);
        if (arg2 != 33) {
            method1755(null, null, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(FIZIIZ)[F", line = 135)
    public final float[] method1369(float arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        field3930++;
        return arg2 ? this.method1754(26, arg3).method1621(this.field3927, this, 126, arg4, this.field3923[arg3].field9789, arg1) : null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 147)
    public static void method1756(int arg0) {
        if (arg0 != 0) {
            method1757(-59, -116, 117, -52);
        }
        field3912 = null;
        field3925 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Lau;", line = 160)
    public final class686 method1365(int arg0, int arg1) {
        if (arg0 != -17951) {
            method1755(null, null, (byte) 105);
        }
        field3922++;
        return this.field3923[arg1];
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZIIFIB)[I", line = 172)
    public final int[] method1366(boolean arg0, int arg1, int arg2, float arg3, int arg4, byte arg5) {
        field3929++;
        if (arg5 >= -67) {
            this.method1367(40, true);
        }
        return this.method1754(26, arg1).method1618(arg0, arg4, this.field3923[arg1].field9789, this.field3927, arg2, 0, this, (double) arg3);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I", line = 189)
    public final int method1368(int arg0) {
        field3926++;
        return arg0 == -26565 ? this.field3931 : 118;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)V", line = 201)
    public static final void method1757(int arg0, int arg1, int arg2, int arg3) {
        class390 var4 = class295.field4051[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class353 var5 = var4.field5533;
        class353 var6 = var4.field5532;
        if (var5 != null) {
            var5.field4697 = (short) (var5.field4697 * arg3 / (0x10 << class588.field8259 - 7));
            var5.field4696 = (short) (var5.field4696 * arg3 / (0x10 << class588.field8259 - 7));
        }
        if (var6 != null) {
            var6.field4697 = (short) (var6.field4697 * arg3 / (0x10 << class588.field8259 - 7));
            var6.field4696 = (short) (var6.field4696 * arg3 / (0x10 << class588.field8259 - 7));
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lsea;Lsea;Lsea;)V", line = 226)
    public class285(class648 arg0, class648 arg1, class648 arg2) {
        this.field3927 = arg2;
        this.field3915 = arg1;
        class501 var4 = new class501(arg0.method3654(-15615, 0, 0));
        this.field3931 = var4.method2845(-1);
        this.field3923 = new class686[this.field3931];
        for (int var5 = 0; var5 < this.field3931; var5++) {
            if (var4.method2874((byte) -75) == 1) {
                this.field3923[var5] = new class686();
            }
        }
        for (int var6 = 0; var6 < this.field3931; var6++) {
            if (this.field3923[var6] != null) {
                this.field3923[var6].field9794 = var4.method2874((byte) -75) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field3931; var7++) {
            if (this.field3923[var7] != null) {
                this.field3923[var7].field9779 = var4.method2874((byte) -75) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field3931; var8++) {
            if (this.field3923[var8] != null) {
                this.field3923[var8].field9795 = var4.method2874((byte) -75) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field3931; var9++) {
            if (this.field3923[var9] != null) {
                this.field3923[var9].field9796 = var4.method2874((byte) -75) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field3931; var10++) {
            if (this.field3923[var10] != null) {
                this.field3923[var10].field9783 = var4.method2863(117);
            }
        }
        for (int var11 = 0; var11 < this.field3931; var11++) {
            if (this.field3923[var11] != null) {
                this.field3923[var11].field9791 = var4.method2863(93);
            }
        }
        for (int var12 = 0; var12 < this.field3931; var12++) {
            if (this.field3923[var12] != null) {
                this.field3923[var12].field9797 = var4.method2863(110);
            }
        }
        for (int var13 = 0; var13 < this.field3931; var13++) {
            if (this.field3923[var13] != null) {
                this.field3923[var13].field9788 = var4.method2863(127);
            }
        }
        for (int var14 = 0; var14 < this.field3931; var14++) {
            if (this.field3923[var14] != null) {
                this.field3923[var14].field9777 = (short) var4.method2845(-1);
            }
        }
        for (int var15 = 0; var15 < this.field3931; var15++) {
            if (this.field3923[var15] != null) {
                this.field3923[var15].field9785 = var4.method2863(105);
            }
        }
        for (int var16 = 0; var16 < this.field3931; var16++) {
            if (this.field3923[var16] != null) {
                this.field3923[var16].field9787 = var4.method2863(110);
            }
        }
        for (int var17 = 0; var17 < this.field3931; var17++) {
            if (this.field3923[var17] != null) {
                this.field3923[var17].field9793 = var4.method2874((byte) -75) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field3931; var18++) {
            if (this.field3923[var18] != null) {
                this.field3923[var18].field9789 = var4.method2874((byte) -75) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field3931; var19++) {
            if (this.field3923[var19] != null) {
                this.field3923[var19].field9780 = var4.method2863(114);
            }
        }
        for (int var20 = 0; var20 < this.field3931; var20++) {
            if (this.field3923[var20] != null) {
                this.field3923[var20].field9781 = var4.method2874((byte) -75) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field3931; var21++) {
            if (this.field3923[var21] != null) {
                this.field3923[var21].field9792 = var4.method2874((byte) -75) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field3931; var22++) {
            if (this.field3923[var22] != null) {
                this.field3923[var22].field9786 = var4.method2874((byte) -75) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field3931; var23++) {
            if (this.field3923[var23] != null) {
                this.field3923[var23].field9798 = var4.method2874((byte) -75);
            }
        }
        for (int var24 = 0; var24 < this.field3931; var24++) {
            if (this.field3923[var24] != null) {
                this.field3923[var24].field9790 = var4.method2840(false);
            }
        }
        for (int var25 = 0; var25 < this.field3931; var25++) {
            if (this.field3923[var25] != null) {
                this.field3923[var25].field9784 = var4.method2874((byte) -75) == 1;
            }
        }
    }
}
