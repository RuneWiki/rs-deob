import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class87 extends class110 {

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    private final int field1463;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    private final int field1466;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    private final int field1464;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    private final int field1465;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field1469 = 0;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "Lda;")
    public static class275 field1472 = class255.method1672(94, "Titelbild geladen)3");

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public static int field1475 = 0;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BII)V")
    public final void method162(byte arg0, int arg1, int arg2) {
        int var4 = -86 / ((48 - arg0) / 42);
        ++field1471;
        int var5 = this.field1465 * arg1 >> 12;
        int var6 = this.field1466 * arg1 >> 12;
        int var7 = this.field1463 * arg2 >> 12;
        int var8 = this.field1464 * arg2 >> 12;
        class94.method677(var5, super.field1942, var8, var6, var7, -125);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(III)V")
    public final void method164(int arg0, int arg1, int arg2) {
        if (arg2 == 32768) {
            ++field1467;
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(IIIIII)V")
    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1463 = arg1;
        this.field1466 = arg0;
        this.field1464 = arg3;
        this.field1465 = arg2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ldj;II)V")
    public static final void method622(class104 arg0, int arg1, int arg2) {
        ++field1468;
        if (arg0.field1779 > class35.field576) {
            class29.method170(arg0, true);
        } else if (class35.field576 <= arg0.field1737) {
            class31.method186(arg0, 64);
        } else {
            class150.method1064(-118, arg0);
        }
        if (arg1 != 0) {
            method623(false);
        }
        if (arg0.field1770 < 128 || ~arg0.field1758 > -129 || ~arg0.field1770 <= -13185 || ~arg0.field1758 <= -13185) {
            arg0.field1724 = -1;
            arg0.field1779 = 0;
            arg0.field1737 = 0;
            arg0.field1776 = -1;
            arg0.field1770 = arg0.field1752[0] * 128 + arg0.method750((byte) -108) * 64;
            arg0.field1758 = arg0.field1722[0] * 128 + 64 * arg0.method750((byte) -118);
            arg0.method754(-13798);
        }
        if (class66.field1094 == arg0 && (arg0.field1770 < 1536 || ~arg0.field1758 > -1537 || arg0.field1770 >= 11776 || arg0.field1758 >= 11776)) {
            arg0.field1776 = -1;
            arg0.field1737 = 0;
            arg0.field1779 = 0;
            arg0.field1724 = -1;
            arg0.field1770 = arg0.field1752[0] * 128 + 64 * arg0.method750((byte) -127);
            arg0.field1758 = arg0.field1722[0] * 128 + 64 * arg0.method750((byte) -120);
            arg0.method754(-13798);
        }
        class148.method1050(arg0, (byte) -31);
        class96.method685((byte) -104, arg0);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIB)V")
    public final void method165(int arg0, int arg1, byte arg2) {
        ++field1473;
        if (arg2 != -53) {
            field1474 = -119;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
    public static void method623(boolean arg0) {
        field1472 = null;
        if (!arg0) {
            method623(true);
        }
    }
}
