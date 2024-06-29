import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class197 extends class71 {

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public int field3222 = 0;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "Ljava/lang/String;")
    public static String field3230 = "flash3:";

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public int field3225;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public int field3227;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public int field3228;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public int field3229;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public int field3236;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    public int field3238;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public int field3239;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public int field3241;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public int field3243;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "Lkl;")
    public class141 field3223;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "Lkl;")
    public class141 field3232;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "Lch;")
    public class149 field3237;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "Lek;")
    public class196 field3244;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "Lc;")
    public class320 field3234;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "Z")
    public boolean field3231;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "[I")
    public static int[] field3224;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "[I")
    public int[] field3242;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "[[Z")
    public static boolean[][] field3221;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V", line = 26)
    public static void method1441(boolean arg0) {
        field3221 = (boolean[][]) null;
        field3224 = null;
        if (arg0) {
            field3221 = (boolean[][]) ((boolean[][]) null);
        }
        field3230 = null;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 43)
    public final void method1442(int arg0) {
        if (arg0 <= 124) {
            method1441(true);
        }
        field3240++;
        int var2 = this.field3236;
        if (this.field3237 != null) {
            class149 var5 = this.field3237.method1052(true);
            if (var5 == null) {
                this.field3236 = -1;
                this.field3243 = 0;
                this.field3242 = null;
                this.field3241 = 0;
                this.field3235 = 0;
                this.field3227 = 0;
            } else {
                this.field3243 = var5.field2240;
                this.field3241 = var5.field2224 * 128;
                this.field3227 = var5.field2247;
                this.field3236 = var5.field2270;
                this.field3235 = var5.field2287;
                this.field3242 = var5.field2218;
            }
        } else if (this.field3244 != null) {
            int var3 = class113.method780(108, this.field3244);
            if (var2 != var3) {
                this.field3236 = var3;
                class118 var4 = this.field3244.field3210;
                if (var4.field1786 != null) {
                    var4 = var4.method819((byte) -9);
                }
                if (var4 == null) {
                    this.field3235 = this.field3241 = 0;
                } else {
                    this.field3241 = var4.field1763 * 128;
                    this.field3235 = var4.field1788;
                }
            }
        } else if (this.field3234 != null) {
            this.field3236 = class340.method2347((byte) 87, this.field3234);
            this.field3241 = this.field3234.field4991 * 128;
            this.field3235 = this.field3234.field5007;
        }
        if (this.field3236 != var2 && this.field3232 != null) {
            class107.field1622.method739(this.field3232);
            this.field3232 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 124)
    public static final void method1443(int arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field3233++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = var6 + (arg1 ? class325.field5068 : class29.field418);
        if (arg0 != -1) {
            return;
        }
        for (int var8 = var6; var8 < var7; var8++) {
            class280 var9 = class21.method137(var8, (byte) 92);
            if (var9.field4399 && var9.method1976(-1).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class91.field1393 = -1;
                    class103.field1579 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var8;
            }
        }
        class103.field1579 = var4;
        class91.field1393 = var5;
        String[] var12 = new String[class91.field1393];
        class242.field3837 = 0;
        for (int var13 = 0; var13 < class91.field1393; var13++) {
            var12[var13] = class21.method137(var4[var13], (byte) 92).method1976(-1);
        }
        class260.method1862(var12, (byte) 101, class103.field1579);
    }
}
