import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 {

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Ljp;")
    private class236 field254 = new class236(64);

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Lpc;")
    private class473 field255;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field253 = 0;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "Lms;")
    public static class530 field256 = class105.method735(64);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public final void method130(byte arg0) {
        field257++;
        class236 var2 = this.field254;
        synchronized (this.field254) {
            this.field254.method1458((byte) 117);
        }
        if (arg0 != 77) {
            this.method132(115, 119);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)Lan;")
    public final class20 method131(int arg0, byte arg1) {
        int var3 = 126 % ((arg1 + 67) / 53);
        field252++;
        class236 var4 = this.field254;
        class20 var5;
        synchronized (this.field254) {
            var5 = (class20) this.field254.method1456((long) arg0, 122);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field255.method2708(32, arg0, (byte) 54);
        class20 var7 = new class20();
        if (var6 != null) {
            var7.method191(new class379(var6), (byte) 89);
        }
        class236 var8 = this.field254;
        synchronized (this.field254) {
            this.field254.method1462(var7, (long) arg0, -47);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
    public final void method132(int arg0, int arg1) {
        class236 var3 = this.field254;
        synchronized (this.field254) {
            this.field254.method1461(-5, arg1);
        }
        if (arg0 != 64) {
            this.field254 = null;
        }
        field259++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public final void method133(int arg0) {
        class236 var2 = this.field254;
        synchronized (this.field254) {
            this.field254.method1459(arg0 ^ 0x4AD0);
        }
        field258++;
        if (arg0 != 64) {
            this.field254 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
    public static void method134(byte arg0) {
        if (arg0 != -4) {
            field253 = 56;
        }
        field256 = null;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lrb;ILpc;)V")
    public class13(class234 arg0, int arg1, class473 arg2) {
        this.field255 = arg2;
        this.field255.method2710(32, (byte) -99);
    }
}
