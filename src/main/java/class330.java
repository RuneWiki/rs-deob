import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class330 {

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
    public static int field4300 = 1406;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
    public int field4295;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "I")
    public int field4296;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
    public int field4298;

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "I")
    public int field4301;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "([BB)Z")
    public static final boolean method1907(byte[] arg0, byte arg1) {
        field4299++;
        class418 var2 = new class418(arg0);
        if (arg1 != -82) {
            method1908(null, 111, -40, 89);
        }
        int var3 = var2.method2396(arg1 ^ 0x26);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method2396(arg1 - 35) == 1;
        if (var4) {
            class34.method272((byte) 12, var2);
        }
        class39.method310((byte) 60, var2);
        return true;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ltc;III)V")
    public static final void method1908(class477 arg0, int arg1, int arg2, int arg3) {
        field4297++;
        if (arg2 <= 71) {
            field4300 = 7;
        }
        if (class655.field9114 != null || class594.field8025 || arg0 == null || class388.method2219(arg0, 9563) == null) {
            return;
        }
        class655.field9114 = arg0;
        class323.field4197 = class388.method2219(arg0, 9563);
        class347.field4428 = false;
        class429.field5554 = arg3;
        class576.field7845 = arg1;
        class49.field685 = 0;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(II)V")
    public static final void method1909(int arg0, int arg1) {
        class605 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class88 var4 = class353.field4540[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class151.field1933; var5++) {
                    for (int var6 = 0; var6 < class590.field8010; var6++) {
                        var2 = var4.method664(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class291.field3760;
                            int var8 = var5 << class291.field3760;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class88 var10 = class353.field4540[var9];
                                if (var10 != null) {
                                    int var11 = var4.method668(var6, var5) - var10.method668(var6, var5);
                                    int var12 = var4.method668(var6 + 1, var5) - var10.method668(var6 + 1, var5);
                                    int var13 = var4.method668(var6 + 1, var5 + 1) - var10.method668(var6 + 1, var5 + 1);
                                    int var14 = var4.method668(var6, var5 + 1) - var10.method668(var6, var5 + 1);
                                    var10.method666(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
