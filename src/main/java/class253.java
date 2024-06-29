import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class253 {

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "J")
    private long field3456;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    private int field3454;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field3451 = 0;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "J")
    public static long field3453 = 0L;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BIIIIII)V")
    public static final void method1546(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3457++;
        class479 var7 = (class479) class74.field1107.method2070((byte) -120);
        if (arg0 >= -72) {
            method1548(54, 112, (byte) 24);
        }
        while (var7 != null) {
            if (class543.field7882 >= var7.field6717) {
                var7.method2564((byte) 2);
            } else {
                class181.method1125(var7.field6725 * 2, arg1 >> 1, var7.field6724, (var7.field6721 << 9) + 256, (var7.field6722 << 9) + 256, 125, arg5, arg2, arg4 >> 1);
                class36.field691.method2525(class438.field6260[0] + arg3, class438.field6260[1] + arg6, var7.field6720, var7.field6718 | 0xFF000000, 0, -49);
            }
            var7 = (class479) class74.field1107.method2068(-2001);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)I")
    public final int method1547(byte arg0) {
        field3449++;
        if (arg0 != 24) {
            field3451 = -89;
        }
        return this.field3454;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIB)I")
    public static final int method1548(int arg0, int arg1, byte arg2) {
        if (arg2 != -20) {
            return 124;
        }
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        field3455++;
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLuba;)V")
    private final void method1549(byte arg0, class397 arg1) {
        field3452++;
        this.field3456 |= (arg1.field5600 << class397.field5617 * this.field3454++);
        if (arg0 > -125) {
            field3451 = -43;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)Luba;")
    public final class397 method1550(int arg0, byte arg1) {
        field3448++;
        int var3 = -24 / ((-arg1 - 43) / 59);
        return class397.method2397(this.method1551(arg0, (byte) -29), (byte) 113);
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Luba;)V")
    public class253(class397 arg0) {
        this.field3456 = arg0.field5600;
        this.field3454 = 1;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(IB)I")
    private final int method1551(int arg0, byte arg1) {
        if (arg1 != -29) {
            field3451 = -127;
        }
        field3450++;
        return (int) (this.field3456 >> class397.field5617 * arg0) & 0xF;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "([Luba;)V")
    public class253(class397[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method1549((byte) -128, arg0[var2]);
        }
    }
}
