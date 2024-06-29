import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class743 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public int field10235 = -1;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public int field10234 = 64;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public int field10243 = 64;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public int field10246 = 1;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public int field10236 = 2;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Z")
    public boolean field10247 = false;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Z")
    public boolean field10248 = false;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Z")
    public static boolean field10242 = true;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "[C")
    public static char[] field10244 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Z")
    public static boolean field10240 = false;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field10245 = 0;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field10233;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field10237;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field10238;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field10239;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field10241;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Z")
    public static final boolean method4114(int arg0) {
        field10239++;
        class781 var1 = (class781) class22.field202.method1041(1048832);
        if (var1 == null) {
            return false;
        }
        int var2 = -106 / ((-arg0 - 2) / 43);
        for (int var3 = 0; var3 < var1.field10735; var3++) {
            if (var1.field10732[var3] != null && var1.field10732[var3].field4970 == 0) {
                return false;
            }
            if (var1.field10728[var3] != null && var1.field10728[var3].field4970 == 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILgga;)V")
    private final void method4115(int arg0, int arg1, int arg2, class511 arg3) {
        if (arg0 == 1) {
            this.field10235 = arg3.method3002(-1);
            if (this.field10235 == 65535) {
                this.field10235 = -1;
            }
        } else if (arg0 == 2) {
            this.field10234 = arg3.method3002(-1) + 1;
            this.field10243 = arg3.method3002(-1) + 1;
        } else if (arg0 == 3) {
            arg3.method3030(-25984);
        } else if (arg0 == 4) {
            this.field10236 = arg3.method3013(-127);
        } else if (arg0 == 5) {
            this.field10246 = arg3.method3013(6);
        } else if (arg0 == 6) {
            this.field10248 = true;
        } else if (arg0 == 7) {
            this.field10247 = true;
        }
        field10237++;
        if (arg1 != 4) {
            this.field10243 = 102;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILgga;B)V")
    public final void method4116(int arg0, class511 arg1, byte arg2) {
        field10238++;
        while (true) {
            int var4 = arg1.method3013(76);
            if (var4 == 0) {
                if (arg2 > -51) {
                    method4117(13);
                    return;
                } else {
                    return;
                }
            }
            this.method4115(var4, 4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Liaa;")
    public static final class116 method4117(int arg0) {
        if (arg0 <= 70) {
            return null;
        }
        field10233++;
        class116 var1 = class537.method3194((byte) -120);
        var1.field1578 = null;
        var1.field1573 = 0;
        var1.field1575 = new class432(5000);
        return var1;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public static void method4118(int arg0) {
        if (arg0 <= -110) {
            field10244 = null;
        }
    }
}
