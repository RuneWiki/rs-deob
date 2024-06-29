import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class34 extends class163 {

    @OriginalMember(owner = "client!u", name = "s", descriptor = "[I")
    public static int[] field530 = new int[50];

    @OriginalMember(owner = "client!u", name = "t", descriptor = "Lke;")
    public static class256 field531 = class316.method2202("", 27626);

    @OriginalMember(owner = "client!u", name = "u", descriptor = "Lke;")
    public static class256 field532 = class316.method2202("<col=ffffff> )4 ", 27626);

    @OriginalMember(owner = "client!u", name = "C", descriptor = "[I")
    public static int[] field540 = new int[64];

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "J")
    public long field539;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Lu;")
    public class34 field529;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "Lu;")
    public class34 field543;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "[S")
    public static short[] field542;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)Lhg;", line = 11)
    public static final class300 method233(int arg0) {
        if (arg0 <= 104) {
            return (class300) null;
        }
        field541++;
        try {
            return (class300) Class.forName("aj").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(III)V", line = 36)
    public static final void method234(int arg0, int arg1, int arg2) {
        field538++;
        class308.field5322.method1599(184, (byte) 93);
        class308.field5322.method366(arg2, -110);
        if (arg1 == -3524) {
            class308.field5322.method356(arg0, arg1 - 9997);
            class86.field1561++;
        }
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V", line = 50)
    public final void method235(int arg0) {
        field537++;
        if (this.field543 == null) {
            return;
        }
        this.field543.field529 = this.field529;
        int var2 = 7 / ((3 - arg0) / 35);
        this.field529.field543 = this.field543;
        this.field543 = null;
        this.field529 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lfd;B)V", line = 77)
    public static final void method236(class219 arg0, byte arg1) {
        field535++;
        arg0.field3859 = false;
        if (arg0.field3860 != null) {
            arg0.field3860.field2253 = 0;
        }
        if (arg1 == 22) {
            for (class219 var2 = arg0.method913(); var2 != null; var2 = arg0.method934()) {
                method236(var2, (byte) 22);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V", line = 99)
    public static void method237(boolean arg0) {
        field540 = null;
        if (arg0) {
            field532 = (class256) null;
        }
        field542 = null;
        field530 = null;
        field532 = null;
        field531 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lra;B)V", line = 122)
    public static final void method238(class41 arg0, byte arg1) {
        byte[] var2 = new byte[24];
        field536++;
        int var3 = 126 % ((arg1 + 4) / 58);
        if (class161.field2859 != null) {
            try {
                class161.field2859.method905(0L, (byte) 57);
                class161.field2859.method907(var2, 79);
                int var4;
                for (var4 = 0; var4 < 24 && var2[var4] == 0; var4++) {
                }
                if (var4 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var7) {
                for (int var6 = 0; var6 < 24; var6++) {
                    var2[var6] = -1;
                }
            }
        }
        arg0.method311(24, var2, 255, 0);
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V", line = 164)
    public static final void method239(int arg0) {
        field534++;
        if (!class216.method1512(128) && class7.field110 != class255.field4377) {
            class23.method153(-17682, class255.field4377, class121.field2124.field1254[0], false, class121.field2124.field1215[0], class51.field937, class295.field5125);
            return;
        }
        if (arg0 != 0) {
            method239(87);
        }
        if (class255.field4377 != class13.field171) {
            class13.field171 = class255.field4377;
            class31.method218((byte) -56, class255.field4377);
            class129.method887(arg0 ^ 0x0);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 189)
    public static final void method240(byte arg0) {
        field533++;
        class255.field4368 = true;
        if (arg0 != -104) {
            method237(false);
        }
    }
}
