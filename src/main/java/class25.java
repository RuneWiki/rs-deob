import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class25 {

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field487 = 0;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field479 = 0;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field488 = 2;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field493 = 0;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public int field491;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "Lmb;")
    public static class178 field485;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Lvb;")
    public static class226 field476;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "[B")
    public byte[] field489;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "[B")
    public byte[] field496;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method220(Component arg0, int arg1) {
        field494++;
        arg0.removeKeyListener(class27.field524);
        if (arg1 != -26569) {
            field476 = null;
        }
        arg0.removeFocusListener(class27.field524);
        class213.field3641 = -1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lcg;B)V")
    public static final void method221(class34 arg0, byte arg1) {
        field483++;
        long var2 = 0L;
        int var4 = 0;
        int var5 = -1;
        if (arg0.field658 == 0) {
            var2 = class40.method327(arg0.field668, arg0.field661, arg0.field662);
        }
        int var6 = 0;
        if (arg0.field658 == 1) {
            var2 = class46.method360(arg0.field668, arg0.field661, arg0.field662);
        }
        if (arg0.field658 == 2) {
            var2 = class200.method1348(arg0.field668, arg0.field661, arg0.field662);
        }
        if (arg0.field658 == 3) {
            var2 = class129.method900(arg0.field668, arg0.field661, arg0.field662);
        }
        if (var2 != 0L) {
            var4 = (int) var2 >> 14 & 0x1F;
            var5 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var6 = ((int) var2 & 0x3F06B8) >> 20;
        }
        if (arg1 != -73) {
            field493 = -94;
        }
        arg0.field665 = var6;
        arg0.field671 = var5;
        arg0.field667 = var4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZIZIIII)V")
    public static final void method222(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field475++;
        if (class237.field4059 == arg1 && class258.field4481 == arg4 && class54.field1158 == arg6 || class69.method524((byte) -89)) {
            return;
        }
        class237.field4059 = arg1;
        class54.field1158 = arg6;
        class258.field4481 = arg4;
        if (class69.method524((byte) 123)) {
            class54.field1158 = 0;
        }
        if (arg2) {
            class209.method1404((byte) -38, 28);
        } else {
            class209.method1404((byte) -38, 25);
        }
        class10.method121(class20.field415, (byte) -95, true);
        int var7 = class231.field3878;
        int var8 = class244.field4232;
        class244.field4232 = arg1 * 8 - 48;
        int var9 = class244.field4232 - var8;
        class231.field3878 = (arg4 - 6) * 8;
        int var10 = class231.field3878 - var7;
        int var11 = class231.field3878;
        int var12 = class244.field4232;
        if (arg2) {
            class140.field2487 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class197 var32 = class92.field1758[var16];
                if (var32 != null) {
                    var32.field4177 -= var9 * 128;
                    var32.field4143 -= var10 * 128;
                    if (var32.field4177 >= 0 && var32.field4177 <= 13184 && var32.field4143 >= 0 && var32.field4143 <= 13184) {
                        for (int var33 = 0; var33 < 10; var33++) {
                            var32.field4182[var33] -= var9;
                            var32.field4119[var33] -= var10;
                        }
                        class199.field3412[class140.field2487++] = var16;
                    } else {
                        class92.field1758[var16].field3322 = null;
                        class92.field1758[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class197 var14 = class92.field1758[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field4182[var15] -= var9;
                        var14.field4119[var15] -= var10;
                    }
                    var14.field4143 -= var10 * 128;
                    var14.field4177 -= var9 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class180 var30 = class55.field1180[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field4182[var31] -= var9;
                    var30.field4119[var31] -= var10;
                }
                var30.field4143 -= var10 * 128;
                var30.field4177 -= var9 * 128;
            }
        }
        class189.field3261 = arg6;
        class137.field2441.method1586(arg3, arg0, arg5, (byte) 62);
        byte var18 = 1;
        byte var19 = 104;
        byte var20 = 104;
        byte var21 = 0;
        byte var22 = 0;
        byte var23 = 1;
        if (var10 < 0) {
            var20 = -1;
            var21 = 103;
            var23 = -1;
        }
        if (var9 < 0) {
            var18 = -1;
            var19 = -1;
            var22 = 103;
        }
        for (int var24 = var22; var24 != var19; var24 += var18) {
            for (int var26 = var21; var26 != var20; var26 += var23) {
                int var27 = var26 + var10;
                int var28 = var9 + var24;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104) {
                        class78.field1499[var29][var24][var26] = class78.field1499[var29][var28][var27];
                    } else {
                        class78.field1499[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class34 var25 = (class34) class72.field1413.method288(26111); var25 != null; var25 = (class34) class72.field1413.method277(1)) {
            var25.field661 -= var9;
            var25.field662 -= var10;
            if (var25.field661 < 0 || var25.field662 < 0 || var25.field661 >= 104 || var25.field662 >= 104) {
                var25.method254(1);
            }
        }
        if (arg2) {
            class231.field3887 -= var10;
            class64.field1302 -= var9;
            class257.field4440 -= var9;
            class64.field1305 -= var10;
        } else {
            class224.field3766 = 1;
        }
        if (class132.field2369 != 0) {
            class132.field2369 -= var9;
            class186.field3228 -= var10;
        }
        class238.field4063 = 0;
        class102.field1880 = -1;
        class245.field4257.method282(-126);
        class28.field543.method282(-124);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(JB)V")
    public static final void method223(long arg0, byte arg1) {
        field484++;
        class14.method146(31945);
        class205.field3524.field2677 = 0;
        class205.field3524.method1023(13195, 228);
        class205.field3524.method1044(false, arg0);
        class76.field1493 = 1;
        class121.field2183 = 2;
        if (arg1 < 63) {
            method223(-114L, (byte) 92);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static void method224(byte arg0) {
        field485 = null;
        field476 = null;
        int var1 = 93 % ((16 - arg0) / 59);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILmb;)I")
    public static final int method225(int arg0, class178 arg1) {
        field490++;
        int var2 = 0;
        if (arg0 != -1) {
            return 24;
        }
        if (arg1.method1207(class99.field1828, (byte) 110)) {
            var2++;
        }
        if (arg1.method1207(class186.field3227, (byte) -125)) {
            var2++;
        }
        return var2;
    }
}
