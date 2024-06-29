import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class479 implements class695 {

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "Lfw;")
    public class52 field6683;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public int field6690;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Ldg;")
    public class377 field6685;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public int field6686;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public int field6687;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "Lsu;")
    public static class192 field6689 = new class192();

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "[C")
    private static char[] field6692 = new char[64];

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "Llaa;")
    public static class106 field6693;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public static void method2718(int arg0) {
        field6692 = null;
        field6693 = null;
        field6689 = null;
        if (arg0 <= 47) {
            field6693 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)I")
    public static final int method2719(int arg0, int arg1, int arg2) {
        field6691++;
        return arg0 == arg1 || arg0 == 3 ? class614.field8511[arg2 & 0x3] : class277.field3888[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Loa;Lpj;I)V")
    public static final void method2720(class638 arg0, class132 arg1, int arg2) {
        field6682++;
        class543[] var3 = class543.method2982(arg1, class473.field6606, 0);
        class694.field9755 = new class461[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class694.field9755[var4] = arg0.method412(var3[var4], true);
        }
        class543[] var5 = class543.method2982(arg1, class130.field1781, 0);
        class244.field3482 = new class461[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class244.field3482[var6] = arg0.method412(var5[var6], true);
        }
        class543[] var7 = class543.method2982(arg1, class77.field1067, 0);
        class381.field5358 = new class461[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class381.field5358[var8] = arg0.method412(var7[var8], true);
        }
        class543[] var9 = class543.method2982(arg1, class219.field3182, 0);
        class650.field9206 = new class461[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class650.field9206[var10] = arg0.method412(var9[var10], true);
        }
        class543[] var11 = class543.method2982(arg1, class399.field5547, 0);
        class72.field985 = new class461[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class72.field985[var12] = arg0.method412(var11[var12], true);
        }
        class543[] var13 = class543.method2982(arg1, class71.field979, 0);
        class36.field452 = new class461[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class36.field452[var14] = arg0.method412(var13[var14], true);
        }
        class543[] var15 = class543.method2982(arg1, class387.field5432, 0);
        class485.field6725 = new class461[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class485.field6725[var16] = arg0.method412(var15[var16], true);
        }
        class543[] var17 = class543.method2982(arg1, class572.field7711, 0);
        class121.field1675 = new class461[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class121.field1675[var18] = arg0.method412(var17[var18], true);
        }
        class543[] var19 = class543.method2982(arg1, class30.field364, 0);
        class261.field3712 = new class461[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class261.field3712[var20] = arg0.method412(var19[var20], true);
        }
        class543[] var21 = class543.method2982(arg1, class32.field383, 0);
        class486.field6754 = new class461[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class486.field6754[var22] = arg0.method412(var21[var22], true);
        }
        class543[] var23 = class543.method2982(arg1, class583.field8127, 0);
        class143.field2134 = new class461[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class143.field2134[var24] = arg0.method412(var23[var24], true);
        }
        class543[] var25 = class543.method2982(arg1, class16.field235, 0);
        class656.field9239 = new class461[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class656.field9239[var26] = arg0.method412(var25[var26], true);
        }
        class687.field9666 = arg0.method412(class543.method2990(arg1, class428.field6015, 0), true);
        class545.field7386 = arg0.method412(class543.method2990(arg1, class258.field3698, 0), true);
        class543[] var27 = class543.method2982(arg1, class615.field8523, 0);
        class423.field5966 = new class461[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class423.field5966[var28] = arg0.method412(var27[var28], true);
        }
        if (arg2 != 10886) {
            method2721(24);
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
    public static final void method2721(int arg0) {
        if (class584.field8138 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class371.field5278.length; var2++) {
                if (class371.field5278[var2].startsWith("--> ")) {
                    var1++;
                    if (class584.field8138 == var1) {
                        class591.field8240 = class371.field5278[var2].substring(4);
                        break;
                    }
                }
            }
        } else {
            class591.field8240 = "";
        }
        field6684++;
        if (arg0 > -94) {
            method2720(null, null, 4);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Lhs;")
    public class295 method52(int arg0) {
        field6688++;
        return arg0 == -14151 ? class238.field3435 : null;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(ILfw;Ldg;II)V")
    public class479(int arg0, class52 arg1, class377 arg2, int arg3, int arg4) {
        this.field6683 = arg1;
        this.field6690 = arg4;
        this.field6685 = arg2;
        this.field6686 = arg0;
        this.field6687 = arg3;
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field6692[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field6692[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field6692[var2] = (char) (var2 - 4);
        }
        field6692[62] = '+';
        field6692[63] = '/';
        field6693 = new class106(7, 0, 1, 1);
    }
}
