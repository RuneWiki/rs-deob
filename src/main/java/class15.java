import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class15 {

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public static int field202 = -2;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "Z")
    public static boolean field203 = false;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "Z")
    public static boolean field197 = false;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "Lon;")
    public static class151 field199;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "Llj;")
    public static class289 field201;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "[I")
    public static int[] field192;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)[Lnc;", line = 8)
    public static final class16[] method105(byte arg0) {
        field193++;
        if (class310.field5044 == null) {
            class16[] var1 = class325.method2323(class96.field1382, 578578818);
            class16[] var2 = new class16[var1.length];
            int var3 = 0;
            label60: for (int var4 = 0; var4 < var1.length; var4++) {
                class16 var5 = var1[var4];
                if ((var5.field209 <= 0 || var5.field209 >= 24) && var5.field207 >= 800 && var5.field210 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class16 var7 = var2[var6];
                        if (var5.field207 == var7.field207 && var5.field210 == var7.field210) {
                            if (var5.field209 > var7.field209) {
                                var2[var6] = var5;
                            }
                            continue label60;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class310.field5044 = new class16[var3];
            class298.method2102(var2, 0, class310.field5044, 0, var3);
            int[] var8 = new int[class310.field5044.length];
            for (int var9 = 0; var9 < class310.field5044.length; var9++) {
                class16 var10 = class310.field5044[var9];
                var8[var9] = var10.field210 * var10.field207;
            }
            class46.method351(class310.field5044, var8, 118);
        }
        if (arg0 <= 17) {
            field199 = (class151) null;
        }
        return class310.field5044;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLnm;)V", line = 89)
    public static final void method106(boolean arg0, class221 arg1) {
        field200++;
        if (arg0) {
            method107(115, (byte) -5);
        }
        class228.field3579 = arg1;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)I", line = 100)
    public static final int method107(int arg0, byte arg1) {
        field196++;
        if (arg1 <= 82) {
            method107(-89, (byte) -55);
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)I", line = 116)
    public static final int method108(int arg0, int arg1) {
        int var2 = ((arg1 & 0xAAAAAAAB) >>> 1) + (arg1 & 0x55555555);
        field198++;
        if (arg0 > -68) {
            return 41;
        }
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCF) >>> 2);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V", line = 141)
    public static void method109(byte arg0) {
        int var1 = 3 % ((-arg0 - 5) / 48);
        field201 = null;
        field199 = null;
        field192 = null;
    }
}
