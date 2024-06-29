import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class220 {

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lud;")
    public static class279 field3886 = class130.method1024("Fichiers config charg-Bs", 255);

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Z")
    public static boolean field3883 = true;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Lud;")
    public static class279 field3890 = class130.method1024("<col=c0ff00>", 255);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public int field3882;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public int field3885;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public int field3887;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 5)
    public static void method1611(int arg0) {
        field3886 = null;
        if (arg0 <= -126) {
            field3890 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Le;", line = 30)
    public static final class157 method1612(int arg0, int arg1) {
        class157 var2 = (class157) class222.field3928.method1336((long) arg1, 0);
        field3881++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class54.field1187.method1192(arg0 + 2254, class315.method2234(arg1, (byte) 106), class69.method606(-73, arg1));
        class157 var4 = new class157();
        if (arg0 != -2254) {
            field3891 = -31;
        }
        var4.field2825 = arg1;
        if (var3 != null) {
            var4.method1225(new class53(var3), (byte) -94);
        }
        var4.method1231(true);
        if (var4.field2884 != -1) {
            var4.method1233(arg0 ^ 0xFFFF9BCA, method1612(-2254, var4.field2855), method1612(-2254, var4.field2884));
        }
        if (var4.field2867 != -1) {
            var4.method1235(method1612(-2254, var4.field2867), method1612(arg0, var4.field2889), 0);
        }
        if (!class266.field4788 && var4.field2843) {
            var4.field2861 = class12.field390;
            var4.field2846 = class240.field4219;
            var4.field2837 = 0;
            var4.field2886 = class57.field1217;
            var4.field2838 = false;
        }
        class222.field3928.method1331(var4, arg0 ^ 0xFFFF812F, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)I", line = 71)
    public static final int method1613(byte arg0, int arg1) {
        field3889++;
        if (arg1 < 0) {
            return 0;
        }
        if (arg0 < 108) {
            field3890 = (class279) null;
        }
        class109 var2 = (class109) class103.field1928.method610((long) arg1, -1);
        if (var2 == null) {
            return class111.method907(arg1, 21).field2451;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field2019.length; var4++) {
            if (var2.field2019[var4] == -1) {
                var3++;
            }
        }
        return var3 + class111.method907(arg1, 36).field2451 - var2.field2019.length;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 112)
    public static final void method1614(byte arg0) {
        field3892++;
        class54.field1183.method1334((byte) -25);
        class210.field3697.method1334((byte) -25);
        if (arg0 < 118) {
            method1615(106, 60);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)Lud;", line = 125)
    public static final class279 method1615(int arg0, int arg1) {
        if (arg1 != 255) {
            method1614((byte) -59);
        }
        field3884++;
        return class115.method929(new class279[] { class191.method1447(arg1 ^ 0xFA, arg0 >> 24 & 0xFF), class37.field806, class191.method1447(5, (arg0 & 0xFFB094) >> 16), class37.field806, class191.method1447(arg1 - 250, (arg0 & 0xFF51) >> 8), class37.field806, class191.method1447(5, arg0 & 0xFF) }, (byte) 60);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILbd;IIII)Ljava/awt/Frame;", line = 136)
    public static final Frame method1616(int arg0, class305 arg1, int arg2, int arg3, int arg4, int arg5) {
        field3888++;
        if (!arg1.method2168(arg4 - 284736545)) {
            return null;
        }
        if (arg3 == 0) {
            class236[] var6 = class260.method1863(arg1, (byte) 126);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field4112 == arg5 && var6[var8].field4117 == arg2 && (arg0 == 0 || var6[var8].field4114 == arg0) && (!var7 || arg3 < var6[var8].field4113)) {
                    var7 = true;
                    arg3 = var6[var8].field4113;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class206 var9 = arg1.method2171(-107, arg3, arg5, arg2, arg0);
        if (arg4 != 284736560) {
            field3886 = (class279) null;
        }
        while (var9.field3655 == 0) {
            class204.method1510(10L, 1);
        }
        Frame var10 = (Frame) var9.field3657;
        if (var10 == null) {
            return null;
        } else if (var9.field3655 == 2) {
            class125.method997(arg1, (byte) 23, var10);
            return null;
        } else {
            return var10;
        }
    }
}
