import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class328 {

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    private int field3;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "I")
    private int field7;

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
    private int field9;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
    public static int field6 = 0;

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(IIIIIII)V", line = 4)
    public class2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3 = arg2;
        this.field7 = arg3;
        this.field11 = arg0;
        this.field9 = arg1;
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(III)V", line = 15)
    public final void method3(int arg0, int arg1, int arg2) {
        ++field4;
        if (arg2 != -1342) {
            this.field3 = -84;
        }
        int var4 = this.field11 * arg0 >> 12;
        int var5 = this.field3 * arg0 >> 12;
        int var6 = this.field9 * arg1 >> 12;
        int var7 = this.field7 * arg1 >> 12;
        class20.method130(true, var6, super.field4487, var7, var4, var5, super.field4482);
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(III)V", line = 34)
    public final void method4(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field3 = -117;
        }
        ++field10;
        int var4 = this.field11 * arg2 >> 12;
        int var5 = this.field3 * arg2 >> 12;
        int var6 = this.field9 * arg0 >> 12;
        int var7 = this.field7 * arg0 >> 12;
        class176.method1134(super.field4486, true, var4, var6, var5, var7);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZI)V", line = 55)
    public final void method5(int arg0, boolean arg1, int arg2) {
        ++field5;
        int var4 = this.field11 * arg0 >> 12;
        if (arg1) {
            this.method3(119, 118, 118);
        }
        int var5 = this.field3 * arg0 >> 12;
        int var6 = this.field9 * arg2 >> 12;
        int var7 = this.field7 * arg2 >> 12;
        class422.method2514((byte) 69, var6, super.field4482, var5, super.field4487, var7, super.field4486, var4);
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)V", line = 79)
    public static final void method6(int arg0, int arg1) {
        class3.field19 = -1;
        class88.field1282 = 1;
        if (arg0 != 21689) {
            field6 = -128;
        }
        class385.field5610 = false;
        class449.field6616 = arg1;
        class12.field183 = null;
        ++field8;
        class216.field3008 = -1;
        class88.field1281 = 0;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 98)
    public static final String method7(boolean arg0, int arg1) {
        ++field2;
        String var2 = Integer.toString(arg1);
        int var3 = var2.length() - 3;
        if (!arg0) {
            return null;
        } else {
            while (~var3 < -1) {
                var2 = var2.substring(0, var3) + "," + var2.substring(var3);
                var3 -= 3;
            }
            if (var2.length() > 9) {
                return " <col=00ff80>" + var2.substring(0, var2.length() + -8) + class5.field53.method2731(62, class372.field5455) + " (" + var2 + ")</col>";
            } else {
                return ~var2.length() < -7 ? " <col=ffffff>" + var2.substring(0, -4 + var2.length()) + class360.field5253.method2731(62, class372.field5455) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
            }
        }
    }
}
