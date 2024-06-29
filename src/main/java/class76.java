import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class class76 {

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lp;")
    private static class280 field1250 = class18.method140((byte) -119, "M");

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field1247 = 0;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lp;")
    public static class280 field1246 = field1250;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "[J")
    public static long[] field1248 = new long[100];

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lp;")
    public static class280 field1253 = field1250;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Lp;")
    public static class280 field1255 = class18.method140((byte) -119, "; Max)2Age=");

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field1254 = 1;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)I")
    public static final int method564(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > -107) {
            method564(-66, -100, 120, -119);
        }
        field1249++;
        if (arg0 <= arg2) {
            return arg2 > arg3 ? arg3 : arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)[B")
    public abstract byte[] method565(byte arg0);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method566(int arg0) {
        field1248 = null;
        field1253 = null;
        if (arg0 != 100) {
            field1248 = null;
        }
        field1246 = null;
        field1250 = null;
        field1255 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([BB)V")
    public abstract void method567(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
    public static final void method568(boolean arg0) {
        field1252++;
        class185.field3261++;
        if (arg0) {
            field1253 = null;
        }
    }
}
