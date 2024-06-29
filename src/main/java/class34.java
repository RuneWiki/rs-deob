import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public class class34 {

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "Lua;")
    public static class41 field425 = class16.method86("37(U", true);

    @OriginalMember(owner = "mapview!r", name = "h", descriptor = "Lua;")
    public static class41 field432 = class16.method86("sprites", true);

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "Lua;")
    public static class41 field428 = class16.method86("Hunter Store", true);

    @OriginalMember(owner = "mapview!r", name = "g", descriptor = "I")
    public static volatile int field431 = 0;

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "Lua;")
    public static class41 field426 = class16.method86("map", true);

    @OriginalMember(owner = "mapview!r", name = "i", descriptor = "Lua;")
    public static class41 field433 = class16.method86("null", true);

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "Lua;")
    public static class41 field427 = class16.method86("Bank", true);

    @OriginalMember(owner = "mapview!r", name = "j", descriptor = "Lua;")
    public static class41 field434 = class16.method86("mapscene", true);

    @OriginalMember(owner = "mapview!r", name = "e", descriptor = "Z")
    public static boolean field429 = false;

    @OriginalMember(owner = "mapview!r", name = "f", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "mapview!r", name = "k", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field435;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Z)V", line = 38)
    public static void method196(boolean arg0) {
        field433 = null;
        field428 = null;
        field425 = null;
        field434 = null;
        if (arg0) {
            method198(111);
        }
        field435 = null;
        field427 = null;
        field426 = null;
        field432 = null;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(II)[B", line = 71)
    public static final synchronized byte[] method197(int arg0, int arg1) {
        if (arg0 > -119) {
            return (byte[]) null;
        } else if (arg1 == 100 && class37.field461 > 0) {
            byte[] var2 = class43.field532[--class37.field461];
            class43.field532[class37.field461] = null;
            return var2;
        } else if (arg1 == 5000 && class41.field510 > 0) {
            byte[] var3 = class38.field471[--class41.field510];
            class38.field471[class41.field510] = null;
            return var3;
        } else if (arg1 == 30000 && class4.field67 > 0) {
            byte[] var4 = class14.field131[--class4.field67];
            class14.field131[class4.field67] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I)V", line = 130)
    public static final void method198(int arg0) {
        if (arg0 != -25580) {
            field433 = null;
        }
        if (class17.field145 != null) {
            class13 var1 = class17.field145;
            synchronized (class17.field145) {
                class17.field145 = null;
            }
        }
    }
}
