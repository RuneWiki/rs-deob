import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class226 extends class201 {

    @OriginalMember(owner = "client!d", name = "H", descriptor = "Lwf;")
    public class1 field3929;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "Z")
    public static boolean field3937 = true;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field3930 = 0;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "Ljd;")
    public static class85 field3932 = class221.method1499("Wordpack geladen)3", (byte) -72);

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    public static int field3933 = 0;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "Ljd;")
    public static class85 field3934 = class221.method1499("Hidden)2use", (byte) 101);

    @OriginalMember(owner = "client!d", name = "S", descriptor = "Ljd;")
    public static class85 field3940 = class221.method1499("Mem:", (byte) -62);

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "Lge;")
    public static class68 field3931;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "Lge;")
    public static class68 field3938;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "[[[Lck;")
    public static class208[][][] field3935;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
    public static final void method1524(int arg0) {
        if (arg0 != 32768) {
            method1524(46);
        }
        field3936++;
        if (class39.field615 == null) {
            return;
        }
        try {
            byte[] var1 = class39.field615.method676(63);
            if (var1 != null) {
                class247 var2 = new class247(var1);
                class230.field3971 = var2.method1694((byte) -100);
                class178.field3051 = new class112[class230.field3971];
                for (int var3 = 0; var3 < class230.field3971; var3++) {
                    class112 var4 = class178.field3051[var3] = new class112();
                    int var5 = var2.method1694((byte) -100);
                    var4.field1951 = var5 & 0x7FFF;
                    var4.field1962 = (var5 & 0x8000) != 0;
                    var4.field1953 = var2.method1692(125);
                    var4.field1964 = var2.method1677(true);
                    var4.field1959 = var3;
                    int var6 = var2.method1694((byte) -100);
                    var4.field1961 = class190.method1303(-64, var6);
                }
                class185.method1275(class178.field3051.length - 1, 113, class178.field3051, 0);
                class39.field615 = null;
            }
        } catch (Exception var8) {
            var8.printStackTrace();
            class39.field615 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static void method1525(byte arg0) {
        field3932 = null;
        field3935 = null;
        field3931 = null;
        field3938 = null;
        field3934 = null;
        if (arg0 < -80) {
            field3940 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(I)I")
    public static final int method1526(int arg0) {
        field3939++;
        if (arg0 < 35) {
            return 38;
        } else if (class90.field1667) {
            return 0;
        } else if (class121.method833((byte) -75)) {
            return class236.field4084 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lwf;)V")
    public class226(class1 arg0) {
        this.field3929 = arg0;
    }
}
