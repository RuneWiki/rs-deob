import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public abstract class class430 extends class43 {

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "Z")
    public boolean field6196;

    @OriginalMember(owner = "client!cp", name = "y", descriptor = "I")
    public int field6197;

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
    public int field6192;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
    public int field6191;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "S")
    public short field6185;

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "B")
    public byte field6198;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "S")
    public short field6186;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "B")
    public byte field6184;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "S")
    public short field6182;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "S")
    public short field6195;

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
    public static int field6193 = 0;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "Ltc;")
    public static class196 field6190 = new class196();

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
    public int field6187;

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIILtr;)J", line = 5)
    public static final long method2705(int arg0, int arg1, int arg2, class161 arg3) {
        field6181++;
        int var4 = 3 / ((53 - arg0) / 50);
        long var5 = 4194304L;
        long var7 = 2147483648L;
        long var9 = Long.MIN_VALUE;
        class369 var11 = class310.method1961(arg3.method126(-13482), (byte) 35);
        long var12 = (long) (arg3.method123((byte) 122) << 14 | arg1 | arg2 << 7 | arg3.method124(-11197) << 20 | 0x40000000);
        if (var11.field5221 == 0) {
            var12 |= var9;
        }
        if (var11.field5177 == 1) {
            var12 |= var5;
        }
        if (var11.field5227) {
            var12 |= var7;
        }
        return var12 | (long) arg3.method126(-13482) << 32;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V", line = 36)
    public static void method2706(boolean arg0) {
        if (arg0) {
            field6190 = null;
        }
        field6190 = null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BJ)V", line = 54)
    public static final void method2707(byte arg0, long arg1) {
        if (arg0 > -36) {
            method2708(-114, -49);
        }
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field6194++;
    }

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "(B)V", line = 73)
    public void method400(byte arg0) {
        if (arg0 != 66) {
            method2706(true);
        }
        field6189++;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)Lgp;", line = 88)
    public static final class31 method2708(int arg0, int arg1) {
        field6188++;
        if (class196.field2722 && arg0 >= class36.field549 && arg0 <= class244.field3376) {
            return arg1 == 1 ? class296.field4119[arg0 - class36.field549] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 108)
    public class430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field6196 = arg8;
        this.field6197 = (short) arg1;
        this.field6192 = (short) arg3;
        this.field6191 = (short) arg2;
        this.field6185 = (short) arg7;
        this.field6198 = (byte) arg0;
        this.field6186 = (short) arg6;
        this.field6184 = arg9;
        this.field6182 = (short) arg4;
        this.field6195 = (short) arg5;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(Z)I")
    public abstract int method600(boolean arg0);
}
