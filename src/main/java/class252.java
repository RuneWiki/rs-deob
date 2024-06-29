import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class252 {

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field4532 = -1;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Lqk;")
    public static class207 field4531 = class24.method212(255, "Chargement du module texte )2 ");

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Lbf;")
    public static class199 field4534 = new class199(64);

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field4535 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "[I")
    public static int[] field4538 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "[[[I")
    public static int[][][] field4536;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static void method1762(byte arg0) {
        field4534 = null;
        int var1 = -67 % ((-arg0 - 49) / 56);
        field4531 = null;
        field4538 = null;
        field4536 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static final void method1763(int arg0) {
        if (arg0 != 15914854) {
            return;
        }
        class17.field262.method779(true);
        field4528++;
        int var1 = class17.field262.method773(8, false);
        if (var1 < class138.field2390) {
            for (int var2 = var1; var2 < class138.field2390; var2++) {
                class11.field150[class160.field2838++] = class117.field2036[var2];
            }
        }
        if (var1 > class138.field2390) {
            throw new RuntimeException("gnpov1");
        }
        class138.field2390 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class117.field2036[var3];
            class256 var5 = class79.field1449[var4];
            int var6 = class17.field262.method773(1, false);
            if (var6 == 0) {
                class117.field2036[class138.field2390++] = var4;
                var5.field5034 = class160.field2844;
            } else {
                int var7 = class17.field262.method773(2, false);
                if (var7 == 0) {
                    class117.field2036[class138.field2390++] = var4;
                    var5.field5034 = class160.field2844;
                    class180.field3233[class65.field1179++] = var4;
                } else if (var7 == 1) {
                    class117.field2036[class138.field2390++] = var4;
                    var5.field5034 = class160.field2844;
                    int var8 = class17.field262.method773(3, false);
                    var5.method1940(1, var8, 9366);
                    int var9 = class17.field262.method773(1, false);
                    if (var9 == 1) {
                        class180.field3233[class65.field1179++] = var4;
                    }
                } else if (var7 == 2) {
                    class117.field2036[class138.field2390++] = var4;
                    var5.field5034 = class160.field2844;
                    if (class17.field262.method773(1, false) == 1) {
                        int var11 = class17.field262.method773(3, false);
                        var5.method1940(2, var11, 9366);
                        int var12 = class17.field262.method773(3, false);
                        var5.method1940(2, var12, 9366);
                    } else {
                        int var10 = class17.field262.method773(3, false);
                        var5.method1940(0, var10, arg0 ^ 0xF2F3F0);
                    }
                    int var13 = class17.field262.method773(1, false);
                    if (var13 == 1) {
                        class180.field3233[class65.field1179++] = var4;
                    }
                } else if (var7 == 3) {
                    class11.field150[class160.field2838++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILpk;Z)Lwi;")
    public static final class133 method1764(int arg0, class99 arg1, boolean arg2) {
        field4530++;
        if (arg2) {
            byte[] var3 = arg1.method701(-1, arg0);
            return var3 == null ? null : new class133(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)V")
    public static final void method1765(byte arg0, int arg1, int arg2) {
        class85.field1543[arg2] = arg1;
        if (arg0 >= -40) {
            field4534 = null;
        }
        field4529++;
        class59 var3 = (class59) class157.field2763.method1867((long) arg2, true);
        if (var3 == null) {
            class59 var4 = new class59(4611686018427387905L);
            class157.field2763.method1863((byte) -101, var4, (long) arg2);
        } else if (var3.field1078 != 4611686018427387905L) {
            var3.field1078 = class53.method405(18) + 500L | 0x4000000000000000L;
            return;
        }
    }
}
