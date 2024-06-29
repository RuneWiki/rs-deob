import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class296 extends class302 {

    @OriginalMember(owner = "client!op", name = "B", descriptor = "I")
    public static int field3993 = 0;

    @OriginalMember(owner = "client!op", name = "E", descriptor = "I")
    public static int field3996 = 0;

    @OriginalMember(owner = "client!op", name = "H", descriptor = "Z")
    public static boolean field3998 = false;

    @OriginalMember(owner = "client!op", name = "L", descriptor = "B")
    public byte field4002;

    @OriginalMember(owner = "client!op", name = "G", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!op", name = "I", descriptor = "I")
    public int field3999;

    @OriginalMember(owner = "client!op", name = "J", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!op", name = "N", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!op", name = "O", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!op", name = "P", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!op", name = "C", descriptor = "Laj;")
    public static class206 field3994;

    @OriginalMember(owner = "client!op", name = "D", descriptor = "Lsv;")
    public class319 field3995;

    @OriginalMember(owner = "client!op", name = "K", descriptor = "Lo;")
    public static class359 field4001;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "(I)[B", line = 5)
    public final byte[] method1716(int arg0) {
        ++field4004;
        if (!super.field4123 && this.field3995.field4360 >= this.field3995.field4336.length - this.field4002) {
            return arg0 != 255 ? null : this.field3995.field4336;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLnf;)V", line = 23)
    public static final void method1717(boolean arg0, class28 arg1) {
        ++field3997;
        arg1.method191((byte) 36);
        int var2 = 0;
        for (int var3 = 0; ~class210.field3001 < ~var3; ++var3) {
            int var15 = class169.field2570[var3];
            if ((class276.field3759[var15] & 1) == 0) {
                if (var2 > 0) {
                    --var2;
                    class276.field3759[var15] = (byte) class219.method1367(class276.field3759[var15], 2);
                } else {
                    int var16 = arg1.method194(1, -15886);
                    if (var16 == 0) {
                        var2 = class348.method2094(arg1, (byte) -115);
                        class276.field3759[var15] = (byte) class219.method1367(class276.field3759[var15], 2);
                    } else {
                        class507.method3007(var15, false, arg1);
                    }
                }
            }
        }
        arg1.method196(30365);
        if (~var2 != -1) {
            throw new RuntimeException("nsn0");
        } else {
            arg1.method191((byte) 36);
            for (int var4 = 0; ~var4 > ~class210.field3001; ++var4) {
                int var13 = class169.field2570[var4];
                if ((1 & class276.field3759[var13]) != 0) {
                    if (~var2 < -1) {
                        class276.field3759[var13] = (byte) class219.method1367(class276.field3759[var13], 2);
                        --var2;
                    } else {
                        int var14 = arg1.method194(1, -15886);
                        if (var14 == 0) {
                            var2 = class348.method2094(arg1, (byte) -125);
                            class276.field3759[var13] = (byte) class219.method1367(class276.field3759[var13], 2);
                        } else {
                            class507.method3007(var13, !arg0, arg1);
                        }
                    }
                }
            }
            arg1.method196(30365);
            if (~var2 != -1) {
                throw new RuntimeException("nsn1");
            } else {
                arg1.method191((byte) 36);
                for (int var5 = 0; var5 < class398.field5714; ++var5) {
                    int var11 = class356.field5140[var5];
                    if ((class276.field3759[var11] & 1) != 0) {
                        if (var2 > 0) {
                            class276.field3759[var11] = (byte) class219.method1367(class276.field3759[var11], 2);
                            --var2;
                        } else {
                            int var12 = arg1.method194(1, -15886);
                            if (~var12 == -1) {
                                var2 = class348.method2094(arg1, (byte) -116);
                                class276.field3759[var11] = (byte) class219.method1367(class276.field3759[var11], 2);
                            } else if (class360.method2148(arg1, -43, var11)) {
                                class276.field3759[var11] = (byte) class219.method1367(class276.field3759[var11], 2);
                            }
                        }
                    }
                }
                if (!arg0) {
                    field3994 = null;
                }
                arg1.method196(30365);
                if (~var2 != -1) {
                    throw new RuntimeException("nsn2");
                } else {
                    arg1.method191((byte) 36);
                    for (int var6 = 0; ~var6 > ~class398.field5714; ++var6) {
                        int var9 = class356.field5140[var6];
                        if ((1 & class276.field3759[var9]) == 0) {
                            if (var2 > 0) {
                                class276.field3759[var9] = (byte) class219.method1367(class276.field3759[var9], 2);
                                --var2;
                            } else {
                                int var10 = arg1.method194(1, -15886);
                                if (~var10 == -1) {
                                    var2 = class348.method2094(arg1, (byte) -127);
                                    class276.field3759[var9] = (byte) class219.method1367(class276.field3759[var9], 2);
                                } else if (class360.method2148(arg1, 99, var9)) {
                                    class276.field3759[var9] = (byte) class219.method1367(class276.field3759[var9], 2);
                                }
                            }
                        }
                    }
                    arg1.method196(30365);
                    if (~var2 != -1) {
                        throw new RuntimeException("nsn3");
                    } else {
                        class210.field3001 = 0;
                        class398.field5714 = 0;
                        for (int var7 = 1; var7 < 2048; ++var7) {
                            class276.field3759[var7] = (byte) (class276.field3759[var7] >> 1);
                            class487 var8 = class45.field642[var7];
                            if (var8 != null) {
                                class169.field2570[class210.field3001++] = var7;
                            } else {
                                class356.field5140[class398.field5714++] = var7;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILjava/lang/String;)I", line = 244)
    public static final int method1718(int arg0, String arg1) {
        ++field4000;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            char var5 = arg1.charAt(var4);
            if (~var5 >= -128) {
                ++var3;
            } else if (~var5 < -2048) {
                var3 += 3;
            } else {
                var3 += 2;
            }
        }
        if (arg0 >= -101) {
            field4001 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!op", name = "i", descriptor = "(I)V", line = 281)
    public static final void method1719(int arg0) {
        ++field4003;
        class314 var1 = class177.method1213(false, 15, 0);
        if (arg0 != 2) {
            method1717(true, (class28) null);
        }
        var1.method1811((byte) 86);
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(B)I", line = 294)
    public final int method1720(byte arg0) {
        ++field4005;
        if (this.field3995 == null) {
            return 0;
        } else {
            if (arg0 != -48) {
                this.method1720((byte) 95);
            }
            return this.field3995.field4360 * 100 / (this.field3995.field4336.length + -this.field4002);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)V", line = 311)
    public static void method1721(boolean arg0) {
        field3994 = null;
        field4001 = null;
        if (arg0) {
            method1718(-5, (String) null);
        }
    }
}
