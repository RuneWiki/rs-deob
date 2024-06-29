import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class200 {

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "J")
    public static long field3231 = 0L;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Lwm;")
    private static class152 field3230 = class157.method1048("Drop", 102);

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Lwm;")
    public static class152 field3233 = class157.method1048("ondulation2:", 104);

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "[I")
    public static int[] field3234 = new int[1000];

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lwm;")
    public static class152 field3235 = field3230;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Lah;")
    public static class205 field3229;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lbe;")
    public static class297 field3227;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 10)
    public static void method1332(int arg0) {
        field3233 = null;
        field3235 = null;
        field3234 = null;
        int var1 = 5 / ((-arg0 - 14) / 63);
        field3230 = null;
        field3227 = null;
        field3229 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILdi;)V", line = 51)
    public static final void method1333(int arg0, class151 arg1) {
        field3232++;
        class87.field1228 = 3;
        class154.method1030(true, -117);
        class224.field3637 = 127;
        class179.field2848 = 0;
        class138 var2 = null;
        class28.field484 = true;
        class81.field1131 = true;
        class205.field3352 = true;
        class33.field539 = true;
        class140.field2135 = 0;
        class15.field211 = 0;
        class6.field93 = 255;
        if (arg0 > -125) {
            field3231 = -46L;
        }
        class15.field209 = true;
        class211.field3427 = true;
        class72.field1048 = 127;
        class100.field1454 = true;
        class92.field1307 = true;
        class225.field3657 = 0;
        class236.field3870 = true;
        class199.field3209 = true;
        class289.field4906 = true;
        class239.field3919 = 2;
        if (class6.field96 >= 96) {
            class47.method324(2);
        } else {
            class47.method324(0);
        }
        class20.field270 = false;
        class40.field651 = false;
        class259.field4438 = false;
        class167.field2632 = 0;
        class253.field4386 = 0;
        class243.field4023 = 0;
        class169.field2651 = true;
        try {
            class188 var3 = arg1.method960(0, "runescape");
            while (var3.field2980 == 0) {
                class4.method19(0, 1L);
            }
            if (var3.field2980 == 1) {
                var2 = (class138) var3.field2977;
                byte[] var4 = new byte[(int) var2.method876(-1)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method871(var4.length - var5, (byte) 21, var4, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class197.method1313(new class291(var4), -97);
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method874(-123);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([BIIZ[Luf;I)V", line = 146)
    public static final void method1334(byte[] arg0, int arg1, int arg2, boolean arg3, class22[] arg4, int arg5) {
        int var6 = -19 / ((-arg5 - 27) / 34);
        class291 var7 = new class291(arg0);
        field3228++;
        int var8 = -1;
        while (true) {
            int var9 = var7.method1981(-120);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method2013((byte) -20);
                if (var11 == 0) {
                    break;
                }
                int var12 = var7.method2011(-124);
                var10 += var11 - 1;
                int var13 = var10 & 0x3F;
                int var14 = (var10 & 0xFD5) >> 6;
                int var15 = var10 >> 12;
                int var16 = var12 >> 2;
                int var17 = var12 & 0x3;
                int var18 = var14 + arg1;
                int var19 = arg2 + var13;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    class22 var20 = null;
                    if (!arg3) {
                        int var21 = var15;
                        if ((class70.field1026[1][var18][var19] & 0x2) == 2) {
                            var21 = var15 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg4[var21];
                        }
                    }
                    class169.method1113(var8, var15, arg3, var16, var17, var20, !arg3, var15, var19, var18, 114);
                }
            }
        }
    }
}
