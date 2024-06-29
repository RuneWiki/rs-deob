import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class160 extends class5 {

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public int field2421 = 0;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public int field2426 = -1;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2420 = null;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field2430 = new String[100];

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "Ljava/lang/String;")
    public static String field2432 = "";

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public static int field2424 = 0;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public int field2418;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    public int field2422;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public int field2423;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public int field2425;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    public int field2429;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public int field2431;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public int field2434;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
    public int field2436;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    public int field2437;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V", line = 14)
    public static void method1194(byte arg0) {
        field2432 = null;
        if (arg0 <= -101) {
            field2430 = null;
            field2420 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljd;Ljd;Z)V", line = 26)
    public static final void method1195(class95 arg0, class95 arg1, boolean arg2) {
        class98.field1415 = arg0;
        field2433++;
        class56.field732 = arg1;
        class98.field1415.method685((byte) 15, 34);
        int var3 = (int) (Math.random() * 21.0D) - 10;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        if (!arg2) {
            field2420 = (String) null;
        }
        class206.field3161 = var4 + var6;
        class328.field5057 = var5 + var6;
        class238.field3620 = var3 + var6;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V", line = 76)
    public static final void method1196(int arg0, int arg1) {
        if (class224.field3430 == arg1 && arg1 != 0) {
            class321 var2 = class178.field2831[arg1];
            var2.method353(class38.field569);
        }
        if (arg0 != -1) {
            field2435 = -81;
        }
        field2427++;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()V", line = 98)
    public static final void method1197() {
        GL var0 = class73.field1051;
        var0.glDisableClientState(32886);
        class73.method544(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class73.method538();
        for (int var1 = 0; var1 < class319.field4929[0].length; var1++) {
            class58 var2 = class319.field4929[0][var1];
            if (var2.field750 >= 0 && class7.method74(class164.field2662.method667(-124, var2.field750), true)) {
                var0.glColor4fv(class109.method834(8514, var2.field769), 0);
                float var3 = 201.5F - (var2.field767 ? 1.0F : 0.5F);
                var2.method411(class213.field3262, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class73.method550();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class73.method525();
    }
}
