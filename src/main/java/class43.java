import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public abstract class class43 {

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Ljava/lang/String;")
    public static String field610 = "Unable to find ";

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field619 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Z")
    public static boolean field616 = false;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field620 = 0;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "F")
    public static float field613 = 0.0F;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field621 = -1;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "[I")
    public static int[] field609;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()Z")
    public boolean method315() {
        field618++;
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLjava/lang/String;Z)V")
    public static final void method316(byte arg0, String arg1, boolean arg2) {
        String var3 = arg1.toLowerCase();
        field615++;
        int var4 = 0;
        if (arg0 != -81) {
            method321((byte) 83);
        }
        short[] var5 = new short[16];
        int var6 = arg2 ? 32768 : 0;
        int var7 = (arg2 ? class283.field4478 : class275.field4387) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class171 var11 = class71.method512(-126, var8);
            if (var11.field2661 && var11.method1158(60).toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 50) {
                    class39.field557 = -1;
                    class292.field4594 = null;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var12 = new short[var5.length * 2];
                    for (int var13 = 0; var13 < var4; var13++) {
                        var12[var13] = var5[var13];
                    }
                    var5 = var12;
                }
                var5[var4++] = (short) var8;
            }
        }
        class148.field2339 = 0;
        class39.field557 = var4;
        String[] var9 = new String[class39.field557];
        class292.field4594 = var5;
        for (int var10 = 0; var10 < class39.field557; var10++) {
            var9[var10] = class71.method512(-121, var5[var10]).method1158(60);
        }
        class143.method961(class292.field4594, (byte) -125, var9);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)V")
    public abstract void method82(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field617++;
        class111 var10 = null;
        if (arg4 != -1) {
            method321((byte) -61);
        }
        for (class111 var11 = (class111) class187.field2892.method1221(124); var11 != null; var11 = (class111) class187.field2892.method1227(-10626)) {
            if (var11.field1814 == arg0 && var11.field1824 == arg1 && var11.field1816 == arg7 && var11.field1821 == arg9) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class111();
            var10.field1824 = arg1;
            var10.field1821 = arg9;
            var10.field1816 = arg7;
            var10.field1814 = arg0;
            class274.method1846(var10, arg4 ^ 0xFFFFFF80);
            class187.field2892.method1219(false, var10);
        }
        var10.field1820 = arg5;
        var10.field1825 = arg2;
        var10.field1823 = arg6;
        var10.field1815 = arg8;
        var10.field1827 = arg3;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIIJILri;)V")
    public abstract void method100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class67 arg10);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public static final void method318(byte arg0) {
        field608++;
        if (arg0 != -91) {
            field609 = null;
        }
        class50.field736.method1888(-51);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lji;IIIZ)V")
    public void method319(class43 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field614++;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "()I")
    public abstract int method102();

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)Lji;")
    public class43 method320(int arg0, int arg1, int arg2) {
        field612++;
        return this;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
    public static void method321(byte arg0) {
        if (arg0 <= 6) {
            field620 = 102;
        }
        field619 = null;
        field610 = null;
        field609 = null;
    }
}
