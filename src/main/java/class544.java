import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class544 extends OutputStream {

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "[F")
    public static float[] field7522 = new float[4];

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field7525 = -1;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "Lmw;")
    public static class517 field7524 = new class517(48, 5);

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "Ljb;")
    public static class519 field7528 = new class519(84, -1);

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!hv", name = "write", descriptor = "(I)V", line = 4)
    public final void write(int arg0) throws IOException {
        field7527++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 15)
    public static final int method3137(String arg0, int arg1) {
        int var2 = -53 % ((arg1 - 61) / 36);
        field7526++;
        return arg0.length() + 2;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ldt;ILak;)Leg;", line = 25)
    public static final class117 method3138(class254 arg0, int arg1, class369 arg2) {
        field7523++;
        class117 var3 = new class117(arg2);
        int var4 = arg0.method1731((byte) 64);
        boolean var5 = (var4 & 0x1) != 0;
        boolean var6 = (var4 & 0x2) != 0;
        boolean var7 = (var4 & 0x4) != 0;
        boolean var8 = (var4 & 0x8) != arg1;
        if (var5) {
            var3.field1572[0] = arg0.method1728((byte) 53);
            var3.field1576[0] = arg0.method1728((byte) 84);
            if (arg2.field5319 != -1 || arg2.field5338 != -1) {
                var3.field1572[1] = arg0.method1728((byte) 63);
                var3.field1576[1] = arg0.method1728((byte) 63);
            }
            if (arg2.field5326 != -1 || arg2.field5382 != -1) {
                var3.field1572[2] = arg0.method1728((byte) 46);
                var3.field1576[2] = arg0.method1728((byte) 67);
            }
        }
        if (var6) {
            var3.field1575[0] = arg0.method1728((byte) 26);
            var3.field1573[0] = arg0.method1728((byte) 127);
            if (arg2.field5336 != -1 || arg2.field5391 != -1) {
                var3.field1575[1] = arg0.method1728((byte) 31);
                var3.field1573[1] = arg0.method1728((byte) 87);
            }
        }
        if (var7) {
            int var9 = arg0.method1728((byte) 18);
            int[] var10 = new int[] { class519.method3018(var9, 15), class519.method3018(var9 >> 4, 15), class519.method3018(3868, var9) >> 8, class519.method3018(15, var9 >> 12) };
            for (int var11 = 0; var11 < 4; var11++) {
                if (var10[var11] != 15) {
                    var3.field1571[var10[var11]] = (short) arg0.method1728((byte) 67);
                }
            }
        }
        if (var8) {
            int var12 = arg0.method1731((byte) 64);
            int[] var13 = new int[] { class519.method3018(var12, 15), class519.method3018(15, var12 >> 4) };
            for (int var14 = 0; var14 < 2; var14++) {
                if (var13[var14] != 15) {
                    var3.field1578[var13[var14]] = (short) arg0.method1728((byte) 8);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V", line = 118)
    public static void method3139(byte arg0) {
        field7528 = null;
        field7522 = null;
        field7524 = null;
        if (arg0 != 60) {
            method3137(null, -6);
        }
    }
}
