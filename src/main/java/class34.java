import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class34 {

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[[I")
    public static int[][] field459 = new int[128][128];

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field466 = 0;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field467 = -1;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "B")
    public byte field463;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "F")
    public static float field460;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public int field458;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Ljava/lang/String;")
    public String field461;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Ljava/lang/String;")
    public String field462;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Ljava/lang/String;")
    public String field464;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lrg;B)V")
    public static final void method310(class366 arg0, byte arg1) {
        field465++;
        int var2 = arg0.method2251(-88);
        class80.field1105 = new class75[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class80.field1105[var3] = new class75();
            class80.field1105[var3].field1067 = arg0.method2251(-93);
            class80.field1105[var3].field1063 = arg0.method2278(false);
        }
        if (arg1 < 1) {
            field467 = -127;
        }
        class193.field2799 = arg0.method2251(-105);
        class200.field2874 = arg0.method2251(-106);
        class17.field231 = arg0.method2251(-128);
        class72.field1045 = new class277[class200.field2874 + 1 - class193.field2799];
        for (int var4 = 0; var4 < class17.field231; var4++) {
            int var5 = arg0.method2251(-97);
            class277 var6 = class72.field1045[var5] = new class277();
            var6.field1967 = arg0.method2306((byte) 64);
            var6.field1972 = arg0.method2258(1177515464);
            var6.field3769 = class193.field2799 + var5;
            var6.field3781 = arg0.method2278(false);
            var6.field3773 = arg0.method2278(false);
        }
        class373.field5177 = arg0.method2258(1177515464);
        class112.field1734 = true;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method311(byte arg0) {
        if (arg0 >= -17) {
            field459 = null;
        }
        field459 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)I")
    public static final int method312(byte arg0, int arg1) {
        field457++;
        return arg0 >= -65 ? 1 : arg1 >>> 8;
    }
}
