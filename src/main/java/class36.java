import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public abstract class class36 {

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "Z")
    public static boolean field534 = true;

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "Ler;")
    public static class222 field537 = new class222();

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "[I")
    public static int[] field540 = new int[4096];

    @OriginalMember(owner = "client!rca", name = "j", descriptor = "Lus;")
    public static class328 field542 = new class328(59, 4);

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "I")
    public int field538;

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!rca", name = "i", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "Ljava/lang/String;")
    public String field536;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)V", line = 4)
    public static void method319(byte arg0) {
        field540 = null;
        int var1 = 97 % ((58 - arg0) / 38);
        field537 = null;
        field542 = null;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(II)Ljm;", line = 18)
    public static final class421 method320(int arg0, int arg1) {
        field541++;
        return ~arg1 <= arg0 && arg1 < 100 ? class613.field8483[arg1] : null;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILjo;)V", line = 30)
    public static final void method321(int arg0, class359 arg1) {
        if (arg0 != -101) {
            method320(73, -60);
        }
        field535++;
        arg1.method3409(arg0 - 24);
        boolean var2 = false;
        for (class359 var3 = (class359) class681.field9283.method2565((byte) -41); var3 != null; var3 = (class359) class681.field9283.method2568(-31355)) {
            if (class415.method2470(var3.method2201((byte) 42), arg1.method2201((byte) -98), arg0 + 101)) {
                class736.method4130(arg1, arg0 + 112, var3);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class681.field9283.method2564(arg1, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(B)Ljava/net/Socket;", line = 69)
    public final Socket method322(byte arg0) throws IOException {
        if (arg0 < 125) {
            return null;
        } else {
            field533++;
            return new Socket(this.field536, this.field538);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method323(int arg0) throws IOException;
}
