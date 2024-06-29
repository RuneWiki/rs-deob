import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class94 {

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field1501 = -1;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "Ln;")
    public static class15 field1503;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "[I")
    public static int[] field1500;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
    public static final void method722(String arg0, boolean arg1, boolean arg2) {
        class15.field174.field4741 = 1;
        field1499++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class58.field1052.field3771; var6++) {
            class116 var9 = class58.field1052.method1646(21708, var6);
            if ((!arg2 || var9.field1785) && var9.field1758 == -1 && var9.field1800 == -1 && var9.field1726 == 0 && var9.field1780.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class86.field1398 = null;
                    class27.field385 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class27.field385 = var5;
        class98.field1542 = 0;
        class86.field1398 = var4;
        String[] var7 = new String[class27.field385];
        int var8 = 0;
        if (arg1) {
            field1500 = null;
        }
        while (class27.field385 > var8) {
            var7[var8] = class58.field1052.method1646(21708, var4[var8]).field1780;
            var8++;
        }
        class376.method2295(class86.field1398, 19, var7);
        class15.field174.method2034(-1);
        class15.field174.field4741 = 2;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public static void method723(int arg0) {
        field1500 = null;
        field1503 = null;
        if (arg0 != -8212) {
            method723(119);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lha;BLha;)V")
    public static final void method724(class42 arg0, byte arg1, class42 arg2) {
        if (arg0.field859 != null) {
            arg0.method421(22071);
        }
        field1502++;
        arg0.field857 = arg2;
        arg0.field859 = arg2.field859;
        arg0.field859.field857 = arg0;
        if (arg1 >= -39) {
            method724(null, (byte) -57, null);
        }
        arg0.field857.field859 = arg0;
    }
}
