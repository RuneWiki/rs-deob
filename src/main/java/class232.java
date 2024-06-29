import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class232 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field3505 = 0;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3511 = "red:";

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public int field3510;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "Ljc;")
    public class328 field3508;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "[I")
    public int[] field3515;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "[[Lhi;")
    public static class323[][] field3512;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 4)
    public static void method1601(byte arg0) {
        field3512 = (class323[][]) null;
        field3511 = null;
        if (arg0 != -96) {
            field3512 = (class323[][]) ((class323[][]) null);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[Lhi;I)V", line = 19)
    public static final void method1602(int arg0, class323[] arg1, int arg2) {
        field3513++;
        for (int var3 = arg2; var3 < arg1.length; var3++) {
            class323 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field5107 == 0) {
                    if (var4.field5036 != null) {
                        method1602(arg0, var4.field5036, 0);
                    }
                    class238 var5 = (class238) class88.field1166.method770((long) var4.field5073, arg2 - 99);
                    if (var5 != null) {
                        class106.method688((byte) -24, arg0, var5.field3658);
                    }
                }
                if (arg0 == 0 && var4.field5133 != null) {
                    class185 var6 = new class185();
                    var6.field2793 = var4;
                    var6.field2789 = var4.field5133;
                    class208.method1456(-7155, var6);
                }
                if (arg0 == 1 && var4.field5016 != null) {
                    if (var4.field5112 >= 0) {
                        class323 var7 = class45.method277(-12866, var4.field5073);
                        if (var7 == null || var7.field5036 == null || var7.field5036.length <= var4.field5112 || var7.field5036[var4.field5112] != var4) {
                            continue;
                        }
                    }
                    class185 var8 = new class185();
                    var8.field2793 = var4;
                    var8.field2789 = var4.field5016;
                    class208.method1456(-7155, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 96)
    public static final String method1603(long arg0, int arg1) {
        field3514++;
        class274.field4334.setTime(new Date(arg0));
        int var3 = class274.field4334.get(7);
        int var4 = class274.field4334.get(5);
        int var5 = class274.field4334.get(2);
        int var6 = class274.field4334.get(1);
        int var7 = class274.field4334.get(11);
        int var8 = -116 / ((-arg1 - 11) / 42);
        int var9 = class274.field4334.get(12);
        int var10 = class274.field4334.get(13);
        return class49.field561[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class280.field4410[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V", line = 121)
    public static final void method1604(byte arg0) {
        if (arg0 > 99) {
            class291.field4582.method378(0);
            field3509++;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILia;IIIB)Z", line = 133)
    public static final boolean method1605(int arg0, int arg1, class234 arg2, int arg3, int arg4, int arg5, byte arg6) {
        field3516++;
        class313 var7 = class93.method606(34, arg2.field3573);
        if (var7.field4907 == -1) {
            return true;
        }
        int var9;
        if (arg2.field3611) {
            int var8 = arg2.field3587 + arg4;
            var9 = var8 & 0x3;
        } else {
            var9 = 0;
        }
        class270 var10 = var7.method2209(arg2.field3576, (byte) -123, var9);
        if (var10 == null) {
            return false;
        }
        int var11 = arg2.field3577;
        int var12 = arg2.field3590;
        int var13 = var10.field2369;
        if ((var9 & 0x1) == 1) {
            var11 = arg2.field3590;
            var12 = arg2.field3577;
        }
        int var14 = var10.field2360;
        if (var7.field4906) {
            var13 = var11 * 4;
            var14 = var12 * 4;
        }
        if (var7.field4896 == 0) {
            var10.method1908((arg1 * 4) + 48, (-arg3 + 104 + -var12) * 4 + 48, var13, var14);
        } else {
            var10.method1913(arg1 * 4 + 48, (-arg3 + 104 + -var12) * 4 + 48, var13, var14, var7.field4896);
        }
        return arg6 == -91;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lnk;ILnk;)V", line = 190)
    public static final void method1606(class16 arg0, int arg1, class16 arg2) {
        class344.field5463 = class207.method1454((byte) -99, class16.field162, 0, arg0, arg2);
        field3506++;
        if (arg1 > -106) {
            field3511 = (String) null;
        }
        if (class272.field4317) {
            class149.field2364 = class87.method556(0, class16.field162, arg2, arg0, 0);
        } else {
            class149.field2364 = (class299) class344.field5463;
        }
        class41.field446 = class207.method1454((byte) -75, class285.field4526, 0, arg0, arg2);
        class93.field1233 = class207.method1454((byte) 118, class73.field913, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)Lng;", line = 208)
    public static final class182 method1607(int arg0) {
        if (arg0 != 30398) {
            return (class182) null;
        }
        field3507++;
        if (class336.field5352 == null) {
            return null;
        }
        for (class182 var1 = (class182) class99.field1338.method32(-29107); var1 != null; var1 = (class182) class99.field1338.method32(-29107)) {
            class103 var2 = class79.method521(var1.field2735, -68);
            if (var2 != null && var2.field1384 && var2.method657(arg0 - 30342)) {
                return var1;
            }
        }
        return null;
    }
}
