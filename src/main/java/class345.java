import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class345 extends OutputStream {

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "J")
    public static long field4831 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field4824 = -1;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "Lmi;")
    public static class496 field4829;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B[BI)[B")
    public static final byte[] method2170(byte arg0, byte[] arg1, int arg2) {
        field4826++;
        if (arg0 < 101) {
            method2174(34);
        }
        byte[] var3 = new byte[arg2];
        class363.method2319(arg1, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZZ)Ljda;")
    public static final class228 method2171(int arg0, boolean arg1, boolean arg2) {
        field4828++;
        class174[] var3 = class726.field9828;
        synchronized (class726.field9828) {
            class228 var4;
            if (class726.field9828.length <= arg0 || class726.field9828[arg0].method1300((byte) 111)) {
                var4 = new class228();
                var4.field3313 = new class317[arg0];
                for (int var5 = 0; var5 < arg0; var5++) {
                    var4.field3313[var5] = new class317();
                }
            } else {
                var4 = (class228) class726.field9828[arg0].method1299(-104);
                var4.method4018(false);
                int var10002 = class234.field3391[arg0]--;
            }
            var4.field3308 = arg1;
            if (arg2) {
                field4831 = 43L;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)Z")
    public static final boolean method2172(int arg0, int arg1, int arg2) {
        field4825++;
        int var3 = -114 / ((arg1 - 36) / 55);
        return (arg2 & 0x70000) != 0 | class566.method3278(arg0, arg2, (byte) 50) || class231.method1607(arg2, arg0, 7);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ldb;Z)I")
    public static final int method2173(class324 arg0, boolean arg1) {
        field4830++;
        String var2 = class693.method3875((byte) -126, arg0);
        int[] var3 = null;
        if (class474.method2790(-12081, arg0.field4505)) {
            var3 = class721.field9801.method162(-115, (int) arg0.field4502).field4915;
        } else if (arg0.field4496 != -1) {
            var3 = class721.field9801.method162(-76, arg0.field4496).field4915;
        } else if (class79.method729(arg0.field4505, (byte) -44)) {
            class751 var6 = (class751) class86.field1546.method1465((long) ((int) arg0.field4502), -6008);
            if (var6 != null) {
                class9 var7 = var6.field10510;
                class334 var8 = var7.field126;
                if (var8.field4694 != null) {
                    var8 = var8.method2110(class390.field5635, -1);
                }
                if (var8 != null) {
                    var3 = var8.field4659;
                }
            }
        } else if (class339.method2143(8806, arg0.field4505)) {
            Object var4 = null;
            class99 var5;
            if (arg0.field4505 == 1001) {
                var5 = class76.field1366.method1680(0, (int) arg0.field4502);
            } else {
                var5 = class76.field1366.method1680(0, (int) (arg0.field4502 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field1780 != null) {
                var5 = var5.method925(class390.field5635, (byte) 47);
            }
            if (var5 != null) {
                var3 = var5.field1752;
            }
        }
        if (var3 != null) {
            var2 = var2 + class609.method3465(var3, true);
        }
        int var9 = class140.field2316.method3392(var2, class236.field3436, arg1);
        if (arg0.field4494) {
            var9 += class94.field1658.method1626() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!tk", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4827++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method2174(int arg0) {
        if (arg0 > 53) {
            field4829 = null;
        }
    }
}
