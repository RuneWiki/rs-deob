import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class108 extends class142 {

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
    private int field2000 = 0;

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "I")
    private int field1997 = 0;

    @OriginalMember(owner = "client!lh", name = "jb", descriptor = "I")
    private int field2012 = 2048;

    @OriginalMember(owner = "client!lh", name = "ib", descriptor = "I")
    private int field2011 = 4096;

    @OriginalMember(owner = "client!lh", name = "hb", descriptor = "I")
    private int field2010 = 8192;

    @OriginalMember(owner = "client!lh", name = "gb", descriptor = "I")
    private int field2009 = 12288;

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "I")
    private int field1998 = 2048;

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "Lai;")
    public static class10 field2002 = class44.method278("Fehler beim Laden Ihres Spielcharakters)3", -119);

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "Lai;")
    public static class10 field1993 = class44.method278("W-=hlen Sie eine Welt", -86);

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "Lai;")
    public static class10 field2005 = class44.method278("Die Verbindung konnte", -49);

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "Lai;")
    private static class10 field2001 = class44.method278("glow3:", -46);

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "Lai;")
    public static class10 field2003 = field2001;

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "Lai;")
    public static class10 field1999 = class44.method278("Angreifen", 120);

    @OriginalMember(owner = "client!lh", name = "lb", descriptor = "I")
    public static int field2014 = 0;

    @OriginalMember(owner = "client!lh", name = "ob", descriptor = "Lai;")
    public static class10 field2017 = field2001;

    @OriginalMember(owner = "client!lh", name = "pb", descriptor = "Lai;")
    private static class10 field2018 = class44.method278("Loaded wordpack", 101);

    @OriginalMember(owner = "client!lh", name = "mb", descriptor = "I")
    public static int field2015 = 0;

    @OriginalMember(owner = "client!lh", name = "kb", descriptor = "Lai;")
    public static class10 field2013 = field2018;

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!lh", name = "db", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!lh", name = "eb", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!lh", name = "fb", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!lh", name = "nb", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!lh", name = "qb", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "Z")
    public static boolean field1995;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(Z)Lae;")
    public static final class6 method694(boolean arg0) {
        if (!arg0) {
            method696(-45);
        }
        ++field2006;
        try {
            return (class6) Class.forName("gd").newInstance();
        } catch (Throwable var1) {
            return new class28();
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        ++field1996;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field2010 = arg0.method762((byte) 122);
                                }
                            } else {
                                this.field2011 = arg0.method762((byte) 127);
                            }
                        } else {
                            this.field2009 = arg0.method762((byte) 124);
                        }
                    } else {
                        this.field1998 = arg0.method762((byte) 92);
                    }
                } else {
                    this.field1997 = arg0.method762((byte) 103);
                }
            } else {
                this.field2000 = arg0.method762((byte) 120);
            }
        } else {
            this.field2012 = arg0.method762((byte) 79);
        }
        if (arg2 >= -34) {
            this.method78((class114) null, 51, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        if (arg0) {
            this.method6(true, 112);
        }
        ++field2004;
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (super.field2683.field3516) {
            int var4 = class13.field212[arg1] + -2048;
            for (int var5 = 0; var5 < class133.field2499; ++var5) {
                int var6 = class79.field1395[var5] + -2048;
                int var7 = this.field2012 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = this.field2000 + var4;
                int var10 = var8 > 2048 ? var8 + -4096 : var8;
                int var11 = ~var9 > 2047 ? var9 + 4096 : var9;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = var6 - -this.field1997;
                int var14 = var13 < -2048 ? var13 + 4096 : var13;
                int var15 = var4 - -this.field1998;
                int var16 = ~var15 <= 2047 ? var15 : var15 + 4096;
                int var17 = ~var14 < -2049 ? var14 + -4096 : var14;
                int var18 = ~var16 < -2049 ? var16 + -4096 : var16;
                var3[var5] = !this.method697(var12, (byte) 83, var10) && !this.method695(var18, var17, 113) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(III)Z")
    private final boolean method695(int arg0, int arg1, int arg2) {
        ++field2007;
        if (arg2 <= 78) {
            field2017 = null;
        }
        int var4 = (arg0 - -arg1) * this.field2009 >> 12;
        int var5 = class179.field3400[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field2009;
        int var7 = (var6 << 12) / this.field2010;
        int var8 = this.field2011 * var7 >> 12;
        return ~(arg0 - arg1) > ~var8 && ~(-var8) > ~(-arg1 + arg0);
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)V")
    public static void method696(int arg0) {
        field2005 = null;
        field2002 = null;
        if (arg0 >= 123) {
            field2003 = null;
            field2001 = null;
            field2017 = null;
            field1993 = null;
            field1999 = null;
            field2013 = null;
            field2018 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
    public final void method80(int arg0) {
        class58.method392(arg0 + 103);
        if (arg0 != -1) {
            this.method78((class114) null, -54, (byte) -84);
        }
        ++field2019;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class108() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBI)Z")
    private final boolean method697(int arg0, byte arg1, int arg2) {
        int var4 = (arg0 - arg2) * this.field2009 >> 12;
        int var5 = class179.field3400[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field2009;
        if (arg1 <= 68) {
            field2002 = null;
        }
        ++field2016;
        int var7 = (var6 << 12) / this.field2010;
        int var8 = this.field2011 * var7 >> 12;
        return ~(arg2 - -arg0) > ~var8 && ~(arg0 + arg2) < ~(-var8);
    }
}
