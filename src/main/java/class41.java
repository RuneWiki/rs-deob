import java.io.IOException;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class class41 {

    @OriginalMember(owner = "e", name = "a", descriptor = "I")
    public static int field857 = 0;

    @OriginalMember(owner = "e", name = "c", descriptor = "[I")
    public static int[] field859 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "e", name = "k", descriptor = "Llf;")
    public static class109 field867 = class35.method275("Lade Texturen )2 ", 2);

    @OriginalMember(owner = "e", name = "d", descriptor = "I")
    public static int field860 = 0;

    @OriginalMember(owner = "e", name = "m", descriptor = "Lrc;")
    public static class160 field869 = new class160(64);

    @OriginalMember(owner = "e", name = "n", descriptor = "I")
    public static int field870 = 0;

    @OriginalMember(owner = "e", name = "b", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "e", name = "e", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "e", name = "f", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "e", name = "g", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "e", name = "h", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "e", name = "j", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "e", name = "l", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "e", name = "o", descriptor = "Ls;")
    public static class166 field871;

    @OriginalMember(owner = "e", name = "p", descriptor = "Lah;")
    public static class9 field872;

    @OriginalMember(owner = "e", name = "i", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field865;

    @OriginalMember(owner = "e", name = "a", descriptor = "(IZ)V")
    public static final void method297(int arg0, boolean arg1) {
        field863++;
        if (class199.field3800 == null) {
            return;
        }
        try {
            if (arg0 == -1) {
                class86 var2 = new class86(4);
                var2.method568(-13488, arg1 ? 2 : 3);
                var2.method549(0, arg0 - 2139);
                class199.field3800.method908(-74, 0, 4, var2.field1808);
            }
        } catch (IOException var4) {
            try {
                class199.field3800.method915((byte) -46);
            } catch (Exception var3) {
            }
            class199.field3800 = null;
            class75.field1428++;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(B)V")
    public static final void method298(byte arg0) {
        if (arg0 <= 38) {
            return;
        }
        field862++;
        for (class63 var1 = (class63) class22.field506.method1230(58); var1 != null; var1 = (class63) class22.field506.method1234(-1)) {
            if (class72.field1405 != var1.field1218 || var1.field1234 < class143.field2754) {
                var1.method452(true);
            } else if (class143.field2754 >= var1.field1230) {
                if (var1.field1232 > 0) {
                    class139 var2 = class183.field3444[var1.field1232 - 1];
                    if (var2 != null && var2.field3549 >= 0 && var2.field3549 < 13312 && var2.field3609 >= 0 && var2.field3609 < 13312) {
                        var1.method409(class143.field2754, 42, var2.field3609, class19.method180(var2.field3609, false, var1.field1218, var2.field3549) - var1.field1206, var2.field3549);
                    }
                }
                if (var1.field1232 < 0) {
                    int var3 = -var1.field1232 - 1;
                    class184 var4;
                    if (class59.field1168 == var3) {
                        var4 = class157.field2955;
                    } else {
                        var4 = class202.field3975[var3];
                    }
                    if (var4 != null && var4.field3549 >= 0 && var4.field3549 < 13312 && var4.field3609 >= 0 && var4.field3609 < 13312) {
                        var1.method409(class143.field2754, 47, var4.field3609, class19.method180(var4.field3609, false, var1.field1218, var4.field3549) - var1.field1206, var4.field3549);
                    }
                }
                var1.method410(class193.field3694, (byte) 84);
                class95.method684(class72.field1405, (int) var1.field1226, (int) var1.field1223, (int) var1.field1220, 60, var1, var1.field1215, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(ILja;[B)V")
    public final void method299(int arg0, class86 arg1, byte[] arg2) {
        field866++;
        if (arg1.field1808[arg1.field1773] != 31 || arg1.field1808[arg1.field1773 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field865 == null) {
            this.field865 = new Inflater(true);
        }
        try {
            this.field865.setInput(arg1.field1808, arg1.field1773 + 10, arg1.field1808.length + -arg1.field1773 + -10 + -8);
            this.field865.inflate(arg2);
        } catch (Exception var4) {
            this.field865.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg0 != 28501) {
            method298((byte) 59);
        }
        this.field865.reset();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(ZI)Z")
    public static final boolean method300(boolean arg0, int arg1) {
        field861++;
        if (!arg0) {
            field867 = null;
        }
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(I)V")
    public static void method301(int arg0) {
        field867 = null;
        field859 = null;
        if (arg0 != -10) {
            method300(true, 7);
        }
        field869 = null;
        field872 = null;
        field871 = null;
    }

    @OriginalMember(owner = "e", name = "<init>", descriptor = "(III)V")
    private class41(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "e", name = "<init>", descriptor = "()V")
    public class41() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(BI)Z")
    public static final boolean method302(byte arg0, int arg1) {
        field858++;
        if (arg0 == -19) {
            return (arg1 & 0x1) != 0;
        } else {
            return false;
        }
    }
}
