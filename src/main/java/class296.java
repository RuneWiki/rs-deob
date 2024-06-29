import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class296 extends InputStream {

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "[S")
    public static short[] field4780 = new short[500];

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Lok;")
    public static class41 field4783 = class137.method956("::rebuild", 45);

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field4788 = -1;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field4789 = -1;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "Z")
    public static boolean field4778 = true;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Z")
    public static boolean field4787 = true;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lbc;I)Lbc;", line = 12)
    public static final class302 method2040(class302 arg0, int arg1) {
        class302 var2 = client.method2115(arg0);
        if (arg1 != 4617) {
            method2042((byte) 2, -39, 120);
        }
        field4782++;
        if (var2 == null) {
            var2 = arg0.field5052;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fj", name = "read", descriptor = "()I", line = 29)
    public final int read() {
        class300.method2068(123, 30000L);
        field4785++;
        return -1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)[Lmg;", line = 54)
    public static final class314[] method2041(int arg0) {
        field4784++;
        class314[] var1 = new class314[class181.field2940];
        if (arg0 != -3) {
            return (class314[]) null;
        }
        for (int var2 = 0; var2 < class181.field2940; var2++) {
            if (class166.field2625) {
                var1[var2] = new class11(class204.field3299, class205.field3318, class95.field1412[var2], class314.field5288[var2], class69.field1040[var2], class173.field2812[var2], class223.field3562[var2], class312.field5263);
            } else {
                var1[var2] = new class279(class204.field3299, class205.field3318, class95.field1412[var2], class314.field5288[var2], class69.field1040[var2], class173.field2812[var2], class223.field3562[var2], class312.field5263);
            }
        }
        class286.method2005((byte) -9);
        return var1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BII)V", line = 83)
    public static final void method2042(byte arg0, int arg1, int arg2) {
        field4786++;
        int var3 = arg2;
        if (arg2 > 25) {
            var3 = 25;
        }
        arg2--;
        int var4 = class138.field2068[arg2];
        int var5 = class173.field2810[arg2];
        if (arg1 == 0) {
            class285.field4642.method844(-4, 36);
            class60.field872++;
            class285.field4642.method797(var3 + var3 + 3, -22096);
        }
        if (arg1 == 1) {
            class286.field4648++;
            class285.field4642.method844(-4, 211);
            class285.field4642.method797(var3 + var3 + 3 + 14, -22096);
        }
        if (arg1 == 2) {
            class285.field4642.method844(-4, 5);
            class222.field3550++;
            class285.field4642.method797(var3 + var3 + 3, -22096);
        }
        class285.field4642.method778(class88.field1300 + var5, (byte) -4);
        if (arg0 <= 27) {
            return;
        }
        class285.field4642.method811(128, class85.field1225[82] ? 1 : 0);
        class107.field1506 = class138.field2068[0];
        class124.field1846 = class173.field2810[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg2--;
            class285.field4642.method784(class173.field2810[arg2] - var5, (byte) 76);
            class285.field4642.method811(128, class138.field2068[arg2] - var4);
        }
        class285.field4642.method794(class55.field809 + var4, 128);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V", line = 142)
    public static void method2043(byte arg0) {
        field4783 = null;
        if (arg0 <= 80) {
            field4780 = (short[]) null;
        }
        field4780 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZIZ)V", line = 165)
    public static final void method2044(int arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field4781++;
        int var5 = -43 % ((-arg0 - 43) / 48);
        class1.method1(arg1, arg4, 0, arg3, (byte) -94, class184.field3006.length - 1, arg2);
    }
}
