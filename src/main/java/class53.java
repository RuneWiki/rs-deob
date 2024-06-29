import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class53 extends class418 {

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "[I")
    public static int[] field814 = new int[3];

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "[Lul;")
    public static class255[] field819 = new class255[14];

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "[Lrr;")
    public static class184[] field823;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method383(String arg0, int arg1, int arg2) {
        class154.field1969++;
        field820++;
        class140.field1797.method1833(-20379, 100);
        class140.field1797.method2204(class9.method61((byte) -117, arg0) + 1, 8);
        class140.field1797.method2224((byte) 59, arg1);
        class140.field1797.method2214(arg0, -65);
        if (arg2 <= 67) {
            method386((byte) 90);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method384(boolean arg0, String arg1, int arg2) {
        class60.field924.field2501 = 1;
        field821++;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = 97 % ((79 - arg2) / 41);
        for (int var7 = 0; var7 < class15.field234; var7++) {
            class159 var10 = class129.method915(126, var7);
            if ((!arg0 || var10.field2073) && var10.field2062 == -1 && var10.field2004 == -1 && var10.field2030 == 0 && var10.field2068.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class267.field3960 = null;
                    class47.field711 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var11 = new short[var4.length * 2];
                    for (int var12 = 0; var12 < var5; var12++) {
                        var11[var12] = var4[var12];
                    }
                    var4 = var11;
                }
                var4[var5++] = (short) var7;
            }
        }
        class290.field4341 = 0;
        class47.field711 = var5;
        class267.field3960 = var4;
        String[] var8 = new String[class47.field711];
        for (int var9 = 0; var9 < class47.field711; var9++) {
            var8[var9] = class129.method915(127, var4[var9]).field2068;
        }
        class51.method381(var8, class267.field3960, 0);
        class60.field924.method1211(0);
        class60.field924.field2501 = 2;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)V")
    public static final void method385(int arg0, int arg1) {
        field816++;
        class160.field2082 = arg0;
        if (arg1 != -30679) {
            method384(false, (String) null, 13);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
    public static void method386(byte arg0) {
        field814 = null;
        field819 = null;
        field823 = null;
        if (arg0 >= -101) {
            method384(true, (String) null, 16);
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(II)V")
    public class53(int arg0, int arg1) {
        this.field815 = arg1;
        this.field822 = arg0;
    }
}
