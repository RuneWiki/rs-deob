import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class26 extends class24 {

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "Lqf;")
    public static class117 field506 = class72.method514(108, "gleiten:");

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "Lqf;")
    public static class117 field511 = class72.method514(102, "backbase1");

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "Lqf;")
    public static class117 field514 = class72.method514(109, "Handel akzeptieren");

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "[I")
    public static int[] field513 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "Z")
    public static boolean field507 = false;

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field515 = new CRC32();

    @OriginalMember(owner = "client!dd", name = "gb", descriptor = "I")
    public static int field518 = 0;

    @OriginalMember(owner = "client!dd", name = "hb", descriptor = "I")
    public static int field519 = 7759444;

    @OriginalMember(owner = "client!dd", name = "fb", descriptor = "Lqf;")
    private static class117 field517 = class72.method514(115, "On");

    @OriginalMember(owner = "client!dd", name = "jb", descriptor = "I")
    public static int field521 = 0;

    @OriginalMember(owner = "client!dd", name = "kb", descriptor = "Lqf;")
    public static class117 field522 = field517;

    @OriginalMember(owner = "client!dd", name = "ib", descriptor = "Lqf;")
    public static class117 field520 = class72.method514(105, "M");

    @OriginalMember(owner = "client!dd", name = "ob", descriptor = "Lqf;")
    public static class117 field526 = class72.method514(123, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!dd", name = "mb", descriptor = "Lqf;")
    public static class117 field524 = class72.method514(116, "cross");

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "B")
    public byte field509;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!dd", name = "eb", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!dd", name = "nb", descriptor = "Lvd;")
    public static class147 field525;

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "Lha;")
    public class50 field512;

    @OriginalMember(owner = "client!dd", name = "lb", descriptor = "[Lqf;")
    public static class117[] field523;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[BI[Ltd;II)V")
    public static final void method200(int arg0, int arg1, byte[] arg2, int arg3, class135[] arg4, int arg5, int arg6) {
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg0 + var12 > 0 && arg0 + var12 < 103 && arg3 + var13 > 0 && arg3 + var13 < 103) {
                        arg4[var7].field3230[arg0 + var12][arg3 + var13] = class16.method135(arg4[var7].field3230[arg0 + var12][arg3 + var13], -16777217);
                    }
                }
            }
        }
        class77 var8 = new class77(arg2);
        field516++;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class94.method741(0, (byte) 125, arg5, var8, var9, arg3 + var11, arg0 + var10, arg6);
                }
            }
        }
        if (arg1 != 22335) {
            method201(43, 99);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)Z")
    public static final boolean method201(int arg0, int arg1) {
        field505++;
        if (class25.field495[arg0]) {
            return true;
        }
        if (arg1 != 314356016) {
            method202(null, (byte) -86, true, null, null);
        }
        if (!class77.field1709.method446(arg0, arg1 ^ 0x12BCB114)) {
            return false;
        }
        int var2 = class77.field1709.method440(arg0, false);
        if (var2 == 0) {
            class25.field495[arg0] = true;
            return true;
        }
        if (class141.field3426[arg0] == null) {
            class141.field3426[arg0] = new class89[var2];
        }
        for (int var3 = 0; var3 < var2; var3++) {
            if (class141.field3426[arg0][var3] == null) {
                byte[] var4 = class77.field1709.method458(false, var3, arg0);
                if (var4 != null) {
                    class141.field3426[arg0][var3] = new class89();
                    class141.field3426[arg0][var3].field2125 = (arg0 << 16) + var3;
                    if (var4[0] == -1) {
                        class141.field3426[arg0][var3].method704(new class77(var4), -76);
                    } else {
                        class141.field3426[arg0][var3].method697(-21637, new class77(var4));
                    }
                }
            }
        }
        class25.field495[arg0] = true;
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lgd;BZLjb;Ljb;)V")
    public static final void method202(class46 arg0, byte arg1, boolean arg2, class64 arg3, class64 arg4) {
        field510++;
        class52.field1074 = arg3;
        class44.field870 = arg4;
        class73.field1604 = arg2;
        class48.field969 = class44.field870.method440(10, false);
        class97.field2360 = arg0;
        int var5 = -13 % (arg1 / 44);
    }

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "(I)V")
    public static void method203(int arg0) {
        field506 = null;
        field520 = null;
        field513 = null;
        field517 = null;
        field511 = null;
        if (arg0 != 10) {
            field522 = null;
        }
        field514 = null;
        field525 = null;
        field524 = null;
        field515 = null;
        field523 = null;
        field526 = null;
        field522 = null;
    }
}
