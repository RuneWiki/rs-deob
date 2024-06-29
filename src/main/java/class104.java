import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class104 implements Runnable {

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Z")
    public boolean field1948 = true;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field1944 = new Object();

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public int field1957 = 0;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "[I")
    public int[] field1958 = new int[500];

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "[I")
    public int[] field1959 = new int[500];

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1940 = 0;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Ldd;")
    public static class34 field1939 = new class34(5);

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "Z")
    public static boolean field1950 = false;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1953 = 0;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field1956 = 0;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1951 = 0;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Lai;")
    public static class10 field1955 = class44.method278("Diese Welt ist voll)3", 110);

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "Lc;")
    public static class21 field1952;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "[[[B")
    public static byte[][][] field1947;

    @OriginalMember(owner = "client!ld", name = "run", descriptor = "()V")
    public final void run() {
        field1945++;
        while (this.field1948) {
            Object var1 = this.field1944;
            synchronized (this.field1944) {
                if (this.field1957 < 500) {
                    this.field1959[this.field1957] = class79.field1389;
                    this.field1958[this.field1957] = class89.field1559;
                    this.field1957++;
                }
            }
            class172.method1130(50L, (byte) -79);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
    public static final void method676(int arg0, int arg1, int arg2) {
        field1946++;
        if (class74.field1274 == arg2) {
            class43.method272((class71.field1228 - class2.field16 << 7) + class189.field3612, class101.field1901 * 2, (class203.field3952 - class200.field3767 << 7) + class200.field3866, true);
            if (class190.field3619 > -1 && class120.field2304 % 20 < 10) {
                class97.field1787[0].method105(class190.field3619 + arg1 - 12, class33.field495 + arg0 + -28);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static final void method677(int arg0) {
        int var1 = class74.field1273.method638(8, (byte) -126);
        if (class189.field3616 > var1) {
            for (int var2 = var1; var2 < class189.field3616; var2++) {
                class42.field703[class108.field2014++] = class174.field3355[var2];
            }
        }
        field1942++;
        if (arg0 != 20) {
            method679(null, 113);
        }
        if (var1 > class189.field3616) {
            throw new RuntimeException("gppov1");
        }
        class189.field3616 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class174.field3355[var3];
            class38 var5 = class2.field10[var4];
            int var6 = class74.field1273.method638(1, (byte) -119);
            if (var6 == 0) {
                class174.field3355[class189.field3616++] = var4;
                var5.field1085 = class120.field2304;
            } else {
                int var7 = class74.field1273.method638(2, (byte) -127);
                if (var7 == 0) {
                    class174.field3355[class189.field3616++] = var4;
                    var5.field1085 = class120.field2304;
                    class160.field3076[class34.field532++] = var4;
                } else if (var7 == 1) {
                    class174.field3355[class189.field3616++] = var4;
                    var5.field1085 = class120.field2304;
                    int var8 = class74.field1273.method638(3, (byte) -127);
                    var5.method424(var8, (byte) -64, false);
                    int var9 = class74.field1273.method638(1, (byte) -128);
                    if (var9 == 1) {
                        class160.field3076[class34.field532++] = var4;
                    }
                } else if (var7 == 2) {
                    class174.field3355[class189.field3616++] = var4;
                    var5.field1085 = class120.field2304;
                    int var10 = class74.field1273.method638(3, (byte) -124);
                    var5.method424(var10, (byte) 70, true);
                    int var11 = class74.field1273.method638(3, (byte) -123);
                    var5.method424(var11, (byte) -103, true);
                    int var12 = class74.field1273.method638(1, (byte) -125);
                    if (var12 == 1) {
                        class160.field3076[class34.field532++] = var4;
                    }
                } else if (var7 == 3) {
                    class42.field703[class108.field2014++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Lkc;")
    public static final class94 method678(int arg0, int arg1) {
        class94 var2 = (class94) class83.field1443.method222(arg0 ^ 0x18B, (long) arg1);
        field1949++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 500) {
            method677(-77);
        }
        byte[] var3 = class124.field2381.method159((byte) -66, arg1, 10);
        class94 var4 = new class94();
        var4.field1707 = arg1;
        if (var3 != null) {
            var4.method621(arg0 - 23300, new class114(var3));
        }
        var4.method619((byte) 89);
        if (var4.field1741 != -1) {
            var4.method625(method678(500, var4.field1733), arg0 ^ 0x174, method678(500, var4.field1741));
        }
        if (!class44.field718 && var4.field1713) {
            var4.field1718 = class2.field11;
            var4.field1705 = null;
            var4.field1726 = 0;
            var4.field1704 = false;
            var4.field1738 = null;
        }
        class83.field1443.method225(-21284, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method679(Component arg0, int arg1) {
        arg0.removeKeyListener(class98.field1819);
        arg0.removeFocusListener(class98.field1819);
        class87.field1548 = -1;
        if (arg1 <= -30) {
            field1941++;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method680(byte arg0) {
        field1947 = null;
        field1955 = null;
        field1952 = null;
        if (arg0 != 2) {
            field1950 = true;
        }
        field1939 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILad;)V")
    public static final void method681(int arg0, class5 arg1) {
        field1954++;
        class162.method1074(119, arg0, arg1);
    }
}
