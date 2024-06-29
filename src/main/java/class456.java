import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class456 {

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "Laq;")
    private class494 field6226 = new class494(64);

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "Lgga;")
    private class513 field6231;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public static int field6225 = 104;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "Lot;")
    public static class746 field6230;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "[I")
    public static int[] field6222;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "[Lmq;")
    public static class85[] field6223;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V", line = 3)
    public static void method2671(int arg0) {
        field6223 = null;
        if (arg0 != 26835) {
            field6225 = -36;
        }
        field6222 = null;
        field6230 = null;
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V", line = 17)
    public final void method2672(int arg0) {
        field6229++;
        class494 var2 = this.field6226;
        synchronized (this.field6226) {
            this.field6226.method2893((byte) 88);
        }
        if (arg0 != 19775) {
            field6230 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)V", line = 30)
    public final void method2673(int arg0) {
        field6224++;
        if (arg0 <= -63) {
            class494 var2 = this.field6226;
            synchronized (this.field6226) {
                this.field6226.method2881((byte) -34);
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IB)V", line = 44)
    public final void method2674(int arg0, byte arg1) {
        field6227++;
        class494 var3 = this.field6226;
        synchronized (this.field6226) {
            this.field6226.method2888(arg0, 118);
            if (arg1 != -97) {
                field6223 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BI)Lmm;", line = 59)
    public final class61 method2675(byte arg0, int arg1) {
        field6228++;
        class494 var3 = this.field6226;
        class61 var4;
        synchronized (this.field6226) {
            var4 = (class61) this.field6226.method2882((long) arg1, (byte) -65);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field6231;
        byte[] var6;
        synchronized (this.field6231) {
            var6 = this.field6231.method3019(35, arg1, 73);
        }
        class61 var7 = new class61();
        if (arg0 <= 3) {
            this.method2675((byte) -95, -78);
        }
        if (var6 != null) {
            var7.method631(new class431(var6), false);
        }
        var7.method630((byte) -47);
        class494 var8 = this.field6226;
        synchronized (this.field6226) {
            this.field6226.method2890(-7307, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lmca;ILgga;)V", line = 105)
    public class456(class41 arg0, int arg1, class513 arg2) {
        this.field6231 = arg2;
        if (this.field6231 != null) {
            this.field6231.method3007(-1, 35);
        }
    }
}
