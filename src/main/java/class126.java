import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class126 implements Runnable {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Z")
    public boolean field2839 = true;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Ljava/lang/Object;")
    public Object field2851 = new Object();

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "[I")
    public int[] field2859 = new int[500];

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public int field2860 = 0;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "[I")
    public int[] field2862 = new int[500];

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field2846 = 0;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lja;")
    public static class62 field2847 = class30.method243(43, " )2> ");

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Lja;")
    private static class62 field2850 = class30.method243(43, "wishes to trade with you)3");

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Lja;")
    public static class62 field2854 = field2850;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Lja;")
    public static class62 field2845 = class30.method243(43, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Lja;")
    private static class62 field2858 = class30.method243(43, "wishes to duel with you)3");

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Lja;")
    private static class62 field2856 = class30.method243(43, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lja;")
    public static class62 field2841 = field2858;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Z")
    public static boolean field2843 = false;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lja;")
    public static class62 field2849 = field2856;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "B")
    public static byte field2853;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Lpd;")
    public static class108 field2855;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lrf;")
    public static class124 field2840;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "[Lub;")
    public static class139[] field2861;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)Lle;")
    public static final class81 method985(int arg0, int arg1, int arg2, int arg3) {
        field2857++;
        class81 var4 = new class81();
        var4.field1963 = arg0;
        var4.field1955 = arg3;
        class16.field372.method538(var4, (byte) -27, (long) arg2);
        class47.method336(24880, arg0);
        class110.method889(false, arg0);
        class54 var5 = class62.method456(arg2, (byte) 63);
        if (var5 != null) {
            client.method163(var5, -80);
        }
        if (class119.field2724 != null) {
            client.method163(class119.field2724, -118);
            class119.field2724 = null;
        }
        class128.field2889 = 0;
        class119.field2709 = false;
        class4.method19(-23707, class84.field2021, class57.field1410, class79.field1914, class148.field3484);
        if (arg1 != 12252) {
            method987(-44);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sb", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2839) {
            Object var1 = this.field2851;
            synchronized (this.field2851) {
                if (this.field2860 < 500) {
                    this.field2862[this.field2860] = class103.field2398;
                    this.field2859[this.field2860] = class84.field2032;
                    this.field2860++;
                }
            }
            class146.method1168(-19127, 50L);
        }
        field2842++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Z")
    public static final boolean method986(int arg0, int arg1) {
        if (arg1 != -2682) {
            field2850 = null;
        }
        field2852++;
        return (arg0 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method987(int arg0) {
        field2841 = null;
        field2856 = null;
        int var1 = 104 / ((arg0 - 37) / 56);
        field2845 = null;
        field2854 = null;
        field2861 = null;
        field2850 = null;
        field2849 = null;
        field2847 = null;
        field2840 = null;
        field2855 = null;
        field2858 = null;
    }
}
