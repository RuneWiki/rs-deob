import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class104 {

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lw;")
    public static class141 field1830 = null;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lpj;")
    public static class237 field1835 = class33.method353("Bitte entfernen Sie ", 69);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1829 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!c", name = "i", descriptor = "[I")
    public static int[] field1837 = new int[100];

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field1840 = 0;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "[I")
    public static int[] field1839 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Lpj;")
    public static class237 field1841 = class33.method353("floorshadows", 108);

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lpj;")
    public static class237 field1838 = class33.method353(":assistreq:", 44);

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field1844 = 0;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Lfa;")
    public static class239 field1842;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Lfa;")
    public static class239 field1843;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static final void method777(int arg0) {
        class190.field3304.method942(arg0);
        field1832++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
    public static final void method778(int arg0, int arg1, int arg2) {
        field1833++;
        int var3 = arg2;
        if (arg2 > 25) {
            var3 = 25;
        }
        arg2--;
        int var4 = class36.field793[arg2];
        int var5 = class94.field1673[arg2];
        if (arg0 == 0) {
            class203.field3478++;
            class223.field3830.method368(arg1 + 50, 198);
            class223.field3830.method293((byte) 125, var3 + var3 + 3);
        }
        if (arg0 == 1) {
            class197.field3424++;
            class223.field3830.method368(76, 184);
            class223.field3830.method293((byte) 125, var3 + var3 + 3 + 14);
        }
        if (arg0 == 2) {
            class223.field3830.method368(-100, 103);
            class223.field3830.method293((byte) 125, var3 + var3 + 3);
            class22.field409++;
        }
        class223.field3830.method291(0, class119.field2083[82] ? 1 : 0);
        class223.field3830.method341(26994, class235.field4087 + var4);
        class135.field2345 = class94.field1673[0];
        class36.field815 = class36.field793[0];
        if (arg1 != 3) {
            return;
        }
        for (int var6 = 1; var6 < var3; var6++) {
            arg2--;
            class223.field3830.method317(class36.field793[arg2] - var4, 127);
            class223.field3830.method293((byte) 125, class94.field1673[arg2] - var5);
        }
        class223.field3830.method350((byte) 19, class27.field494 + var5);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIZI)Lcj;")
    public static final class115 method779(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1836++;
        int var7 = (arg4 ? 65536 : 0) + arg1 + ((arg5 << 17) - -(arg0 << 19));
        long var8 = (long) arg3 * 3147483667L + ((long) var7 * 3849834839L);
        class115 var10 = (class115) class114.field2007.method940(var8, 42);
        if (arg2 != 637806961) {
            method777(88);
        }
        if (var10 != null) {
            return var10;
        }
        class150.field2671 = false;
        class115 var11 = class36.method374(arg1, arg0, (byte) -84, arg5, arg3, false, false, arg4);
        if (var11 != null && !class150.field2671) {
            class114.field2007.method937(-115, var11, var8);
        }
        return var11;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLwf;)V")
    public static final void method780(byte arg0, class1 arg1) {
        arg1.field2 = false;
        field1831++;
        if (arg1.field4 != null) {
            arg1.field4.field3765 = 0;
        }
        for (class1 var2 = arg1.method3(); var2 != null; var2 = arg1.method5()) {
            method780((byte) 127, var2);
        }
        if (arg0 != 127) {
            field1843 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static final void method781(byte arg0) {
        class199.field3448.method942(arg0 + 27);
        field1834++;
        if (arg0 != -27) {
            field1838 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static void method782(int arg0) {
        field1843 = null;
        field1841 = null;
        field1829 = null;
        field1838 = null;
        field1835 = null;
        if (arg0 != -29267) {
            field1842 = null;
        }
        field1842 = null;
        field1837 = null;
        field1830 = null;
        field1839 = null;
    }
}
