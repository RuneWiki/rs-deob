import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class584 {

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "Lrg;")
    private class615 field8153 = null;

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "I")
    private int field8155 = 0;

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "I")
    private int field8159 = 0;

    @OriginalMember(owner = "client!kfa", name = "l", descriptor = "I")
    private int field8163 = 0;

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "Lqj;")
    private class548 field8156;

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "Lpea;")
    private class222 field8154;

    @OriginalMember(owner = "client!kfa", name = "j", descriptor = "[Luc;")
    private class277[] field8161;

    @OriginalMember(owner = "client!kfa", name = "m", descriptor = "Lun;")
    public class161 field8164;

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "J")
    public static long field8158 = -1L;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "Lrga;")
    public static class280 field8152 = new class280(7, 8);

    @OriginalMember(owner = "client!kfa", name = "p", descriptor = "Llt;")
    public static class273 field8167 = new class273();

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "I")
    public static int field8160;

    @OriginalMember(owner = "client!kfa", name = "k", descriptor = "I")
    public static int field8162;

    @OriginalMember(owner = "client!kfa", name = "n", descriptor = "Ljda;")
    public static class300 field8165;

    @OriginalMember(owner = "client!kfa", name = "o", descriptor = "Lui;")
    public static class642 field8166;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILrg;I)Z")
    public final boolean method3214(int arg0, class615 arg1, int arg2) {
        field8160++;
        if (arg0 != -27079) {
            return false;
        } else if (this.field8155 == 0) {
            return false;
        } else {
            if (this.field8153 != arg1) {
                this.field8161[Integer.MAX_VALUE & this.field8155].method279(arg2, 7, arg1);
                this.field8153 = arg1;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)V")
    public static void method3215(byte arg0) {
        field8166 = null;
        field8152 = null;
        if (arg0 != -19) {
            method3215((byte) 86);
        }
        field8165 = null;
        field8167 = null;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II)Z")
    public final boolean method3216(int arg0, int arg1) {
        field8162++;
        if (arg0 != -9) {
            this.field8164 = null;
        }
        return this.field8161[arg1].method284((byte) -106);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZZIIII)V")
    public final void method3217(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = arg1 & this.field8156.method1047();
        field8157++;
        if (!var7 && (arg5 == 4 || arg5 == 8 || arg5 == 9)) {
            if (arg5 == 4) {
                arg4 = arg3;
            }
            arg5 = 2;
        }
        if (arg2 > -120) {
            this.method3214(-19, null, -117);
        }
        if (arg5 != 0 && arg0) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (this.field8155 != arg5) {
            if (this.field8155 != 0) {
                this.field8161[this.field8155 & Integer.MAX_VALUE].method278(1268);
            }
            if (arg5 != 0) {
                this.field8161[arg5 & Integer.MAX_VALUE].method277(-22, arg0);
                this.field8161[arg5 & Integer.MAX_VALUE].method280(-89, arg0);
                this.field8161[Integer.MAX_VALUE & arg5].method276(arg3, 50, arg4);
            }
            this.field8163 = arg3;
            this.field8159 = arg4;
            this.field8155 = arg5;
            this.field8153 = null;
        } else if (this.field8155 != 0) {
            this.field8161[Integer.MAX_VALUE & this.field8155].method280(-119, arg0);
            if (this.field8163 != arg3 || this.field8159 != arg4) {
                this.field8161[Integer.MAX_VALUE & this.field8155].method276(arg3, 50, arg4);
                this.field8159 = arg4;
                this.field8163 = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lqj;)V")
    public class584(class548 arg0) {
        this.field8156 = arg0;
        this.field8154 = new class222(arg0);
        this.field8161 = new class277[10];
        this.field8161[1] = new class46(arg0);
        this.field8161[2] = new class561(arg0, this.field8154);
        this.field8161[4] = new class484(arg0, this.field8154);
        this.field8161[5] = new class314(arg0, this.field8154);
        this.field8161[6] = new class562(arg0);
        this.field8161[7] = new class698(arg0);
        this.field8161[3] = this.field8164 = new class161(arg0);
        this.field8161[8] = new class644(arg0, this.field8154);
        this.field8161[9] = new class331(arg0, this.field8154);
        if (!this.field8161[8].method284((byte) -119)) {
            this.field8161[8] = this.field8161[4];
        }
        if (!this.field8161[9].method284((byte) -102)) {
            this.field8161[9] = this.field8161[8];
        }
    }
}
