import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class17 {

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Lff;")
    private class47 field251 = new class47(256);

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "Lff;")
    private class47 field264 = new class47(256);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "Lrg;")
    private class88 field245;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Lrg;")
    private class88 field250;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "Z")
    public static volatile boolean field254 = true;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field258 = -1;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field259 = 0;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field248 = 0;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "Lve;")
    public static class255 field253 = class87.method607(98, "Titelbild geladen)3");

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "Lve;")
    public static class255 field263 = class87.method607(91, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "Lqi;")
    public static class290 field260;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "Lrg;")
    public static class88 field247;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "Lca;")
    public static class90 field256;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 6)
    public static final void method83(int arg0) {
        class145.field2421.method553(arg0 - 79);
        if (arg0 == -2) {
            field252++;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBLjava/awt/Component;I)Lmd;", line = 18)
    public static final class240 method84(int arg0, byte arg1, Component arg2, int arg3) {
        field255++;
        try {
            Class var4 = Class.forName("mk");
            if (arg1 <= 117) {
                return (class240) null;
            } else {
                class240 var5 = (class240) var4.getDeclaredConstructor().newInstance();
                var5.method1124(arg2, arg3, 25, arg0);
                return var5;
            }
        } catch (Throwable var8) {
            class153 var7 = new class153();
            var7.method1124(arg2, arg3, 25, arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[IIB)Lmi;", line = 58)
    private final class257 method85(int arg0, int[] arg1, int arg2, byte arg3) {
        if (arg3 != 78) {
            field263 = (class255) null;
        }
        field246++;
        int var5 = (arg0 & 0xFFF << 4 | arg0 >>> 12) ^ arg2;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class257 var9 = (class257) this.field264.method280(var7, 29153);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class140 var10 = class140.method1045(this.field250, arg0, arg2);
            if (var10 == null) {
                return null;
            }
            class257 var11 = var10.method1046();
            this.field264.method284(true, var7, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field4383.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([IIII)Lmi;", line = 106)
    private final class257 method86(int[] arg0, int arg1, int arg2, int arg3) {
        field261++;
        int var5 = (arg3 >>> 12 | (arg3 & 0x20000FFF) << 4) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class257 var9 = (class257) this.field264.method280(var7, arg1 + 29153);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            if (arg1 != 0) {
                field248 = -117;
            }
            class52 var10 = (class52) this.field251.method280(var7, 29153);
            if (var10 == null) {
                var10 = class52.method309(this.field245, arg3, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field251.method284(true, var7, var10);
            }
            class257 var11 = var10.method317(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method1502((byte) -82);
                this.field264.method284(true, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[IB)Lmi;", line = 158)
    public final class257 method87(int arg0, int[] arg1, byte arg2) {
        if (arg2 != -10) {
            return (class257) null;
        }
        field262++;
        if (this.field250.method638(-123) == 1) {
            return this.method85(0, arg1, arg0, (byte) 78);
        } else if (this.field250.method617(17374, arg0) == 1) {
            return this.method85(arg0, arg1, 0, (byte) 78);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lrg;Lrg;)V", line = 258)
    public class17(class88 arg0, class88 arg1) {
        this.field245 = arg1;
        this.field250 = arg0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[IZ)Lmi;", line = 192)
    public final class257 method88(int arg0, int[] arg1, boolean arg2) {
        field249++;
        if (arg2) {
            return (class257) null;
        } else if (this.field245.method638(-126) == 1) {
            return this.method86(arg1, 0, arg0, 0);
        } else if (this.field245.method617(17374, arg0) == 1) {
            return this.method86(arg1, 0, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V", line = 216)
    public static void method89(byte arg0) {
        field247 = null;
        field263 = null;
        field256 = null;
        field260 = null;
        field253 = null;
        if (arg0 <= 12) {
            field256 = (class90) null;
        }
    }
}
