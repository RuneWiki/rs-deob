import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class621 implements class21 {

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "Lrt;")
    public class212 field8233;

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "I")
    public int field8237;

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
    public int field8236;

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
    public int field8235;

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "Lcp;")
    public class679 field8238;

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
    public static int field8239 = 0;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
    public static int field8232;

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
    public static int field8234;

    @OriginalMember(owner = "client!ica", name = "i", descriptor = "I")
    public static int field8240;

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(ILrt;Lcp;II)V")
    public class621(int arg0, class212 arg1, class679 arg2, int arg3, int arg4) {
        this.field8233 = arg1;
        this.field8237 = arg4;
        this.field8236 = arg3;
        this.field8235 = arg0;
        this.field8238 = arg2;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)Los;")
    public class412 method193(byte arg0) {
        if (arg0 >= -21) {
            this.field8233 = null;
        }
        field8232++;
        return class273.field3797;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Leh;IZLii;)V")
    public static final void method3402(class335 arg0, int arg1, boolean arg2, class519 arg3) {
        field8234++;
        class690 var4 = new class690();
        var4.field9727 = arg0.method2034(255);
        var4.field9729 = arg0.method2045(-98);
        var4.field9719 = new class192[var4.field9727];
        var4.field9710 = new int[var4.field9727];
        var4.field9715 = new class192[var4.field9727];
        var4.field9723 = new byte[var4.field9727][][];
        var4.field9712 = new int[var4.field9727];
        var4.field9716 = new int[var4.field9727];
        if (arg2) {
            field8240 = -116;
        }
        for (int var5 = 0; var5 < var4.field9727; var5++) {
            try {
                int var6 = arg0.method2034(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg0.method2029((byte) -120);
                    String var18 = arg0.method2029((byte) -78);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg0.method2045(-98);
                    }
                    var4.field9710[var5] = var6;
                    var4.field9716[var5] = var19;
                    var4.field9719[var5] = arg3.method2891(class569.method3132(true, var17), -4, var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg0.method2029((byte) -72);
                    String var8 = arg0.method2029((byte) -78);
                    int var9 = arg0.method2034(255);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg0.method2029((byte) -61);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method2045(-98);
                            var12[var13] = new byte[var14];
                            arg0.method1985((byte) 0, var14, var12[var13], 0);
                        }
                    }
                    var4.field9710[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class569.method3132(true, var10[var16]);
                    }
                    var4.field9715[var5] = arg3.method2901(false, var15, var8, class569.method3132(true, var7));
                    var4.field9723[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field9712[var5] = -1;
            } catch (SecurityException var21) {
                var4.field9712[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field9712[var5] = -3;
            } catch (Exception var23) {
                var4.field9712[var5] = -4;
            } catch (Throwable var24) {
                var4.field9712[var5] = -5;
            }
        }
        class214.field3063.method3265(var4, (byte) -66);
    }
}
