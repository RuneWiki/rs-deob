import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class194 extends class388 {

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "Ljava/lang/String;")
    public String field2847;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "Lak;")
    public class498 field2841;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "Lgr;")
    public static class530 field2844 = new class530(39, 4);

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "Lgr;")
    public static class530 field2848 = new class530(27, -1);

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "[[I")
    public static int[][] field2849 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
    public static void method1371(int arg0) {
        if (arg0 != 12) {
            method1371(-64);
        }
        field2849 = null;
        field2848 = null;
        field2844 = null;
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)I")
    public final int method1372(int arg0) {
        field2842++;
        if (this.field2841.field7165.field5596 == this.field2841.field7165) {
            return arg0 > -127 ? 65 : -1;
        } else {
            return ((class304) this.field2841.field7165.field5596).field4152;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1373(String arg0, byte arg1) {
        if (arg1 >= -92) {
            method1373(null, (byte) -9);
        }
        field2846++;
        String var2 = null;
        int var3 = arg0.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg0.substring(0, var3 + 4);
            arg0 = arg0.substring(var3 + 4);
        }
        if (arg0.startsWith("directlogin ")) {
            int var4 = arg0.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg0.length();
                arg0 = arg0.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg0 = arg0 + "*";
                }
            }
        }
        return var2 == null ? arg0 : var2 + arg0;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lip;B)Z")
    public final boolean method1374(class304 arg0, byte arg1) {
        field2840++;
        int var3 = this.method1372(-128);
        arg0.method2381(15735);
        this.field2845--;
        if (arg1 != -18) {
            return false;
        } else if (this.field2845 == 0) {
            this.method2656((byte) 120);
            this.method2381(15735);
            class654.field9376--;
            class696.field9836.method2213((byte) -16, arg0.field4153, this);
            return false;
        } else {
            return this.method1372(arg1 ^ 0x6E) != var3;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lip;I)Z")
    public final boolean method1375(class304 arg0, int arg1) {
        field2843++;
        arg0.method2381(15735);
        if (arg1 != 9) {
            return false;
        }
        boolean var3 = true;
        class304 var4 = (class304) this.field2841.method3025(false);
        while (var4 != null) {
            if (class224.method1555(arg0.field4152, var4.field4152, true)) {
                class440.method2693(var4, arg0, -102);
                this.field2845++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var4 = (class304) this.field2841.method3026(true);
            var3 = false;
        }
        this.field2841.method3029(0, arg0);
        this.field2845++;
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class194(String arg0) {
        this.field2847 = arg0;
        this.field2841 = new class498();
    }
}
