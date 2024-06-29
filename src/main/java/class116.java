import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class116 extends class416 {

    @OriginalMember(owner = "client!jn", name = "I", descriptor = "Z")
    public static boolean field1496 = true;

    @OriginalMember(owner = "client!jn", name = "M", descriptor = "[F")
    public static float[] field1500 = new float[4];

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!jn", name = "E", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!jn", name = "F", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!jn", name = "G", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!jn", name = "H", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!jn", name = "J", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!jn", name = "K", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!jn", name = "L", descriptor = "[B")
    private byte[] field1499;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method868(byte arg0, int arg1) {
        field1491++;
        class367 var2 = class573.method3057(7, arg1, 2);
        var2.method2113(-111);
        if (arg0 < 55) {
            method868((byte) 14, 56);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ldg;ZIIB)V", line = 18)
    public static final void method869(class193 arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field1497++;
        int var5 = arg0.field3030[0];
        int var6 = arg0.field3039[0];
        if (var5 < 0 || class611.field8258 <= var5 || var6 < 0 || var6 >= class656.field9155 || arg3 < 0 || class611.field8258 <= arg3 || arg2 < 0 || class656.field9155 <= arg2) {
            return;
        }
        int var7 = class234.method1484(arg3, 0, 0, class652.field9065, arg2, -4, 0, class690.field9429, 0, true, class703.field9806[arg0.field508], var5, var6, arg0.method1265(65), -20943);
        if (var7 < 1 || var7 > 3) {
            return;
        }
        if (arg1) {
            method870(93, -61, -43);
        }
        for (int var8 = 0; var8 < (var7 - 1); var8++) {
            arg0.method1262(class690.field9429[var8], class652.field9065[var8], arg4, 107);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)I", line = 57)
    public static final int method870(int arg0, int arg1, int arg2) {
        field1498++;
        int var3 = arg1;
        while (arg2 > 0) {
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg2--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIB)[B", line = 76)
    public final byte[] method871(int arg0, int arg1, int arg2, byte arg3) {
        field1494++;
        this.field1499 = new byte[arg0 * arg1 * arg2 * 2];
        this.method3734(arg0, arg2, 255, arg1);
        if (arg3 != 105) {
            field1496 = false;
        }
        return this.field1499;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILfd;)Lrm;", line = 92)
    public static final class243 method872(int arg0, class418 arg1) {
        field1493++;
        if (arg0 != 17679) {
            method872(127, null);
        }
        int var2 = arg1.method2393(-30727);
        class562 var3 = class167.method1156(107)[arg1.method2396(arg0 - 17573)];
        class573 var4 = class239.method1507((byte) -37)[arg1.method2396(30)];
        int var5 = arg1.method2383(65280);
        int var6 = arg1.method2383(65280);
        return new class243(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)V", line = 120)
    public static void method873(int arg0) {
        field1500 = null;
        if (arg0 != -5527) {
            field1500 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBZ)V", line = 131)
    public final void method303(int arg0, byte arg1, boolean arg2) {
        field1492++;
        int var4 = arg0 * 2;
        byte var5 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field1499[var10001] = var5;
        this.field1499[var6] = var5;
        if (!arg2) {
            field1496 = true;
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V", line = 149)
    public class116() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILjava/lang/String;)I", line = 152)
    public static final int method874(int arg0, String arg1) {
        if (arg0 != 4) {
            return 58;
        }
        field1495++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class665.field9225; var2++) {
            if (arg1.equalsIgnoreCase(class405.field5160[var2])) {
                return var2;
            }
        }
        return -1;
    }
}
