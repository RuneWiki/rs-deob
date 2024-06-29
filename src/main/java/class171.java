import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class171 {

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
    private int field2415 = -1;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    private int field2417 = 0;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "Ldc;")
    private class302 field2409 = new class302();

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "Z")
    public boolean field2418 = false;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    private int field2414;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    private int field2412;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "[Lwb;")
    private class515[] field2408;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "[[I")
    private int[][] field2413;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)[I")
    public final int[] method1185(int arg0, int arg1) {
        if (arg1 >= -91) {
            this.field2414 = -78;
        }
        field2410++;
        if (this.field2414 == this.field2412) {
            this.field2418 = this.field2408[arg0] == null;
            this.field2408[arg0] = class414.field6131;
            return this.field2413[arg0];
        } else if (this.field2412 == 1) {
            this.field2418 = this.field2415 != arg0;
            this.field2415 = arg0;
            return this.field2413[0];
        } else {
            class515 var3 = this.field2408[arg0];
            if (var3 == null) {
                this.field2418 = true;
                if (this.field2417 < this.field2412) {
                    var3 = new class515(arg0, this.field2417);
                    this.field2417++;
                } else {
                    class515 var4 = (class515) this.field2409.method1906((byte) 111);
                    var3 = new class515(arg0, var4.field7224);
                    this.field2408[var4.field7225] = null;
                    var4.method2360((byte) 66);
                }
                this.field2408[arg0] = var3;
            } else {
                this.field2418 = false;
            }
            this.field2409.method1908(0, var3);
            return this.field2413[var3.field7224];
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBI)V")
    public static final void method1186(int arg0, byte arg1, int arg2) {
        field2416++;
        class142.field2056++;
        class654 var3 = class631.method3628(class641.field9190, (byte) -51, class357.field5280);
        if (arg1 == 16) {
            var3.field9358.method3162(-2003712696, arg2);
            var3.field9358.method3140(arg0, -1);
            class444.method2623(118, var3);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
    public final void method1187(int arg0) {
        if (arg0 != -30304) {
            this.method1187(-114);
        }
        for (int var2 = 0; var2 < this.field2412; var2++) {
            this.field2413[var2] = null;
        }
        field2411++;
        this.field2413 = null;
        this.field2408 = null;
        this.field2409.method1905(0);
        this.field2409 = null;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)[[I")
    public final int[][] method1188(int arg0) {
        field2407++;
        if (this.field2414 != this.field2412) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field2412; var2++) {
            this.field2408[var2] = class414.field6131;
        }
        return this.field2413;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(III)V")
    public class171(int arg0, int arg1, int arg2) {
        this.field2414 = arg1;
        this.field2412 = arg0;
        this.field2408 = new class515[this.field2414];
        this.field2413 = new int[this.field2412][arg2];
    }
}
