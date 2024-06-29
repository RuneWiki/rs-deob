import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class46 {

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field788 = 0;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "[I")
    public static int[] field787 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "Lja;")
    public static class64 field791;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 5)
    public static final void method363(byte arg0) {
        class99 var1 = class114.field1862;
        synchronized (class114.field1862) {
            if (arg0 < 7) {
                field787 = (int[]) null;
            }
            class260.field4033 = class124.field1988;
            class203.field3225 = class17.field338;
            class278.field4309 = class269.field4194;
            class152.field2452 = class136.field2170;
            class223.field3569 = class122.field1956;
            class267.field4136 = class291.field4425;
            class59.field929 = class273.field4254;
            class16.field319++;
            class136.field2170 = 0;
        }
        field790++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIJ)Z", line = 34)
    public static final boolean method364(int arg0, int arg1, int arg2, long arg3) {
        int var5 = ((int) arg3 & 0x7C5A2) >> 14;
        field786++;
        int var6 = ((int) arg3 & 0x3A5174) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (arg0 == var5 || var5 == 11 || var5 == 22) {
            class6 var8 = class28.method190(-111, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field90;
                var10 = var8.field63;
            } else {
                var9 = var8.field63;
                var10 = var8.field90;
            }
            int var11 = var8.field53;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class152.method1162(var11, var9, class19.field356.field1388[0], 2, arg2, true, class19.field356.field1386[0], var10, arg1, true, 0, 0);
        } else {
            class152.method1162(0, 0, class19.field356.field1388[0], 2, arg2, true, class19.field356.field1386[0], 0, arg1, true, var5 + 1, var6);
        }
        class128.field2043 = class223.field3569;
        class277.field4292 = 2;
        class98.field1625 = class267.field4136;
        class159.field2514 = 0;
        return true;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lnl;I)V", line = 92)
    public static final void method365(class30 arg0, int arg1) {
        class254 var2 = (class254) class94.field1553.method833(false, class36.method281(arg1 ^ 0x7FFFFFDE, arg0.field494));
        if (var2 == null) {
            class272.method1962((byte) -126, arg0.field1388[0], 0, (class305) null, (class6) null, arg0, class41.field734, arg0.field1386[0]);
        } else {
            var2.method1806(arg1 ^ Integer.MAX_VALUE);
        }
        field789++;
        if (arg1 != Integer.MAX_VALUE) {
            field788 = 20;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 109)
    public static void method366(int arg0) {
        field791 = null;
        if (arg0 != 1) {
            method366(-69);
        }
        field787 = null;
    }
}
