import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class188 {

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "Z")
    public static boolean field2957 = false;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public int field2956;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "J")
    public long field2958;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Leh;")
    public class179 field2945;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Leh;")
    public class179 field2950;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "Leh;")
    public class179 field2952;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Lsm;", line = 7)
    public static final class168 method1359(int arg0, int arg1) {
        class168 var2 = (class168) class164.field2669.method1183((long) arg0, (byte) -118);
        field2946++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class342.field5299.method967(class331.method2325((byte) 64, arg0), class314.method2219(arg0, 4), 65280);
        if (arg1 != 0) {
            method1360(-106, -101, -72, -123, 84);
        }
        class168 var4 = new class168();
        if (var3 != null) {
            var4.method1252(new class1(var3), arg1 ^ 0x0);
        }
        class164.field2669.method1182((byte) 63, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII)V", line = 35)
    public static final void method1360(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2955++;
        if (~class73.field1106 == arg4 || arg0 == 0 || class113.field1828 >= 50 || arg3 == -1) {
            return;
        }
        class90.field1445[class113.field1828] = arg3;
        client.field4120[class113.field1828] = arg0;
        class200.field3068[class113.field1828] = arg1;
        class226.field3502[class113.field1828] = null;
        class308.field4878[class113.field1828] = 0;
        class180.field2869[class113.field1828] = arg2;
        class113.field1828++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZI)Lai;", line = 58)
    public static final class135 method1361(boolean arg0, int arg1) {
        field2947++;
        class135 var2 = (class135) class151.field2485.method2288((long) arg1, (byte) 116);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class313.field4924.method967(class184.method1341(arg0, arg1), class128.method998((byte) 101, arg1), 65280);
        class135 var4 = new class135();
        var4.field2156 = arg1;
        if (var3 != null) {
            var4.method1045(10, new class1(var3));
        }
        var4.method1046(0);
        if (var4.field2185 != -1) {
            var4.method1035(method1361(true, var4.field2185), method1361(true, var4.field2178), 13558);
        }
        if (var4.field2174 != -1) {
            var4.method1036(method1361(arg0, var4.field2174), method1361(arg0, var4.field2148), 32767);
        }
        if (!class161.field2609 && var4.field2191) {
            var4.field2188 = class55.field839;
            var4.field2135 = false;
            var4.field2200 = class334.field5199;
            var4.field2186 = class44.field699;
            var4.field2190 = 0;
        }
        class151.field2485.method2281(0, (long) arg1, var4);
        return var4;
    }
}
