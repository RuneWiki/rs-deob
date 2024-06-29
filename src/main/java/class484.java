import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class484 {

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "Ltca;")
    public static class141 field6729 = new class141(4, 1);

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field6730 = 4;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V", line = 3)
    public static void method2783(int arg0) {
        field6729 = null;
        if (arg0 != 0) {
            method2784(null, 125, 2, -72, 14, -15, -118, true, false);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lr;IIIIIIZZ)V", line = 13)
    public static final void method2784(class562 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class377.field4985 = arg0;
        class143.field1940 = arg1;
        class115.field1477 = class143.field1940 > 1 && class377.field4985.method1099();
        class62.field762 = arg2;
        class458.field6012 = 0x1 << class62.field762;
        class332.field4443 = class458.field6012 >> 1;
        Math.sqrt((double) (class332.field4443 * class332.field4443 + class332.field4443 * class332.field4443));
        class171.field2428 = arg3;
        class329.field4421 = arg4;
        class641.field8846 = arg5;
        class312.field4204 = arg6;
        class419.field5505 = class346.method2064(-114);
        class270.method1608(true);
        class543.field7437 = new class207[arg3][class329.field4421][class641.field8846];
        class454.field5981 = new class270[arg3];
        if (arg7) {
            class582.field7958 = new int[class329.field4421][class641.field8846];
            class190.field2637 = new byte[class329.field4421][class641.field8846];
            class400.field5303 = new short[class329.field4421][class641.field8846];
            class631.field8736 = new class207[1][class329.field4421][class641.field8846];
            class446.field5914 = new class270[1];
        } else {
            class582.field7958 = null;
            class190.field2637 = null;
            class400.field5303 = null;
            class631.field8736 = null;
            class446.field5914 = null;
        }
        if (arg8) {
            class257.field3366 = new long[arg3][arg4][arg5];
            class141.field1915 = new class628[65535];
            class499.field6860 = new boolean[65535];
            class645.field8927 = 0;
        } else {
            class257.field3366 = null;
            class141.field1915 = null;
            class499.field6860 = null;
            class645.field8927 = 0;
        }
        class385.method2208(false);
        class150.field2058 = new class27[2][];
        class150.field2058[0] = new class27[class474.field6607[0]];
        class150.field2058[1] = new class27[class474.field6607[1]];
        class57.field730 = new int[2];
        class648.field8957 = new class27[2][];
        class648.field8957[0] = new class27[class393.field5254[0]];
        class648.field8957[1] = new class27[class393.field5254[1]];
        class629.field8709 = new int[2];
        class100.field1206 = new class27[2][];
        class100.field1206[0] = new class27[class557.field7596[0]];
        class100.field1206[1] = new class27[class557.field7596[1]];
        class189.field2627 = new int[2];
        class692.field9757 = new class27[10000];
        class53.field697 = 0;
        class351.field4681 = new class27[5000];
        class108.field1277 = 0;
        class420.field5512 = new class29[5000];
        class392.field5241 = 0;
        class165.field2371 = new boolean[class312.field4204 + class312.field4204 + 1][class312.field4204 + class312.field4204 + 1];
        class595.field8207 = new boolean[class312.field4204 + class312.field4204 + 2][class312.field4204 + class312.field4204 + 2];
        if (class115.field1477) {
            class591.field8150 = new boolean[arg3][class312.field4204 + class312.field4204 + 1][class312.field4204 + class312.field4204 + 1];
            class420.field5518 = new boolean[arg3][][];
            if (class595.field8212 != null) {
                class475.method2739();
            }
            class595.field8212 = new class638[class143.field1940];
            class377.field4985.method1038(class595.field8212.length + 1);
            class377.field4985.method1081(0);
            for (int var9 = 0; var9 < class595.field8212.length; var9++) {
                class595.field8212[var9] = new class638(var9 + 1, class377.field4985);
                (new Thread(class595.field8212[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class143.field1940 == 2) {
                var10 = 4;
                class105.field1252 = 2;
            } else if (class143.field1940 == 3) {
                var10 = 6;
                class105.field1252 = 3;
            } else {
                var10 = 8;
                class105.field1252 = 4;
            }
            class99.field1197 = new class602[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class99.field1197[var11] = new class602(class53.field675[class143.field1940 - 2][var11]);
            }
        } else {
            class105.field1252 = 1;
        }
        class493.field6795 = new int[class105.field1252 - 1];
        class190.field2629 = new int[class105.field1252 - 1];
    }
}
