import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class164 {

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "[I")
    private int[] field2665;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field2662 = 0;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2663 = null;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Lol;")
    public static class246 field2664 = new class246(32);

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field2670 = new String[200];

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2671 = "Loaded interfaces";

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field2672 = 0;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1133(int arg0) {
        field2667++;
        if (arg0 != 15) {
            return;
        }
        while (class336.field5213.method1533((byte) -63, class138.field2063) >= 27) {
            int var1 = class336.field5213.method1535((byte) 70, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class297.field4657[var1] == null) {
                class297.field4657[var1] = new class196();
                var2 = true;
            }
            class196 var3 = class297.field4657[var1];
            class128.field1906[class176.field2875++] = var1;
            var3.field2008 = class48.field648;
            if (var3.field3210 != null && var3.field3210.method822(1115)) {
                class286.method2014(var3, arg0 - 130);
            }
            var3.method1439((byte) 21, class281.method1993(class336.field5213.method1535((byte) 19, 14), arg0 - 18));
            int var4 = class336.field5213.method1535((byte) 49, 5);
            int var5 = class336.field5213.method1535((byte) 56, 5);
            int var6 = class336.field5213.method1535((byte) 93, 1);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var6 == 1) {
                class318.field4946[class126.field1877++] = var1;
            }
            if (var4 > 15) {
                var4 -= 32;
            }
            int var7 = class168.field2700[class336.field5213.method1535((byte) 102, 3)];
            if (var2) {
                var3.field1973 = var3.field2037 = var7;
            }
            int var8 = class336.field5213.method1535((byte) 76, 1);
            var3.method906(var3.field3210.field1808, arg0 ^ 0xFFFFFFE8);
            var3.field1956 = var3.field3210.field1806;
            var3.field1989 = var3.field3210.field1803;
            if (var3.field1956 == 0) {
                var3.field2037 = 0;
            }
            var3.method902(var8 == 1, var3.method910(-1), false, class13.field159.field2006[0] + var4, class13.field159.field1969[0] - -var5);
            if (var3.field3210.method822(arg0 + 1100)) {
                class7.method51(var3.field1969[0], -22958, (class320) null, class148.field2209, (class149) null, var3.field2006[0], 0, var3);
            }
        }
        class336.field5213.method1531((byte) -100);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V", line = 84)
    public static final void method1134(int arg0, int arg1) {
        field2668++;
        class312.field4849.method1625(arg1, (byte) 117);
        class302.field4719.method1625(arg1, (byte) 9);
        if (arg0 <= 92) {
            field2672 = 3;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)I", line = 97)
    public final int method1135(int arg0, int arg1) {
        field2669++;
        if (arg0 != 1) {
            this.field2665 = (int[]) null;
        }
        int var3 = (this.field2665.length >> 1) - 1;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field2665[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2665[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 127)
    public static void method1136(int arg0) {
        field2671 = null;
        field2670 = null;
        if (arg0 != -1) {
            field2671 = (String) null;
        }
        field2663 = null;
        field2664 = null;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([I)V", line = 138)
    public class164(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2665 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field2665[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2665[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2665[var5 + var5] = arg0[var4];
            this.field2665[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 181)
    public static final int method1137(String arg0, int arg1) {
        field2666++;
        if (class193.field3167 == null || arg0.length() == 0) {
            return -1;
        }
        if (arg1 != -18379) {
            field2662 = -92;
        }
        for (int var2 = 0; var2 < class193.field3167.field4901; var2++) {
            if (class270.method1927("<br>", (byte) -106, " ", class193.field3167.field4911[var2]).equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }
}
