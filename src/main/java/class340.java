import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class340 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lhc;")
    public static class368 field4597 = new class368("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "[[I")
    public static int[][] field4600 = new int[128][128];

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field4602 = 0;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "[I")
    public static int[] field4601 = new int[14];

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2074(int arg0) {
        field4599++;
        class103.field1425 = new class108[class152.field2190.method1933(0)][];
        class435.field6147 = new boolean[class152.field2190.method1933(0)];
        if (arg0 >= -46) {
            field4602 = -58;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 24)
    public static void method2075(byte arg0) {
        field4600 = null;
        field4601 = null;
        field4597 = null;
        if (arg0 <= 57) {
            field4602 = 5;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILaj;Lea;)I", line = 36)
    public static final int method2076(int arg0, class71 arg1, class58 arg2) {
        int var3 = 122 % ((85 - arg0) / 36);
        field4598++;
        if (arg1.field1000 != -1) {
            return arg1.field1000;
        }
        if (arg1.field997 != -1) {
            class55 var4 = class122.field1846.method1366(arg2.method166() ? arg1.field997 : arg1.field984, -11039);
            if (!var4.field709) {
                return var4.field723;
            }
        }
        return arg1.field995;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1395(int arg0, Component arg1);

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)I")
    public abstract int method1396(int arg0);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method1397(Component arg0, byte arg1);
}
