import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 {

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Ldf;")
    private static class51 field13 = class46.method233("OFF", 100);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Ldf;")
    public static class51 field8 = field13;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Ldf;")
    public static class51 field11 = class46.method233("logo", 100);

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lu;")
    public static class111 field9;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Llf;")
    public static final class195 method3(int arg0, int arg1, int arg2) {
        class97 var3 = class27.field395[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class195 var4 = var3.field1616;
            var3.field1616 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IJ)V")
    public static final void method4(int arg0, long arg1) {
        field14++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 != -20194) {
            field9 = null;
        }
        for (int var3 = 0; var3 < class108.field1844; var3++) {
            if (class203.field3396[var3] == arg1) {
                class1.field1++;
                class108.field1844--;
                for (int var4 = var3; var4 < class108.field1844; var4++) {
                    class203.field3396[var4] = class203.field3396[var4 + 1];
                    class259.field4520[var4] = class259.field4520[var4 + 1];
                }
                class204.field3418 = class189.field3173;
                class95.field1575.method424((byte) 120, 200);
                class95.field1575.method885(arg1, (byte) -102);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method5(byte arg0) {
        field11 = null;
        if (arg0 != 6) {
            method3(52, 94, -99);
        }
        field8 = null;
        field13 = null;
        field9 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIII)V")
    public static final void method6(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg2; var5 < class167.field2713; var5++) {
            if (arg1 < (class62.field1014[var5] + class41.field663[var5]) && arg1 + arg3 > class41.field663[var5] && class87.field1460[var5] + class237.field4124[var5] > arg0 && arg0 + arg4 > class237.field4124[var5]) {
                class213.field3705[var5] = true;
            }
        }
        field12++;
    }
}
