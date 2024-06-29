import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class74 implements Runnable {

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "[Lbc;")
    public volatile class15[] field1306 = new class15[2];

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Z")
    public volatile boolean field1305 = false;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Z")
    public volatile boolean field1311 = false;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Lbb;")
    public static class14 field1310 = new class14(200);

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "Ldc;")
    public static class37 field1312 = class185.method1233((byte) 86, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "Ldc;")
    public static class37 field1313 = class185.method1233((byte) 86, "<img=0>");

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "Ldc;")
    public static class37 field1316 = class185.method1233((byte) 86, "p12_full");

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1314 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Lbi;")
    public class21 field1304;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BII)I")
    public static final int method520(byte arg0, int arg1, int arg2) {
        field1309++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg0 < 42) {
            return 124;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static final void method521(int arg0) {
        if (arg0 != 2) {
            return;
        }
        if (class107.field1874 == null || class120.field2144 == null) {
            class120.field2144 = new int[256];
            class107.field1874 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class107.field1874[var1] = (int) (Math.sin(var2) * 4096.0D);
                class120.field2144[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field1308++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static void method522(byte arg0) {
        if (arg0 <= 66) {
            field1310 = null;
        }
        field1313 = null;
        field1314 = null;
        field1310 = null;
        field1312 = null;
        field1316 = null;
    }

    @OriginalMember(owner = "client!gi", name = "run", descriptor = "()V")
    public final void run() {
        field1307++;
        this.field1311 = true;
        try {
            while (!this.field1305) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class15 var2 = this.field1306[var1];
                    if (var2 != null) {
                        var2.method110((byte) -39);
                    }
                }
                class238.method1548((byte) -82, 10L);
                class197.method1312(null, 0, this.field1304);
            }
        } catch (Exception var9) {
            class60.method455(95, var9, null);
        } finally {
            Object var6 = null;
            this.field1311 = false;
        }
    }
}
