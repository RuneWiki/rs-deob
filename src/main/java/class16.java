import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public abstract class class16 extends class499 {

    @OriginalMember(owner = "client!l", name = "o", descriptor = "Lfg;")
    public static class83 field173 = new class83("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field175 = 0;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)Lvq;")
    public static final class320 method133(boolean arg0) {
        if (arg0) {
            field175 = 115;
        }
        class12.field139 = 0;
        field172++;
        return class300.method1716(0);
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V")
    public static void method134(byte arg0) {
        field173 = null;
        if (arg0 > -26) {
            method135(null, null, 58, -89);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Llh;Lkj;II)V")
    public static final void method135(class365 arg0, class397 arg1, int arg2, int arg3) {
        field174++;
        class257 var4 = new class257();
        var4.field3555 = arg0.method2099(255);
        var4.field3559 = arg0.method2056((byte) -36);
        var4.field3560 = new int[var4.field3555];
        var4.field3553 = new int[var4.field3555];
        int var5 = 82 / ((arg2 + 54) / 44);
        var4.field3558 = new byte[var4.field3555][][];
        var4.field3554 = new class409[var4.field3555];
        var4.field3556 = new int[var4.field3555];
        var4.field3552 = new class409[var4.field3555];
        for (int var6 = 0; var6 < var4.field3555; var6++) {
            try {
                int var7 = arg0.method2099(255);
                if (var7 == 0 || var7 == 1 || var7 == 2) {
                    String var18 = arg0.method2106(-1);
                    String var19 = arg0.method2106(-1);
                    int var20 = 0;
                    if (var7 == 1) {
                        var20 = arg0.method2056((byte) -62);
                    }
                    var4.field3556[var6] = var7;
                    var4.field3553[var6] = var20;
                    var4.field3552[var6] = arg1.method2294(class13.method111(var18, -97), 0, var19);
                } else if (var7 == 3 || var7 == 4) {
                    String var8 = arg0.method2106(-1);
                    String var9 = arg0.method2106(-1);
                    int var10 = arg0.method2099(255);
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = arg0.method2106(-1);
                    }
                    byte[][] var13 = new byte[var10][];
                    if (var7 == 3) {
                        for (int var14 = 0; var14 < var10; var14++) {
                            int var15 = arg0.method2056((byte) -91);
                            var13[var14] = new byte[var15];
                            arg0.method2071(var13[var14], var15, 0, -713458872);
                        }
                    }
                    var4.field3556[var6] = var7;
                    Class[] var16 = new Class[var10];
                    for (int var17 = 0; var17 < var10; var17++) {
                        var16[var17] = class13.method111(var11[var17], -92);
                    }
                    var4.field3554[var6] = arg1.method2271(var16, -8413, var9, class13.method111(var8, -90));
                    var4.field3558[var6] = var13;
                }
            } catch (ClassNotFoundException var21) {
                var4.field3560[var6] = -1;
            } catch (SecurityException var22) {
                var4.field3560[var6] = -2;
            } catch (NullPointerException var23) {
                var4.field3560[var6] = -3;
            } catch (Exception var24) {
                var4.field3560[var6] = -4;
            } catch (Throwable var25) {
                var4.field3560[var6] = -5;
            }
        }
        class400.field5572.method3070(var4, (byte) -119);
    }
}
