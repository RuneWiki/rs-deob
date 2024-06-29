import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class83 {

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1318;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "Lci;")
    public static class320 field1320;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lwn;I)V")
    public static final void method614(class519 arg0, int arg1) {
        if (arg1 != 5307) {
            method617(105);
        }
        for (int var2 = 0; var2 < class400.field5684; var2++) {
            int var3 = arg0.method3033(arg1 + 6483);
            int var4 = arg0.method3018(566990904);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class488.field7055[var3] != null) {
                class488.field7055[var3].field1283 = var4;
            }
        }
        field1319++;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIII)V")
    public static final void method615(int arg0, int arg1, int arg2, int arg3) {
        class234.field3497 = new byte[arg2][arg0][arg3];
        if (arg1 == 0) {
            field1316++;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIZ)V")
    public static final void method616(int arg0, int arg1, int arg2, boolean arg3) {
        field1317++;
        class275 var4 = class213.method1433((byte) 59, 11, arg2);
        var4.method1778(0);
        var4.field4104 = arg0;
        var4.field4113 = arg1;
        if (arg3) {
            field1318 = null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public static void method617(int arg0) {
        field1318 = null;
        if (arg0 == 0) {
            field1320 = null;
        }
    }

    static {
        new class44("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field1318 = new Color[] { new Color(16777215), new Color(16777215) };
    }
}
