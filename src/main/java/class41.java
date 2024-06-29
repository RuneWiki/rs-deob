import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class41 extends class601 {

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "[[I")
    public static int[][] field467 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "Las;")
    public static class152 field466 = new class152(0, 0);

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "Lub;")
    public static class20 field470;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "Ldia;")
    public static class233 field465;

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(ILgn;)V", line = 5)
    public class41(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V", line = 8)
    public static final void method246(int arg0) {
        ++field471;
        int var1 = class24.field232.length;
        if (arg0 > -29) {
            method247(-26);
        }
        for (int var2 = 0; ~var2 > ~var1; ++var2) {
            if (class24.field232[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; ~var4 > ~class303.field3789; ++var4) {
                    if (class74.field773[var2] == class12.field100[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (~var3 == 0) {
                    class12.field100[class303.field3789] = class74.field773[var2];
                    var3 = class303.field3789++;
                }
                class244 var5 = new class244(class24.field232[var2]);
                int var6 = 0;
                while (var5.field2903 < class24.field232[var2].length && ~var6 > -512 && ~class302.field3784 > -1024) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1476(77);
                    int var9 = var8 >> 14;
                    int var10 = 63 & var8 >> 7;
                    int var11 = 63 & var8;
                    int var12 = (class74.field773[var2] >> 8) * 64 - class464.field6624 - -var10;
                    int var13 = (255 & class74.field773[var2]) * 64 + var11 + -class181.field2144;
                    class326 var14 = class451.field6506.method136(245, var5.method1476(-69));
                    class151 var15 = (class151) class253.field3052.method1754(false, (long) var7);
                    if (var15 == null && ~(1 & var14.field4203) < -1 && class316.field4035 == var9 && var12 >= 0 && class489.field6976 > var14.field4227 + var12 && ~var13 <= -1 && ~class153.field1677 < ~(var14.field4227 + var13)) {
                        class197 var16 = new class197();
                        var16.field7107 = var7;
                        class151 var17 = new class151(var16);
                        class253.field3052.method1751(var17, 3970, (long) var7);
                        class452.field6509[class529.field7533++] = var17;
                        class272.field3359[class302.field3784++] = var7;
                        var16.field7127 = class392.field5398;
                        var16.method1176(81, var14);
                        var16.method2996(var16.field2293.field4227, -118);
                        var16.field7135 = var16.field2293.field4201 << 3;
                        var16.method2990((var16.field2293.field4188 + 4 & -889192441) << 11, 74, true);
                        var16.method1179(14, var16.method1128(-1), var9, var12, true, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)I", line = 110)
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            field470 = null;
        }
        ++field468;
        return 0;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lgn;)V", line = 122)
    public class41(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V", line = 125)
    public final void method35(byte arg0) {
        if (super.field8565 != 1 && super.field8565 != 0) {
            super.field8565 = this.method39((byte) -17);
        }
        ++field464;
        if (arg0 >= -37) {
            field470 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(II)I", line = 139)
    public final int method34(int arg0, int arg1) {
        if (arg1 != 15706) {
            return 10;
        } else {
            ++field472;
            return 1;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZ)V", line = 153)
    public final void method40(int arg0, boolean arg1) {
        ++field473;
        super.field8565 = arg0;
        if (arg1) {
            field465 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V", line = 173)
    public static void method247(int arg0) {
        field467 = null;
        field466 = null;
        field470 = null;
        if (arg0 <= 120) {
            field466 = null;
        }
        field465 = null;
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)I", line = 186)
    public final int method248(int arg0) {
        int var2 = 86 / ((-59 - arg0) / 61);
        ++field469;
        return super.field8565;
    }
}
