import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class418 {

    @OriginalMember(owner = "client!et", name = "h", descriptor = "Llh;")
    private class364 field6174 = new class364(64);

    @OriginalMember(owner = "client!et", name = "i", descriptor = "Lhh;")
    private class84 field6175;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "Ljava/lang/String;")
    public static String field6169 = null;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "I")
    public static int field6176 = -1;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "Lgf;")
    public static class180 field6170 = new class180("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "Lcc;")
    public static class511 field6177;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
    public final void method2568(int arg0) {
        if (arg0 != -1997) {
            method2572((byte) 31, -17, null);
        }
        class364 var2 = this.field6174;
        synchronized (this.field6174) {
            this.field6174.method2350((byte) 112);
        }
        field6168++;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
    public final void method2569(boolean arg0) {
        class364 var2 = this.field6174;
        synchronized (this.field6174) {
            this.field6174.method2349(0);
        }
        if (arg0) {
            field6167++;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BI)Lhc;")
    public final class93 method2570(byte arg0, int arg1) {
        if (arg0 != -32) {
            return null;
        }
        field6172++;
        class364 var3 = this.field6174;
        class93 var4;
        synchronized (this.field6174) {
            var4 = (class93) this.field6174.method2339(-103, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6175.method683(11, arg1, 5);
        class93 var6 = new class93();
        if (var5 != null) {
            var6.method752(arg0 + 34, new class303(var5));
        }
        class364 var7 = this.field6174;
        synchronized (this.field6174) {
            this.field6174.method2342((long) arg1, var6, 21);
            return var6;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)V")
    public final void method2571(int arg0, int arg1) {
        class364 var3 = this.field6174;
        synchronized (this.field6174) {
            this.field6174.method2348(arg0, 70);
        }
        if (arg1 != 64) {
            method2573(false);
        }
        field6171++;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method2572(byte arg0, int arg1, String arg2) {
        field6173++;
        class434 var3 = class483.method2888(arg1, 114, 3);
        var3.method2632((byte) 81);
        if (arg0 != -6) {
            method2573(true);
        }
        var3.field6318 = arg2;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)V")
    public static void method2573(boolean arg0) {
        if (arg0) {
            method2572((byte) -54, -15, null);
        }
        field6170 = null;
        field6169 = null;
        field6177 = null;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lmt;ILhh;)V")
    public class418(class271 arg0, int arg1, class84 arg2) {
        this.field6175 = arg2;
        if (this.field6175 != null) {
            this.field6175.method656((byte) 122, 11);
        }
    }
}
