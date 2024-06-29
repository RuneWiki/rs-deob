import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class473 {

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public int field6477;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public int field6480;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public int field6481;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public int field6482;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "Lkc;")
    public static class655 field6483;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V", line = 12)
    public static void method2811(byte arg0) {
        int var1 = -54 / ((arg0 - 8) / 58);
        field6483 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[SB)[S", line = 25)
    public static final short[] method2812(int arg0, short[] arg1, byte arg2) {
        field6478++;
        short[] var3 = new short[arg0];
        if (arg2 != 55) {
            method2811((byte) -97);
        }
        class34.method241(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBLjava/io/File;)[B", line = 39)
    public static final byte[] method2813(int arg0, byte arg1, File arg2) {
        field6479++;
        try {
            byte[] var3 = new byte[arg0];
            if (arg1 != -60) {
                field6483 = null;
            }
            class162.method1012(arg1 - 17904, var3, arg2, arg0);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }
}
