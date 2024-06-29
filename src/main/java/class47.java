import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class47 extends class119 {

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    private int field672;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    private int field667;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    private int field665;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    private int field664;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "Ljava/lang/String;")
    public static String field661 = "cyan:";

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field658 = 5063219;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "Ljava/lang/String;")
    public static String field662 = "Ok";

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "[Z")
    public static boolean[] field671;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
    public static void method308(boolean arg0) {
        field671 = null;
        field661 = null;
        field662 = null;
        if (!arg0) {
            method312(125, (class267) null);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public static final void method309(int arg0) {
        for (int var1 = arg0; class282.field4501 > var1; ++var1) {
            int var2 = class60.field909[var1];
            class53 var3 = class194.field2777[var2];
            int var4 = class68.field1071.method760(false);
            if ((4 & var4) != 0) {
                var4 += class68.field1071.method760(false) << 8;
            }
            class1.method7(var4, -89, var3, var2);
        }
        ++field660;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V")
    public final void method310(int arg0, int arg1, int arg2) {
        ++field659;
        if (arg2 != -11777) {
            field662 = null;
        }
        int var4 = this.field665 * arg1 >> 12;
        int var5 = this.field672 * arg1 >> 12;
        int var6 = this.field664 * arg0 >> 12;
        int var7 = this.field667 * arg0 >> 12;
        class14.method114(var4, var7, super.field1745, var5, var6, super.field1747, (byte) 109, super.field1749);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBI)V")
    public final void method311(int arg0, byte arg1, int arg2) {
        if (arg1 == 122) {
            ++field670;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(IIIIIII)V")
    public class47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field672 = arg0;
        this.field667 = arg1;
        this.field665 = arg2;
        this.field664 = arg3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILha;)Ljava/lang/String;")
    public static final String method312(int arg0, class267 arg1) {
        ++field657;
        if (arg0 != -1) {
            return null;
        } else if (client.method1439(arg1).method626((byte) 107) == 0) {
            return null;
        } else if (arg1.field4161 != null && ~arg1.field4161.trim().length() != -1) {
            return arg1.field4161;
        } else {
            return class268.field4194 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(III)V")
    public final void method313(int arg0, int arg1, int arg2) {
        ++field669;
        int var4 = this.field665 * arg1 >> 12;
        int var5 = this.field664 * arg2 >> 12;
        int var6 = this.field667 * arg2 >> 12;
        int var7 = this.field672 * arg1 >> 12;
        if (arg0 != -1) {
            this.method310(-95, -103, -115);
        }
        class207.method1337(var4, -44, var5, super.field1745, var6, var7);
    }
}
