import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class66 {

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    private int field860 = 0;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    private int field873 = -1;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "Lom;")
    private class156 field863 = new class156();

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "Z")
    public boolean field875 = false;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    private int field858;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "[[I")
    private int[][] field867;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    private int field861;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "[Lee;")
    private class297[] field864;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "[S")
    public static short[] field855 = new short[256];

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "[F")
    public static float[] field856 = new float[4];

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "[I")
    public static int[] field865;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIBI)I", line = 5)
    public static final int method433(int arg0, int arg1, byte arg2, int arg3) {
        field866++;
        if (arg2 != 22) {
            field865 = (int[]) null;
        }
        int var4 = arg1 / arg3;
        int var5 = arg0 / arg3;
        int var6 = arg3 - 1 & arg0;
        int var7 = arg3 - 1 & arg1;
        int var8 = class94.method664(var4, arg2 + 19, var5);
        int var9 = class94.method664(var4 + 1, arg2 + 19, var5);
        int var10 = class94.method664(var4, arg2 ^ 0x3F, var5 + 1);
        int var11 = class94.method664(var4 + 1, 41, var5 + 1);
        int var12 = class300.method2089(var8, 1335253409, var9, var7, arg3);
        int var13 = class300.method2089(var10, 1335253409, var11, var7, arg3);
        return class300.method2089(var12, arg2 ^ 0x4F9659B7, var13, var6, arg3);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V", line = 37)
    public static final void method434(boolean arg0, int arg1) {
        class97.field1452.method2174(-12634, arg1);
        field871++;
        if (arg0) {
            method434(true, -107);
        }
        class274.field4203.method2174(-12634, arg1);
        class29.field391.method2174(-12634, arg1);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 57)
    public static final void method435(byte arg0) {
        field872++;
        int var1 = 115 / ((-arg0 - 40) / 57);
        class132.field2031.method2182(false);
        class84.field1244.method2182(false);
        class314.field4749.method2182(false);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 72)
    public static final void method436(byte arg0, Component arg1) {
        if (arg0 != -41) {
            method438(-124, -27L);
        }
        field868++;
        arg1.removeKeyListener(class60.field796);
        arg1.removeFocusListener(class60.field796);
        class123.field1927 = -1;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V", line = 90)
    public static void method437(byte arg0) {
        if (arg0 <= -120) {
            field856 = null;
            field865 = null;
            field855 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IJ)V", line = 102)
    public static final void method438(int arg0, long arg1) {
        field857++;
        if (arg1 == 0L) {
            return;
        }
        if (class247.field3687 >= 100) {
            class92.method656(0, class26.field370, "", -1);
            return;
        }
        String var3 = class194.method1337(arg1, 1);
        for (int var4 = 0; var4 < class247.field3687; var4++) {
            if (class212.field3220[var4] == arg1) {
                class92.method656(0, var3 + class263.field4010, "", -1);
                return;
            }
        }
        int var5 = 0;
        if (arg0 <= 106) {
            method433(-57, 27, (byte) 33, 50);
        }
        while (var5 < class193.field2892) {
            if (class7.field50[var5] == arg1) {
                class92.method656(0, class318.field4806 + var3 + class64.field841, "", -1);
                return;
            }
            var5++;
        }
        if (var3.equals(class114.field1750.field2934)) {
            class92.method656(0, class38.field465, "", -1);
            return;
        }
        class212.field3220[class247.field3687] = arg1;
        class205.field3097[class247.field3687++] = class270.method1905(arg1, -82);
        class163.field2465++;
        class315.field4761 = class225.field3423;
        class234.field3507.method28(169, false);
        class234.field3507.method1816(arg1, 21054);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)[[I", line = 172)
    public final int[][] method439(int arg0) {
        field874++;
        if (this.field861 != this.field858) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field858; var2++) {
            this.field864[var2] = class298.field4554;
        }
        if (arg0 > -107) {
            this.field875 = false;
        }
        return this.field867;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)[I", line = 195)
    public final int[] method440(byte arg0, int arg1) {
        if (arg0 != -60) {
            method433(-69, 115, (byte) 91, -110);
        }
        field869++;
        if (this.field861 == this.field858) {
            this.field875 = this.field864[arg1] == null;
            this.field864[arg1] = class298.field4554;
            return this.field867[arg1];
        } else if (this.field858 == 1) {
            this.field875 = this.field873 != arg1;
            this.field873 = arg1;
            return this.field867[0];
        } else {
            class297 var3 = this.field864[arg1];
            if (var3 == null) {
                this.field875 = true;
                if (this.field858 <= this.field860) {
                    class297 var4 = (class297) this.field863.method1110(true);
                    var3 = new class297(arg1, var4.field4541);
                    this.field864[var4.field4549] = null;
                    var4.method714(111);
                } else {
                    var3 = new class297(arg1, this.field860);
                    this.field860++;
                }
                this.field864[arg1] = var3;
            } else {
                this.field875 = false;
            }
            this.field863.method1111(var3, arg0 ^ 0x3C);
            return this.field867[var3.field4541];
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(III)V", line = 299)
    public class66(int arg0, int arg1, int arg2) {
        this.field858 = arg0;
        this.field867 = new int[this.field858][arg2];
        this.field861 = arg1;
        this.field864 = new class297[this.field861];
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V", line = 270)
    public final void method441(int arg0) {
        for (int var2 = arg0; var2 < this.field858; var2++) {
            this.field867[var2] = null;
        }
        this.field864 = null;
        this.field867 = (int[][]) null;
        field862++;
        this.field863.method1113((byte) 60);
        this.field863 = null;
    }
}
