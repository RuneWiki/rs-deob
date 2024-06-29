import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class213 {

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Lob;")
    public static class141 field4064 = class175.method1195(40, "(Udns");

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Lob;")
    public static class141 field4065 = class175.method1195(40, "nav");

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field4069 = 0;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "[I")
    public static int[] field4071 = new int[128];

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "J")
    public long field4067;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Lvd;")
    public class213 field4070;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "Lvd;")
    public class213 field4072;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Z")
    public final boolean method1386(int arg0) {
        field4068++;
        if (arg0 != -1677781832) {
            method1387(111);
        }
        return this.field4070 != null;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public static void method1387(int arg0) {
        field4071 = null;
        if (arg0 == 17480) {
            field4064 = null;
            field4065 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)Lcc;")
    public static final class24 method1388(int arg0, byte arg1) {
        int var2 = -63 % ((-arg1 - 54) / 55);
        field4060++;
        class24 var3 = (class24) class173.field3438.method1383((long) arg0, (byte) 94);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class123.field2356.method1065((byte) -90, arg0, 5);
        class24 var5 = new class24();
        if (var4 != null) {
            var5.method172(new class146(var4), -124);
        }
        class173.field3438.method1378(var5, (byte) -49, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIII)V")
    public static final void method1389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4063++;
        int var6 = class106.method703(class35.field698, class130.field2470, true, arg4);
        int var7 = class106.method703(class35.field698, class130.field2470, true, arg1);
        int var8 = class106.method703(class68.field1323, class136.field2590, true, arg2);
        int var9 = class106.method703(class68.field1323, class136.field2590, true, arg5);
        for (int var10 = var6; var10 <= var7; var10++) {
            class180.method1217(var9, (byte) 52, var8, arg3, class41.field805[var10]);
        }
        if (arg0 != 255) {
            field4065 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)Lob;")
    public static final class141 method1390(int arg0, int arg1) {
        field4062++;
        return arg0 > -12 ? null : class220.method1422(new class141[] { class78.method543((byte) 93, arg1 >> 24 & 0xFF), class187.field3627, class78.method543((byte) 93, arg1 >> 16 & 0xFF), class187.field3627, class78.method543((byte) 93, arg1 >> 8 & 0xFF), class187.field3627, class78.method543((byte) 93, arg1 & 0xFF) }, -3);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)Lme;")
    public static final class124 method1391(int arg0, int arg1, int arg2) {
        class153 var3 = class131.field2506[arg0][arg1][arg2];
        return var3 == null || var3.field2926 == null ? null : var3.field2926;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
    public final void method1392(int arg0) {
        field4061++;
        if (this.field4070 == null) {
            return;
        }
        this.field4070.field4072 = this.field4072;
        this.field4072.field4070 = this.field4070;
        this.field4072 = null;
        this.field4070 = null;
        if (arg0 != 128) {
            this.field4072 = null;
        }
    }
}
