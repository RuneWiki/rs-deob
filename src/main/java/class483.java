import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class483 extends class276 {

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public int field7095;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public int field7096;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public int field7098;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public int field7102;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public int field7103;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public int field7105;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "Lec;")
    public class68 field7099;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "Lec;")
    public class68 field7100;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "Ljava/lang/String;")
    public String field7097;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "Z")
    public boolean field7106;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "[Ljava/lang/Object;")
    public Object[] field7101;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)Z", line = 11)
    public static final boolean method2834(int arg0) {
        field7107++;
        if (arg0 != 0) {
            method2834(98);
        }
        return class191.field2977;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)V", line = 26)
    public static final void method2835(int arg0, int arg1, int arg2) {
        class465 var3 = class66.field977[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field6907 != null) {
            var3.field6907 = null;
        }
        if (var3.field6901 != null) {
            var3.field6901 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V", line = 40)
    public static final void method2836(int arg0) {
        field7104++;
        if (arg0 != -12073) {
            return;
        }
        for (int var1 = 0; var1 < class238.field4104; var1++) {
            class452 var2 = class241.field4163[var1];
            boolean var3 = false;
            if (var2.field6741 == null) {
                var2.field6748--;
                if (var2.field6748 >= (var2.field6750 == 2 ? -1500 : -10)) {
                    if (var2.field6750 == 1 && var2.field6746 == null) {
                        var2.field6746 = class80.method584(class471.field6971, var2.field6742, 0);
                        if (var2.field6746 == null) {
                            continue;
                        }
                        var2.field6748 += var2.field6746.method587();
                    } else if (var2.field6750 == 2 && (var2.field6755 == null || var2.field6753 == null)) {
                        if (var2.field6755 == null) {
                            var2.field6755 = class354.method2275(class298.field4799, var2.field6742);
                        }
                        if (var2.field6755 == null) {
                            continue;
                        }
                        if (var2.field6753 == null) {
                            var2.field6753 = var2.field6755.method2274(new int[] { 22050 });
                            if (var2.field6753 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field6748 < 0) {
                        int var5;
                        if (var2.field6745 == 0) {
                            var5 = class510.field7403.field5119 * var2.field6747 >> 8;
                        } else {
                            int var4 = var2.field6745 >> 24 & 0x3;
                            if (class302.field4850.field4720 == var4) {
                                int var6 = (var2.field6745 & 0xFF) << 7;
                                int var7 = var2.field6745 >> 16 & 0xFF;
                                int var8 = (var7 << 7) + 64 - class302.field4850.field4716;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = (var2.field6745 & 0xFF42) >> 8;
                                int var10 = (var9 << 7) + 64 - class302.field4850.field4714;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 128;
                                if (var11 > var6) {
                                    var2.field6748 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var5 = (var6 - var11) * class510.field7403.field5121 * var2.field6747 / var6 >> 8;
                            } else {
                                var5 = 0;
                            }
                        }
                        if (var5 > 0) {
                            class168 var12 = null;
                            if (var2.field6750 == 1) {
                                var12 = var2.field6746.method586().method1154(class247.field4238);
                            } else if (var2.field6750 == 2) {
                                var12 = var2.field6753;
                            }
                            class341 var13 = var2.field6741 = class341.method2174(var12, 100, var5);
                            var13.method2177(var2.field6744 - 1);
                            class510.field7455.method1740(var13);
                        }
                    }
                } else {
                    var3 = true;
                }
            } else if (!var2.field6741.method1818(false)) {
                var3 = true;
            }
            if (var3) {
                class238.field4104--;
                for (int var14 = var1; var14 < class238.field4104; var14++) {
                    class241.field4163[var14] = class241.field4163[var14 + 1];
                }
                var1--;
            }
        }
        if (class151.field2419 && !class350.method2250(-6257)) {
            if (class510.field7403.field5087 != 0 && class282.field4615 != -1) {
                class264.method1763(1, class29.field472, false, class510.field7403.field5087, class282.field4615, 0);
            }
            class151.field2419 = false;
        } else if (class510.field7403.field5087 != 0 && class282.field4615 != -1 && !class350.method2250(arg0 + 5816)) {
            class265.method1775(-2, class115.field2046);
            class510.field7472++;
            class261.field4357.method152(class282.field4615, (byte) -38);
            class282.field4615 = -1;
        }
    }
}
