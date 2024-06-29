import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class425 {

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "Ljr;")
    public static class112 field6121 = new class112(4);

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "Lmu;")
    public static class303 field6125 = new class303(51, 17);

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V", line = 7)
    public static void method2602(int arg0) {
        field6121 = null;
        if (arg0 != 6725) {
            field6121 = null;
        }
        field6125 = null;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IB)I", line = 25)
    public static final int method2603(int arg0, byte arg1) {
        field6124++;
        if (arg1 < 61) {
            method2604(-27, null, 'G');
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILjava/lang/String;C)I", line = 40)
    public static final int method2604(int arg0, String arg1, char arg2) {
        field6123++;
        int var3 = 0;
        if (arg0 != 4) {
            field6125 = null;
        }
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2 == arg1.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }
}
