import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class class28 {

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "Lt;")
    public static class31 field315 = class14.method84(125, "Fishing Shop");

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "Lt;")
    public static class31 field314 = class14.method84(109, "Dairy Churn");

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "I")
    public static int field316 = 0;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "Ls;")
    public static class30 field313;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Lt;ILt;Lca;)[Lha;", line = 8)
    public static final class15[] method173(class31 arg0, int arg1, class31 arg2, class6 arg3) {
        if (arg1 >= -24) {
            field314 = null;
        }
        int var4 = arg3.method32(arg0, true);
        int var5 = arg3.method36(var4, false, arg2);
        return class19.method107(var4, -74, var5, arg3);
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I)V", line = 40)
    public static void method174(int arg0) {
        field313 = null;
        field315 = null;
        field314 = null;
        if (arg0 != 0) {
            field316 = -85;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I[B)[B", line = 54)
    public static final byte[] method175(int arg0, byte[] arg1) {
        class19 var2 = new class19(arg1);
        int var3 = var2.method110((byte) -73);
        int var4 = var2.method109((byte) -45);
        if (var4 < 0 || class14.field106 != 0 && var4 > class14.field106) {
            throw new RuntimeException();
        } else if (arg0 > -25) {
            return (byte[]) null;
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method103(0, var5, 21451, var4);
            return var5;
        } else {
            int var6 = var2.method109((byte) -45);
            if (var6 < 0 || class14.field106 != 0 && var6 > class14.field106) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class21.method124(var7, var6, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var10) {
                }
            }
            return var7;
        }
    }
}
