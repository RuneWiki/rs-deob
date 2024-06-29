import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public abstract class class719 {

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "Lee;")
    public class703 field9776;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "Lgi;")
    public static class705 field9784 = new class705();

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
    public static int field9785 = -1;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "[I")
    public static int[] field9786 = new int[50];

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
    public static int field9774;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public static int field9775;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public static int field9777;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "I")
    public static int field9778;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
    public static int field9779;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
    public static int field9780;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    public static int field9781;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    public static int field9782;

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
    public static int field9783;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "Lai;")
    public static class624 field9773;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V", line = 6)
    public void method1336(int arg0) {
        if (arg0 != 256) {
            field9785 = -6;
        }
        field9780++;
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)V", line = 26)
    public void method714(int arg0) {
        if (arg0 != -22274) {
            field9785 = -63;
        }
        field9782++;
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)V", line = 37)
    public void method673(int arg0) {
        if (arg0 != -23970) {
            this.method673(-128);
        }
        field9779++;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(B[B)[B", line = 47)
    public static final byte[] method3969(byte arg0, byte[] arg1) {
        field9777++;
        class254 var2 = new class254(arg1);
        if (arg0 != 16) {
            return null;
        }
        int var3 = var2.method1731((byte) 64);
        int var4 = var2.method1672(-16516);
        if (var4 < 0 || class522.field7257 != 0 && class522.field7257 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method1735(0, 122, var8, var4);
            return var8;
        } else {
            int var5 = var2.method1672(-16516);
            if (var5 < 0 || !(class522.field7257 == 0 || class522.field7257 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class277.method1817(var6, var5, arg1, var4, 9);
            } else {
                class601 var7 = class66.field918;
                synchronized (class66.field918) {
                    class66.field918.method3368(var6, var2, (byte) 127);
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "(I)V", line = 104)
    public static void method3970(int arg0) {
        field9786 = null;
        field9784 = null;
        field9773 = null;
        if (arg0 != -1) {
            method3970(-15);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V", line = 116)
    public void method1337(byte arg0) {
        int var2 = -37 % ((73 - arg0) / 40);
        field9781++;
    }

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "(I)V", line = 125)
    public void method672(int arg0) {
        field9778++;
        if (arg0 >= -35) {
            field9773 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIB)Z", line = 135)
    public static final boolean method3971(int arg0, int arg1, byte arg2) {
        if (arg2 != -33) {
            method3970(-56);
        }
        field9774++;
        return (arg1 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "(I)V", line = 147)
    public void method1335(int arg0) {
        field9775++;
        if (arg0 <= 110) {
            method3971(-26, -66, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lee;)V", line = 157)
    public class719(class703 arg0) {
        this.field9776 = arg0;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IZ)V")
    public abstract void method222(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZZ)V")
    public abstract void method225(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)V")
    public abstract void method219(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZLb;I)V")
    public abstract void method221(boolean arg0, class352 arg1, int arg2);

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(B)Z")
    public abstract boolean method218(byte arg0);

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "(I)V")
    public abstract void method220(int arg0);
}
