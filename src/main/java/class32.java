import java.awt.Component;
import java.awt.FontMetrics;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class32 {

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Lgb;")
    private class68 field636 = null;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Lgb;")
    private class68 field642 = null;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    private int field649 = 65000;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    private int field638;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Ldc;")
    private static class37 field639 = class185.method1233((byte) 86, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Ldc;")
    private static class37 field637 = class185.method1233((byte) 86, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Ldc;")
    public static class37 field641 = class185.method1233((byte) 86, "Benutzen");

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Ldc;")
    private static class37 field634 = class185.method1233((byte) 86, "Please reload this page)3");

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "Ldc;")
    private static class37 field655 = class185.method1233((byte) 86, "scroll:");

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "Ldc;")
    public static class37 field656 = field639;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "Ldc;")
    public static class37 field644 = field655;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "Ldc;")
    public static class37 field640 = field637;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "Ldc;")
    public static class37 field652 = field634;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "Ldc;")
    public static class37 field654 = field655;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "Lcc;")
    public static class26 field657 = new class26();

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "Ljc;")
    public static class100 field648;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "Lwa;")
    public static class238 field658;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Lig;")
    public static class93 field633;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field660;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "Z")
    public static boolean field650;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "[Ljc;")
    public static class100[] field651;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method260(int arg0) {
        field648 = null;
        field654 = null;
        field657 = null;
        field637 = null;
        field634 = null;
        field641 = null;
        field651 = null;
        field640 = null;
        field656 = null;
        field658 = null;
        field644 = null;
        field660 = null;
        field655 = null;
        field633 = null;
        field652 = null;
        field639 = null;
        if (arg0 > -72) {
            method260(101);
        }
    }

    @OriginalMember(owner = "client!ci", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field647++;
        return "Cache:" + this.field638;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)Z")
    public static final boolean method261(int arg0, int arg1) {
        field635++;
        if (arg1 != 1) {
            field651 = null;
        }
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ[BII)Z")
    private final boolean method262(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4) {
        field659++;
        class68 var6 = this.field636;
        synchronized (this.field636) {
            try {
                int var8;
                if (arg1) {
                    if ((long) (arg3 * 6 + 6) > this.field642.method495(true)) {
                        return false;
                    }
                    this.field642.method497((long) (arg3 * 6), -11320);
                    this.field642.method502(6, class24.field419, 11524, 0);
                    var8 = (class24.field419[5] & 0xFF) + ((class24.field419[4] & 0xFF) << 8) + ((class24.field419[3] & 0xFF) << 16);
                    if (var8 <= 0 || (long) var8 > this.field636.method495(true) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field636.method495(true) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class24.field419[3] = (byte) (var8 >> 16);
                class24.field419[4] = (byte) (var8 >> 8);
                class24.field419[0] = (byte) (arg4 >> 16);
                class24.field419[5] = (byte) var8;
                class24.field419[2] = (byte) arg4;
                class24.field419[1] = (byte) (arg4 >> 8);
                int var10 = 0;
                int var11 = 124 % ((48 - arg0) / 49);
                this.field642.method497((long) (arg3 * 6), -11320);
                this.field642.method504(0, class24.field419, -1, 6);
                int var12 = 0;
                while (arg4 > var10) {
                    int var13 = 0;
                    if (arg1) {
                        label104: {
                            this.field636.method497((long) (var8 * 520), -11320);
                            try {
                                this.field636.method502(8, class24.field419, 11524, 0);
                            } catch (EOFException var34) {
                                return true;
                            }
                            var13 = ((class24.field419[5] & 0xFF) << 8) + (class24.field419[4] << 16 & 0xFF0000) + (class24.field419[6] & 0xFF);
                            int var14 = ((class24.field419[0] & 0xFF) << 8) + (class24.field419[1] & 0xFF);
                            int var15 = ((class24.field419[2] & 0xFF) << 8) + (class24.field419[3] & 0xFF);
                            int var16 = class24.field419[7] & 0xFF;
                            if (arg3 == var14 && var12 == var15 && this.field638 == var16) {
                                if (var13 >= 0 && this.field636.method495(true) / 520L >= (long) var13) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg1 = false;
                        var13 = (int) ((this.field636.method495(true) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class24.field419[1] = (byte) arg3;
                    int var19 = arg4 - var10;
                    class24.field419[2] = (byte) (var12 >> 8);
                    class24.field419[0] = (byte) (arg3 >> 8);
                    if (arg4 - var10 <= 512) {
                        var13 = 0;
                    }
                    class24.field419[6] = (byte) var13;
                    class24.field419[5] = (byte) (var13 >> 8);
                    class24.field419[4] = (byte) (var13 >> 16);
                    class24.field419[3] = (byte) var12;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    var12++;
                    class24.field419[7] = (byte) this.field638;
                    this.field636.method497((long) (var8 * 520), -11320);
                    var8 = var13;
                    this.field636.method504(0, class24.field419, -1, 8);
                    this.field636.method504(var10, arg2, -1, var19);
                    var10 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)[B")
    public final byte[] method263(byte arg0, int arg1) {
        field645++;
        class68 var3 = this.field636;
        synchronized (this.field636) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field642.method495(true)) {
                    return null;
                }
                this.field642.method497((long) (arg1 * 6), -11320);
                this.field642.method502(6, class24.field419, 11524, 0);
                if (arg0 != -32) {
                    this.method262(-30, false, null, -101, 77);
                }
                int var5 = ((class24.field419[0] & 0xFF) << 16) + (class24.field419[1] << 8 & 0xFF00) + (class24.field419[2] & 0xFF);
                int var6 = ((class24.field419[4] & 0xFF) << 8) + (class24.field419[3] << 16 & 0xFF0000) + (class24.field419[5] & 0xFF);
                if (var5 < 0 || this.field649 < var5) {
                    return null;
                } else if (var6 > 0 && this.field636.method495(true) / 520L >= (long) var6) {
                    int var9 = 0;
                    int var10 = 0;
                    byte[] var11 = new byte[var5];
                    while (var9 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field636.method497((long) (var6 * 520), -11320);
                        int var13 = var5 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field636.method502(var13 + 8, class24.field419, 11524, 0);
                        int var14 = ((class24.field419[2] & 0xFF) << 8) + (class24.field419[3] & 0xFF);
                        int var15 = class24.field419[7] & 0xFF;
                        int var16 = ((class24.field419[0] & 0xFF) << 8) + (class24.field419[1] & 0xFF);
                        int var17 = ((class24.field419[5] & 0xFF) << 8) + (class24.field419[4] << 16 & 0xFF0000) + (class24.field419[6] & 0xFF);
                        if (arg1 == var16 && var10 == var14 && this.field638 == var15) {
                            if (var17 >= 0 && this.field636.method495(true) / 520L >= (long) var17) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var11[var9++] = class24.field419[var20 + 8];
                                }
                                var10++;
                                var6 = var17;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var11;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[BII)Z")
    public final boolean method264(int arg0, byte[] arg1, int arg2, int arg3) {
        field646++;
        class68 var5 = this.field636;
        synchronized (this.field636) {
            if (arg2 < 0 || arg2 > this.field649) {
                throw new IllegalArgumentException();
            } else if (arg3 == -9168) {
                boolean var7 = this.method262(-110, true, arg1, arg0, arg2);
                if (!var7) {
                    var7 = this.method262(101, false, arg1, arg0, arg2);
                }
                return var7;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method265(int arg0, Component arg1) {
        arg1.removeMouseListener(field657);
        field653++;
        arg1.removeMouseMotionListener(field657);
        arg1.removeFocusListener(field657);
        if (arg0 >= -58) {
            field655 = null;
        }
        class43.field922 = 0;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(ILgb;Lgb;I)V")
    public class32(int arg0, class68 arg1, class68 arg2, int arg3) {
        this.field636 = arg1;
        this.field638 = arg0;
        this.field649 = arg3;
        this.field642 = arg2;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILdc;)Z")
    public static final boolean method266(int arg0, class37 arg1) {
        field661++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 <= 126) {
            field640 = null;
        }
        for (int var2 = 0; var2 < class59.field1100; var2++) {
            if (arg1.method303(class128.field2388[var2], 40)) {
                return true;
            }
        }
        return false;
    }
}
