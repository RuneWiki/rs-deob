import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class148 extends class283 {

    @OriginalMember(owner = "client!vr", name = "y", descriptor = "Ljava/lang/Object;")
    private Object field1817;

    @OriginalMember(owner = "client!vr", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field1820 = new String[] { method1244(method1243("/l&m\u00127w|oS")), method1244(method1243("7kd=")), method1244(method1243("\"0&\u007f\u0006")), method1244(method1243("/l&\u0017S")), method1244(method1243("/l&\u0016S")), method1244(method1243("/l&\u001aS")), method1244(method1243("/l&\u0019S")), method1244(method1243("/l&\u0018S")), method1244(method1243("/l&\u001bS")) };

    @OriginalMember(owner = "client!vr", name = "D", descriptor = "[[Z")
    public static boolean[][] field1813 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!vr", name = "C", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!vr", name = "E", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!vr", name = "A", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!vr", name = "B", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZZLjava/lang/String;)V")
    public static final void method1239(boolean arg0, boolean arg1, String arg2) {
        try {
            field1819++;
            String var15 = arg2.toLowerCase();
            short[] var3 = new short[16];
            int var4 = 0;
            int var5 = arg0 ? 32768 : 0;
            int var6 = (arg0 ? class690.field10023.field9781 : class690.field10023.field9774) + var5;
            for (int var7 = var5; var7 < var6; var7++) {
                class41 var8 = class690.field10023.method4954(var7, 113);
                if (var8.field479 && var8.method278(80).toLowerCase().indexOf(var15) != -1) {
                    if (var4 >= 50) {
                        class757.field10990 = null;
                        class174.field2412 = -1;
                        return;
                    }
                    if (var3.length <= var4) {
                        short[] var9 = new short[var3.length * 2];
                        for (int var10 = 0; var10 < var4; var10++) {
                            var9[var10] = var3[var10];
                        }
                        var3 = var9;
                    }
                    var3[var4++] = (short) var7;
                }
            }
            if (arg1) {
                class757.field10990 = var3;
                class674.field9782 = 0;
                class174.field2412 = var4;
                String[] var11 = new String[class174.field2412];
                for (int var12 = 0; var12 < class174.field2412; var12++) {
                    var11[var12] = class690.field10023.method4954(var3[var12], 112).method278(80);
                }
                class422.method3261(var11, -1, class757.field10990);
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field1820[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1820[1] : field1820[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "(I)V")
    public static void method1240(int arg0) {
        try {
            field1813 = null;
            if (arg0 != -18694) {
                field1813 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1820[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1241(String arg0, int arg1) {
        try {
            field1815++;
            if (arg1 != 24) {
                method1242(7, 82, -115);
            }
            if (class728.field10555 && (class517.field7484 & 0x18) != 0) {
                boolean var2 = false;
                int var3 = class3.field34;
                int[] var4 = class358.field5483;
                for (int var5 = 0; var5 < var3; var5++) {
                    class726 var6 = class197.field2685[var4[var5]];
                    if (var6.field10506 != null && var6.field10506.equalsIgnoreCase(arg0) && (class225.field3446 == var6 && (class517.field7484 & 0x10) != 0 || var6 != null && (class517.field7484 & 0x8) != 0)) {
                        class492.field7059++;
                        class280 var7 = class610.method4508(class606.field8873, class279.field4190, (byte) -80);
                        var7.field4197.method1412(true, class173.field2406);
                        var7.field4197.method1418((byte) -122, class547.field8162);
                        var7.field4197.method1406(class729.field10569, 380332136);
                        var7.field4197.method1428((byte) -24, 0);
                        var7.field4197.method1440(var4[var5], (byte) -35);
                        class106.method934((byte) 53, var7);
                        var2 = true;
                        class471.method3582(true, 0, var6.field3863[0], 1, -2, var6.field3859[0], 0, var6.method2101(31463), var6.method2101(31463));
                        break;
                    }
                }
                if (!var2) {
                    class536.method4041(4, class309.field4868.method2616(false, class167.field2300) + arg0, 96);
                }
                if (class728.field10555) {
                    class431.method3305(arg1 - 25);
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field1820[8] + (arg0 == null ? field1820[1] : field1820[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lpt;Ljava/lang/Object;I)V")
    public class148(class556 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        try {
            this.field1817 = arg1;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1820[0] + (arg0 == null ? field1820[1] : field1820[2]) + ',' + (arg1 == null ? field1820[1] : field1820[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method450(int arg0) {
        try {
            if (arg0 != 18) {
                this.field1817 = null;
            }
            field1816++;
            return this.field1817;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1820[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)Z")
    public final boolean method449(int arg0) {
        try {
            field1818++;
            return arg0 == -8192 ? false : false;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1820[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(III)Z")
    public static final boolean method1242(int arg0, int arg1, int arg2) {
        try {
            int var3 = -126 / ((arg2 + 47) / 50);
            field1814++;
            return (arg1 & 0x400) != 0;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1820[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1243(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1244(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 89;
                    break;
                case 1:
                    var10005 = 30;
                    break;
                case 2:
                    var10005 = 8;
                    break;
                case 3:
                    var10005 = 81;
                    break;
                default:
                    var10005 = 123;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
