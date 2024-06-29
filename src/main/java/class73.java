import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class73 extends class110 {

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    private int field946 = 0;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    private int field944 = 4096;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "Ljava/lang/String;")
    public static String field949 = "glow2:";

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "J")
    public static long field950 = 0L;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "Lhb;")
    public static class318 field951 = new class318(5);

    @OriginalMember(owner = "client!kk", name = "U", descriptor = "Ljava/lang/String;")
    public static String field956 = "Please remove ";

    @OriginalMember(owner = "client!kk", name = "V", descriptor = "Lhb;")
    public static class318 field957 = new class318(64);

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!kk", name = "T", descriptor = "Llc;")
    public static class282 field955;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "[Lbk;")
    public static class157[] field948;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "[[B")
    public static byte[][] field947;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method46(int arg0, int arg1) {
        field952++;
        if (arg0 != 1) {
            method471(-46, -117, 61);
        }
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            int[] var4 = this.method764(0, true, arg1);
            for (int var5 = 0; var5 < class124.field1936; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field946 <= var6 && this.field944 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILre;I)V", line = 42)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg2 > -37) {
            this.method44(-52, (class263) null, 66);
        }
        field953++;
        if (arg0 == 0) {
            this.field946 = arg1.method1830((byte) -77);
        } else if (arg0 == 1) {
            this.field944 = arg1.method1830((byte) -77);
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 76)
    public class73() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V", line = 80)
    public static void method470(byte arg0) {
        field957 = null;
        field947 = (byte[][]) null;
        field951 = null;
        field949 = null;
        int var1 = -93 % ((arg0 + 61) / 42);
        field955 = null;
        field956 = null;
        field948 = null;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(III)J", line = 101)
    public static final long method471(int arg0, int arg1, int arg2) {
        class221 var3 = class158.field2367[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3374; var4++) {
            class311 var5 = var3.field3354[var4];
            if ((var5.field4720 >> 29 & 0x3L) == 2L && var5.field4724 == arg1 && var5.field4735 == arg2) {
                return var5.field4720;
            }
        }
        return 0L;
    }
}
