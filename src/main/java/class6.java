import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CWWAFTAL")
public class class6 {

    @OriginalMember(owner = "CWWAFTAL", name = "b", descriptor = "I")
    private int field554 = 224;

    @OriginalMember(owner = "CWWAFTAL", name = "d", descriptor = "Z")
    private boolean field556 = true;

    @OriginalMember(owner = "CWWAFTAL", name = "e", descriptor = "Z")
    private boolean field557 = false;

    @OriginalMember(owner = "CWWAFTAL", name = "h", descriptor = "I")
    public int field560 = -1;

    @OriginalMember(owner = "CWWAFTAL", name = "j", descriptor = "[I")
    public int[] field562 = new int[6];

    @OriginalMember(owner = "CWWAFTAL", name = "k", descriptor = "[I")
    public int[] field563 = new int[6];

    @OriginalMember(owner = "CWWAFTAL", name = "l", descriptor = "[I")
    public int[] field564 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "CWWAFTAL", name = "m", descriptor = "Z")
    public boolean field565 = false;

    @OriginalMember(owner = "CWWAFTAL", name = "a", descriptor = "I")
    private static int field553 = 8;

    @OriginalMember(owner = "CWWAFTAL", name = "f", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "CWWAFTAL", name = "c", descriptor = "Z")
    private static boolean field555;

    @OriginalMember(owner = "CWWAFTAL", name = "i", descriptor = "[I")
    public int[] field561;

    @OriginalMember(owner = "CWWAFTAL", name = "g", descriptor = "[LCWWAFTAL;")
    public static class6[] field559;

    @OriginalMember(owner = "CWWAFTAL", name = "a", descriptor = "(LFIGUVTWB;Z)V")
    public static void method173(class15 arg0, boolean arg1) {
        if (arg1) {
            field555 = !field555;
        }
        class33 var2 = new class33(field553, arg0.method209("idk.dat", null));
        field558 = var2.method294();
        if (field559 == null) {
            field559 = new class6[field558];
        }
        for (int var3 = 0; var3 < field558; var3++) {
            if (field559[var3] == null) {
                field559[var3] = new class6();
            }
            field559[var3].method174(var2, false);
        }
    }

    @OriginalMember(owner = "CWWAFTAL", name = "a", descriptor = "(LMUKVLYLC;Z)V")
    public void method174(class33 arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method292();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field560 = arg0.method292();
                } else if (var4 == 2) {
                    int var5 = arg0.method292();
                    this.field561 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field561[var6] = arg0.method294();
                    }
                } else if (var4 == 3) {
                    this.field565 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field562[var4 - 40] = arg0.method294();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field563[var4 - 50] = arg0.method294();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field564[var4 - 60] = arg0.method294();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "CWWAFTAL", name = "a", descriptor = "(Z)Z")
    public boolean method175(boolean arg0) {
        if (this.field561 == null) {
            return true;
        }
        boolean var2 = true;
        if (!arg0) {
            this.field554 = 485;
        }
        for (int var3 = 0; var3 < this.field561.length; var3++) {
            if (!class35.method335(this.field561[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "CWWAFTAL", name = "b", descriptor = "(Z)LNJPATAFL;")
    public class35 method176(boolean arg0) {
        if (this.field561 == null) {
            return null;
        }
        class35[] var2 = new class35[this.field561.length];
        if (arg0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field561.length; var3++) {
            var2[var3] = class35.method334(this.field561[var3], 14700);
        }
        class35 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class35(var2, 230, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field562[var5] != 0; var5++) {
            var4.method348(this.field562[var5], this.field563[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "CWWAFTAL", name = "a", descriptor = "(I)Z")
    public boolean method177(int arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field564[var3] != -1 && !class35.method335(this.field564[var3])) {
                var2 = false;
            }
        }
        if (arg0 != -37409) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "CWWAFTAL", name = "a", descriptor = "(B)LNJPATAFL;")
    public class35 method178(byte arg0) {
        class35[] var2 = new class35[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field564[var4] != -1) {
                var2[var3++] = class35.method334(this.field564[var4], 14700);
            }
        }
        class35 var5 = new class35(var2, 230, var3);
        for (int var6 = 0; var6 < 6 && this.field562[var6] != 0; var6++) {
            var5.method348(this.field562[var6], this.field563[var6]);
        }
        if (arg0 != -72) {
            field555 = !field555;
        }
        return var5;
    }

    @OriginalMember(owner = "CWWAFTAL", name = "<init>", descriptor = "()V")
    public class6() {
        if (class37.field1083) {
        }
    }
}
