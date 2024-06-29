import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class41 {

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lsc;")
    public static class181 field614 = class149.method967(255, "<col=ff0000>");

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Z")
    public static boolean field607 = false;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lsc;")
    public static class181 field615 = class149.method967(255, "Lade)3)3)3");

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Z")
    public static boolean field608 = false;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "Lsc;")
    public static class181 field624 = class149.method967(255, "sl_flags");

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Lsc;")
    private static class181 field621 = class149.method967(255, "FULL");

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lsc;")
    public static class181 field611 = field621;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static volatile int field625 = 0;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "J")
    public long field606;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Ltg;")
    public static class107 field610;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lrb;")
    public class41 field605;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Lrb;")
    public class41 field618;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Ldg;")
    public static class90 field613;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public static void method286(boolean arg0) {
        field615 = null;
        field621 = null;
        field610 = null;
        field614 = null;
        field613 = null;
        if (arg0) {
            method291(96, 44);
        }
        field624 = null;
        field611 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Z")
    public final boolean method287(int arg0) {
        int var2 = -2 / ((5 - arg0) / 36);
        field619++;
        return this.field618 != null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljb;I)V")
    public static final void method288(class11 arg0, int arg1) {
        if (arg1 != -1681946096) {
            return;
        }
        class241.field4193 = class31.method247(class246.field4292, 0, arg0);
        class131.field2175 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            int var4 = (class264.field4607[var2 + 1] & 0xFF0000) >> 16;
            float var5 = (float) ((class264.field4607[var2] & 0xFF0000) >> 16);
            float var6 = ((float) var4 - var5) / 64.0F;
            float var7 = (float) (class264.field4607[var2] & 0xFF);
            float var8 = (float) (class264.field4607[var2] >> 8 & 0xFF);
            int var9 = class264.field4607[var2 + 1] & 0xFF;
            float var10 = ((float) var9 - var7) / 64.0F;
            int var11 = class264.field4607[var2 + 1] >> 8 & 0xFF;
            float var12 = ((float) var11 - var8) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class131.field2175[var2 * 64 + var13] = class185.method1291((int) var7, class185.method1291((int) var5 << 16, (int) var8 << 8));
                var7 += var10;
                var8 += var12;
                var5 += var6;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class131.field2175[var3] = class264.field4607[3];
        }
        field622++;
        class239.field4151 = new int[32768];
        class66.field1072 = new int[32768];
        class132.method854(arg1 + 1681946197, (class134) null);
        class128.field2121 = new int[32768];
        class127.field2103 = new int[32768];
        class123.field2015 = new class48(128, 254);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static final void method289(int arg0) {
        class198.field3434.method1798(-48);
        field623++;
        if (arg0 != 9029) {
            method291(-41, -56);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public final void method290(byte arg0) {
        field617++;
        if (this.field618 == null) {
            return;
        }
        this.field618.field605 = this.field605;
        this.field605.field618 = this.field618;
        this.field618 = null;
        if (arg0 == -48) {
            this.field605 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Lja;")
    public static final class115 method291(int arg0, int arg1) {
        class115 var2 = (class115) class92.field1463.method990((byte) 80, (long) arg0);
        field612++;
        if (var2 != null) {
            return var2;
        } else if (arg1 == 0) {
            byte[] var3;
            if (arg0 < 32768) {
                var3 = class262.field4572.method89(arg0, 0, arg1 + 109);
            } else {
                var3 = class19.field347.method89(arg0 & 0x7FFF, 0, 113);
            }
            class115 var4 = new class115();
            if (var3 != null) {
                var4.method758(arg1 - 29708, new class230(var3));
            }
            if (arg0 >= 32768) {
                var4.method756((byte) -95);
            }
            class92.field1463.method982(var4, (byte) 60, (long) arg0);
            return var4;
        } else {
            return null;
        }
    }
}
