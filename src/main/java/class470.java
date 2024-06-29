import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class470 {

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "Z")
    public boolean field6972 = false;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field6965 = 0;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "Z")
    public static boolean field6976;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "[[I")
    public static int[][] field6977;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "Lao;")
    public static class191 field6973;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "S")
    public static short field6979;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "Ljava/lang/String;")
    public static String field6980;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public int field6964;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public int field6968;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public static int field6971;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "Lwf;")
    public class90 field6966;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "[[B")
    public static byte[][] field6975;

    static {
        new class305("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field6976 = false;
        field6977 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
        field6973 = new class191(102, 15);
        field6979 = 32767;
        field6980 = "";
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)Z", line = 10)
    public final boolean method2865(int arg0) {
        field6963++;
        return arg0 == 0 ? this.field6966.field1078.method2133(0, this.field6968) : false;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBLug;)V", line = 26)
    private final void method2866(int arg0, byte arg1, class396 arg2) {
        field6970++;
        if (arg0 == 1) {
            this.field6968 = arg2.method2386(-23648);
        } else if (arg0 == 2) {
            this.field6964 = arg2.method2396((byte) 70);
        } else if (arg0 == 3) {
            this.field6972 = true;
        } else if (arg0 == 4) {
            this.field6968 = -1;
        }
        if (arg1 < 121) {
            field6965 = 103;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lug;Z)V", line = 54)
    public final void method2867(class396 arg0, boolean arg1) {
        field6971++;
        while (true) {
            int var3 = arg0.method2388((byte) -122);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    method2869(24, false, (byte) -96);
                    return;
                }
            }
            this.method2866(var3, (byte) 126, arg0);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII)I", line = 74)
    public static final int method2868(int arg0, int arg1, int arg2, int arg3) {
        field6974++;
        if (class152.field1993 == null) {
            return 0;
        }
        int var4 = 92 % ((78 - arg0) / 36);
        int var5 = arg2 >> 7;
        int var6 = arg3 >> 7;
        if (var5 < 0 || var6 < 0 || class308.field4128 - 1 < var5 || class426.field6200 - 1 < var6) {
            return 0;
        }
        int var7 = arg1;
        if (arg1 < 3 && (class252.field3358[1][var5][var6] & 0x2) != 0) {
            var7 = arg1 + 1;
        }
        return class152.field1993[var7].method216(arg2, arg3);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZB)Ljava/lang/String;", line = 101)
    public static final String method2869(int arg0, boolean arg1, byte arg2) {
        field6967++;
        if (arg2 != -51) {
            field6965 = -1;
        }
        return arg1 && arg0 >= 0 ? class421.method2601(arg1, arg0, 118, 10) : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V", line = 122)
    public static void method2870(byte arg0) {
        field6975 = null;
        field6973 = null;
        field6977 = null;
        field6980 = null;
        int var1 = -20 % ((-arg0 - 19) / 53);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lza;IIZ)Lo;", line = 134)
    public final class24 method2871(class287 arg0, int arg1, int arg2, boolean arg3) {
        field6969++;
        long var5 = (long) (arg0.field3766 << 19 | this.field6968 | arg1 << 16 | (arg3 ? 262144 : 0));
        class24 var7 = (class24) this.field6966.field1081.method3032(3589, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field6966.field1078.method2133(0, this.field6968)) {
            if (arg2 != 262144) {
                field6965 = -39;
            }
            class491 var8 = class491.method2969(this.field6966.field1078, this.field6968, 0);
            if (var8 != null) {
                var8.field7194 = var8.field7195 = var8.field7193 = var8.field7199 = 0;
                if (arg3) {
                    var8.method2971();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method2964();
                }
            }
            class24 var10 = arg0.method1236(var8, true);
            if (var10 != null) {
                this.field6966.field1081.method3046(var5, var10, arg2 ^ 0x40001);
            }
            return var10;
        } else {
            return null;
        }
    }
}
