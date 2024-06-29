import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class148 {

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "Z")
    public boolean field2011 = true;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    private int field1999 = 0;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public int field2004 = -1;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public int field2014 = 128;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field2007 = 0;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Lbt;")
    public static class363 field2000 = new class363(64);

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "Lbn;")
    public static class160 field2013 = new class160(37, 2);

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "Lbn;")
    public static class160 field2015;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "Lbt;")
    public static class363 field2017;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public int field1998;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public int field2002;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public int field2005;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "Lae;")
    public static class285 field2016;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "Ljava/awt/Font;")
    public static Font field2006;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)V")
    private final void method1018(int arg0, byte arg1) {
        field2001++;
        double var3 = (double) ((arg0 & 0xFF113A) >> 16) / 256.0D;
        double var5 = (double) ((arg0 & 0xFFA1) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field1998 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field2009 = (int) (var15 * 256.0D);
        if (this.field1998 < 0) {
            this.field1998 = 0;
        } else if (this.field1998 > 255) {
            this.field1998 = 255;
        }
        if (arg1 != 73) {
            field2018 = -75;
        }
        if ((var17 > 0.5D)) {
            this.field2002 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2002 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2009 < 0) {
            this.field2009 = 0;
        } else if (this.field2009 > 255) {
            this.field2009 = 255;
        }
        if (this.field2002 < 1) {
            this.field2002 = 1;
        }
        this.field2005 = (int) ((double) this.field2002 * var19);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILat;I)V")
    public final void method1019(int arg0, class256 arg1, int arg2) {
        if (arg2 != 0) {
            this.field1998 = -126;
        }
        while (true) {
            int var4 = arg1.method1738((byte) -115);
            if (var4 == 0) {
                field2003++;
                return;
            }
            this.method1020(arg0, var4, arg1, true);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILat;Z)V")
    private final void method1020(int arg0, int arg1, class256 arg2, boolean arg3) {
        field2012++;
        if (!arg3) {
            return;
        }
        if (arg1 == 1) {
            this.field1999 = arg2.method1725((byte) 0);
            this.method1018(this.field1999, (byte) 73);
        } else if (arg1 == 2) {
            this.field2004 = arg2.method1767(1930493576);
            if (this.field2004 == 65535) {
                this.field2004 = -1;
                return;
            }
            return;
        } else if (arg1 == 3) {
            this.field2014 = arg2.method1767(1930493576);
            return;
        } else if (arg1 == 4) {
            this.field2011 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method1021(byte arg0) {
        field2017 = null;
        int var1 = -96 % ((10 - arg0) / 55);
        field2013 = null;
        field2016 = null;
        field2015 = null;
        field2000 = null;
        field2006 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BILct;I)Ljr;")
    public static final class239 method1022(byte arg0, int arg1, class104 arg2, int arg3) {
        field2008++;
        class256 var4 = new class256(arg2.method715(arg1, (byte) 68, arg3));
        class239 var5 = new class239(arg1, var4.method1715(true), var4.method1715(true), var4.method1746(20972), var4.method1746(20972), var4.method1738((byte) 104) == 1, var4.method1738((byte) -107), var4.method1738((byte) 59));
        int var6 = var4.method1738((byte) -118);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field3561.method2484(0, new class212(var4.method1738((byte) 115), var4.method1767(1930493576), var4.method1767(1930493576), var4.method1767(1930493576), var4.method1767(1930493576), var4.method1767(1930493576), var4.method1767(1930493576), var4.method1767(1930493576), var4.method1767(1930493576)));
        }
        if (arg0 > -100) {
            field2000 = null;
        }
        var5.method1603((byte) -91);
        return var5;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(IB)V")
    public static final void method1023(int arg0, byte arg1) {
        class202.field2849 = arg0;
        field1997++;
        if (arg1 != -114) {
            field2000 = null;
        }
        class452.field6665.method2313(93);
    }

    static {
        new class409("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field2015 = new class160(19, 7);
        field2017 = new class363(32);
    }
}
