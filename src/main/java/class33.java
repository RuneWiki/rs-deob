import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class33 {

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public int field610 = -1;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "[I")
    private int[] field609 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "Z")
    public boolean field602 = false;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field600 = 0;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "Ljava/util/Calendar;")
    public static Calendar field614 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "[I")
    public static int[] field617 = new int[1000];

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "Leb;")
    public static class230 field618 = class68.method589(0, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field616 = -1;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "Leb;")
    public static class230 field619 = class68.method589(0, "<col=40ff00>");

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    public static int field615 = -1;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "[I")
    private int[] field611;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "[S")
    private short[] field599;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "[S")
    private short[] field607;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "[S")
    private short[] field612;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "[S")
    private short[] field613;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public static final void method300(byte arg0) {
        field608++;
        try {
            int var1 = -113 / ((-arg0 - 59) / 59);
            if (class173.field3058 == 1) {
                int var2 = class210.field3663.method438((byte) -53);
                if (var2 > 0 && class210.field3663.method443((byte) -104)) {
                    int var3 = var2 - class266.field4730;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class210.field3663.method451(-716317374, var3);
                } else {
                    class210.field3663.method462(-14333);
                    class210.field3663.method456(-32759);
                    class65.field1228 = null;
                    class135.field2436 = null;
                    if (class141.field2533 == null) {
                        class173.field3058 = 0;
                    } else {
                        class173.field3058 = 2;
                    }
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class210.field3663.method462(-14333);
            class173.field3058 = 0;
            class141.field2533 = null;
            class65.field1228 = null;
            class135.field2436 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILkk;Lkk;)V")
    public static final void method301(int arg0, class223 arg1, class223 arg2) {
        class104.field1904 = class35.method321(class271.field4788, arg2, arg1, 0, (byte) 77);
        field606++;
        if (arg0 <= -123) {
            class216.field3731 = (class83) class104.field1904;
            class180.field3151 = class35.method321(class121.field2136, arg2, arg1, 0, (byte) 99);
            class76.field1382 = class35.method321(class124.field2168, arg2, arg1, 0, (byte) 67);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lfk;B)V")
    public final void method302(class14 arg0, byte arg1) {
        if (arg1 <= 80) {
            field617 = null;
        }
        while (true) {
            int var3 = arg0.method200(255);
            if (var3 == 0) {
                field601++;
                return;
            }
            this.method307(arg0, var3, false);
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)Lnd;")
    public final class250 method303(byte arg0) {
        class250[] var2 = new class250[5];
        if (arg0 <= 16) {
            this.method302((class14) null, (byte) -73);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field609[var4] != -1) {
                var2[var3++] = class250.method1770(class138.field2468, this.field609[var4], 0);
            }
        }
        field596++;
        class250 var5 = new class250(var2, var3);
        if (this.field612 != null) {
            for (int var6 = 0; var6 < this.field612.length; var6++) {
                var5.method1750(this.field612[var6], this.field613[var6]);
            }
        }
        if (this.field607 != null) {
            for (int var7 = 0; var7 < this.field607.length; var7++) {
                var5.method1751(this.field607[var7], this.field599[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)V")
    public static void method304(byte arg0) {
        field618 = null;
        field614 = null;
        field619 = null;
        field617 = null;
        if (arg0 != 17) {
            method301(37, (class223) null, (class223) null);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Z")
    public final boolean method305(int arg0) {
        field605++;
        if (this.field611 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != -23419) {
            this.method305(-119);
        }
        for (int var3 = 0; var3 < this.field611.length; var3++) {
            if (!class138.field2468.method1537((byte) -118, this.field611[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)Lnd;")
    public final class250 method306(byte arg0) {
        field603++;
        if (this.field611 == null) {
            return null;
        }
        class250[] var2 = new class250[this.field611.length];
        if (arg0 != -20) {
            method300((byte) 103);
        }
        for (int var3 = 0; var3 < this.field611.length; var3++) {
            var2[var3] = class250.method1770(class138.field2468, this.field611[var3], 0);
        }
        class250 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class250(var2, var2.length);
        }
        if (this.field612 != null) {
            for (int var5 = 0; var5 < this.field612.length; var5++) {
                var4.method1750(this.field612[var5], this.field613[var5]);
            }
        }
        if (this.field607 != null) {
            for (int var6 = 0; var6 < this.field607.length; var6++) {
                var4.method1751(this.field607[var6], this.field599[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lfk;IZ)V")
    private final void method307(class14 arg0, int arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        if (arg1 == 1) {
            this.field610 = arg0.method200(255);
        } else if (arg1 == 2) {
            int var8 = arg0.method200(255);
            this.field611 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field611[var9] = arg0.method161(4);
            }
        } else if (arg1 == 3) {
            this.field602 = true;
        } else if (arg1 == 40) {
            int var4 = arg0.method200(255);
            this.field613 = new short[var4];
            this.field612 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field612[var5] = (short) arg0.method161(4);
                this.field613[var5] = (short) arg0.method161(4);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method200(255);
            this.field607 = new short[var6];
            this.field599 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field607[var7] = (short) arg0.method161(4);
                this.field599[var7] = (short) arg0.method161(4);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field609[arg1 - 60] = arg0.method161(4);
        }
        field597++;
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(B)Z")
    public final boolean method308(byte arg0) {
        field604++;
        boolean var2 = true;
        if (arg0 < 95) {
            method309(-22, 62, -73, -1, -101);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field609[var3] != -1 && !class138.field2468.method1537((byte) -118, this.field609[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V")
    public static final void method309(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field598++;
        if (arg3 != 1000) {
            method300((byte) 85);
        }
        if (class15.field345 <= arg1 && class259.field4587 >= arg1) {
            int var5 = class106.method882(class78.field1404, 1, class42.field769, arg2);
            int var6 = class106.method882(class78.field1404, arg3 - 999, class42.field769, arg4);
            class98.method841(var6, arg1, var5, -5, arg0);
        }
    }
}
