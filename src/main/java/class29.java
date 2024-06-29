import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class29 extends class19 {

    @OriginalMember(owner = "client!mca", name = "s", descriptor = "I")
    public int field198 = -1;

    @OriginalMember(owner = "client!mca", name = "u", descriptor = "Lsw;")
    public static class641 field200 = new class641(8);

    @OriginalMember(owner = "client!mca", name = "w", descriptor = "Lcea;")
    public static class180 field202;

    @OriginalMember(owner = "client!mca", name = "p", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!mca", name = "q", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "client!mca", name = "t", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!mca", name = "v", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!mca", name = "x", descriptor = "Lrl;")
    public static class614 field203;

    @OriginalMember(owner = "client!mca", name = "o", descriptor = "Ljava/lang/String;")
    public String field194;

    @OriginalMember(owner = "client!mca", name = "r", descriptor = "Ljava/lang/String;")
    public String field197;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(III)V")
    public static final void method161(int arg0, int arg1, int arg2) {
        class349 var3 = class383.field5070[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field4506 != null) {
                var3.field4506 = null;
            }
        }
    }

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "(I)Lod;")
    public final class429 method162(int arg0) {
        ++field195;
        if (arg0 != -19323) {
            this.field194 = null;
        }
        return class156.field1904[super.field131];
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIII)I")
    public static final int method163(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -8552) {
            field202 = null;
        }
        ++field201;
        int var4 = -arg2 + 255;
        int var5 = (16711680 & (65280 & arg3) * arg2 | (16711935 & arg3) * arg2 & -16711936) >>> 8;
        return ((16711680 & (arg0 & 65280) * var4 | -16711936 & (16711935 & arg0) * var4) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "(I)V")
    public static void method164(int arg0) {
        field202 = null;
        field203 = null;
        if (arg0 < 84) {
            field202 = null;
        }
        field200 = null;
    }

    static {
        new class180("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field202 = new class180("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");
    }
}
