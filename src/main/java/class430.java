import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class430 extends class238 {

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "B")
    public byte field5924 = 5;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    public static int field5927 = -1;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    public static int field5926 = 0;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public static int field5925 = 1;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "Lhk;")
    public static class460 field5930;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "Lhk;")
    public static class460 field5931;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "Lhk;")
    public static class460 field5932;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "Lhk;")
    public static class460 field5933;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "Lhk;")
    public static class460 field5934;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "Lhk;")
    public static class460 field5935;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "Lhk;")
    public static class460 field5936;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "Lhk;")
    public static class460 field5937;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "Lhk;")
    public static class460 field5938;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "Lhk;")
    public static class460 field5939;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "[Lhk;")
    private static class460[] field5940;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public int field5918;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public int field5919;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public int field5921;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public int field5923;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public int field5928;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public int field5929;

    static {
        new class112("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field5930 = new class460(14, 1);
        field5931 = new class460(15, 4);
        field5932 = new class460(16, -2);
        field5933 = new class460(17, 0);
        field5934 = new class460(18, -2);
        field5935 = new class460(20, 6);
        field5936 = new class460(21, 8);
        field5937 = new class460(22, -2);
        field5938 = new class460(23, 4);
        field5939 = new class460(24, -1);
        field5940 = new class460[32];
        class460[] var0 = class208.method1310(82);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field5940[var0[var1].field6474] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILkm;)V", line = 6)
    public static final void method2521(int arg0, class487 arg1) {
        field5920++;
        if (class55.field892.method1547(4) == 0) {
            return;
        }
        if (class221.field3118 == 0) {
            for (class9 var4 = (class9) class55.field892.method1544(-106); var4 != null; var4 = (class9) class55.field892.method1546((byte) -42)) {
                class58.field918.method347(false, false, var4.field181, arg1, arg1, class96.field1381, -56, var4.field175, var4.field177 ? class2.field21.field400 : null, var4.field180, var4.field178, var4.field176);
                var4.method1182(28818);
            }
            class480.method2825(9742);
        } else {
            if (class10.field192 == null) {
                Canvas var2 = new Canvas();
                var2.setSize(36, 32);
                class10.field192 = class487.method2858(var2, 0, class343.field4703, 0, 0, class19.field315);
                class268.field3723 = class10.field192.method1061(class231.method1450(105, class441.field6048, 0, class355.field4954), class140.method864(class120.field1685, class355.field4954, 0), true);
            }
            for (class9 var3 = (class9) class55.field892.method1544(-94); var3 != null; var3 = (class9) class55.field892.method1546((byte) -42)) {
                class58.field918.method347(false, false, var3.field181, class10.field192, arg1, class268.field3723, -31, var3.field175, var3.field177 ? class2.field21.field400 : null, var3.field180, var3.field178, var3.field176);
                var3.method1182(28818);
            }
        }
        if (arg0 < 20) {
            method2522(true);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V", line = 71)
    public static void method2522(boolean arg0) {
        field5932 = null;
        field5935 = null;
        field5940 = null;
        field5939 = null;
        field5933 = null;
        field5934 = null;
        field5930 = null;
        field5937 = null;
        if (!arg0) {
            field5931 = null;
            field5936 = null;
            field5938 = null;
        }
    }
}
