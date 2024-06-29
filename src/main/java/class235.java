import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class235 extends RuntimeException {

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "Ljava/lang/String;")
    public String field3883;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3884;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field3879 = 0;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3881 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field3885 = 1;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field3887 = 7759444;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "Lma;")
    public static class5 field3886 = class12.method119("null", (byte) 124);

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "Lma;")
    public static class5 field3890 = class12.method119("l", (byte) 113);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "Leb;")
    public static class253 field3888;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "Lhk;")
    public static class38 field3889;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Lve;", line = 5)
    public static final class196 method1664(int arg0, int arg1) {
        field3878++;
        class196 var2 = (class196) class18.field309.method521((long) arg1, (byte) 80);
        if (var2 != null) {
            return var2;
        }
        if (arg0 <= 77) {
            field3885 = -69;
        }
        byte[] var3 = class238.field3939.method1342(118, class223.method1582(arg1, true), class127.method850(-100, arg1));
        class196 var4 = new class196();
        var4.field3126 = arg1;
        if (var3 != null) {
            var4.method1293((byte) 69, new class221(var3));
        }
        var4.method1298((byte) 27);
        if (var4.field3080 != -1) {
            var4.method1297(method1664(122, var4.field3078), method1664(114, var4.field3080), (byte) 69);
        }
        if (var4.field3085 != -1) {
            var4.method1294(method1664(98, var4.field3085), 768, method1664(115, var4.field3083));
        }
        if (!class237.field3924 && var4.field3098) {
            var4.field3093 = false;
            var4.field3062 = class211.field3362;
            var4.field3072 = null;
            var4.field3118 = null;
            var4.field3075 = 0;
        }
        class18.field309.method519((byte) -95, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(JI)V", line = 57)
    public static final void method1665(long arg0, int arg1) {
        field3877++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class275.field4698 < 100 || class84.field1287 == 1) || class275.field4698 >= 200) {
            class69.method497(24077, class250.field4145, 0, class70.field1113);
            return;
        }
        class5 var3 = class245.method1719(arg0, (byte) -45).method30(arg1 ^ 0xFFFFA127);
        for (int var4 = 0; var4 < class275.field4698; var4++) {
            if (class168.field2565[var4] == arg0) {
                class69.method497(24077, class250.field4145, 0, class288.method1940((byte) 82, new class5[] { var3, class286.field4827 }));
                return;
            }
        }
        for (int var5 = 0; var5 < class100.field1484; var5++) {
            if (class202.field3226[var5] == arg0) {
                class69.method497(24077, class250.field4145, 0, class288.method1940((byte) 63, new class5[] { class213.field3384, var3, class46.field714 }));
                return;
            }
        }
        if (var3.method62(class151.field2183.field1367, -23269)) {
            class69.method497(24077, class250.field4145, 0, class153.field2242);
            return;
        }
        class268.field4615++;
        class244.field4048[class275.field4698] = var3;
        class168.field2565[class275.field4698] = arg0;
        class49.field771[class275.field4698] = 0;
        class127.field1912[class275.field4698] = class250.field4145;
        class91.field1376[class275.field4698] = 0;
        class33.field516[class275.field4698] = false;
        class275.field4698++;
        class228.field3777 = class303.field5107;
        class147.field2127.method1389((byte) 111, 228);
        if (arg1 != 24246) {
            method1666(94, -108, true);
        }
        class147.field2127.method1548(false, arg0);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZ)V", line = 128)
    public static final void method1666(int arg0, int arg1, boolean arg2) {
        class149.field2149[arg1] = arg0;
        field3880++;
        class283 var3 = (class283) class161.field2453.method1372(false, (long) arg1);
        if (!arg2) {
            field3888 = (class253) null;
        }
        if (var3 == null) {
            class283 var4 = new class283(class212.method1404((byte) -87) + 500L);
            class161.field2453.method1376((long) arg1, -1, var4);
        } else {
            var3.field4801 = class212.method1404((byte) -122) + 500L;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V", line = 156)
    public static void method1667(boolean arg0) {
        if (!arg0) {
            method1666(-119, 27, true);
        }
        field3881 = null;
        field3886 = null;
        field3890 = null;
        field3888 = null;
        field3889 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBLeb;I)V", line = 173)
    public static final void method1668(int arg0, byte arg1, class253 arg2, int arg3) {
        field3875++;
        if (arg1 >= -104) {
            method1666(2, -19, false);
        }
        if (class100.field1499 != 0 && class100.field1499 != 3 || !arg2.method1775(0)) {
            return;
        }
        int var4 = arg2.field4232[arg0];
        if (var4 > arg3 || arg2.field4278[arg0] + var4 < arg3) {
            return;
        }
        int var5 = class24.field416 + class14.field268 & 0x7FF;
        int var6 = arg0 - arg2.field4190 / 2;
        int var7 = arg3 - arg2.field4228 / 2;
        int var8 = class229.field3805[var5];
        int var9 = (class236.field3894 + 256) * var8 >> 8;
        int var10 = class229.field3806[var5];
        int var11 = (class236.field3894 + 256) * var10 >> 8;
        int var12 = var6 * var9 + (var7 * var11) >> 11;
        int var13 = var6 * var11 - (var7 * var9) >> 11;
        int var14 = class151.field2183.field211 - var13 >> 7;
        int var15 = class151.field2183.field178 + var12 >> 7;
        if (class1.field3 > 0 && class234.field3872[82] && class234.field3872[81]) {
            class186.method1231(class193.field3017 + var15, class276.field4701, -11042, class74.field1158 + var14);
            return;
        }
        boolean var16 = class149.method939(0, 0, var15, 0, 0, 0, 125, 1, var14, true, class151.field2183.field186[0], class151.field2183.field175[0]);
        if (!var16) {
            return;
        }
        class147.field2127.method1542(-109, var7);
        class147.field2127.method1542(-109, var6);
        class147.field2127.method1539(class24.field416, false);
        class147.field2127.method1542(-111, 57);
        class147.field2127.method1542(-87, class14.field268);
        class147.field2127.method1542(-124, class236.field3894);
        class147.field2127.method1542(-84, 89);
        class147.field2127.method1539(class151.field2183.field178, false);
        class147.field2127.method1539(class151.field2183.field211, false);
        class147.field2127.method1542(-62, class261.field4464);
        class147.field2127.method1542(-92, 63);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lni;Lni;I)I", line = 258)
    public static final int method1669(class202 arg0, class202 arg1, int arg2) {
        field3876++;
        int var3 = 0;
        if (arg1.method1341(arg2 ^ 0xFFFF86EB, class202.field3224)) {
            var3++;
        }
        if (arg2 != -31046) {
            method1667(false);
        }
        if (arg1.method1341(-26, class80.field1244)) {
            var3++;
        }
        if (arg1.method1341(arg2 + 31112, class226.field3712)) {
            var3++;
        }
        if (arg0.method1341(-37, class202.field3224)) {
            var3++;
        }
        if (arg0.method1341(arg2 + 30918, class80.field1244)) {
            var3++;
        }
        if (arg0.method1341(-24, class226.field3712)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 301)
    public class235(Throwable arg0, String arg1) {
        this.field3883 = arg1;
        this.field3884 = arg0;
    }
}
