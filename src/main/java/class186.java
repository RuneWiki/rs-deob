import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class186 {

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    private int field3352 = 0;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    private int field3345 = -1;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Lsg;")
    private class162 field3358 = new class162();

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "Z")
    public boolean field3363 = false;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    private int field3356;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "[Lki;")
    private class62[] field3349;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    private int field3360;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "[[I")
    private int[][] field3346;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "[I")
    public static int[] field3350 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public final void method1265(byte arg0) {
        int var2 = 0;
        if (arg0 != 40) {
            return;
        }
        while (this.field3360 > var2) {
            this.field3346[var2] = null;
            var2++;
        }
        this.field3349 = null;
        field3353++;
        this.field3346 = null;
        this.field3358.method1117((byte) 49);
        this.field3358 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)Lnh;")
    public static final class54 method1266(boolean arg0) {
        if (arg0) {
            return null;
        }
        field3344++;
        try {
            return (class54) Class.forName("dc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
    public static final void method1267(byte arg0) {
        field3354++;
        if (arg0 != 8) {
            field3347 = 84;
        }
        if (class284.field5008 == 30) {
            class155.method1088(25, -3280);
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)[[I")
    public final int[][] method1268(byte arg0) {
        field3355++;
        if (this.field3360 != this.field3356) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        int var3 = 74 / ((arg0 - 8) / 57);
        while (this.field3360 > var2) {
            this.field3349[var2] = class283.field4971;
            var2++;
        }
        return this.field3346;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)[I")
    public final int[] method1269(int arg0, int arg1) {
        if (arg1 != 17885) {
            method1267((byte) -91);
        }
        field3359++;
        if (this.field3360 == this.field3356) {
            this.field3363 = this.field3349[arg0] == null;
            this.field3349[arg0] = class283.field4971;
            return this.field3346[arg0];
        } else if (this.field3360 == 1) {
            this.field3363 = this.field3345 != arg0;
            this.field3345 = arg0;
            return this.field3346[0];
        } else {
            class62 var3 = this.field3349[arg0];
            if (var3 == null) {
                this.field3363 = true;
                if (this.field3352 >= this.field3360) {
                    class62 var4 = (class62) this.field3358.method1115((byte) -99);
                    var3 = new class62(arg0, var4.field1228);
                    this.field3349[var4.field1226] = null;
                    var4.method269(arg1 - 214968781);
                } else {
                    var3 = new class62(arg0, this.field3352);
                    this.field3352++;
                }
                this.field3349[arg0] = var3;
            } else {
                this.field3363 = false;
            }
            this.field3358.method1125(-17837, var3);
            return this.field3346[var3.field1228];
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static final void method1270(int arg0) {
        class31.field554 = new class255(32);
        field3357++;
        int var1 = -124 / ((arg0 + 28) / 36);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIILji;)V")
    public static final void method1271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class42 arg7) {
        field3351++;
        if (class259.field4673) {
            class144.field2653 = 32;
        } else {
            class144.field2653 = 0;
        }
        class259.field4673 = false;
        if (arg3 != 16) {
            field3350 = null;
        }
        if (class126.field2438 != 0) {
            if (arg4 >= arg1 && (arg1 + 16) > arg4 && arg2 >= arg5 && (arg5 + 16) > arg2) {
                arg7.field819 -= 4;
                class126.method907(arg7, 0);
            } else if (arg1 <= arg4 && arg4 < (arg1 + 16) && (arg5 + arg6 - 16) <= arg2 && (arg5 + arg6) > arg2) {
                arg7.field819 += 4;
                class126.method907(arg7, 0);
            } else if (arg4 >= (arg1 - class144.field2653) && arg4 < (arg1 + class144.field2653 + 16) && (arg5 + 16) <= arg2 && (arg5 + arg6 - 16) > arg2) {
                int var8 = (arg6 - 32) * arg6 / arg0;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg6 - var8 - 32;
                int var10 = arg2 - arg5 - (var8 / 2) - 16;
                arg7.field819 = (arg0 - arg6) * var10 / var9;
                class126.method907(arg7, 0);
                class259.field4673 = true;
            }
        }
        if (class62.field1227 == 0) {
            return;
        }
        int var11 = arg7.field789;
        if (arg4 >= (arg1 - var11) && arg2 >= arg5 && arg4 < (arg1 + 16) && arg2 <= arg5 + arg6) {
            arg7.field819 += class62.field1227 * 45;
            class126.method907(arg7, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
    public static final void method1272(int arg0) {
        field3348++;
        class204.field3649++;
        class84.field1677.method287((byte) 120, 157);
        if (arg0 >= -80) {
            field3361 = 87;
        }
        class84.field1677.method756(0L, (byte) -96);
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Z")
    public static final boolean method1273(int arg0) {
        field3362++;
        int var1 = 2 % ((arg0 - 15) / 33);
        return class234.field4212;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)V")
    public static void method1274(int arg0) {
        field3350 = null;
        if (arg0 >= -13) {
            method1273(15);
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(III)V")
    public class186(int arg0, int arg1, int arg2) {
        this.field3356 = arg1;
        this.field3349 = new class62[this.field3356];
        this.field3360 = arg0;
        this.field3346 = new int[this.field3360][arg2];
    }
}
