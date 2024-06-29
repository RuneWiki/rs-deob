import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class12 extends class97 {

    @OriginalMember(owner = "client!be", name = "S", descriptor = "[I")
    private int[] field224 = new int[6];

    @OriginalMember(owner = "client!be", name = "X", descriptor = "[I")
    private int[] field229 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!be", name = "W", descriptor = "[I")
    private int[] field228 = new int[6];

    @OriginalMember(owner = "client!be", name = "kb", descriptor = "Z")
    public boolean field242 = false;

    @OriginalMember(owner = "client!be", name = "lb", descriptor = "I")
    public int field243 = -1;

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "Lke;")
    public static class65 field230 = class1.method17("leuchten2:", -115);

    @OriginalMember(owner = "client!be", name = "hb", descriptor = "I")
    public static int field239 = 0;

    @OriginalMember(owner = "client!be", name = "gb", descriptor = "Lke;")
    public static class65 field238 = class1.method17("@or3@", -120);

    @OriginalMember(owner = "client!be", name = "db", descriptor = "Lke;")
    public static class65 field235 = class1.method17("mod_icons", -119);

    @OriginalMember(owner = "client!be", name = "cb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field234 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!be", name = "ob", descriptor = "I")
    public static int field246 = 0;

    @OriginalMember(owner = "client!be", name = "rb", descriptor = "Lke;")
    public static class65 field249 = class1.method17(":", -121);

    @OriginalMember(owner = "client!be", name = "qb", descriptor = "Lke;")
    private static class65 field248 = class1.method17("Loading fonts )2 ", -115);

    @OriginalMember(owner = "client!be", name = "ub", descriptor = "I")
    public static int field252 = 0;

    @OriginalMember(owner = "client!be", name = "sb", descriptor = "Lke;")
    public static class65 field250 = class1.method17("Lade Benutzeroberfl-=che )2 ", -114);

    @OriginalMember(owner = "client!be", name = "vb", descriptor = "Z")
    public static boolean field253 = false;

    @OriginalMember(owner = "client!be", name = "tb", descriptor = "I")
    public static int field251 = 0;

    @OriginalMember(owner = "client!be", name = "pb", descriptor = "Lke;")
    public static class65 field247 = field248;

    @OriginalMember(owner = "client!be", name = "yb", descriptor = "Lke;")
    public static class65 field256 = class1.method17("Fehler bei der Verbindung zum Server)3", -112);

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!be", name = "U", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!be", name = "V", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!be", name = "bb", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!be", name = "eb", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!be", name = "fb", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!be", name = "ib", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!be", name = "jb", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!be", name = "xb", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!be", name = "nb", descriptor = "Lr;")
    public static class105 field245;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "[I")
    private int[] field225;

    @OriginalMember(owner = "client!be", name = "wb", descriptor = "[I")
    public static int[] field254;

    @OriginalMember(owner = "client!be", name = "mb", descriptor = "[[B")
    public static byte[][] field244;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)Z", line = 3)
    public final boolean method63(int arg0) {
        field226++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field229[var3] != -1 && !class121.field2985.method484(0, (byte) 120, this.field229[var3])) {
                var2 = false;
            }
        }
        if (arg0 == -4) {
            return var2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)Lga;", line = 33)
    public final class37 method64(boolean arg0) {
        field241++;
        class37[] var2 = new class37[5];
        if (arg0) {
            field239 = -68;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field229[var4] != -1) {
                var2[var3++] = class37.method297(class121.field2985, this.field229[var4], 0);
            }
        }
        class37 var5 = new class37(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field228[var6] != 0; var6++) {
            var5.method291(this.field228[var6], this.field224[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V", line = 83)
    public static void method65(int arg0) {
        field254 = null;
        field247 = null;
        field235 = null;
        field250 = null;
        if (arg0 != 4784) {
            method72(-89, true);
        }
        field248 = null;
        field256 = null;
        field234 = null;
        field249 = null;
        field245 = null;
        field238 = null;
        field230 = null;
        field244 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLg;I)V", line = 110)
    private final void method66(byte arg0, class39 arg1, int arg2) {
        if (arg2 == 1) {
            this.field243 = arg1.method334(arg0 ^ 0xFFFFFFCF);
        } else if (arg2 == 2) {
            int var4 = arg1.method334(arg0 ^ 0xFFFFFFC9);
            this.field225 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field225[var5] = arg1.method326(255);
            }
        } else if (arg2 == 3) {
            this.field242 = true;
        } else if (arg2 >= 40 && arg2 < 50) {
            this.field228[arg2 - 40] = arg1.method326(255);
        } else if (arg2 >= 50 && arg2 < 60) {
            this.field224[arg2 - 50] = arg1.method326(255);
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field229[arg2 - 60] = arg1.method326(255);
        }
        field236++;
        if (arg0 != -71) {
            this.field228 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILg;)V", line = 169)
    public final void method67(int arg0, class39 arg1) {
        field237++;
        if (arg0 != -60) {
            return;
        }
        while (true) {
            int var3 = arg1.method334(106);
            if (var3 == 0) {
                return;
            }
            this.method66((byte) -71, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)V", line = 195)
    public static final void method68(boolean arg0) {
        if (arg0) {
            method65(32);
        }
        class31.field814 = new class53();
        field231++;
    }

    @OriginalMember(owner = "client!be", name = "g", descriptor = "(I)Lga;", line = 208)
    public final class37 method69(int arg0) {
        field223++;
        if (this.field225 == null) {
            return null;
        }
        class37[] var2 = new class37[this.field225.length];
        for (int var3 = arg0; var3 < this.field225.length; var3++) {
            var2[var3] = class37.method297(class121.field2985, this.field225[var3], 0);
        }
        class37 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class37(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field228[var5] != 0; var5++) {
            var4.method291(this.field228[var5], this.field224[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "h", descriptor = "(I)V", line = 248)
    public static final void method70(int arg0) {
        class10.field219.method834(5875);
        if (arg0 < -123) {
            field232++;
        }
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(B)Z", line = 312)
    public final boolean method71(byte arg0) {
        field233++;
        if (this.field225 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 <= 100) {
            this.method71((byte) -83);
        }
        for (int var3 = 0; var3 < this.field225.length; var3++) {
            if (!class121.field2985.method484(0, (byte) 123, this.field225[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)V", line = 348)
    public static final void method72(int arg0, boolean arg1) {
        field227++;
        if (arg0 > -21) {
            field239 = 75;
        }
        for (int var2 = 0; var2 < class113.field2818; var2++) {
            class129 var3 = class31.field817[class56.field1464[var2]];
            int var4 = (class56.field1464[var2] << 14) + 536870912;
            if (var3 != null && var3.method363(0) && var3.field3126.field1430 == arg1 && var3.field3126.method448(0)) {
                int var5 = var3.field1067 >> 7;
                int var6 = var3.field1070 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field1069 == 1 && (var3.field1067 & 0x7F) == 64 && (var3.field1070 & 0x7F) == 64) {
                        if (class46.field1216[var5][var6] == class112.field2775) {
                            continue;
                        }
                        class46.field1216[var5][var6] = class112.field2775;
                    }
                    if (!var3.field3126.field1423) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class89.field2377.method599(class19.field462, var3.field1067, var3.field1070, class58.method495((var3.field1069 - 1) * 64 + var3.field1070, (var3.field1069 + -1) * 64 + var3.field1067, true, class19.field462), var3.field1069 * 64 + 60 - 64, var3, var3.field1081, var4, var3.field1050);
                }
            }
        }
    }
}
