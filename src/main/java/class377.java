import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class377 extends class513 {

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public int field5065;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "J")
    public long field5064;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "Z")
    public boolean field5057;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "Z")
    public boolean field5061;

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "Ljava/lang/String;")
    public String field5070;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
    public int field5069;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public int field5062;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
    public int field5063;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
    public int field5067;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "Ljava/lang/String;")
    public String field5059;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "Lsb;")
    public static class264 field5068 = new class264("WIP", 2);

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "Lwo;")
    public static class690 field5072 = new class690(55, 10);

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "Lr;")
    public static class165 field5073;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)I")
    public static final int method2191(int arg0, byte arg1) {
        if (arg1 != -96) {
            method2191(-94, (byte) -12);
        }
        field5056++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public static final void method2192(int arg0) {
        field5066++;
        class314.method1836(class386.field5135, false);
        class594.field8581++;
        if (class161.field1984 && class504.field7033) {
            int var1 = class478.field6713.method1349(47);
            int var2 = class478.field6713.method1338(1);
            int var3 = var1 - class109.field1421;
            int var4 = var2 - class385.field5121;
            if (arg0 != 2) {
                method2192(80);
            }
            if (class685.field9784 > var3) {
                var3 = class685.field9784;
            }
            if (var4 < class512.field7517) {
                var4 = class512.field7517;
            }
            if (class386.field5135.field414 + var3 > class685.field9784 + class441.field6296.field414) {
                var3 = class685.field9784 + class441.field6296.field414 - class386.field5135.field414;
            }
            if (class512.field7517 + class441.field6296.field402 < class386.field5135.field402 + var4) {
                var4 = class512.field7517 + class441.field6296.field402 - class386.field5135.field402;
            }
            int var5 = var3 - (class685.field9784 - class441.field6296.field332);
            int var6 = class441.field6296.field480 + var4 - class512.field7517;
            if (class478.field6713.method2284((byte) -85)) {
                if (class386.field5135.field404 < class594.field8581) {
                    int var7 = var3 - class401.field5668;
                    int var8 = var4 - class69.field1057;
                    if (class386.field5135.field449 < var7 || -class386.field5135.field449 > var7 || class386.field5135.field449 < var8 || var8 < (-class386.field5135.field449)) {
                        class214.field2705 = true;
                    }
                }
                if (class386.field5135.field472 != null && class214.field2705) {
                    class143 var9 = new class143();
                    var9.field1789 = class386.field5135;
                    var9.field1786 = class386.field5135.field472;
                    var9.field1784 = var6;
                    var9.field1790 = var5;
                    class545.method3204(var9);
                    return;
                }
            } else {
                if (class214.field2705) {
                    class415.method2491(83);
                    if (class386.field5135.field337 != null) {
                        class143 var10 = new class143();
                        var10.field1790 = var5;
                        var10.field1784 = var6;
                        var10.field1786 = class386.field5135.field337;
                        var10.field1789 = class386.field5135;
                        var10.field1777 = class418.field5916;
                        class545.method3204(var10);
                    }
                    if (class418.field5916 != null && client.method1663(class386.field5135) != null) {
                        class39.method447((byte) -111, class386.field5135, class418.field5916);
                    }
                } else if ((class380.field5095 == 1 || class268.method1623(87)) && class271.field3704 > 2) {
                    class220.method1331(class69.field1057 + class385.field5121, class401.field5668 + class109.field1421, 20);
                } else if (class529.method3109(0)) {
                    class220.method1331(class69.field1057 + class385.field5121, class401.field5668 + class109.field1421, 106);
                }
                class386.field5135 = null;
            }
        } else if (class594.field8581 > 1) {
            class386.field5135 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V")
    public static void method2193(int arg0) {
        if (arg0 != 255) {
            field5072 = null;
        }
        field5068 = null;
        field5072 = null;
        field5073 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(FFFI)F")
    public static final float method2194(float arg0, float arg1, float arg2, int arg3) {
        field5060++;
        return arg3 == -4036 ? (arg1 - arg2) * arg0 + arg2 : -0.686927F;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class377(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field5065 = arg7;
        this.field5064 = arg5;
        this.field5057 = arg8;
        this.field5061 = arg9;
        this.field5070 = arg0;
        this.field5069 = arg2;
        this.field5062 = arg3;
        this.field5063 = arg6;
        this.field5067 = arg4;
        this.field5059 = arg1;
    }
}
