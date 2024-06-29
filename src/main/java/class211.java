import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class211 {

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Lsg;")
    public static class30 field3808 = class167.method1221((byte) 33, "null");

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lsg;")
    public static class30 field3809 = class167.method1221((byte) 33, "::serverjs5drop");

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field3804 = 0;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field3814 = 500;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lsg;")
    public static class30 field3805 = class167.method1221((byte) 33, "Mem:");

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public int field3811;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lsg;")
    public class30 field3813;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static final void method1502(int arg0) {
        if (arg0 >= -60) {
            return;
        }
        field3810++;
        for (int var1 = -1; var1 < class28.field528; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class183.field3378[var1];
            }
            class120 var3 = class75.field1670[var2];
            if (var3 != null) {
                class61.method557(30958, var3, var3.method574(true));
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)V")
    public static final void method1503(boolean arg0, int arg1) {
        if (arg1 != -8900) {
            field3805 = null;
        }
        byte[][] var2 = class23.field431;
        int var3 = class159.field2992.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class208.field3746[var4] & 0xFF) * 64 - class196.field3547;
                int var7 = (class208.field3746[var4] >> 8) * 64 - class22.field421;
                class67.method603((byte) -59);
                class247.method1733(var7, false, arg0, var5, var6, class100.field2032);
            }
        }
        field3812++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
    public static final void method1504(int arg0, int arg1, int arg2) {
        if (class223.field3999 != arg1) {
            class29.field558 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class29.field558[var3] = (var3 << 12) / arg1;
            }
            class108.field2183 = arg1 == 64 ? 2048 : 4096;
            class223.field3999 = arg1;
            class52.field1174 = arg1 - 1;
        }
        if (arg0 != 735991116) {
            return;
        }
        field3807++;
        if (class94.field1911 == arg2) {
            return;
        }
        if (class223.field3999 == arg2) {
            class154.field2910 = class29.field558;
        } else {
            class154.field2910 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class154.field2910[var4] = (var4 << 12) / arg2;
            }
        }
        class263.field4649 = arg2 - 1;
        class94.field1911 = arg2;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public static void method1505(int arg0) {
        field3809 = null;
        if (arg0 != 12202) {
            method1503(true, 126);
        }
        field3808 = null;
        field3805 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public static final void method1506(boolean arg0) {
        field3806++;
        class92.method748(8);
        class78.method690((byte) -122);
        class13.method121(-83);
        class105.method840(arg0);
        class31.method322((byte) -88);
        class99.method812(arg0);
        class154.method1154(-7307);
        class186.method1337(26130);
        class166.method1220(-8193);
        class253.method1763(-24483);
        class232.method1649(2);
        class121.method928(arg0);
        class227.method1618(-4097);
        class231.method1639((byte) -117);
        ((class99) class213.field3850).method815((byte) -49);
        class24.field462.method166((byte) -80);
        class104.field2097.method1094((byte) -87);
        class62.field1333.method1094((byte) -87);
        class90.field1825.method1094((byte) -87);
        class5.field71.method1094((byte) -87);
        class178.field3298.method1094((byte) -87);
        class139.field2713.method1094((byte) -87);
        class233.field4151.method1094((byte) -87);
        class134.field2625.method1094((byte) -87);
        class33.field826.method1094((byte) -87);
        class113.field2243.method1094((byte) -87);
        class116.field2292.method1094((byte) -87);
        class90.field1811.method1650(48);
    }
}
