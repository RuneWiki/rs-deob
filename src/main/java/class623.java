import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class623 {

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "Lwf;")
    private class117 field9173 = new class117(64);

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "Lkda;")
    public class328 field9175;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "Lkda;")
    private class328 field9174;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "Llu;")
    public static class610 field9172 = new class610(38, -1);

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "Llu;")
    public static class610 field9177 = new class610(80, 8);

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "Llu;")
    public static class610 field9186 = new class610(75, -1);

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "[I")
    public static int[] field9188 = new int[1];

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "F")
    public static float field9187;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field9179;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field9181;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field9184;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "Lkda;")
    public static class328 field9185;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "Llp;")
    public static class331 field9178;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "Lsj;")
    public static class392 field9182;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "[Lha;")
    public static class53[] field9183;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)Lom;", line = 7)
    public final class314 method3639(byte arg0, int arg1) {
        field9176++;
        class117 var3 = this.field9173;
        class314 var4;
        synchronized (this.field9173) {
            var4 = (class314) this.field9173.method842(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class328 var5 = this.field9174;
        byte[] var6;
        synchronized (this.field9174) {
            var6 = this.field9174.method1966(arg1, 3, true);
        }
        class314 var7 = new class314();
        var7.field4326 = this;
        if (var6 != null) {
            var7.method1903((byte) -122, new class148(var6));
        }
        if (arg0 != 106) {
            return null;
        }
        class117 var8 = this.field9173;
        synchronized (this.field9173) {
            this.field9173.method835((byte) 125, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 38)
    public final void method3640(int arg0) {
        class117 var2 = this.field9173;
        synchronized (this.field9173) {
            if (arg0 != 0) {
                return;
            }
            this.field9173.method837(126);
        }
        field9179++;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 52)
    public static void method3641(int arg0) {
        field9172 = null;
        field9177 = null;
        field9178 = null;
        int var1 = -2 % ((48 - arg0) / 55);
        field9188 = null;
        field9185 = null;
        field9186 = null;
        field9182 = null;
        field9183 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V", line = 80)
    public final void method3642(boolean arg0) {
        class117 var2 = this.field9173;
        synchronized (this.field9173) {
            this.field9173.method846(0);
        }
        if (!arg0) {
            this.method3639((byte) -92, 10);
        }
        field9181++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "()V", line = 101)
    public static final void method3643() {
        if (class72.field988 != null) {
            for (int var0 = 0; var0 < class72.field988.length; var0++) {
                for (int var1 = 0; var1 < class145.field2083; var1++) {
                    for (int var2 = 0; var2 < class384.field5282; var2++) {
                        if (class72.field988[var0][var1][var2] != null) {
                            class72.field988[var0][var1][var2].method1354(-3178);
                        }
                        class72.field988[var0][var1][var2] = null;
                    }
                }
            }
        }
        class72.field988 = null;
        class207.field3077 = null;
        if (class297.field4081 != null) {
            for (int var3 = 0; var3 < class297.field4081.length; var3++) {
                for (int var4 = 0; var4 < class145.field2083; var4++) {
                    for (int var5 = 0; var5 < class384.field5282; var5++) {
                        if (class297.field4081[var3][var4][var5] != null) {
                            class297.field4081[var3][var4][var5].method1354(-3178);
                        }
                        class297.field4081[var3][var4][var5] = null;
                    }
                }
            }
        }
        class297.field4081 = null;
        class114.field1609 = null;
        class420.field5697 = null;
        class165.field2609 = null;
        class441.field5889 = 0;
        if (class393.field5407 != null) {
            for (int var6 = 0; var6 < class441.field5889; var6++) {
                class393.field5407[var6] = null;
            }
        }
        if (class583.field8562 != null) {
            for (int var7 = 0; var7 < class635.field9298; var7++) {
                class583.field8562[var7] = null;
            }
            class635.field9298 = 0;
        }
        if (class148.field2163 != null) {
            for (int var8 = 0; var8 < class495.field7041; var8++) {
                class148.field2163[var8] = null;
            }
            for (int var9 = 0; var9 < class348.field4772; var9++) {
                for (int var10 = 0; var10 < class145.field2083; var10++) {
                    for (int var11 = 0; var11 < class384.field5282; var11++) {
                        class22.field219[var9][var10][var11] = 0L;
                    }
                }
            }
            class495.field7041 = 0;
        }
        class104.field1510 = null;
        class459.method2778((byte) 51);
        class42.field491.method2234((byte) -24);
        class557.field8282 = null;
        class188.field2797 = null;
        class188.field2803 = null;
        class451.field6356 = null;
        class130.field1800 = null;
        class193.field2864 = null;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lbt;ILkda;Lkda;)V", line = 295)
    public class623(class39 arg0, int arg1, class328 arg2, class328 arg3) {
        this.field9175 = arg3;
        this.field9174 = arg2;
        this.field9174.method1975(90, 3);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lfw;III)V", line = 256)
    public static final void method3644(class51 arg0, int arg1, int arg2, int arg3) {
        long var4 = class22.field219[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field594 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field597[arg0.field594++] = class148.field2163[var8 - 1].field5683;
            var6 += 16L;
        }
        for (int var9 = arg0.field594; var9 < 4; var9++) {
            arg0.field597[var9] = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V", line = 283)
    public final void method3645(int arg0, int arg1) {
        if (arg1 > -9) {
            return;
        }
        class117 var3 = this.field9173;
        synchronized (this.field9173) {
            this.field9173.method834(arg0, 0);
        }
        field9180++;
    }
}
