import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class94 extends RuntimeException {

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Ljava/lang/String;")
    public String field2399;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2388;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field2389 = 0;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Lkd;")
    public static class73 field2391 = class126.method1070((byte) -66, "(Y ");

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Lkd;")
    public static class73 field2390 = class126.method1070((byte) -66, "Lade)3)3)3");

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Lkd;")
    public static class73 field2394 = class126.method1070((byte) -66, "Handel)4Duell");

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "[I")
    public static int[] field2393;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BII)I")
    public static final int method778(byte arg0, int arg1, int arg2) {
        field2396++;
        int var3 = class109.method876(arg2 - 1, 63, arg1 - 1) + class109.method876(arg2 + 1, 89, arg1 - 1) + class109.method876(arg2 + -1, 96, arg1 + 1) + class109.method876(arg2 + 1, -68, arg1 - -1);
        int var4 = 50 % ((-arg0 - 18) / 32);
        int var5 = class109.method876(arg2 - 1, -108, arg1) + class109.method876(arg2 + 1, 101, arg1) + class109.method876(arg2, 98, arg1 + -1) + class109.method876(arg2, 48, arg1 + 1);
        int var6 = class109.method876(arg2, -73, arg1);
        return var6 / 4 + var3 / 16 + var5 / 8;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method779(int arg0) {
        if (arg0 != 17378) {
            field2390 = null;
        }
        field2393 = null;
        field2391 = null;
        field2394 = null;
        field2390 = null;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public static final void method780(int arg0) {
        if (arg0 <= 88) {
            method781(null, -87);
        }
        field2395++;
        for (class132 var1 = (class132) class112.field2790.method514((byte) -79); var1 != null; var1 = (class132) class112.field2790.method517(-88)) {
            if (var1.field3312 > 0) {
                var1.field3312--;
            }
            if (var1.field3312 != 0) {
                if (var1.field3324 > 0) {
                    var1.field3324--;
                }
                if (var1.field3324 == 0 && var1.field3314 >= 1 && var1.field3301 >= 1 && var1.field3314 <= 102 && var1.field3301 <= 102 && (var1.field3325 < 0 || class77.method666(var1.field3302, 19467, var1.field3325))) {
                    class64.method539(var1.field3305, var1.field3325, var1.field3301, -126, var1.field3311, var1.field3310, var1.field3314, var1.field3302);
                    var1.field3324 = -1;
                    if (var1.field3326 == var1.field3325 && var1.field3326 == -1) {
                        var1.method1147((byte) -56);
                    } else if (var1.field3326 == var1.field3325 && var1.field3316 == var1.field3310 && var1.field3321 == var1.field3302) {
                        var1.method1147((byte) -116);
                    }
                }
            } else if (var1.field3326 < 0 || class77.method666(var1.field3321, 19467, var1.field3326)) {
                class64.method539(var1.field3305, var1.field3326, var1.field3301, 55, var1.field3311, var1.field3316, var1.field3314, var1.field3321);
                var1.method1147((byte) -109);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(La;I)[I")
    public static final int[] method781(class1 arg0, int arg1) {
        field2398++;
        int var2 = arg0.field45 >> 16;
        if (!class80.method690(var2, -1)) {
            return null;
        }
        int var3 = arg0.field115;
        int var4 = arg0.field60;
        class1 var7;
        for (int var5 = arg0.field101; var5 != -1; var5 = var7.field101) {
            var7 = class120.field3066[var2][var5 & 0xFFFF];
            var3 += var7.field115 - var7.field86;
            var4 += var7.field60 - var7.field73;
        }
        int[] var6 = new int[] { var4, var3 };
        if (arg1 <= 124) {
            field2390 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Lf;")
    public static final class36 method782(int arg0, int arg1) {
        field2397++;
        class36 var2 = (class36) class18.field508.method538(arg0 + 24669, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class76.field1950.method898((byte) -80, arg1, 12);
        class36 var4 = new class36();
        if (var3 != null) {
            var4.method290(-121, new class114(var3));
        }
        var4.method289(arg0 + 24669);
        class18.field508.method542(var4, -901, (long) arg1);
        if (arg0 != -24669) {
            method780(-93);
        }
        return var4;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class94(Throwable arg0, String arg1) {
        this.field2399 = arg1;
        this.field2388 = arg0;
    }
}
