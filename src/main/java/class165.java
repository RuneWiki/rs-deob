import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class165 extends class137 {

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    public static int field2653 = 0;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "Z")
    public static boolean field2656 = true;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
    public static int field2667 = 0;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "Ljava/lang/String;")
    public String field2663;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "[C")
    public char[] field2649;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "[C")
    public char[] field2651;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "[I")
    public int[] field2664;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "[I")
    public int[] field2666;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILdk;)V")
    public static final void method1182(int arg0, class251 arg1) {
        field2659++;
        if (class46.field768) {
            return;
        }
        class127.method889();
        class266.field4284 = class310.method2078(-24352, arg1, class307.field4916);
        int var2 = class310.field4964;
        if (arg0 != 20634) {
            method1182(2, (class251) null);
        }
        int var3 = var2 * 956 / 503;
        class266.field4284.method1019((class294.field4709 - var3) / 2, 0, var3, var2);
        class34.field513 = class251.method1686(class29.field351, arg1, (byte) -83);
        class34.field513.method1517(class294.field4709 / 2 - (class34.field513.field3603 / 2), 18);
        class46.field768 = true;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILwd;)V")
    public final void method1183(int arg0, class162 arg1) {
        if (arg0 != 0) {
            this.field2651 = null;
        }
        field2660++;
        while (true) {
            int var3 = arg1.method1133((byte) 53);
            if (var3 == 0) {
                return;
            }
            this.method1188(var3, arg1, (byte) -62);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)Lqm;")
    public static final class174 method1184(int arg0, int arg1) {
        class174 var2 = (class174) class294.field4711.method694((long) arg1, false);
        field2655++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class181.field2954.method1680(arg1, arg0, -72);
        class174 var4 = new class174();
        if (var3 != null) {
            var4.method1270(new class162(var3), false);
        }
        class294.field4711.method693((long) arg1, arg0 + 93, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(CI)I")
    public final int method1185(char arg0, int arg1) {
        field2657++;
        if (this.field2666 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2666.length; var3++) {
            if (this.field2649[var3] == arg0) {
                return this.field2666[var3];
            }
        }
        return arg1 > -95 ? 107 : -1;
    }

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "(I)V")
    public static final void method1186(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (class177.field2899 != null) {
            class68 var1 = class177.field2899;
            synchronized (class177.field2899) {
                class177.field2899 = null;
            }
        }
        field2652++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public final void method1187(byte arg0) {
        if (this.field2666 != null) {
            for (int var2 = 0; var2 < this.field2666.length; var2++) {
                this.field2666[var2] = class173.method1263(this.field2666[var2], 32768);
            }
        }
        if (arg0 < 115) {
            field2653 = -29;
        }
        field2658++;
        if (this.field2664 != null) {
            for (int var3 = 0; var3 < this.field2664.length; var3++) {
                this.field2664[var3] = class173.method1263(this.field2664[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILwd;B)V")
    private final void method1188(int arg0, class162 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field2663 = arg1.method1152(-119);
        } else if (arg0 == 2) {
            int var7 = arg1.method1133((byte) 53);
            this.field2651 = new char[var7];
            this.field2664 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2664[var8] = arg1.method1142(-18970);
                byte var9 = arg1.method1107((byte) -91);
                this.field2651[var8] = var9 == 0 ? 0 : class309.method2061(var9, (byte) -13);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1133((byte) 53);
            this.field2666 = new int[var4];
            this.field2649 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2666[var5] = arg1.method1142(-18970);
                byte var6 = arg1.method1107((byte) -87);
                this.field2649[var5] = var6 == 0 ? 0 : class309.method2061(var6, (byte) -81);
            }
        }
        if (arg2 != -62) {
            field2654 = -71;
        }
        field2661++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IC)I")
    public final int method1189(int arg0, char arg1) {
        field2665++;
        if (this.field2664 == null) {
            return -1;
        }
        if (arg0 >= -122) {
            this.method1189(15, (char) 65533);
        }
        for (int var3 = 0; var3 < this.field2664.length; var3++) {
            if (this.field2651[var3] == arg1) {
                return this.field2664[var3];
            }
        }
        return -1;
    }
}
