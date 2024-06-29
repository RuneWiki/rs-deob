import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class603 {

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "Ljr;")
    private class112 field8274 = new class112(64);

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "Lin;")
    private class91 field8277;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field8272;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field8273;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field8275;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    public static int field8278;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "Lcba;")
    public static class550 field8276;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V", line = 4)
    public static void method3430(byte arg0) {
        field8276 = null;
        if (arg0 != 18) {
            field8276 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)V", line = 17)
    public final void method3431(int arg0, byte arg1) {
        field8278++;
        class112 var3 = this.field8274;
        synchronized (this.field8274) {
            if (arg1 != 1) {
                this.field8274 = null;
            }
            this.field8274.method987(2, arg0);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 31)
    public final void method3432(int arg0) {
        field8275++;
        int var2 = 14 % ((-arg0 - 39) / 51);
        class112 var3 = this.field8274;
        synchronized (this.field8274) {
            this.field8274.method996(-80);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)V", line = 46)
    public final void method3433(int arg0, int arg1) {
        int var3 = -6 % ((67 - arg1) / 47);
        field8271++;
        class112 var4 = this.field8274;
        synchronized (this.field8274) {
            this.field8274.method999(0);
            this.field8274 = new class112(arg0);
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V", line = 61)
    public final void method3434(int arg0) {
        field8272++;
        if (arg0 == 64) {
            class112 var2 = this.field8274;
            synchronized (this.field8274) {
                this.field8274.method999(0);
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)Lbia;", line = 74)
    public final class499 method3435(int arg0, int arg1) {
        field8273++;
        class112 var3 = this.field8274;
        class499 var4;
        synchronized (this.field8274) {
            var4 = (class499) this.field8274.method992((long) arg0, 76);
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field8277;
        byte[] var6;
        synchronized (this.field8277) {
            var6 = this.field8277.method863(arg1 ^ 0x743, class727.method4023(true, arg0), class423.method2593(false, arg0));
        }
        class499 var7 = new class499();
        if (arg1 != -1) {
            return null;
        }
        if (var6 != null) {
            var7.method2943(arg1 ^ 0xFFFFF7FF, new class215(var6));
        }
        class112 var8 = this.field8274;
        synchronized (this.field8274) {
            this.field8274.method991(var7, (long) arg0, (byte) -105);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lsj;ILin;)V", line = 110)
    public class603(class460 arg0, int arg1, class91 arg2) {
        this.field8277 = arg2;
        if (this.field8277 != null) {
            int var4 = this.field8277.method867(-1) - 1;
            this.field8277.method860(0, var4);
        }
    }
}
