import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class22 {

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "Lon;")
    public class35 field322 = new class35();

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "Ljava/lang/String;")
    public static String field341 = "K";

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "Z")
    public static boolean field330 = false;

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "Lfg;")
    public static class18 field343 = new class18(64);

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "Ldp;")
    public static class174 field329;

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "Lon;")
    private class35 field340;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "[Lvb;")
    public static class91[] field327;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)Lon;")
    public final class35 method145(int arg0) {
        field336++;
        class35 var2 = this.field340;
        if (this.field322 == var2) {
            this.field340 = null;
            return null;
        } else {
            this.field340 = var2.field498;
            int var3 = -4 % ((arg0 + 61) / 40);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)I")
    public final int method146(boolean arg0) {
        field325++;
        int var2 = 0;
        if (arg0) {
            this.field340 = null;
        }
        for (class35 var3 = this.field322.field498; var3 != this.field322; var3 = var3.field498) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
    public final void method147(int arg0) {
        if (arg0 != 35) {
            this.method148((byte) 94, (class35) null);
        }
        field331++;
        while (true) {
            class35 var2 = this.field322.field498;
            if (this.field322 == var2) {
                this.field340 = null;
                return;
            }
            var2.method251(38);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLon;)V")
    public final void method148(byte arg0, class35 arg1) {
        field342++;
        if (arg1.field497 != null) {
            arg1.method251(35);
        }
        arg1.field498 = this.field322;
        arg1.field497 = this.field322.field497;
        arg1.field497.field498 = arg1;
        if (arg0 < 74) {
            field335 = 37;
        }
        arg1.field498.field497 = arg1;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lvq;I)V")
    public final void method149(class22 arg0, int arg1) {
        if (arg1 <= 78) {
            this.method152((byte) 37);
        }
        this.method159((byte) -77, arg0, this.field322.field498);
        field334++;
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)Lon;")
    public final class35 method150(int arg0) {
        field328++;
        class35 var2 = this.field322.field498;
        if (this.field322 == var2) {
            return null;
        }
        if (arg0 != 0) {
            this.method148((byte) 116, (class35) null);
        }
        var2.method251(83);
        return var2;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lon;I)V")
    public final void method151(class35 arg0, int arg1) {
        if (arg1 != 2) {
            return;
        }
        if (arg0.field497 != null) {
            arg0.method251(30);
        }
        field337++;
        arg0.field497 = this.field322;
        arg0.field498 = this.field322.field498;
        arg0.field497.field498 = arg0;
        arg0.field498.field497 = arg0;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)Z")
    public final boolean method152(byte arg0) {
        if (arg0 != 59) {
            field327 = null;
        }
        field333++;
        return this.field322.field498 == this.field322;
    }

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(I)Lon;")
    public final class35 method153(int arg0) {
        field324++;
        if (arg0 != 5346) {
            field330 = false;
        }
        class35 var2 = this.field322.field497;
        if (this.field322 == var2) {
            this.field340 = null;
            return null;
        } else {
            this.field340 = var2.field497;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(I)V")
    public static final void method154(int arg0) {
        if (arg0 == -31746) {
            class90.field1430 = class287.method2025(true, 35, 8, 2048, 0.4F, 4, 8, -28693);
            field338++;
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V")
    public class22() {
        this.field322.field497 = this.field322;
        this.field322.field498 = this.field322;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)Ldj;")
    public static final class304 method155(int arg0, int arg1) {
        field332++;
        if (~arg0 == arg1) {
            if ((double) class272.field4078 == 3.0D) {
                return class286.field4284;
            }
            if ((double) class272.field4078 == 4.0D) {
                return class283.field4235;
            }
            if ((double) class272.field4078 == 6.0D) {
                return class218.field3232;
            }
            if ((double) class272.field4078 >= 8.0D) {
                return class19.field280;
            }
        } else if (arg0 == 1) {
            if ((double) class272.field4078 == 3.0D) {
                return class218.field3232;
            }
            if ((double) class272.field4078 == 4.0D) {
                return class19.field280;
            }
            if ((double) class272.field4078 == 6.0D) {
                return class273.field4112;
            }
            if ((double) class272.field4078 >= 8.0D) {
                return class200.field2925;
            }
        } else if (arg0 == 2) {
            if ((double) class272.field4078 == 3.0D) {
                return class273.field4112;
            }
            if ((double) class272.field4078 == 4.0D) {
                return class200.field2925;
            }
            if ((double) class272.field4078 == 6.0D) {
                return class14.field224;
            }
            if ((double) class272.field4078 >= 8.0D) {
                return class21.field321;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)Lon;")
    public final class35 method156(byte arg0) {
        int var2 = -51 / ((-arg0 - 40) / 56);
        field326++;
        class35 var3 = this.field340;
        if (this.field322 == var3) {
            this.field340 = null;
            return null;
        } else {
            this.field340 = var3.field497;
            return var3;
        }
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(B)Lon;")
    public final class35 method157(byte arg0) {
        if (arg0 != -125) {
            return null;
        }
        field323++;
        class35 var2 = this.field322.field498;
        if (this.field322 == var2) {
            this.field340 = null;
            return null;
        } else {
            this.field340 = var2.field498;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(B)V")
    public static void method158(byte arg0) {
        if (arg0 != -64) {
            method154(124);
        }
        field327 = null;
        field343 = null;
        field329 = null;
        field341 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLvq;Lon;)V")
    private final void method159(byte arg0, class22 arg1, class35 arg2) {
        field339++;
        class35 var4 = this.field322.field497;
        this.field322.field497 = arg2.field497;
        int var5 = 13 % ((arg0 - 11) / 57);
        arg2.field497.field498 = this.field322;
        if (this.field322 != arg2) {
            arg2.field497 = arg1.field322.field497;
            arg2.field497.field498 = arg2;
            var4.field498 = arg1.field322;
            arg1.field322.field497 = var4;
        }
    }
}
