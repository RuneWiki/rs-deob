import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class416 extends class130 {

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public int field6107;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public int field6109;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "[Z")
    public boolean[] field6110;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "[I")
    public int[] field6118;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "[I")
    public int[] field6113;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "[[I")
    public int[][] field6112;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Lfi;")
    public static class38 field6108 = null;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field6117 = 0;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field6116 = 0;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Z")
    public static boolean field6114 = false;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method2603(int arg0) {
        if (arg0 != 16184) {
            method2603(-50);
        }
        field6108 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lza;B)V")
    public static final void method2604(class299 arg0, byte arg1) {
        field6115++;
        if (arg1 < 40) {
            field6108 = null;
        }
        if (class86.field1411) {
            class369.method2348(-8648, arg0);
        } else {
            class359.method2286(arg0, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIBI)I")
    public static final int method2605(int arg0, int arg1, byte arg2, int arg3) {
        field6111++;
        if (class407.field6024 == null) {
            return 0;
        }
        int var4 = arg1 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > (class338.field5076 - 1) || var5 > class250.field4077 - 1) {
            return 0;
        }
        int var6 = -72 % ((51 - arg2) / 57);
        int var7 = arg3;
        if (arg3 < 3 && (class229.field3460[1][var4][var5] & 0x2) != 0) {
            var7 = arg3 + 1;
        }
        return class407.field6024[var7].method68(arg1, arg0);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lbc;IIIII)V")
    public static final void method2606(class512 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field7487 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field7484[var6] != null) {
                arg0.field7487++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field7487; var7++) {
            long var8 = class424.field6221[arg1][arg2][arg3];
            while (var8 != 0L) {
                class181 var14 = class356.field5270[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field7484[var7] == var14.field2775) {
                    continue label50;
                }
            }
            long var10 = class424.field6221[arg1][arg4][arg5];
            while (var10 != 0L) {
                class181 var13 = class356.field5270[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field7484[var7] == var13.field2775) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field7487 - 1; var12++) {
                arg0.field7484[var12] = arg0.field7484[var12 + 1];
            }
            arg0.field7487--;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I[B)V")
    public class416(int arg0, byte[] arg1) {
        this.field6107 = arg0;
        class194 var3 = new class194(arg1);
        this.field6109 = var3.method1337((byte) 0);
        this.field6110 = new boolean[this.field6109];
        this.field6118 = new int[this.field6109];
        this.field6113 = new int[this.field6109];
        this.field6112 = new int[this.field6109][];
        for (int var4 = 0; var4 < this.field6109; var4++) {
            this.field6118[var4] = var3.method1337((byte) -125);
        }
        for (int var5 = 0; var5 < this.field6109; var5++) {
            this.field6110[var5] = var3.method1337((byte) -111) == 1;
        }
        for (int var6 = 0; var6 < this.field6109; var6++) {
            this.field6113[var6] = var3.method1396(-82);
        }
        for (int var7 = 0; var7 < this.field6109; var7++) {
            this.field6112[var7] = new int[var3.method1337((byte) -111)];
        }
        for (int var8 = 0; var8 < this.field6109; var8++) {
            for (int var9 = 0; var9 < this.field6112[var8].length; var9++) {
                this.field6112[var8][var9] = var3.method1337((byte) -124);
            }
        }
    }
}
