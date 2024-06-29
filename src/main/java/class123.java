import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class123 extends RuntimeException {

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "Ljava/lang/String;")
    public String field1806;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1810;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "Lff;")
    public static class9 field1805 = new class9(38, 0);

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "Lcu;")
    public static class145 field1811 = new class145(8, 3);

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "Lto;")
    public static class8 field1809;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public static void method900(byte arg0) {
        field1809 = null;
        field1811 = null;
        field1805 = null;
        if (arg0 >= -83) {
            method903(104, (byte) -57, 56);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILqa;Lwl;II)V")
    public static final void method901(int arg0, class162 arg1, class280 arg2, int arg3, int arg4) {
        field1807++;
        class224.field3022.method1670((byte) -104);
        if (class484.field6732) {
            return;
        }
        if (arg0 != 38) {
            method903(-44, (byte) -69, 8);
        }
        for (class228 var5 = (class228) arg2.method1672((byte) -109); var5 != null; var5 = (class228) arg2.method1668(arg0 ^ 0xFFFFFFD9)) {
            class460 var6 = class6.field160.method1014(var5.field3078, arg0 ^ 0xFFFFA67B);
            if (class248.method1501(-1, var6)) {
                boolean var7 = class376.method2178(false, arg4, var5, arg1, var6, arg3);
                if (var7) {
                    class364.method2125(var6, 18915, var5, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class123(Throwable arg0, String arg1) {
        this.field1806 = arg1;
        this.field1810 = arg0;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "()V")
    public static final void method902() {
        class402.method2334(1, class508.field7055);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IBI)Z")
    public static final boolean method903(int arg0, byte arg1, int arg2) {
        if (arg1 == -119) {
            field1808++;
            return (arg2 & 0x8000) != 0;
        } else {
            return false;
        }
    }
}
