import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class136 extends class27 {

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "S")
    public static short field1977 = 256;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    private int field1976;

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!sh", name = "Q", descriptor = "I")
    private int field1979;

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
    private int field1980;

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V", line = 4)
    public class136() {
        this(0);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)V", line = 8)
    private final void method968(int arg0, int arg1) {
        if (arg0 < 44) {
            this.field1979 = -127;
        }
        this.field1980 = (arg1 & 0xFF0000) >> 12;
        field1981++;
        this.field1979 = arg1 & 0xFF << 4;
        this.field1976 = arg1 >> 4 & 0xFF0;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I)V", line = 28)
    private class136(int arg0) {
        super(0, false);
        this.method968(103, arg0);
    }

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "(I)Ljava/lang/String;", line = 44)
    public static final String method969(int arg0) {
        field1973++;
        String var1 = "www";
        if (class14.field214 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class294.field4432 != null) {
            var2 = "/p=" + class294.field4432;
        }
        if (arg0 != 242093644) {
            field1977 = -21;
        }
        return "http://" + var1 + ".runescape.com/l=" + class54.field789 + "/a=" + class177.field2543 + var2 + "/";
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILsb;I)V", line = 65)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg0 == -5836) {
            if (arg2 == 0) {
                this.method968(49, arg1.method1312(100));
            }
            field1975++;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[[I", line = 95)
    public final int[][] method19(int arg0, int arg1) {
        if (arg0 != -28941) {
            this.field1976 = -108;
        }
        field1978++;
        int[][] var3 = this.field379.method668(arg1, 0);
        if (this.field379.field1171) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            for (int var7 = 0; var7 < class209.field3053; var7++) {
                var6[var7] = this.field1980;
                var4[var7] = this.field1976;
                var5[var7] = this.field1979;
            }
        }
        return var3;
    }
}
