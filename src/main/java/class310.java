import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class310 extends class747 implements class247 {

    @OriginalMember(owner = "client!le", name = "z", descriptor = "D")
    public static double field4317;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field4318;

    // $FF: synthetic field
    @OriginalMember(owner = "client!le", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field4319;

    // $FF: synthetic method
    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2022(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lbga;IZ[[I)V", line = 5)
    public class310(class358 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class746.field10332, class523.field7249, arg1 * arg1 * 6, arg2);
        super.field10335.method4097((byte) -109, this);
        if (!arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                OpenGL.glTexImage2Di(var5 + 34069, 0, this.method4164(121), arg1, arg1, 0, class175.method1310(110, super.field10337), super.field10335.field5169, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                this.method4169(arg1, arg1, arg3[var6], var6 + 34069, 255);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 46)
    public static final void method2019(int arg0) {
        ++field4316;
        class470 var1 = null;
        try {
            class622 var2 = class689.field9299.method1207((byte) -46, "", true);
            while (var2.field8462 == 0) {
                class700.method3916((byte) -122, 1L);
            }
            if (~var2.field8462 == -2) {
                var1 = (class470) var2.field8463;
                class215 var3 = class693.field9368.method2063(24);
                var1.method2770((byte) 114, 0, var3.field3109, var3.field3066);
            }
        } catch (Exception var5) {
        }
        try {
            if (arg0 != 37) {
                field4317 = -0.46512114956219314D;
            }
            if (var1 != null) {
                var1.method2769(false);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)I", line = 84)
    public static final int method2020(int arg0) {
        ++field4318;
        if ((double) class489.field6771 == 3.0D) {
            return 37;
        } else if (arg0 != 37) {
            return 11;
        } else if ((double) class489.field6771 == 4.0D) {
            return 50;
        } else if ((double) class489.field6771 == 6.0D) {
            return 75;
        } else {
            return (double) class489.field6771 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIB)Z", line = 110)
    public static final boolean method2021(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 38) {
            return false;
        } else {
            ++field4315;
            class258 var4 = (class258) class28.method398(arg0, arg1, arg2);
            boolean var5 = true;
            if (var4 != null) {
                var5 &= class291.method1914(var4, -1);
            }
            class258 var6 = (class258) class562.method3228(arg0, arg1, arg2, field4319 != null ? field4319 : (field4319 = method2022("se")));
            if (var6 != null) {
                var5 &= class291.method1914(var6, -1);
            }
            class258 var7 = (class258) class12.method112(arg0, arg1, arg2);
            if (var7 != null) {
                var5 &= class291.method1914(var7, -1);
            }
            return var5;
        }
    }
}
