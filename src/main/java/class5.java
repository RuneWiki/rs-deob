import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Ljr;")
    private class112 field38 = new class112(64);

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lin;")
    private class91 field36;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field37 = 0;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Luaa;")
    public final class118 method19(int arg0, int arg1) {
        field35++;
        class112 var3 = this.field38;
        class118 var4;
        synchronized (this.field38) {
            var4 = (class118) this.field38.method992((long) arg0, -67);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != 28364) {
            field37 = 117;
        }
        class91 var5 = this.field36;
        byte[] var6;
        synchronized (this.field36) {
            var6 = this.field36.method863(-1860, 11, arg0);
        }
        class118 var7 = new class118();
        if (var6 != null) {
            var7.method1030(new class215(var6), (byte) -127);
        }
        class112 var8 = this.field38;
        synchronized (this.field38) {
            this.field38.method991(var7, (long) arg0, (byte) -114);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public final void method20(byte arg0) {
        class112 var2 = this.field38;
        synchronized (this.field38) {
            this.field38.method999(0);
            int var3 = -46 / ((arg0 - 3) / 47);
        }
        field39++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public final void method21(int arg0) {
        field40++;
        class112 var2 = this.field38;
        synchronized (this.field38) {
            this.field38.method996(-91);
            if (arg0 != 0) {
                this.field38 = null;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        class112 var3 = this.field38;
        synchronized (this.field38) {
            if (arg1 != 11) {
                return;
            }
            this.field38.method987(2, arg0);
        }
        field34++;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lsj;ILin;)V")
    public class5(class460 arg0, int arg1, class91 arg2) {
        this.field36 = arg2;
        if (this.field36 != null) {
            this.field36.method860(0, 11);
        }
    }
}
