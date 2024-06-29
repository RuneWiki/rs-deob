import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class509 implements class297 {

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "Lwq;")
    private class152 field6977;

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "[Lqt;")
    private class582[] field6978;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "Lfc;")
    public static class235 field6970 = new class235(99, 7);

    @OriginalMember(owner = "client!jw", name = "m", descriptor = "F")
    public static float field6981 = 0.0F;

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "Lmaa;")
    public static class433 field6972 = new class433("", 17);

    @OriginalMember(owner = "client!jw", name = "n", descriptor = "F")
    public static float field6982;

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
    public static int field6971;

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!jw", name = "l", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!jw", name = "o", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "Loa;")
    private class638 field6973;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "Z")
    private boolean field6969;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)V", line = 3)
    public static final void method2831(byte arg0) {
        if (class687.field9665 != -1) {
            class20.method102(-1, false, class687.field9665, 17143, -1);
            class687.field9665 = -1;
        }
        if (arg0 > 45) {
            field6975++;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)I", line = 19)
    public final int method1854(byte arg0) {
        field6983++;
        if (arg0 >= -68) {
            this.field6977 = null;
        }
        int var2 = 0;
        class582[] var3 = this.field6978;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class582 var5 = var3[var4];
            if (var5 == null || var5.method104((byte) 112)) {
                var2++;
            }
        }
        return var2 * 100 / this.field6978.length;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)Z", line = 47)
    public final boolean method1855(int arg0) {
        field6971++;
        if (arg0 == 20709) {
            return class514.field7031 >= this.field6977.field2273;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IZ)V", line = 58)
    public final void method1853(int arg0, boolean arg1) {
        boolean var3 = true;
        field6979++;
        class582[] var4 = this.field6978;
        int var5 = 0;
        if (arg0 != -1472) {
            this.method1856(88);
        }
        while (var4.length > var5) {
            class582 var6 = var4[var5];
            if (var6 != null) {
                var6.method109(8444, var3 || this.field6969);
            }
            var5++;
        }
        this.field6969 = false;
    }

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "(B)V", line = 84)
    public static void method2832(byte arg0) {
        field6970 = null;
        if (arg0 < 81) {
            field6982 = 0.9748448F;
        }
        field6972 = null;
    }

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "(I)V", line = 101)
    public final void method1857(int arg0) {
        if (arg0 > -123) {
            this.method1853(83, true);
        }
        field6974++;
        if (class630.field8790 != this.field6973) {
            this.field6973 = class630.field8790;
            this.field6969 = true;
        }
        this.field6973.method310(0);
        class582[] var2 = this.field6978;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class582 var4 = var2[var3];
            if (var4 != null) {
                var4.method108(-86);
            }
        }
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(I)V", line = 133)
    public final void method1856(int arg0) {
        if (arg0 == 18259) {
            field6976++;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(III)V", line = 152)
    public static final void method2833(int arg0, int arg1, int arg2) {
        boolean var3 = class658.field9266[0][arg1][arg2] != null && class658.field9266[0][arg1][arg2].field6745 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class658.field9266[var4][arg1][arg2] == null) {
                class486 var5 = class658.field9266[var4][arg1][arg2] = new class486(var4, arg1, arg2);
                if (var3) {
                    var5.field6737++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "(B)Ljd;", line = 173)
    public static final class209 method2834(byte arg0) {
        field6980++;
        if (class148.field2193 == null || class441.field6208 == null) {
            return null;
        }
        for (class209 var1 = (class209) class441.field6208.method2524(20017); var1 != null; var1 = (class209) class441.field6208.method2524(20017)) {
            class307 var2 = class148.field2180.method2872((byte) 125, var1.field3086);
            if (var2 != null && var2.field4545 && var2.method1883(-1, class148.field2179)) {
                return var1;
            }
        }
        if (arg0 != 102) {
            method2831((byte) 98);
        }
        return null;
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Lwq;Lmk;)V", line = 208)
    public class509(class152 arg0, class51 arg1) {
        this.field6977 = arg0;
        this.field6978 = new class582[this.field6977.field2272.length];
        for (int var3 = 0; var3 < this.field6978.length; var3++) {
            this.field6978[var3] = arg1.method368(this.field6977.field2272[var3], -1);
        }
    }
}
