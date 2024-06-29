import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class60 extends class115 {

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "[I")
    public static int[] field909 = new int[2048];

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "Ljava/lang/String;")
    public static String field910;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        if (arg0 != 242152972) {
            return null;
        } else {
            ++field914;
            int[] var3 = super.field1705.method463(arg1, false);
            if (super.field1705.field1072) {
                class164.method1094(var3, 0, class77.field1178, class187.field2664[arg1]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)I")
    public static final int method392(int arg0, byte arg1) {
        if (arg1 >= -79) {
            method394(-111, -72);
        }
        ++field907;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class60() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V")
    public static void method393(int arg0) {
        if (arg0 == 28) {
            field910 = null;
            field909 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(II)I")
    public static final int method394(int arg0, int arg1) {
        if (arg0 > -110) {
            method395(false);
        }
        ++field908;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)V")
    public static final void method395(boolean arg0) {
        class202.method1314(-127);
        ++field911;
        class197.method1256(8);
        class110.method723(1010970288);
        class10.method92(false);
        class260.method1738((byte) -115);
        class160.method1075(100);
        class94.method639((byte) -46);
        class51.method343(-1);
        class197.method1259((byte) 110);
        class9.method87(true);
        class248.method1635(-20);
        class213.method1355(-100);
        class283.method1905((byte) 112);
        class141.method938(arg0);
        class134.method909(69);
        class288.method1931(0);
        class137.method921((byte) -125);
        class228.method1492((byte) 50);
        class268.field4193.method257(false);
        class242.field3625.method257(false);
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V")
    public static final void method396(int arg0) {
        int var1 = -67 % ((50 - arg0) / 53);
        if (class192.field2754 == 30) {
            class245.method1608((byte) 84, 25);
        }
        ++field912;
    }
}
