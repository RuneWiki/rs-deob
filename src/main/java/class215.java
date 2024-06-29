import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class215 {

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    private int field2996 = -1;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    private int field2991 = 0;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "Lm;")
    private class242 field3001 = new class242();

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "Z")
    public boolean field3004 = false;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    private int field2994;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    private int field2998;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "[[I")
    private int[][] field2993;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "[Lls;")
    private class53[] field2997;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "[I")
    public static int[] field3002 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BI)[I")
    public final int[] method1409(byte arg0, int arg1) {
        field2992++;
        if (arg0 != 48) {
            this.field2997 = null;
        }
        if (this.field2998 == this.field2994) {
            this.field3004 = this.field2997[arg1] == null;
            this.field2997[arg1] = class104.field1353;
            return this.field2993[arg1];
        } else if (this.field2994 == 1) {
            this.field3004 = this.field2996 != arg1;
            this.field2996 = arg1;
            return this.field2993[0];
        } else {
            class53 var3 = this.field2997[arg1];
            if (var3 == null) {
                this.field3004 = true;
                if (this.field2994 <= this.field2991) {
                    class53 var4 = (class53) this.field3001.method1564(arg0 ^ 0xFFFF9C36);
                    var3 = new class53(arg1, var4.field815);
                    this.field2997[var4.field822] = null;
                    var4.method2632(true);
                } else {
                    var3 = new class53(arg1, this.field2991);
                    this.field2991++;
                }
                this.field2997[arg1] = var3;
            } else {
                this.field3004 = false;
            }
            this.field3001.method1576(false, var3);
            return this.field2993[var3.field815];
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V")
    public static final void method1410(int arg0, int arg1, int arg2) {
        class77 var3 = class106.field1405[arg0][arg1][arg2];
        if (var3 != null && var3.field1079 != null) {
            var3.field1079 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
    public final void method1411(int arg0) {
        field3003++;
        int var2 = 24 % ((-arg0 - 67) / 36);
        for (int var3 = 0; var3 < this.field2994; var3++) {
            this.field2993[var3] = null;
        }
        this.field2997 = null;
        this.field2993 = null;
        this.field3001.method1574(-32166);
        this.field3001 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lc;III[Z)Z")
    public static final boolean method1412(class308 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class370.field5469 != class266.field3950) {
            int var6 = class142.field1804[arg1].method725(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class193 var8 = class142.field1804[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method725(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method738(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method733(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIFIZIII)[[I")
    public static final int[][] method1413(int arg0, int arg1, int arg2, float arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field2990++;
        int[][] var9 = new int[arg0][arg1];
        class211 var10 = new class211();
        var10.field2868 = arg8;
        if (arg7 >= -65) {
            return null;
        }
        var10.field2883 = (int) (arg3 * 4096.0F);
        var10.field2876 = arg4;
        var10.field2864 = arg5;
        var10.field2869 = arg2;
        var10.method237((byte) -126);
        class154.method1036((byte) 125, arg1, arg0);
        for (int var11 = 0; var11 < arg0; var11++) {
            var10.method1376(var11, var9[var11], 12718);
        }
        return var9;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)[[I")
    public final int[][] method1414(byte arg0) {
        field2995++;
        if (this.field2998 != this.field2994) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 >= -110) {
            this.field2998 = 13;
        }
        for (int var2 = 0; var2 < this.field2994; var2++) {
            this.field2997[var2] = class104.field1353;
        }
        return this.field2993;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V")
    public static void method1415(int arg0) {
        field3002 = null;
        if (arg0 < 41) {
            method1412((class308) null, 52, 101, 92, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(III)V")
    public class215(int arg0, int arg1, int arg2) {
        this.field2994 = arg0;
        this.field2998 = arg1;
        this.field2993 = new int[this.field2994][arg2];
        this.field2997 = new class53[this.field2998];
    }
}
