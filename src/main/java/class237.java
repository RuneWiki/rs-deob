import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class237 extends class212 {

    @OriginalMember(owner = "client!lk", name = "ab", descriptor = "[I")
    private int[] field4117 = new int[3];

    @OriginalMember(owner = "client!lk", name = "cb", descriptor = "I")
    private int field4119 = 3216;

    @OriginalMember(owner = "client!lk", name = "jb", descriptor = "I")
    private int field4126 = 4096;

    @OriginalMember(owner = "client!lk", name = "lb", descriptor = "I")
    private int field4128 = 3216;

    @OriginalMember(owner = "client!lk", name = "V", descriptor = "Lsc;")
    private static class181 field4112 = class149.method967(255, "skill)2");

    @OriginalMember(owner = "client!lk", name = "db", descriptor = "I")
    public static int field4120 = 0;

    @OriginalMember(owner = "client!lk", name = "gb", descriptor = "Lsc;")
    public static class181 field4123 = field4112;

    @OriginalMember(owner = "client!lk", name = "ib", descriptor = "I")
    public static int field4125 = 0;

    @OriginalMember(owner = "client!lk", name = "U", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!lk", name = "W", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!lk", name = "X", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!lk", name = "Y", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!lk", name = "Z", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!lk", name = "bb", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!lk", name = "fb", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!lk", name = "hb", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!lk", name = "kb", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!lk", name = "eb", descriptor = "Lhj;")
    public static class184 field4121;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(Z)V")
    private final void method1619(boolean arg0) {
        double var2 = Math.cos((double) ((float) this.field4128 / 4096.0F));
        this.field4117[0] = (int) (Math.sin((double) ((float) this.field4119 / 4096.0F)) * var2 * 4096.0D);
        ++field4127;
        if (!arg0) {
            this.field4117[1] = (int) (4096.0D * Math.cos((double) ((float) this.field4119 / 4096.0F)) * var2);
            this.field4117[2] = (int) (Math.sin((double) ((float) this.field4128 / 4096.0F)) * 4096.0D);
            int var4 = this.field4117[0] * this.field4117[0] >> 12;
            int var5 = this.field4117[2] * this.field4117[2] >> 12;
            int var6 = this.field4117[1] * this.field4117[1] >> 12;
            int var7 = (int) (Math.sqrt((double) (var4 - -var6 + var5 >> 12)) * 4096.0D);
            if (~var7 != -1) {
                this.field4117[2] = (this.field4117[2] << 12) / var7;
                this.field4117[1] = (this.field4117[1] << 12) / var7;
                this.field4117[0] = (this.field4117[0] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
    public class237() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(II)Lli;")
    public static final class99 method1620(int arg0, int arg1) {
        ++field4118;
        class99 var2 = (class99) class70.field1113.method1794(arg0 + 29538, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class39.field601.method89(class161.method1078(arg1, -26123), class127.method822(arg1, (byte) 78), arg0 + 29654);
            class99 var4 = new class99();
            var4.field1621 = arg1;
            if (var3 != null) {
                var4.method667(0, new class230(var3));
            }
            var4.method650((byte) -78);
            if (~var4.field1642 != 0) {
                var4.method649(arg0 ^ -29457, method1620(arg0, var4.field1631), method1620(-29539, var4.field1642));
            }
            if (var4.field1596 != -1) {
                var4.method660(arg0 + 29622, method1620(-29539, var4.field1648), method1620(arg0, var4.field1596));
            }
            if (arg0 != -29539) {
                field4120 = 65;
            }
            if (!class52.field834 && var4.field1616) {
                var4.field1595 = null;
                var4.field1640 = 0;
                var4.field1608 = null;
                var4.field1654 = false;
                var4.field1652 = class241.field4178;
            }
            class70.field1113.method1795(14177, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        ++field4113;
        if (arg1 < 25) {
            method1624(-67);
        }
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            int var4 = class164.field2796 * this.field4126 >> 12;
            int[] var5 = this.method1405(class4.field90 & arg0 + -1, 0, 116);
            int[] var6 = this.method1405(arg0, 0, 66);
            int[] var7 = this.method1405(class4.field90 & arg0 - -1, 0, 83);
            for (int var8 = 0; class26.field452 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class186.field3300] + -var6[var8 + 1 & class186.field3300]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class230.field3985[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = this.field4117[1] * var14 >> 12;
                int var17 = this.field4117[0] * var15 >> 12;
                int var18 = var13 * 4096 >> 8;
                int var19 = this.field4117[2] * var18 >> 12;
                var3[var8] = var17 + var19 + var16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        this.method1619(!arg0);
        ++field4111;
        if (!arg0) {
            method1621((byte) -117, (class175) null);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLo;)Z")
    public static final boolean method1621(byte arg0, class175 arg1) {
        ++field4124;
        if (arg1.field2945 == null) {
            return false;
        } else {
            if (arg0 >= -83) {
                method1624(72);
            }
            for (int var2 = 0; arg1.field2945.length > var2; ++var2) {
                int var3 = class111.method739((byte) -32, arg1, var2);
                int var4 = arg1.field3082[var2];
                if (arg1.field2945[var2] == 2) {
                    if (var4 <= var3) {
                        return false;
                    }
                } else if (arg1.field2945[var2] != 3) {
                    if (arg1.field2945[var2] != 4) {
                        if (~var3 != ~var4) {
                            return false;
                        }
                    } else if (~var3 == ~var4) {
                        return false;
                    }
                } else if (var3 <= var4) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(II)Lsc;")
    public static final class181 method1622(int arg0, int arg1) {
        ++field4115;
        int var2 = -116 % ((arg0 - -55) / 49);
        return class175.method1164(new class181[] { class169.method1119((byte) 55, arg1 >> 24 & 255), class16.field291, class169.method1119((byte) -123, 255 & arg1 >> 16), class16.field291, class169.method1119((byte) -120, 255 & arg1 >> 8), class16.field291, class169.method1119((byte) 71, 255 & arg1) }, (byte) 123);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIZII)V")
    public static final void method1623(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field4122;
        if (arg3) {
            int var6 = -arg5 + arg1;
            int var7 = -arg0 + arg4;
            if (~var6 == -1) {
                if (var7 != 0) {
                    class19.method179(arg4, arg0, arg2, 124, arg5);
                }
            } else if (var7 == 0) {
                class132.method852(arg5, arg0, (byte) -121, arg2, arg1);
            } else {
                int var8 = (var7 << 12) / var6;
                int var9 = -(arg5 * var8 >> 12) + arg0;
                int var10;
                int var11;
                if (~class11.field219 >= ~arg1) {
                    if (~class124.field2032 <= ~arg1) {
                        var10 = arg4;
                        var11 = arg1;
                    } else {
                        var11 = class124.field2032;
                        var10 = (class124.field2032 * var8 >> 12) + var9;
                    }
                } else {
                    var11 = class11.field219;
                    var10 = (class11.field219 * var8 >> 12) + var9;
                }
                if (~var10 > ~class23.field408) {
                    var11 = (-var9 + class23.field408 << 12) / var8;
                    var10 = class23.field408;
                } else if (~var10 < ~class125.field2056) {
                    var10 = class125.field2056;
                    var11 = (-var9 + class125.field2056 << 12) / var8;
                }
                int var12;
                int var13;
                if (class11.field219 <= arg5) {
                    if (arg5 <= class124.field2032) {
                        var12 = arg5;
                        var13 = arg0;
                    } else {
                        var12 = class124.field2032;
                        var13 = (class124.field2032 * var8 >> 12) + var9;
                    }
                } else {
                    var13 = (class11.field219 * var8 >> 12) + var9;
                    var12 = class11.field219;
                }
                if (~var13 <= ~class23.field408) {
                    if (~class125.field2056 > ~var13) {
                        var12 = (class125.field2056 - var9 << 12) / var8;
                        var13 = class125.field2056;
                    }
                } else {
                    var12 = (class23.field408 - var9 << 12) / var8;
                    var13 = class23.field408;
                }
                class86.method581(var11, arg2, var12, 14119, var10, var13);
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)V")
    public static void method1624(int arg0) {
        field4112 = null;
        field4121 = null;
        if (arg0 != 0) {
            method1625(true);
        }
        field4123 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            this.method24(26, (byte) 30);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field4128 = arg0.method1535(2);
                }
            } else {
                this.field4119 = arg0.method1535(2);
            }
        } else {
            this.field4126 = arg0.method1535(2);
        }
        ++field4114;
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(Z)V")
    public static final void method1625(boolean arg0) {
        ++field4116;
        if (class220.field3781) {
            class175 var1 = class26.method221(class144.field2330, -24807, class73.field1168);
            if (var1 != null && var1.field2959 != null) {
                class94 var2 = new class94();
                var2.field1489 = var1.field2959;
                var2.field1488 = var1;
                class27.method225(var2, (byte) 120);
            }
            class220.field3781 = false;
            class218.method1453((byte) -95, var1);
            if (!arg0) {
                method1621((byte) 81, (class175) null);
            }
        }
    }
}
