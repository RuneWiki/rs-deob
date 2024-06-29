import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class583 {

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "[F")
    public static float[] field8240 = new float[4];

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Ltm;")
    public static class334 field8237 = new class334(47, 3);

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field8241 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field8238;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "J")
    public static long field8242;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static void method3362(int arg0) {
        field8240 = null;
        field8241 = null;
        field8237 = null;
        if (arg0 != 5120) {
            field8242 = 122L;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)I")
    public static final int method3363(boolean arg0, int arg1) {
        field8239++;
        return arg0 ? -85 : arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILal;)I")
    public static final int method3364(int arg0, class121 arg1) {
        field8238++;
        if (arg0 != 5122) {
            return 119;
        } else if (class121.field1856 == arg1) {
            return 5120;
        } else if (class121.field1857 == arg1) {
            return 5122;
        } else if (class121.field1858 == arg1) {
            return 5124;
        } else if (class121.field1859 == arg1) {
            return 5121;
        } else if (class121.field1860 == arg1) {
            return 5123;
        } else if (class121.field1861 == arg1) {
            return 5125;
        } else if (class121.field1862 == arg1) {
            return 5131;
        } else if (class121.field1863 == arg1) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
