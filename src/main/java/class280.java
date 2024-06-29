import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public abstract class class280 extends class192 {

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "Loh;")
    public static class258 field4817 = class153.method1046("hint_mapedge", 116);

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public static int field4818 = 0;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "[I")
    public static int[] field4813 = new int[5];

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "Loh;")
    public static class258 field4816 = class153.method1046("Lade)3)3)3", 86);

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "Ls;")
    public static class171 field4814;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "[I")
    public static int[] field4819;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(Z)V", line = 20)
    public static void method1969(boolean arg0) {
        field4813 = null;
        if (arg0) {
            field4818 = -24;
        }
        field4817 = null;
        field4819 = null;
        field4816 = null;
        field4814 = null;
    }

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "(B)Z", line = 42)
    public static final boolean method1970(byte arg0) {
        field4820++;
        if (arg0 > -65) {
            field4816 = (class258) null;
        }
        try {
            return class179.method1230(-74);
        } catch (IOException var5) {
            class190.method1285(-21956);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class48.field725 + "," + class121.field2132 + "," + class15.field193 + " - " + class241.field4184 + "," + (class152.field2606.field975[0] + class229.field3955) + "," + (class152.field2606.field959[0] + class311.field5271) + " - ";
            for (int var4 = 0; class241.field4184 > var4 && var4 < 50; var4++) {
                var3 = var3 + class293.field5036.field4066[var4] + ",";
            }
            class107.method796(var6, (byte) -92, var3);
            class39.method306(-21);
            return true;
        }
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method958(byte arg0);

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(B)Z")
    public abstract boolean method960(byte arg0);
}
