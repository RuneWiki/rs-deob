import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class1 extends class181 {

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "[I")
    public static int[] field14 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "Ljava/lang/String;")
    public static String field15 = "slide:";

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "Z")
    public static boolean field24 = false;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    public static int field25 = 0;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field23 = null;

    @OriginalMember(owner = "client!qk", name = "W", descriptor = "J")
    public static long field31 = 0L;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    public int field18;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    public int field27;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public int field6;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "client!qk", name = "Z", descriptor = "Lf;")
    public class113 field34;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "Lij;")
    public class151 field7;

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "Lsl;")
    public class35 field30;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "Ltf;")
    public class98 field1;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BB)C")
    public static final char method1(byte arg0, byte arg1) {
        int var2 = arg1 & 0xFF;
        field2++;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class268.field4176[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) (arg0 == 19 ? (char) var2 : 65478);
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(II)V")
    public static final void method2(int arg0, int arg1) {
        class216.field3319.method938(arg1, (byte) -123);
        field4++;
        if (arg0 != -31300) {
            method3((byte) -75);
        }
        class128.field1889.method938(arg1, (byte) -123);
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)V")
    public static void method3(byte arg0) {
        field14 = null;
        field23 = null;
        field15 = null;
        int var1 = 81 / ((arg0 + 2) / 61);
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
    public final void method4(int arg0) {
        this.field34 = null;
        if (arg0 == 0) {
            this.field30 = null;
            this.field1 = null;
            field3++;
            this.field7 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(CIILjava/lang/StringBuffer;)Ljava/lang/StringBuffer;")
    public static final StringBuffer method5(char arg0, int arg1, int arg2, StringBuffer arg3) {
        field16++;
        if (arg1 != 16359) {
            method7((byte) -73, (class237) null, (class237) null);
        }
        int var4 = arg3.length();
        arg3.setLength(arg2);
        for (int var5 = var4; var5 < arg2; var5++) {
            arg3.setCharAt(var5, arg0);
        }
        return arg3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZIIIIIIII)V")
    public static final void method6(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field12++;
        for (int var9 = 0; var9 < class154.field2251.field3727; var9++) {
            if (class154.field2251.method1643(8, var9)) {
                int[] var10 = class90.field1362.method1872((byte) -66, (class154.field2251.field3738[var9] & 0xFFFF1B9) >> 14, (class154.field2251.field3738[var9] & 0x3FC6E13E) >> 28, class154.field2251.field3738[var9] & 0x3FFF);
                if (var10 != null) {
                    int var11 = class67.field1114 + class235.field3619 - var10[2] - 1;
                    int var12 = var10[1] - class141.field2029;
                    int var13 = class154.field2251.method1642(var9, (byte) -31);
                    int var14 = arg1 + ((arg8 - arg1) * (var12 - arg3) / (arg5 - arg3));
                    int var15 = 16777215;
                    int var16 = (arg2 - arg4) * (var11 - arg7) / (arg6 - arg7) + arg4;
                    class158 var17 = null;
                    if (var13 == 0) {
                        if ((double) class78.field1243 == 3.0D) {
                            var17 = class58.field960;
                        }
                        if ((double) class78.field1243 == 4.0D) {
                            var17 = class139.field2016;
                        }
                        if ((double) class78.field1243 == 6.0D) {
                            var17 = class34.field605;
                        }
                        if ((double) class78.field1243 >= 8.0D) {
                            var17 = class270.field4219;
                        }
                    }
                    if (var13 == 1) {
                        if ((double) class78.field1243 == 3.0D) {
                            var17 = class34.field605;
                        }
                        if ((double) class78.field1243 == 4.0D) {
                            var17 = class270.field4219;
                        }
                        if ((double) class78.field1243 == 6.0D) {
                            var17 = class143.field2073;
                        }
                        if ((double) class78.field1243 >= 8.0D) {
                            var17 = class78.field1225;
                        }
                    }
                    if (var13 == 2) {
                        if ((double) class78.field1243 == 3.0D) {
                            var17 = class143.field2073;
                        }
                        var15 = 16755200;
                        if ((double) class78.field1243 == 4.0D) {
                            var17 = class78.field1225;
                        }
                        if ((double) class78.field1243 == 6.0D) {
                            var17 = class170.field2499;
                        }
                        if ((double) class78.field1243 >= 8.0D) {
                            var17 = class180.field2620;
                        }
                    }
                    if (class154.field2251.field3733[var9] != -1) {
                        var15 = class154.field2251.field3733[var9];
                    }
                    if (var17 != null) {
                        int var18 = class246.field3835.method1301(class154.field2251.field3731[var9], (int[]) null, class295.field4481);
                        int var19 = var16 - (var18 - 1) * var17.method1065() / 2;
                        int var20 = var19 + var17.method1073() / 2;
                        for (int var21 = 0; var21 < var18; var21++) {
                            String var22 = class295.field4481[var21];
                            if ((var18 - 1) > var21) {
                                var22 = var22.substring(0, var22.length() - 4);
                            }
                            var17.method1064(var22, var14, var20, var15, true);
                            var20 += var17.method1065();
                        }
                    }
                }
            }
        }
        if (arg0) {
            field24 = true;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLpk;Lpk;)V")
    public static final void method7(byte arg0, class237 arg1, class237 arg2) {
        field17++;
        class246.field3835 = class89.method679(false, arg1, arg2, class9.field104, 0);
        class42.field741 = (class52) class246.field3835;
        if (arg0 != 6) {
            method6(true, -45, -70, 4, 99, 43, 53, -56, 91);
        }
        class269.field4186 = class89.method679(false, arg1, arg2, class114.field1744, 0);
        class105.field1555 = class89.method679(false, arg1, arg2, class76.field1209, 0);
    }
}
