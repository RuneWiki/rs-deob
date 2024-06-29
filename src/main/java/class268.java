import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class268 extends class84 {

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    private int field4324;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "[I")
    public static int[] field4330 = new int[256];

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "Lcc;")
    public static class216 field4331;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field4333;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (arg1 >= 87) {
            ++field4323;
            if (~arg2 == -1) {
                this.field4324 = (arg0.method1111(255) << 12) / 255;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZBLjava/lang/String;)V")
    public static final void method1859(boolean arg0, byte arg1, String arg2) {
        ++field4322;
        int var3 = 5 / ((60 - arg1) / 39);
        String var4 = arg2.toLowerCase();
        int var5 = arg0 ? 32768 : 0;
        short[] var6 = new short[16];
        int var7 = var5 - -(arg0 ? class252.field4169 : class270.field4363);
        int var8 = 0;
        for (int var9 = var5; ~var9 > ~var7; ++var9) {
            class177 var12 = class288.method1958(-28264, var9);
            if (var12.field2868 && ~var12.method1326(-61).toLowerCase().indexOf(var4) != 0) {
                if (~var8 <= -51) {
                    class144.field2336 = -1;
                    class209.field3355 = null;
                    return;
                }
                if (~var8 <= ~var6.length) {
                    short[] var13 = new short[var6.length * 2];
                    for (int var14 = 0; var14 < var8; ++var14) {
                        var13[var14] = var6[var14];
                    }
                    var6 = var13;
                }
                var6[var8++] = (short) var9;
            }
        }
        class144.field2336 = var8;
        String[] var10 = new String[class144.field2336];
        class209.field3355 = var6;
        class108.field1563 = 0;
        for (int var11 = 0; class144.field2336 > var11; ++var11) {
            var10[var11] = class288.method1958(-28264, var6[var11]).method1326(-62);
        }
        class81.method595(14366, var10, class209.field3355);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (arg0 > -125) {
            this.field4324 = 102;
        }
        if (super.field1228.field3651) {
            class158.method1180(var3, 0, class20.field221, this.field4324);
        }
        ++field4326;
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILjava/awt/Component;)Ln;")
    public static final class16 method1860(int arg0, int arg1, int arg2, Component arg3) {
        ++field4329;
        try {
            if (arg2 != 100) {
                field4333 = null;
            }
            Class var4 = Class.forName("qf");
            class16 var5 = (class16) var4.newInstance();
            var5.method117(arg1, arg2 ^ 103, arg0, arg3);
            return var5;
        } catch (Throwable var7) {
            class283 var6 = new class283();
            var6.method117(arg1, arg2 ^ 103, arg0, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I")
    public static final int method1861(int arg0, int arg1) {
        ++field4327;
        return arg1 != 27947 ? -48 : arg0 & 255;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class268() {
        this(4096);
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(I)V")
    public class268(int arg0) {
        super(0, true);
        this.field4324 = 4096;
        this.field4324 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method1862(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg0) {
            field4333 = null;
        }
        if (class272.field4374 <= arg2 - arg5 && class211.field3386 >= arg2 + arg5 && class207.field3328 <= arg4 - arg5 && arg4 - -arg5 <= class228.field3657) {
            class55.method413(arg4, arg3, arg5, arg1, 0, arg2, arg6);
        } else {
            class222.method1589((byte) -47, arg2, arg1, arg5, arg6, arg3, arg4);
        }
        ++field4328;
    }

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "(I)V")
    public static void method1863(int arg0) {
        field4333 = null;
        field4331 = null;
        if (arg0 != 255) {
            method1864(-92);
        }
        field4330 = null;
    }

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "(I)V")
    public static final void method1864(int arg0) {
        if (arg0 <= 19) {
            field4332 = 126;
        }
        ++field4325;
        class226.field3630.method1556((byte) 83);
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if ((1 & var1) == 1) {
                    var1 = var1 >>> 1 ^ -306674912;
                } else {
                    var1 >>>= 1;
                }
            }
            field4330[var0] = var1;
        }
        field4331 = new class216(30);
        field4333 = new String[100];
        field4332 = -1;
    }
}
