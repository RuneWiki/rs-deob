import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class80 extends class354 {

    @OriginalMember(owner = "client!ut", name = "H", descriptor = "Lbf;")
    public static class372 field1322 = new class372(8);

    @OriginalMember(owner = "client!ut", name = "N", descriptor = "I")
    public static int field1328 = 12;

    @OriginalMember(owner = "client!ut", name = "M", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1327 = new CRC32();

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!ut", name = "J", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!ut", name = "L", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!ut", name = "K", descriptor = "Lcu;")
    public static class145 field1325;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)I", line = 3)
    public static final int method645(int arg0, int arg1) {
        ++field1323;
        if (~arg1 != -6407) {
            if (arg1 == 6409) {
                return 1;
            } else if (arg1 == 32841) {
                return 1;
            } else if (arg1 == 6410) {
                return 2;
            } else if (~arg1 != -6408) {
                if (arg1 == 6408) {
                    return 4;
                } else if (arg0 != -6408) {
                    return -124;
                } else {
                    throw new IllegalArgumentException("");
                }
            } else {
                return 3;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "(I)V", line = 39)
    public static void method646(int arg0) {
        field1327 = null;
        if (arg0 == 2) {
            field1322 = null;
            field1325 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IB)[I", line = 52)
    public final int[] method253(int arg0, byte arg1) {
        ++field1326;
        int[] var3 = super.field5357.method861(true, arg0);
        if (arg1 != -95) {
            method646(95);
        }
        if (super.field5357.field1869) {
            int[][] var4 = this.method2291(0, (byte) -110, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class404.field5952 > var8; ++var8) {
                var3[var8] = (var5[var8] - -var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V", line = 91)
    public class80() {
        super(1, true);
    }
}
