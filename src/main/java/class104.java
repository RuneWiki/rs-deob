import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class104 {

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "[C")
    public static char[] field1562 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
    public static int field1561 = 0;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!qca", name = "h", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!qca", name = "j", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "[B")
    public byte[] field1556;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "[S")
    public short[] field1558;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "[S")
    public short[] field1559;

    @OriginalMember(owner = "client!qca", name = "i", descriptor = "[S")
    public short[] field1564;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 3)
    public static final String method794(boolean arg0, String arg1) {
        field1560++;
        String var2 = class236.method1471(class36.method285(arg1, (byte) -120), (byte) -46);
        if (arg0) {
            return null;
        } else {
            if (var2 == null) {
                var2 = "";
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(BLgba;)V", line = 21)
    public static final void method795(byte arg0, class625 arg1) {
        field1563++;
        if (class583.field7741 == arg1.field8402) {
            if (class199.field2897.field5398 == null) {
                arg1.field8401 = 0;
                arg1.field8309 = 0;
            } else {
                arg1.field8292 = 150;
                arg1.field8373 = (int) (Math.sin((double) class642.field8626 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field8401 = class416.field5693;
                arg1.field8294 = 5;
                arg1.field8309 = class155.method1089(class199.field2897.field5398, 0);
                arg1.field8321 = class199.field2897.field5619;
                arg1.field8439 = 0;
                arg1.field8372 = class199.field2897.field5577;
                arg1.field8377 = class199.field2897.field5584;
                class616 var2 = arg1.field8377 == -1 ? null : class636.field8570.method231(arg1.field8377, -11764);
                if (var2 != null) {
                    class595.method3280(arg1.field8321, false, var2);
                }
            }
        } else if (arg0 > -85) {
            method795((byte) -124, null);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V", line = 63)
    public static final void method796(int arg0) {
        field1565++;
        class666 var1 = class322.field4481;
        synchronized (class322.field4481) {
            class322.field4481.method3739(0);
        }
        int var2 = 2 % ((arg0 + 1) / 54);
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)V", line = 79)
    public static void method797(int arg0) {
        int var1 = -86 % ((arg0 - 11) / 56);
        field1562 = null;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)V", line = 89)
    public static final void method798(byte arg0) {
        if (arg0 == 105) {
            class601.field7977 = new class625[class169.field2611.method2545(0)][];
            field1557++;
            class699.field9814 = new class625[class169.field2611.method2545(0)][];
            class569.field7567 = new boolean[class169.field2611.method2545(0)];
        }
    }
}
