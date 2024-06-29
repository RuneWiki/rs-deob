import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class149 extends class109 {

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "F")
    public float field2001;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "F")
    public float field2003;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "F")
    public float field2004;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "F")
    public float field2006;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "F")
    public float field2008;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "F")
    public float field2009;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "F")
    public float field2014;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "F")
    public float field2015;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "F")
    public float field2018;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "F")
    public float field2020;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "F")
    public float field2023;

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "F")
    public float field2025;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!fn", name = "I", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!fn", name = "J", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!fn", name = "K", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "(I)V")
    public final void method821(int arg0) {
        this.field2025 = 1.0F;
        field2021++;
        this.field2023 = this.field2008 = class764.field10484[arg0 & 0x3FFF];
        this.field2001 = class764.field10511[arg0 & 0x3FFF];
        this.field2004 = -this.field2001;
        this.field2018 = this.field2020 = this.field2014 = this.field2015 = this.field2009 = this.field2003 = this.field2006 = 0.0F;
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(III[I)V")
    public final void method820(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field2014 + (float) arg0 * this.field2001 + (float) arg1 * this.field2008 + this.field2015);
        field2013++;
        arg3[2] = (int) ((float) arg2 * this.field2025 + (float) arg0 * this.field2009 + (float) arg1 * this.field2003 + this.field2006);
        arg3[0] = (int) ((float) arg2 * this.field2018 + (float) arg0 * this.field2023 + (float) arg1 * this.field2004 + this.field2020);
    }

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "(I)V")
    public final void method824(int arg0) {
        field2027++;
        float var2 = class764.field10484[arg0 & 0x3FFF];
        float var3 = class764.field10511[arg0 & 0x3FFF];
        float var4 = this.field2023;
        float var5 = this.field2004;
        float var6 = this.field2018;
        float var7 = this.field2020;
        this.field2023 = var2 * var4 - this.field2001 * var3;
        this.field2001 = this.field2001 * var2 + var3 * var4;
        this.field2004 = var2 * var5 - this.field2008 * var3;
        this.field2018 = var2 * var6 - (this.field2014 * var3);
        this.field2008 = this.field2008 * var2 + var3 * var5;
        this.field2014 = this.field2014 * var2 + var3 * var6;
        this.field2020 = var2 * var7 - this.field2015 * var3;
        this.field2015 = this.field2015 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(CI)Z")
    public static final boolean method1040(char arg0, int arg1) {
        field1999++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class429.method2580(arg0, true)) {
            return true;
        } else {
            char[] var2 = class346.field4863;
            for (int var3 = arg1; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class122.field1693;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
    public final void method811(int arg0) {
        field2017++;
        float var2 = class764.field10484[arg0 & 0x3FFF];
        float var3 = class764.field10511[arg0 & 0x3FFF];
        float var4 = this.field2001;
        float var5 = this.field2008;
        float var6 = this.field2014;
        float var7 = this.field2015;
        this.field2001 = var2 * var4 - this.field2009 * var3;
        this.field2008 = var2 * var5 - (this.field2003 * var3);
        this.field2009 = this.field2009 * var2 + var3 * var4;
        this.field2003 = this.field2003 * var2 + var3 * var5;
        this.field2014 = var2 * var6 - (this.field2025 * var3);
        this.field2015 = var2 * var7 - this.field2006 * var3;
        this.field2025 = this.field2025 * var2 + var3 * var6;
        this.field2006 = this.field2006 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III[I)V")
    public final void method812(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field2018 + (float) arg0 * this.field2023 + (float) arg1 * this.field2004);
        field2031++;
        arg3[2] = (int) ((float) arg2 * this.field2025 + (float) arg0 * this.field2009 + (float) arg1 * this.field2003);
        arg3[1] = (int) ((float) arg2 * this.field2014 + (float) arg0 * this.field2001 + (float) arg1 * this.field2008);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([I)V")
    public final void method809(int[] arg0) {
        field2030++;
        float var2 = (float) arg0[0] - this.field2020;
        float var3 = (float) arg0[1] - this.field2015;
        float var4 = (float) arg0[2] - this.field2006;
        arg0[0] = (int) (this.field2009 * var4 + this.field2023 * var2 + this.field2001 * var3);
        arg0[2] = (int) (this.field2025 * var4 + this.field2018 * var2 + this.field2014 * var3);
        arg0[1] = (int) (this.field2003 * var4 + this.field2008 * var3 + this.field2004 * var2);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lal;)V")
    public final void method816(class109 arg0) {
        field2000++;
        class149 var2 = (class149) arg0;
        this.field2006 = var2.field2006;
        this.field2014 = var2.field2014;
        this.field2025 = var2.field2025;
        this.field2004 = var2.field2004;
        this.field2003 = var2.field2003;
        this.field2023 = var2.field2023;
        this.field2020 = var2.field2020;
        this.field2001 = var2.field2001;
        this.field2009 = var2.field2009;
        this.field2018 = var2.field2018;
        this.field2008 = var2.field2008;
        this.field2015 = var2.field2015;
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)V")
    public final void method817(int arg0) {
        field2011++;
        float var2 = class764.field10484[arg0 & 0x3FFF];
        float var3 = class764.field10511[arg0 & 0x3FFF];
        float var4 = this.field2023;
        float var5 = this.field2004;
        float var6 = this.field2018;
        float var7 = this.field2020;
        this.field2023 = this.field2009 * var3 + var2 * var4;
        this.field2009 = this.field2009 * var2 - (var3 * var4);
        this.field2004 = this.field2003 * var3 + var2 * var5;
        this.field2003 = this.field2003 * var2 - (var3 * var5);
        this.field2018 = this.field2025 * var3 + var2 * var6;
        this.field2025 = this.field2025 * var2 - var3 * var6;
        this.field2020 = this.field2006 * var3 + var2 * var7;
        this.field2006 = this.field2006 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)V")
    public final void method814(int arg0, int arg1, int arg2) {
        this.field2023 = this.field2008 = this.field2025 = 1.0F;
        this.field2015 = arg1;
        this.field2006 = arg2;
        this.field2001 = this.field2009 = this.field2004 = this.field2003 = this.field2018 = this.field2014 = 0.0F;
        this.field2020 = arg0;
        field2028++;
    }

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "(I)V")
    public final void method825(int arg0) {
        field2002++;
        this.field2023 = 1.0F;
        this.field2008 = this.field2025 = class764.field10484[arg0 & 0x3FFF];
        this.field2003 = class764.field10511[arg0 & 0x3FFF];
        this.field2014 = -this.field2003;
        this.field2004 = this.field2018 = this.field2020 = this.field2001 = this.field2015 = this.field2009 = this.field2006 = 0.0F;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)Z")
    public static final boolean method1041(boolean arg0) {
        class442.field6364++;
        field2016++;
        class90.field1277 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(III)V")
    public final void method818(int arg0, int arg1, int arg2) {
        this.field2020 += arg0;
        this.field2006 += arg2;
        this.field2015 += arg1;
        field2024++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public final void method810(int arg0) {
        field2029++;
        this.field2008 = 1.0F;
        this.field2023 = this.field2025 = class764.field10484[arg0 & 0x3FFF];
        this.field2018 = class764.field10511[arg0 & 0x3FFF];
        this.field2004 = this.field2020 = this.field2001 = this.field2014 = this.field2015 = this.field2003 = this.field2006 = 0.0F;
        this.field2009 = -this.field2018;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(Z)V")
    public static final void method1042(boolean arg0) {
        field2007++;
        class84.field1201 = new class478(class58.field701.method365(class55.field647, (byte) 124), "", class2.field22, 1004, -1, 0L, 0, 0, true, arg0, 0L, true);
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
    public class149() {
        this.method822();
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "()V")
    public final void method822() {
        field2022++;
        this.field2023 = this.field2008 = this.field2025 = 1.0F;
        this.field2001 = this.field2009 = this.field2004 = this.field2003 = this.field2018 = this.field2014 = this.field2020 = this.field2015 = this.field2006 = 0.0F;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "()Lal;")
    public final class109 method813() {
        field2010++;
        class149 var1 = new class149();
        var1.field2001 = this.field2001;
        var1.field2023 = this.field2023;
        var1.field2006 = this.field2006;
        var1.field2020 = this.field2020;
        var1.field2018 = this.field2018;
        var1.field2003 = this.field2003;
        var1.field2025 = this.field2025;
        var1.field2004 = this.field2004;
        var1.field2009 = this.field2009;
        var1.field2008 = this.field2008;
        var1.field2014 = this.field2014;
        var1.field2015 = this.field2015;
        return var1;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIII)V")
    public final void method823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2019++;
        float var7 = class764.field10484[arg3 & 0x3FFF];
        float var8 = class764.field10511[arg3 & 0x3FFF];
        float var9 = class764.field10484[arg4 & 0x3FFF];
        float var10 = class764.field10511[arg4 & 0x3FFF];
        float var11 = class764.field10484[arg5 & 0x3FFF];
        float var12 = class764.field10511[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field2018 = -var10 * var11 + var9 * var14;
        this.field2023 = var9 * var11 + var10 * var14;
        this.field2009 = var7 * var10;
        this.field2025 = var7 * var9;
        this.field2004 = var7 * var12;
        this.field2003 = -var8;
        this.field2014 = var9 * var13 + var10 * var12;
        this.field2008 = var7 * var11;
        this.field2001 = -var9 * var12 + var10 * var13;
        this.field2015 = (float) (-arg0) * this.field2001 - (float) arg1 * this.field2008 - ((float) arg2 * this.field2014);
        this.field2006 = (float) (-arg0) * this.field2009 - (float) arg1 * this.field2003 - ((float) arg2 * this.field2025);
        this.field2020 = (float) (-arg0) * this.field2023 - (float) arg1 * this.field2004 - (float) arg2 * this.field2018;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(III[I)V")
    public final void method815(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field2020);
        int var6 = (int) ((float) arg2 - this.field2006);
        field2012++;
        int var7 = (int) ((float) arg1 - this.field2015);
        arg3[2] = (int) ((float) var6 * this.field2025 + (float) var5 * this.field2018 + (float) var7 * this.field2014);
        arg3[1] = (int) ((float) var6 * this.field2003 + (float) var5 * this.field2004 + (float) var7 * this.field2008);
        arg3[0] = (int) ((float) var6 * this.field2009 + (float) var5 * this.field2023 + (float) var7 * this.field2001);
    }
}
