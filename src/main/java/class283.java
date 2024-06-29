import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class283 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lee;B)Lnt;", line = 7)
    public static final class220 method1855(class675 arg0, byte arg1) {
        field4028++;
        class3 var2 = class759.method4211(-11911)[arg0.method3750((byte) 35)];
        class120 var3 = class720.method4047(25992)[arg0.method3750((byte) 35)];
        int var4 = arg0.method3706((byte) -119);
        if (arg1 > -24) {
            return null;
        }
        int var5 = arg0.method3706((byte) -87);
        int var6 = arg0.method3757((byte) -65);
        int var7 = arg0.method3757((byte) -65);
        int var8 = arg0.method3706((byte) -110);
        int var9 = arg0.method3703(114);
        int var10 = arg0.method3703(116);
        return new class220(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIZ)Z", line = 36)
    public static final boolean method1856(int arg0, int arg1, boolean arg2) {
        field4027++;
        if (arg2) {
            method1856(-39, 39, true);
        }
        if (!class436.field6192) {
            return false;
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class37.field475[var3] == null || class37.field475[var3][var4] == null) {
            return false;
        }
        class493 var5 = class37.field475[var3][var4];
        if (arg0 == -1 && var5.field7016 == 0) {
            for (class37 var6 = (class37) class215.field2820.method2765(-12261); var6 != null; var6 = (class37) class215.field2820.method2759(-15361)) {
                if (var6.field463 == 30 || var6.field463 == 1002 || var6.field463 == 15 || var6.field463 == 25 || var6.field463 == 12) {
                    for (class493 var7 = class127.method854((byte) -94, var6.field465); var7 != null; var7 = class315.method2032(var7, !arg2)) {
                        if (var5.field6956 == var7.field6956) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class37 var8 = (class37) class215.field2820.method2765(-12261); var8 != null; var8 = (class37) class215.field2820.method2759(-15361)) {
                if (var8.field461 == arg0 && var5.field6956 == var8.field465 && (var8.field463 == 30 || var8.field463 == 1002 || var8.field463 == 15 || var8.field463 == 25 || var8.field463 == 12)) {
                    return true;
                }
            }
        }
        return false;
    }
}
