import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class602 {

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lvu;")
    private class204 field8412 = new class204();

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "Ljava/lang/String;")
    public String field8415;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "F")
    public static float field8407;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field8406;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field8409;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field8416;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    private volatile int field8417;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field8418;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "Lgs;")
    public static class576 field8413;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "Lui;")
    private class638 field8419;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Lgl;")
    public static class642 field8408;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLsu;)V")
    public final void method3349(boolean arg0, class151 arg1) {
        field8409++;
        if (arg0) {
            return;
        }
        class204 var3 = this.field8412;
        synchronized (this.field8412) {
            this.field8412.method1300(arg1, -1);
            this.field8417++;
        }
        if (this.field8419 != null) {
            class638 var4 = this.field8419;
            synchronized (this.field8419) {
                this.field8419.notify();
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method3350(byte arg0) {
        field8408 = null;
        if (arg0 < -99) {
            field8413 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)Lcv;")
    public final class631 method3351(boolean arg0) {
        if (!arg0) {
            this.field8417 = -29;
        }
        field8418++;
        Object var2 = null;
        class204 var3 = this.field8412;
        synchronized (this.field8412) {
            class631 var4 = this.field8412.method1298((byte) 40);
            var4.method3499(12151);
            this.field8417--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lir;B)V")
    public final void method3352(class27 arg0, byte arg1) {
        arg0.field389 = false;
        field8411++;
        class204 var3 = this.field8412;
        synchronized (this.field8412) {
            this.field8412.method1300(arg0, -1);
            this.field8417++;
            int var4 = 105 / ((arg1 + 42) / 32);
        }
        if (this.field8419 != null) {
            class638 var5 = this.field8419;
            synchronized (this.field8419) {
                this.field8419.notify();
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Llm;")
    public static final class335 method3353(int arg0, int arg1) {
        field8414++;
        if (arg1 != -14) {
            field8407 = 0.54845256F;
        }
        if (arg0 == 0) {
            return new class251();
        } else if (arg0 == 1) {
            return new class472();
        } else if (arg0 == 2) {
            return new class491();
        } else if (arg0 == 3) {
            return new class95();
        } else if (arg0 == 4) {
            return new class559();
        } else if (arg0 == 5) {
            return new class561();
        } else if (arg0 == 6) {
            return new class591();
        } else if (arg0 == 7) {
            return new class24();
        } else if (arg0 == 8) {
            return new class641();
        } else if (arg0 == 9) {
            return new class567();
        } else if (arg0 == 10) {
            return new class87();
        } else if (arg0 == 11) {
            return new class298();
        } else if (arg0 == 12) {
            return new class687();
        } else if (arg0 == 13) {
            return new class565();
        } else if (arg0 == 14) {
            return new class206();
        } else if (arg0 == 15) {
            return new class478();
        } else if (arg0 == 16) {
            return new class396();
        } else if (arg0 == 17) {
            return new class569();
        } else if (arg0 == 18) {
            return new class626();
        } else if (arg0 == 19) {
            return new class450();
        } else if (arg0 == 20) {
            return new class517();
        } else if (arg0 == 21) {
            return new class275();
        } else if (arg0 == 22) {
            return new class1();
        } else if (arg0 == 23) {
            return new class191();
        } else if (arg0 == 24) {
            return new class645();
        } else if (arg0 == 25) {
            return new class442();
        } else if (arg0 == 26) {
            return new class184();
        } else if (arg0 == 27) {
            return new class564();
        } else if (arg0 == 28) {
            return new class554();
        } else if (arg0 == 29) {
            return new class659();
        } else if (arg0 == 30) {
            return new class54();
        } else if (arg0 == 31) {
            return new class324();
        } else if (arg0 == 32) {
            return new class195();
        } else if (arg0 == 33) {
            return new class115();
        } else if (arg0 == 34) {
            return new class693();
        } else if (arg0 == 35) {
            return new class333();
        } else if (arg0 == 36) {
            return new class197();
        } else if (arg0 == 37) {
            return new class353();
        } else if (arg0 == 38) {
            return new class183();
        } else if (arg0 == 39) {
            return new class297();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLui;)V")
    public final void method3354(byte arg0, class638 arg1) {
        if (arg0 != -42) {
            method3353(-15, 53);
        }
        field8416++;
        this.field8419 = arg1;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)Z")
    public final boolean method3355(byte arg0) {
        if (arg0 != -35) {
            field8413 = null;
        }
        field8406++;
        return this.field8417 == 0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLir;)V")
    public final void method3356(byte arg0, class27 arg1) {
        arg1.field389 = true;
        if (arg0 != -101) {
            this.method3354((byte) 36, null);
        }
        field8410++;
        class204 var3 = this.field8412;
        synchronized (this.field8412) {
            this.field8412.method1300(arg1, -1);
            this.field8417++;
        }
        if (this.field8419 != null) {
            class638 var4 = this.field8419;
            synchronized (this.field8419) {
                this.field8419.notify();
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class602(String arg0) {
        this.field8415 = arg0;
    }
}
