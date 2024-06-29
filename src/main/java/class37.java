import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class37 implements class202 {

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Z")
    private boolean field740 = true;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lbe;")
    public static class17 field738 = new class17();

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "Ldc;")
    public static class37 field783 = class185.method1233((byte) 86, "(U3");

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "Ldc;")
    private static class37 field785 = class185.method1233((byte) 86, "Login");

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "Ldc;")
    public static class37 field786 = field785;

    @OriginalMember(owner = "client!dc", name = "ib", descriptor = "Lsg;")
    public static class203 field788 = new class203();

    @OriginalMember(owner = "client!dc", name = "jb", descriptor = "Ldc;")
    public static class37 field789 = class185.method1233((byte) 86, ":assistreq:");

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    private int field753;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "Lwa;")
    public static class238 field784;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dc", name = "kb", descriptor = "Ljava/lang/Class;")
    public static Class field790;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "[B")
    public byte[] field743;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III[BI)I")
    public final int method300(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        if (arg4 == 2514) {
            field757++;
            class4.method35(this.field743, arg0, arg3, arg1, arg2 - arg0);
            return arg2 - arg0;
        } else {
            return -119;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Ldc;")
    public final class37 method301(byte arg0, int arg1) {
        field755++;
        if (arg0 < 64) {
            this.method310(true);
        }
        return this.method311(this.field733, arg1, true);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static final void method302(byte arg0) {
        field741++;
        class210.method1395(arg0, class56.field1073);
        class39.field811++;
        if (class245.field4479 && class163.field3100) {
            int var1 = class235.field4271;
            int var2 = var1 - class160.field3031;
            if (var2 < class136.field2592) {
                var2 = class136.field2592;
            }
            int var3 = class80.field1416;
            if (class56.field1073.field2509 + var2 > class136.field2592 + class136.field2612.field2509) {
                var2 = class136.field2592 + class136.field2612.field2509 - class56.field1073.field2509;
            }
            int var4 = var2 - class235.field4282;
            int var5 = var3 - class75.field1334;
            int var6 = class56.field1073.field2551;
            if (var5 < class108.field1886) {
                var5 = class108.field1886;
            }
            if (class56.field1073.field2638 + var5 > class108.field1886 - -class136.field2612.field2638) {
                var5 = class108.field1886 + class136.field2612.field2638 - class56.field1073.field2638;
            }
            int var7 = var5 - class41.field861;
            if (class56.field1073.field2534 < class39.field811 && (var6 < var7 || var7 < -var6 || var6 < var4 || var4 < -var6)) {
                class13.field190 = true;
            }
            int var8 = class136.field2612.field2519 + var5 - class108.field1886;
            int var9 = var2 + class136.field2612.field2593 - class136.field2592;
            if (class56.field1073.field2563 != null && class13.field190) {
                class51 var10 = new class51();
                var10.field1031 = class56.field1073;
                var10.field1042 = class56.field1073.field2563;
                var10.field1026 = var9;
                var10.field1032 = var8;
                class210.method1397(var10, (byte) -113);
            }
            if (class20.field334 == 0) {
                if (class13.field190) {
                    if (class56.field1073.field2576 != null) {
                        class51 var11 = new class51();
                        var11.field1023 = class200.field3741;
                        var11.field1042 = class56.field1073.field2576;
                        var11.field1031 = class56.field1073;
                        var11.field1026 = var9;
                        var11.field1032 = var8;
                        class210.method1397(var11, (byte) -104);
                    }
                    if (class200.field3741 != null && class10.method67((byte) 116, class56.field1073) != null) {
                        class49.field970.method1503(234, 2976);
                        class208.field3898++;
                        class49.field970.method197(class200.field3741.field2515, (byte) 51);
                        class49.field970.method199(class56.field1073.field2608, (byte) 66);
                        class49.field970.method235(class200.field3741.field2608, (byte) -67);
                        class49.field970.method217(-38, class56.field1073.field2515);
                    }
                } else if ((class215.field4009 == 1 || class209.method1390((byte) 126, class97.field1701 - 1)) && class97.field1701 > 2) {
                    class85.method577(false);
                } else if (class97.field1701 > 0) {
                    class156.method1057((byte) -82, class97.field1701 - 1);
                }
                class56.field1073 = null;
            }
        } else if (class39.field811 > 1) {
            class56.field1073 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ldc;I)Z")
    public final boolean method303(class37 arg0, int arg1) {
        field766++;
        if (arg0 == null) {
            return false;
        } else if (this.field733 == arg0.field733) {
            for (int var3 = 0; var3 < this.field733; var3++) {
                byte var4 = arg0.field743[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = this.field743[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            if (arg1 != 40) {
                this.method315(-110);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
    public final int method304(FontMetrics arg0, int arg1) {
        field744++;
        if (arg1 != -32) {
            field786 = null;
        }
        String var3;
        try {
            var3 = new String(this.field743, 0, this.field733, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field743, 0, this.field733);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)I")
    public final int method305(boolean arg0) {
        field729++;
        if (!arg0) {
            field788 = null;
        }
        return this.method322((byte) -22, 10);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/applet/Applet;)V")
    public final void method306(int arg0, Applet arg1) throws Throwable {
        field780++;
        String var3 = new String(this.field743, arg0, this.field733);
        class175.method1178(var3, -29116, arg1);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)I")
    public static final int method307(int arg0, int arg1, int arg2, int arg3) {
        field736++;
        if ((class193.field3602[arg3][arg2][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg3 <= 0 || (class193.field3602[1][arg2][arg0] & 0x2) == 0) {
            return arg1 <= 19 ? -95 : arg3;
        } else {
            return arg3 - 1;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)Ldc;")
    public final class37 method308(byte arg0) {
        field770++;
        if (arg0 == -107) {
            class37 var2 = class184.method1228(-1, this.method347(-98));
            return var2 == null ? class220.field4085 : var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I")
    public final int method309(int arg0) {
        if (arg0 != 255) {
            field783 = null;
        }
        field751++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field733; var3++) {
            var2 = (var2 << 5) + (this.field743[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)[B")
    public final byte[] method310(boolean arg0) {
        field771++;
        byte[] var2 = new byte[this.field733];
        class4.method35(this.field743, 0, var2, 0, this.field733);
        if (!arg0) {
            field788 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIZ)Ldc;")
    public final class37 method311(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method333(true);
        }
        field762++;
        class37 var4 = new class37();
        var4.field733 = arg0 - arg1;
        var4.field743 = new byte[arg0 - arg1];
        class4.method35(this.field743, arg1, var4.field743, 0, var4.field733);
        return var4;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Ldc;")
    public final class37 method312(int arg0) {
        field752++;
        class37 var2 = new class37();
        var2.field733 = this.field733;
        if (arg0 != 1) {
            return null;
        }
        var2.field743 = new byte[this.field733];
        byte var3 = 2;
        for (int var4 = 0; var4 < this.field733; var4++) {
            byte var5 = this.field743[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || !(var5 < -64 || var5 > -34 || var5 == -41)) {
                if (var3 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = 2;
            } else if (var5 != 32) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2.field743[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Ldc;I)Z")
    public final boolean method313(class37 arg0, int arg1) {
        field775++;
        if (arg0.field733 > this.field733) {
            return false;
        }
        if (arg1 != -22215) {
            this.method346(null, (byte) -79);
        }
        for (int var3 = 0; var3 < arg0.field733; var3++) {
            byte var4 = arg0.field743[var3];
            byte var5 = this.field743[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLdc;)I")
    public final int method314(boolean arg0, class37 arg1) {
        int var3;
        if (this.field733 <= arg1.field733) {
            var3 = this.field733;
        } else {
            var3 = arg1.field733;
        }
        field748++;
        if (!arg0) {
            this.method324(-111, -51, null);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field743[var4] & 0xFF) < (arg1.field743[var4] & 0xFF)) {
                return -1;
            }
            if ((arg1.field743[var4] & 0xFF) < (this.field743[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1.field733 > this.field733) {
            return -1;
        } else if (this.field733 > arg1.field733) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)Ldc;")
    public final class37 method315(int arg0) {
        if (arg0 != 48) {
            this.method301((byte) -9, -22);
        }
        class37 var2 = new class37();
        field750++;
        var2.field733 = this.field733;
        var2.field743 = new byte[this.field733];
        for (int var3 = 0; var3 < this.field733; var3++) {
            byte var4 = this.field743[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field743[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)Ljava/net/URL;")
    public final URL method316(byte arg0) throws MalformedURLException {
        int var2 = -54 % ((-arg0 - 22) / 47);
        field754++;
        return new URL(new String(this.field743, 0, this.field733));
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)Ldc;")
    public final class37 method317(byte arg0) {
        class37 var2 = new class37();
        field777++;
        var2.field733 = this.field733;
        boolean var3 = true;
        var2.field743 = new byte[this.field733];
        for (int var4 = 0; var4 < this.field733; var4++) {
            byte var5 = this.field743[var4];
            if (var5 == 95) {
                var2.field743[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field743[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var3 = false;
                var2.field743[var4] = var5;
            }
        }
        if (arg0 != 59) {
            this.method325(null, 26);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(B)Ldc;")
    public final class37 method318(byte arg0) {
        field779++;
        class37 var2 = new class37();
        if (arg0 != 59) {
            this.method339(null, (byte) 26);
        }
        var2.field733 = this.field733;
        var2.field743 = new byte[this.field733];
        for (int var3 = 0; var3 < this.field733; var3++) {
            var2.field743[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Ldc;")
    public final class37 method319(int arg0, int arg1) {
        field776++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field740) {
            this.field753 = 0;
            if (this.field743.length == this.field733) {
                int var3;
                for (var3 = 1; var3 <= this.field733; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class4.method35(this.field743, 0, var4, 0, this.field733);
                this.field743 = var4;
            }
            if (arg1 > -8) {
                return null;
            } else {
                this.field743[this.field733++] = (byte) arg0;
                return this;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ldc;B)Ldc;")
    public final class37 method320(class37 arg0, byte arg1) {
        field728++;
        if (!this.field740) {
            throw new IllegalArgumentException();
        }
        if (arg1 <= 94) {
            field787 = -105;
        }
        this.field753 = 0;
        if (this.field743.length < this.field733 + arg0.field733) {
            int var3;
            for (var3 = 1; var3 < this.field733 + arg0.field733; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class4.method35(this.field743, 0, var4, 0, this.field733);
            this.field743 = var4;
        }
        class4.method35(arg0.field743, 0, this.field743, this.field733, arg0.field733);
        this.field733 += arg0.field733;
        return this;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public final void method321(int arg0) {
        String var2;
        try {
            if (arg0 >= -103) {
                field789 = null;
            }
            var2 = new String(this.field743, 0, this.field733, "ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var2 = new String(this.field743, 0, this.field733);
        }
        field765++;
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(BI)I")
    public final int method322(byte arg0, int arg1) {
        if (arg0 != -22) {
            this.method305(false);
        }
        field774++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field733; var6++) {
            int var7 = this.field743[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (arg1 <= var7) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var5 = var8;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lwd;")
    public static final class241 method323(Throwable arg0, String arg1) {
        field760++;
        class241 var2;
        if (arg0 instanceof class241) {
            var2 = (class241) arg0;
            var2.field4421 = var2.field4421 + ' ' + arg1;
        } else {
            var2 = new class241(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILdc;)I")
    public final int method324(int arg0, int arg1, class37 arg2) {
        field769++;
        int[] var4 = new int[arg2.field733];
        int[] var5 = new int[256];
        int[] var6 = new int[arg2.field733];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg2.field733;
        }
        for (int var8 = 1; var8 <= arg2.field733; var8++) {
            var4[var8 - 1] = (arg2.field733 << 1) - var8;
            var5[class58.method449(255, arg2.field743[var8 - 1])] = arg2.field733 - var8;
        }
        int var9 = arg2.field733 + 1;
        int var10 = arg2.field733;
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (var9 <= arg2.field733 && arg2.field743[var10 - 1] != arg2.field743[var9 - 1]) {
                if (arg2.field733 - var10 <= var4[var9 + -1]) {
                    var4[var9 - 1] = arg2.field733 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = 1;
        int var12 = var9;
        int var13 = arg2.field733 + 1 - var9;
        int var14 = 0;
        for (int var15 = 1; var15 <= var13; var15++) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg2.field743[var14 - 1] != arg2.field743[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var14++;
        }
        if (arg0 > -5) {
            return 78;
        }
        while (var12 < arg2.field733) {
            for (int var18 = var11; var18 <= var12; var18++) {
                if (arg2.field733 + var12 - var18 <= var4[var18 + -1]) {
                    var4[var18 - 1] = var12 + arg2.field733 - var18;
                }
            }
            var11 = var12 + 1;
            var12 = var12 + var13 - var6[var13 - 1];
            var13 = var6[var13 - 1];
        }
        int var17;
        for (int var16 = arg2.field733 + arg1 - 1; var16 < this.field733; var16 += Math.max(var5[this.field743[var16] & 0xFF], var4[var17])) {
            for (var17 = arg2.field733 - 1; var17 >= 0 && this.field743[var16] == arg2.field743[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(Ldc;I)Z")
    public final boolean method325(class37 arg0, int arg1) {
        field778++;
        if (this.field733 < arg0.field733) {
            return false;
        }
        int var3 = this.field733 - arg0.field733;
        for (int var4 = arg1; var4 < arg0.field733; var4++) {
            if (this.field743[var3 + var4] != arg0.field743[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)Z")
    private final boolean method326(int arg0, int arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var3 = 40 / ((arg1 - 59) / 46);
        field749++;
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        for (int var7 = 0; var7 < this.field733; var7++) {
            int var8 = this.field743[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var5 = true;
                    continue;
                }
                if (var8 == 43) {
                    continue;
                }
            }
            if (var8 >= 48 && var8 <= 57) {
                var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
                var8 -= 55;
            } else if (var8 >= 97 && var8 <= 122) {
                var8 -= 87;
            } else {
                return false;
            }
            if (arg0 <= var8) {
                return false;
            }
            if (var5) {
                var8 = -var8;
            }
            int var9 = arg0 * var6 + var8;
            if (var9 / arg0 != var6) {
                return false;
            }
            var4 = true;
            var6 = var9;
        }
        return var4;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method327(int arg0, int arg1, Graphics arg2, int arg3) {
        field747++;
        String var5;
        try {
            var5 = new String(this.field743, 0, this.field733, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field743, 0, this.field733);
        }
        arg2.drawString(var5, arg3, arg0);
        if (arg1 != 22218) {
            field738 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)Ldc;")
    public final class37 method328(int arg0, int arg1) {
        field746++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class37 var3 = new class37();
        var3.field743 = new byte[this.field733 + 1];
        var3.field733 = this.field733 + 1;
        class4.method35(this.field743, 0, var3.field743, 0, this.field733);
        int var4 = 21 % ((arg0 + 69) / 39);
        var3.field743[this.field733] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(BI)I")
    public final int method329(byte arg0, int arg1) {
        if (arg0 <= 87) {
            this.method303(null, -12);
        }
        field735++;
        return this.field743[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(Ldc;I)I")
    public final int method330(class37 arg0, int arg1) {
        field767++;
        int var3;
        if (arg0.field733 < this.field733) {
            var3 = arg0.field733;
        } else {
            var3 = this.field733;
        }
        if (arg1 != -224) {
            field783 = null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class112.field2008[this.field743[var4] & 0xFF] < class112.field2008[arg0.field743[var4] & 0xFF]) {
                return -1;
            }
            if (class112.field2008[arg0.field743[var4] & 0xFF] < class112.field2008[this.field743[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg0.field733 > this.field733) {
            return -1;
        } else if (arg0.field733 < this.field733) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)[Ldc;")
    public final class37[] method331(boolean arg0, int arg1) {
        field739++;
        int var3 = 0;
        int var4 = 0;
        if (arg0) {
            field786 = null;
        }
        while (this.field733 > var4) {
            if (this.field743[var4] == arg1) {
                var3++;
            }
            var4++;
        }
        class37[] var5 = new class37[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field743[var7 + var9] != arg1; var9++) {
            }
            var5[var6++] = this.method311(var7 + var9, var7, !arg0);
            var7 += var9 + 1;
        }
        var5[var3] = this.method311(this.field733, var7, !arg0);
        return var5;
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)Ldc;")
    public final class37 method332(int arg0) {
        field742++;
        int var2 = 0;
        int var3 = this.field733;
        while (this.field733 > var2 && (this.field743[var2] >= 0 && this.field743[var2] <= 32 || (this.field743[var2] & 0xFF) == 160)) {
            var2++;
        }
        while (var2 < var3 && (this.field743[var3 - 1] >= 0 && this.field743[var3 - 1] <= 32 || (this.field743[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (var2 == 0 && this.field733 == var3) {
            return this;
        }
        if (arg0 <= 37) {
            this.method334(-27);
        }
        class37 var4 = new class37();
        var4.field733 = var3 - var2;
        var4.field743 = new byte[var4.field733];
        for (int var5 = 0; var5 < var4.field733; var5++) {
            var4.field743[var5] = this.field743[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(Z)Z")
    public final boolean method333(boolean arg0) {
        if (arg0) {
            field738 = null;
        }
        field737++;
        return this.method326(10, -59);
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)I")
    public final int method334(int arg0) {
        field763++;
        if (arg0 != -61) {
            this.method334(7);
        }
        return this.field733;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(ILjava/applet/Applet;)Ldc;")
    public final class37 method335(int arg0, Applet arg1) {
        field759++;
        String var3 = new String(this.field743, 0, this.field733);
        if (arg0 != -15988) {
            method323(null, null);
        }
        String var4 = arg1.getParameter(var3);
        return var4 == null ? null : class18.method126(var4, (byte) -94);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILdc;)I")
    public final int method336(int arg0, class37 arg1) {
        if (arg0 < 14) {
            field738 = null;
        }
        field758++;
        return this.method324(-108, 0, arg1);
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)J")
    private final long method337(int arg0) {
        if (arg0 != 17005) {
            this.field743 = null;
        }
        field731++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field733; var4++) {
            var2 = (var2 << 5) + (long) (this.field743[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "(I)Ldc;")
    public final class37 method338(int arg0) {
        long var2 = this.method337(17005);
        field781++;
        synchronized (field790 == null ? (field790 = method348("dc")) : field790) {
            if (class85.field1506 == null) {
                class85.field1506 = new class153(4096);
            } else {
                for (class222 var5 = (class222) class85.field1506.method1047((byte) 108, var2); var5 != null; var5 = (class222) class85.field1506.method1045(-27)) {
                    if (this.method346(var5.field4122, (byte) -49)) {
                        return var5.field4122;
                    }
                }
            }
            class222 var7 = new class222();
            var7.field4122 = this;
            this.field740 = false;
            class85.field1506.method1044(var7, (byte) -14, var2);
        }
        if (arg0 <= 87) {
            field789 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Ldc;B)Z")
    public final boolean method339(class37 arg0, byte arg1) {
        if (arg1 >= -59) {
            return true;
        }
        field730++;
        if (arg0.field733 > this.field733) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field733; var3++) {
            if (this.field743[var3] != arg0.field743[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)Ldc;")
    public final class37 method340(int arg0, int arg1, int arg2) {
        field745++;
        byte var4 = (byte) arg1;
        byte var5 = (byte) arg0;
        class37 var6 = new class37();
        var6.field733 = this.field733;
        var6.field743 = new byte[this.field733];
        for (int var7 = arg2; var7 < this.field733; var7++) {
            byte var8 = this.field743[var7];
            if (var4 == var8) {
                var6.field743[var7] = var5;
            } else {
                var6.field743[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!dc", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field761++;
        return this.method309(255);
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(B)Ldc;")
    public final class37 method341(byte arg0) {
        field782++;
        if (!this.field740) {
            throw new IllegalArgumentException();
        }
        this.field753 = 0;
        if (this.field743.length != this.field733) {
            byte[] var2 = new byte[this.field733];
            class4.method35(this.field743, 0, var2, 0, this.field733);
            this.field743 = var2;
        }
        return arg0 == -11 ? this : null;
    }

    @OriginalMember(owner = "client!dc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field734++;
        if (!(arg0 instanceof class37)) {
            throw new IllegalArgumentException();
        }
        return this.method346((class37) arg0, (byte) -49);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BII)I")
    public final int method342(byte arg0, int arg1, int arg2) {
        field773++;
        byte var4 = (byte) arg2;
        for (int var5 = arg1; var5 < this.field733; var5++) {
            if (this.field743[var5] == var4) {
                return var5;
            }
        }
        int var6 = -74 / ((arg0 - 75) / 48);
        return -1;
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(B)V")
    public static void method343(byte arg0) {
        field738 = null;
        field783 = null;
        field786 = null;
        field788 = null;
        if (arg0 > 78) {
            field785 = null;
            field789 = null;
            field784 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;")
    public final URL method344(URL arg0, int arg1) throws MalformedURLException {
        field768++;
        return arg1 > -19 ? null : new URL(arg0, new String(this.field743, 0, this.field733));
    }

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "(I)I")
    public static final int method345(int arg0) {
        field756++;
        return arg0 == -157 ? class94.field1643 : -8;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(Ldc;B)Z")
    public final boolean method346(class37 arg0, byte arg1) {
        field732++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 != -49) {
            this.equals(null);
        }
        if (this.field733 != arg0.field733) {
            return false;
        }
        if (!this.field740 || !arg0.field740) {
            if (this.field753 == 0) {
                this.field753 = this.method309(arg1 ^ 0xFFFFFF30);
                if (this.field753 == 0) {
                    this.field753 = 1;
                }
            }
            if (arg0.field753 == 0) {
                arg0.field753 = arg0.method309(255);
                if (arg0.field753 == 0) {
                    arg0.field753 = 1;
                }
            }
            if (this.field753 != arg0.field753) {
                return false;
            }
        }
        for (int var3 = 0; var3 < this.field733; var3++) {
            if (this.field743[var3] != arg0.field743[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "(I)J")
    public final long method347(int arg0) {
        field764++;
        int var2 = 121 % ((arg0 - 17) / 39);
        long var3 = 0L;
        for (int var5 = 0; var5 < this.field733 && var5 < 12; var5++) {
            var3 *= 37L;
            byte var6 = this.field743[var5];
            if (var6 >= 65 && var6 <= 90) {
                var3 += var6 + 1 - 65;
            } else if (var6 >= 97 && var6 <= 122) {
                var3 += var6 + 1 - 97;
            } else if (var6 >= 48 && var6 <= 57) {
                var3 += var6 - 21;
            }
        }
        while (var3 % 37L == 0L && var3 != 0L) {
            var3 /= 37L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field772++;
        throw new RuntimeException();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method348(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
