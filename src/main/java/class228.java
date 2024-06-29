import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public abstract class class228 extends class125 {

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "Z")
    public boolean field3943;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "[Leg;")
    public class228[] field3935;

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "Loa;")
    public static class99 field3938 = class221.method1463(2844, " de votre liste d(Wamis)3");

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "Lgd;")
    public static class74 field3936 = new class74(64);

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public int field3937;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "Lje;")
    public class184 field3952;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "Lrk;")
    public class271 field3948;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "Lge;")
    public static class70 field3950;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "[[[B")
    public static byte[][][] field3951;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[I")
    public int[] method106(int arg0, int arg1) {
        field3940++;
        if (arg1 != -3) {
            method1495((byte) 21, (KeyEvent) null);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
    public static final int method1495(byte arg0, KeyEvent arg1) {
        field3945++;
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        }
        if (arg0 <= 120) {
            field3950 = null;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(B)V")
    public static final void method1496(byte arg0) {
        class120.field2121.method331(9995);
        if (arg0 > -65) {
            return;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class76.field1352[var1] = 0L;
        }
        field3949++;
        for (int var2 = 0; var2 < 32; var2++) {
            class107.field1863[var2] = 0L;
        }
        class212.field3670 = 0;
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(B)I")
    public int method881(byte arg0) {
        int var2 = 107 / ((arg0 - 13) / 59);
        field3933++;
        return -1;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)I")
    public static final int method1497(int arg0, int arg1) {
        field3934++;
        int var2 = arg1 & arg0;
        int var3 = (arg1 & 0xC2) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)[[I")
    public int[][] method19(byte arg0, int arg1) {
        if (arg0 == -27) {
            field3944++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)V")
    public static final void method1498(int arg0, int arg1) {
        field3939++;
        if (arg1 > -7) {
            method1495((byte) -39, (KeyEvent) null);
        }
        if (class22.method134(arg0, (byte) 65)) {
            class201.method1347(-1, class125.field2188[arg0], 64);
        }
    }

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "(B)I")
    public int method856(byte arg0) {
        field3931++;
        if (arg0 < 119) {
            method1499(false);
        }
        return -1;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)V")
    public static void method1499(boolean arg0) {
        field3936 = null;
        field3950 = null;
        if (arg0) {
            field3938 = null;
        }
        field3938 = null;
        field3951 = null;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
    public void method852(int arg0) {
        field3930++;
        if (arg0 != 0) {
            return;
        }
        if (this.field3943) {
            this.field3952.method1264(23418);
            this.field3952 = null;
        } else {
            this.field3948.method1794(111);
            this.field3948 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIB)[I")
    public final int[] method1500(int arg0, int arg1, byte arg2) {
        field3947++;
        if (arg2 <= 103) {
            this.field3935 = null;
        }
        return this.field3935[arg1].field3943 ? this.field3935[arg1].method106(arg0, -3) : this.field3935[arg1].method19((byte) -27, arg0)[0];
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V")
    public final void method1501(int arg0, int arg1, int arg2) {
        int var4 = this.field3937 == arg0 ? arg1 : this.field3937;
        field3932++;
        if (this.field3943) {
            this.field3952 = new class184(var4, arg1, arg2);
        } else {
            this.field3948 = new class271(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
    public void method278(int arg0) {
        field3942++;
        if (arg0 != -8) {
            this.field3935 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILik;I)V")
    public void method18(int arg0, class261 arg1, int arg2) {
        field3946++;
        if (arg2 != -7618) {
            this.field3952 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)[[I")
    public final int[][] method1502(int arg0, int arg1, int arg2) {
        field3941++;
        if (arg0 != 255) {
            this.method18(-89, (class261) null, -99);
        }
        if (this.field3935[arg2].field3943) {
            int[] var4 = this.field3935[arg2].method106(arg1, arg0 ^ 0xFFFFFF02);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3935[arg2].method19((byte) -27, arg1);
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IZ)V")
    public class228(int arg0, boolean arg1) {
        this.field3943 = arg1;
        this.field3935 = new class228[arg0];
    }
}
