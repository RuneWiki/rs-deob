import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class195 {

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lmd;")
    public static class123 field3729 = new class123(512);

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "[[I")
    public static int[][] field3734 = new int[5][5000];

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field3738 = 0;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Lob;")
    public static class141 field3733 = class175.method1195(40, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field3732 = 0;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field3737 = 0;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "[I")
    public static int[] field3740 = new int[256];

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "[Z")
    public static boolean[] field3741 = new boolean[100];

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "Lph;")
    public static class157 field3739;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "[I")
    public static int[] field3726;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "[[B")
    public static byte[][] field3736;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;I)Lob;")
    public static final class141 method1312(String arg0, int arg1) {
        field3735++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        class141 var3 = new class141();
        var3.field2701 = var2;
        var3.field2705 = 0;
        if (arg1 <= 39) {
            field3737 = 14;
        }
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field2705++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static final void method1313(int arg0) {
        field3725++;
        while (class156.field3014.method36(-70, class187.field3632) >= 11) {
            int var1 = class156.field3014.method34(11, 11339);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class116.field2231[var1] == null) {
                var2 = true;
                class116.field2231[var1] = new class38();
                if (class14.field262[var1] != null) {
                    class116.field2231[var1].method254(-25014, class14.field262[var1]);
                }
            }
            class188.field3647[class184.field3587++] = var1;
            class38 var3 = class116.field2231[var1];
            var3.field3885 = class20.field344;
            int var4 = class156.field3014.method34(1, 11339);
            if (var4 == 1) {
                class125.field2416[class165.field3199++] = var1;
            }
            int var5 = class156.field3014.method34(5, 11339);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class47.field908[class156.field3014.method34(3, 11339)];
            if (var2) {
                var3.field3833 = var3.field3845 = var6;
            }
            int var7 = class156.field3014.method34(5, 11339);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class156.field3014.method34(1, 11339);
            var3.method1344(class114.field2176.field3870[0] + var7, class114.field2176.field3892[0] - -var5, -1, ~var8 == -2);
        }
        class156.field3014.method41(8);
        int var9 = 61 / ((-arg0 - 42) / 52);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BIIII)V")
    public static final void method1314(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class148.method1020(arg2, arg4, arg1 + arg2, arg3 + arg4);
        field3731++;
        class44.method288();
        class45.field866++;
        class67.method446(true, false);
        class221.method1425(true, (byte) 93);
        class67.method446(false, false);
        class221.method1425(false, (byte) -101);
        class223.method1434((byte) 43);
        class82.method567(-123);
        if (!client.field597) {
            int var5 = class214.field4084 + class220.field4153 & 0x7FF;
            int var6 = class154.field2996;
            if (class58.field1132 / 256 > var6) {
                var6 = class58.field1132 / 256;
            }
            if (class190.field3671[4] && class139.field2672[4] + 128 > var6) {
                var6 = class139.field2672[4] + 128;
            }
            class190.method1264(class206.method1360(class66.field1287, class114.field2176.field3889, (byte) 40, class114.field2176.field3854) - 50, var5, class224.field4226, var6, var6 * 3 + 600, class100.field1955, 109);
        }
        int var7;
        if (client.field597) {
            var7 = class175.method1194(255);
        } else {
            var7 = class118.method767((byte) -84);
        }
        int var8 = class178.field3508;
        int var9 = class191.field3683;
        int var10 = class184.field3589;
        int var11 = class19.field338;
        int var12 = class175.field3474;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class190.field3671[var13]) {
                int var17 = (int) ((double) -class179.field3534[var13] + Math.random() * (double) (class179.field3534[var13] * 2 + 1) + Math.sin((double) class30.field582[var13] / 100.0D * (double) class168.field3237[var13]) * (double) class139.field2672[var13]);
                if (var13 == 4) {
                    class19.field338 += var17;
                    if (class19.field338 < 128) {
                        class19.field338 = 128;
                    }
                    if (class19.field338 > 383) {
                        class19.field338 = 383;
                    }
                }
                if (var13 == 3) {
                    class175.field3474 = class175.field3474 + var17 & 0x7FF;
                }
                if (var13 == 0) {
                    class178.field3508 += var17;
                }
                if (var13 == 1) {
                    class191.field3683 += var17;
                }
                if (var13 == 2) {
                    class184.field3589 += var17;
                }
            }
        }
        int var14 = class174.field3452;
        int var15 = class146.field2794;
        if (arg2 <= var15 && var15 < arg1 + arg2 && var14 >= arg4 && var14 < arg3 + arg4) {
            class92.field1836 = true;
            class206.field3926 = class146.field2794 - arg2;
            class138.field2650 = 0;
            class60.field1163 = class174.field3452 - arg4;
        } else {
            class92.field1836 = false;
            class138.field2650 = 0;
        }
        class118.method766(-5);
        class148.method1030(arg2, arg4, arg1, arg3, 0);
        class118.method766(-5);
        class113.method734(class178.field3508, class191.field3683, class184.field3589, class19.field338, class175.field3474, var7);
        class118.method766(-5);
        class60.method404();
        class161.method1122(false, arg3, arg2, arg4, arg1);
        class54.method364(arg4, arg2, -120);
        ((class160) class44.field857).method1113(class34.field695, 62);
        class215.method1401((byte) -96, arg3, arg4, arg1, arg2);
        class184.field3589 = var10;
        class178.field3508 = var8;
        class175.field3474 = var12;
        class19.field338 = var11;
        class191.field3683 = var9;
        int var16 = 4 / ((arg0 - 58) / 53);
        if (class139.field2674 && client.method215(false, (byte) -115, true) == 0) {
            class139.field2674 = false;
        }
        if (class139.field2674) {
            class148.method1030(arg2, arg4, arg1, arg3, 0);
            class53.method357(-31122, false, class182.field3574);
        }
        if (!class139.field2674 && !class114.field2180 && arg2 <= var15 && var15 < arg2 + arg1 && arg4 <= var14 && var14 < arg3 + arg4) {
            class110.method725(11546, var14, arg2, arg4, var15);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
    public static void method1315(boolean arg0) {
        field3739 = null;
        field3736 = null;
        field3734 = null;
        if (arg0) {
            method1313(3);
        }
        field3741 = null;
        field3733 = null;
        field3740 = null;
        field3726 = null;
        field3729 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z[Lob;)[Lob;")
    public static final class141[] method1316(boolean arg0, class141[] arg1) {
        field3728++;
        if (!arg0) {
            return null;
        }
        class141[] var2 = new class141[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class220.method1422(new class141[] { class78.method543((byte) 93, var3), class126.field2418 }, -3);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class220.method1422(new class141[] { var2[var3], arg1[var3] }, -3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(JZ)Lob;")
    public static final class141 method1317(long arg0, boolean arg1) {
        class9.field152.setTime(new Date(arg0));
        field3727++;
        int var3 = class9.field152.get(7);
        int var4 = class9.field152.get(5);
        int var5 = class9.field152.get(2);
        int var6 = class9.field152.get(1);
        int var7 = class9.field152.get(11);
        int var8 = class9.field152.get(12);
        if (!arg1) {
            method1317(-88L, true);
        }
        int var9 = class9.field152.get(13);
        return class220.method1422(new class141[] { class76.field1542[var3 - 1], class15.field280, class78.method543((byte) 93, var4 / 10), class78.method543((byte) 93, var4 % 10), class122.field2336, class67.field1302[var5], class122.field2336, class78.method543((byte) 93, var6), class39.field784, class78.method543((byte) 93, var7 / 10), class78.method543((byte) 93, var7 % 10), class31.field620, class78.method543((byte) 93, var8 / 10), class78.method543((byte) 93, var8 % 10), class31.field620, class78.method543((byte) 93, var9 / 10), class78.method543((byte) 93, var9 % 10), class136.field2598 }, -3);
    }
}
