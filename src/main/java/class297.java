import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class297 {

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public int field4783;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "[I")
    public int[] field4796;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "[I")
    public int[] field4792;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "[B")
    public byte[] field4780;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "[Ljava/lang/String;")
    public String[] field4797;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field4781 = 0;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4778 = "glow3:";

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field4785 = 1;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public static int field4789 = 0;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4790 = "Loaded sprites";

    @OriginalMember(owner = "client!km", name = "l", descriptor = "[Lof;")
    public static class284[] field4784 = new class284[50];

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "Lel;")
    public static class213 field4794;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1989(byte arg0, Component arg1) {
        field4775++;
        Method var2 = class4.field74;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class236.field3730);
        arg1.addFocusListener(class236.field3730);
        if (arg0 != 80) {
            field4776 = -3;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)I")
    public final int method1990(byte arg0, int arg1) {
        if (arg0 != -57) {
            this.method1991(true, 124);
        }
        field4795++;
        return this.field4780[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZI)Z")
    public final boolean method1991(boolean arg0, int arg1) {
        field4788++;
        if (arg0) {
            method1996(false);
        }
        return (this.field4780[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lha;I)Ljava/lang/String;")
    public static final String method1992(class31 arg0, int arg1) {
        field4791++;
        return arg1 < 122 ? null : class56.method470(32767, -92, arg0);
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(BI)Z")
    public final boolean method1993(byte arg0, int arg1) {
        field4773++;
        if (arg0 > -115) {
            return true;
        } else {
            return (this.field4780[arg1] & 0x10) == 0;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IZ)V")
    public static final void method1994(int arg0, boolean arg1) {
        byte[][] var2 = class82.field1243;
        if (arg0 != -2144527480) {
            method1996(true);
        }
        field4782++;
        int var3 = class268.field4248.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class174.field2691[var4] & 0xFF) * 64 - class159.field2379;
                int var7 = (class174.field2691[var4] >> 8) * 64 - class138.field2072;
                class102.method778(-9546);
                class163.method1178((byte) -68, arg1, var7, var6, class80.field1236, var5);
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1995(String arg0, int arg1) {
        field4787++;
        if (arg1 >= -93) {
            field4785 = 99;
        }
        return class33.method325(arg0, (byte) -107, true, 10);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
    public static void method1996(boolean arg0) {
        if (!arg0) {
            field4785 = -6;
        }
        field4784 = null;
        field4790 = null;
        field4794 = null;
        field4778 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILha;)Lrf;")
    public static final class300 method1997(int arg0, class31 arg1) {
        field4786++;
        if (arg0 != -8856) {
            method1995((String) null, -99);
        }
        return new class300(arg1.method308((byte) -123), arg1.method308((byte) 23), arg1.method308((byte) 23), arg1.method308((byte) 4), arg1.method304((byte) 84), arg1.method304((byte) 84), arg1.method265(-83));
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(BI)Z")
    public final boolean method1998(byte arg0, int arg1) {
        if (arg0 == -98) {
            field4777++;
            return (this.field4780[arg1] & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(I)V")
    public class297(int arg0) {
        this.field4783 = arg0;
        this.field4796 = new int[this.field4783];
        this.field4792 = new int[this.field4783];
        this.field4780 = new byte[this.field4783];
        this.field4797 = new String[this.field4783];
    }
}
