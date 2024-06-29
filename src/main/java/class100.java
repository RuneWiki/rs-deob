import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class100 {

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "[S")
    public static short[] field1942 = new short[256];

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field1945 = 0;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Lcc;")
    public static class209 field1947 = class95.method669(117, "Hierhin drehen");

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "[[S")
    public static short[][] field1943;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static final void method695(int arg0) {
        field1941++;
        class286 var1 = class71.field1349;
        synchronized (class71.field1349) {
            class126.field2438 = class132.field2535;
            class150.field2735 = class175.field3189;
            class10.field199++;
            class126.field2435 = class5.field72;
            class183.field3310 = class170.field3102;
            class237.field4246 = class141.field2604;
            class76.field1413 = class136.field2557;
            class284.field4992 = class214.field3860;
            class170.field3102 = arg0;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static final void method696(byte arg0) {
        class115.field2291.method664(117);
        field1939++;
        class231.field4194.method664(-110);
        class114.field2282.method664(-60);
        if (arg0 > -69) {
            field1945 = -72;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Lhg;")
    public static final class176 method697(int arg0, int arg1) {
        class176 var2 = (class176) class42.field831.method1257((long) arg0, -74);
        field1940++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class223.field4072.method353(class243.method1690(-103, arg0), arg1 ^ 0xFFFFFE92, class118.method836(arg1 - 338, arg0));
        class176 var4 = new class176();
        if (var3 != null) {
            var4.method1211(new class106(var3), arg1 - 136);
        }
        class42.field831.method1259((long) arg0, var4, false);
        if (arg1 != 256) {
            field1942 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public static final void method698(int arg0) {
        class222.field4051.method665(1);
        field1944++;
        if (arg0 != 3) {
            field1947 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILcc;)V")
    public static final void method699(int arg0, int arg1, class209 arg2) {
        field1946++;
        class195 var3 = class178.method1229(arg1, 3, 106);
        var3.method1338(0);
        var3.field3501 = arg2;
        if (arg0 > -35) {
            field1947 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public static void method700(byte arg0) {
        field1942 = null;
        field1947 = null;
        if (arg0 != 127) {
            field1947 = null;
        }
        field1943 = null;
    }
}
