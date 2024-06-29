import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class class418 extends class363 {

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "Z")
    public volatile boolean field5346 = true;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "[I")
    public static int[] field5344 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "Z")
    public boolean field5343;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "Z")
    public boolean field5345;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "[[B")
    public static byte[][] field5342;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)[B")
    public abstract byte[] method1741(int arg0);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)I")
    public abstract int method1740(byte arg0);

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)V")
    public static void method2325(int arg0) {
        field5344 = null;
        field5342 = null;
        if (arg0 != 2) {
            method2327((byte) -53, null);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIII)V")
    public static final void method2326(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5347++;
        class124 var5 = class590.method3275(-125);
        var5.field1516.method3090(class295.field3752.field7095, arg4 + 1);
        var5.field1516.method3090(arg0, 3);
        var5.field1516.method3090(arg3, 3);
        var5.field1516.method3080((byte) -50, arg2);
        var5.field1516.method3080((byte) -99, arg1);
        class197.method1156((byte) 116, var5);
        class478.field5958 = 0;
        if (arg4 != 2) {
            method2328(3);
        }
        class389.field4992 = -3;
        class303.field3848 = 1;
        class398.field5059 = 0;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method2327(byte arg0, String arg1) {
        field5348++;
        String var2 = class396.method2240(class291.method1746(arg1, (byte) -124), (byte) -126);
        if (arg0 != 103) {
            method2327((byte) -4, null);
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)I")
    public static final int method2328(int arg0) {
        field5341++;
        int var1 = class113.field1422.method1060(arg0 ^ 0x2FD2);
        if (arg0 == 12251) {
            if (var1 < class510.field6384.length - 1) {
                class113.field1422 = class510.field6384[var1 + 1];
            }
            return 100;
        } else {
            return 82;
        }
    }
}
