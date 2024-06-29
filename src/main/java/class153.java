import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class153 {

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2216 = "Loaded world list data";

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2217 = new String[500];

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2214 = "wave2:";

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lbc;")
    public static class282 field2213;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static final void method1001(int arg0) {
        field2218++;
        if (!class91.field1247) {
            return;
        }
        class287.field4471 = null;
        class91.field1247 = false;
        if (arg0 != -27477) {
            method1005((byte) -9);
        }
        class29.field352 = null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    public static final void method1002(int arg0) {
        class178.field2531.method67((byte) -117);
        if (arg0 <= 101) {
            method1003(-13);
        }
        field2219++;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
    public static void method1003(int arg0) {
        field2213 = null;
        int var1 = -123 / ((arg0 - 46) / 34);
        field2214 = null;
        field2217 = null;
        field2216 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
    public static final void method1004(int arg0, int arg1, int arg2) {
        int var3 = -40 % ((61 - arg2) / 44);
        field2222++;
        class263 var4 = class251.method1610(1, arg1);
        int var5 = var4.field3819;
        int var6 = var4.field3818;
        int var7 = var4.field3817;
        int var8 = class36.field418[var7 - var5];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var5;
        class220.method1431(class164.field2358[var6] & ~var9 | arg0 << var5 & var9, var6, 114);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)[Lpg;")
    public static final class187[] method1005(byte arg0) {
        class187[] var1 = new class187[class133.field1921];
        int var2 = 0;
        int var3 = -39 / ((40 - arg0) / 40);
        while (class133.field1921 > var2) {
            int var4 = class91.field1236[var2] * class296.field4677[var2];
            byte[] var5 = class277.field4210[var2];
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7] = class165.field2367[class5.method26(255, var5[var7])];
            }
            var1[var2] = new class187(class238.field3435, class118.field1660, class233.field3367[var2], class273.field4041[var2], class296.field4677[var2], class91.field1236[var2], var6);
            var2++;
        }
        class294.method1965(true);
        field2220++;
        return var1;
    }
}
