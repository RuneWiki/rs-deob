import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public class class25 {

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "Lf;")
    public static class10 field266 = class23.method139("world", (byte) -54);

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "Lf;")
    private static class10 field271 = class23.method139("Agility Training", (byte) -111);

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "I")
    public static int field272 = 0;

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "Lf;")
    private static class10 field269 = class23.method139("Rare Trees", (byte) -121);

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "Lf;")
    public static class10 field267 = class23.method139("Overview", (byte) -93);

    @OriginalMember(owner = "mapview!ma", name = "h", descriptor = "I")
    public static int field273 = 0;

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "Lf;")
    private static class10 field270 = class23.method139("Clothes Shop", (byte) -104);

    @OriginalMember(owner = "mapview!ma", name = "i", descriptor = "Lf;")
    public static class10 field274 = class23.method139("Key", (byte) -58);

    @OriginalMember(owner = "mapview!ma", name = "l", descriptor = "Lf;")
    private static class10 field277 = class23.method139("Water Source", (byte) -89);

    @OriginalMember(owner = "mapview!ma", name = "j", descriptor = "Lf;")
    public static class10 field275 = class23.method139("download", (byte) -95);

    @OriginalMember(owner = "mapview!ma", name = "o", descriptor = "I")
    public static int field280 = 0;

    @OriginalMember(owner = "mapview!ma", name = "n", descriptor = "Z")
    public static volatile boolean field279 = true;

    @OriginalMember(owner = "mapview!ma", name = "m", descriptor = "I")
    public static volatile int field278 = -1;

    @OriginalMember(owner = "mapview!ma", name = "k", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "[Lu;")
    public static class39[] field268;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method144(boolean arg0) {
        if (class9.field89.toLowerCase().indexOf("microsoft") == -1) {
            class18.field166[92] = 74;
            class18.field166[45] = 26;
            class18.field166[61] = 27;
            class18.field166[47] = 73;
            class18.field166[93] = 43;
            class18.field166[44] = 71;
            class18.field166[46] = 72;
            class18.field166[91] = 42;
            class18.field166[59] = 57;
            if (class9.field88 == null) {
                class18.field166[222] = 59;
                class18.field166[192] = 58;
            } else {
                class18.field166[222] = 58;
                class18.field166[192] = 28;
                class18.field166[520] = 59;
            }
        } else {
            class18.field166[191] = 73;
            class18.field166[190] = 72;
            class18.field166[189] = 26;
            class18.field166[223] = 28;
            class18.field166[186] = 57;
            class18.field166[188] = 71;
            class18.field166[187] = 27;
            class18.field166[222] = 59;
            class18.field166[220] = 74;
            class18.field166[221] = 43;
            class18.field166[219] = 42;
            class18.field166[192] = 58;
        }
        if (!arg0) {
            method147(null, (byte) 5);
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(I)I", line = 56)
    public static final int method145(int arg0) {
        if (arg0 != 43) {
            field278 = 50;
        }
        if (class10.field103 == null) {
            return 0;
        } else if (class10.field103.field261 == null) {
            return class41.field536[class10.field103.field264 & 0xFF];
        } else {
            return class41.field536[class10.field103.field261[class41.field538] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(B)[Lf;", line = 78)
    public static final class10[] method146(byte arg0) {
        int var1 = -115 / ((arg0 - 40) / 59);
        return new class10[] { class24.field265, mapview.field337, class38.field522, class38.field524, class11.field125, class17.field152, class20.field188, class23.field252, class33.field480, class4.field26, class41.field541, class11.field115, class22.field247, class2.field15, class5.field30, class1.field5, class19.field179, class30.field415, class31.field424, class23.field250, class2.field14, class41.field535, class27.field386, class20.field192, class4.field24, class8.field77, class35.field498, field270, class7.field72, mapview.field348, class1.field3, class30.field411, class23.field255, class15.field141, field269, class17.field146, class38.field520, class33.field475, class33.field474, field277, class19.field176, class37.field514, class36.field509, class7.field70, class19.field178, class17.field150, class20.field189, class11.field116, class33.field476, field271, class8.field74, class21.field240, class6.field61, class20.field190, class1.field7, class18.field171, class5.field37, class8.field79, class24.field263, class27.field382, class33.field469, class21.field223, class27.field383, class38.field521, class27.field383, class22.field246, class27.field383, class18.field170, class31.field423, class27.field383, class18.field163, class17.field147, mapview.field355, class21.field227, class20.field186, class27.field383, class38.field523, class27.field387, class8.field80, class27.field383, class27.field383, class27.field383, class27.field383, class27.field383, class27.field383, class27.field383, class27.field383, class27.field383, class27.field383, class27.field383, class27.field383, class27.field383, mapview.field366, class35.field500, class27.field383, class27.field383 };
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "([BB)V", line = 104)
    public static final void method147(byte[] arg0, byte arg1) {
        class28 var2 = new class28(arg0);
        if (arg1 > -10) {
            method146((byte) -97);
        }
        var2.field389 = arg0.length - 2;
        class21.field239 = var2.method184(-2);
        class35.field490 = new byte[class21.field239][];
        class1.field10 = new int[class21.field239];
        class19.field180 = new int[class21.field239];
        class31.field425 = new int[class21.field239];
        class33.field470 = new int[class21.field239];
        var2.field389 = arg0.length - class21.field239 * 8 - 7;
        class18.field168 = var2.method184(-2);
        class17.field153 = var2.method184(-2);
        int var3 = (var2.method182(-101) & 0xFF) + 1;
        for (int var4 = 0; var4 < class21.field239; var4++) {
            class19.field180[var4] = var2.method184(-2);
        }
        for (int var5 = 0; var5 < class21.field239; var5++) {
            class31.field425[var5] = var2.method184(-2);
        }
        for (int var6 = 0; var6 < class21.field239; var6++) {
            class33.field470[var6] = var2.method184(-2);
        }
        for (int var7 = 0; var7 < class21.field239; var7++) {
            class1.field10[var7] = var2.method184(-2);
        }
        var2.field389 = arg0.length - class21.field239 * 8 - (var3 + -1) * 3 - 7;
        class41.field539 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class41.field539[var8] = var2.method190((byte) -4);
            if (class41.field539[var8] == 0) {
                class41.field539[var8] = 1;
            }
        }
        var2.field389 = 0;
        for (int var9 = 0; var9 < class21.field239; var9++) {
            int var10 = class33.field470[var9];
            int var11 = class1.field10[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class35.field490[var9] = var13;
            int var14 = var2.method182(-98);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method178(-958271408);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var15 + var10 * var16] = var2.method178(-958271408);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(B)V", line = 299)
    public static void method148(byte arg0) {
        field266 = null;
        field269 = null;
        if (arg0 > -57) {
            field280 = 30;
        }
        field277 = null;
        field271 = null;
        field274 = null;
        field267 = null;
        field270 = null;
        field275 = null;
        field268 = null;
    }
}
