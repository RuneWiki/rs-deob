import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class287 {

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public int field3705 = 128;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public int field3718 = 128;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public int field3716;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public int field3709;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "Lme;")
    public static class668 field3710 = new class668(3000000, 200);

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "Lnj;")
    public static class415 field3713 = new class415(49, 3);

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "F")
    public static float field3719;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "[[Ljd;")
    public static class559[][] field3714;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1705(byte arg0) {
        class126.field1633 = null;
        class96.field1259 = null;
        class422.field5455 = null;
        class305.field4015 = null;
        class497.field6553 = null;
        class3.field25 = null;
        class87.field1153 = null;
        class519.field6797 = null;
        if (arg0 != 20) {
            method1706(117L, -112, 122, true, 97);
        }
        class49.field687 = null;
        class134.field1745 = null;
        class611.field8251 = null;
        class307.field4020 = null;
        class456.field5983 = null;
        class542.field7040 = null;
        class562.field7337 = null;
        class126.field1635 = null;
        class499.field6554 = null;
        field3711++;
        class316.field4104 = null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(JIIZI)Ljava/lang/String;", line = 38)
    public static final String method1706(long arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field3707++;
        char var6 = ',';
        char var7 = '.';
        if (arg2 != 10) {
            field3719 = -1.3374789F;
        }
        if (arg4 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg4 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            var8 = true;
            arg0 = -arg0;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg0 * 10)));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILho;)V", line = 122)
    public final void method1707(int arg0, class287 arg1) {
        this.field3716 = arg1.field3716;
        field3706++;
        if (arg0 != -13858) {
            method1708(-68);
        }
        this.field3715 = arg1.field3715;
        this.field3712 = arg1.field3712;
        this.field3705 = arg1.field3705;
        this.field3718 = arg1.field3718;
        this.field3709 = arg1.field3709;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(I)V", line = 180)
    public class287(int arg0) {
        this.field3716 = arg0;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(IIIIII)V", line = 202)
    private class287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3718 = arg1;
        this.field3709 = arg3;
        this.field3705 = arg2;
        this.field3716 = arg0;
        this.field3715 = arg4;
        this.field3712 = arg5;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 145)
    public static void method1708(int arg0) {
        field3714 = null;
        field3713 = null;
        if (arg0 <= 15) {
            field3713 = null;
        }
        field3710 = null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IBIZ)I", line = 161)
    public static final int method1709(int arg0, byte arg1, int arg2, boolean arg3) {
        field3708++;
        class263 var4 = class265.method1643(false, arg3, arg0);
        if (arg1 != 100) {
            field3713 = null;
        }
        if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && var4.field3525.length > arg2) {
            return var4.field3525[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Lho;", line = 189)
    public final class287 method1710(int arg0) {
        if (arg0 <= 82) {
            field3713 = null;
        }
        field3717++;
        return new class287(this.field3716, this.field3718, this.field3705, this.field3709, this.field3715, this.field3712);
    }
}
