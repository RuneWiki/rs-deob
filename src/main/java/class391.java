import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public abstract class class391 {

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public int field5403;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    public int field5406;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public int field5404;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "Lrc;")
    public static class108 field5400 = new class108(6, 6);

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "Lim;")
    public static class268 field5402 = new class268();

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
    public static final void method2369(int arg0) {
        class142.field1979 = null;
        int var1 = 110 / ((arg0 - 25) / 43);
        class103.field1437 = null;
        field5399++;
        class54.field803 = null;
        class303.field4308 = false;
        class388.field5324 = null;
        class266.field3833 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V")
    public abstract void method1255(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(III)V")
    public abstract void method1254(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(III)V")
    public abstract void method1256(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V")
    public static void method2370(boolean arg0) {
        field5402 = null;
        field5400 = null;
        if (arg0) {
            method2371((byte) 121);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)Z")
    public static final boolean method2371(byte arg0) {
        field5405++;
        if (arg0 != -100) {
            method2371((byte) -68);
        }
        return class303.field4310 > 0;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(III)V")
    public class391(int arg0, int arg1, int arg2) {
        this.field5403 = arg0;
        this.field5406 = arg1;
        this.field5404 = arg2;
    }
}
