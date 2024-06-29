import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class113 {

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Z")
    public boolean field1734 = false;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field1718 = 0;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field1732 = 0;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "[S")
    public static short[] field1727 = new short[500];

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field1731 = 0;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field1722 = 0;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public int field1733;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "J")
    public long field1729;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lak;")
    public static class172 field1725;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Lj;")
    public class7 field1728;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "[[[B")
    public static byte[][][] field1719;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V", line = 8)
    public static void method785(boolean arg0) {
        field1725 = null;
        field1727 = null;
        field1719 = (byte[][][]) null;
        if (!arg0) {
            field1722 = -90;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BIIZZ)V", line = 29)
    public static final void method786(byte arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field1726++;
        class333.method2323(arg1, arg2, 0, false, arg3, arg4, class340.field5293.length - 1);
        if (arg0 >= -69) {
            method785(true);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 54)
    public static final void method787(int arg0) {
        field1723++;
        if (class103.field1511 > 0) {
            class42.method214(-105);
            return;
        }
        class323.field5006 = class320.field4966;
        if (arg0 != 500) {
            field1731 = 38;
        }
        class320.field4966 = null;
        class278.method2012(40, 116);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V", line = 74)
    public static final void method788(int arg0, int arg1) {
        if (arg0 > -37) {
            field1722 = -12;
        }
        class62.field909.method708(arg1, true);
        field1721++;
    }
}
