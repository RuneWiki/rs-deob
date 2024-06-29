import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class46 implements class191 {

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "Z")
    private boolean field789 = true;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field764 = 0;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Lha;")
    private static class46 field766 = class271.method1828("wave:", -46);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "Z")
    public static boolean field786 = false;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "Lha;")
    public static class46 field787 = field766;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "Lha;")
    public static class46 field791 = field766;

    @OriginalMember(owner = "client!ha", name = "fb", descriptor = "Z")
    public static boolean field809 = true;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
    private int field794;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!ha", name = "ab", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!ha", name = "bb", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!ha", name = "cb", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!ha", name = "eb", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!ha", name = "hb", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!ha", name = "ib", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!ha", name = "jb", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ha", name = "kb", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!ha", name = "lb", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!ha", name = "mb", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!ha", name = "gb", descriptor = "Lge;")
    private static class235 field810;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ha", name = "nb", descriptor = "Ljava/lang/Class;")
    public static Class field817;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "[B")
    public byte[] field768;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[Lhh;")
    public static class263[] field754;

    @OriginalMember(owner = "client!ha", name = "db", descriptor = "[[[B")
    public static byte[][][] field807;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Lha;")
    public final class46 method303(int arg0) {
        field759++;
        int var2;
        for (var2 = 0; this.field762 > var2 && (this.field768[var2] >= 0 && this.field768[var2] <= 32 || (this.field768[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field762; var3 > var2 && (this.field768[var3 - 1] >= 0 && this.field768[var3 - 1] <= 32 || (this.field768[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (arg0 == var2 && this.field762 == var3) {
            return this;
        }
        class46 var4 = new class46();
        var4.field762 = var3 - var2;
        var4.field768 = new byte[var4.field762];
        for (int var5 = 0; var5 < var4.field762; var5++) {
            var4.field768[var5] = this.field768[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILha;)Z")
    public final boolean method304(int arg0, class46 arg1) {
        if (arg0 != 113) {
            this.field794 = -111;
        }
        field806++;
        if (this.field762 < arg1.field762) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field762; var3++) {
            if (this.field768[var3] != arg1.field768[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)Lha;")
    public final class46 method305(int arg0) {
        class46 var2 = new class46();
        var2.field762 = this.field762;
        field767++;
        int var3 = -75 / ((arg0 - 46) / 60);
        var2.field768 = new byte[this.field762];
        for (int var4 = 0; var4 < this.field762; var4++) {
            byte var5 = this.field768[var4];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            var2.field768[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)Lha;")
    public final class46 method306(boolean arg0) {
        field796++;
        boolean var2 = arg0;
        class46 var3 = new class46();
        var3.field762 = this.field762;
        var3.field768 = new byte[this.field762];
        for (int var4 = 0; var4 < this.field762; var4++) {
            byte var5 = this.field768[var4];
            if (var5 == 95) {
                var3.field768[var4] = 32;
                var2 = true;
            } else if (var5 >= 97 && var5 <= 122 && var2) {
                var3.field768[var4] = (byte) (var5 - 32);
                var2 = false;
            } else {
                var3.field768[var4] = var5;
                var2 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)I")
    public final int method307(byte arg0, int arg1) {
        if (arg0 < 23) {
            this.field762 = 69;
        }
        byte var3 = (byte) arg1;
        field765++;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field762; var5++) {
            if (this.field768[var5] == var3) {
                var4++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III[BI)I")
    public final int method308(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        if (arg1 != 0) {
            this.method325(5, (byte) -48);
        }
        field756++;
        class104.method782(this.field768, arg4, arg3, arg2, arg0 - arg4);
        return arg0 - arg4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/applet/Applet;I)V")
    public final void method309(Applet arg0, int arg1) throws Throwable {
        if (arg1 == -4) {
            field753++;
            String var3 = new String(this.field768, 0, this.field762);
            class94.method739((byte) -79, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBI)V")
    public static final void method310(int arg0, int arg1, byte arg2, int arg3) {
        field798++;
        class24 var4 = class108.method841(arg1, arg0, -1);
        if (var4 != null && var4.field433 != null) {
            class275 var5 = new class275();
            var5.field4792 = var4;
            var5.field4796 = var4.field433;
            class215.method1509(var5, 70);
        }
        class187.field3339 = true;
        class275.field4793 = arg0;
        if (arg2 >= -118) {
            field754 = null;
        }
        class248.field4382 = arg3;
        class194.field3477 = arg1;
        class226.method1549(false, var4);
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)[B")
    public final byte[] method311(int arg0) {
        field805++;
        byte[] var2 = new byte[this.field762];
        class104.method782(this.field768, arg0, var2, 0, this.field762);
        return var2;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)Lha;")
    public final class46 method312(int arg0) {
        field774++;
        byte var2 = 2;
        class46 var3 = new class46();
        var3.field762 = this.field762;
        var3.field768 = new byte[this.field762];
        for (int var4 = 0; var4 < this.field762; var4++) {
            byte var5 = this.field768[var4];
            if (!(var5 < 97 || var5 > 122) || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var2 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var2 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var2 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var2 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var2 = 2;
            } else if (var5 != 32) {
                var2 = 1;
            } else if (var2 != 2) {
                var2 = 1;
            }
            var3.field768[var4] = var5;
        }
        if (arg0 != -9211) {
            this.method316(true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZIILha;)Lha;")
    public final class46 method313(boolean arg0, int arg1, int arg2, class46 arg3) {
        field769++;
        if (arg0) {
            this.method342((class46) null, -54);
        }
        if (!this.field789) {
            throw new IllegalArgumentException();
        } else if (arg1 >= 0 && arg2 >= arg1 && arg2 <= arg3.field762) {
            this.field794 = 0;
            if (this.field768.length < this.field762 + arg2 - arg1) {
                int var5;
                for (var5 = 1; var5 < this.field762 + arg3.field762; var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class104.method782(this.field768, 0, var6, 0, this.field762);
                this.field768 = var6;
            }
            class104.method782(arg3.field768, arg1, this.field768, this.field762, arg2 - arg1);
            this.field762 += arg2 - arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ha", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field755++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)I")
    public final int method314(int arg0) {
        field779++;
        if (arg0 < 7) {
            this.method348((class46) null, -58);
        }
        return this.field762;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLha;)Z")
    public final boolean method315(byte arg0, class46 arg1) {
        field803++;
        if (arg0 != -38) {
            return true;
        } else if (arg1 == null) {
            return false;
        } else if (this.field762 == arg1.field762) {
            for (int var3 = 0; var3 < this.field762; var3++) {
                byte var4 = this.field768[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg1.field768[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)I")
    public final int method316(boolean arg0) {
        int var2 = 0;
        if (!arg0) {
            return 65;
        }
        for (int var3 = 0; var3 < this.field762; var3++) {
            var2 = (var2 << 5) + (this.field768[var3] & 0xFF) - var2;
        }
        field813++;
        return var2;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/applet/Applet;I)Lha;")
    public final class46 method317(Applet arg0, int arg1) {
        String var3 = new String(this.field768, 0, this.field762);
        field815++;
        int var4 = 30 / ((74 - arg1) / 36);
        String var5 = arg0.getParameter(var3);
        return var5 == null ? null : class174.method1253(var5, (byte) -33);
    }

    @OriginalMember(owner = "client!ha", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field757++;
        if (!arg0 instanceof class46) {
            throw new IllegalArgumentException();
        }
        return this.method340((byte) 119, (class46) arg0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)I")
    public final int method318(int arg0, byte arg1) {
        field785++;
        int var3 = -33 / ((-arg1 - 16) / 34);
        return this.field768[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(BI)I")
    public final int method319(byte arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        if (arg0 != -18) {
            this.method349((byte) -115);
        }
        field800++;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field762; var6++) {
            int var7 = this.field768[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var4 = true;
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
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var3 = true;
            var5 = var8;
        }
        if (!var3) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)Lha;")
    public final class46 method320(boolean arg0) {
        field770++;
        long var2 = this.method327(-84);
        synchronized (field817 == null ? (field817 = method352("ha")) : field817) {
            if (field810 == null) {
                field810 = new class235(4096);
            } else {
                for (class124 var5 = (class124) field810.method1601(118, var2); var5 != null; var5 = (class124) field810.method1593((byte) 111)) {
                    if (this.method340((byte) 103, var5.field2289)) {
                        return var5.field2289;
                    }
                }
            }
            class124 var7 = new class124();
            if (arg0) {
                var7.field2289 = this;
                this.field789 = false;
                field810.method1597(var2, (byte) -126, var7);
                return this;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/applet/Applet;)Ljava/lang/Object;")
    public final Object method321(int arg0, Applet arg1) throws Throwable {
        field799++;
        String var3 = new String(this.field768, arg0, this.field762);
        Object var4 = class94.method738(var3, -14489, (Object[]) null, arg1);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class177.method1265(0, var5.length, var5, 54);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)I")
    public final int method322(int arg0, int arg1, int arg2) {
        field802++;
        byte var4 = (byte) arg1;
        int var5 = arg2;
        if (arg0 != -1) {
            this.method313(false, 83, -76, (class46) null);
        }
        while (this.field762 > var5) {
            if (this.field768[var5] == var4) {
                return var5;
            }
            var5++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)Ljava/net/URL;")
    public final URL method323(int arg0) throws MalformedURLException {
        field780++;
        int var2 = 111 / ((arg0 - 83) / 38);
        return new URL(new String(this.field768, 0, this.field762));
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILha;Lha;)Lha;")
    public final class46 method324(int arg0, class46 arg1, class46 arg2) {
        field795++;
        int var4 = this.field762;
        int var5 = arg1.field762 - arg2.field762;
        int var6 = 0;
        while (true) {
            int var7 = this.method336((byte) -41, var6, arg2);
            if (var7 < 0) {
                int var8 = arg0;
                class46 var9 = class181.method1305(25127, var4);
                while (true) {
                    int var10 = this.method336((byte) -41, var8, arg2);
                    if (var10 < 0) {
                        while (this.field762 > var8) {
                            var9.method351(arg0 - 121, this.field768[var8++] & 0xFF);
                        }
                        return var9;
                    }
                    while (var8 < var10) {
                        var9.method351(arg0 + 116, this.field768[var8++] & 0xFF);
                    }
                    var9.method348(arg1, -111);
                    var8 += arg2.field762;
                }
            }
            var4 += var5;
            var6 = arg2.field762 + var7;
        }
    }

    @OriginalMember(owner = "client!ha", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field784++;
        return this.method316(true);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IB)V")
    public final void method325(int arg0, byte arg1) {
        field783++;
        this.field794 = 0;
        if (!this.field789) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg1 < 62) {
                this.field762 = 9;
            }
            if (arg0 > this.field768.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class104.method782(this.field768, 0, var4, 0, this.field762);
                this.field768 = var4;
            }
            for (int var5 = this.field762; var5 < arg0; var5++) {
                this.field768[var5] = 32;
            }
            this.field762 = arg0;
        }
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)Z")
    public final boolean method326(int arg0) {
        field776++;
        if (arg0 != -28094) {
            field791 = null;
        }
        return this.method344(99, 10);
    }

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)J")
    public final long method327(int arg0) {
        long var2 = 0L;
        field790++;
        if (arg0 >= -66) {
            this.method314(-62);
        }
        for (int var4 = 0; var4 < this.field762; var4++) {
            var2 = (var2 << 5) - (var2 - ((long) (this.field768[var4] & 0xFF)));
        }
        return var2;
    }

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)Lha;")
    public final class46 method328(int arg0) {
        field760++;
        if (arg0 > -61) {
            this.field768 = null;
        }
        class46 var2 = class277.method1862((byte) -64, this.method349((byte) 59));
        return var2 == null ? class43.field727 : var2;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(ILha;)Z")
    public final boolean method329(int arg0, class46 arg1) {
        field811++;
        if (arg1.field762 > this.field762) {
            return false;
        }
        int var3 = 0;
        if (arg0 != -30835) {
            field766 = null;
        }
        while (arg1.field762 > var3) {
            byte var4 = this.field768[var3];
            byte var5 = arg1.field768[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
            var3++;
        }
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)I")
    public final int method330(int arg0) {
        field808++;
        if (arg0 <= 28) {
            field809 = false;
        }
        return this.method319((byte) -18, 10);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)Lha;")
    public final class46 method331(byte arg0) {
        if (arg0 != -3) {
            this.field768 = null;
        }
        field814++;
        class46 var2 = new class46();
        var2.field762 = this.field762;
        var2.field768 = new byte[var2.field762];
        for (int var3 = 0; var3 < this.field762; var3++) {
            var2.field768[this.field762 - (var3 + 1)] = this.field768[var3];
        }
        return var2;
    }

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "(I)V")
    public final void method332(int arg0) {
        field752++;
        String var2;
        try {
            var2 = new String(this.field768, arg0, this.field762, "ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var2 = new String(this.field768, 0, this.field762);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lha;B)I")
    public final int method333(class46 arg0, byte arg1) {
        field801++;
        if (arg1 < 0) {
            field807 = null;
        }
        int var3;
        if (arg0.field762 < this.field762) {
            var3 = arg0.field762;
        } else {
            var3 = this.field762;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field768[var4] & 0xFF) > (this.field768[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field768[var4] & 0xFF) < (this.field768[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field762 < arg0.field762) {
            return -1;
        } else if (this.field762 > arg0.field762) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(BI)[Lha;")
    public final class46[] method334(byte arg0, int arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < this.field762; var4++) {
            if (this.field768[var4] == arg1) {
                var3++;
            }
        }
        field773++;
        class46[] var5 = new class46[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 119 / ((arg0 + 73) / 44);
        int var8 = 0;
        for (int var9 = 0; var9 < var3; var9++) {
            int var10;
            for (var10 = 0; this.field768[var8 + var10] != arg1; var10++) {
            }
            var5[var6++] = this.method338(19551, var8 + var10, var8);
            var8 += var10 + 1;
        }
        var5[var3] = this.method338(19551, this.field762, var8);
        return var5;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method335(int arg0, int arg1, int arg2, Graphics arg3) {
        field771++;
        String var5;
        try {
            var5 = new String(this.field768, arg2, this.field762, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field768, 0, this.field762);
        }
        arg3.drawString(var5, arg1, arg0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BILha;)I")
    public final int method336(byte arg0, int arg1, class46 arg2) {
        if (arg0 != -41) {
            return 112;
        }
        field804++;
        int[] var4 = new int[arg2.field762];
        int[] var5 = new int[256];
        int[] var6 = new int[arg2.field762];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg2.field762;
        }
        for (int var8 = 1; var8 <= arg2.field762; var8++) {
            var4[var8 - 1] = (arg2.field762 << 1) - var8;
            var5[class50.method369(255, arg2.field768[var8 - 1])] = arg2.field762 - var8;
        }
        int var9 = arg2.field762 + 1;
        int var10 = arg2.field762;
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (arg2.field762 >= var9 && arg2.field768[var9 - 1] != arg2.field768[var10 - 1]) {
                if (arg2.field762 - var10 <= var4[var9 - 1]) {
                    var4[var9 - 1] = arg2.field762 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = 1;
        int var13 = arg2.field762 + 1 - var9;
        int var14 = 0;
        for (int var15 = 1; var15 <= var13; var15++) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg2.field768[var14 - 1] != arg2.field768[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var14++;
        }
        while (var11 < arg2.field762) {
            for (int var18 = var12; var18 <= var11; var18++) {
                if (var4[var18 - 1] >= var11 + arg2.field762 - var18) {
                    var4[var18 - 1] = arg2.field762 + var11 - var18;
                }
            }
            var12 = var11 + 1;
            var11 = var11 + var13 - var6[var13 - 1];
            var13 = var6[var13 - 1];
        }
        int var17;
        for (int var16 = arg2.field762 + arg1 - 1; var16 < this.field762; var16 += Math.max(var5[this.field768[var16] & 0xFF], var4[var17])) {
            for (var17 = arg2.field762 - 1; var17 >= 0 && this.field768[var16] == arg2.field768[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/net/URL;)Ljava/net/URL;")
    public final URL method337(int arg0, URL arg1) throws MalformedURLException {
        field812++;
        if (arg0 != 0) {
            this.method306(false);
        }
        return new URL(arg1, new String(this.field768, 0, this.field762));
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(III)Lha;")
    public final class46 method338(int arg0, int arg1, int arg2) {
        field788++;
        class46 var4 = new class46();
        var4.field762 = arg1 - arg2;
        var4.field768 = new byte[arg1 - arg2];
        if (arg0 != 19551) {
            this.method328(62);
        }
        class104.method782(this.field768, arg2, var4.field768, 0, var4.field762);
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lha;")
    public final class46 method339(int arg0, int arg1) {
        int var3 = 118 % ((arg1 + 39) / 52);
        field761++;
        return this.method338(19551, this.field762, arg0);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(BLha;)Z")
    public final boolean method340(byte arg0, class46 arg1) {
        field797++;
        if (arg1 == null) {
            return false;
        } else if (this.field762 == arg1.field762) {
            if (!this.field789 || !arg1.field789) {
                if (this.field794 == 0) {
                    this.field794 = this.method316(true);
                    if (this.field794 == 0) {
                        this.field794 = 1;
                    }
                }
                if (arg1.field794 == 0) {
                    arg1.field794 = arg1.method316(true);
                    if (arg1.field794 == 0) {
                        arg1.field794 = 1;
                    }
                }
                if (this.field794 != arg1.field794) {
                    return false;
                }
            }
            int var3 = 0;
            if (arg0 <= 78) {
                this.method304(3, (class46) null);
            }
            while (this.field762 > var3) {
                if (this.field768[var3] != arg1.field768[var3]) {
                    return false;
                }
                var3++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(BLha;)I")
    public final int method341(byte arg0, class46 arg1) {
        field793++;
        int var3 = 0;
        int var4 = 0;
        int var5 = this.field762;
        int var6 = arg1.field762;
        int var7 = this.field762;
        int var8 = arg1.field762;
        if (arg0 >= -7) {
            this.field789 = false;
        }
        int var9 = 0;
        int var10 = 0;
        while (var5 != 0 && var6 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field768[var10] & 0xFF;
                var10++;
            }
            if (class240.method1648(true, var3)) {
                var7++;
            } else {
                var5--;
            }
            if (var4 == 156 || var4 == 230) {
                var4 = 101;
            } else if (var4 == 140 || var4 == 198) {
                var4 = 69;
            } else if (var4 == 223) {
                var4 = 115;
            } else {
                var4 = arg1.field768[var9] & 0xFF;
                var9++;
            }
            if (class240.method1648(true, var4)) {
                var8++;
            } else {
                var6--;
            }
            if (class120.field2246[var3] < class120.field2246[var4]) {
                return -1;
            }
            if (class120.field2246[var4] < class120.field2246[var3]) {
                return 1;
            }
        }
        if (var7 < var8) {
            return -1;
        } else if (var7 > var8) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lha;I)I")
    public final int method342(class46 arg0, int arg1) {
        field763++;
        if (arg1 != -6645) {
            this.method333((class46) null, (byte) 105);
        }
        return this.method336((byte) -41, 0, arg0);
    }

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "(I)Lha;")
    public final class46 method343(int arg0) {
        if (arg0 <= 89) {
            return null;
        }
        field775++;
        if (!this.field789) {
            throw new IllegalArgumentException();
        }
        this.field794 = 0;
        if (this.field768.length != this.field762) {
            byte[] var2 = new byte[this.field762];
            class104.method782(this.field768, 0, var2, 0, this.field762);
            this.field768 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)Z")
    private final boolean method344(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field758++;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        int var6 = 106 % ((arg0 + 65) / 43);
        for (int var7 = 0; var7 < this.field762; var7++) {
            int var8 = this.field768[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var3 = true;
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
            if (arg1 <= var8) {
                return false;
            }
            if (var3) {
                var8 = -var8;
            }
            int var9 = arg1 * var5 + var8;
            if ((var9 / arg1) != var5) {
                return false;
            }
            var4 = true;
            var5 = var9;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(BI)Lha;")
    public final class46 method345(byte arg0, int arg1) {
        field816++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class46 var3 = new class46();
        var3.field768 = new byte[this.field762 + 1];
        var3.field762 = this.field762 + 1;
        class104.method782(this.field768, 0, var3.field768, 0, this.field762);
        var3.field768[this.field762] = (byte) arg1;
        if (arg0 != 107) {
            this.equals((Object) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLha;)Z")
    public final boolean method346(boolean arg0, class46 arg1) {
        field781++;
        if (this.field762 < arg1.field762) {
            return false;
        }
        int var3 = this.field762 - arg1.field762;
        for (int var4 = 0; var4 < arg1.field762; var4++) {
            if (this.field768[var3 + var4] != arg1.field768[var4]) {
                return false;
            }
        }
        if (!arg0) {
            field766 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
    public static void method347(byte arg0) {
        field810 = null;
        field766 = null;
        int var1 = -91 % ((47 - arg0) / 41);
        field791 = null;
        field787 = null;
        field754 = null;
        field807 = null;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Lha;I)Lha;")
    public final class46 method348(class46 arg0, int arg1) {
        field777++;
        if (!this.field789) {
            throw new IllegalArgumentException();
        }
        this.field794 = 0;
        if ((this.field762 + arg0.field762) > this.field768.length) {
            int var3;
            for (var3 = 1; var3 < (this.field762 + arg0.field762); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class104.method782(this.field768, 0, var4, 0, this.field762);
            this.field768 = var4;
        }
        if (arg1 >= -18) {
            field786 = false;
        }
        class104.method782(arg0.field768, 0, this.field768, this.field762, arg0.field762);
        this.field762 += arg0.field762;
        return this;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)J")
    public final long method349(byte arg0) {
        if (arg0 != 59) {
            return 58L;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field762 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field768[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 - 64);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 - 96);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        field778++;
        return var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/FontMetrics;Z)I")
    public final int method350(FontMetrics arg0, boolean arg1) {
        field792++;
        if (arg1) {
            return 122;
        }
        String var3;
        try {
            var3 = new String(this.field768, 0, this.field762, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field768, 0, this.field762);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Lha;")
    public final class46 method351(int arg0, int arg1) {
        field772++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        }
        int var3 = 64 % ((28 - arg0) / 61);
        if (!this.field789) {
            throw new IllegalArgumentException();
        }
        this.field794 = 0;
        if (this.field768.length == this.field762) {
            int var4;
            for (var4 = 1; var4 <= this.field762; var4 += var4) {
            }
            byte[] var5 = new byte[var4];
            class104.method782(this.field768, 0, var5, 0, this.field762);
            this.field768 = var5;
        }
        this.field768[this.field762++] = (byte) arg1;
        return this;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method352(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
