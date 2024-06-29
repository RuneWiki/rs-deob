import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class388 extends class45 {

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
    public int field5597;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
    public int field5599;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "Llm;")
    public static class347 field5602;

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "Llm;")
    public static class347 field5603;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BII)Lps;", line = 3)
    public static final class394 method2492(byte arg0, int arg1, int arg2) {
        field5601++;
        class394 var3 = class196.method1168((byte) -94, arg2);
        if (arg1 == -1) {
            return var3;
        } else {
            int var4 = 95 % ((-arg0 - 14) / 38);
            return var3 == null || var3.field5820 == null || var3.field5820.length <= arg1 ? null : var3.field5820[arg1];
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V", line = 22)
    public static final void method2493(int arg0) {
        field5604++;
        if (class296.field4244 <= 0) {
            class276.field4000 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class65.field859.length; var2++) {
                if (class65.field859[var2].startsWith("--> ")) {
                    int var10000 = ~class296.field4244;
                    var1++;
                    if (var10000 == ~var1) {
                        class276.field4000 = class65.field859[var2].substring(4);
                        break;
                    }
                }
            }
        }
        if (arg0 != -2) {
            method2493(-117);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V", line = 56)
    public static final void method2494(int arg0, int arg1) {
        class367.field5300 = arg0;
        if (arg1 > -34) {
            field5603 = null;
        }
        field5600++;
        class189 var2 = class48.field674;
        synchronized (class48.field674) {
            class48.field674.method1141(256);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIILgf;)V", line = 71)
    public static final void method2495(int arg0, int arg1, int arg2, int arg3, class200 arg4) {
        field5605++;
        long var5 = (long) (arg1 | arg2 << 28 | arg0 << 14);
        class38 var7 = (class38) class200.field2656.method384(var5, true);
        if (var7 == null) {
            class38 var8 = new class38();
            class200.field2656.method381(true, var8, var5);
            var8.field533.method330(arg4, -2130841184);
            return;
        }
        class83 var9 = class9.method74(arg4.field2658, (byte) 124);
        int var10 = var9.field1191;
        if (var9.field1148 == 1) {
            var10 = (arg4.field2657 + 1) * var10;
        }
        for (class200 var11 = (class200) var7.field533.method332(-2130841184); var11 != null; var11 = (class200) var7.field533.method343((byte) -80)) {
            class83 var12 = class9.method74(var11.field2658, (byte) -58);
            int var13 = var12.field1191;
            if (var12.field1148 == 1) {
                var13 = (var11.field2657 + 1) * var13;
            }
            if (var10 > var13) {
                class72.method529(arg4, var11, 5);
                return;
            }
        }
        if (arg3 > -60) {
            field5603 = null;
        }
        var7.field533.method330(arg4, -2130841184);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V", line = 127)
    public static void method2496(boolean arg0) {
        field5602 = null;
        field5603 = null;
        if (!arg0) {
            method2498((byte) 67, (String) null);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZI)V", line = 141)
    public static final void method2497(boolean arg0, int arg1) {
        field5596++;
        if (class78.field1096 == arg1) {
            return;
        }
        class192.field2574 = class364.field5262 = class449.field6574[arg1];
        class61.field807.method1764(50, (int) ((double) class192.field2574 * 34.46D));
        class233.field3116 = new int[4][class192.field2574 >> 3][class364.field5262 >> 3];
        class56.field769 = new int[class192.field2574][class364.field5262];
        class181.field2391 = new int[class192.field2574][class364.field5262];
        int var2 = 0;
        if (!arg0) {
            method2492((byte) 50, 15, 101);
        }
        while (var2 < 4) {
            class365.field5294[var2] = class164.method1015(class364.field5262, -19129, class192.field2574);
            var2++;
        }
        class12.field184 = new byte[4][class192.field2574][class364.field5262];
        class63.method439(4, class364.field5262, class192.field2574, -10);
        class106.method715(class61.field807, class364.field5262 >> 3, class192.field2574 >> 3, (byte) 0);
        class78.field1096 = arg1;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLjava/lang/String;)V", line = 173)
    public static final void method2498(byte arg0, String arg1) {
        field5606++;
        if (arg1 == null) {
            return;
        }
        String var2 = class397.method2555(2289, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class318.field4649; var3++) {
            String var4 = class397.method2555(2289, class212.field2840[var3]);
            if (var4 != null && var4.equals(var2)) {
                class318.field4649--;
                for (int var5 = var3; var5 < class318.field4649; var5++) {
                    class212.field2840[var5] = class212.field2840[var5 + 1];
                    class295.field4233[var5] = class295.field4233[var5 + 1];
                    class307.field4520[var5] = class307.field4520[var5 + 1];
                    class281.field4094[var5] = class281.field4094[var5 + 1];
                    class235.field3128[var5] = class235.field3128[var5 + 1];
                }
                class153.field2069++;
                class416.field6111 = class207.field2788;
                class185.field2507.method5(-6445, 1);
                class185.field2507.method1346(class125.method795(-49, arg1), 32767);
                class185.field2507.method1380(65280, arg1);
                break;
            }
        }
        if (arg0 <= 47) {
            field5602 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(II)V", line = 228)
    public class388(int arg0, int arg1) {
        this.field5597 = arg1;
        this.field5599 = arg0;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(II)V", line = 245)
    public static final void method2499(int arg0, int arg1) {
        field5598++;
        if (class395.method2537((byte) -123, arg1)) {
            class99.method673(class365.field5292[arg1], 123, -1);
            if (arg0 != 1) {
                method2497(true, -22);
            }
        }
    }
}
