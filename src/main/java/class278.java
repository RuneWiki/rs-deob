import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class278 {

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Loa;")
    public static class99 field4886 = class221.method1463(2844, "jaune:");

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Loa;")
    public static class99 field4883 = class221.method1463(2844, "<col=ff3000>");

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Loa;")
    public static class99 field4887 = class221.method1463(2844, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Z")
    public static boolean field4881 = false;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Loa;")
    public static class99 field4880 = class221.method1463(2844, ":duelfriend:");

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public int field4878;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public int field4882;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public int field4884;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "J")
    public long field4889;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Lab;")
    public static class146 field4888;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Luk;")
    public class98 field4891;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field4879;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static final void method1833(int arg0) {
        class239.field4129 &= 0x7FF;
        if (class160.field2843 < 128) {
            class160.field2843 = 128;
        }
        if (class160.field2843 > 383) {
            class160.field2843 = 383;
        }
        int var1 = class53.field875 >> 7;
        field4885++;
        int var2 = class221.field3843 >> 7;
        int var3 = 0;
        int var4 = class115.method777(-1, class221.field3843, class255.field4407, class53.field875);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class255.field4407;
                    if (var7 < 3 && (class230.field3973[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class223.field3871[var7][var5][var6] & 0xFF) * 8 + var4 - class189.field3337[var7][var5][var6];
                    if (var3 < var8) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = 109 % ((14 - arg0) / 37);
        int var10 = var3 * 192;
        if (var10 > 98048) {
            var10 = 98048;
        }
        if (var10 < 32768) {
            var10 = 32768;
        }
        if (var10 > class194.field3407) {
            class194.field3407 += (var10 - class194.field3407) / 24;
        } else if (var10 < class194.field3407) {
            class194.field3407 += (var10 - class194.field3407) / 80;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V")
    public static final void method1834(int arg0, int arg1, int arg2) {
        field4876++;
        if (class234.field4046 != arg2) {
            class281.field4923 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class281.field4923[var3] = (var3 << 12) / arg2;
            }
            class190.field3345 = arg2 - 1;
            class92.field1556 = arg2 == 64 ? 2048 : 4096;
            class234.field4046 = arg2;
        }
        if (class179.field3122 != arg1) {
            if (class234.field4046 == arg1) {
                class54.field879 = class281.field4923;
            } else {
                class54.field879 = new int[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    class54.field879[var4] = (var4 << 12) / arg1;
                }
            }
            class250.field4309 = arg1 - 1;
            class179.field3122 = arg1;
        }
        if (arg0 != 1380607564) {
            field4888 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method1835(byte arg0) {
        field4887 = null;
        field4888 = null;
        field4880 = null;
        field4886 = null;
        if (arg0 < 124) {
            method1837(-125, (class182) null, -91, (byte) -70);
        }
        field4883 = null;
        field4879 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BIII)V")
    public static final void method1836(byte arg0, int arg1, int arg2, int arg3) {
        field4890++;
        if (arg0 == 95) {
            class99 var4 = class198.method1332(126, new class99[] { class289.field5064, class198.method1333(arg0 - 222, arg2), class272.field4815, class198.method1333(-94, arg1 >> 6), class272.field4815, class198.method1333(-100, arg3 >> 6), class272.field4815, class198.method1333(-122, arg1 & 0x3F), class272.field4815, class198.method1333(-89, arg3 & 0x3F) });
            var4.method667((byte) -35);
            class268.method1775(true, var4);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILtg;IB)Lpi;")
    public static final class139 method1837(int arg0, class182 arg1, int arg2, byte arg3) {
        field4877++;
        if (class153.method1016(arg0, 21451, arg1, arg2)) {
            return arg3 == -9 ? class254.method1642(-69) : null;
        } else {
            return null;
        }
    }
}
