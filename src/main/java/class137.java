import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class137 extends class151 {

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "[J")
    public static long[] field2575 = new long[200];

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "Z")
    public static boolean field2573 = true;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field2571 = 0;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "Lmb;")
    public static class132 field2577 = class166.method1092("Das ist eine Mitglieder)2Welt(Q", 111);

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "Lkg;")
    public static class115 field2572 = new class115(128);

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "Lmb;")
    public static class132 field2579 = class166.method1092("blinken2:", 113);

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public int field2566;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public int field2570;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public int field2576;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "Lnb;")
    public static class143 field2574;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
    public static void method930(int arg0) {
        field2575 = null;
        if (arg0 != 11408) {
            field2573 = true;
        }
        field2577 = null;
        field2579 = null;
        field2572 = null;
        field2574 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)Z")
    public static final boolean method931(int arg0, int arg1) {
        field2568++;
        if (arg0 != 0) {
            method932(null, null, null, -81);
        }
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/awt/Component;Lpb;Lpb;I)V")
    public static final void method932(Component arg0, class165 arg1, class165 arg2, int arg3) {
        field2567++;
        if (class14.field178) {
            return;
        }
        class239.method1515();
        byte[] var4 = arg2.method1079(class65.field1073, 126, 0);
        class47.field810 = new class18(var4, arg0);
        class108.field2050 = class47.field810.method94();
        class174.field3253 = class200.method1261(arg1, class238.field4294, (byte) 67);
        class150.field2745 = class200.method1261(arg1, class240.field4318, (byte) 67);
        class112.field2124 = class200.method1261(arg1, class62.field1046, (byte) 67);
        class65.field1071 = class154.method1005(arg1, true, class11.field152);
        class30.field470 = class184.method1178(class214.field3910, arg1, (byte) 93);
        class86.field1500 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class86.field1500[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class86.field1500[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class86.field1500[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class86.field1500[var8 + 192] = 16777215;
        }
        if (arg3 != 64) {
            method933(-118, -59);
        }
        class9.field93 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class9.field93[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class9.field93[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class9.field93[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class9.field93[var12 + 192] = 16777215;
        }
        class181.field3332 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class181.field3332[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class181.field3332[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class181.field3332[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class181.field3332[var16 + 192] = 16777215;
        }
        class63.field1047 = new int[32768];
        class157.field2857 = new int[256];
        class189.field3493 = new int[32768];
        class2.method11(null, true);
        class225.field4078 = 0;
        class62.field1040 = false;
        class152.field2785 = class152.field2778;
        if (class104.field1951 == 0) {
            class168.field3068 = true;
        } else {
            class168.field3068 = false;
        }
        class152.field2780 = class152.field2778;
        class93.field1633 = new int[32768];
        class59.field994 = new int[32768];
        if (class168.field3068) {
            class164.method1062(2, -1);
        } else {
            class192.method1226(class69.field1161, 255, class145.field2710, false, true, 0, 2);
        }
        class164.method1060(false, 853933806);
        class14.field178 = true;
        class129.method850((byte) 111);
        class6.field58 = new class18(128, 254);
        class62.field1038 = new class18(128, 254);
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)Z")
    public static final boolean method933(int arg0, int arg1) {
        field2578++;
        if (class208.field3796[arg1]) {
            return true;
        }
        if (arg0 != 256) {
            field2575 = null;
        }
        if (!class134.field2524.method1076(arg1, 7962)) {
            return false;
        }
        int var2 = class134.field2524.method1068(arg1, arg0 - 256);
        if (var2 == 0) {
            class208.field3796[arg1] = true;
            return true;
        }
        if (class97.field1866[arg1] == null) {
            class97.field1866[arg1] = new class96[var2];
        }
        for (int var3 = 0; var3 < var2; var3++) {
            if (class97.field1866[arg1][var3] == null) {
                byte[] var4 = class134.field2524.method1079(arg1, 119, var3);
                if (var4 != null) {
                    class97.field1866[arg1][var3] = new class96();
                    class97.field1866[arg1][var3].field1794 = (arg1 << 16) + var3;
                    if (var4[0] == -1) {
                        class97.field1866[arg1][var3].method606(arg0 - 26965, new class112(var4));
                    } else {
                        class97.field1866[arg1][var3].method607(new class112(var4), 65535);
                    }
                }
            }
        }
        class208.field3796[arg1] = true;
        return true;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lii;I)Lii;")
    public static final class96 method934(class96 arg0, int arg1) {
        if (arg1 != 255) {
            field2579 = null;
        }
        field2569++;
        class96 var2 = class145.method972(arg0, -73);
        if (var2 == null) {
            var2 = arg0.field1816;
        }
        return var2;
    }
}
