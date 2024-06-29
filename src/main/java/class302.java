import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class302 implements class711 {

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Lin;")
    private class91 field4211;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field4204 = 0;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field4210 = -1;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lmu;")
    public static class303 field4205 = new class303(29, 7);

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)I", line = 3)
    public static final int method1963(int arg0) {
        field4212++;
        class112 var1 = class477.field6656;
        synchronized (class477.field6656) {
            if (arg0 != 2121) {
                method1964(-113);
            }
            return class477.field6656.method984(0);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)I", line = 17)
    public final int method1377(int arg0) {
        field4208++;
        int var2 = 16 / ((arg0 + 43) / 62);
        return this.field4211.method854(125) ? 100 : this.field4211.method851((byte) -31);
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V", line = 37)
    public static void method1964(int arg0) {
        field4205 = null;
        if (arg0 != -17902) {
            field4210 = 78;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)Lkea;", line = 48)
    public final class239 method1379(int arg0) {
        if (arg0 == -15004) {
            field4207++;
            return class239.field3488;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)Z", line = 59)
    public static final boolean method1965(byte arg0) {
        int var1 = 11 % ((12 - arg0) / 53);
        field4209++;
        try {
            return class582.method3337(true);
        } catch (IOException var5) {
            class288.method1878(106);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + (class480.field6701 == null ? -1 : class480.field6701.method1966((byte) 119)) + "," + (class212.field3013 == null ? -1 : class212.field3013.method1966((byte) 119)) + "," + (class517.field7204 == null ? -1 : class517.field7204.method1966((byte) 113)) + " - " + class57.field1142 + "," + (class58.field1147.field5746[0] + class221.field3177) + "," + (class367.field5236 + class58.field1147.field5743[0]) + " - ";
            for (int var4 = 0; class57.field1142 > var4 && var4 < 50; var4++) {
                var3 = var3 + class149.field2477.field3066[var4] + ",";
            }
            class444.method2672(var3, var6, 15004);
            class170.method1282(false, (byte) 11);
            return true;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lin;)V", line = 97)
    public class302(class91 arg0) {
        this.field4211 = arg0;
    }
}
