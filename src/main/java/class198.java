import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class198 extends class220 {

    @OriginalMember(owner = "client!vo", name = "P", descriptor = "I")
    private int field2827 = 0;

    @OriginalMember(owner = "client!vo", name = "Y", descriptor = "I")
    private int field2836 = 4096;

    @OriginalMember(owner = "client!vo", name = "Q", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!vo", name = "T", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!vo", name = "U", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!vo", name = "V", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!vo", name = "W", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!vo", name = "X", descriptor = "I")
    public static int field2835;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vo", name = "Z", descriptor = "Ljava/lang/Class;")
    public static Class field2837;

    @OriginalMember(owner = "client!vo", name = "S", descriptor = "[I")
    public static int[] field2830;

    @OriginalMember(owner = "client!vo", name = "R", descriptor = "[Lgm;")
    public static class337[] field2829;

    // $FF: synthetic method
    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1241(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)V", line = 5)
    public static final void method1237(int arg0) {
        class77.field1055.method204((byte) 56);
        ++field2831;
        class327.field4700.method204((byte) 56);
        if (arg0 != 0) {
            field2830 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(IIII)V", line = 21)
    public static final void method1238(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == -9328) {
            if (arg2 == 1007) {
                class365.method2390(10, arg3, arg0);
            } else if (~arg2 != -1003) {
                if (arg2 != 1010) {
                    if (~arg2 == -1004) {
                        class365.method2390(13, arg3, arg0);
                    } else if (~arg2 == -1005) {
                        class365.method2390(14, arg3, arg0);
                    }
                } else {
                    class365.method2390(12, arg3, arg0);
                }
            } else {
                class365.method2390(11, arg3, arg0);
            }
            ++field2834;
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V", line = 51)
    public class198() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "(I)V", line = 54)
    public static void method1239(int arg0) {
        field2830 = null;
        if (arg0 != -30260) {
            field2829 = null;
        }
        field2829 = null;
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(II)[I", line = 66)
    public final int[] method43(int arg0, int arg1) {
        ++field2828;
        if (arg0 != -11543) {
            return null;
        } else {
            int[] var3 = super.field3125.method2005(arg1, (byte) 77);
            if (super.field3125.field4676) {
                int[] var4 = this.method1366(0, (byte) -40, arg1);
                for (int var5 = 0; ~var5 > ~class344.field5043; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = var6 >= this.field2827 && ~var6 >= ~this.field2836 ? 4096 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(IIII)Z", line = 102)
    public static final boolean method1240(int arg0, int arg1, int arg2, int arg3) {
        ++field2832;
        boolean var4 = true;
        class351 var5 = (class351) class87.method539(arg1, arg3, arg2);
        if (arg0 != -1003) {
            method1240(-21, -24, 123, 119);
        }
        if (var5 != null) {
            var4 &= class58.method395(var5, false);
        }
        class351 var6 = (class351) class312.method1947(arg1, arg3, arg2, field2837 != null ? field2837 : (field2837 = method1241("im")));
        if (var6 != null) {
            var4 &= class58.method395(var6, false);
        }
        class351 var7 = (class351) class135.method910(arg1, arg3, arg2);
        if (var7 != null) {
            var4 &= class58.method395(var7, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBLil;)V", line = 137)
    public final void method2(int arg0, byte arg1, class265 arg2) {
        ++field2833;
        if (arg1 == -49) {
            if (arg0 != 0) {
                if (~arg0 == -2) {
                    this.field2836 = arg2.method1685(arg1 ^ -8089);
                }
            } else {
                this.field2827 = arg2.method1685(8104);
            }
        }
    }
}
