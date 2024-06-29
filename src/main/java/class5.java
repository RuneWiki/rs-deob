import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class5 extends class165 {

    @OriginalMember(owner = "client!he", name = "s", descriptor = "Ljava/lang/String;")
    public String field77;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field75 = 0;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "[I")
    public static int[] field78 = new int[2];

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field79 = -1;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Ldb;")
    public static class102 field76 = new class102(20);

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "Z")
    public static boolean field82;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V", line = 6)
    public static void method27(byte arg0) {
        field78 = null;
        int var1 = -42 / ((arg0 + 28) / 62);
        field76 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V", line = 20)
    public static final void method28(int arg0, int arg1) {
        class301.field4725.method708(arg1, true);
        field81++;
        if (arg0 < 110) {
            field76 = (class102) null;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 32)
    public class5() {
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)Ljn;", line = 40)
    public static final class176 method29(int arg0, byte arg1) {
        class176 var2 = (class176) class168.field2779.method704((byte) 63, (long) arg0);
        field80++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class185.field3073.method1287(arg0, 29, -1);
        class176 var4 = new class176();
        if (arg1 < 124) {
            method27((byte) -92);
        }
        if (var3 != null) {
            var4.method1325((byte) 27, arg0, new class44(var3));
        }
        class168.field2779.method703(var4, (long) arg0, (byte) -58);
        return var4;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 62)
    public class5(String arg0, int arg1) {
        this.field77 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIILj;Lj;IIIIJ)V", line = 72)
    public static final void method30(int arg0, int arg1, int arg2, int arg3, class7 arg4, class7 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class38 var12 = new class38();
        var12.field488 = arg10;
        var12.field491 = arg1 * 128 + 64;
        var12.field483 = arg2 * 128 + 64;
        var12.field486 = arg3;
        var12.field485 = arg4;
        var12.field494 = arg5;
        var12.field492 = arg6;
        var12.field490 = arg7;
        var12.field487 = arg8;
        var12.field493 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class324.field5032[var13][arg1][arg2] == null) {
                class324.field5032[var13][arg1][arg2] = new class204(var13, arg1, arg2);
            }
        }
        class324.field5032[arg0][arg1][arg2].field3342 = var12;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V", line = 113)
    public static final void method31(int arg0) {
        if (arg0 == 29) {
            class212.field3472.method702((byte) 120);
            field74++;
        }
    }
}
