import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class345 {

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Ldp;")
    public static class347 field5327 = new class347("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "Laa;")
    public static class76 field5330 = new class76(42, 15);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Lla;")
    public static class307 field5325;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Lpi;")
    public class345 field5323;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Lpi;")
    public class345 field5324;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
    public static final void method2095(int arg0, int arg1, int arg2) {
        field5328++;
        class506 var3 = class14.method185(-1304589728, arg0, arg1);
        var3.method2992(0);
        var3.field7442 = arg2;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public final void method2096(byte arg0) {
        field5329++;
        if (this.field5324 == null) {
            return;
        }
        this.field5324.field5323 = this.field5323;
        if (arg0 < 65) {
            method2095(71, 79, -70);
        }
        this.field5323.field5324 = this.field5324;
        this.field5323 = null;
        this.field5324 = null;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
    public static void method2097(byte arg0) {
        int var1 = 106 % ((-arg0 - 2) / 62);
        field5330 = null;
        field5325 = null;
        field5327 = null;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)I")
    public static final int method2098(byte arg0) {
        field5326++;
        class382 var1 = class169.field2484;
        synchronized (class169.field2484) {
            int var2 = -39 / ((arg0 + 51) / 47);
            return class169.field2484.method2282(true);
        }
    }
}
