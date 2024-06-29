import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class199 {

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Lfg;")
    public static class18 field2904 = new class18(200);

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "[I")
    public static int[] field2909 = new int[128];

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)Lsb;", line = 7)
    public static final class361 method1514(int arg0, byte arg1) {
        field2908++;
        class361 var2 = (class361) class397.field5823.method103(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class423.field6170.method1355(arg0, -12607, 1);
        class361 var4 = new class361();
        if (var3 != null) {
            var4.method2316(101, new class37(var3), arg0);
        }
        class397.field5823.method113(var4, 0, (long) arg0);
        return arg1 == -42 ? var4 : null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V", line = 37)
    public static final void method1515(int arg0, int arg1, int arg2) {
        class349.field4961 = new class18(arg0);
        field2901++;
        class264.field3974 = new class18(arg1);
        int var3 = -107 / ((arg2 - 18) / 55);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Z", line = 48)
    public static final boolean method1516(byte arg0) {
        field2903++;
        if (class439.field6387 == 0) {
            if (arg0 != -84) {
                field2907 = -98;
            }
            return class416.field6028.method1613(arg0 + 160);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 65)
    public static void method1517(int arg0) {
        field2904 = null;
        field2909 = null;
        if (arg0 >= -93) {
            method1516((byte) 39);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(III)Z", line = 80)
    public static final boolean method1518(int arg0, int arg1, int arg2) {
        field2902++;
        if (!class84.field1365) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class45.field710[var3] == null || class45.field710[var3][var4] == null) {
            return false;
        }
        class258 var5 = class45.field710[var3][var4];
        if (arg0 != -30) {
            return false;
        }
        if (arg1 == -1 && var5.field3793 == 0) {
            for (class278 var6 = (class278) class276.field4153.method157((byte) -125); var6 != null; var6 = (class278) class276.field4153.method145(-110)) {
                if (var6.field4182 == 5 || var6.field4182 == 1010 || var6.field4182 == 29 || var6.field4182 == 37 || var6.field4182 == 14) {
                    for (class258 var7 = class342.method2207(var6.field4178, (byte) 14); var7 != null; var7 = class127.method1079(var7, false)) {
                        if (var5.field3854 == var7.field3854) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class278 var8 = (class278) class276.field4153.method157((byte) -125); var8 != null; var8 = (class278) class276.field4153.method145(31)) {
                if (var8.field4181 == arg1 && var5.field3854 == var8.field4178 && (var8.field4182 == 5 || var8.field4182 == 1010 || var8.field4182 == 29 || var8.field4182 == 37 || var8.field4182 == 14)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B[S)[S", line = 149)
    public static final short[] method1519(byte arg0, short[] arg1) {
        field2905++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != -12) {
            method1518(27, 96, 73);
        }
        short[] var2 = new short[arg1.length];
        class82.method640(arg1, 0, var2, 0, arg1.length);
        return var2;
    }
}
