import java.awt.Color;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class28 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "[[B")
    public static byte[][] field387 = new byte[1000][];

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field391 = -1;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[Ljava/awt/Color;")
    public static Color[] field392 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "[I")
    public static int[] field394 = new int[1000];

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "Z")
    public static boolean field395 = false;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Lqv;")
    public static class316 field393 = new class316(109, -1);

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Lci;")
    public static class320 field396;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 16)
    public static final String method166(long arg0, int arg1) {
        field389++;
        class465.field6761.setTime(new Date(arg0));
        if (arg1 != 10) {
            method166(-40L, -7);
        }
        int var3 = class465.field6761.get(7);
        int var4 = class465.field6761.get(5);
        int var5 = class465.field6761.get(2);
        int var6 = class465.field6761.get(1);
        int var7 = class465.field6761.get(11);
        int var8 = class465.field6761.get(12);
        int var9 = class465.field6761.get(13);
        return class249.field3718[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class513.field7454[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)Llr;", line = 47)
    public static final class539 method167(byte arg0, int arg1) {
        field388++;
        class539 var2 = (class539) class369.field5336.method2982(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class390.field5541.method2037(arg1, (byte) 45, 1);
        class539 var4 = new class539();
        var4.field7940 = arg1;
        if (var3 != null) {
            var4.method3174((byte) 51, new class519(var3));
        }
        var4.method3176(false);
        if (var4.field7921 == 2 && client.field3116.method2284(true, (long) arg1) == null) {
            client.field3116.method2292((long) arg1, new class175(class262.field3962), (byte) -127);
            class517.field7490[class262.field3962++] = var4;
        }
        class369.field5336.method2981(var4, 127, (long) arg1);
        if (arg0 != -127) {
            method166(-56L, 53);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 94)
    public static void method168(int arg0) {
        field394 = null;
        field387 = null;
        field396 = null;
        if (arg0 != 10) {
            method168(34);
        }
        field393 = null;
        field392 = null;
    }
}
