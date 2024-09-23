import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZTSFQLLW")
public class class72 {

    @OriginalMember(owner = "ZTSFQLLW", name = "a", descriptor = "B")
    private byte field1704 = 4;

    @OriginalMember(owner = "ZTSFQLLW", name = "c", descriptor = "Z")
    private boolean field1706 = false;

    @OriginalMember(owner = "ZTSFQLLW", name = "h", descriptor = "[LACLAPANL;")
    private class2[] field1711 = new class2[10];

    @OriginalMember(owner = "ZTSFQLLW", name = "b", descriptor = "I")
    private static int field1705 = 1;

    @OriginalMember(owner = "ZTSFQLLW", name = "d", descriptor = "[LZTSFQLLW;")
    private static class72[] field1707 = new class72[5000];

    @OriginalMember(owner = "ZTSFQLLW", name = "e", descriptor = "[I")
    public static int[] field1708 = new int[5000];

    @OriginalMember(owner = "ZTSFQLLW", name = "i", descriptor = "I")
    private int field1712;

    @OriginalMember(owner = "ZTSFQLLW", name = "j", descriptor = "I")
    private int field1713;

    @OriginalMember(owner = "ZTSFQLLW", name = "g", descriptor = "LXOUQUKZW;")
    private static class62 field1710;

    @OriginalMember(owner = "ZTSFQLLW", name = "f", descriptor = "[B")
    private static byte[] field1709;

    @OriginalMember(owner = "ZTSFQLLW", name = "<init>", descriptor = "(Z)V")
    private class72(boolean arg0) {
        if (!arg0) {
            this.field1706 = !this.field1706;
        }
    }

    @OriginalMember(owner = "ZTSFQLLW", name = "a", descriptor = "(ILXOUQUKZW;)V")
    public static final void method586(int arg0, class62 arg1) {
        field1709 = new byte[441000];
        field1710 = new class62(-417, field1709);
        if (arg0 != 0) {
            field1705 = 287;
        }
        class2.method7();
        while (true) {
            int var2 = arg1.method523();
            if (var2 == 65535) {
                return;
            }
            field1707[var2] = new class72(true);
            field1707[var2].method588((byte) 5, arg1);
            field1708[var2] = field1707[var2].method589((byte) 32);
        }
    }

    @OriginalMember(owner = "ZTSFQLLW", name = "a", descriptor = "(IBI)LXOUQUKZW;")
    public static final class62 method587(int arg0, byte arg1, int arg2) {
        if (arg1 != 112) {
            throw new NullPointerException();
        } else if (field1707[arg2] == null) {
            return null;
        } else {
            class72 var3 = field1707[arg2];
            return var3.method590(-496, arg0);
        }
    }

    @OriginalMember(owner = "ZTSFQLLW", name = "a", descriptor = "(BLXOUQUKZW;)V")
    private final void method588(byte arg0, class62 arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var5 = arg1.method521();
            if (var5 != 0) {
                arg1.field1579--;
                this.field1711[var3] = new class2();
                this.field1711[var3].method10((byte) 5, arg1);
            }
        }
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        this.field1712 = arg1.method523();
        this.field1713 = arg1.method523();
    }

    @OriginalMember(owner = "ZTSFQLLW", name = "a", descriptor = "(B)I")
    private final int method589(byte arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1711[var3] != null && this.field1711[var3].field30 / 20 < var2) {
                var2 = this.field1711[var3].field30 / 20;
            }
        }
        if (this.field1712 < this.field1713 && this.field1712 / 20 < var2) {
            var2 = this.field1712 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1711[var4] != null) {
                this.field1711[var4].field30 -= var2 * 20;
            }
        }
        if (arg0 != 32) {
            return 3;
        }
        if (this.field1712 < this.field1713) {
            this.field1712 -= var2 * 20;
            this.field1713 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "ZTSFQLLW", name = "a", descriptor = "(II)LXOUQUKZW;")
    private final class62 method590(int arg0, int arg1) {
        int var3 = this.method591(arg1);
        field1710.field1579 = 0;
        field1710.method515(1380533830);
        field1710.method516(var3 + 36, (byte) 7);
        field1710.method515(1463899717);
        field1710.method515(1718449184);
        field1710.method516(16, (byte) 7);
        field1710.method513(1, false);
        field1710.method513(1, false);
        field1710.method516(22050, (byte) 7);
        field1710.method516(22050, (byte) 7);
        field1710.method513(1, false);
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        field1710.method513(8, false);
        field1710.method515(1684108385);
        field1710.method516(var3, (byte) 7);
        field1710.field1579 += var3;
        return field1710;
    }

    @OriginalMember(owner = "ZTSFQLLW", name = "a", descriptor = "(I)I")
    private final int method591(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1711[var3] != null && this.field1711[var3].field30 + this.field1711[var3].field29 > var2) {
                var2 = this.field1711[var3].field30 + this.field1711[var3].field29;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1712 * 22050 / 1000;
        int var6 = this.field1713 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1709[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1711[var9] != null) {
                int var15 = this.field1711[var9].field29 * 22050 / 1000;
                int var16 = this.field1711[var9].field30 * 22050 / 1000;
                int[] var17 = this.field1711[var9].method8(var15, this.field1711[var9].field29);
                for (int var18 = 0; var18 < var15; var18++) {
                    field1709[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
                }
            }
        }
        if (arg0 > 1) {
            var5 += 44;
            var6 += 44;
            var4 += 44;
            var7 += 44;
            int var10 = var7 - var4;
            for (int var11 = var4 - 1; var11 >= var6; var11--) {
                field1709[var10 + var11] = field1709[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1709[var13 + var14] = field1709[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
