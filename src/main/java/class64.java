import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class64 implements class183 {

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    private int field1207 = 50;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    private int field1210 = 128;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Lvb;")
    private class197 field1217;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "Lvb;")
    private class197 field1224;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Lnd;")
    private class127 field1219;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Ltg;")
    public static class184 field1203 = class135.method812("Die Verbindung konnte", 3);

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field1212 = 0;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Ltg;")
    private static class184 field1206 = class135.method812("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 3);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Ltg;")
    public static class184 field1200 = class135.method812("(U0a )2 non)2existant gosub script)2num: ", 3);

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "[I")
    public static int[] field1209 = new int[2000];

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "Ltg;")
    public static class184 field1223 = field1206;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "Ltg;")
    public static class184 field1222 = class135.method812("(U0a )2 via: ", 3);

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "[[S")
    public static short[][] field1211;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public final void method358(int arg0) {
        field1214++;
        if (arg0 != 2000) {
            method368(-100);
        }
        this.field1219 = new class127(this.field1207);
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(II)Z")
    public final boolean method359(int arg0, int arg1) {
        if (arg0 <= 23) {
            return true;
        } else {
            field1205++;
            return this.method362((byte) -128, arg1).method120(this, (byte) -108, this.field1224);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)Z")
    public final boolean method360(int arg0, int arg1) {
        field1201++;
        if (arg1 > -65) {
            method368(31);
        }
        return this.method362((byte) -128, arg0).field346;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)[I")
    public final int[] method361(int arg0, int arg1) {
        field1216++;
        if (arg1 != -3892) {
            field1222 = null;
        }
        class97 var3 = new class97(this.field1217.method1249((byte) -92, arg0, 0));
        class18 var4 = new class18(var3);
        return var4.method118(2, this, this.field1210, this.field1224);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)Lbh;")
    private final class18 method362(byte arg0, int arg1) {
        class18 var3 = (class18) this.field1219.method773((long) arg1, 1);
        field1204++;
        if (var3 != null) {
            return var3;
        }
        if (arg0 != -128) {
            field1200 = null;
        }
        byte[] var4 = this.field1217.method1249((byte) -114, arg1, 0);
        if (var4 == null) {
            return class154.method931(true);
        } else {
            class97 var5 = new class97(var4);
            class18 var6 = new class18(var5);
            this.field1219.method776(var6, (long) arg1, (byte) 123);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(FII)[I")
    public final int[] method363(float arg0, int arg1, int arg2) {
        class18 var4 = this.method362((byte) -128, arg2);
        field1213++;
        if (arg1 != -24790) {
            this.method369(-104, 68);
        }
        var4.field347 = true;
        return var4.method117(this.field1210, arg1 ^ 0xFFFFC945, this.field1224, arg0, this);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)Z")
    public final boolean method364(int arg0, boolean arg1) {
        if (arg1) {
            field1222 = null;
        }
        field1208++;
        return this.field1210 == 64 || this.method362((byte) -128, arg0).field329 == 64;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public static void method365(int arg0) {
        field1200 = null;
        field1209 = null;
        field1211 = null;
        field1203 = null;
        if (arg0 <= 76) {
            field1209 = null;
        }
        field1206 = null;
        field1222 = null;
        field1223 = null;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)I")
    public final int method366(int arg0, int arg1) {
        field1220++;
        if (arg1 < 83) {
            this.method359(-6, 38);
        }
        return this.method362((byte) -128, arg0).field341;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(II)Z")
    public final boolean method367(int arg0, int arg1) {
        field1218++;
        if (arg0 != 27094) {
            this.method366(-109, 43);
        }
        return this.method362((byte) -128, arg1).field344;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)Z")
    public static final boolean method368(int arg0) {
        field1215++;
        class38 var1 = class46.field866;
        synchronized (class46.field866) {
            if (class62.field1172 == class138.field2505) {
                return false;
            }
            class3.field58 = class116.field2102[class62.field1172];
            class16.field299 = class187.field3608[class62.field1172];
            if (arg0 == 0) {
                class62.field1172 = class62.field1172 + 1 & 0x7F;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lvb;Lvb;II)V")
    public class64(class197 arg0, class197 arg1, int arg2, int arg3) {
        this.field1207 = arg2;
        this.field1217 = arg0;
        this.field1210 = arg3;
        this.field1224 = arg1;
        this.field1219 = new class127(this.field1207);
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(II)V")
    public final void method369(int arg0, int arg1) {
        if (arg0 <= 101) {
            return;
        }
        field1202++;
        for (class18 var3 = (class18) this.field1219.method769(-21217); var3 != null; var3 = (class18) this.field1219.method775((byte) -112)) {
            if (var3.field347) {
                var3.method121(0, arg1);
                var3.field347 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[BB)I")
    public static final int method370(int arg0, byte[] arg1, byte arg2) {
        field1221++;
        return arg2 == -75 ? class85.method500(0, arg0, 11498, arg1) : 64;
    }
}
