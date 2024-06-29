import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class753 {

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "Lqj;")
    private class535 field10191 = new class535(16);

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "Luq;")
    private class172 field10195;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "[Z")
    public static boolean[] field10199 = new boolean[100];

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "Lmw;")
    public static class517 field10197 = new class517(63, 8);

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "Ljava/lang/String;")
    public static String field10200 = "";

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field10192;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field10193;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field10194;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public static int field10196;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field10198;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "Lwc;")
    public static class74 field10201;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
    public final void method4127(int arg0) {
        field10194++;
        class535 var2 = this.field10191;
        synchronized (this.field10191) {
            this.field10191.method3113(-127);
            int var3 = -68 / ((-arg0 - 4) / 57);
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V")
    public static void method4128(int arg0) {
        field10201 = null;
        field10199 = null;
        field10197 = null;
        field10200 = null;
        if (arg0 != -4353) {
            field10201 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BI)Lbh;")
    private final class40 method4129(byte arg0, int arg1) {
        field10198++;
        class535 var3 = this.field10191;
        class40 var4;
        synchronized (this.field10191) {
            var4 = (class40) this.field10191.method3109((byte) 111, (long) arg1);
            if (arg0 != -49) {
                this.method4131(-123);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field10195;
        byte[] var6;
        synchronized (this.field10195) {
            var6 = this.field10195.method1188(29, -18047, arg1);
        }
        class40 var7 = new class40();
        if (var6 != null) {
            var7.method229(-94, new class254(var6));
        }
        class535 var8 = this.field10191;
        synchronized (this.field10191) {
            this.field10191.method3108((long) arg1, arg0 + 16386, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V")
    public final void method4130(int arg0, int arg1) {
        field10196++;
        class535 var3 = this.field10191;
        synchronized (this.field10191) {
            this.field10191.method3101(false, arg0);
        }
        if (arg1 != 24814) {
            this.method4131(-4);
        }
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)V")
    public final void method4131(int arg0) {
        field10192++;
        class535 var2 = this.field10191;
        synchronized (this.field10191) {
            if (arg0 != 27439) {
                field10201 = null;
            }
            this.field10191.method3103(arg0 ^ 0xFFFFB8CD);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILtc;IBII)Lfp;")
    public final class342 method4132(int arg0, class371 arg1, int arg2, byte arg3, int arg4, int arg5) {
        field10193++;
        class63[] var7 = null;
        class40 var8 = this.method4129((byte) -49, arg2);
        if (var8.field420 != null) {
            var7 = new class63[var8.field420.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class656 var10 = arg1.method2329(var8.field420[var9], -127);
                var7[var9] = new class63(var10.field8853, var10.field8856, var10.field8852, var10.field8855, var10.field8861, var10.field8860, var10.field8854, var10.field8859);
            }
        }
        if (arg3 != 108) {
            this.method4131(-66);
        }
        return new class342(var8.field421, var7, var8.field419, arg4, arg0, arg5);
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lkw;ILuq;)V")
    public class753(class263 arg0, int arg1, class172 arg2) {
        this.field10195 = arg2;
        this.field10195.method1175(29, (byte) 103);
    }
}
