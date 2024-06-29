import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class293 {

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public int field5006;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public int field5009;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public int field5000;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public int field5011;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Z")
    public static boolean field4997 = false;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field4995 = 0;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Z")
    public static boolean field5007 = false;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Ltl;")
    public static class59 field5003 = class85.method639("null", 9588);

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Ltl;")
    public static class59 field5010 = class85.method639("blaugr-Un:", 9588);

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field5001 = 0;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "F")
    public static float field4998;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Lme;")
    public static class295 field5004;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "[I")
    public static int[] field5002;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([Lma;II)V", line = 6)
    public static final void method2022(class263[] arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class263 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field4468 == 0) {
                    if (var4.field4377 != null) {
                        method2022(var4.field4377, 939, arg2);
                    }
                    class297 var5 = (class297) class190.field3181.method685((long) var4.field4392, 128);
                    if (var5 != null) {
                        class155.method1108((byte) -124, var5.field5089, arg2);
                    }
                }
                if (arg2 == 0 && var4.field4536 != null) {
                    class128 var6 = new class128();
                    var6.field2110 = var4;
                    var6.field2103 = var4.field4536;
                    class299.method2093((byte) 108, var6);
                }
                if (arg2 == 1 && var4.field4378 != null) {
                    if (var4.field4500 >= 0) {
                        class263 var7 = class247.method1738(false, var4.field4392);
                        if (var7 == null || var7.field4377 == null || var4.field4500 >= var7.field4377.length || var7.field4377[var4.field4500] != var4) {
                            continue;
                        }
                    }
                    class128 var8 = new class128();
                    var8.field2110 = var4;
                    var8.field2103 = var4.field4378;
                    class299.method2093((byte) 63, var8);
                }
            }
        }
        field5005++;
        if (arg1 != 939) {
            field4998 = -1.1884077F;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 75)
    public static void method2023(int arg0) {
        field5002 = null;
        if (arg0 == 0) {
            field5004 = null;
            field5003 = null;
            field5010 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 107)
    public static final void method2024(int arg0) {
        field4999++;
        if (arg0 == 7929) {
            class251.field4185.method1482((byte) 30);
            class157.field2565.method1482((byte) 30);
            class50.field763.method1482((byte) 30);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V", line = 132)
    public static final void method2025(int arg0, int arg1) {
        field5008++;
        class251.field4185.method1486(false, arg1);
        if (arg0 != -1) {
            field4997 = true;
        }
        class157.field2565.method1486(false, arg1);
        class50.field763.method1486(false, arg1);
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V", line = 160)
    public class293() {
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lac;)V", line = 162)
    public class293(class293 arg0) {
        this.field5006 = arg0.field5006;
        this.field5009 = arg0.field5009;
        this.field5000 = arg0.field5000;
        this.field5011 = arg0.field5011;
    }
}
