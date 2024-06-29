import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class1 extends class197 {

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
    private int field13;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    private int field12;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    private int field2;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "[S")
    public static short[] field7 = new short[] { 16, 21, 10, 13, 3, 22, 60, 17 };

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    private int field1;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
    private int field18;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
    private int field21;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    public static int field9;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field23;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "[B")
    private byte[] field3;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "[Ljb;")
    public static class499[] field16;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)V")
    public final void method1(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            field16 = null;
        }
        field19++;
        if (arg1 == 0) {
            this.field21 = this.field13 - (arg0 < 0 ? -arg0 : arg0);
            this.field11 = 4096;
            this.field21 = this.field21 * this.field21 >> 12;
            this.field1 = this.field21;
            return;
        }
        this.field11 = this.field8 * this.field21 >> 12;
        this.field21 = this.field13 - (arg0 >= 0 ? arg0 : -arg0);
        if (this.field11 < 0) {
            this.field11 = 0;
        } else if (this.field11 > 4096) {
            this.field11 = 4096;
        }
        this.field21 = this.field21 * this.field21 >> 12;
        this.field21 = this.field21 * this.field11 >> 12;
        this.field1 += this.field21 * this.field2 >> 12;
        this.field2 = this.field2 * this.field12 >> 12;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIII)V")
    public static final void method2(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -81 / ((59 - arg1) / 37);
        field9++;
        float var6 = (float) class135.field1968 / (float) class135.field1986;
        int var7 = arg3;
        int var8 = arg2;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg3 * var6);
        } else {
            var7 = (int) ((float) arg2 / var6);
        }
        int var9 = arg0 - (arg2 - var8) / 2;
        int var10 = arg4 - (arg3 - var7) / 2;
        class501.field7487 = class135.field1968 - (class135.field1968 * var9 / var8);
        class145.field2089 = -1;
        class277.field3839 = class135.field1986 * var10 / var7;
        class276.field3835 = -1;
        class504.method3016((byte) -36);
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
    public static final void method3(int arg0) {
        try {
            Method var1 = (field23 == null ? (field23 = method13("java.lang.Runtime")) : field23).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class33.field521 = var3;
                } catch (Throwable var4) {
                }
            }
            if (arg0 != 13) {
                method6((byte) 4, null, false);
            }
        } catch (Exception var5) {
        }
        field4++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lm;BLns;)V")
    public static final void method4(class373 arg0, byte arg1, class438 arg2) {
        field10++;
        if (arg1 < 106) {
            method3(-69);
        }
        class257.field3559 = arg2;
        class359.field5552 = arg0;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V")
    public static final void method5(boolean arg0) {
        class109.field1536.method1096(((float) class96.field1399.field5195 * 0.1F + 0.7F) * 1.1523438F);
        field5++;
        class109.field1536.method1139(class4.field50, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class109.field1536.method1118(class133.field1927, -1, 256);
        if (arg0) {
            class109.field1536.method1093(class392.field5950);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLjava/lang/Object;Z)[B")
    public static final byte[] method6(byte arg0, Object arg1, boolean arg2) {
        field15++;
        if (arg0 != -85) {
            method2(103, -75, 6, 73, 2);
        }
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class44.method339(-6145, var3) : var3;
        } else if (arg1 instanceof class323) {
            class323 var4 = (class323) arg1;
            return var4.method1635((byte) -82);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZLuf;ZIILuf;I)I")
    public static final int method7(boolean arg0, class349 arg1, boolean arg2, int arg3, int arg4, class349 arg5, int arg6) {
        field17++;
        int var7 = class119.method764(arg1, arg3 - 4097, arg2, arg4, arg5);
        if (arg3 != 4096) {
            return 125;
        } else if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else {
            int var8 = class119.method764(arg1, -1, arg0, arg6, arg5);
            return arg0 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public final void method8(int arg0) {
        this.field1 = 0;
        this.field18 = 0;
        if (arg0 < -45) {
            field20++;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(IIII)V")
    public static final void method9(int arg0, int arg1, int arg2, int arg3) {
        field6++;
        if (arg0 == 0) {
            class179.method1287(false, class16.field259);
            class154.field2254++;
        }
        if (arg0 == 1) {
            class206.field2911++;
            class179.method1287(false, class127.field1804);
        }
        class75.field1006.method629((byte) 88, class382.field5821.method705((byte) 43, 82) ? 1 : 0);
        class75.field1006.method582(-87, class437.field6477 + arg2);
        class75.field1006.method589(class82.field1105 + arg1, false);
        if (arg3 == -21299) {
            class390.field5913 = false;
            class112.field1573 = arg1;
            class479.field7009 = arg2;
            class515.method3063((byte) -63);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBI)V")
    public void method10(int arg0, byte arg1, int arg2) {
        field22++;
        this.field3[arg2] = arg1;
        if (arg0 != 4096) {
            method2(-5, -82, -15, -107, -61);
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class1(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field13 = (int) (arg6 * 4096.0F);
        this.field8 = (int) (arg7 * 4096.0F);
        this.field2 = this.field12 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V")
    public static void method11(int arg0) {
        field7 = null;
        field16 = null;
        if (arg0 != -927179380) {
            method3(-80);
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
    public final void method12(byte arg0) {
        this.field1 >>= 0x4;
        field14++;
        this.field2 = this.field12;
        if (arg0 < 87) {
            return;
        }
        if (this.field1 < 0) {
            this.field1 = 0;
        } else if (this.field1 > 255) {
            this.field1 = 255;
        }
        this.method10(4096, (byte) this.field1, this.field18++);
        this.field1 = 0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method13(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
