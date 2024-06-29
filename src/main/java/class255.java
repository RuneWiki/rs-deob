import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class255 {

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lub;")
    public static class227 field4477 = class257.method1749("gleiten:", 17263);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lta;")
    public static class105 field4475 = null;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "[[[B")
    public static byte[][][] field4478;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)Lli;")
    public static final class78 method1736(int arg0, int arg1, int arg2) {
        class108 var3 = class261.field4539[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class78 var4 = var3.field2037;
            var3.field2037 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(JI)V")
    public static final void method1737(long arg0, int arg1) {
        class176.field2935.field3879 = 0;
        class176.field2935.method1443(48, 0);
        class176.field2935.method1457(arg0, arg1 ^ 0x21);
        class100.field1755 = 0;
        class70.field1241 = arg1;
        class257.field4505 = -3;
        field4480++;
        class145.field2508 = 1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBI)Lta;")
    public static final class105 method1738(int arg0, byte arg1, int arg2) {
        field4479++;
        class105 var3 = class27.method137(arg0, arg1 - 954490001);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field1956 == null || arg2 >= var3.field1956.length) {
            return null;
        } else {
            if (arg1 != -63) {
                field4477 = null;
            }
            return var3.field1956[arg2];
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static void method1739(byte arg0) {
        field4475 = null;
        field4478 = null;
        field4477 = null;
        if (arg0 < 83) {
            method1736(-20, -114, 64);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static final void method1740(int arg0) {
        field4474++;
        try {
            if (class140.field2419 == 1) {
                int var1 = class235.field4078.method1707(arg0 ^ 0xFFFFA8C6);
                if (var1 > 0 && class235.field4078.method1699(false)) {
                    int var2 = var1 - class12.field239;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class235.field4078.method1703(16, var2);
                    return;
                }
                class235.field4078.method1709(-1);
                class235.field4078.method1698((byte) -116);
                if (class252.field4359 == null) {
                    class140.field2419 = 0;
                } else {
                    class140.field2419 = 2;
                }
                class199.field3408 = null;
                class42.field702 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class235.field4078.method1709(arg0 ^ 0xFFFFA8C7);
            class199.field3408 = null;
            class42.field702 = null;
            class140.field2419 = 0;
            class252.field4359 = null;
        }
        if (arg0 != 22328) {
            method1740(47);
        }
    }
}
