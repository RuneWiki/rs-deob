import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class55 {

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "[I")
    private int[] field1203;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "[I")
    public static int[] field1196 = new int[50];

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "[I")
    public static int[] field1201 = new int[14];

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Lwc;", line = 4)
    public static final class104 method512(int arg0) {
        field1200++;
        if (arg0 != -18124) {
            field1198 = -120;
        }
        class104 var1 = (class104) class317.field5566.method1511((byte) 75);
        if (var1 != null) {
            var1.method2221(true);
            var1.method926((byte) -8);
            return var1;
        }
        class104 var2;
        do {
            var2 = (class104) class100.field1866.method1511((byte) 122);
            if (var2 == null) {
                return null;
            }
            if (var2.method880(true) > class127.method1015(21504)) {
                return null;
            }
            var2.method2221(true);
            var2.method926((byte) -8);
        } while ((Long.MIN_VALUE & var2.field2103) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILjava/lang/String;)V", line = 60)
    public static final void method513(int arg0, String arg1) {
        if (arg0 > 120) {
            field1195++;
            System.out.println("Error: " + class119.method949(arg1, 0, "\n", "%0a"));
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IBLud;II)V", line = 91)
    public static final void method514(int arg0, byte arg1, class279 arg2, int arg3, int arg4) {
        field1199++;
        class8 var5 = class103.method868(250, arg4, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field233 != null) {
            class23 var6 = new class23();
            var6.field595 = arg3;
            var6.field608 = var5.field233;
            var6.field596 = var5;
            var6.field607 = arg2;
            class279.method2017(0, var6);
        }
        boolean var7 = true;
        if (var5.field326 > 0) {
            var7 = class246.method1754(-118, var5);
        }
        if (!var7 || !client.method1798(var5).method1756(arg3 - 1, -90)) {
            return;
        }
        if (arg3 == 1) {
            class314.field5534.method1634(131, 0);
            class14.field428++;
            class314.field5534.method444((byte) 46, arg0);
            class314.field5534.method505(arg4, (byte) 7);
        }
        if (arg3 == 2) {
            class282.field5043++;
            class314.field5534.method1634(124, 0);
            class314.field5534.method444((byte) 46, arg0);
            class314.field5534.method505(arg4, (byte) 7);
        }
        if (arg3 == 3) {
            class314.field5534.method1634(3, 0);
            class194.field3495++;
            class314.field5534.method444((byte) 46, arg0);
            class314.field5534.method505(arg4, (byte) 7);
        }
        if (arg3 == 4) {
            class314.field5534.method1634(132, 0);
            class217.field3836++;
            class314.field5534.method444((byte) 46, arg0);
            class314.field5534.method505(arg4, (byte) 7);
        }
        if (arg3 == 5) {
            class171.field3085++;
            class314.field5534.method1634(55, 0);
            class314.field5534.method444((byte) 46, arg0);
            class314.field5534.method505(arg4, (byte) 7);
        }
        if (arg3 == 6) {
            class314.field5534.method1634(103, 0);
            class314.field5534.method444((byte) 46, arg0);
            class265.field4773++;
            class314.field5534.method505(arg4, (byte) 7);
        }
        if (arg3 == 7) {
            class314.field5534.method1634(105, 0);
            class314.field5534.method444((byte) 46, arg0);
            class213.field3748++;
            class314.field5534.method505(arg4, (byte) 7);
        }
        if (arg3 == 8) {
            class210.field3693++;
            class314.field5534.method1634(136, 0);
            class314.field5534.method444((byte) 46, arg0);
            class314.field5534.method505(arg4, (byte) 7);
        }
        if (arg3 == 9) {
            class92.field1731++;
            class314.field5534.method1634(34, 0);
            class314.field5534.method444((byte) 46, arg0);
            class314.field5534.method505(arg4, (byte) 7);
        }
        if (arg3 == 10) {
            class213.field3738++;
            class314.field5534.method1634(52, 0);
            class314.field5534.method444((byte) 46, arg0);
            class314.field5534.method505(arg4, (byte) 7);
        }
        if (arg1 >= -97) {
            field1198 = -71;
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "([I)V", line = 225)
    public class55(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field1203 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field1203[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field1203[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field1203[var5 + var5] = arg0[var4];
            this.field1203[var5 - (-var5 - 1)] = var4++;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Lvi;", line = 261)
    public static final class6 method515(int arg0, int arg1) {
        field1197++;
        class6 var2 = (class6) class91.field1715.method1336((long) arg1, arg0 ^ arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class257.field4572.method1192(0, arg1, 0);
        class6 var4 = new class6(var3);
        var4.method406(class198.field3540, (int[]) null);
        class91.field1715.method1331(var4, 30237, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)I", line = 281)
    public final int method516(int arg0, boolean arg1) {
        int var3 = (this.field1203.length >> 1) - 1;
        field1194++;
        int var4 = var3 & arg0;
        if (!arg1) {
            return -36;
        }
        while (true) {
            int var5 = this.field1203[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1203[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 310)
    public static void method517(byte arg0) {
        field1201 = null;
        field1196 = null;
        int var1 = 71 % ((12 - arg0) / 63);
    }
}
