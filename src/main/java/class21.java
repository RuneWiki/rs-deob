import java.awt.Canvas;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public abstract class class21 {

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "Ld;")
    public static class7 field232 = class38.method251((byte) 109, "Apothecary");

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "Ld;")
    public static class7 field234 = class38.method251((byte) 69, "50(U");

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "Ld;")
    public static class7 field235 = class38.method251((byte) -65, "");

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "Lj;")
    public static class18 field236 = new class18();

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "Ld;")
    public static class7 field238 = class38.method251((byte) -128, "37(U");

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "Lh;")
    public static class15 field231;

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field237;

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "Ljava/awt/Font;")
    public static Font field233;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(B)V", line = 17)
    public static final void method151(byte arg0) {
        mapview.field289 = null;
        class36.field479 = null;
        class24.field259 = null;
        class16.field177 = null;
        class37.field487 = null;
        class11.field126 = null;
        if (arg0 != 91) {
            method154((byte) -115);
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(B)V", line = 38)
    public static final void method152(byte arg0) {
        if (class16.field171[0][class29.field428][class5.field54] == null) {
            class24.field256 = null;
        } else {
            class24.field256 = class16.field171[0][class29.field428][class5.field54];
        }
        if (class16.field171[1][class29.field428][class5.field54] == null) {
            class24.field263 = null;
        } else {
            class24.field263 = class16.field171[1][class29.field428][class5.field54];
        }
        if (arg0 < 117) {
            method155(-92);
        }
        if (class16.field171[2][class29.field428][class5.field54] == null) {
            class22.field246 = null;
        } else {
            class22.field246 = class16.field171[2][class29.field428][class5.field54];
        }
        if (class16.field171[3][class29.field428][class5.field54] == null) {
            class31.field446 = null;
        } else {
            class31.field446 = class16.field171[3][class29.field428][class5.field54];
        }
        if (class16.field171[4][class29.field428][class5.field54] == null) {
            class38.field508 = null;
        } else {
            class38.field508 = class16.field171[4][class29.field428][class5.field54];
        }
        if (class25.field274[class29.field428][class5.field54] == null) {
            class23.field249 = null;
        } else {
            class23.field249 = class25.field274[class29.field428][class5.field54];
        }
        if (class2.field11[class29.field428][class5.field54] == null) {
            field231 = null;
        } else {
            field231 = class2.field11[class29.field428][class5.field54];
        }
        if (class8.field94[class29.field428][class5.field54] == null) {
            class20.field215 = null;
        } else {
            class20.field215 = class8.field94[class29.field428][class5.field54];
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "([BI)[B", line = 103)
    public static final byte[] method153(byte[] arg0, int arg1) {
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        if (arg1 != 255) {
            method155(-14);
        }
        class13.method107(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "(B)V", line = 116)
    public static void method154(byte arg0) {
        field236 = null;
        field233 = null;
        field235 = null;
        field232 = null;
        field237 = null;
        field238 = null;
        field234 = null;
        field231 = null;
        if (arg0 != 116) {
            field238 = null;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I)V", line = 134)
    public static final void method155(int arg0) {
        class30 var1 = class24.field254;
        synchronized (class24.field254) {
            class2.field13 = class4.field38;
            class20.field221 = class35.field472;
            class31.field440 = class17.field189;
            class7.field77 = class30.field437;
            class29.field424 = class4.field47;
            class11.field130 = class35.field475;
            class30.field437 = 0;
        }
        if (arg0 != 2) {
            method154((byte) -2);
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(I)I", line = 182)
    public static final int method156(int arg0) {
        if (arg0 != 255) {
            return -63;
        } else if (class23.field249 == null) {
            return 0;
        } else if (class23.field249.field164 == null) {
            return class12.field135[class23.field249.field166 & 0xFF];
        } else {
            return class12.field135[class23.field249.field164[class2.field10] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(III)I")
    public abstract int method120(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "(B)V")
    public abstract void method122(byte arg0);
}
