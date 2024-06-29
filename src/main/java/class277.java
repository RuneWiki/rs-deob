import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class277 implements Runnable {

    @OriginalMember(owner = "client!re", name = "q", descriptor = "[Lle;")
    public volatile class244[] field4751 = new class244[2];

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Z")
    public volatile boolean field4736 = false;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "Z")
    public volatile boolean field4748 = false;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4738 = 0;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4740 = 0;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Lwm;")
    public static class152 field4742 = class157.method1048("Mem:", 118);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Z")
    public static boolean field4735 = false;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lwm;")
    private static class152 field4744 = class157.method1048("Loading sprites )2 ", 100);

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Lwm;")
    public static class152 field4745 = class157.method1048("leuchten2:", 124);

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field4750 = 0;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Lwm;")
    public static class152 field4749 = field4744;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "Lwm;")
    private static class152 field4752 = class157.method1048("Take", 100);

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Lwm;")
    public static class152 field4737 = field4752;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Ldi;")
    public class151 field4747;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 8)
    public static void method1892(int arg0) {
        field4744 = null;
        field4752 = null;
        field4737 = null;
        field4749 = null;
        field4742 = null;
        field4745 = null;
        if (arg0 <= 17) {
            method1893(-18, -107, 100, (class291) null, -18, -83, true, 91, -57);
        }
    }

    @OriginalMember(owner = "client!re", name = "run", descriptor = "()V", line = 42)
    public final void run() {
        field4746++;
        this.field4748 = true;
        try {
            while (!this.field4736) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class244 var2 = this.field4751[var1];
                    if (var2 != null) {
                        var2.method1680(-15389);
                    }
                }
                class4.method19(0, 10L);
                class267.method1830((Object) null, this.field4747, (byte) 115);
            }
        } catch (Exception var7) {
            class169.method1109(var7, (byte) -122, (String) null);
        } finally {
            this.field4748 = false;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILhi;IIZII)V", line = 89)
    public static final void method1893(int arg0, int arg1, int arg2, class291 arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (arg2 >= 0 && arg2 < 104 && arg8 >= 0 && arg8 < 104) {
            if (!arg6) {
                class70.field1026[arg4][arg2][arg8] = 0;
            }
            while (true) {
                int var9 = arg3.method2011(-43);
                if (var9 == 0) {
                    if (arg6) {
                        class65.field984[0][arg2][arg8] = class123.field1728[0][arg2][arg8];
                    } else if (arg4 == 0) {
                        class65.field984[0][arg2][arg8] = -class23.method196((byte) 69, 556238 - (-arg1 - arg8), 932731 - (-arg0 + -arg2)) * 8;
                    } else {
                        class65.field984[arg4][arg2][arg8] = class65.field984[arg4 - 1][arg2][arg8] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg3.method2011(-128);
                    if (arg6) {
                        class65.field984[0][arg2][arg8] = var10 * 8 + class123.field1728[0][arg2][arg8];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg4 == 0) {
                            class65.field984[0][arg2][arg8] = -var10 * 8;
                        } else {
                            class65.field984[arg4][arg2][arg8] = class65.field984[arg4 - 1][arg2][arg8] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class117.field1661[arg4][arg2][arg8] = arg3.method1962(false);
                    class195.field3115[arg4][arg2][arg8] = (byte) ((var9 - 2) / 4);
                    class234.field3839[arg4][arg2][arg8] = (byte) class34.method251(arg7 + var9 - 2, 3);
                } else if (var9 > 81) {
                    class60.field912[arg4][arg2][arg8] = (byte) (var9 - 81);
                } else if (!arg6) {
                    class70.field1026[arg4][arg2][arg8] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg3.method2011(-124);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg3.method2011(-103);
                    break;
                }
                if (var11 <= 49) {
                    arg3.method2011(-56);
                }
            }
        }
        field4739++;
        if (arg5 > -12) {
            field4745 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Ldc;", line = 208)
    public static final class109 method1894(byte arg0) {
        int var1 = class8.field106[0] * class253.field4383[0];
        field4741++;
        byte[] var2 = class23.field403[0];
        class109 var6;
        if (class283.field4822[0]) {
            byte[] var3 = class61.field924[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class72.method493(class34.method251(-16777216, var3[var5] << 24), class134.field2070[class34.method251(255, var2[var5])]);
            }
            var6 = new class78(class186.field2975, class193.field3068, class180.field2865[0], class179.field2856[0], class253.field4383[0], class8.field106[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class134.field2070[class34.method251(var2[var8], 255)];
            }
            var6 = new class109(class186.field2975, class193.field3068, class180.field2865[0], class179.field2856[0], class253.field4383[0], class8.field106[0], var7);
        }
        class132.method841((byte) 65);
        if (arg0 != 31) {
            field4740 = -27;
        }
        return var6;
    }
}
