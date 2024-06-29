import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class339 extends class242 {

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lpg;")
    public static class492 field5361 = null;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Ler;")
    public static class157 field5359 = new class157(10);

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Lbp;")
    public static class322 field5365;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Lns;")
    public static class438 field5360;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Lns;")
    public static class438 field5362;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lns;BI)Ljt;")
    public static final class443 method2190(class438 arg0, byte arg1, int arg2) {
        field5366++;
        if (arg1 <= 61) {
            field5363 = 32;
        }
        byte[] var3 = arg0.method2638(true, arg2);
        return var3 == null ? null : new class443(var3);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method2191(int arg0) {
        field5365 = null;
        field5360 = null;
        field5361 = null;
        field5359 = null;
        if (arg0 != -28838) {
            method2191(66);
        }
        field5362 = null;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)Llr;")
    public abstract class237 method445(byte arg0);
}
