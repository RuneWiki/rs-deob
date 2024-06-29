import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class30 extends OutputStream {

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "[Z")
    public static boolean[] field357 = new boolean[100];

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field358 = 0;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "[Lod;")
    public static class224[] field363 = new class224[50];

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!qn", name = "write", descriptor = "(I)V", line = 10)
    public final void write(int arg0) throws IOException {
        field366++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 18)
    public static void method226(int arg0) {
        field363 = null;
        if (arg0 == -15217) {
            field357 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBZII)V", line = 32)
    public static final void method227(int arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        if (arg1 < 104) {
            method229((byte) 118);
        }
        field365++;
        if (class154.method1161(arg4, 97)) {
            class295.method2039(arg2, arg0, -1, false, arg3, class8.field128[arg4]);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([[II)V", line = 46)
    public static final void method228(int[][] arg0, int arg1) {
        field362++;
        if (arg1 != -16375) {
            field363 = (class224[]) null;
        }
        class79.field1178 = arg0;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V", line = 65)
    public static final void method229(byte arg0) {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class32.field393 - 1; var2++) {
                if (class118.field1843[var2] < 1000 && class118.field1843[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class311.field4832[var2];
                    class311.field4832[var2] = class311.field4832[var2 + 1];
                    class311.field4832[var2 + 1] = var3;
                    String var4 = class204.field3122[var2];
                    class204.field3122[var2] = class204.field3122[var2 + 1];
                    class204.field3122[var2 + 1] = var4;
                    int var5 = class25.field290[var2];
                    class25.field290[var2] = class25.field290[var2 + 1];
                    class25.field290[var2 + 1] = var5;
                    int var6 = class323.field4993[var2];
                    class323.field4993[var2] = class323.field4993[var2 + 1];
                    class323.field4993[var2 + 1] = var6;
                    int var7 = class336.field5229[var2];
                    class336.field5229[var2] = class336.field5229[var2 + 1];
                    class336.field5229[var2 + 1] = var7;
                    short var8 = class118.field1843[var2];
                    class118.field1843[var2] = class118.field1843[var2 + 1];
                    class118.field1843[var2 + 1] = var8;
                    long var9 = class115.field1805[var2];
                    class115.field1805[var2] = class115.field1805[var2 + 1];
                    class115.field1805[var2 + 1] = var9;
                }
            }
        }
        if (arg0 >= 45) {
            field364++;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)Lij;", line = 127)
    public static final class189 method230(int arg0, int arg1) {
        class189 var2 = (class189) class224.field3428.method747((long) arg1, (byte) 83);
        field359++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 1294) {
            field363 = (class224[]) null;
        }
        byte[] var3 = class235.field3580.method696(arg1, (byte) 111, 29);
        class189 var4 = new class189();
        if (var3 != null) {
            var4.method1396(-97, new class254(var3), arg1);
        }
        class224.field3428.method744(var4, -15692, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljd;I)I", line = 152)
    public static final int method231(class95 arg0, int arg1) {
        field360++;
        if (arg1 != -5225) {
            method229((byte) -112);
        }
        int var2 = 0;
        if (arg0.method707(class180.field2857, (byte) 100)) {
            var2++;
        }
        if (arg0.method707(class277.field4300, (byte) 63)) {
            var2++;
        }
        if (arg0.method707(class10.field140, (byte) 77)) {
            var2++;
        }
        if (arg0.method707(class78.field1143, (byte) 115)) {
            var2++;
        }
        if (arg0.method707(class320.field4955, (byte) 96)) {
            var2++;
        }
        if (arg0.method707(class178.field2836, (byte) 20)) {
            var2++;
        }
        if (arg0.method707(class205.field3144, (byte) 30)) {
            var2++;
        }
        if (arg0.method707(client.field1991, (byte) 126)) {
            var2++;
        }
        if (arg0.method707(class79.field1155, (byte) 112)) {
            var2++;
        }
        if (arg0.method707(class160.field2435, (byte) 73)) {
            var2++;
        }
        if (arg0.method707(class87.field1247, (byte) 88)) {
            var2++;
        }
        if (arg0.method707(class171.field2762, (byte) 18)) {
            var2++;
        }
        if (arg0.method707(class303.field4632, (byte) 91)) {
            var2++;
        }
        if (arg0.method707(class15.field199, (byte) 20)) {
            var2++;
        }
        if (arg0.method707(class4.field59, (byte) 48)) {
            var2++;
        }
        return var2;
    }
}
