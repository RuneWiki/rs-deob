import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class231 extends class488 {

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "Loj;")
    public static class346 field3288 = new class346(16);

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!fga", name = "g", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Z)I", line = 6)
    public static final int method1461(boolean arg0) {
        field3289++;
        class328 var1 = class44.field661;
        synchronized (class44.field661) {
            if (arg0) {
                field3288 = null;
            }
            return class44.field661.method1992(-91);
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(ILjava/io/File;[BI)V", line = 21)
    public static final void method1462(int arg0, File arg1, byte[] arg2, int arg3) throws IOException {
        field3286++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        try {
            var4.readFully(arg2, arg0, arg3);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)V", line = 38)
    public static void method1463(int arg0) {
        field3288 = null;
        if (arg0 != 21359) {
            field3288 = null;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IBI)Z", line = 54)
    public static final boolean method1464(int arg0, byte arg1, int arg2) {
        field3287++;
        if (arg1 > -10) {
            method1464(-6, (byte) -67, 67);
        }
        return (arg0 & 0x580) != 0;
    }
}
