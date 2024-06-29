import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class class134 {

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3288 = 0;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field3293 = 0;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lcb;")
    public static class15 field3285 = new class15(64);

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field3300 = 0;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "La;")
    private static class1 field3303 = class113.method934(-11538, " is already on your ignore list");

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field3304 = 0;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field3307 = 0;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "La;")
    private static class1 field3306 = class113.method934(-11538, "Loaded title screen");

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "La;")
    public static class1 field3308 = field3306;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "La;")
    public static class1 field3298 = field3303;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "La;")
    public static class1 field3309 = class113.method934(-11538, "@or2@");

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "La;")
    private static class1 field3310 = class113.method934(-11538, "Cancel");

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "La;")
    public static class1 field3305 = field3310;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public int field3287;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public int field3289;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "Lwc;")
    public static class134 field3301;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Led;")
    public static class29 field3302;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Ljava/awt/Image;")
    public Image field3295;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[I")
    public int[] field3291;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "[Z")
    public static boolean[] field3299;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/awt/Component;ILlc;)V", line = 4)
    public static final void method1053(Component arg0, int arg1, class69 arg2) {
        field3290++;
        try {
            class94 var3 = (class94) Class.forName("ic").getDeclaredConstructor().newInstance();
            var3.method821(arg2, 2048);
            class5.field218 = var3;
        } catch (Throwable var6) {
            try {
                class5.field218 = new class40(arg2, arg0);
            } catch (Throwable var5) {
                if (arg1 <= class69.field1717.toLowerCase().indexOf("microsoft")) {
                    try {
                        class5.field218 = new class126();
                        return;
                    } catch (Throwable var4) {
                    }
                }
                class5.field218 = new class14(8000);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 44)
    public static void method1054(int arg0) {
        int var1 = -77 % ((arg0 - 74) / 46);
        field3308 = null;
        field3309 = null;
        field3299 = null;
        field3301 = null;
        field3302 = null;
        field3306 = null;
        field3285 = null;
        field3310 = null;
        field3305 = null;
        field3298 = null;
        field3303 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Z", line = 77)
    public static final boolean method1055(int arg0, int arg1) {
        field3297++;
        if (field3299[arg0]) {
            return true;
        } else if (class35.field925.method232(123, arg0)) {
            int var2 = 51 / ((63 - arg1) / 63);
            int var3 = class35.field925.method236(arg0, (byte) 71);
            if (var3 == 0) {
                field3299[arg0] = true;
                return true;
            }
            if (class117.field2925[arg0] == null) {
                class117.field2925[arg0] = new class100[var3];
            }
            for (int var4 = 0; var4 < var3; var4++) {
                if (class117.field2925[arg0][var4] == null) {
                    byte[] var5 = class35.field925.method218(var4, 119, arg0);
                    if (var5 != null) {
                        class117.field2925[arg0][var4] = new class100();
                        class117.field2925[arg0][var4].field2498 = (arg0 << 16) + var4;
                        if (var5[0] == -1) {
                            class117.field2925[arg0][var4].method861((byte) 73, new class8(var5));
                        } else {
                            class117.field2925[arg0][var4].method854(new class8(var5), -73);
                        }
                    }
                }
            }
            field3299[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)Lqd;", line = 142)
    public static final class100 method1056(int arg0, byte arg1) {
        field3296++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class117.field2925[var2] == null || class117.field2925[var2][var3] == null) {
            boolean var4 = method1055(var2, 127);
            if (!var4) {
                return null;
            }
        }
        if (arg1 >= -54) {
            method1054(-90);
        }
        return class117.field2925[var2][var3];
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 169)
    public final void method1057(byte arg0) {
        class111.method929(this.field3291, this.field3289, this.field3287);
        field3294++;
        if (arg0 != 90) {
            this.method1057((byte) 12);
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 183)
    protected class134() {
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method107(int arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method102(int arg0, int arg1, Graphics arg2, int arg3);
}
