import java.awt.Frame;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class class2 extends class12 {

    @OriginalMember(owner = "mapview!aa", name = "r", descriptor = "Lna;")
    public static class26 field25 = class6.method40("details)3dat", 48);

    @OriginalMember(owner = "mapview!aa", name = "s", descriptor = "Lna;")
    public static class26 field26 = class6.method40("Mining Site", 48);

    @OriginalMember(owner = "mapview!aa", name = "u", descriptor = "Lna;")
    public static class26 field28 = class6.method40("Please wait)3)3)3 Rendering Map", 48);

    @OriginalMember(owner = "mapview!aa", name = "v", descriptor = "Lna;")
    public static class26 field29 = class6.method40("-5bersicht", 48);

    @OriginalMember(owner = "mapview!aa", name = "B", descriptor = "Lna;")
    public static class26 field34 = class6.method40("Next page", 48);

    @OriginalMember(owner = "mapview!aa", name = "t", descriptor = "Lna;")
    public static class26 field27 = class6.method40("Find", 48);

    @OriginalMember(owner = "mapview!aa", name = "C", descriptor = "Lna;")
    public static class26 field35 = class6.method40("codeversion", 48);

    @OriginalMember(owner = "mapview!aa", name = "D", descriptor = "Lna;")
    public static class26 field36 = class6.method40("Clothes Shop", 48);

    @OriginalMember(owner = "mapview!aa", name = "E", descriptor = "Lna;")
    public static class26 field37 = class6.method40("map", 48);

    @OriginalMember(owner = "mapview!aa", name = "z", descriptor = "Lna;")
    public static class26 field33 = class6.method40("Quest Start", 48);

    @OriginalMember(owner = "mapview!aa", name = "x", descriptor = "Lna;")
    public static class26 field31 = class6.method40("Loading )3)3)3", 48);

    @OriginalMember(owner = "mapview!aa", name = "w", descriptor = "[[B")
    public static byte[][] field30 = new byte[50][];

    @OriginalMember(owner = "mapview!aa", name = "y", descriptor = "Ljava/awt/Frame;")
    public static Frame field32;

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "(I)Lha;", line = 11)
    public static final class14 method14(int arg0) {
        try {
            return arg0 == -24788 ? (class14) Class.forName("e").getDeclaredConstructor().newInstance() : (class14) null;
        } catch (Throwable var2) {
            return new class11();
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(I[Lna;II)V", line = 44)
    public static final void method15(int arg0, class26[] arg1, int arg2, int arg3) {
        if (~arg0 == arg2) {
            arg1[0].method189(-34);
        } else {
            class25.method174(arg3, arg0, arg1, (byte) 116).method189(118);
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "d", descriptor = "(I)V", line = 62)
    public static void method16(int arg0) {
        field34 = null;
        field32 = null;
        field28 = null;
        field36 = null;
        field33 = null;
        field31 = null;
        field29 = null;
        field27 = null;
        if (arg0 != 95) {
            field28 = null;
        }
        field26 = null;
        field35 = null;
        field25 = null;
        field37 = null;
        field30 = null;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V", line = 86)
    public static final void method17(Throwable arg0, String arg1, int arg2) {
        try {
            if (arg2 > -115) {
                method16(-45);
            }
            String var3 = "";
            if (arg0 != null) {
                var3 = class22.method129(arg0, true);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class38.field482.field187 == null) {
                return;
            }
            class37 var8 = class38.field482.method107(new URL(class38.field482.field187.getCodeBase(), "clienterror.ws?c=" + class31.field407 + "&u=" + mapview.field350 + "&v1=" + class16.field189 + "&v2=" + class16.field180 + "&e=" + var7), -1555);
            while (var8.field458 == 0) {
                class23.method135(-24879, 1L);
            }
            if (var8.field458 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field460;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }
}
