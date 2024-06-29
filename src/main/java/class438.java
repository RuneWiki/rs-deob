import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class438 extends class290 implements class518 {

    @OriginalMember(owner = "client!ve", name = "S", descriptor = "Lpe;")
    public class461 field6552;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "Z")
    private boolean field6534;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "[Z")
    public static boolean[] field6536 = new boolean[8];

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!ve", name = "P", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!ve", name = "Q", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!ve", name = "T", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!ve", name = "U", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!ve", name = "V", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!ve", name = "W", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "Lec;")
    public static class68 field6546;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ve", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field6557;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2652(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)I", line = 3)
    public final int method325(int arg0) {
        ++field6556;
        if (arg0 != 5) {
            field6536 = null;
        }
        return this.field6552.method2752(false);
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(Z)Z", line = 17)
    public static final boolean method2648(boolean arg0) {
        ++field6543;
        if (arg0) {
            field6536 = null;
        }
        if (class193.field3011) {
            try {
                class456.method2735(-27001, "showVideoAd", class419.field6342.field7203);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)Z", line = 37)
    public final boolean method33(byte arg0) {
        ++field6555;
        int var2 = -24 / ((8 - arg0) / 45);
        return this.field6552.method2751(-70);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILza;IILvl;Z)V", line = 49)
    public final void method39(int arg0, int arg1, class491 arg2, int arg3, int arg4, class243 arg5, boolean arg6) {
        if (arg0 != 0) {
            this.field6552 = null;
        }
        ++field6542;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V", line = 60)
    public final void method36(boolean arg0) {
        if (!arg0) {
            ++field6540;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lza;III)Z", line = 73)
    public final boolean method27(class491 arg0, int arg1, int arg2, int arg3) {
        ++field6533;
        class530 var5 = this.field6552.method2746(super.field4716, (byte) -117, arg0, 131072, false, super.field4714, false);
        if (var5 == null) {
            return false;
        } else {
            class202 var6 = arg0.method820();
            var6.method1246(super.field4716, super.field4728, super.field4714);
            if (arg1 < 121) {
                method2649((String) null, (String) null, -31);
            }
            return var5.method776(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V", line = 93)
    public final void method31(int arg0) {
        int var2 = -70 % ((57 - arg0) / 48);
        ++field6547;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(ILza;)Lsr;", line = 105)
    public final class430 method40(int arg0, class491 arg1) {
        ++field6553;
        class530 var3 = this.field6552.method2746(super.field4716, (byte) -115, arg1, 2048, true, super.field4714, false);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 >= -24) {
                this.method38(-62);
            }
            class202 var4 = arg1.method820();
            var4.method1246(super.field4716, super.field4728, super.field4714);
            class430 var5 = null;
            if (this.field6534) {
                var5 = class21.method111((byte) 127, 1);
            }
            if (this.field6552.field6824 != null) {
                class66 var6 = this.field6552.field6824.method964();
                arg1.method853(var3, var6, var4, var5 != null ? var5.field6447[0] : null, 0);
            } else {
                var3.method736(var4, var5 == null ? null : var5.field6447[0], 0);
            }
            this.field6552.method2744(arg1, super.field4713, super.field4718, var3, super.field4722, super.field4717, -1, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 145)
    public static final void method2649(String arg0, String arg1, int arg2) {
        ++field6550;
        if (arg2 == -2830) {
            class111.field1965 = -1;
            class150.field2406 = 1;
            class147.method1069(true, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)V", line = 158)
    public static void method2650(int arg0) {
        field6536 = null;
        if (arg0 != 0) {
            field6536 = null;
        }
        field6546 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)Z", line = 169)
    public final boolean method42(boolean arg0) {
        ++field6535;
        return arg0 ? false : false;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lza;Lp;IIIIIZIIIIIII)V", line = 185)
    public class438(class491 arg0, class39 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field573 == 1, class115.method920(arg13, -83, arg12));
        this.field6552 = new class461(arg0, arg1, arg12, arg13, super.field4720, arg3, arg4, arg6, arg7, arg14);
        this.field6534 = ~arg1.field618 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILza;)V", line = 195)
    public final void method34(int arg0, class491 arg1) {
        ++field6549;
        if (arg0 != 25747) {
            field6536 = null;
        }
        this.field6552.method2750(arg1, (byte) 121);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I", line = 208)
    public final int method29(int arg0) {
        ++field6538;
        int var2 = 19 / ((arg0 - 40) / 52);
        return this.field6552.field6856;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(BLza;)V", line = 218)
    public final void method43(byte arg0, class491 arg1) {
        ++field6545;
        class530 var3 = this.field6552.method2746(super.field4716, (byte) -116, arg1, 262144, true, super.field4714, true);
        if (var3 != null) {
            this.field6552.method2744(arg1, super.field4713, super.field4718, var3, super.field4722, super.field4717, -1, false);
        }
        if (arg0 != 35) {
            method2650(111);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILza;I)Le;", line = 234)
    public final class530 method32(int arg0, class491 arg1, int arg2) {
        ++field6539;
        int var4 = 28 / ((-24 - arg2) / 60);
        return this.field6552.method2746(0, (byte) -124, arg1, arg0, false, 0, false);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)I", line = 244)
    public final int method38(int arg0) {
        ++field6544;
        return arg0 != 5638 ? -73 : this.field6552.field6842;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLza;)V", line = 260)
    public final void method26(byte arg0, class491 arg1) {
        ++field6548;
        this.field6552.method2748((byte) 122, arg1);
        if (arg0 != 111) {
            field6546 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)V", line = 272)
    public static final void method2651(byte arg0) {
        if (class493.field7198 != 2) {
            try {
                Method var1 = (field6557 != null ? field6557 : (field6557 = method2652("java.lang.Runtime"))).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class101.field1668 = 1 + (int) (var3 / 1048576L);
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        } else {
            class101.field1668 = 96;
        }
        if (arg0 <= -38) {
            ++field6554;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)I", line = 307)
    public final int method28(byte arg0) {
        ++field6551;
        if (arg0 != -118) {
            this.method29(-128);
        }
        return this.field6552.field6843;
    }
}
