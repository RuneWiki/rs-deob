import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class125 {

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public int field1851 = -1;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field1847 = 0;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Z")
    public static boolean field1846 = false;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field1845 = -1;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Ltg;")
    public class147 field1852;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "[I")
    public int[] field1843;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "[Ljava/lang/String;")
    public String[] field1849;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static final void method875(byte arg0) {
        field1848++;
        class78.field1238 = new class284();
        if (arg0 > -112) {
            field1847 = -63;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static final void method876(int arg0) {
        field1844++;
        class151.field2206.method944(65535);
        int var1 = 42 / ((arg0 - 42) / 42);
        class181.field2629.method944(65535);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)V")
    public static final void method877(byte arg0, int arg1) {
        class61.field989.method938(arg1, (byte) -123);
        if (arg0 < 52) {
            field1845 = 30;
        }
        field1853++;
        class195.field2945.method938(arg1, (byte) -123);
        class92.field1384.method938(arg1, (byte) -123);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILpk;I)Z")
    public static final boolean method878(int arg0, class237 arg1, int arg2) {
        field1850++;
        byte[] var3 = arg1.method1620(false, arg0);
        if (arg2 != -1) {
            return true;
        } else if (var3 == null) {
            return false;
        } else {
            class58.method477(2, var3);
            return true;
        }
    }
}
