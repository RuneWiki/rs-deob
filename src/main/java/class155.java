import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class155 extends class295 {

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "Ljava/lang/String;")
    public static String field2347 = "purple:";

    @OriginalMember(owner = "client!bn", name = "F", descriptor = "J")
    public static long field2349 = 0L;

    @OriginalMember(owner = "client!bn", name = "H", descriptor = "Lfi;")
    public static class166 field2351 = new class166();

    @OriginalMember(owner = "client!bn", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2355 = "Started 3d Library";

    @OriginalMember(owner = "client!bn", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field2356 = null;

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!bn", name = "G", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!bn", name = "I", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!bn", name = "J", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!bn", name = "N", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!bn", name = "O", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!bn", name = "K", descriptor = "Laj;")
    private class71 field2354;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
    public final String method1186(String arg0, int arg1, int arg2) {
        field2352++;
        if (this.field2354 == null) {
            return arg0;
        }
        class448 var4 = (class448) this.field2354.method614(arg2 ^ 0x7C27, (long) arg1);
        if (var4 == null) {
            return arg0;
        } else {
            if (arg2 != -31828) {
                this.method1191(21, 56, 15);
            }
            return var4.field6492;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZI)I")
    public static final int method1187(boolean arg0, int arg1) {
        field2350++;
        return arg0 ? 95 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lap;II)V")
    private final void method1188(class289 arg0, int arg1, int arg2) {
        field2346++;
        if (~arg2 != arg1) {
            return;
        }
        int var4 = arg0.method1861((byte) -72);
        if (this.field2354 == null) {
            int var5 = class443.method2751(true, var4);
            this.field2354 = new class71(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method1861((byte) -72) == 1;
            int var8 = arg0.method1880((byte) 90);
            class381 var9;
            if (var7) {
                var9 = new class448(arg0.method1871(-1));
            } else {
                var9 = new class193(arg0.method1856((byte) 55));
            }
            this.field2354.method612((long) var8, arg1 ^ 0xF9, var9);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lap;B)V")
    public final void method1189(class289 arg0, byte arg1) {
        if (arg1 > -125) {
            field2355 = null;
        }
        while (true) {
            int var3 = arg0.method1861((byte) -72);
            if (var3 == 0) {
                field2348++;
                return;
            }
            this.method1188(arg0, -250, var3);
        }
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "(B)V")
    public static void method1190(byte arg0) {
        field2351 = null;
        if (arg0 < -104) {
            field2356 = null;
            field2347 = null;
            field2355 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)I")
    public final int method1191(int arg0, int arg1, int arg2) {
        int var4 = 126 / ((arg1 + 35) / 49);
        field2353++;
        if (this.field2354 == null) {
            return arg0;
        } else {
            class193 var5 = (class193) this.field2354.method614(-92, (long) arg2);
            return var5 == null ? arg0 : var5.field2776;
        }
    }
}
