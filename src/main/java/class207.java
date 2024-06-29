import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class207 extends class209 {

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field3390 = 0;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "[S")
    public static short[] field3392 = new short[256];

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "Luf;")
    public static class168 field3395 = class148.method1019(-1720, "null");

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "Lla;")
    public static class175 field3401;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "Lwa;")
    public static class284 field3394;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "Lkb;")
    private class80 field3397;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "[[[S")
    public static short[][][] field3400;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)I", line = 27)
    public final int method1440(int arg0, int arg1, int arg2) {
        field3391++;
        if (this.field3397 == null) {
            return arg0;
        }
        if (arg1 != 0) {
            this.method1443((class153) null, 23, -41);
        }
        class69 var4 = (class69) this.field3397.method493((long) arg2, 124);
        return var4 == null ? arg0 : var4.field919;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Luf;II)Luf;", line = 47)
    public final class168 method1441(class168 arg0, int arg1, int arg2) {
        field3402++;
        if (this.field3397 == null) {
            return arg0;
        }
        class188 var4 = (class188) this.field3397.method493((long) arg2, 105);
        if (var4 == null) {
            return arg0;
        } else {
            if (arg1 < 20) {
                field3395 = (class168) null;
            }
            return var4.field2985;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBI)I", line = 67)
    public static final int method1442(int arg0, byte arg1, int arg2) {
        if (arg0 > arg2) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        if (arg1 < 24) {
            field3401 = (class175) null;
        }
        field3396++;
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lj;II)V", line = 98)
    private final void method1443(class153 arg0, int arg1, int arg2) {
        if (arg1 == 249) {
            int var4 = arg0.method1042((byte) 92);
            if (this.field3397 == null) {
                int var5 = class180.method1294(true, var4);
                this.field3397 = new class80(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1042((byte) -112) == 1;
                int var8 = arg0.method1088(-30917);
                class24 var9;
                if (var7) {
                    var9 = new class188(arg0.method1075(53));
                } else {
                    var9 = new class69(arg0.method1089((byte) -14));
                }
                this.field3397.method490(var9, (long) var8, true);
            }
        }
        field3398++;
        if (arg2 >= -60) {
            field3395 = (class168) null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(B)V", line = 148)
    public static void method1444(byte arg0) {
        field3394 = null;
        field3392 = null;
        field3395 = null;
        field3400 = (short[][][]) null;
        if (arg0 > -43) {
            method1444((byte) -117);
        }
        field3401 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILj;)V", line = 168)
    public final void method1445(int arg0, class153 arg1) {
        if (arg0 != 0) {
            field3394 = (class284) null;
        }
        field3393++;
        while (true) {
            int var3 = arg1.method1042((byte) -104);
            if (var3 == 0) {
                return;
            }
            this.method1443(arg1, var3, -67);
        }
    }
}
