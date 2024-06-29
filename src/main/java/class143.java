import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class143 extends class514 {

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public int field2151 = (int) (class381.method2281((byte) 81) / 1000L);

    @OriginalMember(owner = "client!we", name = "w", descriptor = "Ljava/lang/String;")
    public String field2152;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "S")
    public short field2155;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "Z")
    public static boolean field2154;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "Ldp;")
    public static class347 field2156;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "Luv;")
    public static class2 field2157;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "[[I")
    public static int[][] field2158;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "Laa;")
    public static class76 field2159;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "Lum;")
    public static class83 field2153;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)I")
    public static final int method1039(int arg0, int arg1) {
        int var7 = arg1 - 1;
        field2149++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg0 != 8) {
            method1039(-109, -82);
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public static void method1040(int arg0) {
        field2159 = null;
        field2157 = null;
        field2156 = null;
        field2153 = null;
        if (arg0 != 128) {
            method1040(122);
        }
        field2158 = null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class143(String arg0, int arg1) {
        this.field2152 = arg0;
        this.field2155 = (short) arg1;
    }

    static {
        new class347("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field2154 = false;
        field2156 = new class347("Loading...", "Lade...", "Chargement en cours...", "Carregando...");
        field2157 = new class2(22, -1);
        field2158 = new int[128][128];
        field2159 = new class76(8, 2);
    }
}
