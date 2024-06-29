import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class385 {

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "Lgca;")
    public class226 field5393 = new class226();

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Lfw;")
    public static class52 field5384 = new class52();

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "Lgca;")
    private class226 field5397;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "[Z")
    public static boolean[] field5394;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)Lgca;")
    public final class226 method2211(byte arg0) {
        field5385++;
        class226 var2 = this.field5393.field3254;
        if (this.field5393 == var2) {
            this.field5397 = null;
            return null;
        }
        this.field5397 = var2.field3254;
        if (arg0 < 13) {
            this.field5393 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)I")
    public static final int method2212(byte arg0, int arg1) {
        int var2 = ((arg1 & 0xAAAAAAAB) >>> 1) + (arg1 & 0x55555555);
        field5395++;
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        int var4 = -71 % ((arg0 - 59) / 38);
        int var5 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var6 = (var5 >>> 8) + var5;
        int var7 = (var6 >>> 16) + var6;
        return var7 & 0xFF;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method2213(int arg0, int arg1, int arg2, Class arg3) {
        class486 var4 = class658.field9266[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class20 var5 = var4.field6751; var5 != null; var5 = var5.field284) {
            class39 var6 = var5.field281;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field517 == arg1 && var6.field512 == arg2) {
                class321.method1956(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZII)Z")
    public static final boolean method2214(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field5387 = 72;
        }
        field5389++;
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
    public final int method2215(int arg0) {
        if (arg0 != 858993459) {
            method2214(true, -8, 125);
        }
        field5390++;
        int var2 = 0;
        class226 var3 = this.field5393.field3254;
        while (this.field5393 != var3) {
            var3 = var3.field3254;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
    public static final void method2216(int arg0, int arg1) {
        class528.field7233.method1989(arg0, (byte) 101);
        if (arg1 != 1083297712) {
            field5387 = 86;
        }
        field5386++;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)Lgca;")
    public final class226 method2217(int arg0) {
        if (arg0 != -1431655765) {
            return null;
        }
        field5391++;
        class226 var2 = this.field5397;
        if (this.field5393 == var2) {
            this.field5397 = null;
            return null;
        } else {
            this.field5397 = var2.field3254;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public static void method2218(boolean arg0) {
        if (arg0) {
            method2218(true);
        }
        field5384 = null;
        field5394 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLgca;)V")
    public final void method2219(boolean arg0, class226 arg1) {
        field5388++;
        if (arg1.field3250 != null) {
            arg1.method1447(-93);
        }
        arg1.field3254 = this.field5393;
        arg1.field3250 = this.field5393.field3250;
        arg1.field3250.field3254 = arg1;
        arg1.field3254.field3250 = arg1;
        if (!arg0) {
            this.field5393 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V")
    public final void method2220(int arg0) {
        field5392++;
        if (arg0 != -25594) {
            this.method2215(-93);
        }
        while (true) {
            class226 var2 = this.field5393.field3254;
            if (this.field5393 == var2) {
                this.field5397 = null;
                return;
            }
            var2.method1447(-58);
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class385() {
        this.field5393.field3250 = this.field5393;
        this.field5393.field3254 = this.field5393;
    }
}
