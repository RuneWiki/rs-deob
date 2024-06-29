import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class7 extends class19 {

    @OriginalMember(owner = "mapview!da", name = "x", descriptor = "Lt;")
    public static class36 field72 = class3.method8(13631, "Helmet Shop");

    @OriginalMember(owner = "mapview!da", name = "y", descriptor = "Lt;")
    public static class36 field73 = class3.method8(13631, "Farming patch");

    @OriginalMember(owner = "mapview!da", name = "z", descriptor = "Lt;")
    public static class36 field74 = class3.method8(13631, "Cookery Shop");

    @OriginalMember(owner = "mapview!da", name = "C", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "mapview!da", name = "B", descriptor = "[I")
    public static int[] field75;

    @OriginalMember(owner = "mapview!da", name = "<init>", descriptor = "([BZZZ)V", line = 7)
    private class7(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method33(arg3, 18838, new DataInputStream(new ByteArrayInputStream(arg0)));
    }

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "(I)B", line = 19)
    public static final byte method27(int arg0) {
        int var1 = 65 % ((-54 - arg0) / 51);
        return class3.field22 != null ? class3.field22[class6.field65] : 0;
    }

    @OriginalMember(owner = "mapview!da", name = "<init>", descriptor = "([BZZ)V", line = 31)
    public class7(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(II[Lt;I)V", line = 40)
    public static final void method28(int arg0, int arg1, class36[] arg2, int arg3) {
        if (arg0 != -19390) {
            field74 = (class36) null;
        }
        if (arg1 == 1) {
            arg2[0].method199((byte) -73);
        } else {
            class14.method78((byte) 100, arg2, arg1, arg3).method199((byte) 126);
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(B)V", line = 55)
    public static final void method29(byte arg0) {
        int var1 = -8 / ((arg0 - 73) / 32);
        if (class20.field248 != null) {
            class33 var2 = class20.field248;
            synchronized (class20.field248) {
                class20.field248 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Z)[Lq;", line = 70)
    public static final class30[] method30(boolean arg0) {
        class30[] var1 = new class30[class32.field451];
        int var2 = 0;
        if (!arg0) {
            return (class30[]) null;
        } else {
            while (~var2 > ~class32.field451) {
                class30 var3 = new class30();
                var3.field433 = class14.field172;
                var3.field439 = class1.field1;
                var3.field436 = class9.field91[var2];
                var3.field432 = class35.field485[var2];
                var3.field438 = class17.field211[var2];
                var3.field434 = class35.field480[var2];
                var3.field437 = class20.field257;
                var3.field435 = class6.field61[var2];
                var1[var2] = var3;
                ++var2;
            }
            class17.method90(-2);
            return var1;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "(II)Lt;", line = 138)
    public static final class36 method31(int arg0, int arg1) {
        if (arg0 != 4) {
            field74 = (class36) null;
        }
        return class33.method189(arg1, 112, 10, false);
    }

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "(I)V", line = 153)
    public static void method32(int arg0) {
        field74 = null;
        field73 = null;
        field72 = null;
        if (arg0 != 685) {
            method32(119);
        }
        field75 = null;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(ZILjava/io/DataInputStream;)V", line = 168)
    private final void method33(boolean arg0, int arg1, DataInputStream arg2) throws IOException {
        if (!arg0) {
        }
        int var4 = arg2.read();
        if (arg1 == 18838) {
            int var5 = arg2.readInt();
            int var6 = var5;
            if (var4 != 0) {
                var5 += 4;
            }
            class39 var7 = new class39(var5 + 5);
            var7.method250(var4, (byte) -15);
            var7.method246(0, var6);
            arg2.readFully(var7.field514, var7.field519, var5);
            this.method108(arg1 + -18839, var7.field514);
            for (int var8 = 0; super.field229 > var8; ++var8) {
                int var9 = arg2.read();
                int var10 = arg2.readInt();
                int var11 = var10;
                if (~var9 != -1) {
                    var10 += 4;
                }
                class39 var12 = new class39(var10 + 5);
                var12.method250(var9, (byte) -15);
                var12.method246(0, var11);
                while (33554432 < var10) {
                    arg2.readFully(var12.field514, var12.field519, 33554432);
                    var10 -= 33554432;
                    var12.field519 += 33554432;
                }
                arg2.readFully(var12.field514, var12.field519, var10);
                if (!super.field233) {
                    super.field247[super.field226[var8]] = class41.method268(var12.field514, (byte) 96, false);
                } else {
                    super.field247[super.field226[var8]] = var12.field514;
                }
            }
        }
    }
}
