import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class135 {

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Luf;")
    public static class168 field2108 = class148.method1019(-1720, "k");

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Luf;")
    public static class168 field2110 = class148.method1019(-1720, "p12_full");

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Luf;")
    public static class168 field2107 = class148.method1019(-1720, ":assist:");

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Luf;")
    public static class168 field2111 = class148.method1019(-1720, "n");

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "[Lmj;")
    public static class147[] field2114 = new class147[50];

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[Lwa;")
    public static class284[] field2113;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 4)
    public static void method942(int arg0) {
        field2111 = null;
        field2110 = null;
        field2107 = null;
        field2114 = null;
        if (arg0 < 110) {
            field2113 = (class284[]) null;
        }
        field2108 = null;
        field2113 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIILcj;II)Ljava/awt/Frame;", line = 32)
    public static final Frame method943(int arg0, int arg1, int arg2, class75 arg3, int arg4, int arg5) {
        field2106++;
        if (!arg3.method422(true)) {
            return null;
        }
        if (arg2 == arg5) {
            class99[] var6 = class70.method393(-3362, arg3);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field1554 == arg1 && var6[var8].field1561 == arg0 && (arg4 == 0 || var6[var8].field1549 == arg4) && (!var7 || arg2 < var6[var8].field1558)) {
                    var7 = true;
                    arg2 = var6[var8].field1558;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class112 var9 = arg3.method418(arg1, arg4, 16, arg0, arg2);
        while (var9.field1746 == 0) {
            class300.method2054(10, 10L);
        }
        Frame var10 = (Frame) var9.field1742;
        if (var10 == null) {
            return null;
        } else if (var9.field1746 == 2) {
            class293.method2018(arg3, (byte) -100, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)Ljj;", line = 104)
    public static final class26 method944(int arg0) {
        field2112++;
        class26 var1 = (class26) class50.field609.method1884(11109);
        if (var1 != null) {
            var1.method124((byte) 60);
            var1.method1464((byte) 84);
            return var1;
        }
        if (arg0 <= 13) {
            method943(86, 38, 26, (class75) null, -105, 44);
        }
        class26 var2;
        do {
            var2 = (class26) class28.field359.method1884(11109);
            if (var2 == null) {
                return null;
            }
            if (var2.method132(127) > class194.method1368((byte) 91)) {
                return null;
            }
            var2.method124((byte) 68);
            var2.method1464((byte) 84);
        } while ((var2.field3454 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V", line = 162)
    public static final void method945(int arg0) {
        if (arg0 != -18306) {
            field2108 = (class168) null;
        }
        field2109++;
        if (class278.field4671 == null) {
            return;
        }
        try {
            byte[] var1 = class278.field4671.method845((byte) 4);
            if (var1 != null) {
                class153 var2 = new class153(var1);
                class272.field4568 = var2.method1069(arg0 + 18433);
                class73.field977 = new class274[class272.field4568];
                for (int var3 = 0; var3 < class272.field4568; var3++) {
                    class274 var4 = class73.field977[var3] = new class274();
                    int var5 = var2.method1069(104);
                    var4.field4605 = var5 & 0x7FFF;
                    var4.field4616 = (var5 & 0x8000) != 0;
                    var4.field4614 = var2.method1075(100);
                    var4.field4607 = var2.method1081((byte) -121);
                    var4.field4604 = var3;
                    int var6 = var2.method1069(117);
                    var4.field4610 = class225.method1544((byte) -116, var6);
                }
                class136.method950(0, class73.field977.length - 1, class73.field977, arg0 + 18302);
                class278.field4671 = null;
            }
        } catch (Exception var8) {
            var8.printStackTrace();
            class278.field4671 = null;
        }
    }
}
