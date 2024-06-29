import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class175 extends class31 {

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V")
    public static final void method1181(int arg0, int arg1) {
        if (arg1 != 4096) {
            field2191 = -121;
        }
        class287.field3710.method3659(-122, arg0);
        field2190++;
        class152.field1941.method3659(arg1 ^ 0xFFFFEF9F, arg0);
        class202.field2628.method3659(-103, arg0);
        class559.field7285.method3659(-128, arg0);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)Z")
    public static final boolean method1182(int arg0, int arg1, int arg2) {
        field2192++;
        int var3 = -22 / ((-arg2 - 39) / 63);
        return (arg1 & 0x60000) != 0 | class187.method1240(arg0, arg1, -24641) || class441.method2503((byte) 68, arg1, arg0);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)Lkq;")
    public static final class700 method1183(boolean arg0) {
        field2188++;
        if (class706.field9838 == null || class386.field4956 == null) {
            return null;
        }
        class386.field4956.method1068(class706.field9838, 91);
        class700 var1 = (class700) class386.field4956.method1069(17909);
        if (var1 == null) {
            return null;
        }
        if (arg0) {
            field2191 = -2;
        }
        class576 var2 = class706.field9833.method2291((byte) 116, var1.field9761);
        return var2 != null && var2.field7812 && var2.method3147(class706.field9829, (byte) -105) ? var1 : class76.method617(5);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ltc;B)V")
    public static final void method1184(class477 arg0, byte arg1) {
        field2189++;
        if (arg1 <= 14) {
            return;
        }
        class477 var2 = class221.method1406(-117, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class461.field6047;
            var4 = class519.field6796;
        } else {
            var4 = var2.field6372;
            var3 = var2.field6224;
        }
        class66.method542(var3, var4, false, (byte) 100, arg0);
        class677.method3723(-1, var3, var4, arg0);
    }
}
