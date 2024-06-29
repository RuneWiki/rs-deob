import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class110 implements Runnable {

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "Z")
    public boolean field1552 = true;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field1547 = new Object();

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public int field1561 = 0;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "[I")
    public int[] field1560 = new int[500];

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "[I")
    public int[] field1563 = new int[500];

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "[Z")
    public static boolean[] field1551 = new boolean[200];

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "Z")
    public static boolean field1564 = false;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Lcr;")
    public static class189 field1548 = new class189(50);

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public static int field1566 = 0;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "B")
    public static byte field1558;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field1565;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dm", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field1567;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dm", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field1568;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dm", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field1569;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V")
    public static final void method719(int arg0, int arg1) {
        class189 var2 = class240.field3217;
        synchronized (class240.field3217) {
            class240.field3217.method1142((byte) -74, arg1);
        }
        field1557++;
        class189 var3 = class284.field4133;
        synchronized (class284.field4133) {
            class284.field4133.method1142((byte) -94, arg1);
        }
        class189 var4 = class33.field469;
        synchronized (class33.field469) {
            if (arg0 != 0) {
                method724((class394) null, -54);
            }
            class33.field469.method1142((byte) -63, arg1);
        }
        class189 var5 = class398.field5926;
        synchronized (class398.field5926) {
            class398.field5926.method1142((byte) -89, arg1);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BZ)V")
    public static final void method720(byte arg0, boolean arg1) {
        field1559++;
        if (arg0 <= 116) {
            method720((byte) -124, false);
        }
        class181.method1103(arg1, class92.field1294, class138.field1907, -1, class329.field4790);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIILjava/awt/Canvas;Lfh;Lwd;)Lii;")
    public static final class405 method721(int arg0, int arg1, int arg2, Canvas arg3, class210 arg4, class36 arg5) {
        if (arg0 != 50) {
            return null;
        }
        field1556++;
        try {
            Class var6 = Class.forName("nf");
            Constructor var7 = var6.getConstructor(field1567 == null ? (field1567 = method728("java.awt.Canvas")) : field1567, field1568 == null ? (field1568 = method728("fh")) : field1568, Integer.TYPE, Integer.TYPE, field1569 == null ? (field1569 = method728("wd")) : field1569);
            return (class405) var7.newInstance(arg3, arg4, Integer.valueOf(arg2), new Integer(arg1), arg5);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILnj;)V")
    public static final void method722(int arg0, int arg1, class228 arg2) {
        if (class434.field6386 != null) {
            try {
                class434.field6386.method1927((byte) -24, 0L);
                class434.field6386.method1924(arg0, 24, -125, arg2.field3040);
            } catch (Exception var3) {
            }
        }
        if (arg1 < -100) {
            field1553++;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public static void method723(int arg0) {
        field1551 = null;
        field1548 = null;
        if (arg0 != 32186) {
            method720((byte) 122, true);
        }
    }

    @OriginalMember(owner = "client!dm", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field1552) {
            Object var1 = this.field1547;
            synchronized (this.field1547) {
                if (this.field1561 < 500) {
                    this.field1563[this.field1561] = class124.field1728;
                    this.field1560[this.field1561] = class323.field4747;
                    this.field1561++;
                }
            }
            class144.method918(50L, true);
        }
        field1555++;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lps;I)V")
    public static final void method724(class394 arg0, int arg1) {
        field1550++;
        class394 var2 = class352.method2315(arg0, false);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class138.field1907;
            var4 = class92.field1294;
        } else {
            var3 = var2.field5773;
            var4 = var2.field5672;
        }
        if (arg1 < 42) {
            method721(53, 122, 0, (Canvas) null, (class210) null, (class36) null);
        }
        class267.method1823(false, 2, var3, arg0, var4);
        class428.method2719((byte) 119, var3, var4, arg0);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
    public static final void method725(int arg0) {
        class431.field6336.method1136((byte) -84);
        field1562++;
        field1548.method1136((byte) -109);
        class278.field4052.method1136((byte) -88);
        int var1 = 85 / (arg0 / 48);
        class374.field5442.method1136((byte) -122);
        class219.field2901.method1136((byte) -68);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static final void method726(byte arg0) {
        field1554++;
        if (class304.field4462 != null) {
            if (class304.field4462.field6308 == 1) {
                class304.field4462 = null;
                return;
            }
            if (class304.field4462.field6308 == 2) {
                class97.method661(class304.field4460, class166.field2243, -10628, 2);
                class304.field4462 = null;
                return;
            }
        }
        if (arg0 > -103) {
            field1548 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z[I)Ljava/lang/String;")
    public static final String method727(boolean arg0, int[] arg1) {
        field1549++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class390.field5617;
        if (arg0) {
            method723(-107);
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class23 var5 = class273.method1888(arg1[var4], (byte) -64);
            if (var5.field294 != -1) {
                class67 var6 = (class67) class219.field2902.method1137((long) var5.field294, 2108653711);
                if (var6 == null) {
                    class441 var7 = class441.method2778(class362.field5227, var5.field294, 0);
                    if (var7 != null) {
                        var6 = class61.field807.method1710(var7, true);
                        class219.field2902.method1144((long) var5.field294, var6, -3480);
                    }
                }
                if (var6 != null) {
                    class363.field5240[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method728(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
