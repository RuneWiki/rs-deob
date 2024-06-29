import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public abstract class class180 {

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "Lqk;")
    public static class1 field2277 = new class1(59, -1);

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "Ljn;")
    public static class134 field2282 = new class134(19, 6);

    @OriginalMember(owner = "client!waa", name = "j", descriptor = "I")
    public static int field2283 = 1;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
    public int field2275;

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "I")
    public int field2279;

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "I")
    public int field2280;

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!waa", name = "k", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!waa", name = "l", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILgga;)Lhu;")
    public static final class702 method1144(int arg0, class511 arg1) {
        field2285++;
        class406 var2 = class41.method324(false, arg1);
        if (arg0 != -20194) {
            field2283 = -52;
        }
        int var3 = arg1.method3008(arg0 ^ 0xFFFFB15E);
        int var4 = arg1.method3008(64);
        return new class702(var2.field5719, var2.field5716, var2.field5717, var2.field5715, var2.field5723, var2.field5722, var2.field5724, var2.field5721, var2.field5720, var3, var4);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)Z")
    public final boolean method1145(byte arg0) {
        field2276++;
        if (arg0 <= 123) {
            this.method1150(8);
        }
        return (this.field2275 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)Z")
    public final boolean method1146(boolean arg0) {
        field2281++;
        if (arg0) {
            return (this.field2275 & 0x8) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(Z)V")
    public static final void method1147(boolean arg0) {
        field2284++;
        for (int var1 = 0; var1 < 5; var1++) {
            class412.field5778[var1] = false;
        }
        class426.field5952 = 0;
        class53.field642 = 0;
        if (arg0) {
            return;
        }
        class70.field769 = -1;
        class362.field5225 = -1;
        class5.field30 = -1;
        class377.field5409 = -1;
        class695.field9691 = 1;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)Z")
    public final boolean method1148(int arg0) {
        field2274++;
        if (arg0 == -8909) {
            return (this.field2275 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)V")
    public static void method1149(int arg0) {
        if (arg0 != 1024) {
            method1149(-3);
        }
        field2277 = null;
        field2282 = null;
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "(I)Z")
    public final boolean method1150(int arg0) {
        field2278++;
        if (arg0 != -1) {
            this.field2275 = 7;
        }
        return (this.field2275 & 0x2) != 0;
    }
}
