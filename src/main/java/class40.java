import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class40 extends class216 {

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "Ll;")
    public class57 field653;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "Lbd;")
    public static class162 field650 = class17.method142(0, "(Z");

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "Lbe;")
    public static class235 field651 = new class235(32);

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "Lbd;")
    private static class162 field655 = class17.method142(0, "");

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "Lbd;")
    public static class162 field654 = field655;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "[I")
    public static int[] field646;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(B)V", line = 9)
    public static final void method296(byte arg0) {
        int var1 = class63.field975.method344(2, 8);
        field649++;
        if (class171.field2966 > var1) {
            for (int var2 = var1; var2 < class171.field2966; var2++) {
                class181.field3116[class4.field29++] = class123.field2233[var2];
            }
        }
        if (class171.field2966 < var1) {
            throw new RuntimeException("gppov1");
        }
        if (arg0 < 112) {
            method300((byte) -18);
        }
        class171.field2966 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class123.field2233[var3];
            class39 var5 = class270.field4520[var4];
            int var6 = class63.field975.method344(2, 1);
            if (var6 == 0) {
                class123.field2233[class171.field2966++] = var4;
                var5.field5051 = class90.field1598;
            } else {
                int var7 = class63.field975.method344(2, 2);
                if (var7 == 0) {
                    class123.field2233[class171.field2966++] = var4;
                    var5.field5051 = class90.field1598;
                    class181.field3118[class267.field4446++] = var4;
                } else if (var7 == 1) {
                    class123.field2233[class171.field2966++] = var4;
                    var5.field5051 = class90.field1598;
                    int var8 = class63.field975.method344(2, 3);
                    var5.method2053(var8, false, 0);
                    int var9 = class63.field975.method344(2, 1);
                    if (var9 == 1) {
                        class181.field3118[class267.field4446++] = var4;
                    }
                } else if (var7 == 2) {
                    class123.field2233[class171.field2966++] = var4;
                    var5.field5051 = class90.field1598;
                    int var10 = class63.field975.method344(2, 3);
                    var5.method2053(var10, true, 0);
                    int var11 = class63.field975.method344(2, 3);
                    var5.method2053(var11, true, 0);
                    int var12 = class63.field975.method344(2, 1);
                    if (var12 == 1) {
                        class181.field3118[class267.field4446++] = var4;
                    }
                } else if (var7 == 3) {
                    class181.field3116[class4.field29++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([I[Ljava/lang/Object;I)V", line = 122)
    public static final void method297(int[] arg0, Object[] arg1, int arg2) {
        class127.method1024(-32485, arg0.length - 1, arg1, 0, arg0);
        field647++;
        if (arg2 != -2) {
            method297((int[]) null, (Object[]) null, 59);
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V", line = 134)
    public static void method298(int arg0) {
        if (arg0 != 3924) {
            method296((byte) -119);
        }
        field646 = null;
        field651 = null;
        field655 = null;
        field654 = null;
        field650 = null;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)V", line = 156)
    public static final void method299(int arg0, int arg1) {
        if (arg0 > 17) {
            field648++;
            class63 var2 = class46.method332(3, arg1, -12770);
            var2.method427(-22507);
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)V", line = 172)
    public static final void method300(byte arg0) {
        class185.field3194++;
        field656++;
        if (arg0 <= 11) {
            field650 = (class162) null;
        }
        class187.field3229.method338(52, (byte) 8);
        class187.field3229.method745(0L, (byte) -124);
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Ll;)V", line = 202)
    public class40(class57 arg0) {
        this.field653 = arg0;
    }
}
