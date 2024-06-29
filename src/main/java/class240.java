import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class240 {

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field4219 = 2;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Lda;")
    public static class275 field4213 = class255.method1672(102, "Schlie-8en");

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field4223 = 99;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Lda;")
    public static class275 field4214 = class255.method1672(105, "Mem:");

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lma;")
    public static class105 field4216;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lck;")
    public static class141 field4215;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Z")
    public static final boolean method1579(byte arg0, int arg1) {
        if (arg0 <= 1) {
            method1579((byte) 45, 31);
        }
        field4217++;
        return (arg1 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method1580(int arg0) {
        field4214 = null;
        int var1 = 26 % ((-arg0 - 73) / 39);
        field4215 = null;
        field4216 = null;
        field4213 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)V")
    public static final void method1581(int arg0, int arg1, byte arg2) {
        field4224++;
        class94 var3 = class14.method71(true, arg0);
        int var4 = var3.field1614;
        int var5 = var3.field1616;
        int var6 = var3.field1618;
        int var7 = class262.field4548[var5 - var4];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var4;
        class42.method253((byte) 125, var6, var8 & arg1 << var4 | ~var8 & class218.field3698[var6]);
        if (arg2 != -124) {
            method1580(54);
        }
    }
}
