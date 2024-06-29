import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class466 {

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "S")
    public short field6851;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "B")
    public byte field6848;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "S")
    public short field6849;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "Z")
    public boolean field6847;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "B")
    public byte field6846;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "S")
    public short field6841;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public int field6842;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "Lcv;")
    public static class398 field6844 = new class398(8);

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "Lao;")
    public static class188 field6855 = new class188(19, 8);

    @OriginalMember(owner = "client!dv", name = "p", descriptor = "Z")
    public static boolean field6856 = false;

    @OriginalMember(owner = "client!dv", name = "q", descriptor = "Lgf;")
    public static class180 field6857 = new class180("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!dv", name = "s", descriptor = "[[I")
    public static int[][] field6859 = new int[128][128];

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!dv", name = "r", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "[[B")
    public static byte[][] field6852;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lnk;I)Z", line = 3)
    public static final boolean method2776(class500 arg0, int arg1) {
        field6845++;
        if (arg1 > -51) {
            method2781((byte) 31);
        }
        return class246.field3571 == arg0 || class398.field5840 == arg0 || class472.field6945 == arg0 || class152.field2334 == arg0;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "([BI)Lss;", line = 20)
    public static final class295 method2777(byte[] arg0, int arg1) {
        field6850++;
        class295 var2 = new class295();
        class303 var3 = new class303(arg0);
        var3.field4333 = var3.field4326.length - 2;
        if (arg1 != -22) {
            field6859 = null;
        }
        int var4 = var3.method1868(0);
        int var5 = var3.field4326.length - var4 - 2 - 12;
        var3.field4333 = var5;
        int var6 = var3.method1870(-1945262512);
        var2.field4217 = var3.method1868(0);
        var2.field4219 = var3.method1868(0);
        var2.field4218 = var3.method1868(0);
        var2.field4208 = var3.method1868(0);
        int var7 = var3.method1918((byte) 113);
        if (var7 > 0) {
            var2.field4212 = new class398[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1868(0);
                class398 var10 = new class398(class159.method1146(false, var9));
                var2.field4212[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1870(arg1 - 1945262490);
                    int var12 = var3.method1870(arg1 - 1945262490);
                    var10.method2486(-122, new class242(var12), (long) var11);
                }
            }
        }
        var3.field4333 = 0;
        var2.field4216 = var3.method1920((byte) 121);
        var2.field4209 = new int[var6];
        var2.field4206 = new int[var6];
        var2.field4213 = new String[var6];
        int var13 = 0;
        while (var5 > var3.field4333) {
            int var14 = var3.method1868(0);
            if (var14 == 3) {
                var2.field4213[var13] = var3.method1879(30669).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field4209[var13] = var3.method1918((byte) -46);
            } else {
                var2.field4209[var13] = var3.method1870(-1945262512);
            }
            var2.field4206[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V", line = 104)
    public static final void method2778(byte arg0) {
        class86.field1436.field4333 = 0;
        field6843++;
        class18.field281 = null;
        class461.field6805 = 0;
        class200.field2918 = 0;
        class447.field6547 = null;
        class297.field4247 = null;
        class387.field5738.field4333 = 0;
        class133.field2060 = 0;
        class438.field6388 = null;
        class72.method608(0);
        class322.method2093(0);
        for (int var1 = 0; var1 < 2048; var1++) {
            class390.field5783[var1] = null;
        }
        class95.field1558 = null;
        if (arg0 <= 119) {
            method2777(null, 56);
        }
        for (int var2 = 0; var2 < class132.field2030.length; var2++) {
            class13 var4 = class132.field2030[var2];
            if (var4 != null) {
                var4.field355 = -1;
            }
        }
        class114.method845(true);
        class403.field5944 = 1;
        class138.method1022(30, 1);
        for (int var3 = 0; var3 < 100; var3++) {
            class165.field2473[var3] = true;
        }
        class450.method2712(-121);
        class469.field6901 = 0L;
        class177.field2685 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIII)Ldv;", line = 159)
    public final class466 method2779(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6854++;
        return arg1 == 4224 ? new class466(arg3, arg4, arg2, arg0, this.field6841, this.field6851, this.field6849, this.field6846, this.field6848, this.field6847) : null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)I", line = 176)
    public static final int method2780(int arg0, int arg1) {
        field6853++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        if (arg0 < 17) {
            field6858 = 118;
        }
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(B)V", line = 197)
    public static void method2781(byte arg0) {
        field6844 = null;
        field6855 = null;
        field6857 = null;
        if (arg0 <= 58) {
            method2778((byte) -29);
        }
        field6852 = null;
        field6859 = null;
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 210)
    public class466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field6851 = (short) arg5;
        this.field6848 = (byte) arg8;
        this.field6849 = (short) arg6;
        this.field6847 = arg9;
        this.field6846 = (byte) arg7;
        this.field6841 = (short) arg4;
        this.field6842 = arg0;
    }
}
