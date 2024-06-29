import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class69 {

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field1139 = 0;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field1138 = 1;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1145 = "Loading defaults - ";

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1146 = "shake:";

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lnc;")
    public static class89 field1141 = new class89(64);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Lpk;")
    public static class237 field1149;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Lta;")
    public static final class245 method544(int arg0, int arg1) {
        field1137++;
        class245 var2 = (class245) class104.field1529.method675(31558, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class147.field2126.method1605(arg0 ^ 0xFFFFFF81, arg1, 1);
        } else {
            var3 = class63.field1060.method1605(arg0 - 128, arg1 & 0x7FFF, 1);
        }
        class245 var4 = new class245();
        if (var3 != null) {
            var4.method1670(new class54(var3), (byte) -68);
        }
        if (arg1 >= 32768) {
            var4.method1672(116);
        }
        if (arg0 == 1) {
            class104.field1529.method677((byte) -37, (long) arg1, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
    public static final void method545(int arg0, int arg1, int arg2) {
        class243 var3 = class143.method973(arg1, -27248);
        field1147++;
        int var4 = var3.field3768;
        if (arg2 > -86) {
            return;
        }
        int var5 = var3.field3759;
        int var6 = var3.field3761;
        int var7 = class63.field1046[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class174.method1157(var4, false, ~var8 & class234.field3607[var4] | var8 & arg0 << var5);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public abstract void method546(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBI)I")
    public abstract int method547(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public static void method548(int arg0) {
        field1146 = null;
        field1145 = null;
        if (arg0 == -18701) {
            field1141 = null;
            field1149 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method549(byte arg0, String arg1) {
        field1143++;
        if (arg0 != -3) {
            field1149 = null;
        }
        return class131.method906(true, arg1, 10, true);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method550(String arg0, int arg1) {
        if (arg1 != 18986) {
            field1148 = -27;
        }
        field1142++;
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)J")
    public abstract long method551(byte arg0);
}
