import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class51 {

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field1025 = 0;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "[Lag;")
    public static class202[] field1026 = new class202[2048];

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "B")
    public byte field1019;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "B")
    public byte field1023;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "B")
    public byte field1032;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "B")
    public byte field1034;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "Lbm;")
    public static class307 field1033;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "S")
    public short field1018;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Z")
    public boolean field1020;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Z")
    public boolean field1022;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Z")
    public boolean field1028;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Z")
    public boolean field1029;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "Z")
    public boolean field1030;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "[I")
    public static int[] field1027;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "[[[B")
    public static byte[][][] field1021;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 13)
    public static void method381(int arg0) {
        field1033 = null;
        field1021 = (byte[][][]) null;
        field1026 = null;
        if (arg0 != -22894) {
            method382(73, (class68) null, (class283) null, false, 21, 101, 46);
        }
        field1027 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILkl;Loj;ZIII)V", line = 30)
    public static final void method382(int arg0, class68 arg1, class283 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field1024++;
        if (arg2 == null) {
            return;
        }
        int var7 = (int) class95.field1709 + class41.field798 & 0x7FF;
        int var8 = Math.max(arg1.field1416 / 2, arg1.field1414 / 2) + 10;
        int var9 = arg5 * arg5 + arg6 * arg6;
        if (var8 * var8 < var9) {
            return;
        }
        int var10 = class284.field4395[var7];
        int var11 = var10 * 256 / (class4.field101 + 256);
        int var12 = class284.field4398[var7];
        if (arg3) {
            return;
        }
        int var13 = var12 * 256 / (class4.field101 + 256);
        int var14 = arg5 * var13 + arg6 * var11 >> 16;
        int var15 = arg6 * var13 - (arg5 * var11) >> 16;
        if (class249.field3893) {
            ((class137) arg2).method899(arg1.field1416 / 2 + arg0 + var14 - (arg2.field4375 / 2), arg1.field1414 / 2 + (arg4 - var15) - arg2.field4373 / 2, (class137) arg1.method528((byte) 97, false));
        } else {
            ((class206) arg2).method1400(arg1.field1416 / 2 + arg0 + var14 - (arg2.field4375 / 2), arg1.field1414 / 2 + -(arg2.field4373 / 2) + arg4 + -var15, arg1.field1403, arg1.field1317);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)Z", line = 69)
    public static final boolean method383(int arg0) {
        field1031++;
        int var1 = -51 % ((68 - arg0) / 39);
        if (class276.field4214) {
            try {
                return !(Boolean) class102.method666(class177.field2849.field2139, false, "showingVideoAd");
            } catch (Throwable var3) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 99)
    public static final void method384(int arg0) {
        field1035++;
        if (arg0 > 37) {
            class286.field4420++;
            class14.field263.method80(217, (byte) 111);
            class14.field263.method1353((byte) -105, 0L);
        }
    }
}
