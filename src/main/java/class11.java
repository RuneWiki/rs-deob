import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public abstract class class11 {

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "Lna;")
    public static class26 field105 = class33.method219("Fur Trader", 88);

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "I")
    public static int field108 = 20;

    @OriginalMember(owner = "mapview!fa", name = "i", descriptor = "Lna;")
    public static class26 field111 = class33.method219("floorcol)3dat", 91);

    @OriginalMember(owner = "mapview!fa", name = "h", descriptor = "I")
    public static int field110 = -1;

    @OriginalMember(owner = "mapview!fa", name = "g", descriptor = "Lna;")
    public static class26 field109 = class33.method219("b12_full", 101);

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "Lna;")
    public static class26 field106 = class33.method219("Cookery Shop", 122);

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "[B")
    public static byte[] field107;

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "[Lna;")
    public static class26[] field104;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I)V", line = 6)
    public static void method53(int arg0) {
        field107 = null;
        field109 = null;
        field104 = null;
        if (arg0 > 12) {
            field105 = null;
            field111 = null;
            field106 = null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(III[Lna;)Lna;", line = 32)
    public static final class26 method54(int arg0, int arg1, int arg2, class26[] arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg3[arg0 + var5] == null) {
                arg3[arg0 + var5] = class12.field113;
            }
            var4 += arg3[arg0 + var5].field404;
        }
        byte[] var6 = new byte[var4];
        if (arg1 != -23132) {
            return (class26) null;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg2; var8++) {
            class26 var9 = arg3[arg0 + var8];
            class36.method239(var9.field405, 0, var6, var7, var9.field404);
            var7 += var9.field404;
        }
        class26 var10 = new class26();
        var10.field404 = var4;
        var10.field405 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "(I)[Lea;", line = 77)
    public static final class9[] method55(int arg0) {
        class9[] var1 = new class9[class28.field427];
        for (int var2 = arg0; var2 < class28.field427; var2++) {
            class9 var3 = new class9();
            var3.field88 = class12.field125;
            var3.field84 = class40.field523;
            var3.field87 = class25.field379[var2];
            var3.field91 = class10.field100[var2];
            var3.field86 = class10.field92[var2];
            var3.field89 = class39.field520[var2];
            var3.field85 = class29.field446;
            var3.field90 = class2.field27[var2];
            var1[var2] = var3;
        }
        class6.method34(-14485);
        return var1;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(II[BB)Lna;", line = 108)
    public static final class26 method56(int arg0, int arg1, byte[] arg2, byte arg3) {
        class26 var4 = new class26();
        var4.field404 = 0;
        if (arg3 != 36) {
            return (class26) null;
        }
        var4.field405 = new byte[arg0];
        for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
            if (arg2[var5] != 0) {
                var4.field405[var4.field404++] = arg2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Lp;Lna;Lna;B)[Lq;", line = 140)
    public static final class31[] method57(class29 arg0, class26 arg1, class26 arg2, byte arg3) {
        if (arg3 > -36) {
            return (class31[]) null;
        } else {
            int var4 = arg0.method207(arg2, -19661);
            int var5 = arg0.method201(-1, var4, arg1);
            return class4.method26(var5, var4, arg0, 1855480230);
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "(I)B", line = 183)
    public static final byte method60(int arg0) {
        if (arg0 >= -108) {
            return -123;
        } else if (class34.field491 == null) {
            return 0;
        } else {
            return class34.field491[class6.field65];
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(B)[B")
    public abstract byte[] method58(byte arg0);

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "([BI)V")
    public abstract void method59(byte[] arg0, int arg1);
}
