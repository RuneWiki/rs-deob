import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class77 {

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Lma;")
    public static class5 field1037 = new class5();

    @OriginalMember(owner = "client!m", name = "g", descriptor = "[I")
    public static int[] field1041 = new int[14];

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1042 = "Loading wordpack - ";

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "[Luj;")
    public static class169[] field1040;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)I", line = 6)
    public static final int method574(int arg0, int arg1, int arg2, int arg3) {
        field1039++;
        if (arg2 == arg3) {
            return arg3;
        }
        int var4 = 128 - arg1;
        if (arg0 != -16335) {
            field1041 = (int[]) null;
        }
        int var5 = (arg2 & 0xFF00FF) * arg1 + (arg3 & 0xFF00FF) * var4 & 0xFF00FF00;
        int var6 = ((arg3 & -16711936) >>> 7) * var4 + ((arg2 >>> 7 & 0x1FE01FE) * arg1) & 0xFF00FF00;
        return var6 + (var5 >> 7);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 26)
    public static void method575(int arg0) {
        field1042 = null;
        field1037 = null;
        field1040 = null;
        field1041 = null;
        if (arg0 != 16711935) {
            method577((byte) 119, -54, -46);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)I", line = 45)
    public static final int method576(int arg0, boolean arg1) {
        field1036++;
        long var2 = class219.method1609(-898);
        class286 var4 = arg1 ? (class286) class10.field192.method2174(256) : (class286) class10.field192.method2164((byte) 97);
        if (arg0 < 50) {
            return 118;
        }
        while (var4 != null) {
            if (var2 > (var4.field4419 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field4419 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field4430;
                    class220.field3477[var5] = class256.field4046[var5];
                    var4.method2028(13329);
                    return var5;
                }
                var4.method2028(13329);
            }
            var4 = (class286) class10.field192.method2164((byte) 98);
        }
        return -1;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BII)Z", line = 83)
    public static final boolean method577(byte arg0, int arg1, int arg2) {
        field1038++;
        if (arg0 != 24) {
            field1041 = (int[]) null;
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        class121 var3 = class249.method1790(arg0 ^ 0x5C, arg2);
        return var3.method873(arg1, -1);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)V", line = 108)
    public static final void method578(boolean arg0, int arg1) {
        field1035++;
        if (class166.field2716 == arg0) {
            return;
        }
        if (arg1 != -16711936) {
            method575(18);
        }
        class166.field2716 = arg0;
        class101.method703((byte) -13);
    }
}
