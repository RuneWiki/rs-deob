import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class187 extends class170 {

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "I")
    private int field3237 = 3072;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "I")
    private int field3241 = 1024;

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "I")
    private int field3245 = 2048;

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "Lvf;")
    public static class296 field3246 = new class296();

    @OriginalMember(owner = "client!ta", name = "fb", descriptor = "Lmh;")
    public static class128 field3250 = class22.method156(123, "cookiehost");

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "I")
    public static int field3248 = 0;

    @OriginalMember(owner = "client!ta", name = "hb", descriptor = "I")
    public static int field3252 = 0;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!ta", name = "cb", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!ta", name = "eb", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!ta", name = "gb", descriptor = "Ldj;")
    public static class314 field3251;

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V", line = 15)
    public class187() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)[[I", line = 24)
    public final int[][] method62(int arg0, int arg1) {
        int[][] var3 = this.field2976.method1098(arg0, -19544);
        field3239++;
        if (this.field2976.field2883) {
            int[][] var4 = this.method1139(0, arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class185.field3225; var11++) {
                var8[var11] = (var7[var11] * this.field3245 >> 12) + this.field3241;
                var9[var11] = (var5[var11] * this.field3245 >> 12) + this.field3241;
                var10[var11] = (var6[var11] * this.field3245 >> 12) + this.field3241;
            }
        }
        int var12 = -27 / ((-arg1 - 24) / 46);
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V", line = 70)
    public final void method267(int arg0) {
        if (arg0 != -2718) {
            this.field3237 = 88;
        }
        this.field3245 = this.field3237 - this.field3241;
        field3240++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)[I", line = 90)
    public final int[] method69(byte arg0, int arg1) {
        field3243++;
        if (arg0 != 85) {
            method1256(true);
        }
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int[] var4 = this.method1142((byte) 44, 0, arg1);
            for (int var5 = 0; var5 < class185.field3225; var5++) {
                var3[var5] = (var4[var5] * this.field3245 >> 12) + this.field3241;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lcb;Z)V", line = 119)
    public static final void method1255(class270 arg0, boolean arg1) {
        field3242++;
        class68 var2 = null;
        try {
            class23 var3 = arg0.method1892(0, "runescape");
            while (var3.field560 == 0) {
                class177.method1213(0, 1L);
            }
            if (var3.field560 == 1) {
                var2 = (class68) var3.field562;
                class194 var4 = class175.method1207(1);
                var2.method453(var4.field3417, (byte) -117, 0, var4.field3380);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method457(1);
            }
            if (!arg1) {
                field3246 = (class296) null;
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)V", line = 157)
    public static void method1256(boolean arg0) {
        if (!arg0) {
            field3250 = (class128) null;
        }
        field3246 = null;
        field3250 = null;
        field3251 = null;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(BI)[B", line = 175)
    public static final byte[] method1257(byte arg0, int arg1) {
        class214 var2 = (class214) class171.field2988.method1443((long) arg1, false);
        if (arg0 >= -121) {
            field3246 = (class296) null;
        }
        field3244++;
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class103.method638((byte) 15, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class214(var3);
            class171.field2988.method1442(-1, (long) arg1, var2);
        }
        return var2.field3776;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILbg;B)V", line = 227)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        field3247++;
        if (arg0 == 0) {
            this.field3241 = arg1.method1308(-81);
        } else if (arg0 == 1) {
            this.field3237 = arg1.method1308(-26);
        } else if (arg0 == 2) {
            this.field2970 = arg1.method1325(7627) == 1;
        }
        if (arg2 != 13) {
            this.method62(51, -91);
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V", line = 273)
    public static final void method1258(int arg0) {
        field3236++;
        if (arg0 != 0) {
            field3250 = (class128) null;
        }
        class37.field744.method1834(17);
        class189.field3288.method1834(arg0 ^ 0x11);
        class169.field2936.method1834(17);
    }
}
