import java.awt.Frame;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class93 extends InputStream {

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1344 = -1;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIILna;II)Ljava/awt/Frame;", line = 12)
    public static final Frame method735(int arg0, int arg1, int arg2, class26 arg3, int arg4, int arg5) {
        field1346++;
        if (!arg3.method176(-5)) {
            return null;
        }
        if (arg5 == 0) {
            class44[] var6 = class255.method1781((byte) -94, arg3);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field691 == arg2 && var6[var8].field686 == arg4 && (arg1 == 0 || var6[var8].field685 == arg1) && (!var7 || arg5 < var6[var8].field689)) {
                    arg5 = var6[var8].field689;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class233 var9 = arg3.method172(arg1, 49, arg5, arg4, arg2);
        if (arg0 > -85) {
            method738((byte) -21);
        }
        while (var9.field3585 == 0) {
            class97.method768(10L, 109);
        }
        Frame var10 = (Frame) var9.field3590;
        if (var10 == null) {
            return null;
        } else if (var9.field3585 == 2) {
            class173.method1263(100, arg3, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)V", line = 86)
    public static final void method736(boolean arg0, int arg1) {
        if (arg1 != -32730) {
            return;
        }
        for (class117 var2 = (class117) class154.field2330.method986(false); var2 != null; var2 = (class117) class154.field2330.method982(arg1 ^ 0xFFFFBA3B)) {
            if (var2.field1842 != null) {
                class200.field3165.method2162(var2.field1842);
                var2.field1842 = null;
            }
            if (var2.field1848 != null) {
                class200.field3165.method2162(var2.field1848);
                var2.field1848 = null;
            }
            var2.method1554((byte) -31);
        }
        field1343++;
        if (!arg0) {
            return;
        }
        for (class117 var3 = (class117) class200.field3169.method986(false); var3 != null; var3 = (class117) class200.field3169.method982(14877)) {
            if (var3.field1842 != null) {
                class200.field3165.method2162(var3.field1842);
                var3.field1842 = null;
            }
            var3.method1554((byte) -55);
        }
        for (class117 var4 = (class117) class17.field192.method200(0); var4 != null; var4 = (class117) class17.field192.method202((byte) -83)) {
            if (var4.field1842 != null) {
                class200.field3165.method2162(var4.field1842);
                var4.field1842 = null;
            }
            var4.method1554((byte) -45);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZIZLlb;Llb;)Le;", line = 154)
    public static final class160 method737(boolean arg0, int arg1, boolean arg2, class211 arg3, class211 arg4) {
        field1348++;
        boolean var5 = true;
        if (arg2) {
            method737(true, -5, true, (class211) null, (class211) null);
        }
        int[] var6 = arg4.method1508(0, arg1);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method1504(arg1, var6[var7], 0);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[0] & 0xFF << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg0) {
                    var10 = arg3.method1504(0, var9, 0);
                } else {
                    var10 = arg3.method1504(var9, 0, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class160(arg4, arg3, arg1, arg0);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 211)
    public static final void method738(byte arg0) {
        if (arg0 <= 32) {
            field1341 = -99;
        }
        field1347++;
        class69.field1014.method1428(10935);
    }

    @OriginalMember(owner = "client!he", name = "read", descriptor = "()I", line = 222)
    public final int read() {
        field1340++;
        class97.method768(30000L, 94);
        return -1;
    }
}
