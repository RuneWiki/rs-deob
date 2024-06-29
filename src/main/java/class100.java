import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class100 extends class583 {

    @OriginalMember(owner = "client!rm", name = "G", descriptor = "I")
    public static int field1330 = 0;

    @OriginalMember(owner = "client!rm", name = "K", descriptor = "I")
    public static int field1334 = -1;

    @OriginalMember(owner = "client!rm", name = "I", descriptor = "I")
    public static int field1332 = 0;

    @OriginalMember(owner = "client!rm", name = "F", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!rm", name = "H", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!rm", name = "J", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!rm", name = "M", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!rm", name = "N", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!rm", name = "O", descriptor = "I")
    public static int field1338;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rm", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field1339;

    @OriginalMember(owner = "client!rm", name = "L", descriptor = "[B")
    private byte[] field1335;

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
    public class100() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/io/File;IZ)V")
    public static final void method576(File arg0, int arg1, boolean arg2) {
        field1331++;
        if (class73.field996 == null) {
            class205.method1390(-24359);
        }
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field1339 == null ? (field1339 = method578("java.lang.String")) : field1339, Boolean.TYPE);
            var4.invoke(class73.field996, arg0.getAbsolutePath(), Boolean.valueOf(arg2));
        } catch (Exception var7) {
            System.out.println("HeapDump error:");
            var7.printStackTrace();
        }
        int var6 = -101 % ((arg1 - 34) / 34);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBI)V")
    public final void method529(int arg0, byte arg1, int arg2) {
        field1329++;
        int var4 = arg0 * 2;
        int var5 = arg1 & 0xFF;
        int var10001 = var4;
        int var7 = var4 + 1;
        this.field1335[var10001] = -1;
        int var6 = -114 % ((54 - arg2) / 63);
        this.field1335[var7] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIII)[B")
    public final byte[] method577(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 23483) {
            this.method577(1, -67, -73, -86);
        }
        this.field1335 = new byte[arg0 * arg1 * arg3 * 2];
        field1337++;
        this.method2291(arg0, arg1, false, arg3);
        return this.field1335;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method578(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
