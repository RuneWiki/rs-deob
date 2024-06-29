import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class class23 {

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Ldf;")
    public static class51 field352 = class46.method233("Benutzeroberfl-=che geladen)3", 100);

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Z")
    public static boolean field348 = false;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Ljava/lang/Object;")
    public static Object field355 = new Object();

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Ltg;")
    public static class171 field356;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lff;")
    public static class18 field343;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Ljava/awt/Image;")
    public Image field345;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "[I")
    public int[] field351;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIBLjava/awt/Graphics;)V")
    public abstract void method121(int arg0, int arg1, int arg2, int arg3, byte arg4, Graphics arg5);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLjava/awt/Graphics;II)V")
    public abstract void method122(boolean arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static final void method123(byte arg0) {
        if (arg0 <= 59) {
            method123((byte) 52);
        }
        field349++;
        for (class209 var1 = (class209) class263.field4595.method1720(true); var1 != null; var1 = (class209) class263.field4595.method1712((byte) 112)) {
            class185 var2 = var1.field3486;
            if (class257.field4496 != var2.field3090 || var2.field3082 < class179.field2960) {
                var1.method764((byte) -112);
            } else if (var2.field3054 <= class179.field2960) {
                if (var2.field3073 > 0) {
                    class83 var3 = class34.field512[var2.field3073 - 1];
                    if (var3 != null && var3.field4319 >= 0 && var3.field4319 < 13312 && var3.field4348 >= 0 && var3.field4348 < 13312) {
                        var2.method1312(class207.method1424(var2.field3090, var3.field4319, (byte) 123, var3.field4348) - var2.field3083, var3.field4319, -1, var3.field4348, class179.field2960);
                    }
                }
                if (var2.field3073 < 0) {
                    int var4 = -var2.field3073 - 1;
                    class103 var5;
                    if (class167.field2719 == var4) {
                        var5 = class44.field706;
                    } else {
                        var5 = class66.field1055[var4];
                    }
                    if (var5 != null && var5.field4319 >= 0 && var5.field4319 < 13312 && var5.field4348 >= 0 && var5.field4348 < 13312) {
                        var2.method1312(class207.method1424(var2.field3090, var5.field4319, (byte) 114, var5.field4348) - var2.field3083, var5.field4319, -1, var5.field4348, class179.field2960);
                    }
                }
                var2.method1311((byte) -6, class225.field3945);
                class78.method552(class257.field4496, (int) var2.field3087, (int) var2.field3077, (int) var2.field3081, 60, var2, var2.field3085, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I")
    public static final int method124(int arg0, int arg1) {
        field350++;
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        if (arg1 != 31455) {
            field352 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
    public static final void method125(byte arg0) {
        field347++;
        if (arg0 <= -7) {
            class42.field674.method1350((byte) 113);
            class146.field2437.method1350((byte) 118);
            class70.field1124.method1350((byte) 127);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public final void method126(int arg0) {
        field346++;
        class59.method384(this.field351, this.field353, this.field344);
        int var2 = -72 % ((arg0 + 35) / 41);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method127(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    protected class23() {
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V")
    public static void method128(byte arg0) {
        field355 = null;
        field356 = null;
        field352 = null;
        if (arg0 <= 14) {
            field348 = false;
        }
        field343 = null;
    }
}
