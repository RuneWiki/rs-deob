import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class209 implements class197 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Z")
    private boolean field3737 = false;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    private int field3754 = 50;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "Lhg;")
    private class177 field3753;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "Lhg;")
    private class177 field3763;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "Lg;")
    private class276 field3748;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "Lg;")
    private class276 field3762;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "[Z")
    private boolean[] field3743;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "[B")
    private byte[] field3752;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "[B")
    private byte[] field3761;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "[Z")
    private boolean[] field3746;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "[B")
    private byte[] field3738;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "[B")
    private byte[] field3739;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "[Z")
    private boolean[] field3757;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "[S")
    private short[] field3760;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "[Z")
    private boolean[] field3751;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "[Z")
    private boolean[] field3744;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "Lsi;")
    public static class198 field3766;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZ)V")
    public final void method1468(int arg0, boolean arg1) {
        field3759++;
        this.field3737 = arg1;
        this.method1471(arg0);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
    public static final void method1469(boolean arg0) {
        field3747++;
        if (arg0) {
            return;
        }
        class267.method1788();
        for (int var1 = 0; var1 < 4; var1++) {
            class148.field2605[var1].method748(arg0);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)I")
    public final int method1416(byte arg0, int arg1) {
        if (arg0 <= 68) {
            this.method1416((byte) -76, -48);
        }
        field3749++;
        return this.field3760[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(II)Z")
    public final boolean method1418(int arg0, int arg1) {
        if (arg0 > -58) {
            return true;
        } else {
            field3755++;
            return this.field3744[arg1];
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
    public static void method1470(byte arg0) {
        field3766 = null;
        if (arg0 != 24) {
            method1469(true);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public final void method1471(int arg0) {
        field3765++;
        if (arg0 != 0) {
            this.field3757 = null;
        }
        this.field3748.method1848((byte) -52);
        if (this.field3762 != null) {
            this.field3762.method1848((byte) -74);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)Z")
    public final boolean method1412(int arg0, byte arg1) {
        field3756++;
        if (this.field3737 || this.field3751[arg0]) {
            return true;
        } else {
            int var3 = -127 % ((-arg1 - 11) / 59);
            return false;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)Z")
    public final boolean method1414(int arg0, int arg1) {
        if (arg0 != 0) {
            method1470((byte) 70);
        }
        field3750++;
        return this.field3743[arg1];
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(II)V")
    public final void method1472(int arg0, int arg1) {
        class117 var3 = (class117) this.field3748.method1850((byte) 124);
        if (arg1 != 255) {
            return;
        }
        while (var3 != null) {
            if (var3.field2076) {
                var3.method862(27620, arg0);
                var3.field2076 = false;
            }
            var3 = (class117) this.field3748.method1853((byte) -42);
        }
        field3764++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)Lha;")
    public static final class30 method1473(int arg0, int arg1, int arg2) {
        class41 var3 = class232.field4138[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class30 var4 = var3.field652;
            var3.field652 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(BI)Z")
    public final boolean method1417(byte arg0, int arg1) {
        class117 var3 = this.method1474(16030, arg1);
        int var4 = 86 / ((-arg0 - 4) / 34);
        field3740++;
        return var3 == null ? false : var3.method863((byte) -118, this.field3763, this);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIF)[I")
    public final int[] method1415(int arg0, int arg1, float arg2) {
        field3741++;
        if (arg0 > -62) {
            this.field3757 = null;
        }
        class117 var4 = this.method1474(16030, arg1);
        if (var4 == null) {
            return null;
        } else {
            var4.field2076 = true;
            return var4.method868(this.field3737 || this.field3751[arg1], this, true, arg2, this.field3763);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)[I")
    public final int[] method1413(int arg0, int arg1) {
        field3758++;
        if (arg1 < 114) {
            this.field3762 = null;
        }
        class117 var3 = this.method1474(16030, arg0);
        return var3 == null ? null : var3.method867(89, this, this.field3737 || this.field3751[arg0], this.field3763);
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lhg;Lhg;Lhg;IZ)V")
    public class209(class177 arg0, class177 arg1, class177 arg2, int arg3, boolean arg4) {
        this.field3753 = arg0;
        this.field3763 = arg2;
        this.field3737 = arg4;
        this.field3754 = arg3;
        this.field3748 = new class276(this.field3754);
        this.field3762 = null;
        class280 var6 = new class280(arg1.method1271(0, -2154, 0));
        int var7 = var6.method1891(-124);
        this.field3743 = new boolean[var7];
        this.field3752 = new byte[var7];
        this.field3761 = new byte[var7];
        this.field3746 = new boolean[var7];
        this.field3738 = new byte[var7];
        this.field3739 = new byte[var7];
        this.field3757 = new boolean[var7];
        this.field3760 = new short[var7];
        this.field3751 = new boolean[var7];
        this.field3744 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field3757[var8] = var6.method1907(16832) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field3757[var9]) {
                this.field3744[var9] = var6.method1907(16832) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field3757[var10]) {
                this.field3743[var10] = var6.method1907(16832) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field3757[var11]) {
                this.field3751[var11] = var6.method1907(16832) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field3757[var12]) {
                this.field3746[var12] = var6.method1907(16832) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field3757[var13]) {
                this.field3739[var13] = var6.method1925(true);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field3757[var14]) {
                this.field3761[var14] = var6.method1925(true);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field3757[var15]) {
                this.field3752[var15] = var6.method1925(true);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field3757[var16]) {
                this.field3738[var16] = var6.method1925(true);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field3757[var17]) {
                this.field3760[var17] = (short) var6.method1891(-112);
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(II)Lcj;")
    private final class117 method1474(int arg0, int arg1) {
        field3745++;
        class117 var3 = (class117) this.field3748.method1852((long) arg1, (byte) -105);
        if (arg0 != 16030) {
            this.field3752 = null;
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3753.method1271(arg1, arg0 ^ 0xFFFFC908, 0);
        if (var4 == null) {
            return null;
        } else {
            class280 var5 = new class280(var4);
            class117 var6 = new class117(var5);
            this.field3748.method1847(var6, 107, (long) arg1);
            return var6;
        }
    }
}
