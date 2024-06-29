import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class48 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
    public static int[] field861 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field863 = 0;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "Lke;")
    public static class256 field867 = class316.method2202("null", 27626);

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Lke;")
    private static class256 field859 = class316.method2202("Loaded world list data", 27626);

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "Z")
    public static volatile boolean field868 = true;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "[J")
    public static long[] field869 = new long[100];

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Lke;")
    public static class256 field860 = field859;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field865 = new CRC32();

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "Z")
    public static boolean field873 = false;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "Lke;")
    public static class256 field874 = class316.method2202("overlay", 27626);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "[[[B")
    public static byte[][][] field858;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V", line = 8)
    public static final void method383(int arg0, int arg1) {
        class271 var2 = class41.field790[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class271 var4 = class41.field790[var3][arg0][arg1] = class41.field790[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field4622--;
                for (int var5 = 0; var5 < var4.field4641; var5++) {
                    class269 var6 = var4.field4624[var5];
                    if ((var6.field4601 >> 29 & 0x3L) == 2L && var6.field4594 == arg0 && var6.field4587 == arg1) {
                        var6.field4581--;
                    }
                }
            }
        }
        if (class41.field790[0][arg0][arg1] == null) {
            class41.field790[0][arg0][arg1] = new class271(0, arg0, arg1);
        }
        class41.field790[0][arg0][arg1].field4619 = var2;
        class41.field790[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)Lsk;", line = 58)
    public static final class269 method384(int arg0, int arg1, int arg2) {
        class271 var3 = class41.field790[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4641; var4++) {
            class269 var5 = var3.field4624[var4];
            if ((var5.field4601 >> 29 & 0x3L) == 2L && var5.field4594 == arg1 && var5.field4587 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fg", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 85)
    public final void keyTyped(KeyEvent arg0) {
        if (class233.field3981 != null) {
            int var2 = class129.method885(arg0, -17006);
            if (var2 >= 0) {
                int var3 = class8.field127 + 1 & 0x7F;
                if (class98.field1757 != var3) {
                    class256.field4408[class8.field127] = -1;
                    class85.field1536[class8.field127] = var2;
                    class8.field127 = var3;
                }
            }
        }
        field864++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!fg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 124)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class233.field3981 != null) {
            class287.field4972 = -1;
        }
        field862++;
    }

    @OriginalMember(owner = "client!fg", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 152)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class233.field3981 != null) {
            class277.field4768 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class289.field4991.length) {
                var3 = class289.field4991[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class287.field4972 >= 0 && var3 >= 0) {
                class254.field4358[class287.field4972] = var3;
                class287.field4972 = class287.field4972 + 1 & 0x7F;
                if (class287.field4972 == class129.field2255) {
                    class287.field4972 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class8.field127 + 1 & 0x7F;
                if (class98.field1757 != var4) {
                    class256.field4408[class8.field127] = var3;
                    class85.field1536[class8.field127] = -1;
                    class8.field127 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field870++;
    }

    @OriginalMember(owner = "client!fg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 217)
    public final void focusGained(FocusEvent arg0) {
        field866++;
    }

    @OriginalMember(owner = "client!fg", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 224)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field871++;
        if (class233.field3981 != null) {
            class277.field4768 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class289.field4991.length > var2) {
                var3 = class289.field4991[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class287.field4972 >= 0 && var3 >= 0) {
                class254.field4358[class287.field4972] = ~var3;
                class287.field4972 = class287.field4972 + 1 & 0x7F;
                if (class287.field4972 == class129.field2255) {
                    class287.field4972 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 298)
    public static void method385(int arg0) {
        field865 = null;
        if (arg0 != 6445) {
            method386((byte) -22);
        }
        field874 = null;
        field869 = null;
        field861 = null;
        field860 = null;
        field858 = (byte[][][]) null;
        field859 = null;
        field867 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)Lke;", line = 324)
    public static final class256 method386(byte arg0) {
        field856++;
        class256 var1 = class46.field844;
        int var2 = -61 % ((67 - arg0) / 41);
        class256 var3 = class260.field4495;
        if (class40.field724 != 0) {
            var3 = class37.field652;
        }
        if (class281.field4882 != null) {
            var1 = class30.method214(new class256[] { class85.field1542, class281.field4882 }, 29784);
        }
        return class30.method214(new class256[] { class183.field3243, var3, class254.field4337, class305.method2125((byte) 66, class204.field3699), class160.field2854, class305.method2125((byte) 40, class7.field107), var1, class289.field5004 }, 29784);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)Lei;", line = 348)
    public static final class68 method387(byte arg0, int arg1) {
        class68 var2 = (class68) class225.field3916.method1260(arg0 - 61, (long) arg1);
        field857++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class170.field3009.method1016(11, 100, arg1);
        class68 var4 = new class68();
        if (arg0 != -55) {
            field867 = (class256) null;
        }
        if (var3 != null) {
            var4.method526(9983, new class41(var3));
        }
        class225.field3916.method1259(var4, (long) arg1, arg0 + 55);
        return var4;
    }
}
