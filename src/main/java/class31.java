import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class31 {

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Z")
    public boolean field412 = true;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public int field419;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Ljava/lang/String;")
    public static String field411 = "Ok";

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field416 = -2;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "Z")
    public static boolean field424 = false;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V", line = 10)
    public static final void method170(int arg0, int arg1, int arg2) {
        field417++;
        int var3 = 92 % ((-arg2 - 34) / 38);
        class335.field5232[arg0] = arg1;
        class253 var4 = (class253) class182.field3004.method451((long) arg0, (byte) 100);
        if (var4 == null) {
            class253 var5 = new class253(4611686018427387905L);
            class182.field3004.method461(-29, (long) arg0, var5);
        } else if (var4.field4039 != 4611686018427387905L) {
            var4.field4039 = class283.method2038((byte) 125) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)V", line = 39)
    public static final void method171(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field418++;
        int var5 = 0;
        int var6 = class33.method178(class191.field3131, class336.field5249, arg2 + arg0, 86);
        int var7 = arg0;
        int var8 = class33.method178(class191.field3131, class336.field5249, arg2 - arg0, 20);
        int var9 = -arg0;
        class80.method545(arg4, arg3 ^ 0x26, var6, var8, class281.field4523[arg1]);
        int var10 = -1;
        if (arg3 != -29) {
            method173((byte) 84);
        }
        while (var7 > var5) {
            var10 += 2;
            var9 += var10;
            if (var9 > 0) {
                var7--;
                int var11 = arg1 - var7;
                int var12 = arg1 + var7;
                var9 -= var7 << 1;
                if (var12 >= class98.field1410 && class279.field4497 >= var11) {
                    int var13 = class33.method178(class191.field3131, class336.field5249, arg2 + var5, 97);
                    int var14 = class33.method178(class191.field3131, class336.field5249, arg2 - var5, 118);
                    if (var12 <= class279.field4497) {
                        class80.method545(arg4, -86, var13, var14, class281.field4523[var12]);
                    }
                    if (var11 >= class98.field1410) {
                        class80.method545(arg4, arg3 ^ 0x47, var13, var14, class281.field4523[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (var16 >= class98.field1410 && var15 <= class279.field4497) {
                int var17 = class33.method178(class191.field3131, class336.field5249, arg2 + var7, arg3 + 88);
                int var18 = class33.method178(class191.field3131, class336.field5249, arg2 - var7, 53);
                if (var16 <= class279.field4497) {
                    class80.method545(arg4, -112, var17, var18, class281.field4523[var16]);
                }
                if (class98.field1410 <= var15) {
                    class80.method545(arg4, -72, var17, var18, class281.field4523[var15]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIII)V", line = 117)
    public static final void method172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field422++;
        if (class336.field5249 <= arg2 && class191.field3131 >= arg0 && arg4 >= class98.field1410 && class279.field4497 >= arg1) {
            class180.method1347(arg5 + 26002, arg4, arg1, arg2, arg3, arg0);
        } else {
            class130.method948(255, arg4, arg0, arg1, arg3, arg2);
        }
        if (arg5 != -25939) {
            method172(-122, 17, -65, 40, 64, 39);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 151)
    public static void method173(byte arg0) {
        field411 = null;
        if (arg0 != -115) {
            method170(82, 112, -23);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V", line = 165)
    public static final void method174(boolean arg0) {
        field420++;
        if (arg0) {
            method173((byte) -89);
        }
        int var1 = class36.field481;
        int var2 = class46.field641;
        int var3 = class55.field780 - class133.field2095 - var1;
        int var4 = class88.field1221 - class20.field276 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class204.field3362 != null) {
                var5 = class204.field3362;
            } else if (class278.field4482 == null) {
                var5 = class14.field159.field1951;
            } else {
                var5 = class278.field4482;
            }
            int var6 = 0;
            int var7 = 0;
            if (class278.field4482 == var5) {
                Insets var8 = class278.field4482.getInsets();
                var7 = var8.left;
                var6 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var7, var6, var1, class88.field1221);
            }
            if (var2 > 0) {
                var9.fillRect(var7, var6, class55.field780, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var7 + class55.field780 - var3, var6, var3, class88.field1221);
            }
            if (var4 > 0) {
                var9.fillRect(var7, var6 + class88.field1221 - var4, class55.field780, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIIIZ)V", line = 235)
    public class31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field410 = arg3;
        this.field419 = arg4;
        this.field415 = arg5;
        this.field414 = arg2;
        this.field409 = arg1;
        this.field412 = arg6;
        this.field413 = arg0;
    }
}
