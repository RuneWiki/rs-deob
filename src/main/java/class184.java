import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class184 extends class280 {

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    private int field2952;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public int field2960;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    private int field2956;

    @OriginalMember(owner = "client!k", name = "H", descriptor = "I")
    public int field2971;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    private int field2962;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "I")
    private int field2973;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    public int field2980;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    private int field2957;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "I")
    private int field2970;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field2958 = -1;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "Z")
    public static boolean field2965 = false;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "[I")
    public static int[] field2966 = new int[14];

    @OriginalMember(owner = "client!k", name = "N", descriptor = "I")
    public static int field2977 = 0;

    @OriginalMember(owner = "client!k", name = "K", descriptor = "[I")
    public static int[] field2974 = new int[1000];

    @OriginalMember(owner = "client!k", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2975 = "Checking for updates - ";

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field2953 = 2;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "[I")
    public static int[] field2967;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)Z")
    public final boolean method1362(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 2) {
            field2975 = null;
        }
        field2976++;
        return this.field2952 == arg3 && arg2 >= this.field2970 && this.field2957 >= arg2 && arg0 >= this.field2962 && this.field2973 >= arg0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)V")
    public static final void method1363(boolean arg0, int arg1) {
        if (arg1 != 255) {
            return;
        }
        field2968++;
        int var2 = class206.field3311.length;
        byte[][] var3 = class283.field4500;
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class286.field4548[var4] >> 8) * 64 - class282.field4487;
                int var7 = (class286.field4548[var4] & 0xFF) * 64 - class99.field1465;
                class126.method908(arg1 ^ 0xFFFFFF38);
                class96.method743(var5, arg0, var7, 2, var6, class138.field2237);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)Z")
    public static final boolean method1364(int arg0, byte arg1) {
        field2979++;
        if (class90.field1339[arg0]) {
            return true;
        } else if (class10.field110.method624(arg0, (byte) -62)) {
            int var2 = class10.field110.method617((byte) 70, arg0);
            if (var2 == 0) {
                class90.field1339[arg0] = true;
                return true;
            }
            if (arg1 < 49) {
                field2967 = null;
            }
            if (class113.field1631[arg0] == null) {
                class113.field1631[arg0] = new class131[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class113.field1631[arg0][var3] == null) {
                    byte[] var4 = class10.field110.method643(var3, arg0, false);
                    if (var4 != null) {
                        class131 var5 = class113.field1631[arg0][var3] = new class131();
                        var5.field2073 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method939(-21343, new class152(var4));
                        } else {
                            var5.method951((byte) -111, new class152(var4));
                        }
                    }
                }
            }
            class90.field1339[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1365(int arg0, long arg1) {
        field2978++;
        class276.field4435.setTime(new Date(arg1));
        int var3 = class276.field4435.get(7);
        int var4 = class276.field4435.get(5);
        int var5 = class276.field4435.get(arg0);
        int var6 = class276.field4435.get(1);
        int var7 = class276.field4435.get(11);
        int var8 = class276.field4435.get(12);
        int var9 = class276.field4435.get(13);
        return class218.field3499[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class235.field3795[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Lag;")
    public static final class189 method1366(int arg0, int arg1) {
        field2961++;
        class189 var2 = (class189) class181.field2915.method1553((long) arg1, (byte) -118);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class50.field733.method643(arg1, arg0, false);
        class189 var4 = new class189();
        if (var3 != null) {
            var4.method1412((byte) -88, new class152(var3));
        }
        class181.field2915.method1551(var4, 0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)V")
    public static void method1367(byte arg0) {
        field2966 = null;
        field2974 = null;
        field2975 = null;
        if (arg0 >= -98) {
            method1371(97);
        }
        field2967 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)[I")
    public final int[] method1368(int arg0, int arg1, int arg2) {
        field2963++;
        if (arg2 < 103) {
            method1371(93);
        }
        return new int[] { this.field2956, arg1 - (this.field2970 - this.field2960), this.field2954 - this.field2962 + arg0 };
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(III)Z")
    public final boolean method1369(int arg0, int arg1, int arg2) {
        if (arg2 == 4468) {
            field2964++;
            return this.field2960 <= arg0 && this.field2980 >= arg0 && this.field2954 <= arg1 && this.field2971 >= arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZI)Z")
    public final boolean method1370(int arg0, boolean arg1, int arg2) {
        field2959++;
        if (!arg1) {
            this.field2952 = 116;
        }
        return this.field2970 <= arg0 && this.field2957 >= arg0 && this.field2962 <= arg2 && this.field2973 >= arg2;
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
    public static final void method1371(int arg0) {
        if (arg0 == 10) {
            field2972++;
            class275.field4416.method1558(-68);
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(III)[I")
    public final int[] method1372(int arg0, int arg1, int arg2) {
        field2969++;
        if (arg0 != 25392) {
            field2966 = null;
        }
        return new int[] { this.field2952, this.field2970 + arg1 - this.field2960, -this.field2954 - -this.field2962 + arg2 };
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V")
    public static final void method1373(int arg0) {
        field2955++;
        if (arg0 != -10584) {
            field2977 = 100;
        }
        for (int var1 = 0; var1 < class121.field1773; var1++) {
            int var2 = class188.field3045[var1];
            class29 var3 = class92.field1374[var2];
            int var4 = class50.field732.method1111(255);
            if ((var4 & 0x4) != 0) {
                var4 += class50.field732.method1111(255) << 8;
            }
            class104.method778(var4, var3, 1, var2);
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2952 = arg0;
        this.field2960 = arg6;
        this.field2956 = arg1;
        this.field2971 = arg9;
        this.field2962 = arg3;
        this.field2973 = arg5;
        this.field2954 = arg7;
        this.field2980 = arg8;
        this.field2957 = arg4;
        this.field2970 = arg2;
    }
}
