import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class275 extends OutputStream {

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(CII)I")
    public static final int method1605(char arg0, int arg1, int arg2) {
        field3222++;
        if (arg2 != 0) {
            return 120;
        }
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var4 = Character.toLowerCase(arg0);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static final void method1606(int arg0) {
        field3224++;
        int var1 = class235.field2787;
        int[] var2 = class75.field1040;
        for (int var3 = 0; var3 < var1; var3++) {
            class521 var9 = class61.field825[var2[var3]];
            if (var9 != null && var9.field3437 > 0) {
                var9.field3437--;
                if (var9.field3437 == 0) {
                    var9.field3381 = null;
                }
            }
        }
        for (int var4 = arg0; var4 < class3.field42; var4++) {
            long var5 = (long) class2.field29[var4];
            class273 var7 = (class273) class30.field444.method2121(58, var5);
            if (var7 != null) {
                class388 var8 = var7.field3210;
                if (var8.field3437 > 0) {
                    var8.field3437--;
                    if (var8.field3437 == 0) {
                        var8.field3381 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static final void method1607(int arg0) {
        class17.field308.method1690(0);
        if (arg0 != -1) {
            method1606(117);
        }
        field3220++;
    }

    @OriginalMember(owner = "client!uk", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field3221++;
        throw new IOException();
    }
}
