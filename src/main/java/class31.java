import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public class class31 extends RuntimeException {

    @OriginalMember(owner = "mapview!pa", name = "i", descriptor = "Ljava/lang/Throwable;")
    public Throwable field412;

    @OriginalMember(owner = "mapview!pa", name = "g", descriptor = "Ljava/lang/String;")
    public String field410;

    @OriginalMember(owner = "mapview!pa", name = "h", descriptor = "Lua;")
    public static class41 field411 = class16.method86("Mini)2Game", true);

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "Lua;")
    public static class41 field404 = class16.method86("sprites", true);

    @OriginalMember(owner = "mapview!pa", name = "f", descriptor = "Z")
    public static boolean field409 = false;

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "I")
    public static int field405 = -1;

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "Lua;")
    public static class41 field406 = class16.method86("Summoning Obelisk", true);

    @OriginalMember(owner = "mapview!pa", name = "k", descriptor = "Lua;")
    public static class41 field414 = class16.method86("Please wait)3)3)3 Rendering Map", true);

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "mapview!pa", name = "j", descriptor = "J")
    public static long field413;

    @OriginalMember(owner = "mapview!pa", name = "e", descriptor = "[B")
    public static byte[] field408;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(I)V", line = 30)
    public static void method190(int arg0) {
        field411 = null;
        field408 = null;
        field404 = null;
        if (arg0 <= 8) {
            method190(-69);
        }
        field406 = null;
        field414 = null;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(B)V", line = 50)
    public static final void method191(byte arg0) {
        int var1 = -64 / ((arg0 + 14) / 49);
        class13 var2 = class17.field145;
        synchronized (class17.field145) {
            class32.field415 = class19.field168;
            if (class3.field53 >= 0) {
                while (class3.field55 != class3.field53) {
                    int var3 = class16.field136[class3.field55];
                    class3.field55 = class3.field55 + 1 & 0x7F;
                    if (var3 < 0) {
                        class17.field148[~var3] = false;
                    } else {
                        class17.field148[var3] = true;
                    }
                }
            } else {
                for (int var4 = 0; var4 < 112; var4++) {
                    class17.field148[var4] = false;
                }
                class3.field53 = class3.field55;
            }
            class19.field168 = mapview.field298;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 111)
    public class31(Throwable arg0, String arg1) {
        this.field412 = arg0;
        this.field410 = arg1;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(I[BII)I", line = 127)
    public static final int method192(int arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = -1;
        int var5 = arg0;
        if (arg2 != -32607) {
            method190(44);
        }
        while (arg3 > var5) {
            var4 = var4 >>> 8 ^ class21.field215[(arg1[var5] ^ var4) & 0xFF];
            var5++;
        }
        return ~var4;
    }
}
