import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class47 {

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "Ltm;")
    private class187 field469 = new class187();

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "Lrh;")
    private class69 field477 = new class69();

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    private int field474;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "Luc;")
    private class58 field475;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public static int field470 = 0;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field472 = 0;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "Leb;")
    public static class382 field478 = new class382(8);

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "J")
    public static long field468;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
    public static final void method217(byte arg0) {
        class88.field995.method606((byte) 77);
        field466++;
        if (arg0 != -22) {
            method221(53, (byte) 120, true);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(JBLtm;)V")
    public final void method218(long arg0, byte arg1, class187 arg2) {
        field473++;
        if (this.field476 == 0) {
            class187 var5 = this.field477.method398((byte) 38);
            var5.method1967(-1);
            var5.method1009((byte) -128);
            if (this.field469 == var5) {
                class187 var6 = this.field477.method398((byte) 38);
                var6.method1967(-1);
                var6.method1009((byte) 8);
            }
        } else {
            this.field476--;
        }
        this.field475.method314(arg0, arg2, 7079);
        int var7 = 39 % ((arg1 + 60) / 60);
        this.field477.method393((byte) 54, arg2);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)I")
    public static final int method219(int arg0, int arg1) {
        field471++;
        if (arg0 <= 80) {
            method223(75);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public final void method220(int arg0) {
        field467++;
        if (arg0 == -1) {
            this.field477.method391((byte) 114);
            this.field475.method307((byte) 115);
            this.field469 = new class187();
            this.field476 = this.field474;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IBZ)Ljava/lang/String;")
    public static final String method221(int arg0, byte arg1, boolean arg2) {
        if (arg1 != -50) {
            field478 = null;
        }
        field479++;
        return arg2 && arg0 >= 0 ? class18.method84(10, true, arg0, arg2) : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(JI)Ltm;")
    public final class187 method222(long arg0, int arg1) {
        field465++;
        class187 var4 = (class187) this.field475.method308(arg0, (byte) -118);
        if (arg1 == -8407) {
            if (var4 != null) {
                this.field477.method393((byte) 79, var4);
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
    public static void method223(int arg0) {
        if (arg0 > -22) {
            field478 = null;
        }
        field478 = null;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(I)V")
    public class47(int arg0) {
        this.field474 = arg0;
        this.field476 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field475 = new class58(var2);
    }
}
