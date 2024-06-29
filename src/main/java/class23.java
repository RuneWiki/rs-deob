import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class23 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field249 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public int field250;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public int field252;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public int field254;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Llf;")
    public static class94 field251;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILhc;Lca;)V")
    public static final void method158(int arg0, int arg1, class53 arg2, class122 arg3) {
        field255++;
        class182 var4 = new class182();
        var4.field2739 = arg2.method366(-16505);
        var4.field2738 = arg2.method340(-116);
        var4.field2734 = new class60[var4.field2739];
        if (arg0 != -28881) {
            field249 = 111;
        }
        var4.field2729 = new byte[var4.field2739][][];
        var4.field2737 = new int[var4.field2739];
        var4.field2726 = new int[var4.field2739];
        var4.field2728 = new int[var4.field2739];
        var4.field2733 = new class60[var4.field2739];
        for (int var5 = 0; var5 < var4.field2739; var5++) {
            try {
                int var6 = arg2.method366(-16505);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg2.method326(119);
                    String var8 = arg2.method326(63);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg2.method340(-90);
                    }
                    var4.field2726[var5] = var6;
                    var4.field2737[var5] = var9;
                    var4.field2733[var5] = arg3.method934((byte) -67, class30.method189(arg0 + 28880, var7), var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg2.method326(arg0 + 28989);
                    String var11 = arg2.method326(109);
                    int var12 = arg2.method366(-16505);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg2.method326(arg0 + 28965);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method340(arg0 ^ 0x70B5);
                            var15[var16] = new byte[var17];
                            arg2.method364(-1665308089, var17, 0, var15[var16]);
                        }
                    }
                    var4.field2726[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class30.method189(-1, var13[var19]);
                    }
                    var4.field2734[var5] = arg3.method938(var11, var18, 0, class30.method189(-1, var10));
                    var4.field2729[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2728[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2728[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2728[var5] = -3;
            } catch (Exception var23) {
                var4.field2728[var5] = -4;
            } catch (Throwable var24) {
                var4.field2728[var5] = -5;
            }
        }
        class159.field2475.method13(arg0 + 28913, var4);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method159(int arg0) {
        field251 = null;
        if (arg0 > -82) {
            field251 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILlc;)V")
    public static final void method160(int arg0, class270 arg1) {
        class231.field3394 = arg1;
        field253++;
        if (arg0 != 0) {
            method160(-26, (class270) null);
        }
    }
}
