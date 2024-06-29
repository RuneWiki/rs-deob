import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class32 extends class15 {

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "Z")
    public boolean field398 = true;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "[I")
    public static int[] field407 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "J")
    public static long field409 = 0L;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "[I")
    public int[] field397;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "[I")
    private int[] field410;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "[Ljava/lang/String;")
    private String[] field408;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "[[I")
    private int[][] field396;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILvt;I)V", line = 4)
    private final void method160(int arg0, class179 arg1, int arg2) {
        if (arg0 == 1) {
            this.field408 = class217.method1214((byte) 31, arg1.method907(-27652), '<');
        } else if (arg0 == 2) {
            int var4 = arg1.method895((byte) -126);
            this.field397 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field397[var5] = arg1.method916(21933);
            }
        } else if (arg0 == 3) {
            int var6 = arg1.method895((byte) -80);
            this.field396 = new int[var6][];
            this.field410 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method916(21933);
                this.field410[var7] = var8;
                this.field396[var7] = new int[class41.field503[var8]];
                for (int var9 = 0; var9 < class41.field503[var8]; var9++) {
                    this.field396[var7][var9] = arg1.method916(21933);
                }
            }
        } else if (arg0 == 4) {
            this.field398 = false;
        }
        field406++;
        if (arg2 > -55) {
            this.field408 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z[ILvt;)V", line = 70)
    public final void method161(boolean arg0, int[] arg1, class179 arg2) {
        field400++;
        if (this.field410 == null || !arg0) {
            return;
        }
        for (int var4 = 0; var4 < this.field410.length; var4++) {
            if (var4 >= arg1.length) {
                return;
            }
            int var5 = class195.field2664[this.method165(7789, var4)];
            if (var5 > 0) {
                arg2.method927(var5, 16711680, (long) arg1[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)V", line = 100)
    public final void method162(byte arg0) {
        if (this.field397 != null) {
            for (int var2 = 0; var2 < this.field397.length; var2++) {
                this.field397[var2] = class292.method1841(this.field397[var2], 32768);
            }
        }
        if (arg0 < 90) {
            this.field398 = false;
        }
        field399++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILvt;)V", line = 123)
    public final void method163(int arg0, class179 arg1) {
        field404++;
        while (true) {
            int var3 = arg1.method895((byte) -86);
            if (var3 == 0) {
                if (arg0 == -26474) {
                    return;
                } else {
                    this.field397 = null;
                    return;
                }
            }
            this.method160(var3, arg1, -84);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)Ljava/lang/String;", line = 155)
    public final String method164(boolean arg0) {
        if (arg0) {
            return null;
        }
        field395++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field408 == null) {
            return "";
        }
        var2.append(this.field408[0]);
        for (int var3 = 1; var3 < this.field408.length; var3++) {
            var2.append("...");
            var2.append(this.field408[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I", line = 184)
    public final int method165(int arg0, int arg1) {
        field405++;
        if (this.field410 == null || arg1 < 0 || arg1 > this.field410.length) {
            return -1;
        } else if (arg0 == 7789) {
            return this.field410[arg1];
        } else {
            return 57;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lvt;B)Ljava/lang/String;", line = 199)
    public final String method166(class179 arg0, byte arg1) {
        field402++;
        StringBuffer var3 = new StringBuffer(80);
        if (arg1 >= -84) {
            this.method163(74, (class179) null);
        }
        if (this.field410 != null) {
            for (int var4 = 0; var4 < this.field410.length; var4++) {
                var3.append(this.field408[var4]);
                var3.append(class417.method2481(true, arg0.method921((byte) -89, class190.field2598[this.field410[var4]]), this.field396[var4], this.field410[var4]));
            }
        }
        var3.append(this.field408[this.field408.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(III)I", line = 227)
    public final int method167(int arg0, int arg1, int arg2) {
        field411++;
        if (arg0 != 0) {
            this.field410 = null;
        }
        if (this.field410 == null || arg1 < 0 || arg1 > this.field410.length) {
            return -1;
        } else if (this.field396[arg1] == null || arg2 < 0 || this.field396[arg1].length < arg2) {
            return -1;
        } else {
            return this.field396[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)I", line = 244)
    public final int method168(int arg0) {
        field401++;
        if (this.field410 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.field397 = null;
            }
            return this.field410.length;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIZI)V", line = 274)
    public static final void method169(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (class75.field912 <= arg2 && arg2 <= class453.field6396) {
            int var5 = class353.method2142((byte) -81, class328.field4729, arg0, class357.field5123);
            int var6 = class353.method2142((byte) 62, class328.field4729, arg4, class357.field5123);
            class205.method1122(27412, var5, arg2, var6, arg1);
        }
        if (!arg3) {
            method170(-128);
        }
        field403++;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V", line = 292)
    public static void method170(int arg0) {
        field407 = null;
        if (arg0 != 8533) {
            method169(57, 36, 7, false, 102);
        }
    }
}
