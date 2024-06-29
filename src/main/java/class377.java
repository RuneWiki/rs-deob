import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class377 {

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "Lkh;")
    private class13 field5689 = new class13(64);

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "Lul;")
    private class406 field5691;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public int field5690;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "Ljava/util/Random;")
    public static Random field5687 = new Random();

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "Lhn;")
    public static class509 field5693;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "Lya;")
    public static class38 field5692;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
    public final void method2367(int arg0) {
        class13 var2 = this.field5689;
        synchronized (this.field5689) {
            this.field5689.method88(104);
            if (arg0 != 18) {
                field5694 = -94;
            }
        }
        field5686++;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V")
    public final void method2368(int arg0) {
        if (arg0 != -16936) {
            this.method2368(-7);
        }
        field5684++;
        class13 var2 = this.field5689;
        synchronized (this.field5689) {
            this.field5689.method93((byte) 78);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)Lfn;")
    public final class94 method2369(byte arg0, int arg1) {
        field5688++;
        class13 var3 = this.field5689;
        class94 var4;
        synchronized (this.field5689) {
            var4 = (class94) this.field5689.method87((long) arg1, -2062335807);
        }
        if (arg0 != 112) {
            return null;
        } else if (var4 == null) {
            class406 var5 = this.field5691;
            byte[] var6;
            synchronized (this.field5691) {
                var6 = this.field5691.method2536(16, 0, arg1);
            }
            class94 var7 = new class94();
            if (var6 != null) {
                var7.method754(-62, new class217(var6));
            }
            class13 var8 = this.field5689;
            synchronized (this.field5689) {
                this.field5689.method84((long) arg1, var7, (byte) 27);
                return var7;
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)V")
    public final void method2370(int arg0, int arg1) {
        field5685++;
        class13 var3 = this.field5689;
        synchronized (this.field5689) {
            if (arg1 != 16) {
                this.method2369((byte) 105, -36);
            }
            this.field5689.method91(50, arg0);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V")
    public static void method2371(byte arg0) {
        if (arg0 != -90) {
            method2371((byte) 7);
        }
        field5687 = null;
        field5692 = null;
        field5693 = null;
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lee;ILul;)V")
    public class377(class480 arg0, int arg1, class406 arg2) {
        this.field5691 = arg2;
        if (this.field5691 == null) {
            this.field5690 = 0;
        } else {
            this.field5690 = this.field5691.method2551(16, -26070);
        }
    }

    static {
        new class234(null, "geschickt werden.", null, null);
        field5693 = new class509(52, 18);
        field5694 = 0;
    }
}
