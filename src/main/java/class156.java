import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class156 extends class272 {

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "Z")
    public boolean field2315 = true;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "[I")
    public static int[] field2317 = new int[13];

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "[Lbd;")
    public static class42[] field2323 = new class42[0];

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "Lta;")
    public static class128 field2325;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "[I")
    private int[] field2318;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "[I")
    public static int[] field2320;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "[I")
    public int[] field2321;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "[Ljava/lang/String;")
    private String[] field2327;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "[[I")
    private int[][] field2311;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "[[I")
    public static int[][] field2324;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZ)Z")
    public static boolean method974(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLrp;[I)V")
    public final void method975(byte arg0, class276 arg1, int[] arg2) {
        field2310++;
        if (this.field2318 == null) {
            return;
        }
        for (int var4 = 0; this.field2318.length > var4 && arg2.length > var4; var4++) {
            int var5 = class200.field2916[this.method977(var4, (byte) 35)];
            if (var5 > 0) {
                arg1.method1713((long) arg2[var4], (byte) 123, var5);
            }
        }
        if (arg0 > -35) {
            this.method981((byte) 55);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILrp;)Ljava/lang/String;")
    public final String method976(int arg0, class276 arg1) {
        field2312++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2318 != null) {
            for (int var4 = 0; var4 < this.field2318.length; var4++) {
                var3.append(this.field2327[var4]);
                var3.append(class11.method43(true, this.field2318[var4], this.field2311[var4], arg1.method1714(class41.field581[this.field2318[var4]], 121)));
            }
        }
        if (arg0 == 0) {
            var3.append(this.field2327[this.field2327.length - 1]);
            return var3.toString();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)I")
    public final int method977(int arg0, byte arg1) {
        field2322++;
        if (arg1 != 35) {
            this.method975((byte) 35, (class276) null, (int[]) null);
        }
        return this.field2318 == null || arg0 < 0 || this.field2318.length < arg0 ? -1 : this.field2318[arg0];
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)I")
    public static final int method978(int arg0, int arg1, int arg2, int arg3) {
        field2319++;
        if (arg0 != 0) {
            return -29;
        } else if (arg1 < arg3) {
            return arg3;
        } else if (arg2 >= arg1) {
            return arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I")
    public final int method979(int arg0, int arg1, int arg2) {
        field2316++;
        if (this.field2318 == null || arg0 < 0 || arg0 > this.field2318.length) {
            return -1;
        } else if (this.field2311[arg0] == null || arg1 < 0 || arg1 > this.field2311[arg0].length) {
            return -1;
        } else {
            if (arg2 != 4) {
                method978(-2, -92, -115, -45);
            }
            return this.field2311[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)Ljava/lang/String;")
    public final String method980(int arg0) {
        field2313++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2327 == null) {
            return "";
        }
        var2.append(this.field2327[arg0]);
        for (int var3 = 1; var3 < this.field2327.length; var3++) {
            var2.append("...");
            var2.append(this.field2327[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)V")
    public final void method981(byte arg0) {
        if (this.field2321 != null) {
            for (int var2 = 0; var2 < this.field2321.length; var2++) {
                this.field2321[var2] = class248.method1549(this.field2321[var2], 32768);
            }
        }
        field2326++;
        if (arg0 != -121) {
            this.method983((byte) 119);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(ILrp;)V")
    public final void method982(int arg0, class276 arg1) {
        while (true) {
            int var3 = arg1.method1701(-23121);
            if (var3 == 0) {
                if (arg0 != 0) {
                    field2325 = null;
                }
                field2309++;
                return;
            }
            this.method985(false, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)I")
    public final int method983(byte arg0) {
        int var2 = 91 / ((-arg0 - 13) / 58);
        field2308++;
        return this.field2318 == null ? 0 : this.field2318.length;
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(B)V")
    public static void method984(byte arg0) {
        field2317 = null;
        field2320 = null;
        if (arg0 > 49) {
            field2323 = null;
            field2325 = null;
            field2324 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLrp;I)V")
    private final void method985(boolean arg0, class276 arg1, int arg2) {
        field2314++;
        if (arg0) {
            field2324 = null;
        }
        if (arg2 == 1) {
            this.field2327 = class193.method1192('<', 0, arg1.method1750(82));
        } else if (arg2 == 2) {
            int var4 = arg1.method1701(-23121);
            this.field2321 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2321[var5] = arg1.method1729(65280);
            }
        } else if (arg2 == 3) {
            int var6 = arg1.method1701(-23121);
            this.field2318 = new int[var6];
            this.field2311 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method1729(65280);
                this.field2318[var7] = var8;
                this.field2311[var7] = new int[class112.field1422[var8]];
                for (int var9 = 0; var9 < class112.field1422[var8]; var9++) {
                    this.field2311[var7][var9] = arg1.method1729(65280);
                }
            }
        } else if (arg2 == 4) {
            this.field2315 = false;
            return;
        }
    }
}
