import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class445 extends class113 {

    @OriginalMember(owner = "client!os", name = "r", descriptor = "Lhg;")
    public static class693 field5913 = new class693(74, 11);

    @OriginalMember(owner = "client!os", name = "z", descriptor = "Lsf;")
    public static class526 field5921 = new class526("", 11);

    @OriginalMember(owner = "client!os", name = "B", descriptor = "I")
    public static int field5923 = -1;

    @OriginalMember(owner = "client!os", name = "E", descriptor = "[I")
    public static int[] field5926 = new int[13];

    @OriginalMember(owner = "client!os", name = "F", descriptor = "[B")
    public static byte[] field5927 = new byte[520];

    @OriginalMember(owner = "client!os", name = "D", descriptor = "Lhg;")
    public static class693 field5925 = new class693(51, 16);

    @OriginalMember(owner = "client!os", name = "C", descriptor = "F")
    public static float field5924;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!os", name = "y", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "Liea;")
    private class481 field5908;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "Liea;")
    private class481 field5909;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "Liea;")
    private class481 field5911;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "Liea;")
    public class481 field5915;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "Liea;")
    private class481 field5916;

    @OriginalMember(owner = "client!os", name = "A", descriptor = "Liea;")
    private class481 field5922;

    @OriginalMember(owner = "client!os", name = "G", descriptor = "Lnd;")
    public static class547 field5928;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILha;)V", line = 4)
    public static final void method2521(int arg0, class60 arg1) {
        if (arg0 != 0) {
            method2523((byte) -15);
        }
        ++field5910;
        for (class509 var2 = (class509) class259.field3282.method162(-22305); var2 != null; var2 = (class509) class259.field3282.method158(false)) {
            if (var2.field7177) {
                var2.method2980(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)Z", line = 27)
    public final boolean method369(int arg0) {
        ++field5918;
        if (!super.method369(arg0)) {
            return false;
        } else {
            class510 var2 = (class510) super.field1627;
            if (!super.field1633.method3154(var2.field7183, (byte) 98)) {
                return false;
            } else if (!super.field1633.method3154(var2.field7191, (byte) 98)) {
                return false;
            } else if (!super.field1633.method3154(var2.field7184, (byte) 98)) {
                return false;
            } else if (!super.field1633.method3154(var2.field7181, (byte) 98)) {
                return false;
            } else if (!super.field1633.method3154(var2.field7188, (byte) 98)) {
                return false;
            } else {
                return super.field1633.method3154(var2.field7189, (byte) 98);
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZIZI)V", line = 62)
    public final void method892(boolean arg0, int arg1, boolean arg2, int arg3) {
        ++field5920;
        if (arg2) {
            int[] var5 = new int[4];
            class386.field4930.method483(var5);
            class386.field4930.method534(arg3, arg1, arg3 - -super.field1627.field5988, super.field1627.field5978 + arg1);
            int var6 = this.field5922.method142();
            int var7 = this.field5922.method149();
            int var8 = this.field5916.method142();
            int var9 = this.field5916.method149();
            this.field5922.method2759(arg3, arg1 - -((super.field1627.field5978 - var7) / 2));
            this.field5916.method2759(-var8 + super.field1627.field5988 + arg3, arg1 - -((-var9 + super.field1627.field5978) / 2));
            class386.field4930.method534(arg3, arg1, super.field1627.field5988 + arg3, arg1 + this.field5909.method149());
            this.field5909.method2766(arg3 + var6, arg1, -var8 + super.field1627.field5988 - var6, super.field1627.field5978);
            int var10 = this.field5908.method149();
            class386.field4930.method534(arg3, super.field1627.field5978 + arg1 - var10, super.field1627.field5988 + arg3, arg1 - -super.field1627.field5978);
            this.field5908.method2766(arg3 + var6, -var10 + arg1 + super.field1627.field5978, -var6 + super.field1627.field5988 + -var8, super.field1627.field5978);
            class386.field4930.method534(var5[0], var5[1], var5[2], var5[3]);
        }
        if (!arg0) {
            method2522(50, -36, -107, (String) null, 127, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V", line = 101)
    public final void method366(int arg0) {
        super.method366(arg0);
        ++field5914;
        class510 var2 = (class510) super.field1627;
        this.field5915 = class533.method3062(-66, var2.field7183, super.field1633);
        this.field5911 = class533.method3062(arg0 + -18418, var2.field7191, super.field1633);
        this.field5922 = class533.method3062(-33, var2.field7184, super.field1633);
        this.field5916 = class533.method3062(-24, var2.field7181, super.field1633);
        this.field5909 = class533.method3062(arg0 ^ -18227, var2.field7188, super.field1633);
        this.field5908 = class533.method3062(-122, var2.field7189, super.field1633);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZBII)V", line = 129)
    public final void method891(boolean arg0, byte arg1, int arg2, int arg3) {
        ++field5919;
        int var5 = this.field5922.method142() + arg3;
        int var6 = super.field1627.field5988 + arg3 + -this.field5916.method142();
        int var7 = arg2 + this.field5909.method149();
        int var8 = super.field1627.field5978 + arg2 - this.field5908.method149();
        int var9 = var6 - var5;
        int var10 = -var7 + var8;
        int var11 = this.method893(true) * var9 / 10000;
        if (arg1 >= -77) {
            field5926 = null;
        }
        int[] var12 = new int[4];
        class386.field4930.method483(var12);
        class386.field4930.method534(var5, var7, var5 + var11, var8);
        this.method787(var10, var7, var9, (byte) -109, var5);
        class386.field4930.method534(var5 + var11, var7, var6, var8);
        this.field5911.method2766(var5, var7, var9, var10);
        class386.field4930.method534(var12[0], var12[1], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIILjava/lang/String;I[B)I", line = 161)
    public static final int method2522(int arg0, int arg1, int arg2, String arg3, int arg4, byte[] arg5) {
        ++field5912;
        int var6 = -arg0 + arg2;
        if (arg4 > -87) {
            method2522(-86, -31, -95, (String) null, -104, (byte[]) null);
        }
        for (int var7 = 0; var6 > var7; ++var7) {
            char var8 = arg3.charAt(arg0 + var7);
            if (var8 > 0 && ~var8 > -129 || var8 >= 160 && ~var8 >= -256) {
                arg5[arg1 + var7] = (byte) var8;
            } else if (var8 != 8364) {
                if (~var8 == -8219) {
                    arg5[arg1 - -var7] = -126;
                } else if (~var8 != -403) {
                    if (var8 != 8222) {
                        if (var8 != 8230) {
                            if (var8 != 8224) {
                                if (var8 == 8225) {
                                    arg5[arg1 + var7] = -121;
                                } else if (~var8 != -711) {
                                    if (var8 == 8240) {
                                        arg5[arg1 + var7] = -119;
                                    } else if (~var8 != -353) {
                                        if (var8 == 8249) {
                                            arg5[arg1 + var7] = -117;
                                        } else if (~var8 != -339) {
                                            if (~var8 != -382) {
                                                if (~var8 == -8217) {
                                                    arg5[arg1 + var7] = -111;
                                                } else if (~var8 != -8218) {
                                                    if (~var8 == -8221) {
                                                        arg5[arg1 - -var7] = -109;
                                                    } else if (var8 != 8221) {
                                                        if (var8 != 8226) {
                                                            if (var8 == 8211) {
                                                                arg5[arg1 + var7] = -106;
                                                            } else if (var8 == 8212) {
                                                                arg5[arg1 - -var7] = -105;
                                                            } else if (~var8 != -733) {
                                                                if (var8 == 8482) {
                                                                    arg5[arg1 + var7] = -103;
                                                                } else if (var8 == 353) {
                                                                    arg5[arg1 + var7] = -102;
                                                                } else if (var8 == 8250) {
                                                                    arg5[arg1 + var7] = -101;
                                                                } else if (~var8 != -340) {
                                                                    if (var8 == 382) {
                                                                        arg5[arg1 - -var7] = -98;
                                                                    } else if (~var8 != -377) {
                                                                        arg5[arg1 + var7] = 63;
                                                                    } else {
                                                                        arg5[arg1 - -var7] = -97;
                                                                    }
                                                                } else {
                                                                    arg5[arg1 - -var7] = -100;
                                                                }
                                                            } else {
                                                                arg5[arg1 - -var7] = -104;
                                                            }
                                                        } else {
                                                            arg5[arg1 + var7] = -107;
                                                        }
                                                    } else {
                                                        arg5[arg1 - -var7] = -108;
                                                    }
                                                } else {
                                                    arg5[arg1 + var7] = -110;
                                                }
                                            } else {
                                                arg5[arg1 + var7] = -114;
                                            }
                                        } else {
                                            arg5[arg1 + var7] = -116;
                                        }
                                    } else {
                                        arg5[arg1 + var7] = -118;
                                    }
                                } else {
                                    arg5[arg1 - -var7] = -120;
                                }
                            } else {
                                arg5[arg1 - -var7] = -122;
                            }
                        } else {
                            arg5[arg1 - -var7] = -123;
                        }
                    } else {
                        arg5[arg1 - -var7] = -124;
                    }
                } else {
                    arg5[arg1 + var7] = -125;
                }
            } else {
                arg5[arg1 + var7] = -128;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lnd;Lnd;Lek;)V", line = 299)
    public class445(class547 arg0, class547 arg1, class510 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V", line = 307)
    public static void method2523(byte arg0) {
        field5921 = null;
        field5925 = null;
        field5928 = null;
        field5926 = null;
        field5913 = null;
        if (arg0 != -64) {
            field5924 = 0.34912628F;
        }
        field5927 = null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIBI)V", line = 324)
    public void method787(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        this.field5915.method2766(arg4, arg1, arg2, arg0);
        ++field5917;
        if (arg3 != -109) {
            this.field5922 = null;
        }
    }
}
