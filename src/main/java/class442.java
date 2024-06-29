import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class442 {

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "Lge;")
    public class425 field6329 = new class425();

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field6328 = 0;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "[Lpn;")
    public static class446[] field6317 = new class446[32768];

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field6323 = -1;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "Lge;")
    private class425 field6336;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "[Z")
    public static boolean[] field6334;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)Lge;")
    public final class425 method2748(int arg0) {
        field6331++;
        class425 var2 = this.field6329.field6074;
        if (this.field6329 == var2) {
            return null;
        }
        var2.method2660((byte) 120);
        if (arg0 > -92) {
            field6323 = 117;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
    public static final void method2749(int arg0) {
        field6321++;
        if (class261.field3860) {
            return;
        }
        class79.method464(arg0, class401.field5633);
        if (class24.field306 != null) {
            class79.method464(0, class24.field306);
        }
        class261.field3860 = true;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lkn;B)V")
    public final void method2750(class442 arg0, byte arg1) {
        field6318++;
        if (arg1 != -22) {
            field6334 = null;
        }
        this.method2761(arg0, this.field6329.field6074, -21078);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
    public static void method2751(byte arg0) {
        field6334 = null;
        field6317 = null;
        if (arg0 >= -77) {
            method2751((byte) 73);
        }
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)Lge;")
    public final class425 method2752(int arg0) {
        if (arg0 >= -46) {
            field6317 = null;
        }
        field6325++;
        class425 var2 = this.field6329.field6074;
        if (this.field6329 == var2) {
            this.field6336 = null;
            return null;
        } else {
            this.field6336 = var2.field6074;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)Lge;")
    public final class425 method2753(byte arg0) {
        field6330++;
        class425 var2 = this.field6336;
        if (this.field6329 == var2) {
            this.field6336 = null;
            return null;
        } else if (arg0 > -65) {
            return null;
        } else {
            this.field6336 = var2.field6072;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)Lge;")
    public final class425 method2754(int arg0) {
        field6335++;
        if (arg0 != -1) {
            return null;
        }
        class425 var2 = this.field6336;
        if (this.field6329 == var2) {
            this.field6336 = null;
            return null;
        } else {
            this.field6336 = var2.field6074;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)V")
    public final void method2755(int arg0) {
        while (true) {
            class425 var2 = this.field6329.field6074;
            if (this.field6329 == var2) {
                field6333++;
                if (arg0 != 0) {
                    this.method2754(55);
                }
                this.field6336 = null;
                return;
            }
            var2.method2660((byte) 115);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILge;)V")
    public final void method2756(int arg0, class425 arg1) {
        field6332++;
        if (arg1.field6072 != null) {
            arg1.method2660((byte) 114);
        }
        arg1.field6072 = this.field6329.field6072;
        int var3 = -6 % ((arg0 + 12) / 43);
        arg1.field6074 = this.field6329;
        arg1.field6072.field6074 = arg1;
        arg1.field6074.field6072 = arg1;
    }

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "(I)I")
    public final int method2757(int arg0) {
        field6322++;
        int var2 = 0;
        if (arg0 == -11567) {
            for (class425 var3 = this.field6329.field6074; var3 != this.field6329; var3 = var3.field6074) {
                var2++;
            }
            return var2;
        } else {
            return -74;
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(ILge;)V")
    public final void method2758(int arg0, class425 arg1) {
        field6320++;
        if (arg1.field6072 != null) {
            arg1.method2660((byte) 121);
        }
        arg1.field6074 = this.field6329.field6074;
        arg1.field6072 = this.field6329;
        arg1.field6072.field6074 = arg1;
        arg1.field6074.field6072 = arg1;
        if (arg0 != 0) {
            this.field6336 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "(I)Z")
    public final boolean method2759(int arg0) {
        field6327++;
        if (arg0 != -1) {
            field6323 = 95;
        }
        return this.field6329.field6074 == this.field6329;
    }

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "(I)Lge;")
    public final class425 method2760(int arg0) {
        field6326++;
        class425 var2 = this.field6329.field6072;
        if (this.field6329 == var2) {
            this.field6336 = null;
            return null;
        } else if (arg0 == 0) {
            this.field6336 = var2.field6072;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lkn;Lge;I)V")
    private final void method2761(class442 arg0, class425 arg1, int arg2) {
        field6324++;
        class425 var4 = this.field6329.field6072;
        this.field6329.field6072 = arg1.field6072;
        arg1.field6072.field6074 = this.field6329;
        if (arg2 != -21078) {
            this.method2761((class442) null, (class425) null, -127);
        }
        if (this.field6329 != arg1) {
            arg1.field6072 = arg0.field6329.field6072;
            arg1.field6072.field6074 = arg1;
            var4.field6074 = arg0.field6329;
            arg0.field6329.field6072 = var4;
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
    public class442() {
        this.field6329.field6072 = this.field6329;
        this.field6329.field6074 = this.field6329;
    }
}
