import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class290 {

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field5069 = 0;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "J")
    public static long field5077 = 0L;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Lsf;")
    public static class108 field5079 = class140.method973(255, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "[S")
    public static short[] field5083 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field5080 = 0;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field5084 = 0;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lrg;")
    public static class96 field5078;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)Lgk;", line = 4)
    public static final class7 method2071(byte arg0, int arg1) {
        if (arg0 != -16) {
            field5083 = (short[]) null;
        }
        class7 var2 = (class7) class240.field4185.method642((long) arg1, (byte) -111);
        field5067++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class227.field3985.method1868(12236, 4, arg1);
        class7 var4 = new class7();
        if (var3 != null) {
            var4.method42(arg1, arg0 + 16, new class249(var3));
        }
        class240.field4185.method643((byte) -49, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILfb;ILlj;IILqd;)V", line = 31)
    public static final void method2072(int arg0, int arg1, class60 arg2, int arg3, class51 arg4, int arg5, int arg6, class45 arg7) {
        class299 var8 = new class299();
        var8.field5208 = arg0 * 128;
        var8.field5200 = arg3;
        var8.field5212 = arg5 * arg6;
        field5076++;
        if (arg2 != null) {
            var8.field5213 = arg2.field941;
            var8.field5193 = arg2.field934;
            var8.field5206 = arg2.field940 * 128;
            var8.field5192 = arg2.field943;
            var8.field5205 = arg2;
            var8.field5209 = arg2.field932;
            int var10 = arg2.field899;
            int var11 = arg2.field939;
            if (arg1 == 1 || arg1 == 3) {
                var10 = arg2.field939;
                var11 = arg2.field899;
            }
            var8.field5197 = (arg6 + var11) * 128;
            var8.field5203 = (arg0 + var10) * 128;
            if (arg2.field912 != null) {
                var8.field5210 = true;
                var8.method2110(127);
            }
            if (var8.field5213 != null) {
                var8.field5218 = (int) ((double) (var8.field5192 - var8.field5209) * Math.random()) + var8.field5209;
            }
            class273.field4794.method5(var8, (byte) -119);
        } else if (arg7 != null) {
            var8.field5194 = arg7;
            class136 var9 = arg7.field646;
            if (var9.field2396 != null) {
                var8.field5210 = true;
                var9 = var9.method938((byte) -35);
            }
            if (var9 != null) {
                var8.field5197 = (var9.field2381 + arg6) * 128;
                var8.field5203 = (var9.field2381 + arg0) * 128;
                var8.field5193 = class277.method1995(arg7, (byte) -122);
                var8.field5206 = var9.field2382 * 128;
            }
            class277.field4856.method5(var8, (byte) 84);
        } else if (arg4 != null) {
            var8.field5211 = arg4;
            var8.field5197 = (arg6 + arg4.method363((byte) 64)) * 128;
            var8.field5203 = (arg4.method363((byte) 50) + arg0) * 128;
            var8.field5193 = class22.method153(arg4, false);
            var8.field5206 = arg4.field753 * 128;
            class36.field494.method1681(1, var8, arg4.field757.method743(false));
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBI)Lsf;", line = 109)
    public static final class108 method2073(int arg0, byte arg1, int arg2) {
        int var3 = arg0 - arg2;
        field5075++;
        if (var3 < -9) {
            return class292.field5119;
        } else if (var3 < -6) {
            return class142.field2499;
        } else if (var3 < -3) {
            return class259.field4574;
        } else if (var3 < 0) {
            return class185.field3403;
        } else if (var3 <= 9) {
            int var4 = -122 / ((arg1 - 64) / 43);
            if (var3 > 6) {
                return class301.field5234;
            } else if (var3 > 3) {
                return class92.field1478;
            } else if (var3 > 0) {
                return class55.field812;
            } else {
                return class16.field206;
            }
        } else {
            return class308.field5349;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V", line = 147)
    public static final void method2074(int arg0, int arg1) {
        if (arg0 != -20076) {
            method2072(30, 48, (class60) null, 85, (class51) null, 46, 100, (class45) null);
        }
        class177.field3222.method637(arg1, 123);
        field5073++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 159)
    public static final void method2075(Component arg0, int arg1) {
        if (arg1 > -94) {
            method2076((class108) null, 70);
        }
        field5072++;
        arg0.removeMouseListener(class206.field3694);
        arg0.removeMouseMotionListener(class206.field3694);
        arg0.removeFocusListener(class206.field3694);
        class211.field3770 = 0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()Z", line = 177)
    public boolean method1029() {
        field5074++;
        return false;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)Lma;", line = 191)
    public class290 method1031(int arg0, int arg1, int arg2) {
        field5070++;
        return this;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lma;IIIZ)V", line = 202)
    public void method1035(class290 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5081++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lsf;I)V", line = 210)
    public static final void method2076(class108 arg0, int arg1) {
        class68.method456((byte) -73, false);
        class330.method2262(arg0, 37);
        if (arg1 != 128) {
            field5069 = 92;
        }
        field5082++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZI)Lvk;", line = 250)
    public static final class173 method2077(int arg0, boolean arg1, int arg2) {
        field5071++;
        for (class173 var3 = (class173) class128.field2182.method13(0); var3 != null; var3 = (class173) class128.field2182.method15((byte) 47)) {
            if (var3.field3154 && var3.method1231(arg0, arg2, (byte) -116)) {
                return var3;
            }
        }
        if (arg1) {
            field5083 = (short[]) null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 292)
    public static void method2078(int arg0) {
        field5078 = null;
        if (arg0 != 0) {
            field5080 = 55;
        }
        field5079 = null;
        field5083 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIII)V")
    public abstract void method99(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()I")
    public abstract int method95();

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIIIJILac;)V")
    public abstract void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class165 arg10);
}
