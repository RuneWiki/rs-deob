import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class746 implements class637 {

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public int field10356;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "[Lpw;")
    public static class706[] field10359 = new class706[1024];

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field10357;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field10358;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field10360;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field10361;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field10362;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILha;)V", line = 4)
    public static final void method4162(int arg0, class60 arg1) {
        field10358++;
        int var2 = 0;
        int var3 = 0;
        if (class247.field3206) {
            var2 = class63.method488((byte) 42);
            var3 = class231.method1364(false);
        }
        int var4 = class729.field10174 + var2;
        int var5 = class475.field6566 + var3;
        int var6 = class33.field341;
        int var7 = class116.field1526 - 3;
        byte var8 = 20;
        int var9 = 118 % ((76 - arg0) / 33);
        class465.method2587(var8, arg1, class33.field341, class116.field1526, (byte) 58, class729.field10174 + var2, class475.field6566 + var3, class755.field10504.method4201(class723.field10095, (byte) 25));
        int var10 = var2 + class427.field6034.method528(105);
        int var11 = class427.field6034.method521((byte) 60) + var3;
        if (class148.field1903) {
            int var15 = 0;
            for (class756 var16 = (class756) class526.field7066.method2348(-1); var16 != null; var16 = (class756) class526.field7066.method2343(0)) {
                int var29 = var8 + (var15 * 16) + var5 + 13;
                var15++;
                if (var10 > class729.field10174 + var2 && (class729.field10174 + class33.field341 + var2) > var10 && var11 > (var29 - 13) && var11 < (var29 + 4) && (var16.field10556 > 1 || ((class227) var16.field10553.field5735.field5555).field2942)) {
                    arg1.method447(class729.field10174 + var2, var29 + -12, class33.field341, 16, 255 - class568.field8006 << 24 | class207.field2485, 1);
                }
            }
            if (class659.field9197 != null) {
                class465.method2587(var8, arg1, class438.field6139, class638.field8859, (byte) 58, class596.field8309, field10362, class659.field9197.field10550);
                int var17 = 0;
                for (class227 var18 = (class227) class659.field9197.field10553.method2348(-1); var18 != null; var18 = (class227) class659.field9197.field10553.method2343(0)) {
                    int var19 = var17 * 16 + field10362 + var8 + 13;
                    if (var10 > class596.field8309 && var10 < (class596.field8309 + class438.field6139) && var19 - 13 < var11 && var11 < (var19 + 4) && var18.field2942) {
                        arg1.method447(class596.field8309, var19 - 12, class438.field6139, 16, class207.field2485 | 255 - class568.field8006 << 24, 1);
                    }
                    var17++;
                }
                class199.method1104(class438.field6139, var8, arg1, field10362, class596.field8309, -22275, class638.field8859);
            }
        } else {
            int var12 = 0;
            for (class227 var13 = (class227) class139.field1783.method724(32); var13 != null; var13 = (class227) class139.field1783.method723(94)) {
                int var14 = (class43.field470 - var12 - 1) * 16 + var5 + var8 + 13;
                if ((class729.field10174 + var2) < var10 && var10 < (class729.field10174 + var2 + class33.field341) && var14 - 13 < var11 && (var14 + 4) > var11 && var13.field2942) {
                    arg1.method447(class729.field10174 + var2, var14 - 12, class33.field341, 16, class207.field2485 | 255 - class568.field8006 << 24, 1);
                }
                var12++;
            }
        }
        class199.method1104(class33.field341, var8, arg1, class475.field6566 + var3, class729.field10174 - -var2, -22275, class116.field1526);
        if (class148.field1903) {
            int var23 = 0;
            for (class756 var24 = (class756) class526.field7066.method2348(-1); var24 != null; var24 = (class756) class526.field7066.method2343(0)) {
                int var28 = (var23 * 16) + var3 + var8 + class475.field6566 + 13;
                if (var24.field10556 == 1) {
                    class30.method133(class116.field1526, (class227) var24.field10553.field5735.field5555, class166.field2076 | 0xFF000000, class33.field341, var28, class475.field6566 + var3, var10, arg1, var11, 0, class690.field9670 | 0xFF000000, class729.field10174 + var2);
                } else {
                    class88.method635(var24, class690.field9670 | 0xFF000000, var10, class116.field1526, var11, class729.field10174 + var2, arg1, var28, class166.field2076 | 0xFF000000, 0, class33.field341, class475.field6566 + var3);
                }
                var23++;
            }
            if (class659.field9197 != null) {
                int var25 = 0;
                for (class227 var26 = (class227) class659.field9197.field10553.method2348(-1); var26 != null; var26 = (class227) class659.field9197.field10553.method2343(0)) {
                    int var27 = var25 * 16 + field10362 - (-var8 + -13);
                    var25++;
                    class30.method133(class638.field8859, var26, class166.field2076 | 0xFF000000, class438.field6139, var27, field10362, var10, arg1, var11, 0, class690.field9670 | 0xFF000000, class596.field8309);
                }
                class363.method2080(class638.field8859, -8, class596.field8309, class438.field6139, field10362);
            }
        } else {
            int var20 = 0;
            for (class227 var21 = (class227) class139.field1783.method724(32); var21 != null; var21 = (class227) class139.field1783.method723(122)) {
                int var22 = (class43.field470 - var20 - 1) * 16 + (var5 + var8 + 13);
                class30.method133(var7, var21, class166.field2076 | 0xFF000000, var6, var22, var5, var10, arg1, var11, 0, class690.field9670 | 0xFF000000, var4);
                var20++;
            }
        }
        class363.method2080(class116.field1526, -8, class729.field10174 + var2, class33.field341, class475.field6566 + var3);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IB)I", line = 172)
    public static final int method4163(int arg0, byte arg1) {
        if (arg1 < 34) {
            field10360 = 72;
        }
        field10357++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V", line = 187)
    public static void method4164(byte arg0) {
        int var1 = -94 / ((arg0 + 60) / 43);
        field10359 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Lhda;", line = 201)
    public final class750 method333(int arg0) {
        if (arg0 == 30778) {
            field10361++;
            return class76.field925;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(I)V", line = 211)
    public class746(int arg0) {
        this.field10356 = arg0;
    }
}
