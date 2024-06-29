import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class161 {

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "Z")
    public static volatile boolean field2592;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "[B")
    public static byte[] field2590;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "Lwt;")
    public static class205 field2593;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "[Lfm;")
    public static class519[] field2589;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B[[[Lak;)V")
    public static final void method1148(byte arg0, class234[][][] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class234[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class234 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field3619 instanceof class425) {
                            ((class425) var6.field3619).method229(-4715);
                        }
                        if (var6.field3605 instanceof class425) {
                            ((class425) var6.field3605).method229(-4715);
                        }
                        if (var6.field3602 instanceof class425) {
                            ((class425) var6.field3602).method229(-4715);
                        }
                        if (var6.field3610 instanceof class425) {
                            ((class425) var6.field3610).method229(-4715);
                        }
                        if (var6.field3613 instanceof class425) {
                            ((class425) var6.field3613).method229(-4715);
                        }
                        for (class440 var7 = var6.field3607; var7 != null; var7 = var7.field6528) {
                            class402 var8 = var7.field6530;
                            if (var8 instanceof class425) {
                                ((class425) var8).method229(-4715);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 >= 114) {
            field2588++;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)I")
    public static final int method1149(int arg0, int arg1) {
        field2591++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = 52 % ((-arg1 - 67) / 39);
        int var5 = (arg0 * var3 >> 12) + 40960;
        return var2 * var5 >> 12;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
    public static void method1150(byte arg0) {
        if (arg0 < 58) {
            method1150((byte) 65);
        }
        field2589 = null;
        field2593 = null;
        field2590 = null;
    }

    static {
        new class208("", 73);
        field2592 = true;
        field2590 = new byte[32896];
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2590[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + (var2 * var2 + 65535)) / 65535.0F))));
            }
        }
    }
}
