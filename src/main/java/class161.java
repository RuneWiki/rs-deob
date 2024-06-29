import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class161 {

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    private int field2216 = 0;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    private int field2215 = -1;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "Lat;")
    private class412 field2223 = new class412();

    @OriginalMember(owner = "client!to", name = "o", descriptor = "Z")
    public boolean field2227 = false;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    private int field2217;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    private int field2225;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "[Lic;")
    private class255[] field2219;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "[[[I")
    private int[][][] field2213;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "[I")
    public static int[] field2218 = new int[2048];

    @OriginalMember(owner = "client!to", name = "i", descriptor = "Lj;")
    public static class240 field2221 = new class240(1, 7);

    @OriginalMember(owner = "client!to", name = "l", descriptor = "Lsh;")
    public static class472 field2224 = new class472(92, 6);

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public static int field2228 = 0;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)[[I")
    public final int[][] method1090(int arg0, int arg1) {
        if (arg0 != -2) {
            this.field2223 = null;
        }
        field2214++;
        if (this.field2225 == this.field2217) {
            this.field2227 = this.field2219[arg1] == null;
            this.field2219[arg1] = class28.field376;
            return this.field2213[arg1];
        } else if (this.field2217 == 1) {
            this.field2227 = this.field2215 != arg1;
            this.field2215 = arg1;
            return this.field2213[0];
        } else {
            class255 var3 = this.field2219[arg1];
            if (var3 == null) {
                this.field2227 = true;
                if (this.field2217 > this.field2216) {
                    var3 = new class255(arg1, this.field2216);
                    this.field2216++;
                } else {
                    class255 var4 = (class255) this.field2223.method2454((byte) 123);
                    var3 = new class255(arg1, var4.field3787);
                    this.field2219[var4.field3789] = null;
                    var4.method283(2);
                }
                this.field2219[arg1] = var3;
            } else {
                this.field2227 = false;
            }
            this.field2223.method2465((byte) 108, var3);
            return this.field2213[var3.field3787];
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method1091(int arg0) {
        field2222++;
        if (arg0 != 6) {
            this.method1093(22);
        }
        if (this.field2225 != this.field2217) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field2217; var2++) {
            this.field2219[var2] = class28.field376;
        }
        return this.field2213;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
    public static void method1092(int arg0) {
        field2221 = null;
        field2218 = null;
        field2224 = null;
        if (arg0 != 16145) {
            method1092(14);
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V")
    public final void method1093(int arg0) {
        field2220++;
        for (int var2 = 0; var2 < this.field2217; var2++) {
            this.field2213[var2][0] = null;
            this.field2213[var2][1] = null;
            this.field2213[var2][2] = null;
            this.field2213[var2] = null;
        }
        if (arg0 != -17395) {
            this.field2216 = -119;
        }
        this.field2213 = null;
        this.field2219 = null;
        this.field2223.method2459(300);
        this.field2223 = null;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(II)Z")
    public static final boolean method1094(int arg0, int arg1) {
        if (arg0 != 2007241424) {
            method1092(-123);
        }
        field2226++;
        if (class225.field3265[arg1]) {
            return true;
        } else if (class134.field1945.method2670(arg1, (byte) 49)) {
            int var2 = class134.field1945.method2662(arg1, (byte) -7);
            if (var2 == 0) {
                class225.field3265[arg1] = true;
                return true;
            }
            if (class467.field6572[arg1] == null) {
                class467.field6572[arg1] = new class178[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class467.field6572[arg1][var3] == null) {
                    byte[] var4 = class134.field1945.method2691(var3, arg1, 0);
                    if (var4 != null) {
                        class178 var5 = class467.field6572[arg1][var3] = new class178();
                        var5.field2631 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method1238(128, new class446(var4));
                    }
                }
            }
            class225.field3265[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(III)V")
    public class161(int arg0, int arg1, int arg2) {
        this.field2217 = arg0;
        this.field2225 = arg1;
        this.field2219 = new class255[this.field2225];
        this.field2213 = new int[this.field2217][3][arg2];
    }
}
