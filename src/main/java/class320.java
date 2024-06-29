import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class320 extends class72 {

    @OriginalMember(owner = "client!si", name = "F", descriptor = "Z")
    public static boolean field5487 = false;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "Lsf;")
    public static class108 field5486 = class140.method973(255, "<col=ff9040>");

    @OriginalMember(owner = "client!si", name = "z", descriptor = "Z")
    public static boolean field5481 = false;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "Lpk;")
    public static class112 field5480;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "[[Lca;")
    public static class98[][] field5485;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)V", line = 4)
    public static final void method2216(int arg0, int arg1) {
        field5482++;
        class311.field5374--;
        if (class311.field5374 == arg0) {
            return;
        }
        class23.method162(class186.field3411, arg0 + 1, class186.field3411, arg0, class311.field5374 - arg0);
        class23.method162(class317.field5454, arg0 + 1, class317.field5454, arg0, class311.field5374 - arg0);
        class23.method160(class305.field5299, arg0 + 1, class305.field5299, arg0, class311.field5374 - arg0);
        class23.method158(class131.field2244, arg0 + 1, class131.field2244, arg0, class311.field5374 - arg0);
        if (arg1 <= 25) {
            field5486 = (class108) null;
        }
        class23.method159(class313.field5405, arg0 + 1, class313.field5405, arg0, class311.field5374 - arg0);
        class23.method159(class94.field1506, arg0 + 1, class94.field1506, arg0, class311.field5374 - arg0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILla;Ljava/awt/Component;BI)Lkn;", line = 33)
    public static final class199 method2217(int arg0, class139 arg1, Component arg2, byte arg3, int arg4) {
        field5484++;
        if (class210.field3755 == 0) {
            throw new IllegalStateException();
        }
        int var5 = -87 / ((arg3 + 83) / 35);
        if (arg0 < 0 || arg0 >= 2) {
            throw new IllegalArgumentException();
        }
        if (arg4 < 256) {
            arg4 = 256;
        }
        try {
            class199 var6 = (class199) Class.forName("dg").getDeclaredConstructor().newInstance();
            var6.field3598 = arg4;
            var6.field3592 = new int[(class10.field126 ? 2 : 1) * 256];
            var6.method1138(arg2);
            var6.field3603 = (arg4 & 0xFFFFFC00) + 1024;
            if (var6.field3603 > 16384) {
                var6.field3603 = 16384;
            }
            var6.method1135(var6.field3603);
            if (class182.field3335 > 0 && class92.field1448 == null) {
                class92.field1448 = new class106();
                class92.field1448.field1838 = arg1;
                arg1.method954(class92.field1448, 1, class182.field3335);
            }
            if (class92.field1448 != null) {
                if (class92.field1448.field1834[arg0] != null) {
                    throw new IllegalArgumentException();
                }
                class92.field1448.field1834[arg0] = var6;
            }
            return var6;
        } catch (Throwable var11) {
            try {
                class164 var8 = new class164(arg1, arg0);
                var8.field3598 = arg4;
                var8.field3592 = new int[(class10.field126 ? 2 : 1) * 256];
                var8.method1138(arg2);
                var8.field3603 = 16384;
                var8.method1135(var8.field3603);
                if (class182.field3335 > 0 && class92.field1448 == null) {
                    class92.field1448 = new class106();
                    class92.field1448.field1838 = arg1;
                    arg1.method954(class92.field1448, 1, class182.field3335);
                }
                if (class92.field1448 != null) {
                    if (class92.field1448.field1834[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class92.field1448.field1834[arg0] = var8;
                }
                return var8;
            } catch (Throwable var10) {
                return new class199();
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lqd;B)V", line = 123)
    public static final void method2218(class45 arg0, byte arg1) {
        field5483++;
        if (arg1 <= 0) {
            field5485 = (class98[][]) ((class98[][]) null);
        }
        for (class299 var2 = (class299) class277.field4856.method13(0); var2 != null; var2 = (class299) class277.field4856.method15((byte) 47)) {
            if (var2.field5194 == arg0) {
                if (var2.field5220 != null) {
                    class213.field3789.method2186(var2.field5220);
                    var2.field5220 = null;
                }
                var2.method1325(0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "(I)V", line = 160)
    public static void method2219(int arg0) {
        field5486 = null;
        field5485 = (class98[][]) null;
        if (arg0 != 16769) {
            field5489 = -22;
        }
        field5480 = null;
    }
}
