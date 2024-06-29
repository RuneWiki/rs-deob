import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class130 extends class285 {

    @OriginalMember(owner = "client!la", name = "E", descriptor = "Lrh;")
    public class128 field2145;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "Z")
    public static boolean field2142 = false;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "Lwl;")
    public static class81 field2144 = new class81(50);

    @OriginalMember(owner = "client!la", name = "G", descriptor = "Lve;")
    public static class255 field2147 = class87.method607(89, "Mem:");

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZBLve;)V", line = 6)
    public static final void method958(boolean arg0, byte arg1, class255 arg2) {
        field2143++;
        int var3 = -25 / ((arg1 + 51) / 61);
        if (!arg0) {
            try {
                class293.field5025.getAppletContext().showDocument(arg2.method1763(class293.field5025.getCodeBase(), 10), "_top");
            } catch (Exception var8) {
            }
            return;
        }
        if (class281.field4827 && class9.field127) {
            try {
                class179.method1267(class221.field3728.field626, 32448, new Object[] { arg2.method1763(class293.field5025.getCodeBase(), 10).toString() }, "openjs");
                return;
            } catch (Throwable var9) {
            }
        }
        try {
            class293.field5025.getAppletContext().showDocument(arg2.method1763(class293.field5025.getCodeBase(), 10), "_blank");
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)V", line = 49)
    public static final void method959(byte arg0, int arg1) {
        if (arg0 != -57) {
            method958(false, (byte) -4, (class255) null);
        }
        class310.field5288.method562((byte) 69, arg1);
        field2146++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lsj;", line = 74)
    public static final class51 method960(int arg0, int arg1) {
        field2141++;
        class51 var2 = (class51) class279.field4774.method58(arg1 ^ arg1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class132.field2181.method636(class58.method355(false, arg0), (byte) 114, class222.method1562(-29, arg0));
        class51 var4 = new class51();
        if (var3 != null) {
            var4.method303(new class70(var3), (byte) 13);
        }
        class279.field4774.method63(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lrg;ILrg;)V", line = 93)
    public static final void method961(class88 arg0, int arg1, class88 arg2) {
        class104.field1750 = arg2;
        field2140++;
        if (arg1 != -15268) {
            method958(true, (byte) 70, (class255) null);
        }
        class23.field352 = arg0;
        class181.field2939 = class104.field1750.method617(arg1 ^ 0xFFFF8782, 3);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZII)V", line = 108)
    public static final void method962(int arg0, boolean arg1, int arg2, int arg3) {
        field2148++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg0 != 11034) {
            method958(true, (byte) 10, (class255) null);
        }
        class92.field1584 = arg2;
        class88.field1462 = arg1;
        class10.field147 = arg3;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lrh;)V", line = 124)
    public class130(class128 arg0) {
        this.field2145 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V", line = 133)
    public static void method963(int arg0) {
        if (arg0 == -21863) {
            field2147 = null;
            field2144 = null;
        }
    }
}
