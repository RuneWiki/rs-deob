import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class13 {

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field248 = -1;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lub;")
    public static class227 field250 = class257.method1749(")4g", 17263);

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Lrb;")
    public static class254 field249 = new class254(50);

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "Z")
    public static boolean field251 = true;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "Lub;")
    public static class227 field253 = class257.method1749("Freie Welt", 17263);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "Lnh;")
    public static class57 field247;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "Lnh;")
    public static class57 field252;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "[I")
    public static int[] field245;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILja;)V")
    public static final void method61(int arg0, class4 arg1) {
        if (class253.field4393 == arg1.field65 || arg1.field101 == -1 || arg1.field60 != 0 || arg1.field95 + 1 > class25.method127(true, arg1.field101).field899[arg1.field52]) {
            int var2 = arg1.field65 - arg1.field66;
            int var3 = arg1.field48 * 128 + arg1.field45 * 64;
            int var4 = arg1.field93 * 128 + (arg1.field45 * 64);
            int var5 = class253.field4393 - arg1.field66;
            int var6 = arg1.field80 * 128 + arg1.field45 * 64;
            int var7 = arg1.field90 * 128 + arg1.field45 * 64;
            arg1.field50 = ((var2 - var5) * var3 + (var5 * var7)) / var2;
            arg1.field99 = ((var2 - var5) * var4 + (var5 * var6)) / var2;
        }
        if (arg1.field98 == 0) {
            arg1.field94 = 1024;
        }
        arg1.field84 = 0;
        field246++;
        if (arg1.field98 == 1) {
            arg1.field94 = 1536;
        }
        if (arg1.field98 == 2) {
            arg1.field94 = 0;
        }
        if (arg1.field98 == 3) {
            arg1.field94 = 512;
        }
        arg1.field106 = arg1.field94;
        if (arg0 != -101) {
            field253 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static void method62(byte arg0) {
        field250 = null;
        field245 = null;
        field252 = null;
        field249 = null;
        int var1 = -104 / ((5 - arg0) / 43);
        field253 = null;
        field247 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static final void method63(int arg0) {
        field243++;
        int var1 = (class216.field3639.field50 >> 7) + class192.field3267;
        int var2 = (class216.field3639.field99 >> 7) + class78.field1367;
        class251.field4348 = 0;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class251.field4348 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class251.field4348 = 1;
        }
        if (class251.field4348 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class251.field4348 = 0;
        }
        if (arg0 != -8358) {
            method61(-82, (class4) null);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(JI)V")
    public static final void method64(long arg0, int arg1) {
        field242++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class166.field2781 < 100 || class100.field1759 == 1) || class166.field2781 >= 200) {
            class130.method799(arg1 + 1403, 0, class91.field1558, class44.field726);
            return;
        }
        class227 var3 = class118.method744(arg0, -121).method1527(arg1 ^ 0xFFFFFFA0);
        for (int var4 = arg1; var4 < class166.field2781; var4++) {
            if (class28.field460[var4] == arg0) {
                class130.method799(1403, 0, class91.field1558, class76.method445((byte) 107, new class227[] { var3, class227.field3961 }));
                return;
            }
        }
        for (int var5 = 0; var5 < class86.field1485; var5++) {
            if (class230.field4031[var5] == arg0) {
                class130.method799(1403, 0, class91.field1558, class76.method445((byte) -74, new class227[] { class253.field4446, var3, class54.field945 }));
                return;
            }
        }
        if (var3.method1487(127, class216.field3639.field3819)) {
            class130.method799(arg1 + 1403, 0, class91.field1558, class14.field264);
            return;
        }
        class201.field3442[class166.field2781] = var3;
        class151.field2629++;
        class28.field460[class166.field2781] = arg0;
        class151.field2637[class166.field2781] = 0;
        class21.field363[class166.field2781] = class91.field1558;
        class175.field2915[class166.field2781] = 0;
        class71.field1248[class166.field2781] = false;
        class166.field2781++;
        class152.field2645 = class77.field1356;
        class176.field2935.method664((byte) -113, 110);
        class176.field2935.method1457(arg0, 112);
    }
}
