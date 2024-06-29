import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class101 {

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field1600 = 0;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "J")
    public long field1603;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lqa;")
    public class101 field1595;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lqa;")
    public class101 field1599;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Llm;")
    public static class210 field1596;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Llm;")
    public static class210 field1604;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([BZ)[B", line = 13)
    public static final byte[] method711(byte[] arg0, boolean arg1) {
        class263 var2 = new class263(arg0);
        field1597++;
        int var3 = var2.method1787(arg1);
        int var4 = var2.method1826(-206227536);
        if (var4 < 0 || class74.field965 != 0 && var4 > class74.field965) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1812(0, 66, var4, var5);
            return var5;
        } else {
            int var6 = var2.method1826(-206227536);
            if (var6 < 0 || class74.field965 != 0 && class74.field965 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class229.method1589(var7, var6, arg0, var4, 9);
            } else {
                class265.field4057.method276(var2, var7, 81);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)Lje;", line = 62)
    public static final class169 method712(int arg0, int arg1, int arg2) {
        if (arg2 != 2089666400) {
            method712(83, 115, 76);
        }
        field1598++;
        class169 var3 = (class169) class223.field3402.method1320((long) arg0 | (long) arg1 << 32, 13002);
        if (var3 == null) {
            var3 = new class169(arg1, arg0);
            class223.field3402.method1319(114, var3.field1603, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([J[IB)V", line = 82)
    public static final void method713(long[] arg0, int[] arg1, byte arg2) {
        class216.method1491(arg0.length - 1, arg1, 0, arg0, true);
        if (arg2 == -46) {
            field1601++;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 100)
    public final void method714(int arg0) {
        field1593++;
        if (this.field1599 == null) {
            return;
        }
        this.field1599.field1595 = this.field1595;
        this.field1595.field1599 = this.field1599;
        this.field1599 = null;
        this.field1595 = null;
        int var2 = -67 % ((arg0 - 30) / 62);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V", line = 118)
    public static void method715(int arg0) {
        int var1 = 60 / ((-arg0 - 15) / 55);
        field1604 = null;
        field1596 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Z", line = 129)
    public final boolean method716(byte arg0) {
        field1602++;
        if (arg0 < 13) {
            this.method714(0);
        }
        return this.field1599 != null;
    }
}
