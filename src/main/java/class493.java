import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class493 {

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "Lmd;")
    private class379 field7205 = new class379();

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "Lsl;")
    public static class318 field7210 = new class318(81, 4);

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "Lbg;")
    public static class324 field7216 = new class324(62, 8);

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "Lmd;")
    private class379 field7215;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILmd;)V")
    public final void method2948(int arg0, class379 arg1) {
        field7218++;
        if (arg1.field5601 != null) {
            arg1.method2322(1024);
        }
        arg1.field5600 = this.field7205;
        arg1.field5601 = this.field7205.field5601;
        arg1.field5601.field5600 = arg1;
        int var3 = 43 / ((arg0 + 76) / 36);
        arg1.field5600.field5601 = arg1;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)Lmd;")
    public final class379 method2949(byte arg0) {
        field7211++;
        if (arg0 < 92) {
            return null;
        }
        class379 var2 = this.field7205.field5600;
        if (this.field7205 == var2) {
            return null;
        } else {
            var2.method2322(1024);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)I")
    public final int method2950(byte arg0) {
        field7209++;
        int var2 = 0;
        int var3 = -69 / ((-arg0 - 88) / 34);
        class379 var4 = this.field7205.field5600;
        while (this.field7205 != var4) {
            var4 = var4.field5600;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(B)Lmd;")
    public final class379 method2951(byte arg0) {
        field7208++;
        class379 var2 = this.field7205.field5601;
        if (this.field7205 == var2) {
            this.field7215 = null;
            return null;
        }
        if (arg0 != 110) {
            this.field7215 = null;
        }
        this.field7215 = var2.field5601;
        return var2;
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "(B)Lmd;")
    public final class379 method2952(byte arg0) {
        field7213++;
        if (arg0 > -40) {
            this.method2950((byte) -9);
        }
        class379 var2 = this.field7215;
        if (this.field7205 == var2) {
            this.field7215 = null;
            return null;
        } else {
            this.field7215 = var2.field5600;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public final void method2953(int arg0) {
        if (arg0 < 39) {
            return;
        }
        while (true) {
            class379 var2 = this.field7205.field5600;
            if (this.field7205 == var2) {
                field7212++;
                this.field7215 = null;
                return;
            }
            var2.method2322(1024);
        }
    }

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "(B)V")
    public static void method2954(byte arg0) {
        if (arg0 == -45) {
            field7216 = null;
            field7210 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)Lmd;")
    public final class379 method2955(int arg0) {
        field7214++;
        if (arg0 != 62) {
            this.method2949((byte) 67);
        }
        class379 var2 = this.field7205.field5600;
        if (this.field7205 == var2) {
            this.field7215 = null;
            return null;
        } else {
            this.field7215 = var2.field5600;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "(B)Z")
    public final boolean method2956(byte arg0) {
        field7206++;
        int var2 = 3 / ((arg0 + 6) / 36);
        return this.field7205.field5600 == this.field7205;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
    public class493() {
        this.field7205.field5600 = this.field7205;
        this.field7205.field5601 = this.field7205;
    }

    static {
        new class331("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    }
}
