import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class306 {

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "[Ljava/lang/String;")
    private String[] field4882;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "Llo;")
    public static class306 field4877 = new class306("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "[I")
    public static int[] field4883 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    public static int field4885 = 0;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lsd;B)V")
    public static final void method1950(class199 arg0, byte arg1) {
        field4880++;
        if (arg1 != 77) {
            field4877 = null;
        }
        class298.field4798 = arg0;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
    public static final void method1951(byte arg0) {
        if (arg0 != -30) {
            field4877 = null;
        }
        class159.field2554 = class265.method1772(true, 8, 35, 0.4F, (byte) 74, 2048, 4, 8);
        field4881++;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public static void method1952(int arg0) {
        field4883 = null;
        field4877 = null;
        if (arg0 != 0) {
            field4885 = -33;
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)I")
    public static final int method1953(int arg0) {
        field4878++;
        if (arg0 >= -90) {
            return 56;
        }
        class491 var1 = class305.field4873;
        boolean var2 = false;
        if (class511.field7485 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class491.method2860(var3, null, 0, null, 0, 0);
        }
        long var4 = class19.method91((byte) 109);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method824(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class19.method91((byte) 91) - var4);
        var1.method2864(0, (byte) 13, 100, 0, 100, -16777216);
        if (var2) {
            var1.method2867((byte) -117);
        }
        return var7;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method1954(int arg0, int arg1) {
        if (arg1 != -30366) {
            method1953(-33);
        }
        field4884++;
        return this.field4882[arg0];
    }

    @OriginalMember(owner = "client!lo", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4879++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class306(String arg0, String arg1, String arg2, String arg3) {
        this.field4882 = new String[] { arg0, arg1, arg2, arg3 };
    }
}
