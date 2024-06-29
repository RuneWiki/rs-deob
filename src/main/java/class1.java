import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class1 extends class131 {

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    private int field21;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
    private int field10;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    private int field18;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    private int field4;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    private int field12;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    private int field7;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
    private int field15;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "[I")
    public static int[] field3 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
    public static int field17 = 0;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field13 = new String[200];

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    public static int field20 = 127;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "[[[B")
    public static byte[][][] field8;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 8)
    public static void method1(byte arg0) {
        if (arg0 < -12) {
            field3 = null;
            field13 = null;
            field8 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V", line = 21)
    public static final void method2(boolean arg0) {
        field19++;
        if (class26.field399) {
            return;
        }
        class232.field3672 = true;
        class26.field399 = arg0;
        if (class139.field2170) {
            class30.field443 = (float) ((int) class30.field443 - 17 & 0xFFFFFFF0);
        } else {
            class121.field1846 += (-class121.field1846 - 12.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBI)V", line = 44)
    public final void method3(int arg0, byte arg1, int arg2) {
        field1++;
        int var4 = this.field15 * arg2 >> 12;
        int var5 = this.field12 * arg0 >> 12;
        int var6 = this.field21 * arg0 >> 12;
        int var7 = this.field11 * arg2 >> 12;
        int var8 = this.field7 * arg0 >> 12;
        int var9 = this.field4 * arg2 >> 12;
        if (arg1 < 102) {
            this.field18 = 97;
        }
        int var10 = this.field10 * arg0 >> 12;
        int var11 = this.field18 * arg2 >> 12;
        class128.method930(var4, var11, var7, -65, var5, var10, this.field2059, var9, var8, var6);
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 70)
    public class1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field21 = arg2;
        this.field11 = arg3;
        this.field10 = arg6;
        this.field18 = arg7;
        this.field4 = arg5;
        this.field12 = arg0;
        this.field7 = arg4;
        this.field15 = arg1;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)V", line = 86)
    public final void method4(int arg0, int arg1, int arg2) {
        field16++;
        if (arg1 != 3) {
            method5(31);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 97)
    public static final void method5(int arg0) {
        field6++;
        if (client.field718 != null || class222.field3537 != null) {
            return;
        }
        int var1 = class171.field2604;
        if (arg0 != 9092) {
            method1((byte) 45);
        }
        if (!class339.field5305) {
            if (var1 == 1 && class301.field4706 > 0) {
                short var2 = class233.field3689[class301.field4706 - 1];
                if (var2 == 49 || var2 == 17 || var2 == 31 || var2 == 43 || var2 == 32 || var2 == 26 || var2 == 45 || var2 == 5 || var2 == 15 || var2 == 4 || var2 == 9 || var2 == 1005) {
                    int var3 = class307.field4774[class301.field4706 - 1];
                    int var4 = class95.field1528[class301.field4706 - 1];
                    class220 var5 = class68.method524((byte) -99, var4);
                    class160 var6 = client.method393(var5);
                    if (var6.method1083(arg0 - 9208) || var6.method1082((byte) 124)) {
                        class81.field1273 = 0;
                        class224.field3551 = false;
                        if (client.field718 != null) {
                            class26.method241(arg0 ^ 0x2F93, client.field718);
                        }
                        client.field718 = class68.method524((byte) -106, var4);
                        class274.field4246 = var3;
                        class150.field2273 = class205.field3084;
                        class134.field2142 = class47.field776;
                        class26.method241(3095, client.field718);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class251.field3969 == 1 && class301.field4706 > 2 || class17.method139(class301.field4706 - 1, 19193))) {
                var1 = 2;
            }
            if (var1 == 2 && class301.field4706 > 0 || class84.field1305 == 1) {
                class208.method1482(true);
            }
            if (var1 == 1 && class301.field4706 > 0 || class84.field1305 == 2) {
                class30.method256(arg0 - 8970);
            }
            return;
        }
        if (var1 != 1) {
            int var7 = class119.field1815;
            int var8 = class253.field3984;
            if ((class308.field4792 - 10) > var7 || var7 > (class308.field4792 + class131.field2058 + 10) || var8 < (class40.field604 - 10) || var8 > (class112.field1737 + class40.field604 + 10)) {
                class339.field5305 = false;
                class55.method450(class308.field4792, class40.field604, true, class131.field2058, class112.field1737);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var9 = class308.field4792;
        int var10 = class131.field2058;
        int var11 = class40.field604;
        int var12 = class47.field776;
        int var13 = class205.field3084;
        int var14 = -1;
        for (int var15 = 0; var15 < class301.field4706; var15++) {
            if (class238.field3786) {
                int var16 = var11 + ((class301.field4706 - var15 - 1) * 15) + 33;
                if (var9 < var13 && (var9 + var10) > var13 && var12 > var16 - 13 && var12 < var16 + 3) {
                    var14 = var15;
                }
            } else {
                int var17 = (class301.field4706 - var15 - 1) * 15 + var11 + 31;
                if (var13 > var9 && var13 < var9 + var10 && var12 > (var17 - 13) && var17 + 3 > var12) {
                    var14 = var15;
                }
            }
        }
        if (var14 != -1) {
            class332.method2304(var14, (byte) -122);
        }
        class339.field5305 = false;
        class55.method450(class308.field4792, class40.field604, true, class131.field2058, class112.field1737);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)V", line = 246)
    public final void method6(int arg0, int arg1, int arg2) {
        field9++;
        if (arg0 != 1877660193) {
            field20 = 124;
        }
    }
}
