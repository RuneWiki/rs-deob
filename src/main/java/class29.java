import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!oa")
public class class29 {

    @OriginalMember(owner = "mapview!oa", name = "h", descriptor = "[I")
    private int[] field378;

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "I")
    public static volatile int field371 = 0;

    @OriginalMember(owner = "mapview!oa", name = "e", descriptor = "[I")
    public static int[] field375 = new int[128];

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "Ln;")
    public static class26 field374 = class9.method82(255, "Silk Trader");

    @OriginalMember(owner = "mapview!oa", name = "i", descriptor = "Ln;")
    public static class26 field379 = class9.method82(255, "Tannery");

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "Ln;")
    public static class26 field372 = class9.method82(255, "sprites");

    @OriginalMember(owner = "mapview!oa", name = "g", descriptor = "I")
    public static int field377 = 0;

    @OriginalMember(owner = "mapview!oa", name = "j", descriptor = "I")
    public static int field380 = 1;

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "[B")
    public static byte[] field373;

    @OriginalMember(owner = "mapview!oa", name = "f", descriptor = "[[Le;")
    public static class9[][] field376;

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(II)I", line = 8)
    public final int method207(int arg0, int arg1) {
        if (arg1 != 28425) {
            method208(18);
        }
        int var3 = this.field378.length - 2;
        int var4 = arg0 << 1 & var3;
        while (true) {
            int var5 = this.field378[var4];
            if (arg0 == var5) {
                return this.field378[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(I)V", line = 55)
    public static void method208(int arg0) {
        field375 = null;
        field373 = null;
        if (arg0 != 1) {
            method209((byte) 102);
        }
        field372 = null;
        field376 = null;
        field379 = null;
        field374 = null;
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(B)V", line = 76)
    public static final void method209(byte arg0) {
        if (class15.field233 != null) {
            class22 var1 = class15.field233;
            synchronized (class15.field233) {
                class15.field233 = null;
            }
        }
        int var3 = 20 / ((arg0 + 63) / 48);
    }

    @OriginalMember(owner = "mapview!oa", name = "<init>", descriptor = "([I)V", line = 102)
    public class29(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field378 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field378[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field378[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field378[var5 + var5] = arg0[var4];
            this.field378[var5 + var5 + 1] = var4++;
        }
    }
}
