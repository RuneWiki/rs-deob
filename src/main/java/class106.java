import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class106 extends class46 {

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "Z")
    public static volatile boolean field2409 = false;

    @OriginalMember(owner = "client!pb", name = "kb", descriptor = "[Lhd;")
    public static class53[] field2421 = new class53[2048];

    @OriginalMember(owner = "client!pb", name = "mb", descriptor = "Lsc;")
    public static class128 field2423 = class129.method1017(false, "l");

    @OriginalMember(owner = "client!pb", name = "jb", descriptor = "I")
    public static int field2420 = 0;

    @OriginalMember(owner = "client!pb", name = "fb", descriptor = "Lsc;")
    public static class128 field2416 = class129.method1017(false, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!pb", name = "lb", descriptor = "[S")
    public static short[] field2422 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!pb", name = "ob", descriptor = "Lsc;")
    private static class128 field2425 = class129.method1017(false, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!pb", name = "cb", descriptor = "Lsc;")
    public static class128 field2413 = field2425;

    @OriginalMember(owner = "client!pb", name = "pb", descriptor = "Lsc;")
    public static class128 field2426 = class129.method1017(false, "<br>");

    @OriginalMember(owner = "client!pb", name = "rb", descriptor = "Lsc;")
    public static class128 field2428 = class129.method1017(false, "<col=00ff80>");

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!pb", name = "Z", descriptor = "I")
    public int field2410;

    @OriginalMember(owner = "client!pb", name = "ab", descriptor = "I")
    public int field2411;

    @OriginalMember(owner = "client!pb", name = "bb", descriptor = "I")
    public int field2412;

    @OriginalMember(owner = "client!pb", name = "db", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!pb", name = "eb", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!pb", name = "ib", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!pb", name = "nb", descriptor = "I")
    public int field2424;

    @OriginalMember(owner = "client!pb", name = "sb", descriptor = "Lsc;")
    public class128 field2429;

    @OriginalMember(owner = "client!pb", name = "gb", descriptor = "Ljd;")
    public static class66 field2417;

    @OriginalMember(owner = "client!pb", name = "qb", descriptor = "[I")
    public int[] field2427;

    @OriginalMember(owner = "client!pb", name = "tb", descriptor = "[I")
    public int[] field2430;

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "[Lsc;")
    public class128[] field2407;

    @OriginalMember(owner = "client!pb", name = "hb", descriptor = "[[[B")
    public static byte[][][] field2418;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Lmf;")
    public static final class89 method789(boolean arg0) {
        field2408++;
        try {
            if (!arg0) {
                method793((byte) -6);
            }
            return (class89) Class.forName("c").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class35();
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lsf;Ljava/awt/Component;ILsf;)V")
    public static final void method790(class131 arg0, Component arg1, int arg2, class131 arg3) {
        field2414++;
        if (class105.field2399) {
            return;
        }
        class138.method1129();
        byte[] var4 = arg0.method1029(class132.field3059, -1, class158.field3621);
        class151.field3475 = new class8(var4, arg1);
        class152.field3514 = class151.field3475.method56();
        class115.field2604 = class149.method1189(6858, arg3, class132.field3059, class111.field2493);
        class119.field2704 = class149.method1189(arg2 ^ 0x9ACA, arg3, class132.field3059, class20.field366);
        class112.field2513 = class149.method1189(arg2 ^ 0x9ACA, arg3, class132.field3059, class53.field1040);
        class43.field813 = class50.method392(class132.field3061, arg2 - 32853, arg3, class132.field3059);
        class105.field2397 = class50.method392(class108.field2458, 82, arg3, class132.field3059);
        class20.field389 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class20.field389[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class20.field389[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class20.field389[var7 + 128] = var7 * 4 + 16776960;
        }
        if (arg2 != 32768) {
            field2425 = null;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class20.field389[var8 + 192] = 16777215;
        }
        class35.field653 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class35.field653[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class35.field653[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class35.field653[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class35.field653[var12 + 192] = 16777215;
        }
        class43.field798 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class43.field798[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class43.field798[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class43.field798[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class43.field798[var16 + 192] = 16777215;
        }
        class27.field533 = new int[256];
        class53.field1044 = new int[32768];
        class9.field135 = new int[32768];
        class77.method566(1, null);
        class132.field3070 = class132.field3059;
        class54.field1101 = new int[32768];
        class132.field3090 = class132.field3059;
        class148.field3422 = new int[32768];
        class75.field1663 = false;
        if (class149.field3440 == 0) {
            class18.field328 = true;
        } else {
            class18.field328 = false;
        }
        class100.field2305 = 0;
        if (class18.field328) {
            class124.method944(217, 2);
        } else {
            class7.method38(class132.field3059, class65.field1448, class36.field701, 124, 2, 255, false);
        }
        class108.method842(false, -2727);
        class105.field2399 = true;
        class151.field3475.method40(0, 0);
        class152.field3514.method40(382, 0);
        class115.field2604.method430(382 - class115.field2604.field1237 / 2, 18);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLsf;Lsf;)V")
    public static final void method791(byte arg0, class131 arg1, class131 arg2) {
        class70.field1567 = arg1;
        if (arg0 == -104) {
            class65.field1455 = arg2;
            field2415++;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BIII)Z")
    public static final boolean method792(byte arg0, int arg1, int arg2, int arg3) {
        field2419++;
        int var4 = 78 % ((arg0 + 65) / 45);
        int var5 = arg1 >> 14 & 0x7FFF;
        int var6 = class154.field3553.method102(class29.field553, arg3, arg2, arg1);
        if (var6 == -1) {
            return false;
        }
        int var7 = var6 >> 6 & 0x3;
        int var8 = var6 & 0x1F;
        if (var8 == 10 || var8 == 11 || var8 == 22) {
            class94 var9 = class147.method1185(-2, var5);
            int var10;
            int var11;
            if (var7 == 0 || var7 == 2) {
                var11 = var9.field2166;
                var10 = var9.field2195;
            } else {
                var10 = var9.field2166;
                var11 = var9.field2195;
            }
            int var12 = var9.field2160;
            if (var7 != 0) {
                var12 = (var12 >> 4 - var7) + (var12 << var7 & 0xF);
            }
            class43.method306(arg3, 0, 0, var11, 2, arg2, var10, (byte) 119, true, class151.field3473.field989[0], class151.field3473.field962[0], var12);
        } else {
            class43.method306(arg3, var7, var8 + 1, 0, 2, arg2, 0, (byte) 22, true, class151.field3473.field989[0], class151.field3473.field962[0], 0);
        }
        class127.field2871 = 2;
        class70.field1580 = 0;
        class156.field3587 = class43.field806;
        class19.field356 = class9.field133;
        return true;
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)V")
    public static void method793(byte arg0) {
        field2417 = null;
        field2425 = null;
        int var1 = 20 / ((43 - arg0) / 51);
        field2428 = null;
        field2421 = null;
        field2426 = null;
        field2422 = null;
        field2418 = null;
        field2423 = null;
        field2413 = null;
        field2416 = null;
    }
}
