import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class202 {

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lag;")
    private class123 field3152 = new class123();

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Lok;")
    public static class160 field3155 = new class160(64);

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "J")
    public static long field3161 = 0L;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lag;")
    private class123 field3158;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 5)
    public static void method1447(int arg0) {
        field3155 = null;
        if (arg0 != 1) {
            method1451(89, (class1) null);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)Lag;", line = 16)
    public final class123 method1448(int arg0) {
        field3156++;
        if (arg0 != 23) {
            this.field3152 = (class123) null;
        }
        class123 var2 = this.field3158;
        if (this.field3152 == var2) {
            this.field3158 = null;
            return null;
        } else {
            this.field3158 = var2.field2000;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)Lag;", line = 42)
    public final class123 method1449(int arg0) {
        field3153++;
        class123 var2 = this.field3152.field2000;
        if (this.field3152 == var2) {
            this.field3158 = null;
            return null;
        }
        if (arg0 <= 6) {
            field3161 = -74L;
        }
        this.field3158 = var2.field2000;
        return var2;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I", line = 64)
    public final int method1450(byte arg0) {
        field3159++;
        int var2 = 0;
        class123 var3 = this.field3152.field2000;
        if (arg0 > -83) {
            this.field3158 = (class123) null;
        }
        while (this.field3152 != var3) {
            var3 = var3.field2000;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 305)
    public class202() {
        this.field3152.field2000 = this.field3152;
        this.field3152.field2001 = this.field3152;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILaj;)V", line = 93)
    public static final void method1451(int arg0, class1 arg1) {
        field3151++;
        if ((arg1.field34.length - arg1.field48) < 1) {
            return;
        }
        int var2 = arg1.method15((byte) -10);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        int var3 = -33 / ((arg0 + 28) / 52);
        byte var4;
        if (var2 == 11) {
            var4 = 33;
        } else if (var2 == 10) {
            var4 = 32;
        } else if (var2 == 9) {
            var4 = 31;
        } else if (var2 == 8) {
            var4 = 30;
        } else if (var2 == 7) {
            var4 = 29;
        } else if (var2 == 6) {
            var4 = 28;
        } else if (var2 == 5) {
            var4 = 28;
        } else if (var2 == 4) {
            var4 = 24;
        } else if (var2 == 3) {
            var4 = 23;
        } else if (var2 == 2) {
            var4 = 22;
        } else if (var2 == 1) {
            var4 = 23;
        } else {
            var4 = 19;
        }
        if (var4 > arg1.field34.length - arg1.field48) {
            return;
        }
        class343.field5310 = arg1.method15((byte) 94);
        if (class343.field5310 < 1) {
            class343.field5310 = 1;
        } else if (class343.field5310 > 4) {
            class343.field5310 = 4;
        }
        class154.method1148(arg1.method15((byte) -52) == 1, -87);
        class1.field70 = arg1.method15((byte) -106) == 1;
        class90.field1436 = arg1.method15((byte) 98) == 1;
        class257.field3810 = arg1.method15((byte) 75) == 1;
        class55.field846 = arg1.method15((byte) 63) == 1;
        class149.field2435 = arg1.method15((byte) 68) == 1;
        class109.field1777 = arg1.method15((byte) -45) == 1;
        class56.field853 = arg1.method15((byte) -33) == 1;
        class151.field2474 = arg1.method15((byte) -11);
        if (class151.field2474 > 2) {
            class151.field2474 = 2;
        }
        if (var2 >= 2) {
            class229.field3531 = arg1.method15((byte) 114) == 1;
        } else {
            class229.field3531 = arg1.method15((byte) -123) == 1;
            arg1.method15((byte) 121);
        }
        class154.field2511 = arg1.method15((byte) 85) == 1;
        class140.field2267 = arg1.method15((byte) -37) == 1;
        class124.field2007 = arg1.method15((byte) 69);
        if (class124.field2007 > 2) {
            class124.field2007 = 2;
        }
        class315.field4973 = class124.field2007;
        class60.field881 = arg1.method15((byte) 109) == 1;
        class73.field1106 = arg1.method15((byte) 87);
        if (class73.field1106 > 127) {
            class73.field1106 = 127;
        }
        class80.field1253 = arg1.method15((byte) -25);
        class22.field398 = arg1.method15((byte) -48);
        if (class22.field398 > 127) {
            class22.field398 = 127;
        }
        if (var2 >= 1) {
            class146.field2393 = arg1.method56(19612);
            class73.field1105 = arg1.method56(19612);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method15((byte) -90);
        }
        if (var2 >= 4) {
            int var5 = arg1.method15((byte) 78);
            if (class178.field2841 < 96) {
                var5 = 0;
            }
            class236.method1688(var5);
        }
        if (var2 >= 5) {
            class137.field2240 = arg1.method33(false);
        }
        if (var2 >= 6) {
            class101.field1636 = arg1.method15((byte) -17);
        }
        if (var2 >= 7) {
            class306.field4859 = arg1.method15((byte) 80) == 1;
        }
        if (var2 >= 8) {
            class126.field2018 = arg1.method15((byte) -114) == 1;
        }
        if (var2 >= 9) {
            class144.field2326 = arg1.method15((byte) 87);
        }
        if (var2 >= 10) {
            class151.field2467 = arg1.method15((byte) 125) != 0;
        }
        if (var2 >= 11) {
            class52.field772 = arg1.method15((byte) -37) != 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)Lag;", line = 264)
    public final class123 method1452(int arg0) {
        class123 var2 = this.field3152.field2000;
        if (arg0 != 13634) {
            this.method1453((class123) null, 38);
        }
        field3160++;
        if (this.field3152 == var2) {
            return null;
        } else {
            var2.method981(-118);
            return var2;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lag;I)V", line = 291)
    public final void method1453(class123 arg0, int arg1) {
        field3154++;
        if (arg0.field2001 != null) {
            arg0.method981(-128);
        }
        arg0.field2000 = this.field3152;
        arg0.field2001 = this.field3152.field2001;
        arg0.field2001.field2000 = arg0;
        arg0.field2000.field2001 = arg0;
        int var3 = 19 % ((61 - arg1) / 55);
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V", line = 318)
    public final void method1454(int arg0) {
        while (true) {
            class123 var2 = this.field3152.field2000;
            if (this.field3152 == var2) {
                field3157++;
                this.field3158 = null;
                if (arg0 != -31175) {
                    this.method1453((class123) null, -26);
                }
                return;
            }
            var2.method981(-122);
        }
    }
}
