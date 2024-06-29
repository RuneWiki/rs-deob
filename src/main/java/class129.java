import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class129 {

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "[B")
    private byte[] field2903 = new byte[4];

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Lgd;")
    private class46 field2910;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    private int field2893;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "J")
    private long field2921;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "Lhe;")
    public static class54 field2909 = class6.method58("<img=1>", false);

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Lhe;")
    public static class54 field2899 = class6.method58("(U3", false);

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Lhe;")
    public static class54 field2898 = class6.method58("rot:", false);

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public static int field2918 = -1;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "Lhe;")
    private static class54 field2917 = class6.method58("yellow:", false);

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "Lhe;")
    public static class54 field2907 = field2917;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Lhe;")
    public static class54 field2901 = field2917;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "[J")
    public static long[] field2920 = new long[200];

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lec;")
    public static class32 field2900 = new class32(512);

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
    public static int field2923 = 0;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "Lhe;")
    private static class54 field2924 = class6.method58("Please enter your password)3", false);

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Lhe;")
    public static class54 field2922 = field2924;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    private int field2911;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    private int field2916;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field2902;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "[B")
    private byte[] field2915;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)[B")
    public final byte[] method967(boolean arg0) throws IOException {
        field2904++;
        if (this.field2921 < class102.method801((byte) -42)) {
            throw new IOException("fdt");
        }
        if (this.field2893 == 0) {
            if (this.field2910.field1145 == 2) {
                throw new IOException("fds");
            }
            if (this.field2910.field1145 == 1) {
                this.field2902 = (DataInputStream) this.field2910.field1143;
                this.field2893 = 1;
            }
        }
        if (this.field2893 == 1) {
            int var2 = this.field2902.available();
            if (var2 > 0) {
                if (this.field2916 + var2 > 4) {
                    var2 = 4 - this.field2916;
                }
                this.field2916 += this.field2902.read(this.field2903, this.field2916, var2);
                if (this.field2916 == 4) {
                    int var3 = (new class83(this.field2903)).method641((byte) 73);
                    this.field2893 = 2;
                    this.field2915 = new byte[var3];
                }
            }
        }
        if (this.field2893 == 2) {
            int var4 = this.field2902.available();
            if (var4 > 0) {
                if (this.field2911 + var4 > this.field2915.length) {
                    var4 = this.field2915.length - this.field2911;
                }
                this.field2911 += this.field2902.read(this.field2915, this.field2911, var4);
                if (this.field2915.length == this.field2911) {
                    return this.field2915;
                }
            }
        }
        return arg0 ? null : null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([BI)V")
    public static final void method968(byte[] arg0, int arg1) {
        field2897++;
        class83 var2 = new class83(arg0);
        var2.field2076 = arg0.length - 2;
        class91.field2212 = var2.method631((byte) -106);
        class62.field1503 = new int[class91.field2212];
        class68.field1686 = new int[class91.field2212];
        class56.field1412 = new int[class91.field2212];
        class141.field3221 = new byte[class91.field2212][];
        int var3 = 2 % ((arg1 + 7) / 42);
        class70.field1732 = new int[class91.field2212];
        var2.field2076 = arg0.length - class91.field2212 * 8 - 7;
        class103.field2574 = var2.method631((byte) -110);
        class64.field1549 = var2.method631((byte) -123);
        int var4 = (var2.method638(0) & 0xFF) + 1;
        for (int var5 = 0; var5 < class91.field2212; var5++) {
            class68.field1686[var5] = var2.method631((byte) -118);
        }
        for (int var6 = 0; var6 < class91.field2212; var6++) {
            class70.field1732[var6] = var2.method631((byte) -111);
        }
        for (int var7 = 0; var7 < class91.field2212; var7++) {
            class62.field1503[var7] = var2.method631((byte) -128);
        }
        for (int var8 = 0; var8 < class91.field2212; var8++) {
            class56.field1412[var8] = var2.method631((byte) -110);
        }
        var2.field2076 = arg0.length - (var4 - 1) * 3 - class91.field2212 * 8 - 7;
        class134.field3050 = new int[var4];
        for (int var9 = 1; var9 < var4; var9++) {
            class134.field3050[var9] = var2.method670(false);
            if (class134.field3050[var9] == 0) {
                class134.field3050[var9] = 1;
            }
        }
        var2.field2076 = 0;
        for (int var10 = 0; var10 < class91.field2212; var10++) {
            int var11 = class62.field1503[var10];
            int var12 = class56.field1412[var10];
            int var13 = var11 * var12;
            byte[] var14 = new byte[var13];
            class141.field3221[var10] = var14;
            int var15 = var2.method638(0);
            if (var15 == 0) {
                for (int var16 = 0; var16 < var13; var16++) {
                    var14[var16] = var2.method651(109);
                }
            } else if (var15 == 1) {
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        var14[var11 * var18 + var17] = var2.method651(-120);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)Z")
    public static final boolean method969(byte arg0) {
        field2906++;
        try {
            if (arg0 != 90) {
                return false;
            }
            if (class83.field2051 == 2) {
                if (class3.field46 == null) {
                    class3.field46 = class116.method881(class134.field3046, class132.field2989, class50.field1201);
                    if (class3.field46 == null) {
                        return false;
                    }
                }
                if (class40.field1041 == null) {
                    class40.field1041 = new class156(class123.field2829, class139.field3184);
                }
                if (class1.field5.method119(22050, class40.field1041, false, class3.field46, class43.field1105)) {
                    class1.field5.method123(false);
                    class1.field5.method128(class75.field1865, arg0 ^ 0x38);
                    class1.field5.method125(class3.field46, 124, class52.field1255);
                    class3.field46 = null;
                    class134.field3046 = null;
                    class40.field1041 = null;
                    class83.field2051 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class1.field5.method126((byte) -127);
            class40.field1041 = null;
            class134.field3046 = null;
            class83.field2051 = 0;
            class3.field46 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method970(int arg0) {
        field2922 = null;
        field2920 = null;
        field2901 = null;
        field2907 = null;
        if (arg0 < 59) {
            return;
        }
        field2898 = null;
        field2899 = null;
        field2909 = null;
        field2917 = null;
        field2900 = null;
        field2924 = null;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
    public static final void method971(byte arg0) {
        Object var1 = class19.field568;
        synchronized (class19.field568) {
            if (class17.field509 == 0) {
                class80.field1963.method1121(new class91(), 5, 83);
            }
            if (arg0 <= 114) {
                field2920 = null;
            }
            class17.field509 = 600;
        }
        field2908++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBLd;I)V")
    public static final void method972(int arg0, byte arg1, class22 arg2, int arg3) {
        if (arg1 < 88) {
            method974(-109, null, -20);
        }
        field2896++;
        if (arg2.field981 == arg3 && arg3 != -1) {
            int var4 = class135.method1010(arg3, (byte) -109).field3238;
            if (var4 == 1) {
                arg2.field980 = 0;
                arg2.field943 = 0;
                arg2.field926 = arg0;
                arg2.field937 = 0;
            }
            if (var4 == 2) {
                arg2.field980 = 0;
            }
        } else if (arg3 == -1 || arg2.field981 == -1 || class135.method1010(arg3, (byte) -119).field3255 >= class135.method1010(arg2.field981, (byte) -120).field3255) {
            arg2.field980 = 0;
            arg2.field981 = arg3;
            arg2.field943 = 0;
            arg2.field937 = 0;
            arg2.field940 = arg2.field932;
            arg2.field926 = arg0;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III[Lhe;)Lhe;")
    public static final class54 method973(int arg0, int arg1, int arg2, class54[] arg3) {
        if (arg0 <= 72) {
            field2907 = null;
        }
        field2895++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg3[arg2 + var5] == null) {
                arg3[arg2 + var5] = class100.field2543;
            }
            var4 += arg3[arg2 + var5].field1325;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class54 var10 = arg3[arg2 + var8];
            class45.method333(var10.field1323, 0, var6, var7, var10.field1325);
            var7 += var10.field1325;
        }
        class54 var9 = new class54();
        var9.field1325 = var4;
        var9.field1323 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILeb;I)V")
    public static final void method974(int arg0, class31 arg1, int arg2) {
        field2913++;
        if (class121.field2817 == null) {
            class18.method154(0, 255, null, (byte) 0, arg2, true, (byte) -123);
            class16.field475[arg0] = arg1;
        } else {
            class121.field2817.field2076 = arg0 * 8 + 5;
            int var3 = class121.field2817.method641((byte) 73);
            int var4 = class121.field2817.method641((byte) 73);
            arg1.method225(var4, 255, var3);
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lvb;Ljava/net/URL;)V")
    public class129(class148 arg0, URL arg1) {
        this.field2910 = arg0.method1122(-128, arg1);
        this.field2893 = 0;
        this.field2921 = class102.method801((byte) -42) + 30000L;
    }
}
