import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class148 extends class42 {

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    private int field2106;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    private int field2093;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public int field2095;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public int field2104;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public int field2108;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public int field2103;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    private int field2107;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    private int field2088;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    private int field2091;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    public static int field2100 = -1;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "Lvj;")
    public static class304 field2101 = new class304("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "Ljp;")
    public static class236 field2109 = new class236(64);

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "Lpc;")
    public static class473 field2094;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Z")
    public final boolean method1015(int arg0, int arg1, int arg2) {
        field2087++;
        if (arg1 == 0) {
            return this.field2103 <= arg0 && arg0 <= this.field2095 && arg2 >= this.field2104 && this.field2108 >= arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)V")
    public static void method1016(boolean arg0) {
        field2094 = null;
        field2101 = null;
        field2109 = null;
        if (arg0) {
            method1021((byte) 69);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZ)Z")
    public final boolean method1017(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field2093 = -116;
        }
        field2097++;
        return arg1 >= this.field2088 && this.field2106 >= arg1 && arg0 >= this.field2093 && this.field2091 >= arg0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BII[I)V")
    public final void method1018(byte arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field2107;
        if (arg0 <= 85) {
            this.field2091 = 105;
        }
        arg3[2] = arg1 - (this.field2104 - this.field2093);
        arg3[1] = this.field2088 + arg2 - this.field2103;
        field2102++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)Z")
    public final boolean method1019(int arg0, int arg1, int arg2, int arg3) {
        field2092++;
        if (arg0 != -5023) {
            field2100 = -88;
        }
        return this.field2107 == arg3 && arg1 >= this.field2088 && arg1 <= this.field2106 && this.field2093 <= arg2 && this.field2091 >= arg2;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Lfm;")
    public static final class514 method1020(int arg0, int arg1) {
        field2090++;
        class305[] var2 = class76.field1133;
        synchronized (class76.field1133) {
            class514 var3;
            if (class76.field1133.length <= arg1 || class76.field1133[arg1].method1773((byte) 103)) {
                var3 = new class514();
                var3.field7563 = new class357[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field7563[var4] = new class357();
                }
            } else {
                var3 = (class514) class76.field1133[arg1].method1765(21621);
                var3.method2291(arg0 ^ 0xFFFFFF86);
                int var10002 = class257.field3383[arg1]--;
            }
            return arg0 == 0 ? var3 : null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)Z")
    public static final boolean method1021(byte arg0) {
        field2096++;
        if (arg0 != 88) {
            method1022(-120, 19);
        }
        return class281.field3698 != class168.field2433 || class196.field2745 >= 2;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)I")
    public static final int method1022(int arg0, int arg1) {
        field2099++;
        return arg1 == -1981755129 ? arg0 >>> 7 : 117;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZZ)V")
    public static final void method1023(boolean arg0, boolean arg1) {
        if (arg1 && class6.field161 != null) {
            class248.field3293 = class6.field161.field857;
        } else {
            class248.field3293 = -1;
        }
        field2105++;
        class53.field836 = null;
        class6.field161 = null;
        class224.field3022 = null;
        class320.field4194 = 0;
        class6.method37();
        class6.field163.method1670((byte) -104);
        class189.field2663 = null;
        class233.field3138 = null;
        class96.field1460 = null;
        class23.field415 = null;
        class286.field3736 = null;
        class403.field5558 = null;
        class217.field2934 = null;
        class250.field3323 = -1;
        class412.field5694 = -1;
        class270.field3543 = null;
        class6.field168 = null;
        class140.field2038 = null;
        class6.field160.method1013(109);
        if (arg0) {
            class6.field153.method374(64, 64, (byte) 101);
            class6.field160.method1009(128, 64, false);
            class6.field155.method1995(3, 64);
            class185.field2626.method2260(64, (byte) 46);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II[II)V")
    public final void method1024(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[2] = this.field2104 + arg0 - this.field2093;
        if (arg1 != -1) {
            method1023(false, false);
        }
        arg2[1] = arg3 - (this.field2088 - this.field2103);
        arg2[0] = 0;
        field2098++;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
    public static final void method1025(byte arg0) {
        for (int var1 = 0; var1 < class60.field942; var1++) {
            int var2 = class162.field2369[var1];
            class117 var3 = class291.field3822[var2];
            if (var3 != null) {
                class248.method1504(var3.field1661.field6956, (byte) 102, var3);
            }
        }
        if (arg0 != 19) {
            method1025((byte) -117);
        }
        field2089++;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field2106 = arg3;
        this.field2093 = arg2;
        this.field2095 = arg7;
        this.field2104 = arg6;
        this.field2108 = arg8;
        this.field2103 = arg5;
        this.field2107 = arg0;
        this.field2088 = arg1;
        this.field2091 = arg4;
    }
}
