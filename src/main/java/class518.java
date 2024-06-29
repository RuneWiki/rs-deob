import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class518 {

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Lqb;")
    public class206 field7307 = new class206();

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Lsl;")
    public static class427 field7304 = new class427(16);

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field7306 = new String[100];

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Lqfa;")
    public static class85 field7308 = new class85(3, 1);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public static void method3042(boolean arg0) {
        field7304 = null;
        field7308 = null;
        field7306 = null;
        if (arg0) {
            field7304 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
    public static final void method3043(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        field7305++;
        if (arg6 != 16) {
            return;
        }
        class543 var8 = new class543();
        var8.field7574 = arg5;
        var8.field7575 = arg2;
        var8.field7576 = arg7;
        var8.field7573 = arg3;
        var8.field7579 = class336.field5031 + arg1;
        var8.field7582 = arg0;
        var8.field7577 = arg4;
        class648.field9334.method3322(var8, -112);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIBI)V")
    public static final void method3044(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field7303++;
        int var6 = class107.method968(client.field4115, 124, class309.field4556, arg2);
        int var7 = class107.method968(client.field4115, 111, class309.field4556, arg3);
        int var8 = class107.method968(class379.field5612, 116, class704.field9911, arg0);
        int var9 = class107.method968(class379.field5612, 124, class704.field9911, arg5);
        if (arg4 == -36) {
            for (int var10 = var6; var10 <= var7; var10++) {
                class705.method3938(var9, arg1, 30336, var8, class582.field8429[var10]);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static final void method3045(byte arg0) {
        if (arg0 > -46) {
            field7304 = null;
        }
        if (class623.field9017 != null) {
            class207.field3172.method3315((byte) 68);
            class92.method885();
            class136.method1116(-71);
            class183.method1341((byte) -82);
            class548.method3157((byte) 127);
            class102.method955(true);
            if (class2.field378 != null) {
                class2.field378.method3311((byte) 78);
            }
            class694.method3886(true);
            class432.method2627(255);
            class25.method483(119);
            class180.method1330((byte) -87);
            class11.method284(64, false);
            for (int var1 = 0; var1 < 2048; var1++) {
                class602 var5 = class59.field1341[var1];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field8783.length; var6++) {
                        var5.field8783[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class39.field1062; var2++) {
                class22 var3 = class459.field6542[var2].field6298;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field8783.length; var4++) {
                        var3.field8783[var4] = null;
                    }
                }
            }
            class241.field3647 = null;
            class608.field8854 = null;
            class623.field9017.method1265((byte) -67);
            class623.field9017 = null;
        }
        field7309++;
    }
}
