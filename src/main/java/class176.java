import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class176 extends class332 {

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2560 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public int field2550;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public int field2554;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    public int field2556;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "I")
    public int field2562;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "I")
    public int field2564;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "Lcc;")
    public class263 field2552;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "Lcc;")
    public class263 field2557;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "Ljava/lang/String;")
    public String field2553;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "Z")
    public boolean field2558;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "[Lv;")
    public static class80[] field2563;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "[Ljava/lang/Object;")
    public Object[] field2551;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)Lcl;", line = 6)
    public static final class141 method1208(int arg0) {
        if (arg0 <= 56) {
            return (class141) null;
        }
        field2565++;
        try {
            return (class141) Class.forName("vd").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)I", line = 24)
    public static final int method1209(int arg0, int arg1, int arg2) {
        field2559++;
        int var3 = 1;
        if (arg2 >= -47) {
            method1209(-40, -102, -51);
        }
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V", line = 62)
    public static void method1210(byte arg0) {
        if (arg0 > -38) {
            field2561 = 69;
        }
        field2560 = null;
        field2563 = null;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(III)Lcc;", line = 76)
    public static final class263 method1211(int arg0, int arg1, int arg2) {
        field2555++;
        class263 var3 = class91.method530(arg1, arg0 + 10989327);
        if (arg0 != 1) {
            method1210((byte) -80);
        }
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field3975 == null || var3.field3975.length <= arg2) {
            return null;
        } else {
            return var3.field3975[arg2];
        }
    }
}
