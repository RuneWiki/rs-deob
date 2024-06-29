import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class107 {

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    private int field1982 = 0;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "Lmn;")
    private class249 field1976;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field1975 = 0;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field1979 = 16777215;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "Z")
    public static boolean field1984 = false;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "Z")
    public static boolean field1983 = false;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "Les;")
    private class261 field1977;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Les;")
    public final class261 method913(boolean arg0) {
        field1980++;
        if (!arg0) {
            this.field1982 = -114;
        }
        this.field1982 = 0;
        return this.method914(-127);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Les;")
    public final class261 method914(int arg0) {
        field1978++;
        if (this.field1982 > 0 && this.field1976.field3842[this.field1982 - 1] != this.field1977) {
            class261 var2 = this.field1977;
            this.field1977 = var2.field3972;
            return var2;
        }
        while (this.field1982 < this.field1976.field3838) {
            class261 var4 = this.field1976.field3842[this.field1982++].field3972;
            if (this.field1976.field3842[this.field1982 - 1] != var4) {
                this.field1977 = var4.field3972;
                return var4;
            }
        }
        int var3 = 105 / ((arg0 + 79) / 47);
        return null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lgh;B)V")
    public static final void method915(class388 arg0, byte arg1) {
        field1981++;
        if (!class233.field3597) {
            return;
        }
        if (arg0.field5667 != null) {
            class388 var2 = class447.method2677(class341.field5130, 0, class506.field7383);
            if (var2 != null) {
                class322 var3 = new class322();
                var3.field4913 = var2;
                var3.field4918 = arg0;
                var3.field4911 = arg0.field5667;
                class495.method2982(var3);
            }
        }
        class513.field7449++;
        class459.method2765(class525.field7628, (byte) 87);
        class335.field5062.method1862((byte) -115, arg0.field5700);
        class335.field5062.method1853(class341.field5130, 98);
        class335.field5062.method1853(class160.field2579, 106);
        class335.field5062.method1865(arg0.field5777, 812856296);
        class335.field5062.method1853(arg0.field5688, 65);
        if (arg1 > -77) {
            field1983 = true;
        }
        class335.field5062.method1829(class506.field7383, (byte) -105);
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lmn;)V")
    public class107(class249 arg0) {
        this.field1976 = arg0;
    }
}
