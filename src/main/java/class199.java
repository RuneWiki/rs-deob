import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class199 {

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Z")
    public boolean field3181 = false;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field3173 = 0;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field3182 = 0;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Lck;")
    public static class119 field3185 = class298.method1987((byte) 125, "settings=");

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public int field3174;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public int field3177;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "J")
    public long field3175;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Lvc;")
    public class293 field3178;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZLwe;III)V", line = 7)
    public static final void method1269(int arg0, boolean arg1, class56 arg2, int arg3, int arg4, int arg5) {
        field3184++;
        if (class74.field1154 >= 50 || arg2.field915 == null || arg2.field915.length <= arg0 || arg2.field915[arg0] == null) {
            return;
        }
        int var6 = arg2.field915[arg0][0];
        int var7 = var6 >> 8;
        int var8 = var6 & 0xF;
        if (arg2.field915[arg0].length > 1) {
            int var9 = (int) (Math.random() * (double) arg2.field915[arg0].length);
            if (var9 > 0) {
                var7 = arg2.field915[arg0][var9];
            }
        }
        if (arg4 >= -59) {
            method1272(50, (byte) -54, -42, -22, false);
        }
        int var10 = var6 >> 4 & 0x7;
        if (var8 == 0) {
            if (arg1) {
                class158.method1008(var7, 0, -51, var10);
            }
        } else if (class184.field2916 != 0) {
            int var11 = (arg5 - 64) / 128;
            int var12 = (arg3 - 64) / 128;
            class220.field3535[class74.field1154] = var7;
            class134.field2152[class74.field1154] = var10;
            class262.field4250[class74.field1154] = 0;
            class249.field4023[class74.field1154] = null;
            class272.field4471[class74.field1154] = (var11 << 16) + (var12 << 8) + var8;
            class74.field1154++;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)I", line = 70)
    public static final int method1270(int arg0, int arg1) {
        if (arg0 != -193) {
            return 116;
        }
        field3180++;
        if (arg1 >= 65 && arg1 <= 90 || arg1 >= 192 && arg1 <= 222 && arg1 != 215) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 105)
    public static void method1271(int arg0) {
        field3185 = null;
        if (arg0 <= 0) {
            field3185 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IBIIZ)V", line = 116)
    public static final void method1272(int arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        int var5 = -20 % ((-arg1 - 31) / 34);
        field3183++;
        if (class247.method1609(30881, arg0)) {
            class243.method1581(arg4, -1, (byte) 65, arg2, class135.field2189[arg0], arg3);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([BI)[B", line = 134)
    public static final byte[] method1273(byte[] arg0, int arg1) {
        field3176++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != 22373) {
            field3173 = -26;
        }
        byte[] var2 = new byte[arg0.length];
        class213.method1339(arg0, 0, var2, 0, arg0.length);
        return var2;
    }
}
