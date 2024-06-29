import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class337 {

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4997 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "[I")
    public static int[] field4998 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field5000;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "[Ld;")
    public static class83[] field4994;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2169(byte arg0) {
        if (arg0 >= -34) {
            method2172(-38, false);
        }
        if (class343.field5050 != null) {
            class379 var1 = class343.field5050;
            synchronized (class343.field5050) {
                class343.field5050 = null;
            }
        }
        field4996++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILbk;)V", line = 34)
    public static final void method2170(int arg0, class211 arg1) {
        field4993++;
        if ((arg1.field2867.length - arg1.field2888) < 1) {
            return;
        }
        int var2 = arg1.method1342((byte) -127);
        if (var2 < 0 || var2 > 14) {
            return;
        }
        byte var3;
        if (var2 == 14) {
            var3 = 36;
        } else if (var2 == 13) {
            var3 = 35;
        } else if (var2 == 12) {
            var3 = 34;
        } else if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > (arg1.field2867.length - arg1.field2888)) {
            return;
        }
        class287.field4044 = arg1.method1342((byte) -128);
        if (class287.field4044 < 1) {
            class287.field4044 = 1;
        } else if (class287.field4044 > 4) {
            class287.field4044 = 4;
        }
        class246.method1553(-93, arg1.method1342((byte) -128) == 1);
        class67.field763 = arg1.method1342((byte) -128) == 1;
        class281.field3945 = arg1.method1342((byte) -126) == 1;
        class78.field885 = arg1.method1342((byte) -126) == 1;
        class318.field4509 = arg1.method1342((byte) -127) == 1 ? 1 : 0;
        class40.field424 = arg1.method1342((byte) -128) == 1;
        class420.field6046 = arg1.method1342((byte) -126) == 1;
        class41.field487 = arg1.method1342((byte) -128) == 1;
        class341.field5022 = arg1.method1342((byte) -127);
        if (class341.field5022 > 2) {
            class341.field5022 = 2;
        }
        if (var2 >= 2) {
            class216.field2943 = arg1.method1342((byte) -127) == 1;
        } else {
            class216.field2943 = arg1.method1342((byte) -127) == 1;
            arg1.method1342((byte) -126);
        }
        if (arg0 != 1000000) {
            method2170(18, (class211) null);
        }
        class307.field4399 = arg1.method1342((byte) -126) == 1;
        class25.field245 = arg1.method1342((byte) -127) == 1;
        class166.field2336 = arg1.method1342((byte) -128);
        if (class166.field2336 > 2) {
            class166.field2336 = 2;
        }
        class384.field5630 = class166.field2336;
        class159.field2255 = arg1.method1342((byte) -126) == 1;
        class351.field5129 = arg1.method1342((byte) -126);
        if (class351.field5129 > 127) {
            class351.field5129 = 127;
        }
        class75.field834 = arg1.method1342((byte) -128);
        class308.field4405 = arg1.method1342((byte) -127);
        if (class308.field4405 > 127) {
            class308.field4405 = 127;
        }
        if (var2 >= 1) {
            class373.field5445 = arg1.method1355(32136);
            class430.field6235 = arg1.method1355(32136);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1342((byte) -127);
        }
        if (var2 >= 4) {
            int var4 = arg1.method1342((byte) -126);
            if (var4 < 0 || var4 > 2) {
                var4 = 0;
            }
            if (class343.field5053 < 96) {
                var4 = 0;
            }
            class119.method680(var4, 2);
        }
        if (var2 >= 5) {
            class21.field221 = arg1.method1336((byte) -29);
        }
        int var5 = 0;
        if (var2 >= 6) {
            class288.field4081 = var5 = arg1.method1342((byte) -126);
        }
        if (class288.field4081 != 1 && class288.field4081 != 2) {
            class288.field4081 = 2;
        }
        if (var2 >= 7) {
            class152.field2133 = arg1.method1342((byte) -126) == 1;
        }
        if (var2 >= 8) {
            class291.field4173 = arg1.method1342((byte) -126) == 1;
        }
        if (var2 >= 9) {
            class169.field2373 = arg1.method1342((byte) -127);
        }
        if (class169.field2373 < 0 || class169.field2373 > 3) {
            class169.field2373 = 0;
        }
        if (var2 >= 10) {
            class73.field820 = arg1.method1342((byte) -128) != 0;
        }
        if (var2 >= 11) {
            class8.field97 = arg1.method1342((byte) -127) != 0;
        }
        if (var2 >= 12) {
            class318.field4509 = arg1.method1342((byte) -128);
        }
        if (class318.field4509 < 0 || class318.field4509 > 2) {
            class318.field4509 = 1;
        }
        if (var2 >= 13) {
            class436.field6388 = arg1.method1342((byte) -127) == 1;
        }
        if (var2 >= 14) {
            class264.field3709 = arg1.method1342((byte) -128);
        } else if (var5 == 0) {
            class264.field3709 = 2;
        } else {
            class264.field3709 = 1;
        }
        if (class264.field3709 < 0 || class264.field3709 > 3) {
            class264.field3709 = 2;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 246)
    public static void method2171(int arg0) {
        field4994 = null;
        field4997 = null;
        if (arg0 >= 52) {
            field4998 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZ)V", line = 258)
    public static final void method2172(int arg0, boolean arg1) {
        field5002++;
        class331 var2 = class83.field936;
        synchronized (class83.field936) {
            class83.field936.method2054(111, arg0);
            if (!arg1) {
                field4994 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIB)V", line = 274)
    public static final void method2173(int arg0, int arg1, byte arg2) {
        int var3 = -70 / ((arg2 + 77) / 40);
        field4999++;
        class100 var4 = class152.method906((byte) 87, arg0);
        int var5 = var4.field1123;
        int var6 = var4.field1131;
        int var7 = var4.field1121;
        int var8 = class410.field5934[var7 - var6];
        if (arg1 < 0 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        class252.method1577(var5, ~var9 & class282.field3967[var5] | var9 & arg1 << var6, -52);
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V", line = 306)
    public class337() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B[BLbk;)V", line = 313)
    public final void method2174(byte arg0, byte[] arg1, class211 arg2) {
        field4995++;
        if (arg2.field2867[arg2.field2888] != 31 || arg2.field2867[arg2.field2888 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field5000 == null) {
            this.field5000 = new Inflater(true);
        }
        try {
            this.field5000.setInput(arg2.field2867, arg2.field2888 + 10, arg2.field2867.length - 10 - (arg2.field2888 - -8));
            this.field5000.inflate(arg1);
            if (arg0 <= 0) {
                method2172(103, false);
            }
        } catch (Exception var4) {
            this.field5000.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field5000.reset();
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(III)V", line = 344)
    private class337(int arg0, int arg1, int arg2) {
    }
}
