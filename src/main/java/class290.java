import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class290 extends class74 {

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    private int field4564 = 0;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
    private int field4575 = 4096;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "Ljava/lang/String;")
    public static String field4569 = "Hidden";

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "[I")
    public static int[] field4571 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "[I")
    public static int[] field4570 = new int[500];

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "I")
    public static int field4573 = 0;

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "[[I")
    public static int[][] field4574 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "[[[I")
    public static int[][][] field4566;

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class290() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field4575 = arg1.method293(-116);
            }
        } else {
            this.field4564 = arg1.method293(91);
        }
        ++field4567;
        if (arg0 != -79) {
            this.field4575 = -32;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)V")
    public static final void method1952(byte arg0, int arg1) {
        ++field4565;
        class295 var2 = class250.method1673(-111, 5, arg1);
        if (arg0 > -88) {
            method1953(9, (String) null, (String) null, (String) null);
        }
        var2.method1979(-8205);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        ++field4568;
        if (arg0 != 4) {
            method1957(102);
        }
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (super.field1254.field3118) {
            int[] var4 = this.method590(0, 0, arg1);
            for (int var5 = 0; var5 < class178.field2662; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field4564 <= var6 && ~var6 >= ~this.field4575 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1953(int arg0, String arg1, String arg2, String arg3) {
        ++field4577;
        int var4 = arg1.length();
        int var5 = arg3.length();
        int var6 = arg2.length();
        if (~var5 == -1) {
            throw new IllegalArgumentException("Key cannot have zero length");
        } else {
            int var7 = var6 - var5;
            int var8 = var4;
            if (var7 != 0) {
                int var9 = 0;
                while (true) {
                    int var10 = arg1.indexOf(arg3, var9);
                    if (~var10 > -1) {
                        break;
                    }
                    var9 = var5 + var10;
                    var8 += var7;
                }
            }
            StringBuffer var11 = new StringBuffer(var8);
            int var12 = arg0;
            while (true) {
                int var13 = arg1.indexOf(arg3, var12);
                if (~var13 > -1) {
                    var11.append(arg1.substring(var12));
                    return var11.toString();
                }
                var11.append(arg1.substring(var12, var13));
                var11.append(arg2);
                var12 = var13 - -var5;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)V")
    public static final void method1954(int arg0) {
        class245.field3802.method1783(0);
        ++field4562;
        class13.field228.method1783(0);
        if (arg0 <= 69) {
            field4571 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1955(String arg0, int arg1) {
        ++field4576;
        if (arg1 != 0) {
            method1954(-22);
        }
        return class6.method74(true, (byte) 99, arg0, 10);
    }

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V")
    public static void method1956(int arg0) {
        field4570 = null;
        field4574 = null;
        field4569 = null;
        field4571 = null;
        int var1 = 109 % ((arg0 - -50) / 50);
        field4566 = null;
    }

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "(I)V")
    public static final void method1957(int arg0) {
        ++field4563;
        if (arg0 != 1) {
            field4572 = 118;
        }
        for (class144 var1 = (class144) class286.field4493.method1010(117); var1 != null; var1 = (class144) class286.field4493.method1008((byte) 88)) {
            if (var1.field2247) {
                var1.method996(true);
            }
        }
        for (class144 var2 = (class144) class203.field3164.method1010(111); var2 != null; var2 = (class144) class203.field3164.method1008((byte) 88)) {
            if (var2.field2247) {
                var2.method996(true);
            }
        }
    }
}
