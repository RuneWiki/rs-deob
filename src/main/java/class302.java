import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class302 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    private int field4405 = 0;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    private int field4408 = 128;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Z")
    public boolean field4410 = false;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    private int field4419 = 0;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public int field4422 = -1;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    private int field4417 = 128;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Z")
    public boolean field4424 = false;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    private int field4420 = 0;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public int field4409;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    private int field4414;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "[S")
    private short[] field4406;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "[S")
    private short[] field4407;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "[S")
    private short[] field4413;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "[S")
    private short[] field4416;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lat;B)V")
    public final void method2009(class256 arg0, byte arg1) {
        if (arg1 < 77) {
            method2011(-31, (class256) null);
        }
        while (true) {
            int var3 = arg0.method1738((byte) -82);
            if (var3 == 0) {
                field4412++;
                return;
            }
            this.method2010(arg0, var3, true);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lat;IZ)V")
    private final void method2010(class256 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field4414 = -82;
        }
        field4411++;
        if (arg1 == 1) {
            this.field4414 = arg0.method1767(1930493576);
        } else if (arg1 == 2) {
            this.field4422 = arg0.method1767(1930493576);
        } else if (arg1 == 4) {
            this.field4408 = arg0.method1767(1930493576);
        } else if (arg1 == 5) {
            this.field4417 = arg0.method1767(1930493576);
        } else if (arg1 == 6) {
            this.field4405 = arg0.method1767(1930493576);
        } else if (arg1 == 7) {
            this.field4419 = arg0.method1738((byte) -70);
        } else if (arg1 == 8) {
            this.field4420 = arg0.method1738((byte) 111);
        } else if (arg1 == 9) {
            this.field4410 = true;
        } else if (arg1 == 10) {
            this.field4424 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method1738((byte) 53);
            this.field4416 = new short[var6];
            this.field4413 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4416[var7] = (short) arg0.method1767(1930493576);
                this.field4413[var7] = (short) arg0.method1767(1930493576);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method1738((byte) 55);
            this.field4406 = new short[var4];
            this.field4407 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4406[var5] = (short) arg0.method1767(1930493576);
                this.field4407[var5] = (short) arg0.method1767(1930493576);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILat;)V")
    public static final void method2011(int arg0, class256 arg1) {
        field4418++;
        if (arg1.field3764.length - arg1.field3762 < 1) {
            return;
        }
        int var2 = arg1.method1738((byte) -76);
        if (var2 < 0 || var2 > 15) {
            return;
        }
        byte var3;
        if (var2 == 15) {
            var3 = 37;
        } else if (var2 == 14) {
            var3 = 36;
        } else if (var2 == 13) {
            var3 = 35;
        } else if (var2 == 12) {
            var3 = 34;
        } else if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > (arg1.field3764.length - arg1.field3762)) {
            return;
        }
        class52.field652 = arg1.method1738((byte) -21);
        if (class52.field652 < 1) {
            class52.field652 = 1;
        } else if (class52.field652 > 4) {
            class52.field652 = 4;
        }
        class46.method383(arg1.method1738((byte) 49) == 1, (byte) 101);
        class323.field4773 = arg1.method1738((byte) 71) == 1;
        class367.field5307 = arg1.method1738((byte) 98) == 1;
        if (arg0 < 98) {
            field4421 = 70;
        }
        class231.field3482 = arg1.method1738((byte) -64) == 1;
        class337.field4974 = arg1.method1738((byte) 101) == 1 ? 1 : 0;
        class62.field826 = arg1.method1738((byte) 49) == 1;
        class403.field5834 = arg1.method1738((byte) -94) == 1;
        class182.field2561 = arg1.method1738((byte) 118) == 1;
        class213.field3010 = arg1.method1738((byte) 96);
        if (class213.field3010 > 2) {
            class213.field3010 = 2;
        }
        if (var2 >= 2) {
            class307.field4535 = arg1.method1738((byte) 112) == 1;
        } else {
            class307.field4535 = arg1.method1738((byte) -55) == 1;
            arg1.method1738((byte) 108);
        }
        class13.field224 = arg1.method1738((byte) 75) == 1;
        class76.field969 = arg1.method1738((byte) 51) == 1;
        class79.field993 = arg1.method1738((byte) 111);
        if (class79.field993 > 2) {
            class79.field993 = 2;
        }
        class275.field4077 = class79.field993;
        class134.field1847 = arg1.method1738((byte) -67) == 1;
        class372.field5437 = arg1.method1738((byte) -107);
        if (class372.field5437 > 127) {
            class372.field5437 = 127;
        }
        class450.field6629 = arg1.method1738((byte) -110);
        class178.field2539 = arg1.method1738((byte) 75);
        if (class178.field2539 > 127) {
            class178.field2539 = 127;
        }
        if (var2 >= 1) {
            class189.field2643 = arg1.method1767(1930493576);
            class10.field134 = arg1.method1767(1930493576);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1738((byte) 85);
        }
        if (var2 >= 4) {
            int var4 = arg1.method1738((byte) -123);
            if (var4 < 0 || var4 > 2) {
                var4 = 0;
            }
            if (class451.field6661 < 96) {
                var4 = 0;
            }
            class106.method757(var4, -1);
        }
        if (var2 >= 5) {
            class14.field234 = arg1.method1746(20972);
        }
        int var5 = 0;
        if (var2 >= 6) {
            class223.field3361 = var5 = arg1.method1738((byte) 97);
        }
        if (class223.field3361 != 1 && class223.field3361 != 2) {
            class223.field3361 = 2;
        }
        if (var2 >= 7) {
            class381.field5603 = arg1.method1738((byte) 103) == 1;
        }
        if (var2 >= 8) {
            class400.field5790 = arg1.method1738((byte) -70) == 1;
        }
        if (var2 >= 9) {
            class376.field5491 = arg1.method1738((byte) -66);
        }
        if (class376.field5491 < 0 || class376.field5491 > class313.method2068(-21, class451.field6661)) {
            class376.field5491 = 0;
        }
        if (var2 >= 10) {
            class436.field6366 = arg1.method1738((byte) -31) != 0;
        }
        if (var2 >= 11) {
            class79.field990 = arg1.method1738((byte) -47) != 0;
        }
        if (var2 >= 12) {
            class337.field4974 = arg1.method1738((byte) 53);
        }
        if (class337.field4974 < 0 || class337.field4974 > 2) {
            class337.field4974 = 1;
        }
        if (var2 >= 13) {
            class29.field418 = arg1.method1738((byte) -94) == 1;
        }
        if (var2 >= 14) {
            class322.field4739 = arg1.method1738((byte) -45);
        } else if (var5 == 0) {
            class322.field4739 = 2;
        } else {
            class322.field4739 = 1;
        }
        if (class322.field4739 < 0 || class322.field4739 > 3) {
            class322.field4739 = 2;
        }
        if (var2 >= 15) {
            class329.field4900 = arg1.method1738((byte) 51);
            if (class329.field4900 < 0 || class329.field4900 > 4) {
                class329.field4900 = class429.field6241 == 1 ? 2 : 4;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)[B")
    public static final byte[] method2012(byte arg0, int arg1) {
        field4415++;
        int var2 = -62 % ((-arg0 - 42) / 62);
        class367 var3 = (class367) class126.field1672.method1933((long) arg1, 0);
        if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg1);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class435.method2683(var5, (byte) -75, var8);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var3 = new class367(var4);
            class126.field1672.method1937(-26, (long) arg1, var3);
        }
        return var3.field5310;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIBLfp;)Lbi;")
    public final class143 method2013(int arg0, int arg1, int arg2, int arg3, byte arg4, class9 arg5) {
        field4423++;
        int var7 = arg0;
        class196 var8 = this.field4422 == -1 || arg3 == -1 ? null : class83.method556(this.field4422, 76);
        if (var8 != null) {
            var7 = arg0 | var8.method1369((byte) -42, false, arg3, arg1);
        }
        if (this.field4417 != 128) {
            var7 |= 0x2;
        }
        if (this.field4408 != 128 || this.field4405 != 0) {
            var7 |= 0x5;
        }
        class363 var9 = class9.field123;
        class143 var10;
        synchronized (class9.field123) {
            var10 = (class143) class9.field123.method2310((byte) -128, (long) (this.field4409 |= arg5.field120 << 29));
        }
        if (var10 == null || arg5.method85(var10.method961(), var7) != 0) {
            if (var10 != null) {
                var7 = arg5.method139(var7, var10.method961());
            }
            int var11 = var7;
            if (this.field4416 != null) {
                var11 = var7 | 0x2000;
            }
            if (this.field4406 != null) {
                var11 |= 0x4000;
            }
            class100 var12 = class267.method1838(0, this.field4414, false, class408.field5871);
            if (var12 == null) {
                return null;
            }
            var10 = arg5.method163(var12, var11, class120.field1605, this.field4419 + 64, this.field4420 - -850);
            if (this.field4416 != null) {
                for (int var13 = 0; var13 < this.field4416.length; var13++) {
                    var10.method965(this.field4416[var13], this.field4413[var13]);
                }
            }
            if (this.field4406 != null) {
                for (int var14 = 0; var14 < this.field4406.length; var14++) {
                    var10.method942(this.field4406[var14], this.field4407[var14]);
                }
            }
            var10.method975(var7);
            class363 var15 = class9.field123;
            synchronized (class9.field123) {
                class9.field123.method2299(true, var10, (long) (this.field4409 |= arg5.field120 << 29));
            }
        }
        class143 var16 = var8 == null ? var10.method966((byte) 2, var7, true) : var8.method1364(arg1, 0, (byte) 2, arg2, (byte) 117, var10, arg3, var7);
        if (this.field4408 != 128 || this.field4417 != 128) {
            var16.method957(this.field4408, this.field4417, this.field4408);
        }
        if (this.field4405 != 0) {
            if (this.field4405 == 90) {
                var16.method954(4096);
            }
            if (this.field4405 == 180) {
                var16.method954(8192);
            }
            if (this.field4405 == 270) {
                var16.method954(12288);
            }
        }
        var16.method975(arg0);
        if (arg4 != -121) {
            field4425 = -50;
        }
        return var16;
    }

    static {
        new class409("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field4421 = 0;
        new class409("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field4425 = 0;
    }
}
