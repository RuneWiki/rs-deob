import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class88 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field1670 = 99;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lhj;")
    public static class69 field1679 = class181.method1318("<col=c0ff00>", (byte) -118);

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Lhj;")
    public static class69 field1683 = class181.method1318("sl_back", (byte) -110);

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field1681 = 0;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Z")
    public static boolean field1684 = false;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lhj;")
    public static class69 field1675 = class181.method1318("Lade Wordpack )2 ", (byte) -116);

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "J")
    public long field1685;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Lbb;")
    public class88 field1676;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lbb;")
    public class88 field1677;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "[I")
    public static int[] field1682;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    public static void method629(boolean arg0) {
        field1675 = null;
        field1679 = null;
        field1683 = null;
        if (arg0) {
            method633((byte) 29, -92);
        }
        field1682 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static final void method630(byte arg0) {
        field1678++;
        class59.field1075.method158(false);
        int var1 = 0;
        if (arg0 > -5) {
            method633((byte) -52, 119);
        }
        while (var1 < 32) {
            class163.field3008[var1] = 0L;
            var1++;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class136.field2549[var2] = 0L;
        }
        class85.field1659 = 0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Z")
    public final boolean method631(int arg0) {
        if (arg0 == 32767) {
            field1686++;
            return this.field1676 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public final void method632(int arg0) {
        field1674++;
        if (this.field1676 == null) {
            return;
        }
        this.field1676.field1677 = this.field1677;
        this.field1677.field1676 = this.field1676;
        this.field1677 = null;
        if (arg0 != -8296) {
            field1679 = null;
        }
        this.field1676 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)Lnk;")
    public static final class124 method633(byte arg0, int arg1) {
        if (arg0 < 113) {
            field1683 = null;
        }
        field1671++;
        class124 var2 = (class124) class116.field2219.method1448((long) arg1, (byte) -40);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class90.field1708.method590(arg1, 0, 0);
        } else {
            var3 = class24.field343.method590(arg1 & 0x7FFF, 0, 0);
        }
        class124 var4 = new class124();
        if (var3 != null) {
            var4.method893((byte) 65, new class128(var3));
        }
        if (arg1 >= 32768) {
            var4.method888((byte) 46);
        }
        class116.field2219.method1453(0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(BI)I")
    public static final int method634(byte arg0, int arg1) {
        if (arg0 >= -55) {
            return -44;
        } else {
            field1672++;
            return arg1 & 0x7F;
        }
    }
}
