import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class263 extends class435 {

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public int field3521 = 0;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public int field3523 = -1;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "[Loj;")
    public static class260[] field3526 = new class260[14];

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "[I")
    public static int[] field3524 = new int[14];

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "Ljc;")
    public static class305 field3533 = new class305("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field3537 = 0;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public int field3518;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public int field3519;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public int field3520;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public int field3527;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public int field3529;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public int field3531;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public int field3535;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "Lkg;")
    public static class180 field3536;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "Ltc;")
    public static class236 field3525;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "Lgp;")
    public static class36 field3530;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1616(int arg0, String arg1) {
        field3528++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = arg0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg1.charAt(var4) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static void method1617(byte arg0) {
        if (arg0 < 8) {
            method1617((byte) 1);
        }
        field3525 = null;
        field3530 = null;
        field3524 = null;
        field3533 = null;
        field3526 = null;
        field3536 = null;
    }
}
