import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class784 {

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    private int field10820 = 0;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    private int field10826 = 0;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    private int field10827 = 0;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "Lpc;")
    private class700 field10828;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "Lod;")
    private class533 field10822;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "[Ldda;")
    private class402[] field10821;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "Lsja;")
    public class11 field10815;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "Lbja;")
    public static class34 field10817 = new class34(14, 0, 4, 1);

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "[J")
    public static long[] field10825 = new long[256];

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "Lfj;")
    public static class684 field10829;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field10813;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
    public static int field10814;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field10816;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field10818;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    public static int field10819;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public static int field10824;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
    public static int field10830;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
    public static int field10831;

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
    public static int field10832;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
    public static int field10833;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "Lhu;")
    public static class143 field10823;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)Z")
    public final boolean method4342(int arg0, int arg1) {
        if (arg1 == Integer.MAX_VALUE) {
            field10819++;
            return this.field10821[arg0].method178((byte) -88);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;IILpc;)Lvea;")
    public static final class290 method4343(String arg0, int arg1, int arg2, class700 arg3) {
        field10816++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg1, var4);
        OpenGL.glProgramStringARB(arg1, 34933, arg0);
        OpenGL.glGetIntegerv(34379, class359.field4467, 0);
        if (class359.field4467[0] != -1) {
            OpenGL.glBindProgramARB(arg1, 0);
            return null;
        }
        OpenGL.glBindProgramARB(arg1, 0);
        if (arg2 != 28932) {
            method4343(null, -107, -82, null);
        }
        return new class290(arg3, arg1, var4);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILlc;Ljava/lang/String;ZZ)V")
    public static final void method4344(int arg0, class675 arg1, String arg2, boolean arg3, boolean arg4) {
        field10814++;
        class268.method1589(arg3, arg1, "openjs", true, arg2, arg4);
        if (arg0 >= -47) {
            field10832 = 92;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILfha;I)Z")
    public final boolean method4345(int arg0, class400 arg1, int arg2) {
        field10813++;
        if (arg2 != 2) {
            method4344(-125, null, null, false, false);
        }
        if (this.field10827 == 0) {
            return false;
        } else {
            this.field10821[this.field10827 & Integer.MAX_VALUE].method180(arg0, (byte) -108, arg1);
            return true;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B[[I)V")
    public static final void method4346(byte arg0, int[][] arg1) {
        class4.field49 = arg1;
        if (arg0 < 82) {
            method4346((byte) 20, null);
        }
        field10830++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
    public static void method4347(boolean arg0) {
        field10823 = null;
        field10817 = null;
        field10829 = null;
        field10825 = null;
        if (!arg0) {
            field10825 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZZBII)V")
    public final void method4348(int arg0, boolean arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        boolean var7 = arg2 & this.field10828.method622();
        field10824++;
        if (!var7 && (arg5 == 4 || arg5 == 8 || arg5 == 9)) {
            if (arg5 == 4) {
                arg0 = arg4;
            }
            arg5 = 2;
        }
        if (arg3 > -29) {
            return;
        }
        if (arg5 != 0 && arg1) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (this.field10827 != arg5) {
            if (this.field10827 != 0) {
                this.field10821[this.field10827 & Integer.MAX_VALUE].method181(-1);
            }
            if (arg5 != 0) {
                this.field10821[Integer.MAX_VALUE & arg5].method176(-54, arg1);
                this.field10821[Integer.MAX_VALUE & arg5].method184(64, arg1);
                this.field10821[Integer.MAX_VALUE & arg5].method183(64, arg4, arg0);
            }
            this.field10820 = arg0;
            this.field10827 = arg5;
            this.field10826 = arg4;
        } else if (this.field10827 != 0) {
            this.field10821[Integer.MAX_VALUE & this.field10827].method184(64, arg1);
            if (this.field10826 != arg4 || this.field10820 != arg0) {
                this.field10821[Integer.MAX_VALUE & this.field10827].method183(64, arg4, arg0);
                this.field10826 = arg4;
                this.field10820 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lpc;)V")
    public class784(class700 arg0) {
        this.field10828 = arg0;
        this.field10822 = new class533(arg0);
        this.field10821 = new class402[10];
        this.field10821[1] = new class268(arg0);
        this.field10821[2] = new class434(arg0, this.field10822);
        this.field10821[4] = new class122(arg0, this.field10822);
        this.field10821[5] = new class363(arg0, this.field10822);
        this.field10821[6] = new class356(arg0);
        this.field10821[7] = new class508(arg0);
        this.field10821[3] = this.field10815 = new class11(arg0);
        this.field10821[8] = new class464(arg0, this.field10822);
        this.field10821[9] = new class743(arg0, this.field10822);
        if (!this.field10821[8].method178((byte) -69)) {
            this.field10821[8] = this.field10821[4];
        }
        if (!this.field10821[9].method178((byte) -127)) {
            this.field10821[9] = this.field10821[8];
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field10825[var0] = var1;
        }
        field10829 = new class684(8, 8);
    }
}
