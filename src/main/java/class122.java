import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class122 {

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    private int field2161 = -1;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "I")
    private int field2163 = 0;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Lci;")
    private class60 field2143 = new class60();

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "Z")
    public boolean field2164 = false;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    private int field2152;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    private int field2146;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "[[[I")
    private int[][][] field2150;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "[Lcg;")
    private class247[] field2147;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "[[I")
    public static int[][] field2145 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field2148 = 0;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2142 = "";

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "[Z")
    public static boolean[] field2158 = new boolean[8];

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public static int field2156 = 0;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
    public static int field2160 = 0;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "Z")
    public static boolean field2151;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "[[[B")
    public static byte[][][] field2157;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIZIIIII)V")
    public static final void method831(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class126.field2222 <= arg1 && class118.field2098 >= arg1 && class126.field2222 <= arg0 && arg0 <= class118.field2098 && class126.field2222 <= arg8 && class118.field2098 >= arg8 && arg3 >= class126.field2222 && arg3 <= class118.field2098 && arg2 >= class118.field2094 && arg2 <= class89.field1582 && arg6 >= class118.field2094 && class89.field1582 >= arg6 && arg7 >= class118.field2094 && arg7 <= class89.field1582 && arg5 >= class118.field2094 && arg5 <= class89.field1582) {
            class153.method1048(arg6, arg8, 128, arg5, arg0, arg9, arg3, arg2, arg1, arg7);
        } else {
            class144.method1004(arg2, arg0, arg3, arg7, arg1, arg5, arg9, arg8, arg6, -32436);
        }
        field2155++;
        if (!arg4) {
            field2148 = -66;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V")
    public static void method832(boolean arg0) {
        field2142 = null;
        if (arg0) {
            field2145 = null;
            field2157 = null;
            field2158 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public final void method833(int arg0) {
        field2144++;
        for (int var2 = arg0; var2 < this.field2146; var2++) {
            this.field2150[var2][0] = null;
            this.field2150[var2][1] = null;
            this.field2150[var2][2] = null;
            this.field2150[var2] = null;
        }
        this.field2150 = null;
        this.field2147 = null;
        this.field2143.method377(111);
        this.field2143 = null;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(Z)[[[I")
    public final int[][][] method834(boolean arg0) {
        field2162++;
        if (this.field2152 != this.field2146) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0) {
            method837((class108) null, -125);
        }
        while (var2 < this.field2146) {
            this.field2147[var2] = class145.field2474;
            var2++;
        }
        return this.field2150;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)[[I")
    public final int[][] method835(byte arg0, int arg1) {
        field2154++;
        if (arg0 <= 103) {
            return null;
        } else if (this.field2152 == this.field2146) {
            this.field2164 = this.field2147[arg1] == null;
            this.field2147[arg1] = class145.field2474;
            return this.field2150[arg1];
        } else if (this.field2146 == 1) {
            this.field2164 = this.field2161 != arg1;
            this.field2161 = arg1;
            return this.field2150[0];
        } else {
            class247 var3 = this.field2147[arg1];
            if (var3 == null) {
                this.field2164 = true;
                if (this.field2163 >= this.field2146) {
                    class247 var4 = (class247) this.field2143.method376((byte) 80);
                    var3 = new class247(arg1, var4.field4051);
                    this.field2147[var4.field4050] = null;
                    var4.method547(10026);
                } else {
                    var3 = new class247(arg1, this.field2163);
                    this.field2163++;
                }
                this.field2147[arg1] = var3;
            } else {
                this.field2164 = false;
            }
            this.field2143.method380(var3, 126);
            return this.field2150[var3.field4051];
        }
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(Z)V")
    public static final void method836(boolean arg0) {
        field2159++;
        if (!arg0) {
            field2158 = null;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class23.field367[var1] = true;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lvh;I)V")
    public static final void method837(class108 arg0, int arg1) {
        class51.field891 = arg0;
        field2149++;
        if (arg1 != 31946) {
            field2142 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(III)V")
    public class122(int arg0, int arg1, int arg2) {
        this.field2152 = arg1;
        this.field2146 = arg0;
        this.field2150 = new int[this.field2146][3][arg2];
        this.field2147 = new class247[this.field2152];
    }
}
