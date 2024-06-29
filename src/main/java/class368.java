import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class368 extends class443 {

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "Z")
    public boolean field5225 = true;

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "Lnn;")
    public static class214 field5229 = new class214(6, 7);

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "Lpp;")
    public static class464 field5230 = new class464(40, 0);

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "Ltb;")
    public class408 field5221;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "[I")
    public int[] field5214;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "[I")
    private int[] field5226;

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "[Ljava/lang/String;")
    private String[] field5224;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "[[I")
    private int[][] field5219;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)Lio;", line = 7)
    public final class151 method2219(int arg0, int arg1) {
        field5223++;
        if (this.field5226 == null || arg0 < 0 || arg0 > this.field5226.length) {
            return null;
        } else {
            if (arg1 != 0) {
                this.method2225(false);
            }
            return class302.method1888((byte) 10, this.field5226[arg0]);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([ILco;Z)V", line = 23)
    public final void method2220(int[] arg0, class268 arg1, boolean arg2) {
        field5227++;
        if (this.field5226 == null) {
            return;
        }
        if (arg2) {
            this.field5224 = null;
        }
        for (int var4 = 0; var4 < this.field5226.length; var4++) {
            if (var4 >= arg0.length) {
                return;
            }
            int var5 = this.method2219(var4, 0).field2279;
            if (var5 > 0) {
                arg1.method1735((byte) -100, var5, (long) arg0[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lco;Z)V", line = 55)
    public final void method2221(class268 arg0, boolean arg1) {
        if (!arg1) {
            this.field5226 = null;
        }
        while (true) {
            int var3 = arg0.method1738(255);
            if (var3 == 0) {
                field5215++;
                return;
            }
            this.method2224(arg0, 0, var3);
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)I", line = 76)
    public final int method2222(byte arg0) {
        field5217++;
        if (arg0 != -117) {
            this.field5224 = null;
        }
        return this.field5226 == null ? 0 : this.field5226.length;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLco;)Ljava/lang/String;", line = 92)
    public final String method2223(byte arg0, class268 arg1) {
        field5220++;
        StringBuffer var3 = new StringBuffer(80);
        if (arg0 != -119) {
            this.field5224 = null;
        }
        if (this.field5226 != null) {
            for (int var4 = 0; var4 < this.field5226.length; var4++) {
                var3.append(this.field5224[var4]);
                var3.append(this.field5221.method2474(this.field5219[var4], this.method2219(var4, 0), arg1.method1724((byte) -50, class302.method1888((byte) 10, this.field5226[var4]).field2277), false));
            }
        }
        var3.append(this.field5224[this.field5224.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lco;II)V", line = 124)
    private final void method2224(class268 arg0, int arg1, int arg2) {
        field5228++;
        if (arg1 != 0) {
            field5230 = null;
        }
        if (arg2 == 1) {
            this.field5224 = class580.method3325((byte) 118, '<', arg0.method1752(false));
        } else if (arg2 == 2) {
            int var9 = arg0.method1738(255);
            this.field5214 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field5214[var10] = arg0.method1745(arg1 + 32132);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method1738(255);
            this.field5219 = new int[var4][];
            this.field5226 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1745(arg1 + 32132);
                class151 var7 = class302.method1888((byte) 10, var6);
                if (var7 != null) {
                    this.field5226[var5] = var6;
                    this.field5219[var5] = new int[var7.field2274];
                    for (int var8 = 0; var8 < var7.field2274; var8++) {
                        this.field5219[var5][var8] = arg0.method1745(32132);
                    }
                }
            }
        } else if (arg2 == 4) {
            this.field5225 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(Z)V", line = 200)
    public final void method2225(boolean arg0) {
        if (this.field5214 != null) {
            for (int var2 = 0; var2 < this.field5214.length; var2++) {
                this.field5214[var2] = class188.method1258(this.field5214[var2], 32768);
            }
        }
        if (arg0) {
            this.method2228(false);
        }
        field5216++;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)I", line = 221)
    public final int method2226(int arg0, int arg1, int arg2) {
        if (arg0 != -14577) {
            this.field5226 = null;
        }
        field5218++;
        if (this.field5226 == null || arg2 < 0 || arg2 > this.field5226.length) {
            return -1;
        } else if (this.field5219[arg2] == null || arg1 < 0 || arg1 > this.field5219[arg2].length) {
            return -1;
        } else {
            return this.field5219[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 242)
    public static void method2227(int arg0) {
        if (arg0 != 0) {
            field5229 = null;
        }
        field5230 = null;
        field5229 = null;
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(Z)Ljava/lang/String;", line = 255)
    public final String method2228(boolean arg0) {
        field5222++;
        StringBuffer var2 = new StringBuffer(80);
        if (arg0) {
            return null;
        } else if (this.field5224 == null) {
            return "";
        } else {
            var2.append(this.field5224[0]);
            for (int var3 = 1; var3 < this.field5224.length; var3++) {
                var2.append("...");
                var2.append(this.field5224[var3]);
            }
            return var2.toString();
        }
    }
}
