import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public class class18 extends class8 {

    @OriginalMember(owner = "mapview!ia", name = "E", descriptor = "Ls;")
    public static class34 field155 = class9.method35("Rare Trees", 220);

    @OriginalMember(owner = "mapview!ia", name = "I", descriptor = "Ls;")
    public static class34 field159 = class9.method35("Overview", 220);

    @OriginalMember(owner = "mapview!ia", name = "D", descriptor = "[[B")
    public static byte[][] field154 = new byte[50][];

    @OriginalMember(owner = "mapview!ia", name = "H", descriptor = "Ls;")
    public static class34 field158 = class9.method35("Mace Shop", 220);

    @OriginalMember(owner = "mapview!ia", name = "A", descriptor = "Ls;")
    public static class34 field152 = class9.method35("37(U", 220);

    @OriginalMember(owner = "mapview!ia", name = "F", descriptor = "Ls;")
    public static class34 field156 = class9.method35("u_pass", 220);

    @OriginalMember(owner = "mapview!ia", name = "G", descriptor = "Lia;")
    public static class18 field157;

    @OriginalMember(owner = "mapview!ia", name = "B", descriptor = "La;")
    public static class1 field153;

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(I)V", line = 5)
    public static void method83(int arg0) {
        field152 = null;
        int var1 = -35 % ((arg0 - -24) / 33);
        field155 = null;
        field158 = null;
        field157 = null;
        field154 = (byte[][]) null;
        field156 = null;
        field153 = null;
        field159 = null;
    }

    @OriginalMember(owner = "mapview!ia", name = "<init>", descriptor = "([BZZZ)V", line = 36)
    private class18(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method84(arg3, (byte) -122, new DataInputStream(new ByteArrayInputStream(arg0)));
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(ZBLjava/io/DataInputStream;)V", line = 49)
    private final void method84(boolean arg0, byte arg1, DataInputStream arg2) throws IOException {
        if (!arg0) {
        }
        int var4 = arg2.read();
        int var5 = arg2.readInt();
        int var6 = var5;
        if (~var4 != -1) {
            var5 += 4;
        }
        class29 var7 = new class29(var5 + 5);
        var7.method193(var4, true);
        var7.method199(var6, (byte) 103);
        arg2.readFully(var7.field388, var7.field392, var5);
        this.method25(var7.field388, (byte) 78);
        if (arg1 > -23) {
            method86(85, (byte) 0, 115, -120, 6);
        }
        for (int var8 = 0; ~super.field58 < ~var8; ++var8) {
            int var9 = arg2.read();
            int var10 = arg2.readInt();
            int var11 = var10;
            if (~var9 != -1) {
                var10 += 4;
            }
            class29 var12 = new class29(var10 + 5);
            var12.method193(var9, true);
            var12.method199(var11, (byte) 117);
            while (-33554433 > ~var10) {
                var10 -= 33554432;
                arg2.readFully(var12.field388, var12.field392, 33554432);
                var12.field392 += 33554432;
            }
            arg2.readFully(var12.field388, var12.field392, var10);
            if (super.field57) {
                super.field70[super.field67[var8]] = var12.field388;
            } else {
                super.field70[super.field67[var8]] = class35.method245(var12.field388, -126, false);
            }
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(B)[Lba;", line = 125)
    public static final class4[] method85(byte arg0) {
        if (arg0 != 10) {
            return (class4[]) null;
        } else {
            class4[] var1 = new class4[class9.field94];
            for (int var2 = 0; var2 < class9.field94; ++var2) {
                class4 var3 = new class4();
                var3.field34 = class34.field464;
                var3.field32 = class26.field361;
                var3.field36 = class14.field128[var2];
                var3.field31 = class34.field468[var2];
                var3.field35 = class28.field383[var2];
                var3.field30 = mapview.field293[var2];
                var3.field29 = class27.field377;
                var3.field33 = class9.field91[var2];
                var1[var2] = var3;
            }
            class30.method202((byte) -82);
            return var1;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "<init>", descriptor = "([BZZ)V", line = 161)
    public class18(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IBIII)V", line = 202)
    public static final void method86(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 21925) {
            int var5 = arg2 >> 6;
            int var6 = arg3 >> 6;
            if (class39.field531[arg0][var6][var5] == null) {
                class39.field531[arg0][var6][var5] = new byte[4096];
            }
            class39.field531[arg0][var6][var5][(class31.method206(arg3, 63) << 6) + class31.method206(arg2, 63)] = arg1;
        }
    }
}
