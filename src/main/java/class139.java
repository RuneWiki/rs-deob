import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class139 extends class480 {

    @OriginalMember(owner = "client!cu", name = "K", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field2281 = new Rectangle[100];

    @OriginalMember(owner = "client!cu", name = "M", descriptor = "[I")
    public static int[] field2283 = new int[4];

    @OriginalMember(owner = "client!cu", name = "F", descriptor = "Lbd;")
    public static class42 field2276 = class319.method1999((byte) 119);

    @OriginalMember(owner = "client!cu", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field2286 = new String[8];

    @OriginalMember(owner = "client!cu", name = "Q", descriptor = "I")
    public static int field2287 = 0;

    @OriginalMember(owner = "client!cu", name = "G", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!cu", name = "H", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!cu", name = "I", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!cu", name = "J", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!cu", name = "L", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!cu", name = "O", descriptor = "Ljg;")
    public static class215 field2285;

    @OriginalMember(owner = "client!cu", name = "N", descriptor = "[Lig;")
    public static class154[] field2284;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIZ)V")
    public static final void method927(int arg0, int arg1, boolean arg2) {
        ++field2279;
        if (class492.field7478 > class492.field7480) {
            class492.field7480 = (float) ((double) class492.field7480 / 30.0D + (double) class492.field7480);
            if (class492.field7478 < class492.field7480) {
                class492.field7480 = class492.field7478;
            }
            class419.method2454((byte) 125);
            class492.field7481 = (int) class492.field7480 >> 1;
            class492.field7473 = class115.method826(-1, class492.field7481);
        } else if (class492.field7478 < class492.field7480) {
            class492.field7480 = (float) ((double) class492.field7480 - (double) class492.field7480 / 30.0D);
            if (class492.field7480 < class492.field7478) {
                class492.field7480 = class492.field7478;
            }
            class419.method2454((byte) 126);
            class492.field7481 = (int) class492.field7480 >> 1;
            class492.field7473 = class115.method826(-1, class492.field7481);
        }
        if (~class403.field5863 != 0 && class226.field3471 != -1) {
            int var3 = class403.field5863 - class466.field7158;
            if (var3 < 2 || ~var3 < -3) {
                var3 /= 8;
            }
            int var4 = -class264.field3989 + class226.field3471;
            class466.field7158 += var3;
            if (var4 < 2 || ~var4 < -3) {
                var4 /= 8;
            }
            if (var3 == 0 && ~var4 == -1) {
                class226.field3471 = -1;
                class403.field5863 = -1;
            }
            class264.field3989 += var4;
            class419.method2454((byte) 124);
        }
        if (!arg2) {
            field2287 = -103;
        }
        if (class273.field4150 <= 0) {
            class462.field7107 = -1;
            class28.field358 = -1;
        } else {
            --class102.field1822;
            if (class102.field1822 == 0) {
                class102.field1822 = 100;
                --class273.field4150;
            }
        }
        if (class201.field3199 && class177.field2772 != null) {
            for (class25 var5 = (class25) class177.field2772.method8((byte) -98); var5 != null; var5 = (class25) class177.field2772.method17((byte) 44)) {
                class173 var6 = class492.field7472.method1840((byte) 105, var5.field326.field4985);
                if (!var5.method134(arg1, arg0, (byte) -91)) {
                    if (var5.field326.field4984) {
                        var5.field326.field4984 = false;
                        class94.method701(class449.field6916, var5.field326.field4985, var6.field2684);
                    }
                } else {
                    if (var6.field2704 != null) {
                        if (var6.field2704[4] != null) {
                            class221.method1345(var6.field2662, 1001, 0, var6.field2684, -1, true, var6.field2704[4], -1, (byte) -121, (long) var5.field326.field4985, false);
                        }
                        if (var6.field2704[3] != null) {
                            class221.method1345(var6.field2662, 1004, 0, var6.field2684, -1, true, var6.field2704[3], -1, (byte) -121, (long) var5.field326.field4985, false);
                        }
                        if (var6.field2704[2] != null) {
                            class221.method1345(var6.field2662, 1002, 0, var6.field2684, -1, true, var6.field2704[2], -1, (byte) -121, (long) var5.field326.field4985, false);
                        }
                        if (var6.field2704[1] != null) {
                            class221.method1345(var6.field2662, 1003, 0, var6.field2684, -1, true, var6.field2704[1], -1, (byte) -121, (long) var5.field326.field4985, false);
                        }
                        if (var6.field2704[0] != null) {
                            class221.method1345(var6.field2662, 1010, 0, var6.field2684, -1, true, var6.field2704[0], -1, (byte) -121, (long) var5.field326.field4985, false);
                        }
                    }
                    if (!var5.field326.field4984) {
                        var5.field326.field4984 = true;
                        class94.method701(class237.field3580, var5.field326.field4985, var6.field2684);
                    }
                    if (var5.field326.field4984) {
                        class94.method701(class176.field2749, var5.field326.field4985, var6.field2684);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "(I)V")
    public static final void method928(int arg0) {
        class480.field7336 = null;
        class217.field3343 = null;
        class383.field5578 = null;
        class512.field7766 = null;
        class330.field4946 = null;
        class325.field4878 = null;
        ++field2280;
        class54.field820 = null;
        class383.field5570 = null;
        class189.field3022 = null;
        class40.field578 = null;
        field2284 = null;
        class18.field244 = null;
        class493.field7514 = null;
        class144.field2343 = null;
        class7.field89 = null;
        if (arg0 <= 102) {
            method931(47);
        }
        class90.field1629 = null;
        class266.field4026 = null;
        class442.field6679 = null;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZF)V")
    public final void method929(boolean arg0, float arg1) {
        if (!arg0) {
            field2284 = null;
        }
        ++field2278;
        super.field7332 = arg1;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIII)V")
    public final void method930(int arg0, int arg1, int arg2, int arg3) {
        ++field2277;
        if (arg0 > -80) {
            field2281 = null;
        }
        super.field7333 = arg1;
        super.field7327 = arg3;
        super.field7325 = arg2;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IIIIIF)V")
    public class139(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "(I)V")
    public static void method931(int arg0) {
        if (arg0 != -1) {
            method928(-11);
        }
        field2284 = null;
        field2281 = null;
        field2285 = null;
        field2286 = null;
        field2276 = null;
        field2283 = null;
    }
}
