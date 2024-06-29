import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class134 {

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public int field1927 = 443;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "Z")
    private boolean field1934 = true;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "Z")
    private boolean field1926 = false;

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
    public int field1933 = 43594;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "Lhg;")
    public static class693 field1930 = new class693(18, 8);

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "Lhg;")
    public static class693 field1935 = new class693(8, 7);

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "Z")
    public static boolean field1940 = false;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public int field1929;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "Ljava/lang/String;")
    public String field1938;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method985(int arg0, int arg1, int arg2, int arg3) {
        class305.field4001 = new byte[arg3][arg2][arg1];
        field1939++;
        if (arg0 != -2287) {
            method987(112, true);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)Z", line = 18)
    public static final boolean method986(int arg0) {
        field1941++;
        boolean var1 = true;
        if (class358.field4620 == null) {
            if (class268.field3369.method3154(class652.field9069, (byte) 98)) {
                class358.field4620 = class728.method4054(class268.field3369, class652.field9069);
            } else {
                var1 = false;
            }
        }
        if (class528.field7362 == null) {
            if (class268.field3369.method3154(class607.field8427, (byte) 98)) {
                class528.field7362 = class728.method4054(class268.field3369, class607.field8427);
            } else {
                var1 = false;
            }
        }
        if (class282.field3562 == null) {
            if (class268.field3369.method3154(class122.field1765, (byte) 98)) {
                class282.field3562 = class728.method4054(class268.field3369, class122.field1765);
            } else {
                var1 = false;
            }
        }
        if (arg0 != 0) {
            field1930 = null;
        }
        if (class160.field2216 == null) {
            if (class445.field5928.method3154(client.field3987, (byte) 98)) {
                class160.field2216 = class335.method1930(client.field3987, (byte) -72, class445.field5928);
            } else {
                var1 = false;
            }
        }
        if (class590.field8276 == null) {
            if (class268.field3369.method3154(client.field3987, (byte) 98)) {
                class590.field8276 = class728.method4058(class268.field3369, client.field3987);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)Z", line = 88)
    public static final boolean method987(int arg0, boolean arg1) {
        if (arg1) {
            field1936++;
            return arg0 == 2 || arg0 == 3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V", line = 100)
    public static void method988(int arg0) {
        field1935 = null;
        field1930 = null;
        if (arg0 <= 23) {
            field1935 = null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(BLei;)V", line = 112)
    public static final void method989(byte arg0, class180 arg1) {
        field1928++;
        arg1.method1240(false);
        int var2 = 0;
        for (int var3 = 0; var3 < class416.field5303; var3++) {
            int var15 = class657.field9155[var3];
            if ((class441.field5871[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class441.field5871[var15] = (byte) class683.method3840(class441.field5871[var15], 2);
                } else {
                    int var16 = arg1.method1235(1, arg0 ^ 0xFFFFF053);
                    if (var16 == 0) {
                        var2 = class358.method2074(true, arg1);
                        class441.field5871[var15] = (byte) class683.method3840(class441.field5871[var15], 2);
                    } else {
                        class468.method2662(121, arg1, var15);
                    }
                }
            }
        }
        arg1.method1234((byte) 78);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method1240(false);
        for (int var4 = 0; var4 < class416.field5303; var4++) {
            int var13 = class657.field9155[var4];
            if ((class441.field5871[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class441.field5871[var13] = (byte) class683.method3840(class441.field5871[var13], 2);
                } else {
                    int var14 = arg1.method1235(1, -4080);
                    if (var14 == 0) {
                        var2 = class358.method2074(true, arg1);
                        class441.field5871[var13] = (byte) class683.method3840(class441.field5871[var13], 2);
                    } else {
                        class468.method2662(arg0 ^ 0x34, arg1, var13);
                    }
                }
            }
        }
        arg1.method1234((byte) 75);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method1240(false);
        int var5 = 0;
        if (arg0 != 67) {
            return;
        }
        while (class334.field4256 > var5) {
            int var11 = class275.field3458[var5];
            if ((class441.field5871[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class441.field5871[var11] = (byte) class683.method3840(class441.field5871[var11], 2);
                    var2--;
                } else {
                    int var12 = arg1.method1235(1, arg0 ^ 0xFFFFF053);
                    if (var12 == 0) {
                        var2 = class358.method2074(true, arg1);
                        class441.field5871[var11] = (byte) class683.method3840(class441.field5871[var11], 2);
                    } else if (class429.method2457(var11, arg1, 639365768)) {
                        class441.field5871[var11] = (byte) class683.method3840(class441.field5871[var11], 2);
                    }
                }
            }
            var5++;
        }
        arg1.method1234((byte) 76);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method1240(false);
        for (int var6 = 0; var6 < class334.field4256; var6++) {
            int var9 = class275.field3458[var6];
            if ((class441.field5871[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class441.field5871[var9] = (byte) class683.method3840(class441.field5871[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method1235(1, -4080);
                    if (var10 == 0) {
                        var2 = class358.method2074(true, arg1);
                        class441.field5871[var9] = (byte) class683.method3840(class441.field5871[var9], 2);
                    } else if (class429.method2457(var9, arg1, 639365768)) {
                        class441.field5871[var9] = (byte) class683.method3840(class441.field5871[var9], 2);
                    }
                }
            }
        }
        arg1.method1234((byte) 37);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class334.field4256 = 0;
        class416.field5303 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class441.field5871[var7] = (byte) (class441.field5871[var7] >> 1);
            class724 var8 = class5.field49[var7];
            if (var8 == null) {
                class275.field3458[class334.field4256++] = var7;
            } else {
                class657.field9155[class416.field5303++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)V", line = 312)
    public final void method990(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (!this.field1934) {
            this.field1934 = true;
            this.field1926 = true;
        } else if (this.field1926) {
            this.field1926 = false;
        } else {
            this.field1934 = false;
        }
        field1932++;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILhu;)Z", line = 347)
    public final boolean method991(int arg0, class134 arg1) {
        if (arg0 != -1) {
            this.field1938 = null;
        }
        field1937++;
        if (arg1 == null) {
            return false;
        } else {
            return this.field1929 == arg1.field1929 && this.field1938.equals(arg1.field1938);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILqg;)Lsq;", line = 364)
    public final class181 method992(int arg0, class465 arg1) {
        field1931++;
        if (arg0 != 31687) {
            this.method990(51);
        }
        return arg1.method2649(this.field1926, false, this.field1938, this.field1934 ? this.field1927 : this.field1933);
    }
}
