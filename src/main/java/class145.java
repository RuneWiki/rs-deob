import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public abstract class class145 extends class381 {

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "[Lnl;")
    public class145[] field2204;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "Z")
    public boolean field2205;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2214 = "slide:";

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "Z")
    public static boolean field2212 = false;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public int field2221;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "Lwp;")
    public class247 field2218;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "Lcn;")
    public class412 field2217;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "[I")
    public static int[] field2220;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)[I")
    public int[] method3(int arg0, int arg1) {
        field2219++;
        int var3 = -46 % ((16 - arg1) / 49);
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)I")
    public int method1115(boolean arg0) {
        if (arg0) {
            this.method4(false, -112);
        }
        field2206++;
        return -1;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILgd;)Z")
    public static final boolean method1116(int arg0, class111 arg1) {
        field2223++;
        class372 var2 = class10.method53(arg1.method582((byte) 22), true);
        if (var2.field5161 == -1) {
            return true;
        } else {
            class38 var3 = class372.method2330(var2.field5161, 34);
            return var3.field575 == arg0 ? true : var3.method379(-3);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)[[I")
    public int[][] method4(boolean arg0, int arg1) {
        field2222++;
        if (!arg0) {
            this.field2205 = true;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BII)V")
    public void method1117(byte arg0, int arg1, int arg2) {
        if (arg0 > -101) {
            return;
        }
        field2210++;
        int var4 = this.field2221 == 255 ? arg1 : this.field2221;
        if (this.field2205) {
            this.field2218 = new class247(var4, arg1, arg2);
        } else {
            this.field2217 = new class412(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)V")
    public void method1118(byte arg0) {
        field2207++;
        if (arg0 != 66) {
            return;
        }
        if (this.field2205) {
            this.field2218.method1612(67);
            this.field2218 = null;
        } else {
            this.field2217.method2551(-122);
            this.field2217 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)[I")
    public final int[] method1119(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            field2211++;
            return this.field2204[arg0].field2205 ? this.field2204[arg0].method3(arg2, 122) : this.field2204[arg0].method4(true, arg2)[0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(B)V")
    public void method87(byte arg0) {
        field2215++;
        if (arg0 != 77) {
            this.method1117((byte) 21, -53, 32);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lap;BI)V")
    public void method2(class289 arg0, byte arg1, int arg2) {
        field2208++;
        int var4 = -21 / ((arg1 - 11) / 52);
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)I")
    public int method1120(int arg0) {
        if (arg0 == 3) {
            field2213++;
            return -1;
        } else {
            return -13;
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IZ)V")
    public class145(int arg0, boolean arg1) {
        this.field2204 = new class145[arg0];
        this.field2205 = arg1;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(III)[[I")
    public final int[][] method1121(int arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            this.field2205 = true;
        }
        field2209++;
        if (this.field2204[arg1].field2205) {
            int[] var4 = this.field2204[arg1].method3(arg0, -113);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field2204[arg1].method4(true, arg0);
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V")
    public static void method1122(int arg0) {
        field2214 = null;
        if (arg0 != -1) {
            method1116(37, (class111) null);
        }
        field2220 = null;
    }
}
