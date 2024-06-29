import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class35 extends class117 {

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "Ljava/lang/String;")
    public static String field521 = "Loaded fonts";

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "F")
    public static float field520;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "Lp;")
    public static class25 field519;

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V", line = 8)
    public class35() {
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V", line = 18)
    public static void method260(boolean arg0) {
        if (arg0) {
            method263((class190) null, false);
        }
        field521 = null;
        field519 = null;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I)V", line = 27)
    public class35(int arg0) {
        this.field515 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IFIIZIII)[I", line = 36)
    public static final int[] method261(int arg0, float arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field518++;
        if (arg6 > -114) {
            return (int[]) null;
        }
        int[] var8 = new int[arg7];
        class253 var9 = new class253();
        var9.field3783 = (int) (arg1 * 4096.0F);
        var9.field3786 = arg3;
        var9.field3776 = arg0;
        var9.field3772 = arg4;
        var9.field3771 = arg2;
        var9.field3780 = arg5;
        var9.method22(-82);
        class252.method1849(arg7, 1, true);
        var9.method1854(true, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([BB)Lmn;", line = 60)
    public static final class110 method262(byte[] arg0, byte arg1) {
        field516++;
        class110 var2 = new class110();
        class190 var3 = new class190(arg0);
        var3.field2776 = var3.field2718.length - 2;
        int var4 = var3.method1317((byte) 96);
        int var5 = var3.field2718.length - (var4 + 12) - 2;
        var3.field2776 = var5;
        int var6 = var3.method1371(-4);
        if (arg1 >= -118) {
            method260(false);
        }
        var2.field1598 = var3.method1317((byte) 74);
        var2.field1604 = var3.method1317((byte) 87);
        var2.field1607 = var3.method1317((byte) 104);
        var2.field1603 = var3.method1317((byte) 10);
        int var7 = var3.method1319(255);
        if (var7 > 0) {
            var2.field1592 = new class196[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1317((byte) 45);
                class196 var10 = new class196(class344.method2409(var9, -24724));
                var2.field1592[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1371(-4);
                    int var12 = var3.method1371(-4);
                    var10.method1400((long) var11, 122, new class35(var12));
                }
            }
        }
        var3.field2776 = 0;
        int var13 = 0;
        var2.field1612 = var3.method1356((byte) -84);
        var2.field1610 = new String[var6];
        var2.field1596 = new int[var6];
        var2.field1606 = new int[var6];
        while (var3.field2776 < var5) {
            int var14 = var3.method1317((byte) 87);
            if (var14 == 3) {
                var2.field1610[var13] = var3.method1329((byte) 59).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field1606[var13] = var3.method1319(255);
            } else {
                var2.field1606[var13] = var3.method1371(-4);
            }
            var2.field1596[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lsb;Z)V", line = 140)
    public static final void method263(class190 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        for (int var2 = 0; var2 < class294.field4431; var2++) {
            int var3 = arg0.method1372(-96);
            int var4 = arg0.method1317((byte) 33);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class338.field5248[var3] != null) {
                class338.field5248[var3].field4059 = var4;
            }
        }
        field517++;
    }
}
