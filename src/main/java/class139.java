import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class139 {

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Lkd;")
    private static class73 field3440 = class126.method1070((byte) -66, "Walk here");

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Lkd;")
    private static class73 field3456 = class126.method1070((byte) -66, "Click to switch");

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lkd;")
    public static class73 field3439 = field3456;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Lkd;")
    public static class73 field3446 = field3440;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lqc;")
    public static class114 field3447 = new class114(new byte[5000]);

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "B")
    public static byte field3460 = 0;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "Lkd;")
    public static class73 field3463 = class126.method1070((byte) -66, "null");

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "Lkd;")
    public static class73 field3464 = class126.method1070((byte) -66, "backhmid1");

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "Lkd;")
    public static class73 field3466 = class126.method1070((byte) -66, "Entfernen");

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "Lkd;")
    public static class73 field3465 = class126.method1070((byte) -66, "welle:");

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public int field3441;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public int field3444;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public int field3450;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public int field3455;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public int field3457;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public int field3461;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public int field3467;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "Lbc;")
    public static class11 field3462;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "[B")
    public byte[] field3443;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "[B")
    public byte[] field3449;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III[B)I")
    public static final int method1129(int arg0, int arg1, int arg2, byte[] arg3) {
        field3451++;
        int var4 = -1;
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class99.field2484[(var4 ^ arg3[var5]) & 0xFF];
        }
        return var4 ^ arg1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method1130(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field3466 = null;
        field3439 = null;
        field3446 = null;
        field3464 = null;
        field3465 = null;
        field3456 = null;
        field3447 = null;
        field3462 = null;
        field3463 = null;
        field3440 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[BIZ)Lkd;")
    public static final class73 method1131(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class73 var4 = new class73();
        var4.field1880 = 0;
        field3448++;
        var4.field1858 = new byte[arg2];
        if (arg3) {
            return null;
        }
        for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
            if (arg1[var5] != 0) {
                var4.field1858[var4.field1880++] = arg1[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILq;I)[Lde;")
    public static final class27[] method1132(int arg0, int arg1, class111 arg2, int arg3) {
        if (arg1 != 24) {
            field3446 = null;
        }
        field3459++;
        return class140.method1142(arg3, arg0, -123, arg2) ? class19.method154((byte) 88) : null;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public static final void method1133(int arg0) {
        class11.field352 = null;
        field3442++;
        class47.field1236 = null;
        class141.field3513 = null;
        class47.field1245 = null;
        class116.field2958 = null;
        class61.field1615 = null;
        class125.field3169 = null;
        class99.field2490 = null;
        if (arg0 != -1) {
            method1131(-88, null, -52, true);
        }
        class86.field2163 = null;
        class129.field3247 = null;
        class12.field400 = null;
        class1.field100 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Lea;")
    public static final class30 method1134(byte arg0) {
        field3452++;
        try {
            if (arg0 > -57) {
                method1130(-59);
            }
            return (class30) Class.forName("n").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class119();
        }
    }
}
