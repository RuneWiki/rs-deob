import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class37 {

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "J")
    public static long field536 = 0L;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "[S")
    public static short[] field541 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "Z")
    public static boolean field537 = false;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "Ljava/lang/String;")
    public static String field547 = "Close";

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "Z")
    public static boolean field539 = false;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "[[B")
    public static byte[][] field548 = new byte[50][];

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public int field540;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "Lcg;")
    public static class49 field544;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "Ljava/lang/String;")
    public String field538;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "Ljava/lang/String;")
    public static String field542;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "[[[I")
    public static int[][][] field535;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I[BI)I", line = 4)
    public static final int method323(int arg0, byte[] arg1, int arg2) {
        if (arg0 != 0) {
            field542 = (String) null;
        }
        field545++;
        return class91.method794(arg2, 0, arg1, (byte) 122);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZB)V", line = 52)
    public static final void method324(boolean arg0, byte arg1) {
        if (arg1 > -87) {
            method324(false, (byte) -103);
        }
        for (class261 var2 = (class261) class262.field4251.method2297(14204); var2 != null; var2 = (class261) class262.field4251.method2291(-86)) {
            if (var2.field4229 != null) {
                class1.field9.method1839(var2.field4229);
                var2.field4229 = null;
            }
            if (var2.field4215 != null) {
                class1.field9.method1839(var2.field4215);
                var2.field4215 = null;
            }
            var2.method2195(-1);
        }
        field543++;
        if (!arg0) {
            return;
        }
        for (class261 var3 = (class261) class184.field3119.method2297(14204); var3 != null; var3 = (class261) class184.field3119.method2291(-99)) {
            if (var3.field4229 != null) {
                class1.field9.method1839(var3.field4229);
                var3.field4229 = null;
            }
            var3.method2195(-1);
        }
        for (class261 var4 = (class261) class305.field4831.method736(2); var4 != null; var4 = (class261) class305.field4831.method727((byte) -110)) {
            if (var4.field4229 != null) {
                class1.field9.method1839(var4.field4229);
                var4.field4229 = null;
            }
            var4.method2195(-1);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V", line = 121)
    public static void method325(boolean arg0) {
        field542 = null;
        field535 = (int[][][]) null;
        if (!arg0) {
            field548 = (byte[][]) null;
            field544 = null;
            field541 = null;
            field547 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)I", line = 139)
    public static final int method326(int arg0, int arg1) {
        field546++;
        if (arg0 < 0) {
            return 0;
        }
        class66 var2 = (class66) class70.field1146.method732((long) arg0, true);
        if (var2 == null) {
            return class78.method717(arg0, (byte) -67).field5114;
        }
        int var3 = arg1;
        for (int var4 = 0; var4 < var2.field1067.length; var4++) {
            if (var2.field1067[var4] == -1) {
                var3++;
            }
        }
        return var3 + class78.method717(arg0, (byte) -51).field5114 - var2.field1067.length;
    }
}
