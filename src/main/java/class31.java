import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class31 extends class90 {

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "Ljava/lang/String;")
    private String field457 = "null";

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    public static int field456 = 0;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "Lh;")
    public static class190 field445 = new class190(16);

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "J")
    public static long field461 = 0L;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "[I")
    public static int[] field462 = new int[99];

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "C")
    public char field444;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "C")
    public char field450;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "Lh;")
    public class190 field443;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "Lh;")
    private class190 field453;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)V")
    private final void method217(int arg0) {
        this.field453 = new class190(this.field443.method1216(71));
        for (class171 var2 = (class171) this.field443.method1219(arg0 ^ 0xFFFFE9AD); var2 != null; var2 = (class171) this.field443.method1223(78)) {
            class129 var3 = new class129(var2.field2459, (int) var2.field3851);
            this.field453.method1215(var3, -112, class195.method1248(98, var2.field2459));
        }
        field459++;
        if (arg0 != -5716) {
            this.method217(58);
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(II)Z")
    public final boolean method218(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method220((byte) -111, 87, (class114) null);
        }
        field455++;
        if (this.field443 == null) {
            return false;
        }
        if (this.field453 == null) {
            this.method223(arg0 ^ 0xFFFFFF9C);
        }
        class64 var3 = (class64) this.field453.method1218((long) arg1, -121);
        return var3 != null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)I")
    public final int method219(boolean arg0, int arg1) {
        field449++;
        if (this.field443 == null) {
            return this.field454;
        }
        class64 var3 = (class64) this.field443.method1218((long) arg1, -18);
        if (var3 == null) {
            return this.field454;
        } else {
            if (!arg0) {
                this.field453 = null;
            }
            return var3.field1015;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BILkl;)V")
    private final void method220(byte arg0, int arg1, class114 arg2) {
        if (arg0 != 75) {
            field456 = 41;
        }
        if (arg1 == 1) {
            this.field450 = class188.method1210(arg2.method741(3083), false);
        } else if (arg1 == 2) {
            this.field444 = class188.method1210(arg2.method741(3083), false);
        } else if (arg1 == 3) {
            this.field457 = arg2.method753(arg0 ^ 0xFFFFFFCB);
        } else if (arg1 == 4) {
            this.field454 = arg2.method759((byte) 119);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method756(-29901);
            this.field443 = new class190(class5.method58(var4, (byte) -98));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method759((byte) 102);
                class254 var7;
                if (arg1 == 5) {
                    var7 = new class171(arg2.method753(arg0 ^ 0xFFFFFFCB));
                } else {
                    var7 = new class64(arg2.method759((byte) 111));
                }
                this.field443.method1215(var7, -98, (long) var6);
            }
        }
        field447++;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(II)Ljava/lang/String;")
    public final String method221(int arg0, int arg1) {
        field448++;
        if (this.field443 == null) {
            return this.field457;
        } else if (arg0 == 29294) {
            class171 var3 = (class171) this.field443.method1218((long) arg1, 118);
            return var3 == null ? this.field457 : var3.field2459;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lkl;I)V")
    public final void method222(class114 arg0, int arg1) {
        if (arg1 != 0) {
            this.field443 = null;
        }
        field452++;
        while (true) {
            int var3 = arg0.method760(false);
            if (var3 == 0) {
                return;
            }
            this.method220((byte) 75, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)V")
    private final void method223(int arg0) {
        if (arg0 != -100) {
            this.method223(-85);
        }
        this.field453 = new class190(this.field443.method1216(100));
        for (class64 var2 = (class64) this.field443.method1219(1); var2 != null; var2 = (class64) this.field443.method1223(102)) {
            class64 var3 = new class64((int) var2.field3851);
            this.field453.method1215(var3, arg0 ^ 0x34, (long) var2.field1015);
        }
        field458++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method224(String arg0, int arg1) {
        field451++;
        if (this.field443 == null) {
            return false;
        }
        if (this.field453 == null) {
            this.method217(-5716);
        }
        class129 var3 = (class129) this.field453.method1218(class195.method1248(arg1 ^ 0x3A, arg0), -39);
        if (arg1 != -5) {
            this.method224((String) null, -44);
        }
        while (var3 != null) {
            if (var3.field1887.equals(arg0)) {
                return true;
            }
            var3 = (class129) this.field453.method1224(arg1 + 118);
        }
        return false;
    }

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)V")
    public static void method225(int arg0) {
        field445 = null;
        if (arg0 != -5) {
            method226(30, -69);
        }
        field462 = null;
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(II)V")
    public static final void method226(int arg0, int arg1) {
        field442++;
        if (arg1 > 27 && class159.method1072((byte) -14, arg0)) {
            class149.method1009(class19.field268[arg0], -1, 0);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field462[var1] = var0 / 4;
        }
        field463 = 0;
    }
}
