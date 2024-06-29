import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class184 {

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field3304 = -1;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Lff;")
    public static class62 field3306 = new class62(512);

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Lkh;")
    public static class117 field3311 = class224.method1450((byte) 116, "(U(Y");

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field3315 = 50;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "[I")
    public static int[] field3314 = new int[field3315];

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "[I")
    public static int[] field3308 = new int[field3315];

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "[I")
    public static int[] field3316 = new int[field3315];

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "[I")
    public static int[] field3313 = new int[field3315];

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "[I")
    public static int[] field3317 = new int[field3315];

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "[Lkh;")
    public static class117[] field3310 = new class117[field3315];

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "[I")
    public static int[] field3312 = new int[field3315];

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "[I")
    public static int[] field3318 = new int[field3315];

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "[I")
    public static int[] field3305;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static final void method1261(int arg0) {
        field3307++;
        int var1 = class199.field3603.method928(class199.field3598);
        for (int var2 = 0; var2 < class100.field1825; var2++) {
            int var7 = class199.field3603.method928(class127.method870(0, var2));
            if (var7 > var1) {
                var1 = var7;
            }
        }
        class182.field3289 = true;
        int var3 = class100.field1825 * 15 + 21;
        int var4 = -35 % ((arg0 - 70) / 50);
        class32.field761 = class100.field1825 * 15 + 22;
        var1 += 8;
        class120.field2266 = var1;
        int var5 = class187.field3353 - var1 / 2;
        int var6 = class41.field929;
        if (var1 + var5 > class97.field1793) {
            var5 = class97.field1793 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var6 + var3 > class124.field2324) {
            var6 = class124.field2324 - var3;
        }
        class98.field1809 = var5;
        if (var6 < 0) {
            var6 = 0;
        }
        class111.field2092 = var6;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static final void method1262(int arg0) {
        class8.field139.method275(0, 0);
        if (arg0 <= 113) {
            method1261(-95);
        }
        client.field785.method275(382, 0);
        class39.field901.method1084(382 - class39.field901.field3340 / 2, 18);
        field3303++;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static void method1263(byte arg0) {
        field3317 = null;
        field3305 = null;
        field3308 = null;
        if (arg0 < 99) {
            field3318 = null;
        }
        field3318 = null;
        field3306 = null;
        field3311 = null;
        field3313 = null;
        field3312 = null;
        field3314 = null;
        field3316 = null;
        field3310 = null;
    }
}
