import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class50 {

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field633 = 0;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Lme;")
    public static class177 field634 = new class177();

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Ljf;")
    public static class216 field636 = new class216(64);

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Ljava/lang/String;")
    public static String field638 = "Hidden";

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[[B")
    public static byte[][] field631;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)I")
    public abstract int method256(boolean arg0, int arg1);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
    public abstract void method265(int arg0, int arg1);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BZLjava/lang/String;Lvl;)Lai;")
    public static final class118 method308(byte arg0, boolean arg1, String arg2, class73 arg3) {
        field637++;
        int var4 = arg3.method498(0, arg2);
        if (var4 == -1) {
            return new class118(0);
        }
        int[] var5 = arg3.method480(0, var4);
        class118 var6 = new class118(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field1698 > var7) {
                class170 var9 = new class170(arg3.method501(-2, var5[var8++], var4));
                int var10 = var9.method1190(6345);
                int var11 = var9.method1186((byte) -35);
                int var12 = var9.method1218(102);
                if (!arg1 && var12 == 1) {
                    var6.field1698--;
                } else {
                    var6.field1700[var7] = var10;
                    var6.field1711[var7] = new class138();
                    var6.field1711[var7].field1987 = var11;
                    var7++;
                }
            }
            if (arg0 > -74) {
                field633 = 35;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method309(int arg0) {
        field634 = null;
        if (arg0 == 64) {
            field638 = null;
            field636 = null;
            field631 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)[B")
    public abstract byte[] method255(int arg0, int arg1);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Lie;")
    public abstract class80 method261(byte arg0);

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)Lue;")
    public static final class14 method310(int arg0, int arg1) {
        field635++;
        class14 var2 = (class14) class214.field3335.method707((long) arg0, (byte) 104);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class56.field818.method501(-2, arg0, arg1);
        class14 var4 = new class14();
        if (var3 != null) {
            var4.method87(new class170(var3), (byte) -23);
        }
        class214.field3335.method712(false, var4, (long) arg0);
        return var4;
    }
}
