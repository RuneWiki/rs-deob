import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class41 extends class260 {

    @OriginalMember(owner = "client!nr", name = "u", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!nr", name = "v", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client!nr", name = "x", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client!nr", name = "w", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BII)Z")
    public final boolean method344(byte arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.method347(114, (byte) 21, -83, null);
        }
        field513++;
        return arg1 >= this.field524 && this.field516 >= arg1 && this.field512 <= arg2 && this.field521 >= arg2;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II[IB)V")
    public final void method345(int arg0, int arg1, int[] arg2, byte arg3) {
        if (arg3 <= -1) {
            arg2[0] = 0;
            arg2[1] = arg0 + this.field520 - this.field524;
            field517++;
            arg2[2] = arg1 - (this.field512 - this.field523);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method346(byte arg0, String arg1) {
        field515++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class525.method3124(false, arg1);
        if (arg0 != -112) {
            method346((byte) 41, null);
        }
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class174.field2588; var3++) {
            String var4 = class258.field3597[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class525.method3124(false, var4);
            if (var5 != null && var5.equals(var2)) {
                class174.field2588--;
                for (int var6 = var3; var6 < class174.field2588; var6++) {
                    class258.field3597[var6] = class258.field3597[var6 + 1];
                    class473.field6913[var6] = class473.field6913[var6 + 1];
                    class434.field6365[var6] = class434.field6365[var6 + 1];
                    class178.field2628[var6] = class178.field2628[var6 + 1];
                    class438.field6407[var6] = class438.field6407[var6 + 1];
                    class489.field7142[var6] = class489.field7142[var6 + 1];
                }
                class78.field1138 = class483.field7062;
                class154.field2358++;
                class491.method2878((byte) 92, class386.field5639);
                class481.field7027.method2302(-4, class252.method1507(arg1, true));
                class481.field7027.method2349(arg1, true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBI[I)V")
    public final void method347(int arg0, byte arg1, int arg2, int[] arg3) {
        field518++;
        arg3[1] = this.field524 + arg2 - this.field520;
        if (arg1 <= -66) {
            arg3[2] = arg0 - (this.field523 - this.field512);
            arg3[0] = this.field522;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBII)Z")
    public final boolean method348(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 > -118) {
            this.field516 = -26;
        }
        field510++;
        return this.field522 == arg2 && this.field524 <= arg0 && this.field516 >= arg0 && arg3 >= this.field512 && this.field521 >= arg3;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lgg;)V")
    public static final void method349(class116 arg0) {
        for (int var1 = arg0.field1729; var1 <= arg0.field1736; var1++) {
            for (int var2 = arg0.field1730; var2 <= arg0.field1742; var2++) {
                class486 var3 = class89.field1305[arg0.field1738][var1][var2];
                if (var3 != null) {
                    class164 var4 = var3.field7115;
                    class164 var5 = null;
                    while (var4 != null) {
                        if (var4.field2468 == arg0) {
                            if (var5 == null) {
                                var3.field7115 = var4.field2467;
                            } else {
                                var5.field2467 = var4.field2467;
                            }
                            var4.method1091(500);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field2467;
                    }
                    var3.field7099 = 0;
                    for (class164 var6 = var3.field7115; var6 != null; var6 = var6.field2467) {
                        var3.field7099 = (byte) (var3.field7099 | var6.field2469);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(BII)Z")
    public final boolean method350(byte arg0, int arg1, int arg2) {
        field511++;
        if (arg0 <= 12) {
            this.field523 = -55;
        }
        return this.field520 <= arg1 && arg1 <= this.field514 && arg2 >= this.field523 && arg2 <= this.field519;
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field520 = arg5;
        this.field514 = arg7;
        this.field512 = arg2;
        this.field524 = arg1;
        this.field521 = arg4;
        this.field523 = arg6;
        this.field516 = arg3;
        this.field522 = arg0;
        this.field519 = arg8;
    }
}
