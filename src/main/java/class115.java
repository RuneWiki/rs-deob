import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class115 extends class539 implements class353 {

    @OriginalMember(owner = "client!bba", name = "I", descriptor = "I")
    public static int field1975 = 0;

    @OriginalMember(owner = "client!bba", name = "H", descriptor = "B")
    private byte field1974;

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!bba", name = "A", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!bba", name = "B", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!bba", name = "C", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!bba", name = "D", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!bba", name = "E", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!bba", name = "F", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!bba", name = "G", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!bba", name = "J", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!bba", name = "K", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!bba", name = "L", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 4)
    public static final String method1015(int arg0, String arg1) {
        if (arg0 != 2) {
            return null;
        } else {
            ++field1966;
            if (arg1 == null) {
                return null;
            } else {
                int var2 = 0;
                int var3 = arg1.length();
                while (var3 > var2 && class327.method2083((byte) 113, arg1.charAt(var2))) {
                    ++var2;
                }
                while (~var3 < ~var2 && class327.method2083((byte) 104, arg1.charAt(var3 + -1))) {
                    --var3;
                }
                int var4 = -var2 + var3;
                if (~var4 <= -2 && var4 <= 12) {
                    StringBuffer var5 = new StringBuffer(var4);
                    for (int var6 = var2; ~var6 > ~var3; ++var6) {
                        char var7 = arg1.charAt(var6);
                        if (class123.method1055(var7, arg0 + 108)) {
                            char var8 = class190.method1372(var7, -10072);
                            if (~var8 != -1) {
                                var5.append(var8);
                            }
                        }
                    }
                    if (var5.length() == 0) {
                        return null;
                    } else {
                        return var5.toString();
                    }
                } else {
                    return null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILcea;)Lfu;", line = 59)
    public static final class392 method1016(int arg0, class215 arg1) {
        ++field1978;
        class524 var2 = class410.method2542(arg0 ^ arg0, arg1);
        int var3 = arg1.method1520(13638);
        return new class392(var2.field2322, var2.field2327, var2.field2324, var2.field2313, var2.field2325, var2.field2317, var2.field2320, var2.field2319, var2.field2315, var2.field7262, var2.field7258, var2.field7266, var2.field7265, var2.field7263, var2.field7260, var3);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)V", line = 72)
    public static final void method1017(byte arg0) {
        ++field1977;
        class569.field7823.method210(class184.field2783);
        if (arg0 < 9) {
            field1975 = -40;
        }
        class569.field7823.method179(class295.field4137, class602.field8263, class407.field5956, class581.field7959);
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)V", line = 87)
    public final void method878(int arg0) {
        super.method878(arg0);
        ++field1968;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)Z", line = 95)
    public final boolean method882(int arg0) {
        if (arg0 != 6331) {
            field1975 = -14;
        }
        ++field1972;
        return super.method3106(super.field7471.field5166, arg0 ^ 6331);
    }

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "(I)I", line = 106)
    public final int method1018(int arg0) {
        if (arg0 != 3545) {
            return -18;
        } else {
            ++field1970;
            return this.field1974;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 119)
    public final Buffer method880(boolean arg0, int arg1) {
        ++field1973;
        if (arg1 != 26775) {
            this.field1974 = 7;
        }
        return super.method3103(0, super.field7471.field5166, arg0);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Z)I", line = 137)
    public final int method877(boolean arg0) {
        ++field1969;
        if (arg0) {
            this.method882(-20);
        }
        return super.method877(arg0);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Ljaclib/memory/Source;IIB)Z", line = 148)
    public final boolean method881(Source arg0, int arg1, int arg2, byte arg3) {
        ++field1967;
        this.field1974 = (byte) arg1;
        if (arg3 >= -15) {
            this.field1974 = 62;
        }
        super.method3104(25625, arg0, arg2);
        return true;
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lbga;Z)V", line = 163)
    public class115(class358 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IBI)Z", line = 167)
    public final boolean method879(int arg0, byte arg1, int arg2) {
        ++field1971;
        this.field1974 = (byte) arg2;
        super.method1240(15959, arg0);
        if (arg1 <= 122) {
            this.method882(-86);
        }
        return true;
    }

    @OriginalMember(owner = "client!bba", name = "g", descriptor = "(I)V", line = 184)
    public static final void method1019(int arg0) {
        if (arg0 == 0) {
            if (class9.field124 == 2) {
                class170.field2657[0].method3919(class516.field7188[0]);
                class170.field2657[1].method3919(class516.field7188[1]);
            } else if (class9.field124 == 3) {
                class170.field2657[0].method3919(class516.field7188[0]);
                class170.field2657[1].method3919(class516.field7188[1]);
                class170.field2657[2].method3919(class516.field7188[2]);
            } else {
                class170.field2657[0].method3919(class516.field7188[0]);
                class170.field2657[1].method3919(class516.field7188[1]);
                class170.field2657[2].method3919(class516.field7188[2]);
                class170.field2657[3].method3919(class516.field7188[3]);
            }
        } else if (arg0 == 1) {
            if (class9.field124 == 2) {
                class170.field2657[0].method3919(class516.field7188[2]);
            } else if (class9.field124 == 3) {
                class170.field2657[0].method3919(class516.field7188[3]);
                class170.field2657[1].method3919(class516.field7188[4]);
            } else {
                class170.field2657[0].method3919(class516.field7188[4]);
                class170.field2657[1].method3919(class516.field7188[5]);
                class170.field2657[2].method3919(class516.field7188[6]);
            }
        } else {
            if (arg0 == 2) {
                if (class9.field124 == 2) {
                    class170.field2657[0].method3919(class516.field7188[3]);
                    return;
                }
                if (class9.field124 == 3) {
                    class170.field2657[0].method3919(class516.field7188[5]);
                    return;
                }
                class170.field2657[0].method3919(class516.field7188[7]);
            }
        }
    }
}
