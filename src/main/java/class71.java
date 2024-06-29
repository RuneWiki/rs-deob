import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class71 {

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "[B")
    private byte[] field1218 = new byte[4];

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "Lca;")
    private class22 field1222;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    private int field1216;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "J")
    private long field1221;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Lai;")
    public static class10 field1214 = class44.method278("gr-Un:", -63);

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "[I")
    public static int[] field1220 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lai;")
    public static class10 field1219 = class44.method278("<img=1>", -114);

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1212 = Calendar.getInstance();

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field1227 = 0;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field1228 = 0;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1217;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "[B")
    private byte[] field1215;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "[I")
    public static int[] field1226;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)[B")
    public final byte[] method451(boolean arg0) throws IOException {
        field1224++;
        if (!arg0) {
            return null;
        } else if (this.field1221 < class80.method491(2)) {
            throw new IOException("fdt");
        } else {
            if (this.field1216 == 0) {
                if (this.field1222.field352 == 2) {
                    throw new IOException("fds");
                }
                if (this.field1222.field352 == 1) {
                    this.field1217 = (DataInputStream) this.field1222.field353;
                    this.field1216 = 1;
                }
            }
            if (this.field1216 == 1) {
                int var2 = this.field1217.available();
                if (var2 > 0) {
                    if (this.field1213 + var2 > 4) {
                        var2 = 4 - this.field1213;
                    }
                    this.field1213 += this.field1217.read(this.field1218, this.field1213, var2);
                    if (this.field1213 == 4) {
                        int var3 = (new class114(this.field1218)).method761(255);
                        this.field1215 = new byte[var3];
                        this.field1216 = 2;
                    }
                }
            }
            if (this.field1216 == 2) {
                int var4 = this.field1217.available();
                if (var4 > 0) {
                    if (this.field1215.length < this.field1223 + var4) {
                        var4 = this.field1215.length - this.field1223;
                    }
                    this.field1223 += this.field1217.read(this.field1215, this.field1223, var4);
                    if (this.field1215.length == this.field1223) {
                        return this.field1215;
                    }
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method452(int arg0) {
        field1220 = null;
        if (arg0 != 4) {
            method452(-76);
        }
        field1219 = null;
        field1226 = null;
        field1212 = null;
        field1214 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static final void method453(byte arg0) {
        class37.field584 = 0;
        class162.field3111 = -1;
        class37.field585 = 0;
        class76.field1323.field2170 = 0;
        class101.field1890 = -1;
        class53.field946 = 0;
        class98.field1818 = -1;
        field1211++;
        class126.field2404 = 0;
        class157.field3032 = -1;
        class169.field3270 = 0;
        class154.field2972 = 0;
        class74.field1273.field2170 = 0;
        class180.field3415 = false;
        for (int var1 = 0; var1 < class2.field10.length; var1++) {
            if (class2.field10[var1] != null) {
                class2.field10[var1].field1130 = -1;
            }
        }
        for (int var2 = 0; var2 < class168.field3249.length; var2++) {
            if (class168.field3249[var2] != null) {
                class168.field3249[var2].field1130 = -1;
            }
        }
        class44.method276(115);
        class111.method710(103, 30);
        int var3 = 99 % ((arg0 + 3) / 49);
        for (int var4 = 0; var4 < 100; var4++) {
            class98.field1810[var4] = true;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lih;Ljava/net/URL;)V")
    public class71(class81 arg0, URL arg1) {
        this.field1222 = arg0.method501(0, arg1);
        this.field1216 = 0;
        this.field1221 = class80.method491(2) + 30000L;
    }
}
