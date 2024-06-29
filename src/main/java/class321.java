import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class321 extends class183 {

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "[Z")
    public static boolean[] field4290 = new boolean[100];

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "Lph;")
    public static class114 field4295 = new class114(64);

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "[I")
    public static int[] field4296 = new int[13];

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public int field4288;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public int field4291;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public int field4294;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "Lai;")
    public class128 field4289;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "Lam;")
    public static class286 field4297;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "[Lpf;")
    public class447[] field4293;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field4298;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)Lbk;")
    public static final class32 method1849(int arg0, byte arg1) {
        field4287++;
        if (arg1 < 32) {
            method1849(126, (byte) -109);
        }
        class114 var2 = class374.field5258;
        class32 var3;
        synchronized (class374.field5258) {
            var3 = (class32) class374.field5258.method616(122, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class421.field6184.method1687(class396.method2480(arg0, 0), class123.method667(-27869, arg0), 255);
        class32 var5 = new class32();
        if (var4 != null) {
            var5.method154(new class250(var4), -1);
        }
        class114 var6 = class374.field5258;
        synchronized (class374.field5258) {
            class374.field5258.method615((byte) -112, (long) arg0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILvm;II)Z")
    public final boolean method1850(int arg0, class322 arg1, int arg2, int arg3) {
        field4292++;
        if (this.field4293 != null) {
            for (int var5 = 0; var5 < this.field4293.length; var5++) {
                if (this.field4293[var5].method2764(arg2, arg3) && this.field4289.method344(-23563, arg2, arg3, arg1)) {
                    return true;
                }
            }
        }
        if (arg0 <= 104) {
            method1849(65, (byte) -52);
        }
        return false;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V")
    public static void method1851(int arg0) {
        field4298 = null;
        field4296 = null;
        field4297 = null;
        field4295 = null;
        if (arg0 != 13) {
            method1849(-27, (byte) -81);
        }
        field4290 = null;
    }
}
