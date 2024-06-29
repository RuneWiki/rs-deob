import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class210 extends class83 {

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "Ljava/lang/String;")
    public String field3552;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field3548 = 0;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field3550 = 0;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field3556 = 0;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "Z")
    public static boolean field3553 = false;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field3555;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)Lcj;")
    public static final class74 method1406(int arg0) {
        if (arg0 != 20533) {
            method1410(-33, -20L);
        }
        int var1 = class12.field168[0] * class110.field1983[0];
        field3547++;
        byte[] var2 = class199.field3226[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class54.field941[class113.method791(var2[var4], 255)];
        }
        class197 var5 = new class197(class79.field1365, class9.field116, class112.field2028[0], class213.field3588[0], class110.field1983[0], class12.field168[0], var3);
        class253.method1679((byte) -107);
        return var5;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
    public static void method1407(int arg0) {
        field3555 = null;
        if (arg0 > -110) {
            field3555 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILvh;)V")
    public static final void method1408(int arg0, class108 arg1) {
        if (arg0 != 112) {
            method1406(5);
        }
        class114.field2057 = arg1;
        field3546++;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class210() {
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class210(String arg0, int arg1) {
        this.field3552 = arg0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)Lfc;")
    public static final class148 method1409(boolean arg0) {
        class148 var1 = new class148(class79.field1365, class9.field116, class112.field2028[0], class213.field3588[0], class110.field1983[0], class12.field168[0], class199.field3226[0], class54.field941);
        field3549++;
        if (arg0) {
            method1410(90, 32L);
        }
        class253.method1679((byte) -89);
        return var1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IJ)V")
    public static final void method1410(int arg0, long arg1) {
        field3551++;
        if (arg1 == 0L) {
            return;
        }
        class159.field2661++;
        class168.field2778.method199(112, arg0 ^ 0x63C);
        if (arg0 != 1605) {
            method1407(81);
        }
        class168.field2778.method640(21691, arg1);
    }
}
