import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class136 {

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Z")
    public static volatile boolean field2603 = true;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Ljd;")
    public static class86 field2604 = class122.method868("Texturen geladen)3", true);

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Z")
    public static boolean field2601 = false;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Lmg;")
    public static class252 field2600 = new class252(16);

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "Ljd;")
    public static class86 field2606 = class122.method868("T", true);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Lod;")
    public static class90 field2605;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)I")
    public static final int method973(int arg0, int arg1, int arg2, int arg3) {
        field2597++;
        int var4 = arg1 & arg2 - 1;
        int var5 = arg0 / arg2;
        int var6 = arg1 / arg2;
        int var7 = class244.method1664(-20, var5, var6);
        int var8 = arg2 - 1 & arg0;
        int var9 = class244.method1664(-64, var5, var6 + 1);
        if (arg3 != 6059) {
            field2605 = null;
        }
        int var10 = class244.method1664(-68, var5 + 1, var6);
        int var11 = class244.method1664(arg3 ^ 0xFFFFE844, var5 + 1, var6 - -1);
        int var12 = class209.method1483(var9, var4, var7, false, arg2);
        int var13 = class209.method1483(var11, var4, var10, false, arg2);
        return class209.method1483(var13, var8, var12, false, arg2);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V")
    public static final void method974(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class129.field2473 = arg0;
        class49.field1044 = arg2;
        class56.field1143 = arg4;
        if (arg1 == 1023) {
            field2602++;
            class50.field1050 = arg3;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)Z")
    public static final boolean method975(byte arg0) {
        field2599++;
        class118 var1 = class108.field2079;
        synchronized (class108.field2079) {
            int var2 = 3 % ((arg0 + 72) / 53);
            if (class30.field643 == class104.field1983) {
                return false;
            } else {
                class227.field4120 = class90.field1843[class30.field643];
                class268.field4720 = class66.field1298[class30.field643];
                class30.field643 = class30.field643 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method976(int arg0) {
        field2600 = null;
        field2605 = null;
        field2606 = null;
        if (arg0 != -5675) {
            field2601 = true;
        }
        field2604 = null;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
    public static final void method977(byte arg0) {
        class253.field4504.method294((byte) 88);
        class187.field3315 = null;
        int var1 = -88 % ((-arg0 - 34) / 52);
        class45.field1007 = 1;
        field2598++;
    }
}
