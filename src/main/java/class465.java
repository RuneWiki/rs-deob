import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class465 {

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Lru;")
    public static class678 field6627;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lru;")
    public static class678 field6628 = field6627 = new class678(false);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)Lgp;")
    public static final class549 method2815(int arg0) {
        field6626++;
        class322 var1 = null;
        class549 var2 = new class549(class528.field7683, arg0);
        try {
            class432 var3 = class345.field4749.method1876(-13918, true, "");
            while (var3.field6198 == 0) {
                class363.method2283(1L, -24244);
            }
            if (var3.field6198 == 1) {
                var1 = (class322) var3.field6200;
                byte[] var4 = new byte[(int) var1.method1996(105)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var1.method2004(arg0 ^ 0xFFFFAF1C, var4.length - var5, var5, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class549(new class479(var4), class528.field7683, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var1 != null) {
                var1.method2000((byte) 33);
            }
        } catch (Exception var7) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
    public static final int method2816(int arg0, int arg1) {
        if (arg0 >= -93) {
            method2817(2);
        }
        field6629++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    public static void method2817(int arg0) {
        field6627 = null;
        field6628 = null;
        if (arg0 != 1) {
            method2816(-4, -116);
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)J")
    public static final synchronized long method2818(int arg0) {
        field6625++;
        long var1 = System.currentTimeMillis();
        if (class710.field10012 > var1) {
            class137.field1882 += class710.field10012 - var1;
        }
        class710.field10012 = var1;
        if (arg0 != 255) {
            method2816(-4, -77);
        }
        return class137.field1882 + var1;
    }
}
