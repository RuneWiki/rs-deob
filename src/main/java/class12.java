import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 extends class128 {

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public int field203 = 0;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
    public int field220 = -1;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Lid;")
    public static class60 field200 = class11.method72(" Sekunde(Xn(Y -Ubertragen)3", (byte) -27);

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field202 = 0;

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "Lid;")
    private static class60 field217 = class11.method72("Error loading your profile)3", (byte) -30);

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "Lid;")
    private static class60 field219 = class11.method72("RuneScape has been updated(Q", (byte) 125);

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "Lid;")
    public static class60 field215 = field219;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "Lid;")
    public static class60 field221 = field217;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "Lid;")
    private static class60 field214 = class11.method72("purple:", (byte) -66);

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "Lid;")
    public static class60 field198 = field214;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "Lid;")
    public static class60 field208 = class11.method72("Ein kostenloses Spielkonto erstellen)3", (byte) 99);

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "Lid;")
    public static class60 field224 = field214;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "Lqd;")
    public static class115 field204 = new class115(500);

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "Lid;")
    public static class60 field227 = class11.method72("(U3", (byte) -39);

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "I")
    public static int field229 = 0;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public int field206;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public int field207;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    public int field211;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    public int field213;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    public int field223;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
    public int field225;

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "Lpa;")
    public static class105 field210;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "Lpa;")
    public static class105 field226;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public static final void method76(int arg0) {
        field212++;
        int var1 = class103.field2491.method946(class23.field559);
        for (int var2 = 0; var2 < class80.field1956; var2++) {
            int var6 = class103.field2491.method946(class17.method141((byte) 94, var2));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        class17.field416 = class80.field1956 * 15 + 22;
        int var3 = class80.field1956 * 15 + 21;
        class135.field3067 = true;
        var1 += 8;
        class2.field54 = var1;
        int var4 = class140.field3185 - var1 / 2;
        if (var4 + var1 > 765) {
            var4 = 765 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        class101.field2465 = var4;
        int var5 = class139.field3174;
        if (var5 + var3 > 503) {
            var5 = 503 - var3;
        }
        if (arg0 != 16215) {
            method78(-10);
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class63.field1576 = var5;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I")
    public static final int method77(int arg0, int arg1, int arg2) {
        class23 var3 = (class23) class16.field404.method716((byte) 32, (long) arg0);
        field209++;
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && var3.field574.length > arg1) {
            return arg2 == 15 ? var3.field574[arg1] : 121;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
    public static void method78(int arg0) {
        field217 = null;
        field198 = null;
        field227 = null;
        field221 = null;
        field208 = null;
        field214 = null;
        field219 = null;
        field226 = null;
        if (arg0 != -5040) {
            return;
        }
        field215 = null;
        field224 = null;
        field204 = null;
        field200 = null;
        field210 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILfd;)V")
    public static final void method79(int arg0, class40 arg1) {
        if (arg0 != -30833) {
            method76(44);
        }
        if (class35.field814 == arg1.field1011) {
            class14.field257[arg1.field1027] = true;
        }
        field205++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZII)I")
    public static final int method80(boolean arg0, int arg1, int arg2) {
        field216++;
        long var3 = (long) ((arg1 << 16) + arg2);
        if (class24.field588 != null && class24.field588.field2929 == var3) {
            if (arg0) {
                field228 = 74;
            }
            return class102.field2479.field2501 * 99 / (class102.field2479.field2498.length - class24.field588.field2295) + 1;
        } else {
            return 0;
        }
    }
}
