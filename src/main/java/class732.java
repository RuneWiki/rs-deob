import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class732 {

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field10143 = 0;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public int field10139;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field10142;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field10144;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Ljava/lang/String;")
    public String field10140;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "[Lmm;")
    public static class281[] field10141;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Ljava/net/Socket;", line = 12)
    public final Socket method4098(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field10139 = -77;
        }
        field10144++;
        return new Socket(this.field10140, this.field10139);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IJ)V", line = 23)
    public static final void method4099(int arg0, long arg1) {
        field10142++;
        int var3 = class472.field6475.field3505 + class356.field4996;
        int var4 = class171.field2622 + class472.field6475.field3502;
        if (class425.field5854 - var3 < -2000 || (class425.field5854 - var3) > 2000 || (class116.field1879 - var4) < -2000 || class116.field1879 - var4 > 2000) {
            class425.field5854 = var3;
            class116.field1879 = var4;
        }
        if (class425.field5854 != var3) {
            int var5 = var3 - class425.field5854;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class425.field5854 += var6;
        }
        if (class116.field1879 != var4) {
            int var7 = var4 - class116.field1879;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class116.field1879 += var8;
        }
        class578.field7586 += (float) arg1 * class394.field5492 / 6.0F;
        if (arg0 < 5) {
            field10143 = 36;
        }
        class547.field7230 += (float) arg1 * class528.field7009 / 6.0F;
        class614.method3341(84);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 111)
    public static void method4100(int arg0) {
        int var1 = 22 / ((-arg0 - 7) / 57);
        field10141 = null;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method788(int arg0) throws IOException;
}
