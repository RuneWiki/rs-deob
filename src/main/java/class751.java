import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class751 {

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Ljea;")
    public static class474 field10146 = new class474(8, 7);

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "Lsja;")
    public static class11 field10147 = new class11(128);

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field10149 = 1401;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field10144;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field10145;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field10148;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Lgt;")
    public static final class480 method4100(int arg0) {
        field10148++;
        class480 var1 = (class480) class485.field6774.method2193((byte) 59);
        if (arg0 != -1073741824) {
            return null;
        } else if (var1 == null) {
            return new class480();
        } else {
            class779.field10697--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lqba;B)V")
    public static final void method4101(class425 arg0, byte arg1) {
        if (arg1 <= 6) {
            return;
        }
        field10145++;
        if (arg0.field6164 == null && arg0.field6136 == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.field6164.length; var3++) {
            int var4 = -1;
            if (arg0.field6164 != null) {
                var4 = arg0.field6164[var3];
            }
            if (var4 != -1) {
                var2 = false;
                boolean var5 = false;
                boolean var6 = false;
                int var10;
                int var11;
                if ((var4 & 0xC0000000) == -1073741824) {
                    int var7 = var4 & 0xFFFFFFF;
                    int var8 = var7 >> 14;
                    int var9 = var7 & 0x3FFF;
                    var10 = arg0.field2802 - ((var8 - class120.field1625) * 512 + 256);
                    var11 = -((var9 - class259.field3849) * 512) - (256 - arg0.field2810);
                } else if ((var4 & 0x8000) == 0) {
                    class316 var14 = (class316) class176.field2326.method1248(100, (long) var4);
                    if (var14 == null) {
                        arg0.method2571(-1, (byte) -126, var3);
                        continue;
                    }
                    class22 var15 = var14.field4455;
                    var10 = arg0.field2802 - var15.field2802;
                    var11 = arg0.field2810 - var15.field2810;
                } else {
                    int var12 = var4 & 0x7FFF;
                    class758 var13 = class84.field1204[var12];
                    if (var13 == null) {
                        arg0.method2571(-1, (byte) -124, var3);
                        continue;
                    }
                    var10 = arg0.field2802 - var13.field2802;
                    var11 = arg0.field2810 - var13.field2810;
                }
                if (var10 != 0 || var11 != 0) {
                    arg0.method2571((int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D) & 0x3FFF, (byte) -126, var3);
                }
            } else if (!arg0.method2571(-1, (byte) -125, var3)) {
                var2 = false;
            }
        }
        if (var2) {
            arg0.field6164 = null;
            arg0.field6136 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
    public static void method4102(int arg0) {
        field10147 = null;
        field10146 = null;
        if (arg0 < 100) {
            method4102(22);
        }
    }
}
