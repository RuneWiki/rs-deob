import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class15 {

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "S")
    public short field178;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public int field173;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "S")
    public short field166;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "B")
    public byte field177;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "S")
    public short field164;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Z")
    public boolean field165;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public int field169;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public int field168;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "B")
    public byte field176;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Ljava/lang/String;")
    public static String field179 = null;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field174 = 0;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lpu;")
    public static class411 field180 = new class411();

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lo;")
    public static class138 field167;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lis;")
    public static class73 field172;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 12)
    public static void method77(byte arg0) {
        field167 = null;
        if (arg0 > -65) {
            field179 = null;
        }
        field180 = null;
        field172 = null;
        field179 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V", line = 26)
    public static final void method78(int arg0, int arg1) {
        if (arg1 == 0) {
            field171++;
            class266 var2 = class308.method1961(true, arg0, 6);
            var2.method1778(17991);
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 48)
    public class15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field170 = arg3;
        this.field178 = (short) arg6;
        this.field173 = arg1;
        this.field166 = (short) arg4;
        this.field177 = (byte) arg7;
        this.field164 = (short) arg5;
        this.field165 = arg10;
        this.field169 = arg11;
        this.field175 = arg0;
        this.field168 = arg2;
        this.field176 = (byte) arg8;
    }
}
