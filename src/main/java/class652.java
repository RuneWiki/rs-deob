import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class652 {

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "Lvia;")
    public static class564 field9079;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lgg;[Lcba;)V", line = 3)
    public static final void method3679(class176 arg0, class551[] arg1) {
        if (class276.field3687) {
            int var2 = arg0.method881(-51, arg1);
            class22.field158.method449(var2, arg1);
        }
        if (class25.field188 == class143.field1850) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class752) {
                var5 = ((class752) arg0).field10422;
                var6 = ((class752) arg0).field10421;
            } else {
                var5 = arg0.field2170 >> class443.field6172;
                var6 = arg0.field2165 >> class443.field6172;
            }
            class22.field158.method427(class86.field1182[0].method1683(arg0.field2170, arg0.field2165, true), class34.method175(var5, var6), class149.method915(var5, var6), class73.method538(var5, var6));
        }
        class62 var7 = arg0.method127(class22.field158, -30);
        if (var7 == null) {
            return;
        }
        if (arg0.field2168) {
            class486[] var8 = var7.field678;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class486 var10 = var8[var9];
                if (var10.field6676) {
                    class207.method1157(var10.field6674 + var10.field6671, var10.field6675 - var10.field6671, false, var10.field6673 - var10.field6671, var10.field6672 + var10.field6671);
                }
            }
        }
        if (var7.field683) {
            var7.field682 = arg0;
            if (class181.field2224) {
                class651 var11 = class350.field4641;
                synchronized (class350.field4641) {
                    class350.field4641.method3678(0, var7);
                    return;
                }
            }
            class350.field4641.method3678(0, var7);
            return;
        }
        class614.method3456(var7, 95);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V", line = 73)
    public static final void method3680(byte arg0) {
        field9078++;
        if (arg0 < 79) {
            method3682(67);
        }
        for (class585 var1 = (class585) class604.field8417.method2560(126); var1 != null; var1 = (class585) class604.field8417.method2557(-1)) {
            if (var1.field8190) {
                var1.field8190 = false;
            } else {
                class103.method708((byte) 67, var1.field8192);
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V", line = 99)
    public static void method3681(byte arg0) {
        field9079 = null;
        if (arg0 != -117) {
            method3679(null, null);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)Leda;", line = 111)
    public static final class103 method3682(int arg0) {
        field9077++;
        return ~class189.field2274 == arg0 ? new class103() : class86.field1188[--class189.field2274];
    }
}
