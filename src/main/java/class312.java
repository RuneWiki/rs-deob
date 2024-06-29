import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class312 {

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "Luu;")
    public static class428 field4752 = new class428(5000);

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lnk;")
    public class312 field4750;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Lnk;")
    public class312 field4753;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Lum;")
    public static class83 field4754;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 3)
    public final void method2069(int arg0) {
        field4755++;
        if (this.field4753 == null) {
            return;
        }
        this.field4753.field4750 = this.field4750;
        if (arg0 != -11) {
            method2072((byte) -28);
        }
        this.field4750.field4753 = this.field4753;
        this.field4753 = null;
        this.field4750 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIB)V", line = 23)
    public static final void method2070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class417[] var7 = class292.field4519;
        int var8 = 36 % ((arg6 + 6) / 47);
        for (int var9 = 0; var9 < var7.length; var9++) {
            class417 var10 = var7[var9];
            if (var10 != null && var10.field6122 == 2) {
                class125.method927(var10.field6129, var10.field6119, arg3 >> 1, arg4, arg5 >> 1, var10.field6120 * 2, -55, arg1, var10.field6126);
                if (class370.field5458[0] > -1 && (class446.field6625 % 20) < 10) {
                    class522.field7668[var10.field6128].method2316(class370.field5458[0] + arg0 - 12, arg2 - (-class370.field5458[1] - -28));
                }
            }
        }
        field4756++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 60)
    public static final void method2071(int arg0, int arg1, int arg2, Class arg3) {
        class281 var4 = class348.field5192[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class21 var5 = var4.field4381; var5 != null; var5 = var5.field235) {
            class76 var6 = var5.field240;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1283 == arg1 && var6.field1277 == arg2) {
                class241.method1620(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V", line = 86)
    public static void method2072(byte arg0) {
        field4752 = null;
        int var1 = 121 / ((arg0 + 34) / 44);
        field4754 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI)V", line = 100)
    public static final void method2073(boolean arg0, int arg1) {
        field4751++;
        if (arg0) {
            if (class134.field2010 != -1) {
                class52.method342(1, class134.field2010);
            }
            for (class295 var2 = (class295) class215.field3248.method359(true); var2 != null; var2 = (class295) class215.field3248.method365(-113)) {
                if (!var2.method949(arg1 - 28957)) {
                    var2 = (class295) class215.field3248.method359(true);
                    if (var2 == null) {
                        break;
                    }
                }
                class336.method2188(true, 1, false, var2);
            }
            class134.field2010 = -1;
            class215.field3248 = new class56(8);
            class71.method614((byte) 1);
            class134.field2010 = class141.field2104;
            class179.method1264(93, false);
            class80.method713(-14703);
            class152.method1094(class134.field2010);
        }
        if (arg1 != 30724) {
            field4752 = null;
        }
        class215.field3256 = true;
    }
}
