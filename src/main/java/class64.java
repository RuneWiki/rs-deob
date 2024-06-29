import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class64 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lec;")
    public static class32 field1478 = class73.method594(")3", true);

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Lec;")
    private static class32 field1483 = class73.method594("Press (Wrecover a locked account(W on front page)3", true);

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Lec;")
    public static class32 field1485 = field1483;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Lja;")
    public static class63 field1481 = new class63(100);

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Lec;")
    public static class32 field1488 = class73.method594("p12_full", true);

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1487 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Lec;")
    private static class32 field1492 = class73.method594("No response from server)3", true);

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "Lec;")
    public static class32 field1491 = field1492;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Lec;")
    public static class32 field1494 = class73.method594("<col=c0ff00>", true);

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "Lec;")
    public static class32 field1493 = class73.method594(")3runescape)3com", true);

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Lec;")
    public static class32 field1490 = class73.method594("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", true);

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field1495 = 0;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Lga;")
    public static class44 field1489;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)Lec;")
    public static final class32 method492(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        }
        field1486++;
        class32 var2 = new class32();
        var2.field618 = new byte[arg1];
        var2.field674 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    public static void method493(boolean arg0) {
        field1487 = null;
        field1490 = null;
        field1491 = null;
        field1481 = null;
        field1483 = null;
        field1485 = null;
        field1489 = null;
        field1488 = null;
        field1493 = null;
        if (arg0) {
            field1478 = null;
            field1494 = null;
            field1492 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
    public static final void method494(int arg0, int arg1) {
        field1480++;
        if (arg0 == -1 || !class28.method192(arg0, -18020)) {
            return;
        }
        class36[] var2 = class79.field1826[arg0];
        int var3 = 0;
        if (arg1 < 16) {
            return;
        }
        while (var3 < var2.length) {
            class36 var4 = var2[var3];
            if (var4.field868 != null) {
                class12 var5 = new class12();
                var5.field209 = var4;
                var5.field208 = var4.field868;
                class158.method1224(var5, (byte) -74);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ldc;IIBLjava/awt/Component;)Lqc;")
    public static final class114 method495(class25 arg0, int arg1, int arg2, byte arg3, Component arg4) {
        field1482++;
        if (class139.field3213 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class114 var5 = (class114) Class.forName("md").getDeclaredConstructor().newInstance();
                var5.field2681 = arg2;
                var5.field2658 = new int[(class56.field1311 ? 2 : 1) * 256];
                var5.method141(arg4);
                var5.field2682 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field2682 > 16384) {
                    var5.field2682 = 16384;
                }
                var5.method143(var5.field2682);
                if (class32.field652 > 0 && class132.field3033 == null) {
                    class132.field3033 = new class27();
                    class132.field3033.field485 = arg0;
                    arg0.method175(class32.field652, class132.field3033, arg3 ^ 0x4B);
                }
                if (class132.field3033 != null) {
                    if (class132.field3033.field487[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class132.field3033.field487[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class21 var6 = new class21(arg0, arg1);
                    var6.field2681 = arg2;
                    if (arg3 != 62) {
                        field1489 = null;
                    }
                    var6.field2658 = new int[(class56.field1311 ? 2 : 1) * 256];
                    var6.method141(arg4);
                    var6.field2682 = 16384;
                    var6.method143(var6.field2682);
                    if (class32.field652 > 0 && class132.field3033 == null) {
                        class132.field3033 = new class27();
                        class132.field3033.field485 = arg0;
                        arg0.method175(class32.field652, class132.field3033, 112);
                    }
                    if (class132.field3033 != null) {
                        if (class132.field3033.field487[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class132.field3033.field487[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class114();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
