import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class316 {

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    private int field4662 = -1;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    private int field4657 = 0;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lll;")
    private class54 field4650 = new class54();

    @OriginalMember(owner = "client!md", name = "r", descriptor = "Z")
    public boolean field4667 = false;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    private int field4666;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    private int field4656;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "[Lmc;")
    private class206[] field4655;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "[[[I")
    private int[][][] field4660;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4654 = "Loaded input handler";

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field4661 = 0;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "[Lag;")
    public static class269[] field4664 = new class269[50];

    @OriginalMember(owner = "client!md", name = "b", descriptor = "[I")
    public static int[] field4651 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4663 = "Continue";

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 12)
    public final void method2184(byte arg0) {
        field4652++;
        if (arg0 >= -47) {
            return;
        }
        for (int var2 = 0; var2 < this.field4666; var2++) {
            this.field4660[var2][0] = null;
            this.field4660[var2][1] = null;
            this.field4660[var2][2] = null;
            this.field4660[var2] = (int[][]) null;
        }
        this.field4660 = (int[][][]) null;
        this.field4655 = null;
        this.field4650.method409(1986850152);
        this.field4650 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)[[[I", line = 42)
    public final int[][][] method2185(int arg0) {
        field4665++;
        if (this.field4666 != this.field4656) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field4666; var2++) {
            this.field4655[var2] = class292.field4244;
        }
        return this.field4660;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(III)V", line = 175)
    public class316(int arg0, int arg1, int arg2) {
        this.field4666 = arg0;
        this.field4656 = arg1;
        this.field4655 = new class206[this.field4656];
        this.field4660 = new int[this.field4666][3][arg2];
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V", line = 77)
    public static void method2186(int arg0) {
        field4664 = null;
        field4651 = null;
        field4663 = null;
        field4654 = null;
        int var1 = 24 / ((arg0 - 35) / 40);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)[[I", line = 89)
    public final int[][] method2187(int arg0, int arg1) {
        if (arg1 >= -45) {
            return (int[][]) ((int[][]) null);
        }
        field4653++;
        if (this.field4666 == this.field4656) {
            this.field4667 = this.field4655[arg0] == null;
            this.field4655[arg0] = class292.field4244;
            return this.field4660[arg0];
        } else if (this.field4666 == 1) {
            this.field4667 = this.field4662 != arg0;
            this.field4662 = arg0;
            return this.field4660[0];
        } else {
            class206 var3 = this.field4655[arg0];
            if (var3 == null) {
                this.field4667 = true;
                if (this.field4666 <= this.field4657) {
                    class206 var4 = (class206) this.field4650.method416((byte) 116);
                    var3 = new class206(arg0, var4.field2865);
                    this.field4655[var4.field2866] = null;
                    var4.method179((byte) 51);
                } else {
                    var3 = new class206(arg0, this.field4657);
                    this.field4657++;
                }
                this.field4655[arg0] = var3;
            } else {
                this.field4667 = false;
            }
            this.field4650.method410(var3, (byte) -110);
            return this.field4660[var3.field2865];
        }
    }
}
