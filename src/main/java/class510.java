import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class510 extends class452 {

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public int field7191;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public int field7189;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public int field7183;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public int field7181;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    public int field7188;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public int field7184;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field7185 = 0;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "Lnd;")
    public static class547 field7192;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Lhm;")
    public class223 method29(int arg0) {
        field7187++;
        if (arg0 != -200) {
            this.field7184 = -110;
        }
        return class218.field2939;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZII)Ljk;")
    public static final class635 method2982(boolean arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method2982(true, -42, 125);
        }
        field7186++;
        class23[] var3 = class429.field5740;
        synchronized (class429.field5740) {
            class635 var4;
            if (arg2 >= class429.field5740.length || class429.field5740[arg2].method164((byte) -114)) {
                var4 = new class635();
                var4.field8760 = new class314[arg2];
                for (int var5 = 0; var5 < arg2; var5++) {
                    var4.field8760[var5] = new class314();
                }
            } else {
                var4 = (class635) class429.field5740[arg2].method159((byte) -88);
                var4.method3835(0);
                int var10002 = class558.field7766[arg2]--;
            }
            var4.field8759 = arg0;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static void method2983(byte arg0) {
        field7192 = null;
        if (arg0 > -97) {
            method2982(false, -116, -74);
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Leha;Loea;IIIIIIIIIIIII)V")
    public class510(class91 arg0, class599 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7191 = arg10;
        this.field7189 = arg14;
        this.field7183 = arg9;
        this.field7181 = arg12;
        this.field7188 = arg13;
        this.field7184 = arg11;
    }
}
