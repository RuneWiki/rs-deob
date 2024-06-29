import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public abstract class class471 {

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "Liu;")
    public static class517 field6772 = new class517(105, 3);

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "Lne;")
    public static class175 field6774 = new class175();

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6775 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "Llj;")
    public static class59 field6776 = new class59();

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "Lfa;")
    public static class482 field6773;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "[Lha;")
    public static class116[] field6769;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method2734(int arg0, int arg1, int arg2) {
        if (arg1 != -20470) {
            field6772 = null;
        }
        field6770++;
        return (arg2 & 0x40000) != 0 | class33.method301(arg2, arg0, (byte) -99) || class586.method3358(55, arg0, arg2);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIIILqa;)Lr;", line = 17)
    public static final class519 method2735(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class167 arg6) {
        field6768++;
        long var7 = (long) arg0;
        class519 var9 = (class519) class142.field2216.method2407(false, var7);
        short var10 = 2055;
        if (var9 == null) {
            class560 var11 = class307.method1903((byte) 93, arg0, 0, class193.field2784);
            if (var11 == null) {
                return null;
            }
            if (var11.field7981 < 13) {
                var11.method3147(0, -126);
            }
            var9 = arg6.method400(var11, var10, class319.field4629, 64, 768);
            class142.field2216.method2408(var9, var7, -111);
        }
        class519 var12 = var9.method765((byte) 2, var10, true);
        if (arg2 != 0) {
            var12.method1367(arg2);
        }
        if (arg4 != 0) {
            var12.method1383(arg4);
        }
        if (arg1 != 0) {
            var12.method1400(arg1);
        }
        if (arg3 != arg5) {
            var12.method1368(0, arg3, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Z)V", line = 63)
    public static void method2736(boolean arg0) {
        field6772 = null;
        field6776 = null;
        if (!arg0) {
            field6774 = null;
            field6769 = null;
            field6775 = null;
            field6773 = null;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)V", line = 79)
    public static final void method2738(int arg0, int arg1) {
        field6771++;
        if (arg0 <= 126) {
            field6772 = null;
        }
        class109.method918(0);
        class185.method1243((byte) -122);
        class169.method1173(-1, true, arg1);
        class568.method3224(class353.field5059, (byte) 11, class159.field2378, class325.field4675);
        class542.method3040(class325.field4675, true, class159.field2378);
        class539.method3030((byte) -72);
        class278.method1794(class25.field351, (byte) 94);
        class530.method2980(-6891);
        class229.method1508(0);
        if (class64.field893 == 2) {
            class307.method1904(true, 3);
        } else if (class64.field893 == 6) {
            class307.method1904(true, 7);
        } else if (class64.field893 == 9) {
            class307.method1904(true, 10);
            return;
        } else if (class64.field893 == 1) {
            class92.method815(class325.field4675, true, class159.field2378);
            return;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IBI)Z", line = 119)
    public static final boolean method2740(int arg0, byte arg1, int arg2) {
        field6767++;
        if (arg1 != -122) {
            field6772 = null;
        }
        return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(II)I", line = 138)
    public static final int method2742(int arg0, int arg1) {
        if (arg1 >= -20) {
            return 52;
        } else {
            field6766++;
            return arg0 >>> 7;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(III[B)V")
    public abstract void method2733(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
    public abstract void method2737(int arg0);

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(II)Z")
    public abstract boolean method2739(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(III[B)I")
    public abstract int method2741(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V")
    public abstract void method2743(byte arg0);
}
