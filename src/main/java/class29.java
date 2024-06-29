import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class29 {

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Z")
    public boolean field472 = false;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "Z")
    public static boolean field474 = true;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field473 = new String[1000];

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "Z")
    public static boolean field476 = false;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "Lik;")
    public static class259 field477 = new class259(64);

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Lja;")
    public static class64 field467;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "[[[I")
    public static int[][][] field475;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILpe;I)V", line = 8)
    private final void method191(int arg0, int arg1, class101 arg2, int arg3) {
        if (arg0 == 1) {
            this.field468 = arg2.method731(false);
        } else if (arg0 == 2) {
            this.field471 = arg2.method776(-1574267376);
        } else if (arg0 == 3) {
            this.field472 = true;
        } else if (arg0 == 4) {
            this.field468 = -1;
        }
        if (arg3 < 30) {
            field475 = (int[][][]) ((int[][][]) null);
        }
        field469++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()V", line = 36)
    public static final void method192() {
        if (class157.field2500 != null) {
            for (int var0 = 0; var0 < class157.field2500.length; var0++) {
                for (int var1 = 0; var1 < class323.field5009; var1++) {
                    for (int var2 = 0; var2 < class196.field3122; var2++) {
                        class157.field2500[var0][var1][var2] = null;
                    }
                }
            }
        }
        class251.field3864 = (class186[][]) null;
        if (class115.field1885 != null) {
            for (int var3 = 0; var3 < class115.field1885.length; var3++) {
                for (int var4 = 0; var4 < class323.field5009; var4++) {
                    for (int var5 = 0; var5 < class196.field3122; var5++) {
                        class115.field1885[var3][var4][var5] = null;
                    }
                }
            }
        }
        class236.field3706 = (class186[][]) null;
        class159.field2508 = 0;
        if (class311.field4891 != null) {
            for (int var6 = 0; var6 < class159.field2508; var6++) {
                class311.field4891[var6] = null;
            }
        }
        if (class63.field979 != null) {
            for (int var7 = 0; var7 < class104.field1764; var7++) {
                class63.field979[var7] = null;
            }
            class104.field1764 = 0;
        }
        if (class248.field3840 != null) {
            for (int var8 = 0; var8 < class248.field3840.length; var8++) {
                class248.field3840[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)I", line = 140)
    public static int method193(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)Lnb;", line = 149)
    public final class315 method194(int arg0, int arg1) {
        field470++;
        class315 var3 = (class315) class13.field242.method1830((long) (this.field468 | arg1 << 16), (byte) 52);
        if (var3 != null) {
            return var3;
        }
        class282.field4357.method489(this.field468, arg0 + 8490);
        if (arg0 != -8490) {
            this.field468 = 0;
        }
        class315 var4 = class118.method871(class282.field4357, (byte) 100, 0, this.field468);
        if (var4 != null) {
            var4.method2166(class213.field3389, class149.field2401, class152.field2450);
            var4.field4263 = var4.field4264;
            var4.field4266 = var4.field4256;
            for (int var5 = 0; var5 < arg1; var5++) {
                var4.method2174();
            }
            class13.field242.method1831((long) (arg1 << 16 | this.field468), var4, arg0 ^ 0x1761);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILpe;B)V", line = 202)
    public final void method195(int arg0, class101 arg1, byte arg2) {
        while (true) {
            int var4 = arg1.method741(125);
            if (var4 == 0) {
                if (arg2 > -69) {
                    return;
                }
                field466++;
                return;
            }
            this.method191(var4, arg0, arg1, 70);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 226)
    public static void method196(int arg0) {
        field477 = null;
        field475 = (int[][][]) null;
        int var1 = -119 / ((arg0 + 72) / 34);
        field473 = null;
        field467 = null;
    }
}
