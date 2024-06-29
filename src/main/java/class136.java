import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class136 extends class170 {

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "Lsc;")
    private class181 field2214 = class9.field172;

    @OriginalMember(owner = "client!tj", name = "Z", descriptor = "Lsc;")
    private static class181 field2225 = class149.method967(255, "wave2:");

    @OriginalMember(owner = "client!tj", name = "Y", descriptor = "Lsc;")
    public static class181 field2224 = field2225;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "Lsc;")
    public static class181 field2216 = field2225;

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "Lak;")
    public static class152 field2217 = new class152(64);

    @OriginalMember(owner = "client!tj", name = "hb", descriptor = "Lsc;")
    public static class181 field2233 = class149.method967(255, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    private int field2212;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!tj", name = "U", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!tj", name = "V", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!tj", name = "W", descriptor = "I")
    public int field2222;

    @OriginalMember(owner = "client!tj", name = "ab", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!tj", name = "bb", descriptor = "I")
    public int field2227;

    @OriginalMember(owner = "client!tj", name = "db", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!tj", name = "eb", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!tj", name = "fb", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!tj", name = "gb", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!tj", name = "X", descriptor = "Lhd;")
    private class214 field2223;

    @OriginalMember(owner = "client!tj", name = "cb", descriptor = "Lhd;")
    private class214 field2228;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V")
    private final void method870(int arg0) {
        this.field2228 = new class214(this.field2223.method1419((byte) -128));
        field2231++;
        class199 var2 = (class199) this.field2223.method1418(0);
        if (arg0 != -7) {
            return;
        }
        while (var2 != null) {
            class149 var3 = new class149(var2.field3453, (int) var2.field606);
            this.field2228.method1422(var2.field3453.method1241(0), var3, -1);
            var2 = (class199) this.field2223.method1421(false);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLsc;)Z")
    public final boolean method871(byte arg0, class181 arg1) {
        field2220++;
        if (this.field2223 == null) {
            return false;
        }
        if (this.field2228 == null) {
            this.method870(-7);
        }
        if (arg0 != 56) {
            this.field2223 = null;
        }
        for (class149 var3 = (class149) this.field2228.method1424(true, arg1.method1241(0)); var3 != null; var3 = (class149) this.field2228.method1423(false)) {
            if (var3.field2492.method1202(arg1, -4557)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)I")
    public final int method872(boolean arg0, int arg1) {
        field2229++;
        if (arg0) {
            this.field2227 = 88;
        }
        if (this.field2223 == null) {
            return this.field2212;
        } else {
            class124 var3 = (class124) this.field2223.method1424(true, (long) arg1);
            return var3 == null ? this.field2212 : var3.field2029;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(Z)V")
    public static void method873(boolean arg0) {
        field2225 = null;
        if (arg0) {
            method881(79);
        }
        field2217 = null;
        field2233 = null;
        field2216 = null;
        field2224 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)Lsc;")
    public final class181 method874(byte arg0, int arg1) {
        if (arg0 < 2) {
            this.method877(-37);
        }
        field2226++;
        if (this.field2223 == null) {
            return this.field2214;
        } else {
            class199 var3 = (class199) this.field2223.method1424(true, (long) arg1);
            return var3 == null ? this.field2214 : var3.field3453;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lvf;I)V")
    public final void method875(class230 arg0, int arg1) {
        field2218++;
        if (arg1 != 1001) {
            return;
        }
        while (true) {
            int var3 = arg0.method1516((byte) 82);
            if (var3 == 0) {
                return;
            }
            this.method880(arg0, var3, (byte) -37);
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)Z")
    public static final boolean method876(int arg0, int arg1) {
        field2230++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class172.field2873[arg1];
        if (arg0 != 2000) {
            field2225 = null;
        }
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1001;
    }

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "(I)V")
    private final void method877(int arg0) {
        this.field2228 = new class214(this.field2223.method1419((byte) 78));
        field2219++;
        if (arg0 <= 114) {
            field2217 = null;
        }
        for (class124 var2 = (class124) this.field2223.method1418(0); var2 != null; var2 = (class124) this.field2223.method1421(false)) {
            class124 var3 = new class124((int) var2.field606);
            this.field2228.method1422((long) var2.field2029, var3, -1);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)Z")
    public final boolean method878(int arg0, boolean arg1) {
        field2232++;
        if (this.field2223 == null) {
            return false;
        }
        if (this.field2228 == null) {
            this.method877(124);
        }
        if (arg1) {
            field2217 = null;
        }
        class124 var3 = (class124) this.field2228.method1424(true, (long) arg0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLjava/util/Random;I)I")
    public static final int method879(byte arg0, Random arg1, int arg2) {
        field2215++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class73.method513(981218288, arg2)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else if (arg0 >= -111) {
            return 98;
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class32.method256((byte) 90, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lvf;IB)V")
    private final void method880(class230 arg0, int arg1, byte arg2) {
        if (arg2 != -37) {
            this.method878(-29, true);
        }
        if (arg1 == 1) {
            this.field2222 = arg0.method1516((byte) 82);
        } else if (arg1 == 2) {
            this.field2227 = arg0.method1516((byte) 82);
        } else if (arg1 == 3) {
            this.field2214 = arg0.method1549(arg2 + 55);
        } else if (arg1 == 4) {
            this.field2212 = arg0.method1529(-32494);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method1535(2);
            this.field2223 = new class214(class264.method1789(-74, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1529(-32494);
                class41 var7;
                if (arg1 == 5) {
                    var7 = new class199(arg0.method1549(120));
                } else {
                    var7 = new class124(arg0.method1529(arg2 ^ 0x7EC9));
                }
                this.field2223.method1422((long) var6, var7, -1);
            }
        }
        field2213++;
    }

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)V")
    public static final void method881(int arg0) {
        if (arg0 == 2000) {
            field2221++;
            class146.field2390.method1790(0);
        }
    }
}
