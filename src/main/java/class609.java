import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class609 {

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "S")
    public short field9031;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "S")
    public short field9026;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public int field9036;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public int field9029;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "B")
    public byte field9028;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public int field9030;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Z")
    public boolean field9039;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public int field9027;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public int field9032;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "S")
    public short field9038;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "B")
    public byte field9035;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Llu;")
    public static class610 field9040 = new class610(42, 3);

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Llu;")
    public static class610 field9042 = new class610(47, 3);

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Laq;")
    public static class141 field9043 = new class141(1);

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Lha;")
    public static class53 field9044;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZII)I")
    public static final int method3578(boolean arg0, int arg1, int arg2) {
        field9037++;
        if (arg0) {
            return -1;
        } else if (arg1 == -1) {
            return 12345678;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
    public static final Object method3579(byte[] arg0, int arg1, boolean arg2) {
        field9034++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 < arg0.length && !class488.field6952) {
            try {
                class291 var3 = (class291) Class.forName("dv").getDeclaredConstructor().newInstance();
                var3.method1794(21, arg0);
                return var3;
            } catch (Throwable var4) {
                class488.field6952 = true;
            }
        }
        return arg2 ? class631.method3677(3453, arg0) : arg0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)I")
    public static final int method3580(boolean arg0) {
        field9041++;
        if (!arg0) {
            return 53;
        } else if (class99.field1448 == null) {
            return class624.field9195 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static void method3581(byte arg0) {
        if (arg0 == -115) {
            field9043 = null;
            field9042 = null;
            field9040 = null;
            field9044 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLica;Z)V")
    public static final void method3582(boolean arg0, class571 arg1, boolean arg2) {
        field9033++;
        if (class103.field1484 >= 400) {
            return;
        }
        if (arg0) {
            method3582(false, null, true);
        }
        class87 var3 = arg1.field8405;
        if (var3.field1314 != null) {
            var3 = var3.method655((byte) 108, class556.field8280);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field1294) {
            return;
        }
        String var4 = var3.field1268;
        if (var3.field1240 != 0) {
            String var5 = class348.field4768 == class143.field2006 ? class5.field40.method3408(125, class63.field795) : class101.field1464.method3408(110, class63.field795);
            var4 = var4 + class341.method2092(class541.field8119.field5165, var3.field1240, (byte) -41) + " (" + var5 + var3.field1240 + ")";
        }
        if (!class606.field9002) {
            if (!arg2) {
                String[] var6 = var3.field1305;
                if (class324.field4467) {
                    var6 = class221.method1428(5, var6);
                }
                if (var6 != null) {
                    for (int var7 = 4; var7 >= 0; var7--) {
                        if (var6[var7] != null && (var3.field1303 == 0 || !var6[var7].equalsIgnoreCase(class624.field9189.method3408(82, class63.field795)))) {
                            byte var8 = 0;
                            if (var7 == 0) {
                                var8 = 45;
                            }
                            int var9 = class414.field5625;
                            if (var7 == 1) {
                                var8 = 46;
                            }
                            if (var7 == 2) {
                                var8 = 47;
                            }
                            if (var7 == 3) {
                                var8 = 11;
                            }
                            if (var3.field1290 == var7) {
                                var9 = var3.field1281;
                            }
                            if (var7 == 4) {
                                var8 = 3;
                            }
                            if (var3.field1263 == var7) {
                                var9 = var3.field1292;
                            }
                            class616.field9110++;
                            class335.method2049(0, var6[var7].equalsIgnoreCase(class624.field9189.method3408(85, class63.field795)) ? var3.field1312 : var9, (long) arg1.field1904, 122, true, var8, var6[var7], false, -1, 0, "<col=ffff00>" + var4);
                        }
                    }
                }
                if (var3.field1303 == 1 && var6 != null) {
                    for (int var10 = 4; var10 >= 0; var10--) {
                        if (var6[var10] != null && var6[var10].equalsIgnoreCase(class624.field9189.method3408(76, class63.field795))) {
                            short var11 = 0;
                            if (var3.field1240 > class541.field8119.field5165) {
                                var11 = 2000;
                            }
                            short var12 = 0;
                            if (var10 == 0) {
                                var12 = 45;
                            }
                            if (var10 == 1) {
                                var12 = 46;
                            }
                            if (var10 == 2) {
                                var12 = 47;
                            }
                            if (var10 == 3) {
                                var12 = 11;
                            }
                            if (var10 == 4) {
                                var12 = 3;
                            }
                            if (var12 != 0) {
                                var12 += var11;
                            }
                            class130.field1803++;
                            class335.method2049(0, var3.field1312, (long) arg1.field1904, 123, true, var12, var6[var10], false, -1, 0, "<col=ffff00>" + var4);
                        }
                    }
                }
            }
            class335.method2049(0, class40.field478, (long) arg1.field1904, 123, true, 1006, class184.field2761.method3408(81, class63.field795), arg2, -1, 0, "<col=ffff00>" + var4);
            class621.field9153++;
        } else if (!arg2) {
            class178 var13 = class247.field3553 == -1 ? null : class516.field7358.method1274(112, class247.field3553);
            if ((class364.field4945 & 0x2) != 0) {
                if (var13 == null || var3.method659(-109, var13.field2720, class247.field3553) != var13.field2720) {
                    class532.field7932++;
                    class335.method2049(0, class402.field5501, (long) arg1.field1904, 122, true, 30, class217.field3182, false, -1, 0, class537.field8008 + " -> <col=ffff00>" + var4);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field9031 = (short) arg5;
        this.field9026 = (short) arg6;
        this.field9036 = arg2;
        this.field9029 = arg0;
        this.field9028 = (byte) arg8;
        this.field9030 = arg1;
        this.field9039 = arg10;
        this.field9027 = arg3;
        this.field9032 = arg11;
        this.field9038 = (short) arg4;
        this.field9035 = (byte) arg7;
    }
}
