import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class280 {

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field4739 = 0;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Lel;")
    public static class218 field4746 = new class218();

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "[I")
    public static int[] field4747 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "[[Lwh;")
    public static class56[][] field4749;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 6)
    public static void method1895(int arg0) {
        field4749 = (class56[][]) null;
        field4746 = null;
        if (arg0 != 1) {
            method1897(-91, -87, -41);
        }
        field4747 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lkb;IIIZ)V", line = 18)
    public void method1026(class280 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4742++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBI[Lma;)Lma;", line = 26)
    public static final class5 method1896(int arg0, byte arg1, int arg2, class5[] arg3) {
        field4738++;
        int var4 = 0;
        if (arg1 != 120) {
            method1896(-48, (byte) 124, -19, (class5[]) null);
        }
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg3[arg0 + var5] == null) {
                arg3[arg0 + var5] = class235.field3886;
            }
            var4 += arg3[arg0 + var5].field72;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg2; var8++) {
            class5 var9 = arg3[arg0 + var8];
            class42.method296(var9.field57, 0, var6, var7, var9.field72);
            var7 += var9.field72;
        }
        class5 var10 = new class5();
        var10.field72 = var4;
        var10.field57 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V", line = 72)
    public static final void method1897(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class168.field2570; var3++) {
            for (int var4 = 0; var4 < class115.field1721; var4++) {
                for (int var5 = 0; var5 < class179.field2708; var5++) {
                    class198 var6 = class43.field646[var3][var4][var5];
                    if (var6 != null) {
                        class89 var7 = var6.field3149;
                        if (var7 != null && var7.field1337.method1059()) {
                            class297.method2009(var7.field1337, var3, var4, var5, 1, 1);
                            if (var7.field1326 != null && var7.field1326.method1059()) {
                                class297.method2009(var7.field1326, var3, var4, var5, 1, 1);
                                var7.field1337.method1026(var7.field1326, 0, 0, 0, false);
                                var7.field1326 = var7.field1326.method1030(arg0, arg1, arg2);
                            }
                            var7.field1337 = var7.field1337.method1030(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3162; var8++) {
                            class107 var9 = var6.field3166[var8];
                            if (var9 != null && var9.field1589.method1059()) {
                                class297.method2009(var9.field1589, var3, var4, var5, var9.field1587 + 1 - var9.field1597, var9.field1598 - var9.field1595 + 1);
                                var9.field1589 = var9.field1589.method1030(arg0, arg1, arg2);
                            }
                        }
                        class51 var10 = var6.field3158;
                        if (var10 != null && var10.field809.method1059()) {
                            class278.method1888(var10.field809, var3, var4, var5);
                            var10.field809 = var10.field809.method1030(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V", line = 149)
    public void method492(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -23 % ((arg2 - 61) / 56);
        field4736++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()Z", line = 157)
    public boolean method1059() {
        field4744++;
        return false;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lma;I)I", line = 171)
    public static final int method1898(class5 arg0, int arg1) {
        field4743++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class275.field4698; var2++) {
            if (arg0.method29(61, class244.field4048[var2])) {
                return var2;
            }
        }
        if (arg1 >= -84) {
            field4748 = 29;
        }
        return -1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)I", line = 197)
    public static final int method1899(int arg0, int arg1) {
        if (arg0 != -10995) {
            field4739 = 80;
        }
        field4745++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(III)Lkb;", line = 224)
    public class280 method1030(int arg0, int arg1, int arg2) {
        field4740++;
        return this;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()I")
    public abstract int method248();
}
