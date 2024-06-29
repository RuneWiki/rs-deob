import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class476 {

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public int field6962;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    private int field6966;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public int field6973;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "B")
    public byte field6958;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public int field6957;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Lod;")
    public class476 field6964;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Ljp;")
    public static class55 field6955 = new class55(49, 0);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public int field6953;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public int field6954;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public int field6960;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public int field6961;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public int field6967;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public int field6968;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public int field6969;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public int field6971;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public int field6972;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBII)Lod;", line = 4)
    public final class476 method2874(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -65) {
            this.field6954 = -81;
        }
        field6963++;
        return new class476(this.field6966, arg0, arg2, arg3, this.field6958);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)Z", line = 16)
    public static final boolean method2875(int arg0, int arg1, int arg2) {
        int var3 = 87 / ((arg2 + 66) / 46);
        field6956++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        class395 var4 = class247.field3693.method2281(arg1, -9380);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var4.method2492(3, arg0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 45)
    public static void method2876(int arg0) {
        if (arg0 != 18041) {
            method2878((byte) 66);
        }
        field6955 = null;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Llv;", line = 56)
    public final class534 method2877(int arg0) {
        if (arg0 != -588750556) {
            method2878((byte) 52);
        }
        field6970++;
        return class40.method275(0, this.field6966);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 73)
    public static final void method2878(byte arg0) {
        field6959++;
        class296.method1969((byte) 17, class40.field667.field4193);
        int var1 = (class128.field1917 >> 10) + (class422.field6201 >> 3);
        int var2 = (class406.field5999 >> 10) + (class23.field273 >> 3);
        class30.field370 = class116.field1781.field1274 = arg0;
        class116.field1781.method3048(8, 8, true);
        byte var3 = 18;
        class406.field6003 = new int[var3];
        class285.field4436 = new byte[var3][];
        class247.field3692 = new int[var3];
        class258.field4150 = new int[var3][4];
        class455.field6766 = new int[var3];
        class83.field1372 = new byte[var3][];
        class348.field5193 = new int[var3];
        class83.field1371 = new byte[var3][];
        class489.field7139 = new byte[var3][];
        class277.field4348 = new int[var3];
        class347.field5175 = new byte[var3][];
        class254.field4107 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class338.field5076 >> 4)) / 8; var5 <= (var1 + (class338.field5076 >> 4)) / 8; var5++) {
            for (int var8 = (var2 - (class250.field4077 >> 4)) / 8; var8 <= (((class250.field4077 >> 4) + var2) / 8); var8++) {
                int var9 = (var5 << 8) + var8;
                class277.field4348[var4] = var9;
                class254.field4107[var4] = class130.field1931.method737("m" + var5 + "_" + var8, arg0 - 1);
                class406.field6003[var4] = class130.field1931.method737("l" + var5 + "_" + var8, -1);
                class348.field5193[var4] = class130.field1931.method737("n" + var5 + "_" + var8, -1);
                class247.field3692[var4] = class130.field1931.method737("um" + var5 + "_" + var8, -1);
                class455.field6766[var4] = class130.field1931.method737("ul" + var5 + "_" + var8, arg0 - 1);
                if (class348.field5193[var4] == -1) {
                    class254.field4107[var4] = -1;
                    class406.field6003[var4] = -1;
                    class247.field3692[var4] = -1;
                    class455.field6766[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class348.field5193.length; var6++) {
            class348.field5193[var6] = -1;
            class254.field4107[var6] = -1;
            class406.field6003[var6] = -1;
            class247.field3692[var6] = -1;
            class455.field6766[var6] = -1;
        }
        byte var7;
        if (class460.field6813 == 1 || class460.field6813 == 2) {
            var7 = 3;
        } else {
            var7 = 7;
        }
        class182.method1273(false, var7, var2, var1, -1);
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIB)V", line = 162)
    public class476(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field6962 = arg1;
        this.field6966 = arg0;
        this.field6973 = arg3;
        this.field6958 = arg4;
        this.field6957 = arg2;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lod;I)V", line = 173)
    public class476(class476 arg0, int arg1) {
        this.field6964 = arg0;
        this.field6958 = this.field6964.field6958;
        this.field6962 = this.field6964.field6962 + arg1;
        this.field6957 = this.field6964.field6957 + arg1;
        this.field6966 = this.field6964.field6966;
        this.field6973 = this.field6964.field6973 + arg1;
    }
}
