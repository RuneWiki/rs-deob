import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class259 {

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "Lge;")
    private class511 field3840 = new class511(64);

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "Lci;")
    private class320 field3842;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    public static int field3832 = 1407;

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
    public static int field3841 = 0;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "Lah;")
    public static class267 field3835;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3838;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "[[B")
    public static byte[][] field3837;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(FIFF)F", line = 5)
    public static final float method1665(float arg0, int arg1, float arg2, float arg3) {
        if (arg1 == -9480) {
            field3839++;
            return (arg3 - arg2) * arg0 + arg2;
        } else {
            return 1.6036773F;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)Lro;", line = 16)
    public final class2 method1666(int arg0, int arg1) {
        field3833++;
        class511 var3 = this.field3840;
        class2 var4;
        synchronized (this.field3840) {
            var4 = (class2) this.field3840.method2982(0, (long) arg1);
            if (arg0 != 1407) {
                method1667((byte) -103);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class320 var5 = this.field3842;
        byte[] var6;
        synchronized (this.field3842) {
            var6 = this.field3842.method2037(arg1, (byte) -77, 5);
        }
        class2 var7 = new class2();
        if (var6 != null) {
            var7.method5(-97, new class519(var6));
        }
        class511 var8 = this.field3840;
        synchronized (this.field3840) {
            this.field3840.method2981(var7, 114, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)V", line = 51)
    public static void method1667(byte arg0) {
        field3838 = null;
        field3835 = null;
        field3837 = null;
        if (arg0 > -79) {
            field3841 = -113;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V", line = 63)
    public static final void method1668(int arg0) {
        if (arg0 != 8101) {
            method1669(-54, 102, -121);
        }
        if (class66.field1118 != null) {
            class66.field1118.method2956(arg0 ^ 0xFFFFA05A);
        }
        field3831++;
        if (class445.field6350 != null) {
            class445.field6350.method2956(-16385);
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lsn;ILci;)V", line = 99)
    public class259(class453 arg0, int arg1, class320 arg2) {
        this.field3842 = arg2;
        this.field3842.method2030(-10914, 5);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(III)Z", line = 114)
    public static final boolean method1669(int arg0, int arg1, int arg2) {
        if (arg2 == -15209) {
            field3836++;
            return class355.method2212(arg0, 100, arg1) & class49.method443(arg0, arg1, arg2 + 13658);
        } else {
            return true;
        }
    }
}
