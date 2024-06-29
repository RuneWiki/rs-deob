import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class95 extends class114 {

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "Z")
    public static boolean field1715 = false;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
    public static volatile int field1717 = 0;

    @OriginalMember(owner = "client!qe", name = "kb", descriptor = "I")
    public static int field1721 = 0;

    @OriginalMember(owner = "client!qe", name = "ib", descriptor = "I")
    public static int field1719 = 0;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
    public int field1711;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!qe", name = "lb", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!qe", name = "mb", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "Llh;")
    public class274 field1720;

    @OriginalMember(owner = "client!qe", name = "nb", descriptor = "[B")
    public byte[] field1724;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "[Lmf;")
    public static class10[] field1712;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)I")
    public final int method807(boolean arg0) {
        if (arg0) {
            method809(35);
        }
        ++field1718;
        return super.field2050 ? 0 : 100;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)[Lej;")
    public static final class49[] method808(int arg0) {
        ++field1713;
        class49[] var1 = new class49[class194.field3434];
        for (int var2 = 0; var2 < class194.field3434; ++var2) {
            var1[var2] = new class69(class47.field839, class15.field346, class96.field1735[var2], class113.field2034[var2], class7.field124[var2], class273.field4806[var2], class215.field3725[var2], class263.field4676);
        }
        if (arg0 != -9052) {
            method810(90, 109);
        }
        class78.method650(true);
        return var1;
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
    public static final void method809(int arg0) {
        class110.field1975 = null;
        if (arg0 <= 32) {
            field1719 = 3;
        }
        ++field1716;
        class194.field3452 = null;
        class157.field2813 = null;
        class54.field941 = null;
        class209.field3650 = null;
        class160.field2864 = null;
        class268.field4763 = null;
        class127.field2220 = null;
        class249.field4437 = null;
        class139.field2482 = null;
        class158.field2818 = null;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(II)I")
    public static final int method810(int arg0, int arg1) {
        if (arg1 > -107) {
            method810(-66, 113);
        }
        ++field1722;
        return (261100 & arg0) >> 11;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(B)[B")
    public final byte[] method811(byte arg0) {
        ++field1714;
        if (super.field2050) {
            throw new RuntimeException();
        } else {
            return arg0 > -6 ? null : this.field1724;
        }
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(B)V")
    public static void method812(byte arg0) {
        if (arg0 <= -96) {
            field1712 = null;
        }
    }
}
