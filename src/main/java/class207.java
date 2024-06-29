import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public abstract class class207 {

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field3175 = -1;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3181 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public int field3174;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Ljava/awt/Image;")
    public Image field3176;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "[I")
    public int[] field3173;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V", line = 8)
    public static final void method1473(byte arg0) {
        for (int var1 = 0; var1 < class61.field986; var1++) {
            int var10002 = class19.field256[var1]--;
            if (class19.field256[var1] >= -10) {
                class328 var3 = class267.field4168[var1];
                if (var3 == null) {
                    var3 = class328.method2226(class104.field1615, class103.field1594[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class19.field256[var1] += var3.method2224();
                    class267.field4168[var1] = var3;
                }
                if (class19.field256[var1] < 0) {
                    int var4;
                    if (class263.field4092[var1] == 0) {
                        var4 = class117.field1784[var1] * class1.field20 >> 8;
                    } else {
                        int var5 = class263.field4092[var1] >> 16 & 0xFF;
                        int var6 = (class263.field4092[var1] & 0xFF) * 128;
                        int var7 = var5 * 128 + 64 - class98.field1566.field1905;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class263.field4092[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class98.field1566.field1868;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var6 < var10) {
                            class19.field256[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = class117.field1784[var1] * class201.field3016 * (var6 - var10) / var6 >> 8;
                    }
                    if (var4 > 0) {
                        class340 var11 = var3.method2225().method2360(class91.field1459);
                        class330 var12 = class330.method2266(var11, 100, var4);
                        var12.method2270(class342.field5330[var1] - 1);
                        class98.field1560.method1867(var12);
                    }
                    class19.field256[var1] = -100;
                }
            } else {
                class61.field986--;
                for (int var2 = var1; var2 < class61.field986; var2++) {
                    class103.field1594[var2] = class103.field1594[var2 + 1];
                    class267.field4168[var2] = class267.field4168[var2 + 1];
                    class342.field5330[var2] = class342.field5330[var2 + 1];
                    class19.field256[var2] = class19.field256[var2 + 1];
                    class263.field4092[var2] = class263.field4092[var2 + 1];
                    class117.field1784[var2] = class117.field1784[var2 + 1];
                }
                var1--;
            }
        }
        field3177++;
        if (class186.field2783 && !class40.method331(4)) {
            if (class289.field4502 != 0 && class43.field694 != -1) {
                method1474(class43.field694, (byte) -112, class192.field2872, false, class289.field4502, 0);
            }
            class186.field2783 = false;
        } else if (class289.field4502 != 0 && class43.field694 != -1 && !class40.method331(4)) {
            class310.field4813++;
            class106.field1642.method753(-88, 96);
            class106.field1642.method1174((byte) -32, class43.field694);
            class43.field694 = -1;
        }
        if (arg0 != 18) {
            method1476(-35, -83);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBLl;ZII)V", line = 150)
    public static final void method1474(int arg0, byte arg1, class133 arg2, boolean arg3, int arg4, int arg5) {
        field3182++;
        class150.field2266 = arg3;
        if (arg1 >= -82) {
            return;
        }
        class165.field2479 = 10000;
        class48.field781 = arg4;
        class1.field5 = arg0;
        class50.field803 = arg2;
        class50.field801 = arg5;
        class225.field3583 = 1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V", line = 171)
    public final void method1475(boolean arg0) {
        field3180++;
        class109.method800(this.field3173, this.field3174, this.field3179);
        if (!arg0) {
            this.field3174 = 36;
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V", line = 183)
    protected class207() {
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)I", line = 187)
    public static final int method1476(int arg0, int arg1) {
        field3172++;
        return arg0 == 30919 ? arg1 & 0x7F : 35;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V", line = 202)
    public static void method1477(byte arg0) {
        field3181 = null;
        if (arg0 != 21) {
            field3175 = -1;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
    public abstract void method869(Component arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method867(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZILjava/awt/Graphics;III)V")
    public abstract void method871(boolean arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5);
}
