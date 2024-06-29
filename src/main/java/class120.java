import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class120 implements class121 {

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public int field1369;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "Lida;")
    public class215 field1366;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Lce;")
    public class278 field1367;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "[I")
    public static int[] field1361 = new int[1000];

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "J")
    public static long field1368 = 0L;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZLjava/io/File;)[B")
    public static final byte[] method712(int arg0, boolean arg1, File arg2) {
        field1365++;
        try {
            byte[] var3 = new byte[arg0];
            class519.method2960(arg2, arg0, -119, var3);
            if (arg1) {
                method713(-71);
            }
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public static void method713(int arg0) {
        field1361 = null;
        if (arg0 != 1783) {
            field1361 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Lqv;")
    public class406 method484(int arg0) {
        field1363++;
        if (arg0 != 16236) {
            this.field1366 = null;
        }
        return class577.field8238;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(ILida;Lce;II)V")
    public class120(int arg0, class215 arg1, class278 arg2, int arg3, int arg4) {
        this.field1369 = arg3;
        this.field1366 = arg1;
        this.field1362 = arg4;
        this.field1367 = arg2;
        this.field1364 = arg0;
    }
}
