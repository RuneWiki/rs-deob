import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class264 {

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Z")
    public boolean field3852;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Ld;")
    public static class149 field3851;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Lcaa;")
    public class302 field3844;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Lcaa;")
    public class302 field3850;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Z")
    public boolean field3843;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public final void method1778(int arg0) {
        if (this.field3850 != null) {
            this.field3850.method1496(false);
        }
        if (arg0 != 30025) {
            method1780(71);
        }
        field3846++;
        this.field3843 = false;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1779(int arg0, int arg1, boolean arg2) {
        field3849++;
        if (arg2) {
            method1780(71);
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public static final void method1780(int arg0) {
        field3845++;
        try {
            if (class731.field10231 == 1) {
                int var1 = class284.field4029.method1695(85);
                if (var1 > 0 && class284.field4029.method1683(arg0 ^ 0xFFFFFFFB)) {
                    int var2 = var1 - class241.field3390;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class284.field4029.method1694(var2, (byte) -97);
                    return;
                }
                class284.field4029.method1697(false);
                class284.field4029.method1676(19755);
                class250.field3518 = null;
                if (class577.field8167 == null) {
                    class731.field10231 = 0;
                } else {
                    class731.field10231 = 2;
                }
                class148.field2267 = null;
            }
            if (class731.field10231 == arg0) {
                int var3 = class284.field4029.method1695(-39);
                if (class107.field1766 > var3 && class284.field4029.method1683(-8)) {
                    int var4 = class736.field10362 + var3;
                    if (class107.field1766 < var4) {
                        var4 = class107.field1766;
                    }
                    class284.field4029.method1694(var4, (byte) -116);
                } else {
                    class731.field10231 = 0;
                    class736.field10362 = 0;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class284.field4029.method1697(false);
            class250.field3518 = null;
            class731.field10231 = 0;
            class432.field6038 = null;
            class577.field8167 = null;
            class148.field2267 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
    public static void method1781(int arg0) {
        if (arg0 <= 1) {
            field3851 = null;
        }
        field3851 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)Z")
    public static final boolean method1782(int arg0, int arg1, int arg2) {
        field3847++;
        if (arg0 < 23) {
            return false;
        } else {
            return (arg2 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lkba;Lkba;I)V")
    public static final void method1783(class105 arg0, class105 arg1, int arg2) {
        field3842++;
        if (arg0.field1746 != null) {
            arg0.method909(-117);
        }
        if (arg2 == 3) {
            arg0.field1750 = arg1;
            arg0.field1746 = arg1.field1746;
            arg0.field1746.field1750 = arg0;
            arg0.field1750.field1746 = arg0;
        }
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)Z")
    public final boolean method1784(int arg0) {
        int var2 = 20 / ((arg0 + 28) / 39);
        field3848++;
        return this.field3843 && !this.field3852;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Z)V")
    public class264(boolean arg0) {
        this.field3852 = arg0;
    }
}
