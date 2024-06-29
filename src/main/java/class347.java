import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class347 {

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public int field4470;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public int field4468;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public int field4473;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public int field4472;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "Lcea;")
    public static class180 field4467 = new class180("Loading HW3D - ", "Lade HW3D - ", "Chargement HW3D - ", "Carregando HW3D - ");

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)Lrm;")
    public final class347 method1935(int arg0, int arg1) {
        field4471++;
        return arg1 == -4358 ? new class347(this.field4473, arg0, this.field4468, this.field4470) : null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lqa;Ldn;B)V")
    public static final void method1936(class206 arg0, class438 arg1, byte arg2) {
        field4466++;
        class3[] var3 = class3.method14(arg1, class70.field679, 0);
        class9.field64 = new class52[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class9.field64[var4] = arg0.method1101(var3[var4], true);
        }
        class3[] var5 = class3.method14(arg1, class598.field8665, 0);
        class98.field1212 = new class52[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class98.field1212[var6] = arg0.method1101(var5[var6], true);
        }
        class3[] var7 = class3.method14(arg1, class371.field4886, 0);
        class82.field995 = new class52[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class82.field995[var8] = arg0.method1101(var7[var8], true);
        }
        class3[] var9 = class3.method14(arg1, class11.field87, 0);
        class159.field1922 = new class52[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class159.field1922[var10] = arg0.method1101(var9[var10], true);
        }
        class3[] var11 = class3.method14(arg1, class389.field5146, 0);
        class595.field8633 = new class52[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class595.field8633[var12] = arg0.method1101(var11[var12], true);
        }
        class3[] var13 = class3.method14(arg1, class155.field1892, 0);
        class286.field3726 = new class52[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class286.field3726[var14] = arg0.method1101(var13[var14], true);
        }
        class3[] var15 = class3.method14(arg1, class351.field4526, 0);
        class266.field3461 = new class52[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class266.field3461[var16] = arg0.method1101(var15[var16], true);
        }
        class3[] var17 = class3.method14(arg1, class51.field434, 0);
        class43.field350 = new class52[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class43.field350[var18] = arg0.method1101(var17[var18], true);
        }
        class3[] var19 = class3.method14(arg1, class195.field2364, 0);
        class80.field959 = new class52[var19.length];
        int var20 = 0;
        int var21 = -84 / ((64 - arg2) / 43);
        while (var19.length > var20) {
            class80.field959[var20] = arg0.method1101(var19[var20], true);
            var20++;
        }
        class3[] var22 = class3.method14(arg1, class543.field7959, 0);
        class106.field1296 = new class52[var22.length];
        for (int var23 = 0; var23 < var22.length; var23++) {
            class106.field1296[var23] = arg0.method1101(var22[var23], true);
        }
        class3[] var24 = class3.method14(arg1, class191.field2303, 0);
        class218.field2665 = new class52[var24.length];
        for (int var25 = 0; var25 < var24.length; var25++) {
            class218.field2665[var25] = arg0.method1101(var24[var25], true);
        }
        class3[] var26 = class3.method14(arg1, class434.field5893, 0);
        class547.field8049 = new class52[var26.length];
        for (int var27 = 0; var27 < var26.length; var27++) {
            class547.field8049[var27] = arg0.method1101(var26[var27], true);
        }
        class199.field2399 = arg0.method1101(class3.method18(arg1, class470.field6586, 0), true);
        class257.field3312 = arg0.method1101(class3.method18(arg1, class613.field8889, 0), true);
        class3[] var28 = class3.method14(arg1, class236.field2893, 0);
        class172.field2096 = new class52[var28.length];
        for (int var29 = 0; var29 < var28.length; var29++) {
            class172.field2096[var29] = arg0.method1101(var28[var29], true);
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(II)I")
    public static int method1937(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public static void method1938(int arg0) {
        field4467 = null;
        if (arg0 != 1103) {
            field4469 = 6;
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(IIII)V")
    public class347(int arg0, int arg1, int arg2, int arg3) {
        this.field4470 = arg3;
        this.field4468 = arg2;
        this.field4473 = arg0;
        this.field4472 = arg1;
    }
}
