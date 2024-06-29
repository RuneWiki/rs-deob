import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class438 {

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Z")
    private boolean field5951 = false;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    private int field5957 = -1;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    private int field5955 = -1;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    private int field5954 = -32768;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    private int field5982 = -1;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "Z")
    private boolean field5985 = false;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    private int field5973;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "B")
    private byte field5972;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    private int field5956;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "B")
    private byte field5983;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public int field5949;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public int field5966;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
    public int field5980;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "Z")
    private boolean field5970;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "Z")
    public static boolean field5984 = false;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "Lim;")
    public static class353 field5963 = new class353(66, 6);

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "[I")
    public static int[] field5986 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "Lgn;")
    public static class635 field5987 = new class635();

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    private int field5958;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    private int field5962;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    private int field5974;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    private int field5975;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "Lcq;")
    public static class106 field5988;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Llm;")
    public class309 field5950;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "Lna;")
    private class320 field5978;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "Lr;")
    private class521 field5968;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "Lk;")
    private class88 field5952;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "[Z")
    private boolean[] field5964;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lqa;Z)V")
    public final void method2544(class167 arg0, boolean arg1) {
        field5979++;
        this.method2548(this.field5956, (byte) 111, arg1, true, this.field5973, 262144, arg0);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)I")
    public final int method2545(boolean arg0) {
        if (arg0) {
            field5981++;
            return this.field5954;
        } else {
            return 97;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)V")
    private final void method2546(int arg0, byte arg1) {
        field5965++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class137 var5 = class626.field9084.method1093(0, this.field5966);
            class137 var6 = var5;
            if (var5.field1719 != null) {
                var5 = var5.method722(class257.field3191, -1);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1675 != null) {
                if (this.field5978 != null && var5.method718((byte) 105, this.field5978.field4428)) {
                    return;
                }
                var3 = var5.method720(false);
                if (this.field5955 != var5.field1679) {
                    var4 = var5.field1678;
                }
            } else if (var5.field1689 == -1) {
                if (var6 != null && var6.field1675 != null) {
                    if (this.field5978 != null && var6.method718((byte) 122, this.field5978.field4428)) {
                        return;
                    }
                    var3 = var6.method720(false);
                    if (this.field5955 != var6.field1679) {
                        var4 = var6.field1678;
                    }
                } else if (var6 != null && var6.field1689 != -1 && this.field5955 != var6.field1679) {
                    var3 = var6.field1689;
                    var4 = var6.field1678;
                }
            } else if (this.field5955 != var5.field1679) {
                var4 = var5.field1678;
                var3 = var5.field1689;
            }
        }
        if (var3 == -1) {
            this.field5978 = null;
            return;
        }
        this.field5968 = null;
        if (this.field5978 == null || this.field5978.field4428 != var3) {
            this.field5978 = class609.field8754.method535(var3, true);
        } else if (this.field5978.field4419 == 0) {
            return;
        }
        if (this.field5978.field4431 == null) {
            this.field5978 = null;
            return;
        }
        if (var4) {
            this.field5974 = (int) (Math.random() * (double) this.field5978.field4431.length);
            this.field5975 = ((int) (Math.random() * (double) this.field5978.field4432[this.field5974])) + 1;
        } else {
            this.field5975 = 1;
            this.field5974 = 0;
        }
        this.field5958 = this.field5974 + 1;
        if (this.field5958 < 0 || this.field5958 >= this.field5978.field4431.length) {
            this.field5958 = -1;
        }
        if (arg1 != 33) {
            method2556((byte) 122, 8, false);
        }
        this.field5962 = class7.field61 - this.field5975;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public static void method2547(byte arg0) {
        field5963 = null;
        field5988 = null;
        if (arg0 < -28) {
            field5987 = null;
            field5986 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBZZIILqa;)Lr;")
    public final class521 method2548(int arg0, byte arg1, boolean arg2, boolean arg3, int arg4, int arg5, class167 arg6) {
        field5960++;
        class137 var8 = class626.field9084.method1093(0, this.field5966);
        if (var8.field1719 != null) {
            var8 = var8.method722(class257.field3191, -1);
        }
        if (var8 == null) {
            this.method2552((byte) 11, arg6);
            this.field5955 = -1;
            this.field5957 = -1;
            this.field5982 = -1;
            return null;
        }
        if (!this.field5951 && this.field5955 != var8.field1679) {
            this.field5968 = null;
            this.method2546(-1, (byte) 33);
        }
        this.method2554(arg4, arg0, 0);
        if (arg2) {
            boolean var9 = arg2 & this.field5970 & class501.field6954.method3159(class428.field5845, true) != 0;
            arg2 = var9 & (this.field5982 != var8.field1679 || this.field5978 != null && class501.field6954.method3159(class428.field5845, true) >= 2 && (this.field5974 != this.field5957 || (this.field5978.field4429 || class551.field7667) && this.field5974 != this.field5958));
        }
        if (arg3 && !arg2) {
            this.field5955 = var8.field1679;
            return null;
        }
        if (arg2) {
            class68.method388(this.field5952, this.field5983, this.field5973, this.field5956, this.field5964);
            this.field5982 = -1;
            this.field5957 = -1;
        }
        int var10 = 110 % ((69 - arg1) / 36);
        class544 var11 = class501.field6947[this.field5983];
        class544 var12;
        if (this.field5985) {
            var12 = class50.field672[0];
        } else {
            var12 = this.field5983 < 3 ? class501.field6947[this.field5983 + 1] : null;
        }
        class521 var13 = null;
        if (this.field5978 != null) {
            if (arg2) {
                arg5 |= 0x40000;
            }
            var13 = var8.method723(this.field5956, this.field5949 == 11 ? 10 : this.field5949, arg6, this.field5949 == 11 ? this.field5980 + 4 : this.field5980, this.field5978, this.field5958, this.field5973, arg5, var12, this.field5974, var11, this.field5975, var11.method1040(this.field5973, this.field5956), (byte) 126);
            if (var13 == null) {
                this.field5954 = 0;
                this.field5964 = null;
                this.field5952 = null;
            } else {
                if (arg2) {
                    if (this.field5964 == null) {
                        this.field5964 = new boolean[4];
                    }
                    this.field5952 = var13.method1581(this.field5952);
                    class443.method2572(this.field5952, this.field5983, arg4, arg0, this.field5964);
                    this.field5982 = var8.field1679;
                    this.field5957 = this.field5974;
                }
                this.field5954 = var13.method1579();
            }
            this.field5968 = null;
        } else if (this.field5968 != null && arg5 == (arg5 & this.field5968.method1601()) && this.field5955 == var8.field1679) {
            var13 = this.field5968;
        } else {
            if (this.field5968 != null) {
                arg5 |= this.field5968.method1601();
            }
            class433 var14 = var8.method731(this.field5956, var11, this.field5973, this.field5949 == 11 ? 10 : this.field5949, arg5, arg6, var11.method1040(this.field5973, this.field5956), -15988, var12, this.field5949 == 11 ? this.field5980 + 4 : this.field5980, arg2);
            if (var14 == null) {
                this.field5968 = null;
                this.field5952 = null;
                this.field5954 = 0;
                this.field5964 = null;
            } else {
                var13 = var14.field5896;
                this.field5968 = var14.field5896;
                if (arg2) {
                    this.field5952 = var14.field5897;
                    this.field5964 = null;
                    class443.method2572(this.field5952, this.field5983, arg4, arg0, null);
                    this.field5982 = var8.field1679;
                    this.field5957 = -1;
                }
                this.field5954 = var13.method1579();
            }
        }
        this.field5973 = arg4;
        this.field5956 = arg0;
        this.field5955 = var8.field1679;
        return var13;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
    public static final void method2549(byte arg0) {
        field5977++;
        if (class174.field2251 || arg0 != -16) {
            return;
        }
        class48.method264(arg0 - 78, class497.field6933);
        if (class319.field4403 != null) {
            class48.method264(-115, class319.field4403);
        }
        class174.field2251 = true;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)Z")
    public static final boolean method2550(boolean arg0) {
        for (int var1 = class555.field7766; var1 < class183.field2341; var1++) {
            class563[][] var2 = class199.field2605[var1];
            for (int var3 = -class257.field3199; var3 <= 0; var3++) {
                int var4 = class155.field2012 + var3;
                int var5 = class155.field2012 - var3;
                if (var4 >= class389.field5401 || var5 < class145.field1893) {
                    for (int var6 = -class257.field3199; var6 <= 0; var6++) {
                        int var7 = class151.field1995 + var6;
                        int var8 = class151.field1995 - var6;
                        if (var4 >= class389.field5401) {
                            if (var7 >= class445.field6164) {
                                class563 var9 = var2[var4][var7];
                                if (var9 != null && var9.field7890) {
                                    class358.field4998 = arg0;
                                    class171.field2196.method756((byte) 61, var9);
                                    class171.field2196.method755((byte) -103);
                                }
                            }
                            if (var8 < class244.field3085) {
                                class563 var10 = var2[var4][var8];
                                if (var10 != null && var10.field7890) {
                                    class358.field4998 = arg0;
                                    class171.field2196.method756((byte) 61, var10);
                                    class171.field2196.method755((byte) -92);
                                }
                            }
                        }
                        if (var5 < class145.field1893) {
                            if (var7 >= class445.field6164) {
                                class563 var11 = var2[var5][var7];
                                if (var11 != null && var11.field7890) {
                                    class358.field4998 = arg0;
                                    class171.field2196.method756((byte) 61, var11);
                                    class171.field2196.method755((byte) -114);
                                }
                            }
                            if (var8 < class244.field3085) {
                                class563 var12 = var2[var5][var8];
                                if (var12 != null && var12.field7890) {
                                    class358.field4998 = arg0;
                                    class171.field2196.method756((byte) 61, var12);
                                    class171.field2196.method755((byte) -90);
                                }
                            }
                        }
                        if (class310.field3972 == 0) {
                            if (class526.field7327) {
                                class171.field2196.method757(24, (byte) 11);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)V")
    public final void method2551(byte arg0, int arg1) {
        this.field5951 = true;
        field5971++;
        if (arg0 < 99) {
            this.field5955 = 99;
        }
        this.method2546(arg1, (byte) 33);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLqa;)V")
    public final void method2552(byte arg0, class167 arg1) {
        if (arg0 != 11) {
            method2556((byte) 84, -1, true);
        }
        if (this.field5952 != null) {
            class68.method388(this.field5952, this.field5983, this.field5973, this.field5956, this.field5964);
            this.field5964 = null;
            this.field5952 = null;
        }
        field5959++;
    }

    @OriginalMember(owner = "client!ej", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field5950 != null) {
            this.field5950.method1861();
        }
        field5953++;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(B)Z")
    public final boolean method2553(byte arg0) {
        field5976++;
        return arg0 == -73 ? this.field5970 : true;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V")
    private final void method2554(int arg0, int arg1, int arg2) {
        field5961++;
        if (arg2 != 0) {
            this.field5966 = -100;
        }
        label90: while (true) {
            if (this.field5978 == null) {
                if (this.field5951) {
                    return;
                }
                this.method2546(-1, (byte) 33);
                if (this.field5978 == null) {
                    return;
                }
            }
            int var4 = class7.field61 - this.field5962;
            if (var4 > 100 && this.field5978.field4421 > 0) {
                int var5 = this.field5978.field4431.length - this.field5978.field4421;
                while (this.field5974 < var5 && var4 > this.field5978.field4432[this.field5974]) {
                    var4 -= this.field5978.field4432[this.field5974];
                    this.field5974++;
                }
                if (var5 <= this.field5974) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field5978.field4431.length; var7++) {
                        var6 += this.field5978.field4432[var7];
                    }
                    var4 %= var6;
                }
                this.field5958 = this.field5974 + 1;
                if (this.field5958 >= this.field5978.field4431.length) {
                    this.field5958 -= this.field5978.field4421;
                    if (this.field5958 < 0 || this.field5958 >= this.field5978.field4431.length) {
                        this.field5958 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field5978.field4432[this.field5974] >= var4) {
                            this.field5962 = class7.field61 - var4;
                            this.field5975 = var4;
                            return;
                        }
                        class627.method3629(arg1, false, this.field5978, this.field5974, this.field5972, (byte) -128, arg0);
                        var4 -= this.field5978.field4432[this.field5974];
                        this.field5974++;
                        if (this.field5978.field4431.length <= this.field5974) {
                            this.field5974 -= this.field5978.field4421;
                            if (this.field5974 < 0 || this.field5974 >= this.field5978.field4431.length) {
                                this.field5978 = null;
                                continue label90;
                            }
                        }
                        this.field5958 = this.field5974 + 1;
                    } while (this.field5958 < this.field5978.field4431.length);
                    this.field5958 -= this.field5978.field4421;
                } while (this.field5958 >= 0 && this.field5978.field4431.length > this.field5958);
                this.field5958 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lr;IZIIIILqa;)V")
    public final void method2555(class521 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class167 arg7) {
        field5969++;
        if (arg6 != -1) {
            method2547((byte) 75);
        }
        class601[] var9 = arg0.method1600();
        class55[] var10 = arg0.method1584();
        if ((this.field5950 == null || this.field5950.field3949) && (var9 != null || var10 != null)) {
            class137 var11 = class626.field9084.method1093(0, this.field5966);
            if (var11.field1719 != null) {
                var11 = var11.method722(class257.field3191, arg6);
            }
            if (var11 != null) {
                this.field5950 = class309.method1850(class7.field61);
            }
        }
        if (this.field5950 == null) {
            return;
        }
        if (arg2) {
            this.field5950.method1856(arg7, (long) class7.field61, var9, var10, false);
        } else {
            this.field5950.method1862((long) class7.field61);
        }
        this.field5950.method1859(this.field5972, arg5, arg3, arg4, arg1);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BIZ)V")
    public static final void method2556(byte arg0, int arg1, boolean arg2) {
        field5967++;
        class164 var3 = class130.method695(arg2, arg1, Integer.MIN_VALUE);
        if (var3 == null) {
            return;
        }
        if (arg0 != 48) {
            method2550(true);
        }
        for (int var4 = 0; var4 < var3.field2084.length; var4++) {
            var3.field2084[var4] = -1;
            var3.field2086[var4] = 0;
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lqa;Lbu;IIIIIIZI)V")
    public class438(class167 arg0, class137 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field5973 = arg6;
        this.field5972 = (byte) arg4;
        this.field5956 = arg7;
        this.field5983 = (byte) arg5;
        this.field5949 = arg2;
        this.field5985 = arg8;
        this.field5966 = arg1.field1679;
        this.field5980 = arg3;
        this.field5970 = arg0.method951() && arg1.field1725 && !this.field5985;
        if (arg9 != -1) {
            this.field5951 = true;
        }
        this.method2546(arg9, (byte) 33);
    }
}
