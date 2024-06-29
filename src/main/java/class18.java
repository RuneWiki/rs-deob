import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class18 {

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    private int field247 = 0;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    private int field248 = 0;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    private int field242 = 0;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "Leq;")
    private class357 field249;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "Lfaa;")
    private class452 field251;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "[Llda;")
    private class489[] field246;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "Lhs;")
    public class137 field244;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZI)Lbh;", line = 10)
    public static final class429 method211(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        }
        field245++;
        if (arg1 == 0) {
            if ((double) class341.field4413 == 3.0D) {
                return class70.field950;
            }
            if ((double) class341.field4413 == 4.0D) {
                return class373.field5246;
            }
            if ((double) class341.field4413 == 6.0D) {
                return class169.field2234;
            }
            if ((double) class341.field4413 >= 8.0D) {
                return class726.field10170;
            }
        } else if (arg1 == 1) {
            if ((double) class341.field4413 == 3.0D) {
                return class169.field2234;
            }
            if ((double) class341.field4413 == 4.0D) {
                return class726.field10170;
            }
            if ((double) class341.field4413 == 6.0D) {
                return class137.field1624;
            }
            if ((double) class341.field4413 >= 8.0D) {
                return class694.field9821;
            }
        } else if (arg1 == 2) {
            if ((double) class341.field4413 == 3.0D) {
                return class137.field1624;
            }
            if ((double) class341.field4413 == 4.0D) {
                return class694.field9821;
            }
            if ((double) class341.field4413 == 6.0D) {
                return class499.field7057;
            }
            if ((double) class341.field4413 >= 8.0D) {
                return class470.field6749;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILkp;I)Z", line = 82)
    public final boolean method212(int arg0, class411 arg1, int arg2) {
        field252++;
        if (this.field247 == 0) {
            return false;
        } else {
            this.field246[arg0 & this.field247].method12((byte) -88, arg1, arg2);
            return true;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZIIIZ)V", line = 96)
    public final void method213(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field250++;
        boolean var7 = arg5 & this.field249.method73();
        if (arg2 > -20) {
            method211(false, 54);
        }
        if (!var7 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
            if (arg3 == 4) {
                arg4 = arg0;
            }
            arg3 = 2;
        }
        if (arg3 != 0 && arg1) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field247 != arg3) {
            if (this.field247 != 0) {
                this.field246[Integer.MAX_VALUE & this.field247].method6(0);
            }
            if (arg3 != 0) {
                this.field246[Integer.MAX_VALUE & arg3].method10(-110, arg1);
                this.field246[arg3 & Integer.MAX_VALUE].method9(-5, arg1);
                this.field246[arg3 & Integer.MAX_VALUE].method8(arg4, arg0, 40);
            }
            this.field242 = arg0;
            this.field247 = arg3;
            this.field248 = arg4;
        } else if (this.field247 != 0) {
            this.field246[Integer.MAX_VALUE & this.field247].method9(-5, arg1);
            if (this.field242 != arg0 || this.field248 != arg4) {
                this.field246[this.field247 & Integer.MAX_VALUE].method8(arg4, arg0, 40);
                this.field248 = arg4;
                this.field242 = arg0;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Leq;)V", line = 171)
    public class18(class357 arg0) {
        this.field249 = arg0;
        this.field251 = new class452(arg0);
        this.field246 = new class489[10];
        this.field246[1] = new class581(arg0);
        this.field246[2] = new class599(arg0, this.field251);
        this.field246[4] = new class292(arg0, this.field251);
        this.field246[5] = new class745(arg0, this.field251);
        this.field246[6] = new class300(arg0);
        this.field246[7] = new class51(arg0);
        this.field246[3] = this.field244 = new class137(arg0);
        this.field246[8] = new class151(arg0, this.field251);
        this.field246[9] = new class3(arg0, this.field251);
        if (!this.field246[8].method7((byte) 96)) {
            this.field246[8] = this.field246[4];
        }
        if (!this.field246[9].method7((byte) 110)) {
            this.field246[9] = this.field246[8];
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)Z", line = 158)
    public final boolean method214(int arg0, int arg1) {
        field243++;
        int var3 = -13 / ((arg1 + 66) / 53);
        return this.field246[arg0].method7((byte) 127);
    }
}
