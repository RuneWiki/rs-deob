import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class185 extends class132 {

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
    public static volatile int field3232 = 0;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "Le;")
    public static class191 field3235 = class54.method368("Lade Schrifts-=tze )2 ", 2047);

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
    public static int field3237 = 10;

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "Le;")
    public static class191 field3238 = class54.method368("Fertigkeit)2", 2047);

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    public static void method1252(int arg0) {
        if (arg0 == 0) {
            field3238 = null;
            field3235 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1253(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3234++;
        if (arg3 == arg5) {
            class192.method1363((byte) 84, arg0, arg1, arg2, arg5);
            return;
        }
        int var6 = -61 % ((-arg4 - 6) / 49);
        if (arg1 - arg5 >= class37.field678 && class207.field3680 >= (arg1 + arg5) && class242.field4314 <= arg0 - arg3 && class99.field1584 >= (arg0 + arg3)) {
            class267.method1834(arg1, -121, arg3, arg0, arg2, arg5);
        } else {
            class176.method1182(arg1, arg5, 9, arg0, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)Lc;")
    public static final class60 method1254(byte arg0) {
        class60 var1 = new class60(class36.field661, class3.field22, class253.field4489[0], class245.field4360[0], class68.field1183[0], class47.field842[0], class161.field2731[0], class19.field261);
        field3233++;
        if (arg0 <= 91) {
            field3238 = null;
        }
        class228.method1628((byte) 0);
        return var1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Lub;")
    public static final class9 method1255(int arg0, int arg1, int arg2) {
        class199 var3 = class201.field3608[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class9 var4 = var3.field3541;
            var3.field3541 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
    public static final void method1256(int arg0) {
        if (class30.field420 < 0) {
            class30.field420 = 0;
            class270.field4767 = -1;
            class225.field4008 = -1;
        }
        if (class189.field3327 < class30.field420) {
            class225.field4008 = -1;
            class270.field4767 = -1;
            class30.field420 = class189.field3327;
        }
        field3236++;
        if (arg0 > class67.field1160) {
            class225.field4008 = -1;
            class270.field4767 = -1;
            class67.field1160 = 0;
        }
        if (class67.field1160 > class161.field2728) {
            class270.field4767 = -1;
            class225.field4008 = -1;
            class67.field1160 = class161.field2728;
        }
    }
}
