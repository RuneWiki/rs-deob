import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class319 {

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public int field5077 = -1;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Ljava/lang/String;")
    public static String field5088 = "purple:";

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "[I")
    public static int[] field5080 = new int[2];

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field5089 = 0;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "F")
    public static float field5084;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Leb;")
    public class6 field5079;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "[I")
    public int[] field5087;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field5076;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "[[[B")
    public static byte[][][] field5081;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)V", line = 12)
    public static final void method2253(boolean arg0, int arg1) {
        if (arg0) {
            if (class304.field4870 != -1) {
                class257.method1974(class304.field4870, (byte) 106);
            }
            for (class259 var2 = (class259) class226.field3723.method1265(arg1 + 311578930); var2 != null; var2 = (class259) class226.field3723.method1277((byte) -122)) {
                class237.method1815(true, var2, (byte) 57);
            }
            class304.field4870 = -1;
            class226.field3723 = new class164(8);
            class232.method1789(true);
            class304.field4870 = class205.field3236;
            class14.method83((byte) 77, false);
            class14.method82(19775);
            class240.method1828(-13043, class304.field4870);
        }
        class232.field3847 = -1;
        class220.method1647((byte) -68, class320.field5096);
        field5086++;
        class6.field55 = new class258();
        if (arg1 != -311578841) {
            field5084 = 0.19036718F;
        }
        class6.field55.field3577 = 3000;
        class6.field55.field3511 = 3000;
        if (!class42.field607 && class131.field2212 == 0) {
            class130.method998(class76.field1305, true);
            class22.method143(-29, 10);
            return;
        }
        if (class112.field1827 == 2) {
            class229.field3807 = class296.field4767 << 7;
            class281.field4617 = class32.field457 << 7;
        } else {
            class32.method220(-107);
        }
        if (class42.field607) {
            class74.method621(-119);
        }
        class198.method1525(false);
        class22.method143(-29, 28);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 75)
    public static final void method2254(byte arg0) {
        field5082++;
        class239.field3934 = -1;
        class340.field5442 = -1;
        class36.field520.field3760 = 0;
        class124.field2125 = -1;
        class29.field383.field3760 = 0;
        class220.field3497 = -1;
        class358.field5687 = false;
        class104.field1683 = 0;
        class116.field1950 = 0;
        class247.field4042 = 0;
        class223.field3706 = 0;
        class239.method1819(0);
        int var1 = 0;
        if (arg0 > -21) {
            method2256(-101, -110, 48, false);
        }
        while (var1 < class56.field924.length) {
            if (class56.field924[var1] != null) {
                class56.field924[var1].field3567 = -1;
            }
            var1++;
        }
        for (int var2 = 0; var2 < class165.field2621.length; var2++) {
            if (class165.field2621[var2] != null) {
                class165.field2621[var2].field3567 = -1;
            }
        }
        class232.method1791(-97);
        class112.field1827 = 1;
        class22.method143(-29, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class270.field4498[var3] = true;
        }
        class306.method2178((byte) -107);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V", line = 134)
    public static final void method2255(byte arg0) {
        int var1 = -44 / ((arg0 + 8) / 41);
        client.method353();
        field5078++;
        client.method347();
        client.method356();
        client.method361();
        client.method346();
        client.method363();
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIZ)I", line = 149)
    public static final int method2256(int arg0, int arg1, int arg2, boolean arg3) {
        field5085++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            if (!arg3) {
                method2255((byte) 46);
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V", line = 178)
    public static void method2257(boolean arg0) {
        field5081 = (byte[][][]) null;
        field5080 = null;
        field5088 = null;
        if (!arg0) {
            field5089 = 89;
        }
    }
}
