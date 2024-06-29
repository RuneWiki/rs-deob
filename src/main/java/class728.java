import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class728 {

    @OriginalMember(owner = "client!sha", name = "n", descriptor = "Lfc;")
    private class262 field10163 = new class262(64);

    @OriginalMember(owner = "client!sha", name = "s", descriptor = "Lfc;")
    public class262 field10168 = new class262(50);

    @OriginalMember(owner = "client!sha", name = "t", descriptor = "Lfc;")
    public class262 field10169 = new class262(5);

    @OriginalMember(owner = "client!sha", name = "e", descriptor = "Lni;")
    private class522 field10154;

    @OriginalMember(owner = "client!sha", name = "o", descriptor = "Lni;")
    public class522 field10164;

    @OriginalMember(owner = "client!sha", name = "d", descriptor = "Z")
    public boolean field10153;

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "Lrga;")
    public class242 field10151;

    @OriginalMember(owner = "client!sha", name = "p", descriptor = "Lea;")
    public static class547 field10165 = new class547(100, 6);

    @OriginalMember(owner = "client!sha", name = "r", descriptor = "[Ljava/awt/Color;")
    public static Color[] field10167 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "I")
    public static int field10150;

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "I")
    public static int field10152;

    @OriginalMember(owner = "client!sha", name = "f", descriptor = "I")
    public static int field10155;

    @OriginalMember(owner = "client!sha", name = "g", descriptor = "I")
    public static int field10156;

    @OriginalMember(owner = "client!sha", name = "h", descriptor = "I")
    public static int field10157;

    @OriginalMember(owner = "client!sha", name = "i", descriptor = "I")
    public static int field10158;

    @OriginalMember(owner = "client!sha", name = "j", descriptor = "I")
    public static int field10159;

    @OriginalMember(owner = "client!sha", name = "k", descriptor = "I")
    public static int field10160;

    @OriginalMember(owner = "client!sha", name = "l", descriptor = "I")
    public static int field10161;

    @OriginalMember(owner = "client!sha", name = "m", descriptor = "I")
    public static int field10162;

    @OriginalMember(owner = "client!sha", name = "q", descriptor = "I")
    public static int field10166;

    @OriginalMember(owner = "client!sha", name = "u", descriptor = "I")
    public int field10170;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)V")
    public final void method4080(int arg0) {
        class262 var2 = this.field10168;
        synchronized (this.field10168) {
            this.field10168.method1563(91);
        }
        if (arg0 > -22) {
            return;
        }
        field10162++;
        class262 var3 = this.field10169;
        synchronized (this.field10169) {
            this.field10169.method1563(43);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(B)V")
    public final void method4081(byte arg0) {
        if (arg0 >= -5) {
            return;
        }
        class262 var2 = this.field10163;
        synchronized (this.field10163) {
            this.field10163.method1575((byte) 113);
        }
        field10157++;
        class262 var3 = this.field10168;
        synchronized (this.field10168) {
            this.field10168.method1575((byte) -103);
        }
        class262 var4 = this.field10169;
        synchronized (this.field10169) {
            this.field10169.method1575((byte) -104);
        }
    }

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "(B)V")
    public static void method4082(byte arg0) {
        field10167 = null;
        field10165 = null;
        if (arg0 != -82) {
            field10167 = null;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IBIIII)V")
    public static final void method4083(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class11.field68.field5537.method750((byte) 127) != 0 && arg3 != 0 && class635.field8835 < 50 && arg2 != -1) {
            class643.field8975[class635.field8835++] = new class573((byte) 1, arg2, arg3, arg4, arg5, 0, arg0, null);
        }
        field10152++;
        if (arg1 != 1) {
            field10165 = null;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(II)Ljl;")
    public final class274 method4084(int arg0, int arg1) {
        field10166++;
        class262 var3 = this.field10163;
        class274 var4;
        synchronized (this.field10163) {
            if (arg0 != 5) {
                method4082((byte) 88);
            }
            var4 = (class274) this.field10163.method1571(-124, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field10154;
        byte[] var6;
        synchronized (this.field10154) {
            var6 = this.field10154.method2885(class746.method4163(arg1, (byte) 123), class435.method2469(arg1, arg0 - 22650), false);
        }
        class274 var7 = new class274();
        var7.field3602 = arg1;
        var7.field3645 = this;
        if (var6 != null) {
            var7.method1634(new class611(var6), true);
        }
        var7.method1632((byte) 70);
        class262 var8 = this.field10163;
        synchronized (this.field10163) {
            this.field10163.method1574((long) arg1, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IB)V")
    public final void method4085(int arg0, byte arg1) {
        field10155++;
        class262 var3 = this.field10163;
        synchronized (this.field10163) {
            this.field10163.method1569((byte) 62, arg0);
        }
        class262 var4 = this.field10168;
        synchronized (this.field10168) {
            this.field10168.method1569((byte) 62, arg0);
        }
        class262 var5 = this.field10169;
        synchronized (this.field10169) {
            int var6 = -30 % ((arg1 - 57) / 63);
            this.field10169.method1569((byte) 62, arg0);
        }
    }

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "(I)V")
    public static final void method4086(int arg0) {
        field10161++;
        if (arg0 != -2) {
            method4088(69);
        }
        if (class750.field10398 == null) {
            return;
        }
        if (class750.field10398.field1419 == 1) {
            class750.field10398 = null;
            return;
        }
        if (class750.field10398.field1419 == 2) {
            class96.method660(-18871, class215.field2599, class307.field4171, 2);
            class750.field10398 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZI)V")
    public final void method4087(boolean arg0, int arg1) {
        field10159++;
        this.field10170 = arg1;
        class262 var3 = this.field10168;
        synchronized (this.field10168) {
            if (!arg0) {
                this.method4085(127, (byte) -119);
            }
            this.field10168.method1563(24);
        }
        class262 var4 = this.field10169;
        synchronized (this.field10169) {
            this.field10169.method1563(85);
        }
    }

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "(I)V")
    public static final void method4088(int arg0) {
        if (arg0 != 50) {
            field10167 = null;
        }
        for (class585 var1 = (class585) class604.field8417.method2560(97); var1 != null; var1 = (class585) class604.field8417.method2557(-1)) {
            class103.method708((byte) 67, var1.field8192);
        }
        field10156++;
    }

    @OriginalMember(owner = "client!sha", name = "d", descriptor = "(I)V")
    public static final void method4089(int arg0) {
        if (arg0 != 16535) {
            field10167 = null;
        }
        field10160++;
        class58.field623.method1395(0);
        class235.method1414(-5788);
        class167.field2097 = 0;
        class569.field8012.field8520 = 0;
        class182.field2225 = 0;
        class422.field5904 = null;
        class431.field6077 = null;
        class681.field9489 = null;
        class56.method319((byte) -126);
        class233.field3026 = 0;
        class256.field3321 = null;
        class723.field10093 = null;
        class543.field7686 = 0;
        class170.field2122 = 0;
    }

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "(B)V")
    public final void method4090(byte arg0) {
        if (arg0 != 1) {
            return;
        }
        field10150++;
        class262 var2 = this.field10163;
        synchronized (this.field10163) {
            this.field10163.method1563(67);
        }
        class262 var3 = this.field10168;
        synchronized (this.field10168) {
            this.field10168.method1563(arg0 + 119);
        }
        class262 var4 = this.field10169;
        synchronized (this.field10169) {
            this.field10169.method1563(arg0 + 59);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IZ)V")
    public final void method4091(int arg0, boolean arg1) {
        field10158++;
        if (arg0 != 9179409) {
            field10167 = null;
        }
        if (this.field10153 != arg1) {
            this.field10153 = arg1;
            this.method4090((byte) 1);
        }
    }

    @OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lrga;IZLni;Lni;)V")
    public class728(class242 arg0, int arg1, boolean arg2, class522 arg3, class522 arg4) {
        this.field10154 = arg3;
        this.field10164 = arg4;
        this.field10153 = arg2;
        this.field10151 = arg0;
        if (this.field10154 != null) {
            int var6 = this.field10154.method2892((byte) -11) - 1;
            this.field10154.method2901(0, var6);
        }
    }
}
