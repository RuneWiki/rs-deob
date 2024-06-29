import java.awt.Canvas;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public abstract class class145 {

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "S")
    public static short field2394 = 256;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "Z")
    public static boolean field2406 = false;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "Lmu;")
    public static class303 field2396 = new class303(24, 6);

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public int field2398;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public int field2402;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "Lmi;")
    public static class496 field2400;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mr", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field2407;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mr", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field2408;

    // $FF: synthetic method
    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1145(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)Z", line = 4)
    public final boolean method1137(boolean arg0) {
        field2401++;
        if (!arg0) {
            field2406 = false;
        }
        return (this.field2402 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V", line = 16)
    public static void method1138(int arg0) {
        field2396 = null;
        field2400 = null;
        if (arg0 > -19) {
            method1142(-89, null, null, -72);
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)Z", line = 27)
    public final boolean method1139(int arg0) {
        int var2 = 101 / ((54 - arg0) / 47);
        field2393++;
        return (this.field2402 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)I", line = 37)
    public static final int method1140(int arg0) {
        field2395++;
        int var1 = 0;
        if (arg0 != -1) {
            method1142(117, null, null, 29);
        }
        Field[] var2 = (field2407 == null ? (field2407 = method1145("dh")) : field2407).getDeclaredFields();
        Field[] var3 = var2;
        for (int var4 = 0; var4 < var3.length; var4++) {
            Field var5 = var3[var4];
            if ((field2408 == null ? (field2408 = method1145("su")) : field2408).isAssignableFrom(var5.getType())) {
                var1++;
            }
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)Z", line = 71)
    public final boolean method1141(int arg0) {
        field2397++;
        int var2 = -62 % ((arg0 + 5) / 47);
        return (this.field2402 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILcea;Lwea;I)V", line = 83)
    public static final void method1142(int arg0, class215 arg1, class158 arg2, int arg3) {
        field2404++;
        class688 var4 = new class688();
        var4.field9285 = arg1.method1535(255);
        var4.field9289 = arg1.method1533((byte) -126);
        var4.field9291 = new int[var4.field9285];
        var4.field9287 = new byte[var4.field9285][][];
        var4.field9286 = new class622[var4.field9285];
        if (arg3 <= 90) {
            return;
        }
        var4.field9294 = new class622[var4.field9285];
        var4.field9290 = new int[var4.field9285];
        var4.field9295 = new int[var4.field9285];
        for (int var5 = 0; var5 < var4.field9285; var5++) {
            try {
                int var6 = arg1.method1535(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg1.method1525((byte) 103);
                    String var18 = arg1.method1525((byte) 109);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg1.method1533((byte) -126);
                    }
                    var4.field9291[var5] = var6;
                    var4.field9295[var5] = var19;
                    var4.field9294[var5] = arg2.method1217(0, var18, class230.method1606(11012, var17));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg1.method1525((byte) 89);
                    String var8 = arg1.method1525((byte) -81);
                    int var9 = arg1.method1535(255);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg1.method1525((byte) -23);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg1.method1533((byte) -126);
                            var12[var13] = new byte[var14];
                            arg1.method1537(Integer.MAX_VALUE, 0, var14, var12[var13]);
                        }
                    }
                    var4.field9291[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class230.method1606(11012, var10[var16]);
                    }
                    var4.field9286[var5] = arg2.method1204(var15, 76, class230.method1606(11012, var7), var8);
                    var4.field9287[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field9290[var5] = -1;
            } catch (SecurityException var21) {
                var4.field9290[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field9290[var5] = -3;
            } catch (Exception var23) {
                var4.field9290[var5] = -4;
            } catch (Throwable var24) {
                var4.field9290[var5] = -5;
            }
        }
        class113.field1947.method1273(var4, -20180);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILjava/awt/Canvas;I)Lpi;", line = 194)
    public static final class498 method1143(int arg0, int arg1, Canvas arg2, int arg3) {
        field2399++;
        if (arg0 != 9029) {
            return null;
        }
        try {
            Class var4 = Class.forName("js");
            class498 var5 = (class498) var4.getDeclaredConstructor().newInstance();
            var5.method1107(arg2, arg3, -90, arg1);
            return var5;
        } catch (Throwable var7) {
            class135 var6 = new class135();
            var6.method1107(arg2, arg3, -128, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)Z", line = 227)
    public final boolean method1144(byte arg0) {
        field2403++;
        if (arg0 != -35) {
            method1142(11, null, null, -12);
        }
        return (this.field2402 & 0x2) != 0;
    }
}
