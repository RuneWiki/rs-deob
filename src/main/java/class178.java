import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class178 {

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Lhp;")
    private class277 field2189 = new class277(128);

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Lhp;")
    public class277 field2198 = new class277(64);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Lkea;")
    private class203 field2185;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "Lkea;")
    public class203 field2186;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field2192 = 2;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
    public final void method1013(int arg0, int arg1, int arg2) {
        this.field2189 = new class277(arg0);
        if (arg1 > -118) {
            method1019(99, -105, -72, 94, (byte) -128, -93, 10, -79, 21, -23);
        }
        field2194++;
        this.field2198 = new class277(arg2);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)Llm;")
    public final class431 method1014(int arg0, int arg1) {
        field2191++;
        class277 var3 = this.field2189;
        class431 var4;
        synchronized (this.field2189) {
            var4 = (class431) this.field2189.method1801(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field2185;
        byte[] var6;
        synchronized (this.field2185) {
            var6 = this.field2185.method1286(arg0, 36, (byte) -49);
        }
        class431 var7 = new class431();
        var7.field6386 = arg0;
        var7.field6421 = this;
        if (var6 != null) {
            var7.method2687(-124, new class194(var6));
        }
        var7.method2695(false);
        class277 var8 = this.field2189;
        synchronized (this.field2189) {
            this.field2189.method1808((long) arg0, var7, (byte) -43);
            if (arg1 != 5187) {
                this.field2189 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)V")
    public final void method1015(int arg0, byte arg1) {
        if (arg1 != -103) {
            this.method1014(60, -15);
        }
        class277 var3 = this.field2189;
        synchronized (this.field2189) {
            this.field2189.method1811((byte) -22, arg0);
        }
        field2193++;
        class277 var4 = this.field2198;
        synchronized (this.field2198) {
            this.field2198.method1811((byte) -113, arg0);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public static final void method1016(byte arg0) {
        if (arg0 != 105) {
            field2188 = -28;
        }
        field2196++;
        if (class358.field5088 != -1) {
            class305.method2030(false, class358.field5088, -1, -1, (byte) 120);
            class358.field5088 = -1;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public final void method1017(int arg0) {
        class277 var2 = this.field2189;
        synchronized (this.field2189) {
            this.field2189.method1805(84);
            if (arg0 != -1) {
                this.field2185 = null;
            }
        }
        field2197++;
        class277 var3 = this.field2198;
        synchronized (this.field2198) {
            this.field2198.method1805(34);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([BIIIII)V")
    public static final void method1018(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2187++;
        if (arg5 <= arg1) {
            return;
        }
        int var6 = arg5 - arg1 >> 2;
        int var7 = arg1 + arg3;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg5 - arg1 & 0x3;
                int var9 = 3 % ((-arg4 - 25) / 50);
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg0[var7++] = 1;
                }
            }
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method1019(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2190++;
        int var10 = -63 % ((arg4 + 53) / 45);
        class55 var11 = null;
        for (class55 var12 = (class55) class117.field1451.method719(false); var12 != null; var12 = (class55) class117.field1451.method716(14)) {
            if (var12.field629 == arg7 && var12.field623 == arg5 && var12.field625 == arg8 && var12.field630 == arg3) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class55();
            var11.field629 = arg7;
            var11.field625 = arg8;
            var11.field623 = arg5;
            var11.field630 = arg3;
            if (arg5 >= 0 && arg8 >= 0 && arg5 < class90.field1032 && arg8 < class30.field349) {
                class368.method2358(false, var11);
            }
            class117.field1451.method706(var11, true);
        }
        var11.field636 = arg2;
        var11.field632 = arg1;
        var11.field626 = arg6;
        var11.field634 = arg9;
        var11.field633 = arg0;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
    public final void method1020(byte arg0) {
        if (arg0 != 1) {
            return;
        }
        class277 var2 = this.field2189;
        synchronized (this.field2189) {
            this.field2189.method1810(false);
        }
        field2195++;
        class277 var3 = this.field2198;
        synchronized (this.field2198) {
            this.field2198.method1810(false);
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lcda;ILkea;Lkea;)V")
    public class178(class149 arg0, int arg1, class203 arg2, class203 arg3) {
        this.field2185 = arg2;
        this.field2186 = arg3;
        this.field2185.method1309(1675886592, 36);
    }
}
