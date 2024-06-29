import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class140 extends class266 {

    @OriginalMember(owner = "client!ak", name = "sc", descriptor = "Ljava/lang/String;")
    public static String field1941 = "Members object";

    @OriginalMember(owner = "client!ak", name = "qc", descriptor = "[I")
    public static int[] field1939 = new int[50];

    @OriginalMember(owner = "client!ak", name = "Ec", descriptor = "I")
    public static int field1953 = 0;

    @OriginalMember(owner = "client!ak", name = "rc", descriptor = "Lab;")
    public static class148 field1940 = new class148();

    @OriginalMember(owner = "client!ak", name = "tc", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!ak", name = "uc", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!ak", name = "vc", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ak", name = "wc", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!ak", name = "yc", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!ak", name = "zc", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!ak", name = "Ac", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ak", name = "Bc", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!ak", name = "Cc", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!ak", name = "Dc", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!ak", name = "Fc", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ak", name = "Gc", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!ak", name = "xc", descriptor = "Lg;")
    public class284 field1946;

    @OriginalMember(owner = "client!ak", name = "Hc", descriptor = "[[B")
    public static byte[][] field1956;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)I")
    public static final int method943(int arg0) {
        ++field1942;
        class95.field1350 = arg0;
        return class211.method1376((byte) -35);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIII)V")
    public final void method170(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1945;
        if (this.field1946 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)Z")
    public final boolean method555(boolean arg0) {
        if (!arg0) {
            this.method120(78, 44, 127, 57, -64, 119, 108, 124, 111L, 118, (class97) null);
        }
        ++field1947;
        return this.field1946 != null;
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(B)V")
    public static void method944(byte arg0) {
        field1940 = null;
        field1939 = null;
        field1956 = null;
        field1941 = null;
        if (arg0 != 81) {
            field1941 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(III)J")
    public static final long method945(int arg0, int arg1, int arg2) {
        class89 var3 = class194.field2682[arg0][arg1][arg2];
        return var3 != null && var3.field1244 != null ? var3.field1244.field2719 : 0L;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)I")
    public final int method554(byte arg0) {
        ++field1948;
        if (~class124.field1746 != -1 && this.field1946.field4450 != null) {
            class284 var2 = this.field1946.method1905((byte) -26);
            if (var2 != null && ~var2.field4442 != 0) {
                return var2.field4442;
            }
        }
        if (arg0 <= 0) {
            method945(86, -111, -123);
        }
        return super.field4025;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lg;I)V")
    public final void method946(class284 arg0, int arg1) {
        if (arg1 != -1) {
            field1951 = -3;
        }
        ++field1944;
        this.field1946 = arg0;
        if (super.field4078 != null) {
            super.field4078.method642();
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "()I")
    public final int method106() {
        ++field1950;
        return super.field4088;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
    public static final void method947(int arg0, int arg1) {
        class247.field3782 = -1;
        class76.field1068 = arg0;
        class131.field1849 = 0;
        class122.field1705 = -1;
        ++field1943;
        client.field2186 = null;
        if (arg1 >= -84) {
            field1940 = null;
        }
        class202.field2806 = 1;
        class82.field1117 = false;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIIIJILnl;)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class97 arg10) {
        ++field1952;
        if (this.field1946 != null) {
            class240 var13 = super.field4040 != -1 && super.field3985 == 0 ? class132.method905(true, super.field4040) : null;
            class240 var14 = ~super.field4050 == 0 || super.field4050 == this.method1741((byte) 53).field2106 && var13 != null ? null : class132.method905(true, super.field4050);
            class25 var15 = this.field1946.method1915(super.field4066, super.field3994, super.field4080, super.field4022, super.field4048, var14, 85, var13, super.field4013, super.field4024);
            if (var15 != null) {
                super.field4088 = var15.method106();
                class284 var16 = this.field1946;
                if (var16.field4450 != null) {
                    var16 = var16.method1905((byte) -26);
                }
                if (class29.field390 && var16.field4393) {
                    class25 var17 = class21.method157(super.field4003, this.field1946.field4425, super.field4019, var14 != null ? var14 : var13, var15, var14 != null ? super.field4066 : super.field4024, this.field1946.field4433, 116, this.field1946.field4431, this.field1946.field4408, arg0, this.field1946.field4432, super.field3987, super.field4085);
                    var17.method120(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field4078);
                }
                this.method1746(var15, 2);
                this.method1745(-25893, var15, arg0);
                class25 var18 = null;
                if (super.field4046 != -1 && super.field4077 != -1) {
                    class191 var19 = class82.method512(super.field4046, (byte) 122);
                    var18 = var19.method1225(super.field4062, super.field4077, super.field4061, false);
                    if (var18 != null) {
                        var18.method119(0, -super.field4047, 0);
                        if (var19.field2636) {
                            if (class269.field4124 != 0) {
                                var18.method107(class269.field4124);
                            }
                            if (class257.field3926 != 0) {
                                var18.method118(class257.field3926);
                            }
                            if (~class131.field1852 != -1) {
                                var18.method119(0, class131.field1852, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class18) var15).method126(var18);
                }
                if (this.field1946.field4431 == 1) {
                    var15.field335 = true;
                }
                var15.method120(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field4078);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field1955;
    }
}
