import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class341 {

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "[[I")
    public int[][] field4983 = new int[6][258];

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "[I")
    public int[] field4985 = new int[256];

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "[Z")
    public boolean[] field4998 = new boolean[16];

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
    public int field4993 = 0;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "[[B")
    public byte[][] field4986 = new byte[6][258];

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "[B")
    public byte[] field4994 = new byte[18002];

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
    public int field5002 = 0;

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "[I")
    public int[] field5010 = new int[257];

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "[B")
    public byte[] field4996 = new byte[256];

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "[B")
    public byte[] field5004 = new byte[18002];

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "[I")
    public int[] field5007 = new int[6];

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "[I")
    public int[] field4987 = new int[16];

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "[[I")
    public int[][] field5009 = new int[6][258];

    @OriginalMember(owner = "client!ar", name = "J", descriptor = "[[I")
    public int[][] field5015 = new int[6][258];

    @OriginalMember(owner = "client!ar", name = "I", descriptor = "[B")
    public byte[] field5014 = new byte[4096];

    @OriginalMember(owner = "client!ar", name = "L", descriptor = "[Z")
    public boolean[] field5017 = new boolean[256];

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "Lnn;")
    public static class446 field5006 = new class446(3, -1);

    @OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
    public static int field5013 = -1;

    @OriginalMember(owner = "client!ar", name = "K", descriptor = "I")
    public static int field5016 = 0;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "B")
    public byte field4990;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    public int field4980;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public int field4982;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public int field4984;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
    public int field4988;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public int field4992;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public int field4995;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
    public int field4997;

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
    public int field4999;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
    public int field5000;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
    public int field5001;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "I")
    public int field5003;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
    public int field5005;

    @OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
    public int field5011;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "[B")
    public byte[] field5008;

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "[B")
    public byte[] field5012;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 4)
    public static final void method2161(String arg0, int arg1) {
        field4991++;
        if (arg0.equals("")) {
            return;
        }
        if (arg1 <= 122) {
            field5013 = 126;
        }
        class288.field3880++;
        class389.method2326((byte) 118, class348.field5095);
        class253.field3491.method951((byte) -82, class500.method2820(1, arg0));
        class253.field3491.method905(arg0, 57);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V", line = 23)
    public static void method2162(byte arg0) {
        field5006 = null;
        if (arg0 < 75) {
            method2162((byte) -110);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIII)V", line = 51)
    public static final void method2163(int arg0, int arg1, int arg2, int arg3) {
        field4989++;
        int var4 = class253.field3490 + arg1;
        int var5 = class186.field2280 + arg3;
        if (class145.field1841 == null || arg1 < 0 || arg3 < 0 || class588.field8082 <= arg1 || arg3 >= class12.field113) {
            return;
        }
        long var6 = (long) (var5 << 14 | arg0 << 28 | var4);
        class397 var8 = (class397) class645.field9141.method2506(106, var6);
        if (var8 == null) {
            class581.method3264(arg0, arg1, arg3);
            return;
        }
        class172 var9 = (class172) var8.field5665.method374((byte) 86);
        if (var9 == null) {
            class581.method3264(arg0, arg1, arg3);
            return;
        }
        class419 var10 = (class419) class581.method3264(arg0, arg1, arg3);
        if (var10 == null) {
            var10 = new class419();
        } else {
            var10.field5839 = var10.field5826 = -1;
        }
        if (arg2 != 0) {
            method2161(null, -91);
        }
        var10.field5829 = var9.field2150;
        var10.field5825 = var9.field2157;
        label51: while (true) {
            class172 var11 = (class172) var8.field5665.method372(-20740);
            if (var11 == null) {
                break;
            }
            if (var10.field5829 != var11.field2150) {
                var10.field5839 = var11.field2150;
                var10.field5838 = var11.field2157;
                while (true) {
                    class172 var12 = (class172) var8.field5665.method372(arg2 ^ 0xFFFFAEFC);
                    if (var12 == null) {
                        break label51;
                    }
                    if (var10.field5829 != var12.field2150 && var10.field5839 != var12.field2150) {
                        var10.field5834 = var12.field2157;
                        var10.field5826 = var12.field2150;
                    }
                }
            }
        }
        int var13 = class394.method2340((arg1 << 9) + 256, ~arg2, arg0, (arg3 << 9) + 256);
        class502.method2841(arg0, arg1, arg3, var13, var10);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIZ)Z", line = 206)
    public static final boolean method2164(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field5006 = null;
        }
        field4981++;
        return class191.method1227(arg1, arg0, 110) | (arg0 & 0x60000) != 0 || class425.method2453(122, arg1, arg0);
    }
}
