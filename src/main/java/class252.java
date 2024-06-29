import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class252 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field4215 = 0;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Lph;")
    public static class229 field4217 = class266.method1858("brillant2:", 0);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lph;")
    public static class229 field4211 = class266.method1858("::noclip", 0);

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "Lph;")
    public static class229 field4223 = class266.method1858("::gc", 0);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 8)
    public static void method1766(int arg0) {
        field4211 = null;
        field4223 = null;
        int var1 = -52 % ((19 - arg0) / 50);
        field4217 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V", line = 23)
    public static final void method1767(int arg0, int arg1) {
        class148.field2389 = new int[arg1];
        field4213++;
        class222.field3659 = new int[arg1];
        int var2 = 90 / ((87 - arg0) / 39);
        class15.field187 = new int[arg1];
        class331.field5632 = new int[arg1];
        class136.field2206 = new int[arg1];
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBI)V", line = 50)
    public static final void method1768(int arg0, byte arg1, int arg2) {
        class61.field870 = arg2 - class54.field786;
        field4222++;
        if (arg1 != -72) {
            return;
        }
        class205.field3380 = class214.field3537 + class266.field4487 - arg0 - 1;
        int var3 = class61.field870 - (int) ((float) class320.field5407.field4923 / class95.field1604);
        int var4 = (int) ((float) class320.field5407.field4923 / class95.field1604) + class61.field870;
        if (var3 < 0) {
            class61.field870 = (int) ((float) class320.field5407.field4923 / class95.field1604);
        }
        int var5 = class205.field3380 - ((int) ((float) class320.field5407.field4882 / class95.field1604));
        if (var4 > class50.field716) {
            class61.field870 = class50.field716 - ((int) ((float) class320.field5407.field4923 / class95.field1604));
        }
        int var6 = (int) ((float) class320.field5407.field4882 / class95.field1604) + class205.field3380;
        if (var5 < 0) {
            class205.field3380 = (int) ((float) class320.field5407.field4882 / class95.field1604);
        }
        if (class214.field3537 < var6) {
            class205.field3380 = class214.field3537 - ((int) ((float) class320.field5407.field4882 / class95.field1604));
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 107)
    public static final void method1769(byte arg0) {
        class142.method1016(-11748);
        class302.method2039((byte) 127);
        field4212++;
        class100.method768((byte) 127);
        class115.method873(-23965);
        class133.method946((byte) -53);
        class74.method568(arg0 + 82);
        class38.method293((byte) -120);
        class331.method2267((byte) -85);
        class245.method1703(arg0 + 132);
        class145.method1070(-127);
        class12.method76(true);
        class8.method52((byte) 101);
        class173.method1250(arg0 - 12450);
        class7.method45(0);
        class88.method656((byte) -86);
        class67.method533(arg0 ^ 0xFFFFFFF9);
        if (arg0 != -8) {
            field4215 = 24;
        }
        if (!class99.field1675) {
            ((class17) class310.field5207).method107(false);
        }
        class174.field2847.method1023(false);
        class139.field2249.method514((byte) -5);
        class161.field2601.method514((byte) -5);
        class171.field2811.method514((byte) -5);
        class105.field1780.method514((byte) -5);
        class131.field2130.method514((byte) -5);
        class219.field3599.method514((byte) -5);
        class281.field4649.method514((byte) -5);
        class209.field3442.method514((byte) -5);
        class312.field5246.method514((byte) -5);
        class1.field17.method514((byte) -5);
        class173.field2829.method514((byte) -5);
        client.field5418.method1415(arg0 - 18210);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V", line = 199)
    public static final void method1770(boolean arg0) {
        for (class48 var1 = (class48) class251.field4176.method711(0); var1 != null; var1 = (class48) class251.field4176.method718(27263)) {
            int var2 = var1.field700;
            if (class69.method542(var2, -1)) {
                class301[] var3 = class37.field604[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field5043;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field1325;
                    class301 var7 = class206.method1440(var6, (byte) -68);
                    if (var7 != null) {
                        class296.method2006(var7, 121);
                    }
                }
            }
        }
        if (arg0) {
            field4214++;
        }
    }
}
