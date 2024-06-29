import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class85 {

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    private int field1390 = 0;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    private int field1399 = -1;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "Lih;")
    private class32 field1402 = new class32();

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "Z")
    public boolean field1406 = false;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    private int field1387;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "[Lqi;")
    private class301[] field1391;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "[[I")
    private int[][] field1393;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "[J")
    public static long[] field1394 = new long[100];

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Lna;")
    public static class26 field1398 = class69.method505(" weitere Optionen", (byte) -118);

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Ln;")
    public static class282 field1388 = new class282(200);

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "[I")
    public static int[] field1404 = new int[500];

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Len;")
    public static class41 field1392;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 6)
    public static void method659(int arg0) {
        field1388 = null;
        if (arg0 != 65536) {
            method660(-109, -68);
        }
        field1404 = null;
        field1394 = null;
        field1398 = null;
        field1392 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[F", line = 25)
    public static final float[] method660(int arg0, int arg1) {
        field1401++;
        float var2 = class289.method2039() + class289.method2030();
        int var3 = class289.method2035();
        float var4 = 0.58823526F;
        class305.field5250[3] = 1.0F;
        float var5 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        float var6 = (float) ((var3 & 0xFF1E) >> 8) / 255.0F;
        class305.field5250[1] = var2 * (float) class4.method23(arg0 >> 8, 255) / 255.0F * var6 * var4;
        class305.field5250[arg1] = var2 * var4 * var5 * ((float) (class4.method23(16754958, arg0) >> 16) / 255.0F);
        float var7 = (float) (var3 & 0xFF) / 255.0F;
        class305.field5250[2] = (float) class4.method23(255, arg0) / 255.0F * var7 * var4 * var2;
        return class305.field5250;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V", line = 53)
    public final void method661(int arg0) {
        for (int var2 = 0; var2 < this.field1405; var2++) {
            this.field1393[var2] = null;
        }
        if (arg0 != 1127165736) {
            method666(118, 75);
        }
        this.field1393 = (int[][]) null;
        field1396++;
        this.field1391 = null;
        this.field1402.method253(-85);
        this.field1402 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZIII)Lqf;", line = 78)
    public static final class148 method662(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 65536) {
            return (class148) null;
        }
        field1400++;
        int var7 = (arg2 ? 65536 : 0) + arg1 + (arg0 << 17) + (arg4 << 19);
        long var8 = (long) arg3 * 3147483667L + (long) var7 * 3849834839L;
        class148 var10 = (class148) class140.field2132.method1989(var8, (byte) 121);
        if (var10 != null) {
            return var10;
        }
        class200.field3101 = false;
        class148 var11 = class26.method201(arg4, (byte) 13, false, arg1, arg2, arg0, arg3, false);
        if (var11 != null && !class200.field3101) {
            class140.field2132.method1978((byte) -79, var11, var8);
        }
        return var11;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(III)V", line = 272)
    public class85(int arg0, int arg1, int arg2) {
        this.field1387 = arg1;
        this.field1391 = new class301[this.field1387];
        this.field1405 = arg0;
        this.field1393 = new int[this.field1405][arg2];
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V", line = 117)
    public static final void method663(int arg0, int arg1, int arg2) {
        field1395++;
        if (arg2 == -2553) {
            class120 var3 = class293.method2059(arg2 ^ 0xFFFFF603, 13, arg1);
            var3.method833((byte) 33);
            var3.field1877 = arg0;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)[I", line = 133)
    public final int[] method664(int arg0, int arg1) {
        if (arg0 != -16409) {
            this.field1406 = false;
        }
        field1397++;
        if (this.field1405 == this.field1387) {
            this.field1406 = this.field1391[arg1] == null;
            this.field1391[arg1] = class95.field1547;
            return this.field1393[arg1];
        } else if (this.field1405 == 1) {
            this.field1406 = this.field1399 != arg1;
            this.field1399 = arg1;
            return this.field1393[0];
        } else {
            class301 var3 = this.field1391[arg1];
            if (var3 == null) {
                this.field1406 = true;
                if (this.field1390 < this.field1405) {
                    var3 = new class301(arg1, this.field1390);
                    this.field1390++;
                } else {
                    class301 var4 = (class301) this.field1402.method254(2);
                    var3 = new class301(arg1, var4.field5185);
                    this.field1391[var4.field5183] = null;
                    var4.method1006(-1024);
                }
                this.field1391[arg1] = var3;
            } else {
                this.field1406 = false;
            }
            this.field1402.method258(64, var3);
            return this.field1393[var3.field5185];
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)[[I", line = 208)
    public final int[][] method665(byte arg0) {
        field1403++;
        if (arg0 <= 67) {
            return (int[][]) ((int[][]) null);
        } else if (this.field1405 == this.field1387) {
            for (int var2 = 0; var2 < this.field1405; var2++) {
                this.field1391[var2] = class95.field1547;
            }
            return this.field1393;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)V", line = 243)
    public static final void method666(int arg0, int arg1) {
        class281.field4687.method1985(-127, arg0);
        class207.field3216.method1985(arg1 - 383, arg0);
        class140.field2132.method1985(arg1 ^ 0xFFFFFF7C, arg0);
        field1389++;
        if (arg1 != 255) {
            method666(20, 87);
        }
    }
}
