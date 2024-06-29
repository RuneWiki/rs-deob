import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class76 {

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "[J")
    public static long[] field953 = new long[1000];

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Leh;")
    public static class137 field954;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "Leh;")
    public static class137 field955;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "[I")
    public static int[] field956;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLeh;)V")
    public static final void method425(byte arg0, class137 arg1) {
        class201.field3174 = class235.method1664(class117.field1655, (byte) -127, arg1);
        class186.field2973 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) ((class213.field3426[var2] & 0xFF0000) >> 16);
            int var5 = (class213.field3426[var2 + 1] & 0xFF0000) >> 16;
            float var6 = ((float) var5 - var4) / 64.0F;
            float var7 = (float) (class213.field3426[var2] >> 8 & 0xFF);
            int var8 = (class213.field3426[var2 + 1] & 0xFF00) >> 8;
            float var9 = ((float) var8 - var7) / 64.0F;
            float var10 = (float) (class213.field3426[var2] & 0xFF);
            int var11 = class213.field3426[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class186.field2973[var2 * 64 + var13] = class154.method1048(class154.method1048((int) var7 << 8, (int) var4 << 16), (int) var10);
                var7 += var9;
                var4 += var6;
                var10 += var12;
            }
        }
        int var3 = 192;
        if (arg0 != -128) {
            return;
        }
        while (var3 < 255) {
            class186.field2973[var3] = class213.field3426[3];
            var3++;
        }
        class132.field2103 = new int[32768];
        class195.field3112 = new int[32768];
        class247.method1712(0, (class149) null);
        field952++;
        class52.field681 = new int[32768];
        class127.field2034 = new int[32768];
        class286.field4569 = new class227(128, 254);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static void method426(int arg0) {
        field953 = null;
        field956 = null;
        field955 = null;
        field954 = null;
        if (arg0 != 32768) {
            method427(-45);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public static final void method427(int arg0) {
        int var1 = 0;
        if (arg0 <= 95) {
            return;
        }
        while (class288.field4599 > var1) {
            int var10002 = class77.field971[var1]--;
            if (class77.field971[var1] >= -10) {
                label89: {
                    class169 var3 = class220.field3526[var1];
                    if (var3 == null) {
                        var3 = class169.method1158(class219.field3511, class4.field63[var1], 0);
                        if (var3 == null) {
                            break label89;
                        }
                        class77.field971[var1] += var3.method1155();
                        class220.field3526[var1] = var3;
                    }
                    if (class77.field971[var1] < 0) {
                        label92: {
                            int var10;
                            if (class206.field3282[var1] == 0) {
                                var10 = class68.field858[var1] * class272.field4350 >> 8;
                            } else {
                                int var4 = (class206.field3282[var1] & 0xFF) * 128;
                                int var5 = class206.field3282[var1] >> 16 & 0xFF;
                                int var6 = (class206.field3282[var1] & 0xFF38) >> 8;
                                int var7 = var5 * 128 + 64 - class286.field4571.field3818;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var8 = var6 * 128 + 64 - class286.field4571.field3820;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var7 - (128 - var8);
                                if (var4 < var9) {
                                    class77.field971[var1] = -100;
                                    break label92;
                                }
                                if (var9 < 0) {
                                    var9 = 0;
                                }
                                var10 = class68.field858[var1] * class63.field818 * (var4 - var9) / var4 >> 8;
                            }
                            if (var10 > 0) {
                                class29 var11 = var3.method1156().method167(class294.field4662);
                                class193 var12 = class193.method1337(var11, 100, var10);
                                var12.method1336(class275.field4399[var1] - 1);
                                class191.field3082.method1954(var12);
                            }
                            class77.field971[var1] = -100;
                        }
                    }
                }
            } else {
                class288.field4599--;
                for (int var2 = var1; var2 < class288.field4599; var2++) {
                    class4.field63[var2] = class4.field63[var2 + 1];
                    class220.field3526[var2] = class220.field3526[var2 + 1];
                    class275.field4399[var2] = class275.field4399[var2 + 1];
                    class77.field971[var2] = class77.field971[var2 + 1];
                    class206.field3282[var2] = class206.field3282[var2 + 1];
                    class68.field858[var2] = class68.field858[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        field949++;
        if (class271.field4335 && !class51.method289(-1)) {
            if (class218.field3493 != 0 && class171.field2714 != -1) {
                class286.method1924(-10225, class218.field3493, class171.field2714, class182.field2897, 0, false);
            }
            class271.field4335 = false;
        } else if (class218.field3493 != 0 && class171.field2714 != -1 && !class51.method289(-1)) {
            class34.field438++;
            class4.field57.method1932(false, 163);
            class4.field57.method574(class171.field2714, -1);
            class171.field2714 = -1;
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
    public static final void method428(int arg0) {
        class4.field57.method1932(false, 13);
        class4.field57.method572(true, class242.field3987);
        field950++;
        if (arg0 < -24) {
            class106.field1435++;
        }
    }
}
