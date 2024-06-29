import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class class350 {

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Lfi;")
    public static class331 field5107 = new class331(260);

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "Z")
    public static boolean field5110 = false;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5108 = "Take";

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "[Z")
    public static boolean[] field5115 = new boolean[100];

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "J")
    public static long field5117 = 0L;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "Lra;")
    public static class57 field5114;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)I")
    public abstract int method2227(boolean arg0);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Lef;")
    public static final class283 method2228(int arg0, int arg1) {
        field5111++;
        class331 var2 = class360.field5269;
        class283 var3;
        synchronized (class360.field5269) {
            var3 = (class283) class360.field5269.method2049(arg1 - 79, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        if (arg1 != -2) {
            field5108 = null;
        }
        byte[] var4 = class142.field1999.method361(16, arg1 ^ 0xFFFFFF81, arg0);
        class283 var5 = new class283();
        if (var4 != null) {
            var5.method1813((byte) -3, new class211(var4));
        }
        class331 var6 = class360.field5269;
        synchronized (class360.field5269) {
            class360.field5269.method2046((long) arg0, 0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method2229(int arg0, Component arg1);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method2230(Component arg0, int arg1);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static final void method2231(byte arg0) {
        class189.field2578 = 0;
        field5109++;
        class305.field4362 = 0;
        class45.method284((byte) -62);
        class143.method846(15);
        class108.method601(-127);
        for (int var1 = 0; var1 < class305.field4362; var1++) {
            int var3 = class99.field1113[var1];
            if (class221.field3033 != class81.field917[var3].field6320) {
                if (class81.field917[var3].field5229.method2165((byte) -116)) {
                    class283.method1812(class81.field917[var3], 5);
                }
                class81.field917[var3].method2282((class335) null, (byte) -114);
                class81.field917[var3] = null;
            }
        }
        if (class290.field4131 != class249.field3379.field2888) {
            throw new RuntimeException("gnp1 pos:" + class249.field3379.field2888 + " psize:" + class290.field4131);
        }
        if (arg0 > -12) {
            field5108 = null;
        }
        for (int var2 = 0; var2 < class426.field6168; var2++) {
            if (class81.field917[class201.field2770[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class426.field6168);
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)V")
    public static final void method2232(int arg0, int arg1) {
        field5112++;
        if (class179.field2465 == arg1) {
            return;
        }
        class279.field3935 = class164.field2287 = class413.field5963[arg1];
        class218.field2991.method1011(50, (int) ((double) class279.field3935 * 34.46D));
        class308.field4407 = new int[class279.field3935][class164.field2287];
        class219.field3010 = new int[class279.field3935][class164.field2287];
        class311.field4449 = new int[4][class279.field3935 >> 3][class164.field2287 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class54.field613[var2] = class367.method2318(class279.field3935, (byte) -121, class164.field2287);
        }
        class266.field3716 = new byte[4][class279.field3935][class164.field2287];
        class393.method2512(class279.field3935, (byte) -23, 4, class164.field2287);
        class148.method881(class218.field2991, class164.field2287 >> 3, class279.field3935 >> 3, 127);
        class179.field2465 = arg1;
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V")
    public static void method2233(byte arg0) {
        if (arg0 >= 107) {
            field5114 = null;
            field5107 = null;
            field5115 = null;
            field5108 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([BI)Lq;")
    public static final class246 method2234(byte[] arg0, int arg1) {
        field5106++;
        class246 var2 = new class246();
        class211 var3 = new class211(arg0);
        var3.field2888 = var3.field2867.length - 2;
        int var4 = var3.method1355(32136);
        int var5 = var3.field2867.length - var4 - 2 - 12;
        var3.field2888 = var5;
        int var6 = var3.method1336((byte) -94);
        var2.field3336 = var3.method1355(arg1 ^ 0x7D8C);
        var2.field3340 = var3.method1355(32136);
        var2.field3346 = var3.method1355(32136);
        if (arg1 != 4) {
            method2233((byte) -79);
        }
        var2.field3351 = var3.method1355(32136);
        int var7 = var3.method1342((byte) -128);
        if (var7 > 0) {
            var2.field3341 = new class189[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1355(32136);
                class189 var10 = new class189(class279.method1761(false, var9));
                var2.field3341[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1336((byte) -110);
                    int var12 = var3.method1336((byte) -108);
                    var10.method1202(-1, (long) var11, new class193(var12));
                }
            }
        }
        var3.field2888 = 0;
        var2.field3348 = var3.method1340(arg1 - 4);
        var2.field3345 = new String[var6];
        var2.field3350 = new int[var6];
        var2.field3344 = new int[var6];
        int var13 = 0;
        while (var5 > var3.field2888) {
            int var14 = var3.method1355(32136);
            if (var14 == 3) {
                var2.field3345[var13] = var3.method1350(77).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field3350[var13] = var3.method1342((byte) -128);
            } else {
                var2.field3350[var13] = var3.method1336((byte) -116);
            }
            var2.field3344[var13++] = var14;
        }
        return var2;
    }
}
