import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class2 {

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lmn;")
    public static class161 field27 = null;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Z")
    public static boolean field29 = false;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "La;")
    public static class281 field28 = new class281();

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field32 = 0;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field31 = 0;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Lmk;")
    public static class25 field23;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "[[[B")
    public static byte[][][] field25;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILjd;I)Laf;", line = 8)
    public static final class195 method11(int arg0, int arg1, class95 arg2, int arg3) {
        field30++;
        if (arg3 <= 87) {
            return (class195) null;
        } else if (class31.method233(arg1, 0, arg0, arg2)) {
            return class269.method1883((byte) 126);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljd;Z)V", line = 25)
    public static final void method12(class95 arg0, boolean arg1) {
        field26++;
        class341.field5298 = arg0.method690((byte) -110, "p11_full");
        class297.field4580 = arg0.method690((byte) -114, "p12_full");
        class69.field990 = arg0.method690((byte) -111, "b12_full");
        class180.field2857 = arg0.method690((byte) -125, "mapfunction");
        class277.field4300 = arg0.method690((byte) -118, "hitmarks");
        if (!arg1) {
            field28 = (class281) null;
        }
        class10.field140 = arg0.method690((byte) -127, "hitbar_default");
        class78.field1143 = arg0.method690((byte) -109, "headicons_pk");
        class320.field4955 = arg0.method690((byte) -110, "headicons_prayer");
        class178.field2836 = arg0.method690((byte) -114, "hint_headicons");
        class205.field3144 = arg0.method690((byte) -123, "hint_mapmarkers");
        client.field1991 = arg0.method690((byte) -127, "mapflag");
        class79.field1155 = arg0.method690((byte) -118, "cross");
        class160.field2435 = arg0.method690((byte) -117, "mapdots");
        class87.field1247 = arg0.method690((byte) -124, "scrollbar");
        class171.field2762 = arg0.method690((byte) -121, "name_icons");
        class303.field4632 = arg0.method690((byte) -110, "floorshadows");
        class15.field199 = arg0.method690((byte) -110, "compass");
        class4.field59 = arg0.method690((byte) -123, "hint_mapedge");
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILjava/lang/String;)V", line = 54)
    public static final void method13(int arg0, int arg1, String arg2) {
        field24++;
        if (arg1 <= 114) {
            field23 = (class25) null;
        }
        class188 var3 = class147.method1111(-91, arg0, 2);
        var3.method1392((byte) -48);
        var3.field2950 = arg2;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 68)
    public static void method14(int arg0) {
        field25 = (byte[][][]) null;
        field27 = null;
        field23 = null;
        if (arg0 != 0) {
            field25 = (byte[][][]) ((byte[][][]) null);
        }
        field28 = null;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V", line = 82)
    public static final void method15(int arg0) {
        field22++;
        if (arg0 != 20620) {
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class134.method1032(var1, (byte) -89, class213.field3262, true, var2, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }
}
