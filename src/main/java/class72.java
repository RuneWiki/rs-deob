import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class72 extends class124 {

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "[Lab;")
    public class3[] field1672;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "[[[I")
    public static int[][][] field1668 = new int[4][105][105];

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "[I")
    public static int[] field1671 = new int[32];

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "Lr;")
    public static class118 field1674 = null;

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "Lef;")
    public static class35 field1675 = new class35(32);

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
    public static int field1678 = 0;

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "Lr;")
    public static class118 field1677 = class153.method1136(111, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!kc", name = "bb", descriptor = "Lr;")
    public static class118 field1679 = class153.method1136(106, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "Lge;")
    public static class47 field1676 = new class47(50);

    @OriginalMember(owner = "client!kc", name = "db", descriptor = "Lr;")
    public static class118 field1681 = class153.method1136(123, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!kc", name = "cb", descriptor = "Lr;")
    public static class118 field1680 = class153.method1136(108, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)Z")
    public final boolean method606(int arg0, int arg1) {
        field1666++;
        if (arg0 != 18342) {
            method607(14);
        }
        return this.field1672[arg1].field52;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public static final void method607(int arg0) {
        int var1 = class75.field1854 * 128 + 64;
        field1673++;
        int var2 = class48.field1182 * 128 + 64;
        int var3 = class46.method386(-15186, class106.field2468, var1, var2) - class88.field2118;
        if (var1 > class24.field580) {
            class24.field580 += (var1 - class24.field580) * class97.field2264 / 1000 + class113.field2629;
            if (class24.field580 > var1) {
                class24.field580 = var1;
            }
        }
        if (var3 > class85.field2093) {
            class85.field2093 += class113.field2629 + (var3 - class85.field2093) * class97.field2264 / 1000;
            if (class85.field2093 > var3) {
                class85.field2093 = var3;
            }
        }
        if (class24.field580 > var1) {
            class24.field580 -= class113.field2629 + (class24.field580 - var1) * class97.field2264 / 1000;
            if (var1 > class24.field580) {
                class24.field580 = var1;
            }
        }
        if (class85.field2093 > var3) {
            class85.field2093 -= (class85.field2093 - var3) * class97.field2264 / 1000 + class113.field2629;
            if (class85.field2093 < var3) {
                class85.field2093 = var3;
            }
        }
        int var4 = class115.field2693 * 128 + 64;
        if (var2 > class44.field1051) {
            class44.field1051 += class113.field2629 + (var2 - class44.field1051) * class97.field2264 / 1000;
            if (var2 < class44.field1051) {
                class44.field1051 = var2;
            }
        }
        if (var2 < class44.field1051) {
            class44.field1051 -= (class44.field1051 - var2) * class97.field2264 / 1000 + class113.field2629;
            if (class44.field1051 < var2) {
                class44.field1051 = var2;
            }
        }
        int var5 = class19.field468 * 128 + 64;
        int var6 = class46.method386(-15186, class106.field2468, var4, var5) - class10.field243;
        int var7 = var6 - class85.field2093;
        int var8 = var5 - class44.field1051;
        int var9 = var4 - class24.field580;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (arg0 != 26416) {
            method609(null, null, -44, null);
        }
        int var12 = (int) (Math.atan2((double) var9, (double) var8) * -325.949D) & 0x7FF;
        int var13 = var12 - class1.field25;
        if (var11 > class85.field2092) {
            class85.field2092 += class64.field1457 + (var11 - class85.field2092) * class33.field840 / 1000;
            if (var11 < class85.field2092) {
                class85.field2092 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (class85.field2092 > var11) {
            class85.field2092 -= class64.field1457 + (class85.field2092 - var11) * class33.field840 / 1000;
            if (var11 > class85.field2092) {
                class85.field2092 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class1.field25 += class64.field1457 + class33.field840 * var13 / 1000;
            class1.field25 &= 0x7FF;
        }
        if (var13 < 0) {
            class1.field25 -= class64.field1457 + -var13 * class33.field840 / 1000;
            class1.field25 &= 0x7FF;
        }
        int var14 = var12 - class1.field25;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class1.field25 = var12;
        }
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
    public static final void method608(int arg0) {
        int var1 = -81 % ((arg0 + 36) / 38);
        class140.field3181++;
        class1.field22.method722(47, (byte) 14);
        field1667++;
        class1.field22.method824(0L, true);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lff;Lff;ILjava/awt/Component;)V")
    public static final void method609(class42 arg0, class42 arg1, int arg2, Component arg3) {
        field1669++;
        if (class48.field1180) {
            return;
        }
        class52.method466();
        byte[] var4 = arg0.method339(class133.field3031, class132.field3023, -2);
        class61.field1422 = new class150(var4, arg3);
        class27.field644 = class61.field1422.method1110();
        class22.field545 = class75.method635(class132.field3023, arg1, class128.field2922, 0);
        class91.field2174 = class75.method635(class132.field3023, arg1, class9.field211, 0);
        class24.field605 = class75.method635(class132.field3023, arg1, class121.field2800, arg2 ^ arg2);
        class124.field2842 = class25.method226(class132.field3023, arg1, class29.field672, (byte) 113);
        class14.field319 = class25.method226(class132.field3023, arg1, class64.field1469, (byte) 113);
        class126.field2885 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class126.field2885[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class126.field2885[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class126.field2885[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class126.field2885[var8 + 192] = 16777215;
        }
        class62.field1439 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class62.field1439[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class62.field1439[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class62.field1439[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class62.field1439[var12 + 192] = 16777215;
        }
        class47.field1128 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class47.field1128[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class47.field1128[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class47.field1128[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class47.field1128[var16 + 192] = 16777215;
        }
        class43.field1041 = new int[32768];
        class94.field2225 = new int[256];
        class27.field641 = new int[32768];
        class66.method572(null, -110);
        class132.field3022 = class132.field3023;
        class132.field3021 = class132.field3023;
        if (class59.field1386 == 0) {
            class45.field1088 = true;
        } else {
            class45.field1088 = false;
        }
        class108.field2508 = false;
        class35.field890 = new int[32768];
        class2.field46 = 0;
        class158.field3647 = new int[32768];
        if (class45.field1088) {
            class13.method92((byte) -126, 2);
        } else {
            class43.method360(0, class46.field1113, class132.field3023, class101.field2330, 2, 255, false);
        }
        class37.method307((byte) -97, false);
        class48.field1180 = true;
        class61.field1422.method1114(0, 0);
        class27.field644.method1114(382, 0);
        class22.field545.method719(382 - class22.field545.field2159 / 2, 18);
        class35.field891 = new class150(128, 254);
        class112.field2614 = new class150(128, 254);
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)V")
    public static void method610(int arg0) {
        field1679 = null;
        if (arg0 != 64) {
            return;
        }
        field1668 = null;
        field1677 = null;
        field1675 = null;
        field1674 = null;
        field1680 = null;
        field1676 = null;
        field1681 = null;
        field1671 = null;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lff;Lff;IZ)V")
    public class72(class42 arg0, class42 arg1, int arg2, boolean arg3) {
        class113 var5 = new class113();
        int var6 = arg0.method343((byte) 110, arg2);
        this.field1672 = new class3[var6];
        int[] var7 = arg0.method352(arg2, 59);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method350(arg2, -115, var7[var8]);
            class158 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class158 var12 = (class158) var5.method889(123); var12 != null; var12 = (class158) var5.method884(true)) {
                if (var12.field3634 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method358(0, (byte) -114, var11);
                } else {
                    var13 = arg1.method358(var11, (byte) 83, 0);
                }
                var10 = new class158(var11, var13);
                var5.method883(var10, -26866);
            }
            this.field1672[var7[var8]] = new class3(var9, var10);
        }
    }
}
