import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class520 extends class125 {

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field7685;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "[B")
    public static byte[] field7683 = new byte[32896];

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "Loi;")
    public static class169 field7686;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
    public static int field7690;

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "Ljd;")
    public static class408 field7689;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    public static int field7691;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "I")
    public static int field7682;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
    public static int field7688;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field7683[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field7686 = new class169("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");
        field7690 = -1;
        field7689 = new class408(14, 0, 4, 1);
        field7691 = 0;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V", line = 6)
    public static final void method3088(int arg0, int arg1, int arg2) {
        class510 var3 = class470.field6877[arg0][arg1][arg2];
        if (var3 != null && var3.field7492 != null) {
            var3.field7492 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 16)
    public final void method3089(int arg0) {
        this.field7685.method2846();
        if (arg0 < 120) {
            field7688 = -35;
        }
        field7681++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V", line = 29)
    public static final void method3090(boolean arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class102.field1396[var1] = false;
        }
        field7680++;
        class174.field2245 = -1;
        class289.field3694 = 0;
        class336.field4297 = class261.field3319;
        class349.field4460 = class430.field5935;
        class221.field2854 = class291.field3724;
        if (!arg0) {
            return;
        }
        class93.field1304 = 0;
        class420.field5633 = class299.field3885;
        class72.field901 = class264.field3353;
        class53.field729 = class53.field730;
        class396.field5271 = 5;
        class445.field6190 = -1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBI)Leo;", line = 60)
    public static final class423 method3091(int arg0, byte arg1, int arg2) {
        field7678++;
        class423 var3 = class497.method2965(0, arg0);
        if (arg1 != 126) {
            return null;
        } else if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field5679 == null || var3.field5679.length <= arg2) {
            return null;
        } else {
            return var3.field5679[arg2];
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILbt;ILhs;)V", line = 81)
    public static final void method3092(int arg0, class88 arg1, int arg2, class441 arg3) {
        if (arg0 != 13361) {
            field7686 = null;
        }
        field7679++;
        class356 var4 = new class356();
        var4.field4573 = arg1.method617(2);
        var4.field4572 = arg1.method578(103);
        var4.field4578 = new int[var4.field4573];
        var4.field4579 = new int[var4.field4573];
        var4.field4576 = new int[var4.field4573];
        var4.field4577 = new class277[var4.field4573];
        var4.field4567 = new byte[var4.field4573][][];
        var4.field4580 = new class277[var4.field4573];
        for (int var5 = 0; var5 < var4.field4573; var5++) {
            try {
                int var6 = arg1.method617(2);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg1.method591(20557);
                    String var18 = arg1.method591(20557);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg1.method578(107);
                    }
                    var4.field4576[var5] = var6;
                    var4.field4578[var5] = var19;
                    var4.field4580[var5] = arg3.method2608(var18, class329.method1959(64, var17), (byte) 63);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg1.method591(arg0 ^ 0x647C);
                    String var8 = arg1.method591(20557);
                    int var9 = arg1.method617(2);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg1.method591(arg0 + 7196);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg1.method578(101);
                            var12[var13] = new byte[var14];
                            arg1.method596(30576, 0, var12[var13], var14);
                        }
                    }
                    var4.field4576[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class329.method1959(64, var10[var16]);
                    }
                    var4.field4577[var5] = arg3.method2613(var8, var15, (byte) -6, class329.method1959(class10.method73(arg0, 13425), var7));
                    var4.field4567[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field4579[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4579[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4579[var5] = -3;
            } catch (Exception var23) {
                var4.field4579[var5] = -4;
            } catch (Throwable var24) {
                var4.field4579[var5] = -5;
            }
        }
        class522.field7742.method42(var4, 0);
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V", line = 194)
    public static void method3093(int arg0) {
        if (arg0 <= 111) {
            field7688 = 25;
        }
        field7686 = null;
        field7683 = null;
        field7689 = null;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)V", line = 208)
    public static final void method3094(boolean arg0) {
        field7684++;
        if (arg0) {
            return;
        }
        for (class354 var1 = (class354) class460.field6425.method49(67); var1 != null; var1 = (class354) class460.field6425.method46((byte) 72)) {
            if (var1.field4545 > 0) {
                var1.field4545--;
            }
            if (var1.field4545 != 0) {
                if (var1.field4540 > 0) {
                    var1.field4540--;
                }
                if (var1.field4540 == 0 && var1.field4546 >= 1 && var1.field4538 >= 1 && (class200.field2594 - 2) >= var1.field4546 && var1.field4538 <= (class118.field1647 - 2) && (var1.field4539 < 0 || class333.method1982(7346, var1.field4539, var1.field4542))) {
                    class192.method1249(var1.field4544, var1.field4534, var1.field4538, var1.field4533, var1.field4539, 102, var1.field4546, var1.field4542, -1);
                    var1.field4540 = -1;
                    if (var1.field4539 == var1.field4535 && var1.field4535 == -1) {
                        var1.method3021(-96);
                    } else if (var1.field4539 == var1.field4535 && var1.field4548 == var1.field4534 && var1.field4542 == var1.field4537) {
                        var1.method3021(21);
                    }
                }
            } else if (var1.field4535 < 0 || class333.method1982(7346, var1.field4535, var1.field4537)) {
                class192.method1249(var1.field4544, var1.field4548, var1.field4538, var1.field4533, var1.field4535, 124, var1.field4546, var1.field4537, -1);
                var1.method3021(-108);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIB)I", line = 265)
    public static final int method3095(int arg0, int arg1, int arg2, byte arg3) {
        field7682++;
        if (arg3 == -47) {
            int var4 = 255 - arg0;
            int var5 = ((arg2 & 0xFF00) * arg0 & 0xFF0000 | (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
            return (((arg1 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg1 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
        } else {
            return 97;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(IBI)I", line = 280)
    public static final int method3096(int arg0, byte arg1, int arg2) {
        field7687++;
        if (arg0 == 4 || arg0 == 5) {
            return class263.field3341[arg2 & 0x3];
        } else if (arg1 == -42) {
            return 256;
        } else {
            return -118;
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(I)V", line = 293)
    public class520(int arg0) {
        this.field7685 = new NativeHeap(arg0);
    }
}
