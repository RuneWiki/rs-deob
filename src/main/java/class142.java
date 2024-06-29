import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public abstract class class142 {

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field1683 = 0;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field1687 = 0;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "Z")
    public static boolean field1688 = false;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[B)Z")
    public static final boolean method876(int arg0, byte[] arg1) {
        field1685++;
        class179 var2 = new class179(arg1);
        int var3 = var2.method1094(255);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method1094(255) == 1;
        if (var4) {
            class409.method2423(var2, 88);
        }
        class154.method954((byte) 59, var2);
        if (arg0 != -3671) {
            method878(102);
        }
        return true;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lmb;)V")
    public static final void method877(class410 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            class410 var2 = null;
            for (class410 var3 = class684.field9445[var1]; var3 != null; var3 = var3.field5793) {
                if (arg0 == var3) {
                    if (var2 == null) {
                        class684.field9445[var1] = var3.field5793;
                    } else {
                        var2.field5793 = var3.field5793;
                    }
                    class571.field7967 = true;
                    return;
                }
                var2 = var3;
            }
            class410 var4 = null;
            for (class410 var5 = class466.field6722[var1]; var5 != null; var5 = var5.field5793) {
                if (arg0 == var5) {
                    if (var4 == null) {
                        class466.field6722[var1] = var5.field5793;
                    } else {
                        var4.field5793 = var5.field5793;
                    }
                    class571.field7967 = true;
                    return;
                }
                var4 = var5;
            }
            class410 var6 = null;
            for (class410 var7 = class293.field3797[var1]; var7 != null; var7 = var7.field5793) {
                if (arg0 == var7) {
                    if (var6 == null) {
                        class293.field3797[var1] = var7.field5793;
                    } else {
                        var6.field5793 = var7.field5793;
                    }
                    class571.field7967 = true;
                    return;
                }
                var6 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static final void method878(int arg0) {
        if (class340.field4393 == null) {
            class340.field4393 = class218.method1317(85);
            class147.field1776 = class340.field4393[0];
            class551.field7749 = class97.method654((byte) 46);
        }
        field1684++;
        if (class733.field10249 == null) {
            class4.method16(200);
        }
        if (arg0 != 1) {
            return;
        }
        class218 var1 = class147.field1776;
        int var2 = class518.method2977((byte) -124);
        if (class147.field1776 == var1) {
            class335.field4306 = class147.field1776.field2747.method3261(class416.field5920, (byte) 82);
            if (class147.field1776.field2751) {
                class157.field2026 = class147.field1776.field2749 + ((class147.field1776.field2743 - class147.field1776.field2749) * var2 / 100);
            }
            if (class147.field1776.field2746) {
                class335.field4306 = class335.field4306 + class157.field2026 + "%";
            }
        } else if (class218.field2771 == class147.field1776) {
            class733.field10249 = null;
            class614.method3369(3, (byte) -66);
        } else {
            class335.field4306 = var1.field2740.method3261(class416.field5920, (byte) 82);
            class157.field2026 = var1.field2743;
            if (class147.field1776.field2746) {
                class335.field4306 = class335.field4306 + var1.field2743 + "%";
            }
            if (class147.field1776.field2751 || var1.field2751) {
                class551.field7749 = class97.method654((byte) 51);
            }
        }
        if (class733.field10249 == null) {
            return;
        }
        class733.field10249.method2372(class335.field4306, class147.field1776, class157.field2026, class551.field7749, (byte) -77);
        if (class755.field10520 == null) {
            return;
        }
        for (int var3 = class567.field7917 + 1; var3 < class755.field10520.length; var3++) {
            if (class755.field10520[var3].method235(9642) >= 100 && var3 - 1 == class567.field7917 && class668.field9150 >= 1 && class733.field10249.method2371(4782)) {
                try {
                    class755.field10520[var3].method241(77);
                } catch (Exception var4) {
                    class755.field10520 = null;
                    return;
                }
                class733.field10249.method2373((byte) -58, class755.field10520[var3]);
                class567.field7917++;
                if (class567.field7917 >= class755.field10520.length - 1 && class755.field10520.length > 1) {
                    class567.field7917 = class41.field627.method939(-21122) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method879(int arg0, String arg1, int arg2, String arg3) {
        field1686++;
        class202.field2576 = arg0;
        class643.field8880 = arg2;
        class406.method2407(-1591, arg3, false, arg1);
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)J")
    public abstract long method557(int arg0);
}
