import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class116 extends class195 {

    @OriginalMember(owner = "client!pq", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field1477 = new String[200];

    @OriginalMember(owner = "client!pq", name = "T", descriptor = "Lwf;")
    public static class79 field1475 = new class79(23, -1);

    @OriginalMember(owner = "client!pq", name = "X", descriptor = "Lwf;")
    public static class79 field1479 = new class79(45, 0);

    @OriginalMember(owner = "client!pq", name = "S", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!pq", name = "U", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!pq", name = "W", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!pq", name = "ab", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!pq", name = "Z", descriptor = "Lit;")
    public static class422 field1481;

    @OriginalMember(owner = "client!pq", name = "Y", descriptor = "Lmj;")
    public static class430 field1480;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZI)V")
    public static final void method728(boolean arg0, int arg1) {
        ++field1476;
        if (arg0) {
            if (~class36.field472 != 0) {
                class63.method393(arg1 ^ -6709, class36.field472);
            }
            for (class465 var2 = (class465) class146.field2146.method2769((byte) 103); var2 != null; var2 = (class465) class146.field2146.method2768((byte) -88)) {
                if (!var2.method1512((byte) -64)) {
                    var2 = (class465) class146.field2146.method2769((byte) -104);
                    if (var2 == null) {
                        break;
                    }
                }
                class207.method1354(var2, false, -127, true);
            }
            class36.field472 = -1;
            class146.field2146 = new class470(8);
            class204.method1280(-1);
            class36.field472 = class138.field1814;
            class451.method2632(false, (byte) 100);
            class453.method2661((byte) 127);
            class290.method1820(class36.field472);
        }
        class105.method590(0);
        class360.field5183 = -1;
        class163.method1022(false, class387.field5502);
        class492.field6935 = new class452();
        class492.field6935.field2163[0] = 52;
        class492.field6935.field4331 = 6656;
        class492.field6935.field4317 = arg1;
        class343.field4996 = 0;
        class490.field6904 = 0;
        class492.field6935.field2159[0] = 52;
        if (~class136.field1807 == -3) {
            class343.field4996 = class418.field5842 << 7;
            class490.field6904 = class111.field1417 << 7;
        } else {
            class434.method2564(3);
        }
        class141.method887(24);
        if (~class490.field6904 != -1 && class343.field4996 != 0) {
            class349.method2183((byte) -96);
            class211.method1368((byte) -76, 28);
        } else {
            class211.method1368((byte) -100, 10);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
    public static final void method729(int arg0, String[] arg1, short[] arg2) {
        ++field1478;
        class139.method878(arg0, arg2, arg1, (byte) -127, arg1.length + -1);
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)V")
    public static void method730(boolean arg0) {
        field1481 = null;
        field1479 = null;
        field1475 = null;
        field1477 = null;
        if (!arg0) {
            method731(22, -57, -83);
        }
        field1480 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field1474;
        int[][] var3 = super.field1835.method999((byte) 104, arg1);
        if (arg0 > -67) {
            field1475 = null;
        }
        if (super.field1835.field2395 && this.method1196(26256)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field2858 * super.field2858;
            for (int var8 = 0; class356.field5147 > var8; ++var8) {
                int var9 = super.field2862[var8 % super.field2861 + var7];
                var6[var8] = class367.method2256(var9 << 4, 4080);
                var5[var8] = class367.method2256(65280, var9) >> 4;
                var4[var8] = class367.method2256(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(III)Llr;")
    public static final class489 method731(int arg0, int arg1, int arg2) {
        ++field1482;
        class489 var3 = (class489) class110.field1393.method2761((long) arg2 | (long) arg1 << 32, (byte) -112);
        if (arg0 != -625541408) {
            field1481 = null;
        }
        if (var3 == null) {
            var3 = new class489(arg1, arg2);
            class110.field1393.method2767(-1, var3.field3568, var3);
        }
        return var3;
    }
}
