import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class239 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public int field3764;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3772 = -1;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "S")
    public static short field3775 = 256;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field3763;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public int field3767;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public int field3778;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Lkf;")
    public class188 field3776;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "[I")
    public int[] field3765;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
    public int[] field3768;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "[I")
    public int[] field3769;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "[I")
    public int[] field3771;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "[I")
    public int[] field3779;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "[I")
    public int[] field3784;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "[Lkf;")
    public class188[] field3783;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[[I")
    public int[][] field3766;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "[[I")
    public int[][] field3785;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B[B)V")
    private final void method1632(byte arg0, byte[] arg1) {
        field3777++;
        class31 var3 = new class31(class161.method1165(false, arg1));
        int var4 = var3.method265(arg0 ^ 0x34);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field3763 = 0;
        } else {
            this.field3763 = var3.method300((byte) -30);
        }
        int var5 = var3.method265(arg0 ^ 0x36);
        int var6 = -1;
        int var7 = 0;
        this.field3767 = var3.method260(arg0);
        this.field3769 = new int[this.field3767];
        for (int var8 = 0; var8 < this.field3767; var8++) {
            this.field3769[var8] = var7 += var3.method260((byte) -67);
            if (var6 < this.field3769[var8]) {
                var6 = this.field3769[var8];
            }
        }
        this.field3778 = var6 + 1;
        this.field3768 = new int[this.field3778];
        this.field3771 = new int[this.field3778];
        this.field3765 = new int[this.field3778];
        this.field3766 = new int[this.field3778][];
        this.field3779 = new int[this.field3778];
        if (var5 != 0) {
            this.field3784 = new int[this.field3778];
            for (int var9 = 0; var9 < this.field3778; var9++) {
                this.field3784[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3767; var10++) {
                this.field3784[this.field3769[var10]] = var3.method300((byte) -30);
            }
            this.field3776 = new class188(this.field3784);
        }
        for (int var11 = 0; var11 < this.field3767; var11++) {
            this.field3779[this.field3769[var11]] = var3.method300((byte) -30);
        }
        for (int var12 = 0; var12 < this.field3767; var12++) {
            this.field3768[this.field3769[var12]] = var3.method300((byte) -30);
        }
        for (int var13 = 0; var13 < this.field3767; var13++) {
            this.field3765[this.field3769[var13]] = var3.method260((byte) -67);
        }
        for (int var14 = 0; var14 < this.field3767; var14++) {
            int var21 = 0;
            int var22 = this.field3769[var14];
            int var23 = this.field3765[var22];
            this.field3766[var22] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field3766[var22][var25] = var21 += var3.method260((byte) -67);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field3771[var22] = var24 + 1;
            if (var24 + 1 == var23) {
                this.field3766[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field3785 = new int[var6 + 1][];
        this.field3783 = new class188[var6 + 1];
        for (int var15 = 0; var15 < this.field3767; var15++) {
            int var16 = this.field3769[var15];
            int var17 = this.field3765[var16];
            this.field3785[var16] = new int[this.field3771[var16]];
            for (int var18 = 0; var18 < this.field3771[var16]; var18++) {
                this.field3785[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field3766[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field3766[var16][var19];
                }
                this.field3785[var16][var20] = var3.method300((byte) -30);
            }
            this.field3783[var16] = new class188(this.field3785[var16]);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Lrc;")
    public static final class69 method1633(int arg0) {
        field3774++;
        if (arg0 != 0) {
            field3781 = -41;
        }
        class69 var1 = (class69) class2.field46.method620((byte) 115);
        if (var1 != null) {
            var1.method995((byte) -112);
            var1.method1463((byte) -117);
            return var1;
        }
        class69 var2;
        do {
            var2 = (class69) class182.field2854.method620((byte) 73);
            if (var2 == null) {
                return null;
            }
            if (var2.method551((byte) -106) > class242.method1650(50)) {
                return null;
            }
            var2.method995((byte) -128);
            var2.method1463((byte) -117);
        } while ((Long.MIN_VALUE & var2.field3237) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static final void method1634(int arg0) {
        field3782++;
        if (arg0 != 0) {
            field3781 = 3;
        }
        if (class69.field1090) {
            class69.field1090 = false;
            class154.field2294 = null;
            class52.field826 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)I")
    public static final int method1635(byte arg0) {
        field3780++;
        return arg0 == 70 ? class53.field837 : -98;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)V")
    public static final void method1636(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3773++;
        class240.field3826.field541 = 0;
        class240.field3826.method305(20, true);
        class240.field3826.method305(arg3, true);
        class240.field3826.method305(arg2, true);
        class240.field3826.method281((byte) -115, arg4);
        class240.field3826.method281((byte) -113, arg0);
        class163.field2463 = 0;
        class128.field1918 = 1;
        class231.field3667 = -3;
        if (arg1 != -22860) {
            field3781 = -10;
        }
        class37.field632 = 0;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([BI)V")
    public class239(byte[] arg0, int arg1) {
        this.field3764 = class114.method845(arg0.length, (byte) 91, arg0);
        if (this.field3764 != arg1) {
            throw new RuntimeException();
        }
        this.method1632((byte) -67, arg0);
    }
}
