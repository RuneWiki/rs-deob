import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class290 {

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public int field4623 = -1;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public int field4632 = -1;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "Llm;")
    public static class150 field4625 = new class150(30);

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4628 = "yellow:";

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4630 = null;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[I")
    public int[] field4624;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "[Lvi;")
    public static class281[] field4633;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public static void method1945(byte arg0) {
        field4633 = null;
        field4625 = null;
        if (arg0 != -95) {
            method1947((byte) 41, (String) null, (String) null, (String) null);
        }
        field4630 = null;
        field4628 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLbj;I)V")
    public final void method1946(byte arg0, class215 arg1, int arg2) {
        if (arg0 != 45) {
            field4627 = -46;
        }
        while (true) {
            int var4 = arg1.method1374((byte) -60);
            if (var4 == 0) {
                field4631++;
                return;
            }
            this.method1948(arg1, var4, arg2, 1);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1947(byte arg0, String arg1, String arg2, String arg3) {
        if (arg0 != 64) {
            field4625 = null;
        }
        field4629++;
        for (int var4 = arg2.indexOf(arg3); var4 != -1; var4 = arg2.indexOf(arg3, arg1.length() + var4)) {
            arg2 = arg2.substring(0, var4) + arg1 + arg2.substring(var4 + arg3.length());
        }
        return arg2;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lbj;III)V")
    private final void method1948(class215 arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1) {
            this.field4623 = arg0.method1379(-80);
        } else if (arg1 == 2) {
            this.field4624 = new int[arg0.method1374((byte) -60)];
            for (int var5 = 0; var5 < this.field4624.length; var5++) {
                this.field4624[var5] = arg0.method1379(-115);
            }
        } else if (arg1 == 3) {
            this.field4632 = arg0.method1374((byte) -60);
        }
        if (arg3 == 1) {
            field4621++;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static final void method1949(int arg0) {
        field4622++;
        class241.field3791 = 0;
        int var1 = (class250.field3905.field4081 >> 7) + class228.field3570;
        int var2 = (class250.field3905.field4140 >> 7) + class170.field2421;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class241.field3791 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class241.field3791 = 1;
        }
        if (class241.field3791 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class241.field3791 = 0;
        }
        if (arg0 != 30) {
            method1947((byte) -127, (String) null, (String) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)V")
    public static final void method1950(byte arg0, int arg1) {
        for (class154 var2 = class18.field309.method1458(0); var2 != null; var2 = class18.field309.method1462(-10000001)) {
            if ((long) arg1 == (var2.field2141 >> 48 & 0xFFFFL)) {
                var2.method962(128);
            }
        }
        field4626++;
        if (arg0 > -84) {
            method1949(-30);
        }
    }
}
