import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class6 extends class177 {

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "Lfi;")
    public class247 field57;

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "Lbe;")
    public static class283 field58 = class153.method941(-25, "(U(Y");

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field53 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!gk", name = "Z", descriptor = "[I")
    public static int[] field63 = new int[2000];

    @OriginalMember(owner = "client!gk", name = "Y", descriptor = "I")
    public static int field62 = 0;

    @OriginalMember(owner = "client!gk", name = "ab", descriptor = "Lbe;")
    private static class283 field64 = class153.method941(-101, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!gk", name = "bb", descriptor = "Lbe;")
    public static class283 field65 = field64;

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!gk", name = "V", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!gk", name = "W", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!gk", name = "X", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III[B)I", line = 9)
    public static final int method33(int arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = -1;
        for (int var5 = arg2; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class63.field869[(arg3[var5] ^ var4) & 0xFF];
        }
        if (arg0 != -10467) {
            field64 = (class283) null;
        }
        int var6 = ~var4;
        field59++;
        return var6;
    }

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "(I)V", line = 42)
    public static final void method34(int arg0) {
        int var1 = field62;
        int var2 = class1.field1 - class115.field1945 - var1;
        field56++;
        int var3 = class282.field4767;
        int var4 = class103.field1757 - class48.field655 - var3;
        if (var1 > 0 || var2 > 0 || var3 > 0 || var4 > 0) {
            try {
                Container var5;
                if (class1.field2 != null) {
                    var5 = class1.field2;
                } else if (class164.field2711 == null) {
                    var5 = class150.field2460.field4272;
                } else {
                    var5 = class164.field2711;
                }
                int var6 = 0;
                int var7 = 0;
                if (class164.field2711 == var5) {
                    Insets var8 = class164.field2711.getInsets();
                    var7 = var8.top;
                    var6 = var8.left;
                }
                Graphics var9 = var5.getGraphics();
                var9.setColor(Color.black);
                if (var1 > 0) {
                    var9.fillRect(var6, var7, var1, class103.field1757);
                }
                if (var3 > 0) {
                    var9.fillRect(var6, var7, class1.field1, var3);
                }
                if (var2 > 0) {
                    var9.fillRect(var6 + class1.field1 - var2, var7, var2, class103.field1757);
                }
                if (var4 > 0) {
                    var9.fillRect(var6, var7 + class103.field1757 - var4, class1.field1, var4);
                }
            } catch (Exception var11) {
            }
        }
        if (arg0 != 0) {
            method35(-49, -27);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V", line = 107)
    public static final void method35(int arg0, int arg1) {
        class215.field3644.method1637(true, arg0);
        field55++;
        if (arg1 > -33) {
            field63 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)I", line = 123)
    public static final int method36(int arg0, byte arg1) {
        field61++;
        if (arg1 != 67) {
            method37((class283) null, 56, (class283) null, -70);
        }
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lbe;ILbe;I)V", line = 134)
    public static final void method37(class283 arg0, int arg1, class283 arg2, int arg3) {
        class27.field403 = arg3;
        class213.field3620 = arg0;
        class290.field4911 = 0;
        if (arg1 != 25670) {
            method35(-37, 96);
        }
        class213.field3626 = arg2;
        field60++;
        class86.field1455 = false;
        if (class213.field3620.method1926(-16620, class213.field3616) || class213.field3626.method1926(-16620, class213.field3616)) {
            class299.field5056 = 0;
            class255.field4302 = 3;
        } else {
            class299.field5056 = 1;
            class7.field74 = 0;
            class153.field2520 = 0;
            class255.field4302 = -3;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V", line = 161)
    public static void method38(boolean arg0) {
        field63 = null;
        field65 = null;
        field64 = null;
        field58 = null;
        if (arg0) {
            method35(12, 6);
        }
        field53 = null;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lfi;)V", line = 177)
    public class6(class247 arg0) {
        this.field57 = arg0;
    }
}
