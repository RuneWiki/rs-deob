import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class239 extends class117 {

    @OriginalMember(owner = "client!di", name = "K", descriptor = "Z")
    public volatile boolean field3373 = true;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "I")
    public static int field3369 = -1;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "Ltm;")
    public static class112 field3366 = new class112("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!di", name = "M", descriptor = "Llm;")
    public static class84 field3375 = new class84("", 14);

    @OriginalMember(owner = "client!di", name = "E", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "Z")
    public boolean field3370;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "Z")
    public boolean field3371;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIZIZ)Lfc;", line = 6)
    public static final class343 method1497(int arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field3374++;
        if (arg1 != 1000000) {
            method1500(109, (class106) null);
        }
        class18 var5 = null;
        if (class378.field5344 != null) {
            var5 = new class18(arg0, class378.field5344, class350.field4796[arg0], 1000000);
        }
        class55.field901[arg0] = class478.field6758.method1593(class251.field3526, arg0, class382.method2292(arg1, 1000127), var5);
        if (arg4) {
            class55.field901[arg0].method827((byte) 82);
        }
        return new class343(class55.field901[arg0], arg2, arg3);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIBI)I", line = 27)
    public static final int method1498(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field3368++;
        if (arg2 != -114) {
            method1498(59, 52, (byte) 127, 67);
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILms;)V", line = 51)
    public static final void method1499(int arg0, class363 arg1) {
        if (arg1.field5093 == 5 && arg1.field5195 != -1) {
            class104.method663(arg1, (byte) -112, class338.field4636);
        }
        field3367++;
        if (arg0 != -1) {
            field3369 = -9;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILbn;)Ljava/lang/String;", line = 65)
    public static final String method1500(int arg0, class106 arg1) {
        int var2 = 44 % ((arg0 + 17) / 56);
        field3372++;
        return arg1.field1522 == null || arg1.field1522.length() <= 0 ? arg1.field1514 : arg1.field1514 + class182.field2651.method695(-121, class487.field6867) + arg1.field1522;
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V", line = 81)
    public static void method1501(int arg0) {
        field3366 = null;
        field3375 = null;
        if (arg0 != 3) {
            method1498(-81, -102, (byte) 3, -106);
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(B)I")
    public abstract int method417(byte arg0);

    @OriginalMember(owner = "client!di", name = "g", descriptor = "(I)[B")
    public abstract byte[] method414(int arg0);
}
