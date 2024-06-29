import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class538 {

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "Z")
    public boolean field7314;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field7310 = 1;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "[I")
    public static int[] field7307 = new int[3];

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Laca;")
    public static class758 field7311 = new class758(1, 2);

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Lmha;")
    public class438 field7312;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "Lmha;")
    public class438 field7313;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Z")
    public boolean field7304;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public final void method3041(int arg0) {
        if (this.field7312 != null) {
            this.field7312.method1543(-21647);
        }
        field7308++;
        if (arg0 == -1) {
            this.field7304 = false;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIBLka;I)Ldg;")
    public static final class435 method3042(int arg0, int arg1, byte arg2, class499 arg3, int arg4) {
        field7306++;
        if (arg3 == null) {
            return null;
        } else {
            if (arg2 != -47) {
                field7310 = -53;
            }
            return new class435(arg1, arg4, arg0, arg3.method296(), arg3.method315(), arg3.method291(), arg3.method276(), arg3.method297(), arg3.method283(), arg3.method304());
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method3043(int arg0, String arg1, byte arg2) {
        field7305++;
        class118.field2171++;
        class537 var3 = class476.method2729(class286.field3933, (byte) -46, class551.field7498);
        var3.field7295.method754(class703.method3926(120, arg1) + 1, 102);
        var3.field7295.method754(arg0, 45);
        if (arg2 != 95) {
            field7310 = -66;
        }
        var3.field7295.method783((byte) 107, arg1);
        class173.method1314(false, var3);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
    public static final void method3044(int arg0) {
        if (arg0 > -92) {
            field7311 = null;
        }
        if (class215.field3194 < 0) {
            class210.field3141 = -1;
            class215.field3194 = 0;
            class499.field6826 = -1;
        }
        field7303++;
        if (class64.field901 < class215.field3194) {
            class499.field6826 = -1;
            class210.field3141 = -1;
            class215.field3194 = class64.field901;
        }
        if (class211.field3161 < 0) {
            class211.field3161 = 0;
            class210.field3141 = -1;
            class499.field6826 = -1;
        }
        if (class211.field3161 > class64.field911) {
            class211.field3161 = class64.field911;
            class499.field6826 = -1;
            class210.field3141 = -1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V")
    public static void method3045(boolean arg0) {
        field7307 = null;
        field7311 = null;
        if (arg0) {
            method3044(32);
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)Z")
    public final boolean method3046(int arg0) {
        field7309++;
        if (arg0 == -10954) {
            return this.field7304 && !this.field7314;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Z)V")
    public class538(boolean arg0) {
        this.field7314 = arg0;
    }
}
