import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class55 extends class115 {

    @OriginalMember(owner = "client!er", name = "P", descriptor = "I")
    private int field625 = 32768;

    @OriginalMember(owner = "client!er", name = "Q", descriptor = "I")
    public static int field626 = 0;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!er", name = "K", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!er", name = "M", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!er", name = "N", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!er", name = "O", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!er", name = "R", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(II)[I", line = 3)
    public final int[] method57(int arg0, int arg1) {
        ++field624;
        int[] var3 = super.field1340.method14(114, arg0);
        if (super.field1340.field35) {
            int[] var4 = this.method631(true, 1, arg0);
            int[] var5 = this.method631(true, 2, arg0);
            for (int var6 = 0; ~var6 > ~class218.field2979; ++var6) {
                int var7 = (var4[var6] & 4081) >> 4;
                int var8 = var5[var6] * this.field625 >> 12;
                int var9 = class63.field726[var7] * var8 >> 12;
                int var10 = class157.field2227[var7] * var8 >> 12;
                int var11 = class92.field1013 & (var9 >> 12) + var6;
                int var12 = class315.field4488 & (var10 >> 12) + arg0;
                int[] var13 = this.method631(true, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        if (arg1 != 0) {
            method319((Component) null, (byte) 84);
        }
        return var3;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 55)
    public static final void method319(Component arg0, byte arg1) {
        ++field620;
        Method var2 = class378.field5563;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class406.field5896);
        if (arg1 <= 68) {
            method319((Component) null, (byte) -87);
        }
        arg0.addFocusListener(class406.field5896);
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V", line = 80)
    public class55() {
        super(3, false);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)Lq;", line = 83)
    public static final class246 method320(int arg0, byte arg1) {
        ++field619;
        class246 var2 = (class246) class71.field802.method410((byte) -26, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            if (arg1 < 6) {
                method321(-26, -38, -97, 40, 76, -44, 2, -26, (byte) -8);
            }
            byte[] var3 = class78.field889.method361(arg0, 111, 0);
            if (var3 != null && var3.length > 1) {
                class246 var4 = class350.method2234(var3, 4);
                class71.field802.method414(var4, (byte) 66, (long) arg0);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIIIIB)V", line = 112)
    public static final void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        ++field627;
        if (arg8 <= 82) {
            method320(-112, (byte) 9);
        }
        if (arg4 >= 128 && ~arg1 <= -129 && ~arg4 >= ~((class279.field3935 + -2) * 128) && class164.field2287 * 128 + -256 >= arg1) {
            int var9 = -arg7 + class372.method2335(arg1, class410.field5931, (byte) 79, arg4);
            class397.field5789.method124(arg5, 0, 0);
            class218.field2991.method949(class397.field5789);
            class218.field2991.method1020(arg4, var9, arg1, class33.field313);
            class397.field5789.method124(-arg5, 0, 0);
            class218.field2991.method949(class397.field5789);
        } else {
            class33.field313[0] = class33.field313[1] = -1;
        }
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V", line = 137)
    public final void method140(int arg0) {
        if (arg0 == 0) {
            class170.method1131(256);
            ++field623;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLbk;I)V", line = 151)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field1347 = arg1.method1342((byte) -128) == 1;
            }
        } else {
            this.field625 = arg1.method1355(32136) << 4;
        }
        ++field621;
        if (arg0 < 83) {
            method321(-54, -54, -8, 41, 97, -20, 104, 27, (byte) 41);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)[[I", line = 189)
    public final int[][] method144(int arg0, int arg1) {
        ++field622;
        int var3 = -117 / ((arg1 - -80) / 45);
        int[][] var4 = super.field1342.method2530(arg0, (byte) 126);
        if (super.field1342.field5819) {
            int[] var5 = this.method631(true, 1, arg0);
            int[] var6 = this.method631(true, 2, arg0);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            for (int var10 = 0; ~var10 > ~class218.field2979; ++var10) {
                int var11 = (var5[var10] * 255 & 1044658) >> 12;
                int var12 = var6[var10] * this.field625 >> 12;
                int var13 = class63.field726[var11] * var12 >> 12;
                int var14 = class157.field2227[var11] * var12 >> 12;
                int var15 = (var13 >> 12) + var10 & class92.field1013;
                int var16 = class315.field4488 & (var14 >> 12) + arg0;
                int[][] var17 = this.method639((byte) 34, var16, 0);
                var7[var10] = var17[0][var15];
                var8[var10] = var17[1][var15];
                var9[var10] = var17[2][var15];
            }
        }
        return var4;
    }
}
