import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class138 extends class124 {

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "I")
    public int field3007 = 0;

    @OriginalMember(owner = "client!tf", name = "bb", descriptor = "Lpe;")
    public class109 field3014 = class87.field1853;

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
    public static int field3006 = 0;

    @OriginalMember(owner = "client!tf", name = "Y", descriptor = "Lpe;")
    public static class109 field3011 = class141.method1120("(U0a )2 non)2existant gosub script)2num: ", 0);

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "Lpe;")
    public static class109 field3004 = class141.method1120("<br>(X100(U(Y", 0);

    @OriginalMember(owner = "client!tf", name = "ab", descriptor = "I")
    public static volatile int field3013 = 0;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
    public int field3005;

    @OriginalMember(owner = "client!tf", name = "V", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!tf", name = "W", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!tf", name = "X", descriptor = "I")
    public int field3010;

    @OriginalMember(owner = "client!tf", name = "Z", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!tf", name = "cb", descriptor = "I")
    public int field3015;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "[I")
    public int[] field3000;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "[I")
    public int[] field3002;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "[Lpe;")
    public class109[] field3003;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIII)V")
    public static final void method1091(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -121 / ((arg4 + 10) / 42);
        for (int var6 = 0; var6 < class19.field490; var6++) {
            if (arg1 < class50.field1045[var6] + class61.field1207[var6] && class50.field1045[var6] < arg1 + arg2 && arg0 < class137.field2981[var6] + class114.field2520[var6] && class114.field2520[var6] < arg0 + arg3) {
                class11.field249[var6] = true;
            }
        }
        field3001++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILwa;)V")
    public static final void method1092(int arg0, class154 arg1) {
        if (class25.field614 == arg1.field3491) {
            class120.field2663[arg1.field3410] = true;
        }
        if (arg0 != 0) {
            field3004 = null;
        }
        field3012++;
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(B)V")
    public static void method1093(byte arg0) {
        field3011 = null;
        field3004 = null;
        if (arg0 != -35) {
            field3013 = -112;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lbe;I)V")
    public final void method1094(class13 arg0, int arg1) {
        field3009++;
        while (true) {
            int var3 = arg0.method142(arg1 + 27467);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    method1095(0, false);
                    return;
                }
            }
            this.method1096(var3, -2614, arg0);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)Lqb;")
    public static final class113 method1095(int arg0, boolean arg1) {
        field3008++;
        class113 var2 = (class113) class84.field1785.method93((byte) 103, (long) arg0);
        if (arg1) {
            field3006 = 18;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class38.field836.method742(arg0, 32, 9);
        class113 var4 = new class113();
        var4.field2463 = arg0;
        if (var3 != null) {
            var4.method938(-69, new class13(var3));
        }
        var4.method933(-20);
        class84.field1785.method97((long) arg0, (byte) -97, var4);
        return var4;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILbe;)V")
    private final void method1096(int arg0, int arg1, class13 arg2) {
        if (arg1 != -2614) {
            this.field3007 = 105;
        }
        if (arg0 == 1) {
            this.field3005 = arg2.method142(arg1 + 30081);
        } else if (arg0 == 2) {
            this.field3015 = arg2.method142(27467);
        } else if (arg0 == 3) {
            this.field3014 = arg2.method140(0);
        } else if (arg0 == 4) {
            this.field3010 = arg2.method112(false);
        } else if (arg0 == 5) {
            this.field3007 = arg2.method105(1375221240);
            this.field3003 = new class109[this.field3007];
            this.field3000 = new int[this.field3007];
            for (int var4 = 0; var4 < this.field3007; var4++) {
                this.field3000[var4] = arg2.method112(false);
                this.field3003[var4] = arg2.method140(0);
            }
        } else if (arg0 == 6) {
            this.field3007 = arg2.method105(1375221240);
            this.field3000 = new int[this.field3007];
            this.field3002 = new int[this.field3007];
            for (int var5 = 0; var5 < this.field3007; var5++) {
                this.field3000[var5] = arg2.method112(false);
                this.field3002[var5] = arg2.method112(false);
            }
        }
        field2999++;
    }
}
