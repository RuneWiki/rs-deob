import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class168 extends InputStream {

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "Luw;")
    public static class208 field2227 = new class208(80, 7);

    @OriginalMember(owner = "client!pca", name = "g", descriptor = "F")
    public static float field2232 = 1.0F;

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "Lhv;")
    public static class151 field2229 = new class151();

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!pca", name = "h", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!pca", name = "i", descriptor = "Leka;")
    public static class654 field2234;

    @OriginalMember(owner = "client!pca", name = "read", descriptor = "()I")
    public final int read() {
        field2228++;
        class591.method3181(30000L, 0);
        return -1;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V")
    public static void method1065(int arg0) {
        field2229 = null;
        field2234 = null;
        if (arg0 != 5131) {
            method1069(33);
        }
        field2227 = null;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(BLds;)I")
    public static final int method1066(byte arg0, class73 arg1) {
        int var2 = 115 / ((67 - arg0) / 52);
        field2230++;
        if (class73.field985 == arg1) {
            return 5120;
        } else if (class73.field988 == arg1) {
            return 5122;
        } else if (class73.field989 == arg1) {
            return 5124;
        } else if (class73.field990 == arg1) {
            return 5121;
        } else if (class73.field991 == arg1) {
            return 5123;
        } else if (class73.field992 == arg1) {
            return 5125;
        } else if (class73.field993 == arg1) {
            return 5131;
        } else if (class73.field994 == arg1) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1067(int arg0, int arg1, byte arg2) {
        if (arg2 >= -105) {
            field2234 = null;
        }
        field2233++;
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)Z")
    public static final boolean method1068(int arg0, int arg1, int arg2) {
        if (arg1 != 80) {
            method1065(-31);
        }
        field2226++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)Lap;")
    public static final class610 method1069(int arg0) {
        field2231++;
        try {
            return new class220();
        } catch (Throwable var2) {
            if (arg0 != 5123) {
                method1069(18);
            }
            try {
                return (class610) Class.forName("oda").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class147();
            }
        }
    }
}
