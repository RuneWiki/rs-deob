import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class164 extends class174 {

    @OriginalMember(owner = "client!es", name = "q", descriptor = "I")
    public int field2381 = -1;

    @OriginalMember(owner = "client!es", name = "t", descriptor = "I")
    public int field2384 = -1;

    @OriginalMember(owner = "client!es", name = "x", descriptor = "Lap;")
    public static class310 field2388 = new class310(51, 11);

    @OriginalMember(owner = "client!es", name = "C", descriptor = "Lrc;")
    public static class108 field2393 = new class108(73, -1);

    @OriginalMember(owner = "client!es", name = "E", descriptor = "Lch;")
    public static class151 field2395 = new class151(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!es", name = "p", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!es", name = "s", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!es", name = "u", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!es", name = "w", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!es", name = "y", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!es", name = "z", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!es", name = "A", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!es", name = "B", descriptor = "I")
    public int field2392;

    @OriginalMember(owner = "client!es", name = "D", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!es", name = "F", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!es", name = "G", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(B)V", line = 19)
    public static void method1207(byte arg0) {
        field2388 = null;
        int var1 = -74 % ((17 - arg0) / 49);
        field2395 = null;
        field2393 = null;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lcf;IZLvc;I)V", line = 31)
    public static final void method1208(class92 arg0, int arg1, boolean arg2, class89 arg3, int arg4) {
        ++field2380;
        class135.field1887.method773(-1568);
        if (!class312.field4419) {
            for (class266 var5 = (class266) arg0.method775(1); var5 != null; var5 = (class266) arg0.method763(0)) {
                class76 var6 = class330.field4569.method2321(var5.field3826, arg2);
                if (class118.method919(var6, -18334)) {
                    boolean var7 = class398.method2395(arg4, var5, var6, arg1, -16025, arg3);
                    if (var7) {
                        class332.method2087(var6, var5, -1, arg3);
                    }
                }
            }
            if (!arg2) {
                field2396 = -49;
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILvc;II)Z", line = 65)
    public final boolean method77(int arg0, class89 arg1, int arg2, int arg3) {
        ++field2382;
        class257 var5 = arg1.method306();
        var5.method96(super.field2643, super.field2654, super.field2652);
        class468 var6 = class373.field5128.method1644(this.field2397, 107).method1124(this.field2394, 0, (byte) -110, 65536, arg1, -1, arg0, (class303) null, (class424) null);
        if (var6 != null && var6.method1593(arg2, arg3, var5, true)) {
            return true;
        } else {
            if (this.field2384 != -1) {
                class468 var7 = class373.field5128.method1644(this.field2384, 119).method1124(this.field2392, 0, (byte) -108, 65536, arg1, -1, 0, (class303) null, (class424) null);
                if (var7 != null && var7.method1593(arg2, arg3, var5, true)) {
                    return true;
                }
            }
            if (~this.field2381 != 0) {
                class468 var8 = class373.field5128.method1644(this.field2381, 84).method1124(this.field2383, 0, (byte) -94, 65536, arg1, -1, 0, (class303) null, (class424) null);
                if (var8 != null && var8.method1593(arg2, arg3, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)I", line = 100)
    public static final int method1209(int arg0) {
        ++field2391;
        if (arg0 != 13) {
            field2393 = null;
        }
        if (class464.field6538 == null) {
            if (!class205.field3005 && ~class303.field4310 < -1) {
                if (class243.field3533 && class162.field2363.method1820((byte) -96, 81) && class303.field4310 > 2) {
                    return ((class73) class6.field38.field1299.field6388.field6388).field1049;
                }
                return ((class73) class6.field38.field1299.field6388).field1049;
            }
            int var1 = class175.field2661.method1625((byte) -128);
            int var2 = class175.field2661.method1617(false);
            int var3 = class104.field1469;
            int var4 = class167.field2424;
            int var5 = class315.field4455;
            if (~var3 > ~var1 && ~var1 > ~(var3 + var5)) {
                int var6 = -1;
                for (int var7 = 0; var7 < class303.field4310; ++var7) {
                    if (class128.field1746) {
                        int var11 = var4 + 33 - -((class303.field4310 + -1 + -var7) * 16);
                        if (~var2 < ~(var11 - 13) && ~(var11 + 3) <= ~var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class303.field4310 + -1 + -var7) * 16 + 31 + var4;
                        if (var2 > var12 - 13 && var2 <= var12 + 3) {
                            var6 = var7;
                        }
                    }
                }
                if (~var6 != 0) {
                    int var8 = 0;
                    class450 var9 = new class450(class6.field38);
                    for (class73 var10 = (class73) var9.method2717(-17927); var10 != null; var10 = (class73) var9.method2720(-118)) {
                        if (~(var8++) == ~var6) {
                            return var10.field1049;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)I", line = 198)
    public static final int method1210(boolean arg0) {
        ++field2386;
        if (arg0) {
            method1209(-18);
        }
        if (class342.field4718) {
            return 0;
        } else if (!class435.method2628(2)) {
            return 1;
        } else {
            return class362.field4981 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(III)V", line = 217)
    public static final void method1211(int arg0, int arg1, int arg2) {
        ++field2390;
        int var3 = class409.field5605 * arg1 >> 8;
        if (~arg2 == 0 && !class468.field6598) {
            class365.method2242(0);
        } else if (arg2 != -1 && (class290.field4117 != arg2 || !class56.method519((byte) 17)) && var3 != 0 && !class468.field6598) {
            class1.method3(false, var3, 0, true, class38.field473, 2, arg2);
        }
        class290.field4117 = arg2;
        if (arg0 > -47) {
            field2393 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lvc;I)Lep;", line = 243)
    public final class309 method69(class89 arg0, int arg1) {
        ++field2385;
        class257 var3 = arg0.method306();
        var3.method96(super.field2643, super.field2654, super.field2652);
        class309 var4 = class163.method1205((byte) 40, 3);
        if (this.field2381 != -1) {
            class468 var5 = class373.field5128.method1644(this.field2381, 112).method1124(this.field2383, 0, (byte) -71, 1024, arg0, -1, 0, (class303) null, (class424) null);
            if (var5 != null) {
                var5.method1592(var3, var4.field4383[2], 0);
            }
        }
        if (arg1 != 10228) {
            method1208((class92) null, 26, false, (class89) null, 82);
        }
        if (~this.field2384 != 0) {
            class468 var6 = class373.field5128.method1644(this.field2384, 85).method1124(this.field2392, 0, (byte) 67, 1024, arg0, -1, 0, (class303) null, (class424) null);
            if (var6 != null) {
                var6.method1592(var3, var4.field4383[1], 0);
            }
        }
        class468 var7 = class373.field5128.method1644(this.field2397, 122).method1124(this.field2394, 0, (byte) 102, 1024, arg0, -1, 0, (class303) null, (class424) null);
        if (var7 != null) {
            var7.method1592(var3, var4.field4383[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(ZLvc;)V", line = 287)
    public final void method86(boolean arg0, class89 arg1) {
        ++field2389;
        if (arg0) {
            this.method69((class89) null, 112);
        }
    }
}
