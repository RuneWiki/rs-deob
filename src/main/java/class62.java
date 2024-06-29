import java.math.BigInteger;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class62 {

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "Lqe;")
    private static class179 field1305 = class206.method1380("World", (byte) 40);

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "[I")
    public static int[] field1306 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Lqe;")
    public static class179 field1310 = field1305;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "Lqe;")
    public static class179 field1308 = field1305;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1313 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "Lqe;")
    public static class179 field1316 = class206.method1380(" (X", (byte) -128);

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "[I")
    public static int[] field1315 = new int[128];

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "Lqe;")
    public static class179 field1317 = class206.method1380("weiss:", (byte) -3);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1312;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static void method415(int arg0) {
        field1305 = null;
        if (arg0 != 0) {
            method417(35, -73, 127, -112, -123, 54, -60, 35);
        }
        field1313 = null;
        field1315 = null;
        field1310 = null;
        field1306 = null;
        field1317 = null;
        field1316 = null;
        field1308 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([BBLra;)V")
    public final void method416(byte[] arg0, byte arg1, class185 arg2) {
        field1304++;
        if (arg2.field3397[arg2.field3432] != 31 || arg2.field3397[arg2.field3432 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1312 == null) {
            this.field1312 = new Inflater(true);
        }
        try {
            this.field1312.setInput(arg2.field3397, arg2.field3432 + 10, arg2.field3397.length + -arg2.field3432 - 18);
            int var4 = 70 % ((25 - arg1) / 60);
            this.field1312.inflate(arg0);
        } catch (Exception var5) {
            this.field1312.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1312.reset();
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class62() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1314++;
        if (arg6 >= class235.field4336 && class40.field869 >= arg7 && arg0 >= class168.field3037 && class70.field1403 >= arg1) {
            class202.method1344((byte) -127, arg7, arg0, arg4, arg5, arg2, arg1, arg6);
        } else {
            class232.method1516(arg5, arg7, arg1, arg2, 69, arg0, arg4, arg6);
        }
        if (arg3 != -4) {
            field1317 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(III)V")
    private class62(int arg0, int arg1, int arg2) {
    }
}
