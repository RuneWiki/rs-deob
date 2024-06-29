import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class119 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lec;")
    public static class32 field2840 = class73.method594("Bitte geben Sie Ihr Passwort ein)3", true);

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Lec;")
    private static class32 field2846 = class73.method594("wishes to duel with you)3", true);

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field2841 = 0;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Lec;")
    public static class32 field2849 = class73.method594("und haben es deaktiviert)3 Klicken Sie auf der", true);

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Lec;")
    public static class32 field2847 = class73.method594("Wir vermuten)1 dass Ihr Konto gestohlen wurde", true);

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "[I")
    public static int[] field2852 = new int[1000];

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field2851 = 0;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Lec;")
    public static class32 field2845 = class73.method594("nav", true);

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lec;")
    public static class32 field2854 = field2846;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field2850 = 0;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Lea;")
    public static class30 field2842;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Ljd;")
    public static class66 field2848;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "[I")
    public static int[] field2843;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLlf;)V")
    public static final void method938(byte arg0, class82 arg1) {
        field2844++;
        if (arg0 != 33) {
            field2843 = null;
        }
        if (class79.field1827 != 1) {
            return;
        }
        short var2 = 280;
        if (var2 <= class9.field166 && var2 + 14 >= class9.field166 && class66.field1590 >= 4 && class66.field1590 <= 18) {
            class88.method674(0, (byte) 77, 0);
            return;
        }
        if (var2 + 15 <= class9.field166 && class9.field166 <= var2 + 80 && class66.field1590 >= 4 && class66.field1590 <= 18) {
            class88.method674(1, (byte) 84, 0);
            return;
        }
        short var3 = 390;
        if (class9.field166 >= var3 && var3 + 14 >= class9.field166 && class66.field1590 >= 4 && class66.field1590 <= 18) {
            class88.method674(0, (byte) 104, 1);
            return;
        }
        if (class9.field166 >= var3 + 15 && var3 + 80 >= class9.field166 && class66.field1590 >= 4 && class66.field1590 <= 18) {
            class88.method674(1, (byte) 70, 1);
            return;
        }
        short var4 = 500;
        if (var4 <= class9.field166 && var4 + 14 >= class9.field166 && class66.field1590 >= 4 && class66.field1590 <= 18) {
            class88.method674(0, (byte) 114, 2);
            return;
        }
        if (class9.field166 >= var4 + 15 && class9.field166 <= var4 + 80 && class66.field1590 >= 4 && class66.field1590 <= 18) {
            class88.method674(1, (byte) 97, 2);
            return;
        }
        short var5 = 610;
        if (var5 <= class9.field166 && var5 + 14 >= class9.field166 && class66.field1590 >= 4 && class66.field1590 <= 18) {
            class88.method674(0, (byte) 36, 3);
            return;
        }
        if (class9.field166 >= var5 + 15 && class9.field166 <= var5 + 80 && class66.field1590 >= 4 && class66.field1590 <= 18) {
            class88.method674(1, (byte) 81, 3);
            return;
        }
        if (class9.field166 >= 708 && class66.field1590 >= 4 && class9.field166 <= 758 && class66.field1590 <= 20) {
            class117.field2794 = false;
            class100.field2322.method388(0, 0);
            class45.field1053.method388(382, 0);
            class98.field2264.method400(382 - class98.field2264.field1168 / 2, 18);
            return;
        }
        if (class137.field3193 == -1) {
            return;
        }
        class102 var6 = class97.field2237[class137.field3193];
        if (class146.field3317 == var6.field2395) {
            byte[] var7 = class52.method403(new class32[] { var6.field2385, class64.field1493 }, (byte) -20).method255(122);
            class151.field3467 = new String(var7, 0, var7.length);
            if (class70.field1647 != 0) {
                class39.field941 = 43594;
                class26.field473 = 43594;
                class70.field1647 = 0;
                class13.field223 = 443;
            }
            class86.field2015 = var6.field2398;
            class117.field2794 = false;
            class100.field2322.method388(0, 0);
            class45.field1053.method388(382, 0);
            class98.field2264.method400(382 - class98.field2264.field1168 / 2, 18);
            return;
        }
        class32 var8 = class52.method403(new class32[] { class154.field3530, var6.field2385, class64.field1493, class77.field1785, class151.field3458, class159.method1230(class154.field3531 ? 1 : 0, 0), class63.field1446, class159.method1230(class107.field2534, arg0 ^ 0x21), class15.field251, class159.method1230(class130.field3006, 0) }, (byte) -20);
        try {
            arg1.getAppletContext().showDocument(var8.method278(-84), "_self");
            return;
        } catch (Exception var9) {
            return;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method939(int arg0) {
        field2849 = null;
        if (arg0 != 14) {
            return;
        }
        field2842 = null;
        field2846 = null;
        field2852 = null;
        field2843 = null;
        field2847 = null;
        field2854 = null;
        field2845 = null;
        field2840 = null;
        field2848 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)Lse;")
    public static final class130 method940(int arg0, byte arg1) {
        class130 var2 = (class130) class113.field2636.method486(-28825, (long) arg0);
        field2855++;
        if (arg1 > -74) {
            field2845 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class48.field1134.method206(8, arg0, -70);
        class130 var4 = new class130();
        if (var3 != null) {
            var4.method1001(new class66(var3), -23866);
        }
        class113.field2636.method485((long) arg0, (byte) -121, var4);
        return var4;
    }
}
