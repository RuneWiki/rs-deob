import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class306 {

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public int field5235;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public int field5231;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public int field5240;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public int field5241;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field5228 = -1;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "Lok;")
    public static class146 field5229 = class235.method1724(-12908, "k");

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field5236 = 0;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "Lok;")
    public static class146 field5239 = class235.method1724(-12908, "Chargement de RuneScape en cours )2 veuillez patienter)3)3)3");

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Lok;")
    public static class146 field5232 = class235.method1724(-12908, "::noclip");

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lr;I)Lr;", line = 13)
    public static final class264 method2153(class264 arg0, int arg1) {
        if (arg1 != -5484) {
            return (class264) null;
        }
        class264 var2 = client.method1792(arg0);
        if (var2 == null) {
            var2 = arg0.field4464;
        }
        field5227++;
        return var2;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 40)
    public static void method2154(int arg0) {
        field5232 = null;
        if (arg0 == -7823) {
            field5239 = null;
            field5229 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)I", line = 53)
    public static final int method2155(boolean arg0, int arg1) {
        if (!arg0) {
            method2153((class264) null, -79);
        }
        field5234++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lgm;", line = 65)
    public static final class287 method2156(int arg0, int arg1) {
        field5233++;
        class287 var2 = (class287) class202.field3361.method799((byte) 52, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 < 117) {
            return (class287) null;
        } else {
            byte[] var3 = class182.field3049.method92(class165.method1284(arg1, -24867), 0, class199.method1529(arg1, 26251));
            class287 var4 = new class287();
            if (var3 != null) {
                var4.method2064(new class47(var3), -106);
            }
            var4.method2063((byte) -23);
            class202.field3361.method797(var4, 0, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZLjava/lang/Object;Z)[B", line = 105)
    public static final byte[] method2157(boolean arg0, Object arg1, boolean arg2) {
        field5237++;
        if (arg1 == null) {
            return null;
        } else if ((arg1 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg1);
            return arg2 ? class277.method2015(var4, 0) : var4;
        } else if ((arg1 instanceof class238)) {
            class238 var3 = (class238) arg1;
            return var3.method496(110);
        } else if (arg0) {
            return (byte[]) null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V", line = 157)
    public class306() {
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lak;)V", line = 159)
    public class306(class306 arg0) {
        this.field5235 = arg0.field5235;
        this.field5231 = arg0.field5231;
        this.field5240 = arg0.field5240;
        this.field5241 = arg0.field5241;
    }
}
