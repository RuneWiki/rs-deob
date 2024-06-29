import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class466 {

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "Lkv;")
    private class280 field6627;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "J")
    public long field6631;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!lv", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field6627.method1857(this.field6631, (byte) -110);
        field6629++;
        super.finalize();
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)I")
    public static final int method2754(byte arg0, String arg1, int arg2, String arg3) {
        field6630++;
        int var4 = arg1.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        int var8 = -107 % ((arg0 + 23) / 58);
        char var9 = 0;
        char var10 = 0;
        while (var4 > var6 - var9 || var5 > (var7 - var10)) {
            if (var4 <= (var6 - var9)) {
                return -1;
            }
            if (var5 <= var7 - var10) {
                return 1;
            }
            char var23;
            if (var9 == '\u0000') {
                var23 = arg1.charAt(var6++);
            } else {
                var23 = var9;
                boolean var24 = false;
            }
            char var25;
            if (var10 == '\u0000') {
                var25 = arg3.charAt(var7++);
            } else {
                var25 = var10;
                boolean var26 = false;
            }
            var9 = class537.method3104(var23, 69);
            var10 = class537.method3104(var25, 69);
            char var27 = class238.method1633(var23, arg2, (byte) -16);
            char var28 = class238.method1633(var25, arg2, (byte) -16);
            if (var27 != var28 && Character.toUpperCase(var27) != Character.toUpperCase(var28)) {
                char var29 = Character.toLowerCase(var27);
                char var30 = Character.toLowerCase(var28);
                if (var29 != var30) {
                    return class32.method228(1631593732, var29, arg2) - class32.method228(1631593732, var30, arg2);
                }
            }
        }
        int var11 = Math.min(var4, var5);
        for (int var12 = 0; var12 < var11; var12++) {
            int var17;
            int var18;
            if (arg2 == 2) {
                var17 = var4 - var12 - 1;
                var18 = var5 - var12 - 1;
            } else {
                var18 = var12;
                var17 = var12;
            }
            char var19 = arg1.charAt(var17);
            char var20 = arg3.charAt(var18);
            if (var19 != var20 && Character.toUpperCase(var19) != Character.toUpperCase(var20)) {
                char var21 = Character.toLowerCase(var19);
                char var22 = Character.toLowerCase(var20);
                if (var21 != var22) {
                    return class32.method228(1631593732, var21, arg2) - class32.method228(1631593732, var22, arg2);
                }
            }
        }
        int var13 = var4 - var5;
        if (var13 != 0) {
            return var13;
        }
        for (int var14 = 0; var14 < var11; var14++) {
            char var15 = arg1.charAt(var14);
            char var16 = arg3.charAt(var14);
            if (var15 != var16) {
                return class32.method228(1631593732, var15, arg2) - class32.method228(1631593732, var16, arg2);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lkv;JI)V")
    public class466(class280 arg0, long arg1, int arg2) {
        this.field6627 = arg0;
        this.field6631 = arg1;
    }
}
