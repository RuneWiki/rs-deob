import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class132 extends class67 {

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "[I")
    public int[] field3186 = new int[1];

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "[I")
    public int[] field3193 = new int[] { -1 };

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "Lrd;")
    private static class114 field3188 = class84.method656("Enter name of friend to delete from list", (byte) 120);

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "Lrd;")
    public static class114 field3191 = field3188;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "Lrd;")
    public static class114 field3196 = class84.method656("Willkommen auf RuneScape", (byte) 117);

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "[Lmc;")
    public static class83[] field3183 = new class83[8];

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "Lpc;")
    public static class101 field3195 = new class101(4096);

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "Lrd;")
    public static class114 field3198 = class84.method656("(U(Y", (byte) 123);

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "Lrd;")
    public static class114 field3200 = class84.method656("Von:", (byte) 116);

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "Lpc;")
    public static class101 field3197 = new class101(32);

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "Ljd;")
    public static class66 field3199;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "[[[B")
    public static byte[][][] field3194;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1059(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3185++;
        int var6 = (arg3 - 32) * arg3 / arg2;
        if (var6 < 8) {
            var6 = 8;
        }
        class39.field819[0].method722(arg1, arg5);
        class39.field819[1].method722(arg1, arg3 + arg5 - 16);
        int var7 = (arg3 - var6 - 32) * arg0 / (arg2 - arg3);
        class59.method434(arg1, arg5 + 16, 16, arg3 - 32, class14.field302);
        class59.method434(arg1, arg5 + var7 + 16, 16, var6, class89.field1971);
        class59.method435(arg1, arg5 + var7 + 16, var6, class142.field3400);
        class59.method435(arg1 + 1, arg5 + var7 - -16, var6, class142.field3400);
        class59.method432(arg1, var7 + arg5 + 16, 16, class142.field3400);
        class59.method432(arg1, arg5 + var7 + 17, 16, class142.field3400);
        if (arg4 > 0) {
            class59.method435(arg1 + 15, arg5 + 16 - -var7, var6, class13.field294);
            class59.method435(arg1 + 14, arg5 - -var7 + 17, var6 - 1, class13.field294);
            class59.method432(arg1, arg5 + var7 + var6 + 15, 16, class13.field294);
            class59.method432(arg1 + 1, arg5 + 14 + var6 - -var7, 15, class13.field294);
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(Z)V")
    public static void method1060(boolean arg0) {
        field3200 = null;
        field3195 = null;
        field3188 = null;
        field3199 = null;
        field3183 = null;
        if (!arg0) {
            method1063(124);
        }
        field3198 = null;
        field3197 = null;
        field3191 = null;
        field3196 = null;
        field3194 = null;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
    public static final void method1061(int arg0) {
        field3194 = null;
        class92.field2144 = null;
        class118.field2769 = null;
        class47.field984 = null;
        class7.field90 = null;
        class36.field773 = null;
        class98.field2227 = null;
        class60.field1289 = null;
        class116.field2717 = null;
        class128.field3064 = null;
        field3187++;
        if (arg0 != 16) {
            field3194 = null;
        }
        class123.field2904 = null;
        class1.field8 = null;
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V")
    public static final void method1062(int arg0) {
        if (arg0 != -29025) {
            field3191 = null;
        }
        if (class65.field1413 != null) {
            class65.field1413.method292(25830);
        }
        field3189++;
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V")
    public static final void method1063(int arg0) {
        field3192++;
        if (class90.field2084 != null) {
            class140 var1 = class90.field2084;
            synchronized (class90.field2084) {
                class90.field2084 = null;
            }
        }
        if (arg0 != -17) {
            method1061(-72);
        }
    }
}
