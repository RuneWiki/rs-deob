import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class458 {

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Lhn;")
    private class509 field6836 = new class509(16);

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Lfo;")
    private class361 field6832;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "Lho;")
    public static class103 field6833 = new class103(25, 7);

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "S")
    public static short field6835 = 205;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Lho;")
    public static class103 field6837 = new class103(62, 3);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method2817(int arg0, int arg1) {
        field6830++;
        int var2 = -93 % ((arg0 - 77) / 48);
        return arg1 == 2 || arg1 == 3 || arg1 == 4 || arg1 == 5;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 15)
    public final void method2818(byte arg0) {
        field6831++;
        if (arg0 >= -19) {
            this.method2818((byte) 76);
        }
        class509 var2 = this.field6836;
        synchronized (this.field6836) {
            this.field6836.method3034((byte) 107);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)Lcp;", line = 32)
    private final class512 method2819(int arg0, int arg1) {
        field6838++;
        class509 var3 = this.field6836;
        class512 var4;
        synchronized (this.field6836) {
            var4 = (class512) this.field6836.method3032(arg0 ^ 0xE3B, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field6832;
        byte[] var6;
        synchronized (this.field6832) {
            var6 = this.field6832.method2130(29, arg1, arg0 ^ 0xFFFFFFFE);
        }
        class512 var7 = new class512();
        if (arg0 != 62) {
            this.field6836 = null;
        }
        if (var6 != null) {
            var7.method3062(-126, new class396(var6));
        }
        class509 var8 = this.field6836;
        synchronized (this.field6836) {
            this.field6836.method3046((long) arg1, var7, arg0 ^ 0x3F);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V", line = 62)
    public final void method2820(boolean arg0, int arg1) {
        field6829++;
        class509 var3 = this.field6836;
        synchronized (this.field6836) {
            this.field6836.method3036(arg1, (byte) -11);
        }
        if (!arg0) {
            this.field6832 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V", line = 75)
    public static void method2821(byte arg0) {
        int var1 = 42 / ((64 - arg0) / 36);
        field6837 = null;
        field6833 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILnf;IIII)Lad;", line = 86)
    public final class294 method2822(int arg0, class409 arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 72 / ((-arg0 - 35) / 34);
        field6828++;
        class248[] var8 = null;
        class512 var9 = this.method2819(62, arg2);
        if (var9.field7466 != null) {
            var8 = new class248[var9.field7466.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class518 var11 = arg1.method2505(8552, var9.field7466[var10]);
                var8[var10] = new class248(var11.field7643, var11.field7633, var11.field7630, var11.field7635, var11.field7637, var11.field7634, var11.field7639, var11.field7640);
            }
        }
        return new class294(var9.field7460, var8, var9.field7459, arg5, arg3, arg4);
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ld;ILfo;)V", line = 130)
    public class458(class104 arg0, int arg1, class361 arg2) {
        this.field6832 = arg2;
        this.field6832.method2136(-119, 29);
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(B)V", line = 149)
    public final void method2823(byte arg0) {
        field6834++;
        class509 var2 = this.field6836;
        synchronized (this.field6836) {
            if (arg0 != 57) {
                this.method2820(true, 71);
            }
            this.field6836.method3045(48);
        }
    }
}
