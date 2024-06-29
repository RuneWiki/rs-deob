import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class388 extends class467 {

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public int field5891;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    public int field5894;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Lpg;")
    public static class492 field5890 = new class492(14, 5);

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "[[B")
    public static byte[][] field5893;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)Z")
    public final boolean method2391(byte arg0) {
        if (arg0 >= -101) {
            this.field5891 = -8;
        }
        field5892++;
        return (this.field5891 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lns;Lns;I)V")
    public static final void method2392(class438 arg0, class438 arg1, int arg2) {
        field5898++;
        class140.field2034 = arg1;
        if (arg2 == -20955) {
            class339.field5362 = arg0;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)I")
    public final int method2393(int arg0) {
        field5889++;
        if (arg0 != -336834766) {
            this.method2398(-11, 47);
        }
        return (this.field5891 & 0x1F87B2) >> 18;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)I")
    public final int method2394(boolean arg0) {
        field5888++;
        if (!arg0) {
            this.method2396(92);
        }
        return class75.method496(261573, this.field5891);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V")
    public static void method2395(byte arg0) {
        if (arg0 != 54) {
            field5890 = null;
        }
        field5890 = null;
        field5893 = null;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)Z")
    public final boolean method2396(int arg0) {
        if (arg0 == 21565) {
            field5895++;
            return (this.field5891 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)Z")
    public final boolean method2397(int arg0) {
        if (arg0 <= 64) {
            this.method2393(11);
        }
        field5897++;
        return ((this.field5891 & 0x431C87) >> 22) != 0;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(II)V")
    public class388(int arg0, int arg1) {
        this.field5891 = arg0;
        this.field5894 = arg1;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Z")
    public final boolean method2398(int arg0, int arg1) {
        if (arg1 != -27896) {
            field5893 = null;
        }
        field5896++;
        return (this.field5891 >> arg0 + 1 & 0x1) != 0;
    }
}
