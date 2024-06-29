import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class216 {

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Lke;")
    public static class256 field3845 = class316.method2202("m-Ochte mit Ihnen handeln)3", 27626);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lke;")
    public static class256 field3841 = null;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field3844 = 0;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Lke;")
    private static class256 field3850 = class316.method2202("Loading interfaces )2 ", 27626);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lke;")
    public static class256 field3840 = field3850;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field3846 = 0;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field3853 = -2;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "[B")
    public static byte[] field3849 = new byte[32896];

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "Lke;")
    public static class256 field3856;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "Lng;")
    public static class138 field3851;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "[[B")
    public static byte[][] field3848;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 22)
    public static final void method1509(byte arg0) {
        field3847++;
        class23.field302.method1597(0);
        int var1 = class23.field302.method1595(8, false);
        if (class311.field5357 > var1) {
            for (int var2 = var1; var2 < class311.field5357; var2++) {
                class164.field2906[class183.field3236++] = class141.field2480[var2];
            }
        }
        if (var1 > class311.field5357) {
            throw new RuntimeException("gnpov1");
        }
        class311.field5357 = 0;
        int var3 = -69 % ((22 - arg0) / 59);
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class141.field2480[var4];
            class279 var6 = class187.field3281[var5];
            int var7 = class23.field302.method1595(1, false);
            if (var7 == 0) {
                class141.field2480[class311.field5357++] = var5;
                var6.field1199 = class45.field840;
            } else {
                int var8 = class23.field302.method1595(2, false);
                if (var8 == 0) {
                    class141.field2480[class311.field5357++] = var5;
                    var6.field1199 = class45.field840;
                    class112.field1958[class132.field2303++] = var5;
                } else if (var8 == 1) {
                    class141.field2480[class311.field5357++] = var5;
                    var6.field1199 = class45.field840;
                    int var12 = class23.field302.method1595(3, false);
                    var6.method511(85, var12, false);
                    int var13 = class23.field302.method1595(1, false);
                    if (var13 == 1) {
                        class112.field1958[class132.field2303++] = var5;
                    }
                } else if (var8 == 2) {
                    class141.field2480[class311.field5357++] = var5;
                    var6.field1199 = class45.field840;
                    int var9 = class23.field302.method1595(3, false);
                    var6.method511(93, var9, true);
                    int var10 = class23.field302.method1595(3, false);
                    var6.method511(118, var10, true);
                    int var11 = class23.field302.method1595(1, false);
                    if (var11 == 1) {
                        class112.field1958[class132.field2303++] = var5;
                    }
                } else if (var8 == 3) {
                    class164.field2906[class183.field3236++] = var5;
                }
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3849[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field3856 = class316.method2202("weiss:", 27626);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 131)
    public static final void method1510(int arg0) {
        field3854++;
        Container var1;
        if (class317.field5460 != null) {
            var1 = class317.field5460;
        } else if (class198.field3627 == null) {
            var1 = class272.field4658.field52;
        } else {
            var1 = class198.field3627;
        }
        class308.field5326 = var1.getSize().width;
        class186.field3269 = var1.getSize().height;
        if (arg0 != -765) {
            field3841 = (class256) null;
        }
        if (class198.field3627 == var1) {
            Insets var2 = class198.field3627.getInsets();
            class308.field5326 -= var2.right + var2.left;
            class186.field3269 -= var2.top + var2.bottom;
        }
        if (class35.method247(0) >= 2) {
            class112.field1969 = class308.field5326;
            class264.field4532 = 0;
            class100.field1775 = 0;
            class124.field2200 = class186.field3269;
        } else {
            class264.field4532 = 0;
            class124.field2200 = 503;
            class100.field1775 = (class308.field5326 - 765) / 2;
            class112.field1969 = 765;
        }
        if (class253.field4323) {
            class253.method1713(class112.field1969, class124.field2200);
        }
        class186.field3271.setSize(class112.field1969, class124.field2200);
        if (class198.field3627 == var1) {
            Insets var3 = class198.field3627.getInsets();
            class186.field3271.setLocation(class100.field1775 + var3.left, class264.field4532 + var3.top);
        } else {
            class186.field3271.setLocation(class100.field1775, class264.field4532);
        }
        if (class211.field3803 != -1) {
            class159.method1177(true, -1);
        }
        class124.method862((byte) 96);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIILmc;Lmc;IIJ)V", line = 195)
    public static final void method1511(int arg0, int arg1, int arg2, int arg3, class51 arg4, class51 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class197 var10 = new class197();
        var10.field3601 = arg8;
        var10.field3609 = arg1 * 128 + 64;
        var10.field3604 = arg2 * 128 + 64;
        var10.field3602 = arg3;
        var10.field3597 = arg4;
        var10.field3596 = arg5;
        var10.field3600 = arg6;
        var10.field3607 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class41.field790[var11][arg1][arg2] == null) {
                class41.field790[var11][arg1][arg2] = new class271(var11, arg1, arg2);
            }
        }
        class41.field790[arg0][arg1][arg2].field4639 = var10;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Z", line = 228)
    public static final boolean method1512(int arg0) {
        if (arg0 != 128) {
            field3846 = 29;
        }
        field3855++;
        return class253.field4323 ? true : class257.field4455;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V", line = 243)
    public static void method1513(byte arg0) {
        field3851 = null;
        field3841 = null;
        field3850 = null;
        field3840 = null;
        field3848 = (byte[][]) null;
        field3845 = null;
        field3849 = null;
        field3856 = null;
        if (arg0 != -48) {
            field3846 = 108;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V", line = 263)
    public static final void method1514(byte arg0) {
        if (arg0 < 79) {
            method1513((byte) 56);
        }
        field3843++;
        int var1 = class23.field302.method1595(8, false);
        if (var1 < class67.field1206) {
            for (int var2 = var1; var2 < class67.field1206; var2++) {
                class164.field2906[class183.field3236++] = class140.field2463[var2];
            }
        }
        if (class67.field1206 < var1) {
            throw new RuntimeException("gppov1");
        }
        class67.field1206 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class140.field2463[var3];
            class144 var5 = class300.field5172[var4];
            int var6 = class23.field302.method1595(1, false);
            if (var6 == 0) {
                class140.field2463[class67.field1206++] = var4;
                var5.field1199 = class45.field840;
            } else {
                int var7 = class23.field302.method1595(2, false);
                if (var7 == 0) {
                    class140.field2463[class67.field1206++] = var4;
                    var5.field1199 = class45.field840;
                    class112.field1958[class132.field2303++] = var4;
                } else if (var7 == 1) {
                    class140.field2463[class67.field1206++] = var4;
                    var5.field1199 = class45.field840;
                    int var11 = class23.field302.method1595(3, false);
                    var5.method511(37, var11, false);
                    int var12 = class23.field302.method1595(1, false);
                    if (var12 == 1) {
                        class112.field1958[class132.field2303++] = var4;
                    }
                } else if (var7 == 2) {
                    class140.field2463[class67.field1206++] = var4;
                    var5.field1199 = class45.field840;
                    int var8 = class23.field302.method1595(3, false);
                    var5.method511(49, var8, true);
                    int var9 = class23.field302.method1595(3, false);
                    var5.method511(90, var9, true);
                    int var10 = class23.field302.method1595(1, false);
                    if (var10 == 1) {
                        class112.field1958[class132.field2303++] = var4;
                    }
                } else if (var7 == 3) {
                    class164.field2906[class183.field3236++] = var4;
                }
            }
        }
    }
}
