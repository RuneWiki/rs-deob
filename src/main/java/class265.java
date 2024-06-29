import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class265 {

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "[[I")
    public static int[][] field3816 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "Z")
    public static boolean field3817 = true;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field3820;

    static {
        new class40("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(JB)V", line = 10)
    public static final void method1606(long arg0, byte arg1) {
        if (arg1 != 107) {
            method1606(-33L, (byte) -120);
        }
        field3819++;
        int var3 = class19.field258.field1008 + class442.field6320;
        int var4 = class397.field5648 + class19.field258.field1005;
        if (class191.field2617 - var3 < -500 || class191.field2617 - var3 > 500 || class186.field2445 - var4 < -500 || class186.field2445 - var4 > 500) {
            class186.field2445 = var4;
            class191.field2617 = var3;
        }
        if (class191.field2617 != var3) {
            int var5 = var3 - class191.field2617;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class191.field2617 += var6;
        }
        if (!class92.field1146) {
            class31.field389 += (float) arg0 * class195.field2667 / 6.0F;
            class349.field5021 += (float) arg0 * class184.field2404 / 6.0F;
        }
        if (class186.field2445 != var4) {
            int var7 = var4 - class186.field2445;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class186.field2445 += var8;
        }
        class426.method2539(-124);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BIIIII)V", line = 102)
    public static final void method1607(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg1; var6 <= arg5; var6++) {
            class270.method1633(class240.field3303[var6], arg2, arg3, arg4, 102);
        }
        if (arg0 != 88) {
            field3817 = true;
        }
        field3818++;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V", line = 133)
    public static void method1608(int arg0) {
        if (arg0 != -11306) {
            method1606(-112L, (byte) -107);
        }
        field3816 = null;
    }
}
