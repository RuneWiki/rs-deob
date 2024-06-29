import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class645 {

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Leda;")
    private class14 field9198 = new class14(64);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lla;")
    private class422 field9191;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Ltg;")
    public static class605 field9194 = new class605();

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field9192;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field9193;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field9195;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field9196;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field9197;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static void method3637(boolean arg0) {
        if (arg0) {
            method3637(true);
        }
        field9194 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()V")
    public static final void method3638() {
        if (class475.field6899 != null) {
            for (int var0 = 0; var0 < class475.field6899.length; var0++) {
                for (int var1 = 0; var1 < class42.field727; var1++) {
                    for (int var2 = 0; var2 < class54.field870; var2++) {
                        if (class475.field6899[var0][var1][var2] != null) {
                            class475.field6899[var0][var1][var2].method920(-440667103);
                        }
                        class475.field6899[var0][var1][var2] = null;
                    }
                }
            }
        }
        class475.field6899 = null;
        class121.field1867 = null;
        if (class576.field8160 != null) {
            for (int var3 = 0; var3 < class576.field8160.length; var3++) {
                for (int var4 = 0; var4 < class42.field727; var4++) {
                    for (int var5 = 0; var5 < class54.field870; var5++) {
                        if (class576.field8160[var3][var4][var5] != null) {
                            class576.field8160[var3][var4][var5].method920(-440667103);
                        }
                        class576.field8160[var3][var4][var5] = null;
                    }
                }
            }
        }
        class576.field8160 = null;
        class152.field2374 = null;
        class488.field7062 = null;
        class211.field3511 = null;
        class52.field838 = null;
        class135.field2156 = null;
        class426.field6258 = null;
        class314.field4726 = null;
        class370.field5622 = null;
        class525.method3122(89);
        if (class81.field1166 != null) {
            for (int var6 = 0; var6 < class266.field4132; var6++) {
                class81.field1166[var6] = null;
            }
            class266.field4132 = 0;
        }
        class335.field4904 = null;
        class231.field3722 = null;
        class24.field240 = null;
        if (class563.field7976 != null) {
            for (int var7 = 0; var7 < class563.field7976.length; var7++) {
                class563.field7976[var7] = null;
            }
            class641.field9058 = 0;
        }
        if (class553.field7883 != null) {
            for (int var8 = 0; var8 < class553.field7883.length; var8++) {
                class553.field7883[var8] = null;
            }
            class8.field77 = 0;
        }
        if (class96.field1422 != null) {
            for (int var9 = 0; var9 < class145.field2253; var9++) {
                class96.field1422[var9] = null;
            }
            for (int var10 = 0; var10 < class386.field5782; var10++) {
                for (int var11 = 0; var11 < class42.field727; var11++) {
                    for (int var12 = 0; var12 < class54.field870; var12++) {
                        class324.field4792[var10][var11][var12] = 0L;
                    }
                }
            }
            class145.field2253 = 0;
        }
        class386.method2415((byte) 98);
        class532.field7659 = class532.field7658;
        class532.field7659.method3(32767);
        class500.field7266 = null;
        class487.field7049 = null;
        class233.field3752 = null;
        if (class147.field2305 != null) {
            class12.method55();
            class478.field6933.method322(1);
            class478.field6933.method229(0);
        }
        if (class222.field3605 != null) {
            class222.field3605 = null;
        }
        class478.field6933 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public final void method3639(int arg0) {
        class14 var2 = this.field9198;
        synchronized (this.field9198) {
            this.field9198.method71((byte) 44);
        }
        if (arg0 == 0) {
            field9195++;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)Lmh;")
    public final class177 method3640(byte arg0, int arg1) {
        field9197++;
        class14 var3 = this.field9198;
        class177 var4;
        synchronized (this.field9198) {
            var4 = (class177) this.field9198.method80((byte) -36, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field9191;
        byte[] var6;
        synchronized (this.field9191) {
            var6 = this.field9191.method2624(0, 35, arg1);
        }
        class177 var7 = new class177();
        if (var6 != null) {
            var7.method1380((byte) -95, new class301(var6));
        }
        var7.method1381(arg0 ^ 0xFFFFFFAD);
        class14 var8 = this.field9198;
        synchronized (this.field9198) {
            this.field9198.method67((long) arg1, var7, -6772);
            if (arg0 != 115) {
                method3637(false);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public final void method3641(int arg0) {
        class14 var2 = this.field9198;
        synchronized (this.field9198) {
            int var3 = -128 % ((-arg0 - 74) / 51);
            this.field9198.method76(-114);
        }
        field9192++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
    public final void method3642(int arg0, boolean arg1) {
        class14 var3 = this.field9198;
        synchronized (this.field9198) {
            this.field9198.method68(-16878, arg0);
            if (arg1) {
                this.field9198 = null;
            }
        }
        field9193++;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lcr;ILla;)V")
    public class645(class292 arg0, int arg1, class422 arg2) {
        this.field9191 = arg2;
        if (this.field9191 != null) {
            this.field9191.method2615(0, 35);
        }
    }
}
