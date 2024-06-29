import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class332 extends class451 implements class381 {

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "B")
    private byte field4502;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "S")
    private short field4504;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "B")
    private byte field4497;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "B")
    private byte field4507;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "Z")
    private boolean field4491;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "Z")
    private boolean field4493;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "Z")
    private boolean field4501;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "Lkb;")
    private class449 field4509;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "Lgn;")
    private class456 field4484;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    public static int field4494 = -1;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field4505 = new String[100];

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lwm;I)V")
    public final void method16(class364 arg0, int arg1) {
        if (arg1 != 31591) {
            this.field4484 = null;
        }
        ++field4489;
        Object var3 = null;
        class449 var5;
        if (this.field4509 == null && this.field4501) {
            class266 var4 = this.method1903(131072, (byte) -125, true, arg0);
            var5 = var4 != null ? var4.field3512 : null;
        } else {
            var5 = this.field4509;
            this.field4509 = null;
        }
        if (var5 != null) {
            class318.method1742(var5, this.field4502, super.field6132, super.field6129, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)I")
    public final int method13(int arg0) {
        ++field4483;
        return arg0 <= 51 ? -24 : 65535 & this.field4504;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lwm;B)V")
    public final void method10(class364 arg0, byte arg1) {
        ++field4486;
        if (arg1 > -48) {
            this.field4507 = 95;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLwm;)V")
    public final void method12(byte arg0, class364 arg1) {
        ++field4495;
        Object var3 = null;
        class449 var5;
        if (this.field4509 == null && this.field4501) {
            class266 var4 = this.method1903(131072, (byte) -125, true, arg1);
            var5 = var4 == null ? null : var4.field3512;
        } else {
            var5 = this.field4509;
            this.field4509 = null;
        }
        if (var5 != null) {
            class252.method1412(var5, this.field4502, super.field6132, super.field6129, (boolean[]) null);
        }
        if (arg0 < 27) {
            this.field4497 = 20;
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)I")
    public final int method9(int arg0) {
        if (arg0 != -769) {
            return 63;
        } else {
            ++field4492;
            return this.field4497;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)Z")
    public final boolean method7(boolean arg0) {
        if (arg0) {
            field4505 = null;
        }
        ++field4485;
        return this.field4501;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lml;ILjava/lang/String;I)Lcc;")
    public static final class474 method1901(class241 arg0, int arg1, String arg2, int arg3) {
        ++field4498;
        if (arg1 == 0) {
            return arg0.method1343(arg2, (byte) 127);
        } else {
            if (arg3 >= -124) {
                method1905((char) 65434, 66);
            }
            if (arg1 == 1) {
                try {
                    class361.method2209("openjs", arg0.field3209, 7182, new Object[] { (new URL(arg0.field3209.getCodeBase(), arg2)).toString() });
                    class474 var4 = new class474();
                    var4.field6534 = 1;
                    return var4;
                } catch (Throwable var10) {
                    class474 var5 = new class474();
                    var5.field6534 = 2;
                    return var5;
                }
            } else if (~arg1 == -3) {
                try {
                    arg0.field3209.getAppletContext().showDocument(new URL(arg0.field3209.getCodeBase(), arg2), "_blank");
                    class474 var6 = new class474();
                    var6.field6534 = 1;
                    return var6;
                } catch (Exception var11) {
                    class474 var7 = new class474();
                    var7.field6534 = 2;
                    return var7;
                }
            } else if (arg1 == 3) {
                try {
                    class361.method2207(arg0.field3209, "loggedout", (byte) -121);
                } catch (Throwable var13) {
                }
                try {
                    arg0.field3209.getAppletContext().showDocument(new URL(arg0.field3209.getCodeBase(), arg2), "_top");
                    class474 var8 = new class474();
                    var8.field6534 = 1;
                    return var8;
                } catch (Exception var12) {
                    class474 var9 = new class474();
                    var9.field6534 = 2;
                    return var9;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)I")
    public final int method4(int arg0) {
        if (arg0 != -10666) {
            return -116;
        } else {
            ++field4496;
            return this.field4507;
        }
    }

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "(I)I")
    public final int method51(int arg0) {
        ++field4508;
        if (arg0 != 100) {
            return -48;
        } else {
            return this.field4484 == null ? 0 : this.field4484.method1871();
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lwm;II)Lgn;")
    private final class456 method1902(class364 arg0, int arg1, int arg2) {
        ++field4506;
        if (arg2 != 13750) {
            field4494 = 70;
        }
        if (this.field4484 != null && arg0.method2103(this.field4484.method1863(), arg1) == 0) {
            return this.field4484;
        } else {
            class266 var4 = this.method1903(arg1, (byte) -125, false, arg0);
            return var4 == null ? null : var4.field3514;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIBLwm;)Z")
    public final boolean method14(int arg0, int arg1, byte arg2, class364 arg3) {
        ++field4499;
        if (arg2 > -107) {
            return true;
        } else {
            class456 var5 = this.method1902(arg3, 65536, 13750);
            if (var5 != null) {
                class203 var6 = arg3.method1960();
                var6.method1029(super.field6132, super.field6137, super.field6129);
                return var5.method1882(arg0, arg1, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBZLwm;)Lij;")
    private final class266 method1903(int arg0, byte arg1, boolean arg2, class364 arg3) {
        ++field4490;
        class88 var5 = class1.field23.method935(this.field4504 & 65535, (byte) -114);
        class177 var6;
        class177 var7;
        if (!this.field4491) {
            var6 = class289.field3896[this.field4502];
            if (this.field4502 >= 3) {
                var7 = null;
            } else {
                var7 = class289.field3896[this.field4502 + 1];
            }
        } else {
            var7 = class289.field3896[0];
            var6 = class312.field4112[this.field4502];
        }
        if (arg1 != -125) {
            this.field4509 = null;
        }
        return var5.method560(super.field6137, var6, this.field4497, super.field6129, super.field6132, false, arg0, arg2, arg3, var7, this.field4507);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILwm;I)Lgn;")
    public final class456 method15(int arg0, class364 arg1, int arg2) {
        ++field4488;
        if (arg2 != -28045) {
            this.method9(6);
        }
        return this.method1902(arg1, arg0, 13750);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(Lwm;B)Lnf;")
    public final class374 method3(class364 arg0, byte arg1) {
        ++field4487;
        if (this.field4484 == null) {
            return null;
        } else {
            class203 var3 = arg0.method1960();
            var3.method1029(super.field6132 - -super.field6136, super.field6137, super.field6139 + super.field6129);
            if (arg1 <= 99) {
                this.method4(2);
            }
            class374 var4 = null;
            if (this.field4493) {
                var4 = class358.method2196(1, (byte) 124);
            }
            this.field4484.method1880(var3, var4 == null ? null : var4.field5156[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public final void method1(int arg0) {
        if (this.field4484 != null) {
            this.field4484.method1843();
        }
        if (arg0 > -105) {
            this.method10((class364) null, (byte) 82);
        }
        ++field4500;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lwm;Lct;IIIIZIIIII)V")
    public class332(class364 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class299.method1678(arg10, 47, arg11));
        this.field4502 = (byte) arg2;
        this.field4504 = (short) arg1.field1298;
        this.field4497 = (byte) arg11;
        super.field6129 = (short) arg5;
        super.field6132 = (short) arg3;
        this.field4507 = (byte) arg10;
        this.field4491 = arg6;
        this.field4493 = arg1.field1265 != 0 && !arg6;
        this.field4501 = arg0.method2011() && arg1.field1264 && !this.field4491 && class488.field6789.field6682 != 0;
        class266 var13 = this.method1903(1024, (byte) -125, this.field4501, arg0);
        if (var13 != null) {
            this.field4509 = var13.field3512;
            this.field4484 = var13.field3514;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static void method1904(byte arg0) {
        field4505 = null;
        if (arg0 <= 70) {
            method1901((class241) null, 43, (String) null, 117);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(CI)B")
    public static final byte method1905(char arg0, int arg1) {
        if (arg1 != 18658) {
            field4494 = -48;
        }
        ++field4503;
        byte var2;
        if ((arg0 <= 0 || ~arg0 <= -129) && (~arg0 > -161 || arg0 > 255)) {
            if (arg0 != 8364) {
                if (~arg0 != -8219) {
                    if (~arg0 != -403) {
                        if (arg0 == 8222) {
                            var2 = -124;
                        } else if (~arg0 != -8231) {
                            if (arg0 != 8224) {
                                if (~arg0 == -8226) {
                                    var2 = -121;
                                } else if (~arg0 == -711) {
                                    var2 = -120;
                                } else if (~arg0 == -8241) {
                                    var2 = -119;
                                } else if (~arg0 == -353) {
                                    var2 = -118;
                                } else if (arg0 == 8249) {
                                    var2 = -117;
                                } else if (~arg0 == -339) {
                                    var2 = -116;
                                } else if (~arg0 != -382) {
                                    if (~arg0 == -8217) {
                                        var2 = -111;
                                    } else if (arg0 != 8217) {
                                        if (arg0 != 8220) {
                                            if (arg0 == 8221) {
                                                var2 = -108;
                                            } else if (~arg0 != -8227) {
                                                if (arg0 == 8211) {
                                                    var2 = -106;
                                                } else if (~arg0 == -8213) {
                                                    var2 = -105;
                                                } else if (~arg0 == -733) {
                                                    var2 = -104;
                                                } else if (~arg0 == -8483) {
                                                    var2 = -103;
                                                } else if (arg0 != 353) {
                                                    if (~arg0 == -8251) {
                                                        var2 = -101;
                                                    } else if (arg0 != 339) {
                                                        if (arg0 == 382) {
                                                            var2 = -98;
                                                        } else if (arg0 != 376) {
                                                            var2 = 63;
                                                        } else {
                                                            var2 = -97;
                                                        }
                                                    } else {
                                                        var2 = -100;
                                                    }
                                                } else {
                                                    var2 = -102;
                                                }
                                            } else {
                                                var2 = -107;
                                            }
                                        } else {
                                            var2 = -109;
                                        }
                                    } else {
                                        var2 = -110;
                                    }
                                } else {
                                    var2 = -114;
                                }
                            } else {
                                var2 = -122;
                            }
                        } else {
                            var2 = -123;
                        }
                    } else {
                        var2 = -125;
                    }
                } else {
                    var2 = -126;
                }
            } else {
                var2 = -128;
            }
        } else {
            var2 = (byte) arg0;
        }
        return var2;
    }
}
