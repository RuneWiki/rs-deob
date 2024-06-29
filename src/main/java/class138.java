import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class138 {

    @OriginalMember(owner = "client!p", name = "b", descriptor = "[I")
    public static int[] field1800 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field1807 = -1;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public int field1805;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Lon;")
    public class211 field1803;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Lqg;")
    public static class307 field1806;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Lmh;")
    public static class428 field1802;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "[I")
    public int[] field1804;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Leq;B)V")
    public static final void method868(class134 arg0, byte arg1) {
        arg0.method810(0, 0, class223.field3156, 350);
        field1801++;
        arg0.method770(0, 0, class223.field3156, 350, class19.field267 << 24 | 0x332277, 1);
        int var2 = 350 / class291.field4162;
        if (class251.field3614 > 0) {
            int var3 = 346 - class291.field4162 - 4;
            int var4 = var2 * var3 / (class251.field3614 + var2 - 1);
            int var5 = 4;
            if (class251.field3614 > 1) {
                var5 += (class251.field3614 - class81.field1124 - 1) * (var3 - var4) / (class251.field3614 - 1);
            }
            arg0.method770(class223.field3156 - 16, var5, 12, var4, class19.field267 << 24 | 0x332277, 2);
            for (int var6 = class81.field1124; var6 < (class81.field1124 + var2) && var6 < class251.field3614; var6++) {
                String[] var7 = class452.method2628(class388.field5759[var6], 0, '\b');
                int var8 = (class223.field3156 - 24) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg0.method810(var10, 0, var10 + var8 - 8, 350);
                    class181.field2587.method2116(-1, -16777216, var10, 350 - class472.field6825 - class93.field1260.field7724 - ((-class81.field1124 + var6) * class291.field4162) - 2, var7[var9], (byte) -85);
                }
            }
        }
        arg0.method810(0, 0, class223.field3156, 350);
        arg0.method741(class223.field3156, 0, 350 - class472.field6825, -1, 1);
        class458.field6676.method2116(-1, -16777216, 10, 350 - class482.field6989.field7724 - 1, "--> " + class272.field3805, (byte) -85);
        int var11 = -1;
        if (arg1 == -128) {
            if ((class263.field3748 % 30) > 15) {
                var11 = 16777215;
            }
            arg0.method754(class482.field6989.method3055(7748, "--> " + class272.field3805.substring(0, class222.field3145)) + 10, -27659, 12, var11, 339 - class482.field6989.field7724);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)Z")
    public static final boolean method869(int arg0, int arg1, int arg2, int arg3) {
        if (class76.method505(arg0, arg1, arg2)) {
            int var4 = arg1 << class41.field628;
            int var5 = arg2 << class41.field628;
            return class3.method18(var4 + 1, class311.field4527[arg0].method848(arg1, arg2) + arg3, var5 + 1) && class3.method18(class153.field1965 + var4 - 1, class311.field4527[arg0].method848(arg1 + 1, arg2) + arg3, var5 + 1) && class3.method18(class153.field1965 + var4 - 1, class311.field4527[arg0].method848(arg1 + 1, arg2 + 1) + arg3, class153.field1965 + var5 - 1) && class3.method18(var4 + 1, class311.field4527[arg0].method848(arg1, arg2 + 1) + arg3, class153.field1965 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lbn;I)V")
    public static final void method870(class294 arg0, int arg1) {
        field1799++;
        boolean var2 = false;
        if (class263.field3748 == arg0.field4254 || arg0.field4215 == -1 || arg0.field4206 != 0) {
            var2 = true;
        } else {
            class168 var3 = class286.field4083.method2602(-24462, arg0.field4215);
            if (var3.field2206 || var3.field2205[arg0.field4216] < arg0.field4261 + 1) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field4254 - arg0.field4225;
            int var5 = class263.field3748 - arg0.field4225;
            int var6 = arg0.field4181 * 128 + (arg0.method1773(-77) * 64);
            int var7 = arg0.field4202 * 128 + (arg0.method1773(-100) * 64);
            int var8 = arg0.field4210 * 128 + arg0.method1773(-118) * 64;
            int var9 = arg0.field4234 * 128 + (arg0.method1773(-23) * 64);
            arg0.field2959 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field2966 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        if (arg1 != -14625) {
            return;
        }
        arg0.field4275 = 0;
        if (arg0.field4237 == 0) {
            arg0.method1771(-13670, 8192);
        }
        if (arg0.field4237 == 1) {
            arg0.method1771(-13670, 12288);
        }
        if (arg0.field4237 == 2) {
            arg0.method1771(-13670, 0);
        }
        if (arg0.field4237 == 3) {
            arg0.method1771(-13670, 4096);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static void method871(int arg0) {
        field1806 = null;
        field1802 = null;
        field1800 = null;
        if (arg0 > -99) {
            field1802 = null;
        }
    }
}
