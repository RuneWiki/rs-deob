import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public abstract class class278 implements class226 {

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "Lom;")
    public class344 field4155;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "Lom;")
    private class344 field4166;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "Lfga;")
    public class234 field4164;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "[Lsk;")
    public static class578[] field4157 = new class578[5];

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    private int field4159;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "J")
    private long field4165;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "Lla;")
    private class421 field4160;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
    public void method1400(byte arg0) {
        if (arg0 == -10) {
            field4154++;
            class11 var2 = class492.method2951(this.field4164.field3502, this.field4166, (byte) -126);
            this.field4160 = class623.field9017.method160(var2, class279.method1840(this.field4155, this.field4164.field3502), true);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIZI)V")
    public abstract void method569(int arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V")
    public static final void method1836(boolean arg0) {
        if (!arg0) {
            return;
        }
        field4158++;
        if (class413.field5977 != null) {
            return;
        }
        int var1 = class594.field8553;
        int var2 = class139.field2459;
        int var3 = class513.field7237 - (class506.field7173 + var1);
        int var4 = class193.field3033 - class310.field4626 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class112.field2017 != null) {
                var5 = class112.field2017;
            } else if (class416.field6017 == null) {
                var5 = class369.field5463;
            } else {
                var5 = class416.field6017;
            }
            int var6 = 0;
            int var7 = 0;
            if (class112.field2017 == var5) {
                Insets var8 = class112.field2017.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class193.field3033);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class513.field7237, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class513.field7237 + var6 - var3, var7, var3, class193.field3033);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class193.field3033 + var7 - var4, class513.field7237, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIZ)V")
    public abstract void method568(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public static void method1837(int arg0) {
        field4157 = null;
        int var1 = 27 % ((20 - arg0) / 47);
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)Z")
    public boolean method1398(byte arg0) {
        field4161++;
        if (arg0 < 112) {
            this.field4155 = null;
        }
        boolean var2 = true;
        if (!this.field4155.method2230((byte) 92, this.field4164.field3502)) {
            var2 = false;
        }
        if (!this.field4166.method2230((byte) 56, this.field4164.field3502)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V")
    public static final void method1838(int arg0, int arg1) {
        field4162++;
        if (arg1 != 9489) {
            field4157 = null;
        }
        class19 var2 = class373.method2355(arg1 ^ 0x255D, arg0, 1);
        var2.method438(806);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZZ)V")
    public final void method1432(boolean arg0, boolean arg1) {
        field4163++;
        int var3 = this.field4164.field3490.method2056(120, this.field4164.field3492, class575.field8355) + this.field4164.field3497;
        int var4 = this.field4164.field3499.method3156(class693.field9762, 4416, this.field4164.field3491) + this.field4164.field3496;
        this.method569(2, var3, arg0, var4);
        this.method568(-72, var3, var4, arg0);
        String var5 = class119.field2122.method1872(101);
        if (class525.method3074((byte) -101) - this.field4165 > 10000L) {
            var5 = var5 + " (" + class119.field2122.method1879(109).method2024((byte) -86) + ")";
        }
        this.field4160.method2559(var4 + this.field4164.field3500 + this.field4164.field3491 / 2 + 4, -1, this.field4164.field3492 / 2 + var3, var5, 23610, this.field4164.field3498);
        if (arg1) {
            this.field4155 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(B)I")
    public final int method1839(byte arg0) {
        field4156++;
        int var2 = -58 / ((arg0 + 58) / 43);
        int var3 = class119.field2122.method1882(25);
        int var4 = var3 * 100;
        if (this.field4159 == var3 && var3 != 0) {
            int var5 = class119.field2122.method1877(128);
            if (var5 > var3) {
                long var6 = this.field4165 - class119.field2122.method1883((byte) 64);
                if (var6 > 0L) {
                    long var8 = var6 * 10000L / (long) var3 * (long) (var5 - var3);
                    long var10 = (class525.method3074((byte) -101) - this.field4165) * 10000L;
                    if (var8 <= var10) {
                        var4 = var5 * 100;
                    } else {
                        var4 = (int) (var10 * 100L * (long) (var5 - var3) / var8 + ((long) (var3 * 100)));
                    }
                }
            }
        } else {
            this.field4159 = var3;
            this.field4165 = class525.method3074((byte) -101);
        }
        return var4;
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lom;Lom;Lfga;)V")
    public class278(class344 arg0, class344 arg1, class234 arg2) {
        this.field4155 = arg0;
        this.field4166 = arg1;
        this.field4164 = arg2;
    }

    static {
        for (int var0 = 0; var0 < field4157.length; var0++) {
            field4157[var0] = new class578();
        }
    }
}
