import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class153 {

    @OriginalMember(owner = "client!je", name = "h", descriptor = "[I")
    public static int[] field2570 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!je", name = "i", descriptor = "[I")
    public static int[] field2571 = new int[2500];

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field2572 = -1;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[Lja;")
    public static class105[] field2563;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static final void method1045(int arg0) {
        class71.field1115++;
        field2568++;
        class273.field4778.method1697(237, 121);
        class273.field4778.method1256((long) arg0, (byte) 84);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IBI)V")
    public static final void method1046(int arg0, byte arg1, int arg2) {
        class52.field806[arg0] = arg2;
        field2566++;
        if (arg1 >= -27) {
            method1045(104);
        }
        class240 var3 = (class240) class84.field1327.method992((byte) 125, (long) arg0);
        if (var3 == null) {
            class240 var4 = new class240(4611686018427387905L);
            class84.field1327.method986(var4, (long) arg0, -1);
        } else if (var3.field4267 != 4611686018427387905L) {
            var3.field4267 = class149.method1024(-14898) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZIII)I")
    public static final int method1047(boolean arg0, int arg1, int arg2, int arg3) {
        class100 var4 = (class100) class166.field2750.method992((byte) 125, (long) arg2);
        field2564++;
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        int var6 = 0;
        if (arg1 != -24205) {
            method1049(-81L, -5);
        }
        while (var4.field1552.length > var6) {
            if (var4.field1552[var6] >= 0 && class45.field704 > var4.field1552[var6]) {
                class241 var7 = class9.method52(true, var4.field1552[var6]);
                if (var7.field4303 != null) {
                    class120 var8 = (class120) var7.field4303.method992((byte) 125, (long) arg3);
                    if (var8 != null) {
                        if (arg0) {
                            var5 += var4.field1553[var6] * var8.field2027;
                        } else {
                            var5 += var8.field2027;
                        }
                    }
                }
            }
            var6++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljl;IIB)Lni;")
    public static final class195 method1048(class101 arg0, int arg1, int arg2, byte arg3) {
        field2565++;
        if (arg3 <= 41) {
            return null;
        } else if (class131.method941(arg2, arg0, arg1, -93)) {
            return class252.method1731(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(JI)V")
    public static final void method1049(long arg0, int arg1) {
        field2569++;
        class273.field4778.field3169 = arg1;
        class273.field4778.method1292(7, (byte) -64);
        class273.field4778.method1256(arg0, (byte) 84);
        class35.field509 = 0;
        class25.field354 = 0;
        class79.field1223 = 1;
        class235.field4056 = -3;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public static void method1050(int arg0) {
        field2571 = null;
        field2563 = null;
        if (arg0 == 4194303) {
            field2570 = null;
        }
    }
}
