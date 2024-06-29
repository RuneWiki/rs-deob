import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class123 extends class310 {

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    private int field2113 = 4;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    private int field2111 = 4;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public static int field2108 = 99;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "Lwf;")
    public static class250 field2114;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lqm;II)V", line = 8)
    public final void method75(class227 arg0, int arg1, int arg2) {
        field2109++;
        if (arg2 == 0) {
            this.field2113 = arg0.method1720((byte) -104);
        } else if (arg2 == 1) {
            this.field2111 = arg0.method1720((byte) -7);
        }
        if (arg1 != -2470) {
            this.method77(68, 94);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLfc;)I", line = 45)
    public static final int method967(byte arg0, class288 arg1) {
        field2110++;
        if (arg0 != -45) {
            field2108 = -101;
        }
        class121 var2 = arg1.field4692;
        if (var2.field2066 != null) {
            var2 = var2.method958((byte) -115);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2052;
        class106 var4 = arg1.method1641(0);
        if (arg1.field3544 == var4.field1737) {
            var3 = var2.field2049;
        } else if (arg1.field3544 == var4.field1723 || arg1.field3544 == var4.field1729 || arg1.field3544 == var4.field1731 || arg1.field3544 == var4.field1754) {
            var3 = var2.field2048;
        } else if (arg1.field3544 == var4.field1733 || arg1.field3544 == var4.field1730 || arg1.field3544 == var4.field1746 || arg1.field3544 == var4.field1747) {
            var3 = var2.field2038;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V", line = 81)
    public class123() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(B)V", line = 100)
    public static void method968(byte arg0) {
        if (arg0 < 89) {
            field2114 = (class250) null;
        }
        field2114 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[I", line = 113)
    public final int[] method77(int arg0, int arg1) {
        field2112++;
        if (arg1 != -13093) {
            this.method391(56, true);
        }
        int[] var3 = this.field4950.method930(arg0, 0);
        if (this.field4950.field2001) {
            int var4 = class261.field4405 / this.field2113;
            int var5 = class254.field4279 / this.field2111;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method2200(0, 0, (byte) 74);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method2200(0, class254.field4279 * var7 / var5, (byte) 74);
            }
            for (int var8 = 0; var8 < class261.field4405; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class261.field4405 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(BLfc;)V", line = 167)
    public static final void method969(byte arg0, class288 arg1) {
        field2105++;
        for (class170 var2 = (class170) class103.field1673.method2300((byte) 101); var2 != null; var2 = (class170) class103.field1673.method2306(-23)) {
            if (var2.field2706 == arg1) {
                if (var2.field2713 != null) {
                    class245.field4030.method2163(var2.field2713);
                    var2.field2713 = null;
                }
                var2.method330(15);
                return;
            }
        }
        int var3 = 81 / ((arg0 + 60) / 60);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 198)
    public static final String method970(boolean arg0, String arg1) {
        field2106++;
        if (arg0) {
            return (String) null;
        }
        int var2 = arg1.length();
        byte var3 = 2;
        char[] var4 = new char[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var3 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var3 == 2 || Character.isUpperCase(var6)) {
                var6 = class7.method29(var6, (byte) 125);
            }
            if (Character.isLetter(var6)) {
                var3 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var3 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var4[var5] = var6;
        }
        return new String(var4);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)[[I", line = 255)
    public final int[][] method391(int arg0, boolean arg1) {
        if (!arg1) {
            this.method75((class227) null, -78, -50);
        }
        field2107++;
        int[][] var3 = this.field4942.method10((byte) -119, arg0);
        if (this.field4942.field30) {
            int var4 = class254.field4279 / this.field2111;
            int var5 = class261.field4405 / this.field2113;
            int[][] var7;
            if (var4 > 0) {
                int var6 = arg0 % var4;
                var7 = this.method2199(21101, class254.field4279 * var6 / var4, 0);
            } else {
                var7 = this.method2199(21101, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[2];
            int[] var12 = var3[1];
            int[] var13 = var3[0];
            for (int var14 = 0; var14 < class261.field4405; var14++) {
                int var16;
                if (var5 > 0) {
                    int var15 = var14 % var5;
                    var16 = class261.field4405 * var15 / var5;
                } else {
                    var16 = 0;
                }
                var13[var14] = var8[var16];
                var12[var14] = var9[var16];
                var11[var14] = var10[var16];
            }
        }
        return var3;
    }
}
