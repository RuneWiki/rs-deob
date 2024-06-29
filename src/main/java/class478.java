import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class478 implements class590 {

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "Lmv;")
    private class295 field6849;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "Lru;")
    public class231 field6847;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "[I")
    public static int[] field6838 = new int[25];

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "J")
    public static long field6844 = 0L;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    public static int field6850 = -1;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "Lsea;")
    public static class373 field6840 = null;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "[[I")
    public static int[][] field6839 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "Lf;")
    public class256 field6851;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "Ljava/applet/Applet;")
    public static Applet field6848;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIBIII)V")
    public static final void method2741(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 80) {
            method2742(-64);
        }
        field6843++;
        if (arg1 >= class175.field2455 && class375.field5631 >= arg4 && class323.field4704 <= arg5 && arg0 <= class148.field2106) {
            if (arg2 == 1) {
                class531.method3085(arg6, arg4, arg0, arg5, arg1, true);
            } else {
                class169.method1180((byte) 49, arg0, arg4, arg1, arg5, arg2, arg6);
            }
        } else if (arg2 == 1) {
            class373.method2301(arg4, arg6, -3, arg1, arg0, arg5);
        } else {
            class178.method1211(arg6, arg4, arg5, arg1, arg2, (byte) -125, arg0);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)V")
    public void method944(int arg0, boolean arg1) {
        if (arg1) {
            int var3 = this.field6847.field3055.method3193(-30796, class677.field9591, this.field6851.method50()) + this.field6847.field3053;
            int var4 = this.field6847.field3058.method1916((byte) -123, class619.field8966, this.field6851.method43()) + this.field6847.field3052;
            this.field6851.method1534(var3, var4);
        }
        field6852++;
        if (arg0 != -31764) {
            field6838 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)Z")
    public final boolean method941(byte arg0) {
        field6853++;
        if (arg0 > -15) {
            method2742(75);
        }
        return this.field6849.method1818(this.field6847.field3061, 4);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
    public static void method2742(int arg0) {
        field6839 = null;
        field6838 = null;
        if (arg0 == -4015) {
            field6840 = null;
            field6848 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V")
    public static final void method2743(byte arg0) {
        int var1 = -68 % ((arg0 + 8) / 50);
        field6841++;
        int var2 = class108.field1609.length;
        for (int var3 = 0; var3 < var2; var3++) {
            if (class108.field1609[var3] != null) {
                int var4 = -1;
                for (int var5 = 0; var5 < class448.field6499; var5++) {
                    if (class505.field7147[var3] == class259.field3361[var5]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class259.field3361[class448.field6499] = class505.field7147[var3];
                    var4 = class448.field6499++;
                }
                class540 var6 = new class540(class108.field1609[var3]);
                int var7 = 0;
                while (var6.field7956 < class108.field1609[var3].length && var7 < 511 && class155.field2213 < 1023) {
                    int var8 = var7++ << 6 | var4;
                    int var9 = var6.method3169(26488);
                    int var10 = var9 >> 14;
                    int var11 = (var9 & 0x1FA7) >> 7;
                    int var12 = var9 & 0x3F;
                    int var13 = (class505.field7147[var3] >> 8) * 64 + var11 - class397.field6005;
                    int var14 = (class505.field7147[var3] & 0xFF) * 64 + var12 - class403.field6049;
                    class76 var15 = class563.field8235.method1089(var6.method3169(26488), false);
                    class177 var16 = (class177) class271.field3550.method2002((byte) -112, (long) var8);
                    if (var16 == null && (var15.field1206 & 0x1) > 0 && class432.field6276 == var10 && var13 >= 0 && class72.field1144 > var15.field1239 + var13 && var14 >= 0 && var14 + var15.field1239 < class668.field9444) {
                        class53 var17 = new class53();
                        var17.field7405 = var8;
                        class177 var18 = new class177(var17);
                        class271.field3550.method2001(-85, var18, (long) var8);
                        class13.field299[class378.field5678++] = var18;
                        class523.field7379[class155.field2213++] = var8;
                        var17.field7354 = class45.field685;
                        var17.method316(var15, (byte) 40);
                        var17.method2953((byte) 34, var17.field805.field1239);
                        var17.field7390 = var17.field805.field1184 << 3;
                        var17.method2956((var17.field805.field1241 + 4 & 0xB3E00007) << 11, true, -84);
                        var17.method314(var10, var17.method422((byte) -43), var14, 60, true, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public final void method940(int arg0) {
        field6846++;
        if (arg0 == -32557) {
            this.field6851 = class201.method1305(this.field6849, true, this.field6847.field3061);
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lmv;Lru;)V")
    public class478(class295 arg0, class231 arg1) {
        this.field6849 = arg0;
        this.field6847 = arg1;
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
    public static final void method2744(int arg0) {
        field6842++;
        class342.field5059 = new class426(class279.field3629.method1654(119, class262.field3401), "", class222.field2943, 1001, arg0, 0L, 0, 0, true, false);
    }
}
