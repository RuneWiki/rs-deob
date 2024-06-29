import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class690 {

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Ljr;")
    private class112 field9321 = new class112(256);

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lin;")
    private class91 field9317;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "[Lmf;")
    public static class420[] field9322 = new class420[0];

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lej;")
    public static class124 field9320 = new class124(37, 2);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field9314;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field9315;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field9316;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field9319;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field9323;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "[[[Les;")
    public static class384[][][] field9324;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 16)
    public final void method3853(int arg0) {
        field9316++;
        if (arg0 != -1007) {
            this.method3859(14, 98);
        }
        class112 var2 = this.field9321;
        synchronized (this.field9321) {
            this.field9321.method996(arg0 + 883);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V", line = 29)
    public final void method3854(boolean arg0) {
        if (!arg0) {
            field9320 = null;
        }
        class112 var2 = this.field9321;
        synchronized (this.field9321) {
            this.field9321.method999(0);
        }
        field9315++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V", line = 45)
    public static final void method3855(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1007) {
            return;
        }
        if (arg0 == 1009) {
            class83.method784(class531.field7318, arg2, arg1);
        } else if (arg0 == 1012) {
            class83.method784(class608.field8340, arg2, arg1);
        } else if (arg0 == 1002) {
            class83.method784(class466.field6527, arg2, arg1);
        } else if (arg0 == 1003) {
            class83.method784(class682.field9239, arg2, arg1);
        } else if (arg0 == 1006) {
            class83.method784(class442.field6278, arg2, arg1);
        }
        field9314++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V", line = 76)
    public final void method3856(int arg0, int arg1) {
        if (arg1 != 26) {
            return;
        }
        field9318++;
        class112 var3 = this.field9321;
        synchronized (this.field9321) {
            this.field9321.method987(arg1 ^ 0x18, arg0);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V", line = 90)
    public static void method3857(int arg0) {
        field9320 = null;
        if (arg0 != 2) {
            field9324 = null;
        }
        field9324 = null;
        field9322 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lin;BLin;Lin;Lin;)V", line = 102)
    public static final void method3858(class91 arg0, byte arg1, class91 arg2, class91 arg3, class91 arg4) {
        class579.field7942 = arg4;
        field9323++;
        class494.field6843 = arg3;
        class732.field9887 = arg2;
        class396.field5798 = new class378[class732.field9887.method867(-1)][];
        class609.field8353 = new boolean[class732.field9887.method867(-1)];
        int var5 = -72 % ((35 - arg1) / 41);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)Lbda;", line = 121)
    public final class506 method3859(int arg0, int arg1) {
        field9319++;
        int var3 = -128 / ((-arg1 - 3) / 49);
        class112 var4 = this.field9321;
        class506 var5;
        synchronized (this.field9321) {
            var5 = (class506) this.field9321.method992((long) arg0, -101);
        }
        if (var5 != null) {
            return var5;
        }
        class91 var6 = this.field9317;
        byte[] var7;
        synchronized (this.field9317) {
            var7 = this.field9317.method863(-1860, 26, arg0);
        }
        class506 var8 = new class506();
        if (var7 != null) {
            var8.method2973(new class215(var7), (byte) -101);
        }
        class112 var9 = this.field9321;
        synchronized (this.field9321) {
            this.field9321.method991(var8, (long) arg0, (byte) -114);
            return var8;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lsj;ILin;)V", line = 157)
    public class690(class460 arg0, int arg1, class91 arg2) {
        this.field9317 = arg2;
        this.field9317.method860(0, 26);
    }
}
