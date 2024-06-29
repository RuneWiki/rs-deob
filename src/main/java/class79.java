import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class79 extends class253 {

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "Ljd;")
    public class85 field1444;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "Ljd;")
    public static class85 field1445 = class221.method1499("Okay", (byte) 91);

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "Ljd;")
    public static class85 field1453 = class221.method1499("::errortest", (byte) 120);

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "Ljd;")
    private static class85 field1456 = class221.method1499("Loading interfaces )2 ", (byte) 123);

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "Ljd;")
    public static class85 field1454 = field1456;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "Ljj;")
    public static class102 field1450 = new class102();

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "Ljd;")
    public static class85 field1457 = class221.method1499("Speicher wird zugewiesen)3", (byte) -79);

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "Lge;")
    public static class68 field1449;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "[[B")
    public static byte[][] field1459;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
    public static final void method546(int arg0) {
        field1447++;
        class189.field3249.method488(8);
        int var1 = class189.field3249.method490(0, 1);
        if (arg0 != -923 || var1 == 0) {
            return;
        }
        int var2 = class189.field3249.method490(0, 2);
        if (var2 == 0) {
            class36.field564[class241.field4151++] = 2047;
        } else if (var2 == 1) {
            int var3 = class189.field3249.method490(arg0 + 923, 3);
            class22.field308.method393(false, (byte) -68, var3);
            int var4 = class189.field3249.method490(0, 1);
            if (var4 == 1) {
                class36.field564[class241.field4151++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class189.field3249.method490(0, 3);
            class22.field308.method393(true, (byte) -106, var5);
            int var6 = class189.field3249.method490(arg0 + 923, 3);
            class22.field308.method393(true, (byte) 81, var6);
            int var7 = class189.field3249.method490(0, 1);
            if (var7 == 1) {
                class36.field564[class241.field4151++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class189.field3249.method490(0, 1);
            if (var8 == 1) {
                class36.field564[class241.field4151++] = 2047;
            }
            int var9 = class189.field3249.method490(0, 1);
            int var10 = class189.field3249.method490(0, 7);
            int var11 = class189.field3249.method490(0, 7);
            class116.field2066 = class189.field3249.method490(0, 2);
            class22.field308.method313(var11, 2, var10, var9 == 1);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)V")
    public static final void method547(int arg0, int arg1, int arg2, int arg3) {
        field1448++;
        class171 var4 = class85.method579(arg1, 0, arg0);
        var4.method1140(-28981);
        var4.field2951 = arg2;
        var4.field2948 = arg3;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class79() {
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)I")
    public static final int method548(int arg0, byte arg1) {
        int var2 = -3 % ((-arg1 - 38) / 61);
        int var3 = 0;
        field1455++;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var3 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var3 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var3 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var3 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var3++;
        }
        return arg0 + var3;
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V")
    public static void method549(int arg0) {
        field1449 = null;
        field1445 = null;
        field1456 = null;
        field1454 = null;
        field1457 = null;
        field1450 = null;
        field1459 = null;
        field1453 = null;
        if (arg0 < 126) {
            field1459 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Ljd;)V")
    public class79(class85 arg0) {
        this.field1444 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IBI)V")
    public static final void method550(int arg0, byte arg1, int arg2) {
        field1446++;
        class171 var3 = class85.method579(7, arg1 - 62, arg0);
        if (arg1 == 62) {
            var3.method1140(arg1 ^ 0xFFFF8EF5);
            var3.field2951 = arg2;
        }
    }
}
