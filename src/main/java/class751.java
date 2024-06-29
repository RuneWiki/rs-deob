import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class751 implements class184 {

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "Llja;")
    public static class744 field10422 = new class744(63, 4);

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field10423;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field10424;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 10)
    public static void method4197(int arg0) {
        if (arg0 != 32709) {
            method4197(-15);
        }
        field10422 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(JILbja;[I)Ljava/lang/String;", line = 21)
    public final String method1228(long arg0, int arg1, class34 arg2, int[] arg3) {
        field10423++;
        if (class180.field2205 == arg2) {
            class618 var6 = class39.field569.method819(118, arg3[0]);
            return var6.method3500((int) arg0, 2);
        } else if (class260.field3089 == arg2 || class192.field2293 == arg2) {
            class340 var8 = class121.field1555.method2882((int) arg0, -22087);
            return var8.field4222;
        } else {
            int var7 = -80 % ((-arg1 - 41) / 43);
            return class108.field1356 == arg2 || class363.field4525 == arg2 || class61.field820 == arg2 ? class39.field569.method819(-121, arg3[0]).method3500((int) arg0, 2) : null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 52)
    public static final void method4198(int arg0) {
        field10424++;
        class576.method3330(class634.field8654, -1);
        class56.field763++;
        if (class301.field3605 && class410.field5373) {
            int var1 = 0;
            int var2 = 0;
            if (class769.field10572) {
                var1 = class793.method4373((byte) 50);
                var2 = class719.method4070((byte) 107);
            }
            int var3 = var1 + class738.field10291.method109(123);
            int var4 = class738.field10291.method117(true) + var2;
            int var5 = var3 - class140.field1756;
            int var6 = var4 - class209.field2481;
            if (class90.field1206 > var5) {
                var5 = class90.field1206;
            }
            if (class585.field7977 > var6) {
                var6 = class585.field7977;
            }
            if (class90.field1206 + class395.field5122.field8506 < class634.field8654.field8506 + var5) {
                var5 = class90.field1206 + class395.field5122.field8506 - class634.field8654.field8506;
            }
            if ((class634.field8654.field8416 + var6) > (class585.field7977 + class395.field5122.field8416)) {
                var6 = class585.field7977 + class395.field5122.field8416 - class634.field8654.field8416;
            }
            int var7 = var5 + class395.field5122.field8496 - class90.field1206;
            int var8 = -74 % (arg0 / 38);
            int var9 = var6 + class395.field5122.field8392 - class585.field7977;
            if (class738.field10291.method4355((byte) 112)) {
                if (class634.field8654.field8335 < class56.field763) {
                    int var11 = var5 - class164.field2013;
                    int var12 = var6 - class704.field9904;
                    if (var11 > class634.field8654.field8413 || (-class634.field8654.field8413) > var11 || var12 > class634.field8654.field8413 || var12 < -class634.field8654.field8413) {
                        class18.field343 = true;
                    }
                }
                if (class634.field8654.field8352 != null && class18.field343) {
                    class529 var13 = new class529();
                    var13.field7473 = class634.field8654;
                    var13.field7477 = class634.field8654.field8352;
                    var13.field7469 = var9;
                    var13.field7475 = var7;
                    class142.method1045(var13);
                }
            } else {
                if (class18.field343) {
                    class118.method926(-97);
                    if (class634.field8654.field8353 != null) {
                        class529 var10 = new class529();
                        var10.field7477 = class634.field8654.field8353;
                        var10.field7473 = class634.field8654;
                        var10.field7472 = class438.field5760;
                        var10.field7475 = var7;
                        var10.field7469 = var9;
                        class142.method1045(var10);
                    }
                    if (class438.field5760 != null && client.method1885(class634.field8654) != null) {
                        class541.method3205(true, class438.field5760, class634.field8654);
                    }
                } else if ((class25.field373 == 1 || class20.method232(false)) && class245.field2894 > 2) {
                    class583.method3359(class209.field2481 + class704.field9904, false, class164.field2013 + class140.field1756);
                } else if (class124.method964((byte) -102)) {
                    class583.method3359(class209.field2481 + class704.field9904, false, class164.field2013 + class140.field1756);
                }
                class634.field8654 = null;
            }
        } else if (class56.field763 > 1) {
            class634.field8654 = null;
        }
    }
}
