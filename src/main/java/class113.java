import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ma")
public class class113 {

    @OriginalMember(owner = "ma", name = "n", descriptor = "I")
    private int field2245 = -1;

    @OriginalMember(owner = "ma", name = "o", descriptor = "I")
    private int field2246 = 0;

    @OriginalMember(owner = "ma", name = "c", descriptor = "Ltf;")
    private class181 field2234 = new class181();

    @OriginalMember(owner = "ma", name = "v", descriptor = "Z")
    public boolean field2253 = false;

    @OriginalMember(owner = "ma", name = "k", descriptor = "[[I")
    private int[][] field2242;

    @OriginalMember(owner = "ma", name = "p", descriptor = "[Lhd;")
    private class73[] field2247;

    @OriginalMember(owner = "ma", name = "i", descriptor = "I")
    private int field2240;

    @OriginalMember(owner = "ma", name = "u", descriptor = "I")
    private int field2252;

    @OriginalMember(owner = "ma", name = "h", descriptor = "I")
    public static int field2239 = 0;

    @OriginalMember(owner = "ma", name = "g", descriptor = "Llf;")
    private static class109 field2238 = class35.method275("shake:", 2);

    @OriginalMember(owner = "ma", name = "d", descriptor = "Llf;")
    public static class109 field2235 = field2238;

    @OriginalMember(owner = "ma", name = "l", descriptor = "Llf;")
    public static class109 field2243 = field2238;

    @OriginalMember(owner = "ma", name = "e", descriptor = "Leh;")
    public static class49 field2236 = new class49(8);

    @OriginalMember(owner = "ma", name = "r", descriptor = "Llf;")
    public static class109 field2249 = class35.method275("Wordpack geladen)3", 2);

    @OriginalMember(owner = "ma", name = "t", descriptor = "Llf;")
    private static class109 field2251 = class35.method275("Please contact customer support)3", 2);

    @OriginalMember(owner = "ma", name = "s", descriptor = "Llf;")
    public static class109 field2250 = field2251;

    @OriginalMember(owner = "ma", name = "a", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "ma", name = "b", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "ma", name = "f", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "ma", name = "j", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "ma", name = "m", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "ma", name = "q", descriptor = "Laa;")
    public static class2 field2248;

    @OriginalMember(owner = "ma", name = "a", descriptor = "(B)[[I")
    public final int[][] method833(byte arg0) {
        field2237++;
        if (this.field2252 != this.field2240) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field2252; var2++) {
            this.field2247[var2] = class104.field2053;
        }
        if (arg0 > -18) {
            this.field2252 = -111;
        }
        return this.field2242;
    }

    @OriginalMember(owner = "ma", name = "a", descriptor = "(BLvg;)Z")
    public static final boolean method834(byte arg0, class200 arg1) {
        int var2 = -127 / ((-arg0 - 76) / 45);
        field2233++;
        if (class158.field2973) {
            if (class126.method918(arg1, 110) != 0) {
                return false;
            }
            if (arg1.field3875 == 0) {
                return false;
            }
        }
        return arg1.field3842;
    }

    @OriginalMember(owner = "ma", name = "a", descriptor = "(II)[I")
    public final int[] method835(int arg0, int arg1) {
        field2232++;
        if (arg0 != -314) {
            return null;
        } else if (this.field2252 == this.field2240) {
            this.field2253 = this.field2247[arg1] == null;
            this.field2247[arg1] = class104.field2053;
            return this.field2242[arg1];
        } else if (this.field2252 == 1) {
            this.field2253 = this.field2245 != arg1;
            this.field2245 = arg1;
            return this.field2242[0];
        } else {
            class73 var3 = this.field2247[arg1];
            if (this.field2253 = var3 == null) {
                if (this.field2252 > this.field2246) {
                    var3 = new class73(arg1, this.field2246);
                    this.field2246++;
                } else {
                    class73 var4 = (class73) this.field2234.method1226(arg0 ^ 0xFFFFFEBF);
                    var3 = new class73(arg1, var4.field1407);
                    this.field2247[var4.field1411] = null;
                    var4.method452(true);
                }
                this.field2247[arg1] = var3;
            }
            this.field2234.method1227(var3, (byte) -69);
            return this.field2242[var3.field1407];
        }
    }

    @OriginalMember(owner = "ma", name = "a", descriptor = "(I)V")
    public static void method836(int arg0) {
        field2248 = null;
        field2238 = null;
        field2250 = null;
        if (arg0 != 2) {
            field2235 = null;
        }
        field2243 = null;
        field2249 = null;
        field2236 = null;
        field2235 = null;
        field2251 = null;
    }

    @OriginalMember(owner = "ma", name = "b", descriptor = "(I)V")
    public final void method837(int arg0) {
        field2244++;
        for (int var2 = 0; var2 < this.field2252; var2++) {
            this.field2242[var2] = null;
        }
        this.field2247 = null;
        if (arg0 < 11) {
            this.method833((byte) -76);
        }
        this.field2242 = null;
        this.field2234.method1237(-15004);
        this.field2234 = null;
    }

    @OriginalMember(owner = "ma", name = "a", descriptor = "(Lvg;B)Z")
    public static final boolean method838(class200 arg0, byte arg1) {
        field2241++;
        int var2 = arg0.field3916;
        if (var2 == 205) {
            class13.field193 = 250;
            return true;
        } else if (arg1 == -59) {
            if (var2 >= 300 && var2 <= 313) {
                int var3 = var2 & 0x1;
                int var4 = (var2 - 300) / 2;
                class144.field2773.method103(var4, arg1 + 170, var3 == 1);
            }
            if (var2 >= 314 && var2 <= 323) {
                int var5 = (var2 - 314) / 2;
                int var6 = var2 & 0x1;
                class144.field2773.method109(-114, var5, var6 == 1);
            }
            if (var2 == 324) {
                class144.field2773.method115(false, (byte) 1);
            }
            if (var2 == 325) {
                class144.field2773.method115(true, (byte) -85);
            }
            if (var2 == 326) {
                class200.field3850.method1339((byte) 105, 253);
                class34.field759++;
                class144.field2773.method110(arg1 - 41, class200.field3850);
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ma", name = "<init>", descriptor = "(III)V")
    public class113(int arg0, int arg1, int arg2) {
        this.field2242 = new int[arg0][arg2];
        this.field2247 = new class73[arg1];
        this.field2240 = arg1;
        this.field2252 = arg0;
    }
}
