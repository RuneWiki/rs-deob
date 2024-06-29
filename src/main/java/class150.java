import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class150 {

    @OriginalMember(owner = "client!sia", name = "l", descriptor = "Ljava/lang/String;")
    private String field2346 = "null";

    @OriginalMember(owner = "client!sia", name = "g", descriptor = "C")
    public char field2341;

    @OriginalMember(owner = "client!sia", name = "h", descriptor = "C")
    public char field2342;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!sia", name = "d", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!sia", name = "f", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!sia", name = "i", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!sia", name = "j", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!sia", name = "k", descriptor = "I")
    private int field2345;

    @OriginalMember(owner = "client!sia", name = "m", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!sia", name = "o", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!sia", name = "p", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!sia", name = "q", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!sia", name = "r", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!sia", name = "e", descriptor = "Lpl;")
    private class616 field2339;

    @OriginalMember(owner = "client!sia", name = "n", descriptor = "Lpl;")
    public class616 field2348;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(BLofa;)V", line = 3)
    public final void method1136(byte arg0, class301 arg1) {
        field2352++;
        while (true) {
            int var3 = arg1.method1987(-6);
            if (var3 == 0) {
                if (arg0 == 16) {
                    return;
                } else {
                    this.method1144((byte) -90);
                    return;
                }
            }
            this.method1140(arg1, (byte) -114, var3);
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)V", line = 24)
    private final void method1137(int arg0) {
        if (arg0 != -6) {
            return;
        }
        field2343++;
        this.field2339 = new class616(this.field2348.method3514(-56002843));
        for (class495 var2 = (class495) this.field2348.method3508((byte) -41); var2 != null; var2 = (class495) this.field2348.method3520(-1)) {
            class407 var3 = new class407(var2.field7165, (int) var2.field1039);
            this.field2339.method3516(255, class747.method4176(var2.field7165, (byte) -83), var3);
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 51)
    public final boolean method1138(byte arg0, String arg1) {
        field2335++;
        if (this.field2348 == null) {
            return false;
        } else if (arg0 > -74) {
            return true;
        } else {
            if (this.field2339 == null) {
                this.method1137(-6);
            }
            for (class407 var3 = (class407) this.field2339.method3512(true, class747.method4176(arg1, (byte) -83)); var3 != null; var3 = (class407) this.field2339.method3513(-1)) {
                if (var3.field6029.equals(arg1)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IZ)Z", line = 79)
    public final boolean method1139(int arg0, boolean arg1) {
        field2344++;
        if (this.field2348 == null) {
            return false;
        }
        if (this.field2339 == null) {
            this.method1144((byte) -114);
        }
        class332 var3 = (class332) this.field2339.method3512(arg1, (long) arg0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lofa;BI)V", line = 101)
    private final void method1140(class301 arg0, byte arg1, int arg2) {
        if (arg1 >= -107) {
            method1145(-88, -117, 31, -91, 45, 27, -106, -74);
        }
        field2349++;
        if (arg2 == 1) {
            this.field2341 = class232.method1610(-21630, arg0.method1984(4));
        } else if (arg2 == 2) {
            this.field2342 = class232.method1610(-21630, arg0.method1984(4));
        } else if (arg2 == 3) {
            this.field2346 = arg0.method1958(-3438);
        } else if (arg2 == 4) {
            this.field2345 = arg0.method1934(-2);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method1989((byte) -64);
            this.field2348 = new class616(class567.method3292(var4, -74));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1934(-2);
                class65 var7;
                if (arg2 == 5) {
                    var7 = new class495(arg0.method1958(-3438));
                } else {
                    var7 = new class332(arg0.method1934(-2));
                }
                this.field2348.method3516(255, (long) var6, var7);
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(II)Ljava/lang/String;", line = 156)
    public final String method1141(int arg0, int arg1) {
        field2350++;
        if (this.field2348 == null) {
            return this.field2346;
        }
        class495 var3 = (class495) this.field2348.method3512(true, (long) arg0);
        if (arg1 == 29683) {
            return var3 == null ? this.field2346 : var3.field7165;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(BI)I", line = 177)
    public final int method1142(byte arg0, int arg1) {
        field2347++;
        if (this.field2348 == null) {
            return this.field2345;
        }
        class332 var3 = (class332) this.field2348.method3512(true, (long) arg1);
        if (arg0 > -71) {
            method1146(127, 97, null, (byte) -75);
        }
        return var3 == null ? this.field2345 : var3.field4880;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIB)I", line = 199)
    public static final int method1143(int arg0, int arg1, byte arg2) {
        field2338++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (arg2 < 108) {
                method1143(-98, -24, (byte) 62);
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(B)V", line = 236)
    private final void method1144(byte arg0) {
        this.field2339 = new class616(this.field2348.method3514(-56002843));
        field2340++;
        if (arg0 != -114) {
            this.method1137(127);
        }
        for (class332 var2 = (class332) this.field2348.method3508((byte) -124); var2 != null; var2 = (class332) this.field2348.method3520(-1)) {
            class332 var3 = new class332((int) var2.field1039);
            this.field2339.method3516(255, (long) var2.field4880, var3);
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIIIIII)V", line = 259)
    public static final void method1145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2336++;
        int var8 = arg7 - arg0;
        int var9 = arg0 + arg5;
        for (int var10 = arg5; var10 < var9; var10++) {
            class608.method3484(class77.field1131[var10], arg4, -7, arg2, arg1);
        }
        int var11 = arg1 - arg0;
        int var12 = arg0 + arg4;
        int var13 = arg7;
        if (arg6 != 12345678) {
            method1143(-106, 78, (byte) 34);
        }
        while (var13 > var8) {
            class608.method3484(class77.field1131[var13], arg4, arg6 ^ 0xFF439EB7, arg2, arg1);
            var13--;
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class77.field1131[var14];
            class608.method3484(var15, arg4, -7, arg2, var12);
            class608.method3484(var15, var12, -7, arg3, var11);
            class608.method3484(var15, var11, -7, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IILjava/lang/Object;B)[B", line = 315)
    public static final byte[] method1146(int arg0, int arg1, Object arg2, byte arg3) {
        field2351++;
        if (arg2 == null) {
            return null;
        } else if (arg3 != 113) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return class242.method1679(arg1, var4, 32896, arg0);
        } else if (arg2 instanceof class691) {
            class691 var5 = (class691) arg2;
            return var5.method1921(arg1, -65, arg0);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
