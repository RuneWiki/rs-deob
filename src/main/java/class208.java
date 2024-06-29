import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class208 extends class570 {

    @OriginalMember(owner = "client!uea", name = "l", descriptor = "I")
    public static int field2782 = 1401;

    @OriginalMember(owner = "client!uea", name = "p", descriptor = "[Lhca;")
    public static class186[] field2786 = new class186[14];

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!uea", name = "m", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!uea", name = "n", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!uea", name = "o", descriptor = "Lga;")
    public static class332 field2785;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uea", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field2787;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IZ)V")
    public static final void method1319(int arg0, boolean arg1) {
        field2780++;
        class276.method1656(-896460184);
        if (!class96.method543(-12756, class576.field7861)) {
            return;
        }
        if (arg0 != -21306) {
            field2786 = null;
        }
        class309.field4164++;
        if (class309.field4164 < 50 && !arg1) {
            return;
        }
        class309.field4164 = 0;
        if (!class447.field5920 && class163.field2346 != null) {
            class580.field7921++;
            class229 var2 = class97.method550(class71.field841, false, class565.field7704);
            class307.method1805(var2, -14704);
            try {
                class493.method2814(-30301);
            } catch (IOException var3) {
                class447.field5920 = true;
            }
        }
        class276.method1656(-896460184);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2777++;
        if (arg0 != 150) {
            field2784 = -61;
        }
        if (arg6 < 0 || arg1 < 0 || arg6 >= class703.field9886 - 1 || (class431.field5789 - 1) <= arg1) {
            return;
        }
        if (class153.field2168 == null) {
            return;
        }
        if (arg5 != 0) {
            if (arg5 == 1) {
                class599 var8 = (class599) class595.method3304(arg7, arg6, arg1);
                if (var8 != null) {
                    if (var8 instanceof class681) {
                        ((class681) var8).field9660.method60(arg3, -12);
                        return;
                    }
                    int var9 = var8.method710((byte) 80);
                    if (arg2 != 4 && arg2 != 5) {
                        if (arg2 != 6) {
                            if (arg2 == 7) {
                                class78.method424(arg5, arg3, arg1, 86, var9, arg6, arg7, 4, (arg4 + 2 & 0x3) + 4);
                            } else if (arg2 == 8) {
                                class78.method424(arg5, arg3, arg1, 71, var9, arg6, arg7, 4, arg4 + 4);
                                class78.method424(arg5, arg3, arg1, 47, var9, arg6, arg7, 4, (arg4 + 2 & 0x3) + 4);
                                return;
                            }
                            return;
                        }
                        class78.method424(arg5, arg3, arg1, -121, var9, arg6, arg7, 4, arg4 + 4);
                        return;
                    }
                    class78.method424(arg5, arg3, arg1, 69, var9, arg6, arg7, 4, arg4);
                    return;
                }
            } else if (arg5 == 2) {
                class599 var11 = (class599) class303.method1782(arg7, arg6, arg1, field2787 == null ? (field2787 = method1325("ge")) : field2787);
                if (var11 == null) {
                    return;
                }
                if (arg2 == 11) {
                    arg2 = 10;
                }
                if (var11 instanceof class660) {
                    ((class660) var11).field9415.method60(arg3, -12);
                    return;
                }
                class78.method424(arg5, arg3, arg1, arg0 ^ 0xF1, var11.method710((byte) 97), arg6, arg7, arg2, arg4);
            } else if (arg5 == 3) {
                class599 var10 = (class599) class50.method266(arg7, arg6, arg1);
                if (var10 != null) {
                    if (var10 instanceof class317) {
                        ((class317) var10).field4260.method60(arg3, -12);
                        return;
                    }
                    class78.method424(arg5, arg3, arg1, 43, var10.method710((byte) 64), arg6, arg7, arg2, arg4);
                    return;
                }
            }
            return;
        }
        class599 var12 = (class599) class41.method225(arg7, arg6, arg1);
        class599 var13 = (class599) class573.method3166(arg7, arg6, arg1);
        if (var12 != null && arg2 != 2) {
            if (var12 instanceof class370) {
                ((class370) var12).field4871.method60(arg3, arg0 ^ 0xFFFFFF62);
            } else {
                class78.method424(arg5, arg3, arg1, -119, var12.method710((byte) 107), arg6, arg7, arg2, arg4);
            }
        }
        if (var13 == null) {
            return;
        }
        if (!(var13 instanceof class370)) {
            class78.method424(arg5, arg3, arg1, 49, var13.method710((byte) 68), arg6, arg7, arg2, arg4);
            return;
        }
        ((class370) var13).field4871.method60(arg3, -12);
        return;
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(I)V")
    public static final void method1321(int arg0) {
        field2783++;
        class180.method1206();
        for (int var1 = 0; var1 < 4; var1++) {
            class322.field4302[var1].method3281(0);
        }
        int var2 = 1 % ((-arg0 - 1) / 62);
        class349.method2071(-31428);
        class80.method430((byte) -83);
        System.gc();
    }

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "(I)V")
    public static final void method1322(int arg0) {
        if (class284.field3760 != null) {
            class526[] var1 = class284.field3760;
            for (int var2 = 0; var2 < var1.length; var2++) {
                class526 var3 = var1[var2];
                var3.method146(-120);
            }
        }
        if (arg0 == -31764) {
            field2781++;
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(BLwv;)V")
    public static final void method1323(byte arg0, class423 arg1) {
        field2779++;
        if (arg0 != -109) {
            field2785 = null;
        }
        if (class597.field8219 != arg1.field5619) {
            return;
        }
        if (class408.field5369.field7791 == null) {
            arg1.field5551 = 0;
            arg1.field5643 = 0;
            return;
        }
        arg1.field5711 = 150;
        arg1.field5630 = (int) (Math.sin((double) class327.field4404 / 40.0D) * 256.0D) & 0x7FF;
        arg1.field5558 = 5;
        arg1.field5643 = class423.field5702;
        arg1.field5551 = class287.method1701(class408.field5369.field7791, (byte) -7);
        arg1.field5627 = class408.field5369.field3067;
        arg1.field5680 = 0;
        arg1.field5555 = class408.field5369.field3073;
        arg1.field5572 = class408.field5369.field3008;
        class186 var2 = arg1.field5627 == -1 ? null : class423.field5620.method1707(arg1.field5627, -94);
        if (var2 != null) {
            class407.method2313(arg1.field5572, var2, 255);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Z)V")
    public static void method1324(boolean arg0) {
        if (arg0) {
            field2786 = null;
            field2785 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1325(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
