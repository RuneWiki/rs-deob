import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class class163 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lcd;")
    private static class23 field3264 = class54.method414("Unexpected loginserver response)3", -1);

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lcd;")
    public static class23 field3268 = field3264;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "[I")
    public static int[] field3272 = new int[1000];

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lcd;")
    public static class23 field3273 = class54.method414("m-Ochte sich mit Ihnen duellieren)3", -1);

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lm;")
    public static class107 field3265;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Loe;")
    public static class130 field3267;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "[I")
    public static int[] field3263;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "[[[B")
    public static byte[][][] field3270;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static final void method1002(boolean arg0) {
        field3271++;
        class10.field210 = new class25();
        if (arg0) {
            method1004((byte) 30);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public abstract void method536(byte arg0);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)I")
    public abstract int method535(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BILug;Lgd;)V")
    public static final void method1003(byte arg0, int arg1, class186 arg2, class58 arg3) {
        field3269++;
        byte[] var4 = null;
        class25 var5 = class36.field740;
        synchronized (class36.field740) {
            int var6 = -62 % ((arg0 + 3) / 34);
            for (class20 var7 = (class20) class36.field740.method188((byte) 54); var7 != null; var7 = (class20) class36.field740.method185((byte) -102)) {
                if ((long) arg1 == var7.field3317 && var7.field411 == arg2 && var7.field427 == 0) {
                    var4 = var7.field413;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = arg2.method1146(21947, arg1);
            arg3.method448(false, true, arg1, arg2, var8);
        } else {
            arg3.method448(false, true, arg1, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
    public static void method1004(byte arg0) {
        field3263 = null;
        field3272 = null;
        field3264 = null;
        field3270 = null;
        if (arg0 <= 26) {
            method1002(false);
        }
        field3267 = null;
        field3273 = null;
        field3265 = null;
        field3268 = null;
    }
}
