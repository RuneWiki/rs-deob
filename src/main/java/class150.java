import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class150 extends class23 {

    @OriginalMember(owner = "client!sm", name = "cb", descriptor = "I")
    private int field2511 = 4096;

    @OriginalMember(owner = "client!sm", name = "ib", descriptor = "Lqd;")
    public static class40 field2517 = class147.method1106("<col=40ff00>", (byte) -87);

    @OriginalMember(owner = "client!sm", name = "hb", descriptor = "Lqd;")
    public static class40 field2516 = class147.method1106("Hierhin gehen", (byte) -126);

    @OriginalMember(owner = "client!sm", name = "kb", descriptor = "[I")
    public static int[] field2519 = new int[25];

    @OriginalMember(owner = "client!sm", name = "lb", descriptor = "Lqd;")
    public static class40 field2520 = class147.method1106(")0", (byte) -44);

    @OriginalMember(owner = "client!sm", name = "Y", descriptor = "Lpl;")
    public static class186 field2507 = new class186(20);

    @OriginalMember(owner = "client!sm", name = "mb", descriptor = "Lqd;")
    public static class40 field2521 = class147.method1106("<col=ff7000>", (byte) -75);

    @OriginalMember(owner = "client!sm", name = "pb", descriptor = "Lqd;")
    public static class40 field2524 = class147.method1106("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", (byte) -102);

    @OriginalMember(owner = "client!sm", name = "Z", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!sm", name = "bb", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!sm", name = "db", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!sm", name = "eb", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!sm", name = "fb", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!sm", name = "gb", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!sm", name = "jb", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!sm", name = "ob", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!sm", name = "ab", descriptor = "[I")
    public static int[] field2509;

    @OriginalMember(owner = "client!sm", name = "nb", descriptor = "[I")
    public static int[] field2522;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI)[I", line = 7)
    public final int[] method32(byte arg0, int arg1) {
        int[] var3 = this.field403.method724(arg0, arg1);
        field2515++;
        if (this.field403.field1760) {
            int[] var4 = this.method174(0, 0, class212.field3384 & arg1 - 1);
            int[] var5 = this.method174(0, arg0 ^ 0xFFFFFFA2, arg1);
            int[] var6 = this.method174(0, 0, class212.field3384 & arg1 + 1);
            for (int var7 = 0; var7 < class52.field1007; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field2511;
                int var9 = var8 >> 12;
                int var10 = (var5[class6.field92 & var7 + 1] - var5[class6.field92 & var7 - 1]) * this.field2511;
                int var11 = var10 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var9 * var9 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 - (-var13 - 4096)) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lqd;B)V", line = 55)
    public static final void method1122(class40 arg0, byte arg1) {
        if (arg1 > -42) {
            method1124(-61, 83, -127, true, (int[]) null);
        }
        field2508++;
        for (class208 var2 = (class208) class80.field1386.method1971(100); var2 != null; var2 = (class208) class80.field1386.method1967(100)) {
            if (var2.field3319.method345(arg0, false)) {
                class254.field4205 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(Z)V", line = 94)
    public static final void method1123(boolean arg0) {
        class217 var1 = new class217();
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class59.field1140[var2][var3] = var1;
            }
        }
        if (!arg0) {
            method1124(89, 92, 65, true, (int[]) null);
        }
        field2513++;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 121)
    public class150() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIZ[I)V", line = 127)
    public static final void method1124(int arg0, int arg1, int arg2, boolean arg3, int[] arg4) {
        field2512++;
        arg1--;
        if (!arg3) {
            return;
        }
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (arg1 < var5) {
            int var7 = arg1 + 1;
            arg4[var7] = arg2;
            int var8 = var7 + 1;
            arg4[var8] = arg2;
            int var9 = var8 + 1;
            arg4[var9] = arg2;
            int var10 = var9 + 1;
            arg4[var10] = arg2;
            int var11 = var10 + 1;
            arg4[var11] = arg2;
            int var12 = var11 + 1;
            arg4[var12] = arg2;
            int var13 = var12 + 1;
            arg4[var13] = arg2;
            arg1 = var13 + 1;
            arg4[arg1] = arg2;
        }
        while (var6 > arg1) {
            arg1++;
            arg4[arg1] = arg2;
        }
    }

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "(I)V", line = 164)
    public static final void method1125(int arg0) {
        class246.field4072 = arg0;
        for (int var1 = 0; var1 < class90.field1632; var1++) {
            for (int var2 = 0; var2 < class285.field4807; var2++) {
                if (class93.field1690[arg0][var1][var2] == null) {
                    class93.field1690[arg0][var1][var2] = new class14(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "(I)V", line = 188)
    public static final void method1126(int arg0) {
        class254.field4202.method1347(0);
        class68.field1245.method1347(0);
        if (arg0 != -1) {
            field2520 = (class40) null;
        }
        field2514++;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZILce;BII)V", line = 207)
    public static final void method1127(boolean arg0, int arg1, class239 arg2, byte arg3, int arg4, int arg5) {
        class52.field1017 = 1;
        class309.field5182 = arg5;
        class95.field1708 = arg4;
        field2518++;
        class207.field3309 = arg0;
        class109.field1913 = arg2;
        class95.field1718 = 10000;
        if (arg3 >= 115) {
            class62.field1182 = arg1;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V", line = 227)
    public static void method1128(byte arg0) {
        field2524 = null;
        field2517 = null;
        if (arg0 != -30) {
            return;
        }
        field2516 = null;
        field2521 = null;
        field2519 = null;
        field2507 = null;
        field2522 = null;
        field2520 = null;
        field2509 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILsd;)V", line = 245)
    public final void method23(int arg0, int arg1, class26 arg2) {
        field2510++;
        if (arg0 == arg1) {
            this.field2511 = arg2.method197(-1);
        }
    }
}
