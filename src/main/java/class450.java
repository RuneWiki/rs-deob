import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class450 {

    @OriginalMember(owner = "client!co", name = "b", descriptor = "Lnj;")
    private class317 field6973;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "Lbi;")
    public static class104 field6975 = new class104(63, -1);

    @OriginalMember(owner = "client!co", name = "i", descriptor = "Lqu;")
    public static class219 field6980 = new class219(73, -1);

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "Lwh;")
    private class529 field6979;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
    public static void method2833(boolean arg0) {
        field6975 = null;
        field6980 = null;
        if (arg0) {
            method2838((byte) -98, -92, -118);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILon;)V")
    public static final void method2834(int arg0, class514 arg1) {
        arg1.field7625 = null;
        field6972++;
        int var2 = -125 / ((70 - arg0) / 51);
        int var3 = arg1.field7629.length;
        for (int var4 = 0; var4 < var3; var4++) {
            arg1.field7629[var4].field2643 = false;
        }
        class410[] var5 = class149.field2003;
        synchronized (class149.field2003) {
            if (var3 < class149.field2003.length && class59.field945[var3] < 200) {
                class149.field2003[var3].method2625(arg1, 0);
                int var10002 = class59.field945[var3]++;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)Lwh;")
    public final class529 method2835(int arg0) {
        field6976++;
        if (arg0 != -1) {
            field6975 = null;
        }
        class529 var2 = this.field6973.field4939.field7779;
        if (this.field6973.field4939 == var2) {
            this.field6979 = null;
            return null;
        } else {
            this.field6979 = var2.field7779;
            return var2;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)Lwh;")
    public final class529 method2836(byte arg0) {
        if (arg0 != -6) {
            return null;
        }
        field6974++;
        class529 var2 = this.field6979;
        if (this.field6973.field4939 == var2) {
            this.field6979 = null;
            return null;
        } else {
            this.field6979 = var2.field7779;
            return var2;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BLnj;)V")
    public final void method2837(byte arg0, class317 arg1) {
        this.field6973 = arg1;
        if (arg0 == 92) {
            field6978++;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BII)V")
    public static final void method2838(byte arg0, int arg1, int arg2) {
        field6977++;
        int var3 = class306.field4807.method2252(class340.field5312.method1583(81, class12.field131), 0);
        int var4 = -105 % ((arg0 - 51) / 53);
        for (class140 var5 = (class140) class392.field5958.method2123(-103); var5 != null; var5 = (class140) class392.field5958.method2126((byte) 61)) {
            int var9 = class540.method3191(var5, (byte) 39);
            if (var3 < var9) {
                var3 = var9;
            }
        }
        var3 += 8;
        int var6 = class501.field7514 * 16 + 21;
        int var7 = arg2 - (var3 / 2);
        if (var3 + var7 > class489.field7400) {
            var7 = class489.field7400 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if ((arg1 + var6) > class219.field3715) {
            var8 = class219.field3715 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        class296.field4670 = var7;
        class201.field3054 = var3;
        class409.field6204 = true;
        class521.field7715 = var8;
        class64.field1007 = (class377.field5794 ? 26 : 22) + class501.field7514 * 16;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
    public class450() {
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lnj;)V")
    public class450(class317 arg0) {
        this.field6973 = arg0;
    }
}
