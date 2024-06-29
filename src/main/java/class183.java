import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class183 extends class9 {

    @OriginalMember(owner = "client!sba", name = "F", descriptor = "I")
    private int field2222;

    @OriginalMember(owner = "client!sba", name = "D", descriptor = "Ljava/lang/String;")
    public static String field2221;

    @OriginalMember(owner = "client!sba", name = "G", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!sba", name = "H", descriptor = "[I")
    public static int[] field2224;

    @OriginalMember(owner = "client!sba", name = "w", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!sba", name = "y", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!sba", name = "z", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!sba", name = "B", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!sba", name = "C", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!sba", name = "x", descriptor = "[Leaa;")
    public class424[] field2215;

    @OriginalMember(owner = "client!sba", name = "A", descriptor = "[[B")
    private byte[][] field2218;

    static {
        new class180("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field2221 = "";
        field2223 = 10;
        field2224 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1001(boolean arg0) {
        if (arg0) {
            field2224 = null;
            field2221 = null;
        }
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(II)Z", line = 23)
    public final boolean method1002(int arg0, int arg1) {
        if (arg1 == 3) {
            field2220++;
            return this.field2215[arg0].field5465;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "(I)Z", line = 36)
    public final boolean method1003(int arg0) {
        field2217++;
        if (this.field2215 != null) {
            return true;
        }
        if (this.field2218 == null) {
            if (!class595.field8632.method2581(this.field2222, false)) {
                return false;
            }
            int[] var2 = class595.field8632.method2559(this.field2222, (byte) -111);
            this.field2218 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field2218[var3] = class595.field8632.method2558(100, var2[var3], this.field2222);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field2218.length; var5++) {
            byte[] var14 = this.field2218[var5];
            int var15 = var14[0] & 0xFF << 8 | var14[1] & 0xFF;
            var4 &= class328.field4286.method2566(82, var15);
        }
        if (!var4) {
            return false;
        }
        class193 var6 = new class193();
        int var7 = class595.field8632.method2554(this.field2222, 123);
        this.field2215 = new class424[var7];
        int[] var8 = class595.field8632.method2559(this.field2222, (byte) -108);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field2218[var9];
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            class147 var12 = null;
            for (class147 var13 = (class147) var6.method1050((byte) 73); var13 != null; var13 = (class147) var6.method1047(arg0 ^ 0x54C4)) {
                if (var13.field1758 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class147(var11, class328.field4286.method2560(var11, arg0 + 12508));
                var6.method1040(var12, -119);
            }
            this.field2215[var8[var9]] = new class424(var10, var12);
        }
        if (arg0 == -19422) {
            this.field2218 = null;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(BI)Z", line = 133)
    public final boolean method1004(byte arg0, int arg1) {
        field2219++;
        if (arg0 != -6) {
            method1005(false, 117, true);
        }
        return this.field2215[arg1].field5467;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(ZIZ)I", line = 147)
    public static final int method1005(boolean arg0, int arg1, boolean arg2) {
        field2216++;
        if (arg2) {
            return 0;
        }
        class125 var3 = class256.method1445(arg1, (byte) -116, arg2);
        if (var3 == null) {
            return class66.field638.method1284(127, arg1).field7496;
        }
        int var4 = 0;
        if (!arg0) {
            field2221 = null;
        }
        for (int var5 = 0; var5 < var3.field1535.length; var5++) {
            if (var3.field1535[var5] == -1) {
                var4++;
            }
        }
        return var4 + class66.field638.method1284(122, arg1).field7496 - var3.field1535.length;
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(I)V", line = 184)
    public class183(int arg0) {
        this.field2222 = arg0;
    }

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "(II)Z", line = 195)
    public final boolean method1006(int arg0, int arg1) {
        if (arg0 != 134217727) {
            this.field2218 = null;
        }
        field2214++;
        return this.field2215[arg1].field5464;
    }
}
