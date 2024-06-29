import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class187 {

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Lhq;")
    public static class365 field2165 = new class365(64);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method1154(int arg0) {
        if (arg0 != 10070) {
            field2165 = null;
        }
        field2165 = null;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public static final void method1155(int arg0) {
        if (arg0 < 5) {
            field2165 = null;
        }
        class27.field304.method2216((byte) 58);
        field2163++;
        class390.field5321.method1021(20791);
        class345.field4686.method1021(20791);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Lok;")
    public static final class65 method1156(byte arg0) {
        field2166++;
        if (arg0 != -107) {
            method1157(7, -80);
        }
        try {
            return (class65) Class.forName("ur").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
    public static final void method1157(int arg0, int arg1) {
        class365 var2 = class414.field5683;
        synchronized (class414.field5683) {
            class414.field5683.method2286(arg0, (byte) 36);
        }
        field2164++;
        class365 var3 = class264.field3384;
        synchronized (class264.field3384) {
            class264.field3384.method2286(arg0, (byte) 36);
        }
        if (arg1 != 64) {
            method1154(63);
        }
    }
}
