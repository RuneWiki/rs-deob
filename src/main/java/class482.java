import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class482 extends class631 {

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "Lh;")
    public static class572 field6874 = new class572("Initialised native registry", "Registry initialisiert", "Registre natif initialisé", "Inicializando registro nativo");

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "Lada;")
    public static class144 field6884;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "[B")
    private byte[] field6881;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "[I")
    public static int[] field6877;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "[I")
    public static int[] field6883;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lkda;Ln;B)V")
    public static final void method2900(class328 arg0, class17 arg1, byte arg2) {
        class117.field1645 = arg1;
        if (arg2 == -127) {
            field6880++;
            class508.field7219 = arg0;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
    public static final void method2901(int arg0, int arg1) {
        class317.field4370.method834(arg1, 0);
        field6876++;
        class496.field7054.method834(arg1, 0);
        class111.field1575.method834(arg1, 0);
        class304.field4183.method834(arg1, 0);
        if (arg0 == -3692) {
            class145.field2027.method834(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lgba;B)I")
    public static final int method2902(class574 arg0, byte arg1) {
        field6882++;
        int var2 = arg0.method3417(2, (byte) -86);
        if (arg1 != -47) {
            field6877 = null;
        }
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method3417(5, (byte) -86);
        } else if (var2 == 2) {
            var3 = arg0.method3417(8, (byte) -86);
        } else {
            var3 = arg0.method3417(11, (byte) -86);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BII)V")
    public final void method1839(byte arg0, int arg1, int arg2) {
        int var4 = -27 / ((16 - arg1) / 43);
        field6879++;
        int var5 = arg2 * 2;
        byte var6 = (byte) ((arg0 >> 1 & 0x7F) + 127);
        int var10001 = var5;
        int var7 = var5 + 1;
        this.field6881[var10001] = var6;
        this.field6881[var7] = var6;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIB)[B")
    public final byte[] method2903(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 20) {
            method2904((byte) -44);
        }
        field6878++;
        this.field6881 = new byte[arg0 * 2 * arg2 * arg1];
        this.method1860(4096, arg0, arg2, arg1);
        return this.field6881;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)V")
    public static void method2904(byte arg0) {
        field6884 = null;
        int var1 = -12 / ((-arg0 - 16) / 58);
        field6877 = null;
        field6874 = null;
        field6883 = null;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class482() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)Ljava/lang/String;")
    public static final String method2905(int arg0) {
        field6875++;
        String var1 = "www";
        if (class577.field8514 == class239.field3438) {
            var1 = "www-wtrc";
        } else if (class577.field8514 == class369.field5091) {
            var1 = "www-wtqa";
        } else if (class577.field8514 == class29.field333) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (arg0 < 84) {
            field6874 = null;
        }
        if (class595.field8788 != null) {
            var2 = "/p=" + class595.field8788;
        }
        return "http://" + var1 + "." + class348.field4768.field473 + ".com/l=" + class63.field795 + "/a=" + class476.field6747 + var2 + "/";
    }
}
