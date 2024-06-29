import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 extends class68 {

    @OriginalMember(owner = "client!bf", name = "ub", descriptor = "Lmb;")
    public static class84 field269 = class79.method672(true, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!bf", name = "wb", descriptor = "I")
    public static int field271 = 0;

    @OriginalMember(owner = "client!bf", name = "Bb", descriptor = "Lmb;")
    public static class84 field276 = class79.method672(true, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!bf", name = "Cb", descriptor = "I")
    public static int field277 = 0;

    @OriginalMember(owner = "client!bf", name = "vb", descriptor = "[I")
    public static int[] field270 = new int[200];

    @OriginalMember(owner = "client!bf", name = "yb", descriptor = "Lsa;")
    public static class119 field273 = new class119(64);

    @OriginalMember(owner = "client!bf", name = "Db", descriptor = "Lmb;")
    public static class84 field278 = class79.method672(true, "Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1");

    @OriginalMember(owner = "client!bf", name = "Fb", descriptor = "Lmb;")
    private static class84 field280 = class79.method672(true, "Error connecting to server)3");

    @OriginalMember(owner = "client!bf", name = "Gb", descriptor = "Lmb;")
    public static class84 field281 = field280;

    @OriginalMember(owner = "client!bf", name = "sb", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!bf", name = "tb", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bf", name = "zb", descriptor = "I")
    public int field274;

    @OriginalMember(owner = "client!bf", name = "Ab", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!bf", name = "xb", descriptor = "Lsc;")
    public static class121 field272;

    @OriginalMember(owner = "client!bf", name = "Eb", descriptor = "Ljd;")
    public static class66 field279;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)Ldd;")
    public final class26 method89(int arg0) {
        field268++;
        if (arg0 != -6767) {
            this.method89(-40);
        }
        return class98.method813(arg0 + 6766, this.field274).method73(this.field275, (byte) -89);
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)V")
    public static void method90(int arg0) {
        field276 = null;
        field273 = null;
        field281 = null;
        field278 = null;
        field270 = null;
        field272 = null;
        field280 = null;
        field269 = null;
        if (arg0 != 64) {
            method90(-32);
        }
        field279 = null;
    }
}
