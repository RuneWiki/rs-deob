import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class132 {

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    private int field2188 = 0;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public int field2180;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "[Lob;")
    public class134[] field2175;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2171 = "Loading world list data";

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "[I")
    public static int[] field2172 = new int[14];

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2178 = "Face here";

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "[C")
    public static char[] field2187 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "J")
    private long field2185;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Lob;")
    private class134 field2182;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "Lob;")
    private class134 field2189;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2183;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Lob;")
    public final class134 method981(int arg0) {
        field2176++;
        if (arg0 != -1) {
            this.field2185 = 20L;
        }
        if (this.field2188 > 0 && this.field2175[this.field2188 - 1] != this.field2189) {
            class134 var2 = this.field2189;
            this.field2189 = var2.field2209;
            return var2;
        }
        while (this.field2180 > this.field2188) {
            class134 var3 = this.field2175[this.field2188++].field2209;
            if (this.field2175[this.field2188 - 1] != var3) {
                this.field2189 = var3.field2209;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)Lob;")
    public final class134 method982(int arg0) {
        if (arg0 != -9570) {
            this.field2189 = null;
        }
        this.field2188 = 0;
        field2186++;
        return this.method981(-1);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)I")
    public final int method983(byte arg0) {
        field2174++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2180; var3++) {
            class134 var4 = this.field2175[var3];
            class134 var5 = var4.field2209;
            while (var4 != var5) {
                var5 = var5.field2209;
                var2++;
            }
        }
        if (arg0 >= -43) {
            return 47;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)Loh;")
    public static final class184 method984(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1498[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class184 var4 = var3.field2800;
            var3.field2800 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)Lob;")
    public final class134 method985(int arg0) {
        field2184++;
        if (this.field2182 == null) {
            return null;
        }
        class134 var2 = this.field2175[(int) ((long) (this.field2180 - 1) & this.field2185)];
        while (this.field2182 != var2) {
            if (this.field2182.field2213 == this.field2185) {
                class134 var4 = this.field2182;
                this.field2182 = this.field2182.field2209;
                return var4;
            }
            this.field2182 = this.field2182.field2209;
        }
        this.field2182 = null;
        int var3 = -23 / ((arg0 + 14) / 48);
        return null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(JZLob;)V")
    public final void method986(long arg0, boolean arg1, class134 arg2) {
        if (arg2.field2202 != null) {
            arg2.method993(32);
        }
        field2177++;
        if (!arg1) {
            return;
        }
        class134 var5 = this.field2175[(int) ((long) (this.field2180 - 1) & arg0)];
        arg2.field2213 = arg0;
        arg2.field2209 = var5;
        arg2.field2202 = var5.field2202;
        arg2.field2202.field2209 = arg2;
        arg2.field2209.field2202 = arg2;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IJ)Lob;")
    public final class134 method987(int arg0, long arg1) {
        field2173++;
        if (arg0 >= -88) {
            return null;
        }
        this.field2185 = arg1;
        class134 var4 = this.field2175[(int) ((long) (this.field2180 - 1) & arg1)];
        for (this.field2182 = var4.field2209; this.field2182 != var4; this.field2182 = this.field2182.field2209) {
            if (this.field2182.field2213 == arg1) {
                class134 var5 = this.field2182;
                this.field2182 = this.field2182.field2209;
                return var5;
            }
        }
        this.field2182 = null;
        return null;
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)V")
    public static void method988(int arg0) {
        if (arg0 != 8241) {
            field2187 = null;
        }
        field2178 = null;
        field2172 = null;
        field2187 = null;
        field2183 = null;
        field2171 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)I")
    public final int method989(boolean arg0) {
        field2181++;
        if (arg0) {
            field2178 = null;
        }
        return this.field2180;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
    public final void method990(byte arg0) {
        field2190++;
        for (int var2 = 0; var2 < this.field2180; var2++) {
            class134 var3 = this.field2175[var2];
            while (true) {
                class134 var4 = var3.field2209;
                if (var3 == var4) {
                    break;
                }
                var4.method993(32);
            }
        }
        this.field2189 = null;
        this.field2182 = null;
        if (arg0 != 44) {
            this.method987(-97, -1L);
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(I)V")
    public class132(int arg0) {
        this.field2180 = arg0;
        this.field2175 = new class134[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class134 var3 = this.field2175[var2] = new class134();
            var3.field2202 = var3;
            var3.field2209 = var3;
        }
    }
}
