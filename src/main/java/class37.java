import java.awt.FontMetrics;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class37 extends class3 {

    @OriginalMember(owner = "mapview!t", name = "C", descriptor = "Lu;")
    public static class38 field474 = class28.method177("Switch to ", (byte) -84);

    @OriginalMember(owner = "mapview!t", name = "D", descriptor = "I")
    public static int field475 = 0;

    @OriginalMember(owner = "mapview!t", name = "E", descriptor = "Lu;")
    public static class38 field476 = class28.method177("uitext has incorrect number of strings", (byte) -84);

    @OriginalMember(owner = "mapview!t", name = "F", descriptor = "Lu;")
    public static class38 field477 = class28.method177("null", (byte) -84);

    @OriginalMember(owner = "mapview!t", name = "B", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field473;

    @OriginalMember(owner = "mapview!t", name = "<init>", descriptor = "([BZZ)V", line = 7)
    public class37(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Lu;Lu;Lb;I)[Lra;", line = 14)
    public static final class35[] method212(class38 arg0, class38 arg1, class3 arg2, int arg3) {
        int var4 = 14 % ((-72 - arg3) / 35);
        int var5 = arg2.method20(arg0, (byte) 88);
        int var6 = arg2.method22(var5, -109, arg1);
        return class30.method185(var5, (byte) -7, var6, arg2);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/io/DataInputStream;IZ)V", line = 26)
    private final void method213(DataInputStream arg0, int arg1, boolean arg2) throws IOException {
        if (arg2) {
        }
        int var4 = arg0.read();
        int var5 = arg0.readInt();
        int var6 = var5;
        if (~var4 != -1) {
            var5 += 4;
        }
        class19 var7 = new class19(arg1 + var5);
        var7.method110(var4, -2);
        var7.method113(var6, true);
        arg0.readFully(var7.field193, var7.field196, var5);
        this.method26(var7.field193, -1);
        for (int var8 = 0; super.field23 > var8; ++var8) {
            int var9 = arg0.read();
            int var10 = arg0.readInt();
            int var11 = var10;
            if (var9 != 0) {
                var10 += 4;
            }
            class19 var12 = new class19(var10 + 5);
            var12.method110(var9, -2);
            var12.method113(var11, true);
            while (~var10 < -33554433) {
                var10 -= 33554432;
                arg0.readFully(var12.field193, var12.field196, 33554432);
                var12.field196 += 33554432;
            }
            arg0.readFully(var12.field193, var12.field196, var10);
            if (!super.field21) {
                super.field35[super.field37[var8]] = class17.method101((byte) 108, var12.field193, false);
            } else {
                super.field35[super.field37[var8]] = var12.field193;
            }
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IIIBI)V", line = 88)
    public static final void method214(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = arg4 >> 6;
        if (arg2 == -151005338) {
            int var6 = arg0 >> 6;
            if (class7.field67[arg1][var5][var6] == null) {
                class7.field67[arg1][var5][var6] = new byte[4096];
            }
            class7.field67[arg1][var5][var6][class33.method199(arg4 << 6, 4032) - -class33.method199(63, arg0)] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lda;", line = 113)
    public static final class8 method215(Throwable arg0, String arg1) {
        class8 var2;
        if (arg0 instanceof class8) {
            var2 = (class8) arg0;
            var2.field78 = var2.field78 + ' ' + arg1;
        } else {
            var2 = new class8(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "(I)V", line = 142)
    public static void method216(int arg0) {
        field476 = null;
        field473 = null;
        field477 = null;
        field474 = null;
        if (arg0 < 121) {
            method215((Throwable) null, (String) null);
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(II[BI)I", line = 172)
    public static final int method217(int arg0, int arg1, byte[] arg2, int arg3) {
        int var4 = -1;
        for (int var5 = arg3; arg1 > var5; ++var5) {
            var4 = var4 >>> 8 ^ class26.field246[255 & (arg2[var5] ^ var4)];
        }
        return arg0 != 0 ? -33 : ~var4;
    }

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "(I)B", line = 194)
    public static final byte method218(int arg0) {
        int var1 = -59 % ((63 - arg0) / 62);
        return class33.field414 != null ? class33.field414[class22.field213] : 0;
    }

    @OriginalMember(owner = "mapview!t", name = "<init>", descriptor = "([BZZZ)V", line = 207)
    private class37(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method213(new DataInputStream(new ByteArrayInputStream(arg0)), 5, arg3);
    }
}
