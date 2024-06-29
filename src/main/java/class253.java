import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class253 extends class167 {

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    private int field3935 = 0;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "Ljf;")
    private class227 field3963 = new class227(16);

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    private int field3969 = 0;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "Lnk;")
    private class2 field3971 = new class2();

    @OriginalMember(owner = "client!u", name = "U", descriptor = "J")
    private long field3974 = 0L;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    private int field3957;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Lch;")
    private class33 field3945;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "Z")
    private boolean field3972;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "Lnk;")
    private class2 field3970;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "Z")
    private boolean field3973;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    private int field3967;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "I")
    private int field3959;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "Lch;")
    private class33 field3966;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "Lnh;")
    private class247 field3951;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "Lff;")
    private class214 field3961;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "Lde;")
    private class164 field3953;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field3936 = -1;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field3934 = -1;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field3939 = -1;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Lnc;")
    private class107 field3938;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "Ljh;")
    public static class207 field3950;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Lwf;")
    public static class306 field3937;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "Lag;")
    public static class335 field3956;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "Z")
    private boolean field3968;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "[B")
    private byte[] field3947;

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(ILch;Lch;Lnh;Lff;IIZ)V", line = 838)
    public class253(int arg0, class33 arg1, class33 arg2, class247 arg3, class214 arg4, int arg5, int arg6, boolean arg7) {
        this.field3957 = arg0;
        this.field3945 = arg1;
        if (this.field3945 == null) {
            this.field3972 = false;
        } else {
            this.field3972 = true;
            this.field3970 = new class2();
        }
        this.field3973 = arg7;
        this.field3967 = arg6;
        this.field3959 = arg5;
        this.field3966 = arg2;
        this.field3951 = arg3;
        this.field3961 = arg4;
        if (this.field3966 != null) {
            this.field3953 = this.field3961.method1428(this.field3957, this.field3966, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 29)
    public static void method1702(int arg0) {
        field3950 = null;
        field3956 = null;
        field3937 = null;
        int var1 = 89 / ((arg0 - 50) / 56);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)I", line = 46)
    public final int method1139(int arg0, byte arg1) {
        field3944++;
        if (arg1 == 84) {
            class164 var3 = (class164) this.field3963.method1558((long) arg0, false);
            return var3 == null ? 0 : var3.method991(true);
        } else {
            return -34;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V", line = 64)
    public final void method1703(int arg0) {
        field3941++;
        if (this.field3945 == null) {
            return;
        }
        this.field3968 = true;
        if (arg0 != -2) {
            this.field3968 = true;
        }
        if (this.field3970 == null) {
            this.field3970 = new class2();
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III[II)V", line = 82)
    public static final void method1704(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        arg0--;
        field3964++;
        int var8 = arg1 - 1;
        int var5 = var8 - arg4;
        while (var5 > arg0) {
            int var6 = arg0 + 1;
            arg3[var6] = arg2;
            int var7 = var6 + 1;
            arg3[var7] = arg2;
            int var9 = var7 + 1;
            arg3[var9] = arg2;
            int var10 = var9 + 1;
            arg3[var10] = arg2;
            int var11 = var10 + 1;
            arg3[var11] = arg2;
            int var12 = var11 + 1;
            arg3[var12] = arg2;
            int var13 = var12 + 1;
            arg3[var13] = arg2;
            arg0 = var13 + 1;
            arg3[arg0] = arg2;
        }
        while (arg0 < var8) {
            arg0++;
            arg3[arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)I", line = 107)
    public final int method1705(byte arg0) {
        field3952++;
        int var2 = -35 % ((-arg0 - 40) / 48);
        return this.field3938 == null ? 0 : this.field3938.field1647;
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V", line = 121)
    public static final void method1706(int arg0) {
        field3943++;
        class345.field5347.method1298((byte) 110);
        class310.field4926.method1298((byte) 110);
        if (arg0 != 0) {
            field3950 = (class207) null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)I", line = 134)
    public static final int method1707(int arg0, int arg1, int arg2) {
        if (arg0 != 24567) {
            method1704(39, -26, 93, (int[]) null, -29);
        }
        class15 var3 = (class15) class247.field3868.method1558((long) arg1, false);
        field3940++;
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && var3.field151.length > arg2) {
            return var3.field151[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)I", line = 156)
    public final int method1708(boolean arg0) {
        field3946++;
        if (arg0) {
            this.method1140(-86, -79);
        }
        return this.field3935;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[B", line = 167)
    public final byte[] method1140(int arg0, int arg1) {
        field3942++;
        class164 var3 = this.method1713(arg1, 0, -26493);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method992(84);
            var3.method1284(arg0 + arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V", line = 186)
    public final void method1709(int arg0) {
        field3948++;
        int var2 = -37 / ((arg0) / 40);
        if (this.field3970 != null) {
            if (this.method1136((byte) 58) == null) {
                return;
            }
            if (this.field3972) {
                boolean var7 = true;
                for (class187 var8 = this.field3970.method10((byte) 39); var8 != null; var8 = this.field3970.method13((byte) -32)) {
                    int var9 = (int) var8.field2852;
                    if (this.field3947[var9] == 0) {
                        this.method1713(var9, 1, -26493);
                    }
                    if (this.field3947[var9] == 0) {
                        var7 = false;
                    } else {
                        var8.method1284(0);
                    }
                }
                while (this.field3938.field1633.length > this.field3969) {
                    if (this.field3938.field1633[this.field3969] == 0) {
                        this.field3969++;
                    } else {
                        if (this.field3961.field3389 >= 250) {
                            var7 = false;
                            break;
                        }
                        if (this.field3947[this.field3969] == 0) {
                            this.method1713(this.field3969, 1, -26493);
                        }
                        if (this.field3947[this.field3969] == 0) {
                            var7 = false;
                            class187 var10 = new class187();
                            var10.field2852 = (long) this.field3969;
                            this.field3970.method7((byte) -51, var10);
                        }
                        this.field3969++;
                    }
                }
                if (var7) {
                    this.field3969 = 0;
                    this.field3972 = false;
                }
            } else if (this.field3968) {
                boolean var3 = true;
                for (class187 var4 = this.field3970.method10((byte) 49); var4 != null; var4 = this.field3970.method13((byte) -32)) {
                    int var5 = (int) var4.field2852;
                    if (this.field3947[var5] != 1) {
                        this.method1713(var5, 2, -26493);
                    }
                    if (this.field3947[var5] == 1) {
                        var4.method1284(0);
                    } else {
                        var3 = false;
                    }
                }
                while (this.field3969 < this.field3938.field1633.length) {
                    if (this.field3938.field1633[this.field3969] == 0) {
                        this.field3969++;
                    } else {
                        if (this.field3951.method1683(20)) {
                            var3 = false;
                            break;
                        }
                        if (this.field3947[this.field3969] != 1) {
                            this.method1713(this.field3969, 2, -26493);
                        }
                        if (this.field3947[this.field3969] != 1) {
                            var3 = false;
                            class187 var6 = new class187();
                            var6.field2852 = (long) this.field3969;
                            this.field3970.method7((byte) -51, var6);
                        }
                        this.field3969++;
                    }
                }
                if (var3) {
                    this.field3969 = 0;
                    this.field3968 = false;
                }
            } else {
                this.field3970 = null;
            }
        }
        if (!this.field3973 || this.field3974 > class195.method1322(122)) {
            return;
        }
        for (class164 var11 = (class164) this.field3963.method1549((byte) -120); var11 != null; var11 = (class164) this.field3963.method1546(-1)) {
            if (!var11.field2528) {
                if (var11.field2527) {
                    if (!var11.field2523) {
                        throw new RuntimeException();
                    }
                    var11.method1284(0);
                } else {
                    var11.field2527 = true;
                }
            }
        }
        this.field3974 = class195.method1322(116) + 1000L;
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)I", line = 368)
    public final int method1710(int arg0) {
        field3954++;
        if (this.field3938 == null) {
            return 0;
        } else if (arg0 < 60) {
            return -73;
        } else if (this.field3972) {
            class187 var2 = this.field3970.method10((byte) 106);
            return var2 == null ? 0 : (int) var2.field2852;
        } else {
            return this.field3938.field1647;
        }
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)I", line = 396)
    public final int method1711(int arg0) {
        if (arg0 != -1) {
            return -63;
        }
        field3965++;
        if (this.method1136((byte) 58) == null) {
            return this.field3953 == null ? 0 : this.field3953.method991(true);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)Lnc;", line = 417)
    public final class107 method1136(byte arg0) {
        if (arg0 != 58) {
            this.method1139(-106, (byte) -33);
        }
        field3955++;
        if (this.field3938 != null) {
            return this.field3938;
        }
        if (this.field3953 == null) {
            if (this.field3951.method1682(126)) {
                return null;
            }
            this.field3953 = this.field3951.method1669(true, this.field3957, (byte) 126, 255, (byte) 0);
        }
        if (this.field3953.field2528) {
            return null;
        }
        byte[] var2 = this.field3953.method992(-110);
        if (this.field3953 instanceof class142) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3938 = new class107(var2, this.field3959);
                if (this.field3938.field1650 != this.field3967) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field3938 = null;
                if (this.field3951.method1682(123)) {
                    this.field3953 = null;
                } else {
                    this.field3953 = this.field3951.method1669(true, this.field3957, (byte) 79, 255, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3938 = new class107(var2, this.field3959);
            } catch (RuntimeException var6) {
                this.field3951.method1677(-21);
                this.field3938 = null;
                if (this.field3951.method1682(arg0 + 65)) {
                    this.field3953 = null;
                } else {
                    this.field3953 = this.field3951.method1669(true, this.field3957, (byte) 116, 255, (byte) 0);
                }
                return null;
            }
            if (this.field3966 != null) {
                this.field3961.method1432(this.field3957, var2, this.field3966, (byte) 85);
            }
        }
        this.field3953 = null;
        if (this.field3945 != null) {
            this.field3947 = new byte[this.field3938.field1655];
            this.field3935 = 0;
        }
        return this.field3938;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)V", line = 512)
    public final void method1712(boolean arg0) {
        field3958++;
        if (this.field3970 == null || this.method1136((byte) 58) == null) {
            return;
        }
        if (!arg0) {
            this.method1709(-27);
        }
        for (class187 var2 = this.field3971.method10((byte) 80); var2 != null; var2 = this.field3971.method13((byte) -32)) {
            int var3 = (int) var2.field2852;
            if (var3 < 0 || var3 >= this.field3938.field1655 || this.field3938.field1633[var3] == 0) {
                var2.method1284(0);
            } else {
                if (this.field3947[var3] == 0) {
                    this.method1713(var3, 1, -26493);
                }
                if (this.field3947[var3] == -1) {
                    this.method1713(var3, 2, -26493);
                }
                if (this.field3947[var3] == 1) {
                    var2.method1284(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)V", line = 564)
    public final void method1141(int arg0, int arg1) {
        field3949++;
        if (this.field3945 == null) {
            return;
        }
        for (class187 var3 = this.field3971.method10((byte) 127); var3 != null; var3 = this.field3971.method13((byte) -32)) {
            if ((long) arg0 == var3.field2852) {
                return;
            }
        }
        class187 var4 = new class187();
        if (arg1 != -2) {
            this.field3961 = (class214) null;
        }
        var4.field2852 = (long) arg0;
        this.field3971.method7((byte) -51, var4);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(III)Lde;", line = 602)
    private final class164 method1713(int arg0, int arg1, int arg2) {
        field3962++;
        if (arg2 != -26493) {
            this.method1136((byte) -16);
        }
        class164 var4 = (class164) this.field3963.method1558((long) arg0, false);
        if (var4 != null && arg1 == 0 && !var4.field2523 && var4.field2528) {
            var4.method1284(0);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field3945 == null || this.field3947[arg0] == -1) {
                    if (this.field3951.method1682(127)) {
                        return null;
                    }
                    var4 = this.field3951.method1669(true, arg0, (byte) 114, this.field3957, (byte) 2);
                } else {
                    var4 = this.field3961.method1428(arg0, this.field3945, (byte) 115);
                }
            } else if (arg1 == 1) {
                if (this.field3945 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3961.method1429(arg0, this.field3945, (byte) 101);
            } else if (arg1 == 2) {
                if (this.field3945 == null) {
                    throw new RuntimeException();
                }
                if (this.field3947[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3951.method1683(arg2 ^ 0xFFFF9897)) {
                    return null;
                }
                var4 = this.field3951.method1669(false, arg0, (byte) 112, this.field3957, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field3963.method1550(var4, (long) arg0, (byte) 101);
        }
        if (var4.field2528) {
            return null;
        }
        byte[] var5 = var4.method992(89);
        if (!var4 instanceof class142) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class90.field1369.reset();
                class90.field1369.update(var5, 0, var5.length - 2);
                int var10 = (int) class90.field1369.getValue();
                if (this.field3938.field1645[arg0] != var10) {
                    throw new RuntimeException();
                }
                this.field3951.field3896 = 0;
                this.field3951.field3894 = 0;
            } catch (RuntimeException var14) {
                this.field3951.method1677(86);
                var4.method1284(0);
                if (var4.field2523 && !this.field3951.method1682(127)) {
                    class329 var12 = this.field3951.method1669(true, arg0, (byte) 114, this.field3957, (byte) 2);
                    this.field3963.method1550(var12, (long) arg0, (byte) 10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3938.field1651[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field3938.field1651[arg0];
            if (this.field3945 != null) {
                this.field3961.method1432(arg0, var5, this.field3945, (byte) 85);
                if (this.field3947[arg0] != 1) {
                    this.field3935++;
                    this.field3947[arg0] = 1;
                }
            }
            if (!var4.field2523) {
                var4.method1284(0);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class90.field1369.reset();
            class90.field1369.update(var5, 0, var5.length - 2);
            int var6 = (int) class90.field1369.getValue();
            if (this.field3938.field1645[arg0] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3938.field1651[arg0] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field3947[arg0] != 1) {
                if (this.field3947[arg0] != 0) {
                }
                this.field3935++;
                this.field3947[arg0] = 1;
            }
            if (!var4.field2523) {
                var4.method1284(0);
            }
            return var4;
        } catch (Exception var13) {
            this.field3947[arg0] = -1;
            var4.method1284(0);
            if (var4.field2523 && !this.field3951.method1682(arg2 + 26616)) {
                class329 var9 = this.field3951.method1669(true, arg0, (byte) 58, this.field3957, (byte) 2);
                this.field3963.method1550(var9, (long) arg0, (byte) 50);
            }
            return null;
        }
    }
}
