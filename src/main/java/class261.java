import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class261 {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4197 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4198 = "Hidden";

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Ltm;")
    public static class219 field4201;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4199;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
    public static final void method1796(int arg0, int arg1) {
        field4196++;
        class98.field1372 = arg0;
        if (arg1 >= -21) {
            method1798(9);
        }
        class52 var2 = class121.field1695;
        synchronized (class121.field1695) {
            class121.field1695.method335((byte) -72);
        }
        class52 var3 = class235.field3940;
        synchronized (class235.field3940) {
            class235.field3940.method335((byte) 111);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljg;[BZ)V")
    public final void method1797(class186 arg0, byte[] arg1, boolean arg2) {
        field4200++;
        if (arg0.field3066[arg0.field3044] != 31 || arg0.field3066[arg0.field3044 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4199 == null) {
            this.field4199 = new Inflater(true);
        }
        try {
            this.field4199.setInput(arg0.field3066, arg0.field3044 + 10, arg0.field3066.length - arg0.field3044 - 18);
            this.field4199.inflate(arg1);
        } catch (Exception var4) {
            this.field4199.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4199.reset();
        if (!arg2) {
            method1796(32, 4);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method1798(int arg0) {
        field4201 = null;
        if (arg0 != -19464) {
            field4198 = null;
        }
        field4197 = null;
        field4198 = null;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class261() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(III)V")
    private class261(int arg0, int arg1, int arg2) {
    }
}
