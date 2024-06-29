import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public abstract class class16 extends class439 {

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lhh;")
    public static class84 field249;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method148(String arg0, int arg1) {
        field245++;
        int var2 = arg0.length();
        int var3 = arg1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg0.charAt(var4) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
    public static final int method149(int arg0, int arg1) {
        field243++;
        if (arg0 != 12346) {
            method148(null, 36);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)Z")
    public static final boolean method150(int arg0) {
        field244++;
        if (class176.field2677) {
            try {
                class426.method2606("showVideoAd", class112.field1785.field4458, arg0 + 21615);
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
    public static void method151(int arg0) {
        if (arg0 != 530071045) {
            method150(-113);
        }
        field249 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V")
    public static final void method152(int arg0, int arg1, int arg2) {
        boolean var3 = class36.field545[0][arg1][arg2] != null && class36.field545[0][arg1][arg2].field2477 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class36.field545[var4][arg1][arg2] == null) {
                class165 var5 = class36.field545[var4][arg1][arg2] = new class165(var4, arg1, arg2);
                if (var3) {
                    var5.field2475++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZII)V")
    public static final void method153(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field250++;
        if (class397.field5830.field116 != 0 && arg3 != 0 && class420.field6182 < 50 && arg1 != -1) {
            class375.field5603[class420.field6182++] = new class310((byte) 2, arg1, arg3, arg0, arg4, 0);
        }
        if (!arg2) {
            method154(4, null);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILti;)Ljq;")
    public static final class354 method154(int arg0, class303 arg1) {
        arg1.method1918((byte) -47);
        field246++;
        if (arg0 != -5563) {
            field249 = null;
        }
        int var2 = arg1.method1918((byte) -70);
        class354 var3 = class236.method1537(var2, (byte) -106);
        var3.field5348 = arg1.method1918((byte) 94);
        int var4 = arg1.method1918((byte) -121);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1918((byte) 93);
            var3.method206(15180, arg1, var6);
        }
        var3.method771(false);
        return var3;
    }

    static {
        new class180("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        new class180("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field247 = 1;
    }
}
