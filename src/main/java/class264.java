import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class264 {

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "Lfn;")
    private class91 field3473;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "Loj;")
    private class257 field3479;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "Lli;")
    private class294 field3480;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "Lwl;")
    public static class280 field3484;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "Lff;")
    public static class9 field3487;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "Los;")
    public static class305 field3485;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "Lmd;")
    private class379 field3483;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "[Lwa;")
    private class433[] field3477;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZILoc;Loc;)Lwa;")
    public final class433 method1585(boolean arg0, int arg1, class135 arg2, class135 arg3) {
        if (arg0) {
            return null;
        } else {
            field3486++;
            return this.method1586(true, arg1, -32505, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZIILoc;Loc;)Lwa;")
    private final class433 method1586(boolean arg0, int arg1, int arg2, class135 arg3, class135 arg4) {
        field3474++;
        if (this.field3483 == null) {
            throw new RuntimeException();
        }
        this.field3483.field5173 = arg1 * 8 + 5;
        if (this.field3483.field5152.length <= this.field3483.field5173) {
            throw new RuntimeException();
        } else if (this.field3477[arg1] == null) {
            int var6 = this.field3483.method2232((byte) 125);
            int var7 = this.field3483.method2232((byte) 126);
            if (arg2 == -32505) {
                class433 var8 = new class433(arg1, arg4, arg3, this.field3479, this.field3473, var6, var7, arg0);
                this.field3477[arg1] = var8;
                return var8;
            } else {
                return null;
            }
        } else {
            return this.field3477[arg1];
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1587(String arg0, int arg1) {
        field3481++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var3 > var2 && class321.method1854(arg0.charAt(var2), (byte) 66)) {
            var2++;
        }
        while (var2 < var3 && class321.method1854(arg0.charAt(var3 - 1), (byte) 101)) {
            var3--;
        }
        if (arg1 != -18488) {
            field3484 = null;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class438.method2516(var7, (byte) 27)) {
                char var8 = class310.method1801(true, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)Z")
    public final boolean method1588(int arg0) {
        field3478++;
        if (arg0 >= -24) {
            method1589((byte) 45);
        }
        if (this.field3483 != null) {
            return true;
        }
        if (this.field3480 == null) {
            if (this.field3479.method1555(20)) {
                return false;
            }
            this.field3480 = this.field3479.method1543(255, -21, (byte) 0, true, 255);
        }
        if (this.field3480.field456) {
            return false;
        } else {
            this.field3483 = new class379(this.field3480.method227((byte) 41));
            this.field3477 = new class433[(this.field3483.field5152.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
    public static void method1589(byte arg0) {
        field3484 = null;
        field3487 = null;
        field3485 = null;
        if (arg0 != 0) {
            field3484 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
    public final void method1590(int arg0) {
        field3476++;
        if (this.field3477 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3477.length; var2++) {
            if (this.field3477[var2] != null) {
                this.field3477[var2].method2499((byte) 96);
            }
        }
        int var3 = -49 / ((-arg0 - 1) / 52);
        for (int var4 = 0; var4 < this.field3477.length; var4++) {
            if (this.field3477[var4] != null) {
                this.field3477[var4].method2494(-123);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Loj;Lfn;)V")
    public class264(class257 arg0, class91 arg1) {
        this.field3473 = arg1;
        this.field3479 = arg0;
        if (!this.field3479.method1555(20)) {
            this.field3480 = this.field3479.method1543(255, -21, (byte) 0, true, 255);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZLmd;)Lon;")
    public static final class220 method1591(boolean arg0, class379 arg1) {
        field3482++;
        if (arg0) {
            method1587(null, 83);
        }
        return new class220(arg1.method2202(-26372), arg1.method2202(-26372), arg1.method2202(-26372), arg1.method2202(-26372), arg1.method2249((byte) 68), arg1.method2249((byte) 76), arg1.method2238(255));
    }

    static {
        new class304("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field3484 = new class280();
        field3487 = new class9(100, 8);
    }
}
