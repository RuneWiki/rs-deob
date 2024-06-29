import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class122 {

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public int field2531 = -1;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "[I")
    public static int[] field2527 = new int[50];

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Lcd;")
    private static class23 field2525 = class54.method414("Members object", -1);

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lcd;")
    public static class23 field2522 = field2525;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Lcd;")
    public static class23 field2532 = class54.method414("null", -1);

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Lue;")
    public class184 field2529;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "[I")
    public int[] field2528;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "[Lcd;")
    public class23[] field2521;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
    public static final void method757(boolean arg0) {
        field2524++;
        if (class109.field2310 != null) {
            class109.field2310.method501(!arg0);
            class109.field2310 = null;
        }
        class23.method145(arg0);
        class205.field4041.method820();
        for (int var1 = 0; var1 < 4; var1++) {
            class62.field1435[var1].method425((byte) 101);
        }
        System.gc();
        class121.method754(2, (byte) 125);
        class28.field600 = -1;
        class25.field531 = false;
        class63.method464(0);
        class48.method379(10, (byte) 18);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method758(byte arg0) {
        field2522 = null;
        field2532 = null;
        field2525 = null;
        if (arg0 == 42) {
            field2527 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Lrh;")
    public static final class160 method759(int arg0, int arg1) {
        field2523++;
        class160 var2 = (class160) class50.field1192.method995(-55, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class39.field815.method651(4, arg1, 16);
        if (arg0 > -43) {
            field2527 = null;
        }
        class160 var4 = new class160();
        if (var3 != null) {
            var4.method983(new class189(var3), 0);
        }
        class50.field1192.method990(var4, (long) arg1, 21);
        return var4;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
    public static final void method760(int arg0, int arg1, int arg2) {
        field2526++;
        class151 var3 = class16.method85((byte) 100, arg1);
        int var4 = var3.field3023;
        int var5 = var3.field3010;
        int var6 = var3.field3018;
        int var7 = 126 / ((arg0 - 33) / 54);
        int var8 = class85.field1801[var5 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        class54.field1288[var4] = class119.method745(class27.method198(arg2 << var6, var9), class27.method198(~var9, class54.field1288[var4]));
    }
}
