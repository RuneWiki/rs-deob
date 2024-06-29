import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class637 {

    @OriginalMember(owner = "client!ft", name = "H", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field464 = new Hashtable();

    @OriginalMember(owner = "client!ft", name = "E", descriptor = "B")
    public byte field461;

    @OriginalMember(owner = "client!ft", name = "B", descriptor = "F")
    public static float field458;

    @OriginalMember(owner = "client!ft", name = "A", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "client!ft", name = "C", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!ft", name = "D", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!ft", name = "G", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!ft", name = "F", descriptor = "Lqh;")
    public class61 field462;

    @OriginalMember(owner = "client!ft", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field465;

    @OriginalMember(owner = "client!ft", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field466;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILog;[II)V")
    public static final void method234(int arg0, class602 arg1, int[] arg2, int arg3) {
        ++field460;
        if (arg1.field8760 != null) {
            boolean var4 = true;
            for (int var5 = 0; ~arg1.field8760.length < ~var5; ++var5) {
                if (arg1.field8760[var5] != arg2[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg1.field8755 != -1) {
                class138 var6 = class357.field5338.method2099(arg1.field8755, true);
                int var7 = var6.field2434;
                if (var7 == 1) {
                    arg1.field8740 = 1;
                    arg1.field8738 = arg3;
                    arg1.field8741 = 0;
                    arg1.field8677 = 0;
                    arg1.field8722 = 0;
                    class536.method3101(arg1.field8677, (byte) 126, var6, arg1.field9815, arg1.field9806, arg1.field9814, class532.field7456 == arg1);
                }
                if (var7 == 2) {
                    arg1.field8722 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = arg0; arg2.length > var9; ++var9) {
            if (arg2[var9] != -1) {
                var8 = false;
            }
            if (arg1.field8760 == null || ~arg1.field8760[var9] == 0 || ~class357.field5338.method2099(arg2[var9], true).field2441 <= ~class357.field5338.method2099(arg1.field8760[var9], true).field2441) {
                arg1.field8760 = arg2;
                arg1.field8738 = arg3;
                break;
            }
        }
        if (var8) {
            arg1.field8760 = arg2;
            arg1.field8738 = arg3;
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)[B")
    public final byte[] method235(byte arg0) {
        if (arg0 > -73) {
            method234(5, (class602) null, (int[]) null, 65);
        }
        ++field463;
        if (!super.field9179 && this.field462.field1393 >= this.field462.field1397.length - this.field461) {
            return this.field462.field1397;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "(I)V")
    public static void method236(int arg0) {
        field464 = null;
        field465 = null;
        field466 = null;
        if (arg0 != 1) {
            method236(74);
        }
    }

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "(I)I")
    public final int method237(int arg0) {
        ++field459;
        if (this.field462 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                field464 = null;
            }
            return this.field462.field1393 * 100 / (this.field462.field1397.length + -this.field461);
        }
    }
}
