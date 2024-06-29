import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class191 {

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Z")
    public boolean field3192 = false;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public int field3195 = 0;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public int field3193 = 0;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Ltl;")
    public static class59 field3197 = class85.method639(" steht bereits auf Ihrer Freunde)2Liste(Q", 9588);

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field3198 = 127;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "F")
    public static float field3191;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Ljh;")
    public class225 field3196;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field3194;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BII)V", line = 7)
    public static final void method1403(byte arg0, int arg1, int arg2) {
        int var3 = arg2;
        field3190++;
        if (arg2 > 25) {
            var3 = 25;
        }
        arg2--;
        int var4 = class248.field4126[arg2];
        int var5 = class274.field4721[arg2];
        if (arg1 == 0) {
            class234.field3888.method1768(true, 129);
            class234.field3888.method1219(var3 + var3 + 3, true);
            class84.field1312++;
        }
        if (arg1 == 1) {
            class234.field3888.method1768(true, 230);
            class234.field3888.method1219(var3 + var3 + 17, true);
            class200.field3310++;
        }
        if (arg1 == 2) {
            class234.field3888.method1768(true, 128);
            class234.field3888.method1219(var3 + var3 + 3, true);
            class116.field1895++;
        }
        class234.field3888.method1242(class317.field5350[82] ? 1 : 0, false);
        class234.field3888.method1238(1871071368, class197.field3249 + var4);
        class72.field1123 = class248.field4126[0];
        class18.field227 = class274.field4721[0];
        if (arg0 != -30) {
            field3191 = -1.3314527F;
        }
        for (int var6 = 1; var6 < var3; var6++) {
            arg2--;
            class234.field3888.method1202(-565791320, class248.field4126[arg2] - var4);
            class234.field3888.method1242(class274.field4721[arg2] - var5, false);
        }
        class234.field3888.method1196((byte) 78, class187.field3135 + var5);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V", line = 100)
    public static void method1404(boolean arg0) {
        field3197 = null;
        if (!arg0) {
            method1404(false);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIII)Z", line = 117)
    public static final boolean method1405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class1.field2[arg0][var8][var9] == -class59.field932) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class97.field1558[arg0][arg1][arg3] + arg5;
            if (!class123.method913(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class123.method913(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class123.method913(var10, var12, var14)) {
                return false;
            } else if (class123.method913(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class227.method1559(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class123.method913(var6 + 1, class97.field1558[arg0][arg1][arg3] + arg5, var7 + 1) && class123.method913(var6 + 128 - 1, class97.field1558[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class123.method913(var6 + 128 - 1, class97.field1558[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class123.method913(var6 + 1, class97.field1558[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }
}
