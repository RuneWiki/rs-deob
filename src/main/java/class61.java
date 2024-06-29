import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class61 extends InputStream {

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Lna;")
    public static class26 field982 = class69.method505("tbrefresh", (byte) -121);

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field988 = 0;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "Lna;")
    private static class26 field992 = class69.method505(" ", (byte) -125);

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field986 = 0;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Lna;")
    public static class26 field989 = field992;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "Lna;")
    public static class26 field981 = class69.method505("0(U", (byte) -128);

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Lma;")
    public static class285 field987;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "[I")
    public static int[] field983;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 11)
    public static void method473(int arg0) {
        int var1 = 10 / ((-arg0 - 37) / 33);
        field992 = null;
        field987 = null;
        field989 = null;
        field982 = null;
        field981 = null;
        field983 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZIIIIFII)[I", line = 37)
    public static final int[] method474(boolean arg0, int arg1, int arg2, int arg3, int arg4, float arg5, int arg6, int arg7) {
        field990++;
        if (arg1 != 14585) {
            field986 = 43;
        }
        int[] var8 = new int[arg3];
        class84 var9 = new class84();
        var9.field1378 = arg6;
        var9.field1373 = arg4;
        var9.field1386 = arg7;
        var9.field1371 = arg2;
        var9.field1380 = (int) (arg5 * 4096.0F);
        var9.field1384 = arg0;
        var9.method130(16251);
        class320.method2224(-106, 1, arg3);
        var9.method651(true, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLwa;)Lj;", line = 71)
    public static final class283 method475(byte arg0, class82 arg1) {
        arg1.method642((byte) -114);
        field984++;
        int var2 = arg1.method642((byte) -51);
        class283 var3 = class259.method1824(var2, true);
        var3.field4732 = arg1.method642((byte) -66);
        int var4 = arg1.method642((byte) -33);
        if (arg0 > -26) {
            field989 = (class26) null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method642((byte) -92);
            var3.method1(var6, arg1, true);
        }
        var3.method130(16251);
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "read", descriptor = "()I", line = 109)
    public final int read() {
        class126.method862(30000L, 64);
        field985++;
        return -1;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)I", line = 121)
    public static final int method476(boolean arg0, int arg1) {
        if (!arg0) {
            field989 = (class26) null;
        }
        field991++;
        return arg1 >>> 8;
    }
}
