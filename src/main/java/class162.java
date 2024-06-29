import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class162 {

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public int field2237;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "[I")
    public static int[] field2238 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lcca;")
    public static class462 field2241 = new class462(64);

    @OriginalMember(owner = "client!se", name = "h", descriptor = "[F")
    public static float[] field2243 = new float[16384];

    @OriginalMember(owner = "client!se", name = "i", descriptor = "[F")
    public static float[] field2244 = new float[16384];

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!se", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2239++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)I")
    public static final int method1010(int arg0) {
        if (arg0 > -22) {
            method1010(125);
        }
        field2242++;
        return class562.field7995.method1582(-9);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)I")
    public static final int method1011(byte arg0, int arg1) {
        int var2 = -85 / ((43 - arg0) / 52);
        field2236++;
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I[BLjava/io/File;I)V")
    public static final void method1012(int arg0, byte[] arg1, File arg2, int arg3) throws IOException {
        field2240++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
        try {
            var4.readFully(arg1, 0, arg3);
        } catch (EOFException var5) {
        }
        var4.close();
        if (arg0 != -17964) {
            method1010(-65);
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(II)V")
    public class162(int arg0, int arg1) {
        this.field2237 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method1013(byte arg0) {
        field2243 = null;
        int var1 = 26 % ((-arg0 - 37) / 62);
        field2244 = null;
        field2241 = null;
        field2238 = null;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field2243[var2] = (float) Math.sin((double) var2 * var0);
            field2244[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
