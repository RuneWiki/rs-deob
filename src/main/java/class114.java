import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class114 {

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field1710 = 0;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field1713 = 0;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Lnk;")
    public static class464 field1719 = null;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "[I")
    public static int[] field1718;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IJ)V")
    public static final void method726(int arg0, long arg1) {
        field1716++;
        int var3 = class27.field365 + class233.field3103.field6501;
        int var4 = class307.field4058 + class233.field3103.field6507;
        if ((class87.field1215 - var3) < -500 || class87.field1215 - var3 > 500 || (class36.field544 - var4) < -500 || (class36.field544 - var4) > 500) {
            class87.field1215 = var3;
            class36.field544 = var4;
        }
        if (arg0 != -1) {
            method728((byte) -5);
        }
        if (class87.field1215 != var3) {
            int var5 = var3 - class87.field1215;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class87.field1215 += var6;
        }
        if (!class488.field6789.field6670) {
            class239.field3186 += (float) arg1 * class63.field842 / 6.0F;
            class270.field3610 += (float) arg1 * class216.field2912 / 6.0F;
        }
        if (class36.field544 != var4) {
            int var7 = var4 - class36.field544;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class36.field544 += var8;
        }
        class403.method2439((byte) 105);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static final void method727(byte arg0) {
        if (arg0 < 112) {
            method727((byte) 127);
        }
        field1714++;
        for (class437 var1 = (class437) class450.field6124.method652((byte) 37); var1 != null; var1 = (class437) class450.field6124.method653(99)) {
            class103 var2 = var1.field5928;
            if (var2.field1493) {
                var1.method2614((byte) -121);
                var2.method627((byte) 91);
            } else if (var2.field1476 <= class70.field968) {
                var2.method628(class448.field6098, -52);
                if (var2.field1493) {
                    var1.method2614((byte) -111);
                } else {
                    class214.method1212(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V")
    public static final void method728(byte arg0) {
        field1715++;
        class203.field2751.field456 = 0;
        class136.field1983 = 0;
        class395.field5473 = null;
        class370.field5068 = 0;
        class389.field5387 = null;
        class374.field5163 = null;
        class475.field6535 = 0;
        class314.field4171.field456 = 0;
        class466.field6453 = null;
        class130.method798(8699);
        class428.method2522(89);
        if (arg0 < 77) {
            return;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class413.field5644[var1] = null;
        }
        class233.field3103 = null;
        for (int var2 = 0; var2 < class221.field2941.length; var2++) {
            class121 var4 = class221.field2941[var2];
            if (var4 != null) {
                var4.field1154 = -1;
            }
        }
        class25.method145((byte) -1);
        class56.field772 = 1;
        class119.method746(30, (byte) -23);
        for (int var3 = 0; var3 < 100; var3++) {
            class102.field1468[var3] = true;
        }
        class369.method2281((byte) 120);
        class385.field5339 = 0L;
        class299.field4003 = null;
    }

    @OriginalMember(owner = "client!kk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1711++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public static void method729(int arg0) {
        field1718 = null;
        field1719 = null;
        int var1 = 123 / ((27 - arg0) / 51);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class114(String arg0, int arg1) {
        this.field1717 = arg1;
    }
}
