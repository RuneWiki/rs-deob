import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class190 {

    @OriginalMember(owner = "client!af", name = "e", descriptor = "[I")
    public static int[] field2979 = new int[99];

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public int field2981;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Lpi;")
    public class326 field2980;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "[I")
    public int[] field2976;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZLuf;)V", line = 12)
    public static final void method1367(int arg0, boolean arg1, class24 arg2) {
        int var3 = arg2.field417;
        field2977++;
        int var4 = (int) arg2.field879;
        arg2.method489(false);
        if (arg1) {
            class88.method703((byte) 54, var3);
        }
        class342.method2375(-30, var3);
        class266 var5 = class171.method1276(var4, (byte) 18);
        if (var5 != null) {
            class280.method1971((byte) 101, var5);
        }
        int var6 = class137.field2225;
        for (int var7 = arg0; var7 < var6; var7++) {
            if (class331.method2327(class120.field1960[var7], (byte) -100)) {
                class49.method412(var7, 2);
            }
        }
        if (class137.field2225 == 1) {
            class260.field3858 = false;
            class318.method2250(class99.field1591, arg0 ^ 0xFFFFFF86, class326.field5096, class37.field554, class315.field4968);
        } else {
            class318.method2250(class99.field1591, -86, class326.field5096, class37.field554, class315.field4968);
            int var8 = class146.field2392.method1468(class307.field4872);
            for (int var9 = 0; var9 < class137.field2225; var9++) {
                int var10 = class146.field2392.method1468(class71.method574(59, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class326.field5096 = (class183.field2908 ? 26 : 22) + class137.field2225 * 15;
            class99.field1591 = var8 + 8;
        }
        if (class168.field2707 != -1) {
            class79.method618(1, class168.field2707, arg0 + 26822);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V", line = 78)
    public static void method1368(boolean arg0) {
        if (arg0) {
            field2979 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZIIZZ)Lpk;", line = 88)
    public static final class120 method1369(boolean arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        if (arg1 != 99) {
            method1369(false, 110, -100, false, false);
        }
        field2982++;
        class111 var5 = null;
        if (class241.field3612 != null) {
            var5 = new class111(arg2, class241.field3612, class242.field3624[arg2], 1000000);
        }
        class21.field383[arg2] = class173.field2773.method327(var5, class310.field4906, arg2, class85.method677(arg1, -80));
        if (arg4) {
            class21.field383[arg2].method2094((byte) -106);
        }
        return new class120(class21.field383[arg2], arg0, arg3);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2979[var1] = var0 / 4;
        }
        field2983 = 0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V", line = 147)
    public static final void method1370(int arg0, int arg1) {
        class307.field4873.method2285(arg0, (byte) -32);
        if (arg1 > -25) {
            method1369(true, 47, 51, false, true);
        }
        field2975++;
    }
}
