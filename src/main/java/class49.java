import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class49 extends class130 {

    @OriginalMember(owner = "client!gda", name = "s", descriptor = "B")
    public byte field565 = 5;

    @OriginalMember(owner = "client!gda", name = "q", descriptor = "Lrp;")
    public static class342 field563 = new class342();

    @OriginalMember(owner = "client!gda", name = "x", descriptor = "Lnj;")
    public static class487 field570 = new class487("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!gda", name = "z", descriptor = "I")
    public static int field572 = 999999;

    @OriginalMember(owner = "client!gda", name = "A", descriptor = "Lqc;")
    public static class325 field573 = new class325(4);

    @OriginalMember(owner = "client!gda", name = "C", descriptor = "Lqu;")
    public static class364 field575 = new class364(25, 18);

    @OriginalMember(owner = "client!gda", name = "E", descriptor = "[[I")
    public static int[][] field577 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!gda", name = "p", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "client!gda", name = "r", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!gda", name = "u", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!gda", name = "v", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "client!gda", name = "w", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!gda", name = "y", descriptor = "I")
    public int field571;

    @OriginalMember(owner = "client!gda", name = "B", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!gda", name = "D", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!gda", name = "F", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!gda", name = "t", descriptor = "Z")
    public boolean field566;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "(B)V")
    public static void method249(byte arg0) {
        field563 = null;
        field573 = null;
        if (arg0 != 99) {
            field563 = null;
        }
        field577 = null;
        field570 = null;
        field575 = null;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lhs;IIII)V")
    public static final void method250(class539 arg0, int arg1, int arg2, int arg3, int arg4) {
        field569++;
        long var5 = (long) (arg2 << 28 | arg1 << 14 | arg4);
        class368 var7 = (class368) class546.field8147.method1333(var5, false);
        if (var7 == null) {
            class368 var8 = new class368();
            class546.field8147.method1341(var8, (byte) -97, var5);
            var8.field5322.method2492(arg0, (byte) -83);
            return;
        }
        class414 var9 = class216.field3204.method3357(arg0.field7977, (byte) -125);
        int var10 = var9.field5952;
        if (var9.field5939 == 1) {
            var10 = (arg0.field7975 + 1) * var10;
        }
        if (arg3 != -843093938) {
            field576 = -103;
        }
        for (class539 var11 = (class539) var7.field5322.method2496((byte) 47); var11 != null; var11 = (class539) var7.field5322.method2494(21)) {
            class414 var12 = class216.field3204.method3357(var11.field7977, (byte) -58);
            int var13 = var12.field5952;
            if (var12.field5939 == 1) {
                var13 = (var11.field7975 + 1) * var13;
            }
            if (var13 < var10) {
                class561.method3279(var11, arg0, (byte) -117);
                return;
            }
        }
        var7.field5322.method2492(arg0, (byte) 51);
    }
}
