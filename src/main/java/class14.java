import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class class14 {

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "Lli;")
    public static class191 field262 = new class191();

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "[[I")
    public static int[][] field263 = new int[104][104];

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public int field255;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public int field264;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Lgf;")
    public static class7 field254;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Lgf;")
    public static class7 field265;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)Z")
    public final boolean method109(int arg0) {
        field261++;
        if (arg0 <= 100) {
            method110((byte) 62);
        }
        return (this.field264 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static void method110(byte arg0) {
        field265 = null;
        field263 = null;
        field262 = null;
        field254 = null;
        int var1 = -96 % ((-arg0 - 22) / 52);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Lpg;")
    public static final class175 method111(int arg0, int arg1) {
        field260++;
        class175 var2 = (class175) class201.field3668.method1168((long) arg0, (byte) 96);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class202.field3680.method41(-18328, 26, arg0);
        class175 var4 = new class175();
        if (var3 != null) {
            var4.method1150(new class190(var3), (byte) -41);
        }
        class201.field3668.method1163(var4, (long) arg0, arg1 ^ arg1);
        return var4;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)Z")
    public final boolean method112(int arg0) {
        if (arg0 != 0) {
            this.field259 = 107;
        }
        field253++;
        return (this.field264 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([BB)Z")
    public static final boolean method113(byte[] arg0, byte arg1) {
        field258++;
        class190 var2 = new class190(arg0);
        int var3 = var2.method1265(124);
        int var4 = 118 / ((arg1 - 26) / 33);
        if (var3 != 1) {
            return false;
        }
        boolean var5 = var2.method1265(127) == 1;
        if (var5) {
            class72.method420(var2, 33);
        }
        class256.method1691((byte) 55, var2);
        return true;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)Z")
    public final boolean method114(int arg0) {
        field257++;
        if (arg0 != 0) {
            this.method112(-43);
        }
        return (this.field264 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)Z")
    public final boolean method115(boolean arg0) {
        field256++;
        if (!arg0) {
            this.method109(37);
        }
        return (this.field264 & 0x1) != 0;
    }
}
