import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class289 extends class207 {

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "I")
    private int field4108 = 0;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "Lcs;")
    private class189 field4093 = new class189(16);

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    private int field4119 = 0;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "Lvn;")
    private class169 field4118 = new class169();

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "J")
    private long field4120 = 0L;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    private int field4102;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "Lwq;")
    private class93 field4107;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "Z")
    private boolean field4116;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "Lvn;")
    private class169 field4115;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "Lsj;")
    private class266 field4113;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    private int field4086;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "Lwq;")
    private class93 field4097;

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "Z")
    private boolean field4121;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    private int field4094;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "Lah;")
    private class216 field4114;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "Lvp;")
    private class101 field4112;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4090 = "yellow:";

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4101 = "";

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "Luk;")
    private class142 field4109;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "Lfr;")
    public static class236 field4089;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "Z")
    private boolean field4117;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "[B")
    private byte[] field4095;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "[[Z")
    public static boolean[][] field4111;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V", line = 12)
    public final void method1839(int arg0) {
        field4106++;
        if (this.field4115 == null || this.method1309((byte) -12) == null) {
            return;
        }
        for (class359 var2 = this.field4118.method1124(arg0 + 32497); var2 != null; var2 = this.field4118.method1119(false)) {
            int var3 = (int) var2.field5248;
            if (var3 < 0 || this.field4109.field2009 <= var3 || this.field4109.field1998[var3] == 0) {
                var2.method2290((byte) 98);
            } else {
                if (this.field4095[var3] == 0) {
                    this.method1844(var3, (byte) -126, 1);
                }
                if (this.field4095[var3] == -1) {
                    this.method1844(var3, (byte) -123, 2);
                }
                if (this.field4095[var3] == 1) {
                    var2.method2290((byte) 98);
                }
            }
        }
        if (arg0 != -32498) {
            this.field4109 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V", line = 59)
    public final void method1840(int arg0) {
        field4084++;
        if (this.field4107 == null) {
            return;
        }
        this.field4117 = true;
        if (this.field4115 == null) {
            this.field4115 = new class169();
        }
        if (arg0 != 1000) {
            this.method1848(true);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V", line = 78)
    public final void method1841(boolean arg0) {
        field4088++;
        if (this.field4115 != null) {
            if (this.method1309((byte) -12) == null) {
                return;
            }
            if (this.field4116) {
                boolean var6 = true;
                for (class359 var7 = this.field4115.method1124(-1); var7 != null; var7 = this.field4115.method1119(false)) {
                    int var9 = (int) var7.field5248;
                    if (this.field4095[var9] == 0) {
                        this.method1844(var9, (byte) -122, 1);
                    }
                    if (this.field4095[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method2290((byte) 98);
                    }
                }
                while (this.field4109.field1998.length > this.field4119) {
                    if (this.field4109.field1998[this.field4119] == 0) {
                        this.field4119++;
                    } else {
                        if (this.field4113.field3717 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field4095[this.field4119] == 0) {
                            this.method1844(this.field4119, (byte) -123, 1);
                        }
                        if (this.field4095[this.field4119] == 0) {
                            class359 var8 = new class359();
                            var8.field5248 = (long) this.field4119;
                            var6 = false;
                            this.field4115.method1125(-1, var8);
                        }
                        this.field4119++;
                    }
                }
                if (var6) {
                    this.field4119 = 0;
                    this.field4116 = false;
                }
            } else if (this.field4117) {
                boolean var2 = true;
                for (class359 var3 = this.field4115.method1124(-1); var3 != null; var3 = this.field4115.method1119(!arg0)) {
                    int var5 = (int) var3.field5248;
                    if (this.field4095[var5] != 1) {
                        this.method1844(var5, (byte) -121, 2);
                    }
                    if (this.field4095[var5] == 1) {
                        var3.method2290((byte) 98);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field4109.field1998.length > this.field4119) {
                    if (this.field4109.field1998[this.field4119] == 0) {
                        this.field4119++;
                    } else {
                        if (this.field4114.method1422(45)) {
                            var2 = false;
                            break;
                        }
                        if (this.field4095[this.field4119] != 1) {
                            this.method1844(this.field4119, (byte) -119, 2);
                        }
                        if (this.field4095[this.field4119] != 1) {
                            class359 var4 = new class359();
                            var4.field5248 = (long) this.field4119;
                            var2 = false;
                            this.field4115.method1125(-1, var4);
                        }
                        this.field4119++;
                    }
                }
                if (var2) {
                    this.field4117 = false;
                    this.field4119 = 0;
                }
            } else {
                this.field4115 = null;
            }
        }
        if (this.field4121 && class203.method1299((byte) 5) >= this.field4120) {
            for (class101 var10 = (class101) this.field4093.method1212(-44); var10 != null; var10 = (class101) this.field4093.method1207(false)) {
                if (!var10.field1141) {
                    if (var10.field1144) {
                        if (!var10.field1145) {
                            throw new RuntimeException();
                        }
                        var10.method2290((byte) 98);
                    } else {
                        var10.field1144 = true;
                    }
                }
            }
            this.field4120 = class203.method1299((byte) 5) + 1000L;
        }
        if (!arg0) {
            this.field4116 = true;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)I", line = 255)
    public static final int method1842(byte arg0, int arg1) {
        if (arg0 != 101) {
            method1849((byte) -97);
        }
        field4099++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)Luk;", line = 280)
    public final class142 method1309(byte arg0) {
        field4092++;
        if (arg0 != -12) {
            return null;
        } else if (this.field4109 == null) {
            if (this.field4112 == null) {
                if (this.field4114.method1415(25501)) {
                    return null;
                }
                this.field4112 = this.field4114.method1420(255, (byte) 0, this.field4102, true, true);
            }
            if (this.field4112.field1141) {
                return null;
            }
            byte[] var2 = this.field4112.method84(-5714);
            if (this.field4112 instanceof class10) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field4109 = new class142(var2, this.field4094);
                    if (this.field4109.field2010 != this.field4086) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field4109 = null;
                    if (this.field4114.method1415(arg0 ^ 0xFFFF9C69)) {
                        this.field4112 = null;
                    } else {
                        this.field4112 = this.field4114.method1420(255, (byte) 0, this.field4102, true, true);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field4109 = new class142(var2, this.field4094);
                } catch (RuntimeException var4) {
                    this.field4114.method1412(false);
                    this.field4109 = null;
                    if (this.field4114.method1415(25501)) {
                        this.field4112 = null;
                    } else {
                        this.field4112 = this.field4114.method1420(255, (byte) 0, this.field4102, true, true);
                    }
                    return null;
                }
                if (this.field4097 != null) {
                    this.field4113.method1696(var2, this.field4102, -1, this.field4097);
                }
            }
            if (this.field4107 != null) {
                this.field4095 = new byte[this.field4109.field2009];
                this.field4108 = 0;
            }
            this.field4112 = null;
            return this.field4109;
        } else {
            return this.field4109;
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)I", line = 381)
    public final int method1843(int arg0) {
        field4104++;
        if (this.field4109 == null) {
            return 0;
        } else if (arg0 == 0) {
            return this.field4109.field1995;
        } else {
            return -84;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBI)Lvp;", line = 397)
    private final class101 method1844(int arg0, byte arg1, int arg2) {
        field4100++;
        class101 var4 = (class101) this.field4093.method1204((byte) -103, (long) arg0);
        if (var4 != null && arg2 == 0 && !var4.field1145 && var4.field1141) {
            var4.method2290((byte) 98);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field4107 == null || this.field4095[arg0] == -1) {
                    if (this.field4114.method1415(25501)) {
                        return null;
                    }
                    var4 = this.field4114.method1420(this.field4102, (byte) 2, arg0, true, true);
                } else {
                    var4 = this.field4113.method1698(arg0, this.field4107, 1);
                }
            } else if (arg2 == 1) {
                if (this.field4107 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4113.method1694(arg0, (byte) 113, this.field4107);
            } else if (arg2 == 2) {
                if (this.field4107 == null) {
                    throw new RuntimeException();
                }
                if (this.field4095[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4114.method1422(114)) {
                    return null;
                }
                var4 = this.field4114.method1420(this.field4102, (byte) 2, arg0, false, true);
            } else {
                throw new RuntimeException();
            }
            this.field4093.method1202(-1, (long) arg0, var4);
        }
        if (var4.field1141) {
            return null;
        }
        if (arg1 > -117) {
            this.method1317(73, (byte) 33);
        }
        byte[] var5 = var4.method84(-5714);
        if (!var4 instanceof class10) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class382.field5609.reset();
                class382.field5609.update(var5, 0, var5.length - 2);
                int var6 = (int) class382.field5609.getValue();
                if (this.field4109.field1993[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field4114.field2963 = 0;
                this.field4114.field2965 = 0;
            } catch (RuntimeException var12) {
                this.field4114.method1412(false);
                var4.method2290((byte) 98);
                if (var4.field1145 && !this.field4114.method1415(25501)) {
                    class353 var7 = this.field4114.method1420(this.field4102, (byte) 2, arg0, true, true);
                    this.field4093.method1202(-1, (long) arg0, var7);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4109.field2007[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field4109.field2007[arg0];
            if (this.field4107 != null) {
                this.field4113.method1696(var5, arg0, -1, this.field4107);
                if (this.field4095[arg0] != 1) {
                    this.field4108++;
                    this.field4095[arg0] = 1;
                }
            }
            if (!var4.field1145) {
                var4.method2290((byte) 98);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class382.field5609.reset();
            class382.field5609.update(var5, 0, var5.length - 2);
            int var8 = (int) class382.field5609.getValue();
            if (this.field4109.field1993[arg0] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4109.field2007[arg0] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field4095[arg0] != 1) {
                this.field4108++;
                this.field4095[arg0] = 1;
            }
            if (!var4.field1145) {
                var4.method2290((byte) 98);
            }
            return var4;
        } catch (Exception var11) {
            this.field4095[arg0] = -1;
            var4.method2290((byte) 98);
            if (var4.field1145 && !this.field4114.method1415(25501)) {
                class353 var10 = this.field4114.method1420(this.field4102, (byte) 2, arg0, true, true);
                this.field4093.method1202(-1, (long) arg0, var10);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)I", line = 612)
    public final int method1845(int arg0) {
        field4091++;
        if (this.field4109 == null) {
            return 0;
        } else if (this.field4116) {
            class359 var2 = this.field4115.method1124(-1);
            if (var2 == null) {
                return 0;
            } else {
                int var3 = -75 % ((-arg0 - 64) / 49);
                return (int) var2.field5248;
            }
        } else {
            return this.field4109.field1995;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;Ltc;ZB)V", line = 638)
    public static final void method1846(String arg0, class196 arg1, boolean arg2, byte arg3) {
        field4083++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        if (arg3 > -74) {
            field4103 = -76;
        }
        int var7 = class1.field1.method1745(arg0, -46, (class11[]) null, 250);
        int var8 = class1.field1.method1755(arg0, (class11[]) null, 4, 250) * 13;
        class218.field2991.method995(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -16777216, 0);
        class218.field2991.method958(var5 - var4, -var4 + var6, var7 + var4 + var4, var4 + var4 + var8, -1, 0);
        arg1.method1241(0, var8, var6, 1, (class121) null, arg0, 93, -1, 0, (int[]) null, var5, 1, var7, 0, (class11[]) null, -1);
        class334.method2144(var6 - var4, (byte) -64, var5 - var4, var4 + var8 - -var4, var4 + var4 + var7);
        if (arg2) {
            class218.field2991.method1022();
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)I", line = 668)
    public final int method1847(byte arg0) {
        field4087++;
        if (arg0 != 9) {
            field4101 = null;
        }
        if (this.method1309((byte) -12) == null) {
            return this.field4112 == null ? 0 : this.field4112.method85((byte) 127);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)I", line = 688)
    public final int method1316(int arg0, int arg1) {
        if (arg0 == 0) {
            field4096++;
            class101 var3 = (class101) this.field4093.method1204((byte) -117, (long) arg1);
            return var3 == null ? 0 : var3.method85((byte) 125);
        } else {
            return 102;
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Z)I", line = 705)
    public final int method1848(boolean arg0) {
        if (!arg0) {
            field4101 = null;
        }
        field4098++;
        return this.field4108;
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(B)V", line = 720)
    public static void method1849(byte arg0) {
        field4111 = null;
        if (arg0 == -98) {
            field4089 = null;
            field4090 = null;
            field4101 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)V", line = 734)
    public static final void method1850(boolean arg0) {
        class379 var1 = class343.field5050;
        synchronized (class343.field5050) {
            class137.field1922 = class66.field748;
            class109.field1254++;
            class57.field654 = class271.field3843;
            if (!arg0) {
                method1849((byte) -66);
            }
            class48.field562 = class168.field2349;
            class353.field5154 = class147.field2057;
            class302.field4326 = class150.field2102;
            class124.field1643 = client.field2297;
            class350.field5117 = class132.field1815;
            class147.field2057 = 0;
        }
        field4105++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)[B", line = 764)
    public final byte[] method1310(int arg0, int arg1) {
        field4110++;
        class101 var3 = this.method1844(arg1, (byte) -128, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method84(-5714);
            var3.method2290((byte) 98);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(ILwq;Lwq;Lah;Lsj;IIZ)V", line = 837)
    public class289(int arg0, class93 arg1, class93 arg2, class216 arg3, class266 arg4, int arg5, int arg6, boolean arg7) {
        this.field4102 = arg0;
        this.field4107 = arg1;
        if (this.field4107 == null) {
            this.field4116 = false;
        } else {
            this.field4116 = true;
            this.field4115 = new class169();
        }
        this.field4113 = arg4;
        this.field4086 = arg6;
        this.field4097 = arg2;
        this.field4121 = arg7;
        this.field4094 = arg5;
        this.field4114 = arg3;
        if (this.field4097 != null) {
            this.field4112 = this.field4113.method1698(this.field4102, this.field4097, 1);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)V", line = 789)
    public final void method1317(int arg0, byte arg1) {
        field4085++;
        if (this.field4107 == null || arg1 != 0) {
            return;
        }
        for (class359 var3 = this.field4118.method1124(-1); var3 != null; var3 = this.field4118.method1119(false)) {
            if (((long) arg0) == var3.field5248) {
                return;
            }
        }
        class359 var4 = new class359();
        var4.field5248 = (long) arg0;
        this.field4118.method1125(-1, var4);
    }
}
