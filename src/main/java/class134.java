import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class134 extends OutputStream {

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field1955 = -1;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1961 = " has logged in.";

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Lph;")
    public static class361 field1956;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "[I")
    public static int[] field1954;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 6)
    public static void method959(int arg0) {
        field1956 = null;
        if (arg0 != 1536) {
            method959(72);
        }
        field1961 = null;
        field1954 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lgj;I)V", line = 21)
    public static final void method960(class333 arg0, int arg1) {
        field1953++;
        int var2 = arg0.field5136 - class304.field4560;
        if (arg1 != -26090) {
            method962((byte) 122, (class359) null);
        }
        int var3 = arg0.field5173 * 128 + (arg0.method1700(arg1 ^ 0x658E) * 64);
        int var4 = arg0.field5095 * 128 + arg0.method1700(-128) * 64;
        arg0.field5137 += (var3 - arg0.field5137) / var2;
        arg0.field5158 = 0;
        if (arg0.field5163 == 0) {
            arg0.field5089 = 1024;
        }
        if (arg0.field5163 == 1) {
            arg0.field5089 = 1536;
        }
        if (arg0.field5163 == 2) {
            arg0.field5089 = 0;
        }
        if (arg0.field5163 == 3) {
            arg0.field5089 = 512;
        }
        arg0.field5165 += (var4 - arg0.field5165) / var2;
    }

    @OriginalMember(owner = "client!f", name = "write", descriptor = "(I)V", line = 63)
    public final void write(int arg0) throws IOException {
        field1958++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V", line = 74)
    public static final void method961(int arg0, byte arg1) {
        field1959++;
        class239.field3558.method464(3398, arg0);
        if (arg1 >= 48) {
            class314.field4673.method464(3398, arg0);
            class316.field4694.method464(3398, arg0);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLqf;)V", line = 87)
    public static final void method962(byte arg0, class359 arg1) {
        field1952++;
        class359 var2 = class257.method1891(arg1, arg0 - 64);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class286.field4312;
            var4 = class19.field301;
        } else {
            var3 = var2.field5506;
            var4 = var2.field5560;
        }
        class251.method1842(var4, false, -90, var3, arg1);
        if (arg0 != 66) {
            field1961 = (String) null;
        }
        class358.method2483(false, var3, arg1, var4);
    }
}
