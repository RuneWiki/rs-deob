import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public abstract class class49 extends class256 {

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "Z")
    public boolean field791 = false;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "Z")
    public boolean field792 = false;

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    public static int field789 = 0;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
    public static int field794 = 0;

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
    public static int field796 = 0;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "Ldp;")
    public static class174 field785;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIII)V", line = 9)
    public static final void method390(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field793++;
        if (arg0 != 1292512488) {
            field796 = 6;
        }
        class418.field6066 = arg2;
        class383.field5490 = arg4;
        class392.field5732 = arg1;
        class308.field4495 = arg3;
    }

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "(I)V", line = 28)
    public static void method391(int arg0) {
        if (arg0 != -2239) {
            field794 = -106;
        }
        field785 = null;
    }

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "(I)V", line = 42)
    public static final void method392(int arg0) {
        if (arg0 != 8) {
            field789 = -9;
        }
        field788++;
        class137.field2190.method112(0);
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(IIIZZ)V", line = 155)
    public class49(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field795 = arg0;
        this.field784 = arg1;
        this.field792 = arg3;
        this.field787 = arg2;
        this.field791 = arg4;
    }

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "(I)V", line = 59)
    public static final void method393(int arg0) {
        class387.method2451((byte) -32, class436.field6356);
        int var1 = 112 / ((-arg0 - 44) / 58);
        field786++;
        int var2 = (class379.field5384 >> 3) + (class265.field3985 >> 10);
        int var3 = (class294.field4362 >> 3) + (class286.field4288 >> 10);
        byte var4 = 0;
        byte var5 = 8;
        byte var6 = 8;
        byte var7 = 18;
        class79.field1343 = new byte[var7][];
        class388.field5565 = new int[var7];
        class79.field1336 = new int[var7];
        class347.field4906 = new byte[var7][];
        class61.field983 = new byte[var7][];
        class358.field5114 = new int[var7];
        class253.field3665 = new int[var7];
        class85.field1373 = new int[var7];
        class92.field1453 = new int[var7];
        class188.field2779 = new byte[var7][];
        class403.field5895 = new byte[var7][];
        class151.field2314 = new int[var7][4];
        int var8 = 0;
        for (int var9 = (var2 - (class183.field2703 >> 4)) / 8; var9 <= (((class183.field2703 >> 4) + var2) / 8); var9++) {
            for (int var11 = (var3 - (class66.field1056 >> 4)) / 8; var11 <= (((class66.field1056 >> 4) + var3) / 8); var11++) {
                int var12 = (var9 << 8) + var11;
                class79.field1336[var8] = var12;
                class358.field5114[var8] = class119.field1862.method1359(100, "m" + var9 + "_" + var11);
                class85.field1373[var8] = class119.field1862.method1359(70, "l" + var9 + "_" + var11);
                class388.field5565[var8] = class119.field1862.method1359(127, "n" + var9 + "_" + var11);
                class253.field3665[var8] = class119.field1862.method1359(59, "um" + var9 + "_" + var11);
                class92.field1453[var8] = class119.field1862.method1359(109, "ul" + var9 + "_" + var11);
                if (class388.field5565[var8] == -1) {
                    class358.field5114[var8] = -1;
                    class85.field1373[var8] = -1;
                    class253.field3665[var8] = -1;
                    class92.field1453[var8] = -1;
                }
                var8++;
            }
        }
        for (int var10 = var8; var10 < class388.field5565.length; var10++) {
            class388.field5565[var10] = -1;
            class358.field5114[var10] = -1;
            class85.field1373[var10] = -1;
            class253.field3665[var10] = -1;
            class92.field1453[var10] = -1;
        }
        class157.method1233(28, var6, var3, var5, var2, var4, false, true);
    }
}
