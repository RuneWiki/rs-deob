import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class130 extends class275 {

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2027 = "Loaded textures";

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public int field2029;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "Ljava/lang/String;")
    public String field2032;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "Ljava/lang/String;")
    public String field2033;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIBIILwf;Z)V", line = 5)
    public static final void method879(int arg0, int arg1, byte arg2, int arg3, int arg4, class306 arg5, boolean arg6) {
        class82.field1219 = arg1;
        class278.field4286 = 1;
        class283.field4341 = arg3;
        field2031++;
        class284.field4354 = arg6;
        class160.field2483 = arg0;
        class85.field1289 = arg5;
        if (arg2 != -83) {
            method883(-126);
        }
        class150.field2371 = arg4;
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)Lvk;", line = 25)
    public final class271 method880(int arg0) {
        if (arg0 > -2) {
            return (class271) null;
        } else {
            field2030++;
            return class54.field765[this.field4226];
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)I", line = 43)
    public static final int method881(int arg0, int arg1, int arg2, int arg3) {
        field2025++;
        int var4 = arg3 / arg1;
        int var5 = arg3 & arg1 - 1;
        int var6 = arg1 - 1 & arg0;
        int var7 = arg0 / arg1;
        int var8 = class240.method1638(var4, var7, false);
        int var9 = class240.method1638(var4 - arg2, var7, false);
        int var10 = class240.method1638(var4, var7 + 1, false);
        int var11 = class240.method1638(var4 + 1, var7 + 1, false);
        int var12 = class108.method727(true, var9, arg1, var5, var8);
        int var13 = class108.method727(true, var11, arg1, var5, var10);
        return class108.method727(true, var13, arg1, var6, var12);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILgn;)Lpj;", line = 71)
    public static final class126 method882(int arg0, class303 arg1) {
        if (arg0 == -1) {
            field2028++;
            return new class126(arg1.method2042(7), arg1.method2042(7), arg1.method2042(7), arg1.method2042(7), arg1.method2059(255), arg1.method2059(255), arg1.method2043((byte) -113));
        } else {
            return (class126) null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)V", line = 82)
    public static void method883(int arg0) {
        field2027 = null;
        if (arg0 != 1) {
            field2026 = -71;
        }
    }
}
