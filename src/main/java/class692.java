import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class692 {

    @OriginalMember(owner = "client!au", name = "q", descriptor = "Loga;")
    private class158 field9781;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "I")
    private int field9782;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    private int field9765;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "Lefa;")
    private class322 field9778;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field9766;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public static int field9768;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "I")
    public static int field9769;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public static int field9770;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    public static int field9771;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "I")
    public static int field9772;

    @OriginalMember(owner = "client!au", name = "i", descriptor = "I")
    public static int field9773;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "I")
    public static int field9774;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "I")
    public static int field9775;

    @OriginalMember(owner = "client!au", name = "l", descriptor = "I")
    public static int field9776;

    @OriginalMember(owner = "client!au", name = "m", descriptor = "I")
    public static int field9777;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "I")
    public static int field9779;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "I")
    public static int field9780;

    @OriginalMember(owner = "client!au", name = "s", descriptor = "I")
    public static int field9783;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "I")
    public static int field9784;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
    public final void method3890(int arg0) {
        field9767++;
        if (arg0 != -1) {
            this.field9782 = 87;
        }
        this.field9781.method1125(true);
        this.field9778.method1995((byte) -123);
        this.field9765 = this.field9782;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V")
    public final void method3891(int arg0) {
        if (arg0 != 13747) {
            this.field9781 = null;
        }
        for (class431 var2 = (class431) this.field9781.method1126(119); var2 != null; var2 = (class431) this.field9781.method1128(arg0 - 13736)) {
            if (var2.method40(arg0 - 13665)) {
                var2.method2360((byte) 66);
                var2.method1989((byte) 114);
                this.field9765 += var2.field6267;
            }
        }
        field9768++;
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(I)I")
    public final int method3892(int arg0) {
        field9780++;
        int var2 = arg0;
        for (class431 var3 = (class431) this.field9781.method1126(105); var3 != null; var3 = (class431) this.field9781.method1128(11)) {
            if (!var3.method40(arg0 ^ 0x1E)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!au", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method3893(int arg0) {
        if (arg0 != -15482) {
            return null;
        }
        field9773++;
        class431 var2 = (class431) this.field9778.method1997(9831);
        while (var2 != null) {
            Object var3 = var2.method38(arg0 + 15486);
            if (var3 != null) {
                return var3;
            }
            class431 var4 = var2;
            var2 = (class431) this.field9778.method1997(9831);
            var4.method2360((byte) 66);
            var4.method1989((byte) 125);
            this.field9765 += var4.field6267;
        }
        return null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljava/lang/Object;BJ)V")
    public final void method3894(Object arg0, byte arg1, long arg2) {
        if (arg1 != 60) {
            this.method3891(8);
        }
        field9776++;
        this.method3897(arg0, arg2, 1, arg1 ^ 0xFFFFFFC3);
    }

    @OriginalMember(owner = "client!au", name = "e", descriptor = "(I)I")
    public final int method3895(int arg0) {
        int var2 = -35 % ((arg0 + 29) / 50);
        field9774++;
        return this.field9765;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IJ)V")
    private final void method3896(int arg0, long arg1) {
        field9777++;
        if (arg0 != 1) {
            this.method3901(-123L, 97);
        }
        class431 var4 = (class431) this.field9778.method2002((byte) -107, arg1);
        this.method3904((byte) 13, var4);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljava/lang/Object;JII)V")
    public final void method3897(Object arg0, long arg1, int arg2, int arg3) {
        field9770++;
        if (this.field9782 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method3896(1, arg1);
        this.field9765 -= arg2;
        while (this.field9765 < 0) {
            class431 var7 = (class431) this.field9781.method1132(arg3);
            this.method3904((byte) 13, var7);
        }
        class7 var6 = new class7(arg0, arg2);
        this.field9778.method2001(-108, var6, arg1);
        this.field9781.method1134(var6, arg3);
        var6.field4679 = 0L;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)J")
    public static final long method3898(boolean arg0) {
        field9771++;
        return arg0 ? 27L : class639.field9177.method1351(0);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)I")
    public final int method3899(byte arg0) {
        field9784++;
        if (arg0 != -78) {
            this.field9782 = 50;
        }
        return this.field9782;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)V")
    public final void method3900(int arg0, int arg1) {
        field9769++;
        if (arg1 != 0 || class508.field7174 == null) {
            return;
        }
        for (class431 var3 = (class431) this.field9781.method1126(-104); var3 != null; var3 = (class431) this.field9781.method1128(arg1 ^ 0xB)) {
            if (var3.method40(arg1 + 30)) {
                if (var3.method38(arg1 ^ 0x4) == null) {
                    var3.method2360((byte) 66);
                    var3.method1989((byte) 38);
                    this.field9765++;
                }
            } else if ((++var3.field4679) > ((long) arg0)) {
                class431 var4 = class508.field7174.method158(var3, (byte) 102);
                this.field9778.method2001(-89, var4, var3.field5740);
                class70.method411(var4, (byte) 67, var3);
                var3.method2360((byte) 66);
                var3.method1989((byte) 80);
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method3901(long arg0, int arg1) {
        field9775++;
        class431 var4 = (class431) this.field9778.method2002((byte) -107, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method38(4);
        if (var5 == null) {
            var4.method2360((byte) 66);
            var4.method1989((byte) 93);
            this.field9765 += var4.field6267;
            return null;
        }
        if (var4.method40(35)) {
            class7 var6 = new class7(var5, var4.field6267);
            this.field9778.method2001(117, var6, var4.field5740);
            this.field9781.method1134(var6, -1);
            var6.field4679 = 0L;
            var4.method2360((byte) 66);
            var4.method1989((byte) 126);
        } else {
            this.field9781.method1134(var4, -1);
            var4.field4679 = 0L;
        }
        if (arg1 > -43) {
            this.field9782 = 94;
        }
        return var5;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method3902(byte arg0) {
        field9766++;
        int var2 = 59 % ((-arg0 - 29) / 54);
        class431 var3 = (class431) this.field9778.method1993(-125);
        while (var3 != null) {
            Object var4 = var3.method38(4);
            if (var4 != null) {
                return var4;
            }
            class431 var5 = var3;
            var3 = (class431) this.field9778.method1997(9831);
            var5.method2360((byte) 66);
            var5.method1989((byte) 43);
            this.field9765 += var5.field6267;
        }
        return null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIII)V")
    public static final void method3903(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9772++;
        if (arg4 != 10754) {
            return;
        }
        if (arg0 >= arg1) {
            class41.method235(arg1, class565.field8253[arg2], 0, arg0, arg3);
        } else {
            class41.method235(arg0, class565.field8253[arg2], 0, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(I)V")
    public class692(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BLgaa;)V")
    private final void method3904(byte arg0, class431 arg1) {
        field9779++;
        if (arg1 != null) {
            arg1.method2360((byte) 66);
            arg1.method1989((byte) 109);
            this.field9765 += arg1.field6267;
        }
        if (arg0 != 13) {
            this.method3904((byte) 114, null);
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(II)V")
    public class692(int arg0, int arg1) {
        this.field9781 = new class158();
        this.field9782 = arg0;
        this.field9765 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && arg1 > var3; var3 += var3) {
        }
        this.field9778 = new class322(var3);
    }
}
