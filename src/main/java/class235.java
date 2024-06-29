import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class235 extends class5 {

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "Lhj;")
    private class69 field4282 = class24.field341;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "Lhj;")
    public static class69 field4272 = class181.method1318(")1j", (byte) -119);

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "Lnb;")
    public static class199 field4267 = new class199(64);

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "Lta;")
    public static class241 field4284 = new class241(30);

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "[I")
    public static int[] field4287 = new int[128];

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "Lhj;")
    public static class69 field4285 = class181.method1318("Lade Benutzeroberfl-=che )2 ", (byte) -120);

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    private int field4266;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public int field4276;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
    public int field4283;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "Lc;")
    private class103 field4275;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "Lc;")
    public class103 field4279;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "[Lhk;")
    public static class121[] field4286;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(BI)I")
    public final int method1658(byte arg0, int arg1) {
        field4277++;
        if (this.field4279 == null) {
            return this.field4266;
        } else if (arg0 == -28) {
            class3 var3 = (class3) this.field4279.method769(true, (long) arg1);
            return var3 == null ? this.field4266 : var3.field6;
        } else {
            return -28;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILfh;)V")
    public final void method1659(int arg0, class128 arg1) {
        while (true) {
            int var3 = arg1.method937(false);
            if (var3 == 0) {
                int var4 = 100 % ((arg0 - 38) / 62);
                field4281++;
                return;
            }
            this.method1660(-6676, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILfh;I)V")
    private final void method1660(int arg0, class128 arg1, int arg2) {
        field4270++;
        if (arg2 == 1) {
            this.field4283 = arg1.method937(false);
        } else if (arg2 == 2) {
            this.field4276 = arg1.method937(false);
        } else if (arg2 == 3) {
            this.field4282 = arg1.method963(false);
        } else if (arg2 == 4) {
            this.field4266 = arg1.method923(true);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method912(arg0 + 6563);
            this.field4279 = new class103(class127.method903(arg0 + 6700, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method923(true);
                class88 var7;
                if (arg2 == 5) {
                    var7 = new class244(arg1.method963(false));
                } else {
                    var7 = new class3(arg1.method923(true));
                }
                this.field4279.method761((long) var6, 0, var7);
            }
        }
        if (arg0 != -6676) {
            this.method1666(-97, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
    private final void method1661(byte arg0) {
        this.field4275 = new class103(this.field4279.method765((byte) 74));
        if (arg0 != -16) {
            this.method1666(-28, (byte) 111);
        }
        for (class3 var2 = (class3) this.field4279.method768((byte) 85); var2 != null; var2 = (class3) this.field4279.method760(-15725)) {
            class3 var3 = new class3((int) var2.field1685);
            this.field4275.method761((long) var2.field6, 0, var3);
        }
        field4269++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lhj;")
    public final class69 method1662(int arg0, int arg1) {
        field4268++;
        if (this.field4279 == null) {
            return this.field4282;
        } else if (arg0 <= 19) {
            return null;
        } else {
            class244 var3 = (class244) this.field4279.method769(true, (long) arg1);
            return var3 == null ? this.field4282 : var3.field4475;
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(BI)V")
    public static final void method1663(byte arg0, int arg1) {
        field4274++;
        class12.field124.method1708(-1009973721, arg1);
        class229.field4197.method1708(arg0 ^ 0x3C32F9A2, arg1);
        if (arg0 != -123) {
            method1664(false);
        }
        class80.field1536.method1708(-1009973721, arg1);
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(Z)V")
    public static void method1664(boolean arg0) {
        field4286 = null;
        if (!arg0) {
            field4285 = null;
        }
        field4272 = null;
        field4284 = null;
        field4267 = null;
        field4287 = null;
        field4285 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lhj;Z)Z")
    public final boolean method1665(class69 arg0, boolean arg1) {
        field4273++;
        if (this.field4279 == null) {
            return false;
        }
        if (this.field4275 == null) {
            this.method1667((byte) 104);
        }
        for (class90 var3 = (class90) this.field4275.method769(arg1, arg0.method439(75)); var3 != null; var3 = (class90) this.field4275.method764(true)) {
            if (var3.field1704.method444((byte) -24, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)Z")
    public final boolean method1666(int arg0, byte arg1) {
        field4271++;
        if (this.field4279 == null) {
            return false;
        }
        if (this.field4275 == null) {
            this.method1661((byte) -16);
        }
        int var3 = 17 % ((39 - arg1) / 45);
        class3 var4 = (class3) this.field4275.method769(true, (long) arg0);
        return var4 != null;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(B)V")
    private final void method1667(byte arg0) {
        field4280++;
        this.field4275 = new class103(this.field4279.method765((byte) 74));
        if (arg0 != 104) {
            this.method1666(-70, (byte) 121);
        }
        for (class244 var2 = (class244) this.field4279.method768((byte) 117); var2 != null; var2 = (class244) this.field4279.method760(-15725)) {
            class90 var3 = new class90(var2.field4475, (int) var2.field1685);
            this.field4275.method761(var2.field4475.method439(98), 0, var3);
        }
    }
}
