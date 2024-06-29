import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class516 {

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "Ljr;")
    private class112 field7195 = new class112(64);

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "Ljr;")
    public class112 field7196 = new class112(60);

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "Lin;")
    public class91 field7187;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Lin;")
    private class91 field7185;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "Z")
    public static boolean field7194 = false;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "D")
    public static double field7186;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public int field7197;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field7191;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "[Lcia;")
    public static class613[] field7188;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V", line = 4)
    public final void method3014(int arg0, int arg1) {
        field7184++;
        this.field7197 = arg1;
        class112 var3 = this.field7196;
        synchronized (this.field7196) {
            this.field7196.method999(0);
        }
        if (arg0 < 72) {
            field7188 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 18)
    public final void method3015(int arg0) {
        class112 var2 = this.field7195;
        synchronized (this.field7195) {
            this.field7195.method996(-126);
        }
        if (arg0 >= -99) {
            field7186 = 0.5896741197263589D;
        }
        field7192++;
        class112 var3 = this.field7196;
        synchronized (this.field7196) {
            this.field7196.method996(-106);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)Lfk;", line = 36)
    public final class654 method3016(byte arg0, int arg1) {
        if (arg0 <= 38) {
            this.method3015(-73);
        }
        field7189++;
        class112 var3 = this.field7195;
        class654 var4;
        synchronized (this.field7195) {
            var4 = (class654) this.field7195.method992((long) arg1, 101);
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field7185;
        byte[] var6;
        synchronized (this.field7185) {
            var6 = this.field7185.method863(-1860, class51.method593((byte) 127, arg1), class208.method1433(arg1, 16));
        }
        class654 var7 = new class654();
        var7.field8990 = this;
        var7.field8978 = arg1;
        if (var6 != null) {
            var7.method3691(28105, new class215(var6));
        }
        class112 var8 = this.field7195;
        synchronized (this.field7195) {
            this.field7195.method991(var7, (long) arg1, (byte) -127);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)V", line = 75)
    public final void method3017(int arg0, byte arg1) {
        class112 var3 = this.field7195;
        synchronized (this.field7195) {
            this.field7195.method987(2, arg0);
            if (arg1 >= -11) {
                this.field7187 = null;
            }
        }
        field7193++;
        class112 var4 = this.field7196;
        synchronized (this.field7196) {
            this.field7196.method987(2, arg0);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V", line = 96)
    public static void method3018(boolean arg0) {
        if (arg0) {
            field7188 = null;
            field7191 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V", line = 109)
    public final void method3019(int arg0) {
        field7190++;
        class112 var2 = this.field7195;
        synchronized (this.field7195) {
            this.field7195.method999(arg0 ^ arg0);
        }
        class112 var3 = this.field7196;
        synchronized (this.field7196) {
            this.field7196.method999(0);
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lsj;ILin;Lin;)V", line = 133)
    public class516(class460 arg0, int arg1, class91 arg2, class91 arg3) {
        this.field7187 = arg3;
        this.field7185 = arg2;
        int var5 = this.field7185.method867(-1) - 1;
        this.field7185.method860(0, var5);
    }
}
