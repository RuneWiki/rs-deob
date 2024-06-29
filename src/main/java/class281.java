import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class281 {

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lma;")
    public class5 field4370 = new class5();

    @OriginalMember(owner = "client!a", name = "c", descriptor = "[I")
    public static int[] field4368 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!a", name = "n", descriptor = "[I")
    public static int[] field4379 = new int[4];

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lgi;")
    public static class310 field4374;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lma;")
    private class5 field4378;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method1942(int arg0) {
        if (arg0 != -123) {
            field4374 = (class310) null;
        }
        field4377++;
        return this.field4370.field81 == this.field4370;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)Lma;", line = 28)
    public final class5 method1943(int arg0) {
        field4382++;
        class5 var2 = this.field4378;
        if (this.field4370 == var2) {
            this.field4378 = null;
            return null;
        } else if (arg0 == 57) {
            this.field4378 = var2.field68;
            return var2;
        } else {
            return (class5) null;
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)Lma;", line = 50)
    public final class5 method1944(int arg0) {
        field4372++;
        class5 var2 = this.field4370.field81;
        if (this.field4370 == var2) {
            return null;
        }
        if (arg0 <= 59) {
            this.field4378 = (class5) null;
        }
        var2.method39(10717);
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)Lma;", line = 73)
    public final class5 method1945(byte arg0) {
        if (arg0 != 71) {
            field4368 = (int[]) null;
        }
        field4373++;
        class5 var2 = this.field4370.field68;
        if (this.field4370 == var2) {
            this.field4378 = null;
            return null;
        } else {
            this.field4378 = var2.field68;
            return var2;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljd;III)Lhk;", line = 97)
    public static final class42 method1946(class95 arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -50) {
            return (class42) null;
        } else {
            field4369++;
            return class31.method233(arg1, 0, arg2, arg0) ? class72.method511(0) : null;
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V", line = 112)
    public static final void method1947(int arg0) {
        class216.field3310.method456(103);
        if (arg0 == 160) {
            field4371++;
            class268.field4171 = null;
            class106.field1540 = 1;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLjava/lang/String;II)Z", line = 130)
    public static final boolean method1948(boolean arg0, String arg1, int arg2, int arg3) {
        field4381++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        int var5 = 0;
        boolean var6 = false;
        int var7 = arg1.length();
        if (arg2 != 48) {
            field4368 = (int[]) null;
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg3) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var5 + var11;
            if (var10 / arg3 != var5) {
                return false;
            }
            var6 = true;
            var5 = var10;
        }
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lma;B)V", line = 204)
    public final void method1949(class5 arg0, byte arg1) {
        if (arg0.field68 != null) {
            arg0.method39(arg1 + 10626);
        }
        arg0.field68 = this.field4370;
        if (arg1 != 91) {
            this.method1945((byte) 71);
        }
        field4367++;
        arg0.field81 = this.field4370.field81;
        arg0.field68.field81 = arg0;
        arg0.field81.field68 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)Lma;", line = 223)
    public final class5 method1950(byte arg0) {
        field4376++;
        class5 var2 = this.field4378;
        if (this.field4370 == var2) {
            this.field4378 = null;
            return null;
        }
        if (arg0 < 84) {
            field4374 = (class310) null;
        }
        this.field4378 = var2.field81;
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V", line = 244)
    public final void method1951(int arg0) {
        if (arg0 != 29532) {
            this.method1952((class5) null, 88);
        }
        while (true) {
            class5 var2 = this.field4370.field81;
            if (this.field4370 == var2) {
                field4375++;
                this.field4378 = null;
                return;
            }
            var2.method39(10717);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lma;I)V", line = 267)
    public final void method1952(class5 arg0, int arg1) {
        if (arg0.field68 != null) {
            arg0.method39(10717);
        }
        arg0.field81 = this.field4370;
        field4380++;
        arg0.field68 = this.field4370.field68;
        int var3 = 110 % ((78 - arg1) / 33);
        arg0.field68.field81 = arg0;
        arg0.field81.field68 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V", line = 306)
    public class281() {
        this.field4370.field68 = this.field4370;
        this.field4370.field81 = this.field4370;
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V", line = 286)
    public static void method1953(int arg0) {
        field4379 = null;
        int var1 = 127 % ((arg0 - 13) / 52);
        field4368 = null;
        field4374 = null;
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)Lma;", line = 323)
    public final class5 method1954(int arg0) {
        field4366++;
        class5 var2 = this.field4370.field81;
        if (this.field4370 == var2) {
            this.field4378 = null;
            return null;
        }
        if (arg0 != -66) {
            field4379 = (int[]) null;
        }
        this.field4378 = var2.field81;
        return var2;
    }
}
