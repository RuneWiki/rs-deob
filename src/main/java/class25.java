import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class25 {

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lna;")
    private static class26 field359 = class69.method505("Connected to update server", (byte) -117);

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field362 = 0;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "S")
    public static short field364 = 256;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Lna;")
    public static class26 field365 = field359;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field366 = 0;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Z")
    public static boolean field360 = true;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Z")
    public static boolean field371 = false;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public int field368;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Ljd;")
    public static class140 field363;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILna;)V", line = 9)
    public static final void method155(int arg0, class26 arg1) {
        field372++;
        if (class4.field49 == null) {
            return;
        }
        if (arg0 != 3803) {
            field363 = (class140) null;
        }
        long var2 = arg1.method209(arg0 - 3930);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (class4.field49.length > var4 && class4.field49[var4].field2293 != var2) {
            var4++;
        }
        if (var4 < class4.field49.length && class4.field49[var4] != null) {
            class160.field2512++;
            class114.field1789.method1431(0, 162);
            class114.field1789.method579(class4.field49[var4].field2293, -2037491440);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZII)I", line = 55)
    public static final int method156(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 != 10131) {
            method157((byte) 95);
        }
        field361++;
        class186 var4 = (class186) class55.field876.method1827((long) arg2, arg0 - 10131);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field2887.length; var6++) {
            if (var4.field2887[var6] >= 0 && class115.field1818 > var4.field2887[var6]) {
                class217 var7 = class45.method341(var4.field2887[var6], (byte) 79);
                if (var7.field3457 != null) {
                    class188 var8 = (class188) var7.field3457.method1827((long) arg3, 0);
                    if (var8 != null) {
                        if (arg1) {
                            var5 += var4.field2892[var6] * var8.field2961;
                        } else {
                            var5 += var8.field2961;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 127)
    public static void method157(byte arg0) {
        field363 = null;
        if (arg0 != 121) {
            field363 = (class140) null;
        }
        field365 = null;
        field359 = null;
    }
}
