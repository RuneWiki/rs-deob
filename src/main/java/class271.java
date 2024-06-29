import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class271 extends OutputStream {

    @OriginalMember(owner = "client!il", name = "d", descriptor = "Llc;")
    public static class435 field3849 = new class435(16, 6);

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field3852;

    @OriginalMember(owner = "client!il", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field3846++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BILaj;I)V")
    public static final void method1770(byte arg0, int arg1, class194 arg2, int arg3) {
        field3850++;
        if (!class147.field2154) {
            return;
        }
        int var4 = 0;
        for (class304 var5 = (class304) arg2.field2841.method3025(false); var5 != null; var5 = (class304) arg2.field2841.method3026(true)) {
            int var10 = class380.method2355(var5, 100);
            if (var10 > var4) {
                var4 = var10;
            }
        }
        var4 += 8;
        class702.field9898 = arg2.field2845 * 16 + (class404.field5765 ? 26 : 22);
        int var6 = arg2.field2845 * 16 + 21;
        int var7 = class314.field4246 + class132.field1820;
        if ((var7 + var4) > class68.field1042) {
            var7 = class132.field1820 - var4;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = class404.field5765 ? 33 : 31;
        int var9 = arg1 + 13 - var8;
        if (arg0 > -100) {
            method1771(98);
        }
        if (var6 + var9 > class565.field8187) {
            var9 = class565.field8187 - var6;
        }
        class327.field4441 = var7;
        if (var9 < 0) {
            var9 = 0;
        }
        class90.field1279 = var9;
        class537.field7799 = arg2;
        class666.field9521 = var4;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method1771(int arg0) {
        if (arg0 != 31) {
            method1771(-97);
        }
        field3852 = null;
        field3849 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;IC)I")
    public static final int method1772(String arg0, int arg1, char arg2) {
        field3848++;
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = arg1; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg2) {
                var3++;
            }
        }
        return var3;
    }
}
