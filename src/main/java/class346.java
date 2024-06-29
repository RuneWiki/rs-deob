import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class346 {

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Z")
    public static boolean field4621 = false;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "[I")
    public static int[] field4625 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "B")
    public byte field4616;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public int field4627;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Ljava/lang/String;")
    public String field4617;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Ljava/lang/String;")
    public String field4620;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "Ljava/lang/String;")
    public String field4624;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "Ljava/lang/String;")
    public String field4626;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "Z")
    public static boolean field4623;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
    public static void method2061(boolean arg0) {
        if (!arg0) {
            field4625 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2062(String[] arg0, int arg1) {
        field4622++;
        String[] var2 = new String[5];
        int var3 = 0;
        int var4 = -3 / ((-arg1 - 32) / 58);
        while (var3 < 5) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLsca;[[B)V")
    public static final void method2063(byte arg0, class235 arg1, byte[][] arg2) {
        field4618++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg2.length;
        if (arg0 > -76) {
            method2062(null, 74);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg2[var5];
            if (var10 != null) {
                class157 var11 = new class157(var10);
                int var12 = class126.field1760[var5] >> 8;
                int var13 = class126.field1760[var5] & 0xFF;
                int var14 = var12 * 64 - class125.field1745;
                int var15 = var13 * 64 - class4.field23;
                class276.method1656(-896460184);
                arg1.method458(class4.field23, var11, var15, var14, 56, class125.field1745, class322.field4302);
                arg1.method1458((byte) -111, var15, class146.field1963, var11, var3, var14);
                if (!arg1.field1035 && (class312.field4205 / 8) == var12 && class523.field7257 / 8 == var13 && var3[0] != -1) {
                    class292.field3855 = class579.field7919.method2379(var3[1], class400.field5313, var3[2], var3[0], 0, var3[3]);
                    class701.field9871 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class126.field1760[var6] >> 8) * 64 - class125.field1745;
            int var8 = (class126.field1760[var6] & 0xFF) * 64 - class4.field23;
            byte[] var9 = arg2[var6];
            if (var9 == null && class523.field7257 < 800) {
                class276.method1656(-896460184);
                arg1.method469(var7, (byte) -77, 64, 64, var8);
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Lsi;")
    public static final class138 method2064(int arg0) {
        field4619++;
        try {
            return (class138) Class.forName("hda").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            int var1 = 21 % ((10 - arg0) / 39);
            return new class7();
        }
    }
}
