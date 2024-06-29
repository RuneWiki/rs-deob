import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 {

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Lu;")
    public static class135 field1116 = class87.method676((byte) -96, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Lu;")
    public static class135 field1118 = class87.method676((byte) -110, "Standort");

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field1119 = 0;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Lu;")
    public static class135 field1121 = class87.method676((byte) -99, "chatback");

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Lu;")
    private static class135 field1113 = class87.method676((byte) -112, "Enter message to send to ");

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lu;")
    public static class135 field1120 = field1113;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field1125 = 0;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "[I")
    public static int[] field1124 = new int[32768];

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Lu;")
    private static class135 field1126 = class87.method676((byte) -120, "The server is being updated)3");

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lu;")
    public static class135 field1115 = field1126;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static final void method356(int arg0) {
        try {
            Graphics var1 = class59.field1484.getGraphics();
            class28.field678.method94(-17740, 4, var1, 0);
            class83.field1973.method94(-17740, 357, var1, 0);
            class120.field2903.method94(-17740, 4, var1, 722);
            class116.field2791.method94(-17740, 205, var1, 743);
            class58.field1428.method94(-17740, 0, var1, 0);
            class87.field2071.method94(-17740, 4, var1, 516);
            if (arg0 >= -61) {
                return;
            }
            class82.field1952.method94(-17740, 205, var1, 516);
            class99.field2407.method94(-17740, 357, var1, 496);
            class28.field677.method94(-17740, 338, var1, 0);
        } catch (Exception var2) {
            class59.field1484.repaint();
        }
        field1112++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lve;I)[I")
    public static final int[] method357(class146 arg0, int arg1) {
        field1114++;
        int var2 = arg0.field3595 >> 16;
        if (!class93.method760(arg1 ^ arg1, var2)) {
            return null;
        }
        int var3 = arg0.field3575;
        int var4 = arg0.field3669;
        class146 var7;
        for (int var5 = arg0.field3611; var5 != -1; var5 = var7.field3611) {
            var7 = class105.field2528[var2][var5 & 0xFFFF];
            var3 += var7.field3575 - var7.field3664;
            var4 += var7.field3669 - var7.field3671;
        }
        return new int[] { var3, var4 };
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static void method358(byte arg0) {
        field1124 = null;
        field1120 = null;
        if (arg0 != 43) {
            method357(null, 48);
        }
        field1113 = null;
        field1115 = null;
        field1126 = null;
        field1118 = null;
        field1116 = null;
        field1121 = null;
    }
}
