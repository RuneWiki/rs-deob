import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class289 extends class376 {

    @OriginalMember(owner = "client!ep", name = "G", descriptor = "Lg;")
    public class107 field4158;

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "[I")
    public static int[] field4151 = new int[5];

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
    public static int field4154 = 0;

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!ep", name = "D", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!ep", name = "F", descriptor = "Z")
    public static boolean field4157;

    @OriginalMember(owner = "client!ep", name = "E", descriptor = "[I")
    public static int[] field4156;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "(B)V", line = 6)
    public static void method1827(byte arg0) {
        field4156 = null;
        if (arg0 != 122) {
            field4157 = true;
        }
        field4151 = null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(III)V", line = 20)
    public static final void method1828(int arg0, int arg1, int arg2) {
        if (arg1 != 29310) {
            field4154 = -83;
        }
        field4152++;
        if (class61.field703 == class51.field564) {
            if (!class139.method1044(0, arg2, arg0, 1, false, 1, 0, -2, arg1 - 29204)) {
                class139.method1044(0, arg2, arg0, 1, false, 1, 0, -3, arg1 ^ 0x720F);
            }
        } else if (!class139.method1044(0, arg2, arg0, 1, false, 1, 0, -3, 112)) {
            class139.method1044(0, arg2, arg0, 1, false, 1, 0, -2, 102);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Liv;ILet;I)V", line = 47)
    public static final void method1829(class65 arg0, int arg1, class419 arg2, int arg3) {
        if (arg3 != -12508) {
            return;
        }
        field4155++;
        class123 var4 = new class123();
        var4.field1797 = arg0.method577(255);
        var4.field1800 = arg0.method616((byte) 88);
        var4.field1794 = new byte[var4.field1797][][];
        var4.field1801 = new class449[var4.field1797];
        var4.field1798 = new int[var4.field1797];
        var4.field1795 = new class449[var4.field1797];
        var4.field1804 = new int[var4.field1797];
        var4.field1799 = new int[var4.field1797];
        for (int var5 = 0; var5 < var4.field1797; var5++) {
            try {
                int var6 = arg0.method577(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg0.method624((byte) -40);
                    String var8 = arg0.method624((byte) -40);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method616((byte) 100);
                    }
                    var4.field1798[var5] = var6;
                    var4.field1799[var5] = var9;
                    var4.field1795[var5] = arg2.method2573(-115, class478.method2890(var7, false), var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg0.method624((byte) -40);
                    String var11 = arg0.method624((byte) -40);
                    int var12 = arg0.method577(arg3 + 12763);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg0.method624((byte) -40);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method616((byte) 82);
                            var15[var16] = new byte[var17];
                            arg0.method595((byte) 22, var17, 0, var15[var16]);
                        }
                    }
                    var4.field1798[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class478.method2890(var13[var19], false);
                    }
                    var4.field1801[var5] = arg2.method2553(var18, var11, class478.method2890(var10, false), arg3 + 12510);
                    var4.field1794[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1804[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1804[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1804[var5] = -3;
            } catch (Exception var23) {
                var4.field1804[var5] = -4;
            } catch (Throwable var24) {
                var4.field1804[var5] = -5;
            }
        }
        class39.field449.method1015(false, var4);
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lg;)V", line = 168)
    public class289(class107 arg0) {
        this.field4158 = arg0;
    }
}
