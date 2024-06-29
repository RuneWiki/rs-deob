import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lae;")
    public static class6 field53 = class64.method474(108, "@gr1@");

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Lae;")
    public static class6 field54 = class64.method474(106, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field61 = 0;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "[I")
    public static int[] field63 = new int[5];

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field55 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Lae;")
    private static class6 field65 = class64.method474(120, "Loaded input handler");

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "[Lae;")
    public static class6[] field66 = new class6[100];

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "Lae;")
    public static class6 field70 = class64.method474(109, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field67 = 0;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Lae;")
    public static class6 field71 = field65;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "J")
    public static volatile long field69 = 0L;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Lbd;")
    public static class12 field68 = new class12(64);

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "Lbd;")
    public static class12 field72 = new class12(50);

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)J", line = 8)
    public static final synchronized long method22(int arg0) {
        field56++;
        if (arg0 < 23) {
            field53 = null;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class30.field742) {
            client.field456 += class30.field742 - var1;
        }
        class30.field742 = var1;
        return client.field456 + var1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lae;Z)V", line = 36)
    public static final void method23(class6 arg0, boolean arg1) {
        field59++;
        if (arg0 == null || arg0.method41(-8521) == 0) {
            class137.field3340 = 0;
            return;
        }
        int var2 = 0;
        class6[] var3 = new class6[100];
        class6 var4 = arg0;
        while (true) {
            int var5 = var4.method63((byte) 123, 32);
            if (var5 == -1) {
                class6 var6 = var4.method40((byte) -45);
                if (var6.method41(-8521) > 0) {
                    var3[var2++] = var6.method48(17183);
                }
                if (arg1) {
                    method22(-23);
                }
                class137.field3340 = 0;
                label51: for (int var7 = 0; var7 < class67.field1490; var7++) {
                    class22 var8 = class43.method356(-29, var7);
                    if (var8.field526 == -1 && var8.field549 != null) {
                        class6 var9 = var8.field549.method48(17183);
                        for (int var10 = 0; var10 < var2; var10++) {
                            if (var9.method51(22938, var3[var10]) == -1) {
                                continue label51;
                            }
                        }
                        class58.field1256[class137.field3340] = var9;
                        class35.field821[class137.field3340] = var7;
                        class137.field3340++;
                        if (class137.field3340 >= class58.field1256.length) {
                            return;
                        }
                    }
                }
                return;
            }
            class6 var11 = var4.method30(0, -1, var5).method40((byte) -45);
            if (var11.method41(-8521) > 0) {
                var3[var2++] = var11.method48(17183);
            }
            var4 = var4.method56(-58, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V", line = 126)
    public static void method24(int arg0) {
        field65 = null;
        field54 = null;
        field63 = null;
        field66 = null;
        if (arg0 != 0) {
            field71 = null;
        }
        field71 = null;
        field72 = null;
        field55 = null;
        field68 = null;
        field53 = null;
        field70 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 169)
    public static final void method25(byte arg0) {
        field62++;
        class69.field1523 = 0;
        class92.field2205 = 0;
        class126.method1027(0);
        class14.method157((byte) -20);
        class92.method772((byte) 127);
        class89.method752((byte) -101);
        int var1 = 0;
        if (arg0 > -66) {
            field66 = null;
        }
        while (class69.field1523 > var1) {
            int var3 = class43.field994[var1];
            if (field61 != class20.field387[var3].field1770) {
                class20.field387[var3] = null;
            }
            var1++;
        }
        if (class69.field1528 != class85.field2051.field1821) {
            throw new RuntimeException("gpp1 pos:" + class85.field2051.field1821 + " psize:" + class69.field1528);
        }
        for (int var2 = 0; var2 < class47.field1065; var2++) {
            if (class20.field387[class4.field47[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class47.field1065);
            }
        }
    }
}
