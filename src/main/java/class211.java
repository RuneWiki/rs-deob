import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class211 {

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public int field2804;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public int field2805;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IZI)Lev;", line = 4)
    public static final class593 method1335(int arg0, boolean arg1, int arg2) {
        field2808++;
        class593 var3 = new class593();
        if (!arg1) {
            method1338(null, -108);
        }
        var3.field8184 = -1;
        var3.field8171 = arg0 + 5 + 1;
        var3.field8185 = arg2 + 5 + 1;
        var3.field8177 = -1;
        var3.field8191 = new int[var3.field8171][var3.field8185];
        var3.method3281(0);
        return var3;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B[Lwv;I)V", line = 26)
    public static final void method1336(byte arg0, class423[] arg1, int arg2) {
        field2807++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class423 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field5598 == 0) {
                    if (var4.field5647 != null) {
                        method1336((byte) 80, var4.field5647, arg2);
                    }
                    class137 var5 = (class137) class152.field2079.method3057(1, (long) var4.field5685);
                    if (var5 != null) {
                        class367.method2131(var5.field1870, arg2, arg0 - 1156546120);
                    }
                }
                if (arg2 == 0 && var4.field5713 != null) {
                    class274 var6 = new class274();
                    var6.field3639 = var4.field5713;
                    var6.field3644 = var4;
                    class656.method3743(var6);
                }
                if (arg2 == 1 && var4.field5579 != null) {
                    if (var4.field5610 >= 0) {
                        class423 var7 = class592.method3271(var4.field5685, (byte) -119);
                        if (var7 == null || var7.field5647 == null || var4.field5610 >= var7.field5647.length || var7.field5647[var4.field5610] != var4) {
                            continue;
                        }
                    }
                    class274 var8 = new class274();
                    var8.field3644 = var4;
                    var8.field3639 = var4.field5579;
                    class656.method3743(var8);
                }
            }
        }
        if (arg0 == 80) {
            ;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lio;I)V", line = 95)
    public final void method1337(class157 arg0, int arg1) {
        if (arg1 != 0) {
            this.field2806 = -19;
        }
        field2803++;
        while (true) {
            int var3 = arg0.method930(255);
            if (var3 == 0) {
                return;
            }
            this.method1339(var3, arg1 - 30, arg0);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/awt/Component;I)Lsc;", line = 126)
    public static final class360 method1338(Component arg0, int arg1) {
        int var2 = -71 / ((-arg1 - 47) / 43);
        field2809++;
        return new class505(arg0);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IILio;)V", line = 136)
    private final void method1339(int arg0, int arg1, class157 arg2) {
        if (arg1 > -1) {
            return;
        }
        field2810++;
        if (arg0 == 1) {
            this.field2806 = arg2.method963(-122);
            this.field2804 = arg2.method930(255);
            this.field2805 = arg2.method930(255);
        }
    }
}
