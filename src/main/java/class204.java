import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class204 {

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "[I")
    public static int[] field3177 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Luf;")
    public static class176 field3182;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "[I")
    public static int[] field3181;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBIII)V")
    public static final void method1365(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -7) {
            method1369(100, (byte) 44, (class37) null);
        }
        for (int var5 = 0; var5 < class145.field2254; var5++) {
            if (class249.field3841[var5] + class228.field3568[var5] > arg2 && arg0 + arg2 > class228.field3568[var5] && class237.field3675[var5] + class148.field2291[var5] > arg4 && class148.field2291[var5] < (arg3 + arg4)) {
                class222.field3476[var5] = true;
            }
        }
        field3178++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)I")
    public static final int method1366(int arg0, byte arg1) {
        if (arg1 != -87) {
            field3177 = null;
        }
        field3176++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)Lre;")
    public static final class228 method1367(int arg0, int arg1, int arg2) {
        class23 var3 = class255.field3907[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class228 var4 = var3.field344;
            var3.field344 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1368(int arg0) {
        field3177 = null;
        if (arg0 <= -87) {
            field3182 = null;
            field3181 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBLf;)V")
    public static final void method1369(int arg0, byte arg1, class37 arg2) {
        field3180++;
        if (arg1 != -70) {
            method1366(-39, (byte) -70);
        }
        if (class243.field3763 == null) {
            return;
        }
        try {
            class243.field3763.method1857(arg1 - 57, 0L);
            class243.field3763.method1855(arg2.field583, 24, -107, arg0);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public static final String method1370(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        } else {
            field3179++;
            return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
        }
    }
}
