import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class234 extends class86 {

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
    public int field3274 = 0;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public int field3272 = -1;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "[I")
    public static int[] field3273 = new int[14];

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "Lpp;")
    public static class256 field3286;

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "Liu;")
    public static class390 field3287;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "Lmd;")
    public static class364 field3288;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
    public int field3275;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
    public int field3276;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
    public int field3278;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "I")
    public int field3279;

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "I")
    public int field3280;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    public int field3281;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    public int field3282;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "I")
    public int field3283;

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "I")
    public int field3285;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "Lhe;")
    public static class239 field3289;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static void method1422(int arg0) {
        field3286 = null;
        field3288 = null;
        field3287 = null;
        field3289 = null;
        if (arg0 != 7653) {
            method1422(-106);
        }
        field3273 = null;
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V")
    public static final void method1423(int arg0) {
        field3277++;
        class298.field4343.method791(((float) class118.field1533.field6913 * 0.1F + 0.7F) * class140.field1836);
        if (arg0 != -9665) {
            method1423(38);
        }
        class298.field4343.method799(class289.field4143, class477.field6871, class89.field1213, (float) (class226.field3195 << 0), (float) (class226.field3196 << 0), (float) (class408.field5989 << 0));
        class298.field4343.method783(class93.field1256);
    }

    static {
        new class194("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field3286 = new class256("", 14);
        field3287 = new class390(61, 4);
        field3288 = new class364(5000);
        field3290 = 0;
    }
}
