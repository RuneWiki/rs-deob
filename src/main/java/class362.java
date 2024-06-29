import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class362 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    private int field5224 = 0;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Lvk;")
    private class56 field5225;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field5233 = 0;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "[I")
    public static int[] field5232 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "[I")
    public static int[] field5223 = new int[64];

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Llm;")
    public static class347 field5227;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lfb;")
    private class45 field5231;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
    public static final void method2365(int arg0, int arg1) {
        field5230++;
        class373.field5426 = arg0;
        class135.field1874 = arg1;
        class135.field1874 = -1;
        class62.method436((byte) -105);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBI)I")
    public static final int method2366(int arg0, byte arg1, int arg2) {
        int var3 = 120 / ((arg1 - 16) / 45);
        field5234++;
        return arg2 == 4 || arg2 == 5 ? class426.field6281[arg0 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
    public static final void method2367(int arg0, int arg1, int arg2) {
        field5228++;
        if (class395.method2537((byte) -109, arg1)) {
            if (arg2 != 14336) {
                method2370(118);
            }
            class93.method649(arg0, class365.field5292[arg1], (byte) -109);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Lfb;")
    public final class45 method2368(int arg0) {
        this.field5224 = 0;
        field5226++;
        return arg0 == 4096 ? this.method2369(arg0 ^ 0xFFFFEFFF) : null;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)Lfb;")
    public final class45 method2369(int arg0) {
        field5229++;
        if (arg0 > ~this.field5224 && this.field5225.field770[this.field5224 - 1] != this.field5231) {
            class45 var2 = this.field5231;
            this.field5231 = var2.field636;
            return var2;
        }
        while (this.field5225.field767 > this.field5224) {
            class45 var3 = this.field5225.field770[this.field5224++].field636;
            if (this.field5225.field770[this.field5224 - 1] != var3) {
                this.field5231 = var3.field636;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lvk;)V")
    public class362(class56 arg0) {
        this.field5225 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public static void method2370(int arg0) {
        field5223 = null;
        field5232 = null;
        field5227 = null;
        if (arg0 > -116) {
            field5232 = null;
        }
    }
}
