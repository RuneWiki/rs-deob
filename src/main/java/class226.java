import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class226 {

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Lok;")
    public class238 field3200 = new class238();

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Lcs;")
    public static class351 field3199 = new class351(54, 3);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "Lok;")
    private class238 field3203;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "[[B")
    public static byte[][] field3194;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Lok;")
    public final class238 method1422(int arg0) {
        field3195++;
        if (arg0 > -120) {
            return null;
        }
        class238 var2 = this.field3203;
        if (this.field3200 == var2) {
            this.field3203 = null;
            return null;
        } else {
            this.field3203 = var2.field3360;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1423(int arg0, String arg1) throws ClassNotFoundException {
        field3196++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else {
            if (arg0 <= 58) {
                field3194 = null;
            }
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)Lok;")
    public final class238 method1424(byte arg0) {
        field3198++;
        class238 var2 = this.field3200.field3360;
        if (arg0 != -10) {
            this.field3200 = null;
        }
        if (this.field3200 == var2) {
            this.field3203 = null;
            return null;
        } else {
            this.field3203 = var2.field3360;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)[Lrd;")
    public static final class275[] method1425(boolean arg0) {
        if (!arg0) {
            field3199 = null;
        }
        field3201++;
        if (class103.field1462 == null) {
            class275[] var1 = class254.method1579(5878, class343.field4703);
            class275[] var2 = new class275[var1.length];
            int var3 = 0;
            label66: for (int var4 = 0; var4 < var1.length; var4++) {
                class275 var8 = var1[var4];
                if ((var8.field3808 <= 0 || var8.field3808 >= 24) && var8.field3811 >= 800 && var8.field3802 >= 600 && (class154.field2227 >= 96 || class221.field3118 != 0 || var8.field3811 <= 1024 && var8.field3802 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class275 var10 = var2[var9];
                        if (var8.field3811 == var10.field3811 && var8.field3802 == var10.field3802) {
                            if (var8.field3808 > var10.field3808) {
                                var2[var9] = var8;
                            }
                            continue label66;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class103.field1462 = new class275[var3];
            class415.method2421(var2, 0, class103.field1462, 0, var3);
            int[] var5 = new int[class103.field1462.length];
            for (int var6 = 0; var6 < class103.field1462.length; var6++) {
                class275 var7 = class103.field1462[var6];
                var5[var6] = var7.field3811 * var7.field3802;
            }
            class302.method1838((byte) -128, var5, class103.field1462);
        }
        return class103.field1462;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lok;I)V")
    public final void method1426(class238 arg0, int arg1) {
        if (arg0.field3354 != null) {
            arg0.method1495(19801);
        }
        field3197++;
        arg0.field3354 = this.field3200.field3354;
        arg0.field3360 = this.field3200;
        if (arg1 != 27334) {
            this.field3200 = null;
        }
        arg0.field3354.field3360 = arg0;
        arg0.field3360.field3354 = arg0;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "()V")
    public static final void method1427() {
        for (int var0 = 0; var0 < class160.field2305; var0++) {
            class478 var1 = class238.field3364[var0];
            class139.method850(var1);
            class238.field3364[var0] = null;
        }
        class160.field2305 = 0;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lvd;IIIII)V")
    public static final void method1428(class216 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3067 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class355.field4951[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class270 var13 = class488.field6890[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field3067; var14++) {
                            if (arg0.field3059[var14] == var13) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field3059[arg0.field3067++] = var13;
                        if (arg0.field3067 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field3067; var15 < 4; var15++) {
            arg0.field3059[var15] = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(Z)V")
    public final void method1429(boolean arg0) {
        if (!arg0) {
            field3194 = null;
        }
        field3193++;
        while (true) {
            class238 var2 = this.field3200.field3360;
            if (this.field3200 == var2) {
                this.field3203 = null;
                return;
            }
            var2.method1495(19801);
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
    public static void method1430(byte arg0) {
        field3194 = null;
        if (arg0 != -6) {
            method1430((byte) -128);
        }
        field3199 = null;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class226() {
        this.field3200.field3360 = this.field3200;
        this.field3200.field3354 = this.field3200;
    }
}
