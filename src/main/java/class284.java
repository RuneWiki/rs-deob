import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class284 extends class175 {

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public static int field4534 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field4546 = 0;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "Ljava/awt/Frame;")
    public static Frame field4537;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "Ljava/lang/String;")
    public String field4533;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "[C")
    public char[] field4529;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "[C")
    public char[] field4532;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "[I")
    public int[] field4538;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "[I")
    public int[] field4539;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIILjj;ZI)V")
    public static final void method1903(int arg0, int arg1, int arg2, class134 arg3, boolean arg4, int arg5) {
        class130.field2178 = 1;
        class86.field1179 = arg4;
        class110.field1899 = arg3;
        if (arg2 <= 9) {
            return;
        }
        class52.field745 = arg0;
        class20.field236 = arg1;
        field4545++;
        class111.field1919 = 10000;
        class230.field3657 = arg5;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljj;Ljj;I)V")
    public static final void method1904(class134 arg0, class134 arg1, int arg2) {
        class46.field555 = arg0;
        if (arg2 != -14408) {
            method1906((byte) -15);
        }
        class34.field425 = arg1;
        field4535++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(CB)I")
    public final int method1905(char arg0, byte arg1) {
        int var3 = 99 / ((arg1 - 21) / 32);
        field4542++;
        if (this.field4539 == null) {
            return -1;
        }
        for (int var4 = 0; var4 < this.field4539.length; var4++) {
            if (this.field4529[var4] == arg0) {
                return this.field4539[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V")
    public static void method1906(byte arg0) {
        if (arg0 >= -15) {
            field4537 = null;
        }
        field4537 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lhi;IB)V")
    private final void method1907(class264 arg0, int arg1, byte arg2) {
        field4543++;
        if (arg1 == 1) {
            this.field4533 = arg0.method1750((byte) 86);
        } else if (arg1 == 2) {
            int var7 = arg0.method1779(-126);
            this.field4529 = new char[var7];
            this.field4539 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4539[var8] = arg0.method1777(arg2 - 193);
                byte var9 = arg0.method1767(arg2 + 16711613);
                this.field4529[var8] = var9 == 0 ? 0 : class234.method1543(var9, true);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method1779(-91);
            this.field4532 = new char[var4];
            this.field4538 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4538[var5] = arg0.method1777(-45);
                byte var6 = arg0.method1767(arg2 + 16711613);
                this.field4532[var5] = var6 == 0 ? 0 : class234.method1543(var6, true);
            }
        }
        if (arg2 != 67) {
            method1911(-3, -128);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(CI)I")
    public final int method1908(char arg0, int arg1) {
        field4536++;
        if (this.field4538 == null) {
            return -1;
        }
        if (arg1 != 3) {
            this.method1910((class264) null, (byte) -93);
        }
        for (int var3 = 0; var3 < this.field4538.length; var3++) {
            if (this.field4532[var3] == arg0) {
                return this.field4538[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "(I)V")
    public final void method1909(int arg0) {
        if (this.field4538 != null) {
            for (int var2 = 0; var2 < this.field4538.length; var2++) {
                this.field4538[var2] = class45.method348(this.field4538[var2], 32768);
            }
        }
        if (arg0 != -22382) {
            this.field4532 = null;
        }
        if (this.field4539 != null) {
            for (int var3 = 0; var3 < this.field4539.length; var3++) {
                this.field4539[var3] = class45.method348(this.field4539[var3], 32768);
            }
        }
        field4540++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lhi;B)V")
    public final void method1910(class264 arg0, byte arg1) {
        int var3 = 5 / ((-arg1 - 51) / 44);
        while (true) {
            int var4 = arg0.method1779(-125);
            if (var4 == 0) {
                field4531++;
                return;
            }
            this.method1907(arg0, var4, (byte) 67);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Lu;")
    public static final class230 method1911(int arg0, int arg1) {
        field4541++;
        if (arg1 <= 115) {
            field4537 = null;
        }
        class230 var2 = (class230) class76.field1039.method1839((byte) 80, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class216.field3472.method940((byte) 114, arg0, 34);
        class230 var4 = new class230();
        if (var3 != null) {
            var4.method1524(new class264(var3), arg0, (byte) -21);
        }
        class76.field1039.method1830((long) arg0, -59, var4);
        return var4;
    }
}
