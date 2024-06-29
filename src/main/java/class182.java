import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class182 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field2977 = 0;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Lal;")
    public static class52 field2978 = new class52(20);

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Lmo;")
    public static class447 field2979;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Lu;")
    public static class45 field2981;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field2976;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 11)
    public static void method1246(int arg0) {
        field2978 = null;
        field2979 = null;
        if (arg0 != 2) {
            method1247((byte) 122, (byte[]) null);
        }
        field2976 = null;
        field2981 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B[B)Lic;", line = 24)
    public static final class415 method1247(byte arg0, byte[] arg1) {
        field2980++;
        class415 var2 = new class415();
        class186 var3 = new class186(arg1);
        var3.field3044 = var3.field3066.length - 2;
        int var4 = var3.method1272((byte) -97);
        int var5 = var3.field3066.length - var4 - 2 - 12;
        var3.field3044 = var5;
        int var6 = var3.method1284(8388607);
        var2.field6134 = var3.method1272((byte) -120);
        var2.field6133 = var3.method1272((byte) -124);
        var2.field6148 = var3.method1272((byte) -75);
        var2.field6149 = var3.method1272((byte) -73);
        int var7 = var3.method1322(false);
        if (var7 > 0) {
            var2.field6136 = new class256[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1272((byte) -47);
                class256 var10 = new class256(class111.method822((byte) 49, var9));
                var2.field6136[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method1284(8388607);
                    int var12 = var3.method1284(8388607);
                    var10.method1766((long) var11, new class160(var12), arg0 ^ 0xFFFFFFFC);
                }
            }
        }
        var3.field3044 = 0;
        var2.field6138 = var3.method1267(-105);
        var2.field6147 = new String[var6];
        var2.field6142 = new int[var6];
        var2.field6140 = new int[var6];
        if (arg0 != -63) {
            return null;
        }
        int var13 = 0;
        while (var3.field3044 < var5) {
            int var14 = var3.method1272((byte) -54);
            if (var14 == 3) {
                var2.field6147[var13] = var3.method1270(class121.method873(arg0, 9935)).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field6140[var13] = var3.method1322(false);
            } else {
                var2.field6140[var13] = var3.method1284(8388607);
            }
            var2.field6142[var13++] = var14;
        }
        return var2;
    }
}
