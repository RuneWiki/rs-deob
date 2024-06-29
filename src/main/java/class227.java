import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class227 {

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Lfa;")
    private class156 field3313 = new class156(128);

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lfs;")
    private class387 field3311;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field3312 = 205;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lbg;")
    public static class324 field3308 = new class324(38, 1);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Lsb;")
    public static class191 field3309;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method1534(int arg0) {
        field3308 = null;
        field3309 = null;
        if (arg0 != 1) {
            method1534(-122);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Lqu;")
    public final class64 method1535(int arg0, int arg1) {
        int var3 = 125 % ((-arg1 - 38) / 46);
        field3307++;
        class156 var4 = this.field3313;
        class64 var5;
        synchronized (this.field3313) {
            var5 = (class64) this.field3313.method1115((long) arg0, (byte) 58);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field3311.method2363(class7.method50(arg0, false), class299.method1876(false, arg0), 125);
        class64 var7 = new class64();
        if (var6 != null) {
            var7.method570(19207, new class65(var6));
        }
        class156 var8 = this.field3313;
        synchronized (this.field3313) {
            this.field3313.method1107(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Ljk;ILfs;)V")
    public class227(class446 arg0, int arg1, class387 arg2) {
        this.field3311 = arg2;
        if (this.field3311 != null) {
            int var4 = this.field3311.method2359((byte) 39) - 1;
            this.field3311.method2367(var4, 28724);
        }
    }
}
