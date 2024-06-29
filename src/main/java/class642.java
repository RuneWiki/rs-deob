import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class642 extends class322 {

    @OriginalMember(owner = "client!gl", name = "jb", descriptor = "Z")
    public boolean field8857 = false;

    @OriginalMember(owner = "client!gl", name = "ob", descriptor = "Z")
    public boolean field8862 = false;

    @OriginalMember(owner = "client!gl", name = "xb", descriptor = "Z")
    public boolean field8871 = false;

    @OriginalMember(owner = "client!gl", name = "ub", descriptor = "Z")
    public boolean field8868 = false;

    @OriginalMember(owner = "client!gl", name = "rb", descriptor = "Z")
    public boolean field8865 = false;

    @OriginalMember(owner = "client!gl", name = "hb", descriptor = "Leba;")
    public static class550 field8855 = new class550(33, -2);

    @OriginalMember(owner = "client!gl", name = "Eb", descriptor = "Luf;")
    public static class380 field8878 = new class380(4);

    @OriginalMember(owner = "client!gl", name = "ib", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!gl", name = "kb", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!gl", name = "lb", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!gl", name = "mb", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!gl", name = "nb", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!gl", name = "pb", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!gl", name = "qb", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!gl", name = "sb", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!gl", name = "tb", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!gl", name = "vb", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!gl", name = "wb", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!gl", name = "yb", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!gl", name = "zb", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!gl", name = "Ab", descriptor = "I")
    public int field8874;

    @OriginalMember(owner = "client!gl", name = "Bb", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!gl", name = "Cb", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!gl", name = "Fb", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!gl", name = "Gb", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!gl", name = "Hb", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!gl", name = "Ib", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!gl", name = "Db", descriptor = "[Lci;")
    public static class152[] field8877;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)I")
    private final int method3553(int arg0, byte arg1) {
        ++field8864;
        int var3 = 74 % ((arg1 - -47) / 57);
        byte var4;
        if (arg0 <= 12000) {
            if (~arg0 >= -5001) {
                if (arg0 <= 2000) {
                    var4 = 1;
                    this.method3571(true, 0);
                } else {
                    this.method3562(-119);
                    var4 = 2;
                }
            } else {
                var4 = 3;
                this.method3560((byte) -53);
            }
        } else {
            this.method3570((byte) -128);
            var4 = 4;
        }
        if (~class618.field8566 != -3) {
            super.field4344 = 2;
            class174.method1190(0, 2);
        }
        this.method3557(class312.field4206, -2);
        return var4;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(IB)Z")
    public final boolean method3554(int arg0, byte arg1) {
        if (arg1 > -114) {
            this.method3567(12, (byte) 12);
        }
        ++field8880;
        return ~arg0 == -1 && !this.field8865 ? super.field4341 : true;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static final void method3555(byte arg0, String arg1, int arg2) {
        ++field8856;
        class116.method681("", "", "", 63, 0, arg1, arg2);
        if (arg0 != -101) {
            method3555((byte) 88, (String) null, -28);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILio;)V")
    private final void method3556(int arg0, class157 arg1) {
        ++field8875;
        if (~(arg1.field2199.length - arg1.field2219) <= -2) {
            int var3 = arg1.method930(255);
            if (var3 >= 0 && ~var3 >= -23) {
                byte var4;
                if (~var3 != -23) {
                    if (var3 != 21) {
                        if (~var3 != -21) {
                            if (~var3 != -20) {
                                if (var3 == 18) {
                                    var4 = 41;
                                } else if (var3 != 17) {
                                    if (~var3 == -17) {
                                        var4 = 38;
                                    } else if (~var3 != -16) {
                                        if (~var3 == -15) {
                                            var4 = 36;
                                        } else if (var3 == 13) {
                                            var4 = 35;
                                        } else if (var3 != 12) {
                                            if (~var3 == -12) {
                                                var4 = 33;
                                            } else if (var3 != 10) {
                                                if (~var3 == -10) {
                                                    var4 = 31;
                                                } else if (var3 == 8) {
                                                    var4 = 30;
                                                } else if (var3 == 7) {
                                                    var4 = 29;
                                                } else if (~var3 == -7) {
                                                    var4 = 28;
                                                } else if (~var3 == -6) {
                                                    var4 = 28;
                                                } else if (~var3 != -5) {
                                                    if (~var3 == -4) {
                                                        var4 = 23;
                                                    } else if (var3 != 2) {
                                                        if (var3 == 1) {
                                                            var4 = 23;
                                                        } else {
                                                            var4 = 19;
                                                        }
                                                    } else {
                                                        var4 = 22;
                                                    }
                                                } else {
                                                    var4 = 24;
                                                }
                                            } else {
                                                var4 = 32;
                                            }
                                        } else {
                                            var4 = 34;
                                        }
                                    } else {
                                        var4 = 37;
                                    }
                                } else {
                                    var4 = 40;
                                }
                            } else {
                                var4 = 42;
                            }
                        } else {
                            var4 = 43;
                        }
                    } else {
                        var4 = 44;
                    }
                } else {
                    var4 = 45;
                }
                if (var4 <= arg1.field2199.length + -arg1.field2219) {
                    super.field4303 = arg1.method930(255);
                    if (super.field4303 >= 1) {
                        if (super.field4303 > 4) {
                            super.field4303 = 4;
                        }
                    } else {
                        super.field4303 = 1;
                    }
                    this.method3559(arg1.method930(255) == arg0, -127);
                    super.field4321 = ~arg1.method930(255) == -2;
                    super.field4300 = ~arg1.method930(255) == -2;
                    super.field4298 = arg1.method930(255) == 1;
                    super.field4333 = arg1.method930(arg0 ^ 254) != 1 ? 0 : 1;
                    super.field4312 = ~arg1.method930(arg0 ^ 254) == -2;
                    super.field4340 = ~arg1.method930(255) == -2;
                    super.field4314 = arg1.method930(arg0 ^ 254) == 1;
                    super.field4327 = arg1.method930(arg0 ^ 254);
                    if (super.field4327 > 2) {
                        super.field4327 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field4297 = arg1.method930(255);
                    }
                    if (~var3 > -3) {
                        super.field4326 = ~arg1.method930(255) == -2;
                        arg1.method930(arg0 + 254);
                    } else {
                        super.field4326 = arg1.method930(255) == 1;
                        if (var3 >= 17) {
                            super.field4304 = arg1.method930(255) == 1;
                        }
                    }
                    super.field4322 = ~arg1.method930(255) == -2;
                    super.field4328 = arg1.method930(255) == 1;
                    super.field4306 = arg1.method930(arg0 + 254);
                    if (super.field4306 > 2) {
                        super.field4306 = 2;
                    }
                    super.field4325 = super.field4306;
                    super.field4339 = ~arg1.method930(255) == -2;
                    super.field4310 = arg1.method930(255);
                    if (~super.field4310 < -128) {
                        super.field4310 = 127;
                    }
                    if (~var3 <= -21) {
                        super.field4320 = arg1.method930(255);
                        if (~super.field4320 < -128) {
                            super.field4320 = 127;
                        }
                    } else {
                        super.field4320 = super.field4310;
                    }
                    super.field4323 = arg1.method930(255);
                    super.field4329 = arg1.method930(arg0 ^ 254);
                    if (super.field4329 > 127) {
                        super.field4329 = 127;
                    }
                    if (~var3 > -22) {
                        super.field4334 = super.field4323;
                    } else {
                        super.field4334 = arg1.method930(255);
                        if (~super.field4334 < -128) {
                            super.field4334 = 127;
                        }
                    }
                    if (var3 >= 1) {
                        super.field4346 = arg1.method963(arg0 ^ -122);
                        super.field4299 = arg1.method963(-124);
                    }
                    if (~var3 <= -4 && ~var3 > -7) {
                        arg1.method930(255);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg1.method930(255);
                        if (var5 < 0 || ~var5 < -3) {
                            var5 = 0;
                        }
                        if (client.field9616 < 96) {
                            var5 = 0;
                        }
                        class171.method1162(var5, 102);
                    }
                    if (~var3 <= -6) {
                        super.field4301 = arg1.method908(false);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field4313 = var6 = arg1.method930(255);
                    }
                    if (super.field4313 != 1 && ~super.field4313 != -3) {
                        super.field4313 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field4309 = arg1.method930(255) == 1;
                    }
                    if (var3 >= 8) {
                        super.field4332 = arg1.method930(255) == 1;
                    }
                    if (var3 >= 9) {
                        super.field4317 = arg1.method930(255);
                    }
                    if (super.field4317 < 0 || super.field4317 > class299.method1759(client.field9616, (byte) 95)) {
                        super.field4317 = 0;
                    }
                    if (var3 >= 10) {
                        super.field4335 = ~arg1.method930(255) != -1;
                    }
                    if (~var3 <= -12) {
                        super.field4343 = arg1.method930(255) != 0;
                    }
                    if (~var3 <= -13) {
                        super.field4333 = arg1.method930(255);
                    }
                    if (~super.field4333 > -1 || ~super.field4333 < -3) {
                        super.field4333 = 1;
                    }
                    if (var3 >= 13) {
                        super.field4319 = arg1.method930(arg0 + 254) == 1;
                    }
                    if (~var3 <= -15) {
                        super.field4344 = arg1.method930(255);
                    } else if (~var6 == -1) {
                        super.field4344 = 2;
                    } else {
                        super.field4344 = 1;
                    }
                    if (super.field4344 < 0 || super.field4344 > 5) {
                        super.field4344 = 2;
                    }
                    if (var3 >= 15) {
                        super.field4338 = arg1.method930(255);
                        if (~super.field4338 > -1 || ~super.field4338 < -5) {
                            super.field4338 = class653.field9306 == 1 ? 2 : 4;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field4311 = ~arg1.method930(arg0 ^ 254) == -2;
                        try {
                            if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                super.field4311 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (~var3 > -18 && super.field4344 == 0) {
                        super.field4344 = 2;
                    }
                    if (var3 >= 18) {
                        super.field4318 = arg1.method930(255);
                        if (super.field4318 < 0 || super.field4318 > 4) {
                            super.field4318 = 0;
                        }
                    }
                    if (~var3 > -20) {
                        if (super.field4318 != 1 && ~super.field4318 != -3) {
                            if (~super.field4318 == -4) {
                                super.field4324 = 1;
                            } else {
                                super.field4324 = 0;
                            }
                        } else {
                            super.field4324 = 2;
                        }
                    } else {
                        super.field4324 = arg1.method930(arg0 + 254);
                    }
                    if (var3 >= 22) {
                        super.field4342 = arg1.method930(arg0 + 254);
                    }
                    if (super.field4344 == 0 && ~client.field9616 > -97 && ~super.field4318 != -2 && super.field4318 != 0) {
                        this.method3571(false, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lgba;I)V")
    public final void method3557(class388 arg0, int arg1) {
        ++field8881;
        class611 var3 = null;
        try {
            class661 var4 = arg0.method2236("", (byte) -106, true);
            while (~var4.field9420 == -1) {
                class588.method3253(0, 1L);
            }
            if (~var4.field9420 == arg1) {
                var3 = (class611) var4.field9421;
                class157 var5 = new class157(class188.method1245(-18302));
                this.method1869((byte) -25, var5);
                var3.method3389(54, 0, var5.field2199, var5.field2219);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method3390(arg1 ^ -2);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(IB)V")
    public final void method3558(int arg0, byte arg1) {
        class28.field408 = null;
        super.field4324 = arg0;
        if (arg1 >= 51) {
            ++field8863;
            class55.field725 = true;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI)V")
    public final void method3559(boolean arg0, int arg1) {
        super.field4341 = arg0;
        int var3 = 91 / ((-60 - arg1) / 58);
        ++field8861;
        if (class118.field1510 != null) {
            class118.field1510.method3925(-9524, !this.method3554(class618.field8566, (byte) -128));
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public final void method3560(byte arg0) {
        ++field8869;
        this.method3559(true, -125);
        super.field4312 = true;
        super.field4314 = true;
        super.field4326 = true;
        super.field4327 = super.field4297 = 1;
        super.field4321 = true;
        super.field4328 = true;
        super.field4304 = false;
        super.field4311 = true;
        super.field4333 = 1;
        super.field4322 = false;
        super.field4300 = true;
        super.field4306 = super.field4325 = 0;
        super.field4298 = true;
        int var2 = -115 % ((arg0 - 7) / 60);
        super.field4340 = true;
        if (~client.field9616 >= -96) {
            class171.method1162(0, 89);
        } else {
            class171.method1162(1, 119);
        }
        super.field4335 = false;
        super.field4317 = 0;
        super.field4319 = true;
        this.method3568(true);
        this.method3558(1, (byte) 66);
        super.field4318 = 3;
        class595.method3305((byte) 91);
        class382.method2189(true);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(ZI)I")
    public final int method3561(boolean arg0, int arg1) {
        if (arg0) {
            this.field8868 = false;
        }
        ++field8858;
        if (class257.method1551(-49, arg1) && !class516.method2929((byte) -66, class576.field7861)) {
            return ~client.field9616 > -97 && class17.method107(arg1, -2358) && ~super.field4324 == -1 ? 1 : super.field4324;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
    public final void method3562(int arg0) {
        this.method3559(true, 55);
        ++field8876;
        super.field4333 = 0;
        super.field4300 = true;
        super.field4340 = false;
        super.field4312 = false;
        super.field4322 = false;
        super.field4321 = false;
        super.field4306 = super.field4325 = 0;
        super.field4327 = super.field4297 = 0;
        super.field4298 = false;
        if (arg0 >= -89) {
            field8878 = null;
        }
        super.field4314 = false;
        super.field4326 = false;
        super.field4311 = false;
        super.field4328 = false;
        super.field4304 = false;
        class171.method1162(0, 111);
        super.field4317 = 0;
        super.field4335 = false;
        super.field4319 = true;
        this.method3568(true);
        this.method3558(2, (byte) 107);
        super.field4318 = 2;
        class595.method3305((byte) 91);
        class382.method2189(true);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)I")
    private final int method3563(byte arg0) {
        ++field8882;
        byte var2;
        if (client.field9616 < 96) {
            var2 = 1;
            this.method3571(true, 0);
        } else {
            int var3 = class485.method2785((byte) 46);
            if (~var3 < -101) {
                if (var3 > 500) {
                    if (var3 <= 1000) {
                        this.method3562(-120);
                        var2 = 2;
                    } else {
                        var2 = 1;
                        this.method3571(true, 0);
                    }
                } else {
                    var2 = 3;
                    this.method3560((byte) 70);
                }
            } else {
                this.method3570((byte) -128);
                var2 = 4;
            }
        }
        if (class618.field8566 != 0) {
            super.field4344 = 0;
            class174.method1190(0, 0);
        }
        if (arg0 != -128) {
            return 96;
        } else {
            this.method3557(class312.field4206, -2);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)I")
    public final int method3564(int arg0) {
        ++field8870;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class312.field4206.field5176 && !class312.field4206.field5192) {
            if (!class388.field5196.startsWith("win")) {
                var3 = true;
            } else {
                var3 = true;
                var4 = true;
                if (!class388.field5177.startsWith("amd64") && !class388.field5177.startsWith("x86_64")) {
                    var2 = true;
                }
            }
        }
        if (this.field8868) {
            var4 = false;
        }
        if (this.field8862) {
            var2 = false;
        }
        if (this.field8857) {
            var3 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method3563((byte) -128);
        } else if (arg0 != -24027) {
            return -90;
        } else {
            int var5 = -1;
            int var6 = -1;
            if (var2) {
                try {
                    var5 = class87.method479(2, arg0 ^ -24027, 1000);
                } catch (Exception var16) {
                }
            }
            int var7 = -1;
            if (var4) {
                try {
                    var7 = class87.method479(3, 0, 1000);
                    if (class618.field8566 == 3) {
                        class102 var8 = class146.field1963.method1141();
                        long var9 = var8.field1222 & 281474976710655L;
                        int var11 = var8.field1218;
                        if (var11 != 4318) {
                            if (~var11 == -4099) {
                                var3 &= ~var9 <= -60129613780L;
                            }
                        } else {
                            var3 &= ~var9 <= -64425238955L;
                        }
                    }
                } catch (Exception var15) {
                }
            }
            if (var3) {
                try {
                    var6 = class87.method479(1, 0, 1000);
                } catch (Exception var14) {
                }
            }
            if (~var5 == 0 && var6 == -1 && var7 == -1) {
                return this.method3563((byte) -128);
            } else {
                int var12 = (int) ((float) var7 * 1.1F);
                int var13 = (int) ((float) var6 * 1.1F);
                if (~var12 > ~var5 && ~var5 < ~var13) {
                    return this.method3553(var5, (byte) 65);
                } else {
                    return ~var13 <= ~var12 ? this.method3569((byte) 114, var13, 1) : this.method3569((byte) 111, var12, 3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)V")
    public static void method3565(byte arg0) {
        field8855 = null;
        field8877 = null;
        if (arg0 != 53) {
            field8877 = null;
        }
        field8878 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZ)Z")
    public final boolean method3566(int arg0, boolean arg1) {
        ++field8873;
        if (!arg1) {
            return false;
        } else {
            return ~arg0 != -1 ? true : super.field4341;
        }
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(IB)I")
    public final int method3567(int arg0, byte arg1) {
        ++field8866;
        if (this.field8871) {
            return 0;
        } else if (!this.method3554(arg0, (byte) -117)) {
            return 1;
        } else {
            if (arg1 >= -40) {
                this.method3556(-71, (class157) null);
            }
            return super.field4321 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    private final void method3568(boolean arg0) {
        if (!arg0) {
            this.method3553(-88, (byte) 126);
        }
        ++field8872;
        if (class653.field9306 <= 1) {
            super.field4338 = 2;
        } else {
            super.field4338 = 4;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(BII)I")
    private final int method3569(byte arg0, int arg1, int arg2) {
        ++field8879;
        if (arg0 < 44) {
            this.method3554(111, (byte) -98);
        }
        byte var4;
        if (arg1 > 20000) {
            var4 = 4;
            this.method3570((byte) -125);
        } else if (arg1 <= 10000) {
            if (~arg1 >= -5001) {
                var4 = 1;
                this.method3571(true, 0);
            } else {
                var4 = 2;
                this.method3562(-120);
            }
        } else {
            var4 = 3;
            this.method3560((byte) -98);
        }
        if (~class618.field8566 != ~arg2) {
            super.field4344 = arg2;
            class174.method1190(0, arg2);
        }
        this.method3557(class312.field4206, -2);
        return var4;
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(B)V")
    public final void method3570(byte arg0) {
        ++field8860;
        this.method3559(true, 77);
        super.field4321 = true;
        super.field4300 = true;
        super.field4304 = true;
        super.field4326 = true;
        super.field4340 = true;
        super.field4312 = true;
        super.field4314 = true;
        super.field4328 = true;
        super.field4322 = true;
        super.field4306 = super.field4325 = 0;
        super.field4333 = 1;
        super.field4327 = super.field4297 = 2;
        super.field4298 = true;
        super.field4311 = true;
        if (~client.field9616 < -96) {
            class171.method1162(2, 81);
        } else {
            class171.method1162(0, 109);
        }
        super.field4335 = false;
        super.field4317 = 0;
        super.field4319 = true;
        this.method3568(true);
        if (arg0 >= -119) {
            this.field8874 = -98;
        }
        this.method3558(0, (byte) 57);
        super.field4318 = 4;
        class595.method3305((byte) 91);
        class382.method2189(true);
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(ZI)V")
    public final void method3571(boolean arg0, int arg1) {
        this.method3559(false, 82);
        ++field8859;
        super.field4326 = false;
        super.field4314 = false;
        super.field4321 = false;
        super.field4300 = false;
        super.field4340 = false;
        super.field4327 = super.field4297 = 0;
        super.field4312 = false;
        super.field4298 = false;
        super.field4333 = 0;
        super.field4322 = false;
        super.field4328 = false;
        super.field4306 = super.field4325 = arg1;
        super.field4304 = false;
        super.field4311 = false;
        class171.method1162(0, arg1 + 80);
        super.field4335 = false;
        super.field4317 = 0;
        super.field4319 = false;
        this.method3568(true);
        this.method3558(2, (byte) 115);
        super.field4318 = 1;
        if (arg0) {
            class595.method3305((byte) 91);
        }
        class382.method2189(true);
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lgba;)V")
    public class642(class388 arg0) {
        super.field4303 = 3;
        super.field4318 = 3;
        this.method3559(true, -122);
        super.field4298 = true;
        super.field4326 = true;
        super.field4346 = 0;
        super.field4322 = true;
        super.field4340 = true;
        super.field4339 = true;
        super.field4297 = 0;
        super.field4310 = 127;
        super.field4314 = true;
        super.field4323 = 127;
        super.field4300 = true;
        super.field4320 = 127;
        super.field4299 = 0;
        super.field4328 = true;
        super.field4333 = 1;
        super.field4329 = 127;
        super.field4304 = false;
        super.field4306 = 0;
        super.field4327 = 2;
        super.field4325 = 0;
        super.field4334 = 127;
        super.field4312 = true;
        super.field4321 = true;
        if (~client.field9616 > -97) {
            class171.method1162(0, 100);
        } else {
            class171.method1162(2, 109);
        }
        super.field4332 = false;
        super.field4344 = 2;
        super.field4309 = false;
        super.field4313 = 2;
        super.field4338 = class653.field9306 == 1 ? 2 : 4;
        super.field4317 = 0;
        super.field4301 = 0;
        super.field4343 = true;
        super.field4319 = true;
        super.field4335 = false;
        super.field4324 = 0;
        class611 var2 = null;
        try {
            class661 var3 = arg0.method2236("", (byte) -106, true);
            while (~var3.field9420 == -1) {
                class588.method3253(0, 1L);
            }
            if (~var3.field9420 == -2) {
                var2 = (class611) var3.field9421;
                byte[] var4 = new byte[(int) var2.method3387(-109)];
                int var6;
                for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                    var6 = var2.method3386(var4.length + -var5, 0, var5, var4);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method3556(1, new class157(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method3390(0);
            }
        } catch (Exception var7) {
        }
    }
}
