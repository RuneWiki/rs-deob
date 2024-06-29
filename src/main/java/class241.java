import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class241 extends class130 {

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public int field3614;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    public int field3617;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)Lm;")
    public static final class80 method1619(int arg0, int arg1) {
        field3615++;
        class80 var2 = (class80) class310.field4728.method1634((long) arg1, 64);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class408.field6039.method731(0, arg1, 0);
        class80 var4 = new class80();
        if (arg0 != 26750) {
            return null;
        }
        if (var3 != null) {
            var4.method710(-7855, new class194(var3), arg1);
        }
        class310.field4728.method1623((long) arg1, 17621, var4);
        return var4;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(II)V")
    public class241(int arg0, int arg1) {
        this.field3614 = arg1;
        this.field3617 = arg0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Laa;)V")
    public static final void method1620(class76 arg0) {
        for (int var1 = arg0.field1283; var1 <= arg0.field1271; var1++) {
            for (int var2 = arg0.field1277; var2 <= arg0.field1272; var2++) {
                class281 var3 = class348.field5192[arg0.field1274][var1][var2];
                if (var3 != null) {
                    class21 var4 = var3.field4381;
                    class21 var5 = null;
                    while (var4 != null) {
                        if (var4.field240 == arg0) {
                            if (var5 == null) {
                                var3.field4381 = var4.field235;
                            } else {
                                var5.field235 = var4.field235;
                            }
                            var4.method132(7);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field235;
                    }
                    var3.field4369 = 0;
                    for (class21 var6 = var3.field4381; var6 != null; var6 = var6.field235) {
                        var3.field4369 = (byte) (var3.field4369 | var6.field237);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
    public static final void method1621(byte arg0) {
        class192.field2954.method2373(-28708);
        field3619++;
        int var1 = 98 / ((-arg0 - 75) / 43);
        class134.field1992 = null;
        class386.field5678 = 1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZLhp;)V")
    public static final void method1622(boolean arg0, class293 arg1) {
        arg1.field4527 = null;
        if (arg0) {
            return;
        }
        field3616++;
        int var2 = arg1.field4524.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg1.field4524[var3].field673 = false;
        }
        class150[] var4 = class364.field5371;
        synchronized (class364.field5371) {
            if (class364.field5371.length > var2 && class267.field4257[var2] < 200) {
                class364.field5371[var2].method1082(arg1, -59);
                int var10002 = class267.field4257[var2]++;
            }
        }
    }
}
