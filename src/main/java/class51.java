import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class51 {

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "F")
    public float field823 = 1.0F;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "F")
    public float field824 = 0.25F;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "F")
    public float field822 = 1.0F;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "F")
    public float field837;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "F")
    public float field835;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "F")
    public float field832;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public int field821;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Lsn;")
    public class319 field819;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "[I")
    public static int[] field829 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field828 = new String[200];

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field834 = 1;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field833 = 0;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "Ljava/lang/String;")
    public static String field836 = "Connection lost.";

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Lah;")
    public static class126 field827;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "[Lqb;")
    public static class26[] field840;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 11)
    public static final String method428(String arg0, int arg1) {
        field830++;
        if (arg1 <= 110) {
            method430(-80);
        }
        int var2 = class272.method1875(32028, arg0);
        return var2 == -1 ? "" : class67.method516(class162.field2445.field4693[var2], " ", "<br>", false);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLkh;)V", line = 28)
    public final void method429(byte arg0, class166 arg1) {
        this.field823 = (float) (arg1.method1178(0) * 8) / 255.0F;
        int var3 = -97 % ((63 - arg0) / 53);
        field825++;
        this.field824 = (float) (arg1.method1178(0) * 8) / 255.0F;
        this.field822 = (float) (arg1.method1178(0) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V", line = 98)
    public class51() {
        this.field831 = -60;
        this.field838 = class250.field3948;
        this.field826 = -50;
        this.field839 = class250.field3943;
        this.field837 = 1.2F;
        this.field835 = 0.69921875F;
        this.field820 = -50;
        this.field832 = 1.1523438F;
        this.field821 = 0;
        if (class12.field185 != null) {
            this.field819 = class319.method2170(class12.field185[0], class12.field185[1], class12.field185[2], class12.field185[3], class12.field185[4], class12.field185[5]);
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lkh;)V", line = 116)
    public class51(class166 arg0) {
        int var2 = arg0.method1178(0);
        if ((var2 & 0x1) == 0) {
            this.field839 = class250.field3943;
        } else {
            this.field839 = arg0.method1137(-108);
        }
        if ((var2 & 0x2) == 0) {
            this.field832 = 1.1523438F;
        } else {
            this.field832 = (float) arg0.method1151(-101) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field835 = 0.69921875F;
        } else {
            this.field835 = (float) arg0.method1151(-56) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field837 = 1.2F;
        } else {
            this.field837 = (float) arg0.method1151(-115) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field826 = -50;
            this.field831 = -60;
            this.field820 = -50;
        } else {
            this.field820 = arg0.method1166(52);
            this.field831 = arg0.method1166(52);
            this.field826 = arg0.method1166(52);
        }
        if ((var2 & 0x20) == 0) {
            this.field838 = class250.field3948;
        } else {
            this.field838 = arg0.method1137(95);
        }
        if ((var2 & 0x40) == 0) {
            this.field821 = 0;
        } else {
            this.field821 = arg0.method1151(-48);
        }
        if ((var2 & 0x80) != 0) {
            this.field819 = class319.method2170(arg0.method1151(-78), arg0.method1151(-79), arg0.method1151(-110), arg0.method1151(-52), arg0.method1151(-98), arg0.method1151(-68));
        } else if (class12.field185 != null) {
            this.field819 = class319.method2170(class12.field185[0], class12.field185[1], class12.field185[2], class12.field185[3], class12.field185[4], class12.field185[5]);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 65)
    public static void method430(int arg0) {
        field828 = null;
        if (arg0 != 200) {
            field833 = -42;
        }
        field829 = null;
        field836 = null;
        field840 = null;
        field827 = null;
    }
}
