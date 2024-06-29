import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class706 extends class55 {

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "Lcea;")
    public class215 field9890;

    @OriginalMember(owner = "client!pw", name = "n", descriptor = "[F")
    public static float[] field9893 = new float[4];

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "D")
    public static double field9891;

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
    public static int field9892;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)V", line = 4)
    public static void method3976(boolean arg0) {
        field9893 = null;
        if (!arg0) {
            field9891 = 0.4390183000949001D;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V", line = 14)
    public static final void method3977(int arg0) {
        class569.field8012.method2701(arg0 ^ arg0);
        field9892++;
        int var1 = class569.field8012.method2702((byte) -104, 8);
        if (var1 < class84.field1169) {
            for (int var2 = var1; var2 < class84.field1169; var2++) {
                class640.field8888[class118.field1557++] = class665.field9261[var2];
            }
        }
        if (class84.field1169 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class84.field1169 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class665.field9261[var3];
            class215 var5 = ((class706) class681.field9475.method2552((long) var4, -1)).field9890;
            int var6 = class569.field8012.method2702((byte) -74, 1);
            if (var6 == 0) {
                class665.field9261[class84.field1169++] = var4;
                var5.field863 = class558.field7854;
            } else {
                int var7 = class569.field8012.method2702((byte) -117, 2);
                if (var7 == 0) {
                    class665.field9261[class84.field1169++] = var4;
                    var5.field863 = class558.field7854;
                    class144.field1861[class488.field6690++] = var4;
                } else if (var7 == 1) {
                    class665.field9261[class84.field1169++] = var4;
                    var5.field863 = class558.field7854;
                    int var8 = class569.field8012.method2702((byte) -16, 3);
                    var5.method1196(0, 1, var8);
                    int var9 = class569.field8012.method2702((byte) -107, 1);
                    if (var9 == 1) {
                        class144.field1861[class488.field6690++] = var4;
                    }
                } else if (var7 == 2) {
                    class665.field9261[class84.field1169++] = var4;
                    var5.field863 = class558.field7854;
                    if (class569.field8012.method2702((byte) -42, 1) == 1) {
                        int var11 = class569.field8012.method2702((byte) -58, 3);
                        var5.method1196(arg0 ^ 0xFFFFECB2, 2, var11);
                        int var12 = class569.field8012.method2702((byte) -45, 3);
                        var5.method1196(0, 2, var12);
                    } else {
                        int var10 = class569.field8012.method2702((byte) -36, 3);
                        var5.method1196(0, 0, var10);
                    }
                    int var13 = class569.field8012.method2702((byte) -65, 1);
                    if (var13 == 1) {
                        class144.field1861[class488.field6690++] = var4;
                    }
                } else if (var7 == 3) {
                    class640.field8888[class118.field1557++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lcea;)V", line = 131)
    public class706(class215 arg0) {
        this.field9890 = arg0;
    }
}
