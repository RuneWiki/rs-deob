import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class277 {

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "B")
    public byte field3764;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public int field3760;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "I")
    public int field3767;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "S")
    public short field3771;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "B")
    public byte field3761;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
    public int field3769;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "S")
    public short field3765;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
    public int field3768;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "S")
    public short field3762;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "Z")
    public boolean field3766;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public int field3763;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "I")
    public static int field3770;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vt", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field3772;

    // $FF: synthetic method
    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1611(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V", line = 17)
    public static final void method1610(boolean arg0) {
        for (class316 var1 = (class316) class212.field3021.method3137(0); var1 != null; var1 = (class316) class212.field3021.method3132(0)) {
            if (class103.field1632 == null) {
                var1.method2791((byte) 112);
            } else if (var1.field4281 <= class28.field417) {
                int var2 = class153.field2356[var1.field4299];
                if (var2 == 0) {
                    class168 var9 = class191.method1267(var1.field4282, var1.field4285, var1.field4283);
                    if (var9 instanceof class503) {
                        class291.method1689(var1.field4282, var1.field4285, var1.field4283);
                        class503 var10 = (class503) var9;
                        if (var10.field7360 != null) {
                            class5.method32(var1.field4282, var1.field4285, var1.field4283, var10.field7360, null);
                        }
                    }
                } else if (var2 == 1) {
                    class63 var3 = class506.method3004(var1.field4282, var1.field4285, var1.field4283);
                    if (var3 instanceof class528) {
                        class467.method2719(var1.field4282, var1.field4285, var1.field4283);
                        class528 var4 = (class528) var3;
                        if (var4.field7712 != null) {
                            class258.method1535(var1.field4282, var1.field4285, var1.field4283, var4.field7712, null);
                        }
                    }
                } else if (var2 == 2) {
                    class434 var7 = class377.method2254(var1.field4282, var1.field4285, var1.field4283, field3772 == null ? (field3772 = method1611("bn")) : field3772);
                    if (var7 instanceof class214) {
                        class45.method301(var1.field4282, var1.field4285, var1.field4283, field3772 == null ? (field3772 = method1611("bn")) : field3772);
                        class214 var8 = (class214) var7;
                        if (var8.field3049 != null) {
                            class112.method848(var8.field3049, false);
                        }
                    }
                } else if (var2 == 3) {
                    class167 var5 = class126.method913(var1.field4282, var1.field4285, var1.field4283);
                    if (var5 instanceof class284) {
                        class510.method3023(var1.field4282, var1.field4285, var1.field4283);
                        class284 var6 = (class284) var5;
                        if (var6.field3843 != null) {
                            class141.method987(var1.field4282, var1.field4285, var1.field4283, var6.field3843);
                        }
                    }
                }
                var1.method2791((byte) 112);
            } else if (class28.field417 == var1.field4297) {
                int var11 = class153.field2356[var1.field4299];
                if (var11 == 0) {
                    class168 var21 = class191.method1267(var1.field4282, var1.field4285, var1.field4283);
                    if (var21 instanceof class503) {
                        var1.method2791((byte) 112);
                    } else if (class222.method1383(var1.field4282, var1.field4285, var1.field4283) == null) {
                        class503 var22 = new class503(var1.field4299, var1.field4290, var1.field4287, var1.field4284, var1.field4302, var21);
                        class5.method32(var1.field4282, var1.field4285, var1.field4283, var22, null);
                    } else {
                        var1.method2791((byte) 112);
                    }
                } else if (var11 == 1) {
                    class63 var19 = class506.method3004(var1.field4282, var1.field4285, var1.field4283);
                    if (var19 instanceof class528) {
                        var1.method2791((byte) 112);
                    } else if (class60.method399(var1.field4282, var1.field4285, var1.field4283) == null) {
                        class528 var20 = new class528(var1.field4299, var1.field4290, var1.field4287, var1.field4284, var1.field4302, var19);
                        class258.method1535(var1.field4282, var1.field4285, var1.field4283, var20, null);
                    } else {
                        var1.method2791((byte) 112);
                    }
                } else if (var11 == 2) {
                    class434 var12 = class377.method2254(var1.field4282, var1.field4285, var1.field4283, field3772 == null ? (field3772 = method1611("bn")) : field3772);
                    if (var12 instanceof class214) {
                        var1.method2791((byte) 112);
                    } else {
                        class45.method301(var1.field4282, var1.field4285, var1.field4283, field3772 == null ? (field3772 = method1611("bn")) : field3772);
                        class103 var13 = class452.field6629.method603((byte) 120, var1.field4289);
                        int var14;
                        int var15;
                        if (var1.field4290 == 1 || var1.field4290 == 3) {
                            var14 = var13.field1639;
                            var15 = var13.field1695;
                        } else {
                            var14 = var13.field1695;
                            var15 = var13.field1639;
                        }
                        class214 var16 = new class214(var1.field4299, var1.field4290, var1.field4282, var1.field4287, var1.field4284, var1.field4302, var1.field4285, var1.field4285 + var15 - 1, var1.field4283, var1.field4283 + var14 - 1, var12);
                        class112.method848(var16, false);
                    }
                } else if (var11 == 3) {
                    class167 var17 = class126.method913(var1.field4282, var1.field4285, var1.field4283);
                    if (var17 instanceof class284) {
                        var1.method2791((byte) 112);
                    } else {
                        class284 var18 = new class284(var1.field4287, var1.field4284, var1.field4302, var17);
                        class141.method987(var1.field4282, var1.field4285, var1.field4283, var18);
                    }
                }
            }
        }
        field3770++;
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 223)
    public class277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field3764 = (byte) arg7;
        this.field3760 = arg2;
        this.field3767 = arg1;
        this.field3771 = (short) arg4;
        this.field3761 = (byte) arg8;
        this.field3769 = arg3;
        this.field3765 = (short) arg6;
        this.field3768 = arg0;
        this.field3762 = (short) arg5;
        this.field3766 = arg10;
        this.field3763 = arg11;
    }
}
