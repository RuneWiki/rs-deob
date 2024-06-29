import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class374 {

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "Lcr;")
    public static class189 field5442 = new class189(8);

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public int field5436;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public int field5437;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public int field5438;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public int field5439;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public int field5440;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public int field5444;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public int field5445;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "Ljava/awt/Frame;")
    public static Frame field5447;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "[B")
    public byte[] field5434;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "[B")
    public byte[] field5441;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method2419(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != -9) {
            field5446 = -41;
        }
        if (arg7 >= class87.field1227 && class299.field4382 >= arg7 && class87.field1227 <= arg3 && class299.field4382 >= arg3 && class87.field1227 <= arg8 && class299.field4382 >= arg8 && arg9 >= class87.field1227 && class299.field4382 >= arg9 && class379.field5521 <= arg1 && class125.field1751 >= arg1 && arg0 >= class379.field5521 && class125.field1751 >= arg0 && arg6 >= class379.field5521 && arg6 <= class125.field1751 && class379.field5521 <= arg4 && class125.field1751 >= arg4) {
            class416.method2649(arg1, arg7, arg6, arg2, arg3, arg9, arg0, arg4, arg8, true);
        } else {
            class282.method1944(arg4, arg8, arg0, arg3, arg6, arg7, 1, arg2, arg1, arg9);
        }
        field5443++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
    public static void method2420(boolean arg0) {
        if (arg0) {
            field5442 = null;
            field5447 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III[B)Ljava/lang/String;")
    public static final String method2421(int arg0, int arg1, int arg2, byte[] arg3) {
        field5435++;
        char[] var4 = new char[arg2];
        int var5 = arg0;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg3[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class451.field6586[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }
}
