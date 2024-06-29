import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class13 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Lmc;")
    public static class75 field251 = class30.method234(true, "backleft2");

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field254 = 0;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lmc;")
    public static class75 field252 = class30.method234(true, "welle:");

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field257 = 2;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field256 = 0;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(JI)V", line = 22)
    public static final void method86(long arg0, int arg1) {
        field255++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg1 != 1) {
            field256 = 23;
        }
        if (arg0 % 10L == 0L) {
            class63.method556((byte) -127, arg0 - 1L);
            class63.method556((byte) -127, 1L);
        } else {
            class63.method556((byte) -127, arg0);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[B)[B", line = 51)
    public static final byte[] method87(int arg0, byte[] arg1) {
        field253++;
        if (arg0 > -19) {
            field254 = -34;
        }
        class61 var2 = new class61(arg1);
        int var3 = var2.method494(20471);
        int var4 = var2.method496((byte) 122);
        if (var4 < 0 || class128.field3129 != 0 && var4 > class128.field3129) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method525(var8, 3, 0, var4);
            return var8;
        } else {
            int var5 = var2.method496((byte) 122);
            if (var5 < 0 || class128.field3129 != 0 && var5 > class128.field3129) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class115.method924(var6, var5, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var7 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var7.readFully(var6);
                    var7.close();
                } catch (IOException var9) {
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 113)
    public static void method88(byte arg0) {
        field251 = null;
        int var1 = 52 % ((-arg0 - 38) / 43);
        field252 = null;
    }
}
