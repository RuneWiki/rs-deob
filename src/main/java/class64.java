import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class64 extends RuntimeException {

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Ljava/lang/Throwable;")
    public Throwable field904;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Ljava/lang/String;")
    public String field895;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Lvj;")
    public static class115 field896 = new class115(16);

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field898 = 0;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field900 = 0;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Z")
    public static boolean field901 = false;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "J")
    public static long field899 = 0L;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Lhc;")
    public static class229 field903;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field902++;
        if (arg4 != -18472) {
            field898 = 2;
        }
        if (arg1 == arg5) {
            class123.method837(arg3, arg2, arg5, 32, arg6, arg0, arg7);
        } else if (arg7 - arg5 >= class51.field710 && class96.field1484 >= arg5 + arg7 && arg6 - arg1 >= class110.field1669 && class189.field2984 >= arg1 + arg6) {
            class226.method1543(false, arg5, arg1, arg6, arg3, arg0, arg7, arg2);
        } else {
            class28.method237(arg5, arg4 ^ 0x4850, arg6, arg7, arg0, arg2, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Lwj;")
    public static final class6 method443(int arg0, int arg1) {
        field894++;
        class6 var2 = (class6) class204.field3197.method765((long) arg1, 0);
        int var3 = 115 / ((arg0 + 11) / 57);
        if (var2 != null) {
            return var2;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = class175.field2745.method807((byte) 104, arg1, 1);
        } else {
            var4 = class235.field3767.method807((byte) 120, arg1 & 0x7FFF, 1);
        }
        class6 var5 = new class6();
        if (var4 != null) {
            var5.method43(-1, new class25(var4));
        }
        if (arg1 >= 32768) {
            var5.method36(-1);
        }
        class204.field3197.method763(98, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method444(byte arg0) {
        field903 = null;
        field896 = null;
        if (arg0 >= -50) {
            method443(-35, -112);
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class64(Throwable arg0, String arg1) {
        this.field904 = arg0;
        this.field895 = arg1;
    }
}
