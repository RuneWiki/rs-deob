import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class373 extends class58 {

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    private int field4817;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    private int field4813;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    private int field4816;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    private int field4807;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Ljaa;")
    private class576 field4811;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    private int field4808;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    private int field4806;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Lcga;")
    public static class449 field4812 = new class449(19, 3);

    @OriginalMember(owner = "client!je", name = "v", descriptor = "[I")
    public static int[] field4818 = new int[120];

    @OriginalMember(owner = "client!je", name = "w", descriptor = "Z")
    public static boolean field4819;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Z")
    public static boolean field4821;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "F")
    public static float field4820;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lgca;")
    public static class234 field4810;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Lgda;")
    private class51 field4809;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field4818[var1] = var0 / 4;
        }
        field4819 = false;
        field4821 = false;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method2160(boolean arg0) {
        class55.field707.method3701(20);
        field4814++;
        class329.field4092.method49((byte) 126);
        class124.field1510.method3570((byte) -111);
        class232.field3017.method2360(0);
        class46.field620.method3767((byte) -65);
        class504.field6287.method1630(arg0);
        class11.field110.method1140(-9506);
        class339.field4336.method2155((byte) -14);
        class392.field5013.method1360(23814);
        class185.field2186.method2095(false);
        class510.field6389.method2905(32);
        class93.field1189.method1000(111);
        class530.field6699.method96((byte) -16);
        class434.field5475.method156((byte) 113);
        class46.field617.method1408(128);
        class7.field77.method1041((byte) 12);
        class671.field9178.method2835(30);
        class558.field6987.method2541((byte) -96);
        class151.field1801.method3556(-102);
        class96.field1247.method834(-86);
        class365.method2130((byte) 113);
        class475.method2584(50);
        class677.method3748(118);
        class491.method2665(101);
        if (class257.field3292 != class255.field3277) {
            for (int var1 = 0; var1 < class238.field3075.length; var1++) {
                class238.field3075[var1] = null;
            }
            class673.field9185 = 0;
        }
        class106.method748((byte) 5);
        class94.method702(12475);
        class340.method1950(0);
        class93.method686(100);
        class233.method1404((byte) 82);
        class620.field8415.method1218(106);
        class309.field3898.method401();
        class314.method1840(arg0);
        class253.method1523(2);
        class38.field567.method1664(false);
        class67.field802.method1664(false);
        class634.field8594.method1664(false);
        class667.field9049.method1664(false);
        class202.field2352.method1664(false);
        class109.field1364.method1664(!arg0);
        class353.field4567.method1664(false);
        class190.field2267.method1664(false);
        class136.field1656.method1664(!arg0);
        class226.field2920.method1664(false);
        class261.field3310.method1664(!arg0);
        class391.field5005.method1664(false);
        class261.field3309.method1664(false);
        class329.field4095.method1664(false);
        class431.field5439.method1664(false);
        class292.field3712.method1664(false);
        class487.field6090.method1664(false);
        class72.field939.method1664(false);
        class19.field203.method1664(false);
        class336.field4147.method1664(false);
        class563.field7035.method1664(!arg0);
        class405.field5224.method1664(false);
        class664.field9025.method1664(false);
        class682.field9284.method1664(false);
        class590.field7924.method1664(false);
        class527.field6658.method1664(false);
        class677.field9227.method1664(!arg0);
        class489.field6112.method1664(!arg0);
        class195.field2300.method1664(false);
        class493.field6150.method1664(false);
        class376.field4837.method1664(false);
        class292.field3706.method1664(false);
        class38.field565.method1218(101);
        class550.field6905.method1218(96);
        class222.field2583.method1218(112);
        class444.field5589.method1218(123);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Lgda;", line = 98)
    public final class51 method499(int arg0) {
        field4815++;
        if (arg0 != -20699) {
            this.field4816 = -69;
        }
        if (this.field4809 == null) {
            class589.field7905[4] = this.field4816;
            class589.field7905[0] = this.field4813;
            class589.field7905[5] = this.field4806;
            class589.field7905[1] = this.field4808;
            class589.field7905[2] = this.field4817;
            class589.field7905[3] = this.field4807;
            class498 var2 = this.field4811.field8781;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method2717(class589.field7905[var5], false)) {
                    return null;
                }
                class152 var7 = var2.method2718(class589.field7905[var5], (byte) 72);
                int var8 = var7.field1826 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field1828 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class618.field8377[var6] = var2.method2714(1.0F, class589.field7905[var6], var4, 19991, false, var4);
            }
            this.field4809 = new class51(this.field4811, 6407, var4, var3, class618.field8377);
        }
        return this.field4809;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V", line = 163)
    public static void method2161(byte arg0) {
        field4818 = null;
        field4812 = null;
        if (arg0 != 35) {
            field4812 = null;
        }
        field4810 = null;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Ljaa;IIIIII)V", line = 178)
    public class373(class576 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4817 = arg3;
        this.field4813 = arg1;
        this.field4816 = arg5;
        this.field4807 = arg4;
        this.field4811 = arg0;
        this.field4808 = arg2;
        this.field4806 = arg6;
    }
}
