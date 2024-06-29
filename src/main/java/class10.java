import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 {

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "Lpja;")
    private class43 field175 = new class43(256);

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "Lgj;")
    private class662 field172;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "Lfja;")
    public static class783 field170 = new class783(107, 6);

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "[I")
    public static int[] field177 = new int[13];

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "[I")
    public static int[] field176 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!hba", name = "k", descriptor = "[J")
    public static long[] field178;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)V", line = 6)
    public final void method62(int arg0, int arg1) {
        class43 var3 = this.field175;
        synchronized (this.field175) {
            this.field175.method265(arg1, -115);
            if (arg0 != 26) {
                field176 = null;
            }
        }
        field171++;
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(II)Lcg;", line = 20)
    public final class149 method63(int arg0, int arg1) {
        field169++;
        class43 var3 = this.field175;
        class149 var4;
        synchronized (this.field175) {
            var4 = (class149) this.field175.method266((byte) -98, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field172;
        byte[] var6;
        synchronized (this.field172) {
            var6 = this.field172.method3732(arg0, 8906, 26);
        }
        if (arg1 != -28457) {
            return null;
        }
        class149 var7 = new class149();
        if (var6 != null) {
            var7.method1188((byte) 126, new class93(var6));
        }
        class43 var8 = this.field175;
        synchronized (this.field175) {
            this.field175.method270(var7, (long) arg0, -122);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IB)I", line = 52)
    public static final int method64(int arg0, byte arg1) {
        int var2 = 92 % ((20 - arg1) / 54);
        field173++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V", line = 63)
    public final void method65(byte arg0) {
        field174++;
        int var2 = -22 / ((arg0 - 70) / 55);
        class43 var3 = this.field175;
        synchronized (this.field175) {
            this.field175.method273(-85);
        }
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lim;ILgj;)V", line = 83)
    public class10(class598 arg0, int arg1, class662 arg2) {
        this.field172 = arg2;
        this.field172.method3730((byte) -107, 26);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V", line = 103)
    public final void method66(int arg0) {
        class43 var2 = this.field175;
        synchronized (this.field175) {
            if (arg0 != 7766) {
                return;
            }
            this.field175.method272(20);
        }
        field168++;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Z)V", line = 119)
    public static void method67(boolean arg0) {
        field177 = null;
        field178 = null;
        field170 = null;
        field176 = null;
        if (arg0) {
            method67(true);
        }
    }
}
