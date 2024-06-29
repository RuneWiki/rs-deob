import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class152 extends class165 {

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public static int field2344 = 0;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    public static int field2350 = 3353893;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "Z")
    public static boolean field2352 = true;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "[I")
    public static int[] field2353 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public int field2341;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
    public int field2351;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "[I")
    public int[] field2345;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "[I")
    public int[] field2347;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "[I")
    public int[] field2354;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "[Lnc;")
    public class161[] field2342;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "[Lnc;")
    public class161[] field2343;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "[[[B")
    public byte[][][] field2346;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)I", line = 17)
    public static int method1101(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V", line = 26)
    public static void method1102(int arg0) {
        if (arg0 < -82) {
            field2353 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)V", line = 40)
    public static final void method1103(int arg0, int arg1) {
        if (arg1 == 37) {
            class43.field543 = 3.0F;
        } else if (arg1 == 50) {
            class43.field543 = 4.0F;
        } else if (arg1 == 75) {
            class43.field543 = 6.0F;
        } else if (arg1 == 100) {
            class43.field543 = 8.0F;
        } else if (arg1 == 200) {
            class43.field543 = 16.0F;
        }
        field2348++;
        class50.field707 = arg0;
        class50.field707 = -1;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V", line = 80)
    public static final void method1104(int arg0) {
        field2349++;
        if (class334.method2334((byte) -107) != 2) {
            return;
        }
        byte var1 = (byte) (class97.field1385 - 4 & 0xFF);
        if (arg0 >= -11) {
            field2352 = true;
        }
        int var2 = class97.field1385 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class7.field101[var3][var2][var4] = var1;
            }
        }
        if (class49.field698 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class5.field78[var5] = -1000000;
            class164.field2736[var5] = 1000000;
            class121.field1879[var5] = 0;
            class84.field1174[var5] = 1000000;
            class15.field193[var5] = 0;
        }
        if (class31.field423 != 1) {
            int var16 = class123.method889(1, class49.field698, class120.field1825, class260.field4150);
            if (var16 - class83.field1173 < 800 && (class129.field2025[class49.field698][class120.field1825 >> 7][class260.field4150 >> 7] & 0x4) != 0) {
                class189.method1399(class120.field1825 >> 7, (byte) -114, false, class260.field4150 >> 7, class324.field5032, 1);
            }
            return;
        }
        if ((class129.field2025[class49.field698][class191.field3129.field4255 >> 7][class191.field3129.field4264 >> 7] & 0x4) != 0) {
            class189.method1399(class191.field3129.field4255 >> 7, (byte) -123, false, class191.field3129.field4264 >> 7, class324.field5032, 0);
        }
        if (class74.field1036 >= 310) {
            return;
        }
        int var6 = class120.field1825 >> 7;
        int var7 = class260.field4150 >> 7;
        int var8 = class191.field3129.field4255 >> 7;
        int var9;
        if (var8 <= var6) {
            var9 = var6 - var8;
        } else {
            var9 = var8 - var6;
        }
        int var10 = class191.field3129.field4264 >> 7;
        int var11;
        if (var10 <= var7) {
            var11 = var7 - var10;
        } else {
            var11 = var10 - var7;
        }
        if (var9 == 0 && var11 == 0 || var9 <= -104 || var9 >= 104 || var11 <= -104 || var11 >= 104) {
            class26.method152((Throwable) null, "RC: " + var6 + "," + var7 + " " + var8 + "," + var10 + " " + class70.field989 + "," + class205.field3367, -122);
            return;
        }
        if (var11 < var9) {
            int var14 = var11 * 65536 / var9;
            int var15 = 32768;
            while (var6 != var8) {
                if (var6 < var8) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class129.field2025[class49.field698][var6][var7] & 0x4) != 0) {
                    class189.method1399(var6, (byte) -121, false, var7, class324.field5032, 1);
                    break;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var7 < var10) {
                        var7++;
                    } else if (var7 > var10) {
                        var7--;
                    }
                    if ((class129.field2025[class49.field698][var6][var7] & 0x4) != 0) {
                        class189.method1399(var6, (byte) -109, false, var7, class324.field5032, 1);
                        break;
                    }
                }
            }
            return;
        }
        int var12 = var9 * 65536 / var11;
        int var13 = 32768;
        while (var7 != var10) {
            if (var7 < var10) {
                var7++;
            } else if (var10 < var7) {
                var7--;
            }
            if ((class129.field2025[class49.field698][var6][var7] & 0x4) != 0) {
                class189.method1399(var6, (byte) -115, false, var7, class324.field5032, 1);
                break;
            }
            var13 += var12;
            if (var13 >= 65536) {
                var13 -= 65536;
                if (var6 < var8) {
                    var6++;
                } else if (var6 > var8) {
                    var6--;
                }
                if ((class129.field2025[class49.field698][var6][var7] & 0x4) != 0) {
                    class189.method1399(var6, (byte) -124, false, var7, class324.field5032, 1);
                    break;
                }
            }
        }
    }
}
