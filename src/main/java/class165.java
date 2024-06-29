import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class165 implements class263 {

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2559 = "Loading - please wait.";

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field2562 = 0;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public static final void method1133(byte arg0) {
        field2564++;
        int var1 = class235.field3766.method887(true, 8);
        if (class73.field1040 > var1) {
            for (int var2 = var1; var2 < class73.field1040; var2++) {
                class178.field2775[class218.field3542++] = class8.field117[var2];
            }
        }
        if (arg0 >= -50) {
            field2559 = null;
        }
        if (class73.field1040 < var1) {
            throw new RuntimeException("gppov1");
        }
        class73.field1040 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class8.field117[var3];
            class186 var5 = class153.field2277[var4];
            int var6 = class235.field3766.method887(true, 1);
            if (var6 == 0) {
                class8.field117[class73.field1040++] = var4;
                var5.field1210 = class111.field1684;
            } else {
                int var7 = class235.field3766.method887(true, 2);
                if (var7 == 0) {
                    class8.field117[class73.field1040++] = var4;
                    var5.field1210 = class111.field1684;
                    class84.field1316[class164.field2553++] = var4;
                } else if (var7 == 1) {
                    class8.field117[class73.field1040++] = var4;
                    var5.field1210 = class111.field1684;
                    int var8 = class235.field3766.method887(true, 3);
                    var5.method570((byte) -127, 1, var8);
                    int var9 = class235.field3766.method887(true, 1);
                    if (var9 == 1) {
                        class84.field1316[class164.field2553++] = var4;
                    }
                } else if (var7 == 2) {
                    class8.field117[class73.field1040++] = var4;
                    var5.field1210 = class111.field1684;
                    if (class235.field3766.method887(true, 1) == 1) {
                        int var10 = class235.field3766.method887(true, 3);
                        var5.method570((byte) -115, 2, var10);
                        int var11 = class235.field3766.method887(true, 3);
                        var5.method570((byte) -110, 2, var11);
                    } else {
                        int var12 = class235.field3766.method887(true, 3);
                        var5.method570((byte) -80, 0, var12);
                    }
                    int var13 = class235.field3766.method887(true, 1);
                    if (var13 == 1) {
                        class84.field1316[class164.field2553++] = var4;
                    }
                } else if (var7 == 3) {
                    class178.field2775[class218.field3542++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1134(byte[] arg0, int arg1) {
        if (arg1 != -32698) {
            field2565 = 33;
        }
        int var2 = arg0.length;
        field2566++;
        byte[] var3 = new byte[var2];
        class196.method1357(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method1135(int arg0) {
        field2559 = null;
        if (arg0 >= -14) {
            field2562 = -128;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([IJBI)Ljava/lang/String;")
    public final String method1136(int[] arg0, long arg1, byte arg2, int arg3) {
        if (arg2 >= -74) {
            field2559 = null;
        }
        field2560++;
        if (arg3 == 0) {
            class283 var6 = class30.method241(121, arg0[0]);
            return var6.method1888((int) arg1, false);
        } else if (arg3 == 1 || arg3 == 10) {
            class253 var7 = class162.method1112((int) arg1, (byte) 125);
            return var7.field4035;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class30.method241(57, arg0[0]).method1888((int) arg1, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    public static final void method1137(boolean arg0) {
        field2563++;
        class249.field3992.method1430(-1);
        class44.field562.method1430(-1);
        if (arg0) {
            method1133((byte) -75);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1138(int arg0, int arg1) {
        if (arg1 >= -94) {
            return null;
        }
        field2561++;
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class50.field678 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class152.field2260 + "</col>";
        }
    }
}
