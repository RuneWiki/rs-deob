import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class112 {

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Lri;")
    public static class189 field2015 = new class189(64);

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "Z")
    public static boolean field2018 = false;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "[[I")
    public static int[][] field2020 = new int[5][5000];

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Ldj;")
    private static class44 field2016 = class89.method650(255, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Ldj;")
    private static class44 field2023 = class89.method650(255, "M");

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Ldj;")
    public static class44 field2022 = field2023;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Ldj;")
    public static class44 field2017 = field2016;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Ldj;")
    public static class44 field2019 = field2023;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lnf;")
    public static class147 field2021;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLvc;II)V")
    public static final void method790(byte arg0, class223 arg1, int arg2, int arg3) {
        field2013++;
        if (class115.field2057 != 0 && class115.field2057 != 3) {
            return;
        }
        int var4 = arg3 - arg1.field4134 / 2;
        int var5 = -86 / ((arg0 - 15) / 51);
        int var6 = arg2 - arg1.field4130 / 2;
        int var7 = class73.field1384 + class129.field2303 & 0x7FF;
        int var8 = class206.field3700[var7];
        int var9 = (class218.field3959 + 256) * var8 >> 8;
        int var10 = class206.field3684[var7];
        int var11 = (class218.field3959 + 256) * var10 >> 8;
        int var12 = var4 * var11 + var6 * var9 >> 11;
        int var13 = var4 * var9 - var6 * var11 >> 11;
        int var14 = class96.field1774.field2260 + var12 >> 7;
        int var15 = class96.field1774.field2195 - var13 >> 7;
        boolean var16 = class129.method884(0, class96.field1774.field2240[0], 1, 0, -129, class96.field1774.field2235[0], true, var15, var14, 0, 0, 0);
        if (!var16) {
            return;
        }
        class200.field3542.method488(123, var6);
        class200.field3542.method488(126, var4);
        class200.field3542.method510((byte) -121, class73.field1384);
        class200.field3542.method488(119, 57);
        class200.field3542.method488(122, class129.field2303);
        class200.field3542.method488(121, class218.field3959);
        class200.field3542.method488(121, 89);
        class200.field3542.method510((byte) -123, class96.field1774.field2260);
        class200.field3542.method510((byte) -53, class96.field1774.field2195);
        class200.field3542.method488(124, class205.field3680);
        class200.field3542.method488(122, 63);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method791(byte arg0) {
        field2016 = null;
        field2020 = null;
        field2017 = null;
        field2022 = null;
        field2021 = null;
        field2015 = null;
        if (arg0 >= -4) {
            method790((byte) -83, null, 33, 2);
        }
        field2023 = null;
        field2019 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLaf;ILnf;)V")
    public static final void method792(boolean arg0, class7 arg1, int arg2, class147 arg3) {
        class224 var4 = new class224();
        var4.field4185 = 1;
        field2014++;
        var4.field4179 = arg1;
        var4.field3186 = arg2;
        var4.field4181 = arg3;
        class190 var5 = class13.field245;
        synchronized (class13.field245) {
            class13.field245.method1185(var4, (byte) -110);
        }
        class226.method1486(-106);
        if (!arg0) {
            method790((byte) 104, null, -45, -59);
        }
    }
}
