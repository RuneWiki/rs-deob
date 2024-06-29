import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class201 extends class284 {

    @OriginalMember(owner = "client!pg", name = "ab", descriptor = "Lwm;")
    public static class152 field3246 = class157.method1048("<col=ffb000>", 93);

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "[I")
    public static int[] field3240 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!pg", name = "eb", descriptor = "Lwm;")
    public static class152 field3250 = class157.method1048("Hidden)2", 95);

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "I")
    public static int field3243 = 0;

    @OriginalMember(owner = "client!pg", name = "gb", descriptor = "Lwm;")
    public static class152 field3252 = class157.method1048("", 99);

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "Lwm;")
    public static class152 field3241 = field3252;

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "I")
    public static int field3245 = -1;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "Lwm;")
    public static class152 field3237 = field3252;

    @OriginalMember(owner = "client!pg", name = "cb", descriptor = "B")
    public byte field3248;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!pg", name = "hb", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!pg", name = "ib", descriptor = "I")
    public int field3254;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "Lah;")
    public static class205 field3236;

    @OriginalMember(owner = "client!pg", name = "bb", descriptor = "Lee;")
    public static class279 field3247;

    @OriginalMember(owner = "client!pg", name = "fb", descriptor = "Lhi;")
    public class291 field3251;

    @OriginalMember(owner = "client!pg", name = "db", descriptor = "[B")
    public static byte[] field3249;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V", line = 5)
    public static void method1335(int arg0) {
        if (arg0 != -8) {
            return;
        }
        field3249 = null;
        field3252 = null;
        field3237 = null;
        field3236 = null;
        field3246 = null;
        field3241 = null;
        field3240 = null;
        field3247 = null;
        field3250 = null;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)I", line = 32)
    public final int method509(byte arg0) {
        if (arg0 >= -119) {
            field3252 = (class152) null;
        }
        field3239++;
        return this.field3251 == null ? 0 : this.field3251.field4946 * 100 / (this.field3251.field4950.length - this.field3248);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lwm;II)V", line = 67)
    public static final void method1336(class152 arg0, int arg1, int arg2) {
        field3253++;
        boolean var3 = false;
        class152 var4 = arg0.method978(-123).method1022(-117);
        if (arg2 >= -1) {
            method1335(-78);
        }
        for (int var5 = 0; var5 < class194.field3114; var5++) {
            class12 var6 = class22.field380[class325.field5670[var5]];
            if (var6 != null && var6.field146 != null && var6.field146.method995(-124, var4)) {
                var3 = true;
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var6.field4245[0], 0, class85.field1176.field4245[0], 103, var6.field4188[0], false, 1);
                if (arg1 == 1) {
                    class176.field2834++;
                    class245.field4102.method1065(188, 126);
                    class245.field4102.method1994(class325.field5670[var5], 2921);
                } else if (arg1 == 4) {
                    class245.field4102.method1065(190, 47);
                    class230.field3748++;
                    class245.field4102.method1994(class325.field5670[var5], 2921);
                } else if (arg1 == 5) {
                    class245.field4102.method1065(249, 123);
                    class297.field5128++;
                    class245.field4102.method1996(0, class325.field5670[var5]);
                } else if (arg1 == 6) {
                    class245.field4102.method1065(123, 127);
                    class298.field5151++;
                    class245.field4102.method1996(0, class325.field5670[var5]);
                } else if (arg1 == 7) {
                    class245.field4102.method1065(220, -92);
                    class45.field719++;
                    class245.field4102.method2018(class325.field5670[var5], 128);
                }
                break;
            }
        }
        if (!var3) {
            class245.method1687(field3252, 0, class195.method1307(new class152[] { class227.field3680, var4 }, (byte) 29), -1);
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)[B", line = 165)
    public final byte[] method510(byte arg0) {
        if (arg0 != -128) {
            this.field3251 = (class291) null;
        }
        field3242++;
        if (this.field4823 || this.field3251.field4950.length - this.field3248 > this.field3251.field4946) {
            throw new RuntimeException();
        }
        return this.field3251.field4950;
    }
}
