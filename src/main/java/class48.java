import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class48 {

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field1027 = 0;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lch;")
    public static class117 field1032 = new class117();

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lch;")
    public static class117 field1034 = new class117();

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Lfl;")
    public static class192 field1033;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "[[[B")
    public static byte[][][] field1023;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIB)V")
    public static final void method390(int arg0, int arg1, byte arg2) {
        field1029++;
        int var3 = arg0--;
        if (var3 > 25) {
            var3 = 25;
        }
        int var4 = class8.field268[arg0];
        int var5 = class80.field1513[arg0];
        if (arg1 == 0) {
            class207.field3729++;
            class55.field1133.method1863(true, 104);
            class55.field1133.method903((byte) 36, var3 + var3 + 3);
        }
        if (arg1 == 1) {
            class256.field4383++;
            class55.field1133.method1863(true, 131);
            class55.field1133.method903((byte) 36, var3 + var3 + 3 + 14);
        }
        if (arg1 == 2) {
            class104.field1844++;
            class55.field1133.method1863(true, 238);
            class55.field1133.method903((byte) 36, var3 + var3 + 3);
        }
        class55.field1133.method897(81, class64.field1248 + var4);
        class55.field1133.method892(13966, class69.field1311[82] ? 1 : 0);
        class161.field2936 = class8.field268[0];
        class203.field3633 = class80.field1513[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class55.field1133.method903((byte) 36, class8.field268[arg0] - var4);
            class55.field1133.method945((byte) 95, class80.field1513[arg0] - var5);
        }
        class55.field1133.method921(100, class231.field4073 + var5);
        if (arg2 > -32) {
            method393(false);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIILuh;IIB)Luh;")
    public static final class235 method391(int arg0, int arg1, int arg2, class235 arg3, int arg4, int arg5, byte arg6) {
        long var7 = (long) arg1;
        class235 var9 = (class235) class54.field1112.method1887(123, var7);
        field1031++;
        if (var9 == null) {
            class20 var10 = class20.method157(class276.field4868, arg1, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method172(64, 768, -50, -10, -50);
            class54.field1112.method1892(var9, var7, (byte) -123);
        }
        if (arg6 > -1) {
            field1023 = null;
        }
        int var11 = arg3.method1265();
        int var12 = arg3.method1259();
        int var13 = arg3.method1261();
        int var14 = arg3.method1270();
        class235 var15 = var9.method1272(true, true);
        if (arg0 != 0) {
            var15.method1255(arg0);
        }
        class185 var16 = (class185) var15;
        if (arg5 != class67.method483(arg2 + var13, -116, arg4 + var11, class216.field3902) || class67.method483(arg2 + var14, -122, arg4 + var12, class216.field3902) != arg5) {
            for (int var17 = 0; var17 < var16.field3350; var17++) {
                var16.field3300[var17] += class67.method483(var16.field3326[var17] + arg2, -127, var16.field3318[var17] - -arg4, class216.field3902) - arg5;
            }
            var16.field3304 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lfl;[Lcg;I[Lvj;[Lcg;[Lcg;[Lcg;)V")
    public static final void method392(class192 arg0, class34[] arg1, int arg2, class88[] arg3, class34[] arg4, class34[] arg5, class34[] arg6) {
        class119.field2101 = arg5;
        class237.field4142 = arg4;
        field1026++;
        class221.field3960 = arg0;
        class66.field1268 = arg1;
        class30.field752 = arg6;
        class6.field170 = arg3;
        class246.field4282 = new boolean[class6.field170.length];
        field1032.method791(76);
        if (arg2 <= 80) {
            method390(83, 89, (byte) -105);
        }
        int var7 = class221.field3960.method1326((byte) -21, class79.field1506);
        int[] var8 = class221.field3960.method1303(0, var7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            field1032.method785(class1.method1(new class135(class221.field3960.method1332(true, var8[var9], var7)), -107), -29);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public static void method393(boolean arg0) {
        if (arg0) {
            field1033 = null;
        }
        field1034 = null;
        field1033 = null;
        field1023 = null;
        field1032 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLng;)V")
    public final void method394(byte arg0, class135 arg1) {
        while (true) {
            int var3 = arg1.method920((byte) 124);
            if (var3 == 0) {
                field1022++;
                int var4 = 93 / ((arg0 - 6) / 60);
                return;
            }
            this.method395(arg1, var3, -50);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lng;II)V")
    private final void method395(class135 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1030 = arg0.method927(125);
            this.field1024 = arg0.method920((byte) 125);
            this.field1028 = arg0.method920((byte) 47);
        }
        if (arg2 != -50) {
            field1033 = null;
        }
        field1025++;
    }
}
