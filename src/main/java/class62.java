import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class62 {

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field772 = 0;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lec;")
    public static class40 field767 = new class40("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method316(int arg0) {
        if (arg0 == 22452) {
            field767 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
    public static final void method317(byte arg0) {
        if (arg0 != 0) {
            field767 = null;
        }
        field768++;
        int var1 = class204.method1109(false);
        if (var1 == 0) {
            class276.field3945 = null;
            class421.method2513(26110, 0);
        } else if (var1 == 1) {
            class67.method345((byte) 0, 16604);
            class421.method2513(26110, 512);
            if (class140.field1686 != null) {
                class178.method876(118);
            }
        } else {
            class67.method345((byte) (class154.field1858 - 4 & 0xFF), 16604);
            class421.method2513(arg0 + 26110, 2);
        }
        class174.field2094 = class100.field1217;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILcj;)I")
    public static final int method318(int arg0, class198 arg1) {
        if (arg0 != 9) {
            field772 = -4;
        }
        field769++;
        int var2 = arg1.field2757;
        class349 var3 = arg1.method1018(-101);
        if (arg1.field2497) {
            var2 = arg1.field2751;
        } else if (arg1.field2514 == var3.field5003 || arg1.field2514 == var3.field5010 || arg1.field2514 == var3.field5007 || arg1.field2514 == var3.field4978) {
            var2 = arg1.field2740;
        } else if (arg1.field2514 == var3.field4982 || arg1.field2514 == var3.field5001 || arg1.field2514 == var3.field4974 || arg1.field2514 == var3.field5005) {
            var2 = arg1.field2754;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method319(int arg0, int arg1, int arg2) {
        field771++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (arg2 < var3) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }
}
