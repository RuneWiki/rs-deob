import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class430 extends class665 {

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public int field6297 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "I")
    public int field6300 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
    public int field6304 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
    public int field6299 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "I")
    public int field6305 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cq", name = "v", descriptor = "I")
    public int field6308 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "I")
    public int field6307 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public int field6301 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "Llt;")
    public class627 field6302;

    @OriginalMember(owner = "client!cq", name = "w", descriptor = "I")
    public static int field6309 = 0;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "F")
    public static float field6298;

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Llt;)V", line = 132)
    public class430(class627 arg0) {
        this.field6302 = arg0;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BII)Z", line = 15)
    public final boolean method2568(byte arg0, int arg1, int arg2) {
        field6303++;
        if (arg0 != -59) {
            method2569(117, null, -24);
        }
        if (this.field6300 <= arg2 && this.field6307 >= arg2 && this.field6305 <= arg1 && arg1 <= this.field6301) {
            return true;
        } else {
            return arg2 >= this.field6308 && this.field6299 >= arg2 && arg1 >= this.field6297 && this.field6304 >= arg1;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I[Lvg;I)V", line = 57)
    public static final void method2569(int arg0, class49[] arg1, int arg2) {
        if (arg2 < 27) {
            method2569(78, null, 10);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class49 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field980 == 0) {
                    if (var4.field1014 != null) {
                        method2569(arg0, var4.field1014, 79);
                    }
                    class320 var5 = (class320) class654.field9178.method1405((long) var4.field977, (byte) -116);
                    if (var5 != null) {
                        class483.method2815(arg0, var5.field4703, -2064);
                    }
                }
                if (arg0 == 0 && var4.field1007 != null) {
                    class14 var6 = new class14();
                    var6.field129 = var4;
                    var6.field122 = var4.field1007;
                    class220.method1443(var6);
                }
                if (arg0 == 1 && var4.field1009 != null) {
                    if (var4.field914 >= 0) {
                        class49 var7 = class534.method3038(-92, var4.field977);
                        if (var7 == null || var7.field1014 == null || var7.field1014.length <= var4.field914 || var7.field1014[var4.field914] != var4) {
                            continue;
                        }
                    }
                    class14 var8 = new class14();
                    var8.field129 = var4;
                    var8.field122 = var4.field1009;
                    class220.method1443(var8);
                }
            }
        }
        field6306++;
    }
}
