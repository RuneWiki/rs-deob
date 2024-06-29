import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class53 {

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "Lmf;")
    private class382 field1047 = new class382(64);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "Lpu;")
    private class522 field1044;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "Z")
    public static boolean field1045 = false;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "Ljba;")
    public static class363 field1050;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)Lcga;", line = 6)
    public final class444 method581(int arg0, int arg1) {
        field1046++;
        class382 var3 = this.field1047;
        class444 var4;
        synchronized (this.field1047) {
            if (arg0 != 7842) {
                method585(-63, 84, 43, -30, null);
            }
            var4 = (class444) this.field1047.method2287(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field1044;
        byte[] var6;
        synchronized (this.field1044) {
            var6 = this.field1044.method3007(class559.method3195(arg1, (byte) -111), class279.method1818(arg1, (byte) -67), 5);
        }
        class444 var7 = new class444();
        if (var6 != null) {
            var7.method2633(new class695(var6), (byte) -93);
        }
        class382 var8 = this.field1047;
        synchronized (this.field1047) {
            this.field1047.method2291(var7, (long) arg1, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V", line = 36)
    public static final void method582(byte arg0) {
        field1049++;
        class181.field2558 = new class49[class261.field3971.method2977((byte) -95)][];
        class277.field4197 = new class49[class261.field3971.method2977((byte) -95)][];
        if (arg0 == 106) {
            class518.field7302 = new boolean[class261.field3971.method2977((byte) -95)];
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V", line = 52)
    public static void method583(int arg0) {
        field1050 = null;
        if (arg0 >= -33) {
            field1045 = true;
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V", line = 63)
    public final void method584(int arg0) {
        class382 var2 = this.field1047;
        synchronized (this.field1047) {
            this.field1047.method2285((byte) -95);
        }
        field1051++;
        if (arg0 != -8406) {
            field1050 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIILjava/lang/String;)V", line = 76)
    public static final void method585(int arg0, int arg1, int arg2, int arg3, String arg4) {
        field1055++;
        class49 var5 = class639.method3557(arg1, arg2, 1);
        if (var5 == null) {
            return;
        }
        if (var5.field953 != null) {
            class14 var6 = new class14();
            var6.field122 = var5.field953;
            var6.field117 = arg4;
            var6.field129 = var5;
            var6.field130 = arg0;
            class220.method1443(var6);
        }
        if (class420.field6113 != 10 || !client.method1767(var5).method972(arg0 - 1, -22640)) {
            return;
        }
        if (~arg0 == arg3) {
            class367.field5241++;
            class135 var7 = class688.method3794(class431.field6311, class583.field8198, (byte) 38);
            class375.method2260(arg2, var7, arg1, var5.field1023, 106);
            class19.method223(var7, 0);
        }
        if (arg0 == 2) {
            class238.field3720++;
            class135 var8 = class688.method3794(class191.field2756, class583.field8198, (byte) 38);
            class375.method2260(arg2, var8, arg1, var5.field1023, 125);
            class19.method223(var8, 0);
        }
        if (arg0 == 3) {
            class478.field6799++;
            class135 var9 = class688.method3794(class298.field4452, class583.field8198, (byte) 38);
            class375.method2260(arg2, var9, arg1, var5.field1023, 81);
            class19.method223(var9, arg3 + 2);
        }
        if (arg0 == 4) {
            class471.field6740++;
            class135 var10 = class688.method3794(class80.field1359, class583.field8198, (byte) 38);
            class375.method2260(arg2, var10, arg1, var5.field1023, 92);
            class19.method223(var10, 0);
        }
        if (arg0 == 5) {
            class370.field5278++;
            class135 var11 = class688.method3794(class179.field2543, class583.field8198, (byte) 38);
            class375.method2260(arg2, var11, arg1, var5.field1023, arg3 ^ 0xFFFFFF9D);
            class19.method223(var11, 0);
        }
        if (arg0 == 6) {
            class384.field5415++;
            class135 var12 = class688.method3794(class182.field2579, class583.field8198, (byte) 38);
            class375.method2260(arg2, var12, arg1, var5.field1023, arg3 + 87);
            class19.method223(var12, arg3 + 2);
        }
        if (arg0 == 7) {
            class663.field9369++;
            class135 var13 = class688.method3794(class217.field3043, class583.field8198, (byte) 38);
            class375.method2260(arg2, var13, arg1, var5.field1023, 90);
            class19.method223(var13, 0);
        }
        if (arg0 == 8) {
            class537.field7521++;
            class135 var14 = class688.method3794(class166.field2382, class583.field8198, (byte) 38);
            class375.method2260(arg2, var14, arg1, var5.field1023, 86);
            class19.method223(var14, 0);
        }
        if (arg0 == 9) {
            class263.field3990++;
            class135 var15 = class688.method3794(class655.field9191, class583.field8198, (byte) 38);
            class375.method2260(arg2, var15, arg1, var5.field1023, 112);
            class19.method223(var15, 0);
        }
        if (arg0 == 10) {
            class267.field4030++;
            class135 var16 = class688.method3794(class414.field6018, class583.field8198, (byte) 38);
            class375.method2260(arg2, var16, arg1, var5.field1023, 112);
            class19.method223(var16, 0);
        }
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)V", line = 209)
    public final void method586(int arg0) {
        field1053++;
        class382 var2 = this.field1047;
        synchronized (this.field1047) {
            this.field1047.method2279(0);
        }
        if (arg0 != -1) {
            field1050 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)V", line = 222)
    public final void method587(byte arg0, int arg1) {
        if (arg0 < 1) {
            this.field1044 = null;
        }
        class382 var3 = this.field1047;
        synchronized (this.field1047) {
            this.field1047.method2290(false, arg1);
        }
        field1048++;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)V", line = 241)
    public final void method588(int arg0, int arg1) {
        class382 var3 = this.field1047;
        synchronized (this.field1047) {
            this.field1047.method2285((byte) -78);
            this.field1047 = new class382(arg0);
        }
        field1052++;
        if (arg1 != -8) {
            this.field1047 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;", line = 258)
    public static final String method589(String[] arg0, int arg1, int arg2, int arg3) {
        field1054++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg0[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            int var9 = arg3;
            if (arg1 != 4) {
                return null;
            }
            while (var9 < var5) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
                var9++;
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lkr;ILpu;)V", line = 322)
    public class53(class693 arg0, int arg1, class522 arg2) {
        this.field1044 = arg2;
        if (this.field1044 != null) {
            int var4 = this.field1044.method2977((byte) -95) - 1;
            this.field1044.method2988(112, var4);
        }
    }
}
