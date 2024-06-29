import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class277 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public int field4444 = 16777215;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public int field4461 = 8;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4447 = "Loaded wordpack";

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Lag;")
    public static class211 field4446 = null;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field4454 = 0;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4459 = "Please wait...";

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "[I")
    public static int[] field4452 = new int[500];

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Z")
    public static boolean field4451 = false;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public int field4448;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public int field4449;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public int field4450;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public int field4460;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    public int field4462;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Z")
    public boolean field4455;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lwd;II)V")
    public final void method1862(class162 arg0, int arg1, int arg2) {
        if (arg2 < 47) {
            return;
        }
        while (true) {
            int var4 = arg0.method1133((byte) 53);
            if (var4 == 0) {
                field4445++;
                return;
            }
            this.method1865(var4, arg0, arg1, 118);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method1863(int arg0) {
        field4452 = null;
        field4459 = null;
        field4446 = null;
        if (arg0 != 4) {
            method1863(-77);
        }
        field4447 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Lvj;")
    public static final class188 method1864(int arg0, int arg1, int arg2) {
        class151 var3 = class218.field3584[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class188 var4 = var3.field2364;
            var3.field2364 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILwd;II)V")
    private final void method1865(int arg0, class162 arg1, int arg2, int arg3) {
        if (arg0 == 1) {
            this.field4461 = arg1.method1142(-18970);
        } else if (arg0 == 2) {
            this.field4455 = true;
        } else if (arg0 == 3) {
            this.field4460 = arg1.method1146(2);
            this.field4462 = arg1.method1146(2);
            this.field4450 = arg1.method1146(2);
        } else if (arg0 == 4) {
            this.field4449 = arg1.method1133((byte) 53);
        } else if (arg0 == 5) {
            this.field4448 = arg1.method1142(-18970);
        } else if (arg0 == 6) {
            this.field4444 = arg1.method1137(31155);
        }
        field4453++;
        if (arg3 < 110) {
            this.field4460 = -25;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static final void method1866(int arg0) {
        field4458++;
        class50.field837.method1257(-106);
        if (arg0 != 5) {
            field4446 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V")
    public static final void method1867(boolean arg0, int arg1) {
        field4443++;
        byte[][] var2 = class57.field956;
        byte var3 = 4;
        int[] var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class276.method1859((byte) 125);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class83.field1379[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 0x3245127) >> 24;
                        if (!arg0 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = var9 >> 14 & 0x3FF;
                            int var13 = var9 >> 3 & 0x7FF;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class120.field1914.length; var15++) {
                                if (class120.field1914[var15] == var14 && var2[var15] != null) {
                                    int[] var16 = class123.method869(var6 * 8, arg0, 10087, var7 * 8, class131.field2065, var5, var13, var10, var2[var15], var11, var12);
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class192.method1358(var7 * 8, 8, var6 * 8, 8, (byte) -127, var5);
                    }
                }
            }
        }
        if (arg1 != -11375) {
            return;
        }
        if (var4 == null) {
            class67.field1116 = -1;
            return;
        }
        class206.field3284 = var4[2];
        class255.field4118 = var4[3];
        class175.field2866 = var4[1];
        class163.field2648 = var4[4];
        class67.field1116 = var4[0];
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method1868(String arg0, boolean arg1) {
        field4456++;
        if (!arg1) {
            field4451 = true;
        }
        return class18.method91(arg0, (byte) -119, 10, true);
    }
}
