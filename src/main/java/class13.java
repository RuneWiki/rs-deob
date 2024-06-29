import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class13 extends class428 {

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public int field188;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "Lgn;")
    public class187 field194;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIBI)V", line = 3)
    public static final void method95(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class357.field5123 <= arg1 && arg1 <= class328.field4729) {
            int var5 = class353.method2142((byte) -89, class453.field6396, arg2, class75.field912);
            int var6 = class353.method2142((byte) 73, class453.field6396, arg4, class75.field912);
            class227.method1250(var6, var5, arg0, arg3 ^ 0x12E7, arg1);
        }
        field195++;
        if (arg3 != -18) {
            method98((class187) null, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)I", line = 22)
    public static final int method96(int arg0, int arg1) {
        field190++;
        return arg0 < 57 ? 108 : arg1 >>> 10;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIILrm;Lrm;)V", line = 36)
    public static final void method97(int arg0, int arg1, int arg2, class183 arg3, class183 arg4) {
        class263 var5 = class88.method444(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field3784 = arg3;
            var5.field3782 = arg4;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lgn;B)V", line = 49)
    public static final void method98(class187 arg0, byte arg1) {
        field186++;
        if (arg1 != -84) {
            field187 = -10;
        }
        if (arg0 instanceof class137) {
            class137 var2 = (class137) arg0;
            if (var2.field1643 != null) {
                class474.method2804(var2, -107, class19.field258.field994 != var2.field994);
                return;
            }
        } else if ((arg0 instanceof class198)) {
            class198 var3 = (class198) arg0;
            class200.method1099(class19.field258.field994 != var3.field994, -123, var3);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 83)
    public static final void method99(int arg0) {
        field192++;
        int var1 = -49 / ((75 - arg0) / 42);
        int var2 = class438.field6286;
        int[] var3 = class79.field944;
        for (int var4 = 0; var4 < var2; var4++) {
            class198 var5 = class46.field596[var3[var4]];
            if (var5 != null) {
                class58.method299((byte) -118, var5, var5.method1012(false));
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)Ljava/lang/String;", line = 112)
    public static final String method100(int arg0, int arg1) {
        field191++;
        String var2 = Integer.toString(arg0);
        if (arg1 >= -48) {
            field187 = -32;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class260.field3756.method205((byte) 117, class68.field849) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class462.field6509.method205((byte) 102, class68.field849) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }
}
