import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Ljava/lang/String;")
    public static String field71 = null;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[Lhp;")
    public static class217[] field69 = new class217[2048];

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method30(int arg0) {
        field69 = null;
        if (arg0 == 0) {
            field71 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)I")
    public final int method31(boolean arg0) {
        field73++;
        if (!arg0) {
            method35(124, -69);
        }
        return this.field67;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lya;B)V")
    public static final void method32(class38 arg0, byte arg1) {
        if (class432.field6402) {
            class358.method2248(arg0, -1);
        } else {
            class213.method1476(arg0, true);
        }
        field65++;
        if (arg1 != -106) {
            field66 = 50;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method33(byte arg0, String arg1) {
        field70++;
        if (class238.field3820 == null) {
            class229.method1620(arg0 - 15);
        }
        if (arg0 != 15) {
            return;
        }
        String[] var2 = class23.method170(16943, '\n', arg1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class291.field4388; var4 > 0; var4--) {
                class238.field3820[var4] = class238.field3820[var4 - 1];
            }
            class238.field3820[0] = var2[var3];
            if (class238.field3820.length - 1 > class291.field4388) {
                class291.field4388++;
                if (class208.field3400 > 0) {
                    class208.field3400++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
    public static final void method34(int arg0, int arg1) {
        field64++;
        if (class184.method1223((byte) -66, arg0)) {
            class130.method960(-1, class200.field3326[arg0], false);
            if (arg1 != 31673) {
                method32(null, (byte) -101);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class6(String arg0, int arg1) {
        this.field67 = arg1;
    }

    @OriginalMember(owner = "client!ie", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field68++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V")
    public static final void method35(int arg0, int arg1) {
        if (arg0 != -1) {
            field69 = null;
        }
        field72++;
        class295.field4492 = arg1;
        class508.field7444.method93((byte) 97);
    }
}
