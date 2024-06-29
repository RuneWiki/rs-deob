import java.awt.Component;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class29 extends class420 {

    @OriginalMember(owner = "client!be", name = "y", descriptor = "[I")
    public static int[] field479;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "C")
    public char field471;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "J")
    public long field466;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Lbe;")
    public class29 field464;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "Z")
    public boolean field478;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "[[B")
    public static byte[][] field476;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)C")
    public final char method233(byte arg0) {
        field475++;
        int var2 = 124 % ((24 - arg0) / 38);
        return this.field471;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lci;II)I")
    public static final int method234(class312 arg0, int arg1, int arg2) {
        field468++;
        byte var3 = -1;
        if (arg2 <= 62) {
            field479 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLjava/awt/Component;)Loh;")
    public static final class278 method235(boolean arg0, Component arg1) {
        field467++;
        if (!arg0) {
            field476 = null;
        }
        return new class444(arg1);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(III)Z")
    public static final boolean method236(int arg0, int arg1, int arg2) {
        field473++;
        if (arg0 == -21367) {
            return (arg2 & 0x180) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILci;ILjava/lang/String;)Lmg;")
    public static final class100 method237(int arg0, class312 arg1, int arg2, String arg3) {
        if (arg2 != 9767) {
            return null;
        }
        field465++;
        if (arg0 == 0) {
            return arg1.method1971(arg3, -80);
        } else if (arg0 == 1) {
            try {
                class426.method2604((byte) 94, "openjs", arg1.field4458, new Object[] { (new URL(arg1.field4458.getCodeBase(), arg3)).toString() });
                class100 var4 = new class100();
                var4.field1604 = 1;
                return var4;
            } catch (Throwable var10) {
                class100 var5 = new class100();
                var5.field1604 = 2;
                return var5;
            }
        } else if (arg0 == 2) {
            try {
                arg1.field4458.getAppletContext().showDocument(new URL(arg1.field4458.getCodeBase(), arg3), "_blank");
                class100 var6 = new class100();
                var6.field1604 = 1;
                return var6;
            } catch (Exception var11) {
                class100 var7 = new class100();
                var7.field1604 = 2;
                return var7;
            }
        } else if (arg0 == 3) {
            try {
                class426.method2606("loggedout", arg1.field4458, 21615);
            } catch (Throwable var13) {
            }
            try {
                arg1.field4458.getAppletContext().showDocument(new URL(arg1.field4458.getCodeBase(), arg3), "_top");
                class100 var8 = new class100();
                var8.field1604 = 1;
                return var8;
            } catch (Exception var12) {
                class100 var9 = new class100();
                var9.field1604 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(B)Z")
    public final boolean method238(byte arg0) {
        if (arg0 == 94) {
            field470++;
            return this.field478;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I")
    public static int method239(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(III)Leb;")
    public static final class438 method240(int arg0, int arg1, int arg2) {
        class165 var3 = class36.field545[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class438 var4 = var3.field2489;
            var3.field2489 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(B)V")
    public static final void method241(byte arg0) {
        field477++;
        class14.field242.method458(((float) class397.field5830.field128 * 0.1F + 0.7F) * 1.1523438F);
        class14.field242.method520(class104.field1649, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        int var1 = 108 / ((arg0 + 19) / 60);
        class14.field242.method535(class478.field7017, -1, 256);
        class14.field242.method455(class389.field5757);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)J")
    public final long method242(boolean arg0) {
        field472++;
        if (!arg0) {
            this.method238((byte) 71);
        }
        return this.field466;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method243(int arg0) {
        field479 = null;
        if (arg0 != 0) {
            field479 = null;
        }
        field476 = null;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(B)I")
    public final int method244(byte arg0) {
        if (arg0 > -114) {
            this.method242(false);
        }
        field462++;
        return this.field463;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(B)I")
    public final int method245(byte arg0) {
        field480++;
        int var2 = -6 % ((52 - arg0) / 52);
        return this.field474;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIBII)V")
    public static final void method246(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field469++;
        int var7 = 22 % ((65 - arg4) / 56);
        if ((arg2 - arg0) >= class322.field4945 && class145.field2134 >= (arg0 + arg2) && (arg6 - arg0) >= class229.field3347 && class156.field2366 >= arg6 + arg0) {
            class392.method2454(-88, arg3, arg1, arg2, arg0, arg6, arg5);
        } else {
            class173.method1237(arg1, arg0, arg5, arg2, arg6, (byte) 87, arg3);
        }
    }

    static {
        new class180(null, "Dieses System darf nicht missbraucht werden!", null, null);
        field479 = new int[2];
    }
}
