import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class205 extends class136 {

    @OriginalMember(owner = "client!si", name = "S", descriptor = "Li;")
    public static class88 field3917 = class208.method1425(105, "Untersuchen");

    @OriginalMember(owner = "client!si", name = "R", descriptor = "Li;")
    private static class88 field3916 = class208.method1425(105, "Existing User");

    @OriginalMember(owner = "client!si", name = "G", descriptor = "Li;")
    public static class88 field3905 = field3916;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "Lob;")
    public static class154 field3909 = new class154(4096);

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!si", name = "L", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!si", name = "O", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!si", name = "U", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "[I")
    private int[] field3907;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "[I")
    public int[] field3918;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "[Li;")
    private class88[] field3903;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "[[I")
    private int[][] field3911;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)I")
    public final int method1407(byte arg0, int arg1) {
        field3904++;
        if (this.field3907 == null || arg1 < 0 || arg1 > this.field3907.length) {
            return -1;
        } else if (arg0 >= -88) {
            return -84;
        } else {
            return this.field3907[arg1];
        }
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V")
    public static void method1408(int arg0) {
        int var1 = -122 / ((-arg0 - 82) / 37);
        field3909 = null;
        field3917 = null;
        field3916 = null;
        field3905 = null;
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(B)I")
    public final int method1409(byte arg0) {
        field3912++;
        if (this.field3907 == null) {
            return 0;
        } else {
            int var2 = 53 / ((arg0 + 70) / 54);
            return this.field3907.length;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLea;I)V")
    private final void method1410(byte arg0, class46 arg1, int arg2) {
        if (arg2 == 1) {
            this.field3903 = arg1.method298(-128).method600((byte) 52, 60);
        } else if (arg2 == 2) {
            int var4 = arg1.method347(26119);
            this.field3918 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3918[var5] = arg1.method301(class180.method1287(arg0, 50));
            }
        } else if (arg2 == 3) {
            int var6 = arg1.method347(26119);
            this.field3911 = new int[var6][];
            this.field3907 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method301(arg0);
                this.field3907[var7] = var8;
                this.field3911[var7] = new int[class92.field1732[var8]];
                for (int var9 = 0; var9 < class92.field1732[var8]; var9++) {
                    this.field3911[var7][var9] = arg1.method301(class180.method1287(arg0, 62));
                }
            }
        }
        if (arg0 != 116) {
            this.method1410((byte) 62, null, 30);
        }
        field3906++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lea;I)Li;")
    public final class88 method1411(class46 arg0, int arg1) {
        if (arg1 != 80) {
            return null;
        }
        field3919++;
        class88 var3 = class165.method1137(80, (byte) 57);
        if (this.field3907 != null) {
            for (int var4 = 0; var4 < this.field3907.length; var4++) {
                var3.method616(this.field3903[var4], (byte) 57);
                var3.method616(class144.method954(arg0.method300(class78.field1420[this.field3907[var4]], 51), 118, this.field3907[var4], this.field3911[var4]), (byte) -71);
            }
        }
        var3.method616(this.field3903[this.field3903.length - 1], (byte) 62);
        return var3.method629((byte) -36);
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(I)Li;")
    public final class88 method1412(int arg0) {
        field3910++;
        class88 var2 = class165.method1137(80, (byte) 118);
        if (this.field3903 == null) {
            return class102.field1846;
        }
        var2.method616(this.field3903[0], (byte) 84);
        if (arg0 < 98) {
            return null;
        }
        for (int var3 = 1; var3 < this.field3903.length; var3++) {
            var2.method616(class188.field3646, (byte) -115);
            var2.method616(this.field3903[var3], (byte) 70);
        }
        return var2.method629((byte) -36);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lea;B)V")
    public final void method1413(class46 arg0, byte arg1) {
        field3915++;
        int var3 = 124 / ((54 - arg1) / 62);
        while (true) {
            int var4 = arg0.method347(26119);
            if (var4 == 0) {
                return;
            }
            this.method1410((byte) 116, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)I")
    public final int method1414(int arg0, int arg1, int arg2) {
        field3902++;
        if (this.field3907 == null || arg2 < 0 || this.field3907.length < arg2) {
            return -1;
        } else {
            if (arg1 < 11) {
                field3917 = null;
            }
            return this.field3911[arg2] == null || arg0 < 0 || arg0 > this.field3911[arg2].length ? -1 : this.field3911[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLq;)Lq;")
    public static final class174 method1415(byte arg0, class174 arg1) {
        field3914++;
        if (arg1.field3506 != -1) {
            return class239.method1581(-64, arg1.field3506);
        }
        int var2 = arg1.field3425 >>> 16;
        int var3 = 50 % ((-arg0 - 39) / 33);
        for (class168 var4 = (class168) class128.field2397.method1049(0); var4 != null; var4 = (class168) class128.field2397.method1050((byte) -73)) {
            if (var4.field3231 == var2) {
                return class239.method1581(-64, (int) var4.field1219);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILea;[I)V")
    public final void method1416(int arg0, class46 arg1, int[] arg2) {
        field3908++;
        if (this.field3907 == null) {
            return;
        }
        int var4 = 123 % ((arg0 - 47) / 35);
        for (int var5 = 0; var5 < this.field3907.length; var5++) {
            if (var5 >= arg2.length) {
                return;
            }
            int var6 = class135.field2510[this.method1407((byte) -101, var5)];
            if (var6 > 0) {
                arg1.method306(var6, 94, (long) arg2[var5]);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "(I)V")
    public final void method1417(int arg0) {
        if (arg0 >= -123) {
            this.field3918 = null;
        }
        if (this.field3918 != null) {
            for (int var2 = 0; var2 < this.field3918.length; var2++) {
                this.field3918[var2] = class204.method1405(this.field3918[var2], 32768);
            }
        }
        field3913++;
    }
}
