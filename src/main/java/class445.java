import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class445 {

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Ler;")
    private class157 field6609 = new class157(64);

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Lns;")
    private class438 field6611;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field6610 = 0;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Lui;")
    public static class375 field6616;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Lia;")
    public static class23 field6617;

    static {
        new class375("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field6616 = new class375("flash3:", "blinken3:", "clignotant3:", "brilho3:");
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZIILtq;IBI)V", line = 5)
    public static final void method2678(boolean arg0, int arg1, int arg2, class270 arg3, int arg4, byte arg5, int arg6) {
        field6614++;
        if (class240.field3386 >= 50 || arg3 == null || arg3.field3742 == null || arg1 >= arg3.field3742.length || arg3.field3742[arg1] == null) {
            return;
        }
        int var7 = arg3.field3742[arg1][0];
        int var8 = 26 / ((arg5 + 63) / 52);
        int var9 = var7 >> 8;
        int var10 = var7 >> 5 & 0x7;
        int var11 = var7 & 0x1F;
        if (arg3.field3742[arg1].length > 1) {
            int var12 = (int) ((double) arg3.field3742[arg1].length * Math.random());
            if (var12 > 0) {
                var9 = arg3.field3742[arg1][var12];
            }
        }
        if (var11 == 0) {
            if (arg0) {
                class316.method2046(var10, 255, 0, var9, (byte) -127);
            }
        } else if (class96.field1399.field5221 != 0) {
            int var13 = arg4 - 64 >> 7;
            int var14 = arg6 - 64 >> 7;
            class19.field284[class240.field3386++] = new class491((byte) 1, var9, var10, 0, 255, (arg2 << 24) + (var13 << 16) + (var14 << 8) + var11);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V", line = 58)
    public final void method2679(int arg0, int arg1) {
        if (arg0 != 4172) {
            this.field6611 = null;
        }
        class157 var3 = this.field6609;
        synchronized (this.field6609) {
            this.field6609.method1016(arg1, (byte) 118);
        }
        field6608++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V", line = 75)
    public final void method2680(byte arg0) {
        if (arg0 != -124) {
            this.method2682((byte) 49);
        }
        class157 var2 = this.field6609;
        synchronized (this.field6609) {
            this.field6609.method1015((byte) 121);
        }
        field6612++;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)Ljr;", line = 88)
    public final class219 method2681(int arg0, int arg1) {
        field6615++;
        class157 var3 = this.field6609;
        class219 var4;
        synchronized (this.field6609) {
            var4 = (class219) this.field6609.method1013((long) arg1, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 >= -71) {
            method2683(-82);
        }
        byte[] var5 = this.field6611.method2650(arg1, -51, 32);
        class219 var6 = new class219();
        if (var5 != null) {
            var6.method1483(new class91(var5), (byte) -65);
        }
        class157 var7 = this.field6609;
        synchronized (this.field6609) {
            this.field6609.method1012(-112, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V", line = 117)
    public final void method2682(byte arg0) {
        field6613++;
        class157 var2 = this.field6609;
        synchronized (this.field6609) {
            this.field6609.method1022((byte) -34);
        }
        if (arg0 != 34) {
            this.field6611 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 134)
    public static void method2683(int arg0) {
        field6617 = null;
        field6616 = null;
        if (arg0 != 0) {
            method2678(true, 21, -66, null, -94, (byte) 121, 63);
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lgo;ILns;)V", line = 150)
    public class445(class331 arg0, int arg1, class438 arg2) {
        this.field6611 = arg2;
        this.field6611.method2645(1, 32);
    }
}
