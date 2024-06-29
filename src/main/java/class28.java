import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class28 extends class152 {

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "Lce;")
    private static class126 field394 = class206.method1445(-7923, "level: ");

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "Lce;")
    public static class126 field388 = field394;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V", line = 12)
    public static final void method129(int arg0) {
        field391++;
        if (arg0 != -17919) {
            field393 = 66;
        }
        class265.field4493.method1178(arg0 ^ 0x45B9);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZI)[I", line = 30)
    public final int[] method6(boolean arg0, int arg1) {
        field390++;
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (this.field2776.field4516) {
            int var4 = class122.field2038[arg1];
            for (int var5 = 0; var5 < class244.field4133; var5++) {
                var3[var5] = this.method130(var4, 105, class29.field406[var5]) % 4096;
            }
        }
        if (!arg0) {
            method129(97);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 59)
    public class28() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(III)I", line = 65)
    private final int method130(int arg0, int arg1, int arg2) {
        field389++;
        int var4 = arg2 + (arg0 * 57);
        if (arg1 <= 5) {
            field388 = (class126) null;
        }
        int var5 = var4 << 1 ^ var4;
        return 4096 - ((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V", line = 84)
    public static void method131(boolean arg0) {
        field394 = null;
        if (!arg0) {
            field388 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lbb;Lvh;II)V", line = 96)
    public static final void method132(class134 arg0, class147 arg1, int arg2, int arg3) {
        field392++;
        class202 var4 = new class202();
        var4.field3460 = arg0.method948(-121);
        var4.field3461 = arg0.method957(496113200);
        var4.field3455 = new class60[var4.field3460];
        var4.field3464 = new int[var4.field3460];
        var4.field3451 = new int[var4.field3460];
        int var5 = 54 / ((arg3) / 51);
        var4.field3454 = new class60[var4.field3460];
        var4.field3457 = new int[var4.field3460];
        var4.field3458 = new byte[var4.field3460][][];
        for (int var6 = 0; var6 < var4.field3460; var6++) {
            try {
                int var7 = arg0.method948(-128);
                if (var7 == 0 || var7 == 1 || var7 == 2) {
                    String var8 = new String(arg0.method970(1).method860((byte) -49));
                    int var9 = 0;
                    String var10 = new String(arg0.method970(1).method860((byte) -49));
                    if (var7 == 1) {
                        var9 = arg0.method957(496113200);
                    }
                    var4.field3464[var6] = var7;
                    var4.field3451[var6] = var9;
                    var4.field3455[var6] = arg1.method1089(true, var10, class129.method892(-60, var8));
                } else if (var7 == 3 || var7 == 4) {
                    String var11 = new String(arg0.method970(1).method860((byte) -49));
                    String var12 = new String(arg0.method970(1).method860((byte) -49));
                    int var13 = arg0.method948(-122);
                    String[] var14 = new String[var13];
                    for (int var15 = 0; var15 < var13; var15++) {
                        var14[var15] = new String(arg0.method970(1).method860((byte) -49));
                    }
                    byte[][] var16 = new byte[var13][];
                    if (var7 == 3) {
                        for (int var17 = 0; var17 < var13; var17++) {
                            int var18 = arg0.method957(496113200);
                            var16[var17] = new byte[var18];
                            arg0.method968(var16[var17], var18, 46, 0);
                        }
                    }
                    var4.field3464[var6] = var7;
                    Class[] var19 = new Class[var13];
                    for (int var20 = 0; var20 < var13; var20++) {
                        var19[var20] = class129.method892(-127, var14[var20]);
                    }
                    var4.field3454[var6] = arg1.method1096(class129.method892(-103, var11), true, var19, var12);
                    var4.field3458[var6] = var16;
                }
            } catch (ClassNotFoundException var26) {
                var4.field3457[var6] = -1;
            } catch (SecurityException var27) {
                var4.field3457[var6] = -2;
            } catch (NullPointerException var28) {
                var4.field3457[var6] = -3;
            } catch (Exception var29) {
                var4.field3457[var6] = -4;
            } catch (Throwable var30) {
                var4.field3457[var6] = -5;
            }
        }
        class57.field890.method899(var4, -28);
    }
}
