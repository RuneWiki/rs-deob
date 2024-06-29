import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class477 extends class453 {

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    private int field6946 = 0;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "Lmn;")
    private class247 field6964 = new class247(16);

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    private int field6970 = 0;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "Lar;")
    private class479 field6973 = new class479();

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "J")
    private long field6975 = 0L;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    private int field6949;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "Lva;")
    private class343 field6957;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "Z")
    private boolean field6971;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "Lar;")
    private class479 field6974;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "Lug;")
    private class393 field6960;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Lbr;")
    private class269 field6956;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    private int field6963;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "Z")
    private boolean field6976;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    private int field6969;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Lva;")
    private class343 field6948;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "Lrn;")
    private class175 field6965;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "Lqn;")
    private class46 field6966;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "Z")
    private boolean field6972;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "[B")
    private byte[] field6959;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V")
    public final void method2795(byte arg0) {
        if (arg0 <= 40) {
            this.field6956 = null;
        }
        field6955++;
        if (this.field6957 != null) {
            this.field6972 = true;
            if (this.field6974 == null) {
                this.field6974 = new class479();
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
    public final void method2796(int arg0) {
        field6958++;
        if (this.field6974 != null) {
            if (this.method2671((byte) 0) == null) {
                return;
            }
            if (this.field6971) {
                boolean var2 = true;
                for (class260 var3 = this.field6974.method2818((byte) -2); var3 != null; var3 = this.field6974.method2820((byte) -58)) {
                    int var5 = (int) var3.field3615;
                    if (this.field6959[var5] == 0) {
                        this.method2797(var5, (byte) 115, 1);
                    }
                    if (this.field6959[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1565(0);
                    }
                }
                while (this.field6966.field563.length > this.field6970) {
                    if (this.field6966.field563[this.field6970] == 0) {
                        this.field6970++;
                    } else {
                        if (this.field6956.field3712 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field6959[this.field6970] == 0) {
                            this.method2797(this.field6970, (byte) 115, 1);
                        }
                        if (this.field6959[this.field6970] == 0) {
                            class260 var4 = new class260();
                            var4.field3615 = this.field6970;
                            var2 = false;
                            this.field6974.method2809(var4, arg0 ^ 0x4A82);
                        }
                        this.field6970++;
                    }
                }
                if (var2) {
                    this.field6971 = false;
                    this.field6970 = 0;
                }
            } else if (this.field6972) {
                boolean var6 = true;
                for (class260 var7 = this.field6974.method2818((byte) -83); var7 != null; var7 = this.field6974.method2820((byte) -58)) {
                    int var9 = (int) var7.field3615;
                    if (this.field6959[var9] != 1) {
                        this.method2797(var9, (byte) 115, 2);
                    }
                    if (this.field6959[var9] == 1) {
                        var7.method1565(0);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field6970 < this.field6966.field563.length) {
                    if (this.field6966.field563[this.field6970] == 0) {
                        this.field6970++;
                    } else {
                        if (this.field6960.method2378(-21)) {
                            var6 = false;
                            break;
                        }
                        if (this.field6959[this.field6970] != 1) {
                            this.method2797(this.field6970, (byte) 115, 2);
                        }
                        if (this.field6959[this.field6970] != 1) {
                            class260 var8 = new class260();
                            var8.field3615 = this.field6970;
                            this.field6974.method2809(var8, arg0 - 19070);
                            var6 = false;
                        }
                        this.field6970++;
                    }
                }
                if (var6) {
                    this.field6972 = false;
                    this.field6970 = 0;
                }
            } else {
                this.field6974 = null;
            }
        }
        if (arg0 != 19072 || !this.field6976 || class246.method1483(5957) < this.field6975) {
            return;
        }
        for (class175 var10 = (class175) this.field6964.method1494(0); var10 != null; var10 = (class175) this.field6964.method1493((byte) 104)) {
            if (!var10.field2597) {
                if (var10.field2601) {
                    if (!var10.field2600) {
                        throw new RuntimeException();
                    }
                    var10.method1565(0);
                } else {
                    var10.field2601 = true;
                }
            }
        }
        this.field6975 = class246.method1483(5957) + 1000L;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBI)Lrn;")
    private final class175 method2797(int arg0, byte arg1, int arg2) {
        field6967++;
        class175 var4 = (class175) this.field6964.method1492((long) arg0, arg1 + 6225);
        if (arg1 != 115) {
            this.method2671((byte) 69);
        }
        if (var4 != null && arg2 == 0 && !var4.field2600 && var4.field2597) {
            var4.method1565(arg1 ^ 0x73);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field6957 == null || this.field6959[arg0] == -1) {
                    if (this.field6960.method2374(true)) {
                        return null;
                    }
                    var4 = this.field6960.method2381(this.field6949, -1, true, (byte) 2, arg0);
                } else {
                    var4 = this.field6956.method1608(-63, this.field6957, arg0);
                }
            } else if (arg2 == 1) {
                if (this.field6957 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field6956.method1607(-4300, arg0, this.field6957);
            } else if (arg2 == 2) {
                if (this.field6957 == null) {
                    throw new RuntimeException();
                }
                if (this.field6959[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field6960.method2378(-21)) {
                    return null;
                }
                var4 = this.field6960.method2381(this.field6949, -1, false, (byte) 2, arg0);
            } else {
                throw new RuntimeException();
            }
            this.field6964.method1487(-35, (long) arg0, var4);
        }
        if (var4.field2597) {
            return null;
        }
        byte[] var5 = var4.method656(1);
        if (!var4 instanceof class526) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class348.field5083.reset();
                class348.field5083.update(var5, 0, var5.length - 2);
                int var6 = (int) class348.field5083.getValue();
                if (this.field6966.field558[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field6960.field5767 = 0;
                this.field6960.field5770 = 0;
            } catch (RuntimeException var12) {
                this.field6960.method2370(17044);
                var4.method1565(arg1 - 115);
                if (var4.field2600 && !this.field6960.method2374(true)) {
                    class84 var7 = this.field6960.method2381(this.field6949, -1, true, (byte) 2, arg0);
                    this.field6964.method1487(-68, (long) arg0, var7);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field6966.field554[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field6966.field554[arg0];
            if (this.field6957 != null) {
                this.field6956.method1605(arg0, (byte) -35, var5, this.field6957);
                if (this.field6959[arg0] != 1) {
                    this.field6946++;
                    this.field6959[arg0] = 1;
                }
            }
            if (!var4.field2600) {
                var4.method1565(0);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class348.field5083.reset();
            class348.field5083.update(var5, 0, var5.length - 2);
            int var8 = (int) class348.field5083.getValue();
            if (this.field6966.field558[arg0] != var8) {
                throw new RuntimeException();
            }
            int var9 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field6966.field554[arg0] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field6959[arg0] != 1) {
                this.field6946++;
                this.field6959[arg0] = 1;
            }
            if (!var4.field2600) {
                var4.method1565(arg1 ^ 0x73);
            }
            return var4;
        } catch (Exception var11) {
            this.field6959[arg0] = -1;
            var4.method1565(0);
            if (var4.field2600 && !this.field6960.method2374(true)) {
                class84 var10 = this.field6960.method2381(this.field6949, -1, true, (byte) 2, arg0);
                this.field6964.method1487(-75, (long) arg0, var10);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
    public final void method2798(int arg0) {
        field6947++;
        if (this.field6974 == null || this.method2671((byte) 0) == null || arg0 >= -18) {
            return;
        }
        for (class260 var2 = this.field6973.method2818((byte) 101); var2 != null; var2 = this.field6973.method2820((byte) -58)) {
            int var3 = (int) var2.field3615;
            if (var3 < 0 || this.field6966.field555 <= var3 || this.field6966.field563[var3] == 0) {
                var2.method1565(0);
            } else {
                if (this.field6959[var3] == 0) {
                    this.method2797(var3, (byte) 115, 1);
                }
                if (this.field6959[var3] == -1) {
                    this.method2797(var3, (byte) 115, 2);
                }
                if (this.field6959[var3] == 1) {
                    var2.method1565(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V")
    public final void method2667(int arg0, int arg1) {
        field6961++;
        if (this.field6957 == null) {
            return;
        }
        if (arg0 != 16) {
            this.field6949 = 52;
        }
        for (class260 var3 = this.field6973.method2818((byte) -46); var3 != null; var3 = this.field6973.method2820((byte) -58)) {
            if ((long) arg1 == var3.field3615) {
                return;
            }
        }
        class260 var4 = new class260();
        var4.field3615 = arg1;
        this.field6973.method2809(var4, 2);
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)I")
    public final int method2799(byte arg0) {
        field6968++;
        if (this.field6966 == null) {
            return 0;
        } else if (this.field6971) {
            class260 var2 = this.field6974.method2818((byte) -36);
            if (var2 == null) {
                return 0;
            } else if (arg0 == 107) {
                return (int) var2.field3615;
            } else {
                return 5;
            }
        } else {
            return this.field6966.field567;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)[B")
    public final byte[] method2669(byte arg0, int arg1) {
        if (arg0 < 43) {
            return null;
        }
        field6962++;
        class175 var3 = this.method2797(arg1, (byte) 115, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method656(1);
            var3.method1565(0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)I")
    public final int method2670(int arg0, byte arg1) {
        field6952++;
        if (arg1 != 87) {
            this.field6957 = null;
        }
        class175 var3 = (class175) this.field6964.method1492((long) arg0, 6340);
        return var3 == null ? 0 : var3.method657(0);
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)I")
    public final int method2800(byte arg0) {
        int var2 = 114 / ((8 - arg0) / 51);
        field6953++;
        return this.field6946;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Leo;IIIII)V")
    public static final void method2801(class194 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field2765 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class243.field3402[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class525 var13 = class94.field1451[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field2765; var14++) {
                            if (arg0.field2763[var14] == var13.field7770) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field2763[arg0.field2765++] = var13.field7770;
                        if (arg0.field2765 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field2765; var15 < 4; var15++) {
            arg0.field2763[var15] = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)I")
    public final int method2802(int arg0) {
        field6950++;
        if (arg0 != -31803) {
            this.method2796(-123);
        }
        return this.field6966 == null ? 0 : this.field6966.field567;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)Lqn;")
    public final class46 method2671(byte arg0) {
        field6954++;
        if (this.field6966 != null) {
            return this.field6966;
        }
        if (this.field6965 == null) {
            if (this.field6960.method2374(true)) {
                return null;
            }
            this.field6965 = this.field6960.method2381(255, -1, true, (byte) 0, this.field6949);
        }
        if (this.field6965.field2597) {
            return null;
        }
        if (arg0 != 0) {
            this.field6969 = 31;
        }
        byte[] var2 = this.field6965.method656(1);
        if (this.field6965 instanceof class526) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6966 = new class46(var2, this.field6969);
                if (this.field6966.field552 != this.field6963) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field6966 = null;
                if (this.field6960.method2374(true)) {
                    this.field6965 = null;
                } else {
                    this.field6965 = this.field6960.method2381(255, -1, true, (byte) 0, this.field6949);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6966 = new class46(var2, this.field6969);
            } catch (RuntimeException var4) {
                this.field6960.method2370(arg0 + 17044);
                this.field6966 = null;
                if (this.field6960.method2374(true)) {
                    this.field6965 = null;
                } else {
                    this.field6965 = this.field6960.method2381(255, arg0 - 1, true, (byte) 0, this.field6949);
                }
                return null;
            }
            if (this.field6948 != null) {
                this.field6956.method1605(this.field6949, (byte) -68, var2, this.field6948);
            }
        }
        this.field6965 = null;
        if (this.field6957 != null) {
            this.field6959 = new byte[this.field6966.field555];
            this.field6946 = 0;
        }
        return this.field6966;
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)I")
    public final int method2803(int arg0) {
        if (arg0 != 1) {
            this.method2799((byte) -27);
        }
        field6951++;
        if (this.method2671((byte) 0) == null) {
            return this.field6965 == null ? 0 : this.field6965.method657(arg0 ^ 0x1);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(ILva;Lva;Lug;Lbr;IIZ)V")
    public class477(int arg0, class343 arg1, class343 arg2, class393 arg3, class269 arg4, int arg5, int arg6, boolean arg7) {
        this.field6949 = arg0;
        this.field6957 = arg1;
        if (this.field6957 == null) {
            this.field6971 = false;
        } else {
            this.field6971 = true;
            this.field6974 = new class479();
        }
        this.field6960 = arg3;
        this.field6956 = arg4;
        this.field6963 = arg6;
        this.field6976 = arg7;
        this.field6969 = arg5;
        this.field6948 = arg2;
        if (this.field6948 != null) {
            this.field6965 = this.field6956.method1608(-78, this.field6948, this.field6949);
        }
    }
}
