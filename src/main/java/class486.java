import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class486 extends class260 {

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Lbu;")
    public static class21 field6854 = new class21(8, 3);

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Lwia;")
    public static class791 field6846;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZB)V", line = 3)
    public static final void method2895(boolean arg0, boolean arg1, byte arg2) {
        if (arg2 == 121) {
            ++field6851;
            if (arg1) {
                ++class452.field6354;
                class607.method3521((byte) -98);
            }
            if (arg0) {
                ++class369.field5125;
                class83.method630((byte) 119);
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)I", line = 31)
    public final int method2896(int arg0) {
        if (arg0 >= -14) {
            return -114;
        } else {
            ++field6849;
            return super.field3828;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(ILgn;)V", line = 43)
    public class486(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 47)
    public final void method126(int arg0) {
        ++field6852;
        if (arg0 > 102) {
            if (super.field3828 < 0 && super.field3828 > 127) {
                super.field3828 = this.method123(4377);
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)I", line = 60)
    public final int method123(int arg0) {
        ++field6850;
        return arg0 != 4377 ? -25 : 127;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 71)
    public static final String method2897(long arg0, int arg1) {
        ++field6853;
        if (~arg0 < -1L && arg0 < 6582952005840035281L) {
            if (~(arg0 % 37L) == -1L) {
                return null;
            } else {
                int var3 = 120 % ((46 - arg1) / 44);
                int var4 = 0;
                long var5 = arg0;
                while (var5 != 0L) {
                    var5 /= 37L;
                    ++var4;
                }
                StringBuffer var7 = new StringBuffer(var4);
                while (~arg0 != -1L) {
                    long var8 = arg0;
                    arg0 /= 37L;
                    char var10 = class256.field3767[(int) (-(arg0 * 37L) + var8)];
                    if (~var10 == -96) {
                        int var11 = var7.length() + -1;
                        var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                        var10 = 160;
                    }
                    var7.append(var10);
                }
                var7.reverse();
                var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
                return var7.toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)V", line = 121)
    public final void method128(int arg0, byte arg1) {
        ++field6848;
        super.field3828 = arg0;
        if (arg1 != 122) {
            this.method128(80, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V", line = 132)
    public static void method2898(int arg0) {
        field6854 = null;
        if (arg0 != 1) {
            field6846 = null;
        }
        field6846 = null;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lgn;)V", line = 143)
    public class486(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(II)I", line = 147)
    public final int method129(int arg0, int arg1) {
        if (arg0 != -1) {
            return -53;
        } else {
            ++field6847;
            return 1;
        }
    }
}
