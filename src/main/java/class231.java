import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class231 extends class151 {

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "Lmb;")
    public static class132 field4158 = class166.method1092("Lade Texturen )2 ", 113);

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "Lmb;")
    public static class132 field4155 = class166.method1092("::rect_debug", 112);

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "Lbg;")
    public static class19 field4165 = new class19();

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "Llc;")
    public static class122 field4166 = new class122(32);

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "Lmb;")
    private static class132 field4168 = class166.method1092("Please wait 5 minutes before trying again)3", 113);

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "Lmb;")
    private static class132 field4169 = class166.method1092(" ", 118);

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public static int field4171 = 0;

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
    public static int field4172 = -1;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "Lmb;")
    public static class132 field4174 = field4168;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "Lmb;")
    public static class132 field4173 = field4169;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    public int field4161;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "Loc;")
    public class155 field4162;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "Lu;")
    public class214 field4160;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "[B")
    public byte[] field4157;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public static void method1465(boolean arg0) {
        field4166 = null;
        field4158 = null;
        field4165 = null;
        field4155 = null;
        field4174 = null;
        field4169 = null;
        field4168 = null;
        if (!arg0) {
            method1467(3, (byte) 103);
        }
        field4173 = null;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)Lah;")
    public static final class9 method1466(byte arg0) {
        field4163++;
        try {
            if (arg0 != -43) {
                field4171 = -126;
            }
            return (class9) Class.forName("le").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class110();
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)[B")
    public static final byte[] method1467(int arg0, byte arg1) {
        if (arg1 < 69) {
            field4165 = null;
        }
        class32 var2 = (class32) class147.field2719.method777(-1, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class133.method914((byte) 53, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class32(var3);
            class147.field2719.method774((long) arg0, var2, 0);
        }
        field4159++;
        return var2.field492;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Lce;")
    public static final class28 method1468(int arg0, int arg1) {
        field4164++;
        class28 var2 = (class28) class167.field3049.method777(arg1 ^ 0x5A83, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class149.field2737.method1079(5, 120, arg0);
        class28 var4 = new class28();
        if (var3 != null) {
            var4.method205(-32, new class112(var3));
        }
        if (arg1 != -23172) {
            method1469(-72, -92, 84);
        }
        class167.field3049.method774((long) arg0, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V")
    public static final void method1469(int arg0, int arg1, int arg2) {
        field4156++;
        if (class137.method933(256, arg0)) {
            class235.method1492(arg1, -42, class97.field1866[arg0]);
            if (arg2 != 2345) {
                method1467(-111, (byte) -77);
            }
        }
    }
}
