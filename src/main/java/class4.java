import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class4 {

    @OriginalMember(owner = "client!se", name = "f", descriptor = "[[B")
    private static byte[][] field38 = new byte[250][];

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Lvv;")
    public static class313 field34 = new class313(33, 6);

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Ljava/lang/String;")
    public static String field41 = null;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field42 = 0;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field40;

    // $FF: synthetic field
    @OriginalMember(owner = "client!se", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field43;

    // $FF: synthetic method
    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method16(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLs;)V", line = 3)
    public static final void method11(boolean arg0, class283 arg1) {
        if (arg0) {
            return;
        }
        field33++;
        if (class66.field977 == null) {
            return;
        }
        class518 var2 = null;
        if (arg1.field4623 == 0) {
            var2 = (class518) class134.method1018(arg1.field4627, arg1.field4621, arg1.field4628);
        }
        if (arg1.field4623 == 1) {
            var2 = (class518) class158.method1103(arg1.field4627, arg1.field4621, arg1.field4628);
        }
        if (arg1.field4623 == 2) {
            var2 = (class518) class491.method2868(arg1.field4627, arg1.field4621, arg1.field4628, field43 == null ? (field43 = method16("jg")) : field43);
        }
        if (arg1.field4623 == 3) {
            var2 = (class518) class373.method2346(arg1.field4627, arg1.field4621, arg1.field4628);
        }
        if (var2 == null) {
            arg1.field4622 = 0;
            arg1.field4631 = 0;
            arg1.field4617 = -1;
        } else {
            arg1.field4617 = var2.method28((byte) -118);
            arg1.field4631 = var2.method29(94);
            arg1.field4622 = var2.method38(5638);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)[B", line = 48)
    public static final synchronized byte[] method12(int arg0, byte arg1) {
        field37++;
        if (arg0 == 100 && class32.field517 > 0) {
            byte[] var2 = class144.field2352[--class32.field517];
            class144.field2352[class32.field517] = null;
            return var2;
        } else if (arg0 == 5000 && class529.field7777 > 0) {
            byte[] var3 = field38[--class529.field7777];
            field38[class529.field7777] = null;
            return var3;
        } else if (arg1 <= 126) {
            return null;
        } else if (arg0 == 30000 && class257.field4336 > 0) {
            byte[] var4 = class130.field2236[--class257.field4336];
            class130.field2236[class257.field4336] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 84)
    public static void method13(int arg0) {
        field41 = null;
        if (arg0 >= -9) {
            method11(false, null);
        }
        field38 = null;
        field34 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BZI)V", line = 98)
    public static final void method14(byte arg0, boolean arg1, int arg2) {
        field35++;
        class112 var3 = class295.method1888(arg1, arg2, (byte) 69);
        if (var3 == null) {
            return;
        }
        if (arg0 >= -36) {
            method11(true, null);
        }
        for (int var4 = 0; var4 < var3.field1971.length; var4++) {
            var3.field1971[var4] = -1;
            var3.field1973[var4] = 0;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIB)V", line = 135)
    public static final void method15(int arg0, int arg1, byte arg2) {
        field36++;
        class435.field6504 = arg1 - class210.field3357;
        if (arg2 != 23) {
            field34 = null;
        }
        class129.field2226 = arg0 - class210.field3340;
    }
}
