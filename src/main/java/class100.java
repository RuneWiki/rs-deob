import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class100 {

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Ljd;")
    public static class86 field1954 = class122.method868("<col=ff3000>", true);

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "[Ljd;")
    public static class86[] field1957 = new class86[200];

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Ljd;")
    private static class86 field1960 = class122.method868("Attack", true);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Ljd;")
    public static class86 field1953 = field1960;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "[I")
    public static int[] field1955 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
    public static final void method720(int arg0, int arg1) {
        field1956++;
        class156.field2952 = arg0;
        class152.field2875 = -1;
        class152.field2875 = -1;
        if (arg1 == 31506) {
            class188.method1293(40);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static final void method721(int arg0) {
        if (arg0 > -124) {
            method723(-73);
        }
        field1952++;
        int var1 = class143.method1017((byte) 109);
        if (var1 == 0) {
            class12.field393 = null;
            class271.method1852(true, 0);
        } else if (var1 == 1) {
            class237.method1637(18, (byte) 0);
            class271.method1852(true, 512);
            class215.method1519(122);
        } else {
            class237.method1637(18, (byte) (class119.field2338 - 4 & 0xFF));
            class271.method1852(true, 2);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static final void method722(byte arg0) {
        class108.field2070 = new class6[class22.field566.method1081(-2)][];
        if (arg0 < -11) {
            field1959++;
            class49.field1039 = new boolean[class22.field566.method1081(-2)];
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public static void method723(int arg0) {
        if (arg0 != 2) {
            field1958 = 104;
        }
        field1955 = null;
        field1957 = null;
        field1960 = null;
        field1953 = null;
        field1954 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lbj;ZLjd;)Lja;")
    public static final class58 method724(class151 arg0, boolean arg1, class86 arg2) {
        field1961++;
        int var3 = arg0.method1079(-71, arg2);
        if (!arg1) {
            return null;
        } else if (var3 == -1) {
            return new class58(0);
        } else {
            int[] var4 = arg0.method1093(var3, (byte) -119);
            class58 var5 = new class58(var4.length);
            for (int var6 = 0; var6 < var5.field1177; var6++) {
                class200 var7 = new class200(arg0.method1084((byte) -116, var3, var4[var6]));
                var5.field1170[var6] = var7.method1376((byte) 24);
                var5.field1174[var6] = var7.method1412((byte) 85);
                var5.field1179[var6] = (short) var7.method1410(-59);
                var5.field1182[var6] = (short) var7.method1410(-75);
                var5.field1181[var6] = var7.method1386(-4603);
            }
            return var5;
        }
    }
}
