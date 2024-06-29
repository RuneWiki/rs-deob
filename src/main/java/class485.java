import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class485 {

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "Lsaa;")
    public class345 field6769 = new class345();

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "Z")
    public boolean field6775 = false;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "Lsaa;")
    public static class345 field6774 = new class345();

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "[Lhp;")
    public static class346[] field6777 = new class346[37];

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILofa;BI)V", line = 7)
    public static final void method2839(int arg0, class347 arg1, byte arg2, int arg3) {
        if (arg2 >= -11) {
            return;
        }
        field6776++;
        if (arg1 == null) {
            return;
        }
        if (arg1.field4913 != null) {
            class158 var4 = new class158();
            var4.field2137 = arg1;
            var4.field2128 = arg1.field4913;
            class727.method4005(var4);
        }
        class2.field22 = arg1.field4999;
        class506.field7094 = true;
        class503.field7077 = arg0;
        class634.field8567 = arg1.field4956;
        class294.field4170 = arg1.field5003;
        class384.field5578 = arg3;
        class658.field8875 = arg1.field4955;
        class182.field2384 = arg1.field4958;
        class151.method1062((byte) -118, arg1);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V", line = 41)
    public static void method2840(int arg0) {
        field6777 = null;
        field6774 = null;
        if (arg0 != -11752) {
            field6771 = 20;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)I", line = 55)
    public static final int method2841(int arg0, int arg1, int arg2) {
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        field6773++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg1 <= 55) {
            field6777 = null;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Z)V", line = 174)
    public class485(boolean arg0) {
        this.field6775 = arg0;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILpia;)V", line = 81)
    public final void method2842(int arg0, class104 arg1) {
        field6772++;
        class214 var3 = arg1.field1478;
        boolean var4 = true;
        class136[] var5 = arg1.field1479;
        if (arg0 != -11559) {
            return;
        }
        for (int var6 = 0; var6 < var5.length; var6++) {
            if (var5[var6].field1840) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field6775) {
            for (class104 var7 = (class104) this.field6769.method2189((byte) 122); var7 != null; var7 = (class104) this.field6769.method2192(0)) {
                if (var7.field1478 == var3) {
                    var7.method3310(30305);
                    class207.method1354(var7, (byte) 75);
                }
            }
        }
        for (class104 var8 = (class104) this.field6769.method2189((byte) 81); var8 != null; var8 = (class104) this.field6769.method2192(0)) {
            if (var3.field2806 >= var8.field1478.field2806) {
                class711.method3945(var8, -5, arg1);
                return;
            }
        }
        this.field6769.method2188((byte) 31, arg1);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V", line = 151)
    public final void method2843(int arg0) {
        field6770++;
        if (arg0 != -127) {
            method2839(111, null, (byte) -17, -115);
        }
        while (true) {
            class104 var2 = (class104) this.field6769.method2193((byte) 59);
            if (var2 == null) {
                return;
            }
            var2.method3310(arg0 + 30432);
            class207.method1354(var2, (byte) -29);
        }
    }
}
