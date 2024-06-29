import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class56 implements class230 {

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    private int field966 = 50;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "Z")
    private boolean field964 = false;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "Lhi;")
    private class250 field969;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Lhi;")
    private class250 field945;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "Lae;")
    private class238 field955;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "Lae;")
    private class238 field961;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "[B")
    private byte[] field953;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "[Z")
    private boolean[] field949;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "[Z")
    private boolean[] field958;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "[Z")
    private boolean[] field975;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "[B")
    private byte[] field946;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "[B")
    private byte[] field980;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "[S")
    private short[] field978;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "[Z")
    private boolean[] field979;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "[B")
    private byte[] field950;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "[Z")
    private boolean[] field952;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public static int field965 = 0;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public static int field977 = 0;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "Lli;")
    private static class185 field962 = class245.method1649("Take", 124);

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "Lli;")
    public static class185 field970 = field962;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(II)V")
    public final void method379(int arg0, int arg1) {
        if (arg0 != 50) {
            return;
        }
        for (class276 var3 = (class276) this.field955.method1618((byte) -67); var3 != null; var3 = (class276) this.field955.method1614(1)) {
            if (var3.field4885) {
                var3.method1888(1, arg1);
                var3.field4885 = false;
            }
        }
        field956++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)Z")
    public final boolean method380(int arg0, boolean arg1) {
        field960++;
        if (arg1) {
            this.method384(-35);
        }
        return this.field975[arg0];
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IFZ)[I")
    public final int[] method381(int arg0, float arg1, boolean arg2) {
        field967++;
        class276 var4 = this.method382((byte) -119, arg0);
        if (var4 == null) {
            return null;
        }
        if (arg2) {
            this.field966 = -78;
        }
        var4.field4885 = true;
        return var4.method1885(this.field969, -109, arg1, this, this.field964 || this.field952[arg0]);
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(BI)Ldg;")
    private final class276 method382(byte arg0, int arg1) {
        class276 var3 = (class276) this.field955.method1615(-28166, (long) arg1);
        field968++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field945.method1688(0, 0, arg1);
        if (var4 == null) {
            return null;
        }
        class118 var5 = new class118(var4);
        if (arg0 > -60) {
            this.field966 = -66;
        }
        class276 var6 = new class276(var5);
        this.field955.method1620(var6, (byte) 49, (long) arg1);
        return var6;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Z")
    public final boolean method383(int arg0, int arg1) {
        field974++;
        int var3 = 63 / ((-arg0 - 80) / 36);
        return this.field958[arg1];
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public final void method384(int arg0) {
        field959++;
        if (arg0 != 0) {
            field957 = 57;
        }
        this.field955.method1619(arg0 ^ 0xFFFFB770);
        if (this.field961 != null) {
            this.field961.method1619(-18576);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)I")
    public final int method385(int arg0, int arg1) {
        if (arg0 != 1) {
            field971 = 82;
        }
        field976++;
        return this.field978[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static void method386(byte arg0) {
        field962 = null;
        field970 = null;
        if (arg0 >= -95) {
            field971 = -48;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZZ)V")
    public final void method387(boolean arg0, boolean arg1) {
        this.field964 = arg1;
        this.method384(0);
        if (arg0) {
            this.method388((byte) -22, -37);
        }
        field973++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)Z")
    public final boolean method388(byte arg0, int arg1) {
        field963++;
        if (this.field964 || this.field952[arg1]) {
            return true;
        } else {
            if (arg0 >= -15) {
                this.method382((byte) -112, 40);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
    public static final void method389(int arg0) {
        field948++;
        class173 var1 = class27.field460;
        synchronized (class27.field460) {
            class171.field3157++;
            if (arg0 >= -38) {
                method386((byte) 49);
            }
            class144.field2747 = class25.field419;
            class18.field288 = class81.field1457;
            class32.field528 = class181.field3319;
            class260.field4623 = class148.field2807;
            class161.field3041 = class144.field2732;
            class6.field136 = class134.field2429;
            class68.field1182 = class212.field3875;
            class148.field2807 = 0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(BI)[I")
    public final int[] method390(byte arg0, int arg1) {
        if (arg0 >= -65) {
            this.field964 = true;
        }
        field954++;
        class276 var3 = this.method382((byte) -93, arg1);
        return var3 == null ? null : var3.method1893(this.field964 || this.field952[arg1], this.field969, this, (byte) -60);
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(II)I")
    public static final int method391(int arg0, int arg1) {
        field972++;
        if (arg0 < 0) {
            return 0;
        }
        class18 var2 = (class18) class152.field2871.method195(37, (long) arg0);
        if (var2 == null) {
            return class262.method1793(arg0, 4566).field2767;
        }
        if (arg1 != 29688) {
            field962 = null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field286.length; var4++) {
            if (var2.field286[var4] == -1) {
                var3++;
            }
        }
        return var3 + class262.method1793(arg0, 4566).field2767 - var2.field286.length;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)Z")
    public final boolean method392(int arg0, byte arg1) {
        field951++;
        class276 var3 = this.method382((byte) -68, arg0);
        if (arg1 == 93) {
            return var3 == null ? false : var3.method1886((byte) 113, this.field969, this);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lhi;Lhi;Lhi;IZ)V")
    public class56(class250 arg0, class250 arg1, class250 arg2, int arg3, boolean arg4) {
        this.field969 = arg2;
        this.field945 = arg0;
        this.field966 = arg3;
        this.field964 = arg4;
        this.field955 = new class238(this.field966);
        this.field961 = null;
        class118 var6 = new class118(arg1.method1688(0, 0, 0));
        int var7 = var6.method827(255);
        this.field953 = new byte[var7];
        this.field949 = new boolean[var7];
        this.field958 = new boolean[var7];
        this.field975 = new boolean[var7];
        this.field946 = new byte[var7];
        this.field980 = new byte[var7];
        this.field978 = new short[var7];
        this.field979 = new boolean[var7];
        this.field950 = new byte[var7];
        this.field952 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field949[var8] = var6.method867(false) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field949[var9]) {
                this.field975[var9] = var6.method867(false) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field949[var10]) {
                this.field958[var10] = var6.method867(false) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field949[var11]) {
                this.field952[var11] = var6.method867(false) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field949[var12]) {
                this.field979[var12] = var6.method867(false) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field949[var13]) {
                this.field946[var13] = var6.method838(1275919136);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field949[var14]) {
                this.field953[var14] = var6.method838(1275919136);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field949[var15]) {
                this.field950[var15] = var6.method838(1275919136);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field949[var16]) {
                this.field980[var16] = var6.method838(1275919136);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field949[var17]) {
                this.field978[var17] = (short) var6.method827(255);
            }
        }
    }
}
