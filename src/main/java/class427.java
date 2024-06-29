import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class427 extends class5 {

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    private int field5929 = 0;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    private int field5936 = 0;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    private int field5933 = -1;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    private int field5938 = -32768;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "Z")
    public boolean field5935 = false;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    public int field5924;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    private int field5928;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "Li;")
    private class83 field5941;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5942 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "Lrs;")
    private class240 field5930;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "[I")
    public static int[] field5944;

    static {
        new class368("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)Z", line = 3)
    public final boolean method697(int arg0) {
        ++field5927;
        return arg0 < 115;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 15)
    public static void method2627(int arg0) {
        field5944 = null;
        int var1 = -54 % ((arg0 - -51) / 60);
        field5942 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)Ljq;", line = 26)
    public static final class185 method2628(int arg0, int arg1, int arg2, int arg3) {
        ++field5931;
        class63 var4 = class341.field4617[arg0][arg2][arg3];
        if (var4 == null) {
            return null;
        } else {
            class185 var5 = null;
            int var6 = -1;
            if (arg1 > -76) {
                return null;
            } else {
                for (class48 var7 = var4.field853; var7 != null; var7 = var7.field608) {
                    class5 var8 = var7.field617;
                    if (var8 instanceof class185) {
                        class185 var9 = (class185) var8;
                        int var10 = 60 + (var9.method1285(-89) + -1) * 64;
                        int var11 = -var10 + var9.field40 >> 7;
                        int var12 = -var10 + var9.field44 >> 7;
                        int var13 = var9.field40 + var10 >> 7;
                        int var14 = var9.field44 - -var10 >> 7;
                        if (~arg2 <= ~var11 && var12 <= arg3 && ~var13 <= ~arg2 && ~arg3 >= ~var14) {
                            int var15 = (var14 - (-1 - -arg3)) * (var13 + 1 - arg2);
                            if (~var6 > ~var15) {
                                var5 = var9;
                                var6 = var15;
                            }
                        }
                    }
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lea;I)V", line = 85)
    public final void method707(class58 arg0, int arg1) {
        ++field5923;
        class116 var3 = this.method2631(arg0, (byte) -119, 0);
        if (var3 != null) {
            this.method2629(-1, var3, arg0);
        }
        if (arg1 >= -99) {
            this.field5929 = 79;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILts;Lea;)V", line = 103)
    private final void method2629(int arg0, class116 arg1, class58 arg2) {
        ++field5926;
        if (arg0 != -1) {
            this.field5933 = -24;
        }
        class217[] var4 = arg1.method879();
        class138[] var5 = arg1.method892();
        if ((this.field5930 == null || this.field5930.field3390) && (var4 != null || var5 != null)) {
            this.field5930 = new class240(class246.field3467);
        }
        if (this.field5930 != null) {
            this.field5930.method1560(arg2, (long) class246.field3467, var4, var5, false);
            this.field5930.method1556(super.field42, super.field52, super.field47, super.field55, super.field41);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(ILea;)Lms;", line = 131)
    public final class450 method696(int arg0, class58 arg1) {
        ++field5932;
        class116 var3 = this.method2631(arg1, (byte) -118, 1024);
        if (var3 == null) {
            return null;
        } else {
            class309 var4 = arg1.method210();
            var4.method1866(super.field40, super.field45, super.field44);
            if (arg0 != 0) {
                return null;
            } else {
                if (this.field5930 == null) {
                    var3.method896(var4, (class153) null, 0);
                } else {
                    class174 var5 = this.field5930.method1552();
                    arg1.method172(var3, var5, var4, (class153) null, 0);
                }
                this.field5938 = var3.method889();
                this.method2629(-1, var3, arg1);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V", line = 161)
    public final void method2630(byte arg0) {
        if (this.field5930 != null) {
            this.field5930.method1554();
        }
        int var2 = 121 % ((47 - arg0) / 50);
        ++field5922;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 253)
    public class427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field5924 = arg1 + arg2;
        this.field5928 = arg0;
        int var12 = class186.method1296(this.field5928, false).field4648;
        if (~var12 != 0) {
            this.field5935 = false;
            this.field5941 = class408.method2521((byte) 26, var12);
        } else {
            this.field5935 = true;
        }
        if (this.field5924 == arg2) {
            class431.method2657(this.field5941, -63, super.field40, false, this.field5929, super.field44);
        }
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)I", line = 181)
    public final int method23(int arg0) {
        ++field5939;
        return arg0 > -84 ? 18 : this.field5938;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lea;BI)Lts;", line = 192)
    private final class116 method2631(class58 arg0, byte arg1, int arg2) {
        ++field5921;
        class344 var4 = class186.method1296(this.field5928, false);
        int var5 = 85 / ((-42 - arg1) / 42);
        return this.field5935 ? var4.method2088(-1, -1, (byte) 55, arg0, arg2, 0) : var4.method2088(this.field5929, this.field5933, (byte) 55, arg0, arg2, this.field5936);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZILea;I)Z", line = 206)
    public final boolean method710(boolean arg0, int arg1, class58 arg2, int arg3) {
        if (!arg0) {
            this.field5938 = -73;
        }
        ++field5934;
        return false;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 220)
    public final void method702(byte arg0) {
        if (arg0 != 46) {
            this.field5941 = null;
        }
        ++field5940;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/String;)I", line = 231)
    public static final int method2632(int arg0, String arg1) {
        ++field5920;
        int var2 = arg1.length();
        if (arg0 != 60) {
            field5942 = null;
        }
        int var3 = 0;
        for (int var4 = 0; var2 > var4; ++var4) {
            var3 = (var3 << 5) + -var3 + class311.method1888((byte) 70, arg1.charAt(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "finalize", descriptor = "()V", line = 290)
    protected final void finalize() {
        if (this.field5930 != null) {
            this.field5930.method1554();
        }
        ++field5943;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V", line = 303)
    public final void method2633(int arg0, int arg1) {
        ++field5937;
        if (!this.field5935) {
            if (arg0 == 0) {
                this.field5936 += arg1;
                while (this.field5936 > this.field5941.field1144[this.field5929]) {
                    this.field5936 -= this.field5941.field1144[this.field5929];
                    ++this.field5929;
                    if (this.field5929 >= this.field5941.field1145.length) {
                        this.field5935 = true;
                        break;
                    }
                }
                if (!this.field5935) {
                    class431.method2657(this.field5941, -63, super.field40, false, this.field5929, super.field44);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILea;Lac;ZII)V", line = 334)
    public final void method699(int arg0, int arg1, class58 arg2, class216 arg3, boolean arg4, int arg5, int arg6) {
        ++field5925;
        if (arg0 == 22546) {
            throw new IllegalStateException();
        }
    }
}
