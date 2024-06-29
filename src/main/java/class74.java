import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class74 {

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Lug;")
    private class200 field1238 = new class200();

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lmc;")
    private class197 field1255 = new class197();

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    private int field1251;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Lbg;")
    private class237 field1253;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Loa;")
    public static class99 field1234 = class221.method1463(2844, "Chargement en cours)3 Veuillez patienter)3");

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field1243 = 50;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "[Loa;")
    public static class99[] field1247 = new class99[field1243];

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "[I")
    public static int[] field1241 = new int[field1243];

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Loa;")
    private static class99 field1250 = class221.method1463(2844, "scroll:");

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "[I")
    public static int[] field1242 = new int[field1243];

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "[I")
    public static int[] field1244 = new int[field1243];

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Loa;")
    public static class99 field1237 = field1250;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "[I")
    public static int[] field1240 = new int[field1243];

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "[I")
    public static int[] field1235 = new int[field1243];

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "[I")
    public static int[] field1245 = new int[field1243];

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field1246 = 0;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "[I")
    public static int[] field1254 = new int[field1243];

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Loa;")
    public static class99 field1257 = field1250;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "Z")
    public static boolean field1258 = false;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "[[Z")
    public static boolean[][] field1252;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Lhk;")
    public final class125 method509(int arg0) {
        field1248++;
        return arg0 == 50 ? this.field1253.method1552(102) : null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method510(byte arg0) {
        field1244 = null;
        field1247 = null;
        field1235 = null;
        field1237 = null;
        field1242 = null;
        field1250 = null;
        field1254 = null;
        field1240 = null;
        if (arg0 < 78) {
            field1241 = null;
        }
        field1245 = null;
        field1241 = null;
        field1234 = null;
        field1252 = null;
        field1257 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILug;J)V")
    public final void method511(int arg0, class200 arg1, long arg2) {
        if (this.field1251 == 0) {
            class200 var5 = this.field1255.method1329((byte) 52);
            var5.method828((byte) -77);
            var5.method1346(-123);
            if (this.field1238 == var5) {
                class200 var6 = this.field1255.method1329((byte) 52);
                var6.method828((byte) -9);
                var6.method1346(121);
            }
        } else {
            this.field1251--;
        }
        field1233++;
        int var7 = 7 / ((arg0 + 72) / 48);
        this.field1253.method1544((byte) -70, arg2, arg1);
        this.field1255.method1323(-27664, arg1);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BJ)Lug;")
    public final class200 method512(byte arg0, long arg1) {
        class200 var4 = (class200) this.field1253.method1550(true, arg1);
        if (arg0 < 12) {
            this.method509(-77);
        }
        if (var4 != null) {
            this.field1255.method1323(-27664, var4);
        }
        field1239++;
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public final void method513(boolean arg0) {
        field1249++;
        this.field1255.method1322(false);
        this.field1253.method1551((byte) 14);
        this.field1238 = new class200();
        if (arg0) {
            this.field1251 = this.field1256;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)Lhk;")
    public final class125 method514(byte arg0) {
        field1236++;
        int var2 = -53 % ((-arg0 - 52) / 40);
        return this.field1253.method1549(107);
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I)V")
    public class74(int arg0) {
        this.field1251 = arg0;
        int var2 = 1;
        this.field1256 = arg0;
        while (var2 + var2 < arg0) {
            var2 += var2;
        }
        this.field1253 = new class237(var2);
    }
}
