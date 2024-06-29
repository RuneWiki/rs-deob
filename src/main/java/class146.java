import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class146 {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2391 = "Use";

    @OriginalMember(owner = "client!w", name = "i", descriptor = "[I")
    public static int[] field2389 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public int field2387;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public int field2396;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Lqi;")
    public static class131 field2392;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Leb;")
    public class247 field2394;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "[I")
    public int[] field2383;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "[I")
    public int[] field2385;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "[I")
    public int[] field2393;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "[I")
    public int[] field2399;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "[I")
    public int[] field2401;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "[I")
    public int[] field2402;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "[Leb;")
    public class247[] field2388;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "[[I")
    public int[][] field2397;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "[[I")
    public int[][] field2400;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B[B)V")
    private final void method1044(byte arg0, byte[] arg1) {
        class152 var3 = new class152(class286.method1945(-125, arg1));
        field2386++;
        int var4 = var3.method1111(255);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        } else if (arg0 == 117) {
            if (var4 < 6) {
                this.field2387 = 0;
            } else {
                this.field2387 = var3.method1097(126);
            }
            int var5 = 0;
            int var6 = var3.method1111(255);
            int var7 = -1;
            this.field2403 = var3.method1126(false);
            this.field2399 = new int[this.field2403];
            for (int var8 = 0; var8 < this.field2403; var8++) {
                this.field2399[var8] = var5 += var3.method1126(false);
                if (this.field2399[var8] > var7) {
                    var7 = this.field2399[var8];
                }
            }
            this.field2396 = var7 + 1;
            this.field2383 = new int[this.field2396];
            this.field2393 = new int[this.field2396];
            this.field2397 = new int[this.field2396][];
            this.field2385 = new int[this.field2396];
            this.field2401 = new int[this.field2396];
            if (var6 != 0) {
                this.field2402 = new int[this.field2396];
                for (int var9 = 0; var9 < this.field2396; var9++) {
                    this.field2402[var9] = -1;
                }
                for (int var10 = 0; var10 < this.field2403; var10++) {
                    this.field2402[this.field2399[var10]] = var3.method1097(class148.method1051(arg0, 10));
                }
                this.field2394 = new class247(this.field2402);
            }
            for (int var11 = 0; var11 < this.field2403; var11++) {
                this.field2401[this.field2399[var11]] = var3.method1097(127);
            }
            for (int var12 = 0; var12 < this.field2403; var12++) {
                this.field2383[this.field2399[var12]] = var3.method1097(126);
            }
            for (int var13 = 0; var13 < this.field2403; var13++) {
                this.field2393[this.field2399[var13]] = var3.method1126(false);
            }
            for (int var14 = 0; var14 < this.field2403; var14++) {
                int var21 = this.field2399[var14];
                int var22 = this.field2393[var21];
                this.field2397[var21] = new int[var22];
                int var23 = 0;
                int var24 = -1;
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2397[var21][var25] = var23 += var3.method1126(false);
                    if (var24 < var26) {
                        var24 = var26;
                    }
                }
                this.field2385[var21] = var24 + 1;
                if ((var24 + 1) == var22) {
                    this.field2397[var21] = null;
                }
            }
            if (var6 != 0) {
                this.field2400 = new int[var7 + 1][];
                this.field2388 = new class247[var7 + 1];
                for (int var15 = 0; var15 < this.field2403; var15++) {
                    int var16 = this.field2399[var15];
                    int var17 = this.field2393[var16];
                    this.field2400[var16] = new int[this.field2385[var16]];
                    for (int var18 = 0; var18 < this.field2385[var16]; var18++) {
                        this.field2400[var16][var18] = -1;
                    }
                    for (int var19 = 0; var19 < var17; var19++) {
                        int var20;
                        if (this.field2397[var16] == null) {
                            var20 = var19;
                        } else {
                            var20 = this.field2397[var16][var19];
                        }
                        this.field2400[var16][var20] = var3.method1097(127);
                    }
                    this.field2388[var16] = new class247(this.field2400[var16]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Llc;B)V")
    public static final void method1045(class86 arg0, byte arg1) {
        class111.field1605 = arg0;
        field2395++;
        if (arg1 != -95) {
            method1048((Component) null, -76);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static void method1046(byte arg0) {
        field2392 = null;
        field2391 = null;
        if (arg0 != -47) {
            field2384 = 124;
        }
        field2389 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static final void method1047(int arg0) {
        class160.field2624.method1035(111);
        class101.field1488.method1585((byte) -2);
        if (arg0 < 72) {
            field2384 = 65;
        }
        field2398++;
        class171.field2758.method1585((byte) -2);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1048(Component arg0, int arg1) {
        field2382++;
        int var2 = 31 % ((83 - arg1) / 39);
        Method var3 = class7.field76;
        if (var3 != null) {
            try {
                var3.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class220.field3524);
        arg0.addFocusListener(class220.field3524);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "([BI)V")
    public class146(byte[] arg0, int arg1) {
        this.field2381 = class254.method1802(arg0, 0, arg0.length);
        if (this.field2381 != arg1) {
            throw new RuntimeException();
        }
        this.method1044((byte) 117, arg0);
    }
}
