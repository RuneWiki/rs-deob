import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class441 {

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Lfc;")
    private class174 field6162 = new class174(64);

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "Lfc;")
    public class174 field6174 = new class174(50);

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "Lfc;")
    public class174 field6175 = new class174(5);

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Loi;")
    private class53 field6157;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Lle;")
    public class205 field6164;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "Loi;")
    public class53 field6159;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Z")
    public boolean field6163;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Leh;")
    public static class246 field6156 = new class246(69, 11);

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Lqr;")
    public static class48 field6167 = new class48();

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "Lkn;")
    public static class530 field6172 = new class530("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "F")
    public static float field6173;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public int field6176;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Lwr;")
    public final class322 method2580(int arg0, int arg1) {
        field6160++;
        class174 var3 = this.field6162;
        class322 var4;
        synchronized (this.field6162) {
            var4 = (class322) this.field6162.method1088((long) arg0, (byte) -121);
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field6157;
        byte[] var6;
        synchronized (this.field6157) {
            var6 = this.field6157.method426(class236.method1453(arg0, (byte) -94), (byte) 9, class146.method905((byte) -57, arg0));
        }
        class322 var7 = new class322();
        var7.field4706 = this;
        var7.field4669 = arg0;
        if (var6 != null) {
            var7.method1945(16480, new class403(var6));
        }
        if (arg1 > -104) {
            this.method2584(113, false);
        }
        var7.method1937((byte) -91);
        class174 var8 = this.field6162;
        synchronized (this.field6162) {
            this.field6162.method1097(19627, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public final void method2581(int arg0) {
        class174 var2 = this.field6162;
        synchronized (this.field6162) {
            this.field6162.method1095(0);
        }
        field6170++;
        if (arg0 != -1) {
            return;
        }
        class174 var3 = this.field6174;
        synchronized (this.field6174) {
            this.field6174.method1095(0);
        }
        class174 var4 = this.field6175;
        synchronized (this.field6175) {
            this.field6175.method1095(0);
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)V")
    public final void method2582(int arg0, int arg1) {
        class174 var3 = this.field6162;
        synchronized (this.field6162) {
            this.field6162.method1087(1, arg1);
            if (arg0 >= -64) {
                this.field6164 = null;
            }
        }
        field6158++;
        class174 var4 = this.field6174;
        synchronized (this.field6174) {
            this.field6174.method1087(1, arg1);
        }
        class174 var5 = this.field6175;
        synchronized (this.field6175) {
            this.field6175.method1087(1, arg1);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public final void method2583(byte arg0) {
        field6154++;
        class174 var2 = this.field6174;
        synchronized (this.field6174) {
            int var3 = 36 % ((arg0 + 39) / 52);
            this.field6174.method1096((byte) -71);
        }
        class174 var4 = this.field6175;
        synchronized (this.field6175) {
            this.field6175.method1096((byte) -121);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)V")
    public final void method2584(int arg0, boolean arg1) {
        this.field6176 = arg0;
        field6155++;
        class174 var3 = this.field6174;
        synchronized (this.field6174) {
            this.field6174.method1096((byte) 119);
        }
        if (!arg1) {
            class174 var4 = this.field6175;
            synchronized (this.field6175) {
                this.field6175.method1096((byte) -31);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
    public final void method2585(byte arg0) {
        class174 var2 = this.field6162;
        synchronized (this.field6162) {
            this.field6162.method1096((byte) -81);
        }
        int var3 = 37 % ((-arg0 - 86) / 36);
        field6166++;
        class174 var4 = this.field6174;
        synchronized (this.field6174) {
            this.field6174.method1096((byte) -38);
        }
        class174 var5 = this.field6175;
        synchronized (this.field6175) {
            this.field6175.method1096((byte) -96);
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static void method2586(int arg0) {
        field6167 = null;
        field6172 = null;
        field6156 = null;
        if (arg0 != -2376) {
            method2586(31);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V")
    public final void method2587(boolean arg0, int arg1) {
        field6165++;
        if (this.field6163 == arg0) {
            return;
        }
        this.field6163 = arg0;
        this.method2585((byte) -127);
        if (arg1 != -1) {
            this.method2581(-16);
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lle;IZLoi;Loi;)V")
    public class441(class205 arg0, int arg1, boolean arg2, class53 arg3, class53 arg4) {
        this.field6157 = arg3;
        this.field6164 = arg0;
        this.field6159 = arg4;
        this.field6163 = arg2;
        if (this.field6157 != null) {
            int var6 = this.field6157.method434(26154) - 1;
            this.field6157.method435(var6, 0);
        }
    }
}
