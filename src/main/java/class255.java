import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class255 extends class276 {

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "Z")
    public static boolean field4168 = true;

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!pl", name = "T", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!pl", name = "U", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!pl", name = "V", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "Lai;")
    public static class195 field4167;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "[[[Lci;")
    public static class60[][][] field4163;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[BII)I")
    public static final int method1685(int arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = -1;
        ++field4165;
        int var5 = arg3;
        if (arg0 != 255) {
            return -31;
        } else {
            while (arg2 > var5) {
                var4 = class129.field2265[255 & (arg1[var5] ^ var4)] ^ var4 >>> 8;
                ++var5;
            }
            return ~var4;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
    public class255() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1686(byte arg0, Component arg1) {
        ++field4170;
        if (arg0 >= -30) {
            field4168 = true;
        }
        Method var2 = class131.field2301;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class63.field1096);
        arg1.addFocusListener(class63.field1096);
    }

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "(I)V")
    public static void method1687(int arg0) {
        field4163 = null;
        if (arg0 == -8181) {
            field4167 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(IIII)I")
    public static final int method1688(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 3;
        ++field4171;
        if (var4 == 0) {
            return arg2;
        } else {
            if (arg0 != -98) {
                field4166 = 123;
            }
            if (~var4 == -2) {
                return arg1;
            } else {
                return ~var4 == -3 ? -arg2 + 7 : -arg1 + 7;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZC)Z")
    public static final boolean method1689(boolean arg0, char arg1) {
        if (!arg0) {
            return false;
        } else {
            ++field4164;
            return ~arg1 <= -66 && arg1 <= 'Z' || ~arg1 <= -98 && arg1 <= 'z';
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        ++field4169;
        if (arg0 <= 39) {
            method1685(48, (byte[]) null, -90, 116);
        }
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            int[][] var4 = this.method1810((byte) -105, arg1, 0);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            for (int var8 = 0; ~class53.field929 < ~var8; ++var8) {
                var3[var8] = (var7[var8] - -var5[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }
}
